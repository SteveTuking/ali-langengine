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
package com.alibaba.agentmagic.framework.delegation;

import com.alibaba.agentmagic.framework.delegation.provider.AssignDelegationHelper;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.smart.framework.engine.context.ExecutionContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 赋值节点
 *
 * @author xiaoxuan.lp
 */
@Slf4j
@Component
public class FrameworkAssignDelegation extends FrameworkDelegationBase<Map<String, Object>> {

    @Override
    public Map<String, Object> executeInternal(ExecutionContext executionContext, JSONObject properties, JSONObject request) {
        return AssignDelegationHelper.executeInternal(executionContext, properties, request);
    }
}
