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
 * SSL Certificate
 * SSL数字证书相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看证书详情
 */
public class GetSslCertDetailResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 证书Id
     */
    private String certId;

    /**
     * 证书名称
     */
    private String certName;

    /**
     * 绑定域名
     */
    private String commonName;

    /**
     * 证书类型
     */
    private String certType;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 是否允许被删除,1允许,0不允许
     */
    private Integer deletable;

    /**
     * 对私钥文件使用sha256算法计算的摘要信息
     */
    private String digest;

    /**
     * 证书别名
     */
    private String aliasName;

    /**
     * 域名
     */
    private List<String> dnsNames;

    /**
     * 是否允许被下载,0-&gt;不允许,1-&gt;允许
     */
    private Integer downloadable;


    /**
     * get 证书Id
     *
     * @return
     */
    public String getCertId() {
        return certId;
    }

    /**
     * set 证书Id
     *
     * @param certId
     */
    public void setCertId(String certId) {
        this.certId = certId;
    }

    /**
     * get 证书名称
     *
     * @return
     */
    public String getCertName() {
        return certName;
    }

    /**
     * set 证书名称
     *
     * @param certName
     */
    public void setCertName(String certName) {
        this.certName = certName;
    }

    /**
     * get 绑定域名
     *
     * @return
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * set 绑定域名
     *
     * @param commonName
     */
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    /**
     * get 证书类型
     *
     * @return
     */
    public String getCertType() {
        return certType;
    }

    /**
     * set 证书类型
     *
     * @param certType
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }

    /**
     * get 开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 是否允许被删除,1允许,0不允许
     *
     * @return
     */
    public Integer getDeletable() {
        return deletable;
    }

    /**
     * set 是否允许被删除,1允许,0不允许
     *
     * @param deletable
     */
    public void setDeletable(Integer deletable) {
        this.deletable = deletable;
    }

    /**
     * get 对私钥文件使用sha256算法计算的摘要信息
     *
     * @return
     */
    public String getDigest() {
        return digest;
    }

    /**
     * set 对私钥文件使用sha256算法计算的摘要信息
     *
     * @param digest
     */
    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * get 证书别名
     *
     * @return
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * set 证书别名
     *
     * @param aliasName
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * get 域名
     *
     * @return
     */
    public List<String> getDnsNames() {
        return dnsNames;
    }

    /**
     * set 域名
     *
     * @param dnsNames
     */
    public void setDnsNames(List<String> dnsNames) {
        this.dnsNames = dnsNames;
    }

    /**
     * get 是否允许被下载,0-&gt;不允许,1-&gt;允许
     *
     * @return
     */
    public Integer getDownloadable() {
        return downloadable;
    }

    /**
     * set 是否允许被下载,0-&gt;不允许,1-&gt;允许
     *
     * @param downloadable
     */
    public void setDownloadable(Integer downloadable) {
        this.downloadable = downloadable;
    }


    /**
     * set 证书Id
     *
     * @param certId
     */
    public GetSslCertDetailResult certId(String certId) {
        this.certId = certId;
        return this;
    }

    /**
     * set 证书名称
     *
     * @param certName
     */
    public GetSslCertDetailResult certName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * set 绑定域名
     *
     * @param commonName
     */
    public GetSslCertDetailResult commonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * set 证书类型
     *
     * @param certType
     */
    public GetSslCertDetailResult certType(String certType) {
        this.certType = certType;
        return this;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public GetSslCertDetailResult startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public GetSslCertDetailResult endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 是否允许被删除,1允许,0不允许
     *
     * @param deletable
     */
    public GetSslCertDetailResult deletable(Integer deletable) {
        this.deletable = deletable;
        return this;
    }

    /**
     * set 对私钥文件使用sha256算法计算的摘要信息
     *
     * @param digest
     */
    public GetSslCertDetailResult digest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * set 证书别名
     *
     * @param aliasName
     */
    public GetSslCertDetailResult aliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * set 域名
     *
     * @param dnsNames
     */
    public GetSslCertDetailResult dnsNames(List<String> dnsNames) {
        this.dnsNames = dnsNames;
        return this;
    }

    /**
     * set 是否允许被下载,0-&gt;不允许,1-&gt;允许
     *
     * @param downloadable
     */
    public GetSslCertDetailResult downloadable(Integer downloadable) {
        this.downloadable = downloadable;
        return this;
    }


    /**
     * add item to 域名
     *
     * @param dnsName
     */
    public void addDnsName(String dnsName) {
        if (this.dnsNames == null) {
            this.dnsNames = new ArrayList<>();
        }
        this.dnsNames.add(dnsName);
    }

}