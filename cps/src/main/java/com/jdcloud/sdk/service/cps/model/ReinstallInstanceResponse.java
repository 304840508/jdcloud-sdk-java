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
 * 云物理服务器
 * 云物理服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.service.JdcloudResponse;

/**
 * 重装云物理服务器，只能重装stopped状态的服务器&lt;br&gt;
- 可调用接口（describeOS）获取云物理服务器支持的操作系统列表
- 可调用接口（describeSoftware）获取云物理服务器支持的软件列表，也可以不预装软件

 */
public class ReinstallInstanceResponse extends JdcloudResponse<ReinstallInstanceResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}