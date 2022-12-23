package p289va;

import java.io.IOException;
import p173ma.C5722a;
import p173ma.C5732e;
import p277ub.C6774a0;
import p277ub.C6803r;
import p277ub.C6812y;

/* renamed from: va.u */
public final class C6924u extends C5722a {

    /* renamed from: va.u$a */
    public static final class C6925a implements C5722a.C5728f {

        /* renamed from: a */
        public final C6812y f21563a;

        /* renamed from: b */
        public final C6803r f21564b = new C6803r();

        public C6925a(C6812y yVar) {
            this.f21563a = yVar;
        }

        /* renamed from: a */
        public final C5722a.C5727e mo21572a(C5732e eVar, long j) throws IOException {
            int d;
            C5732e eVar2 = eVar;
            long j2 = eVar2.f18591d;
            int min = (int) Math.min(20000, eVar2.f18590c - j2);
            this.f21564b.mo23004w(min);
            eVar2.mo21583j(0, min, this.f21564b.f21038a, false);
            C6803r rVar = this.f21564b;
            int i = -1;
            long j3 = -9223372036854775807L;
            int i2 = -1;
            while (true) {
                int i3 = rVar.f21040c;
                int i4 = rVar.f21039b;
                if (i3 - i4 >= 4) {
                    if (C6924u.m16336d(i4, rVar.f21038a) != 442) {
                        rVar.mo22981A(1);
                    } else {
                        rVar.mo22981A(4);
                        long c = C6926v.m16340c(rVar);
                        if (c != -9223372036854775807L) {
                            long b = this.f21563a.mo23033b(c);
                            if (b > j) {
                                if (j3 == -9223372036854775807L) {
                                    return new C5722a.C5727e(-1, b, j2);
                                }
                                return C5722a.C5727e.m14085a(j2 + ((long) i2));
                            } else if (100000 + b > j) {
                                return C5722a.C5727e.m14085a(j2 + ((long) rVar.f21039b));
                            } else {
                                i2 = rVar.f21039b;
                                j3 = b;
                            }
                        }
                        int i5 = rVar.f21040c;
                        if (i5 - rVar.f21039b >= 10) {
                            rVar.mo22981A(9);
                            int p = rVar.mo22997p() & 7;
                            if (rVar.f21040c - rVar.f21039b >= p) {
                                rVar.mo22981A(p);
                                int i6 = rVar.f21040c;
                                int i7 = rVar.f21039b;
                                if (i6 - i7 >= 4) {
                                    if (C6924u.m16336d(i7, rVar.f21038a) == 443) {
                                        rVar.mo22981A(4);
                                        int u = rVar.mo23002u();
                                        if (rVar.f21040c - rVar.f21039b < u) {
                                            rVar.mo23007z(i5);
                                        } else {
                                            rVar.mo22981A(u);
                                        }
                                    }
                                    while (true) {
                                        int i8 = rVar.f21040c;
                                        int i9 = rVar.f21039b;
                                        if (i8 - i9 < 4 || (d = C6924u.m16336d(i9, rVar.f21038a)) == 442 || d == 441 || (d >>> 8) != 1) {
                                            break;
                                        }
                                        rVar.mo22981A(4);
                                        if (rVar.f21040c - rVar.f21039b < 2) {
                                            rVar.mo23007z(i5);
                                            break;
                                        }
                                        rVar.mo23007z(Math.min(rVar.f21040c, rVar.f21039b + rVar.mo23002u()));
                                    }
                                } else {
                                    rVar.mo23007z(i5);
                                }
                            } else {
                                rVar.mo23007z(i5);
                            }
                        } else {
                            rVar.mo23007z(i5);
                        }
                        i = rVar.f21039b;
                    }
                } else if (j3 != -9223372036854775807L) {
                    return new C5722a.C5727e(-2, j3, j2 + ((long) i));
                } else {
                    return C5722a.C5727e.f18572d;
                }
            }
        }

        /* renamed from: b */
        public final void mo21573b() {
            C6803r rVar = this.f21564b;
            byte[] bArr = C6774a0.f20964f;
            rVar.getClass();
            rVar.mo23005x(bArr.length, bArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6924u(C6812y yVar, long j, long j2) {
        super(new C5722a.C5724b(), new C6925a(yVar), j, j + 1, 0, j2, 188, 1000);
        C6812y yVar2 = yVar;
    }

    /* renamed from: d */
    public static int m16336d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
