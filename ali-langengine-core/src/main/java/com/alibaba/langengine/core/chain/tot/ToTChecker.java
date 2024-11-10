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
package com.alibaba.langengine.core.chain.tot;

import com.alibaba.langengine.core.callback.ExecutionContext;
import com.alibaba.langengine.core.chain.Chain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Tree of Thought (ToT) checker.
 *
 * This is an abstract ToT checker that must be implemented by the user. You
 * can implement a simple rule-based checker or a more sophisticated
 * neural network based classifier.
 *
 * @author xiaoxuan.lp
 */
public abstract class ToTChecker extends Chain {

    private String outputKey = "validity";

    @Override
    public Map<String, Object> call(Map<String, Object> inputs, ExecutionContext executionContext, Consumer<String> consumer, Map<String, Object> extraAttributes) {
        Map<String, Object> result = new HashMap<>();
        result.put(outputKey, evaluate((String)inputs.get("problem_description"), (List<String>)inputs.get("thoughts")));
        return result;
    }

    @Override
    public List<String> getInputKeys() {
        return Arrays.asList(new String[] { "problem_description", "thoughts" });
    }

    @Override
    public List<String> getOutputKeys() {
        return Arrays.asList(outputKey);
    }

    public abstract ThoughtValidity evaluate(String problemDescription, List<String> thoughts);
}
