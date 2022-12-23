package p289va;

import android.util.SparseArray;
import java.io.IOException;
import p173ma.C5732e;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p277ub.C6802q;
import p277ub.C6803r;
import p277ub.C6812y;

/* renamed from: va.w */
public final class C6927w implements C5735h {

    /* renamed from: a */
    public final C6812y f21573a = new C6812y(0);

    /* renamed from: b */
    public final SparseArray<C6928a> f21574b = new SparseArray<>();

    /* renamed from: c */
    public final C6803r f21575c = new C6803r(4096);

    /* renamed from: d */
    public final C6926v f21576d = new C6926v();

    /* renamed from: e */
    public boolean f21577e;

    /* renamed from: f */
    public boolean f21578f;

    /* renamed from: g */
    public boolean f21579g;

    /* renamed from: h */
    public long f21580h;

    /* renamed from: i */
    public C6924u f21581i;

    /* renamed from: j */
    public C5737j f21582j;

    /* renamed from: k */
    public boolean f21583k;

    /* renamed from: va.w$a */
    public static final class C6928a {

        /* renamed from: a */
        public final C6907j f21584a;

        /* renamed from: b */
        public final C6812y f21585b;

        /* renamed from: c */
        public final C6802q f21586c = new C6802q(new byte[64], 64);

        /* renamed from: d */
        public boolean f21587d;

        /* renamed from: e */
        public boolean f21588e;

        /* renamed from: f */
        public boolean f21589f;

        /* renamed from: g */
        public long f21590g;

