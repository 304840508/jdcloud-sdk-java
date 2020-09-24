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
 * Distributed-Cloud-Physical-Server
 * 分布式云物理服务器弹性公网IP操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.edcps.model;

import com.jdcloud.sdk.service.edcps.model.ElasticIp;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询弹性公网IP详情
 */
public class DescribeElasticIpResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性公网IP详细信息
     */
    private ElasticIp elasticIp;


    /**
     * get 弹性公网IP详细信息
     *
     * @return
     */
    public ElasticIp getElasticIp() {
        return elasticIp;
    }

    /**
     * set 弹性公网IP详细信息
     *
     * @param elasticIp
     */
    public void setElasticIp(ElasticIp elasticIp) {
        this.elasticIp = elasticIp;
    }


    /**
     * set 弹性公网IP详细信息
     *
     * @param elasticIp
     */
    public DescribeElasticIpResult elasticIp(ElasticIp elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }


}