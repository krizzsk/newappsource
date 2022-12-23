package com.appboy.enums;

import androidx.annotation.Keep;

@Keep
public enum CardType {
    BANNER,
    CAPTIONED_IMAGE,
    DEFAULT,
    SHORT_NEWS,
    TEXT_ANNOUNCEMENT,
    CONTROL;

    public static CardType fromValue(int i) {
        return values()[i];
    }

    public int getValue() {
        return ordinal();
    }
}
