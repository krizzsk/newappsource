package com.veriff.sdk.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.veriff.sdk.internal.ad */
final class C21388ad {

    /* renamed from: a */
    private final C22469s f53800a;

    /* renamed from: b */
    private final C22292q f53801b;

    /* renamed from: c */
    private final C22292q f53802c;

    /* renamed from: d */
    private final C22292q f53803d;

    /* renamed from: e */
    private final C22292q f53804e;

    /* renamed from: f */
    private final int f53805f;

    /* renamed from: g */
    private final int f53806g;

    /* renamed from: h */
    private final int f53807h;

    /* renamed from: i */
    private final int f53808i;

    public C21388ad(C22469s sVar, C22292q qVar, C22292q qVar2, C22292q qVar3, C22292q qVar4) throws C21946l {
        boolean z = false;
        boolean z2 = qVar == null || qVar2 == null;
        z = (qVar3 == null || qVar4 == null) ? true : z;
        if (!z2 || !z) {
            if (z2) {
                qVar = new C22292q(BitmapDescriptorFactory.HUE_RED, qVar3.mo56295b());
                qVar2 = new C22292q(BitmapDescriptorFactory.HUE_RED, qVar4.mo56295b());
            } else if (z) {
                qVar3 = new C22292q((float) (sVar.mo56578b() - 1), qVar.mo56295b());
                qVar4 = new C22292q((float) (sVar.mo56578b() - 1), qVar2.mo56295b());
            }
            this.f53800a = sVar;
            this.f53801b = qVar;
            this.f53802c = qVar2;
            this.f53803d = qVar3;
            this.f53804e = qVar4;
            this.f53805f = (int) Math.min(qVar.mo56294a(), qVar2.mo56294a());
            this.f53806g = (int) Math.max(qVar3.mo56294a(), qVar4.mo56294a());
            this.f53807h = (int) Math.min(qVar.mo56295b(), qVar3.mo56295b());
            this.f53808i = (int) Math.max(qVar2.mo56295b(), qVar4.mo56295b());
            return;
        }
        throw C21946l.m53563a();
    }

    /* renamed from: a */
    public static C21388ad m50849a(C21388ad adVar, C21388ad adVar2) throws C21946l {
        if (adVar == null) {
            return adVar2;
        }
        return adVar2 == null ? adVar : new C21388ad(adVar.f53800a, adVar.f53801b, adVar.f53802c, adVar2.f53803d, adVar2.f53804e);
    }

    /* renamed from: b */
    public int mo54115b() {
        return this.f53806g;
    }

    /* renamed from: c */
    public int mo54116c() {
        return this.f53807h;
    }

    /* renamed from: d */
    public int mo54117d() {
        return this.f53808i;
    }

    /* renamed from: e */
    public C22292q mo54118e() {
        return this.f53801b;
    }

    /* renamed from: f */
    public C22292q mo54119f() {
        return this.f53803d;
    }

    /* renamed from: g */
    public C22292q mo54120g() {
        return this.f53802c;
    }

    /* renamed from: h */
    public C22292q mo54121h() {
        return this.f53804e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.veriff.sdk.internal.C21388ad mo54114a(int r13, int r14, boolean r15) throws com.veriff.sdk.internal.C21946l {
        /*
            r12 = this;
            com.veriff.sdk.internal.q r0 = r12.f53801b
            com.veriff.sdk.internal.q r1 = r12.f53802c
            com.veriff.sdk.internal.q r2 = r12.f53803d
            com.veriff.sdk.internal.q r3 = r12.f53804e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.mo56295b()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            com.veriff.sdk.internal.q r13 = new com.veriff.sdk.internal.q
            float r4 = r4.mo56294a()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            com.veriff.sdk.internal.q r13 = r12.f53802c
            goto L_0x0034
        L_0x0032:
            com.veriff.sdk.internal.q r13 = r12.f53804e
        L_0x0034:
            float r0 = r13.mo56295b()
            int r0 = (int) r0
            int r0 = r0 + r14
            com.veriff.sdk.internal.s r14 = r12.f53800a
            int r14 = r14.mo56581c()
            if (r0 < r14) goto L_0x004a
            com.veriff.sdk.internal.s r14 = r12.f53800a
            int r14 = r14.mo56581c()
            int r0 = r14 + -1
        L_0x004a:
            com.veriff.sdk.internal.q r14 = new com.veriff.sdk.internal.q
            float r13 = r13.mo56294a()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            com.veriff.sdk.internal.ad r13 = new com.veriff.sdk.internal.ad
            com.veriff.sdk.internal.s r7 = r12.f53800a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21388ad.mo54114a(int, int, boolean):com.veriff.sdk.internal.ad");
    }

    /* renamed from: a */
    public int mo54113a() {
        return this.f53805f;
    }

    public C21388ad(C21388ad adVar) {
        this.f53800a = adVar.f53800a;
        this.f53801b = adVar.mo54118e();
        this.f53802c = adVar.mo54120g();
        this.f53803d = adVar.mo54119f();
        this.f53804e = adVar.mo54121h();
        this.f53805f = adVar.mo54113a();
        this.f53806g = adVar.mo54115b();
        this.f53807h = adVar.mo54116c();
        this.f53808i = adVar.mo54117d();
    }
}
