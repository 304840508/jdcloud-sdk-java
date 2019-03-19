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

package com.jdcloud.sdk.service.iam.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * serviceDetail
 */
public class ServiceDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品线名称
     * Required:true
     */
    @Required
    private String serviceName;

    /**
     * 策略相关OpenAPI的Action列表
     * Required:true
     */
    @Required
    private List<APIInfo> apiList;

    /**
     * 资源列表
     * Required:true
     */
    @Required
    private List<String> resourceList;


    /**
     * get 产品线名称
     *
     * @return
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * set 产品线名称
     *
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * get 策略相关OpenAPI的Action列表
     *
     * @return
     */
    public List<APIInfo> getApiList() {
        return apiList;
    }

    /**
     * set 策略相关OpenAPI的Action列表
     *
     * @param apiList
     */
    public void setApiList(List<APIInfo> apiList) {
        this.apiList = apiList;
    }

    /**
     * get 资源列表
     *
     * @return
     */
    public List<String> getResourceList() {
        return resourceList;
    }

    /**
     * set 资源列表
     *
     * @param resourceList
     */
    public void setResourceList(List<String> resourceList) {
        this.resourceList = resourceList;
    }


    /**
     * set 产品线名称
     *
     * @param serviceName
     */
    public ServiceDetail serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * set 策略相关OpenAPI的Action列表
     *
     * @param apiList
     */
    public ServiceDetail apiList(List<APIInfo> apiList) {
        this.apiList = apiList;
        return this;
    }

    /**
     * set 资源列表
     *
     * @param resourceList
     */
    public ServiceDetail resourceList(List<String> resourceList) {
        this.resourceList = resourceList;
        return this;
    }


    /**
     * add item to 策略相关OpenAPI的Action列表
     *
     * @param apiList
     */
    public void addApiList(APIInfo apiList) {
        if (this.apiList == null) {
            this.apiList = new ArrayList<>();
        }
        this.apiList.add(apiList);
    }

    /**
     * add item to 资源列表
     *
     * @param resourceList
     */
    public void addResourceList(String resourceList) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        this.resourceList.add(resourceList);
    }

}