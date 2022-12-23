package com.google.ads.mediation.vungle;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.vungle.warren.C23150h0;
import com.vungle.warren.C23248w1;
import com.vungle.warren.C23250x;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.error.VungleException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kd0.C23760e;

/* renamed from: com.google.ads.mediation.vungle.a */
public final class C3852a implements C23250x {

    /* renamed from: d */
    public static final C3852a f13336d = new C3852a();

    /* renamed from: a */
    public final AtomicBoolean f13337a = new AtomicBoolean(false);

    /* renamed from: b */
    public final ArrayList<C3855c> f13338b = new ArrayList<>();

    /* renamed from: c */
    public final Handler f13339c = new Handler(Looper.getMainLooper());

    /* renamed from: com.google.ads.mediation.vungle.a$a */
    public class C3853a implements Runnable {
        public C3853a() {
        }

        public final void run() {
            Iterator<C3855c> it = C3852a.this.f13338b.iterator();
            while (it.hasNext()) {
                it.next().mo15745b();
            }
            C3852a.this.f13338b.clear();
        }
    }

    /* renamed from: com.google.ads.mediation.vungle.a$b */
    public class C3854b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AdError f13341b;

        public C3854b(AdError adError) {
            this.f13341b = adError;
        }

        public final void run() {
            Iterator<C3855c> it = C3852a.this.f13338b.iterator();
            while (it.hasNext()) {
                it.next().mo15744a(this.f13341b);
            }
            C3852a.this.f13338b.clear();
        }
    }

    /* renamed from: com.google.ads.mediation.vungle.a$c */
    public interface C3855c {
        /* renamed from: a */
        void mo15744a(AdError adError);

        /* renamed from: b */
        void mo15745b();
    }

    public C3852a() {
        VungleApiClient.WrapperFramework wrapperFramework = VungleApiClient.WrapperFramework.admob;
        String replace = "6.11.0.2".replace('.', '_');
        int i = C23150h0.f58757a;
        if (!(wrapperFramework == null || wrapperFramework == VungleApiClient.WrapperFramework.none)) {
            String str = VungleApiClient.f58560C;
            VungleApiClient.f58560C += ";" + wrapperFramework;
            if (replace != null && !replace.isEmpty()) {
                VungleApiClient.f58560C = C13715c.m34245k(new StringBuilder(), VungleApiClient.f58560C, "/", replace);
            }
        }
        Vungle.isInitialized();
    }

    /* renamed from: d */
    public static void m10151d(int i) {
        if (i == 0) {
            Vungle.updateUserCoppaStatus(false);
        } else if (i == 1) {
            Vungle.updateUserCoppaStatus(true);
        }
    }

    /* renamed from: a */
    public final void mo15748a(VungleException vungleException) {
        this.f13339c.post(new C3854b(VungleMediationAdapter.getAdError(vungleException)));
        this.f13337a.set(false);
    }

    /* renamed from: b */
    public final void mo15749b(String str) {
    }

    /* renamed from: c */
    public final void mo15750c(String str, Context context, C3855c cVar) {
        if (Vungle.isInitialized()) {
            cVar.mo15745b();
        } else if (this.f13337a.getAndSet(true)) {
            this.f13338b.add(cVar);
        } else {
            m10151d(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
            if (C23760e.f60028a == null) {
                C23248w1.C23249a aVar = new C23248w1.C23249a();
                aVar.f59004a = true;
                C23760e.f60028a = new C23248w1(aVar);
            }
            Vungle.init(str, context.getApplicationContext(), (C23250x) this, C23760e.f60028a);
            this.f13338b.add(cVar);
        }
    }

    public final void onSuccess() {
        this.f13339c.post(new C3853a());
        this.f13337a.set(false);
    }
}
