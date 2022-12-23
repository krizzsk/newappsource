package com.fyber.inneractive.sdk.config;

import android.content.Context;
import ce0.C21100e;
import com.fyber.inneractive.sdk.measurement.C2818b;
import com.fyber.inneractive.sdk.measurement.C2820d;
import com.fyber.inneractive.sdk.util.C3714n;
import p651mh.C18371b;

/* renamed from: com.fyber.inneractive.sdk.config.m */
public class C2677m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f9350a;

    /* renamed from: b */
    public final /* synthetic */ Context f9351b;

    /* renamed from: c */
    public final /* synthetic */ IAConfigManager f9352c;

    /* renamed from: com.fyber.inneractive.sdk.config.m$a */
    public class C2678a implements Runnable {
        public C2678a() {
        }

        public void run() {
            C2677m mVar = C2677m.this;
            IAConfigManager iAConfigManager = mVar.f9352c;
            C2820d dVar = new C2820d();
            iAConfigManager.f9212I = dVar;
            Context context = mVar.f9351b;
            if (!dVar.f9677a) {
                dVar.f9677a = true;
                C3714n.f12902b.post(new C2818b(dVar, context));
            }
        }
    }

    public C2677m(IAConfigManager iAConfigManager, IAConfigManager iAConfigManager2, Context context) {
        this.f9352c = iAConfigManager;
        this.f9350a = iAConfigManager2;
        this.f9351b = context;
    }

    public void run() {
        try {
            C18371b bVar = C21100e.f52944e;
            C3714n.f12902b.post(new C2678a());
        } catch (Throwable unused) {
        }
    }
}
