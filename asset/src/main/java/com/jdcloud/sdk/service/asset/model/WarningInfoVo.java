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

package com.jdcloud.sdk.service.asset.model;


/**
 * warningInfoVo
 */
public class WarningInfoVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 余额预警状态：1-开启；2-关闭
     */
    private String status;

    /**
     * 余额预警阈值
     */
    private String threshold;


    /**
     * get 余额预警状态：1-开启；2-关闭
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 余额预警状态：1-开启；2-关闭
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 余额预警阈值
     *
     * @return
     */
    public String getThreshold() {
        return threshold;
    }

    /**
     * set 余额预警阈值
     *
     * @param threshold
     */
    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }


    /**
     * set 余额预警状态：1-开启；2-关闭
     *
     * @param status
     */
    public WarningInfoVo status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 余额预警阈值
     *
     * @param threshold
     */
    public WarningInfoVo threshold(String threshold) {
        this.threshold = threshold;
        return this;
    }


}