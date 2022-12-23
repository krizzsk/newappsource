package com.moovit.ads.banner;

import android.content.Context;
import bi0.C21073k;
import ci0.C21207b;
import ff0.C23349c;
import p920xp.C20553b;
import wh0.C25177g;
import wh0.C25184i0;

public final class BannerAdLoader {

    /* renamed from: a */
    public static final BannerAdLoader f37378a = new BannerAdLoader();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r4 == r7) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m37018a(com.moovit.ads.banner.BannerAdLoader r4, android.content.Context r5, p920xp.C20553b r6, ff0.C23349c r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof com.moovit.ads.banner.BannerAdLoader$loadAd$1
            if (r0 == 0) goto L_0x0016
            r0 = r7
            com.moovit.ads.banner.BannerAdLoader$loadAd$1 r0 = (com.moovit.ads.banner.BannerAdLoader$loadAd$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            com.moovit.ads.banner.BannerAdLoader$loadAd$1 r0 = new com.moovit.ads.banner.BannerAdLoader$loadAd$1
            r0.<init>(r4, r7)
        L_0x001b:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            p584jl.C17885a.m44475z0(r4)
            goto L_0x0049
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0032:
            p584jl.C17885a.m44475z0(r4)
            yp.a r4 = new yp.a
            java.lang.String r1 = r6.f51692a
            com.moovit.ads.AdSize r3 = r6.f51986c
            com.moovit.ads.AdTargeting r6 = r6.f51693b
            r4.<init>(r5, r1, r3, r6)
            r0.label = r2
            java.lang.Object r4 = com.moovit.commons.request.C15752a.m40209a(r4, r0)
            if (r4 != r7) goto L_0x0049
            goto L_0x004f
        L_0x0049:
            yp.b r4 = (p943yp.C20749b) r4
            com.moovit.ads.HtmlBannerAd r7 = r4.f52353g
            if (r7 == 0) goto L_0x0050
        L_0x004f:
            return r7
        L_0x0050:
            java.lang.String r4 = "banner"
            mf0.C24362h.m61217l(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.ads.banner.BannerAdLoader.m37018a(com.moovit.ads.banner.BannerAdLoader, android.content.Context, xp.b, ff0.c):java.lang.Object");
    }

    /* renamed from: b */
    public static Object m37019b(Context context, C20553b bVar, C23349c cVar) {
        C21207b bVar2 = C25184i0.f63459a;
        return C25177g.m63221e(C21073k.f52890a, new BannerAdLoader$loadAdView$2(context, bVar, (C23349c<? super BannerAdLoader$loadAdView$2>) null), cVar);
    }
}
