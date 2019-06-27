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

package com.jdcloud.sdk.service.cdn.model;


/**
 * urlTask
 */
public class UrlTask  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 刷新预热类型,(url:url刷新,dir:目录刷新,prefetch:预热)
     */
    private String taskType;

    /**
     * 刷新预热的url
     */
    private String url;

    /**
     * 任务状态(running:执行中,success:成功,failed:失败)
     */
    private String status;


    /**
     * get 刷新预热类型,(url:url刷新,dir:目录刷新,prefetch:预热)
     *
     * @return
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * set 刷新预热类型,(url:url刷新,dir:目录刷新,prefetch:预热)
     *
     * @param taskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * get 刷新预热的url
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set 刷新预热的url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * get 任务状态(running:执行中,success:成功,failed:失败)
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 任务状态(running:执行中,success:成功,failed:失败)
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * set 刷新预热类型,(url:url刷新,dir:目录刷新,prefetch:预热)
     *
     * @param taskType
     */
    public UrlTask taskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * set 刷新预热的url
     *
     * @param url
     */
    public UrlTask url(String url) {
        this.url = url;
        return this;
    }

    /**
     * set 任务状态(running:执行中,success:成功,failed:失败)
     *
     * @param status
     */
    public UrlTask status(String status) {
        this.status = status;
        return this;
    }


}