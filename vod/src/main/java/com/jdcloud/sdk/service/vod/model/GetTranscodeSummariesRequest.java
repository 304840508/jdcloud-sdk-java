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
 * Transcode
 * 视频转码任务相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询视频转码摘要
 */
public class GetTranscodeSummariesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * videoIds
     */
    private List<String> videoIds;


    /**
     * get videoIds
     *
     * @return
     */
    public List<String> getVideoIds() {
        return videoIds;
    }

    /**
     * set videoIds
     *
     * @param videoIds
     */
    public void setVideoIds(List<String> videoIds) {
        this.videoIds = videoIds;
    }


    /**
     * set videoIds
     *
     * @param videoIds
     */
    public GetTranscodeSummariesRequest videoIds(List<String> videoIds) {
        this.videoIds = videoIds;
        return this;
    }


    /**
     * add item to videoIds
     *
     * @param videoId
     */
    public void addVideoId(String videoId) {
        if (this.videoIds == null) {
            this.videoIds = new ArrayList<>();
        }
        this.videoIds.add(videoId);
    }

}