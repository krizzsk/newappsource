package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.q */
public final /* synthetic */ class C1961q implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C1962r f6786b;

    public /* synthetic */ C1961q(C1962r rVar) {
        this.f6786b = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r11 = this;
            com.android.billingclient.api.r r0 = r11.f6786b
            java.lang.Object r1 = r0.f6787b
            monitor-enter(r1)
            boolean r2 = r0.f6788c     // Catch:{ all -> 0x00da }
            r3 = 0
            if (r2 == 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x00da }
            goto L_0x00d9
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x00da }
            r1 = 3
            r2 = 0
            com.android.billingclient.api.c r4 = r0.f6790e     // Catch:{ Exception -> 0x00bc }
            android.content.Context r4 = r4.f6742e     // Catch:{ Exception -> 0x00bc }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x00bc }
            r5 = 16
            r6 = 16
            r7 = 3
        L_0x001d:
            if (r6 < r1) goto L_0x0032
            com.android.billingclient.api.c r8 = r0.f6790e     // Catch:{ Exception -> 0x002f }
            com.google.android.gms.internal.play_billing.zzd r8 = r8.f6743f     // Catch:{ Exception -> 0x002f }
            java.lang.String r9 = "subs"
            int r7 = r8.zzb(r6, r4, r9)     // Catch:{ Exception -> 0x002f }
            if (r7 != 0) goto L_0x002c
            goto L_0x0033
        L_0x002c:
            int r6 = r6 + -1
            goto L_0x001d
        L_0x002f:
            r1 = r7
            goto L_0x00bc
        L_0x0032:
            r6 = 0
        L_0x0033:
            com.android.billingclient.api.c r8 = r0.f6790e     // Catch:{ Exception -> 0x002f }
            r9 = 5
            r10 = 1
            r8.getClass()     // Catch:{ Exception -> 0x002f }
            if (r6 < r1) goto L_0x003e
            r9 = 1
            goto L_0x003f
        L_0x003e:
            r9 = 0
        L_0x003f:
            r8.f6745h = r9     // Catch:{ Exception -> 0x002f }
            if (r6 >= r1) goto L_0x004a
            java.lang.String r6 = "BillingClient"
            java.lang.String r8 = "In-app billing API does not support subscription on this device."
            com.google.android.gms.internal.play_billing.zza.zzj(r6, r8)     // Catch:{ Exception -> 0x002f }
        L_0x004a:
            r6 = 16
        L_0x004c:
            if (r6 < r1) goto L_0x0062
            com.android.billingclient.api.c r8 = r0.f6790e     // Catch:{ Exception -> 0x002f }
            com.google.android.gms.internal.play_billing.zzd r8 = r8.f6743f     // Catch:{ Exception -> 0x002f }
            java.lang.String r9 = "inapp"
            int r7 = r8.zzb(r6, r4, r9)     // Catch:{ Exception -> 0x002f }
            if (r7 != 0) goto L_0x005f
            com.android.billingclient.api.c r4 = r0.f6790e     // Catch:{ Exception -> 0x002f }
            r4.f6746i = r6     // Catch:{ Exception -> 0x002f }
            goto L_0x0062
        L_0x005f:
            int r6 = r6 + -1
            goto L_0x004c
        L_0x0062:
            com.android.billingclient.api.c r4 = r0.f6790e     // Catch:{ Exception -> 0x002f }
            int r6 = r4.f6746i     // Catch:{ Exception -> 0x002f }
            if (r6 < r5) goto L_0x006a
            r5 = 1
            goto L_0x006b
        L_0x006a:
            r5 = 0
        L_0x006b:
            r4.f6752o = r5     // Catch:{ Exception -> 0x002f }
            r5 = 15
            if (r6 < r5) goto L_0x0073
            r5 = 1
            goto L_0x0074
        L_0x0073:
            r5 = 0
        L_0x0074:
            r4.f6751n = r5     // Catch:{ Exception -> 0x002f }
            r5 = 14
            if (r6 < r5) goto L_0x007c
            r5 = 1
            goto L_0x007d
        L_0x007c:
            r5 = 0
        L_0x007d:
            r4.f6750m = r5     // Catch:{ Exception -> 0x002f }
            r5 = 12
            r4.getClass()     // Catch:{ Exception -> 0x002f }
            r5 = 10
            if (r6 < r5) goto L_0x008a
            r5 = 1
            goto L_0x008b
        L_0x008a:
            r5 = 0
        L_0x008b:
            r4.f6749l = r5     // Catch:{ Exception -> 0x002f }
            r5 = 9
            if (r6 < r5) goto L_0x0093
            r5 = 1
            goto L_0x0094
        L_0x0093:
            r5 = 0
        L_0x0094:
            r4.f6748k = r5     // Catch:{ Exception -> 0x002f }
            r5 = 8
            r4.getClass()     // Catch:{ Exception -> 0x002f }
            r5 = 6
            if (r6 < r5) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r10 = 0
        L_0x00a0:
            r4.f6747j = r10     // Catch:{ Exception -> 0x002f }
            if (r6 >= r1) goto L_0x00ab
            java.lang.String r1 = "BillingClient"
            java.lang.String r4 = "In-app billing API version 3 is not supported on this device."
            com.google.android.gms.internal.play_billing.zza.zzk(r1, r4)     // Catch:{ Exception -> 0x002f }
        L_0x00ab:
            if (r7 != 0) goto L_0x00b3
            com.android.billingclient.api.c r1 = r0.f6790e     // Catch:{ Exception -> 0x002f }
            r4 = 2
            r1.f6738a = r4     // Catch:{ Exception -> 0x002f }
            goto L_0x00cc
        L_0x00b3:
            com.android.billingclient.api.c r1 = r0.f6790e     // Catch:{ Exception -> 0x002f }
            r1.f6738a = r2     // Catch:{ Exception -> 0x002f }
            com.android.billingclient.api.c r1 = r0.f6790e     // Catch:{ Exception -> 0x002f }
            r1.f6743f = r3     // Catch:{ Exception -> 0x002f }
            goto L_0x00cc
        L_0x00bc:
            java.lang.String r4 = "BillingClient"
            java.lang.String r5 = "Exception while checking if billing is supported; try to reconnect"
            com.google.android.gms.internal.play_billing.zza.zzk(r4, r5)
            com.android.billingclient.api.c r4 = r0.f6790e
            r4.f6738a = r2
            com.android.billingclient.api.c r2 = r0.f6790e
            r2.f6743f = r3
            r7 = r1
        L_0x00cc:
            if (r7 != 0) goto L_0x00d4
            com.android.billingclient.api.f r1 = com.android.billingclient.api.C1964t.f6802j
            r0.mo9581a(r1)
            goto L_0x00d9
        L_0x00d4:
            com.android.billingclient.api.f r1 = com.android.billingclient.api.C1964t.f6793a
            r0.mo9581a(r1)
        L_0x00d9:
            return r3
        L_0x00da:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00da }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1961q.call():java.lang.Object");
    }
}
