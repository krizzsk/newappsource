package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListStreamsResult implements Serializable {
    private Boolean hasMoreStreams;
    private List<String> streamNames = new ArrayList();

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListStreamsResult)) {
            return false;
        }
        ListStreamsResult listStreamsResult = (ListStreamsResult) obj;
        if (listStreamsResult.getStreamNames() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getStreamNames() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (listStreamsResult.getStreamNames() != null && !listStreamsResult.getStreamNames().equals(getStreamNames())) {
            return false;
        }
        if (listStreamsResult.getHasMoreStreams() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getHasMoreStreams() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listStreamsResult.getHasMoreStreams() == null || listStreamsResult.getHasMoreStreams().equals(getHasMoreStreams())) {
            return true;
        }
        return false;
    }

    public Boolean getHasMoreStreams() {
        return this.hasMoreStreams;
    }

    public List<String> getStreamNames() {
        return this.streamNames;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getStreamNames() == null) {
            i = 0;
        } else {
            i = getStreamNames().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getHasMoreStreams() != null) {
            i2 = getHasMoreStreams().hashCode();
        }
        return i3 + i2;
    }

    public Boolean isHasMoreStreams() {
        return this.hasMoreStreams;
    }

    public void setHasMoreStreams(Boolean bool) {
        this.hasMoreStreams = bool;
    }

    public void setStreamNames(Collection<String> collection) {
        if (collection == null) {
            this.streamNames = null;
        } else {
            this.streamNames = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getStreamNames() != null) {
            StringBuilder k2 = C13555b.m33972k("StreamNames: ");
            k2.append(getStreamNames());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getHasMoreStreams() != null) {
            StringBuilder k3 = C13555b.m33972k("HasMoreStreams: ");
            k3.append(getHasMoreStreams());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public ListStreamsResult withHasMoreStreams(Boolean bool) {
        this.hasMoreStreams = bool;
        return this;
    }

    public ListStreamsResult withStreamNames(String... strArr) {
        if (getStreamNames() == null) {
            this.streamNames = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.streamNames.add(add);
        }
        return this;
    }

    public ListStreamsResult withStreamNames(Collection<String> collection) {
        setStreamNames(collection);
        return this;
    }
}
