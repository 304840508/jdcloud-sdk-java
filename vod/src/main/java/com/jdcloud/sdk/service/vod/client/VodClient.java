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
 * Video-on-Demand
 * 视频点播相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.vod.model.BatchSubmitQualityDetectionJobsRequest;
import com.jdcloud.sdk.service.vod.model.BatchSubmitQualityDetectionJobsResponse;
import com.jdcloud.sdk.service.vod.client.BatchSubmitQualityDetectionJobsExecutor;
import com.jdcloud.sdk.service.vod.model.DeleteTranscodeTemplateRequest;
import com.jdcloud.sdk.service.vod.model.DeleteTranscodeTemplateResponse;
import com.jdcloud.sdk.service.vod.client.DeleteTranscodeTemplateExecutor;
import com.jdcloud.sdk.service.vod.model.UpdateWatermarkRequest;
import com.jdcloud.sdk.service.vod.model.UpdateWatermarkResponse;
import com.jdcloud.sdk.service.vod.client.UpdateWatermarkExecutor;
import com.jdcloud.sdk.service.vod.model.ListDomainsRequest;
import com.jdcloud.sdk.service.vod.model.ListDomainsResponse;
import com.jdcloud.sdk.service.vod.client.ListDomainsExecutor;
import com.jdcloud.sdk.service.vod.model.CreateVideoUploadTaskRequest;
import com.jdcloud.sdk.service.vod.model.CreateVideoUploadTaskResponse;
import com.jdcloud.sdk.service.vod.client.CreateVideoUploadTaskExecutor;
import com.jdcloud.sdk.service.vod.model.GetURLRuleRequest;
import com.jdcloud.sdk.service.vod.model.GetURLRuleResponse;
import com.jdcloud.sdk.service.vod.client.GetURLRuleExecutor;
import com.jdcloud.sdk.service.vod.model.ListHeadersRequest;
import com.jdcloud.sdk.service.vod.model.ListHeadersResponse;
import com.jdcloud.sdk.service.vod.client.ListHeadersExecutor;
import com.jdcloud.sdk.service.vod.model.SetURLRuleRequest;
import com.jdcloud.sdk.service.vod.model.SetURLRuleResponse;
import com.jdcloud.sdk.service.vod.client.SetURLRuleExecutor;
import com.jdcloud.sdk.service.vod.model.GetCategoryWithChildrenRequest;
import com.jdcloud.sdk.service.vod.model.GetCategoryWithChildrenResponse;
import com.jdcloud.sdk.service.vod.client.GetCategoryWithChildrenExecutor;
import com.jdcloud.sdk.service.vod.model.GetTranscodeJobSummariesRequest;
import com.jdcloud.sdk.service.vod.model.GetTranscodeJobSummariesResponse;
import com.jdcloud.sdk.service.vod.client.GetTranscodeJobSummariesExecutor;
import com.jdcloud.sdk.service.vod.model.ListTranscodeTemplatesRequest;
import com.jdcloud.sdk.service.vod.model.ListTranscodeTemplatesResponse;
import com.jdcloud.sdk.service.vod.client.ListTranscodeTemplatesExecutor;
import com.jdcloud.sdk.service.vod.model.GetTranscodeSummariesRequest;
import com.jdcloud.sdk.service.vod.model.GetTranscodeSummariesResponse;
import com.jdcloud.sdk.service.vod.client.GetTranscodeSummariesExecutor;
import com.jdcloud.sdk.service.vod.model.GetCategoryRequest;
import com.jdcloud.sdk.service.vod.model.GetCategoryResponse;
import com.jdcloud.sdk.service.vod.client.GetCategoryExecutor;
import com.jdcloud.sdk.service.vod.model.CreateDomainRequest;
import com.jdcloud.sdk.service.vod.model.CreateDomainResponse;
import com.jdcloud.sdk.service.vod.client.CreateDomainExecutor;
import com.jdcloud.sdk.service.vod.model.DeleteWatermarkRequest;
import com.jdcloud.sdk.service.vod.model.DeleteWatermarkResponse;
import com.jdcloud.sdk.service.vod.client.DeleteWatermarkExecutor;
import com.jdcloud.sdk.service.vod.model.SubmitTranscodeJobRequest;
import com.jdcloud.sdk.service.vod.model.SubmitTranscodeJobResponse;
import com.jdcloud.sdk.service.vod.client.SubmitTranscodeJobExecutor;
import com.jdcloud.sdk.service.vod.model.UpdateTranscodeTemplateRequest;
import com.jdcloud.sdk.service.vod.model.UpdateTranscodeTemplateResponse;
import com.jdcloud.sdk.service.vod.client.UpdateTranscodeTemplateExecutor;
import com.jdcloud.sdk.service.vod.model.ListQualityDetectionTemplatesRequest;
import com.jdcloud.sdk.service.vod.model.ListQualityDetectionTemplatesResponse;
import com.jdcloud.sdk.service.vod.client.ListQualityDetectionTemplatesExecutor;
import com.jdcloud.sdk.service.vod.model.BatchUpdateVideosRequest;
import com.jdcloud.sdk.service.vod.model.BatchUpdateVideosResponse;
import com.jdcloud.sdk.service.vod.client.BatchUpdateVideosExecutor;
import com.jdcloud.sdk.service.vod.model.CreateImageUploadTaskRequest;
import com.jdcloud.sdk.service.vod.model.CreateImageUploadTaskResponse;
import com.jdcloud.sdk.service.vod.client.CreateImageUploadTaskExecutor;
import com.jdcloud.sdk.service.vod.model.UpdateQualityDetectionTemplateRequest;
import com.jdcloud.sdk.service.vod.model.UpdateQualityDetectionTemplateResponse;
import com.jdcloud.sdk.service.vod.client.UpdateQualityDetectionTemplateExecutor;
import com.jdcloud.sdk.service.vod.model.GetDomainRequest;
import com.jdcloud.sdk.service.vod.model.GetDomainResponse;
import com.jdcloud.sdk.service.vod.client.GetDomainExecutor;
import com.jdcloud.sdk.service.vod.model.ListSnapshotTemplatesRequest;
import com.jdcloud.sdk.service.vod.model.ListSnapshotTemplatesResponse;
import com.jdcloud.sdk.service.vod.client.ListSnapshotTemplatesExecutor;
import com.jdcloud.sdk.service.vod.model.GetWatermarkRequest;
import com.jdcloud.sdk.service.vod.model.GetWatermarkResponse;
import com.jdcloud.sdk.service.vod.client.GetWatermarkExecutor;
import com.jdcloud.sdk.service.vod.model.DeleteVideoStreamsRequest;
import com.jdcloud.sdk.service.vod.model.DeleteVideoStreamsResponse;
import com.jdcloud.sdk.service.vod.client.DeleteVideoStreamsExecutor;
import com.jdcloud.sdk.service.vod.model.BatchSubmitTranscodeJobsRequest;
import com.jdcloud.sdk.service.vod.model.BatchSubmitTranscodeJobsResponse;
import com.jdcloud.sdk.service.vod.client.BatchSubmitTranscodeJobsExecutor;
import com.jdcloud.sdk.service.vod.model.SetIPRuleRequest;
import com.jdcloud.sdk.service.vod.model.SetIPRuleResponse;
import com.jdcloud.sdk.service.vod.client.SetIPRuleExecutor;
import com.jdcloud.sdk.service.vod.model.UpdateVideoRequest;
import com.jdcloud.sdk.service.vod.model.UpdateVideoResponse;
import com.jdcloud.sdk.service.vod.client.UpdateVideoExecutor;
import com.jdcloud.sdk.service.vod.model.SetDefaultDomainRequest;
import com.jdcloud.sdk.service.vod.model.SetDefaultDomainResponse;
import com.jdcloud.sdk.service.vod.client.SetDefaultDomainExecutor;
import com.jdcloud.sdk.service.vod.model.GetTranscodeTemplateRequest;
import com.jdcloud.sdk.service.vod.model.GetTranscodeTemplateResponse;
import com.jdcloud.sdk.service.vod.client.GetTranscodeTemplateExecutor;
import com.jdcloud.sdk.service.vod.model.DeleteCategoryRequest;
import com.jdcloud.sdk.service.vod.model.DeleteCategoryResponse;
import com.jdcloud.sdk.service.vod.client.DeleteCategoryExecutor;
import com.jdcloud.sdk.service.vod.model.GetVideoPlayInfoRequest;
import com.jdcloud.sdk.service.vod.model.GetVideoPlayInfoResponse;
import com.jdcloud.sdk.service.vod.client.GetVideoPlayInfoExecutor;
import com.jdcloud.sdk.service.vod.model.DeleteHeaderRequest;
import com.jdcloud.sdk.service.vod.model.DeleteHeaderResponse;
import com.jdcloud.sdk.service.vod.client.DeleteHeaderExecutor;
import com.jdcloud.sdk.service.vod.model.UpdateCategoryRequest;
import com.jdcloud.sdk.service.vod.model.UpdateCategoryResponse;
import com.jdcloud.sdk.service.vod.client.UpdateCategoryExecutor;
import com.jdcloud.sdk.service.vod.model.DeleteSnapshotTemplateRequest;
import com.jdcloud.sdk.service.vod.model.DeleteSnapshotTemplateResponse;
import com.jdcloud.sdk.service.vod.client.DeleteSnapshotTemplateExecutor;
import com.jdcloud.sdk.service.vod.model.SetRefererRuleRequest;
import com.jdcloud.sdk.service.vod.model.SetRefererRuleResponse;
import com.jdcloud.sdk.service.vod.client.SetRefererRuleExecutor;
import com.jdcloud.sdk.service.vod.model.CreateQualityDetectionTemplateRequest;
import com.jdcloud.sdk.service.vod.model.CreateQualityDetectionTemplateResponse;
import com.jdcloud.sdk.service.vod.client.CreateQualityDetectionTemplateExecutor;
import com.jdcloud.sdk.service.vod.model.GetRefererRuleRequest;
import com.jdcloud.sdk.service.vod.model.GetRefererRuleResponse;
import com.jdcloud.sdk.service.vod.client.GetRefererRuleExecutor;
import com.jdcloud.sdk.service.vod.model.GetQualityDetectionTemplateRequest;
import com.jdcloud.sdk.service.vod.model.GetQualityDetectionTemplateResponse;
import com.jdcloud.sdk.service.vod.client.GetQualityDetectionTemplateExecutor;
import com.jdcloud.sdk.service.vod.model.DeleteDomainRequest;
import com.jdcloud.sdk.service.vod.model.DeleteDomainResponse;
import com.jdcloud.sdk.service.vod.client.DeleteDomainExecutor;
import com.jdcloud.sdk.service.vod.model.CreateLiveToVodTaskRequest;
import com.jdcloud.sdk.service.vod.model.CreateLiveToVodTaskResponse;
import com.jdcloud.sdk.service.vod.client.CreateLiveToVodTaskExecutor;
import com.jdcloud.sdk.service.vod.model.CreateCategoryRequest;
import com.jdcloud.sdk.service.vod.model.CreateCategoryResponse;
import com.jdcloud.sdk.service.vod.client.CreateCategoryExecutor;
import com.jdcloud.sdk.service.vod.model.VideoAuditRequest;
import com.jdcloud.sdk.service.vod.model.VideoAuditResponse;
import com.jdcloud.sdk.service.vod.client.VideoAuditExecutor;
import com.jdcloud.sdk.service.vod.model.ListWatermarksRequest;
import com.jdcloud.sdk.service.vod.model.ListWatermarksResponse;
import com.jdcloud.sdk.service.vod.client.ListWatermarksExecutor;
import com.jdcloud.sdk.service.vod.model.GetHttpSslRequest;
import com.jdcloud.sdk.service.vod.model.GetHttpSslResponse;
import com.jdcloud.sdk.service.vod.client.GetHttpSslExecutor;
import com.jdcloud.sdk.service.vod.model.SetHeaderRequest;
import com.jdcloud.sdk.service.vod.model.SetHeaderResponse;
import com.jdcloud.sdk.service.vod.client.SetHeaderExecutor;
import com.jdcloud.sdk.service.vod.model.RefreshVideoUploadTaskRequest;
import com.jdcloud.sdk.service.vod.model.RefreshVideoUploadTaskResponse;
import com.jdcloud.sdk.service.vod.client.RefreshVideoUploadTaskExecutor;
import com.jdcloud.sdk.service.vod.model.GetVideoRequest;
import com.jdcloud.sdk.service.vod.model.GetVideoResponse;
import com.jdcloud.sdk.service.vod.client.GetVideoExecutor;
import com.jdcloud.sdk.service.vod.model.ListVideosRequest;
import com.jdcloud.sdk.service.vod.model.ListVideosResponse;
import com.jdcloud.sdk.service.vod.client.ListVideosExecutor;
import com.jdcloud.sdk.service.vod.model.GetSnapshotTemplateRequest;
import com.jdcloud.sdk.service.vod.model.GetSnapshotTemplateResponse;
import com.jdcloud.sdk.service.vod.client.GetSnapshotTemplateExecutor;
import com.jdcloud.sdk.service.vod.model.CreateWatermarkRequest;
import com.jdcloud.sdk.service.vod.model.CreateWatermarkResponse;
import com.jdcloud.sdk.service.vod.client.CreateWatermarkExecutor;
import com.jdcloud.sdk.service.vod.model.DeleteVideoRequest;
import com.jdcloud.sdk.service.vod.model.DeleteVideoResponse;
import com.jdcloud.sdk.service.vod.client.DeleteVideoExecutor;
import com.jdcloud.sdk.service.vod.model.UpdateSnapshotTemplateRequest;
import com.jdcloud.sdk.service.vod.model.UpdateSnapshotTemplateResponse;
import com.jdcloud.sdk.service.vod.client.UpdateSnapshotTemplateExecutor;
import com.jdcloud.sdk.service.vod.model.GetTranscodeTaskSummariesRequest;
import com.jdcloud.sdk.service.vod.model.GetTranscodeTaskSummariesResponse;
import com.jdcloud.sdk.service.vod.client.GetTranscodeTaskSummariesExecutor;
import com.jdcloud.sdk.service.vod.model.SubmitQualityDetectionJobRequest;
import com.jdcloud.sdk.service.vod.model.SubmitQualityDetectionJobResponse;
import com.jdcloud.sdk.service.vod.client.SubmitQualityDetectionJobExecutor;
import com.jdcloud.sdk.service.vod.model.CreateSnapshotTemplateRequest;
import com.jdcloud.sdk.service.vod.model.CreateSnapshotTemplateResponse;
import com.jdcloud.sdk.service.vod.client.CreateSnapshotTemplateExecutor;
import com.jdcloud.sdk.service.vod.model.GetIPRuleRequest;
import com.jdcloud.sdk.service.vod.model.GetIPRuleResponse;
import com.jdcloud.sdk.service.vod.client.GetIPRuleExecutor;
import com.jdcloud.sdk.service.vod.model.EnableDomainRequest;
import com.jdcloud.sdk.service.vod.model.EnableDomainResponse;
import com.jdcloud.sdk.service.vod.client.EnableDomainExecutor;
import com.jdcloud.sdk.service.vod.model.SetHttpSslRequest;
import com.jdcloud.sdk.service.vod.model.SetHttpSslResponse;
import com.jdcloud.sdk.service.vod.client.SetHttpSslExecutor;
import com.jdcloud.sdk.service.vod.model.CreateTranscodeTemplateRequest;
import com.jdcloud.sdk.service.vod.model.CreateTranscodeTemplateResponse;
import com.jdcloud.sdk.service.vod.client.CreateTranscodeTemplateExecutor;
import com.jdcloud.sdk.service.vod.model.ListCategoriesRequest;
import com.jdcloud.sdk.service.vod.model.ListCategoriesResponse;
import com.jdcloud.sdk.service.vod.client.ListCategoriesExecutor;
import com.jdcloud.sdk.service.vod.model.BatchDeleteVideosRequest;
import com.jdcloud.sdk.service.vod.model.BatchDeleteVideosResponse;
import com.jdcloud.sdk.service.vod.client.BatchDeleteVideosExecutor;
import com.jdcloud.sdk.service.vod.model.DisableDomainRequest;
import com.jdcloud.sdk.service.vod.model.DisableDomainResponse;
import com.jdcloud.sdk.service.vod.client.DisableDomainExecutor;
import com.jdcloud.sdk.service.vod.model.DeleteQualityDetectionTemplateRequest;
import com.jdcloud.sdk.service.vod.model.DeleteQualityDetectionTemplateResponse;
import com.jdcloud.sdk.service.vod.client.DeleteQualityDetectionTemplateExecutor;

