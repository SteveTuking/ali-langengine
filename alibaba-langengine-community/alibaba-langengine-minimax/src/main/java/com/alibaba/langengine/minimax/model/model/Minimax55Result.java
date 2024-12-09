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
package com.alibaba.langengine.minimax.model.model;

/**
 * @author aihe.ah
 * @time 2024/1/2
 * 功能说明：
 */

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * @author qiongjin
 * @date 2023/11/16
 */
@Data
public class Minimax55Result {
    /**
     * 请求发起时间
     */
    private Long created;

    /**
     * 请求指定的模型名称
     */
    private String model;

    /**
     * 回复内容
     */
    private String reply;

    /**
     * 输入命中敏感词
     */
    @JSONField(name = "input_sensitive")
    private Boolean inputSensitive;

    /**
     * 输入命中敏感词类型，当input_sensitive为true时返回
     *
     * 取值为以下其一：1 严重违规；2 色情；3 广告；4 违禁；5 谩骂；6 暴恐；7 其他
     */
    @JSONField(name = "input_sensitive_type")
    private Integer inputSensitiveType;

    /**
     * 输出命中敏感词
     */
    @JSONField(name = "output_sensitive")
    private Boolean outputSensitive;

    /**
     * 输出命中敏感词类型，当output_sensitive为true时返回
     *
     * 取值为以下其一：1 严重违规；2 色情；3 广告；4 违禁；5 谩骂；6 暴恐；7 其他
     */
    @JSONField(name = "output_sensitive_type")
    private Integer outputSensitiveType;

    /**
     * 所有结果
     */
    private List<MiniMaxMessage> choices;

    /**
     * tokens数使用情况，流式场景下仅最后一个数据包含该字段
     */
    private MiniMaxResult.Usage usage;

    /**
     * 本次请求ID，用于问题排查
     */
    private String id;

    /**
     * 请求信息
     */
    @JSONField(name = "base_resp")
    private MiniMaxResult.BaseResp baseResp;

}
