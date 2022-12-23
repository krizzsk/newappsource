package com.fyber.inneractive.sdk.config.enums;

import java.util.HashMap;
import java.util.Map;

public enum UnitDisplayType {
    INTERSTITIAL("interstitial", false),
    LANDSCAPE("landscape", true),
    MRECT("mrect", false),
    BANNER("banner", false),
    REWARDED("rewarded", false),
    SQUARE("square", true),
    VERTICAL("vertical", true),
    DEFAULT("default", false);
    
    private static final Map<String, UnitDisplayType> CONSTANTS = null;
    private final boolean deprecated;
    private String stringValue;

    /* access modifiers changed from: public */
    static {
        int i;
        CONSTANTS = new HashMap();
        for (UnitDisplayType unitDisplayType : values()) {
            CONSTANTS.put(unitDisplayType.stringValue, unitDisplayType);
        }
    }

    private UnitDisplayType(String str, boolean z) {
        this.stringValue = str;
        this.deprecated = z;
    }

    public static UnitDisplayType fromValue(String str) {
        UnitDisplayType unitDisplayType = CONSTANTS.get(str);
        if (unitDisplayType != null) {
            return unitDisplayType;
        }
        return DEFAULT;
    }

    public boolean isDeprecated() {
        return this.deprecated;
    }

    public boolean isFullscreenUnit() {
        return this == INTERSTITIAL || this == REWARDED;
    }

    public String toString() {
        return this.stringValue;
    }

    public String value() {
        return this.stringValue;
    }
}
