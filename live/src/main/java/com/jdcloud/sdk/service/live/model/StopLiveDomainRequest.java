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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 停用域名
- 停用直播域名对(推流域名,播放域名),将DomainStatus变更为offline
- 停用该直播域名对后,直播域名信息仍保留,但用户将不能再用该推流域名推流或播放域名播放

 */
public class StopLiveDomainRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推流域名
- 需要停用的域名对(推流域名,播放域名)中的推流域名

     * Required:true
     */
    @Required
    private String publishDomain;


    /**
     * get 推流域名
- 需要停用的域名对(推流域名,播放域名)中的推流域名

     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 推流域名
- 需要停用的域名对(推流域名,播放域名)中的推流域名

     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }


    /**
     * set 推流域名
- 需要停用的域名对(推流域名,播放域名)中的推流域名

     *
     * @param publishDomain
     */
    public StopLiveDomainRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }


}