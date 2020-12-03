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

package com.jdcloud.sdk.service.waf.model;


/**
 * domainRegionInfo
 */
public class DomainRegionInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名的在华北的vip和选中信息
     */
    private RegionVipInfo hb_bgp;

    /**
     * 域名的在华东的vip和选中信息
     */
    private RegionVipInfo hd_bgp;

    /**
     * 域名的在华南的vip和选中信息
     */
    private RegionVipInfo hn;


    /**
     * get 域名的在华北的vip和选中信息
     *
     * @return
     */
    public RegionVipInfo getHb_bgp() {
        return hb_bgp;
    }

    /**
     * set 域名的在华北的vip和选中信息
     *
     * @param hb_bgp
     */
    public void setHb_bgp(RegionVipInfo hb_bgp) {
        this.hb_bgp = hb_bgp;
    }

    /**
     * get 域名的在华东的vip和选中信息
     *
     * @return
     */
    public RegionVipInfo getHd_bgp() {
        return hd_bgp;
    }

    /**
     * set 域名的在华东的vip和选中信息
     *
     * @param hd_bgp
     */
    public void setHd_bgp(RegionVipInfo hd_bgp) {
        this.hd_bgp = hd_bgp;
    }

    /**
     * get 域名的在华南的vip和选中信息
     *
     * @return
     */
    public RegionVipInfo getHn() {
        return hn;
    }

    /**
     * set 域名的在华南的vip和选中信息
     *
     * @param hn
     */
    public void setHn(RegionVipInfo hn) {
        this.hn = hn;
    }


    /**
     * set 域名的在华北的vip和选中信息
     *
     * @param hb_bgp
     */
    public DomainRegionInfo hb_bgp(RegionVipInfo hb_bgp) {
        this.hb_bgp = hb_bgp;
        return this;
    }

    /**
     * set 域名的在华东的vip和选中信息
     *
     * @param hd_bgp
     */
    public DomainRegionInfo hd_bgp(RegionVipInfo hd_bgp) {
        this.hd_bgp = hd_bgp;
        return this;
    }

    /**
     * set 域名的在华南的vip和选中信息
     *
     * @param hn
     */
    public DomainRegionInfo hn(RegionVipInfo hn) {
        this.hn = hn;
        return this;
    }


}