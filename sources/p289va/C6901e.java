package p289va;

import java.io.IOException;
import p173ma.C5732e;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p173ma.C5749s;
import p173ma.C5750t;
import p277ub.C6802q;
import p277ub.C6803r;
import p289va.C6896d0;
import p583jk.C17875h;

/* renamed from: va.e */
public final class C6901e implements C5735h {

    /* renamed from: a */
    public final C6903f f21328a = new C6903f(true, (String) null);

    /* renamed from: b */
    public final C6803r f21329b = new C6803r(2048);

    /* renamed from: c */
    public final C6803r f21330c;

    /* renamed from: d */
    public final C6802q f21331d;

    /* renamed from: e */
    public C5737j f21332e;

    /* renamed from: f */
    public long f21333f;

    /* renamed from: g */
    public long f21334g = -1;

    /* renamed from: h */
    public boolean f21335h;

    /* renamed from: i */
    public boolean f21336i;

    public C6901e() {
        C6803r rVar = new C6803r(10);
        this.f21330c = rVar;
        byte[] bArr = rVar.f21038a;
        this.f21331d = new C6802q(bArr, bArr.length);
    }

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        this.f21335h = false;
        C6903f fVar = this.f21328a;
        fVar.f21351l = false;
        fVar.f21347h = 0;
        fVar.f21348i = 0;
        fVar.f21349j = 256;
        this.f21333f = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r9.f18593f = 0;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        if ((r2 - r1) < 8192) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21593b(p173ma.C5736i r9) throws java.io.IOException {
        /*
            r8 = this;
            ma.e r9 = (p173ma.C5732e) r9
            r0 = 0
            r1 = 0
        L_0x0004:
            ub.r r2 = r8.f21330c
            byte[] r2 = r2.f21038a
            r3 = 10
            r9.mo21583j(r0, r3, r2, r0)
            ub.r r2 = r8.f21330c
            r2.mo23007z(r0)
            ub.r r2 = r8.f21330c
            int r2 = r2.mo22999r()
            r3 = 4801587(0x494433, float:6.728456E-39)
            if (r2 == r3) goto L_0x008a
            r9.f18593f = r0
            r9.mo21584k(r1, r0)
            long r2 = r8.f21334g
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x002d
            long r2 = (long) r1
            r8.f21334g = r2
        L_0x002d:
            r2 = r1
        L_0x002e:
            r3 = 0
            r4 = 0
        L_0x0030:
            ub.r r5 = r8.f21330c
            byte[] r5 = r5.f21038a
            r6 = 2
            r9.mo21583j(r0, r6, r5, r0)
            ub.r r5 = r8.f21330c
            r5.mo23007z(r0)
            ub.r r5 = r8.f21330c
            int r5 = r5.mo23002u()
            r6 = 65526(0xfff6, float:9.1821E-41)
            r5 = r5 & r6
            r6 = 65520(0xfff0, float:9.1813E-41)
            r7 = 1
            if (r5 != r6) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            if (r5 != 0) goto L_0x0060
            r9.f18593f = r0
            int r2 = r2 + r7
            int r3 = r2 - r1
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r3 < r4) goto L_0x005c
            return r0
        L_0x005c:
            r9.mo21584k(r2, r0)
            goto L_0x002e
        L_0x0060:
            int r3 = r3 + r7
            r5 = 4
            if (r3 < r5) goto L_0x0069
            r6 = 188(0xbc, float:2.63E-43)
            if (r4 <= r6) goto L_0x0069
            return r7
        L_0x0069:
            ub.r r6 = r8.f21330c
            byte[] r6 = r6.f21038a
            r9.mo21583j(r0, r5, r6, r0)
            ub.q r5 = r8.f21331d
            r6 = 14
            r5.mo22977j(r6)
            ub.q r5 = r8.f21331d
            r6 = 13
            int r5 = r5.mo22973f(r6)
            r6 = 6
            if (r5 > r6) goto L_0x0083
            return r0
        L_0x0083:
            int r6 = r5 + -6
            r9.mo21584k(r6, r0)
            int r4 = r4 + r5
            goto L_0x0030
        L_0x008a:
            ub.r r2 = r8.f21330c
            r3 = 3
            r2.mo22981A(r3)
            ub.r r2 = r8.f21330c
            int r2 = r2.mo22996o()
            int r3 = r2 + 10
            int r1 = r1 + r3
            r9.mo21584k(r2, r0)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6901e.mo21593b(ma.i):boolean");
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f21332e = jVar;
        this.f21328a.mo23143f(jVar, new C6896d0.C6900d(0, 1));
        jVar.mo20708n();
    }

    /* renamed from: h */
    public final int mo21595h(C5736i iVar, C5749s sVar) throws IOException {
        boolean z;
        C17875h.m44306q(this.f21332e);
        int read = ((C5732e) iVar).read(this.f21329b.f21038a, 0, 2048);
        if (read == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f21336i) {
            this.f21332e.mo20707k(new C5750t.C5752b(-9223372036854775807L));
            this.f21336i = true;
        }
        if (z) {
            return -1;
        }
        this.f21329b.mo23007z(0);
        this.f21329b.mo23006y(read);
        if (!this.f21335h) {
            this.f21328a.f21358s = this.f21333f;
            this.f21335h = true;
        }
        this.f21328a.mo23139b(this.f21329b);
        return 0;
    }

    public final void release() {
    }
}
