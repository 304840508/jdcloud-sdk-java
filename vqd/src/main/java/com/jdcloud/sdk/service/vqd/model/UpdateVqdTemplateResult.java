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
 * Vqd Template
 * 视频质检模板管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vqd.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 修改视频质检模板
 */
public class UpdateVqdTemplateResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板ID
     */
    private String templateId;

    /**
     * 模板名称。长度不超过128个字符。UTF-8编码。

     */
    private String templateName;

    /**
     * 缺陷判定时间阈值
     */
    private Double threshold;

    /**
     * 检测项列表
     */
    private List<String> detections;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;


    /**
     * get 模板ID
     *
     * @return
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * set 模板ID
     *
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * get 模板名称。长度不超过128个字符。UTF-8编码。

     *
     * @return
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * set 模板名称。长度不超过128个字符。UTF-8编码。

     *
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * get 缺陷判定时间阈值
     *
     * @return
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * set 缺陷判定时间阈值
     *
     * @param threshold
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * get 检测项列表
     *
     * @return
     */
    public List<String> getDetections() {
        return detections;
    }

    /**
     * set 检测项列表
     *
     * @param detections
     */
    public void setDetections(List<String> detections) {
        this.detections = detections;
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
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 模板ID
     *
     * @param templateId
     */
    public UpdateVqdTemplateResult templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * set 模板名称。长度不超过128个字符。UTF-8编码。

     *
     * @param templateName
     */
    public UpdateVqdTemplateResult templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * set 缺陷判定时间阈值
     *
     * @param threshold
     */
    public UpdateVqdTemplateResult threshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * set 检测项列表
     *
     * @param detections
     */
    public UpdateVqdTemplateResult detections(List<String> detections) {
        this.detections = detections;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public UpdateVqdTemplateResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public UpdateVqdTemplateResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * add item to 检测项列表
     *
     * @param detection
     */
    public void addDetection(String detection) {
        if (this.detections == null) {
            this.detections = new ArrayList<>();
        }
        this.detections.add(detection);
    }

}