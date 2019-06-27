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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加自定义转码模板
- 系统为您预设了标准转码模板,如果不能满足您的转码需求,可以通过此接口添加自定义转码模板
- 系统标准转码模板
    ld (h.264/640*360/15f)
    sd (h.264/960*540/24f)
    hd (h.264/1280*720/25f)
    shd (h.264/1920*1080/30f)
    ld.265 (h.265/640*360/15f)
    sd.265 (h.265/960*540/24f)
    hd.265 (h.265/1280*720/25f)
    shd.265 (h.265/1920*1080/30f)

 */
public class AddCustomLiveStreamTranscodeTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 转码模板名称
- 长度范围：[1,50]

     */
    private String templateName;

    /**
     * 视频编码格式，取值：h264,h265，默认h264

     */
    private String videoCodec;

    /**
     * 转码输出的码率值
- 取值范围: [1,6000]
- 单位: kpbs

     * Required:true
     */
    @Required
    private Integer videoCodeRate;

    /**
     * 转码输出的帧率值
- 取值：[1,30]

     * Required:true
     */
    @Required
    private String videoFrameRate;

    /**
     * 转码输出视频宽度
- 取值: [128,1920]
- 如果(width,height)只设置其中之一,则按所设置参数项等比缩放另一项输出转码
- 如果(width,height)都不设置，则按源流大小输出转码

     */
    private Integer width;

    /**
     * 转码输出视频宽度
- 取值: [128,1920]
- 如果(width,height)只设置其中之一,则按所设置参数项等比缩放另一项输出转码
- 如果(width,height)都不设置，则按源流大小输出转码

     */
    private Integer height;

    /**
     * 转码模板(转码流输出后缀)
- 取值要求：数字、大小写字母或短横线(&quot;-&quot;),必须以数字或字母作为开头和结尾,长度不超过50字符
- &lt;b&gt;注意: 不能与系统的标准的转码模板和当前用户已自定义命名重复&lt;/b&gt;
- 系统标准转码模板
  ld (h.264/640*360/15f)
  sd (h.264/960*540/24f)
  hd (h.264/1280*720/25f)
  shd (h.264/1920*1080/30f)
  ld.265 (h.265/640*360/15f)
  sd.265 (h.265/960*540/24f)
  hd.265 (h.265/1280*720/25f)
  shd.265 (h.265/1920*1080/30f)

     * Required:true
     */
    @Required
    private String template;

    /**
     * 转码输出音频编码格式
- 取值: aac、mp3
- 不区分大小写

     * Required:true
     */
    @Required
    private String audioCodec;

    /**
     * 转码输出音频格式
- 取值: aac_lc，aac_low，aac_he，aac_he_v2
- 不区分大小写

     * Required:true
     */
    @Required
    private String audioFormat;

    /**
     * 转码输出音频采样率
- 取值: [44100,48000]

     * Required:true
     */
    @Required
    private Integer audioSampleRate;

    /**
     * 转码输出音频通道数
  1: 单声道
  2: 双声道

     * Required:true
     */
    @Required
    private Integer audioChannel;

    /**
     * 转码输出音频码率
- 取值: [16,128]
- 单位: kbps

     * Required:true
     */
    @Required
    private Integer audioCodeRate;


    /**
     * get 转码模板名称
- 长度范围：[1,50]

     *
     * @return
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * set 转码模板名称
- 长度范围：[1,50]

     *
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * get 视频编码格式，取值：h264,h265，默认h264

     *
     * @return
     */
    public String getVideoCodec() {
        return videoCodec;
    }

    /**
     * set 视频编码格式，取值：h264,h265，默认h264

     *
     * @param videoCodec
     */
    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    /**
     * get 转码输出的码率值
- 取值范围: [1,6000]
- 单位: kpbs

     *
     * @return
     */
    public Integer getVideoCodeRate() {
        return videoCodeRate;
    }

    /**
     * set 转码输出的码率值
- 取值范围: [1,6000]
- 单位: kpbs

     *
     * @param videoCodeRate
     */
    public void setVideoCodeRate(Integer videoCodeRate) {
        this.videoCodeRate = videoCodeRate;
    }

    /**
     * get 转码输出的帧率值
- 取值：[1,30]

     *
     * @return
     */
    public String getVideoFrameRate() {
        return videoFrameRate;
    }

    /**
     * set 转码输出的帧率值
- 取值：[1,30]

     *
     * @param videoFrameRate
     */
    public void setVideoFrameRate(String videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
    }

    /**
     * get 转码输出视频宽度
- 取值: [128,1920]
- 如果(width,height)只设置其中之一,则按所设置参数项等比缩放另一项输出转码
- 如果(width,height)都不设置，则按源流大小输出转码

     *
     * @return
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * set 转码输出视频宽度
- 取值: [128,1920]
- 如果(width,height)只设置其中之一,则按所设置参数项等比缩放另一项输出转码
- 如果(width,height)都不设置，则按源流大小输出转码

     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * get 转码输出视频宽度
- 取值: [128,1920]
- 如果(width,height)只设置其中之一,则按所设置参数项等比缩放另一项输出转码
- 如果(width,height)都不设置，则按源流大小输出转码

     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * set 转码输出视频宽度
- 取值: [128,1920]
- 如果(width,height)只设置其中之一,则按所设置参数项等比缩放另一项输出转码
- 如果(width,height)都不设置，则按源流大小输出转码

     *
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * get 转码模板(转码流输出后缀)
- 取值要求：数字、大小写字母或短横线(&quot;-&quot;),必须以数字或字母作为开头和结尾,长度不超过50字符
- &lt;b&gt;注意: 不能与系统的标准的转码模板和当前用户已自定义命名重复&lt;/b&gt;
- 系统标准转码模板
  ld (h.264/640*360/15f)
  sd (h.264/960*540/24f)
  hd (h.264/1280*720/25f)
  shd (h.264/1920*1080/30f)
  ld.265 (h.265/640*360/15f)
  sd.265 (h.265/960*540/24f)
  hd.265 (h.265/1280*720/25f)
  shd.265 (h.265/1920*1080/30f)

     *
     * @return
     */
    public String getTemplate() {
        return template;
    }

    /**
     * set 转码模板(转码流输出后缀)
- 取值要求：数字、大小写字母或短横线(&quot;-&quot;),必须以数字或字母作为开头和结尾,长度不超过50字符
- &lt;b&gt;注意: 不能与系统的标准的转码模板和当前用户已自定义命名重复&lt;/b&gt;
- 系统标准转码模板
  ld (h.264/640*360/15f)
  sd (h.264/960*540/24f)
  hd (h.264/1280*720/25f)
  shd (h.264/1920*1080/30f)
  ld.265 (h.265/640*360/15f)
  sd.265 (h.265/960*540/24f)
  hd.265 (h.265/1280*720/25f)
  shd.265 (h.265/1920*1080/30f)

     *
     * @param template
     */
    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * get 转码输出音频编码格式
