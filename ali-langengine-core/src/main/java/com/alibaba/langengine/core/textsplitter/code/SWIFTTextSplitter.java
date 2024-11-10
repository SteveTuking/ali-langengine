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
package com.alibaba.langengine.core.textsplitter.code;

import com.alibaba.langengine.core.textsplitter.RecursiveCharacterTextSplitter;
import lombok.Data;

import java.util.Arrays;

/**
 * Attempts to split the text along SWIFT-formatted headings.
 *
 * @author xiaoxuan.lp
 */
@Data
public class SWIFTTextSplitter extends RecursiveCharacterTextSplitter {

    public SWIFTTextSplitter() {
        setSeparators(Arrays.asList(new String[] {
                "\nfunc ",
                "\nclass ",
                "\nstruct ",
                "\nenum ",
                "\nif ",
                "\nfor ",
                "\nwhile ",
                "\ndo ",
                "\nswitch ",
                "\ncase ",
                "\n\n",
                "\n",
                " ",
                "",
        }));
    }

    public String getKeepSeparatorRegex(String separator) {
        return "(?<=" + separator + ")|(?=" + separator + ")";
    }
}
