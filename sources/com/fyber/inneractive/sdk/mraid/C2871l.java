package com.fyber.inneractive.sdk.mraid;

import com.appboy.support.StringUtils;
import com.fyber.inneractive.sdk.util.C3677d0;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3764d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.l */
public class C2871l extends C2858a {
    public C2871l(Map<String, String> map, C3764d dVar, C3721p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo13659a() {
        C3677d0.C3678a aVar;
        String str;
        String str2;
        String str3 = this.f9840b.get("url");
        IAlog.m9905d("IAmraidActionOpen: opening Internal Browser For Url: %s", str3);
        C3764d dVar = this.f9841c;
        if (dVar != null) {
            C3721p0 p0Var = this.f9842d;
            L l = dVar.f12962g;
            if (l != null) {
                aVar = ((C3764d.C3770f) l).mo13910a(str3, p0Var);
            } else {
                C3677d0.C3680c cVar = C3677d0.C3680c.FAILED;
                Exception exc = new Exception("No webview listener available");
                if (dVar.mo15460g() == null) {
                    str2 = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
                } else {
                    str2 = dVar.mo15460g().getClass().getName();
                }
                aVar = new C3677d0.C3678a(cVar, exc, str2);
            }
            if (aVar.f12835a == C3677d0.C3680c.FAILED) {
                C3764d dVar2 = this.f9841c;
                C2865f fVar = C2865f.OPEN;
                Throwable th = aVar.f12836b;
                if (th == null) {
                    str = "unknown error";
                } else {
                    str = th.getMessage();
                }
                dVar2.mo15451a(fVar, str);
            }
        }
    }

    /* renamed from: c */
    public String mo13656c() {
        return this.f9840b.get("url");
    }

    /* renamed from: d */
    public void mo13657d() {
        C3764d dVar = this.f9841c;
        if (dVar != null) {
            dVar.mo15451a(C2865f.OPEN, "No native click was detected in a timely fashion");
        }
    }
}
