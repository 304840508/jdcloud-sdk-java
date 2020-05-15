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
 * 原生容器
 * 原生容器相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.nativecontainer.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeInstanceTypesRequest;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeInstanceTypesResponse;
import com.jdcloud.sdk.service.nativecontainer.client.DescribeInstanceTypesExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.CreateSecretRequest;
import com.jdcloud.sdk.service.nativecontainer.model.CreateSecretResponse;
import com.jdcloud.sdk.service.nativecontainer.client.CreateSecretExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.DeleteSecretRequest;
import com.jdcloud.sdk.service.nativecontainer.model.DeleteSecretResponse;
import com.jdcloud.sdk.service.nativecontainer.client.DeleteSecretExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeContainerRequest;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeContainerResponse;
import com.jdcloud.sdk.service.nativecontainer.client.DescribeContainerExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.DeleteContainerRequest;
import com.jdcloud.sdk.service.nativecontainer.model.DeleteContainerResponse;
import com.jdcloud.sdk.service.nativecontainer.client.DeleteContainerExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.ResizeContainerRequest;
import com.jdcloud.sdk.service.nativecontainer.model.ResizeContainerResponse;
import com.jdcloud.sdk.service.nativecontainer.client.ResizeContainerExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeQuotaRequest;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeQuotaResponse;
import com.jdcloud.sdk.service.nativecontainer.client.DescribeQuotaExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeSecretRequest;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeSecretResponse;
import com.jdcloud.sdk.service.nativecontainer.client.DescribeSecretExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.StopContainerRequest;
import com.jdcloud.sdk.service.nativecontainer.model.StopContainerResponse;
import com.jdcloud.sdk.service.nativecontainer.client.StopContainerExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.DisassociateElasticIpRequest;
import com.jdcloud.sdk.service.nativecontainer.model.DisassociateElasticIpResponse;
import com.jdcloud.sdk.service.nativecontainer.client.DisassociateElasticIpExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.GetLogsRequest;
import com.jdcloud.sdk.service.nativecontainer.model.GetLogsResponse;
import com.jdcloud.sdk.service.nativecontainer.client.GetLogsExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.RebuildContainerRequest;
import com.jdcloud.sdk.service.nativecontainer.model.RebuildContainerResponse;
import com.jdcloud.sdk.service.nativecontainer.client.RebuildContainerExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.AssociateElasticIpRequest;
import com.jdcloud.sdk.service.nativecontainer.model.AssociateElasticIpResponse;
import com.jdcloud.sdk.service.nativecontainer.client.AssociateElasticIpExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.ExecCreateRequest;
import com.jdcloud.sdk.service.nativecontainer.model.ExecCreateResponse;
import com.jdcloud.sdk.service.nativecontainer.client.ExecCreateExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.ExecGetExitCodeRequest;
import com.jdcloud.sdk.service.nativecontainer.model.ExecGetExitCodeResponse;
import com.jdcloud.sdk.service.nativecontainer.client.ExecGetExitCodeExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.CreateContainersRequest;
import com.jdcloud.sdk.service.nativecontainer.model.CreateContainersResponse;
import com.jdcloud.sdk.service.nativecontainer.client.CreateContainersExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.StartContainerRequest;
import com.jdcloud.sdk.service.nativecontainer.model.StartContainerResponse;
import com.jdcloud.sdk.service.nativecontainer.client.StartContainerExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeSecretsRequest;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeSecretsResponse;
import com.jdcloud.sdk.service.nativecontainer.client.DescribeSecretsExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.ModifyContainerAttributeRequest;
import com.jdcloud.sdk.service.nativecontainer.model.ModifyContainerAttributeResponse;
import com.jdcloud.sdk.service.nativecontainer.client.ModifyContainerAttributeExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.ResizeTTYRequest;
import com.jdcloud.sdk.service.nativecontainer.model.ResizeTTYResponse;
import com.jdcloud.sdk.service.nativecontainer.client.ResizeTTYExecutor;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeContainersRequest;
import com.jdcloud.sdk.service.nativecontainer.model.DescribeContainersResponse;
import com.jdcloud.sdk.service.nativecontainer.client.DescribeContainersExecutor;

/**
 * nativecontainerClient
 */
