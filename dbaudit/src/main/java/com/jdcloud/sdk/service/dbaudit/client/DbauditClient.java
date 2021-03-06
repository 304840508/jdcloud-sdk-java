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
 * Database Audit API
 * Database Audit API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbaudit.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.dbaudit.model.SetAuditConfigRequest;
import com.jdcloud.sdk.service.dbaudit.model.SetAuditConfigResponse;
import com.jdcloud.sdk.service.dbaudit.client.SetAuditConfigExecutor;
import com.jdcloud.sdk.service.dbaudit.model.EnableAuditResponseRequest;
import com.jdcloud.sdk.service.dbaudit.model.EnableAuditResponseResponse;
import com.jdcloud.sdk.service.dbaudit.client.EnableAuditResponseExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeIpWhiteListRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeIpWhiteListResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeIpWhiteListExecutor;
import com.jdcloud.sdk.service.dbaudit.model.AddMaskRuleRequest;
import com.jdcloud.sdk.service.dbaudit.model.AddMaskRuleResponse;
import com.jdcloud.sdk.service.dbaudit.client.AddMaskRuleExecutor;
import com.jdcloud.sdk.service.dbaudit.model.ModyfyAuditNetCardsRequest;
import com.jdcloud.sdk.service.dbaudit.model.ModyfyAuditNetCardsResponse;
import com.jdcloud.sdk.service.dbaudit.client.ModyfyAuditNetCardsExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeMaskRuleListRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeMaskRuleListResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeMaskRuleListExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DownloadReportRequest;
import com.jdcloud.sdk.service.dbaudit.model.DownloadReportResponse;
import com.jdcloud.sdk.service.dbaudit.client.DownloadReportExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DeleteDatabaseRequest;
import com.jdcloud.sdk.service.dbaudit.model.DeleteDatabaseResponse;
import com.jdcloud.sdk.service.dbaudit.client.DeleteDatabaseExecutor;
import com.jdcloud.sdk.service.dbaudit.model.AddRuleRequest;
import com.jdcloud.sdk.service.dbaudit.model.AddRuleResponse;
import com.jdcloud.sdk.service.dbaudit.client.AddRuleExecutor;
import com.jdcloud.sdk.service.dbaudit.model.ModifyInstanceRequest;
import com.jdcloud.sdk.service.dbaudit.model.ModifyInstanceResponse;
import com.jdcloud.sdk.service.dbaudit.client.ModifyInstanceExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DisableRuleGroupRequest;
import com.jdcloud.sdk.service.dbaudit.model.DisableRuleGroupResponse;
import com.jdcloud.sdk.service.dbaudit.client.DisableRuleGroupExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeAgentDatabasesRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeAgentDatabasesResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeAgentDatabasesExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeInstanceListRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeInstanceListResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeInstanceListExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeInstanceRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeInstanceResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeInstanceExecutor;
import com.jdcloud.sdk.service.dbaudit.model.StopTaskRequest;
import com.jdcloud.sdk.service.dbaudit.model.StopTaskResponse;
import com.jdcloud.sdk.service.dbaudit.client.StopTaskExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeAgentListRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeAgentListResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeAgentListExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeRuleGroupRulesRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeRuleGroupRulesResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeRuleGroupRulesExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeAuditLogRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeAuditLogResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeAuditLogExecutor;
import com.jdcloud.sdk.service.dbaudit.model.UninstallAgentRequest;
import com.jdcloud.sdk.service.dbaudit.model.UninstallAgentResponse;
import com.jdcloud.sdk.service.dbaudit.client.UninstallAgentExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DeleteRuleRequest;
import com.jdcloud.sdk.service.dbaudit.model.DeleteRuleResponse;
import com.jdcloud.sdk.service.dbaudit.client.DeleteRuleExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DeleteRuleGroupRequest;
import com.jdcloud.sdk.service.dbaudit.model.DeleteRuleGroupResponse;
import com.jdcloud.sdk.service.dbaudit.client.DeleteRuleGroupExecutor;
import com.jdcloud.sdk.service.dbaudit.model.ModifyMaskRequest;
import com.jdcloud.sdk.service.dbaudit.model.ModifyMaskResponse;
import com.jdcloud.sdk.service.dbaudit.client.ModifyMaskExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeRuleRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeRuleResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeRuleExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DeleteAuditFromAgentRequest;
import com.jdcloud.sdk.service.dbaudit.model.DeleteAuditFromAgentResponse;
import com.jdcloud.sdk.service.dbaudit.client.DeleteAuditFromAgentExecutor;
import com.jdcloud.sdk.service.dbaudit.model.StartTaskRequest;
import com.jdcloud.sdk.service.dbaudit.model.StartTaskResponse;
import com.jdcloud.sdk.service.dbaudit.client.StartTaskExecutor;
import com.jdcloud.sdk.service.dbaudit.model.AddRuleGroupRequest;
import com.jdcloud.sdk.service.dbaudit.model.AddRuleGroupResponse;
import com.jdcloud.sdk.service.dbaudit.client.AddRuleGroupExecutor;
import com.jdcloud.sdk.service.dbaudit.model.ModyfyAgentLimitsRequest;
import com.jdcloud.sdk.service.dbaudit.model.ModyfyAgentLimitsResponse;
import com.jdcloud.sdk.service.dbaudit.client.ModyfyAgentLimitsExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeAuditLogListRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeAuditLogListResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeAuditLogListExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeReportListRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeReportListResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeReportListExecutor;
import com.jdcloud.sdk.service.dbaudit.model.AddDatabaseRequest;
import com.jdcloud.sdk.service.dbaudit.model.AddDatabaseResponse;
import com.jdcloud.sdk.service.dbaudit.client.AddDatabaseExecutor;
import com.jdcloud.sdk.service.dbaudit.model.InstallAgentRequest;
import com.jdcloud.sdk.service.dbaudit.model.InstallAgentResponse;
import com.jdcloud.sdk.service.dbaudit.client.InstallAgentExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DeleteMaskRequest;
import com.jdcloud.sdk.service.dbaudit.model.DeleteMaskResponse;
import com.jdcloud.sdk.service.dbaudit.client.DeleteMaskExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeDatabaseRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeDatabaseResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeDatabaseExecutor;
import com.jdcloud.sdk.service.dbaudit.model.UpdateDatabaseRequest;
import com.jdcloud.sdk.service.dbaudit.model.UpdateDatabaseResponse;
import com.jdcloud.sdk.service.dbaudit.client.UpdateDatabaseExecutor;
import com.jdcloud.sdk.service.dbaudit.model.AddIpWhiteItemRequest;
import com.jdcloud.sdk.service.dbaudit.model.AddIpWhiteItemResponse;
import com.jdcloud.sdk.service.dbaudit.client.AddIpWhiteItemExecutor;
import com.jdcloud.sdk.service.dbaudit.model.ModifyTaskRequest;
import com.jdcloud.sdk.service.dbaudit.model.ModifyTaskResponse;
import com.jdcloud.sdk.service.dbaudit.client.ModifyTaskExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DisableAuditResponseRequest;
import com.jdcloud.sdk.service.dbaudit.model.DisableAuditResponseResponse;
import com.jdcloud.sdk.service.dbaudit.client.DisableAuditResponseExecutor;
import com.jdcloud.sdk.service.dbaudit.model.CreateTaskRequest;
import com.jdcloud.sdk.service.dbaudit.model.CreateTaskResponse;
import com.jdcloud.sdk.service.dbaudit.client.CreateTaskExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeDatabasesRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeDatabasesResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeDatabasesExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DeleteTaskRequest;
import com.jdcloud.sdk.service.dbaudit.model.DeleteTaskResponse;
import com.jdcloud.sdk.service.dbaudit.client.DeleteTaskExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeTaskListRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeTaskListResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeTaskListExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DeleteReportRequest;
import com.jdcloud.sdk.service.dbaudit.model.DeleteReportResponse;
import com.jdcloud.sdk.service.dbaudit.client.DeleteReportExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DeleteIpWhiteItemRequest;
import com.jdcloud.sdk.service.dbaudit.model.DeleteIpWhiteItemResponse;
import com.jdcloud.sdk.service.dbaudit.client.DeleteIpWhiteItemExecutor;
import com.jdcloud.sdk.service.dbaudit.model.EnableRuleGroupRequest;
import com.jdcloud.sdk.service.dbaudit.model.EnableRuleGroupResponse;
import com.jdcloud.sdk.service.dbaudit.client.EnableRuleGroupExecutor;
import com.jdcloud.sdk.service.dbaudit.model.ModifyRuleRequest;
import com.jdcloud.sdk.service.dbaudit.model.ModifyRuleResponse;
import com.jdcloud.sdk.service.dbaudit.client.ModifyRuleExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DeployRuleGroupRequest;
import com.jdcloud.sdk.service.dbaudit.model.DeployRuleGroupResponse;
import com.jdcloud.sdk.service.dbaudit.client.DeployRuleGroupExecutor;
import com.jdcloud.sdk.service.dbaudit.model.DescribeRuleGroupsRequest;
import com.jdcloud.sdk.service.dbaudit.model.DescribeRuleGroupsResponse;
import com.jdcloud.sdk.service.dbaudit.client.DescribeRuleGroupsExecutor;

