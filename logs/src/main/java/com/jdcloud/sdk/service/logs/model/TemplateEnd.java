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

package com.jdcloud.sdk.service.logs.model;


/**
 * templateEnd
 */
public class TemplateEnd  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * UID
     */
    private String uID;

    /**
     * 模板名称
     */
    private String name;


    /**
     * get UID
     *
     * @return
     */
    public String getUID() {
        return uID;
    }

    /**
     * set UID
     *
     * @param uID
     */
    public void setUID(String uID) {
        this.uID = uID;
    }

    /**
     * get 模板名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 模板名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * set UID
     *
     * @param uID
     */
    public TemplateEnd uID(String uID) {
        this.uID = uID;
        return this;
    }

    /**
     * set 模板名称
     *
     * @param name
     */
    public TemplateEnd name(String name) {
        this.name = name;
        return this;
    }


}