package com.fyber.inneractive.sdk;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.p048dv.C2707a;
import com.fyber.inneractive.sdk.p048dv.C2720f;
import com.fyber.inneractive.sdk.p048dv.interstitial.C2728a;
import com.fyber.inneractive.sdk.response.C3648e;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.a */
public abstract class C2527a<T> extends C2707a<T> {

    /* renamed from: j */
    public C2728a f8994j = null;

    public C2527a(C2703z zVar, C2666s sVar, C2720f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public abstract void mo12757a(C2728a aVar, Activity activity);

    /* renamed from: f */
    public void mo12758f() {
        try {
            new C2926q.C2927a(C2924p.EVENT_READY_ON_CLIENT, this.f9590a, (C3648e) (C2720f) this.f9591b, (JSONArray) null).mo13717a((String) null);
        } catch (Exception unused) {
        }
    }
}
