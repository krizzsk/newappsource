package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UntagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    private String resourceArn;
    private List<String> tagKeys;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UntagResourceRequest)) {
            return false;
        }
        UntagResourceRequest untagResourceRequest = (UntagResourceRequest) obj;
        if (untagResourceRequest.getResourceArn() == null) {
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
        if (untagResourceRequest.getResourceArn() != null && !untagResourceRequest.getResourceArn().equals(getResourceArn())) {
            return false;
        }
        if (untagResourceRequest.getTagKeys() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getTagKeys() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (untagResourceRequest.getTagKeys() == null || untagResourceRequest.getTagKeys().equals(getTagKeys())) {
            return true;
        }
        return false;
    }

    public String getResourceArn() {
        return this.resourceArn;
    }

    public List<String> getTagKeys() {
        return this.tagKeys;
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
        if (getTagKeys() != null) {
            i2 = getTagKeys().hashCode();
        }
        return i3 + i2;
    }

    public void setResourceArn(String str) {
        this.resourceArn = str;
    }

    public void setTagKeys(Collection<String> collection) {
        if (collection == null) {
            this.tagKeys = null;
        } else {
            this.tagKeys = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getResourceArn() != null) {
            StringBuilder k2 = C13555b.m33972k("ResourceArn: ");
            k2.append(getResourceArn());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getTagKeys() != null) {
            StringBuilder k3 = C13555b.m33972k("TagKeys: ");
            k3.append(getTagKeys());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public UntagResourceRequest withResourceArn(String str) {
        this.resourceArn = str;
        return this;
    }

    public UntagResourceRequest withTagKeys(String... strArr) {
        if (getTagKeys() == null) {
            this.tagKeys = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.tagKeys.add(add);
        }
        return this;
    }

    public UntagResourceRequest withTagKeys(Collection<String> collection) {
        setTagKeys(collection);
        return this;
    }
}
