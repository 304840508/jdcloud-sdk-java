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

package com.jdcloud.sdk.service.pipeline.model;

import java.util.List;
import java.util.ArrayList;

/**
 * pipelineStage
 */
public class PipelineStage  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 阶段(stage)的UUID
     */
    private String uuid;

    /**
     * 阶段(stage)的名称
     */
    private String name;

    /**
     * 阶段(stage)创建时间
     */
    private Integer createdAt;

    /**
     * 阶段(stage)开始时间
     */
    private Integer startedAt;

    /**
     * 阶段(stage)结束时间
     */
    private Integer doneAt;

    /**
     * 阶段(stage)当前状态
     */
    private Integer status;

    /**
     * 阶段(stage)当前状态说明
     */
    private String statusHuman;

    /**
     * 第几个阶段(stage)
     */
    private Integer position;

    /**
     * actions
     */
    private List<PipelineAction> actions;


    /**
     * get 阶段(stage)的UUID
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set 阶段(stage)的UUID
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * get 阶段(stage)的名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 阶段(stage)的名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 阶段(stage)创建时间
     *
     * @return
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    /**
     * set 阶段(stage)创建时间
     *
     * @param createdAt
     */
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * get 阶段(stage)开始时间
     *
     * @return
     */
    public Integer getStartedAt() {
        return startedAt;
    }

    /**
     * set 阶段(stage)开始时间
     *
     * @param startedAt
     */
    public void setStartedAt(Integer startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * get 阶段(stage)结束时间
     *
     * @return
     */
    public Integer getDoneAt() {
        return doneAt;
    }

    /**
     * set 阶段(stage)结束时间
     *
     * @param doneAt
     */
    public void setDoneAt(Integer doneAt) {
        this.doneAt = doneAt;
    }

    /**
     * get 阶段(stage)当前状态
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 阶段(stage)当前状态
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 阶段(stage)当前状态说明
     *
     * @return
     */
    public String getStatusHuman() {
        return statusHuman;
    }

    /**
     * set 阶段(stage)当前状态说明
     *
     * @param statusHuman
     */
    public void setStatusHuman(String statusHuman) {
        this.statusHuman = statusHuman;
    }

    /**
     * get 第几个阶段(stage)
     *
     * @return
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * set 第几个阶段(stage)
     *
     * @param position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * get actions
     *
     * @return
     */
    public List<PipelineAction> getActions() {
        return actions;
    }

    /**
     * set actions
     *
     * @param actions
     */
    public void setActions(List<PipelineAction> actions) {
        this.actions = actions;
    }


    /**
     * set 阶段(stage)的UUID
     *
     * @param uuid
     */
    public PipelineStage uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * set 阶段(stage)的名称
     *
     * @param name
     */
    public PipelineStage name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 阶段(stage)创建时间
     *
     * @param createdAt
     */
    public PipelineStage createdAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * set 阶段(stage)开始时间
     *
     * @param startedAt
     */
    public PipelineStage startedAt(Integer startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * set 阶段(stage)结束时间
     *
     * @param doneAt
     */
    public PipelineStage doneAt(Integer doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    /**
     * set 阶段(stage)当前状态
     *
     * @param status
     */
    public PipelineStage status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 阶段(stage)当前状态说明
     *
     * @param statusHuman
     */
    public PipelineStage statusHuman(String statusHuman) {
        this.statusHuman = statusHuman;
        return this;
    }

    /**
     * set 第几个阶段(stage)
     *
     * @param position
     */
    public PipelineStage position(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * set actions
     *
     * @param actions
     */
    public PipelineStage actions(List<PipelineAction> actions) {
        this.actions = actions;
        return this;
    }


    /**
     * add item to actions
     *
     * @param action
     */
    public void addAction(PipelineAction action) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(action);
    }

}