        public C6928a(C6907j jVar, C6812y yVar) {
            this.f21584a = jVar;
            this.f21585b = yVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        if (r3 != r9) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004a A[LOOP:0: B:34:0x0042->B:36:0x004a, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21592a(long r7, long r9) {
        /*
            r6 = this;
            ub.y r7 = r6.f21573a
            long r7 = r7.mo23034c()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = 0
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x0012
            r7 = 1
            goto L_0x0013
        L_0x0012:
            r7 = 0
        L_0x0013:
            if (r7 != 0) goto L_0x0032
            ub.y r7 = r6.f21573a
            monitor-enter(r7)
            long r3 = r7.f21069a     // Catch:{ all -> 0x002f }
            monitor-exit(r7)
            r7 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x003a
            ub.y r7 = r6.f21573a
            monitor-enter(r7)
            long r3 = r7.f21069a     // Catch:{ all -> 0x002c }
            monitor-exit(r7)
            int r7 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x003a
            goto L_0x0032
        L_0x002c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x002f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x0032:
            ub.y r7 = r6.f21573a
            monitor-enter(r7)
            r7.f21069a = r9     // Catch:{ all -> 0x005d }
            r7.f21071c = r0     // Catch:{ all -> 0x005d }
            monitor-exit(r7)
        L_0x003a:
            va.u r7 = r6.f21581i
            if (r7 == 0) goto L_0x0041
            r7.mo21568c(r9)
        L_0x0041:
            r7 = 0
        L_0x0042:
            android.util.SparseArray<va.w$a> r8 = r6.f21574b
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x005c
            android.util.SparseArray<va.w$a> r8 = r6.f21574b
            java.lang.Object r8 = r8.valueAt(r7)
            va.w$a r8 = (p289va.C6927w.C6928a) r8
            r8.f21589f = r2
            va.j r8 = r8.f21584a
            r8.mo23140c()
            int r7 = r7 + 1
            goto L_0x0042
        L_0x005c:
            return
        L_0x005d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6927w.mo21592a(long, long):void");
    }

    /* renamed from: b */
    public final boolean mo21593b(C5736i iVar) throws IOException {
        byte[] bArr = new byte[14];
        C5732e eVar = (C5732e) iVar;
        eVar.mo21583j(0, 14, bArr, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        eVar.mo21584k(bArr[13] & 7, false);
        eVar.mo21583j(0, 3, bArr, false);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f21582j = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01fa  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo21595h(p173ma.C5736i r18, p173ma.C5749s r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            ma.j r2 = r0.f21582j
            p583jk.C17875h.m44306q(r2)
            r2 = r18
            ma.e r2 = (p173ma.C5732e) r2
            long r9 = r2.f18590c
            r11 = -1
            r13 = 1
            r14 = 0
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x0019
            r3 = 1
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 442(0x1ba, float:6.2E-43)
            if (r3 == 0) goto L_0x00ef
            va.v r3 = r0.f21576d
            boolean r6 = r3.f21567c
            if (r6 != 0) goto L_0x00ef
            boolean r6 = r3.f21569e
            r11 = 20000(0x4e20, double:9.8813E-320)
            if (r6 != 0) goto L_0x0077
            long r11 = java.lang.Math.min(r11, r9)
            int r6 = (int) r11
            long r11 = (long) r6
            long r9 = r9 - r11
            long r11 = r2.f18591d
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0040
            r1.f18624a = r9
            goto L_0x00ce
        L_0x0040:
            ub.r r1 = r3.f21566b
            r1.mo23004w(r6)
            r2.f18593f = r14
            ub.r r1 = r3.f21566b
            byte[] r1 = r1.f21038a
            r2.mo21583j(r14, r6, r1, r14)
            ub.r r1 = r3.f21566b
            int r2 = r1.f21039b
            int r6 = r1.f21040c
            int r6 = r6 + -4
        L_0x0056:
            if (r6 < r2) goto L_0x0072
            byte[] r8 = r1.f21038a
            int r8 = p289va.C6926v.m16339b(r6, r8)
            if (r8 != r7) goto L_0x006f
            int r8 = r6 + 4
            r1.mo23007z(r8)
            long r8 = p289va.C6926v.m16340c(r1)
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x006f
            r4 = r8
            goto L_0x0072
        L_0x006f:
            int r6 = r6 + -1
            goto L_0x0056
        L_0x0072:
            r3.f21571g = r4
            r3.f21569e = r13
            goto L_0x00cd
        L_0x0077:
            long r7 = r3.f21571g
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0082
            r3.mo23168a(r2)
            goto L_0x00ee
        L_0x0082:
            boolean r6 = r3.f21568d
            if (r6 != 0) goto L_0x00d0
            long r6 = java.lang.Math.min(r11, r9)
            int r7 = (int) r6
            long r8 = r2.f18591d
            long r10 = (long) r14
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0095
            r1.f18624a = r10
            goto L_0x00ce
        L_0x0095:
            ub.r r1 = r3.f21566b
            r1.mo23004w(r7)
            r2.f18593f = r14
            ub.r r1 = r3.f21566b
            byte[] r1 = r1.f21038a
            r2.mo21583j(r14, r7, r1, r14)
            ub.r r1 = r3.f21566b
            int r2 = r1.f21039b
            int r6 = r1.f21040c
        L_0x00a9:
            int r7 = r6 + -3
            if (r2 >= r7) goto L_0x00c9
            byte[] r7 = r1.f21038a
            int r7 = p289va.C6926v.m16339b(r2, r7)
            r8 = 442(0x1ba, float:6.2E-43)
            if (r7 != r8) goto L_0x00c6
            int r7 = r2 + 4
            r1.mo23007z(r7)
            long r9 = p289va.C6926v.m16340c(r1)
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x00c6
            r4 = r9
            goto L_0x00c9
        L_0x00c6:
            int r2 = r2 + 1
            goto L_0x00a9
        L_0x00c9:
            r3.f21570f = r4
            r3.f21568d = r13
        L_0x00cd:
            r13 = 0
        L_0x00ce:
            r14 = r13
            goto L_0x00ee
        L_0x00d0:
            long r6 = r3.f21570f
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x00da
            r3.mo23168a(r2)
            goto L_0x00ee
        L_0x00da:
            ub.y r1 = r3.f21565a
            long r4 = r1.mo23033b(r6)
            ub.y r1 = r3.f21565a
            long r6 = r3.f21571g
            long r6 = r1.mo23033b(r6)
            long r6 = r6 - r4
            r3.f21572h = r6
            r3.mo23168a(r2)
        L_0x00ee:
            return r14
        L_0x00ef:
            r8 = 442(0x1ba, float:6.2E-43)
            boolean r3 = r0.f21583k
            if (r3 != 0) goto L_0x011e
            r0.f21583k = r13
            va.v r3 = r0.f21576d
            long r6 = r3.f21572h
            int r16 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x0114
            va.u r5 = new va.u
            ub.y r4 = r3.f21565a
            r3 = r5
            r13 = r5
            r5 = r6
            r7 = r9
            r3.<init>(r4, r5, r7)
            r0.f21581i = r13
            ma.j r3 = r0.f21582j
            ma.a$a r4 = r13.f18553a
            r3.mo20707k(r4)
            goto L_0x011e
        L_0x0114:
            ma.j r3 = r0.f21582j
            ma.t$b r4 = new ma.t$b
            r4.<init>(r6)
            r3.mo20707k(r4)
        L_0x011e:
            va.u r3 = r0.f21581i
            if (r3 == 0) goto L_0x0130
            ma.a$c r4 = r3.f18555c
            if (r4 == 0) goto L_0x0128
            r4 = 1
            goto L_0x0129
        L_0x0128:
            r4 = 0
        L_0x0129:
            if (r4 == 0) goto L_0x0130
            int r1 = r3.mo21567a(r2, r1)
            return r1
        L_0x0130:
            r2.f18593f = r14
            if (r15 == 0) goto L_0x013a
            long r3 = r2.mo21577f()
            long r9 = r9 - r3
            goto L_0x013b
        L_0x013a:
            r9 = r11
        L_0x013b:
            r1 = -1
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x0147
            r3 = 4
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0147
            return r1
        L_0x0147:
            ub.r r3 = r0.f21575c
            byte[] r3 = r3.f21038a
            r4 = 4
            r5 = 1
            boolean r3 = r2.mo21583j(r14, r4, r3, r5)
            if (r3 != 0) goto L_0x0154
            return r1
        L_0x0154:
            ub.r r3 = r0.f21575c
            r3.mo23007z(r14)
            ub.r r3 = r0.f21575c
            int r3 = r3.mo22984c()
            r5 = 441(0x1b9, float:6.18E-43)
            if (r3 != r5) goto L_0x0164
            return r1
        L_0x0164:
            r1 = 442(0x1ba, float:6.2E-43)
            if (r3 != r1) goto L_0x0186
            ub.r r1 = r0.f21575c
            byte[] r1 = r1.f21038a
            r3 = 10
            r2.mo21583j(r14, r3, r1, r14)
            ub.r r1 = r0.f21575c
            r3 = 9
            r1.mo23007z(r3)
            ub.r r1 = r0.f21575c
            int r1 = r1.mo22997p()
            r1 = r1 & 7
            int r1 = r1 + 14
            r2.mo21582i(r1)
            return r14
        L_0x0186:
            r1 = 443(0x1bb, float:6.21E-43)
            r5 = 2
            r6 = 6
            if (r3 != r1) goto L_0x01a3
            ub.r r1 = r0.f21575c
            byte[] r1 = r1.f21038a
            r2.mo21583j(r14, r5, r1, r14)
            ub.r r1 = r0.f21575c
            r1.mo23007z(r14)
            ub.r r1 = r0.f21575c
            int r1 = r1.mo23002u()
            int r1 = r1 + r6
            r2.mo21582i(r1)
            return r14
        L_0x01a3:
            r1 = r3 & -256(0xffffffffffffff00, float:NaN)
            r7 = 8
            int r1 = r1 >> r7
            r8 = 1
            if (r1 == r8) goto L_0x01af
            r2.mo21582i(r8)
            return r14
        L_0x01af:
            r1 = r3 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<va.w$a> r3 = r0.f21574b
            java.lang.Object r3 = r3.get(r1)
            va.w$a r3 = (p289va.C6927w.C6928a) r3
            boolean r8 = r0.f21577e
            if (r8 != 0) goto L_0x0231
            if (r3 != 0) goto L_0x0212
            r8 = 189(0xbd, float:2.65E-43)
            r9 = 0
            if (r1 != r8) goto L_0x01d2
            va.b r8 = new va.b
            r8.<init>(r9)
            r9 = 1
            r0.f21578f = r9
            long r9 = r2.f18591d
            r0.f21580h = r9
        L_0x01d0:
            r9 = r8
            goto L_0x01f8
        L_0x01d2:
            r8 = r1 & 224(0xe0, float:3.14E-43)
            r10 = 192(0xc0, float:2.69E-43)
            if (r8 != r10) goto L_0x01e5
            va.q r8 = new va.q
            r8.<init>(r9)
            r9 = 1
            r0.f21578f = r9
            long r9 = r2.f18591d
            r0.f21580h = r9
            goto L_0x01d0
        L_0x01e5:
            r8 = r1 & 240(0xf0, float:3.36E-43)
            r10 = 224(0xe0, float:3.14E-43)
            if (r8 != r10) goto L_0x01f8
            va.k r8 = new va.k
            r8.<init>(r9)
            r9 = 1
            r0.f21579g = r9
            long r9 = r2.f18591d
            r0.f21580h = r9
            goto L_0x01d0
        L_0x01f8:
            if (r9 == 0) goto L_0x0212
            va.d0$d r3 = new va.d0$d
            r8 = 256(0x100, float:3.59E-43)
            r3.<init>(r1, r8)
            ma.j r8 = r0.f21582j
            r9.mo23143f(r8, r3)
            va.w$a r3 = new va.w$a
            ub.y r8 = r0.f21573a
            r3.<init>(r9, r8)
            android.util.SparseArray<va.w$a> r8 = r0.f21574b
            r8.put(r1, r3)
        L_0x0212:
            boolean r1 = r0.f21578f
            if (r1 == 0) goto L_0x0220
            boolean r1 = r0.f21579g
            if (r1 == 0) goto L_0x0220
            long r8 = r0.f21580h
            r10 = 8192(0x2000, double:4.0474E-320)
            long r8 = r8 + r10
            goto L_0x0223
        L_0x0220:
            r8 = 1048576(0x100000, double:5.180654E-318)
        L_0x0223:
            long r10 = r2.f18591d
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0231
            r1 = 1
            r0.f21577e = r1
            ma.j r1 = r0.f21582j
            r1.mo20708n()
        L_0x0231:
            ub.r r1 = r0.f21575c
            byte[] r1 = r1.f21038a
            r2.mo21583j(r14, r5, r1, r14)
            ub.r r1 = r0.f21575c
            r1.mo23007z(r14)
            ub.r r1 = r0.f21575c
            int r1 = r1.mo23002u()
            int r1 = r1 + r6
            if (r3 != 0) goto L_0x024b
            r2.mo21582i(r1)
            goto L_0x032f
        L_0x024b:
            ub.r r5 = r0.f21575c
            r5.mo23004w(r1)
            ub.r r5 = r0.f21575c
            byte[] r5 = r5.f21038a
            r2.mo21581h(r14, r1, r5, r14)
            ub.r r1 = r0.f21575c
            r1.mo23007z(r6)
            ub.r r1 = r0.f21575c
            ub.q r2 = r3.f21586c
            byte[] r2 = r2.f21034a
            r5 = 3
            r1.mo22983b(r14, r5, r2)
            ub.q r2 = r3.f21586c
            r2.mo22977j(r14)
            ub.q r2 = r3.f21586c
            r2.mo22979l(r7)
            ub.q r2 = r3.f21586c
            boolean r2 = r2.mo22972e()
            r3.f21587d = r2
            ub.q r2 = r3.f21586c
            boolean r2 = r2.mo22972e()
            r3.f21588e = r2
            ub.q r2 = r3.f21586c
            r2.mo22979l(r6)
            ub.q r2 = r3.f21586c
            int r2 = r2.mo22973f(r7)
            ub.q r6 = r3.f21586c
            byte[] r6 = r6.f21034a
            r1.mo22983b(r14, r2, r6)
            ub.q r2 = r3.f21586c
            r2.mo22977j(r14)
            r6 = 0
            r3.f21590g = r6
            boolean r2 = r3.f21587d
            if (r2 == 0) goto L_0x0316
            ub.q r2 = r3.f21586c
            r2.mo22979l(r4)
            ub.q r2 = r3.f21586c
            int r2 = r2.mo22973f(r5)
            long r6 = (long) r2
            r2 = 30
            long r6 = r6 << r2
            ub.q r8 = r3.f21586c
            r9 = 1
            r8.mo22979l(r9)
            ub.q r8 = r3.f21586c
            r10 = 15
            int r8 = r8.mo22973f(r10)
            int r8 = r8 << r10
            long r11 = (long) r8
            long r6 = r6 | r11
            ub.q r8 = r3.f21586c
            r8.mo22979l(r9)
            ub.q r8 = r3.f21586c
            int r8 = r8.mo22973f(r10)
            long r11 = (long) r8
            long r6 = r6 | r11
            ub.q r8 = r3.f21586c
            r8.mo22979l(r9)
            boolean r8 = r3.f21589f
            if (r8 != 0) goto L_0x030e
            boolean r8 = r3.f21588e
            if (r8 == 0) goto L_0x030e
            ub.q r8 = r3.f21586c
            r8.mo22979l(r4)
            ub.q r8 = r3.f21586c
            int r5 = r8.mo22973f(r5)
            long r8 = (long) r5
            long r8 = r8 << r2
            ub.q r2 = r3.f21586c
            r5 = 1
            r2.mo22979l(r5)
            ub.q r2 = r3.f21586c
            int r2 = r2.mo22973f(r10)
            int r2 = r2 << r10
            long r11 = (long) r2
            long r8 = r8 | r11
            ub.q r2 = r3.f21586c
            r2.mo22979l(r5)
            ub.q r2 = r3.f21586c
            int r2 = r2.mo22973f(r10)
            long r10 = (long) r2
            long r8 = r8 | r10
            ub.q r2 = r3.f21586c
            r2.mo22979l(r5)
            ub.y r2 = r3.f21585b
            r2.mo23033b(r8)
            r3.f21589f = r5
        L_0x030e:
            ub.y r2 = r3.f21585b
            long r5 = r2.mo23033b(r6)
            r3.f21590g = r5
        L_0x0316:
            va.j r2 = r3.f21584a
            long r5 = r3.f21590g
            r2.mo23142e(r4, r5)
            va.j r2 = r3.f21584a
            r2.mo23139b(r1)
            va.j r1 = r3.f21584a
            r1.mo23141d()
            ub.r r1 = r0.f21575c
            byte[] r2 = r1.f21038a
            int r2 = r2.length
            r1.mo23006y(r2)
        L_0x032f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6927w.mo21595h(ma.i, ma.s):int");
    }

    public final void release() {
    }
}
