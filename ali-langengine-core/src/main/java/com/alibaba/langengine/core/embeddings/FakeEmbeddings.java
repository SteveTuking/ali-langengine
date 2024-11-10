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
package com.alibaba.langengine.core.embeddings;

import com.alibaba.langengine.core.indexes.Document;

import java.util.ArrayList;
import java.util.List;

public class FakeEmbeddings extends Embeddings {

    @Override
    public String getModelType() {
        return null;
    }

    @Override
    public List<Document> embedDocument(List<Document> documents) {
        List<Double> list = new ArrayList<>();
        list.add(0.5d);
        documents.forEach(document -> document.setEmbedding(list));
        return new ArrayList<>();
    }

    @Override
    public List<String> embedQuery(String text, int recommend) {
        return new ArrayList<>();
    }
}
