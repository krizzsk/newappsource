package p302wa;

import java.io.IOException;
import p173ma.C5732e;
import p277ub.C6774a0;
import p277ub.C6803r;
import p583jk.C17875h;

/* renamed from: wa.c */
public final class C7009c {

    /* renamed from: wa.c$a */
    public static final class C7010a {

        /* renamed from: a */
        public final int f21812a;

        /* renamed from: b */
        public final long f21813b;

        public C7010a(int i, long j) {
            this.f21812a = i;
            this.f21813b = j;
        }

        /* renamed from: a */
        public static C7010a m16496a(C5732e eVar, C6803r rVar) throws IOException {
            eVar.mo21583j(0, 8, rVar.f21038a, false);
            rVar.mo23007z(0);
            return new C7010a(rVar.mo22984c(), rVar.mo22988g());
        }
    }

    /* renamed from: a */
    public static C7008b m16495a(C5732e eVar) throws IOException {
        boolean z;
        byte[] bArr;
        C6803r rVar = new C6803r(16);
        if (C7010a.m16496a(eVar, rVar).f21812a != 1380533830) {
            return null;
        }
        eVar.mo21583j(0, 4, rVar.f21038a, false);
        rVar.mo23007z(0);
        if (rVar.mo22984c() != 1463899717) {
            return null;
        }
        C7010a a = C7010a.m16496a(eVar, rVar);
        while (a.f21812a != 1718449184) {
            eVar.mo21584k((int) a.f21813b, false);
            a = C7010a.m16496a(eVar, rVar);
        }
        if (a.f21813b >= 16) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        eVar.mo21583j(0, 16, rVar.f21038a, false);
        rVar.mo23007z(0);
        int i = rVar.mo22990i();
        int i2 = rVar.mo22990i();
        int h = rVar.mo22989h();
        rVar.mo22989h();
        int i3 = rVar.mo22990i();
        int i4 = rVar.mo22990i();
        int i5 = ((int) a.f21813b) - 16;
        if (i5 > 0) {
            byte[] bArr2 = new byte[i5];
            eVar.mo21583j(0, i5, bArr2, false);
            bArr = bArr2;
        } else {
            bArr = C6774a0.f20964f;
        }
        return new C7008b(i, i2, h, i3, i4, bArr);
    }
}
