package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.ag */
final class C21395ag {

    /* renamed from: a */
    private final C21316ab f53834a;

    /* renamed from: b */
    private final C21396ah[] f53835b;

    /* renamed from: c */
    private C21388ad f53836c;

    /* renamed from: d */
    private final int f53837d;

    public C21395ag(C21316ab abVar, C21388ad adVar) {
        this.f53834a = abVar;
        int a = abVar.mo53821a();
        this.f53837d = a;
        this.f53836c = adVar;
        this.f53835b = new C21396ah[(a + 2)];
    }

    /* renamed from: f */
    private int m50915f() {
        int g = m50916g();
        if (g == 0) {
            return 0;
        }
        for (int i = 1; i < this.f53837d + 1; i++) {
            C21391ae[] b = this.f53835b[i].mo54173b();
            for (int i2 = 0; i2 < b.length; i2++) {
                C21391ae aeVar = b[i2];
                if (aeVar != null && !aeVar.mo54148a()) {
                    m50912a(i, i2, b);
                }
            }
        }
        return g;
    }

    /* renamed from: g */
    private int m50916g() {
        m50917h();
        return m50919j() + m50918i();
    }

    /* renamed from: h */
    private void m50917h() {
        C21396ah[] ahVarArr = this.f53835b;
        C21396ah ahVar = ahVarArr[0];
        if (ahVar != null && ahVarArr[this.f53837d + 1] != null) {
            C21391ae[] b = ahVar.mo54173b();
            C21391ae[] b2 = this.f53835b[this.f53837d + 1].mo54173b();
            for (int i = 0; i < b.length; i++) {
                C21391ae aeVar = b[i];
                if (!(aeVar == null || b2[i] == null || aeVar.mo54157h() != b2[i].mo54157h())) {
                    for (int i2 = 1; i2 <= this.f53837d; i2++) {
                        C21391ae aeVar2 = this.f53835b[i2].mo54173b()[i];
                        if (aeVar2 != null) {
                            aeVar2.mo54151b(b[i].mo54157h());
                            if (!aeVar2.mo54148a()) {
                                this.f53835b[i2].mo54173b()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private int m50918i() {
        C21396ah[] ahVarArr = this.f53835b;
        int i = this.f53837d;
        if (ahVarArr[i + 1] == null) {
            return 0;
        }
        C21391ae[] b = ahVarArr[i + 1].mo54173b();
        int i2 = 0;
        for (int i3 = 0; i3 < b.length; i3++) {
            C21391ae aeVar = b[i3];
            if (aeVar != null) {
                int h = aeVar.mo54157h();
                int i4 = 0;
                for (int i5 = this.f53837d + 1; i5 > 0 && i4 < 2; i5--) {
                    C21391ae aeVar2 = this.f53835b[i5].mo54173b()[i3];
                    if (aeVar2 != null) {
                        i4 = m50911a(h, i4, aeVar2);
                        if (!aeVar2.mo54148a()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: j */
    private int m50919j() {
        C21396ah ahVar = this.f53835b[0];
        if (ahVar == null) {
            return 0;
        }
        C21391ae[] b = ahVar.mo54173b();
        int i = 0;
        for (int i2 = 0; i2 < b.length; i2++) {
            C21391ae aeVar = b[i2];
            if (aeVar != null) {
                int h = aeVar.mo54157h();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f53837d + 1 && i3 < 2; i4++) {
                    C21391ae aeVar2 = this.f53835b[i4].mo54173b()[i2];
                    if (aeVar2 != null) {
                        i3 = m50911a(h, i3, aeVar2);
                        if (!aeVar2.mo54148a()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public C21396ah[] mo54163a() {
        m50913a(this.f53835b[0]);
        m50913a(this.f53835b[this.f53837d + 1]);
        int i = 928;
        while (true) {
            int f = m50915f();
            if (f > 0 && f < i) {
                i = f;
            }
        }
        return this.f53835b;
    }

    /* renamed from: b */
    public int mo54164b() {
        return this.f53837d;
    }

    /* renamed from: c */
    public int mo54165c() {
        return this.f53834a.mo53823c();
    }

    /* renamed from: d */
    public int mo54166d() {
        return this.f53834a.mo53822b();
    }

    /* renamed from: e */
    public C21388ad mo54167e() {
        return this.f53836c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            com.veriff.sdk.internal.ah[] r0 = r10.f53835b
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x000d
            int r2 = r10.f53837d
            int r2 = r2 + r3
            r2 = r0[r2]
        L_0x000d:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = 0
        L_0x0013:
            com.veriff.sdk.internal.ae[] r5 = r2.mo54173b()     // Catch:{ all -> 0x007a }
            int r5 = r5.length     // Catch:{ all -> 0x007a }
            if (r4 >= r5) goto L_0x0072
            java.lang.String r5 = "CW %3d:"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x007a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007a }
            r6[r1] = r7     // Catch:{ all -> 0x007a }
            r0.format(r5, r6)     // Catch:{ all -> 0x007a }
            r5 = 0
        L_0x0028:
            int r6 = r10.f53837d     // Catch:{ all -> 0x007a }
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L_0x0068
            com.veriff.sdk.internal.ah[] r6 = r10.f53835b     // Catch:{ all -> 0x007a }
            r6 = r6[r5]     // Catch:{ all -> 0x007a }
            java.lang.String r8 = "    |   "
            if (r6 != 0) goto L_0x003c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r0.format(r8, r6)     // Catch:{ all -> 0x007a }
            goto L_0x0065
        L_0x003c:
            com.veriff.sdk.internal.ae[] r6 = r6.mo54173b()     // Catch:{ all -> 0x007a }
            r6 = r6[r4]     // Catch:{ all -> 0x007a }
            if (r6 != 0) goto L_0x004a
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r0.format(r8, r6)     // Catch:{ all -> 0x007a }
            goto L_0x0065
        L_0x004a:
            java.lang.String r8 = " %3d|%3d"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x007a }
            int r9 = r6.mo54157h()     // Catch:{ all -> 0x007a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x007a }
            r7[r1] = r9     // Catch:{ all -> 0x007a }
            int r6 = r6.mo54156g()     // Catch:{ all -> 0x007a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x007a }
            r7[r3] = r6     // Catch:{ all -> 0x007a }
            r0.format(r8, r7)     // Catch:{ all -> 0x007a }
        L_0x0065:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0068:
            java.lang.String r5 = "%n"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r0.format(r5, r6)     // Catch:{ all -> 0x007a }
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0072:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x007a }
            r0.close()
            return r1
        L_0x007a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007c }
        L_0x007c:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0085:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21395ag.toString():java.lang.String");
    }

    /* renamed from: a */
    private void m50913a(C21396ah ahVar) {
        if (ahVar != null) {
            ((C21397ai) ahVar).mo54176a(this.f53834a);
        }
    }

    /* renamed from: a */
    private static int m50911a(int i, int i2, C21391ae aeVar) {
        if (aeVar == null || aeVar.mo54148a()) {
            return i2;
        }
        if (!aeVar.mo54149a(i)) {
            return i2 + 1;
        }
        aeVar.mo54151b(i);
        return 0;
    }

    /* renamed from: a */
    private void m50912a(int i, int i2, C21391ae[] aeVarArr) {
        C21391ae aeVar = aeVarArr[i2];
        C21391ae[] b = this.f53835b[i - 1].mo54173b();
        C21396ah ahVar = this.f53835b[i + 1];
        C21391ae[] b2 = ahVar != null ? ahVar.mo54173b() : b;
        C21391ae[] aeVarArr2 = new C21391ae[14];
        aeVarArr2[2] = b[i2];
        aeVarArr2[3] = b2[i2];
        int i3 = 0;
        if (i2 > 0) {
            int i4 = i2 - 1;
            aeVarArr2[0] = aeVarArr[i4];
            aeVarArr2[4] = b[i4];
            aeVarArr2[5] = b2[i4];
        }
        if (i2 > 1) {
            int i5 = i2 - 2;
            aeVarArr2[8] = aeVarArr[i5];
            aeVarArr2[10] = b[i5];
            aeVarArr2[11] = b2[i5];
        }
        if (i2 < aeVarArr.length - 1) {
            int i6 = i2 + 1;
            aeVarArr2[1] = aeVarArr[i6];
            aeVarArr2[6] = b[i6];
            aeVarArr2[7] = b2[i6];
        }
        if (i2 < aeVarArr.length - 2) {
            int i7 = i2 + 2;
            aeVarArr2[9] = aeVarArr[i7];
            aeVarArr2[12] = b[i7];
            aeVarArr2[13] = b2[i7];
        }
        while (i3 < 14 && !m50914a(aeVar, aeVarArr2[i3])) {
            i3++;
        }
    }

    /* renamed from: a */
    private static boolean m50914a(C21391ae aeVar, C21391ae aeVar2) {
        if (aeVar2 == null || !aeVar2.mo54148a() || aeVar2.mo54155f() != aeVar.mo54155f()) {
            return false;
        }
        aeVar.mo54151b(aeVar2.mo54157h());
        return true;
    }

    /* renamed from: a */
    public void mo54162a(C21388ad adVar) {
        this.f53836c = adVar;
    }

    /* renamed from: a */
    public void mo54161a(int i, C21396ah ahVar) {
        this.f53835b[i] = ahVar;
    }

    /* renamed from: a */
    public C21396ah mo54160a(int i) {
        return this.f53835b[i];
    }
}
