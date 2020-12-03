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
 * Asset-Management
 * API about asset
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.asset.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询账户金额（总金额、可用金额、冻结金额、可提现金额、提现中金额）
 */
public class DescribeAccountAmountResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总金额：可用金额+冻结金额
     */
    private String totalAmount;

    /**
     * 可用金额
     */
    private String availableAmount;

    /**
     * 冻结金额：提现失败、处理中或预占中金额
     */
    private String frozenAmount;

    /**
     * 可提现金额：排除对公充值金额总额后的充值总额，如果余额大于非对公充值总额,则为非对公充值总额，否则为余额（对公充值&#x3D;企业线下汇款+企业充值+活动充值金额）
     */
    private String enableWithdrawAmount;

    /**
     * 提现中金额：提现状态为处理中和预占中的金额
     */
    private String withdrawingAmount;


    /**
     * get 总金额：可用金额+冻结金额
     *
     * @return
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * set 总金额：可用金额+冻结金额
     *
     * @param totalAmount
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * get 可用金额
     *
     * @return
     */
    public String getAvailableAmount() {
        return availableAmount;
    }

    /**
     * set 可用金额
     *
     * @param availableAmount
     */
    public void setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
    }

    /**
     * get 冻结金额：提现失败、处理中或预占中金额
     *
     * @return
     */
    public String getFrozenAmount() {
        return frozenAmount;
    }

    /**
     * set 冻结金额：提现失败、处理中或预占中金额
     *
     * @param frozenAmount
     */
    public void setFrozenAmount(String frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    /**
     * get 可提现金额：排除对公充值金额总额后的充值总额，如果余额大于非对公充值总额,则为非对公充值总额，否则为余额（对公充值&#x3D;企业线下汇款+企业充值+活动充值金额）
     *
     * @return
     */
    public String getEnableWithdrawAmount() {
        return enableWithdrawAmount;
    }

    /**
     * set 可提现金额：排除对公充值金额总额后的充值总额，如果余额大于非对公充值总额,则为非对公充值总额，否则为余额（对公充值&#x3D;企业线下汇款+企业充值+活动充值金额）
     *
     * @param enableWithdrawAmount
     */
    public void setEnableWithdrawAmount(String enableWithdrawAmount) {
        this.enableWithdrawAmount = enableWithdrawAmount;
    }

    /**
     * get 提现中金额：提现状态为处理中和预占中的金额
     *
     * @return
     */
    public String getWithdrawingAmount() {
        return withdrawingAmount;
    }

    /**
     * set 提现中金额：提现状态为处理中和预占中的金额
     *
     * @param withdrawingAmount
     */
    public void setWithdrawingAmount(String withdrawingAmount) {
        this.withdrawingAmount = withdrawingAmount;
    }


    /**
     * set 总金额：可用金额+冻结金额
     *
     * @param totalAmount
     */
    public DescribeAccountAmountResult totalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * set 可用金额
     *
     * @param availableAmount
     */
    public DescribeAccountAmountResult availableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }

    /**
     * set 冻结金额：提现失败、处理中或预占中金额
     *
     * @param frozenAmount
     */
    public DescribeAccountAmountResult frozenAmount(String frozenAmount) {
        this.frozenAmount = frozenAmount;
        return this;
    }

    /**
     * set 可提现金额：排除对公充值金额总额后的充值总额，如果余额大于非对公充值总额,则为非对公充值总额，否则为余额（对公充值&#x3D;企业线下汇款+企业充值+活动充值金额）
     *
     * @param enableWithdrawAmount
     */
    public DescribeAccountAmountResult enableWithdrawAmount(String enableWithdrawAmount) {
        this.enableWithdrawAmount = enableWithdrawAmount;
        return this;
    }

    /**
     * set 提现中金额：提现状态为处理中和预占中的金额
     *
     * @param withdrawingAmount
     */
    public DescribeAccountAmountResult withdrawingAmount(String withdrawingAmount) {
        this.withdrawingAmount = withdrawingAmount;
        return this;
    }


}