package p100gb;

import p173ma.C5732e;
import p173ma.C5735h;
import p173ma.C5739k;

/* renamed from: gb.b */
public final class C4960b implements C4999w {

    /* renamed from: a */
    public final C5739k f16779a;

    /* renamed from: b */
    public C5735h f16780b;

    /* renamed from: c */
    public C5732e f16781c;

    public C4960b(C5739k kVar) {
        this.f16779a = kVar;
    }

    /* renamed from: a */
    public final long mo20646a() {
        C5732e eVar = this.f16781c;
        if (eVar != null) {
            return eVar.f18591d;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r0.f18591d != r11) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        if (r0.f18591d != r11) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
        r1 = false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20647b(p265tb.C6654g r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, p173ma.C5737j r15) throws java.io.IOException {
        /*
            r7 = this;
            ma.e r6 = new ma.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f16781c = r6
            ma.h r8 = r7.f16780b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            ma.k r8 = r7.f16779a
            ma.h[] r8 = r8.mo252b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0021
            r8 = r8[r13]
            r7.f16780b = r8
            goto L_0x00b8
        L_0x0021:
            int r10 = r8.length
            r0 = 0
        L_0x0023:
            if (r0 >= r10) goto L_0x0067
            r1 = r8[r0]
            boolean r2 = r1.mo21593b(r6)     // Catch:{ EOFException -> 0x0050, all -> 0x003d }
            if (r2 == 0) goto L_0x0032
            r7.f16780b = r1     // Catch:{ EOFException -> 0x0050, all -> 0x003d }
            r6.f18593f = r13
            goto L_0x0067
        L_0x0032:
            ma.h r1 = r7.f16780b
            if (r1 != 0) goto L_0x005e
            long r1 = r6.f18591d
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x005c
            goto L_0x005e
        L_0x003d:
            r8 = move-exception
            ma.h r9 = r7.f16780b
            if (r9 != 0) goto L_0x004a
            long r9 = r6.f18591d
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r14 = 0
        L_0x004a:
            p583jk.C17875h.m44304o(r14)
            r6.f18593f = r13
            throw r8
        L_0x0050:
            ma.h r1 = r7.f16780b
            if (r1 != 0) goto L_0x005e
            long r1 = r6.f18591d
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r1 = 0
            goto L_0x005f
        L_0x005e:
            r1 = 1
        L_0x005f:
            p583jk.C17875h.m44304o(r1)
            r6.f18593f = r13
            int r0 = r0 + 1
            goto L_0x0023
        L_0x0067:
            ma.h r10 = r7.f16780b
            if (r10 != 0) goto L_0x00b8
            com.google.android.exoplayer2.source.UnrecognizedInputFormatException r10 = new com.google.android.exoplayer2.source.UnrecognizedInputFormatException
            int r11 = p277ub.C6774a0.f20959a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L_0x0074:
            int r12 = r8.length
            if (r13 >= r12) goto L_0x0091
            r12 = r8[r13]
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r11.append(r12)
            int r12 = r8.length
            int r12 = r12 + -1
            if (r13 >= r12) goto L_0x008e
            java.lang.String r12 = ", "
            r11.append(r12)
        L_0x008e:
            int r13 = r13 + 1
            goto L_0x0074
        L_0x0091:
            java.lang.String r8 = r11.toString()
            r11 = 58
            int r11 = p001a0.C0016g.m25h(r8, r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            r12.append(r11)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r9.getClass()
            r10.<init>(r8, r9)
            throw r10
        L_0x00b8:
            ma.h r8 = r7.f16780b
            r8.mo21594g(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p100gb.C4960b.mo20647b(tb.g, android.net.Uri, java.util.Map, long, long, ma.j):void");
    }
}
