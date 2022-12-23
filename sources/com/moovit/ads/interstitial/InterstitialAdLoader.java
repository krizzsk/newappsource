package com.moovit.ads.interstitial;

public final class InterstitialAdLoader {

    /* renamed from: a */
    public static final InterstitialAdLoader f37388a = new InterstitialAdLoader();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo44663a(android.content.Context r5, p967zp.C20882b r6, ff0.C23349c<? super com.moovit.ads.InterstitialAd> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.moovit.ads.interstitial.InterstitialAdLoader$loadAd$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.moovit.ads.interstitial.InterstitialAdLoader$loadAd$1 r0 = (com.moovit.ads.interstitial.InterstitialAdLoader$loadAd$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.moovit.ads.interstitial.InterstitialAdLoader$loadAd$1 r0 = new com.moovit.ads.interstitial.InterstitialAdLoader$loadAd$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p584jl.C17885a.m44475z0(r7)
            goto L_0x0044
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p584jl.C17885a.m44475z0(r7)
            aq.a r7 = new aq.a
            java.lang.String r2 = r6.f51692a
            com.moovit.ads.AdTargeting r6 = r6.f51693b
            r7.<init>(r5, r2, r6)
            r0.label = r3
            java.lang.Object r7 = com.moovit.commons.request.C15752a.m40209a(r7, r0)
            if (r7 != r1) goto L_0x0044
            return r1
        L_0x0044:
            aq.b r7 = (p369aq.C13505b) r7
            com.moovit.ads.HtmlInterstitialAd r5 = r7.f33420g
            if (r5 == 0) goto L_0x004b
            return r5
        L_0x004b:
            java.lang.String r5 = "interstitial"
            mf0.C24362h.m61217l(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.ads.interstitial.InterstitialAdLoader.mo44663a(android.content.Context, zp.b, ff0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo44664b(android.content.Context r5, p967zp.C20882b r6, ff0.C23349c<? super android.content.Intent> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.moovit.ads.interstitial.InterstitialAdLoader$loadAdIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.moovit.ads.interstitial.InterstitialAdLoader$loadAdIntent$1 r0 = (com.moovit.ads.interstitial.InterstitialAdLoader$loadAdIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.moovit.ads.interstitial.InterstitialAdLoader$loadAdIntent$1 r0 = new com.moovit.ads.interstitial.InterstitialAdLoader$loadAdIntent$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.L$0
            android.content.Context r5 = (android.content.Context) r5
            p584jl.C17885a.m44475z0(r7)
            goto L_0x0041
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p584jl.C17885a.m44475z0(r7)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r4.mo44663a(r5, r6, r0)
            if (r7 != r1) goto L_0x0041
            return r1
        L_0x0041:
            com.moovit.ads.InterstitialAd r7 = (com.moovit.ads.InterstitialAd) r7
            boolean r6 = r7 instanceof com.moovit.ads.HtmlInterstitialAd
            if (r6 == 0) goto L_0x0067
            int r6 = com.moovit.ads.interstitial.html.HtmlInterstitialActivity.f37389A
            com.moovit.ads.HtmlInterstitialAd r7 = (com.moovit.ads.HtmlInterstitialAd) r7
            java.lang.String r6 = "context"
            mf0.C24362h.m61211f(r5, r6)
            java.lang.String r6 = "interstitialAd"
            mf0.C24362h.m61211f(r7, r6)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.moovit.ads.interstitial.html.HtmlInterstitialActivity> r1 = com.moovit.ads.interstitial.html.HtmlInterstitialActivity.class
            r0.<init>(r5, r1)
            java.lang.String r5 = r7.f37372c
            java.lang.String r1 = "placementId"
            r0.putExtra(r1, r5)
            r0.putExtra(r6, r7)
            return r0
        L_0x0067:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.ads.interstitial.InterstitialAdLoader.mo44664b(android.content.Context, zp.b, ff0.c):java.lang.Object");
    }
}
