package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class AddTagsToStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private String streamName;
    private Map<String, String> tags = new HashMap();

    public AddTagsToStreamRequest addTagsEntry(String str, String str2) {
        if (this.tags == null) {
            this.tags = new HashMap();
        }
        if (!this.tags.containsKey(str)) {
            this.tags.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException(C25541a.m63883n(str, C13555b.m33972k("Duplicated keys ("), ") are provided."));
    }

    public AddTagsToStreamRequest clearTagsEntries() {
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
        if (obj == null || !(obj instanceof AddTagsToStreamRequest)) {
            return false;
        }
        AddTagsToStreamRequest addTagsToStreamRequest = (AddTagsToStreamRequest) obj;
        if (addTagsToStreamRequest.getStreamName() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getStreamName() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (addTagsToStreamRequest.getStreamName() != null && !addTagsToStreamRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (addTagsToStreamRequest.getTags() == null) {
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
        if (addTagsToStreamRequest.getTags() == null || addTagsToStreamRequest.getTags().equals(getTags())) {
            return true;
        }
        return false;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getStreamName() == null) {
            i = 0;
        } else {
            i = getStreamName().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getTags() != null) {
            i2 = getTags().hashCode();
        }
        return i3 + i2;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public void setTags(Map<String, String> map) {
        this.tags = map;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getStreamName() != null) {
            StringBuilder k2 = C13555b.m33972k("StreamName: ");
            k2.append(getStreamName());
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

    public AddTagsToStreamRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public AddTagsToStreamRequest withTags(Map<String, String> map) {
        this.tags = map;
        return this;
    }
}
