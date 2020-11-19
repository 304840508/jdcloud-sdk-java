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

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;

/**
 * instance
 */
public class Instance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例 ID
     */
    private String id;

    /**
     * 实例名称
     */
    private String name;

    /**
     * 链路类型. &lt;br&gt;- 1: 电信&lt;br&gt;- 3: 电信、联通和移动&lt;br&gt;- 4: BGP 线路
     */
    private Integer carrier;

    /**
     * 可防护 IP 类型, 目前仅电信线路支持 IPV6 线路. &lt;br&gt;- 0: IPV4. &lt;br&gt;- 1: IPV4/IPV6
     */
    private Integer ipType;

    /**
     * IP 数量
     */
    private Integer ipCount;

    /**
     * 可配的转发端口数量
     */
    private Integer portCount;

    /**
     * 可配的网站规则域名数量
     */
    private Integer domainCount;

    /**
     * 触发弹性带宽的次数
     */
    private Integer elasticTriggerCount;

    /**
     * 超峰次数
     */
    private Integer abovePeakCount;

    /**
     * 保底带宽
     */
    private Integer inBitslimit;

    /**
     * 弹性带宽
     */
    private Integer resilientBitslimit;

    /**
     * 业务带宽大小
     */
    private Integer businessBitslimit;

    /**
     * CC 阈值大小
     */
    private Integer ccThreshold;

    /**
     * CC 防护峰值, 单位: QPS
     */
    private Integer ccPeakQPS;

    /**
     * 非网站类规则数
     */
    private Integer ruleCount;

    /**
     * 网站类规则数
     */
    private Integer webRuleCount;

    /**
     * 防护调度规则数
     */
    private Integer dispatchRuleCount;

    /**
     * 计费状态. &lt;br&gt;- PAID: 已支付&lt;br&gt;- ARREARS: 欠费&lt;br&gt;- EXPIRED: 过期
     */
    private String chargeStatus;

    /**
     * 安全状态. &lt;br&gt;- SAFE: 安全&lt;br&gt;- CLEANING: 清洗中&lt;br&gt;- BLOCKING: 封禁中
     */
    private String securityStatus;

    /**
     * 实例的创建的时间
     */
    private String createTime;

    /**
     * 实例的过期时间
     */
    private String expireTime;

    /**
     * 资源 ID, 升级和续费时使用
     */
    private String resourceId;

    /**
     * CC 防护观察者模式. &lt;br&gt;- 0: 关闭 &lt;br&gt;- 1: 开启
     */
    private Integer ccObserveMode;

    /**
     * CC 防护模式. &lt;br&gt;- 0: 正常 &lt;br&gt;- 1: 紧急 &lt;br&gt;- 2: 宽松 &lt;br&gt;- 3: 自定义
     */
    private Integer ccProtectMode;

    /**
     * CC 开关状态. &lt;br&gt;- 0: 关闭 &lt;br&gt;- 1: 开启
     */
    private Integer ccProtectStatus;

    /**
     * CC 防护模式为自定义时的限速大小
     */
    private Integer ccSpeedLimit;

    /**
     * CC 防护模式为自定义时的限速周期
     */
    private Integer ccSpeedPeriod;

    /**
     * IP 黑名单列表
     */
    private List<String> ipBlackList;

    /**
     * IP 黑名单状态. &lt;br&gt;- 0: 关闭 &lt;br&gt;- 1: 开启
     */
    private Integer ipBlackStatus;

    /**
     * IP 白名单列表
     */
    private List<String> ipWhiteList;

    /**
     * IP 白名单状态. &lt;br&gt;- 0: 关闭&lt;br&gt;- 1: 开启
     */
    private Integer ipWhiteStatus;

    /**
     * url白名单列表
     */
    private List<String> urlWhitelist;

    /**
     * url白名单状态. &lt;br&gt;- 0: 关闭&lt;br&gt;- 1: 开启
     */
    private Integer urlWhitelistStatus;

    /**
     * ccProtectMode为自定义模式时, 每个Host的防护阈值
     */
    private Integer hostQps;

    /**
     * ccProtectMode为自定义模式时, 每个Host+URI的防护阈值
     */
    private Integer hostUrlQps;

    /**
     * ccProtectMode为自定义模式时, 每个源IP对Host的防护阈值
     */
    private Integer ipHostQps;

    /**
     * ccProtectMode为自定义模式时, 每个源IP对Host+URI的防护阈值
     */
    private Integer ipHostUrlQps;

    /**
     * 关联的自定义页面id
     */
    private String pageId;

    /**
     * 关联的自定义页面名称
     */
    private String pageName;

    /**
     * 是否开启自定义页面, 关闭时透传状态码.  &lt;br&gt;- 0: 关闭&lt;br&gt;- 1: 开启
     */
    private Integer pageStatus;

    /**
     * 每条网站规则可配的http/https端口数
     */
    private Integer webRulePortLimit;


    /**
     * get 实例 ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 实例 ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 实例名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 实例名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 链路类型. &lt;br&gt;- 1: 电信&lt;br&gt;- 3: 电信、联通和移动&lt;br&gt;- 4: BGP 线路
     *
     * @return
     */
    public Integer getCarrier() {
        return carrier;
    }

    /**
     * set 链路类型. &lt;br&gt;- 1: 电信&lt;br&gt;- 3: 电信、联通和移动&lt;br&gt;- 4: BGP 线路
     *
     * @param carrier
     */
    public void setCarrier(Integer carrier) {
        this.carrier = carrier;
    }

    /**
     * get 可防护 IP 类型, 目前仅电信线路支持 IPV6 线路. &lt;br&gt;- 0: IPV4. &lt;br&gt;- 1: IPV4/IPV6
     *
     * @return
     */
    public Integer getIpType() {
        return ipType;
    }

    /**
     * set 可防护 IP 类型, 目前仅电信线路支持 IPV6 线路. &lt;br&gt;- 0: IPV4. &lt;br&gt;- 1: IPV4/IPV6
     *
     * @param ipType
     */
    public void setIpType(Integer ipType) {
        this.ipType = ipType;
    }

    /**
     * get IP 数量
     *
     * @return
     */
    public Integer getIpCount() {
        return ipCount;
    }

    /**
     * set IP 数量
     *
     * @param ipCount
     */
    public void setIpCount(Integer ipCount) {
        this.ipCount = ipCount;
    }

    /**
     * get 可配的转发端口数量
     *
     * @return
     */
    public Integer getPortCount() {
        return portCount;
    }

    /**
     * set 可配的转发端口数量
     *
     * @param portCount
     */
    public void setPortCount(Integer portCount) {
        this.portCount = portCount;
    }

    /**
     * get 可配的网站规则域名数量
     *
     * @return
     */
    public Integer getDomainCount() {
        return domainCount;
    }

    /**
     * set 可配的网站规则域名数量
     *
     * @param domainCount
     */
    public void setDomainCount(Integer domainCount) {
        this.domainCount = domainCount;
    }

    /**
     * get 触发弹性带宽的次数
     *
     * @return
     */
    public Integer getElasticTriggerCount() {
        return elasticTriggerCount;
    }

    /**
     * set 触发弹性带宽的次数
     *
     * @param elasticTriggerCount
     */
    public void setElasticTriggerCount(Integer elasticTriggerCount) {
        this.elasticTriggerCount = elasticTriggerCount;
    }

    /**
     * get 超峰次数
     *
     * @return
     */
    public Integer getAbovePeakCount() {
        return abovePeakCount;
    }

    /**
     * set 超峰次数
     *
     * @param abovePeakCount
     */
    public void setAbovePeakCount(Integer abovePeakCount) {
        this.abovePeakCount = abovePeakCount;
    }

    /**
     * get 保底带宽
     *
     * @return
     */
    public Integer getInBitslimit() {
        return inBitslimit;
    }

    /**
     * set 保底带宽
     *
     * @param inBitslimit
     */
    public void setInBitslimit(Integer inBitslimit) {
        this.inBitslimit = inBitslimit;
    }

    /**
     * get 弹性带宽
     *
     * @return
     */
    public Integer getResilientBitslimit() {
        return resilientBitslimit;
    }

    /**
     * set 弹性带宽
     *
     * @param resilientBitslimit
     */
    public void setResilientBitslimit(Integer resilientBitslimit) {
        this.resilientBitslimit = resilientBitslimit;
    }

    /**
     * get 业务带宽大小
     *
     * @return
     */
    public Integer getBusinessBitslimit() {
        return businessBitslimit;
    }

    /**
     * set 业务带宽大小
     *
     * @param businessBitslimit
     */
    public void setBusinessBitslimit(Integer businessBitslimit) {
        this.businessBitslimit = businessBitslimit;
    }

    /**
     * get CC 阈值大小
     *
     * @return
     */
    public Integer getCcThreshold() {
        return ccThreshold;
    }

    /**
     * set CC 阈值大小
     *
     * @param ccThreshold
     */
    public void setCcThreshold(Integer ccThreshold) {
        this.ccThreshold = ccThreshold;
    }

    /**
     * get CC 防护峰值, 单位: QPS
     *
     * @return
     */
    public Integer getCcPeakQPS() {
        return ccPeakQPS;
    }

    /**
     * set CC 防护峰值, 单位: QPS
     *
     * @param ccPeakQPS
     */
    public void setCcPeakQPS(Integer ccPeakQPS) {
        this.ccPeakQPS = ccPeakQPS;
    }

    /**
     * get 非网站类规则数
     *
     * @return
     */
    public Integer getRuleCount() {
        return ruleCount;
    }

    /**
     * set 非网站类规则数
     *
     * @param ruleCount
     */
    public void setRuleCount(Integer ruleCount) {
        this.ruleCount = ruleCount;
    }

    /**
     * get 网站类规则数
     *
     * @return
     */
    public Integer getWebRuleCount() {
        return webRuleCount;
    }

    /**
     * set 网站类规则数
     *
     * @param webRuleCount
     */
    public void setWebRuleCount(Integer webRuleCount) {
        this.webRuleCount = webRuleCount;
    }

    /**
     * get 防护调度规则数
     *
     * @return
     */
    public Integer getDispatchRuleCount() {
        return dispatchRuleCount;
    }

    /**
     * set 防护调度规则数
     *
     * @param dispatchRuleCount
     */
    public void setDispatchRuleCount(Integer dispatchRuleCount) {
        this.dispatchRuleCount = dispatchRuleCount;
    }

    /**
     * get 计费状态. &lt;br&gt;- PAID: 已支付&lt;br&gt;- ARREARS: 欠费&lt;br&gt;- EXPIRED: 过期
     *
     * @return
     */
    public String getChargeStatus() {
        return chargeStatus;
    }

    /**
     * set 计费状态. &lt;br&gt;- PAID: 已支付&lt;br&gt;- ARREARS: 欠费&lt;br&gt;- EXPIRED: 过期
     *
     * @param chargeStatus
     */
    public void setChargeStatus(String chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    /**
     * get 安全状态. &lt;br&gt;- SAFE: 安全&lt;br&gt;- CLEANING: 清洗中&lt;br&gt;- BLOCKING: 封禁中
     *
     * @return
     */
    public String getSecurityStatus() {
        return securityStatus;
    }

    /**
     * set 安全状态. &lt;br&gt;- SAFE: 安全&lt;br&gt;- CLEANING: 清洗中&lt;br&gt;- BLOCKING: 封禁中
     *
     * @param securityStatus
     */
    public void setSecurityStatus(String securityStatus) {
        this.securityStatus = securityStatus;
    }

    /**
     * get 实例的创建的时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 实例的创建的时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 实例的过期时间
     *
     * @return
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * set 实例的过期时间
     *
     * @param expireTime
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * get 资源 ID, 升级和续费时使用
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源 ID, 升级和续费时使用
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get CC 防护观察者模式. &lt;br&gt;- 0: 关闭 &lt;br&gt;- 1: 开启
     *
     * @return
     */
    public Integer getCcObserveMode() {
        return ccObserveMode;
    }

    /**
     * set CC 防护观察者模式. &lt;br&gt;- 0: 关闭 &lt;br&gt;- 1: 开启
     *
     * @param ccObserveMode
     */
    public void setCcObserveMode(Integer ccObserveMode) {
        this.ccObserveMode = ccObserveMode;
    }

    /**
     * get CC 防护模式. &lt;br&gt;- 0: 正常 &lt;br&gt;- 1: 紧急 &lt;br&gt;- 2: 宽松 &lt;br&gt;- 3: 自定义
     *
     * @return
     */
    public Integer getCcProtectMode() {
        return ccProtectMode;
    }

    /**
     * set CC 防护模式. &lt;br&gt;- 0: 正常 &lt;br&gt;- 1: 紧急 &lt;br&gt;- 2: 宽松 &lt;br&gt;- 3: 自定义
     *
     * @param ccProtectMode
     */
    public void setCcProtectMode(Integer ccProtectMode) {
        this.ccProtectMode = ccProtectMode;
    }

    /**
     * get CC 开关状态. &lt;br&gt;- 0: 关闭 &lt;br&gt;- 1: 开启
     *
     * @return
     */
    public Integer getCcProtectStatus() {
        return ccProtectStatus;
    }

    /**
     * set CC 开关状态. &lt;br&gt;- 0: 关闭 &lt;br&gt;- 1: 开启
     *
     * @param ccProtectStatus
     */
    public void setCcProtectStatus(Integer ccProtectStatus) {
        this.ccProtectStatus = ccProtectStatus;
    }

    /**
     * get CC 防护模式为自定义时的限速大小
     *
     * @return
     */
    public Integer getCcSpeedLimit() {
        return ccSpeedLimit;
    }

    /**
     * set CC 防护模式为自定义时的限速大小
     *
     * @param ccSpeedLimit
     */
    public void setCcSpeedLimit(Integer ccSpeedLimit) {
        this.ccSpeedLimit = ccSpeedLimit;
    }

    /**
     * get CC 防护模式为自定义时的限速周期
     *
     * @return
     */
    public Integer getCcSpeedPeriod() {
        return ccSpeedPeriod;
    }

    /**
     * set CC 防护模式为自定义时的限速周期
     *
     * @param ccSpeedPeriod
     */
    public void setCcSpeedPeriod(Integer ccSpeedPeriod) {
        this.ccSpeedPeriod = ccSpeedPeriod;
    }

    /**
     * get IP 黑名单列表
     *
     * @return
     */
    public List<String> getIpBlackList() {
        return ipBlackList;
    }

    /**
     * set IP 黑名单列表
     *
     * @param ipBlackList
     */
    public void setIpBlackList(List<String> ipBlackList) {
        this.ipBlackList = ipBlackList;
    }

    /**
     * get IP 黑名单状态. &lt;br&gt;- 0: 关闭 &lt;br&gt;- 1: 开启
     *
     * @return
     */
    public Integer getIpBlackStatus() {
        return ipBlackStatus;
    }

    /**
     * set IP 黑名单状态. &lt;br&gt;- 0: 关闭 &lt;br&gt;- 1: 开启
     *
     * @param ipBlackStatus
     */
    public void setIpBlackStatus(Integer ipBlackStatus) {
        this.ipBlackStatus = ipBlackStatus;
    }

    /**
     * get IP 白名单列表
     *
     * @return
     */
    public List<String> getIpWhiteList() {
        return ipWhiteList;
    }

    /**
     * set IP 白名单列表
     *
     * @param ipWhiteList
     */
    public void setIpWhiteList(List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }

    /**
     * get IP 白名单状态. &lt;br&gt;- 0: 关闭&lt;br&gt;- 1: 开启
     *
     * @return
     */
    public Integer getIpWhiteStatus() {
        return ipWhiteStatus;
    }

    /**
     * set IP 白名单状态. &lt;br&gt;- 0: 关闭&lt;br&gt;- 1: 开启
     *
     * @param ipWhiteStatus
     */
    public void setIpWhiteStatus(Integer ipWhiteStatus) {
        this.ipWhiteStatus = ipWhiteStatus;
    }

    /**
     * get url白名单列表
     *
     * @return
     */
    public List<String> getUrlWhitelist() {
        return urlWhitelist;
    }

    /**
     * set url白名单列表
     *
     * @param urlWhitelist
     */
    public void setUrlWhitelist(List<String> urlWhitelist) {
        this.urlWhitelist = urlWhitelist;
    }

    /**
     * get url白名单状态. &lt;br&gt;- 0: 关闭&lt;br&gt;- 1: 开启
     *
     * @return
     */
    public Integer getUrlWhitelistStatus() {
        return urlWhitelistStatus;
    }

    /**
     * set url白名单状态. &lt;br&gt;- 0: 关闭&lt;br&gt;- 1: 开启
     *
     * @param urlWhitelistStatus
     */
    public void setUrlWhitelistStatus(Integer urlWhitelistStatus) {
        this.urlWhitelistStatus = urlWhitelistStatus;
    }

    /**
     * get ccProtectMode为自定义模式时, 每个Host的防护阈值
     *
     * @return
     */
    public Integer getHostQps() {
        return hostQps;
    }

    /**
     * set ccProtectMode为自定义模式时, 每个Host的防护阈值
     *
     * @param hostQps
     */
    public void setHostQps(Integer hostQps) {
        this.hostQps = hostQps;
    }

    /**
     * get ccProtectMode为自定义模式时, 每个Host+URI的防护阈值
     *
     * @return
     */
    public Integer getHostUrlQps() {
        return hostUrlQps;
    }

    /**
     * set ccProtectMode为自定义模式时, 每个Host+URI的防护阈值
     *
     * @param hostUrlQps
     */
    public void setHostUrlQps(Integer hostUrlQps) {
        this.hostUrlQps = hostUrlQps;
    }

    /**
     * get ccProtectMode为自定义模式时, 每个源IP对Host的防护阈值
     *
     * @return
     */
    public Integer getIpHostQps() {
        return ipHostQps;
    }

    /**
     * set ccProtectMode为自定义模式时, 每个源IP对Host的防护阈值
     *
     * @param ipHostQps
     */
    public void setIpHostQps(Integer ipHostQps) {
        this.ipHostQps = ipHostQps;
    }

    /**
     * get ccProtectMode为自定义模式时, 每个源IP对Host+URI的防护阈值
     *
     * @return
     */
    public Integer getIpHostUrlQps() {
        return ipHostUrlQps;
    }

    /**
     * set ccProtectMode为自定义模式时, 每个源IP对Host+URI的防护阈值
     *
     * @param ipHostUrlQps
     */
    public void setIpHostUrlQps(Integer ipHostUrlQps) {
        this.ipHostUrlQps = ipHostUrlQps;
    }

    /**
     * get 关联的自定义页面id
     *
     * @return
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * set 关联的自定义页面id
     *
     * @param pageId
     */
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    /**
     * get 关联的自定义页面名称
     *
     * @return
     */
    public String getPageName() {
        return pageName;
    }

    /**
     * set 关联的自定义页面名称
     *
     * @param pageName
     */
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    /**
     * get 是否开启自定义页面, 关闭时透传状态码.  &lt;br&gt;- 0: 关闭&lt;br&gt;- 1: 开启
     *
     * @return
     */
    public Integer getPageStatus() {
        return pageStatus;
    }

    /**
     * set 是否开启自定义页面, 关闭时透传状态码.  &lt;br&gt;- 0: 关闭&lt;br&gt;- 1: 开启
     *
     * @param pageStatus
     */
    public void setPageStatus(Integer pageStatus) {
        this.pageStatus = pageStatus;
    }

    /**
     * get 每条网站规则可配的http/https端口数
     *
     * @return
     */
    public Integer getWebRulePortLimit() {
        return webRulePortLimit;
    }

    /**
     * set 每条网站规则可配的http/https端口数
     *
     * @param webRulePortLimit
     */
    public void setWebRulePortLimit(Integer webRulePortLimit) {
        this.webRulePortLimit = webRulePortLimit;
    }


    /**
     * set 实例 ID
     *
     * @param id
     */
    public Instance id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param name
     */
    public Instance name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 链路类型. &lt;br&gt;- 1: 电信&lt;br&gt;- 3: 电信、联通和移动&lt;br&gt;- 4: BGP 线路
     *
     * @param carrier
     */
    public Instance carrier(Integer carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * set 可防护 IP 类型, 目前仅电信线路支持 IPV6 线路. &lt;br&gt;- 0: IPV4. &lt;br&gt;- 1: IPV4/IPV6
     *
     * @param ipType
     */
    public Instance ipType(Integer ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * set IP 数量
     *
     * @param ipCount
     */
    public Instance ipCount(Integer ipCount) {
        this.ipCount = ipCount;
        return this;
    }

    /**
     * set 可配的转发端口数量
     *
     * @param portCount
     */
    public Instance portCount(Integer portCount) {
        this.portCount = portCount;
        return this;
    }

    /**
     * set 可配的网站规则域名数量
     *
     * @param domainCount
     */
    public Instance domainCount(Integer domainCount) {
        this.domainCount = domainCount;
        return this;
    }

    /**
     * set 触发弹性带宽的次数
     *
     * @param elasticTriggerCount
     */
    public Instance elasticTriggerCount(Integer elasticTriggerCount) {
        this.elasticTriggerCount = elasticTriggerCount;
        return this;
    }

    /**
     * set 超峰次数
     *
     * @param abovePeakCount
     */
    public Instance abovePeakCount(Integer abovePeakCount) {
        this.abovePeakCount = abovePeakCount;
        return this;
    }

    /**
     * set 保底带宽
     *
     * @param inBitslimit
     */
    public Instance inBitslimit(Integer inBitslimit) {
        this.inBitslimit = inBitslimit;
        return this;
    }

    /**
     * set 弹性带宽
     *
     * @param resilientBitslimit
     */
    public Instance resilientBitslimit(Integer resilientBitslimit) {
        this.resilientBitslimit = resilientBitslimit;
        return this;
    }

    /**
     * set 业务带宽大小
     *
     * @param businessBitslimit
     */
    public Instance businessBitslimit(Integer businessBitslimit) {
        this.businessBitslimit = businessBitslimit;
        return this;
    }

    /**
     * set CC 阈值大小
     *
     * @param ccThreshold
     */
    public Instance ccThreshold(Integer ccThreshold) {
        this.ccThreshold = ccThreshold;
        return this;
    }

    /**
     * set CC 防护峰值, 单位: QPS
     *
     * @param ccPeakQPS
     */
    public Instance ccPeakQPS(Integer ccPeakQPS) {
        this.ccPeakQPS = ccPeakQPS;
        return this;
    }

    /**
     * set 非网站类规则数
     *
     * @param ruleCount
     */
    public Instance ruleCount(Integer ruleCount) {
        this.ruleCount = ruleCount;
        return this;
    }

    /**
     * set 网站类规则数
     *
     * @param webRuleCount
     */
    public Instance webRuleCount(Integer webRuleCount) {
        this.webRuleCount = webRuleCount;
        return this;
    }

    /**
     * set 防护调度规则数
     *
     * @param dispatchRuleCount
     */
    public Instance dispatchRuleCount(Integer dispatchRuleCount) {
        this.dispatchRuleCount = dispatchRuleCount;
        return this;
    }

    /**
     * set 计费状态. &lt;br&gt;- PAID: 已支付&lt;br&gt;- ARREARS: 欠费&lt;br&gt;- EXPIRED: 过期
     *
     * @param chargeStatus
     */
    public Instance chargeStatus(String chargeStatus) {
        this.chargeStatus = chargeStatus;
        return this;
    }

    /**
     * set 安全状态. &lt;br&gt;- SAFE: 安全&lt;br&gt;- CLEANING: 清洗中&lt;br&gt;- BLOCKING: 封禁中
     *
     * @param securityStatus
     */
    public Instance securityStatus(String securityStatus) {
        this.securityStatus = securityStatus;
        return this;
    }

    /**
     * set 实例的创建的时间
     *
     * @param createTime
     */
    public Instance createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 实例的过期时间
     *
     * @param expireTime
     */
    public Instance expireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * set 资源 ID, 升级和续费时使用
     *
     * @param resourceId
     */
    public Instance resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set CC 防护观察者模式. &lt;br&gt;- 0: 关闭 &lt;br&gt;- 1: 开启
     *
     * @param ccObserveMode
     */
    public Instance ccObserveMode(Integer ccObserveMode) {
        this.ccObserveMode = ccObserveMode;
        return this;
    }

    /**
     * set CC 防护模式. &lt;br&gt;- 0: 正常 &lt;br&gt;- 1: 紧急 &lt;br&gt;- 2: 宽松 &lt;br&gt;- 3: 自定义
     *
     * @param ccProtectMode
     */
    public Instance ccProtectMode(Integer ccProtectMode) {
        this.ccProtectMode = ccProtectMode;
        return this;
    }

    /**
     * set CC 开关状态. &lt;br&gt;- 0: 关闭 &lt;br&gt;- 1: 开启
     *
     * @param ccProtectStatus
     */
    public Instance ccProtectStatus(Integer ccProtectStatus) {
        this.ccProtectStatus = ccProtectStatus;
        return this;
    }

    /**
     * set CC 防护模式为自定义时的限速大小
     *
     * @param ccSpeedLimit
     */
    public Instance ccSpeedLimit(Integer ccSpeedLimit) {
        this.ccSpeedLimit = ccSpeedLimit;
        return this;
    }

    /**
     * set CC 防护模式为自定义时的限速周期
     *
     * @param ccSpeedPeriod
     */
    public Instance ccSpeedPeriod(Integer ccSpeedPeriod) {
        this.ccSpeedPeriod = ccSpeedPeriod;
        return this;
    }

    /**
     * set IP 黑名单列表
     *
     * @param ipBlackList
     */
    public Instance ipBlackList(List<String> ipBlackList) {
        this.ipBlackList = ipBlackList;
        return this;
    }

    /**
     * set IP 黑名单状态. &lt;br&gt;- 0: 关闭 &lt;br&gt;- 1: 开启
     *
     * @param ipBlackStatus
     */
    public Instance ipBlackStatus(Integer ipBlackStatus) {
        this.ipBlackStatus = ipBlackStatus;
        return this;
    }

    /**
     * set IP 白名单列表
     *
     * @param ipWhiteList
     */
    public Instance ipWhiteList(List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }

    /**
     * set IP 白名单状态. &lt;br&gt;- 0: 关闭&lt;br&gt;- 1: 开启
     *
     * @param ipWhiteStatus
     */
    public Instance ipWhiteStatus(Integer ipWhiteStatus) {
        this.ipWhiteStatus = ipWhiteStatus;
        return this;
    }

    /**
     * set url白名单列表
     *
     * @param urlWhitelist
     */
    public Instance urlWhitelist(List<String> urlWhitelist) {
        this.urlWhitelist = urlWhitelist;
        return this;
    }

    /**
     * set url白名单状态. &lt;br&gt;- 0: 关闭&lt;br&gt;- 1: 开启
     *
     * @param urlWhitelistStatus
     */
    public Instance urlWhitelistStatus(Integer urlWhitelistStatus) {
        this.urlWhitelistStatus = urlWhitelistStatus;
        return this;
    }

    /**
     * set ccProtectMode为自定义模式时, 每个Host的防护阈值
     *
     * @param hostQps
     */
    public Instance hostQps(Integer hostQps) {
        this.hostQps = hostQps;
        return this;
    }

    /**
     * set ccProtectMode为自定义模式时, 每个Host+URI的防护阈值
     *
     * @param hostUrlQps
     */
    public Instance hostUrlQps(Integer hostUrlQps) {
        this.hostUrlQps = hostUrlQps;
        return this;
    }

    /**
     * set ccProtectMode为自定义模式时, 每个源IP对Host的防护阈值
     *
     * @param ipHostQps
     */
    public Instance ipHostQps(Integer ipHostQps) {
        this.ipHostQps = ipHostQps;
        return this;
    }

    /**
     * set ccProtectMode为自定义模式时, 每个源IP对Host+URI的防护阈值
     *
     * @param ipHostUrlQps
     */
    public Instance ipHostUrlQps(Integer ipHostUrlQps) {
        this.ipHostUrlQps = ipHostUrlQps;
        return this;
    }

    /**
     * set 关联的自定义页面id
     *
     * @param pageId
     */
    public Instance pageId(String pageId) {
        this.pageId = pageId;
        return this;
    }

    /**
     * set 关联的自定义页面名称
     *
     * @param pageName
     */
    public Instance pageName(String pageName) {
        this.pageName = pageName;
        return this;
    }

    /**
     * set 是否开启自定义页面, 关闭时透传状态码.  &lt;br&gt;- 0: 关闭&lt;br&gt;- 1: 开启
     *
     * @param pageStatus
     */
    public Instance pageStatus(Integer pageStatus) {
        this.pageStatus = pageStatus;
        return this;
    }

    /**
     * set 每条网站规则可配的http/https端口数
     *
     * @param webRulePortLimit
     */
    public Instance webRulePortLimit(Integer webRulePortLimit) {
        this.webRulePortLimit = webRulePortLimit;
        return this;
    }


    /**
     * add item to IP 黑名单列表
     *
     * @param ipBlackList
     */
    public void addIpBlackList(String ipBlackList) {
        if (this.ipBlackList == null) {
            this.ipBlackList = new ArrayList<>();
        }
        this.ipBlackList.add(ipBlackList);
    }

    /**
     * add item to IP 白名单列表
     *
     * @param ipWhiteList
     */
    public void addIpWhiteList(String ipWhiteList) {
        if (this.ipWhiteList == null) {
            this.ipWhiteList = new ArrayList<>();
        }
        this.ipWhiteList.add(ipWhiteList);
    }

    /**
     * add item to url白名单列表
     *
     * @param urlWhitelist
     */
    public void addUrlWhitelist(String urlWhitelist) {
        if (this.urlWhitelist == null) {
            this.urlWhitelist = new ArrayList<>();
        }
        this.urlWhitelist.add(urlWhitelist);
    }

}