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
 * Snapshot
 * 视频截图任务相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 截图输出结果
 */
public class ShotResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 截图输出区域
     */
    private String region;

    /**
     * 截图输出空间
     */
    private String bucket;

    /**
     * 截图输出对象集
     */
    private List<String> objectKeys;


    /**
     * get 截图输出区域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 截图输出区域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 截图输出空间
     *
     * @return
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * set 截图输出空间
     *
     * @param bucket
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * get 截图输出对象集
     *
     * @return
     */
    public List<String> getObjectKeys() {
        return objectKeys;
    }

    /**
     * set 截图输出对象集
     *
     * @param objectKeys
     */
    public void setObjectKeys(List<String> objectKeys) {
        this.objectKeys = objectKeys;
    }


    /**
     * set 截图输出区域
     *
     * @param region
     */
    public ShotResult region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 截图输出空间
     *
     * @param bucket
     */
    public ShotResult bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * set 截图输出对象集
     *
     * @param objectKeys
     */
    public ShotResult objectKeys(List<String> objectKeys) {
        this.objectKeys = objectKeys;
        return this;
    }


    /**
     * add item to 截图输出对象集
     *
     * @param objectKey
     */
    public void addObjectKey(String objectKey) {
        if (this.objectKeys == null) {
            this.objectKeys = new ArrayList<>();
        }
        this.objectKeys.add(objectKey);
    }

}