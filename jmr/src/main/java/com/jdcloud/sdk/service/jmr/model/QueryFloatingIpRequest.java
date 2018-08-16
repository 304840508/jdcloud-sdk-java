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
 * 集群管理
 * JMR集群管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jmr.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.jmr.model.Cluster;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询集群随机码
 */
public class QueryFloatingIpRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 即集群ID，类中包含计费类型type,集群clusterId
     * Required:true
     */
    @Required
    private Cluster recordId;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 即集群ID，类中包含计费类型type,集群clusterId
     *
     * @return
     */
    public Cluster getRecordId() {
        return recordId;
    }

    /**
     * set 即集群ID，类中包含计费类型type,集群clusterId
     *
     * @param recordId
     */
    public void setRecordId(Cluster recordId) {
        this.recordId = recordId;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 即集群ID，类中包含计费类型type,集群clusterId
     *
     * @param recordId
     */
    public QueryFloatingIpRequest recordId(Cluster recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public QueryFloatingIpRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}