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

package com.jdcloud.sdk.service.resourcetag.model;

import java.util.List;
import java.util.ArrayList;

/**
 * tagValuesResVo
 */
public class TagValuesResVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 地域名称
     */
    private String region;

    /**
     * 标签值数组
     */
    private List<String> tagValues;


    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 地域名称
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域名称
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 标签值数组
     *
     * @return
     */
    public List<String> getTagValues() {
        return tagValues;
    }

    /**
     * set 标签值数组
     *
     * @param tagValues
     */
    public void setTagValues(List<String> tagValues) {
        this.tagValues = tagValues;
    }


    /**
     * set 用户pin
     *
     * @param pin
     */
    public TagValuesResVo pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 地域名称
     *
     * @param region
     */
    public TagValuesResVo region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 标签值数组
     *
     * @param tagValues
     */
    public TagValuesResVo tagValues(List<String> tagValues) {
        this.tagValues = tagValues;
        return this;
    }


    /**
     * add item to 标签值数组
     *
     * @param tagValue
     */
    public void addTagValue(String tagValue) {
        if (this.tagValues == null) {
            this.tagValues = new ArrayList<>();
        }
        this.tagValues.add(tagValue);
    }

}