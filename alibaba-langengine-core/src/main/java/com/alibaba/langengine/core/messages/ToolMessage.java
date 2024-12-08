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
package com.alibaba.langengine.core.messages;

import lombok.Data;

/**
 * A Message for passing the result of executing a tool back to a model.
 *
 * @author xiaoxuan.lp
 */
@Data
public class ToolMessage extends BaseMessage {

    /**
     * tool call id
     * @return
     */
    private String tool_call_id;

    @Override
    public String getType() {
        return "tool";
    }
}