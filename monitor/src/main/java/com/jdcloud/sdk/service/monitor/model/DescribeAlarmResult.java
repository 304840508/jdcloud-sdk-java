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
 * Monitoring Rules APIs
 * 云监控规则相关接口，提供创建、查询、修改、删除监控规则等功能
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.BaseContact;
import com.jdcloud.sdk.service.monitor.model.NoticeOption;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.monitor.model.ResourceOption;
import com.jdcloud.sdk.service.monitor.model.RuleOptionDetail;
import com.jdcloud.sdk.service.monitor.model.WebHookOption;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询规则详情
 */
public class DescribeAlarmResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 报警规则ID
     */
    private String alarmId;

    /**
     * 规则状态，当一个规则下同时存在报警、数据不足、正常的资源时，规则状态按 报警&gt;数据不足&gt;正常的优先级展示
监控项状态：-1 未启用 1正常，2告警，4数据不足
     */
    private Long alarmStatus;

    /**
     * alarmStatusList
     */
    private List<Long> alarmStatusList;

    /**
     * baseContact
     */
    private List<BaseContact> baseContact;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 资源维度
     */
    private String dimension;

    /**
     * 资源维度名称
     */
    private String dimensionName;

    /**
     * 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     */
    private Long enabled;

    /**
     * noticeOption
     */
    private List<NoticeOption> noticeOption;

    /**
     * 资源类型
     * Required:true
     */
    @Required
    private String product;

    /**
     * 资源类型名称
     */
    private String productName;

    /**
     * resourceOption
     */
    private ResourceOption resourceOption;

    /**
     * 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     * Required:true
     */
    @Required
    private String ruleName;

    /**
     * ruleOption
     */
    private RuleOptionDetail ruleOption;

    /**
     * 规则类型, 默认为resourceMonitor
     */
    private String ruleType;

    /**
     * 规则版本  v1  v2
     */
    private String ruleVersion;

    /**
     * 资源维度，指定监控数据实例的维度标签,如resourceId&#x3D;id。(请确认资源的监控数据带有该标签，否则规则会报数据不足)
     */
    private Object tags;

    /**
     * webHookOption
     */
    private WebHookOption webHookOption;


    /**
     * get 报警规则ID
     *
     * @return
     */
    public String getAlarmId() {
        return alarmId;
    }

    /**
     * set 报警规则ID
     *
     * @param alarmId
     */
    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    /**
     * get 规则状态，当一个规则下同时存在报警、数据不足、正常的资源时，规则状态按 报警&gt;数据不足&gt;正常的优先级展示
监控项状态：-1 未启用 1正常，2告警，4数据不足
     *
     * @return
     */
    public Long getAlarmStatus() {
        return alarmStatus;
    }

    /**
     * set 规则状态，当一个规则下同时存在报警、数据不足、正常的资源时，规则状态按 报警&gt;数据不足&gt;正常的优先级展示
监控项状态：-1 未启用 1正常，2告警，4数据不足
     *
     * @param alarmStatus
     */
    public void setAlarmStatus(Long alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    /**
     * get alarmStatusList
     *
     * @return
     */
    public List<Long> getAlarmStatusList() {
        return alarmStatusList;
    }

    /**
     * set alarmStatusList
     *
     * @param alarmStatusList
     */
    public void setAlarmStatusList(List<Long> alarmStatusList) {
        this.alarmStatusList = alarmStatusList;
    }

    /**
     * get baseContact
     *
     * @return
     */
    public List<BaseContact> getBaseContact() {
        return baseContact;
    }

    /**
     * set baseContact
     *
     * @param baseContact
     */
    public void setBaseContact(List<BaseContact> baseContact) {
        this.baseContact = baseContact;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 资源维度
     *
     * @return
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * set 资源维度
     *
     * @param dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * get 资源维度名称
     *
     * @return
     */
    public String getDimensionName() {
        return dimensionName;
    }

    /**
     * set 资源维度名称
     *
     * @param dimensionName
     */
    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    /**
     * get 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @return
     */
    public Long getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @param enabled
     */
    public void setEnabled(Long enabled) {
        this.enabled = enabled;
    }

    /**
     * get noticeOption
     *
     * @return
     */
    public List<NoticeOption> getNoticeOption() {
        return noticeOption;
    }

    /**
     * set noticeOption
     *
     * @param noticeOption
     */
    public void setNoticeOption(List<NoticeOption> noticeOption) {
        this.noticeOption = noticeOption;
    }

    /**
     * get 资源类型
     *
     * @return
     */
    public String getProduct() {
        return product;
    }

    /**
     * set 资源类型
     *
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * get 资源类型名称
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set 资源类型名称
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * get resourceOption
     *
     * @return
     */
    public ResourceOption getResourceOption() {
        return resourceOption;
    }

    /**
     * set resourceOption
     *
     * @param resourceOption
     */
    public void setResourceOption(ResourceOption resourceOption) {
        this.resourceOption = resourceOption;
    }

    /**
     * get 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @return
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * set 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @param ruleName
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * get ruleOption
     *
     * @return
     */
    public RuleOptionDetail getRuleOption() {
        return ruleOption;
    }

    /**
     * set ruleOption
     *
     * @param ruleOption
     */
    public void setRuleOption(RuleOptionDetail ruleOption) {
        this.ruleOption = ruleOption;
    }

    /**
     * get 规则类型, 默认为resourceMonitor
     *
     * @return
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * set 规则类型, 默认为resourceMonitor
     *
     * @param ruleType
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * get 规则版本  v1  v2
     *
     * @return
     */
    public String getRuleVersion() {
        return ruleVersion;
    }

    /**
     * set 规则版本  v1  v2
     *
     * @param ruleVersion
     */
    public void setRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
    }

    /**
     * get 资源维度，指定监控数据实例的维度标签,如resourceId&#x3D;id。(请确认资源的监控数据带有该标签，否则规则会报数据不足)
     *
     * @return
     */
    public Object getTags() {
        return tags;
    }

    /**
     * set 资源维度，指定监控数据实例的维度标签,如resourceId&#x3D;id。(请确认资源的监控数据带有该标签，否则规则会报数据不足)
     *
     * @param tags
     */
    public void setTags(Object tags) {
        this.tags = tags;
    }

    /**
     * get webHookOption
     *
     * @return
     */
    public WebHookOption getWebHookOption() {
        return webHookOption;
    }

    /**
     * set webHookOption
     *
     * @param webHookOption
     */
    public void setWebHookOption(WebHookOption webHookOption) {
        this.webHookOption = webHookOption;
    }


    /**
     * set 报警规则ID
     *
     * @param alarmId
     */
    public DescribeAlarmResult alarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * set 规则状态，当一个规则下同时存在报警、数据不足、正常的资源时，规则状态按 报警&gt;数据不足&gt;正常的优先级展示
监控项状态：-1 未启用 1正常，2告警，4数据不足
     *
     * @param alarmStatus
     */
    public DescribeAlarmResult alarmStatus(Long alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    /**
     * set alarmStatusList
     *
     * @param alarmStatusList
     */
    public DescribeAlarmResult alarmStatusList(List<Long> alarmStatusList) {
        this.alarmStatusList = alarmStatusList;
        return this;
    }

    /**
     * set baseContact
     *
     * @param baseContact
     */
    public DescribeAlarmResult baseContact(List<BaseContact> baseContact) {
        this.baseContact = baseContact;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public DescribeAlarmResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 资源维度
     *
     * @param dimension
     */
    public DescribeAlarmResult dimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * set 资源维度名称
     *
     * @param dimensionName
     */
    public DescribeAlarmResult dimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    /**
     * set 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @param enabled
     */
    public DescribeAlarmResult enabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set noticeOption
     *
     * @param noticeOption
     */
    public DescribeAlarmResult noticeOption(List<NoticeOption> noticeOption) {
        this.noticeOption = noticeOption;
        return this;
    }

    /**
     * set 资源类型
     *
     * @param product
     */
    public DescribeAlarmResult product(String product) {
        this.product = product;
        return this;
    }

    /**
     * set 资源类型名称
     *
     * @param productName
     */
    public DescribeAlarmResult productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * set resourceOption
     *
     * @param resourceOption
     */
    public DescribeAlarmResult resourceOption(ResourceOption resourceOption) {
        this.resourceOption = resourceOption;
        return this;
    }

    /**
     * set 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @param ruleName
     */
    public DescribeAlarmResult ruleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * set ruleOption
     *
     * @param ruleOption
     */
    public DescribeAlarmResult ruleOption(RuleOptionDetail ruleOption) {
        this.ruleOption = ruleOption;
        return this;
    }

    /**
     * set 规则类型, 默认为resourceMonitor
     *
     * @param ruleType
     */
    public DescribeAlarmResult ruleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * set 规则版本  v1  v2
     *
     * @param ruleVersion
     */
    public DescribeAlarmResult ruleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
        return this;
    }

    /**
     * set 资源维度，指定监控数据实例的维度标签,如resourceId&#x3D;id。(请确认资源的监控数据带有该标签，否则规则会报数据不足)
     *
     * @param tags
     */
    public DescribeAlarmResult tags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set webHookOption
     *
     * @param webHookOption
     */
    public DescribeAlarmResult webHookOption(WebHookOption webHookOption) {
        this.webHookOption = webHookOption;
        return this;
    }


    /**
     * add item to alarmStatusList
     *
     * @param alarmStatusList
     */
    public void addAlarmStatusList(Long alarmStatusList) {
        if (this.alarmStatusList == null) {
            this.alarmStatusList = new ArrayList<>();
        }
        this.alarmStatusList.add(alarmStatusList);
    }

    /**
     * add item to baseContact
     *
     * @param baseContact
     */
    public void addBaseContact(BaseContact baseContact) {
        if (this.baseContact == null) {
            this.baseContact = new ArrayList<>();
        }
        this.baseContact.add(baseContact);
    }

    /**
     * add item to noticeOption
     *
     * @param noticeOption
     */
    public void addNoticeOption(NoticeOption noticeOption) {
        if (this.noticeOption == null) {
            this.noticeOption = new ArrayList<>();
        }
        this.noticeOption.add(noticeOption);
    }

}