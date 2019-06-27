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

package com.jdcloud.sdk.service.live.model;


/**
 * watermarkTemplate
 */
public class WatermarkTemplate  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 水印位置
- 取值范围：左上：1，右上：3， 左下：7，右下：9，默认：1

     */
    private Integer position;

    /**
     * x轴偏移量
- 单位: 像素

     */
    private Integer offSetX;

    /**
     * y轴偏移量
- 单位: 像素

     */
    private Integer offSetY;

    /**
     * 水印宽度
- 单位: 像素

     */
    private Integer width;

    /**
     * 水印高度
- 单位: 像素

     */
    private Integer height;

    /**
     * 水印地址

     */
    private String url;

    /**
     * 水印模板自定义名称

     */
    private String template;


    /**
     * get 水印位置
- 取值范围：左上：1，右上：3， 左下：7，右下：9，默认：1

     *
     * @return
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * set 水印位置
- 取值范围：左上：1，右上：3， 左下：7，右下：9，默认：1

     *
     * @param position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * get x轴偏移量
- 单位: 像素

     *
     * @return
     */
    public Integer getOffSetX() {
        return offSetX;
    }

    /**
     * set x轴偏移量
- 单位: 像素

     *
     * @param offSetX
     */
    public void setOffSetX(Integer offSetX) {
        this.offSetX = offSetX;
    }

    /**
     * get y轴偏移量
- 单位: 像素

     *
     * @return
     */
    public Integer getOffSetY() {
        return offSetY;
    }

    /**
     * set y轴偏移量
- 单位: 像素

     *
     * @param offSetY
     */
    public void setOffSetY(Integer offSetY) {
        this.offSetY = offSetY;
    }

    /**
     * get 水印宽度
- 单位: 像素

     *
     * @return
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * set 水印宽度
- 单位: 像素

     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * get 水印高度
- 单位: 像素

     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * set 水印高度
- 单位: 像素

     *
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * get 水印地址

     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set 水印地址

     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * get 水印模板自定义名称

     *
     * @return
     */
    public String getTemplate() {
        return template;
    }

    /**
     * set 水印模板自定义名称

     *
     * @param template
     */
    public void setTemplate(String template) {
        this.template = template;
    }


    /**
     * set 水印位置
- 取值范围：左上：1，右上：3， 左下：7，右下：9，默认：1

     *
     * @param position
     */
    public WatermarkTemplate position(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * set x轴偏移量
- 单位: 像素

     *
     * @param offSetX
     */
    public WatermarkTemplate offSetX(Integer offSetX) {
        this.offSetX = offSetX;
        return this;
    }

    /**
     * set y轴偏移量
- 单位: 像素

     *
     * @param offSetY
     */
    public WatermarkTemplate offSetY(Integer offSetY) {
        this.offSetY = offSetY;
        return this;
    }

    /**
     * set 水印宽度
- 单位: 像素

     *
     * @param width
     */
    public WatermarkTemplate width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * set 水印高度
- 单位: 像素

     *
     * @param height
     */
    public WatermarkTemplate height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * set 水印地址

     *
     * @param url
     */
    public WatermarkTemplate url(String url) {
        this.url = url;
        return this;
    }

    /**
     * set 水印模板自定义名称

     *
     * @param template
     */
    public WatermarkTemplate template(String template) {
        this.template = template;
        return this;
    }


}