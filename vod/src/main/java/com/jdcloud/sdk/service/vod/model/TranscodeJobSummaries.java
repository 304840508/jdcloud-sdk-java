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
 * 转码作业摘要信息
 */
public class TranscodeJobSummaries  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * jobSummaries
     */
    private List<TranscodeJobSummary> jobSummaries;

    /**
     * 失败的作业ID列
     */
    private List<Long> failedJobIds;


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
     * get 失败的作业ID列
     *
     * @return
     */
    public List<Long> getFailedJobIds() {
        return failedJobIds;
    }

    /**
     * set 失败的作业ID列
     *
     * @param failedJobIds
     */
    public void setFailedJobIds(List<Long> failedJobIds) {
        this.failedJobIds = failedJobIds;
    }


    /**
     * set jobSummaries
     *
     * @param jobSummaries
     */
    public TranscodeJobSummaries jobSummaries(List<TranscodeJobSummary> jobSummaries) {
        this.jobSummaries = jobSummaries;
        return this;
    }

    /**
     * set 失败的作业ID列
     *
     * @param failedJobIds
     */
    public TranscodeJobSummaries failedJobIds(List<Long> failedJobIds) {
        this.failedJobIds = failedJobIds;
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
     * add item to 失败的作业ID列
     *
     * @param failedJobId
     */
    public void addFailedJobId(Long failedJobId) {
        if (this.failedJobIds == null) {
            this.failedJobIds = new ArrayList<>();
        }
        this.failedJobIds.add(failedJobId);
    }

}