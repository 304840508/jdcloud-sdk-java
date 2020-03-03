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
 * dateAlertCount
 */
public class DateAlertCount  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 报警个数
     */
    private Long alertCount;

    /**
     * date
     */
    private String date;


    /**
     * get 报警个数
     *
     * @return
     */
    public Long getAlertCount() {
        return alertCount;
    }

    /**
     * set 报警个数
     *
     * @param alertCount
     */
    public void setAlertCount(Long alertCount) {
        this.alertCount = alertCount;
    }

    /**
     * get date
     *
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     * set date
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }


    /**
     * set 报警个数
     *
     * @param alertCount
     */
    public DateAlertCount alertCount(Long alertCount) {
        this.alertCount = alertCount;
        return this;
    }

    /**
     * set date
     *
     * @param date
     */
    public DateAlertCount date(String date) {
        this.date = date;
        return this;
    }


}