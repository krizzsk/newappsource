package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.C2667h;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.util.g */
public class C3691g {
    /* renamed from: a */
    public static boolean m9936a(UnitDisplayType unitDisplayType, C2667h hVar) {
        return !unitDisplayType.isFullscreenUnit() || hVar.mo13273a("use_fraud_detection_fullscreen", true);
    }
}
