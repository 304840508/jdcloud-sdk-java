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
 * 作业管理
 * JMR作业管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jmr.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 暂停定时任务
 */
public class PauseCronJobResult extends JdcloudResult implements java.io.Serializable {

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
     * set status
     *
     * @param status
     */
    public PauseCronJobResult status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set message
     *
     * @param message
     */
    public PauseCronJobResult message(String message) {
        this.message = message;
        return this;
    }


}