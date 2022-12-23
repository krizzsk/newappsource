package com.appboy.enums;

import androidx.annotation.Keep;
import com.appboy.models.IPutIntoJson;

@Keep
public enum SdkFlavor implements IPutIntoJson<String> {
    UNITY("unity"),
    REACT("react"),
    CORDOVA("cordova"),
    XAMARIN("xamarin"),
    FLUTTER("flutter"),
    SEGMENT("segment"),
    TEALIUM("tealium"),
    MPARTICLE("mparticle");
    
    public final String mJsonKey;

    /* access modifiers changed from: public */
    SdkFlavor(String str) {
        this.mJsonKey = str;
    }

    public String forJsonPut() {
        return this.mJsonKey;
    }
}
