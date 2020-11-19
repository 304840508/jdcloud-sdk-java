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
 * 账号管理
 * API related to Relational Database Service
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.rds.model.DBInstanceAccountForOps;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看某个RDS实例下的运维账号信息。&lt;br&gt;- 仅支持 MySQL，Percona，MariaDB
 */
public class DescribeAccountsForOpsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * accounts
     */
    private List<DBInstanceAccountForOps> accounts;

    /**
     * totalCount
     */
    private Integer totalCount;


    /**
     * get accounts
     *
     * @return
     */
    public List<DBInstanceAccountForOps> getAccounts() {
        return accounts;
    }

    /**
     * set accounts
     *
     * @param accounts
     */
    public void setAccounts(List<DBInstanceAccountForOps> accounts) {
        this.accounts = accounts;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set accounts
     *
     * @param accounts
     */
    public DescribeAccountsForOpsResult accounts(List<DBInstanceAccountForOps> accounts) {
        this.accounts = accounts;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeAccountsForOpsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to accounts
     *
     * @param account
     */
    public void addAccount(DBInstanceAccountForOps account) {
        if (this.accounts == null) {
            this.accounts = new ArrayList<>();
        }
        this.accounts.add(account);
    }

}