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

package com.jdcloud.sdk.service.iotedge.model;


/**
 * delSubDevices
 */
public class DelSubDevices  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备三元组-producyKey
     */
    private String productKey;

    /**
     * 设备三元组-identifier
     */
    private String identifier;


    /**
     * get 设备名称
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get 设备三元组-producyKey
     *
     * @return
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * set 设备三元组-producyKey
     *
     * @param productKey
     */
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    /**
     * get 设备三元组-identifier
     *
     * @return
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * set 设备三元组-identifier
     *
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }


    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public DelSubDevices deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 设备三元组-producyKey
     *
     * @param productKey
     */
    public DelSubDevices productKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * set 设备三元组-identifier
     *
     * @param identifier
     */
    public DelSubDevices identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }


}