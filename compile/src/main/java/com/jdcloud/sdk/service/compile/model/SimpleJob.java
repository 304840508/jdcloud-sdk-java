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

package com.jdcloud.sdk.service.compile.model;


/**
 * simpleJob
 */
public class SimpleJob  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 构建任务uuid
     */
    private String uuid;

    /**
     * 构建名称
     */
    private String name;

    /**
     * 构建开始时间
     */
    private Integer buildStartAt;

    /**
     * 构建类型
     */
    private String compilerType;

    /**
     * 构建状态
     */
    private String buildStatus;


    /**
     * get 构建任务uuid
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set 构建任务uuid
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * get 构建名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 构建名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 构建开始时间
     *
     * @return
     */
    public Integer getBuildStartAt() {
        return buildStartAt;
    }

    /**
     * set 构建开始时间
     *
     * @param buildStartAt
     */
    public void setBuildStartAt(Integer buildStartAt) {
        this.buildStartAt = buildStartAt;
    }

    /**
     * get 构建类型
     *
     * @return
     */
    public String getCompilerType() {
        return compilerType;
    }

    /**
     * set 构建类型
     *
     * @param compilerType
     */
    public void setCompilerType(String compilerType) {
        this.compilerType = compilerType;
    }

    /**
     * get 构建状态
     *
     * @return
     */
    public String getBuildStatus() {
        return buildStatus;
    }

    /**
     * set 构建状态
     *
     * @param buildStatus
     */
    public void setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
    }


    /**
     * set 构建任务uuid
     *
     * @param uuid
     */
    public SimpleJob uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * set 构建名称
     *
     * @param name
     */
    public SimpleJob name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 构建开始时间
     *
     * @param buildStartAt
     */
    public SimpleJob buildStartAt(Integer buildStartAt) {
        this.buildStartAt = buildStartAt;
        return this;
    }

    /**
     * set 构建类型
     *
     * @param compilerType
     */
    public SimpleJob compilerType(String compilerType) {
        this.compilerType = compilerType;
        return this;
    }

    /**
     * set 构建状态
     *
     * @param buildStatus
     */
    public SimpleJob buildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
        return this;
    }


}