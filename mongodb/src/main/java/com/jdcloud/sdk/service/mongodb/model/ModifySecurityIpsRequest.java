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
 * 安全管理
 * API related to MONGODB security
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mongodb.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改实例访问白名单
 */
public class ModifySecurityIpsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 修改方式,Add 增加白名单,Delete 删除白名单.
     * Required:true
     */
    @Required
    private String modifyMode;

    /**
     * IP白名单分组下的IP列表，最多45个以逗号隔开，格式如下：0.0.0.0/0，10.23.12.24（IP），或者10.23.12.24/24（CIDR模式，无类域间路由，/24表示了地址中前缀的长度，范围[1，32]）。
     * Required:true
     */
    @Required
    private String securityIps;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Instance ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 修改方式,Add 增加白名单,Delete 删除白名单.
     *
     * @return
     */
    public String getModifyMode() {
        return modifyMode;
    }

    /**
     * set 修改方式,Add 增加白名单,Delete 删除白名单.
     *
     * @param modifyMode
     */
    public void setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
    }

    /**
     * get IP白名单分组下的IP列表，最多45个以逗号隔开，格式如下：0.0.0.0/0，10.23.12.24（IP），或者10.23.12.24/24（CIDR模式，无类域间路由，/24表示了地址中前缀的长度，范围[1，32]）。
     *
     * @return
     */
    public String getSecurityIps() {
        return securityIps;
    }

    /**
     * set IP白名单分组下的IP列表，最多45个以逗号隔开，格式如下：0.0.0.0/0，10.23.12.24（IP），或者10.23.12.24/24（CIDR模式，无类域间路由，/24表示了地址中前缀的长度，范围[1，32]）。
     *
     * @param securityIps
     */
    public void setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get Instance ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set Instance ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 修改方式,Add 增加白名单,Delete 删除白名单.
     *
     * @param modifyMode
     */
    public ModifySecurityIpsRequest modifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }

    /**
     * set IP白名单分组下的IP列表，最多45个以逗号隔开，格式如下：0.0.0.0/0，10.23.12.24（IP），或者10.23.12.24/24（CIDR模式，无类域间路由，/24表示了地址中前缀的长度，范围[1，32]）。
     *
     * @param securityIps
     */
    public ModifySecurityIpsRequest securityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifySecurityIpsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Instance ID
     *
     * @param instanceId
     */
    public ModifySecurityIpsRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}