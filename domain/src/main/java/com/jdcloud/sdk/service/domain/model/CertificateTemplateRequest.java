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
 * Domain-Template
 * 域名模板相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.domain.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 域名信息模板实名认证
 */
public class CertificateTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 所有人证件号码
     * Required:true
     */
    @Required
    private String identityNo;

    /**
     * 注册人证件类型
1.个人
  (1)身份证 SFZ
2.企业
  (1)组织机构代码证 ORG
  (2)工商营业执照 YYZZ
  (3)统一社会信用代码证书 TYDMZ
  (4)部队代号 BDDH
  (5)军队单位对外有偿服务许可证 JDXKZ
  (6)事业单位法人证书 SYZS
  (7)社会团体法人登记证书 STDJZ
  (8)宗教活动场所登记证 ZJDJZ
  (9)民办非企业单位登记证书 MBDJZ
  (10)基金会法人登记证书 JJDJZ
  (11)律师事务所执业许可证 LSXKZ
  (12)登记证 GWLYDJZ
  (13)司法鉴定许可证 SFXKZ
  (14)社会服务机构登记证书 SHFWJGZ
  (15)民办学校办学许可证 MBXXXKZ
  (16)医疗机构执业许可证 YLJGXKZ

     * Required:true
     */
    @Required
    private String identityType;

    /**
     * 所有人证件，jpg 图片的 base64 编码，必填（大小 55KB~1MB）
     * Required:true
     */
    @Required
    private String file;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 模板ID
     * Required:true
     */
    @Required
    private Long templateId;


    /**
     * get 所有人证件号码
     *
     * @return
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /**
     * set 所有人证件号码
     *
     * @param identityNo
     */
    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    /**
     * get 注册人证件类型
1.个人
  (1)身份证 SFZ
2.企业
  (1)组织机构代码证 ORG
  (2)工商营业执照 YYZZ
  (3)统一社会信用代码证书 TYDMZ
  (4)部队代号 BDDH
  (5)军队单位对外有偿服务许可证 JDXKZ
  (6)事业单位法人证书 SYZS
  (7)社会团体法人登记证书 STDJZ
  (8)宗教活动场所登记证 ZJDJZ
  (9)民办非企业单位登记证书 MBDJZ
  (10)基金会法人登记证书 JJDJZ
  (11)律师事务所执业许可证 LSXKZ
  (12)登记证 GWLYDJZ
  (13)司法鉴定许可证 SFXKZ
  (14)社会服务机构登记证书 SHFWJGZ
  (15)民办学校办学许可证 MBXXXKZ
  (16)医疗机构执业许可证 YLJGXKZ

     *
     * @return
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * set 注册人证件类型
1.个人
  (1)身份证 SFZ
2.企业
  (1)组织机构代码证 ORG
  (2)工商营业执照 YYZZ
  (3)统一社会信用代码证书 TYDMZ
  (4)部队代号 BDDH
  (5)军队单位对外有偿服务许可证 JDXKZ
  (6)事业单位法人证书 SYZS
  (7)社会团体法人登记证书 STDJZ
  (8)宗教活动场所登记证 ZJDJZ
  (9)民办非企业单位登记证书 MBDJZ
  (10)基金会法人登记证书 JJDJZ
  (11)律师事务所执业许可证 LSXKZ
  (12)登记证 GWLYDJZ
  (13)司法鉴定许可证 SFXKZ
  (14)社会服务机构登记证书 SHFWJGZ
  (15)民办学校办学许可证 MBXXXKZ
  (16)医疗机构执业许可证 YLJGXKZ

     *
     * @param identityType
     */
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * get 所有人证件，jpg 图片的 base64 编码，必填（大小 55KB~1MB）
     *
     * @return
     */
    public String getFile() {
        return file;
    }

    /**
     * set 所有人证件，jpg 图片的 base64 编码，必填（大小 55KB~1MB）
     *
     * @param file
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * get 实例所属的地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 模板ID
     *
     * @return
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * set 模板ID
     *
     * @param templateId
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }


    /**
     * set 所有人证件号码
     *
     * @param identityNo
     */
    public CertificateTemplateRequest identityNo(String identityNo) {
        this.identityNo = identityNo;
        return this;
    }

    /**
     * set 注册人证件类型
1.个人
  (1)身份证 SFZ
2.企业
  (1)组织机构代码证 ORG
  (2)工商营业执照 YYZZ
  (3)统一社会信用代码证书 TYDMZ
  (4)部队代号 BDDH
  (5)军队单位对外有偿服务许可证 JDXKZ
  (6)事业单位法人证书 SYZS
  (7)社会团体法人登记证书 STDJZ
  (8)宗教活动场所登记证 ZJDJZ
  (9)民办非企业单位登记证书 MBDJZ
  (10)基金会法人登记证书 JJDJZ
  (11)律师事务所执业许可证 LSXKZ
  (12)登记证 GWLYDJZ
  (13)司法鉴定许可证 SFXKZ
  (14)社会服务机构登记证书 SHFWJGZ
  (15)民办学校办学许可证 MBXXXKZ
  (16)医疗机构执业许可证 YLJGXKZ

     *
     * @param identityType
     */
    public CertificateTemplateRequest identityType(String identityType) {
        this.identityType = identityType;
        return this;
    }

    /**
     * set 所有人证件，jpg 图片的 base64 编码，必填（大小 55KB~1MB）
     *
     * @param file
     */
    public CertificateTemplateRequest file(String file) {
        this.file = file;
        return this;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public CertificateTemplateRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 模板ID
     *
     * @param templateId
     */
    public CertificateTemplateRequest templateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }


}