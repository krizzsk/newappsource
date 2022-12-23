package com.usebutton.sdk.internal.models;

public enum BrowserCardType {
    UNKNOWN("unknown"),
    PREDICTABLE_REWARDS_AVAILABLE("predictable_rewards_available"),
    PREDICTABLE_REWARDS_UNAVAILABLE("predictable_rewards_unavailable"),
    INSTANT_REWARDS("instant_rewards"),
    INSTALL_CARD("install_card"),
    POST_PURCHASE_INSTALL_CARD("post_purchase_install_card");
    
    private final String apiValue;

    private BrowserCardType(String str) {
        this.apiValue = str;
    }

    public static BrowserCardType getCardType(String str) {
        for (BrowserCardType browserCardType : values()) {
            if (browserCardType.getApiValue().equals(str)) {
                return browserCardType;
            }
        }
        return UNKNOWN;
    }

    public String getApiValue() {
        return this.apiValue;
    }
}
