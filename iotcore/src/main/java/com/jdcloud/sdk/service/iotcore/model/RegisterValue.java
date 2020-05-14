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

package com.jdcloud.sdk.service.iotcore.model;


/**
 * registerValue
 */
public class RegisterValue  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    private String name;

    /**
     * 运行状态值map
     */
    private Object value;

    /**
     * 状态值说明
     */
    private String desc;


    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 运行状态值map
     *
     * @return
     */
    public Object getValue() {
        return value;
    }

    /**
     * set 运行状态值map
     *
     * @param value
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * get 状态值说明
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 状态值说明
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }


    /**
     * set 名称
     *
     * @param name
     */
    public RegisterValue name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 运行状态值map
     *
     * @param value
     */
    public RegisterValue value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * set 状态值说明
     *
     * @param desc
     */
    public RegisterValue desc(String desc) {
        this.desc = desc;
        return this;
    }


}