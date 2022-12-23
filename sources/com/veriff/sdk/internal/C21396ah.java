package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.ah */
class C21396ah {

    /* renamed from: a */
    private final C21388ad f53838a;

    /* renamed from: b */
    private final C21391ae[] f53839b;

    public C21396ah(C21388ad adVar) {
        this.f53838a = new C21388ad(adVar);
        this.f53839b = new C21391ae[((adVar.mo54117d() - adVar.mo54116c()) + 1)];
    }

    /* renamed from: a */
    public final C21391ae mo54170a(int i) {
        C21391ae aeVar;
        C21391ae aeVar2;
        C21391ae c = mo54174c(i);
        if (c != null) {
            return c;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int b = mo54172b(i) - i2;
            if (b >= 0 && (aeVar2 = this.f53839b[b]) != null) {
                return aeVar2;
            }
            int b2 = mo54172b(i) + i2;
            C21391ae[] aeVarArr = this.f53839b;
            if (b2 < aeVarArr.length && (aeVar = aeVarArr[b2]) != null) {
                return aeVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int mo54172b(int i) {
        return i - this.f53838a.mo54116c();
    }

    /* renamed from: c */
    public final C21391ae mo54174c(int i) {
        return this.f53839b[mo54172b(i)];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r11 = this;
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            com.veriff.sdk.internal.ae[] r1 = r11.f53839b     // Catch:{ all -> 0x0054 }
            int r2 = r1.length     // Catch:{ all -> 0x0054 }
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000b:
            if (r4 >= r2) goto L_0x004c
            r6 = r1[r4]     // Catch:{ all -> 0x0054 }
            r7 = 1
            if (r6 != 0) goto L_0x0023
            java.lang.String r6 = "%3d:    |   %n"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0054 }
            int r8 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r7[r3] = r5     // Catch:{ all -> 0x0054 }
            r0.format(r6, r7)     // Catch:{ all -> 0x0054 }
            r5 = r8
            goto L_0x0049
        L_0x0023:
            java.lang.String r8 = "%3d: %3d|%3d%n"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0054 }
            int r10 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r3] = r5     // Catch:{ all -> 0x0054 }
            int r5 = r6.mo54157h()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r7] = r5     // Catch:{ all -> 0x0054 }
            r5 = 2
            int r6 = r6.mo54156g()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0054 }
            r9[r5] = r6     // Catch:{ all -> 0x0054 }
            r0.format(r8, r9)     // Catch:{ all -> 0x0054 }
            r5 = r10
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x004c:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0054 }
            r0.close()
            return r1
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x005f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21396ah.toString():java.lang.String");
    }

    /* renamed from: b */
    public final C21391ae[] mo54173b() {
        return this.f53839b;
    }

    /* renamed from: a */
    public final void mo54171a(int i, C21391ae aeVar) {
        this.f53839b[mo54172b(i)] = aeVar;
    }

    /* renamed from: a */
    public final C21388ad mo54169a() {
        return this.f53838a;
    }
}
