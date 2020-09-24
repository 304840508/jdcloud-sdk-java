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

package com.jdcloud.sdk.service.bri.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * getPriceReq
 */
public class GetPriceReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域信息
     * Required:true
     */
    @Required
    private String region;

    /**
     * 购买类型, 1:创建 2:续费 3:升配
     * Required:true
     */
    @Required
    private Integer buyType;

    /**
     * 购买时长
     * Required:true
     */
    @Required
    private Integer timeSpan;

    /**
     * 时间单位，month, year
     * Required:true
     */
    @Required
    private String timeUnit;

    /**
     * 套餐类型 1.phone 2.IP 3.addr 4.eid 5.signup 6.login 7.marketing 8.pin 9.card
     * Required:true
     */
    @Required
    private Integer packageType;


    /**
     * get 地域信息
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域信息
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 购买类型, 1:创建 2:续费 3:升配
     *
     * @return
     */
    public Integer getBuyType() {
        return buyType;
    }

    /**
     * set 购买类型, 1:创建 2:续费 3:升配
     *
     * @param buyType
     */
    public void setBuyType(Integer buyType) {
        this.buyType = buyType;
    }

    /**
     * get 购买时长
     *
     * @return
     */
    public Integer getTimeSpan() {
        return timeSpan;
    }

    /**
     * set 购买时长
     *
     * @param timeSpan
     */
    public void setTimeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
    }

    /**
     * get 时间单位，month, year
     *
     * @return
     */
    public String getTimeUnit() {
        return timeUnit;
    }

    /**
     * set 时间单位，month, year
     *
     * @param timeUnit
     */
    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * get 套餐类型 1.phone 2.IP 3.addr 4.eid 5.signup 6.login 7.marketing 8.pin 9.card
     *
     * @return
     */
    public Integer getPackageType() {
        return packageType;
    }

    /**
     * set 套餐类型 1.phone 2.IP 3.addr 4.eid 5.signup 6.login 7.marketing 8.pin 9.card
     *
     * @param packageType
     */
    public void setPackageType(Integer packageType) {
        this.packageType = packageType;
    }


    /**
     * set 地域信息
     *
     * @param region
     */
    public GetPriceReq region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 购买类型, 1:创建 2:续费 3:升配
     *
     * @param buyType
     */
    public GetPriceReq buyType(Integer buyType) {
        this.buyType = buyType;
        return this;
    }

    /**
     * set 购买时长
     *
     * @param timeSpan
     */
    public GetPriceReq timeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }

    /**
     * set 时间单位，month, year
     *
     * @param timeUnit
     */
    public GetPriceReq timeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * set 套餐类型 1.phone 2.IP 3.addr 4.eid 5.signup 6.login 7.marketing 8.pin 9.card
     *
     * @param packageType
     */
    public GetPriceReq packageType(Integer packageType) {
        this.packageType = packageType;
        return this;
    }


}