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
 * Domain-Protection
 * Domain-Protection API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.service.waf.model.IpListCfg;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取网站黑白名单ip配置
 */
public class ListIpsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例id
     */
    private String wafInstanceId;

    /**
     * 域名
     */
    private String domain;

    /**
     * 0表示黑名单 1表示白名单
     */
    private String iswhite;

    /**
     * 页码，[1-100]
     */
    private Integer pageIndex;

    /**
     * 页大小，[1-100]
     */
    private Integer pageSize;

    /**
     * 总数
     */
    private Integer count;

    /**
     * 网站过滤器status配置
     */
    private IpListCfg data;


    /**
     * get 实例id
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set 实例id
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
     * get 0表示黑名单 1表示白名单
     *
     * @return
     */
    public String getIswhite() {
        return iswhite;
    }

    /**
     * set 0表示黑名单 1表示白名单
     *
     * @param iswhite
     */
    public void setIswhite(String iswhite) {
        this.iswhite = iswhite;
    }

    /**
     * get 页码，[1-100]
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 页码，[1-100]
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * get 页大小，[1-100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页大小，[1-100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 总数
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set 总数
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * get 网站过滤器status配置
     *
     * @return
     */
    public IpListCfg getData() {
        return data;
    }

    /**
     * set 网站过滤器status配置
     *
     * @param data
     */
    public void setData(IpListCfg data) {
        this.data = data;
    }


    /**
     * set 实例id
     *
     * @param wafInstanceId
     */
    public ListIpsResult wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public ListIpsResult domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 0表示黑名单 1表示白名单
     *
     * @param iswhite
     */
    public ListIpsResult iswhite(String iswhite) {
        this.iswhite = iswhite;
        return this;
    }

    /**
     * set 页码，[1-100]
     *
     * @param pageIndex
     */
    public ListIpsResult pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set 页大小，[1-100]
     *
     * @param pageSize
     */
    public ListIpsResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 总数
     *
     * @param count
     */
    public ListIpsResult count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * set 网站过滤器status配置
     *
     * @param data
     */
    public ListIpsResult data(IpListCfg data) {
        this.data = data;
        return this;
    }


}