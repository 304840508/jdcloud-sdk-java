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
 * 云物理服务器
 * 云物理服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询单个云物理服务器监控信息
 */
public class DescribeInstanceStatusResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * CPU状态是否正常
     */
    private Boolean cpus;

    /**
     * 内存状态是否正常
     */
    private Boolean mems;

    /**
     * 硬盘状态是否正常
     */
    private Boolean disks;

    /**
     * 网卡状态是否正常
     */
    private Boolean nics;


    /**
     * get CPU状态是否正常
     *
     * @return
     */
    public Boolean getCpus() {
        return cpus;
    }

    /**
     * set CPU状态是否正常
     *
     * @param cpus
     */
    public void setCpus(Boolean cpus) {
        this.cpus = cpus;
    }

    /**
     * get 内存状态是否正常
     *
     * @return
     */
    public Boolean getMems() {
        return mems;
    }

    /**
     * set 内存状态是否正常
     *
     * @param mems
     */
    public void setMems(Boolean mems) {
        this.mems = mems;
    }

    /**
     * get 硬盘状态是否正常
     *
     * @return
     */
    public Boolean getDisks() {
        return disks;
    }

    /**
     * set 硬盘状态是否正常
     *
     * @param disks
     */
    public void setDisks(Boolean disks) {
        this.disks = disks;
    }

    /**
     * get 网卡状态是否正常
     *
     * @return
     */
    public Boolean getNics() {
        return nics;
    }

    /**
     * set 网卡状态是否正常
     *
     * @param nics
     */
    public void setNics(Boolean nics) {
        this.nics = nics;
    }


    /**
     * set CPU状态是否正常
     *
     * @param cpus
     */
    public DescribeInstanceStatusResult cpus(Boolean cpus) {
        this.cpus = cpus;
        return this;
    }

    /**
     * set 内存状态是否正常
     *
     * @param mems
     */
    public DescribeInstanceStatusResult mems(Boolean mems) {
        this.mems = mems;
        return this;
    }

    /**
     * set 硬盘状态是否正常
     *
     * @param disks
     */
    public DescribeInstanceStatusResult disks(Boolean disks) {
        this.disks = disks;
        return this;
    }

    /**
     * set 网卡状态是否正常
     *
     * @param nics
     */
    public DescribeInstanceStatusResult nics(Boolean nics) {
        this.nics = nics;
        return this;
    }


}