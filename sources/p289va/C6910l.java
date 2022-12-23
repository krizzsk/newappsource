package p289va;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6795o;
import p277ub.C6803r;
import p289va.C6896d0;

/* renamed from: va.l */
public final class C6910l implements C6907j {

    /* renamed from: l */
    public static final float[] f21402l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    public final C6902e0 f21403a;

    /* renamed from: b */
    public final C6803r f21404b = new C6803r();

    /* renamed from: c */
    public final boolean[] f21405c = new boolean[4];

    /* renamed from: d */
    public final C6911a f21406d = new C6911a();

    /* renamed from: e */
    public final C6921r f21407e = new C6921r(178);

    /* renamed from: f */
    public C6912b f21408f;

    /* renamed from: g */
    public long f21409g;

    /* renamed from: h */
    public String f21410h;

    /* renamed from: i */
    public C5754v f21411i;

    /* renamed from: j */
    public boolean f21412j;

    /* renamed from: k */
    public long f21413k;

    /* renamed from: va.l$a */
    public static final class C6911a {

        /* renamed from: f */
        public static final byte[] f21414f = {0, 0, 1};

        /* renamed from: a */
        public boolean f21415a;

        /* renamed from: b */
        public int f21416b;

        /* renamed from: c */
        public int f21417c;

        /* renamed from: d */
        public int f21418d;

        /* renamed from: e */
        public byte[] f21419e = new byte[RecyclerView.C1119a0.FLAG_IGNORE];

        /* renamed from: a */
        public final void mo23159a(int i, int i2, byte[] bArr) {
            if (this.f21415a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f21419e;
                int length = bArr2.length;
                int i4 = this.f21417c;
                if (length < i4 + i3) {
                    this.f21419e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f21419e, this.f21417c, i3);
                this.f21417c += i3;
            }
        }
    }

    /* renamed from: va.l$b */
    public static final class C6912b {

        /* renamed from: a */
        public final C5754v f21420a;

        /* renamed from: b */
        public boolean f21421b;

        /* renamed from: c */
        public boolean f21422c;

        /* renamed from: d */
        public boolean f21423d;

        /* renamed from: e */
        public int f21424e;

        /* renamed from: f */
        public int f21425f;

        /* renamed from: g */
        public long f21426g;

        /* renamed from: h */
        public long f21427h;

        public C6912b(C5754v vVar) {
            this.f21420a = vVar;
        }

        /* renamed from: a */
        public final void mo23160a(int i, int i2, byte[] bArr) {
            boolean z;
            if (this.f21422c) {
                int i3 = this.f21425f;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    if (((bArr[i4] & 192) >> 6) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f21423d = z;
                    this.f21422c = false;
                    return;
                }
                this.f21425f = (i2 - i) + i3;
            }
        }
    }

