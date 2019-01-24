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
 * JCloud Openapi For CDN
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加httpHeader
 */
public class SetHttpHeaderRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * header类型[resp,req]
     */
    private String headerType;

    /**
     * header名
     */
    private String headerName;

    /**
     * header值
     */
    private String headerValue;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;


    /**
     * get header类型[resp,req]
     *
     * @return
     */
    public String getHeaderType() {
        return headerType;
    }

    /**
     * set header类型[resp,req]
     *
     * @param headerType
     */
    public void setHeaderType(String headerType) {
        this.headerType = headerType;
    }

    /**
     * get header名
     *
     * @return
     */
    public String getHeaderName() {
        return headerName;
    }

    /**
     * set header名
     *
     * @param headerName
     */
    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    /**
     * get header值
     *
     * @return
     */
    public String getHeaderValue() {
        return headerValue;
    }

    /**
     * set header值
     *
     * @param headerValue
     */
    public void setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
    }

    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * set header类型[resp,req]
     *
     * @param headerType
     */
    public SetHttpHeaderRequest headerType(String headerType) {
        this.headerType = headerType;
        return this;
    }

    /**
     * set header名
     *
     * @param headerName
     */
    public SetHttpHeaderRequest headerName(String headerName) {
        this.headerName = headerName;
        return this;
    }

    /**
     * set header值
     *
     * @param headerValue
     */
    public SetHttpHeaderRequest headerValue(String headerValue) {
        this.headerValue = headerValue;
        return this;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public SetHttpHeaderRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


}