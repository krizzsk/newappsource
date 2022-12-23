package p435de;

import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import p404ce.C13791f;

/* renamed from: de.c */
public final /* synthetic */ class C16593c implements C13791f {

    /* renamed from: b */
    public final /* synthetic */ CrashlyticsRegistrar f43240b;

    public /* synthetic */ C16593c(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.f43240b = crashlyticsRegistrar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02f5 A[Catch:{ Exception -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x031c  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo15m(p404ce.C13806s r42) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            com.google.firebase.crashlytics.CrashlyticsRegistrar r2 = r0.f43240b
            r2.getClass()
            java.lang.Class<qd.d> r2 = p743qd.C19107d.class
            java.lang.Object r2 = r1.mo314b(r2)
            qd.d r2 = (p743qd.C19107d) r2
            java.lang.Class<ee.a> r3 = p459ee.C16810a.class
            ze.a r3 = r1.mo40720j(r3)
            java.lang.Class<ud.a> r4 = p836ud.C19885a.class
            ze.a r4 = r1.mo40720j(r4)
            java.lang.Class<af.c> r5 = p358af.C13436c.class
            java.lang.Object r1 = r1.mo314b(r5)
            af.c r1 = (p358af.C13436c) r1
            r2.mo51535a()
            android.content.Context r12 = r2.f48568a
            java.lang.String r5 = r12.getPackageName()
            me.c r13 = new me.c
            r13.<init>(r12)
            he.x r14 = new he.x
            r14.<init>(r2)
            he.b0 r15 = new he.b0
            r15.<init>(r12, r5, r1, r14)
            ee.c r6 = new ee.c
            r6.<init>(r3)
            de.a r1 = new de.a
            r1.<init>(r4)
            java.lang.String r3 = "Crashlytics Exception Handler"
            java.util.concurrent.ExecutorService r11 = p531he.C17388a0.m43434a(r3)
            he.t r10 = new he.t
            h0.e r8 = new h0.e
            r9 = 3
            r8.<init>(r1, r9)
            ba.g r7 = new ba.g
            r5 = 4
            r7.<init>(r1, r5)
            r3 = r10
            r4 = r2
            r1 = 4
            r5 = r15
            r16 = r7
            r7 = r14
            r17 = 3
            r9 = r16
            r25 = r10
            r10 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.mo51535a()
            qd.f r2 = r2.f48570c
            java.lang.String r2 = r2.f48582b
            java.lang.String r5 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35967e(r12)
            ee.d r10 = new ee.d
            r10.<init>(r12)
            java.lang.String r7 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x0324 }
            java.lang.String r6 = r15.mo49865d()     // Catch:{ NameNotFoundException -> 0x0324 }
            android.content.pm.PackageManager r3 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0324 }
            r9 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r7, r9)     // Catch:{ NameNotFoundException -> 0x0324 }
            int r4 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x0324 }
            java.lang.String r23 = java.lang.Integer.toString(r4)     // Catch:{ NameNotFoundException -> 0x0324 }
            java.lang.String r3 = r3.versionName     // Catch:{ NameNotFoundException -> 0x0324 }
            if (r3 != 0) goto L_0x0099
            java.lang.String r3 = "0.0"
        L_0x0099:
            r22 = r3
            he.a r8 = new he.a     // Catch:{ NameNotFoundException -> 0x0324 }
            r3 = r8
            r4 = r2
            r39 = r8
            r8 = r23
            r40 = 0
            r9 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ NameNotFoundException -> 0x0324 }
            java.lang.String r3 = "com.google.firebase.crashlytics.startup"
            java.util.concurrent.ExecutorService r3 = p531he.C17388a0.m43434a(r3)
            cg.e r4 = new cg.e
            r4.<init>()
            java.lang.String r5 = r15.mo49865d()
            t4.c r8 = new t4.c
            r8.<init>()
            oe.d r9 = new oe.d
            r9.<init>(r8)
            e3.g r10 = new e3.g
            r10.<init>((p648me.C18365c) r13)
            java.util.Locale r6 = java.util.Locale.US
            r13 = 1
            java.lang.Object[] r7 = new java.lang.Object[r13]
            r7[r40] = r2
            java.lang.String r11 = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"
            java.lang.String r7 = java.lang.String.format(r6, r11, r7)
            p6.b r11 = new p6.b
            r11.<init>(r7, r4)
            r4 = 2
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r4 = android.os.Build.MANUFACTURER
            java.lang.String r1 = p531he.C17390b0.f44795h
            java.lang.String r13 = ""
            java.lang.String r4 = r4.replaceAll(r1, r13)
            r7[r40] = r4
            java.lang.String r4 = android.os.Build.MODEL
            java.lang.String r4 = r4.replaceAll(r1, r13)
            r19 = 1
            r7[r19] = r4
            java.lang.String r4 = "%s/%s"
            java.lang.String r4 = java.lang.String.format(r6, r4, r7)
            java.lang.String r6 = android.os.Build.VERSION.INCREMENTAL
            java.lang.String r6 = r6.replaceAll(r1, r13)
            java.lang.String r7 = android.os.Build.VERSION.RELEASE
            java.lang.String r19 = r7.replaceAll(r1, r13)
            r1 = 4
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.String r18 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35967e(r12)
            r7[r40] = r18
            r18 = 1
            r7[r18] = r2
            r16 = 2
            r7[r16] = r22
            r7[r17] = r23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r16 = r15
            r0 = 0
        L_0x0120:
            r15 = 4
            if (r0 >= r15) goto L_0x0140
            r15 = r7[r0]
            if (r15 == 0) goto L_0x0139
            r17 = r7
            java.lang.String r7 = "-"
            java.lang.String r7 = r15.replace(r7, r13)
            java.util.Locale r15 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r15)
            r1.add(r7)
            goto L_0x013b
        L_0x0139:
            r17 = r7
        L_0x013b:
            int r0 = r0 + 1
            r7 = r17
            goto L_0x0120
        L_0x0140:
            java.util.Collections.sort(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x014c:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x015c
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            r0.append(r7)
            goto L_0x014c
        L_0x015c:
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0180
            java.lang.String r1 = "SHA-1"
            byte[] r0 = r0.getBytes()
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x017c }
            r1.update(r0)
            byte[] r0 = r1.digest()
            java.lang.String r13 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35970h(r0)
            goto L_0x017d
        L_0x017c:
        L_0x017d:
            r21 = r13
            goto L_0x0182
        L_0x0180:
            r21 = 0
        L_0x0182:
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r0 = com.google.firebase.crashlytics.internal.common.DeliveryMechanism.determineFrom(r5)
            int r24 = r0.getId()
            oe.g r7 = new oe.g
            r0 = r16
            r15 = r7
            r16 = r2
            r17 = r4
            r18 = r6
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.google.firebase.crashlytics.internal.settings.a r0 = new com.google.firebase.crashlytics.internal.settings.a
            r5 = r0
            r6 = r12
            r1 = 0
            r12 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            com.google.android.gms.tasks.Task r2 = r0.mo43340b(r3)
            de.d r4 = new de.d
            r4.<init>()
            r2.continueWith(r3, r4)
            r2 = r25
            android.content.Context r4 = r2.f44849a
            if (r4 == 0) goto L_0x01e0
            android.content.res.Resources r5 = r4.getResources()
            if (r5 == 0) goto L_0x01e0
            java.lang.String r6 = "com.crashlytics.RequireBuildId"
            java.lang.String r7 = "bool"
            int r7 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35968f(r4, r6, r7)
            if (r7 <= 0) goto L_0x01cc
            boolean r4 = r5.getBoolean(r7)
        L_0x01c9:
            r19 = r4
            goto L_0x01dd
        L_0x01cc:
            java.lang.String r5 = "string"
            int r5 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35968f(r4, r6, r5)
            if (r5 <= 0) goto L_0x01e0
            java.lang.String r4 = r4.getString(r5)
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            goto L_0x01c9
        L_0x01dd:
            r4 = r39
            goto L_0x01e4
        L_0x01e0:
            r4 = r39
            r19 = 1
        L_0x01e4:
            java.lang.String r5 = r4.f44785b
            if (r19 != 0) goto L_0x01e9
            goto L_0x01ef
        L_0x01e9:
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01f1
        L_0x01ef:
            r9 = 1
            goto L_0x01f2
        L_0x01f1:
            r9 = 0
        L_0x01f2:
            if (r9 == 0) goto L_0x031c
            he.d r5 = new he.d
            he.b0 r6 = r2.f44856h
            r5.<init>(r6)
            java.lang.String r5 = p531he.C17393d.f44803b
            com.android.billingclient.api.s r6 = new com.android.billingclient.api.s     // Catch:{ Exception -> 0x030a }
            java.lang.String r7 = "crash_marker"
            me.c r8 = r2.f44857i     // Catch:{ Exception -> 0x030a }
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8)     // Catch:{ Exception -> 0x030a }
            r2.f44854f = r6     // Catch:{ Exception -> 0x030a }
            com.android.billingclient.api.s r6 = new com.android.billingclient.api.s     // Catch:{ Exception -> 0x030a }
            java.lang.String r7 = "initialization_marker"
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8)     // Catch:{ Exception -> 0x030a }
            r2.f44853e = r6     // Catch:{ Exception -> 0x030a }
            ie.i r6 = new ie.i     // Catch:{ Exception -> 0x030a }
            he.e r7 = r2.f44861m     // Catch:{ Exception -> 0x030a }
            r6.<init>(r5, r8, r7)     // Catch:{ Exception -> 0x030a }
            ie.c r7 = new ie.c     // Catch:{ Exception -> 0x030a }
            me.c r8 = r2.f44857i     // Catch:{ Exception -> 0x030a }
            r7.<init>(r8)     // Catch:{ Exception -> 0x030a }
            pe.a r8 = new pe.a     // Catch:{ Exception -> 0x030a }
            r9 = 1
            pe.c[] r10 = new p720pe.C18919c[r9]     // Catch:{ Exception -> 0x030a }
            jl.b r11 = new jl.b     // Catch:{ Exception -> 0x030a }
            r11.<init>()     // Catch:{ Exception -> 0x030a }
            r10[r40] = r11     // Catch:{ Exception -> 0x030a }
            r8.<init>((p720pe.C18919c[]) r10)     // Catch:{ Exception -> 0x030a }
            android.content.Context r10 = r2.f44849a     // Catch:{ Exception -> 0x030a }
            he.b0 r11 = r2.f44856h     // Catch:{ Exception -> 0x030a }
            me.c r12 = r2.f44857i     // Catch:{ Exception -> 0x030a }
            s6.c r13 = r2.f44851c     // Catch:{ Exception -> 0x030a }
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r4
            r30 = r7
            r31 = r6
            r32 = r8
            r33 = r0
            r34 = r13
            he.e0 r36 = p531he.C17397e0.m43446b(r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ Exception -> 0x030a }
            com.google.firebase.crashlytics.internal.common.d r8 = new com.google.firebase.crashlytics.internal.common.d     // Catch:{ Exception -> 0x030a }
            android.content.Context r10 = r2.f44849a     // Catch:{ Exception -> 0x030a }
            he.e r11 = r2.f44861m     // Catch:{ Exception -> 0x030a }
            he.b0 r12 = r2.f44856h     // Catch:{ Exception -> 0x030a }
            he.x r13 = r2.f44850b     // Catch:{ Exception -> 0x030a }
            me.c r14 = r2.f44857i     // Catch:{ Exception -> 0x030a }
            com.android.billingclient.api.s r15 = r2.f44854f     // Catch:{ Exception -> 0x030a }
            ee.a r9 = r2.f44862n     // Catch:{ Exception -> 0x030a }
            fe.a r1 = r2.f44859k     // Catch:{ Exception -> 0x030a }
            r26 = r8
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r33 = r4
            r34 = r6
            r35 = r7
            r37 = r9
            r38 = r1
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ Exception -> 0x030a }
            r2.f44855g = r8     // Catch:{ Exception -> 0x030a }
            com.android.billingclient.api.s r1 = r2.f44853e     // Catch:{ Exception -> 0x030a }
            java.lang.Object r4 = r1.f6792b     // Catch:{ Exception -> 0x030a }
            me.c r4 = (p648me.C18365c) r4     // Catch:{ Exception -> 0x030a }
            java.lang.Object r1 = r1.f6791a     // Catch:{ Exception -> 0x030a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x030a }
            r4.getClass()     // Catch:{ Exception -> 0x030a }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x030a }
            java.io.File r4 = r4.f46821b     // Catch:{ Exception -> 0x030a }
            r6.<init>(r4, r1)     // Catch:{ Exception -> 0x030a }
            boolean r1 = r6.exists()     // Catch:{ Exception -> 0x030a }
            he.e r4 = r2.f44861m     // Catch:{ Exception -> 0x030a }
            he.u r6 = new he.u     // Catch:{ Exception -> 0x030a }
            r6.<init>(r2)     // Catch:{ Exception -> 0x030a }
            com.google.android.gms.tasks.Task r4 = r4.mo49869a(r6)     // Catch:{ Exception -> 0x030a }
            java.lang.Object r4 = p531he.C17406i0.m43451a(r4)     // Catch:{ Exception -> 0x02a9 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x02a9 }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x030a }
            r6.equals(r4)     // Catch:{ Exception -> 0x030a }
        L_0x02a9:
            com.google.firebase.crashlytics.internal.common.d r4 = r2.f44855g     // Catch:{ Exception -> 0x030a }
            java.lang.Thread$UncaughtExceptionHandler r6 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ Exception -> 0x030a }
            he.e r7 = r4.f36484e     // Catch:{ Exception -> 0x030a }
            he.o r8 = new he.o     // Catch:{ Exception -> 0x030a }
            r8.<init>(r4, r5)     // Catch:{ Exception -> 0x030a }
            r7.mo49869a(r8)     // Catch:{ Exception -> 0x030a }
            com.google.firebase.crashlytics.internal.common.a r5 = new com.google.firebase.crashlytics.internal.common.a     // Catch:{ Exception -> 0x030a }
            r5.<init>(r4)     // Catch:{ Exception -> 0x030a }
            com.google.firebase.crashlytics.internal.common.e r7 = new com.google.firebase.crashlytics.internal.common.e     // Catch:{ Exception -> 0x030a }
            ee.a r8 = r4.f36489j     // Catch:{ Exception -> 0x030a }
            r7.<init>(r5, r0, r6, r8)     // Catch:{ Exception -> 0x030a }
            r4.f36492m = r7     // Catch:{ Exception -> 0x030a }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r7)     // Catch:{ Exception -> 0x030a }
            if (r1 == 0) goto L_0x0308
            android.content.Context r1 = r2.f44849a     // Catch:{ Exception -> 0x030a }
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            int r4 = r1.checkCallingOrSelfPermission(r4)     // Catch:{ Exception -> 0x030a }
            if (r4 != 0) goto L_0x02d8
            r9 = 1
            goto L_0x02d9
        L_0x02d8:
            r9 = 0
        L_0x02d9:
            if (r9 == 0) goto L_0x02f2
            java.lang.String r4 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r4)     // Catch:{ Exception -> 0x030a }
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch:{ Exception -> 0x030a }
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ Exception -> 0x030a }
            if (r1 == 0) goto L_0x02f0
            boolean r1 = r1.isConnectedOrConnecting()     // Catch:{ Exception -> 0x030a }
            if (r1 == 0) goto L_0x02f0
            goto L_0x02f2
        L_0x02f0:
            r9 = 0
            goto L_0x02f3
        L_0x02f2:
            r9 = 1
        L_0x02f3:
            if (r9 == 0) goto L_0x0308
            he.s r1 = new he.s     // Catch:{ Exception -> 0x030a }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x030a }
            java.util.concurrent.ExecutorService r4 = r2.f44860l     // Catch:{ Exception -> 0x030a }
            java.util.concurrent.Future r1 = r4.submit(r1)     // Catch:{ Exception -> 0x030a }
            r4 = 4
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x030d }
            r1.get(r4, r6)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x030d }
            goto L_0x030d
        L_0x0308:
            r9 = 1
            goto L_0x030e
        L_0x030a:
            r1 = 0
            r2.f44855g = r1
        L_0x030d:
            r9 = 0
        L_0x030e:
            de.e r1 = new de.e
            r1.<init>(r9, r2, r0)
            com.google.android.gms.tasks.Tasks.call(r3, r1)
            de.f r11 = new de.f
            r11.<init>(r2)
            goto L_0x0326
        L_0x031c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."
            r0.<init>(r1)
            throw r0
        L_0x0324:
            r1 = 0
            r11 = r1
        L_0x0326:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p435de.C16593c.mo15m(ce.s):java.lang.Object");
    }
}
