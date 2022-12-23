package com.braze.enums;

import androidx.annotation.Keep;

@Keep
public enum BrazeDateFormat {
    SHORT("yyyy-MM-dd"),
    LONG("yyyy-MM-dd kk:mm:ss"),
    ANDROID_LOGCAT("MM-dd kk:mm:ss.SSS"),
    CLOCK_12_HOUR("h:mm a");
    
    public final String mFormat;

    /* access modifiers changed from: public */
    BrazeDateFormat(String str) {
        this.mFormat = str;
    }

    public String getFormat() {
        return this.mFormat;
    }
}
