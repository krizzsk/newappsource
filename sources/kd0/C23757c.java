package kd0;

import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C23135f0;
import com.vungle.warren.C23170k;
import com.vungle.warren.C23179n;
import com.vungle.warren.C23258z;
import com.vungle.warren.error.VungleException;
import p198o9.C6012a;

/* renamed from: kd0.c */
public final class C23757c implements C23135f0 {

    /* renamed from: a */
    public final String f60014a;

    /* renamed from: b */
    public final AdConfig f60015b;

    /* renamed from: c */
    public final String f60016c;

    /* renamed from: d */
    public MediationBannerAdapter f60017d;

    /* renamed from: e */
    public MediationBannerListener f60018e;

    /* renamed from: f */
    public C6012a f60019f;

    /* renamed from: g */
    public C23755a f60020g;

    /* renamed from: h */
    public final C23759d f60021h = C23759d.m58339b();

    /* renamed from: i */
    public boolean f60022i = false;

    /* renamed from: j */
    public boolean f60023j = true;

    /* renamed from: k */
    public final C23758a f60024k = new C23758a();

    /* renamed from: kd0.c$a */
    public class C23758a implements C23258z {
        public C23758a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0117  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onAdLoad(java.lang.String r18) {
            /*
                r17 = this;
                r0 = r17
                kd0.c r1 = kd0.C23757c.this
                r1.getClass()
                java.lang.String r2 = com.google.ads.mediation.vungle.VungleMediationAdapter.TAG
                r1.toString()
                boolean r2 = r1.f60022i
                if (r2 != 0) goto L_0x0012
                goto L_0x0146
            L_0x0012:
                android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
                r3 = -2
                r2.<init>(r3, r3)
                r3 = 14
                r4 = -1
                r2.addRule(r3, r4)
                r3 = 15
                r2.addRule(r3, r4)
                kd0.d r3 = r1.f60021h
                java.lang.String r4 = r1.f60014a
                j$.util.concurrent.ConcurrentHashMap<java.lang.String, o9.a> r3 = r3.f60027a
                java.lang.Object r3 = r3.get(r4)
                o9.a r3 = (p198o9.C6012a) r3
                r1.f60019f = r3
                o9.b r4 = new o9.b
                r4.<init>(r1, r1, r3)
                com.vungle.warren.AdConfig r3 = r1.f60015b
                com.vungle.warren.AdConfig$AdSize r3 = r3.mo58261a()
                boolean r3 = com.vungle.warren.AdConfig.AdSize.isBannerAdSize(r3)
                java.lang.String r5 = "com.google.ads.mediation.vungle"
                java.lang.String r6 = "Vungle SDK returned a successful load callback, but Banners.getBanner() or Vungle.getNativeAd() returned null."
                if (r3 == 0) goto L_0x012f
                java.lang.String r10 = r1.f60014a
                com.vungle.warren.k r12 = new com.vungle.warren.k
                com.vungle.warren.AdConfig r3 = r1.f60015b
                r12.<init>(r3)
                int r3 = com.vungle.warren.C23179n.f58839a
                java.lang.String r3 = "VungleBanner#getBanner"
                java.lang.String r8 = "getBanner call invoked"
                com.vungle.warren.VungleLogger.m57028a(r3, r8)
                android.content.Context r9 = com.vungle.warren.Vungle.appContext()
                if (r9 != 0) goto L_0x0067
                r3 = 9
                com.vungle.warren.C23179n.m57205c(r10, r4, r3)
                r0 = r5
                r16 = r6
                goto L_0x00cf
            L_0x0067:
                com.vungle.warren.AdConfig$AdSize r3 = r12.mo58261a()
                com.vungle.warren.v0 r8 = com.vungle.warren.C23236v0.m57280a(r9)
                java.lang.Class<ce0.h> r11 = ce0.C21103h.class
                java.lang.Object r11 = r8.mo58350c(r11)
                ce0.h r11 = (ce0.C21103h) r11
                java.lang.Class<ce0.t> r13 = ce0.C21119t.class
                java.lang.Object r13 = r8.mo58350c(r13)
                ce0.t r13 = (ce0.C21119t) r13
                com.vungle.warren.v0 r14 = com.vungle.warren.C23236v0.m57280a(r9)
                java.lang.Class<com.vungle.warren.k0> r15 = com.vungle.warren.C23171k0.class
                java.lang.Object r14 = r14.mo58350c(r15)
                com.vungle.warren.k0 r14 = (com.vungle.warren.C23171k0) r14
                java.util.concurrent.atomic.AtomicReference<com.vungle.warren.w1> r14 = r14.f58821c
                java.lang.Object r14 = r14.get()
                com.vungle.warren.w1 r14 = (com.vungle.warren.C23248w1) r14
                com.vungle.warren.g0 r15 = new com.vungle.warren.g0
                ce0.q$a r7 = r11.mo53301f()
                r15.<init>(r7, r4)
                td0.e r7 = new td0.e
                ce0.u r11 = r11.mo53305j()
                com.vungle.warren.m r0 = new com.vungle.warren.m
                r0.<init>(r10, r15, r8, r3)
                java.util.concurrent.Future r0 = r11.submit(r0)
                r7.<init>(r0)
                r0 = r5
                r16 = r6
                long r5 = r13.mo53295a()
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.lang.Object r5 = r7.get(r5, r8)
                android.util.Pair r5 = (android.util.Pair) r5
                if (r5 != 0) goto L_0x00c5
                r3 = 13
                com.vungle.warren.C23179n.m57205c(r10, r4, r3)
                goto L_0x00cf
            L_0x00c5:
                java.lang.Object r4 = r5.first
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L_0x00d1
            L_0x00cf:
                r3 = 0
                goto L_0x00ef
            L_0x00d1:
                com.vungle.warren.AdConfig$AdSize r4 = com.vungle.warren.AdConfig.AdSize.VUNGLE_MREC
                r6 = 0
                if (r3 == r4) goto L_0x00de
                java.lang.Object r3 = r5.second
                od0.m r3 = (od0.C24566m) r3
                int r3 = r3.f62261e
                if (r3 > 0) goto L_0x00df
            L_0x00de:
                r3 = 0
            L_0x00df:
                if (r14 == 0) goto L_0x00e7
                boolean r4 = r14.f59003d
                if (r4 == 0) goto L_0x00e7
                r11 = 0
                goto L_0x00e8
            L_0x00e7:
                r11 = r3
            L_0x00e8:
                com.vungle.warren.u1 r3 = new com.vungle.warren.u1
                r8 = r3
                r13 = r15
                r8.<init>(r9, r10, r11, r12, r13)
            L_0x00ef:
                if (r3 == 0) goto L_0x0117
                r1.toString()
                o9.a r0 = r1.f60019f
                if (r0 == 0) goto L_0x00fa
                r0.f19211b = r3
            L_0x00fa:
                boolean r4 = r1.f60023j
                if (r0 != 0) goto L_0x00ff
                goto L_0x0108
            L_0x00ff:
                r1.f60023j = r4
                com.vungle.warren.u1 r0 = r0.f19211b
                if (r0 == 0) goto L_0x0108
                r0.setAdVisibility(r4)
            L_0x0108:
                r3.setLayoutParams(r2)
                com.google.android.gms.ads.mediation.MediationBannerAdapter r0 = r1.f60017d
                if (r0 == 0) goto L_0x0146
                com.google.android.gms.ads.mediation.MediationBannerListener r1 = r1.f60018e
                if (r1 == 0) goto L_0x0146
                r1.onAdLoaded(r0)
                goto L_0x0146
            L_0x0117:
                com.google.android.gms.ads.AdError r2 = new com.google.android.gms.ads.AdError
                r3 = r16
                r4 = 106(0x6a, float:1.49E-43)
                r2.<init>(r4, r3, r0)
                r2.getMessage()
                com.google.android.gms.ads.mediation.MediationBannerAdapter r0 = r1.f60017d
                if (r0 == 0) goto L_0x0146
                com.google.android.gms.ads.mediation.MediationBannerListener r1 = r1.f60018e
                if (r1 == 0) goto L_0x0146
                r1.onAdFailedToLoad((com.google.android.gms.ads.mediation.MediationBannerAdapter) r0, (com.google.android.gms.ads.AdError) r2)
                goto L_0x0146
            L_0x012f:
                r0 = r5
                r3 = r6
                r4 = 106(0x6a, float:1.49E-43)
                com.google.android.gms.ads.AdError r2 = new com.google.android.gms.ads.AdError
                r2.<init>(r4, r3, r0)
                r2.getMessage()
                com.google.android.gms.ads.mediation.MediationBannerAdapter r0 = r1.f60017d
                if (r0 == 0) goto L_0x0146
                com.google.android.gms.ads.mediation.MediationBannerListener r1 = r1.f60018e
                if (r1 == 0) goto L_0x0146
                r1.onAdFailedToLoad((com.google.android.gms.ads.mediation.MediationBannerAdapter) r0, (com.google.android.gms.ads.AdError) r2)
            L_0x0146:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kd0.C23757c.C23758a.onAdLoad(java.lang.String):void");
        }

        public final void onError(String str, VungleException vungleException) {
            C23757c cVar = C23757c.this;
            cVar.f60021h.mo59003c(cVar.f60014a, cVar.f60019f);
            C23757c cVar2 = C23757c.this;
            if (!cVar2.f60022i) {
                String str2 = VungleMediationAdapter.TAG;
            } else if (cVar2.f60017d != null && cVar2.f60018e != null) {
                AdError adError = VungleMediationAdapter.getAdError(vungleException);
                String str3 = VungleMediationAdapter.TAG;
                adError.getMessage();
                C23757c cVar3 = C23757c.this;
                cVar3.f60018e.onAdFailedToLoad(cVar3.f60017d, adError);
            }
        }
    }

    public C23757c(String str, String str2, AdConfig adConfig, MediationBannerAdapter mediationBannerAdapter) {
        this.f60014a = str;
        this.f60016c = str2;
        this.f60015b = adConfig;
        this.f60017d = mediationBannerAdapter;
    }

    public final void creativeId(String str) {
    }

    public final void onAdClick(String str) {
        MediationBannerListener mediationBannerListener;
        MediationBannerAdapter mediationBannerAdapter = this.f60017d;
        if (mediationBannerAdapter != null && (mediationBannerListener = this.f60018e) != null) {
            mediationBannerListener.onAdClicked(mediationBannerAdapter);
            this.f60018e.onAdOpened(this.f60017d);
        }
    }

    public final void onAdEnd(String str) {
    }

    @Deprecated
    public final void onAdEnd(String str, boolean z, boolean z2) {
    }

    public final void onAdLeftApplication(String str) {
        MediationBannerListener mediationBannerListener;
        MediationBannerAdapter mediationBannerAdapter = this.f60017d;
        if (mediationBannerAdapter != null && (mediationBannerListener = this.f60018e) != null) {
            mediationBannerListener.onAdLeftApplication(mediationBannerAdapter);
        }
    }

    public final void onAdRewarded(String str) {
    }

    public final void onAdStart(String str) {
        C23179n.m57203a(this.f60014a, new C23170k(this.f60015b), (C23258z) null);
    }

    public final void onAdViewed(String str) {
    }

    public final void onError(String str, VungleException vungleException) {
        MediationBannerListener mediationBannerListener;
        AdError adError = VungleMediationAdapter.getAdError(vungleException);
        String str2 = VungleMediationAdapter.TAG;
        adError.getMessage();
        MediationBannerAdapter mediationBannerAdapter = this.f60017d;
        if (mediationBannerAdapter != null && (mediationBannerListener = this.f60018e) != null) {
            mediationBannerListener.onAdFailedToLoad(mediationBannerAdapter, adError);
        }
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k(" [placementId=");
        k.append(this.f60014a);
        k.append(" # uniqueRequestId=");
        k.append(this.f60016c);
        k.append(" # hashcode=");
        k.append(hashCode());
        k.append("] ");
        return k.toString();
    }
}
