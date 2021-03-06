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

package com.jdcloud.sdk.service.monitor.model;


/**
 * nsReportInfo
 */
public class NsReportInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 维度
     */
    private Object dimensions;

    /**
     * 监控指标
     */
    private String metric;


    /**
     * get 维度
     *
     * @return
     */
    public Object getDimensions() {
        return dimensions;
    }

    /**
     * set 维度
     *
     * @param dimensions
     */
    public void setDimensions(Object dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * get 监控指标
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控指标
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }


    /**
     * set 维度
     *
     * @param dimensions
     */
    public NsReportInfo dimensions(Object dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * set 监控指标
     *
     * @param metric
     */
    public NsReportInfo metric(String metric) {
        this.metric = metric;
        return this;
    }


}