package com.appboy.enums;

import androidx.annotation.Keep;
import com.appboy.support.AppboyLogger;

@Keep
public enum Month {
    JANUARY(0),
    FEBRUARY(1),
    MARCH(2),
    APRIL(3),
    MAY(4),
    JUNE(5),
    JULY(6),
    AUGUST(7),
    SEPTEMBER(8),
    OCTOBER(9),
    NOVEMBER(10),
    DECEMBER(11);
    
    public static final String TAG = null;
    public final int mValue;

    /* access modifiers changed from: public */
    static {
        TAG = AppboyLogger.getBrazeLogTag(Month.class);
    }

    /* access modifiers changed from: public */
    Month(int i) {
        this.mValue = i;
    }

    public static Month getMonth(int i) {
        for (Month month : values()) {
            if (month.getValue() == i) {
                return month;
            }
        }
        AppboyLogger.m5459w(TAG, "No month with value " + i + ", value must be in (0,11)");
        return null;
    }

    public int getValue() {
        return this.mValue;
    }
}
