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

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 视频转码摘要信息
 */
public class TranscodeSummaries  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * jobSummaries
     */
    private List<TranscodeJobSummary> jobSummaries;

    /**
     * 失败的视频ID列表
     */
    private List<String> failedVideoIds;


    /**
     * get jobSummaries
     *
     * @return
     */
    public List<TranscodeJobSummary> getJobSummaries() {
        return jobSummaries;
    }

    /**
     * set jobSummaries
     *
     * @param jobSummaries
     */
    public void setJobSummaries(List<TranscodeJobSummary> jobSummaries) {
        this.jobSummaries = jobSummaries;
    }

    /**
     * get 失败的视频ID列表
     *
     * @return
     */
    public List<String> getFailedVideoIds() {
        return failedVideoIds;
    }

    /**
     * set 失败的视频ID列表
     *
     * @param failedVideoIds
     */
    public void setFailedVideoIds(List<String> failedVideoIds) {
        this.failedVideoIds = failedVideoIds;
    }


    /**
     * set jobSummaries
     *
     * @param jobSummaries
     */
    public TranscodeSummaries jobSummaries(List<TranscodeJobSummary> jobSummaries) {
        this.jobSummaries = jobSummaries;
        return this;
    }

    /**
     * set 失败的视频ID列表
     *
     * @param failedVideoIds
     */
    public TranscodeSummaries failedVideoIds(List<String> failedVideoIds) {
        this.failedVideoIds = failedVideoIds;
        return this;
    }


    /**
     * add item to jobSummaries
     *
     * @param jobSummarie
     */
    public void addJobSummarie(TranscodeJobSummary jobSummarie) {
        if (this.jobSummaries == null) {
            this.jobSummaries = new ArrayList<>();
        }
        this.jobSummaries.add(jobSummarie);
    }

    /**
     * add item to 失败的视频ID列表
     *
     * @param failedVideoId
     */
    public void addFailedVideoId(String failedVideoId) {
        if (this.failedVideoIds == null) {
            this.failedVideoIds = new ArrayList<>();
        }
        this.failedVideoIds.add(failedVideoId);
    }

}