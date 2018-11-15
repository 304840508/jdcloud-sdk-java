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
 * 作业管理
 * JMR作业管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jmr.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.jmr.model.JmrJobViewModel;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建作业
 */
public class CreateJobRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * jmrJobViewModel
     * Required:true
     */
    @Required
    private JmrJobViewModel jmrJobViewModel;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get jmrJobViewModel
     *
     * @return
     */
    public JmrJobViewModel getJmrJobViewModel() {
        return jmrJobViewModel;
    }

    /**
     * set jmrJobViewModel
     *
     * @param jmrJobViewModel
     */
    public void setJmrJobViewModel(JmrJobViewModel jmrJobViewModel) {
        this.jmrJobViewModel = jmrJobViewModel;
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
     * set jmrJobViewModel
     *
     * @param jmrJobViewModel
     */
    public CreateJobRequest jmrJobViewModel(JmrJobViewModel jmrJobViewModel) {
        this.jmrJobViewModel = jmrJobViewModel;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateJobRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}