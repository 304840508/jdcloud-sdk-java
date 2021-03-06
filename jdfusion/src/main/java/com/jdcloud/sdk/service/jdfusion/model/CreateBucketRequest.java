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
 * Oss-Bucket
 * 与OSS存储桶相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.jdfusion.model.CreateOSSBucket;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据给定的信息，创建OSS存储桶
 */
public class CreateBucketRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建OSS存储桶
     * Required:true
     */
    @Required
    private CreateOSSBucket bucket;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 创建OSS存储桶
     *
     * @return
     */
    public CreateOSSBucket getBucket() {
        return bucket;
    }

    /**
     * set 创建OSS存储桶
     *
     * @param bucket
     */
    public void setBucket(CreateOSSBucket bucket) {
        this.bucket = bucket;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 创建OSS存储桶
     *
     * @param bucket
     */
    public CreateBucketRequest bucket(CreateOSSBucket bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateBucketRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}