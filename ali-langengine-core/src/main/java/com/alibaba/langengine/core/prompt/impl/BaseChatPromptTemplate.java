/**
 * Copyright (C) 2024 AIDC-AI
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.langengine.core.prompt.impl;

import com.alibaba.langengine.core.agent.AgentAction;
import com.alibaba.langengine.core.messages.AIMessage;
import com.alibaba.langengine.core.messages.BaseMessage;
import com.alibaba.langengine.core.messages.FunctionMessage;
import com.alibaba.langengine.core.prompt.BasePromptTemplate;
import com.alibaba.langengine.core.prompt.ChatPromptValue;
import com.alibaba.langengine.core.prompt.PromptValue;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public abstract class BaseChatPromptTemplate extends BasePromptTemplate {

    @Override
    public String format(Map<String, Object> args) {
        return formatPrompt(args).toString();
    }

    @Override
    public PromptValue formatPrompt(Map<String, Object> args) {
        List<BaseMessage> allMessages = new ArrayList<>();
        List<BaseMessage> intermediateStep = new ArrayList<>();
        BaseMessage nextMessage = null;

        // history memory
        for (Map.Entry<String, Object> entry : args.entrySet()) {
            if (entry.getValue() != null && entry.getValue() instanceof Map) {
                Map<String, Object> history = (Map) entry.getValue();
                for (Map.Entry<String, Object> historyEntry : history.entrySet()) {
                    if (historyEntry.getValue() != null && historyEntry.getValue() instanceof List) {
                        List list = (List) historyEntry.getValue();
                        if (list.size() > 0 && list.get(0) instanceof BaseMessage) {
                            allMessages.addAll((List<BaseMessage>) historyEntry.getValue());
                        }
                    }
                }
            }
//            else if (entry.getValue() != null && entry.getValue() instanceof BaseMessage) {
//                nextMessage = (BaseMessage) entry.getValue();
//            }
            else if(entry.getValue() != null && entry.getValue() instanceof List) {
                List list = (List) entry.getValue();
                if (list.size() > 0) {
                    for (Object item : list) {
                        if(item instanceof AgentAction) {
                            AgentAction agentAction = (AgentAction) item;
                            intermediateStep.addAll(formatActionMessage(agentAction));
                        }
                    }

                }
            }
        }

        List<BaseMessage> messages = formatMessages(args);
        allMessages.addAll(messages);
        if(intermediateStep != null) {
            allMessages.addAll(intermediateStep);
        }
//        if(nextMessage != null) {
//            allMessages.add(nextMessage);
//        }
        ChatPromptValue promptValue = new ChatPromptValue();
        promptValue.setMessages(allMessages);
        return promptValue;
    }

    /**
     * 格式化AgentAction,默认为FunctionMessage
     * @param agentAction
     * @return
     */
    protected List<BaseMessage> formatActionMessage(AgentAction agentAction) {
        List<BaseMessage> intermediateStep = new ArrayList<>();
        // 结构示例：
        // [{
        //  "content": null,
        //	"functionCall": {
        //		"name": "add",
        //		"arguments": "{\"number1\":333,\"number2\":444}"
        //	},
        //	"role": "assistant"
        //}, {
        //	"content": "777",
        //	"name": "add",
        //	"role": "function"
        //}]
        AIMessage aiMessage = new AIMessage();
        Map<String, Object> functionCall = new HashMap<>();
        functionCall.put("name", agentAction.getTool());
        functionCall.put("arguments", agentAction.getToolInput());
        Map<String, Object> additional = new HashMap<>();
        additional.put("function_call", functionCall);
        aiMessage.setAdditionalKwargs(additional);
        aiMessage.setContent(null);
        intermediateStep.add(aiMessage);

        FunctionMessage functionMessage = new FunctionMessage();
        functionMessage.setName(agentAction.getTool());
        functionMessage.setContent(agentAction.getObservation());
        intermediateStep.add(functionMessage);
        return intermediateStep;
    }

    /**
     * Format args into a list of messages.
     *
     * @param args
     * @return
     */
    public abstract List<BaseMessage> formatMessages(Map<String, Object> args);
}
