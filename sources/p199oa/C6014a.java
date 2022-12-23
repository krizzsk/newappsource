package p199oa;

import java.io.IOException;
import p173ma.C5722a;
import p173ma.C5732e;
import p173ma.C5740l;
import p173ma.C5744o;
import p277ub.C6803r;

/* renamed from: oa.a */
public final class C6014a extends C5722a {

    /* renamed from: oa.a$a */
    public static final class C6015a implements C5722a.C5728f {

        /* renamed from: a */
        public final C5744o f19215a;

        /* renamed from: b */
        public final int f19216b;

        /* renamed from: c */
        public final C5740l.C5741a f19217c = new C5740l.C5741a();

        public C6015a(C5744o oVar, int i) {
            this.f19215a = oVar;
            this.f19216b = i;
        }

        /* renamed from: a */
        public final C5722a.C5727e mo21572a(C5732e eVar, long j) throws IOException {
            C5732e eVar2 = eVar;
            long j2 = eVar2.f18591d;
            long c = mo22017c(eVar);
            long f = eVar.mo21577f();
            eVar2.mo21584k(Math.max(6, this.f19215a.f18604c), false);
            long c2 = mo22017c(eVar);
            long f2 = eVar.mo21577f();
            if (c <= j && c2 > j) {
                return C5722a.C5727e.m14085a(f);
            }
            if (c2 <= j) {
                return new C5722a.C5727e(-2, c2, f2);
            }
            return new C5722a.C5727e(-1, c, j2);
        }

        /* renamed from: b */
        public final /* synthetic */ void mo21573b() {
        }

        /* renamed from: c */
        public final long mo22017c(C5732e eVar) throws IOException {
            boolean z;
            C5732e eVar2 = eVar;
            while (eVar.mo21577f() < eVar2.f18590c - 6) {
                C5744o oVar = this.f19215a;
                int i = this.f19216b;
                C5740l.C5741a aVar = this.f19217c;
                long f = eVar.mo21577f();
                int i2 = 2;
                byte[] bArr = new byte[2];
                eVar2.mo21583j(0, 2, bArr, false);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                    eVar2.f18593f = 0;
                    eVar2.mo21584k((int) (f - eVar2.f18591d), false);
                    z = false;
                } else {
                    C6803r rVar = new C6803r(16);
                    System.arraycopy(bArr, 0, rVar.f21038a, 0, 2);
                    byte[] bArr2 = rVar.f21038a;
                    int i3 = 0;
                    for (int i4 = 14; i3 < i4; i4 = 14) {
                        int m = eVar2.mo21586m(i2 + i3, 14 - i3, bArr2);
                        if (m == -1) {
                            break;
                        }
                        i3 += m;
                        i2 = 2;
                    }
                    rVar.mo23006y(i3);
                    eVar2.f18593f = 0;
                    eVar2.mo21584k((int) (f - eVar2.f18591d), false);
                    z = C5740l.m14135a(rVar, oVar, i, aVar);
                }
                if (z) {
                    break;
                }
                eVar2.mo21584k(1, false);
            }
            long f2 = eVar.mo21577f();
            long j = eVar2.f18590c;
            if (f2 < j - 6) {
                return this.f19217c.f18599a;
            }
            eVar2.mo21584k((int) (j - eVar.mo21577f()), false);
            return this.f19215a.f18611j;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6014a(p173ma.C5744o r15, int r16, long r17, long r19) {
        /*
            r14 = this;
            r0 = r15
            java.util.Objects.requireNonNull(r15)
            ba.g r1 = new ba.g
            r2 = 3
            r1.<init>(r15, r2)
            oa.a$a r2 = new oa.a$a
            r3 = r16
            r2.<init>(r15, r3)
            long r3 = r15.mo21597c()
            long r5 = r0.f18611j
            int r7 = r0.f18605d
            if (r7 <= 0) goto L_0x0026
            long r7 = (long) r7
            int r9 = r0.f18604c
            long r9 = (long) r9
            long r7 = r7 + r9
            r9 = 2
            long r7 = r7 / r9
            r9 = 1
            goto L_0x0041
        L_0x0026:
            int r7 = r0.f18602a
            int r8 = r0.f18603b
            if (r7 != r8) goto L_0x0030
            if (r7 <= 0) goto L_0x0030
            long r7 = (long) r7
            goto L_0x0032
        L_0x0030:
            r7 = 4096(0x1000, double:2.0237E-320)
        L_0x0032:
            int r9 = r0.f18608g
            long r9 = (long) r9
            long r7 = r7 * r9
            int r9 = r0.f18609h
            long r9 = (long) r9
            long r7 = r7 * r9
            r9 = 8
            long r7 = r7 / r9
            r9 = 64
        L_0x0041:
            long r11 = r7 + r9
            r7 = 6
            int r0 = r0.f18604c
            int r13 = java.lang.Math.max(r7, r0)
            r0 = r14
            r7 = r17
            r9 = r19
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p199oa.C6014a.<init>(ma.o, int, long, long):void");
    }
}
