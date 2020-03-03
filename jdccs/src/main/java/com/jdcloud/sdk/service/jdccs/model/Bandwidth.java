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

package com.jdcloud.sdk.service.jdccs.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 带宽（出口）
 */
public class Bandwidth  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机房英文标识
     */
    private String idc;

    /**
     * 机房名称
     */
    private String idcName;

    /**
     * 带宽实例ID
     */
    private String bandwidthId;

    /**
     * 带宽名称
     */
    private String bandwidthName;

    /**
     * 状态 normal:正常 abnormal:异常
     */
    private String status;

    /**
     * 线路类型 bgp:BGP telecom:电信单线 unicom:联通单线 mobile:移动单线
     */
    private String lineType;

    /**
     * 合同带宽（Mbps）
     */
    private Integer bandwidth;

    /**
     * 关联的公网IP
     */
    private List<RelatedIp> relatedIp;

    /**
     * 交换机信息
     */
    private List<Switchboard> switchboard;


    /**
     * get 机房英文标识
     *
     * @return
     */
    public String getIdc() {
        return idc;
    }

    /**
     * set 机房英文标识
     *
     * @param idc
     */
    public void setIdc(String idc) {
        this.idc = idc;
    }

    /**
     * get 机房名称
     *
     * @return
     */
    public String getIdcName() {
        return idcName;
    }

    /**
     * set 机房名称
     *
     * @param idcName
     */
    public void setIdcName(String idcName) {
        this.idcName = idcName;
    }

    /**
     * get 带宽实例ID
     *
     * @return
     */
    public String getBandwidthId() {
        return bandwidthId;
    }

    /**
     * set 带宽实例ID
     *
     * @param bandwidthId
     */
    public void setBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
    }

    /**
     * get 带宽名称
     *
     * @return
     */
    public String getBandwidthName() {
        return bandwidthName;
    }

    /**
     * set 带宽名称
     *
     * @param bandwidthName
     */
    public void setBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
    }

    /**
     * get 状态 normal:正常 abnormal:异常
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态 normal:正常 abnormal:异常
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 线路类型 bgp:BGP telecom:电信单线 unicom:联通单线 mobile:移动单线
     *
     * @return
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * set 线路类型 bgp:BGP telecom:电信单线 unicom:联通单线 mobile:移动单线
     *
     * @param lineType
     */
    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    /**
     * get 合同带宽（Mbps）
     *
     * @return
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * set 合同带宽（Mbps）
     *
     * @param bandwidth
     */
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * get 关联的公网IP
     *
     * @return
     */
    public List<RelatedIp> getRelatedIp() {
        return relatedIp;
    }

    /**
     * set 关联的公网IP
     *
     * @param relatedIp
     */
    public void setRelatedIp(List<RelatedIp> relatedIp) {
        this.relatedIp = relatedIp;
    }

    /**
     * get 交换机信息
     *
     * @return
     */
    public List<Switchboard> getSwitchboard() {
        return switchboard;
    }

    /**
     * set 交换机信息
     *
     * @param switchboard
     */
    public void setSwitchboard(List<Switchboard> switchboard) {
        this.switchboard = switchboard;
    }


    /**
     * set 机房英文标识
     *
     * @param idc
     */
    public Bandwidth idc(String idc) {
        this.idc = idc;
        return this;
    }

    /**
     * set 机房名称
     *
     * @param idcName
     */
    public Bandwidth idcName(String idcName) {
        this.idcName = idcName;
        return this;
    }

    /**
     * set 带宽实例ID
     *
     * @param bandwidthId
     */
    public Bandwidth bandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
        return this;
    }

    /**
     * set 带宽名称
     *
     * @param bandwidthName
     */
    public Bandwidth bandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
        return this;
    }

    /**
     * set 状态 normal:正常 abnormal:异常
     *
     * @param status
     */
    public Bandwidth status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 线路类型 bgp:BGP telecom:电信单线 unicom:联通单线 mobile:移动单线
     *
     * @param lineType
     */
    public Bandwidth lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    /**
     * set 合同带宽（Mbps）
     *
     * @param bandwidth
     */
    public Bandwidth bandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set 关联的公网IP
     *
     * @param relatedIp
     */
    public Bandwidth relatedIp(List<RelatedIp> relatedIp) {
        this.relatedIp = relatedIp;
        return this;
    }

    /**
     * set 交换机信息
     *
     * @param switchboard
     */
    public Bandwidth switchboard(List<Switchboard> switchboard) {
        this.switchboard = switchboard;
        return this;
    }


    /**
     * add item to 关联的公网IP
     *
     * @param relatedIp
     */
    public void addRelatedIp(RelatedIp relatedIp) {
        if (this.relatedIp == null) {
            this.relatedIp = new ArrayList<>();
        }
        this.relatedIp.add(relatedIp);
    }

    /**
     * add item to 交换机信息
     *
     * @param switchboard
     */
    public void addSwitchboard(Switchboard switchboard) {
        if (this.switchboard == null) {
            this.switchboard = new ArrayList<>();
        }
        this.switchboard.add(switchboard);
    }

}