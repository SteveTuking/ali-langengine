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
package com.alibaba.langengine.gpt.nl2sql.db.meta;

import lombok.Data;

@Data
public class DatasourceConfig {

    /**
     * 数据库连接串，例如：jdbc:postgresql://{ENDPOINT}:{PORT}/{DBNAME}?user=xxx&password=xxx
     */
    private String url;

    /**
     * 数据库方言，如：hologres
     */
    private String dialect;

    /**
     * 数据库用户名
     */
    private String userName;

    /**
     * 数据库密码
     */
    private String pwd;

    //////////////////////////////////////// 数据库连接池信息 ////////////////////////////////////////
    /**
     * 是否需要开启连接池
     */
    private Boolean connFromPool = false;

    /**
     * 初始连接数
     */
    private Integer initialSize = 5;

    /**
     * 最大连接数
     */
    private Integer maxActive = 20;
}
