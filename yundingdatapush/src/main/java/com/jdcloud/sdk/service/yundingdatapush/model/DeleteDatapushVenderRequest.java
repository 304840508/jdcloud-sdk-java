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
 * yunding-datapush
 * 云鼎数据推送OPENAPI接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yundingdatapush.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除数据推送用户
 */
public class DeleteDatapushVenderRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appkey
     * Required:true
     */
    @Required
    private String appkey;

    /**
     * 云鼎数据库实例ID
     * Required:true
     */
    @Required
    private String ydRdsInstanceId;

    /**
     * 商家ID
     * Required:true
     */
    @Required
    private String venderId;


    /**
     * get appkey
     *
     * @return
     */
    public String getAppkey() {
        return appkey;
    }

    /**
     * set appkey
     *
     * @param appkey
     */
    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    /**
     * get 云鼎数据库实例ID
     *
     * @return
     */
    public String getYdRdsInstanceId() {
        return ydRdsInstanceId;
    }

    /**
     * set 云鼎数据库实例ID
     *
     * @param ydRdsInstanceId
     */
    public void setYdRdsInstanceId(String ydRdsInstanceId) {
        this.ydRdsInstanceId = ydRdsInstanceId;
    }

    /**
     * get 商家ID
     *
     * @return
     */
    public String getVenderId() {
        return venderId;
    }

    /**
     * set 商家ID
     *
     * @param venderId
     */
    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }


    /**
     * set appkey
     *
     * @param appkey
     */
    public DeleteDatapushVenderRequest appkey(String appkey) {
        this.appkey = appkey;
        return this;
    }

    /**
     * set 云鼎数据库实例ID
     *
     * @param ydRdsInstanceId
     */
    public DeleteDatapushVenderRequest ydRdsInstanceId(String ydRdsInstanceId) {
        this.ydRdsInstanceId = ydRdsInstanceId;
        return this;
    }

    /**
     * set 商家ID
     *
     * @param venderId
     */
    public DeleteDatapushVenderRequest venderId(String venderId) {
        this.venderId = venderId;
        return this;
    }


}