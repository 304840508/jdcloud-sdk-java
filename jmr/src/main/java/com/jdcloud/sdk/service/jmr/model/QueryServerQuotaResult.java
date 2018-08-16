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
 * 集群管理
 * JMR集群管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jmr.model;

import com.jdcloud.sdk.service.jmr.model.AvailableNumData;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询server的剩余配额
 */
public class QueryServerQuotaResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * status
     */
    private String status;

    /**
     * message
     */
    private String message;

    /**
     * data
     */
    private AvailableNumData data;


    /**
     * get status
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set status
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get message
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set message
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * get data
     *
     * @return
     */
    public AvailableNumData getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(AvailableNumData data) {
        this.data = data;
    }


    /**
     * set status
     *
     * @param status
     */
    public QueryServerQuotaResult status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set message
     *
     * @param message
     */
    public QueryServerQuotaResult message(String message) {
        this.message = message;
        return this;
    }

    /**
     * set data
     *
     * @param data
     */
    public QueryServerQuotaResult data(AvailableNumData data) {
        this.data = data;
        return this;
    }


}