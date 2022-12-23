package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    private String resourceArn;
    private Map<String, String> tags;

    public TagResourceRequest addTagsEntry(String str, String str2) {
        if (this.tags == null) {
            this.tags = new HashMap();
        }
        if (!this.tags.containsKey(str)) {
            this.tags.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException(C25541a.m63883n(str, C13555b.m33972k("Duplicated keys ("), ") are provided."));
    }

    public TagResourceRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TagResourceRequest)) {
            return false;
        }
        TagResourceRequest tagResourceRequest = (TagResourceRequest) obj;
        if (tagResourceRequest.getResourceArn() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getResourceArn() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (tagResourceRequest.getResourceArn() != null && !tagResourceRequest.getResourceArn().equals(getResourceArn())) {
            return false;
        }
        if (tagResourceRequest.getTags() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getTags() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (tagResourceRequest.getTags() == null || tagResourceRequest.getTags().equals(getTags())) {
            return true;
        }
        return false;
    }

    public String getResourceArn() {
        return this.resourceArn;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getResourceArn() == null) {
            i = 0;
        } else {
            i = getResourceArn().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getTags() != null) {
            i2 = getTags().hashCode();
        }
        return i3 + i2;
    }

    public void setResourceArn(String str) {
        this.resourceArn = str;
    }

    public void setTags(Map<String, String> map) {
        this.tags = map;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getResourceArn() != null) {
            StringBuilder k2 = C13555b.m33972k("ResourceArn: ");
            k2.append(getResourceArn());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getTags() != null) {
            StringBuilder k3 = C13555b.m33972k("Tags: ");
            k3.append(getTags());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public TagResourceRequest withResourceArn(String str) {
        this.resourceArn = str;
        return this;
    }

    public TagResourceRequest withTags(Map<String, String> map) {
        this.tags = map;
        return this;
    }
}
