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
 * 添加用户自定义水印模板

 */
public class AddCustomLiveStreamWatermarkTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * x轴偏移量
- 单位: 像素

     * Required:true
     */
    @Required
    private Integer offsetX;

    /**
     * y轴偏移量:
- 单位: 像素

     * Required:true
     */
    @Required
    private Integer offsetY;

    /**
     * 水印宽度:
- 取值: [0,1920]
- 单位: 像素

     * Required:true
     */
    @Required
    private Integer width;

    /**
     * 水印高度:
- 取值: [0,1920]
- 单位: 像素

     * Required:true
     */
    @Required
    private Integer height;

    /**
     * 自定义水印模板名称
-&amp;ensp;取值要求: 数字、大小写字母、短横线(&quot;-&quot;)、下划线(&quot;_&quot;),
&amp;ensp;&amp;ensp;首尾不能有特殊字符(&quot;-&quot;),
&amp;ensp;&amp;ensp;不超过50字符,utf-8格式
-&amp;ensp;&lt;b&gt;注意: 不能与已定义命名重复&lt;/b&gt;

     * Required:true
     */
    @Required
    private String template;

    /**
     * 创建上传任务时返回的uploadId参数，当通过接口上传水印图片时，uploadId必填

     */
    private String uploadId;

    /**
     * 水印地址&lt;br&gt;-&amp;ensp;以&amp;ensp;http:// 开头,可公开访问地址&lt;br&gt;
     * Required:true
     */
    @Required
    private String url;


    /**
     * get x轴偏移量
- 单位: 像素

     *
     * @return
     */
    public Integer getOffsetX() {
        return offsetX;
    }

    /**
     * set x轴偏移量
- 单位: 像素

     *
     * @param offsetX
     */
    public void setOffsetX(Integer offsetX) {
        this.offsetX = offsetX;
    }

    /**
     * get y轴偏移量:
- 单位: 像素

     *
     * @return
     */
    public Integer getOffsetY() {
        return offsetY;
    }

    /**
     * set y轴偏移量:
- 单位: 像素

     *
     * @param offsetY
     */
    public void setOffsetY(Integer offsetY) {
        this.offsetY = offsetY;
    }

    /**
     * get 水印宽度:
- 取值: [0,1920]
- 单位: 像素

     *
     * @return
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * set 水印宽度:
- 取值: [0,1920]
- 单位: 像素

     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * get 水印高度:
- 取值: [0,1920]
- 单位: 像素

     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * set 水印高度:
- 取值: [0,1920]
- 单位: 像素

     *
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * get 自定义水印模板名称
-&amp;ensp;取值要求: 数字、大小写字母、短横线(&quot;-&quot;)、下划线(&quot;_&quot;),
&amp;ensp;&amp;ensp;首尾不能有特殊字符(&quot;-&quot;),
&amp;ensp;&amp;ensp;不超过50字符,utf-8格式
-&amp;ensp;&lt;b&gt;注意: 不能与已定义命名重复&lt;/b&gt;

     *
     * @return
     */
    public String getTemplate() {
        return template;
    }

    /**
     * set 自定义水印模板名称
-&amp;ensp;取值要求: 数字、大小写字母、短横线(&quot;-&quot;)、下划线(&quot;_&quot;),
&amp;ensp;&amp;ensp;首尾不能有特殊字符(&quot;-&quot;),
&amp;ensp;&amp;ensp;不超过50字符,utf-8格式
-&amp;ensp;&lt;b&gt;注意: 不能与已定义命名重复&lt;/b&gt;

     *
     * @param template
     */
    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * get 创建上传任务时返回的uploadId参数，当通过接口上传水印图片时，uploadId必填

     *
     * @return
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * set 创建上传任务时返回的uploadId参数，当通过接口上传水印图片时，uploadId必填

     *
     * @param uploadId
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * get 水印地址&lt;br&gt;-&amp;ensp;以&amp;ensp;http:// 开头,可公开访问地址&lt;br&gt;
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set 水印地址&lt;br&gt;-&amp;ensp;以&amp;ensp;http:// 开头,可公开访问地址&lt;br&gt;
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * set x轴偏移量
- 单位: 像素

     *
     * @param offsetX
     */
    public AddCustomLiveStreamWatermarkTemplateRequest offsetX(Integer offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    /**
     * set y轴偏移量:
- 单位: 像素

     *
     * @param offsetY
     */
    public AddCustomLiveStreamWatermarkTemplateRequest offsetY(Integer offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    /**
     * set 水印宽度:
- 取值: [0,1920]
- 单位: 像素

     *
     * @param width
     */
    public AddCustomLiveStreamWatermarkTemplateRequest width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * set 水印高度:
- 取值: [0,1920]
- 单位: 像素

     *
     * @param height
     */
    public AddCustomLiveStreamWatermarkTemplateRequest height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * set 自定义水印模板名称
-&amp;ensp;取值要求: 数字、大小写字母、短横线(&quot;-&quot;)、下划线(&quot;_&quot;),
&amp;ensp;&amp;ensp;首尾不能有特殊字符(&quot;-&quot;),
&amp;ensp;&amp;ensp;不超过50字符,utf-8格式
-&amp;ensp;&lt;b&gt;注意: 不能与已定义命名重复&lt;/b&gt;

     *
     * @param template
     */
    public AddCustomLiveStreamWatermarkTemplateRequest template(String template) {
        this.template = template;
        return this;
    }

    /**
     * set 创建上传任务时返回的uploadId参数，当通过接口上传水印图片时，uploadId必填

     *
     * @param uploadId
     */
    public AddCustomLiveStreamWatermarkTemplateRequest uploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * set 水印地址&lt;br&gt;-&amp;ensp;以&amp;ensp;http:// 开头,可公开访问地址&lt;br&gt;
     *
     * @param url
     */
    public AddCustomLiveStreamWatermarkTemplateRequest url(String url) {
        this.url = url;
        return this;
    }


}