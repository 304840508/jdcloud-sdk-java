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
 * Cluster
 * 集群相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kubernetes.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询集群操作进度
 */
public class DescribeProgressRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 节点组 ID
     */
    private List<String> nodeGroupIds;

    /**
     * 地域 ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 集群 ID
     * Required:true
     */
    @Required
    private String clusterId;


    /**
     * get 节点组 ID
     *
     * @return
     */
    public List<String> getNodeGroupIds() {
        return nodeGroupIds;
    }

    /**
     * set 节点组 ID
     *
     * @param nodeGroupIds
     */
    public void setNodeGroupIds(List<String> nodeGroupIds) {
        this.nodeGroupIds = nodeGroupIds;
    }

    /**
     * get 地域 ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 集群 ID
     *
     * @return
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * set 集群 ID
     *
     * @param clusterId
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }


    /**
     * set 节点组 ID
     *
     * @param nodeGroupIds
     */
    public DescribeProgressRequest nodeGroupIds(List<String> nodeGroupIds) {
        this.nodeGroupIds = nodeGroupIds;
        return this;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public DescribeProgressRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 集群 ID
     *
     * @param clusterId
     */
    public DescribeProgressRequest clusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }


    /**
     * add item to 节点组 ID
     *
     * @param nodeGroupId
     */
    public void addNodeGroupId(String nodeGroupId) {
        if (this.nodeGroupIds == null) {
            this.nodeGroupIds = new ArrayList<>();
        }
        this.nodeGroupIds.add(nodeGroupId);
    }

}