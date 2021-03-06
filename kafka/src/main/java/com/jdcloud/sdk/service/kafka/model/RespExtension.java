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

package com.jdcloud.sdk.service.kafka.model;


/**
 * respExtension
 */
public class RespExtension  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 内网地址，详情接口
     */
    private InternalEndpoint internalEndpoint;

    /**
     * kafka managerUrl
     */
    private String managerUrl;


    /**
     * get 内网地址，详情接口
     *
     * @return
     */
    public InternalEndpoint getInternalEndpoint() {
        return internalEndpoint;
    }

    /**
     * set 内网地址，详情接口
     *
     * @param internalEndpoint
     */
    public void setInternalEndpoint(InternalEndpoint internalEndpoint) {
        this.internalEndpoint = internalEndpoint;
    }

    /**
     * get kafka managerUrl
     *
     * @return
     */
    public String getManagerUrl() {
        return managerUrl;
    }

    /**
     * set kafka managerUrl
     *
     * @param managerUrl
     */
    public void setManagerUrl(String managerUrl) {
        this.managerUrl = managerUrl;
    }


    /**
     * set 内网地址，详情接口
     *
     * @param internalEndpoint
     */
    public RespExtension internalEndpoint(InternalEndpoint internalEndpoint) {
        this.internalEndpoint = internalEndpoint;
        return this;
    }

    /**
     * set kafka managerUrl
     *
     * @param managerUrl
     */
    public RespExtension managerUrl(String managerUrl) {
        this.managerUrl = managerUrl;
        return this;
    }


}