public class NativecontainerClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.1";
    public final static String DefaultEndpoint = "nativecontainer.jdcloud-api.com";
    public final static String ServiceName = "nativecontainer";
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

    private NativecontainerClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询实例规格信息列表

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) throws JdcloudSdkException {
        return new DescribeInstanceTypesExecutor().client(this).execute(request);
    }

    /**
     * 创建一个 secret，用于存放镜像仓库认证信息。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) throws JdcloudSdkException {
        return new CreateSecretExecutor().client(this).execute(request);
    }

    /**
     * 删除单个 secret

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) throws JdcloudSdkException {
        return new DeleteSecretExecutor().client(this).execute(request);
    }

    /**
     * 查询一台原生容器的详细信息

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeContainerResponse describeContainer(DescribeContainerRequest request) throws JdcloudSdkException {
        return new DescribeContainerExecutor().client(this).execute(request);
    }

    /**
     * 容器状态必须为 stopped、running 或 error状态。 &lt;br&gt;
按量付费的实例，如不主动删除将一直运行，不再使用的实例，可通过本接口主动停用。&lt;br&gt;
只能支持主动删除按配置计费类型的实例。包年包月过期的容器也可以删除，其它的情况还请发工单系统。计费状态异常的容器无法删除。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteContainerResponse deleteContainer(DeleteContainerRequest request) throws JdcloudSdkException {
        return new DeleteContainerExecutor().client(this).execute(request);
    }

    /**
     * 调整原生容器实例类型配置。
- 原生容器状态为停止;
- 支持升配、降配；**不支持原有规格**
- 计费类型不变
    - 包年包月：需要计算配置差价，如果所选配置价格高，需要补齐到期前的差价，到期时间不变；如果所选配置价格低，需要延长到期时间
    - 按配置：按照所选规格，进行计费

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ResizeContainerResponse resizeContainer(ResizeContainerRequest request) throws JdcloudSdkException {
        return new ResizeContainerExecutor().client(this).execute(request);
    }

    /**
     * 查询资源的配额，支持：原生容器 pod 和 secret.

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeQuotaResponse describeQuota(DescribeQuotaRequest request) throws JdcloudSdkException {
        return new DescribeQuotaExecutor().client(this).execute(request);
    }

    /**
     * 查询单个 secret 详情

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSecretResponse describeSecret(DescribeSecretRequest request) throws JdcloudSdkException {
        return new DescribeSecretExecutor().client(this).execute(request);
    }

    /**
     * 停止处于运行状态的单个实例，处于任务执行中的容器无法启动。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopContainerResponse stopContainer(StopContainerRequest request) throws JdcloudSdkException {
        return new StopContainerExecutor().client(this).execute(request);
    }

    /**
     * 容器解绑公网 IP，解绑的是主网卡、主内网 IP 对应的弹性 IP.

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisassociateElasticIpResponse disassociateElasticIp(DisassociateElasticIpRequest request) throws JdcloudSdkException {
        return new DisassociateElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 查询单个容器日志

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetLogsResponse getLogs(GetLogsRequest request) throws JdcloudSdkException {
        return new GetLogsExecutor().client(this).execute(request);
    }

    /**
     * 重置原生容器，对已有原生容器使用新的镜像重置。
原容器 id 不变，不涉及计费变动，暂不支持修改实例类型，不会改变原生容器所在的物理节点，也不支持修改已经使用的系统盘和数据盘以及网络相关参数。
- 镜像
    - 容器的镜像通过镜像名称来确定
    - nginx:tag 或 mysql/mysql-server:tag 这样命名的镜像表示 docker hub 官方镜像
    - container-registry/image:tag 这样命名的镜像表示私有仓储的镜像
    - 私有仓储必须兼容 docker registry 认证机制，并通过 secret 来保存机密信息
- 其他
    - rebuild 之前容器必须处于关闭状态
    - rebuild 完成后，容器仍为关闭状态

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RebuildContainerResponse rebuildContainer(RebuildContainerRequest request) throws JdcloudSdkException {
        return new RebuildContainerExecutor().client(this).execute(request);
    }

    /**
     * 容器绑定弹性公网 IP，绑定的是主网卡、主内网IP对应的弹性IP. &lt;br&gt;
一台云主机只能绑定一个弹性公网 IP(主网卡)，若主网卡已存在弹性公网IP，会返回错误。&lt;br&gt;
如果是黑名单中的用户，会返回错误。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AssociateElasticIpResponse associateElasticIp(AssociateElasticIpRequest request) throws JdcloudSdkException {
        return new AssociateElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 创建exec

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ExecCreateResponse execCreate(ExecCreateRequest request) throws JdcloudSdkException {
        return new ExecCreateExecutor().client(this).execute(request);
    }

    /**
     * 获取exec退出码

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ExecGetExitCodeResponse execGetExitCode(ExecGetExitCodeRequest request) throws JdcloudSdkException {
        return new ExecGetExitCodeExecutor().client(this).execute(request);
    }

    /**
     * 创建一台或多台指定配置容器
- 创建容器需要通过实名认证
- 镜像
  - 容器的镜像通过镜像名称来确定
  - nginx:tag, mysql/mysql-server:tag这样命名的镜像表示docker hub官方镜像
  - container-registry/image:tag这样命名的镜像表示私有仓储的镜像
  - 私有仓储必须兼容docker registry认证机制，并通过secret来保存机密信息
- hostname规范
  - 支持两种方式：以标签方式书写或以完整主机名方式书写
  - 标签规范
    - 0-9，a-z(不分大小写)和-（减号），其他的都是无效的字符串
    - 不能以减号开始，也不能以减号结尾
    - 最小1个字符，最大63个字符
  - 完整的主机名由一系列标签与点连接组成
    - 标签与标签之间使用“.”(点)进行连接
    - 不能以“.”(点)开始，也不能以“.”(点)结尾
    - 整个主机名（包括标签以及分隔点“.”）最多有63个ASCII字符
- 网络配置
  - 指定主网卡配置信息
    - 必须指定vpcId、subnetId、securityGroupIds
    - 可以指定elasticIp规格来约束创建的弹性IP，带宽取值范围[1-200]Mbps，步进1Mbps
    - 可以指定网卡的主IP(primaryIpAddress)和辅助IP(secondaryIpAddresses)，此时maxCount只能为1
    - 可以指定希望的辅助IP个数(secondaryIpAddressCount)让系统自动创建内网IP
    - 可以设置网卡的自动删除autoDelete属性，指明是否删除实例时自动删除网卡
    - 安全组securityGroup需与子网Subnet在同一个私有网络VPC内
    - 每个容器至多指定5个安全组
    - 主网卡deviceIndex设置为0
- 存储
  - volume分为root volume和data volume，root volume的挂载目录是/，data volume的挂载目录可以随意指定
  - volume的底层存储介质当前只支持cloud类别，也就是云硬盘
  - 云盘类型为 ssd.io1 时，用户可以指定 iops，其他类型云盘无效，对已经存在的云盘无效，具体规则如下
    - 步长 10
    - 范围 [200，min(32000，size*50)]
    - 默认值 size*30
  - root volume
    - 云硬盘类型可以选择hdd.std1、ssd.gp1、ssd.io1
    - 磁盘大小
      - 所有类型：范围[10,100]GB，步长为10G
    - 自动删除
      - 默认自动删除
    - 可以选择已存在的云硬盘
  - data volume
    - data volume当前只能选择cloud类别
    - 云硬盘类型可以选择hdd.std1、ssd.gp1、ssd.io1
    - 磁盘大小
      - 所有类型：范围[20,2000]GB，步长为10G
    - 自动删除
      - 默认自动删除
    - 可以选择已存在的云硬盘
    - 可以从快照创建磁盘
    - 单个容器可以挂载7个data volume
- 容器日志
  - default：默认在本地分配10MB的存储空间，自动rotate
- 其他
  - 创建完成后，容器状态为running
  - maxCount为最大努力，不保证一定能达到maxCount

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateContainersResponse createContainers(CreateContainersRequest request) throws JdcloudSdkException {
        return new CreateContainersExecutor().client(this).execute(request);
    }

    /**
     * 启动处于关闭状态的单个容器，处在任务执行中的容器无法启动。&lt;br&gt;
容器实例或其绑定的云盘已欠费时，容器将无法正常启动。&lt;br&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartContainerResponse startContainer(StartContainerRequest request) throws JdcloudSdkException {
        return new StartContainerExecutor().client(this).execute(request);
    }

    /**
     * 查询 secret 列表。&lt;br&gt; 
此接口支持分页查询，默认每页20条。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSecretsResponse describeSecrets(DescribeSecretsRequest request) throws JdcloudSdkException {
        return new DescribeSecretsExecutor().client(this).execute(request);
    }

    /**
     * 修改容器的 名称 和 描述。&lt;br&gt;
name 和 description 必须要指定一个

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyContainerAttributeResponse modifyContainerAttribute(ModifyContainerAttributeRequest request) throws JdcloudSdkException {
        return new ModifyContainerAttributeExecutor().client(this).execute(request);
    }

    /**
     * 调整TTY大小

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ResizeTTYResponse resizeTTY(ResizeTTYRequest request) throws JdcloudSdkException {
        return new ResizeTTYExecutor().client(this).execute(request);
    }

    /**
     * 批量查询原生容器的详细信息&lt;br&gt;
此接口支持分页查询，默认每页20条。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeContainersResponse describeContainers(DescribeContainersRequest request) throws JdcloudSdkException {
        return new DescribeContainersExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public NativecontainerClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private NativecontainerClient nativecontainerClient;

        public DefaultBuilder() {
            nativecontainerClient = new NativecontainerClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            nativecontainerClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            nativecontainerClient.httpRequestConfig = config;
            return this;
        }

        public NativecontainerClient build() throws JdcloudSdkException {

            if (nativecontainerClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                nativecontainerClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (nativecontainerClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("NativecontainerClient build error: jdcloud credentials provider not set");
                }
            }
            if (nativecontainerClient.httpRequestConfig == null) {
                nativecontainerClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (nativecontainerClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("NativecontainerClient build error: http request config not set");
                }
            }
            return nativecontainerClient;
        }

        public Builder environment(Environment environment) {
            nativecontainerClient.environment = environment;
            return this;
        }
    }
}
