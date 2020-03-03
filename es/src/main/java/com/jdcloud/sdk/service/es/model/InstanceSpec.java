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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.es.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * instanceSpec
 */
public class InstanceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 私有网络vpcId
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * 子网subnetId
     * Required:true
     */
    @Required
    private String subnetId;

    /**
     * es版本，当前支持5.6.9和6.5.4
     * Required:true
     */
    @Required
    private String instanceVersion;

    /**
     * es集群名称，不可为空，只支持大小写字母、数字、英文下划线或者中划线，以字母开头且不能超过32位
     * Required:true
     */
    @Required
    private String instanceName;

    /**
     * 可用区，各可用区编码请参考：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/restrictions
     * Required:true
     */
    @Required
    private String azId;

    /**
     * 规格配置，规格代码请参考：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/specifications
     * Required:true
     */
    @Required
    private InstanceClassSpec instanceClass;

    /**
     * 是否支持ipv6，支持值为v4&amp;v6,不支持为空
     */
    private String ipVersion;

    /**
     * 是否包含专用主节点，默认false
     */
    private Boolean dedicatedMaster;

    /**
     * 是否包含协调节点，默认false
     */
    private Boolean coordinating;

    /**
     * 自动快照设置。
     */
    private AutoSnapshot autoSnapshot;

    /**
     * es数据面身份验证设置信息
     */
    private AuthConfig authConfig;


    /**
     * get 私有网络vpcId
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络vpcId
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 子网subnetId
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网subnetId
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get es版本，当前支持5.6.9和6.5.4
     *
     * @return
     */
    public String getInstanceVersion() {
        return instanceVersion;
    }

    /**
     * set es版本，当前支持5.6.9和6.5.4
     *
     * @param instanceVersion
     */
    public void setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
    }

    /**
     * get es集群名称，不可为空，只支持大小写字母、数字、英文下划线或者中划线，以字母开头且不能超过32位
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set es集群名称，不可为空，只支持大小写字母、数字、英文下划线或者中划线，以字母开头且不能超过32位
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 可用区，各可用区编码请参考：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/restrictions
     *
     * @return
     */
    public String getAzId() {
        return azId;
    }

    /**
     * set 可用区，各可用区编码请参考：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/restrictions
     *
     * @param azId
     */
    public void setAzId(String azId) {
        this.azId = azId;
    }

    /**
     * get 规格配置，规格代码请参考：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/specifications
     *
     * @return
     */
    public InstanceClassSpec getInstanceClass() {
        return instanceClass;
    }

    /**
     * set 规格配置，规格代码请参考：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/specifications
     *
     * @param instanceClass
     */
    public void setInstanceClass(InstanceClassSpec instanceClass) {
        this.instanceClass = instanceClass;
    }

    /**
     * get 是否支持ipv6，支持值为v4&amp;v6,不支持为空
     *
     * @return
     */
    public String getIpVersion() {
        return ipVersion;
    }

    /**
     * set 是否支持ipv6，支持值为v4&amp;v6,不支持为空
     *
     * @param ipVersion
     */
    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    /**
     * get 是否包含专用主节点，默认false
     *
     * @return
     */
    public Boolean getDedicatedMaster() {
        return dedicatedMaster;
    }

    /**
     * set 是否包含专用主节点，默认false
     *
     * @param dedicatedMaster
     */
    public void setDedicatedMaster(Boolean dedicatedMaster) {
        this.dedicatedMaster = dedicatedMaster;
    }

    /**
     * get 是否包含协调节点，默认false
     *
     * @return
     */
    public Boolean getCoordinating() {
        return coordinating;
    }

    /**
     * set 是否包含协调节点，默认false
     *
     * @param coordinating
     */
    public void setCoordinating(Boolean coordinating) {
        this.coordinating = coordinating;
    }

    /**
     * get 自动快照设置。
     *
     * @return
     */
    public AutoSnapshot getAutoSnapshot() {
        return autoSnapshot;
    }

    /**
     * set 自动快照设置。
     *
     * @param autoSnapshot
     */
    public void setAutoSnapshot(AutoSnapshot autoSnapshot) {
        this.autoSnapshot = autoSnapshot;
    }

    /**
     * get es数据面身份验证设置信息
     *
     * @return
     */
    public AuthConfig getAuthConfig() {
        return authConfig;
    }

    /**
     * set es数据面身份验证设置信息
     *
     * @param authConfig
     */
    public void setAuthConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
    }


    /**
     * set 私有网络vpcId
     *
     * @param vpcId
     */
    public InstanceSpec vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 子网subnetId
     *
     * @param subnetId
     */
    public InstanceSpec subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set es版本，当前支持5.6.9和6.5.4
     *
     * @param instanceVersion
     */
    public InstanceSpec instanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }

    /**
     * set es集群名称，不可为空，只支持大小写字母、数字、英文下划线或者中划线，以字母开头且不能超过32位
     *
     * @param instanceName
     */
    public InstanceSpec instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 可用区，各可用区编码请参考：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/restrictions
     *
     * @param azId
     */
    public InstanceSpec azId(String azId) {
        this.azId = azId;
        return this;
    }

    /**
     * set 规格配置，规格代码请参考：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/specifications
     *
     * @param instanceClass
     */
    public InstanceSpec instanceClass(InstanceClassSpec instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }

    /**
     * set 是否支持ipv6，支持值为v4&amp;v6,不支持为空
     *
     * @param ipVersion
     */
    public InstanceSpec ipVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * set 是否包含专用主节点，默认false
     *
     * @param dedicatedMaster
     */
    public InstanceSpec dedicatedMaster(Boolean dedicatedMaster) {
        this.dedicatedMaster = dedicatedMaster;
        return this;
    }

    /**
     * set 是否包含协调节点，默认false
     *
     * @param coordinating
     */
    public InstanceSpec coordinating(Boolean coordinating) {
        this.coordinating = coordinating;
        return this;
    }

    /**
     * set 自动快照设置。
     *
     * @param autoSnapshot
     */
    public InstanceSpec autoSnapshot(AutoSnapshot autoSnapshot) {
        this.autoSnapshot = autoSnapshot;
        return this;
    }

    /**
     * set es数据面身份验证设置信息
     *
     * @param authConfig
     */
    public InstanceSpec authConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }


}