- 取值: aac、mp3
- 不区分大小写

     *
     * @return
     */
    public String getAudioCodec() {
        return audioCodec;
    }

    /**
     * set 转码输出音频编码格式
- 取值: aac、mp3
- 不区分大小写

     *
     * @param audioCodec
     */
    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    /**
     * get 转码输出音频格式
- 取值: aac_lc，aac_low，aac_he，aac_he_v2
- 不区分大小写

     *
     * @return
     */
    public String getAudioFormat() {
        return audioFormat;
    }

    /**
     * set 转码输出音频格式
- 取值: aac_lc，aac_low，aac_he，aac_he_v2
- 不区分大小写

     *
     * @param audioFormat
     */
    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    /**
     * get 转码输出音频采样率
- 取值: [44100,48000]

     *
     * @return
     */
    public Integer getAudioSampleRate() {
        return audioSampleRate;
    }

    /**
     * set 转码输出音频采样率
- 取值: [44100,48000]

     *
     * @param audioSampleRate
     */
    public void setAudioSampleRate(Integer audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
    }

    /**
     * get 转码输出音频通道数
  1: 单声道
  2: 双声道

     *
     * @return
     */
    public Integer getAudioChannel() {
        return audioChannel;
    }

    /**
     * set 转码输出音频通道数
  1: 单声道
  2: 双声道

     *
     * @param audioChannel
     */
    public void setAudioChannel(Integer audioChannel) {
        this.audioChannel = audioChannel;
    }

    /**
     * get 转码输出音频码率
- 取值: [16,128]
- 单位: kbps

     *
     * @return
     */
    public Integer getAudioCodeRate() {
        return audioCodeRate;
    }

    /**
     * set 转码输出音频码率
- 取值: [16,128]
- 单位: kbps

     *
     * @param audioCodeRate
     */
    public void setAudioCodeRate(Integer audioCodeRate) {
        this.audioCodeRate = audioCodeRate;
    }


    /**
     * set 转码模板名称
- 长度范围：[1,50]

     *
     * @param templateName
     */
    public AddCustomLiveStreamTranscodeTemplateRequest templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * set 视频编码格式，取值：h264,h265，默认h264

     *
     * @param videoCodec
     */
    public AddCustomLiveStreamTranscodeTemplateRequest videoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }

    /**
     * set 转码输出的码率值
- 取值范围: [1,6000]
- 单位: kpbs

     *
     * @param videoCodeRate
     */
    public AddCustomLiveStreamTranscodeTemplateRequest videoCodeRate(Integer videoCodeRate) {
        this.videoCodeRate = videoCodeRate;
        return this;
    }

    /**
     * set 转码输出的帧率值
- 取值：[1,30]

     *
     * @param videoFrameRate
     */
    public AddCustomLiveStreamTranscodeTemplateRequest videoFrameRate(String videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
        return this;
    }

    /**
     * set 转码输出视频宽度
- 取值: [128,1920]
- 如果(width,height)只设置其中之一,则按所设置参数项等比缩放另一项输出转码
- 如果(width,height)都不设置，则按源流大小输出转码

     *
     * @param width
     */
    public AddCustomLiveStreamTranscodeTemplateRequest width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * set 转码输出视频宽度
