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

package com.jdcloud.sdk.service.streamcomputer.model;

import java.util.List;
import java.util.ArrayList;

/**
 * storage
 */
public class Storage  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * uid
     */
    private String uid;

    /**
     * type
     */
    private String type;

    /**
     * 这个参数有input和ouput两个可选值，取决于创建输入还是输出
     */
    private String storageType;

    /**
     * userName
     */
    private String userName;

    /**
     * createTime
     */
    private String createTime;

    /**
     * updateTime
     */
    private String updateTime;

    /**
     * namespaceId
     */
    private String namespaceId;

    /**
     * deleted
     */
    private String deleted;

    /**
     * Storage的具体参数。&lt;br&gt;1、创建源类型为流式数据输入时，则需要传输source，topicName，duration，format，delimiter，schema 。&lt;br&gt; 2、创建输出如果输出位置为流数据总线，需要传topicName，format，delimiter，ossFlag，bucketName，directory，objectName。&lt;br&gt;3、创建输出如果输出位置为数据计算服务，则需要传输database，table，ossFlag，bucketName，directory，objectName。
     */
    private List<StorageParameter> storageParameterList;


    /**
     * get id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get uid
     *
     * @return
     */
    public String getUid() {
        return uid;
    }

    /**
     * set uid
     *
     * @param uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * get type
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set type
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get 这个参数有input和ouput两个可选值，取决于创建输入还是输出
     *
     * @return
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * set 这个参数有input和ouput两个可选值，取决于创建输入还是输出
     *
     * @param storageType
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * get userName
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set userName
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * get createTime
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get namespaceId
     *
     * @return
     */
    public String getNamespaceId() {
        return namespaceId;
    }

    /**
     * set namespaceId
     *
     * @param namespaceId
     */
    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * get deleted
     *
     * @return
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * set deleted
     *
     * @param deleted
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    /**
     * get Storage的具体参数。&lt;br&gt;1、创建源类型为流式数据输入时，则需要传输source，topicName，duration，format，delimiter，schema 。&lt;br&gt; 2、创建输出如果输出位置为流数据总线，需要传topicName，format，delimiter，ossFlag，bucketName，directory，objectName。&lt;br&gt;3、创建输出如果输出位置为数据计算服务，则需要传输database，table，ossFlag，bucketName，directory，objectName。
     *
     * @return
     */
    public List<StorageParameter> getStorageParameterList() {
        return storageParameterList;
    }

    /**
     * set Storage的具体参数。&lt;br&gt;1、创建源类型为流式数据输入时，则需要传输source，topicName，duration，format，delimiter，schema 。&lt;br&gt; 2、创建输出如果输出位置为流数据总线，需要传topicName，format，delimiter，ossFlag，bucketName，directory，objectName。&lt;br&gt;3、创建输出如果输出位置为数据计算服务，则需要传输database，table，ossFlag，bucketName，directory，objectName。
     *
     * @param storageParameterList
     */
    public void setStorageParameterList(List<StorageParameter> storageParameterList) {
        this.storageParameterList = storageParameterList;
    }


    /**
     * set id
     *
     * @param id
     */
    public Storage id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set name
     *
     * @param name
     */
    public Storage name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set uid
     *
     * @param uid
     */
    public Storage uid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * set type
     *
     * @param type
     */
    public Storage type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set 这个参数有input和ouput两个可选值，取决于创建输入还是输出
     *
     * @param storageType
     */
    public Storage storageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * set userName
     *
     * @param userName
     */
    public Storage userName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public Storage createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public Storage updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set namespaceId
     *
     * @param namespaceId
     */
    public Storage namespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * set deleted
     *
     * @param deleted
     */
    public Storage deleted(String deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * set Storage的具体参数。&lt;br&gt;1、创建源类型为流式数据输入时，则需要传输source，topicName，duration，format，delimiter，schema 。&lt;br&gt; 2、创建输出如果输出位置为流数据总线，需要传topicName，format，delimiter，ossFlag，bucketName，directory，objectName。&lt;br&gt;3、创建输出如果输出位置为数据计算服务，则需要传输database，table，ossFlag，bucketName，directory，objectName。
     *
     * @param storageParameterList
     */
    public Storage storageParameterList(List<StorageParameter> storageParameterList) {
        this.storageParameterList = storageParameterList;
        return this;
    }


    /**
     * add item to Storage的具体参数。&lt;br&gt;1、创建源类型为流式数据输入时，则需要传输source，topicName，duration，format，delimiter，schema 。&lt;br&gt; 2、创建输出如果输出位置为流数据总线，需要传topicName，format，delimiter，ossFlag，bucketName，directory，objectName。&lt;br&gt;3、创建输出如果输出位置为数据计算服务，则需要传输database，table，ossFlag，bucketName，directory，objectName。
     *
     * @param storageParameterList
     */
    public void addStorageParameterList(StorageParameter storageParameterList) {
        if (this.storageParameterList == null) {
            this.storageParameterList = new ArrayList<>();
        }
        this.storageParameterList.add(storageParameterList);
    }

}