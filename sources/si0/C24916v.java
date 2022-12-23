package si0;

import mf0.C24362h;

/* renamed from: si0.v */
public final class C24916v implements C24893c0 {

    /* renamed from: b */
    public final C24898f f62978b;

    /* renamed from: c */
    public C24920y f62979c;

    /* renamed from: d */
    public int f62980d;

    /* renamed from: e */
    public boolean f62981e;

    /* renamed from: f */
    public long f62982f;

    /* renamed from: g */
    public final C24902i f62983g;

    public C24916v(C24902i iVar) {
        int i;
        C24362h.m61211f(iVar, "upstream");
        this.f62983g = iVar;
        C24898f buffer = iVar.getBuffer();
        this.f62978b = buffer;
        C24920y yVar = buffer.f62946b;
        this.f62979c = yVar;
        if (yVar != null) {
            i = yVar.f62992b;
        } else {
            i = -1;
        }
        this.f62980d = i;
    }

    /* renamed from: E */
    public final C24895d0 mo58974E() {
        return this.f62983g.mo58974E();
    }

    public final void close() {
        this.f62981e = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r4 == r5.f62992b) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo53601m(si0.C24898f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            mf0.C24362h.m61211f(r9, r0)
            r0 = 0
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x000e
            r4 = 1
            goto L_0x000f
        L_0x000e:
            r4 = 0
        L_0x000f:
            if (r4 == 0) goto L_0x0082
            boolean r4 = r8.f62981e
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0076
            si0.y r4 = r8.f62979c
            if (r4 == 0) goto L_0x002a
            si0.f r5 = r8.f62978b
            si0.y r5 = r5.f62946b
            if (r4 != r5) goto L_0x002b
            int r4 = r8.f62980d
            mf0.C24362h.m61208c(r5)
            int r5 = r5.f62992b
            if (r4 != r5) goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            if (r0 == 0) goto L_0x006a
            if (r3 != 0) goto L_0x0030
            return r1
        L_0x0030:
            si0.i r0 = r8.f62983g
            long r1 = r8.f62982f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo61427t0(r1)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            si0.y r0 = r8.f62979c
            if (r0 != 0) goto L_0x0050
            si0.f r0 = r8.f62978b
            si0.y r0 = r0.f62946b
            if (r0 == 0) goto L_0x0050
            r8.f62979c = r0
            int r0 = r0.f62992b
            r8.f62980d = r0
        L_0x0050:
            si0.f r0 = r8.f62978b
            long r0 = r0.f62947c
            long r2 = r8.f62982f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            si0.f r2 = r8.f62978b
            long r4 = r8.f62982f
            r3 = r9
            r6 = r10
            r2.mo61426t(r3, r4, r6)
            long r0 = r8.f62982f
            long r0 = r0 + r10
            r8.f62982f = r0
            return r10
        L_0x006a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0076:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0082:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = p001a0.C0016g.m29l(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.C24916v.mo53601m(si0.f, long):long");
    }
}
