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

/* renamed from: va.a */
public final class C6886a implements C5735h {

    /* renamed from: a */
    public final C6889b f21248a = new C6889b((String) null);

    /* renamed from: b */
    public final C6803r f21249b = new C6803r(2786);

    /* renamed from: c */
    public boolean f21250c;

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        this.f21250c = false;
        this.f21248a.mo23140c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r5.f18593f = 0;
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        if ((r4 - r3) < 8192) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21593b(p173ma.C5736i r14) throws java.io.IOException {
        /*
            r13 = this;
            ub.r r0 = new ub.r
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f21038a
            r5 = r14
            ma.e r5 = (p173ma.C5732e) r5
            r5.mo21583j(r2, r1, r4, r2)
            r0.mo23007z(r2)
            int r4 = r0.mo22999r()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L_0x0084
            r5.f18593f = r2
            r5.mo21584k(r3, r2)
            r4 = r3
        L_0x0024:
            r14 = 0
        L_0x0025:
            byte[] r6 = r0.f21038a
            r8 = 6
            r5.mo21583j(r2, r8, r6, r2)
            r0.mo23007z(r2)
            int r6 = r0.mo23002u()
            r9 = 2935(0xb77, float:4.113E-42)
            r10 = 1
            if (r6 == r9) goto L_0x0045
            r5.f18593f = r2
            int r4 = r4 + r10
            int r14 = r4 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r14 < r6) goto L_0x0041
            return r2
        L_0x0041:
            r5.mo21584k(r4, r2)
            goto L_0x0024
        L_0x0045:
            int r14 = r14 + r10
            r6 = 4
            if (r14 < r6) goto L_0x004a
            return r10
        L_0x004a:
            byte[] r9 = r0.f21038a
            int r11 = r9.length
            r12 = -1
            if (r11 >= r8) goto L_0x0052
            r8 = -1
            goto L_0x007b
        L_0x0052:
            r11 = 5
            byte r11 = r9[r11]
            r11 = r11 & 248(0xf8, float:3.48E-43)
            int r11 = r11 >> r7
            if (r11 <= r1) goto L_0x005c
            r11 = 1
            goto L_0x005d
        L_0x005c:
            r11 = 0
        L_0x005d:
            if (r11 == 0) goto L_0x006f
            r6 = 2
            byte r8 = r9[r6]
            r8 = r8 & 7
            int r8 = r8 << 8
            byte r9 = r9[r7]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r8 = r8 | r9
            int r8 = r8 + r10
            int r8 = r8 * 2
            goto L_0x007b
        L_0x006f:
            byte r6 = r9[r6]
            r9 = r6 & 192(0xc0, float:2.69E-43)
            int r8 = r9 >> 6
            r6 = r6 & 63
            int r8 = p125ia.C5313b.m13353a(r8, r6)
        L_0x007b:
            if (r8 != r12) goto L_0x007e
            return r2
        L_0x007e:
            int r8 = r8 + -6
            r5.mo21584k(r8, r2)
            goto L_0x0025
        L_0x0084:
            r0.mo22981A(r7)
            int r4 = r0.mo22996o()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo21584k(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6886a.mo21593b(ma.i):boolean");
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f21248a.mo23143f(jVar, new C6896d0.C6900d(0, 1));
        jVar.mo20708n();
        jVar.mo20707k(new C5750t.C5752b(-9223372036854775807L));
    }

    /* renamed from: h */
    public final int mo21595h(C5736i iVar, C5749s sVar) throws IOException {
        int read = ((C5732e) iVar).read(this.f21249b.f21038a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f21249b.mo23007z(0);
        this.f21249b.mo23006y(read);
        if (!this.f21250c) {
            this.f21248a.f21266l = 0;
            this.f21250c = true;
        }
        this.f21248a.mo23139b(this.f21249b);
        return 0;
    }

    public final void release() {
    }
}
