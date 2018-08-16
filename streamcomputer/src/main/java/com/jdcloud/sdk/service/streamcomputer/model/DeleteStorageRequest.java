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
 * storage相关 API
 * 流计算storage相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.streamcomputer.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除指定输入
 */
public class DeleteStorageRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * storageId
     * Required:true
     */
    @Required
    private Integer storageId;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get storageId
     *
     * @return
     */
    public Integer getStorageId() {
        return storageId;
    }

    /**
     * set storageId
     *
     * @param storageId
     */
    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set storageId
     *
     * @param storageId
     */
    public DeleteStorageRequest storageId(Integer storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public DeleteStorageRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}