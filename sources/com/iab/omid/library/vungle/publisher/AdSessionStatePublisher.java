package com.iab.omid.library.vungle.publisher;

import android.os.Build;
import android.webkit.WebView;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import p361ai.C13469d;
import p407ci.C13836a;
import p439di.C16670b;
import p583jk.C17884p;
import p959zh.C20849b;
import p959zh.C20850c;
import p959zh.C20851d;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    public C16670b f36941a = new C16670b((WebView) null);

    /* renamed from: b */
    public C14650a f36942b;

    /* renamed from: c */
    public long f36943c;

    /* renamed from: com.iab.omid.library.vungle.publisher.AdSessionStatePublisher$a */
    public enum C14650a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo44206h();
    }

    /* renamed from: a */
    public void mo44199a() {
    }

    /* renamed from: b */
    public final void mo44200b(String str, long j) {
        if (j >= this.f36943c) {
            this.f36942b = C14650a.AD_STATE_VISIBLE;
            C17884p.m44358b(mo44205g(), "setNativeViewHierarchy", str);
        }
    }

    /* renamed from: c */
    public void mo44201c(C20851d dVar, C20849b bVar) {
        mo44202d(dVar, bVar, (JSONObject) null);
    }

    /* renamed from: d */
    public final void mo44202d(C20851d dVar, C20849b bVar, JSONObject jSONObject) {
        String str = dVar.f52597h;
        JSONObject jSONObject2 = new JSONObject();
        C13836a.m34520c(jSONObject2, "environment", "app");
        C13836a.m34520c(jSONObject2, "adSessionType", bVar.f52590h);
        JSONObject jSONObject3 = new JSONObject();
        C13836a.m34520c(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        C13836a.m34520c(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C13836a.m34520c(jSONObject3, "os", "Android");
        C13836a.m34520c(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C13836a.m34520c(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        C13836a.m34520c(jSONObject4, "partnerName", (String) bVar.f52583a.f20214a);
        C13836a.m34520c(jSONObject4, "partnerVersion", (String) bVar.f52583a.f20215b);
        C13836a.m34520c(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        C13836a.m34520c(jSONObject5, "libraryVersion", "1.3.21-Vungle");
        C13836a.m34520c(jSONObject5, "appId", C13469d.f33339b.f33340a.getApplicationContext().getPackageName());
        C13836a.m34520c(jSONObject2, "app", jSONObject5);
        String str2 = bVar.f52589g;
        if (str2 != null) {
            C13836a.m34520c(jSONObject2, "contentUrl", str2);
        }
        String str3 = bVar.f52588f;
        if (str3 != null) {
            C13836a.m34520c(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (C20850c cVar : Collections.unmodifiableList(bVar.f52585c)) {
            cVar.getClass();
            C13836a.m34520c(jSONObject6, (String) null, (Object) null);
        }
        C17884p.m44358b(mo44205g(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    /* renamed from: e */
    public void mo44203e() {
        this.f36941a.clear();
    }

    /* renamed from: f */
    public final void mo44204f(long j, String str) {
        C14650a aVar;
        if (j >= this.f36943c && this.f36942b != (aVar = C14650a.AD_STATE_NOTVISIBLE)) {
            this.f36942b = aVar;
            C17884p.m44358b(mo44205g(), "setNativeViewHierarchy", str);
        }
    }

    /* renamed from: g */
    public final WebView mo44205g() {
        return (WebView) this.f36941a.get();
    }

    /* renamed from: h */
    public final void mo44206h() {
        this.f36943c = System.nanoTime();
        this.f36942b = C14650a.AD_STATE_IDLE;
    }
}
