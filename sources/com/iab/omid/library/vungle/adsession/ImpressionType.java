package com.iab.omid.library.vungle.adsession;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;

public enum ImpressionType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER(InneractiveMediationNameConsts.OTHER);
    
    private final String impressionType;

    private ImpressionType(String str) {
        this.impressionType = str;
    }

    public String toString() {
        return this.impressionType;
    }
}
