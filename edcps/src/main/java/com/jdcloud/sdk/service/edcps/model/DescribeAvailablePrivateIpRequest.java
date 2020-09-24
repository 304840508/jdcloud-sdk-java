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
 * Distributed-Cloud-Physical-Server
 * 分布式云物理服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.edcps.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询可用的私有IP列表
 */
public class DescribeAvailablePrivateIpRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主网口或者辅网口的子网id
     * Required:true
     */
    @Required
    private String subnetId;

    /**
     * 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 分布式云物理服务器ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 主网口或者辅网口的子网id
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 主网口或者辅网口的子网id
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 分布式云物理服务器ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 分布式云物理服务器ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 主网口或者辅网口的子网id
     *
     * @param subnetId
     */
    public DescribeAvailablePrivateIpRequest subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @param regionId
     */
    public DescribeAvailablePrivateIpRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 分布式云物理服务器ID
     *
     * @param instanceId
     */
    public DescribeAvailablePrivateIpRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}