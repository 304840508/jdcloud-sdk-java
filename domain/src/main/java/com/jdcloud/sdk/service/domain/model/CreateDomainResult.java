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

import com.jdcloud.sdk.service.domain.model.DomainOrder;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 域名注册
域名注册前，请确保用户的京东云账户有足够的资金支付，Openapi接口回返回订单号，可以用此订单号向计费系统查阅详情

 */
public class CreateDomainResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名购买返回结果，后续需要调用订单支付接口
     */
    private DomainOrder data;


    /**
     * get 域名购买返回结果，后续需要调用订单支付接口
     *
     * @return
     */
    public DomainOrder getData() {
        return data;
    }

    /**
     * set 域名购买返回结果，后续需要调用订单支付接口
     *
     * @param data
     */
    public void setData(DomainOrder data) {
        this.data = data;
    }


    /**
     * set 域名购买返回结果，后续需要调用订单支付接口
     *
     * @param data
     */
    public CreateDomainResult data(DomainOrder data) {
        this.data = data;
        return this;
    }


}