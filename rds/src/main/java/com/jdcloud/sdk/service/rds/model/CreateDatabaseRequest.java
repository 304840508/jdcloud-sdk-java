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
 * 数据库管理
 * 数据库管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建数据库&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：支持
 */
public class CreateDatabaseRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库名称
     * Required:true
     */
    @Required
    private String dbName;

    /**
     * 字符集名称&lt;/br&gt;&lt;strong&gt;mysql字符集支持：&lt;/strong&gt;&lt;/br&gt;- utf8；&lt;/br&gt;&lt;strong&gt;SQL Server字符集支持：&lt;/strong&gt;&lt;/br&gt;- Chinese_PRC_CI_AS&lt;/br&gt;- Chinese_PRC_CS_AS&lt;/br&gt;- SQL_Latin1_General_CP1_CI_AS&lt;/br&gt;- SQL_Latin1_General_CP1_CS_AS&lt;/br&gt;- Chinese_PRC_BIN
     * Required:true
     */
    @Required
    private String characterSetName;

    /**
     * 区域代码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 数据库名称
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 字符集名称&lt;/br&gt;&lt;strong&gt;mysql字符集支持：&lt;/strong&gt;&lt;/br&gt;- utf8；&lt;/br&gt;&lt;strong&gt;SQL Server字符集支持：&lt;/strong&gt;&lt;/br&gt;- Chinese_PRC_CI_AS&lt;/br&gt;- Chinese_PRC_CS_AS&lt;/br&gt;- SQL_Latin1_General_CP1_CI_AS&lt;/br&gt;- SQL_Latin1_General_CP1_CS_AS&lt;/br&gt;- Chinese_PRC_BIN
     *
     * @return
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * set 字符集名称&lt;/br&gt;&lt;strong&gt;mysql字符集支持：&lt;/strong&gt;&lt;/br&gt;- utf8；&lt;/br&gt;&lt;strong&gt;SQL Server字符集支持：&lt;/strong&gt;&lt;/br&gt;- Chinese_PRC_CI_AS&lt;/br&gt;- Chinese_PRC_CS_AS&lt;/br&gt;- SQL_Latin1_General_CP1_CI_AS&lt;/br&gt;- SQL_Latin1_General_CP1_CS_AS&lt;/br&gt;- Chinese_PRC_BIN
     *
     * @param characterSetName
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * get 区域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public CreateDatabaseRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 字符集名称&lt;/br&gt;&lt;strong&gt;mysql字符集支持：&lt;/strong&gt;&lt;/br&gt;- utf8；&lt;/br&gt;&lt;strong&gt;SQL Server字符集支持：&lt;/strong&gt;&lt;/br&gt;- Chinese_PRC_CI_AS&lt;/br&gt;- Chinese_PRC_CS_AS&lt;/br&gt;- SQL_Latin1_General_CP1_CI_AS&lt;/br&gt;- SQL_Latin1_General_CP1_CS_AS&lt;/br&gt;- Chinese_PRC_BIN
     *
     * @param characterSetName
     */
    public CreateDatabaseRequest characterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * set 区域代码
     *
     * @param regionId
     */
    public CreateDatabaseRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public CreateDatabaseRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}