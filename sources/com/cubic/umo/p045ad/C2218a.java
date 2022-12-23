package com.cubic.umo.p045ad;

import android.content.Context;
import com.cubic.umo.Environment;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKit;
import com.moovit.umo.ads.UmoAds;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;
import p008a7.C0088a;
import p061d7.C4402a;
import p196o7.C6009a;
import uh0.C25081h;

/* renamed from: com.cubic.umo.ad.a */
public final class C2218a {

    /* renamed from: a */
    public static C2218a f7237a;

    /* renamed from: com.cubic.umo.ad.a$a */
    public static final class C2219a {
        /* renamed from: a */
        public static void m5800a(Context context, Environment environment, C6009a aVar, C4402a aVar2, UmoAds.C7869d dVar) {
            boolean z;
            C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
            C24362h.m61211f(environment, "env");
            C24362h.m61211f(aVar, "clientData");
            C24362h.m61211f(aVar2, "adKitParams");
            if (C2218a.f7237a == null) {
                if (C25081h.m62831B(aVar2.f15456b)) {
                    aVar2 = C4402a.m11578a(aVar2, C24362h.m61216k("ads.config.get", environment.getBaseUrl()), 509);
                }
                Context applicationContext = context.getApplicationContext();
                C24362h.m61210e(applicationContext, "context.applicationContext");
                if (C0088a.f265d != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    C24362h.m61210e(applicationContext2, "context.applicationContext");
                    C0088a.f265d = new C0088a(applicationContext2, environment, aVar);
                }
                if (C0088a.f265d != null) {
                    UMOAdKit.Companion companion = UMOAdKit.f7238a;
                    Context applicationContext3 = context.getApplicationContext();
                    C24362h.m61210e(applicationContext3, "context.applicationContext");
                    companion.initialize(applicationContext3, aVar2, new AdManager$Companion$zza(dVar));
                    return;
                }
                C24362h.m61217l("instance");
                throw null;
            }
            C2218a.f7237a = null;
            UMOAdKit.f7238a.deInitialize();
            C2218a.f7237a = null;
            m5800a(context, environment, aVar, aVar2, dVar);
        }
    }
}
