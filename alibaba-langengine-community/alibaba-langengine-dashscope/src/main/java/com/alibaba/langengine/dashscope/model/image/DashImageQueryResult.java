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
package com.alibaba.langengine.dashscope.model.image;

import lombok.Data;

/**
 * @author chenshuaixin
 * @date 2024/05/20
 */
@Data
public class DashImageQueryResult {
    /**
     * 请求id
     */
    private String request_id;
    /**
     * output输出
     */
    private DashImageOutput output;
    /**
     * usage输出
     */
    private DashImageUsageResult usage;
}
