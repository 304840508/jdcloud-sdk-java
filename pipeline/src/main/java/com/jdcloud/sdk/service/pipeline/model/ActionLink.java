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

package com.jdcloud.sdk.service.pipeline.model;


/**
 * actionLink
 */
public class ActionLink  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 超链接显示的名称
     */
    private String label;

    /**
     * 超链接的url
     */
    private String url;


    /**
     * get 超链接显示的名称
     *
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * set 超链接显示的名称
     *
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * get 超链接的url
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set 超链接的url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * set 超链接显示的名称
     *
     * @param label
     */
    public ActionLink label(String label) {
        this.label = label;
        return this;
    }

    /**
     * set 超链接的url
     *
     * @param url
     */
    public ActionLink url(String url) {
        this.url = url;
        return this;
    }


}