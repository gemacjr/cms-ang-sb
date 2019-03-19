package com.swiftbeard.cms.vo;

import com.swiftbeard.cms.models.Category;
import com.swiftbeard.cms.models.Tag;


import java.util.Set;


public class NewsRequest {

    private String title;

    private String content;

    private Set<Category> categories;

    private Set<Tag> tags;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}
