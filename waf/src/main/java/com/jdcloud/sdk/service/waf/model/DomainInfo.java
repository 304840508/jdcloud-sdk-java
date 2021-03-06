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

package com.jdcloud.sdk.service.waf.model;

import java.util.List;
import java.util.ArrayList;

/**
 * domainInfo
 */
public class DomainInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例
     */
    private String wafInstanceId;

    /**
     * 域名
     */
    private String domain;

    /**
     * 回源ip列表
     */
    private List<String> rsAddr;

    /**
     * waf防护状态，rs-回源，vip-云端
     */
    private String dnsType;

    /**
     * 备用cname
     */
    private String backupCname;

    /**
     * 是否切清洗，0-否，1-是
     */
    private Integer enable2Dos;


    /**
     * get 实例
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set 实例
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }

    /**
     * get 域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get 回源ip列表
     *
     * @return
     */
    public List<String> getRsAddr() {
        return rsAddr;
    }

    /**
     * set 回源ip列表
     *
     * @param rsAddr
     */
    public void setRsAddr(List<String> rsAddr) {
        this.rsAddr = rsAddr;
    }

    /**
     * get waf防护状态，rs-回源，vip-云端
     *
     * @return
     */
    public String getDnsType() {
        return dnsType;
    }

    /**
     * set waf防护状态，rs-回源，vip-云端
     *
     * @param dnsType
     */
    public void setDnsType(String dnsType) {
        this.dnsType = dnsType;
    }

    /**
     * get 备用cname
     *
     * @return
     */
    public String getBackupCname() {
        return backupCname;
    }

    /**
     * set 备用cname
     *
     * @param backupCname
     */
    public void setBackupCname(String backupCname) {
        this.backupCname = backupCname;
    }

    /**
     * get 是否切清洗，0-否，1-是
     *
     * @return
     */
    public Integer getEnable2Dos() {
        return enable2Dos;
    }

    /**
     * set 是否切清洗，0-否，1-是
     *
     * @param enable2Dos
     */
    public void setEnable2Dos(Integer enable2Dos) {
        this.enable2Dos = enable2Dos;
    }


    /**
     * set 实例
     *
     * @param wafInstanceId
     */
    public DomainInfo wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public DomainInfo domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 回源ip列表
     *
     * @param rsAddr
     */
    public DomainInfo rsAddr(List<String> rsAddr) {
        this.rsAddr = rsAddr;
        return this;
    }

    /**
     * set waf防护状态，rs-回源，vip-云端
     *
     * @param dnsType
     */
    public DomainInfo dnsType(String dnsType) {
        this.dnsType = dnsType;
        return this;
    }

    /**
     * set 备用cname
     *
     * @param backupCname
     */
    public DomainInfo backupCname(String backupCname) {
        this.backupCname = backupCname;
        return this;
    }

    /**
     * set 是否切清洗，0-否，1-是
     *
     * @param enable2Dos
     */
    public DomainInfo enable2Dos(Integer enable2Dos) {
        this.enable2Dos = enable2Dos;
        return this;
    }


    /**
     * add item to 回源ip列表
     *
     * @param rsAddr
     */
    public void addRsAddr(String rsAddr) {
        if (this.rsAddr == null) {
            this.rsAddr = new ArrayList<>();
        }
        this.rsAddr.add(rsAddr);
    }

}