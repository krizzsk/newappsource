package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.securitytoken.model.Tag;
import com.amazonaws.util.StringUtils;

class TagStaxMarshaller {
    private static TagStaxMarshaller instance;

    public static TagStaxMarshaller getInstance() {
        if (instance == null) {
            instance = new TagStaxMarshaller();
        }
        return instance;
    }

    public void marshall(Tag tag, Request<?> request, String str) {
        if (tag.getKey() != null) {
            request.addParameter(C25541a.m63881k(str, "Key"), StringUtils.fromString(tag.getKey()));
        }
        if (tag.getValue() != null) {
            request.addParameter(C25541a.m63881k(str, "Value"), StringUtils.fromString(tag.getValue()));
        }
    }
}
