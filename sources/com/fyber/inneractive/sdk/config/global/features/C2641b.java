package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C2834a;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.b */
public class C2641b extends C2644e {

    /* renamed from: e */
    public C2834a f9301e;

    public C2641b() {
        super("cta_locale");
    }

    /* renamed from: b */
    public C2644e mo13234b() {
        C2641b bVar = new C2641b();
        mo13238a((C2644e) bVar);
        return bVar;
    }

    /* renamed from: e */
    public void mo13235e(String str) {
        if (!TextUtils.isEmpty(str) && this.f9301e == null) {
            String a = mo13237a("install_" + str, (String) null);
            String a2 = mo13237a("skip_ad_" + str, (String) null);
            this.f9301e = new C2834a(a, a2, mo13237a("skip_in_" + str, (String) null));
        }
    }
}