    public C6910l(C6902e0 e0Var) {
        this.f21403a = e0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0174 A[LOOP:1: B:68:0x0172->B:69:0x0174, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x023b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23139b(p277ub.C6803r r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            va.l$b r2 = r0.f21408f
            p583jk.C17875h.m44306q(r2)
            ma.v r2 = r0.f21411i
            p583jk.C17875h.m44306q(r2)
            int r2 = r1.f21039b
            int r3 = r1.f21040c
            byte[] r4 = r1.f21038a
            long r5 = r0.f21409g
            int r7 = r3 - r2
            long r8 = (long) r7
            long r5 = r5 + r8
            r0.f21409g = r5
            ma.v r5 = r0.f21411i
            r5.mo20631b(r7, r1)
        L_0x0021:
            boolean[] r5 = r0.f21405c
            int r5 = p277ub.C6795o.m15999b(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x003f
            boolean r1 = r0.f21412j
            if (r1 != 0) goto L_0x0032
            va.l$a r1 = r0.f21406d
            r1.mo23159a(r2, r3, r4)
        L_0x0032:
            va.l$b r1 = r0.f21408f
            r1.mo23160a(r2, r3, r4)
            va.r r1 = r0.f21407e
            if (r1 == 0) goto L_0x003e
            r1.mo23163a(r2, r3, r4)
        L_0x003e:
            return
        L_0x003f:
            byte[] r6 = r1.f21038a
            int r7 = r5 + 3
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r8 = r5 - r2
            boolean r9 = r0.f21412j
            r11 = 1
            if (r9 != 0) goto L_0x01b5
            if (r8 <= 0) goto L_0x0055
            va.l$a r9 = r0.f21406d
            r9.mo23159a(r2, r5, r4)
        L_0x0055:
            if (r8 >= 0) goto L_0x0059
            int r9 = -r8
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            va.l$a r13 = r0.f21406d
            int r14 = r13.f21416b
            r12 = 3
            r10 = 2
            if (r14 == 0) goto L_0x00b5
            r15 = 181(0xb5, float:2.54E-43)
            if (r14 == r11) goto L_0x00a8
            if (r14 == r10) goto L_0x0099
            if (r14 == r12) goto L_0x0083
            r11 = 4
            if (r14 != r11) goto L_0x007d
            r11 = 179(0xb3, float:2.51E-43)
            if (r6 == r11) goto L_0x0073
            if (r6 != r15) goto L_0x00be
        L_0x0073:
            int r11 = r13.f21417c
            int r11 = r11 - r9
            r13.f21417c = r11
            r9 = 0
            r13.f21415a = r9
            r9 = 1
            goto L_0x00c5
        L_0x007d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0083:
            r9 = 0
            r11 = r6 & 240(0xf0, float:3.36E-43)
            r14 = 32
            if (r11 == r14) goto L_0x0091
            r13.f21415a = r9
            r13.f21417c = r9
            r13.f21416b = r9
            goto L_0x00be
        L_0x0091:
            int r11 = r13.f21417c
            r13.f21418d = r11
            r11 = 4
            r13.f21416b = r11
            goto L_0x00be
        L_0x0099:
            r9 = 0
            r11 = 31
            if (r6 <= r11) goto L_0x00a5
            r13.f21415a = r9
            r13.f21417c = r9
            r13.f21416b = r9
            goto L_0x00be
        L_0x00a5:
            r13.f21416b = r12
            goto L_0x00be
        L_0x00a8:
            r9 = 0
            if (r6 == r15) goto L_0x00b2
            r13.f21415a = r9
            r13.f21417c = r9
            r13.f21416b = r9
            goto L_0x00be
        L_0x00b2:
            r13.f21416b = r10
            goto L_0x00be
        L_0x00b5:
            r9 = 176(0xb0, float:2.47E-43)
            if (r6 != r9) goto L_0x00be
            r9 = 1
            r13.f21416b = r9
            r13.f21415a = r9
        L_0x00be:
            byte[] r9 = p289va.C6910l.C6911a.f21414f
            r11 = 0
            r13.mo23159a(r11, r12, r9)
            r9 = 0
        L_0x00c5:
            if (r9 == 0) goto L_0x01b5
            ma.v r9 = r0.f21411i
            va.l$a r11 = r0.f21406d
            int r13 = r11.f21418d
            java.lang.String r14 = r0.f21410h
            r14.getClass()
            byte[] r15 = r11.f21419e
            int r11 = r11.f21417c
            byte[] r11 = java.util.Arrays.copyOf(r15, r11)
            ub.q r15 = new ub.q
            int r10 = r11.length
            r15.<init>(r11, r10)
            r15.mo22980m(r13)
            r10 = 4
            r15.mo22980m(r10)
            r15.mo22978k()
            r13 = 8
            r15.mo22979l(r13)
            boolean r16 = r15.mo22972e()
            if (r16 == 0) goto L_0x00fb
            r15.mo22979l(r10)
            r15.mo22979l(r12)
        L_0x00fb:
            int r10 = r15.mo22973f(r10)
            r12 = 15
            if (r10 != r12) goto L_0x0112
            int r10 = r15.mo22973f(r13)
            int r13 = r15.mo22973f(r13)
            if (r13 != 0) goto L_0x010e
            goto L_0x011a
        L_0x010e:
            float r10 = (float) r10
            float r13 = (float) r13
            float r10 = r10 / r13
            goto L_0x011c
        L_0x0112:
            float[] r13 = f21402l
            r12 = 7
            if (r10 >= r12) goto L_0x011a
            r10 = r13[r10]
            goto L_0x011c
        L_0x011a:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x011c:
            boolean r12 = r15.mo22972e()
            if (r12 == 0) goto L_0x0156
            r12 = 2
            r15.mo22979l(r12)
            r12 = 1
            r15.mo22979l(r12)
            boolean r12 = r15.mo22972e()
            if (r12 == 0) goto L_0x0156
            r12 = 15
            r15.mo22979l(r12)
            r15.mo22978k()
            r15.mo22979l(r12)
            r15.mo22978k()
            r15.mo22979l(r12)
            r15.mo22978k()
            r13 = 3
            r15.mo22979l(r13)
            r13 = 11
            r15.mo22979l(r13)
            r15.mo22978k()
            r15.mo22979l(r12)
            r15.mo22978k()
        L_0x0156:
            r12 = 2
            r15.mo22973f(r12)
            r15.mo22978k()
            r12 = 16
            int r12 = r15.mo22973f(r12)
            r15.mo22978k()
            boolean r13 = r15.mo22972e()
            if (r13 == 0) goto L_0x017c
            if (r12 != 0) goto L_0x016f
            goto L_0x017c
        L_0x016f:
            int r12 = r12 + -1
            r13 = 0
        L_0x0172:
            if (r12 <= 0) goto L_0x0179
            int r13 = r13 + 1
            int r12 = r12 >> 1
            goto L_0x0172
        L_0x0179:
            r15.mo22979l(r13)
        L_0x017c:
            r15.mo22978k()
            r12 = 13
            int r13 = r15.mo22973f(r12)
            r15.mo22978k()
            int r12 = r15.mo22973f(r12)
            r15.mo22978k()
            r15.mo22978k()
            com.google.android.exoplayer2.Format$b r15 = new com.google.android.exoplayer2.Format$b
            r15.<init>()
            r15.f13436a = r14
            java.lang.String r14 = "video/mp4v-es"
            r15.f13446k = r14
            r15.f13451p = r13
            r15.f13452q = r12
            r15.f13455t = r10
            java.util.List r10 = java.util.Collections.singletonList(r11)
            r15.f13448m = r10
            com.google.android.exoplayer2.Format r10 = new com.google.android.exoplayer2.Format
            r10.<init>((com.google.android.exoplayer2.Format.C3872b) r15)
            r9.mo20632c(r10)
            r9 = 1
            r0.f21412j = r9
        L_0x01b5:
            va.l$b r9 = r0.f21408f
            r9.mo23160a(r2, r5, r4)
            va.r r9 = r0.f21407e
            if (r9 == 0) goto L_0x01ff
            if (r8 <= 0) goto L_0x01c5
            r9.mo23163a(r2, r5, r4)
            r2 = 0
            goto L_0x01c6
        L_0x01c5:
            int r2 = -r8
        L_0x01c6:
            va.r r8 = r0.f21407e
            boolean r2 = r8.mo23164b(r2)
            if (r2 == 0) goto L_0x01ec
            va.r r2 = r0.f21407e
            byte[] r8 = r2.f21546d
            int r2 = r2.f21547e
            int r2 = p277ub.C6795o.m16002e(r2, r8)
            ub.r r8 = r0.f21404b
            int r9 = p277ub.C6774a0.f20959a
            va.r r9 = r0.f21407e
            byte[] r9 = r9.f21546d
            r8.mo23005x(r2, r9)
            va.e0 r2 = r0.f21403a
            long r8 = r0.f21413k
            ub.r r10 = r0.f21404b
            r2.mo23153a(r8, r10)
        L_0x01ec:
            r2 = 178(0xb2, float:2.5E-43)
            if (r6 != r2) goto L_0x01ff
            byte[] r2 = r1.f21038a
            int r8 = r5 + 2
            byte r2 = r2[r8]
            r9 = 1
            if (r2 != r9) goto L_0x0200
            va.r r2 = r0.f21407e
            r2.mo23166d(r6)
            goto L_0x0200
        L_0x01ff:
            r9 = 1
        L_0x0200:
            int r2 = r3 - r5
            long r10 = r0.f21409g
            long r12 = (long) r2
            long r10 = r10 - r12
            va.l$b r5 = r0.f21408f
            boolean r8 = r0.f21412j
            int r12 = r5.f21424e
            r13 = 182(0xb6, float:2.55E-43)
            if (r12 != r13) goto L_0x0233
            if (r8 == 0) goto L_0x0233
            boolean r8 = r5.f21421b
            if (r8 == 0) goto L_0x0233
            long r14 = r5.f21426g
            long r14 = r10 - r14
            int r8 = (int) r14
            boolean r12 = r5.f21423d
            ma.v r14 = r5.f21420a
            r23 = r10
            long r9 = r5.f21427h
            r22 = 0
            r16 = r14
            r17 = r9
            r19 = r12
            r20 = r8
            r21 = r2
            r16.mo20633d(r17, r19, r20, r21, r22)
            goto L_0x0235
        L_0x0233:
            r23 = r10
        L_0x0235:
            int r2 = r5.f21424e
            r8 = 179(0xb3, float:2.51E-43)
            if (r2 == r8) goto L_0x023f
            r10 = r23
            r5.f21426g = r10
        L_0x023f:
            va.l$b r2 = r0.f21408f
            long r9 = r0.f21413k
            r2.f21424e = r6
            r5 = 0
            r2.f21423d = r5
            if (r6 == r13) goto L_0x024f
            if (r6 != r8) goto L_0x024d
            goto L_0x024f
        L_0x024d:
            r5 = 0
            goto L_0x0250
        L_0x024f:
            r5 = 1
        L_0x0250:
            r2.f21421b = r5
            if (r6 != r13) goto L_0x0256
            r11 = 1
            goto L_0x0257
        L_0x0256:
            r11 = 0
        L_0x0257:
            r2.f21422c = r11
            r5 = 0
            r2.f21425f = r5
            r2.f21427h = r9
            r2 = r7
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6910l.mo23139b(ub.r):void");
    }

    /* renamed from: c */
    public final void mo23140c() {
        C6795o.m15998a(this.f21405c);
        C6911a aVar = this.f21406d;
        aVar.f21415a = false;
        aVar.f21417c = 0;
        aVar.f21416b = 0;
        C6912b bVar = this.f21408f;
        if (bVar != null) {
            bVar.f21421b = false;
            bVar.f21422c = false;
            bVar.f21423d = false;
            bVar.f21424e = -1;
        }
        C6921r rVar = this.f21407e;
        if (rVar != null) {
            rVar.mo23165c();
        }
        this.f21409g = 0;
    }

    /* renamed from: d */
    public final void mo23141d() {
    }

    /* renamed from: e */
    public final void mo23142e(int i, long j) {
        this.f21413k = j;
    }

    /* renamed from: f */
    public final void mo23143f(C5737j jVar, C6896d0.C6900d dVar) {
        dVar.mo23151a();
        dVar.mo23152b();
        this.f21410h = dVar.f21327e;
        dVar.mo23152b();
        C5754v p = jVar.mo20709p(dVar.f21326d, 2);
        this.f21411i = p;
        this.f21408f = new C6912b(p);
        C6902e0 e0Var = this.f21403a;
        if (e0Var != null) {
            e0Var.mo23154b(jVar, dVar);
        }
    }
}
