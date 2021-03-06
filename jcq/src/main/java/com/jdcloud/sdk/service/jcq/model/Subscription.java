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

package com.jdcloud.sdk.service.jcq.model;

import java.util.List;
import java.util.ArrayList;

/**
 * subscription
 */
public class Subscription  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * consumerGroupId
     */
    private String consumerGroupId;

    /**
     * endPoint
     */
    private String endPoint;

    /**
     * messageInvisibleTimeInSeconds
     */
    private Integer messageInvisibleTimeInSeconds;

    /**
     * subscriptionType
     */
    private String subscriptionType;

    /**
     * tags
     */
    private List<String> tags;

    /**
     * 是否开启死信队列
     */
    private Boolean dlqEnable;

    /**
     * 最大重试次数
     */
    private Integer maxRetryTimes;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 最后更新时间
     */
    private String lastUpdateTime;

    /**
     * 在线consumer个数
     */
    private Integer consumerNumbers;


    /**
     * get consumerGroupId
     *
     * @return
     */
    public String getConsumerGroupId() {
        return consumerGroupId;
    }

    /**
     * set consumerGroupId
     *
     * @param consumerGroupId
     */
    public void setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
    }

    /**
     * get endPoint
     *
     * @return
     */
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * set endPoint
     *
     * @param endPoint
     */
    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    /**
     * get messageInvisibleTimeInSeconds
     *
     * @return
     */
    public Integer getMessageInvisibleTimeInSeconds() {
        return messageInvisibleTimeInSeconds;
    }

    /**
     * set messageInvisibleTimeInSeconds
     *
     * @param messageInvisibleTimeInSeconds
     */
    public void setMessageInvisibleTimeInSeconds(Integer messageInvisibleTimeInSeconds) {
        this.messageInvisibleTimeInSeconds = messageInvisibleTimeInSeconds;
    }

    /**
     * get subscriptionType
     *
     * @return
     */
    public String getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * set subscriptionType
     *
     * @param subscriptionType
     */
    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    /**
     * get tags
     *
     * @return
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * set tags
     *
     * @param tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * get 是否开启死信队列
     *
     * @return
     */
    public Boolean getDlqEnable() {
        return dlqEnable;
    }

    /**
     * set 是否开启死信队列
     *
     * @param dlqEnable
     */
    public void setDlqEnable(Boolean dlqEnable) {
        this.dlqEnable = dlqEnable;
    }

    /**
     * get 最大重试次数
     *
     * @return
     */
    public Integer getMaxRetryTimes() {
        return maxRetryTimes;
    }

    /**
     * set 最大重试次数
     *
     * @param maxRetryTimes
     */
    public void setMaxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 最后更新时间
     *
     * @return
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * set 最后更新时间
     *
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * get 在线consumer个数
     *
     * @return
     */
    public Integer getConsumerNumbers() {
        return consumerNumbers;
    }

    /**
     * set 在线consumer个数
     *
     * @param consumerNumbers
     */
    public void setConsumerNumbers(Integer consumerNumbers) {
        this.consumerNumbers = consumerNumbers;
    }


    /**
     * set consumerGroupId
     *
     * @param consumerGroupId
     */
    public Subscription consumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }

    /**
     * set endPoint
     *
     * @param endPoint
     */
    public Subscription endPoint(String endPoint) {
        this.endPoint = endPoint;
        return this;
    }

    /**
     * set messageInvisibleTimeInSeconds
     *
     * @param messageInvisibleTimeInSeconds
     */
    public Subscription messageInvisibleTimeInSeconds(Integer messageInvisibleTimeInSeconds) {
        this.messageInvisibleTimeInSeconds = messageInvisibleTimeInSeconds;
        return this;
    }

    /**
     * set subscriptionType
     *
     * @param subscriptionType
     */
    public Subscription subscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * set tags
     *
     * @param tags
     */
    public Subscription tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 是否开启死信队列
     *
     * @param dlqEnable
     */
    public Subscription dlqEnable(Boolean dlqEnable) {
        this.dlqEnable = dlqEnable;
        return this;
    }

    /**
     * set 最大重试次数
     *
     * @param maxRetryTimes
     */
    public Subscription maxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public Subscription createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 最后更新时间
     *
     * @param lastUpdateTime
     */
    public Subscription lastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * set 在线consumer个数
     *
     * @param consumerNumbers
     */
    public Subscription consumerNumbers(Integer consumerNumbers) {
        this.consumerNumbers = consumerNumbers;
        return this;
    }


    /**
     * add item to tags
     *
     * @param tag
     */
    public void addTag(String tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}