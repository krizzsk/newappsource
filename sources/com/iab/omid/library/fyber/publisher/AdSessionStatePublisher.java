package com.iab.omid.library.fyber.publisher;

import android.os.Build;
import android.webkit.WebView;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import p389bl.C13637c;
import p699oh.C18748a;
import p699oh.C18751d;
import p699oh.C18753f;
import p699oh.C18754g;
import p723ph.C18923a;
import p746qh.C19124d;
import p792sh.C19461a;
import p816th.C19681b;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    public C19681b f36928a = new C19681b((WebView) null);

    /* renamed from: b */
    public C18748a f36929b;

    /* renamed from: c */
    public C18923a f36930c;

    /* renamed from: d */
    public C14648a f36931d;

    /* renamed from: e */
    public long f36932e;

    /* renamed from: com.iab.omid.library.fyber.publisher.AdSessionStatePublisher$a */
    public enum C14648a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo44194i();
    }

    /* renamed from: a */
    public void mo44186a() {
    }

    /* renamed from: b */
    public final void mo44187b(String str) {
        C13637c.m34066c(mo44193h(), "publishMediaEvent", str);
    }

    /* renamed from: c */
    public final void mo44188c(String str, long j) {
        if (j >= this.f36932e) {
            this.f36931d = C14648a.AD_STATE_VISIBLE;
            C13637c.m34066c(mo44193h(), "setNativeViewHierarchy", str);
        }
    }

    /* renamed from: d */
    public void mo44189d(C18754g gVar, C18751d dVar) {
        mo44190e(gVar, dVar, (JSONObject) null);
    }

    /* renamed from: e */
    public final void mo44190e(C18754g gVar, C18751d dVar, JSONObject jSONObject) {
        String str = gVar.f47717h;
        JSONObject jSONObject2 = new JSONObject();
        C19461a.m46861c(jSONObject2, "environment", "app");
        C19461a.m46861c(jSONObject2, "adSessionType", dVar.f47704h);
        JSONObject jSONObject3 = new JSONObject();
        C19461a.m46861c(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        C19461a.m46861c(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C19461a.m46861c(jSONObject3, "os", "Android");
        C19461a.m46861c(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C19461a.m46861c(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        C19461a.m46861c(jSONObject4, "partnerName", dVar.f47697a.f47705a);
        C19461a.m46861c(jSONObject4, "partnerVersion", dVar.f47697a.f47706b);
        C19461a.m46861c(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        C19461a.m46861c(jSONObject5, "libraryVersion", "1.3.30-Fyber");
        C19461a.m46861c(jSONObject5, "appId", C19124d.f48618b.f48619a.getApplicationContext().getPackageName());
        C19461a.m46861c(jSONObject2, "app", jSONObject5);
        String str2 = dVar.f47703g;
        if (str2 != null) {
            C19461a.m46861c(jSONObject2, "contentUrl", str2);
        }
        String str3 = dVar.f47702f;
        if (str3 != null) {
            C19461a.m46861c(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (C18753f fVar : Collections.unmodifiableList(dVar.f47699c)) {
            C19461a.m46861c(jSONObject6, fVar.f47707a, fVar.f47709c);
        }
        C13637c.m34066c(mo44193h(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    /* renamed from: f */
    public void mo44191f() {
        this.f36928a.clear();
    }

    /* renamed from: g */
    public final void mo44192g(long j, String str) {
        C14648a aVar;
        if (j >= this.f36932e && this.f36931d != (aVar = C14648a.AD_STATE_NOTVISIBLE)) {
            this.f36931d = aVar;
            C13637c.m34066c(mo44193h(), "setNativeViewHierarchy", str);
        }
    }

    /* renamed from: h */
    public final WebView mo44193h() {
        return (WebView) this.f36928a.get();
    }

    /* renamed from: i */
    public final void mo44194i() {
        this.f36932e = System.nanoTime();
        this.f36931d = C14648a.AD_STATE_IDLE;
    }
}
