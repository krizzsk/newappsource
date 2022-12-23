package p289va;

import java.io.IOException;
import p173ma.C5732e;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p173ma.C5749s;
import p173ma.C5750t;
import p277ub.C6803r;
import p289va.C6896d0;
import p988j$.util.Spliterator;

/* renamed from: va.c */
public final class C6891c implements C5735h {

    /* renamed from: a */
    public final C6895d f21276a = new C6895d((String) null);

    /* renamed from: b */
    public final C6803r f21277b = new C6803r((int) Spliterator.SUBSIZED);

    /* renamed from: c */
    public boolean f21278c;

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        this.f21278c = false;
        this.f21276a.mo23140c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        r5.f18593f = 0;
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if ((r4 - r3) < 8192) goto L_0x0047;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21593b(p173ma.C5736i r15) throws java.io.IOException {
        /*
            r14 = this;
            ub.r r0 = new ub.r
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f21038a
            r5 = r15
            ma.e r5 = (p173ma.C5732e) r5
            r5.mo21583j(r2, r1, r4, r2)
            r0.mo23007z(r2)
            int r4 = r0.mo22999r()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L_0x008e
            r5.f18593f = r2
            r5.mo21584k(r3, r2)
            r4 = r3
        L_0x0024:
            r15 = 0
        L_0x0025:
            byte[] r1 = r0.f21038a
            r6 = 7
            r5.mo21583j(r2, r6, r1, r2)
            r0.mo23007z(r2)
            int r1 = r0.mo23002u()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            r10 = 1
            if (r1 == r8) goto L_0x004b
            if (r1 == r9) goto L_0x004b
            r5.f18593f = r2
            int r4 = r4 + r10
            int r15 = r4 - r3
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r15 < r1) goto L_0x0047
            return r2
        L_0x0047:
            r5.mo21584k(r4, r2)
            goto L_0x0024
        L_0x004b:
            int r15 = r15 + r10
            r8 = 4
            if (r15 < r8) goto L_0x0050
            return r10
        L_0x0050:
            byte[] r10 = r0.f21038a
            int r11 = r10.length
            r12 = -1
            if (r11 >= r6) goto L_0x0058
            r11 = -1
            goto L_0x0085
        L_0x0058:
            r11 = 2
            byte r11 = r10[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            byte r13 = r10[r7]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L_0x007f
            byte r8 = r10[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 16
            r11 = 5
            byte r11 = r10[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r8 = r8 | r11
            r11 = 6
            byte r10 = r10[r11]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = r8 | r10
            goto L_0x0080
        L_0x007f:
            r6 = 4
        L_0x0080:
            if (r1 != r9) goto L_0x0084
            int r6 = r6 + 2
        L_0x0084:
            int r11 = r11 + r6
        L_0x0085:
            if (r11 != r12) goto L_0x0088
            return r2
        L_0x0088:
            int r11 = r11 + -7
            r5.mo21584k(r11, r2)
            goto L_0x0025
        L_0x008e:
            r0.mo22981A(r7)
            int r4 = r0.mo22996o()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo21584k(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6891c.mo21593b(ma.i):boolean");
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f21276a.mo23143f(jVar, new C6896d0.C6900d(0, 1));
        jVar.mo20708n();
        jVar.mo20707k(new C5750t.C5752b(-9223372036854775807L));
    }

    /* renamed from: h */
    public final int mo21595h(C5736i iVar, C5749s sVar) throws IOException {
        int read = ((C5732e) iVar).read(this.f21277b.f21038a, 0, Spliterator.SUBSIZED);
        if (read == -1) {
            return -1;
        }
        this.f21277b.mo23007z(0);
        this.f21277b.mo23006y(read);
        if (!this.f21278c) {
            this.f21276a.f21317m = 0;
            this.f21278c = true;
        }
        this.f21276a.mo23139b(this.f21277b);
        return 0;
    }

    public final void release() {
    }
}
