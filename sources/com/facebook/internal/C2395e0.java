package com.facebook.internal;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.C2397f0;
import mf0.C24362h;
import org.json.JSONObject;
import p009a8.C0124u;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.internal.e0 */
public final /* synthetic */ class C2395e0 implements GraphRequest.C2280b {

    /* renamed from: a */
    public final /* synthetic */ C2397f0.C2398a f8628a;

    /* renamed from: b */
    public final /* synthetic */ String f8629b;

    public /* synthetic */ C2395e0(C2397f0.C2398a aVar, String str) {
        this.f8628a = aVar;
        this.f8629b = str;
    }

    /* renamed from: b */
    public final void mo200b(C0124u uVar) {
        C2397f0.C2398a aVar = this.f8628a;
        String str = this.f8629b;
        C24362h.m61211f(aVar, "$callback");
        C24362h.m61211f(str, "$accessToken");
        FacebookRequestError facebookRequestError = uVar.f366c;
        if (facebookRequestError != null) {
            aVar.mo11932b(facebookRequestError.f8424j);
            return;
        }
        ConcurrentHashMap<String, JSONObject> concurrentHashMap = C2391c0.f8624a;
        JSONObject jSONObject = uVar.f367d;
        if (jSONObject != null) {
            C2391c0.f8624a.put(str, jSONObject);
            aVar.mo11931a(uVar.f367d);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
