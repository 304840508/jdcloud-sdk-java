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
import com.jdcloud.sdk.service.vod.model.DeleteTranscodeTemplateRequest;
import com.jdcloud.sdk.service.vod.model.DeleteTranscodeTemplateResponse;
import com.jdcloud.sdk.service.vod.client.DeleteTranscodeTemplateExecutor;
import com.jdcloud.sdk.service.vod.model.GetVideoPlayInfoRequest;
import com.jdcloud.sdk.service.vod.model.GetVideoPlayInfoResponse;
import com.jdcloud.sdk.service.vod.client.GetVideoPlayInfoExecutor;
import com.jdcloud.sdk.service.vod.model.UpdateWatermarkRequest;
import com.jdcloud.sdk.service.vod.model.UpdateWatermarkResponse;
import com.jdcloud.sdk.service.vod.client.UpdateWatermarkExecutor;
import com.jdcloud.sdk.service.vod.model.ListDomainsRequest;
import com.jdcloud.sdk.service.vod.model.ListDomainsResponse;
import com.jdcloud.sdk.service.vod.client.ListDomainsExecutor;
import com.jdcloud.sdk.service.vod.model.UpdateCategoryRequest;
import com.jdcloud.sdk.service.vod.model.UpdateCategoryResponse;
import com.jdcloud.sdk.service.vod.client.UpdateCategoryExecutor;
import com.jdcloud.sdk.service.vod.model.SetRefererRuleRequest;
import com.jdcloud.sdk.service.vod.model.SetRefererRuleResponse;
import com.jdcloud.sdk.service.vod.client.SetRefererRuleExecutor;
import com.jdcloud.sdk.service.vod.model.GetURLRuleRequest;
import com.jdcloud.sdk.service.vod.model.GetURLRuleResponse;
import com.jdcloud.sdk.service.vod.client.GetURLRuleExecutor;
import com.jdcloud.sdk.service.vod.model.GetTranscodeTaskRequest;
import com.jdcloud.sdk.service.vod.model.GetTranscodeTaskResponse;
import com.jdcloud.sdk.service.vod.client.GetTranscodeTaskExecutor;
import com.jdcloud.sdk.service.vod.model.GetRefererRuleRequest;
import com.jdcloud.sdk.service.vod.model.GetRefererRuleResponse;
import com.jdcloud.sdk.service.vod.client.GetRefererRuleExecutor;
import com.jdcloud.sdk.service.vod.model.DeleteDomainRequest;
import com.jdcloud.sdk.service.vod.model.DeleteDomainResponse;
import com.jdcloud.sdk.service.vod.client.DeleteDomainExecutor;
import com.jdcloud.sdk.service.vod.model.SetURLRuleRequest;
import com.jdcloud.sdk.service.vod.model.SetURLRuleResponse;
import com.jdcloud.sdk.service.vod.client.SetURLRuleExecutor;
import com.jdcloud.sdk.service.vod.model.GetCategoryWithChildrenRequest;
import com.jdcloud.sdk.service.vod.model.GetCategoryWithChildrenResponse;
import com.jdcloud.sdk.service.vod.client.GetCategoryWithChildrenExecutor;
import com.jdcloud.sdk.service.vod.model.CreateCategoryRequest;
import com.jdcloud.sdk.service.vod.model.CreateCategoryResponse;
import com.jdcloud.sdk.service.vod.client.CreateCategoryExecutor;
import com.jdcloud.sdk.service.vod.model.ListTranscodeTemplatesRequest;
import com.jdcloud.sdk.service.vod.model.ListTranscodeTemplatesResponse;
import com.jdcloud.sdk.service.vod.client.ListTranscodeTemplatesExecutor;
import com.jdcloud.sdk.service.vod.model.ListWatermarksRequest;
import com.jdcloud.sdk.service.vod.model.ListWatermarksResponse;
import com.jdcloud.sdk.service.vod.client.ListWatermarksExecutor;
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
import com.jdcloud.sdk.service.vod.model.GetVideoRequest;
import com.jdcloud.sdk.service.vod.model.GetVideoResponse;
import com.jdcloud.sdk.service.vod.client.GetVideoExecutor;
import com.jdcloud.sdk.service.vod.model.ListVideosRequest;
import com.jdcloud.sdk.service.vod.model.ListVideosResponse;
import com.jdcloud.sdk.service.vod.client.ListVideosExecutor;
import com.jdcloud.sdk.service.vod.model.BatchUpdateVideosRequest;
import com.jdcloud.sdk.service.vod.model.BatchUpdateVideosResponse;
import com.jdcloud.sdk.service.vod.client.BatchUpdateVideosExecutor;
import com.jdcloud.sdk.service.vod.model.CreateWatermarkRequest;
import com.jdcloud.sdk.service.vod.model.CreateWatermarkResponse;
import com.jdcloud.sdk.service.vod.client.CreateWatermarkExecutor;
import com.jdcloud.sdk.service.vod.model.GetDomainRequest;
import com.jdcloud.sdk.service.vod.model.GetDomainResponse;
import com.jdcloud.sdk.service.vod.client.GetDomainExecutor;
import com.jdcloud.sdk.service.vod.model.DeleteVideoRequest;
import com.jdcloud.sdk.service.vod.model.DeleteVideoResponse;
import com.jdcloud.sdk.service.vod.client.DeleteVideoExecutor;
import com.jdcloud.sdk.service.vod.model.GetIPRuleRequest;
import com.jdcloud.sdk.service.vod.model.GetIPRuleResponse;
import com.jdcloud.sdk.service.vod.client.GetIPRuleExecutor;
import com.jdcloud.sdk.service.vod.model.EnableDomainRequest;
import com.jdcloud.sdk.service.vod.model.EnableDomainResponse;
import com.jdcloud.sdk.service.vod.client.EnableDomainExecutor;
import com.jdcloud.sdk.service.vod.model.VerifyDomainRequest;
import com.jdcloud.sdk.service.vod.model.VerifyDomainResponse;
import com.jdcloud.sdk.service.vod.client.VerifyDomainExecutor;
import com.jdcloud.sdk.service.vod.model.GetWatermarkRequest;
import com.jdcloud.sdk.service.vod.model.GetWatermarkResponse;
import com.jdcloud.sdk.service.vod.client.GetWatermarkExecutor;
import com.jdcloud.sdk.service.vod.model.DeleteVideoStreamsRequest;
import com.jdcloud.sdk.service.vod.model.DeleteVideoStreamsResponse;
import com.jdcloud.sdk.service.vod.client.DeleteVideoStreamsExecutor;
import com.jdcloud.sdk.service.vod.model.CreateTranscodeTemplateRequest;
import com.jdcloud.sdk.service.vod.model.CreateTranscodeTemplateResponse;
import com.jdcloud.sdk.service.vod.client.CreateTranscodeTemplateExecutor;
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
import com.jdcloud.sdk.service.vod.model.ListCategoriesRequest;
import com.jdcloud.sdk.service.vod.model.ListCategoriesResponse;
import com.jdcloud.sdk.service.vod.client.ListCategoriesExecutor;
import com.jdcloud.sdk.service.vod.model.DeleteCategoryRequest;
import com.jdcloud.sdk.service.vod.model.DeleteCategoryResponse;
import com.jdcloud.sdk.service.vod.client.DeleteCategoryExecutor;
import com.jdcloud.sdk.service.vod.model.BatchDeleteVideosRequest;
import com.jdcloud.sdk.service.vod.model.BatchDeleteVideosResponse;
import com.jdcloud.sdk.service.vod.client.BatchDeleteVideosExecutor;
import com.jdcloud.sdk.service.vod.model.DisableDomainRequest;
import com.jdcloud.sdk.service.vod.model.DisableDomainResponse;
import com.jdcloud.sdk.service.vod.client.DisableDomainExecutor;

