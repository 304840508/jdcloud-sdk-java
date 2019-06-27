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

package com.jdcloud.sdk.service.cdn.model;


/**
 * domainbdwItem
 */
public class DomainbdwItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * domain
     */
    private String domain;

    /**
     * domainType
     */
    private String domainType;

    /**
     * topTimeStamp
     */
    private Long topTimeStamp;

    /**
     * pv
     */
    private Long pv;

    /**
     * flow
     */
    private Double flow;

    /**
     * avgbandwidth
     */
    private Double avgbandwidth;


    /**
     * get domain
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get domainType
     *
     * @return
     */
    public String getDomainType() {
        return domainType;
    }

    /**
     * set domainType
     *
     * @param domainType
     */
    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    /**
     * get topTimeStamp
     *
     * @return
     */
    public Long getTopTimeStamp() {
        return topTimeStamp;
    }

    /**
     * set topTimeStamp
     *
     * @param topTimeStamp
     */
    public void setTopTimeStamp(Long topTimeStamp) {
        this.topTimeStamp = topTimeStamp;
    }

    /**
     * get pv
     *
     * @return
     */
    public Long getPv() {
        return pv;
    }

    /**
     * set pv
     *
     * @param pv
     */
    public void setPv(Long pv) {
        this.pv = pv;
    }

    /**
     * get flow
     *
     * @return
     */
    public Double getFlow() {
        return flow;
    }

    /**
     * set flow
     *
     * @param flow
     */
    public void setFlow(Double flow) {
        this.flow = flow;
    }

    /**
     * get avgbandwidth
     *
     * @return
     */
    public Double getAvgbandwidth() {
        return avgbandwidth;
    }

    /**
     * set avgbandwidth
     *
     * @param avgbandwidth
     */
    public void setAvgbandwidth(Double avgbandwidth) {
        this.avgbandwidth = avgbandwidth;
    }


    /**
     * set domain
     *
     * @param domain
     */
    public DomainbdwItem domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set domainType
     *
     * @param domainType
     */
    public DomainbdwItem domainType(String domainType) {
        this.domainType = domainType;
        return this;
    }

    /**
     * set topTimeStamp
     *
     * @param topTimeStamp
     */
    public DomainbdwItem topTimeStamp(Long topTimeStamp) {
        this.topTimeStamp = topTimeStamp;
        return this;
    }

    /**
     * set pv
     *
     * @param pv
     */
    public DomainbdwItem pv(Long pv) {
        this.pv = pv;
        return this;
    }

    /**
     * set flow
     *
     * @param flow
     */
    public DomainbdwItem flow(Double flow) {
        this.flow = flow;
        return this;
    }

    /**
     * set avgbandwidth
     *
     * @param avgbandwidth
     */
    public DomainbdwItem avgbandwidth(Double avgbandwidth) {
        this.avgbandwidth = avgbandwidth;
        return this;
    }


}