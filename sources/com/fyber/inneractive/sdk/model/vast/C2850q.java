package com.fyber.inneractive.sdk.model.vast;

import com.facebook.ads.AdSDKNotificationListener;
import com.usebutton.sdk.internal.models.Widget;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.model.vast.q */
public enum C2850q {
    EVENT_IMPRESSION(AdSDKNotificationListener.IMPRESSION_EVENT),
    EVENT_START("start"),
    EVENT_FIRSTQ("firstQuartile"),
    EVENT_MID("midpoint"),
    EVENT_THIRDQ("thirdQuartile"),
    EVENT_COMPLETE("complete"),
    EVENT_MUTE("mute"),
    EVENT_UNMUTE("unmute"),
    EVENT_FULLSCREEN(Widget.VIEW_TYPE_FULLSCREEN),
    EVENT_CREATIVE_VIEW("creativeView"),
    EVENT_CLICK("click"),
    EVENT_ERROR("error"),
    EVENT_REWIND("rewind"),
    EVENT_CLOSE("close"),
    EVENT_VERIFICATION_NOT_EXECUTED("verificationNotExecuted"),
    EVENT_EXPAND("expand"),
    EVENT_COLLAPSE("collapse"),
    EVENT_CLOSE_LINEAR("closeLinear"),
    UNKNOWN("UnkownEvent");
    

    /* renamed from: u */
    public static final Map<String, C2850q> f9825u = null;

    /* renamed from: a */
    public final String f9827a;

    /* access modifiers changed from: public */
    static {
        f9825u = new HashMap();
        for (C2850q qVar : values()) {
            ((HashMap) f9825u).put(qVar.f9827a, qVar);
        }
    }

    /* access modifiers changed from: public */
    C2850q(String str) {
        this.f9827a = str;
    }

    /* renamed from: a */
    public static C2850q m7073a(String str) {
        HashMap hashMap = (HashMap) f9825u;
        return hashMap.containsKey(str) ? (C2850q) hashMap.get(str) : UNKNOWN;
    }
}
