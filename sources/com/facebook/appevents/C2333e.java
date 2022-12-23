package com.facebook.appevents;

import com.facebook.GraphRequest;
import mf0.C24362h;
import p009a8.C0124u;
import p262t8.C6606a;

/* renamed from: com.facebook.appevents.e */
public final /* synthetic */ class C2333e implements GraphRequest.C2280b {

    /* renamed from: a */
    public final /* synthetic */ AccessTokenAppIdPair f8523a;

    /* renamed from: b */
    public final /* synthetic */ GraphRequest f8524b;

    /* renamed from: c */
    public final /* synthetic */ C2353q f8525c;

    /* renamed from: d */
    public final /* synthetic */ C2349o f8526d;

    public /* synthetic */ C2333e(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, C2353q qVar, C2349o oVar) {
        this.f8523a = accessTokenAppIdPair;
        this.f8524b = graphRequest;
        this.f8525c = qVar;
        this.f8526d = oVar;
    }

    /* renamed from: b */
    public final void mo200b(C0124u uVar) {
        AccessTokenAppIdPair accessTokenAppIdPair = this.f8523a;
        GraphRequest graphRequest = this.f8524b;
        C2353q qVar = this.f8525c;
        C2349o oVar = this.f8526d;
        Class<C2335g> cls = C2335g.class;
        if (!C6606a.m15601b(cls)) {
            try {
                C24362h.m61211f(accessTokenAppIdPair, "$accessTokenAppId");
                C24362h.m61211f(graphRequest, "$postRequest");
                C24362h.m61211f(qVar, "$appEvents");
                C24362h.m61211f(oVar, "$flushState");
                C2335g.m6200e(graphRequest, uVar, accessTokenAppIdPair, oVar, qVar);
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }
}
