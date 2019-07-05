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
 * Video Transcode Template Management
 * 水印管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;


/**
 * 音频参数
 */
public class Audio  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 音频编码
     */
    private String codec;

    /**
     * 码率
     */
    private Integer bitrate;

    /**
     * 采样率
     */
    private Integer sampleRate;

    /**
     * 声道数
     */
    private Integer channels;


    /**
     * get 音频编码
     *
     * @return
     */
    public String getCodec() {
        return codec;
    }

    /**
     * set 音频编码
     *
     * @param codec
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * get 码率
     *
     * @return
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * set 码率
     *
     * @param bitrate
     */
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * get 采样率
     *
     * @return
     */
    public Integer getSampleRate() {
        return sampleRate;
    }

    /**
     * set 采样率
     *
     * @param sampleRate
     */
    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * get 声道数
     *
     * @return
     */
    public Integer getChannels() {
        return channels;
    }

    /**
     * set 声道数
     *
     * @param channels
     */
    public void setChannels(Integer channels) {
        this.channels = channels;
    }


    /**
     * set 音频编码
     *
     * @param codec
     */
    public Audio codec(String codec) {
        this.codec = codec;
        return this;
    }

    /**
     * set 码率
     *
     * @param bitrate
     */
    public Audio bitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * set 采样率
     *
     * @param sampleRate
     */
    public Audio sampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * set 声道数
     *
     * @param channels
     */
    public Audio channels(Integer channels) {
        this.channels = channels;
        return this;
    }


}