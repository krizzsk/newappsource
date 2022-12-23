package com.fyber.inneractive.sdk.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.C2751a;
import com.fyber.inneractive.sdk.factories.C2754b;
import com.fyber.inneractive.sdk.factories.C2757c;
import com.fyber.inneractive.sdk.flow.C2772h;
import com.fyber.inneractive.sdk.flow.C2794u;
import com.fyber.inneractive.sdk.interfaces.C2809a;
import com.fyber.inneractive.sdk.interfaces.C2811b;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import com.fyber.inneractive.sdk.renderers.C3631g;
import com.fyber.inneractive.sdk.renderers.C3638k;
import com.fyber.inneractive.sdk.response.C3644a;
import com.fyber.inneractive.sdk.response.C3645b;
import com.fyber.inneractive.sdk.response.C3646c;
import com.fyber.inneractive.sdk.util.C3730t;
import com.fyber.inneractive.sdk.util.C3732u;
import com.fyber.inneractive.sdk.util.IAlog;

public class IAMraidKit extends BroadcastReceiver {
    private static final C3730t sProvider = new C2854a();

    /* renamed from: com.fyber.inneractive.sdk.mraid.IAMraidKit$a */
    public class C2854a implements C3730t {
        /* renamed from: a */
        public C3732u mo13653a() {
            return C3732u.Mraid;
        }

        /* renamed from: a */
        public boolean mo13654a(String str) {
            return false;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.mraid.IAMraidKit$b */
    public class C2855b implements C2754b.C2756b {
        public C2855b(IAMraidKit iAMraidKit) {
        }

        /* renamed from: a */
        public C2809a mo13317a() {
            return new C2772h();
        }

        /* renamed from: b */
        public C3645b mo13318b() {
            return new C3646c();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.mraid.IAMraidKit$c */
    public class C2856c implements C2757c.C2758a {
        public C2856c() {
        }

        /* renamed from: a */
        public boolean mo13319a(InneractiveAdSpot inneractiveAdSpot) {
            return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
        }

        /* renamed from: b */
        public C2812c mo13320b(InneractiveAdSpot inneractiveAdSpot) {
            return new C3638k();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.mraid.IAMraidKit$d */
    public class C2857d implements C2751a.C2752a {
        public C2857d() {
        }

        /* renamed from: a */
        public boolean mo13321a(InneractiveAdSpot inneractiveAdSpot) {
            return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
        }

        /* renamed from: b */
        public C2811b mo13322b(InneractiveAdSpot inneractiveAdSpot) {
            return new C3631g();
        }
    }

    /* access modifiers changed from: private */
    public boolean isMRaidSpotContent(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C2794u);
    }

    public void onReceive(Context context, Intent intent) {
        IAlog.m9902a("IAMraidKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        C3730t tVar = sProvider;
        IAConfigManager.f9202J.f9211H.put(tVar.mo13653a(), tVar);
        C2855b bVar = new C2855b(this);
        C2754b.C2755a.f9535a.mo13509a(C3644a.RETURNED_ADTYPE_HTML, bVar);
        C2754b.C2755a.f9535a.mo13509a(C3644a.RETURNED_ADTYPE_MRAID, bVar);
        C2757c cVar = C2757c.C2759b.f9537a;
        cVar.f9536a.add(new C2856c());
        C2751a aVar = C2751a.C2753b.f9533a;
        aVar.f9532a.add(new C2857d());
    }
}
