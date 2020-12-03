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


/**
 * geoListCfg
 */
public class GeoListCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号id
     */
    private Integer id;

    /**
     * 规则更新时间，秒级时间戳, 0 表示历史数据无记录
     */
    private String updateTime;

    /**
     * 0-使用中 1-禁用
     */
    private Integer disable;

    /**
     * geo名称 黑名单支持海外和大陆某个省份或直辖市 白名单支持配置大陆省份/城市
     */
    private String geo;

    /**
     * action配置
     */
    private AtCfg atCfg;


    /**
     * get 序号id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 序号id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 规则更新时间，秒级时间戳, 0 表示历史数据无记录
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 规则更新时间，秒级时间戳, 0 表示历史数据无记录
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 0-使用中 1-禁用
     *
     * @return
     */
    public Integer getDisable() {
        return disable;
    }

    /**
     * set 0-使用中 1-禁用
     *
     * @param disable
     */
    public void setDisable(Integer disable) {
        this.disable = disable;
    }

    /**
     * get geo名称 黑名单支持海外和大陆某个省份或直辖市 白名单支持配置大陆省份/城市
     *
     * @return
     */
    public String getGeo() {
        return geo;
    }

    /**
     * set geo名称 黑名单支持海外和大陆某个省份或直辖市 白名单支持配置大陆省份/城市
     *
     * @param geo
     */
    public void setGeo(String geo) {
        this.geo = geo;
    }

    /**
     * get action配置
     *
     * @return
     */
    public AtCfg getAtCfg() {
        return atCfg;
    }

    /**
     * set action配置
     *
     * @param atCfg
     */
    public void setAtCfg(AtCfg atCfg) {
        this.atCfg = atCfg;
    }


    /**
     * set 序号id
     *
     * @param id
     */
    public GeoListCfg id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 规则更新时间，秒级时间戳, 0 表示历史数据无记录
     *
     * @param updateTime
     */
    public GeoListCfg updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 0-使用中 1-禁用
     *
     * @param disable
     */
    public GeoListCfg disable(Integer disable) {
        this.disable = disable;
        return this;
    }

    /**
     * set geo名称 黑名单支持海外和大陆某个省份或直辖市 白名单支持配置大陆省份/城市
     *
     * @param geo
     */
    public GeoListCfg geo(String geo) {
        this.geo = geo;
        return this;
    }

    /**
     * set action配置
     *
     * @param atCfg
     */
    public GeoListCfg atCfg(AtCfg atCfg) {
        this.atCfg = atCfg;
        return this;
    }


}