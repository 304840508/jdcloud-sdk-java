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
 * 解析记录
 * 云解析OpenAPI解析记录接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.domainservice.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除主域名下的解析记录
 */
public class DeleteResourceRecordRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 域名ID，请使用describeDomains接口获取。
     * Required:true
     */
    @Required
    private String domainId;

    /**
     * 解析记录ID，请使用describeResourceRecord接口获取。
     * Required:true
     */
    @Required
    private String resourceRecordId;


    /**
     * get 实例所属的地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 域名ID，请使用describeDomains接口获取。
     *
     * @return
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * set 域名ID，请使用describeDomains接口获取。
     *
     * @param domainId
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * get 解析记录ID，请使用describeResourceRecord接口获取。
     *
     * @return
     */
    public String getResourceRecordId() {
        return resourceRecordId;
    }

    /**
     * set 解析记录ID，请使用describeResourceRecord接口获取。
     *
     * @param resourceRecordId
     */
    public void setResourceRecordId(String resourceRecordId) {
        this.resourceRecordId = resourceRecordId;
    }


    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public DeleteResourceRecordRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 域名ID，请使用describeDomains接口获取。
     *
     * @param domainId
     */
    public DeleteResourceRecordRequest domainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * set 解析记录ID，请使用describeResourceRecord接口获取。
     *
     * @param resourceRecordId
     */
    public DeleteResourceRecordRequest resourceRecordId(String resourceRecordId) {
        this.resourceRecordId = resourceRecordId;
        return this;
    }


}