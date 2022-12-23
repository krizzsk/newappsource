package com.moovit.mediation;

public final class AdRepository {

    /* renamed from: a */
    public static final AdRepository f14790a = new AdRepository();

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo19367a(com.google.android.gms.ads.mediation.MediationAdLoadCallback<?, ?> r5, lf0.C24236l<? super ff0.C23349c<? super bf0.C21050d>, ? extends java.lang.Object> r6, ff0.C23349c<? super bf0.C21050d> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.moovit.mediation.AdRepository$load$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.moovit.mediation.AdRepository$load$1 r0 = (com.moovit.mediation.AdRepository$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.moovit.mediation.AdRepository$load$1 r0 = new com.moovit.mediation.AdRepository$load$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.L$0
            com.google.android.gms.ads.mediation.MediationAdLoadCallback r5 = (com.google.android.gms.ads.mediation.MediationAdLoadCallback) r5
            p584jl.C17885a.m44475z0(r7)     // Catch:{ AdMediationException -> 0x0059, Exception -> 0x0041 }
            goto L_0x0069
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p584jl.C17885a.m44475z0(r7)
            r0.L$0 = r5     // Catch:{ AdMediationException -> 0x0059, Exception -> 0x0041 }
            r0.label = r3     // Catch:{ AdMediationException -> 0x0059, Exception -> 0x0041 }
            java.lang.Object r5 = r6.invoke(r0)     // Catch:{ AdMediationException -> 0x0059, Exception -> 0x0041 }
            if (r5 != r1) goto L_0x0069
            return r1
        L_0x0041:
            r6 = move-exception
            gk0.a$a r7 = gk0.C23438a.f59213a
            r6.toString()
            r7.getClass()
            com.moovit.mediation.AdMediationException r7 = new com.moovit.mediation.AdMediationException
            com.moovit.mediation.AdMediationError r0 = com.moovit.mediation.AdMediationError.UNKNOWN
            r7.<init>(r0, r6)
            com.google.android.gms.ads.AdError r6 = r7.mo19365a()
            r5.onFailure((com.google.android.gms.ads.AdError) r6)
            goto L_0x0069
        L_0x0059:
            r6 = move-exception
            gk0.a$a r7 = gk0.C23438a.f59213a
            r6.toString()
            r7.getClass()
            com.google.android.gms.ads.AdError r6 = r6.mo19365a()
            r5.onFailure((com.google.android.gms.ads.AdError) r6)
        L_0x0069:
            bf0.d r5 = bf0.C21050d.f52856a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.mediation.AdRepository.mo19367a(com.google.android.gms.ads.mediation.MediationAdLoadCallback, lf0.l, ff0.c):java.lang.Object");
    }
}
