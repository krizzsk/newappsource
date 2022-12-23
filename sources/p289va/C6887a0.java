package p289va;

import java.io.IOException;
import p173ma.C5722a;
import p173ma.C5732e;
import p277ub.C6774a0;
import p277ub.C6803r;
import p277ub.C6812y;
import p389bl.C13641g;

/* renamed from: va.a0 */
public final class C6887a0 extends C5722a {

    /* renamed from: va.a0$a */
    public static final class C6888a implements C5722a.C5728f {

        /* renamed from: a */
        public final C6812y f21251a;

        /* renamed from: b */
        public final C6803r f21252b = new C6803r();

        /* renamed from: c */
        public final int f21253c;

        /* renamed from: d */
        public final int f21254d;

        public C6888a(int i, C6812y yVar, int i2) {
            this.f21253c = i;
            this.f21251a = yVar;
            this.f21254d = i2;
        }

        /* renamed from: a */
        public final C5722a.C5727e mo21572a(C5732e eVar, long j) throws IOException {
            C5732e eVar2 = eVar;
            long j2 = eVar2.f18591d;
            int min = (int) Math.min((long) this.f21254d, eVar2.f18590c - j2);
            this.f21252b.mo23004w(min);
            eVar2.mo21583j(0, min, this.f21252b.f21038a, false);
            C6803r rVar = this.f21252b;
            int i = rVar.f21040c;
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (true) {
                int i2 = rVar.f21040c;
                int i3 = rVar.f21039b;
                if (i2 - i3 < 188) {
                    break;
                }
                byte[] bArr = rVar.f21038a;
                while (i3 < i && bArr[i3] != 71) {
                    i3++;
                }
                int i4 = i3 + 188;
                if (i4 > i) {
                    break;
                }
                long x = C13641g.m34135x(rVar, i3, this.f21253c);
                if (x != -9223372036854775807L) {
                    long b = this.f21251a.mo23033b(x);
                    if (b > j) {
                        if (j5 == -9223372036854775807L) {
                            return new C5722a.C5727e(-1, b, j2);
                        }
                        return C5722a.C5727e.m14085a(j2 + j4);
                    } else if (100000 + b > j) {
                        return C5722a.C5727e.m14085a(j2 + ((long) i3));
                    } else {
                        j5 = b;
                        j4 = (long) i3;
                    }
                }
                rVar.mo23007z(i4);
                j3 = (long) i4;
            }
            if (j5 != -9223372036854775807L) {
                return new C5722a.C5727e(-2, j5, j2 + j3);
            }
            return C5722a.C5727e.f18572d;
        }

        /* renamed from: b */
        public final void mo21573b() {
            C6803r rVar = this.f21252b;
            byte[] bArr = C6774a0.f20964f;
            rVar.getClass();
            rVar.mo23005x(bArr.length, bArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6887a0(C6812y yVar, long j, long j2, int i, int i2) {
        super(new C5722a.C5724b(), new C6888a(i, yVar, i2), j, j + 1, 0, j2, 188, 940);
        C6812y yVar2 = yVar;
    }
}
