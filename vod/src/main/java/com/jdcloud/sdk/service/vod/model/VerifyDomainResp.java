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
 * Domain Management
 * 域名管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;


/**
 * 校验域名结果
 */
public class VerifyDomainResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 校验域名
     */
    private String domainName;

    /**
     * 校验是否通过
     */
    private Boolean verified;

    /**
     * ICP信息
     */
    private String icpInfo;


    /**
     * get 校验域名
     *
     * @return
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * set 校验域名
     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * get 校验是否通过
     *
     * @return
     */
    public Boolean getVerified() {
        return verified;
    }

    /**
     * set 校验是否通过
     *
     * @param verified
     */
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * get ICP信息
     *
     * @return
     */
    public String getIcpInfo() {
        return icpInfo;
    }

    /**
     * set ICP信息
     *
     * @param icpInfo
     */
    public void setIcpInfo(String icpInfo) {
        this.icpInfo = icpInfo;
    }


    /**
     * set 校验域名
     *
     * @param domainName
     */
    public VerifyDomainResp domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * set 校验是否通过
     *
     * @param verified
     */
    public VerifyDomainResp verified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * set ICP信息
     *
     * @param icpInfo
     */
    public VerifyDomainResp icpInfo(String icpInfo) {
        this.icpInfo = icpInfo;
        return this;
    }


}