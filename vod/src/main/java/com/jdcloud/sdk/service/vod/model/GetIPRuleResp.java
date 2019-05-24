/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Domain Management
 * 域名管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;


/**
 * 获取域名IP访问控制规则配置响应消息体
 */
public class GetIPRuleResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则类型，取值 &#39;ip&#39;
     */
    private String ruleType;

    /**
     * 规则配置对象
     */
    private Object config;

    /**
     * 是否启用该规则
     */
    private Boolean enabled;

    /**
     * createTime
     */
    private String createTime;

    /**
     * updateTime
     */
    private String updateTime;


    /**
     * get 规则类型，取值 &#39;ip&#39;
     *
     * @return
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * set 规则类型，取值 &#39;ip&#39;
     *
     * @param ruleType
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * get 规则配置对象
     *
     * @return
     */
    public Object getConfig() {
        return config;
    }

    /**
     * set 规则配置对象
     *
     * @param config
     */
    public void setConfig(Object config) {
        this.config = config;
    }

    /**
     * get 是否启用该规则
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用该规则
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * get createTime
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 规则类型，取值 &#39;ip&#39;
     *
     * @param ruleType
     */
    public GetIPRuleResp ruleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * set 规则配置对象
     *
     * @param config
     */
    public GetIPRuleResp config(Object config) {
        this.config = config;
        return this;
    }

    /**
     * set 是否启用该规则
     *
     * @param enabled
     */
    public GetIPRuleResp enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public GetIPRuleResp createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public GetIPRuleResp updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}