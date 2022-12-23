package com.fyber.inneractive.sdk.bidder.adm;

import android.util.Base64;
import com.fyber.inneractive.sdk.bidder.adm.C2583e;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C2780m;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.a */
public class C2578a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2583e.C2584a f9102a;

    /* renamed from: b */
    public final /* synthetic */ C2583e f9103b;

    /* renamed from: com.fyber.inneractive.sdk.bidder.adm.a$a */
    public class C2579a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Exception f9104a;

        public C2579a(Exception exc) {
            this.f9104a = exc;
        }

        public void run() {
            C2583e.C2584a aVar = C2578a.this.f9102a;
            if (aVar != null) {
                ((C2780m.C2781a) aVar).mo13565a(this.f9104a, InneractiveErrorCode.INVALID_INPUT, new C3648e[0]);
            }
        }
    }

    public C2578a(C2583e eVar, C2583e.C2584a aVar) {
        this.f9103b = eVar;
        this.f9102a = aVar;
    }

    public void run() {
        try {
            byte[] decode = Base64.decode(this.f9103b.f9111b, 0);
            this.f9103b.f9110a = AdmParametersOuterClass$AdmParameters.parseFrom(decode);
            C2583e.m6586a(this.f9103b, this.f9102a);
        } catch (Exception e) {
            IAlog.m9906e("failed to parse ad markup payload %s", e.getMessage());
            C3714n.f12902b.post(new C2579a(e));
        }
    }
}
