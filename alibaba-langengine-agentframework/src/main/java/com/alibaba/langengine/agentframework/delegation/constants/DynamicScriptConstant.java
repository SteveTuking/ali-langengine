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
package com.alibaba.langengine.agentframework.delegation.constants;

public interface DynamicScriptConstant {
     String CODE_TYPE_KEY = "language";
     String CODE_INPUT_PARAMS_KEY = "inputParameters";
     String CODE_TYPE_GROOVY = "groovy";
     String CODE_TYPE_JEP = "python";
     String CODE_CONTENTS_KEY = "script";
     String CODE_OUTPUT_PARAMS_KEY = "outputParameters";

     String CODE_ENABLE_EXCEPTION_CONFIG = "enableExceptionConfig";
     String CODE_EXCEPTION_CONFIG = "exceptionConfig";
}
