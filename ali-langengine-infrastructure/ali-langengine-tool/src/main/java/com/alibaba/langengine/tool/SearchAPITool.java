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
package com.alibaba.langengine.tool;

import com.alibaba.langengine.core.tool.DefaultTool;
import com.alibaba.langengine.core.tool.ToolExecuteResult;
import lombok.Data;

@Data
public class SearchAPITool extends DefaultTool {

    public SearchAPITool() {
        setName("search");
        setDescription("A search engine. Useful for when you need to answer questions about current events. Input should be a search query.");
    }

    @Override
    public ToolExecuteResult run(String toolInput) {
        if(toolInput.equals("\"Camila Morrone age\"")) {
            return new ToolExecuteResult("25 years");
        }
        return new ToolExecuteResult("Camila Morrone");
    }
}
