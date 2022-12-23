package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C2594c;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C2900f0;
import com.fyber.inneractive.sdk.network.C2916m0;
import p699oh.C18752e;

/* renamed from: com.fyber.inneractive.sdk.measurement.d */
public class C2820d extends C2816a {

    /* renamed from: b */
    public String f9681b;

    /* renamed from: c */
    public C18752e f9682c;

    /* renamed from: a */
    public static void m7017a(C2820d dVar, Context context) {
        dVar.getClass();
        C2900f0 f0Var = new C2900f0(new C2819c(dVar), context, new C2594c(String.format("https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/%s.js", new Object[]{"1.3.30-Fyber"}), "omid-latest.js"));
        IAConfigManager.f9202J.f9232t.f10064a.offer(f0Var);
        f0Var.mo13666a(C2916m0.QUEUED);
    }
}
