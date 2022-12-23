package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListTagsForStreamResult implements Serializable {
    private Boolean hasMoreTags;
    private List<Tag> tags = new ArrayList();

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTagsForStreamResult)) {
            return false;
        }
        ListTagsForStreamResult listTagsForStreamResult = (ListTagsForStreamResult) obj;
        if (listTagsForStreamResult.getTags() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getTags() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (listTagsForStreamResult.getTags() != null && !listTagsForStreamResult.getTags().equals(getTags())) {
            return false;
        }
        if (listTagsForStreamResult.getHasMoreTags() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getHasMoreTags() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listTagsForStreamResult.getHasMoreTags() == null || listTagsForStreamResult.getHasMoreTags().equals(getHasMoreTags())) {
            return true;
        }
        return false;
    }

    public Boolean getHasMoreTags() {
        return this.hasMoreTags;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getTags() == null) {
            i = 0;
        } else {
            i = getTags().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getHasMoreTags() != null) {
            i2 = getHasMoreTags().hashCode();
        }
        return i3 + i2;
    }

    public Boolean isHasMoreTags() {
        return this.hasMoreTags;
    }

    public void setHasMoreTags(Boolean bool) {
        this.hasMoreTags = bool;
    }

    public void setTags(Collection<Tag> collection) {
        if (collection == null) {
            this.tags = null;
        } else {
            this.tags = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getTags() != null) {
            StringBuilder k2 = C13555b.m33972k("Tags: ");
            k2.append(getTags());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getHasMoreTags() != null) {
            StringBuilder k3 = C13555b.m33972k("HasMoreTags: ");
            k3.append(getHasMoreTags());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public ListTagsForStreamResult withHasMoreTags(Boolean bool) {
        this.hasMoreTags = bool;
        return this;
    }

    public ListTagsForStreamResult withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag add : tagArr) {
            this.tags.add(add);
        }
        return this;
    }

    public ListTagsForStreamResult withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
