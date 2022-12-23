package com.appsflyer.internal;

import com.appboy.support.StringUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;

public enum b$d {
    NULL(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING),
    COM_ANDROID_VENDING("cav"),
    OTHER(InneractiveMediationNameConsts.OTHER);
    
    public String $$b;

    private b$d(String str) {
        this.$$b = str;
    }
}
