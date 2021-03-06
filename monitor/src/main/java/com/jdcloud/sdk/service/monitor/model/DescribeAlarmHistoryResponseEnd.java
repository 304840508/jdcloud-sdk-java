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

import java.util.List;
import java.util.ArrayList;

/**
 * describeAlarmHistoryResponseEnd
 */
public class DescribeAlarmHistoryResponseEnd  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 告警历史列表
     */
    private List<DescribedAlarmHistory> alarmHistoryList;

    /**
     * 总数
     */
    private Long total;


    /**
     * get 告警历史列表
     *
     * @return
     */
    public List<DescribedAlarmHistory> getAlarmHistoryList() {
        return alarmHistoryList;
    }

    /**
     * set 告警历史列表
     *
     * @param alarmHistoryList
     */
    public void setAlarmHistoryList(List<DescribedAlarmHistory> alarmHistoryList) {
        this.alarmHistoryList = alarmHistoryList;
    }

    /**
     * get 总数
     *
     * @return
     */
    public Long getTotal() {
        return total;
    }

    /**
     * set 总数
     *
     * @param total
     */
    public void setTotal(Long total) {
        this.total = total;
    }


    /**
     * set 告警历史列表
     *
     * @param alarmHistoryList
     */
    public DescribeAlarmHistoryResponseEnd alarmHistoryList(List<DescribedAlarmHistory> alarmHistoryList) {
        this.alarmHistoryList = alarmHistoryList;
        return this;
    }

    /**
     * set 总数
     *
     * @param total
     */
    public DescribeAlarmHistoryResponseEnd total(Long total) {
        this.total = total;
        return this;
    }


    /**
     * add item to 告警历史列表
     *
     * @param alarmHistoryList
     */
    public void addAlarmHistoryList(DescribedAlarmHistory alarmHistoryList) {
        if (this.alarmHistoryList == null) {
            this.alarmHistoryList = new ArrayList<>();
        }
        this.alarmHistoryList.add(alarmHistoryList);
    }

}