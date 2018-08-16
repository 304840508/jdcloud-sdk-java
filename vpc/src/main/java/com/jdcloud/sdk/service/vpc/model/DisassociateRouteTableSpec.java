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

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * disassociateRouteTableSpec
 */
public class DisassociateRouteTableSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 路由表要解绑的子网ID，解绑后子网绑定默认路由表
     * Required:true
     */
    @Required
    private String subnetId;


    /**
     * get 路由表要解绑的子网ID，解绑后子网绑定默认路由表
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 路由表要解绑的子网ID，解绑后子网绑定默认路由表
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }


    /**
     * set 路由表要解绑的子网ID，解绑后子网绑定默认路由表
     *
     * @param subnetId
     */
    public DisassociateRouteTableSpec subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }


}