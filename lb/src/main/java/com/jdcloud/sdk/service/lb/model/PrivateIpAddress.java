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

package com.jdcloud.sdk.service.lb.model;


/**
 * privateIpAddress
 */
public class PrivateIpAddress  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * LoadBalancer的VIP(IPv4地址)
     */
    private String privateIpAddress;

    /**
     * 弹性公网IP ID
     */
    private String elasticIpId;

    /**
     * 弹性公网IP地址
     */
    private String elasticIpAddress;


    /**
     * get LoadBalancer的VIP(IPv4地址)
     *
     * @return
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * set LoadBalancer的VIP(IPv4地址)
     *
     * @param privateIpAddress
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * get 弹性公网IP ID
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set 弹性公网IP ID
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
    }

    /**
     * get 弹性公网IP地址
     *
     * @return
     */
    public String getElasticIpAddress() {
        return elasticIpAddress;
    }

    /**
     * set 弹性公网IP地址
     *
     * @param elasticIpAddress
     */
    public void setElasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
    }


    /**
     * set LoadBalancer的VIP(IPv4地址)
     *
     * @param privateIpAddress
     */
    public PrivateIpAddress privateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * set 弹性公网IP ID
     *
     * @param elasticIpId
     */
    public PrivateIpAddress elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }

    /**
     * set 弹性公网IP地址
     *
     * @param elasticIpAddress
     */
    public PrivateIpAddress elasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
        return this;
    }


}