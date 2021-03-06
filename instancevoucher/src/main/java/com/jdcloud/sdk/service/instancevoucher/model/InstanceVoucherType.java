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

package com.jdcloud.sdk.service.instancevoucher.model;

import java.util.List;
import java.util.ArrayList;

/**
 * instanceVoucherType
 */
public class InstanceVoucherType  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例规格族
     */
    private String instanceTypeFamily;

    /**
     * 实例规格
     */
    private List<InstanceType> instanceTypes;


    /**
     * get 实例规格族
     *
     * @return
     */
    public String getInstanceTypeFamily() {
        return instanceTypeFamily;
    }

    /**
     * set 实例规格族
     *
     * @param instanceTypeFamily
     */
    public void setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
    }

    /**
     * get 实例规格
     *
     * @return
     */
    public List<InstanceType> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * set 实例规格
     *
     * @param instanceTypes
     */
    public void setInstanceTypes(List<InstanceType> instanceTypes) {
        this.instanceTypes = instanceTypes;
    }


    /**
     * set 实例规格族
     *
     * @param instanceTypeFamily
     */
    public InstanceVoucherType instanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }

    /**
     * set 实例规格
     *
     * @param instanceTypes
     */
    public InstanceVoucherType instanceTypes(List<InstanceType> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }


    /**
     * add item to 实例规格
     *
     * @param instanceType
     */
    public void addInstanceType(InstanceType instanceType) {
        if (this.instanceTypes == null) {
            this.instanceTypes = new ArrayList<>();
        }
        this.instanceTypes.add(instanceType);
    }

}