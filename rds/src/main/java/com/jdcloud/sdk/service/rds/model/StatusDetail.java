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

package com.jdcloud.sdk.service.rds.model;


/**
 * statusDetail
 */
public class StatusDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     */
    private String instanceName;

    /**
     * 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String instanceStatus;

    /**
     * 开启TDE加密后，实例级别的TDE生效状态，TDE加密已生效，返回true；如未生效，返回false；
     */
    private String tdeStatus;


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
     * get 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    /**
     * set 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceStatus
     */
    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * get 开启TDE加密后，实例级别的TDE生效状态，TDE加密已生效，返回true；如未生效，返回false；
     *
     * @return
     */
    public String getTdeStatus() {
        return tdeStatus;
    }

    /**
     * set 开启TDE加密后，实例级别的TDE生效状态，TDE加密已生效，返回true；如未生效，返回false；
     *
     * @param tdeStatus
     */
    public void setTdeStatus(String tdeStatus) {
        this.tdeStatus = tdeStatus;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public StatusDetail instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @param instanceName
     */
    public StatusDetail instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceStatus
     */
    public StatusDetail instanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set 开启TDE加密后，实例级别的TDE生效状态，TDE加密已生效，返回true；如未生效，返回false；
     *
     * @param tdeStatus
     */
    public StatusDetail tdeStatus(String tdeStatus) {
        this.tdeStatus = tdeStatus;
        return this;
    }


}