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

package com.jdcloud.sdk.service.cps.model;

import java.util.List;
import java.util.ArrayList;

/**
 * region
 */
public class Region  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域代码, 如 cn-east-1
     */
    private String region;

    /**
     * 地域名称，如 华东一区
     */
    private String regionName;

    /**
     * 可用区列表
     */
    private List<Az> azs;


    /**
     * get 地域代码, 如 cn-east-1
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域代码, 如 cn-east-1
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 地域名称，如 华东一区
     *
     * @return
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * set 地域名称，如 华东一区
     *
     * @param regionName
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * get 可用区列表
     *
     * @return
     */
    public List<Az> getAzs() {
        return azs;
    }

    /**
     * set 可用区列表
     *
     * @param azs
     */
    public void setAzs(List<Az> azs) {
        this.azs = azs;
    }


    /**
     * set 地域代码, 如 cn-east-1
     *
     * @param region
     */
    public Region region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 地域名称，如 华东一区
     *
     * @param regionName
     */
    public Region regionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * set 可用区列表
     *
     * @param azs
     */
    public Region azs(List<Az> azs) {
        this.azs = azs;
        return this;
    }


    /**
     * add item to 可用区列表
     *
     * @param az
     */
    public void addAz(Az az) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(az);
    }

}