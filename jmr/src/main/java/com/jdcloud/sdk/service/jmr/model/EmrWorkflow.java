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

package com.jdcloud.sdk.service.jmr.model;


/**
 * emrWorkflow
 */
public class EmrWorkflow  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Number id;

    /**
     * 工作流ID
     */
    private String workflowId;

    /**
     * 工作流名称
     */
    private String workflowName;

    /**
     * 工作流状态
     */
    private String status;

    /**
     * 用户名
     */
    private String userpin;

    /**
     * 工作流创建时间
     */
    private String createTime;

    /**
     * 数据中心，即regionId
     */
    private String dataCenter;

    /**
     * 上一次修改时间
     */
    private String modifyTime;

    /**
     * &quot;是否自身依赖&quot;
&quot;1：自身依赖(默认)，0：非依赖&quot;

     */
    private Boolean isSelfDependence;

    /**
     * &quot;0:即时任务(默认)&quot;
&quot;1：周期性任务&quot;
&quot;2：定时任务&quot;

     */
    private Integer taskScheduleType;

    /**
     * 失败后是否发送通知
     */
    private Boolean isSendMsg;


    /**
     * get id
     *
     * @return
     */
    public Number getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Number id) {
        this.id = id;
    }

    /**
     * get 工作流ID
     *
     * @return
     */
    public String getWorkflowId() {
        return workflowId;
    }

    /**
     * set 工作流ID
     *
     * @param workflowId
     */
    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * get 工作流名称
     *
     * @return
     */
    public String getWorkflowName() {
        return workflowName;
    }

    /**
     * set 工作流名称
     *
     * @param workflowName
     */
    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    /**
     * get 工作流状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 工作流状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 用户名
     *
     * @return
     */
    public String getUserpin() {
        return userpin;
    }

    /**
     * set 用户名
     *
     * @param userpin
     */
    public void setUserpin(String userpin) {
        this.userpin = userpin;
    }

    /**
     * get 工作流创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 工作流创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 数据中心，即regionId
     *
     * @return
     */
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * set 数据中心，即regionId
     *
     * @param dataCenter
     */
    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    /**
     * get 上一次修改时间
     *
     * @return
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * set 上一次修改时间
     *
     * @param modifyTime
     */
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * get &quot;是否自身依赖&quot;
&quot;1：自身依赖(默认)，0：非依赖&quot;

     *
     * @return
     */
    public Boolean getIsSelfDependence() {
        return isSelfDependence;
    }

    /**
     * set &quot;是否自身依赖&quot;
&quot;1：自身依赖(默认)，0：非依赖&quot;

     *
     * @param isSelfDependence
     */
    public void setIsSelfDependence(Boolean isSelfDependence) {
        this.isSelfDependence = isSelfDependence;
    }

    /**
     * get &quot;0:即时任务(默认)&quot;
&quot;1：周期性任务&quot;
&quot;2：定时任务&quot;

     *
     * @return
     */
    public Integer getTaskScheduleType() {
        return taskScheduleType;
    }

    /**
     * set &quot;0:即时任务(默认)&quot;
&quot;1：周期性任务&quot;
&quot;2：定时任务&quot;

     *
     * @param taskScheduleType
     */
    public void setTaskScheduleType(Integer taskScheduleType) {
        this.taskScheduleType = taskScheduleType;
    }

    /**
     * get 失败后是否发送通知
     *
     * @return
     */
    public Boolean getIsSendMsg() {
        return isSendMsg;
    }

    /**
     * set 失败后是否发送通知
     *
     * @param isSendMsg
     */
    public void setIsSendMsg(Boolean isSendMsg) {
        this.isSendMsg = isSendMsg;
    }


    /**
     * set id
     *
     * @param id
     */
    public EmrWorkflow id(Number id) {
        this.id = id;
        return this;
    }

    /**
     * set 工作流ID
     *
     * @param workflowId
     */
    public EmrWorkflow workflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * set 工作流名称
     *
     * @param workflowName
     */
    public EmrWorkflow workflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    /**
     * set 工作流状态
     *
     * @param status
     */
    public EmrWorkflow status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 用户名
     *
     * @param userpin
     */
    public EmrWorkflow userpin(String userpin) {
        this.userpin = userpin;
        return this;
    }

    /**
     * set 工作流创建时间
     *
     * @param createTime
     */
    public EmrWorkflow createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 数据中心，即regionId
     *
     * @param dataCenter
     */
    public EmrWorkflow dataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * set 上一次修改时间
     *
     * @param modifyTime
     */
    public EmrWorkflow modifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * set &quot;是否自身依赖&quot;
&quot;1：自身依赖(默认)，0：非依赖&quot;

     *
     * @param isSelfDependence
     */
    public EmrWorkflow isSelfDependence(Boolean isSelfDependence) {
        this.isSelfDependence = isSelfDependence;
        return this;
    }

    /**
     * set &quot;0:即时任务(默认)&quot;
&quot;1：周期性任务&quot;
&quot;2：定时任务&quot;

     *
     * @param taskScheduleType
     */
    public EmrWorkflow taskScheduleType(Integer taskScheduleType) {
        this.taskScheduleType = taskScheduleType;
        return this;
    }

    /**
     * set 失败后是否发送通知
     *
     * @param isSendMsg
     */
    public EmrWorkflow isSendMsg(Boolean isSendMsg) {
        this.isSendMsg = isSendMsg;
        return this;
    }


}