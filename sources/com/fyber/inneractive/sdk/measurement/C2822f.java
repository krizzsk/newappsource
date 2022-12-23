package com.fyber.inneractive.sdk.measurement;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.measurement.C2816a;
import com.fyber.inneractive.sdk.network.C2931r;
import com.fyber.inneractive.sdk.response.C3648e;
import p699oh.C18748a;
import p699oh.C18749b;
import p699oh.C18752e;

/* renamed from: com.fyber.inneractive.sdk.measurement.f */
public class C2822f implements C2816a.C2817a {

    /* renamed from: a */
    public final C18752e f9684a;

    /* renamed from: b */
    public C18749b f9685b;

    /* renamed from: c */
    public C18748a f9686c;

    /* renamed from: d */
    public boolean f9687d = false;

    /* renamed from: e */
    public WebView f9688e;

    /* renamed from: f */
    public C2776j f9689f;

    public C2822f(C18752e eVar, WebView webView, C2776j jVar) {
        this.f9684a = eVar;
        this.f9688e = webView;
        this.f9689f = jVar;
    }

    /* renamed from: a */
    public final void mo13610a(Throwable th) {
        InneractiveAdRequest inneractiveAdRequest;
        String simpleName = th.getClass().getSimpleName();
        String format = String.format("%s - %s", new Object[]{"OpenMeasurementMraidTracker", th.getMessage()});
        C2776j jVar = this.f9689f;
        C3648e eVar = null;
        if (jVar != null) {
            inneractiveAdRequest = jVar.f9590a;
        } else {
            inneractiveAdRequest = null;
        }
        if (jVar != null) {
            eVar = jVar.mo13293c();
        }
        C2931r.m7253a(simpleName, format, inneractiveAdRequest, eVar);
    }
}
