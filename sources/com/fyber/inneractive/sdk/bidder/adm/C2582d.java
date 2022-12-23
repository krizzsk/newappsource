package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.bidder.adm.C2583e;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C2780m;
import com.fyber.inneractive.sdk.response.C3648e;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.d */
public class C2582d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2583e.C2584a f9109a;

    public C2582d(C2583e eVar, C2583e.C2584a aVar) {
        this.f9109a = aVar;
    }

    public void run() {
        C2583e.C2584a aVar = this.f9109a;
        if (aVar != null) {
            ((C2780m.C2781a) aVar).mo13565a(new Exception("adm payload must contain ad url"), InneractiveErrorCode.INVALID_INPUT, new C3648e[0]);
        }
    }
}
