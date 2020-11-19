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
 * Domain-Name
 * 域名系统接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.domain.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 针对用户的域名进行续费
域名续费前，请确保用户的京东云账户有足够的资金支付，Openapi接口回返回订单号，可以用此订单号向计费系统查阅详情

 */
public class RenewDomainRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名
     * Required:true
     */
    @Required
    private String domainName;

    /**
     * 续费年限，最多10年
     * Required:true
     */
    @Required
    private Integer term;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 域名
     *
     * @return
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * set 域名
     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * get 续费年限，最多10年
     *
     * @return
     */
    public Integer getTerm() {
        return term;
    }

    /**
     * set 续费年限，最多10年
     *
     * @param term
     */
    public void setTerm(Integer term) {
        this.term = term;
    }

    /**
     * get 实例所属的地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 域名
     *
     * @param domainName
     */
    public RenewDomainRequest domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * set 续费年限，最多10年
     *
     * @param term
     */
    public RenewDomainRequest term(Integer term) {
        this.term = term;
        return this;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public RenewDomainRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}