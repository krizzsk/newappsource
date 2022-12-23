package com.moovit.ads.mapitem;

import android.app.Application;
import bi0.C21073k;
import ci0.C21207b;
import ff0.C23349c;
import p393bq.C13652a;
import wh0.C25177g;
import wh0.C25184i0;

/* renamed from: com.moovit.ads.mapitem.a */
public final class C14709a {

    /* renamed from: a */
    public static final C14709a f37397a = new C14709a();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r9 == r12) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m37025a(com.moovit.ads.mapitem.C14709a r9, android.content.Context r10, p393bq.C13652a r11, ff0.C23349c r12) {
        /*
            r9.getClass()
            boolean r0 = r12 instanceof com.moovit.ads.mapitem.MapItemAdLoader$loadAd$1
            if (r0 == 0) goto L_0x0016
            r0 = r12
            com.moovit.ads.mapitem.MapItemAdLoader$loadAd$1 r0 = (com.moovit.ads.mapitem.MapItemAdLoader$loadAd$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            com.moovit.ads.mapitem.MapItemAdLoader$loadAd$1 r0 = new com.moovit.ads.mapitem.MapItemAdLoader$loadAd$1
            r0.<init>(r9, r12)
        L_0x001b:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            p584jl.C17885a.m44475z0(r9)
            goto L_0x004d
        L_0x002a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0032:
            p584jl.C17885a.m44475z0(r9)
            cq.a r9 = new cq.a
            java.lang.String r5 = r11.f51692a
            java.lang.String r6 = r11.f33688c
            com.moovit.ads.AdSize r7 = r11.f33689d
            com.moovit.ads.AdTargeting r8 = r11.f51693b
            r3 = r9
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r0.label = r2
            java.lang.Object r9 = com.moovit.commons.request.C15752a.m40209a(r9, r0)
            if (r9 != r12) goto L_0x004d
            goto L_0x0053
        L_0x004d:
            cq.b r9 = (p423cq.C16472b) r9
            com.moovit.ads.HtmlMapItemAd r12 = r9.f43065g
            if (r12 == 0) goto L_0x0054
        L_0x0053:
            return r12
        L_0x0054:
            java.lang.String r9 = "mapItem"
            mf0.C24362h.m61217l(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.ads.mapitem.C14709a.m37025a(com.moovit.ads.mapitem.a, android.content.Context, bq.a, ff0.c):java.lang.Object");
    }

    /* renamed from: b */
    public static Object m37026b(Application application, C13652a aVar, C23349c cVar) {
        C21207b bVar = C25184i0.f63459a;
        return C25177g.m63221e(C21073k.f52890a, new MapItemAdLoader$loadAdView$2(application, aVar, (C23349c<? super MapItemAdLoader$loadAdView$2>) null), cVar);
    }
}
