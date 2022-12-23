package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.metrics.C2830c;
import com.fyber.inneractive.sdk.network.C2889b0;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.c */
public class C2581c implements C2889b0.C2890a {

    /* renamed from: a */
    public final /* synthetic */ C2583e f9108a;

    public C2581c(C2583e eVar) {
        this.f9108a = eVar;
    }

    /* renamed from: a */
    public void mo13155a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1392135285:
                if (str.equals("sdkInitNetworkRequest")) {
                    c = 0;
                    break;
                }
                break;
            case 740780854:
                if (str.equals("sdkGotServerResponse")) {
                    c = 1;
                    break;
                }
                break;
            case 1745989196:
                if (str.equals("sdkParsedResponse")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C2830c.f9722c.mo13620a(this.f9108a.f9113d).mo13626f();
                return;
            case 1:
                C2830c.f9722c.mo13620a(this.f9108a.f9113d).mo13628h();
                return;
            case 2:
                C2830c.f9722c.mo13620a(this.f9108a.f9113d).mo13624d();
                return;
            default:
                return;
        }
    }
}
