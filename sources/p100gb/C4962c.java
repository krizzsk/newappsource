package p100gb;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import p099ga.C4862b1;
import p100gb.C4984m;
import p277ub.C6774a0;
import p431cy.C16525b;
import p583jk.C17875h;

/* renamed from: gb.c */
public final class C4962c implements C4984m, C4984m.C4985a {

    /* renamed from: b */
    public final C4984m f16782b;

    /* renamed from: c */
    public C4984m.C4985a f16783c;

    /* renamed from: d */
    public C4963a[] f16784d = new C4963a[0];

    /* renamed from: e */
    public long f16785e = 0;

    /* renamed from: f */
    public long f16786f = 0;

    /* renamed from: g */
    public long f16787g;

    /* renamed from: gb.c$a */
    public final class C4963a implements C4961b0 {

        /* renamed from: b */
        public final C4961b0 f16788b;

        /* renamed from: c */
        public boolean f16789c;

        public C4963a(C4961b0 b0Var) {
            this.f16788b = b0Var;
        }

        /* renamed from: a */
        public final void mo20648a() throws IOException {
            this.f16788b.mo20648a();
        }

        /* renamed from: b */
        public final int mo20649b(C16525b bVar, DecoderInputBuffer decoderInputBuffer, int i) {
            if (C4962c.this.mo20659j()) {
                return -3;
            }
            if (this.f16789c) {
                decoderInputBuffer.f17757b = 4;
                return -4;
            }
            int b = this.f16788b.mo20649b(bVar, decoderInputBuffer, i);
            if (b == -5) {
                Format format = (Format) bVar.f43144b;
                format.getClass();
                int i2 = format.f13402C;
                if (!(i2 == 0 && format.f13403D == 0)) {
                    C4962c cVar = C4962c.this;
                    int i3 = 0;
                    if (cVar.f16786f != 0) {
                        i2 = 0;
                    }
                    if (cVar.f16787g == Long.MIN_VALUE) {
                        i3 = format.f13403D;
                    }
                    Format.C3872b bVar2 = new Format.C3872b(format);
                    bVar2.f13432A = i2;
                    bVar2.f13433B = i3;
                    bVar.f43144b = new Format(bVar2);
                }
                return -5;
            }
            C4962c cVar2 = C4962c.this;
            long j = cVar2.f16787g;
            if (j == Long.MIN_VALUE || ((b != -4 || decoderInputBuffer.f13649f < j) && (b != -3 || cVar2.mo20663q() != Long.MIN_VALUE || decoderInputBuffer.f13648e))) {
                return b;
            }
            decoderInputBuffer.mo15948h();
            decoderInputBuffer.f17757b = 4;
            this.f16789c = true;
            return -4;
        }

        /* renamed from: c */
        public final int mo20650c(long j) {
            if (C4962c.this.mo20659j()) {
                return -3;
            }
            return this.f16788b.mo20650c(j);
        }

        public final boolean isReady() {
            return !C4962c.this.mo20659j() && this.f16788b.isReady();
        }
    }

    public C4962c(C4979j jVar, long j) {
        this.f16782b = jVar;
        this.f16787g = j;
    }

    /* renamed from: a */
    public final void mo20498a(C4964c0 c0Var) {
        C4984m mVar = (C4984m) c0Var;
        C4984m.C4985a aVar = this.f16783c;
        aVar.getClass();
        aVar.mo20498a(this);
    }

