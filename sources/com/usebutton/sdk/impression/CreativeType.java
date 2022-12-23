package com.usebutton.sdk.impression;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.analytics.ecommerce.ProductAction;

public enum CreativeType {
    HERO(0, "hero"),
    CAROUSEL(1, "carousel"),
    LIST(2, "list"),
    GRID(3, "grid"),
    DETAIL(4, ProductAction.ACTION_DETAIL),
    OTHER(5, InneractiveMediationNameConsts.OTHER);
    
    private final int attributeValue;
    private final String eventValue;

    private CreativeType(int i, String str) {
        this.attributeValue = i;
        this.eventValue = str;
    }

    public static CreativeType getCreativeType(int i) {
        for (CreativeType creativeType : values()) {
            if (creativeType.getAttributeValue() == i) {
                return creativeType;
            }
        }
        return OTHER;
    }

    public int getAttributeValue() {
        return this.attributeValue;
    }

    public String getEventValue() {
        return this.eventValue;
    }
}
