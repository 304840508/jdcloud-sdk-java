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

package com.jdcloud.sdk.service.deploy.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * createGroup
 */
public class CreateGroup  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部署组名称
     * Required:true
     */
    @Required
    private String groupName;

    /**
     * 应用ID
     * Required:true
     */
    @Required
    private String appId;

    /**
     * 描述
     */
    private String desc;

    /**
     * 部署方式：1滚动部署，2蓝绿部署
     * Required:true
     */
    @Required
    private Integer deployMethod;

    /**
     * 部署实例（滚动部署）
     */
    private List<String> instances;

    /**
     * 部署实例（蓝绿部署蓝组）
     */
    private List<String> blueInstances;

    /**
     * 部署实例（蓝绿部署绿组）
     */
    private List<String> greenInstances;

    /**
     * 并发单位
     */
    private Integer concurrencyUnit;

    /**
     * 并发机器数
     */
    private Integer concurrencyNum;

    /**
     * 并发度
     */
    private Integer concurrencyPct;

    /**
     * 负载均衡：1启动，2禁用
     * Required:true
     */
    @Required
    private Integer lbStatus;

    /**
     * lb实例
     */
    private String lbInstance;

    /**
     * lb lb后端服务
     */
    private String lbBackend;

    /**
     * 同名文件处理方式：1部署失败，2覆盖，3保留
     * Required:true
     */
    @Required
    private Integer repeatPolicy;

    /**
     * 通知频率：0不发送，1消息，2邮件，3短信
     * Required:true
     */
    @Required
    private Integer noticeTrigger;

    /**
     * 通知方式：1消息，2邮件，3短信
     */
    private List<String> noticeMethod;

    /**
     * 自动回滚：1开启，2禁用
     * Required:true
     */
    @Required
    private Integer rollback;

    /**
     * 分布式服务框架ID
     */
    private String jdsfRegisterId;


    /**
     * get 部署组名称
     *
     * @return
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * set 部署组名称
     *
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * get 应用ID
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 描述
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * get 部署方式：1滚动部署，2蓝绿部署
     *
     * @return
     */
    public Integer getDeployMethod() {
        return deployMethod;
    }

    /**
     * set 部署方式：1滚动部署，2蓝绿部署
     *
     * @param deployMethod
     */
    public void setDeployMethod(Integer deployMethod) {
        this.deployMethod = deployMethod;
    }

    /**
     * get 部署实例（滚动部署）
     *
     * @return
     */
    public List<String> getInstances() {
        return instances;
    }

    /**
     * set 部署实例（滚动部署）
     *
     * @param instances
     */
    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    /**
     * get 部署实例（蓝绿部署蓝组）
     *
     * @return
     */
    public List<String> getBlueInstances() {
        return blueInstances;
    }

    /**
     * set 部署实例（蓝绿部署蓝组）
     *
     * @param blueInstances
     */
    public void setBlueInstances(List<String> blueInstances) {
        this.blueInstances = blueInstances;
    }

    /**
     * get 部署实例（蓝绿部署绿组）
     *
     * @return
     */
    public List<String> getGreenInstances() {
        return greenInstances;
    }

    /**
     * set 部署实例（蓝绿部署绿组）
     *
     * @param greenInstances
     */
    public void setGreenInstances(List<String> greenInstances) {
        this.greenInstances = greenInstances;
    }

    /**
     * get 并发单位
     *
     * @return
     */
    public Integer getConcurrencyUnit() {
        return concurrencyUnit;
    }

    /**
     * set 并发单位
     *
     * @param concurrencyUnit
     */
    public void setConcurrencyUnit(Integer concurrencyUnit) {
        this.concurrencyUnit = concurrencyUnit;
    }

    /**
     * get 并发机器数
     *
     * @return
     */
    public Integer getConcurrencyNum() {
        return concurrencyNum;
    }

    /**
     * set 并发机器数
     *
     * @param concurrencyNum
     */
    public void setConcurrencyNum(Integer concurrencyNum) {
        this.concurrencyNum = concurrencyNum;
    }

    /**
     * get 并发度
     *
     * @return
     */
    public Integer getConcurrencyPct() {
        return concurrencyPct;
    }

    /**
     * set 并发度
     *
     * @param concurrencyPct
     */
    public void setConcurrencyPct(Integer concurrencyPct) {
        this.concurrencyPct = concurrencyPct;
    }

    /**
     * get 负载均衡：1启动，2禁用
     *
     * @return
     */
    public Integer getLbStatus() {
        return lbStatus;
    }

    /**
     * set 负载均衡：1启动，2禁用
     *
     * @param lbStatus
     */
    public void setLbStatus(Integer lbStatus) {
        this.lbStatus = lbStatus;
    }

    /**
     * get lb实例
     *
     * @return
     */
    public String getLbInstance() {
        return lbInstance;
    }

    /**
     * set lb实例
     *
     * @param lbInstance
     */
    public void setLbInstance(String lbInstance) {
        this.lbInstance = lbInstance;
    }

    /**
     * get lb lb后端服务
     *
     * @return
     */
    public String getLbBackend() {
        return lbBackend;
    }

    /**
     * set lb lb后端服务
     *
     * @param lbBackend
     */
    public void setLbBackend(String lbBackend) {
        this.lbBackend = lbBackend;
    }

    /**
     * get 同名文件处理方式：1部署失败，2覆盖，3保留
     *
     * @return
     */
    public Integer getRepeatPolicy() {
        return repeatPolicy;
    }

    /**
     * set 同名文件处理方式：1部署失败，2覆盖，3保留
     *
     * @param repeatPolicy
     */
    public void setRepeatPolicy(Integer repeatPolicy) {
        this.repeatPolicy = repeatPolicy;
    }

    /**
     * get 通知频率：0不发送，1消息，2邮件，3短信
     *
     * @return
     */
    public Integer getNoticeTrigger() {
        return noticeTrigger;
    }

    /**
     * set 通知频率：0不发送，1消息，2邮件，3短信
     *
     * @param noticeTrigger
     */
    public void setNoticeTrigger(Integer noticeTrigger) {
        this.noticeTrigger = noticeTrigger;
    }

    /**
     * get 通知方式：1消息，2邮件，3短信
     *
     * @return
     */
    public List<String> getNoticeMethod() {
        return noticeMethod;
    }

    /**
     * set 通知方式：1消息，2邮件，3短信
     *
     * @param noticeMethod
     */
    public void setNoticeMethod(List<String> noticeMethod) {
        this.noticeMethod = noticeMethod;
    }

    /**
     * get 自动回滚：1开启，2禁用
     *
     * @return
     */
    public Integer getRollback() {
        return rollback;
    }

    /**
     * set 自动回滚：1开启，2禁用
     *
     * @param rollback
     */
    public void setRollback(Integer rollback) {
        this.rollback = rollback;
    }

    /**
     * get 分布式服务框架ID
     *
     * @return
     */
    public String getJdsfRegisterId() {
        return jdsfRegisterId;
    }

    /**
     * set 分布式服务框架ID
     *
     * @param jdsfRegisterId
     */
    public void setJdsfRegisterId(String jdsfRegisterId) {
        this.jdsfRegisterId = jdsfRegisterId;
    }


    /**
     * set 部署组名称
     *
     * @param groupName
     */
    public CreateGroup groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public CreateGroup appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 描述
     *
     * @param desc
     */
    public CreateGroup desc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * set 部署方式：1滚动部署，2蓝绿部署
     *
     * @param deployMethod
     */
    public CreateGroup deployMethod(Integer deployMethod) {
        this.deployMethod = deployMethod;
        return this;
    }

    /**
     * set 部署实例（滚动部署）
     *
     * @param instances
     */
    public CreateGroup instances(List<String> instances) {
        this.instances = instances;
        return this;
    }

    /**
     * set 部署实例（蓝绿部署蓝组）
     *
     * @param blueInstances
     */
    public CreateGroup blueInstances(List<String> blueInstances) {
        this.blueInstances = blueInstances;
        return this;
    }

    /**
     * set 部署实例（蓝绿部署绿组）
     *
     * @param greenInstances
     */
    public CreateGroup greenInstances(List<String> greenInstances) {
        this.greenInstances = greenInstances;
        return this;
    }

    /**
     * set 并发单位
     *
     * @param concurrencyUnit
     */
    public CreateGroup concurrencyUnit(Integer concurrencyUnit) {
        this.concurrencyUnit = concurrencyUnit;
        return this;
    }

    /**
     * set 并发机器数
     *
     * @param concurrencyNum
     */
    public CreateGroup concurrencyNum(Integer concurrencyNum) {
        this.concurrencyNum = concurrencyNum;
        return this;
    }

    /**
     * set 并发度
     *
     * @param concurrencyPct
     */
    public CreateGroup concurrencyPct(Integer concurrencyPct) {
        this.concurrencyPct = concurrencyPct;
        return this;
    }

    /**
     * set 负载均衡：1启动，2禁用
     *
     * @param lbStatus
     */
    public CreateGroup lbStatus(Integer lbStatus) {
        this.lbStatus = lbStatus;
        return this;
    }

    /**
     * set lb实例
     *
     * @param lbInstance
     */
    public CreateGroup lbInstance(String lbInstance) {
        this.lbInstance = lbInstance;
        return this;
    }

    /**
     * set lb lb后端服务
     *
     * @param lbBackend
     */
    public CreateGroup lbBackend(String lbBackend) {
        this.lbBackend = lbBackend;
        return this;
    }

    /**
     * set 同名文件处理方式：1部署失败，2覆盖，3保留
     *
     * @param repeatPolicy
     */
    public CreateGroup repeatPolicy(Integer repeatPolicy) {
        this.repeatPolicy = repeatPolicy;
        return this;
    }

    /**
     * set 通知频率：0不发送，1消息，2邮件，3短信
     *
     * @param noticeTrigger
     */
    public CreateGroup noticeTrigger(Integer noticeTrigger) {
        this.noticeTrigger = noticeTrigger;
        return this;
    }

    /**
     * set 通知方式：1消息，2邮件，3短信
     *
     * @param noticeMethod
     */
    public CreateGroup noticeMethod(List<String> noticeMethod) {
        this.noticeMethod = noticeMethod;
        return this;
    }

    /**
     * set 自动回滚：1开启，2禁用
     *
     * @param rollback
     */
    public CreateGroup rollback(Integer rollback) {
        this.rollback = rollback;
        return this;
    }

    /**
     * set 分布式服务框架ID
     *
     * @param jdsfRegisterId
     */
    public CreateGroup jdsfRegisterId(String jdsfRegisterId) {
        this.jdsfRegisterId = jdsfRegisterId;
        return this;
    }


    /**
     * add item to 部署实例（滚动部署）
     *
     * @param instance
     */
    public void addInstance(String instance) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instance);
    }

    /**
     * add item to 部署实例（蓝绿部署蓝组）
     *
     * @param blueInstance
     */
    public void addBlueInstance(String blueInstance) {
        if (this.blueInstances == null) {
            this.blueInstances = new ArrayList<>();
        }
        this.blueInstances.add(blueInstance);
    }

    /**
     * add item to 部署实例（蓝绿部署绿组）
     *
     * @param greenInstance
     */
    public void addGreenInstance(String greenInstance) {
        if (this.greenInstances == null) {
            this.greenInstances = new ArrayList<>();
        }
        this.greenInstances.add(greenInstance);
    }

    /**
     * add item to 通知方式：1消息，2邮件，3短信
     *
     * @param noticeMethod
     */
    public void addNoticeMethod(String noticeMethod) {
        if (this.noticeMethod == null) {
            this.noticeMethod = new ArrayList<>();
        }
        this.noticeMethod.add(noticeMethod);
    }

}