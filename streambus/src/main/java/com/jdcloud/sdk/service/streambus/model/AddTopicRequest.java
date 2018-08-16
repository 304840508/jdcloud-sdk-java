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
 * TOPIC相关 API
 * 流数据总线topic相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.streambus.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.streambus.model.TopicModel;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建topic时，topicModel中只需要传topic参数，另外两个参数可为空
 */
public class AddTopicRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 示例：{&quot;topicModel&quot;:{&quot;topic&quot;:{&quot;archived&quot;:0,&quot;id&quot;:&quot;&quot;,&quot;name&quot;:&quot;create&quot;,&quot;remark&quot;:&quot;备注&quot;,&quot;shardNum&quot;:1,&quot;partitionNum&quot;:2,&quot;lifecycle&quot;:3}}}
     * Required:true
     */
    @Required
    private TopicModel topicModel;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 示例：{&quot;topicModel&quot;:{&quot;topic&quot;:{&quot;archived&quot;:0,&quot;id&quot;:&quot;&quot;,&quot;name&quot;:&quot;create&quot;,&quot;remark&quot;:&quot;备注&quot;,&quot;shardNum&quot;:1,&quot;partitionNum&quot;:2,&quot;lifecycle&quot;:3}}}
     *
     * @return
     */
    public TopicModel getTopicModel() {
        return topicModel;
    }

    /**
     * set 示例：{&quot;topicModel&quot;:{&quot;topic&quot;:{&quot;archived&quot;:0,&quot;id&quot;:&quot;&quot;,&quot;name&quot;:&quot;create&quot;,&quot;remark&quot;:&quot;备注&quot;,&quot;shardNum&quot;:1,&quot;partitionNum&quot;:2,&quot;lifecycle&quot;:3}}}
     *
     * @param topicModel
     */
    public void setTopicModel(TopicModel topicModel) {
        this.topicModel = topicModel;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 示例：{&quot;topicModel&quot;:{&quot;topic&quot;:{&quot;archived&quot;:0,&quot;id&quot;:&quot;&quot;,&quot;name&quot;:&quot;create&quot;,&quot;remark&quot;:&quot;备注&quot;,&quot;shardNum&quot;:1,&quot;partitionNum&quot;:2,&quot;lifecycle&quot;:3}}}
     *
     * @param topicModel
     */
    public AddTopicRequest topicModel(TopicModel topicModel) {
        this.topicModel = topicModel;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public AddTopicRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}