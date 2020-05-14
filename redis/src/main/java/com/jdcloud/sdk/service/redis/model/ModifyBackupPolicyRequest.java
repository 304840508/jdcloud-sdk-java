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
 * Redis Instance API
 * 缓存Redis实例的创建、删除、修改基本信息、设置密码、变配、实例列表、备份、配置参数等接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 开启或更新缓存Redis实例的自动备份策略，可修改备份周期和备份时间
 */
public class ModifyBackupPolicyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设置自动备份时间，格式为：HH:mm-HH:mm 时区，例如&quot;01:00-02:00 +0800&quot;，表示东八区的1点到2点,&#39;-&#39;表示关闭自动备份
     * Required:true
     */
    @Required
    private String backupTime;

    /**
     * 备份周期，包括：Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday，多个用逗号分隔
     * Required:true
     */
    @Required
    private String backupPeriod;

    /**
     * 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 缓存Redis实例ID，是访问实例的唯一标识
     * Required:true
     */
    @Required
    private String cacheInstanceId;


    /**
     * get 设置自动备份时间，格式为：HH:mm-HH:mm 时区，例如&quot;01:00-02:00 +0800&quot;，表示东八区的1点到2点,&#39;-&#39;表示关闭自动备份
     *
     * @return
     */
    public String getBackupTime() {
        return backupTime;
    }

    /**
     * set 设置自动备份时间，格式为：HH:mm-HH:mm 时区，例如&quot;01:00-02:00 +0800&quot;，表示东八区的1点到2点,&#39;-&#39;表示关闭自动备份
     *
     * @param backupTime
     */
    public void setBackupTime(String backupTime) {
        this.backupTime = backupTime;
    }

    /**
     * get 备份周期，包括：Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday，多个用逗号分隔
     *
     * @return
     */
    public String getBackupPeriod() {
        return backupPeriod;
    }

    /**
     * set 备份周期，包括：Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday，多个用逗号分隔
     *
     * @param backupPeriod
     */
    public void setBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
    }

    /**
     * get 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 缓存Redis实例ID，是访问实例的唯一标识
     *
     * @return
     */
    public String getCacheInstanceId() {
        return cacheInstanceId;
    }

    /**
     * set 缓存Redis实例ID，是访问实例的唯一标识
     *
     * @param cacheInstanceId
     */
    public void setCacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
    }


    /**
     * set 设置自动备份时间，格式为：HH:mm-HH:mm 时区，例如&quot;01:00-02:00 +0800&quot;，表示东八区的1点到2点,&#39;-&#39;表示关闭自动备份
     *
     * @param backupTime
     */
    public ModifyBackupPolicyRequest backupTime(String backupTime) {
        this.backupTime = backupTime;
        return this;
    }

    /**
     * set 备份周期，包括：Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday，多个用逗号分隔
     *
     * @param backupPeriod
     */
    public ModifyBackupPolicyRequest backupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }

    /**
     * set 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public ModifyBackupPolicyRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 缓存Redis实例ID，是访问实例的唯一标识
     *
     * @param cacheInstanceId
     */
    public ModifyBackupPolicyRequest cacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
        return this;
    }


}