/**
 * vodClient
 */
public class VodClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.1.1";
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
     * 设置CDN域名Referer规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SetRefererRuleResponse setRefererRule(SetRefererRuleRequest request) throws JdcloudSdkException {
        return new SetRefererRuleExecutor().client(this).execute(request);
    }

    /**
     * 查询CDN域名URL规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetURLRuleResponse getURLRule(GetURLRuleRequest request) throws JdcloudSdkException {
        return new GetURLRuleExecutor().client(this).execute(request);
    }

    /**
     * 获取转码任务信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetTranscodeTaskResponse getTranscodeTask(GetTranscodeTaskRequest request) throws JdcloudSdkException {
        return new GetTranscodeTaskExecutor().client(this).execute(request);
    }

    /**
     * 查询CDN域名Referer规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetRefererRuleResponse getRefererRule(GetRefererRuleRequest request) throws JdcloudSdkException {
        return new GetRefererRuleExecutor().client(this).execute(request);
    }

    /**
     * 删除域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws JdcloudSdkException {
        return new DeleteDomainExecutor().client(this).execute(request);
    }

    /**
     * 设置CDN域名URL规则
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
     * 查询转码模板列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListTranscodeTemplatesResponse listTranscodeTemplates(ListTranscodeTemplatesRequest request) throws JdcloudSdkException {
        return new ListTranscodeTemplatesExecutor().client(this).execute(request);
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
     * 查询视频列表信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListVideosResponse listVideos(ListVideosRequest request) throws JdcloudSdkException {
        return new ListVideosExecutor().client(this).execute(request);
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
     * 删除视频，调用该接口会同时删除与该视频相关的所有信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVideoResponse deleteVideo(DeleteVideoRequest request) throws JdcloudSdkException {
        return new DeleteVideoExecutor().client(this).execute(request);
    }

    /**
     * 查询CDN域名IP规则
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
     * 校验域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public VerifyDomainResponse verifyDomain(VerifyDomainRequest request) throws JdcloudSdkException {
        return new VerifyDomainExecutor().client(this).execute(request);
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
     * 删除视频码流信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVideoStreamsResponse deleteVideoStreams(DeleteVideoStreamsRequest request) throws JdcloudSdkException {
        return new DeleteVideoStreamsExecutor().client(this).execute(request);
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
     * 设置CDN域名IP规则
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
     * 查询分类列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListCategoriesResponse listCategories(ListCategoriesRequest request) throws JdcloudSdkException {
        return new ListCategoriesExecutor().client(this).execute(request);
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
     * 批量删除视频信息，调用该接口会同时删除与指定视频相关的所有信息
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
