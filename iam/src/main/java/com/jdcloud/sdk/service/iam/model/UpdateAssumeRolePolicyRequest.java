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
 * Role Management
 * Role Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.iam.model.UpdateAssumeRolePolicyInfo;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改角色内置policy
 */
public class UpdateAssumeRolePolicyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色权限信息
     * Required:true
     */
    @Required
    private UpdateAssumeRolePolicyInfo updateAssumeRolePolicyInfo;

    /**
     * 角色名称
     * Required:true
     */
    @Required
    private String roleName;


    /**
     * get 角色权限信息
     *
     * @return
     */
    public UpdateAssumeRolePolicyInfo getUpdateAssumeRolePolicyInfo() {
        return updateAssumeRolePolicyInfo;
    }

    /**
     * set 角色权限信息
     *
     * @param updateAssumeRolePolicyInfo
     */
    public void setUpdateAssumeRolePolicyInfo(UpdateAssumeRolePolicyInfo updateAssumeRolePolicyInfo) {
        this.updateAssumeRolePolicyInfo = updateAssumeRolePolicyInfo;
    }

    /**
     * get 角色名称
     *
     * @return
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * set 角色名称
     *
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    /**
     * set 角色权限信息
     *
     * @param updateAssumeRolePolicyInfo
     */
    public UpdateAssumeRolePolicyRequest updateAssumeRolePolicyInfo(UpdateAssumeRolePolicyInfo updateAssumeRolePolicyInfo) {
        this.updateAssumeRolePolicyInfo = updateAssumeRolePolicyInfo;
        return this;
    }

    /**
     * set 角色名称
     *
     * @param roleName
     */
    public UpdateAssumeRolePolicyRequest roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }


}