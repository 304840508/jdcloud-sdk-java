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

package com.jdcloud.sdk.service.live.model;


/**
 * domainTemplateConfig
 */
public class DomainTemplateConfig  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 流名称
     */
    private String streamName;

    /**
     * 模板ID
     */
    private Long templateId;

    /**
     * 模板名称
     */
    private String templateName;

    /**
     * 录制周期
     */
    private Integer recordPeriod;

    /**
     * 录制格式
     */
    private Integer recordFileType;

    /**
     * 创建时间
     */
    private String createTime;


    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
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
     * get 模板ID
     *
     * @return
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * set 模板ID
     *
     * @param templateId
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    /**
     * get 模板名称
     *
     * @return
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * set 模板名称
     *
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * get 录制周期
     *
     * @return
     */
    public Integer getRecordPeriod() {
        return recordPeriod;
    }

    /**
     * set 录制周期
     *
     * @param recordPeriod
     */
    public void setRecordPeriod(Integer recordPeriod) {
        this.recordPeriod = recordPeriod;
    }

    /**
     * get 录制格式
     *
     * @return
     */
    public Integer getRecordFileType() {
        return recordFileType;
    }

    /**
     * set 录制格式
     *
     * @param recordFileType
     */
    public void setRecordFileType(Integer recordFileType) {
        this.recordFileType = recordFileType;
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
     * set 应用名称
     *
     * @param appName
     */
    public DomainTemplateConfig appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 流名称
     *
     * @param streamName
     */
    public DomainTemplateConfig streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * set 模板ID
     *
     * @param templateId
     */
    public DomainTemplateConfig templateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * set 模板名称
     *
     * @param templateName
     */
    public DomainTemplateConfig templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * set 录制周期
     *
     * @param recordPeriod
     */
    public DomainTemplateConfig recordPeriod(Integer recordPeriod) {
        this.recordPeriod = recordPeriod;
        return this;
    }

    /**
     * set 录制格式
     *
     * @param recordFileType
     */
    public DomainTemplateConfig recordFileType(Integer recordFileType) {
        this.recordFileType = recordFileType;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public DomainTemplateConfig createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}