/**
 * vodClient
 */
public class VodClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.3";
    public final static String DefaultEndpoint = "vod.jdcloud-api.com";
    public final static String ServiceName = "vod";
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

    private VodClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 批量提交质检作业
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public BatchSubmitQualityDetectionJobsResponse batchSubmitQualityDetectionJobs(BatchSubmitQualityDetectionJobsRequest request) throws JdcloudSdkException {
        return new BatchSubmitQualityDetectionJobsExecutor().client(this).execute(request);
    }

    /**
     * 删除转码模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteTranscodeTemplateResponse deleteTranscodeTemplate(DeleteTranscodeTemplateRequest request) throws JdcloudSdkException {
        return new DeleteTranscodeTemplateExecutor().client(this).execute(request);
    }

    /**
     * 修改水印
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateWatermarkResponse updateWatermark(UpdateWatermarkRequest request) throws JdcloudSdkException {
        return new UpdateWatermarkExecutor().client(this).execute(request);
    }

    /**
     * 查询域名列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListDomainsResponse listDomains(ListDomainsRequest request) throws JdcloudSdkException {
        return new ListDomainsExecutor().client(this).execute(request);
    }

    /**
     * 获取视频上传地址和凭证
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVideoUploadTaskResponse createVideoUploadTask(CreateVideoUploadTaskRequest request) throws JdcloudSdkException {
        return new CreateVideoUploadTaskExecutor().client(this).execute(request);
    }

    /**
     * 查询CDN域名URL鉴权规则配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetURLRuleResponse getURLRule(GetURLRuleRequest request) throws JdcloudSdkException {
        return new GetURLRuleExecutor().client(this).execute(request);
    }

    /**
     * 查询域名访问头参数列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListHeadersResponse listHeaders(ListHeadersRequest request) throws JdcloudSdkException {
        return new ListHeadersExecutor().client(this).execute(request);
    }

    /**
     * 设置CDN域名URL鉴权规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SetURLRuleResponse setURLRule(SetURLRuleRequest request) throws JdcloudSdkException {
        return new SetURLRuleExecutor().client(this).execute(request);
    }

    /**
     * 查询分类及其子分类，若指定的分类ID为0，则返回一个根分类及其子分类（即一级分类）.
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetCategoryWithChildrenResponse getCategoryWithChildren(GetCategoryWithChildrenRequest request) throws JdcloudSdkException {
        return new GetCategoryWithChildrenExecutor().client(this).execute(request);
    }

    /**
     * 查询转码作业摘要
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetTranscodeJobSummariesResponse getTranscodeJobSummaries(GetTranscodeJobSummariesRequest request) throws JdcloudSdkException {
        return new GetTranscodeJobSummariesExecutor().client(this).execute(request);
    }

    /**
     * 查询转码模板列表。
允许通过条件过滤查询，支持的过滤字段如下：
  - source[eq] 按模板来源精确查询
  - templateType[eq] 按模板类型精确查询

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListTranscodeTemplatesResponse listTranscodeTemplates(ListTranscodeTemplatesRequest request) throws JdcloudSdkException {
        return new ListTranscodeTemplatesExecutor().client(this).execute(request);
    }

    /**
     * 查询视频转码摘要
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetTranscodeSummariesResponse getTranscodeSummaries(GetTranscodeSummariesRequest request) throws JdcloudSdkException {
        return new GetTranscodeSummariesExecutor().client(this).execute(request);
    }

    /**
     * 查询分类
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetCategoryResponse getCategory(GetCategoryRequest request) throws JdcloudSdkException {
        return new GetCategoryExecutor().client(this).execute(request);
    }

    /**
     * 添加域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) throws JdcloudSdkException {
        return new CreateDomainExecutor().client(this).execute(request);
    }

    /**
     * 删除水印
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteWatermarkResponse deleteWatermark(DeleteWatermarkRequest request) throws JdcloudSdkException {
        return new DeleteWatermarkExecutor().client(this).execute(request);
    }

    /**
     * 提交转码作业
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SubmitTranscodeJobResponse submitTranscodeJob(SubmitTranscodeJobRequest request) throws JdcloudSdkException {
        return new SubmitTranscodeJobExecutor().client(this).execute(request);
    }

    /**
     * 修改转码模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateTranscodeTemplateResponse updateTranscodeTemplate(UpdateTranscodeTemplateRequest request) throws JdcloudSdkException {
        return new UpdateTranscodeTemplateExecutor().client(this).execute(request);
    }

    /**
     * 查询质测模板列表。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListQualityDetectionTemplatesResponse listQualityDetectionTemplates(ListQualityDetectionTemplatesRequest request) throws JdcloudSdkException {
        return new ListQualityDetectionTemplatesExecutor().client(this).execute(request);
    }

    /**
     * 批量修改视频信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public BatchUpdateVideosResponse batchUpdateVideos(BatchUpdateVideosRequest request) throws JdcloudSdkException {
        return new BatchUpdateVideosExecutor().client(this).execute(request);
    }

    /**
     * 获取图片上传地址和凭证
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateImageUploadTaskResponse createImageUploadTask(CreateImageUploadTaskRequest request) throws JdcloudSdkException {
        return new CreateImageUploadTaskExecutor().client(this).execute(request);
    }

    /**
     * 修改质检模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateQualityDetectionTemplateResponse updateQualityDetectionTemplate(UpdateQualityDetectionTemplateRequest request) throws JdcloudSdkException {
        return new UpdateQualityDetectionTemplateExecutor().client(this).execute(request);
    }

    /**
     * 查询域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetDomainResponse getDomain(GetDomainRequest request) throws JdcloudSdkException {
        return new GetDomainExecutor().client(this).execute(request);
    }

    /**
     * 查询截图模板列表。
允许通过条件过滤查询，支持的过滤字段如下：
  - templateType[eq] 按模板类型精确查询

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListSnapshotTemplatesResponse listSnapshotTemplates(ListSnapshotTemplatesRequest request) throws JdcloudSdkException {
        return new ListSnapshotTemplatesExecutor().client(this).execute(request);
    }

    /**
     * 查询水印
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetWatermarkResponse getWatermark(GetWatermarkRequest request) throws JdcloudSdkException {
        return new GetWatermarkExecutor().client(this).execute(request);
    }

    /**
     * 删除视频转码流
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVideoStreamsResponse deleteVideoStreams(DeleteVideoStreamsRequest request) throws JdcloudSdkException {
        return new DeleteVideoStreamsExecutor().client(this).execute(request);
    }

    /**
     * 批量提交转码作业
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public BatchSubmitTranscodeJobsResponse batchSubmitTranscodeJobs(BatchSubmitTranscodeJobsRequest request) throws JdcloudSdkException {
        return new BatchSubmitTranscodeJobsExecutor().client(this).execute(request);
    }

    /**
     * 设置CDN域名IP黑名单规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SetIPRuleResponse setIPRule(SetIPRuleRequest request) throws JdcloudSdkException {
        return new SetIPRuleExecutor().client(this).execute(request);
    }

    /**
     * 修改视频信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateVideoResponse updateVideo(UpdateVideoRequest request) throws JdcloudSdkException {
        return new UpdateVideoExecutor().client(this).execute(request);
    }

    /**
     * 设为默认域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SetDefaultDomainResponse setDefaultDomain(SetDefaultDomainRequest request) throws JdcloudSdkException {
        return new SetDefaultDomainExecutor().client(this).execute(request);
    }

    /**
     * 查询转码模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetTranscodeTemplateResponse getTranscodeTemplate(GetTranscodeTemplateRequest request) throws JdcloudSdkException {
        return new GetTranscodeTemplateExecutor().client(this).execute(request);
    }

    /**
     * 删除分类
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request) throws JdcloudSdkException {
        return new DeleteCategoryExecutor().client(this).execute(request);
    }

    /**
     * 获取视频播放信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVideoPlayInfoResponse getVideoPlayInfo(GetVideoPlayInfoRequest request) throws JdcloudSdkException {
        return new GetVideoPlayInfoExecutor().client(this).execute(request);
    }

    /**
     * 删除域名访问头参数
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteHeaderResponse deleteHeader(DeleteHeaderRequest request) throws JdcloudSdkException {
        return new DeleteHeaderExecutor().client(this).execute(request);
    }

    /**
     * 修改分类
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request) throws JdcloudSdkException {
        return new UpdateCategoryExecutor().client(this).execute(request);
    }

    /**
     * 删除截图模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteSnapshotTemplateResponse deleteSnapshotTemplate(DeleteSnapshotTemplateRequest request) throws JdcloudSdkException {
        return new DeleteSnapshotTemplateExecutor().client(this).execute(request);
    }

    /**
     * 设置CDN域名Referer防盗链规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SetRefererRuleResponse setRefererRule(SetRefererRuleRequest request) throws JdcloudSdkException {
        return new SetRefererRuleExecutor().client(this).execute(request);
    }

    /**
     * 创建质检模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateQualityDetectionTemplateResponse createQualityDetectionTemplate(CreateQualityDetectionTemplateRequest request) throws JdcloudSdkException {
        return new CreateQualityDetectionTemplateExecutor().client(this).execute(request);
    }

    /**
     * 查询CDN域名Referer防盗链规则配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetRefererRuleResponse getRefererRule(GetRefererRuleRequest request) throws JdcloudSdkException {
        return new GetRefererRuleExecutor().client(this).execute(request);
    }

    /**
     * 查询质检模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetQualityDetectionTemplateResponse getQualityDetectionTemplate(GetQualityDetectionTemplateRequest request) throws JdcloudSdkException {
        return new GetQualityDetectionTemplateExecutor().client(this).execute(request);
    }

    /**
     * 删除域名。执行该操作，需确保域名已被停用。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws JdcloudSdkException {
        return new DeleteDomainExecutor().client(this).execute(request);
    }

    /**
     * 创建直播转点播任务
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateLiveToVodTaskResponse createLiveToVodTask(CreateLiveToVodTaskRequest request) throws JdcloudSdkException {
        return new CreateLiveToVodTaskExecutor().client(this).execute(request);
    }

    /**
     * 添加分类
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateCategoryResponse createCategory(CreateCategoryRequest request) throws JdcloudSdkException {
        return new CreateCategoryExecutor().client(this).execute(request);
    }

    /**
     * 视频审核
视频在上传中或者转码中不允许更改视频审核状态，即视频只有在正常或屏蔽状态下才可以调用此接口设置审核状态

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public VideoAuditResponse videoAudit(VideoAuditRequest request) throws JdcloudSdkException {
        return new VideoAuditExecutor().client(this).execute(request);
    }

    /**
     * 查询水印列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListWatermarksResponse listWatermarks(ListWatermarksRequest request) throws JdcloudSdkException {
        return new ListWatermarksExecutor().client(this).execute(request);
    }

    /**
     * 查询CDN域名SSL配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetHttpSslResponse getHttpSsl(GetHttpSslRequest request) throws JdcloudSdkException {
        return new GetHttpSslExecutor().client(this).execute(request);
    }

    /**
     * 设置域名访问头参数
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SetHeaderResponse setHeader(SetHeaderRequest request) throws JdcloudSdkException {
        return new SetHeaderExecutor().client(this).execute(request);
    }

    /**
     * 刷新视频上传地址和凭证
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RefreshVideoUploadTaskResponse refreshVideoUploadTask(RefreshVideoUploadTaskRequest request) throws JdcloudSdkException {
        return new RefreshVideoUploadTaskExecutor().client(this).execute(request);
    }

    /**
     * 查询单个视频信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVideoResponse getVideo(GetVideoRequest request) throws JdcloudSdkException {
        return new GetVideoExecutor().client(this).execute(request);
    }

    /**
     * 查询视频列表信息。
允许通过条件过滤查询，支持的过滤字段如下：
  - status[eq] 按视频状态精确查询
  - categoryId[eq] 按分类ID精确查询
  - videoId[eq] 按视频ID精确查询
  - name[eq] 按视频名称精确查询

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListVideosResponse listVideos(ListVideosRequest request) throws JdcloudSdkException {
        return new ListVideosExecutor().client(this).execute(request);
    }

    /**
     * 查询截图模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetSnapshotTemplateResponse getSnapshotTemplate(GetSnapshotTemplateRequest request) throws JdcloudSdkException {
        return new GetSnapshotTemplateExecutor().client(this).execute(request);
    }

    /**
     * 添加水印
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateWatermarkResponse createWatermark(CreateWatermarkRequest request) throws JdcloudSdkException {
        return new CreateWatermarkExecutor().client(this).execute(request);
    }

    /**
     * 删除视频，调用该接口会同时删除与指定视频相关的所有信息，包括转码任务信息、转码流数据等，同时清除云存储中相关文件资源。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVideoResponse deleteVideo(DeleteVideoRequest request) throws JdcloudSdkException {
        return new DeleteVideoExecutor().client(this).execute(request);
    }

    /**
     * 修改截图模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateSnapshotTemplateResponse updateSnapshotTemplate(UpdateSnapshotTemplateRequest request) throws JdcloudSdkException {
        return new UpdateSnapshotTemplateExecutor().client(this).execute(request);
    }

    /**
     * 查询转码任务摘要
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetTranscodeTaskSummariesResponse getTranscodeTaskSummaries(GetTranscodeTaskSummariesRequest request) throws JdcloudSdkException {
        return new GetTranscodeTaskSummariesExecutor().client(this).execute(request);
    }

    /**
     * 提交质检作业
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SubmitQualityDetectionJobResponse submitQualityDetectionJob(SubmitQualityDetectionJobRequest request) throws JdcloudSdkException {
        return new SubmitQualityDetectionJobExecutor().client(this).execute(request);
    }

    /**
     * 创建截图模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateSnapshotTemplateResponse createSnapshotTemplate(CreateSnapshotTemplateRequest request) throws JdcloudSdkException {
        return new CreateSnapshotTemplateExecutor().client(this).execute(request);
    }

    /**
     * 查询CDN域名IP黑名单规则配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetIPRuleResponse getIPRule(GetIPRuleRequest request) throws JdcloudSdkException {
        return new GetIPRuleExecutor().client(this).execute(request);
    }

    /**
     * 启用域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableDomainResponse enableDomain(EnableDomainRequest request) throws JdcloudSdkException {
        return new EnableDomainExecutor().client(this).execute(request);
    }

    /**
     * 设置CDN域名SSL配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SetHttpSslResponse setHttpSsl(SetHttpSslRequest request) throws JdcloudSdkException {
        return new SetHttpSslExecutor().client(this).execute(request);
    }

    /**
     * 创建转码模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateTranscodeTemplateResponse createTranscodeTemplate(CreateTranscodeTemplateRequest request) throws JdcloudSdkException {
        return new CreateTranscodeTemplateExecutor().client(this).execute(request);
    }

    /**
     * 查询分类列表。按照分页方式，返回分类列表信息。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListCategoriesResponse listCategories(ListCategoriesRequest request) throws JdcloudSdkException {
        return new ListCategoriesExecutor().client(this).execute(request);
    }

    /**
     * 批量删除视频，调用该接口会同时删除与指定视频相关的所有信息，包括转码任务信息、转码流数据等，同时清除云存储中相关文件资源。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public BatchDeleteVideosResponse batchDeleteVideos(BatchDeleteVideosRequest request) throws JdcloudSdkException {
        return new BatchDeleteVideosExecutor().client(this).execute(request);
    }

    /**
     * 停用域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableDomainResponse disableDomain(DisableDomainRequest request) throws JdcloudSdkException {
        return new DisableDomainExecutor().client(this).execute(request);
    }

    /**
     * 删除质检模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteQualityDetectionTemplateResponse deleteQualityDetectionTemplate(DeleteQualityDetectionTemplateRequest request) throws JdcloudSdkException {
        return new DeleteQualityDetectionTemplateExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public VodClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private VodClient vodClient;

        public DefaultBuilder() {
            vodClient = new VodClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            vodClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            vodClient.httpRequestConfig = config;
            return this;
        }

        public VodClient build() throws JdcloudSdkException {

            if (vodClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                vodClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (vodClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("VodClient build error: jdcloud credentials provider not set");
                }
            }
            if (vodClient.httpRequestConfig == null) {
                vodClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (vodClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("VodClient build error: http request config not set");
                }
            }
            return vodClient;
        }

        public Builder environment(Environment environment) {
            vodClient.environment = environment;
            return this;
        }
    }
}
