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

package com.jdcloud.sdk.service.iotedge.model;


/**
 * operationlogs
 */
public class Operationlogs  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * arkid
     */
    private String arkId;

    /**
     * 文件版本
     */
    private String sysVersion;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 操作时间
     */
    private String logTime;

    /**
     * 文件状态 0-发布成功 4-上线成功
     */
    private String fileStatus;

    /**
     * 文件地址，包括路径和文件名
     */
    private String fileAddr;

    /**
     * 区域
     */
    private String region;

    /**
     * 分支
     */
    private String branch;

    /**
     * 文件类1-核心系统 2-安装包
     */
    private String fileType;


    /**
     * get arkid
     *
     * @return
     */
    public String getArkId() {
        return arkId;
    }

    /**
     * set arkid
     *
     * @param arkId
     */
    public void setArkId(String arkId) {
        this.arkId = arkId;
    }

    /**
     * get 文件版本
     *
     * @return
     */
    public String getSysVersion() {
        return sysVersion;
    }

    /**
     * set 文件版本
     *
     * @param sysVersion
     */
    public void setSysVersion(String sysVersion) {
        this.sysVersion = sysVersion;
    }

    /**
     * get 操作人
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 操作人
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * get 操作时间
     *
     * @return
     */
    public String getLogTime() {
        return logTime;
    }

    /**
     * set 操作时间
     *
     * @param logTime
     */
    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    /**
     * get 文件状态 0-发布成功 4-上线成功
     *
     * @return
     */
    public String getFileStatus() {
        return fileStatus;
    }

    /**
     * set 文件状态 0-发布成功 4-上线成功
     *
     * @param fileStatus
     */
    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }

    /**
     * get 文件地址，包括路径和文件名
     *
     * @return
     */
    public String getFileAddr() {
        return fileAddr;
    }

    /**
     * set 文件地址，包括路径和文件名
     *
     * @param fileAddr
     */
    public void setFileAddr(String fileAddr) {
        this.fileAddr = fileAddr;
    }

    /**
     * get 区域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 区域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 分支
     *
     * @return
     */
    public String getBranch() {
        return branch;
    }

    /**
     * set 分支
     *
     * @param branch
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * get 文件类1-核心系统 2-安装包
     *
     * @return
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * set 文件类1-核心系统 2-安装包
     *
     * @param fileType
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }


    /**
     * set arkid
     *
     * @param arkId
     */
    public Operationlogs arkId(String arkId) {
        this.arkId = arkId;
        return this;
    }

    /**
     * set 文件版本
     *
     * @param sysVersion
     */
    public Operationlogs sysVersion(String sysVersion) {
        this.sysVersion = sysVersion;
        return this;
    }

    /**
     * set 操作人
     *
     * @param operator
     */
    public Operationlogs operator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * set 操作时间
     *
     * @param logTime
     */
    public Operationlogs logTime(String logTime) {
        this.logTime = logTime;
        return this;
    }

    /**
     * set 文件状态 0-发布成功 4-上线成功
     *
     * @param fileStatus
     */
    public Operationlogs fileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
        return this;
    }

    /**
     * set 文件地址，包括路径和文件名
     *
     * @param fileAddr
     */
    public Operationlogs fileAddr(String fileAddr) {
        this.fileAddr = fileAddr;
        return this;
    }

    /**
     * set 区域
     *
     * @param region
     */
    public Operationlogs region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 分支
     *
     * @param branch
     */
    public Operationlogs branch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * set 文件类1-核心系统 2-安装包
     *
     * @param fileType
     */
    public Operationlogs fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }


}