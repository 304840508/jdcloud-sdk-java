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

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;

/**
 * briefInstance
 */
public class BriefInstance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云主机ID
     */
    private String instanceId;

    /**
     * 云主机名称
     */
    private String instanceName;

    /**
     * 实例规格
     */
    private String instanceType;

    /**
     * 主网卡所属VPC的ID
     */
    private String vpcId;

    /**
     * 主网卡所属子网的ID
     */
    private String subnetId;

    /**
     * 主网卡主IP地址
     */
    private String privateIpAddress;

    /**
     * 云主机状态，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/vm_status&quot;&gt;参考云主机状态&lt;/a&gt;
     */
    private String status;

    /**
     * 云主机描述
     */
    private String description;

    /**
     * 镜像ID
     */
    private String imageId;

    /**
     * 系统盘配置
     */
    private BriefInstanceDiskAttachment systemDisk;

    /**
     * 数据盘配置
     */
    private List<BriefInstanceDiskAttachment> dataDisks;

    /**
     * 主网卡配置
     */
    private BriefInstanceNetworkInterfaceAttachment primaryNetworkInterface;

    /**
     * 辅助网卡配置
     */
    private List<BriefInstanceNetworkInterfaceAttachment> secondaryNetworkInterfaces;

    /**
     * 创建时间
     */
    private String launchTime;

    /**
     * 云主机所在可用区
     */
    private String az;

    /**
     * 密钥对名称
     */
    private List<String> keyNames;

    /**
     * 高可用组中的错误域
     */
    private String faultDomain;

    /**
     * 关机模式，只支持云盘做系统盘的按配置计费云主机。KeepCharging：关机后继续计费；StopCharging：关机后停止计费。
     */
    private String chargeOnStopped;

    /**
     * 实例所属的专有宿主机池
     */
    private String dedicatedPoolId;

    /**
     * 专有宿主机ID
     */
    private String dedicatedHostId;


    /**
     * get 云主机ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 云主机名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 云主机名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 实例规格
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例规格
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 主网卡所属VPC的ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 主网卡所属VPC的ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 主网卡所属子网的ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 主网卡所属子网的ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 主网卡主IP地址
     *
     * @return
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * set 主网卡主IP地址
     *
     * @param privateIpAddress
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * get 云主机状态，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/vm_status&quot;&gt;参考云主机状态&lt;/a&gt;
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 云主机状态，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/vm_status&quot;&gt;参考云主机状态&lt;/a&gt;
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 云主机描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 云主机描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 镜像ID
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * get 系统盘配置
     *
     * @return
     */
    public BriefInstanceDiskAttachment getSystemDisk() {
        return systemDisk;
    }

    /**
     * set 系统盘配置
     *
     * @param systemDisk
     */
    public void setSystemDisk(BriefInstanceDiskAttachment systemDisk) {
        this.systemDisk = systemDisk;
    }

    /**
     * get 数据盘配置
     *
     * @return
     */
    public List<BriefInstanceDiskAttachment> getDataDisks() {
        return dataDisks;
    }

    /**
     * set 数据盘配置
     *
     * @param dataDisks
     */
    public void setDataDisks(List<BriefInstanceDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
    }

    /**
     * get 主网卡配置
     *
     * @return
     */
    public BriefInstanceNetworkInterfaceAttachment getPrimaryNetworkInterface() {
        return primaryNetworkInterface;
    }

    /**
     * set 主网卡配置
     *
     * @param primaryNetworkInterface
     */
    public void setPrimaryNetworkInterface(BriefInstanceNetworkInterfaceAttachment primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
    }

    /**
     * get 辅助网卡配置
     *
     * @return
     */
    public List<BriefInstanceNetworkInterfaceAttachment> getSecondaryNetworkInterfaces() {
        return secondaryNetworkInterfaces;
    }

    /**
     * set 辅助网卡配置
     *
     * @param secondaryNetworkInterfaces
     */
    public void setSecondaryNetworkInterfaces(List<BriefInstanceNetworkInterfaceAttachment> secondaryNetworkInterfaces) {
        this.secondaryNetworkInterfaces = secondaryNetworkInterfaces;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getLaunchTime() {
        return launchTime;
    }

    /**
     * set 创建时间
     *
     * @param launchTime
     */
    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * get 云主机所在可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 云主机所在可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 密钥对名称
     *
     * @return
     */
    public List<String> getKeyNames() {
        return keyNames;
    }

    /**
     * set 密钥对名称
     *
     * @param keyNames
     */
    public void setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
    }

    /**
     * get 高可用组中的错误域
     *
     * @return
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * set 高可用组中的错误域
     *
     * @param faultDomain
     */
    public void setFaultDomain(String faultDomain) {
        this.faultDomain = faultDomain;
    }

    /**
     * get 关机模式，只支持云盘做系统盘的按配置计费云主机。KeepCharging：关机后继续计费；StopCharging：关机后停止计费。
     *
     * @return
     */
    public String getChargeOnStopped() {
        return chargeOnStopped;
    }

    /**
     * set 关机模式，只支持云盘做系统盘的按配置计费云主机。KeepCharging：关机后继续计费；StopCharging：关机后停止计费。
     *
     * @param chargeOnStopped
     */
    public void setChargeOnStopped(String chargeOnStopped) {
        this.chargeOnStopped = chargeOnStopped;
    }

    /**
     * get 实例所属的专有宿主机池
     *
     * @return
     */
    public String getDedicatedPoolId() {
        return dedicatedPoolId;
    }

    /**
     * set 实例所属的专有宿主机池
     *
     * @param dedicatedPoolId
     */
    public void setDedicatedPoolId(String dedicatedPoolId) {
        this.dedicatedPoolId = dedicatedPoolId;
    }

    /**
     * get 专有宿主机ID
     *
     * @return
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    /**
     * set 专有宿主机ID
     *
     * @param dedicatedHostId
     */
    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }


    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public BriefInstance instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 云主机名称
     *
     * @param instanceName
     */
    public BriefInstance instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 实例规格
     *
     * @param instanceType
     */
    public BriefInstance instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 主网卡所属VPC的ID
     *
     * @param vpcId
     */
    public BriefInstance vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 主网卡所属子网的ID
     *
     * @param subnetId
     */
    public BriefInstance subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 主网卡主IP地址
     *
     * @param privateIpAddress
     */
    public BriefInstance privateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * set 云主机状态，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/vm_status&quot;&gt;参考云主机状态&lt;/a&gt;
     *
     * @param status
     */
    public BriefInstance status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 云主机描述
     *
     * @param description
     */
    public BriefInstance description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public BriefInstance imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * set 系统盘配置
     *
     * @param systemDisk
     */
    public BriefInstance systemDisk(BriefInstanceDiskAttachment systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }

    /**
     * set 数据盘配置
     *
     * @param dataDisks
     */
    public BriefInstance dataDisks(List<BriefInstanceDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * set 主网卡配置
     *
     * @param primaryNetworkInterface
     */
    public BriefInstance primaryNetworkInterface(BriefInstanceNetworkInterfaceAttachment primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
        return this;
    }

    /**
     * set 辅助网卡配置
     *
     * @param secondaryNetworkInterfaces
     */
    public BriefInstance secondaryNetworkInterfaces(List<BriefInstanceNetworkInterfaceAttachment> secondaryNetworkInterfaces) {
        this.secondaryNetworkInterfaces = secondaryNetworkInterfaces;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param launchTime
     */
    public BriefInstance launchTime(String launchTime) {
        this.launchTime = launchTime;
        return this;
    }

    /**
     * set 云主机所在可用区
     *
     * @param az
     */
    public BriefInstance az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 密钥对名称
     *
     * @param keyNames
     */
    public BriefInstance keyNames(List<String> keyNames) {
        this.keyNames = keyNames;
        return this;
    }

    /**
     * set 高可用组中的错误域
     *
     * @param faultDomain
     */
    public BriefInstance faultDomain(String faultDomain) {
        this.faultDomain = faultDomain;
        return this;
    }

    /**
     * set 关机模式，只支持云盘做系统盘的按配置计费云主机。KeepCharging：关机后继续计费；StopCharging：关机后停止计费。
     *
     * @param chargeOnStopped
     */
    public BriefInstance chargeOnStopped(String chargeOnStopped) {
        this.chargeOnStopped = chargeOnStopped;
        return this;
    }

    /**
     * set 实例所属的专有宿主机池
     *
     * @param dedicatedPoolId
     */
    public BriefInstance dedicatedPoolId(String dedicatedPoolId) {
        this.dedicatedPoolId = dedicatedPoolId;
        return this;
    }

    /**
     * set 专有宿主机ID
     *
     * @param dedicatedHostId
     */
    public BriefInstance dedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }


    /**
     * add item to 数据盘配置
     *
     * @param dataDisk
     */
    public void addDataDisk(BriefInstanceDiskAttachment dataDisk) {
        if (this.dataDisks == null) {
            this.dataDisks = new ArrayList<>();
        }
        this.dataDisks.add(dataDisk);
    }

    /**
     * add item to 辅助网卡配置
     *
     * @param secondaryNetworkInterface
     */
    public void addSecondaryNetworkInterface(BriefInstanceNetworkInterfaceAttachment secondaryNetworkInterface) {
        if (this.secondaryNetworkInterfaces == null) {
            this.secondaryNetworkInterfaces = new ArrayList<>();
        }
        this.secondaryNetworkInterfaces.add(secondaryNetworkInterface);
    }

    /**
     * add item to 密钥对名称
     *
     * @param keyName
     */
    public void addKeyName(String keyName) {
        if (this.keyNames == null) {
            this.keyNames = new ArrayList<>();
        }
        this.keyNames.add(keyName);
    }

}