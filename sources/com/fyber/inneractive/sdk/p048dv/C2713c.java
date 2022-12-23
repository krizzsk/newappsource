package com.fyber.inneractive.sdk.p048dv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.C2751a;
import com.fyber.inneractive.sdk.factories.C2754b;
import com.fyber.inneractive.sdk.factories.C2757c;
import com.fyber.inneractive.sdk.interfaces.C2809a;
import com.fyber.inneractive.sdk.interfaces.C2811b;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import com.fyber.inneractive.sdk.p048dv.banner.C2712b;
import com.fyber.inneractive.sdk.p048dv.interstitial.C2735d;
import com.fyber.inneractive.sdk.p048dv.rewarded.C2743c;
import com.fyber.inneractive.sdk.response.C3644a;
import com.fyber.inneractive.sdk.response.C3645b;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.dv.c */
public class C2713c extends BroadcastReceiver {

    /* renamed from: com.fyber.inneractive.sdk.dv.c$a */
    public class C2714a implements C2754b.C2756b {
        public C2714a(C2713c cVar) {
        }

        /* renamed from: a */
        public C2809a mo13317a() {
            return new C2708b();
        }

        /* renamed from: b */
        public C3645b mo13318b() {
            return new C2718e();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.c$b */
    public class C2715b implements C2757c.C2758a {
        public C2715b(C2713c cVar) {
        }

        /* renamed from: a */
        public boolean mo13319a(InneractiveAdSpot inneractiveAdSpot) {
            if (IAConfigManager.f9202J.f9208E == null || !(inneractiveAdSpot.getAdContent() instanceof C2707a)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public C2812c mo13320b(InneractiveAdSpot inneractiveAdSpot) {
            boolean z;
            InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().f9590a;
            if (inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen()) {
                z = true;
            } else {
                z = false;
            }
            if (!inneractiveAdSpot.getAdContent().mo13299d() || !z) {
                return null;
            }
            if (inneractiveAdSpot.getAdContent().mo13293c().f12756n == UnitDisplayType.INTERSTITIAL) {
                return new C2735d();
            }
            return new C2743c();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.c$c */
    public class C2716c implements C2751a.C2752a {
        public C2716c() {
        }

        /* renamed from: a */
        public boolean mo13321a(InneractiveAdSpot inneractiveAdSpot) {
            return C2713c.m6800a(C2713c.this, inneractiveAdSpot);
        }

        /* renamed from: b */
        public C2811b mo13322b(InneractiveAdSpot inneractiveAdSpot) {
            return new C2712b();
        }
    }

    /* renamed from: a */
    public static boolean m6800a(C2713c cVar, InneractiveAdSpot inneractiveAdSpot) {
        cVar.getClass();
        if (inneractiveAdSpot.getAdContent() == null || !(inneractiveAdSpot.getAdContent() instanceof C2707a)) {
            return false;
        }
        return true;
    }

    public void onReceive(Context context, Intent intent) {
        IAlog.m9902a("DVKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        C2754b.C2755a.f9535a.mo13509a(C3644a.RETURNED_ADTYPE_MOBILE_ADS, new C2714a(this));
        C2757c cVar = C2757c.C2759b.f9537a;
        cVar.f9536a.add(new C2715b(this));
        C2751a aVar = C2751a.C2753b.f9533a;
        aVar.f9532a.add(new C2716c());
    }
}
