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


/**
 * monitorAlarmInfo
 */
public class MonitorAlarmInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名ID
     */
    private Integer domainId;

    /**
     * 子域名
     */
    private String subDomainName;

    /**
     * 故障IP/域名
     */
    private String host;

    /**
     * null
     */
    private Integer id;

    /**
     * 故障开始时间，格式Unix timestamp，时间单位：毫秒
     */
    private Long startTime;

    /**
     * 故障结束时间，格式Unix timestamp，时间单位：毫秒
     */
    private Long endTime;


    /**
     * get 域名ID
     *
     * @return
     */
    public Integer getDomainId() {
        return domainId;
    }

    /**
     * set 域名ID
     *
     * @param domainId
     */
    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    /**
     * get 子域名
     *
     * @return
     */
    public String getSubDomainName() {
        return subDomainName;
    }

    /**
     * set 子域名
     *
     * @param subDomainName
     */
    public void setSubDomainName(String subDomainName) {
        this.subDomainName = subDomainName;
    }

    /**
     * get 故障IP/域名
     *
     * @return
     */
    public String getHost() {
        return host;
    }

    /**
     * set 故障IP/域名
     *
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * get null
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set null
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 故障开始时间，格式Unix timestamp，时间单位：毫秒
     *
     * @return
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * set 故障开始时间，格式Unix timestamp，时间单位：毫秒
     *
     * @param startTime
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * get 故障结束时间，格式Unix timestamp，时间单位：毫秒
     *
     * @return
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * set 故障结束时间，格式Unix timestamp，时间单位：毫秒
     *
     * @param endTime
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }


    /**
     * set 域名ID
     *
     * @param domainId
     */
    public MonitorAlarmInfo domainId(Integer domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * set 子域名
     *
     * @param subDomainName
     */
    public MonitorAlarmInfo subDomainName(String subDomainName) {
        this.subDomainName = subDomainName;
        return this;
    }

    /**
     * set 故障IP/域名
     *
     * @param host
     */
    public MonitorAlarmInfo host(String host) {
        this.host = host;
        return this;
    }

    /**
     * set null
     *
     * @param id
     */
    public MonitorAlarmInfo id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 故障开始时间，格式Unix timestamp，时间单位：毫秒
     *
     * @param startTime
     */
    public MonitorAlarmInfo startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 故障结束时间，格式Unix timestamp，时间单位：毫秒
     *
     * @param endTime
     */
    public MonitorAlarmInfo endTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }


}