- 取值: [128,1920]
- 如果(width,height)只设置其中之一,则按所设置参数项等比缩放另一项输出转码
- 如果(width,height)都不设置，则按源流大小输出转码

     *
     * @param height
     */
    public AddCustomLiveStreamTranscodeTemplateRequest height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * set 转码模板(转码流输出后缀)
- 取值要求：数字、大小写字母或短横线(&quot;-&quot;),必须以数字或字母作为开头和结尾,长度不超过50字符
- &lt;b&gt;注意: 不能与系统的标准的转码模板和当前用户已自定义命名重复&lt;/b&gt;
- 系统标准转码模板
  ld (h.264/640*360/15f)
  sd (h.264/960*540/24f)
  hd (h.264/1280*720/25f)
  shd (h.264/1920*1080/30f)
  ld.265 (h.265/640*360/15f)
  sd.265 (h.265/960*540/24f)
  hd.265 (h.265/1280*720/25f)
  shd.265 (h.265/1920*1080/30f)

     *
     * @param template
     */
    public AddCustomLiveStreamTranscodeTemplateRequest template(String template) {
        this.template = template;
        return this;
    }

    /**
     * set 转码输出音频编码格式
- 取值: aac、mp3
- 不区分大小写

     *
     * @param audioCodec
     */
    public AddCustomLiveStreamTranscodeTemplateRequest audioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }

    /**
     * set 转码输出音频格式
- 取值: aac_lc，aac_low，aac_he，aac_he_v2
- 不区分大小写

     *
     * @param audioFormat
     */
    public AddCustomLiveStreamTranscodeTemplateRequest audioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }

    /**
     * set 转码输出音频采样率
- 取值: [44100,48000]

     *
     * @param audioSampleRate
     */
    public AddCustomLiveStreamTranscodeTemplateRequest audioSampleRate(Integer audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
        return this;
    }

    /**
     * set 转码输出音频通道数
  1: 单声道
  2: 双声道

     *
     * @param audioChannel
     */
    public AddCustomLiveStreamTranscodeTemplateRequest audioChannel(Integer audioChannel) {
        this.audioChannel = audioChannel;
        return this;
    }

    /**
     * set 转码输出音频码率
- 取值: [16,128]
- 单位: kbps

     *
     * @param audioCodeRate
     */
    public AddCustomLiveStreamTranscodeTemplateRequest audioCodeRate(Integer audioCodeRate) {
        this.audioCodeRate = audioCodeRate;
        return this;
    }


}