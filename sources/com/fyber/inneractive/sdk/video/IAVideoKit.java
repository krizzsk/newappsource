package com.fyber.inneractive.sdk.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.C2751a;
import com.fyber.inneractive.sdk.factories.C2754b;
import com.fyber.inneractive.sdk.factories.C2757c;
import com.fyber.inneractive.sdk.flow.C2775i;
import com.fyber.inneractive.sdk.flow.C2807y;
import com.fyber.inneractive.sdk.interfaces.C2809a;
import com.fyber.inneractive.sdk.interfaces.C2811b;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import com.fyber.inneractive.sdk.player.cache.C2986n;
import com.fyber.inneractive.sdk.renderers.C3633h;
import com.fyber.inneractive.sdk.renderers.C3637j;
import com.fyber.inneractive.sdk.renderers.C3641m;
import com.fyber.inneractive.sdk.response.C3644a;
import com.fyber.inneractive.sdk.response.C3645b;
import com.fyber.inneractive.sdk.response.C3647d;
import com.fyber.inneractive.sdk.util.C3730t;
import com.fyber.inneractive.sdk.util.C3732u;
import com.fyber.inneractive.sdk.util.IAlog;

public class IAVideoKit extends BroadcastReceiver {
    private static final C3730t sProvider = new C3749a();

    /* renamed from: com.fyber.inneractive.sdk.video.IAVideoKit$b */
    public class C3750b implements C2754b.C2756b {
        public C3750b(IAVideoKit iAVideoKit) {
        }

        /* renamed from: a */
        public C2809a mo13317a() {
            return new C2775i("Interstitial");
        }

        /* renamed from: b */
        public C3645b mo13318b() {
            return new C3647d();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.video.IAVideoKit$c */
    public class C3751c implements C2757c.C2758a {
        public C3751c(IAVideoKit iAVideoKit) {
        }

        /* renamed from: a */
        public boolean mo13319a(InneractiveAdSpot inneractiveAdSpot) {
            return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C2807y);
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
                return new C3637j();
            }
            return new C3641m();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.video.IAVideoKit$d */
    public class C3752d implements C2751a.C2752a {
        public C3752d(IAVideoKit iAVideoKit) {
        }

        /* renamed from: a */
        public boolean mo13321a(InneractiveAdSpot inneractiveAdSpot) {
            return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C2807y);
        }

        /* renamed from: b */
        public C2811b mo13322b(InneractiveAdSpot inneractiveAdSpot) {
            return new C3633h();
        }
    }

    public void onReceive(Context context, Intent intent) {
        C3730t tVar = sProvider;
        IAConfigManager.f9202J.f9211H.put(tVar.mo13653a(), tVar);
        C2986n nVar = C2986n.f10211f;
        Context applicationContext = context.getApplicationContext();
        nVar.getClass();
        if (applicationContext == null) {
            IAlog.m9906e("context is null, would not start the video cache.", new Object[0]);
        } else if (!nVar.mo13802a()) {
            nVar.f10212a = applicationContext;
            new Thread(nVar.f10216e, "VideoCache").start();
        }
        IAlog.m9902a("IAVideoKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        C2754b.C2755a.f9535a.mo13509a(C3644a.RETURNED_ADTYPE_VAST, new C3750b(this));
        C2757c cVar = C2757c.C2759b.f9537a;
        cVar.f9536a.add(new C3751c(this));
        C2751a aVar = C2751a.C2753b.f9533a;
        aVar.f9532a.add(new C3752d(this));
    }

    /* renamed from: com.fyber.inneractive.sdk.video.IAVideoKit$a */
    public class C3749a implements C3730t {
        /* renamed from: a */
        public boolean mo13654a(String str) {
            if (TextUtils.equals(str, "vid_cache")) {
                return C2986n.f10211f.mo13802a();
            }
            return false;
        }

        /* renamed from: a */
        public C3732u mo13653a() {
            return C3732u.Video;
        }
    }
}
