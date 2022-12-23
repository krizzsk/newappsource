package p276ua;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.Arrays;
import p173ma.C5732e;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p173ma.C5757x;
import p277ub.C6774a0;
import p277ub.C6803r;

/* renamed from: ua.c */
public final class C6763c implements C5735h {

    /* renamed from: a */
    public C5737j f20917a;

    /* renamed from: b */
    public C6768h f20918b;

    /* renamed from: c */
    public boolean f20919c;

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        C6768h hVar = this.f20918b;
        if (hVar != null) {
            C6764d dVar = hVar.f20934a;
            C6765e eVar = dVar.f20920a;
            eVar.f20925a = 0;
            eVar.f20926b = 0;
            eVar.f20927c = 0;
            eVar.f20928d = 0;
            eVar.f20929e = 0;
            dVar.f20921b.mo23004w(0);
            dVar.f20922c = -1;
            dVar.f20924e = false;
            if (j == 0) {
                hVar.mo22936d(!hVar.f20945l);
            } else if (hVar.f20941h != 0) {
                long j3 = (((long) hVar.f20942i) * j2) / 1000000;
                hVar.f20938e = j3;
                C6766f fVar = hVar.f20937d;
                int i = C6774a0.f20959a;
                fVar.mo22933c(j3);
                hVar.f20941h = 2;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo21593b(C5736i iVar) throws IOException {
        try {
            return mo22937c((C5732e) iVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo22937c(C5732e eVar) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        C6765e eVar2 = new C6765e();
        if (eVar2.mo22939a(eVar, true) && (eVar2.f20925a & 2) == 2) {
            int min = Math.min(eVar2.f20929e, 8);
            C6803r rVar = new C6803r(min);
            eVar.mo21583j(0, min, rVar.f21038a, false);
            rVar.mo23007z(0);
            if (rVar.f21040c - rVar.f21039b >= 5 && rVar.mo22997p() == 127 && rVar.mo22998q() == 1179402563) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f20918b = new C6761b();
            } else {
                rVar.mo23007z(0);
                try {
                    z2 = C5757x.m14169b(1, rVar, true);
                } catch (ParserException unused) {
                    z2 = false;
                }
                if (z2) {
                    this.f20918b = new C6771i();
                } else {
                    rVar.mo23007z(0);
                    int i = rVar.f21040c - rVar.f21039b;
                    byte[] bArr = C6767g.f20932o;
                    if (i < 8) {
                        z3 = false;
                    } else {
                        byte[] bArr2 = new byte[8];
                        rVar.mo22983b(0, 8, bArr2);
                        z3 = Arrays.equals(bArr2, bArr);
                    }
                    if (z3) {
                        this.f20918b = new C6767g();
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f20917a = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0181  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo21595h(p173ma.C5736i r21, p173ma.C5749s r22) throws java.io.IOException {
        /*
            r20 = this;
            r0 = r20
            ma.j r1 = r0.f20917a
            p583jk.C17875h.m44306q(r1)
            ua.h r1 = r0.f20918b
            r2 = 0
            if (r1 != 0) goto L_0x0021
            r1 = r21
            ma.e r1 = (p173ma.C5732e) r1
            boolean r3 = r0.mo22937c(r1)
            if (r3 == 0) goto L_0x0019
            r1.f18593f = r2
            goto L_0x0021
        L_0x0019:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Failed to determine bitstream type"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0021:
            boolean r1 = r0.f20919c
            r3 = 1
            if (r1 != 0) goto L_0x003e
            ma.j r1 = r0.f20917a
            ma.v r1 = r1.mo20709p(r2, r3)
            ma.j r4 = r0.f20917a
            r4.mo20708n()
            ua.h r4 = r0.f20918b
            ma.j r5 = r0.f20917a
            r4.f20936c = r5
            r4.f20935b = r1
            r4.mo22936d(r3)
            r0.f20919c = r3
        L_0x003e:
            ua.h r1 = r0.f20918b
            ma.v r4 = r1.f20935b
            p583jk.C17875h.m44306q(r4)
            int r4 = p277ub.C6774a0.f20959a
            int r4 = r1.f20941h
            r5 = -1
            r7 = 3
            r14 = 2
            if (r4 == 0) goto L_0x00f5
            if (r4 == r3) goto L_0x00e7
            if (r4 == r14) goto L_0x005d
            if (r4 != r7) goto L_0x0057
            goto L_0x0120
        L_0x0057:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x005d:
            ua.f r4 = r1.f20937d
            r8 = r21
            ma.e r8 = (p173ma.C5732e) r8
            long r9 = r4.mo22932b(r8)
            r11 = 0
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x0074
            r4 = r22
            r4.f18624a = r9
            r2 = 1
            goto L_0x0193
        L_0x0074:
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x007f
            r13 = 2
            long r9 = r9 + r13
            long r9 = -r9
            r1.mo22941a(r9)
        L_0x007f:
            boolean r4 = r1.f20945l
            if (r4 != 0) goto L_0x0093
            ua.f r4 = r1.f20937d
            ma.t r4 = r4.mo22931a()
            p583jk.C17875h.m44306q(r4)
            ma.j r9 = r1.f20936c
            r9.mo20707k(r4)
            r1.f20945l = r3
        L_0x0093:
            long r3 = r1.f20944k
            int r9 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r9 > 0) goto L_0x00a6
            ua.d r3 = r1.f20934a
            boolean r3 = r3.mo22938a(r8)
            if (r3 == 0) goto L_0x00a2
            goto L_0x00a6
        L_0x00a2:
            r1.f20941h = r7
            goto L_0x0120
        L_0x00a6:
            r1.f20944k = r11
            ua.d r3 = r1.f20934a
            ub.r r3 = r3.f20921b
            long r7 = r1.mo22934b(r3)
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x00e0
            long r9 = r1.f20940g
            long r11 = r9 + r7
            long r13 = r1.f20938e
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 < 0) goto L_0x00e0
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 * r11
            int r4 = r1.f20942i
            long r11 = (long) r4
            long r14 = r9 / r11
            ma.v r4 = r1.f20935b
            int r9 = r3.f21040c
            r4.mo20631b(r9, r3)
            ma.v r13 = r1.f20935b
            r16 = 1
            int r3 = r3.f21040c
            r18 = 0
            r19 = 0
            r17 = r3
            r13.mo20633d(r14, r16, r17, r18, r19)
            r1.f20938e = r5
        L_0x00e0:
            long r3 = r1.f20940g
            long r3 = r3 + r7
            r1.f20940g = r3
            goto L_0x0192
        L_0x00e7:
            long r3 = r1.f20939f
            int r4 = (int) r3
            r3 = r21
            ma.e r3 = (p173ma.C5732e) r3
            r3.mo21582i(r4)
            r1.f20941h = r14
            goto L_0x0192
        L_0x00f5:
            ua.d r4 = r1.f20934a
            r8 = r21
            ma.e r8 = (p173ma.C5732e) r8
            boolean r4 = r4.mo22938a(r8)
            if (r4 != 0) goto L_0x0105
            r1.f20941h = r7
            r4 = 0
            goto L_0x011e
        L_0x0105:
            long r9 = r8.f18591d
            long r11 = r1.f20939f
            long r9 = r9 - r11
            r1.f20944k = r9
            ua.d r4 = r1.f20934a
            ub.r r4 = r4.f20921b
            ua.h$a r9 = r1.f20943j
            boolean r4 = r1.mo22935c(r4, r11, r9)
            if (r4 == 0) goto L_0x011d
            long r8 = r8.f18591d
            r1.f20939f = r8
            goto L_0x00f5
        L_0x011d:
            r4 = 1
        L_0x011e:
            if (r4 != 0) goto L_0x0123
        L_0x0120:
            r2 = -1
            goto L_0x0193
        L_0x0123:
            ua.h$a r4 = r1.f20943j
            com.google.android.exoplayer2.Format r4 = r4.f20947a
            int r7 = r4.f13400A
            r1.f20942i = r7
            boolean r7 = r1.f20946m
            if (r7 != 0) goto L_0x0136
            ma.v r7 = r1.f20935b
            r7.mo20632c(r4)
            r1.f20946m = r3
        L_0x0136:
            ua.h$a r4 = r1.f20943j
            ua.b$a r4 = r4.f20948b
            if (r4 == 0) goto L_0x013f
            r1.f20937d = r4
            goto L_0x014c
        L_0x013f:
            long r10 = r8.f18590c
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x014e
            ua.h$b r3 = new ua.h$b
            r3.<init>()
            r1.f20937d = r3
        L_0x014c:
            r2 = 2
            goto L_0x0172
        L_0x014e:
            ua.d r4 = r1.f20934a
            ua.e r4 = r4.f20920a
            int r5 = r4.f20925a
            r5 = r5 & 4
            if (r5 == 0) goto L_0x015b
            r16 = 1
            goto L_0x015d
        L_0x015b:
            r16 = 0
        L_0x015d:
            ua.a r3 = new ua.a
            long r8 = r1.f20939f
            int r5 = r4.f20928d
            int r6 = r4.f20929e
            int r5 = r5 + r6
            long r12 = (long) r5
            long r4 = r4.f20926b
            r6 = r3
            r7 = r1
            r2 = 2
            r14 = r4
            r6.<init>(r7, r8, r10, r12, r14, r16)
            r1.f20937d = r3
        L_0x0172:
            r1.f20941h = r2
            ua.d r1 = r1.f20934a
            ub.r r2 = r1.f20921b
            byte[] r3 = r2.f21038a
            int r4 = r3.length
            r5 = 65025(0xfe01, float:9.112E-41)
            if (r4 != r5) goto L_0x0181
            goto L_0x0192
        L_0x0181:
            int r4 = r2.f21040c
            int r4 = java.lang.Math.max(r5, r4)
            byte[] r3 = java.util.Arrays.copyOf(r3, r4)
            ub.r r1 = r1.f20921b
            int r1 = r1.f21040c
            r2.mo23005x(r1, r3)
        L_0x0192:
            r2 = 0
        L_0x0193:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p276ua.C6763c.mo21595h(ma.i, ma.s):int");
    }

    public final void release() {
    }
}
