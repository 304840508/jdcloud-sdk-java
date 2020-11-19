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
 * 性能统计
 * 性能统计相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.common.model.Sort;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询MySQL实例的慢日志的详细信息。&lt;br&gt;- 仅支持MySQL
 */
public class DescribeSlowLogAttributesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 慢日志开始时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间到当前时间不能大于 7 天, 开始时间不能大于结束时间，结束时间不能大于当前时间
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 慢日志结束时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间到当前时间不能大于 7 天, 开始时间不能大于结束时间，结束时间不能大于当前时间
     * Required:true
     */
    @Required
    private String endTime;

    /**
     * 查询哪个数据库的慢日志，不填表示返回所有数据库的慢日志
     */
    private String dbName;

    /**
     * 显示数据的页码，默认为1，取值范围：[-1,1000)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页。
     */
    private Integer pageNumber;

    /**
     * 每页显示的数据条数，默认为10，取值范围：10、20、30、50、100
     */
    private Integer pageSize;

    /**
     * 慢日志明细的排序规则，不指定时按上报日志的时间戳降序返回所有的日志
     */
    private List<Sort> sorts;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 慢日志开始时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间到当前时间不能大于 7 天, 开始时间不能大于结束时间，结束时间不能大于当前时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 慢日志开始时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间到当前时间不能大于 7 天, 开始时间不能大于结束时间，结束时间不能大于当前时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 慢日志结束时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间到当前时间不能大于 7 天, 开始时间不能大于结束时间，结束时间不能大于当前时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 慢日志结束时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间到当前时间不能大于 7 天, 开始时间不能大于结束时间，结束时间不能大于当前时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 查询哪个数据库的慢日志，不填表示返回所有数据库的慢日志
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 查询哪个数据库的慢日志，不填表示返回所有数据库的慢日志
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 显示数据的页码，默认为1，取值范围：[-1,1000)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页。
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,1000)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页。
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 每页显示的数据条数，默认为10，取值范围：10、20、30、50、100
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页显示的数据条数，默认为10，取值范围：10、20、30、50、100
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 慢日志明细的排序规则，不指定时按上报日志的时间戳降序返回所有的日志
     *
     * @return
     */
    public List<Sort> getSorts() {
        return sorts;
    }

    /**
     * set 慢日志明细的排序规则，不指定时按上报日志的时间戳降序返回所有的日志
     *
     * @param sorts
     */
    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
    }

    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get RDS 实例ID，唯一标识一个RDS实例
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 慢日志开始时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间到当前时间不能大于 7 天, 开始时间不能大于结束时间，结束时间不能大于当前时间
     *
     * @param startTime
     */
    public DescribeSlowLogAttributesRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 慢日志结束时间，格式为：YYYY-MM-DD HH:mm:ss，开始时间到当前时间不能大于 7 天, 开始时间不能大于结束时间，结束时间不能大于当前时间
     *
     * @param endTime
     */
    public DescribeSlowLogAttributesRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 查询哪个数据库的慢日志，不填表示返回所有数据库的慢日志
     *
     * @param dbName
     */
    public DescribeSlowLogAttributesRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,1000)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页。
     *
     * @param pageNumber
     */
    public DescribeSlowLogAttributesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 每页显示的数据条数，默认为10，取值范围：10、20、30、50、100
     *
     * @param pageSize
     */
    public DescribeSlowLogAttributesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 慢日志明细的排序规则，不指定时按上报日志的时间戳降序返回所有的日志
     *
     * @param sorts
     */
    public DescribeSlowLogAttributesRequest sorts(List<Sort> sorts) {
        this.sorts = sorts;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public DescribeSlowLogAttributesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public DescribeSlowLogAttributesRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * add item to 慢日志明细的排序规则，不指定时按上报日志的时间戳降序返回所有的日志
     *
     * @param sort
     */
    public void addSort(Sort sort) {
        if (this.sorts == null) {
            this.sorts = new ArrayList<>();
        }
        this.sorts.add(sort);
    }

}