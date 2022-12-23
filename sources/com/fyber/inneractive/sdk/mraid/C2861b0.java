package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;

/* renamed from: com.fyber.inneractive.sdk.mraid.b0 */
public class C2861b0 extends C2879t {

    /* renamed from: a */
    public final boolean f9843a;

    public C2861b0(boolean z) {
        this.f9843a = z;
    }

    /* renamed from: a */
    public String mo13660a() {
        String str;
        StringBuilder k = C13555b.m33972k("viewable: ");
        if (this.f9843a) {
            str = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
        } else {
            str = "false";
        }
        k.append(str);
        return k.toString();
    }
}
