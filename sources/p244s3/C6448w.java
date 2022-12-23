package p244s3;

import java.util.concurrent.Callable;

/* renamed from: s3.w */
public final /* synthetic */ class C6448w implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f20148b;

    /* renamed from: c */
    public final /* synthetic */ Object f20149c;

    public /* synthetic */ C6448w(Object obj, int i) {
        this.f20148b = i;
        this.f20149c = obj;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00bd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r7 = this;
            int r0 = r7.f20148b
            r1 = 0
            switch(r0) {
                case 0: goto L_0x00d7;
                case 1: goto L_0x00ce;
                case 2: goto L_0x003f;
                case 3: goto L_0x0015;
                case 4: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x00e0
        L_0x0008:
            java.lang.Object r0 = r7.f20149c
            com.moovit.payment.account.deposit.a r0 = (com.moovit.payment.account.deposit.C25643a) r0
            android.app.Application r0 = r0.f3907b
            com.moovit.MoovitApplication r0 = (com.moovit.MoovitApplication) r0
            c70.e r0 = com.moovit.payment.account.deposit.C25643a.m64099a(r0)
            return r0
        L_0x0015:
            java.lang.Object r0 = r7.f20149c
            vf.b r0 = (p862vf.C20118b) r0
            wf.c r2 = r0.f51042d
            r2.mo52464b()
            wf.c r2 = r0.f51041c
            r2.mo52464b()
            wf.c r2 = r0.f51043e
            r2.mo52464b()
            com.google.firebase.remoteconfig.internal.b r0 = r0.f51046h
            java.lang.Object r2 = r0.f36701b
            monitor-enter(r2)
            android.content.SharedPreferences r0 = r0.f36700a     // Catch:{ all -> 0x003c }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x003c }
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch:{ all -> 0x003c }
            r0.commit()     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            return r1
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        L_0x003f:
            java.lang.Object r0 = r7.f20149c
            ie.i$a r0 = (p555ie.C17590i.C17591a) r0
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Callable<java.lang.Void>> r2 = r0.f45240b
            r2.set(r1)
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicMarkableReference<ie.b> r2 = r0.f45239a     // Catch:{ all -> 0x0073 }
            boolean r2 = r2.isMarked()     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x0078
            java.util.concurrent.atomic.AtomicMarkableReference<ie.b> r2 = r0.f45239a     // Catch:{ all -> 0x0073 }
            java.lang.Object r2 = r2.getReference()     // Catch:{ all -> 0x0073 }
            ie.b r2 = (p555ie.C17579b) r2     // Catch:{ all -> 0x0073 }
            monitor-enter(r2)     // Catch:{ all -> 0x0073 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0075 }
            java.util.HashMap r4 = r2.f45204a     // Catch:{ all -> 0x0075 }
            r3.<init>(r4)     // Catch:{ all -> 0x0075 }
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)     // Catch:{ all -> 0x0075 }
            monitor-exit(r2)     // Catch:{ all -> 0x0073 }
            java.util.concurrent.atomic.AtomicMarkableReference<ie.b> r2 = r0.f45239a     // Catch:{ all -> 0x0073 }
            java.lang.Object r4 = r2.getReference()     // Catch:{ all -> 0x0073 }
            ie.b r4 = (p555ie.C17579b) r4     // Catch:{ all -> 0x0073 }
            r5 = 0
            r2.set(r4, r5)     // Catch:{ all -> 0x0073 }
            goto L_0x0079
        L_0x0073:
            r1 = move-exception
            goto L_0x00cc
        L_0x0075:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0073 }
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0078:
            r3 = r1
        L_0x0079:
            monitor-exit(r0)     // Catch:{ all -> 0x0073 }
            if (r3 == 0) goto L_0x00cb
            ie.i r2 = p555ie.C17590i.this
            ie.e r4 = r2.f45233a
            java.lang.String r2 = r2.f45235c
            boolean r0 = r0.f45241c
            if (r0 == 0) goto L_0x008f
            me.c r0 = r4.f45211a
            java.lang.String r4 = "internal-keys"
            java.io.File r0 = r0.mo50830a(r2, r4)
            goto L_0x0097
        L_0x008f:
            me.c r0 = r4.f45211a
            java.lang.String r4 = "keys"
            java.io.File r0 = r0.mo50830a(r2, r4)
        L_0x0097:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            java.nio.charset.Charset r6 = p555ie.C17583e.f45210b     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00bc, all -> 0x00ba }
            r3.write(r2)     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            r3.flush()     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            goto L_0x00c0
        L_0x00b8:
            r0 = move-exception
            goto L_0x00c7
        L_0x00ba:
            r0 = move-exception
            goto L_0x00c6
        L_0x00bc:
            r3 = r1
        L_0x00bd:
            p555ie.C17583e.m43702d(r0)     // Catch:{ all -> 0x00c4 }
        L_0x00c0:
            com.google.firebase.crashlytics.internal.common.CommonUtils.m35963a(r3)
            goto L_0x00cb
        L_0x00c4:
            r0 = move-exception
            r1 = r3
        L_0x00c6:
            r3 = r1
        L_0x00c7:
            com.google.firebase.crashlytics.internal.common.CommonUtils.m35963a(r3)
            throw r0
        L_0x00cb:
            return r1
        L_0x00cc:
            monitor-exit(r0)     // Catch:{ all -> 0x0073 }
            throw r1
        L_0x00ce:
            java.lang.Object r0 = r7.f20149c
            com.appboy.Appboy r0 = (com.appboy.Appboy) r0
            com.braze.BrazeUser r0 = r0.m5397b()
            return r0
        L_0x00d7:
            java.lang.Object r0 = r7.f20149c
            bo.app.t3 r0 = (p030bo.app.C1695t3) r0
            java.util.Collection r0 = r0.m4760b()
            return r0
        L_0x00e0:
            java.lang.Object r0 = r7.f20149c
            com.moovit.payment.gateway.googlepay.GooglePayGateway r0 = (com.moovit.payment.gateway.googlepay.GooglePayGateway) r0
            java.lang.String r0 = r0.f42695b
            com.google.android.gms.wallet.IsReadyToPayRequest r0 = com.google.android.gms.wallet.IsReadyToPayRequest.fromJson(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p244s3.C6448w.call():java.lang.Object");
    }
}
