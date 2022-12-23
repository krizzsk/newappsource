package com.facebook.appevents;

/* renamed from: com.facebook.appevents.i */
public final /* synthetic */ class C2337i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f8535b;

    public /* synthetic */ C2337i(int i) {
        this.f8535b = i;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
        p262t8.C6606a.m15600a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f8535b
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x003d;
                case 1: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0085
        L_0x0009:
            android.content.Context r0 = p009a8.C0115o.m210a()
            h8.f r3 = p110h8.C5147f.f17185a
            java.lang.Object r3 = p110h8.C5139c.f17155h
            java.util.ArrayList r3 = p110h8.C5147f.m13044f(r0, r3)
            h8.c r4 = p110h8.C5139c.f17148a
            r5 = 0
            p110h8.C5139c.m13030a(r4, r0, r3, r5)
            java.lang.Object r3 = p110h8.C5139c.f17155h
            java.lang.Class<h8.f> r4 = p110h8.C5147f.class
            boolean r5 = p262t8.C6606a.m15601b(r4)
            if (r5 == 0) goto L_0x0026
            goto L_0x0037
        L_0x0026:
            h8.f r5 = p110h8.C5147f.f17185a     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = "subs"
            java.util.ArrayList r3 = r5.mo20872e(r0, r3, r6)     // Catch:{ all -> 0x0033 }
            java.util.ArrayList r1 = r5.mo20868a(r3)     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r3 = move-exception
            p262t8.C6606a.m15600a(r4, r3)
        L_0x0037:
            h8.c r3 = p110h8.C5139c.f17148a
            p110h8.C5139c.m13030a(r3, r0, r1, r2)
            return
        L_0x003d:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String r3 = com.facebook.appevents.C2335g.f8528a
            java.lang.Class<com.facebook.appevents.g> r3 = com.facebook.appevents.C2335g.class
            boolean r4 = p262t8.C6606a.m15601b(r3)
            if (r4 == 0) goto L_0x004d
            goto L_0x0058
        L_0x004d:
            androidx.lifecycle.u r4 = com.facebook.appevents.C2335g.f8530c     // Catch:{ all -> 0x0054 }
            java.util.Set r1 = r4.mo4333h()     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r4 = move-exception
            p262t8.C6606a.m15600a(r3, r4)
        L_0x0058:
            java.util.Iterator r1 = r1.iterator()
        L_0x005c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0070
            java.lang.Object r3 = r1.next()
            com.facebook.appevents.AccessTokenAppIdPair r3 = (com.facebook.appevents.AccessTokenAppIdPair) r3
            java.lang.String r3 = r3.mo12449b()
            r0.add(r3)
            goto L_0x005c
        L_0x0070:
            java.util.Iterator r0 = r0.iterator()
        L_0x0074:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0084
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.facebook.internal.FetchedAppSettingsManager.m6264f(r1, r2)
            goto L_0x0074
        L_0x0084:
            return
        L_0x0085:
            com.facebook.appevents.ml.ModelManager r0 = com.facebook.appevents.p047ml.ModelManager.f8546a
            java.lang.Class<com.facebook.appevents.ml.ModelManager> r0 = com.facebook.appevents.p047ml.ModelManager.class
            boolean r1 = p262t8.C6606a.m15601b(r0)
            if (r1 == 0) goto L_0x0090
            goto L_0x00b7
        L_0x0090:
            n8.d r1 = p184n8.C5872d.f18869a     // Catch:{ all -> 0x00b3 }
            java.lang.Class<n8.d> r1 = p184n8.C5872d.class
            monitor-enter(r1)     // Catch:{ all -> 0x00b3 }
            boolean r3 = p262t8.C6606a.m15601b(r1)     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x009d
            monitor-exit(r1)     // Catch:{ all -> 0x00b3 }
            goto L_0x00b7
        L_0x009d:
            java.util.concurrent.Executor r3 = p009a8.C0115o.m212c()     // Catch:{ all -> 0x00aa }
            com.facebook.appevents.d r4 = new com.facebook.appevents.d     // Catch:{ all -> 0x00aa }
            r4.<init>(r2)     // Catch:{ all -> 0x00aa }
            r3.execute(r4)     // Catch:{ all -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            r2 = move-exception
            p262t8.C6606a.m15600a(r1, r2)     // Catch:{ all -> 0x00b0 }
        L_0x00ae:
            monitor-exit(r1)     // Catch:{ all -> 0x00b3 }
            goto L_0x00b7
        L_0x00b0:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b3 }
            throw r2     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            p262t8.C6606a.m15600a(r0, r1)
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2337i.run():void");
    }
}