    /* renamed from: b */
    public final long mo20652b() {
        long b = this.f16782b.mo20652b();
        if (b != Long.MIN_VALUE) {
            long j = this.f16787g;
            if (j == Long.MIN_VALUE || b < j) {
                return b;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: c */
    public final void mo20653c(C4984m.C4985a aVar, long j) {
        this.f16783c = aVar;
        this.f16782b.mo20653c(this, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        if (r1 > r5) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo20654d(com.google.android.exoplayer2.trackselection.C3997b[] r16, boolean[] r17, p100gb.C4961b0[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            gb.c$a[] r1 = new p100gb.C4962c.C4963a[r1]
            r0.f16784d = r1
            int r1 = r9.length
            gb.b0[] r10 = new p100gb.C4961b0[r1]
            r11 = 0
            r1 = 0
        L_0x000f:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L_0x0024
            gb.c$a[] r2 = r0.f16784d
            r3 = r9[r1]
            gb.c$a r3 = (p100gb.C4962c.C4963a) r3
            r2[r1] = r3
            if (r3 == 0) goto L_0x001f
            gb.b0 r12 = r3.f16788b
        L_0x001f:
            r10[r1] = r12
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0024:
            gb.m r1 = r0.f16782b
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.mo20654d(r2, r3, r4, r5, r6)
            boolean r3 = r15.mo20659j()
            r4 = 1
            if (r3 == 0) goto L_0x0066
            long r5 = r0.f16786f
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0066
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0061
            int r3 = r8.length
            r5 = 0
        L_0x0048:
            if (r5 >= r3) goto L_0x0061
            r6 = r8[r5]
            if (r6 == 0) goto L_0x005e
            com.google.android.exoplayer2.Format r6 = r6.mo16339k()
            java.lang.String r7 = r6.f13418m
            java.lang.String r6 = r6.f13415j
            boolean r6 = p277ub.C6792n.m15988a(r7, r6)
            if (r6 != 0) goto L_0x005e
            r3 = 1
            goto L_0x0062
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x0048
        L_0x0061:
            r3 = 0
        L_0x0062:
            if (r3 == 0) goto L_0x0066
            r5 = r1
            goto L_0x006b
        L_0x0066:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x006b:
            r0.f16785e = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x0085
            long r5 = r0.f16786f
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0084
            long r5 = r0.f16787g
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0085
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            p583jk.C17875h.m44304o(r4)
        L_0x0088:
            int r3 = r9.length
            if (r11 >= r3) goto L_0x00ae
            r3 = r10[r11]
            if (r3 != 0) goto L_0x0094
            gb.c$a[] r3 = r0.f16784d
            r3[r11] = r12
            goto L_0x00a5
        L_0x0094:
            gb.c$a[] r4 = r0.f16784d
            r5 = r4[r11]
            if (r5 == 0) goto L_0x009e
            gb.b0 r5 = r5.f16788b
            if (r5 == r3) goto L_0x00a5
        L_0x009e:
            gb.c$a r5 = new gb.c$a
            r5.<init>(r3)
            r4[r11] = r5
        L_0x00a5:
            gb.c$a[] r3 = r0.f16784d
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L_0x0088
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p100gb.C4962c.mo20654d(com.google.android.exoplayer2.trackselection.b[], boolean[], gb.b0[], boolean[], long):long");
    }

    /* renamed from: e */
    public final void mo20506e(C4984m mVar) {
        C4984m.C4985a aVar = this.f16783c;
        aVar.getClass();
        aVar.mo20506e(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 > r7) goto L_0x0034;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo20655f(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f16785e = r0
            gb.c$a[] r0 = r6.f16784d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0017
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0014
            r4.f16789c = r2
        L_0x0014:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0017:
            gb.m r0 = r6.f16782b
            long r0 = r0.mo20655f(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0033
            long r7 = r6.f16786f
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0034
            long r7 = r6.f16787g
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0033
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0034
        L_0x0033:
            r2 = 1
        L_0x0034:
            p583jk.C17875h.m44304o(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p100gb.C4962c.mo20655f(long):long");
    }

    /* renamed from: g */
    public final long mo20656g(long j, C4862b1 b1Var) {
        long j2;
        long j3 = this.f16786f;
        if (j == j3) {
            return j3;
        }
        long h = C6774a0.m15948h(b1Var.f16297a, 0, j - j3);
        long j4 = b1Var.f16298b;
        long j5 = this.f16787g;
        if (j5 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j5 - j;
        }
        long h2 = C6774a0.m15948h(j4, 0, j2);
        if (!(h == b1Var.f16297a && h2 == b1Var.f16298b)) {
            b1Var = new C4862b1(h, h2);
        }
        return this.f16782b.mo20656g(j, b1Var);
    }

    /* renamed from: h */
    public final boolean mo20657h() {
        return this.f16782b.mo20657h();
    }

    /* renamed from: i */
    public final long mo20658i() {
        boolean z;
        if (mo20659j()) {
            long j = this.f16785e;
            this.f16785e = -9223372036854775807L;
            long i = mo20658i();
            if (i != -9223372036854775807L) {
                return i;
            }
            return j;
        }
        long i2 = this.f16782b.mo20658i();
        if (i2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z2 = true;
        if (i2 >= this.f16786f) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        long j2 = this.f16787g;
        if (j2 != Long.MIN_VALUE && i2 > j2) {
            z2 = false;
        }
        C17875h.m44304o(z2);
        return i2;
    }

    /* renamed from: j */
    public final boolean mo20659j() {
        return this.f16785e != -9223372036854775807L;
    }

    /* renamed from: l */
    public final void mo20660l() throws IOException {
        this.f16782b.mo20660l();
    }

    /* renamed from: m */
    public final boolean mo20661m(long j) {
        return this.f16782b.mo20661m(j);
    }

    /* renamed from: o */
    public final TrackGroupArray mo20662o() {
        return this.f16782b.mo20662o();
    }

    /* renamed from: q */
    public final long mo20663q() {
        long q = this.f16782b.mo20663q();
        if (q != Long.MIN_VALUE) {
            long j = this.f16787g;
            if (j == Long.MIN_VALUE || q < j) {
                return q;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: r */
    public final void mo20664r(long j, boolean z) {
        this.f16782b.mo20664r(j, z);
    }

    /* renamed from: s */
    public final void mo20665s(long j) {
        this.f16782b.mo20665s(j);
    }
}
