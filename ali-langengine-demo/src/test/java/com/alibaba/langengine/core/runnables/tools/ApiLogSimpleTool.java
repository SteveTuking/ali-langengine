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
package com.alibaba.langengine.core.runnables.tools;

import com.alibaba.langengine.core.callback.ExecutionContext;
import com.alibaba.langengine.core.tool.BaseTool;
import com.alibaba.langengine.core.tool.DefaultTool;
import com.alibaba.langengine.core.tool.ToolExecuteResult;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ApiLogSimpleTool extends DefaultTool {

    public ApiLogSimpleTool() {
        setName("api log tool");
        setDescription("Search API log about current events.");
    }

    @Override
    public ToolExecuteResult run(String toolInput, ExecutionContext executionContext) {
        log.info("ApiLogSimpleTool.toolInput:" + toolInput);

        ToolExecuteResult toolExecuteResult = new ToolExecuteResult("api服务超时", false);
//
//        // mock下一轮工具集
        List<BaseTool> nextTools = new ArrayList<>();
        ApiSolutionTool apiSolutionTool = new ApiSolutionTool();
        nextTools.add(apiSolutionTool);
        toolExecuteResult.setNextTools(nextTools);

        return toolExecuteResult;
    }
}
