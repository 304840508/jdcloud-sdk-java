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

package com.jdcloud.sdk.service.detection.model;

import java.util.List;
import java.util.ArrayList;

/**
 * resourceOption
 */
public class ResourceOption  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指定具体资源ID设置报警规则，每次最多100个。优先resourceItems生效
     */
    private List<ResourceItem> resourceItems;

    /**
     * tagsOption
     */
    private TagsOption tagsOption;


    /**
     * get 指定具体资源ID设置报警规则，每次最多100个。优先resourceItems生效
     *
     * @return
     */
    public List<ResourceItem> getResourceItems() {
        return resourceItems;
    }

    /**
     * set 指定具体资源ID设置报警规则，每次最多100个。优先resourceItems生效
     *
     * @param resourceItems
     */
    public void setResourceItems(List<ResourceItem> resourceItems) {
        this.resourceItems = resourceItems;
    }

    /**
     * get tagsOption
     *
     * @return
     */
    public TagsOption getTagsOption() {
        return tagsOption;
    }

    /**
     * set tagsOption
     *
     * @param tagsOption
     */
    public void setTagsOption(TagsOption tagsOption) {
        this.tagsOption = tagsOption;
    }


    /**
     * set 指定具体资源ID设置报警规则，每次最多100个。优先resourceItems生效
     *
     * @param resourceItems
     */
    public ResourceOption resourceItems(List<ResourceItem> resourceItems) {
        this.resourceItems = resourceItems;
        return this;
    }

    /**
     * set tagsOption
     *
     * @param tagsOption
     */
    public ResourceOption tagsOption(TagsOption tagsOption) {
        this.tagsOption = tagsOption;
        return this;
    }


    /**
     * add item to 指定具体资源ID设置报警规则，每次最多100个。优先resourceItems生效
     *
     * @param resourceItem
     */
    public void addResourceItem(ResourceItem resourceItem) {
        if (this.resourceItems == null) {
            this.resourceItems = new ArrayList<>();
        }
        this.resourceItems.add(resourceItem);
    }

}