/**
 * dbauditClient
 */
public class DbauditClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.3";
    public final static String DefaultEndpoint = "dbaudit.jdcloud-api.com";
    public final static String ServiceName = "dbaudit";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private DbauditClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 配置数据库审计信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SetAuditConfigResponse setAuditConfig(SetAuditConfigRequest request) throws JdcloudSdkException {
        return new SetAuditConfigExecutor().client(this).execute(request);
    }

    /**
     * 启用数据库的双向审计
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableAuditResponseResponse enableAuditResponse(EnableAuditResponseRequest request) throws JdcloudSdkException {
        return new EnableAuditResponseExecutor().client(this).execute(request);
    }

    /**
     * 获取此实例的所有IP白名单列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeIpWhiteListResponse describeIpWhiteList(DescribeIpWhiteListRequest request) throws JdcloudSdkException {
        return new DescribeIpWhiteListExecutor().client(this).execute(request);
    }

    /**
     * 添加敏感信息遮蔽规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddMaskRuleResponse addMaskRule(AddMaskRuleRequest request) throws JdcloudSdkException {
        return new AddMaskRuleExecutor().client(this).execute(request);
    }

    /**
     * 修改网卡信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModyfyAuditNetCardsResponse modyfyAuditNetCards(ModyfyAuditNetCardsRequest request) throws JdcloudSdkException {
        return new ModyfyAuditNetCardsExecutor().client(this).execute(request);
    }

    /**
     * 获取敏感信息遮蔽规则列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeMaskRuleListResponse describeMaskRuleList(DescribeMaskRuleListRequest request) throws JdcloudSdkException {
        return new DescribeMaskRuleListExecutor().client(this).execute(request);
    }

    /**
     * 下载此任务报表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DownloadReportResponse downloadReport(DownloadReportRequest request) throws JdcloudSdkException {
        return new DownloadReportExecutor().client(this).execute(request);
    }

    /**
     * 删除数据库配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) throws JdcloudSdkException {
        return new DeleteDatabaseExecutor().client(this).execute(request);
    }

    /**
     * 新增规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddRuleResponse addRule(AddRuleRequest request) throws JdcloudSdkException {
        return new AddRuleExecutor().client(this).execute(request);
    }

    /**
     * 修改数据库审计实例名称和描述
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws JdcloudSdkException {
        return new ModifyInstanceExecutor().client(this).execute(request);
    }

    /**
     * 禁用规则组
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableRuleGroupResponse disableRuleGroup(DisableRuleGroupRequest request) throws JdcloudSdkException {
        return new DisableRuleGroupExecutor().client(this).execute(request);
    }

    /**
     * 获取数据库审计agent审计的数据库列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAgentDatabasesResponse describeAgentDatabases(DescribeAgentDatabasesRequest request) throws JdcloudSdkException {
        return new DescribeAgentDatabasesExecutor().client(this).execute(request);
    }

    /**
     * 获取数据库审计实例列表
pageNumber: 页码
pageSize: 每页数量
nameFilter: 按名称查询
filters: 按instanceId 查询，只支持eq，单个instanceId匹配

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceListResponse describeInstanceList(DescribeInstanceListRequest request) throws JdcloudSdkException {
        return new DescribeInstanceListExecutor().client(this).execute(request);
    }

    /**
     * 获取数据库审计实例详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws JdcloudSdkException {
        return new DescribeInstanceExecutor().client(this).execute(request);
    }

    /**
     * 停止报表任务
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopTaskResponse stopTask(StopTaskRequest request) throws JdcloudSdkException {
        return new StopTaskExecutor().client(this).execute(request);
    }

    /**
     * 获取数据库审计agent主机列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAgentListResponse describeAgentList(DescribeAgentListRequest request) throws JdcloudSdkException {
        return new DescribeAgentListExecutor().client(this).execute(request);
    }

    /**
     * 获取规则组内规则列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRuleGroupRulesResponse describeRuleGroupRules(DescribeRuleGroupRulesRequest request) throws JdcloudSdkException {
        return new DescribeRuleGroupRulesExecutor().client(this).execute(request);
    }

    /**
     * 查看审计日志详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAuditLogResponse describeAuditLog(DescribeAuditLogRequest request) throws JdcloudSdkException {
        return new DescribeAuditLogExecutor().client(this).execute(request);
    }

    /**
     * 卸载agent，支持批量，多个ID用英文逗号分隔
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UninstallAgentResponse uninstallAgent(UninstallAgentRequest request) throws JdcloudSdkException {
        return new UninstallAgentExecutor().client(this).execute(request);
    }

    /**
     * 删除规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws JdcloudSdkException {
        return new DeleteRuleExecutor().client(this).execute(request);
    }

    /**
     * 删除规则组
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteRuleGroupResponse deleteRuleGroup(DeleteRuleGroupRequest request) throws JdcloudSdkException {
        return new DeleteRuleGroupExecutor().client(this).execute(request);
    }

    /**
     * 编辑敏感信息遮蔽规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyMaskResponse modifyMask(ModifyMaskRequest request) throws JdcloudSdkException {
        return new ModifyMaskExecutor().client(this).execute(request);
    }

    /**
     * 获取规则详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRuleResponse describeRule(DescribeRuleRequest request) throws JdcloudSdkException {
        return new DescribeRuleExecutor().client(this).execute(request);
    }

    /**
     * 取消对该数据库的审计，支持批量，多个ID用英文逗号分隔
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteAuditFromAgentResponse deleteAuditFromAgent(DeleteAuditFromAgentRequest request) throws JdcloudSdkException {
        return new DeleteAuditFromAgentExecutor().client(this).execute(request);
    }

    /**
     * 启动报表任务
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartTaskResponse startTask(StartTaskRequest request) throws JdcloudSdkException {
        return new StartTaskExecutor().client(this).execute(request);
    }

    /**
     * 新增规则组
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddRuleGroupResponse addRuleGroup(AddRuleGroupRequest request) throws JdcloudSdkException {
        return new AddRuleGroupExecutor().client(this).execute(request);
    }

    /**
     * 修改agent资源限额,支持多个agentId,英文逗号分隔
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModyfyAgentLimitsResponse modyfyAgentLimits(ModyfyAgentLimitsRequest request) throws JdcloudSdkException {
        return new ModyfyAgentLimitsExecutor().client(this).execute(request);
    }

    /**
     * 获取审计日志列表
时间范围[0-180天]

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAuditLogListResponse describeAuditLogList(DescribeAuditLogListRequest request) throws JdcloudSdkException {
        return new DescribeAuditLogListExecutor().client(this).execute(request);
    }

    /**
     * 获取任务下的报表列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeReportListResponse describeReportList(DescribeReportListRequest request) throws JdcloudSdkException {
        return new DescribeReportListExecutor().client(this).execute(request);
    }

    /**
     * 新建数据库配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddDatabaseResponse addDatabase(AddDatabaseRequest request) throws JdcloudSdkException {
        return new AddDatabaseExecutor().client(this).execute(request);
    }

    /**
     * 安装数据库审计agent
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public InstallAgentResponse installAgent(InstallAgentRequest request) throws JdcloudSdkException {
        return new InstallAgentExecutor().client(this).execute(request);
    }

    /**
     * 删除敏感信息遮蔽规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteMaskResponse deleteMask(DeleteMaskRequest request) throws JdcloudSdkException {
        return new DeleteMaskExecutor().client(this).execute(request);
    }

    /**
     * 获取数据库详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDatabaseResponse describeDatabase(DescribeDatabaseRequest request) throws JdcloudSdkException {
        return new DescribeDatabaseExecutor().client(this).execute(request);
    }

    /**
     * 修改数据库描述或配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request) throws JdcloudSdkException {
        return new UpdateDatabaseExecutor().client(this).execute(request);
    }

    /**
     * 添加一条IP白名单记录
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddIpWhiteItemResponse addIpWhiteItem(AddIpWhiteItemRequest request) throws JdcloudSdkException {
        return new AddIpWhiteItemExecutor().client(this).execute(request);
    }

    /**
     * 修改任务的配置信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyTaskResponse modifyTask(ModifyTaskRequest request) throws JdcloudSdkException {
        return new ModifyTaskExecutor().client(this).execute(request);
    }

    /**
     * 禁用数据库的双向审计
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableAuditResponseResponse disableAuditResponse(DisableAuditResponseRequest request) throws JdcloudSdkException {
        return new DisableAuditResponseExecutor().client(this).execute(request);
    }

    /**
     * 创建任务报表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) throws JdcloudSdkException {
        return new CreateTaskExecutor().client(this).execute(request);
    }

    /**
     * 获取数据库列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDatabasesResponse describeDatabases(DescribeDatabasesRequest request) throws JdcloudSdkException {
        return new DescribeDatabasesExecutor().client(this).execute(request);
    }

    /**
     * 删除此任务，如果任务下有报表，需要首先删除任务下的报表才能删除此任务
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) throws JdcloudSdkException {
        return new DeleteTaskExecutor().client(this).execute(request);
    }

    /**
     * 获取任务列表
一次性任务报表时间范围[0-30天]

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeTaskListResponse describeTaskList(DescribeTaskListRequest request) throws JdcloudSdkException {
        return new DescribeTaskListExecutor().client(this).execute(request);
    }

    /**
     * 删除此任务报表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteReportResponse deleteReport(DeleteReportRequest request) throws JdcloudSdkException {
        return new DeleteReportExecutor().client(this).execute(request);
    }

    /**
     * 删除一条IP白名单记录
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteIpWhiteItemResponse deleteIpWhiteItem(DeleteIpWhiteItemRequest request) throws JdcloudSdkException {
        return new DeleteIpWhiteItemExecutor().client(this).execute(request);
    }

    /**
     * 启用规则组
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableRuleGroupResponse enableRuleGroup(EnableRuleGroupRequest request) throws JdcloudSdkException {
        return new EnableRuleGroupExecutor().client(this).execute(request);
    }

    /**
     * 编辑规则组内的规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyRuleResponse modifyRule(ModifyRuleRequest request) throws JdcloudSdkException {
        return new ModifyRuleExecutor().client(this).execute(request);
    }

    /**
     * 下发规则组到指定dbIds
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeployRuleGroupResponse deployRuleGroup(DeployRuleGroupRequest request) throws JdcloudSdkException {
        return new DeployRuleGroupExecutor().client(this).execute(request);
    }

    /**
     * 获取规则组列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRuleGroupsResponse describeRuleGroups(DescribeRuleGroupsRequest request) throws JdcloudSdkException {
        return new DescribeRuleGroupsExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public DbauditClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private DbauditClient dbauditClient;

        public DefaultBuilder() {
            dbauditClient = new DbauditClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            dbauditClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            dbauditClient.httpRequestConfig = config;
            return this;
        }

        public DbauditClient build() throws JdcloudSdkException {

            if (dbauditClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                dbauditClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (dbauditClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("DbauditClient build error: jdcloud credentials provider not set");
                }
            }
            if (dbauditClient.httpRequestConfig == null) {
                dbauditClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (dbauditClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("DbauditClient build error: http request config not set");
                }
            }
            return dbauditClient;
        }

        public Builder environment(Environment environment) {
            dbauditClient.environment = environment;
            return this;
        }
    }
}
