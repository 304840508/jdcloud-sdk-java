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

package com.jdcloud.sdk.service.clouddnsservice.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * addView
 */
public class AddView  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主域名ID，请使用getDomains接口获取
     * Required:true
     */
    @Required
    private Integer domainId;

    /**
     * 主域名
     * Required:true
     */
    @Required
    private String domainName;

    /**
     * 自定义线路名称, 最多64个字符
     * Required:true
     */
    @Required
    private String viewName;

    /**
     * 用户输入的此线路的ip段。  
IPv4地址段支持1.2.3.4-5.6.7.8和1.2.3.4/16两种格式。    
IPv6地址段支持CIDR格式，例如：11:22:33:44:55::99/64

     * Required:true
     */
    @Required
    private List<String> ipRanges;


    /**
     * get 主域名ID，请使用getDomains接口获取
     *
     * @return
     */
    public Integer getDomainId() {
        return domainId;
    }

    /**
     * set 主域名ID，请使用getDomains接口获取
     *
     * @param domainId
     */
    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    /**
     * get 主域名
     *
     * @return
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * set 主域名
     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * get 自定义线路名称, 最多64个字符
     *
     * @return
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * set 自定义线路名称, 最多64个字符
     *
     * @param viewName
     */
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    /**
     * get 用户输入的此线路的ip段。  
IPv4地址段支持1.2.3.4-5.6.7.8和1.2.3.4/16两种格式。    
IPv6地址段支持CIDR格式，例如：11:22:33:44:55::99/64

     *
     * @return
     */
    public List<String> getIpRanges() {
        return ipRanges;
    }

    /**
     * set 用户输入的此线路的ip段。  
IPv4地址段支持1.2.3.4-5.6.7.8和1.2.3.4/16两种格式。    
IPv6地址段支持CIDR格式，例如：11:22:33:44:55::99/64

     *
     * @param ipRanges
     */
    public void setIpRanges(List<String> ipRanges) {
        this.ipRanges = ipRanges;
    }


    /**
     * set 主域名ID，请使用getDomains接口获取
     *
     * @param domainId
     */
    public AddView domainId(Integer domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * set 主域名
     *
     * @param domainName
     */
    public AddView domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * set 自定义线路名称, 最多64个字符
     *
     * @param viewName
     */
    public AddView viewName(String viewName) {
        this.viewName = viewName;
        return this;
    }

    /**
     * set 用户输入的此线路的ip段。  
IPv4地址段支持1.2.3.4-5.6.7.8和1.2.3.4/16两种格式。    
IPv6地址段支持CIDR格式，例如：11:22:33:44:55::99/64

     *
     * @param ipRanges
     */
    public AddView ipRanges(List<String> ipRanges) {
        this.ipRanges = ipRanges;
        return this;
    }


    /**
     * add item to 用户输入的此线路的ip段。  
IPv4地址段支持1.2.3.4-5.6.7.8和1.2.3.4/16两种格式。    
IPv6地址段支持CIDR格式，例如：11:22:33:44:55::99/64

     *
     * @param ipRange
     */
    public void addIpRange(String ipRange) {
        if (this.ipRanges == null) {
            this.ipRanges = new ArrayList<>();
        }
        this.ipRanges.add(ipRange);
    }

}