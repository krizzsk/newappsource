package p289va;

import p173ma.C5732e;
import p277ub.C6774a0;
import p277ub.C6803r;
import p277ub.C6812y;

/* renamed from: va.v */
public final class C6926v {

    /* renamed from: a */
    public final C6812y f21565a = new C6812y(0);

    /* renamed from: b */
    public final C6803r f21566b = new C6803r();

    /* renamed from: c */
    public boolean f21567c;

    /* renamed from: d */
    public boolean f21568d;

    /* renamed from: e */
    public boolean f21569e;

    /* renamed from: f */
    public long f21570f = -9223372036854775807L;

    /* renamed from: g */
    public long f21571g = -9223372036854775807L;

    /* renamed from: h */
    public long f21572h = -9223372036854775807L;

    /* renamed from: b */
    public static int m16339b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: c */
    public static long m16340c(C6803r rVar) {
        C6803r rVar2 = rVar;
        int i = rVar2.f21039b;
        if (rVar2.f21040c - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        boolean z = false;
        rVar2.mo22983b(0, 9, bArr);
        rVar2.mo23007z(i);
        byte b = bArr[0];
        if ((b & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z = true;
        }
        if (!z) {
            return -9223372036854775807L;
        }
        long j = (long) b;
        long j2 = ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20);
        long j3 = (long) bArr[2];
        return j2 | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: a */
    public final void mo23168a(C5732e eVar) {
        C6803r rVar = this.f21566b;
        byte[] bArr = C6774a0.f20964f;
        rVar.getClass();
        rVar.mo23005x(bArr.length, bArr);
        this.f21567c = true;
        eVar.f18593f = 0;
    }
}
