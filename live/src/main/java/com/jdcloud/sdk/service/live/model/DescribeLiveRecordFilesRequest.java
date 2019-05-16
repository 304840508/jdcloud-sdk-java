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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询录制文件列表

 */
public class DescribeLiveRecordFilesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当面页数

     * Required:true
     */
    @Required
    private Integer pageNum;

    /**
     * 每页记录数

     * Required:true
     */
    @Required
    private Integer pageSize;

    /**
     * 下载地址有效期，单位：秒，默认：3600

     */
    private Integer authExpire;

    /**
     * 推流域名

     * Required:true
     */
    @Required
    private String publishDomain;

    /**
     * 推流AppName

     * Required:true
     */
    @Required
    private String appName;

    /**
     * 流名称

     * Required:true
     */
    @Required
    private String streamName;

    /**
     * 查询起始时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 查询截至时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     * Required:true
     */
    @Required
    private String endTime;


    /**
     * get 当面页数

     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set 当面页数

     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * get 每页记录数

     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页记录数

     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 下载地址有效期，单位：秒，默认：3600

     *
     * @return
     */
    public Integer getAuthExpire() {
        return authExpire;
    }

    /**
     * set 下载地址有效期，单位：秒，默认：3600

     *
     * @param authExpire
     */
    public void setAuthExpire(Integer authExpire) {
        this.authExpire = authExpire;
    }

    /**
     * get 推流域名

     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 推流域名

     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get 推流AppName

     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 推流AppName

     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 流名称

     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 流名称

     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * get 查询起始时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询起始时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询截至时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询截至时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * set 当面页数

     *
     * @param pageNum
     */
    public DescribeLiveRecordFilesRequest pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * set 每页记录数

     *
     * @param pageSize
     */
    public DescribeLiveRecordFilesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 下载地址有效期，单位：秒，默认：3600

     *
     * @param authExpire
     */
    public DescribeLiveRecordFilesRequest authExpire(Integer authExpire) {
        this.authExpire = authExpire;
        return this;
    }

    /**
     * set 推流域名

     *
     * @param publishDomain
     */
    public DescribeLiveRecordFilesRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 推流AppName

     *
     * @param appName
     */
    public DescribeLiveRecordFilesRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 流名称

     *
     * @param streamName
     */
    public DescribeLiveRecordFilesRequest streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * set 查询起始时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @param startTime
     */
    public DescribeLiveRecordFilesRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询截至时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @param endTime
     */
    public DescribeLiveRecordFilesRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


}