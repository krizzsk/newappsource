package p289va;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p173ma.C5732e;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p173ma.C5749s;
import p173ma.C5750t;
import p277ub.C6802q;
import p277ub.C6803r;
import p277ub.C6812y;
import p289va.C6896d0;
import p389bl.C13641g;
import p583jk.C17875h;

/* renamed from: va.c0 */
public final class C6892c0 implements C5735h {

    /* renamed from: a */
    public final int f21279a = 1;

    /* renamed from: b */
    public final int f21280b = 112800;

    /* renamed from: c */
    public final List<C6812y> f21281c;

    /* renamed from: d */
    public final C6803r f21282d;

    /* renamed from: e */
    public final SparseIntArray f21283e;

    /* renamed from: f */
    public final C6896d0.C6899c f21284f = new C6904g();

    /* renamed from: g */
    public final SparseArray<C6896d0> f21285g;

    /* renamed from: h */
    public final SparseBooleanArray f21286h;

    /* renamed from: i */
    public final SparseBooleanArray f21287i;

    /* renamed from: j */
    public final C6890b0 f21288j;

    /* renamed from: k */
    public C6887a0 f21289k;

    /* renamed from: l */
    public C5737j f21290l;

    /* renamed from: m */
    public int f21291m;

    /* renamed from: n */
    public boolean f21292n;

    /* renamed from: o */
    public boolean f21293o;

    /* renamed from: p */
    public boolean f21294p;

    /* renamed from: q */
    public C6896d0 f21295q;

    /* renamed from: r */
    public int f21296r;

    /* renamed from: s */
    public int f21297s;

    /* renamed from: va.c0$a */
    public class C6893a implements C6929x {

        /* renamed from: a */
        public final C6802q f21298a = new C6802q(new byte[4], 4);

        public C6893a() {
        }

        /* renamed from: a */
        public final void mo23145a(C6812y yVar, C5737j jVar, C6896d0.C6900d dVar) {
        }

        /* renamed from: b */
        public final void mo23146b(C6803r rVar) {
            if (rVar.mo22997p() == 0 && (rVar.mo22997p() & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
                rVar.mo22981A(6);
                int i = (rVar.f21040c - rVar.f21039b) / 4;
                for (int i2 = 0; i2 < i; i2++) {
                    C6802q qVar = this.f21298a;
                    rVar.mo22983b(0, 4, qVar.f21034a);
                    qVar.mo22977j(0);
                    int f = this.f21298a.mo22973f(16);
                    this.f21298a.mo22979l(3);
                    if (f == 0) {
                        this.f21298a.mo22979l(13);
                    } else {
                        int f2 = this.f21298a.mo22973f(13);
                        if (C6892c0.this.f21285g.get(f2) == null) {
                            C6892c0 c0Var = C6892c0.this;
                            c0Var.f21285g.put(f2, new C6930y(new C6894b(f2)));
                            C6892c0.this.f21291m++;
                        }
                    }
                }
                C6892c0 c0Var2 = C6892c0.this;
                if (c0Var2.f21279a != 2) {
                    c0Var2.f21285g.remove(0);
                }
            }
        }
    }

    /* renamed from: va.c0$b */
    public class C6894b implements C6929x {

        /* renamed from: a */
        public final C6802q f21300a = new C6802q(new byte[5], 5);

        /* renamed from: b */
        public final SparseArray<C6896d0> f21301b = new SparseArray<>();

        /* renamed from: c */
        public final SparseIntArray f21302c = new SparseIntArray();

        /* renamed from: d */
        public final int f21303d;

        public C6894b(int i) {
            this.f21303d = i;
        }

        /* renamed from: a */
        public final void mo23145a(C6812y yVar, C5737j jVar, C6896d0.C6900d dVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0151, code lost:
            if (r22.mo22997p() == r13) goto L_0x0153;
         */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x0213 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0209  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo23146b(p277ub.C6803r r22) {
            /*
                r21 = this;
                r1 = r21
                r0 = r22
                int r2 = r22.mo22997p()
                r3 = 2
                if (r2 == r3) goto L_0x000c
                return
            L_0x000c:
                va.c0 r2 = p289va.C6892c0.this
                int r4 = r2.f21279a
                r5 = 1
                r6 = 0
                if (r4 == r5) goto L_0x0038
                if (r4 == r3) goto L_0x0038
                int r4 = r2.f21291m
                if (r4 != r5) goto L_0x001b
                goto L_0x0038
            L_0x001b:
                ub.y r4 = new ub.y
                java.util.List<ub.y> r2 = r2.f21281c
                java.lang.Object r2 = r2.get(r6)
                ub.y r2 = (p277ub.C6812y) r2
                monitor-enter(r2)
                long r7 = r2.f21069a     // Catch:{ all -> 0x0034 }
                monitor-exit(r2)
                r4.<init>(r7)
                va.c0 r2 = p289va.C6892c0.this
                java.util.List<ub.y> r2 = r2.f21281c
                r2.add(r4)
                goto L_0x0041
            L_0x0034:
                r0 = move-exception
                r3 = r0
                monitor-exit(r2)
                throw r3
            L_0x0038:
                java.util.List<ub.y> r2 = r2.f21281c
                java.lang.Object r2 = r2.get(r6)
                r4 = r2
                ub.y r4 = (p277ub.C6812y) r4
            L_0x0041:
                int r2 = r22.mo22997p()
                r2 = r2 & 128(0x80, float:1.794E-43)
                if (r2 != 0) goto L_0x004a
                return
            L_0x004a:
                r0.mo22981A(r5)
                int r2 = r22.mo23002u()
                r7 = 3
                r0.mo22981A(r7)
                ub.q r8 = r1.f21300a
                byte[] r9 = r8.f21034a
                r0.mo22983b(r6, r3, r9)
                r8.mo22977j(r6)
                ub.q r8 = r1.f21300a
                r8.mo22979l(r7)
                va.c0 r8 = p289va.C6892c0.this
                ub.q r9 = r1.f21300a
                r10 = 13
                int r9 = r9.mo22973f(r10)
                r8.f21297s = r9
                ub.q r8 = r1.f21300a
                byte[] r9 = r8.f21034a
                r0.mo22983b(r6, r3, r9)
                r8.mo22977j(r6)
                ub.q r8 = r1.f21300a
                r9 = 4
                r8.mo22979l(r9)
                ub.q r8 = r1.f21300a
                r11 = 12
                int r8 = r8.mo22973f(r11)
                r0.mo22981A(r8)
                va.c0 r8 = p289va.C6892c0.this
                int r12 = r8.f21279a
                r13 = 21
                r14 = 0
                r15 = 8192(0x2000, float:1.14794E-41)
                if (r12 != r3) goto L_0x00b9
                va.d0 r8 = r8.f21295q
                if (r8 != 0) goto L_0x00b9
                va.d0$b r8 = new va.d0$b
                byte[] r12 = p277ub.C6774a0.f20964f
                r8.<init>(r13, r14, r14, r12)
                va.c0 r12 = p289va.C6892c0.this
                va.d0$c r14 = r12.f21284f
                va.d0 r8 = r14.mo23150a(r13, r8)
                r12.f21295q = r8
                va.c0 r8 = p289va.C6892c0.this
                va.d0 r12 = r8.f21295q
                ma.j r8 = r8.f21290l
                va.d0$d r14 = new va.d0$d
                r14.<init>(r2, r13, r15)
                r12.mo23147a(r4, r8, r14)
            L_0x00b9:
                android.util.SparseArray<va.d0> r8 = r1.f21301b
                r8.clear()
                android.util.SparseIntArray r8 = r1.f21302c
                r8.clear()
                int r8 = r0.f21040c
                int r12 = r0.f21039b
                int r8 = r8 - r12
            L_0x00c8:
                if (r8 <= 0) goto L_0x0222
                ub.q r14 = r1.f21300a
                byte[] r12 = r14.f21034a
                r5 = 5
                r0.mo22983b(r6, r5, r12)
                r14.mo22977j(r6)
                ub.q r12 = r1.f21300a
                r14 = 8
                int r12 = r12.mo22973f(r14)
                ub.q r14 = r1.f21300a
                r14.mo22979l(r7)
                ub.q r14 = r1.f21300a
                int r14 = r14.mo22973f(r10)
                ub.q r10 = r1.f21300a
                r10.mo22979l(r9)
                ub.q r10 = r1.f21300a
                int r10 = r10.mo22973f(r11)
                int r11 = r0.f21039b
                int r15 = r10 + r11
                r3 = -1
                r17 = 0
                r18 = 0
            L_0x00fc:
                int r6 = r0.f21039b
                if (r6 >= r15) goto L_0x01b2
                int r6 = r22.mo22997p()
                int r16 = r22.mo22997p()
                int r9 = r0.f21039b
                int r9 = r9 + r16
                if (r9 <= r15) goto L_0x0110
                goto L_0x01b2
            L_0x0110:
                r7 = 89
                if (r6 != r5) goto L_0x013a
                long r6 = r22.mo22998q()
                r19 = 1094921523(0x41432d33, double:5.409631094E-315)
                int r16 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
                if (r16 != 0) goto L_0x0120
                goto L_0x013e
            L_0x0120:
                r19 = 1161904947(0x45414333, double:5.74057318E-315)
                int r16 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
                if (r16 != 0) goto L_0x0128
                goto L_0x0146
            L_0x0128:
                r19 = 1094921524(0x41432d34, double:5.4096311E-315)
                int r16 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
                if (r16 != 0) goto L_0x0130
                goto L_0x0153
            L_0x0130:
                r19 = 1212503619(0x48455643, double:5.990563836E-315)
                int r16 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
                if (r16 != 0) goto L_0x0140
                r3 = 36
                goto L_0x0140
            L_0x013a:
                r5 = 106(0x6a, float:1.49E-43)
                if (r6 != r5) goto L_0x0142
            L_0x013e:
                r3 = 129(0x81, float:1.81E-43)
            L_0x0140:
                r5 = 3
                goto L_0x016a
            L_0x0142:
                r5 = 122(0x7a, float:1.71E-43)
                if (r6 != r5) goto L_0x0149
            L_0x0146:
                r3 = 135(0x87, float:1.89E-43)
                goto L_0x0140
            L_0x0149:
                r5 = 127(0x7f, float:1.78E-43)
                if (r6 != r5) goto L_0x0156
                int r5 = r22.mo22997p()
                if (r5 != r13) goto L_0x0140
            L_0x0153:
                r3 = 172(0xac, float:2.41E-43)
                goto L_0x0140
            L_0x0156:
                r5 = 123(0x7b, float:1.72E-43)
                if (r6 != r5) goto L_0x015d
                r3 = 138(0x8a, float:1.93E-43)
                goto L_0x0140
            L_0x015d:
                r5 = 10
                if (r6 != r5) goto L_0x016c
                r5 = 3
                java.lang.String r6 = r0.mo22994m(r5)
                java.lang.String r17 = r6.trim()
            L_0x016a:
                r5 = 4
                goto L_0x01a5
            L_0x016c:
                r5 = 3
                if (r6 != r7) goto L_0x019e
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L_0x0174:
                int r6 = r0.f21039b
                if (r6 >= r9) goto L_0x0198
                java.lang.String r6 = r0.mo22994m(r5)
                java.lang.String r6 = r6.trim()
                r22.mo22997p()
                r5 = 4
                byte[] r7 = new byte[r5]
                r13 = 0
                r0.mo22983b(r13, r5, r7)
                va.d0$a r13 = new va.d0$a
                r13.<init>(r6, r7)
                r3.add(r13)
                r5 = 3
                r7 = 89
                r13 = 21
                goto L_0x0174
            L_0x0198:
                r5 = 4
                r18 = r3
                r3 = 89
                goto L_0x01a5
            L_0x019e:
                r5 = 4
                r7 = 111(0x6f, float:1.56E-43)
                if (r6 != r7) goto L_0x01a5
                r3 = 257(0x101, float:3.6E-43)
            L_0x01a5:
                int r6 = r0.f21039b
                int r9 = r9 - r6
                r0.mo22981A(r9)
                r5 = 5
                r7 = 3
                r9 = 4
                r13 = 21
                goto L_0x00fc
            L_0x01b2:
                r5 = 4
                r0.mo23007z(r15)
                va.d0$b r6 = new va.d0$b
                byte[] r7 = r0.f21038a
                byte[] r7 = java.util.Arrays.copyOfRange(r7, r11, r15)
                r9 = r17
                r11 = r18
                r6.<init>(r3, r9, r11, r7)
                r7 = 6
                if (r12 == r7) goto L_0x01cb
                r7 = 5
                if (r12 != r7) goto L_0x01cc
            L_0x01cb:
                r12 = r3
            L_0x01cc:
                int r10 = r10 + 5
                int r8 = r8 - r10
                va.c0 r3 = p289va.C6892c0.this
                int r7 = r3.f21279a
                r9 = 2
                if (r7 != r9) goto L_0x01d8
                r7 = r12
                goto L_0x01d9
            L_0x01d8:
                r7 = r14
            L_0x01d9:
                android.util.SparseBooleanArray r3 = r3.f21286h
                boolean r3 = r3.get(r7)
                if (r3 == 0) goto L_0x01e4
                r10 = 21
                goto L_0x0213
            L_0x01e4:
                va.c0 r3 = p289va.C6892c0.this
                int r10 = r3.f21279a
                if (r10 != r9) goto L_0x01f1
                r10 = 21
                if (r12 != r10) goto L_0x01f3
                va.d0 r3 = r3.f21295q
                goto L_0x01f9
            L_0x01f1:
                r10 = 21
            L_0x01f3:
                va.d0$c r3 = r3.f21284f
                va.d0 r3 = r3.mo23150a(r12, r6)
            L_0x01f9:
                va.c0 r6 = p289va.C6892c0.this
                int r6 = r6.f21279a
                if (r6 != r9) goto L_0x0209
                android.util.SparseIntArray r6 = r1.f21302c
                r9 = 8192(0x2000, float:1.14794E-41)
                int r6 = r6.get(r7, r9)
                if (r14 >= r6) goto L_0x0213
            L_0x0209:
                android.util.SparseIntArray r6 = r1.f21302c
                r6.put(r7, r14)
                android.util.SparseArray<va.d0> r6 = r1.f21301b
                r6.put(r7, r3)
            L_0x0213:
                r3 = 2
                r5 = 1
                r6 = 0
                r7 = 3
                r9 = 4
                r10 = 13
                r11 = 12
                r13 = 21
                r15 = 8192(0x2000, float:1.14794E-41)
                goto L_0x00c8
            L_0x0222:
                android.util.SparseIntArray r0 = r1.f21302c
                int r0 = r0.size()
                r13 = 0
            L_0x0229:
                if (r13 >= r0) goto L_0x0272
                android.util.SparseIntArray r3 = r1.f21302c
                int r3 = r3.keyAt(r13)
                android.util.SparseIntArray r5 = r1.f21302c
                int r5 = r5.valueAt(r13)
                va.c0 r6 = p289va.C6892c0.this
                android.util.SparseBooleanArray r6 = r6.f21286h
                r7 = 1
                r6.put(r3, r7)
                va.c0 r6 = p289va.C6892c0.this
                android.util.SparseBooleanArray r6 = r6.f21287i
                r6.put(r5, r7)
                android.util.SparseArray<va.d0> r6 = r1.f21301b
                java.lang.Object r6 = r6.valueAt(r13)
                va.d0 r6 = (p289va.C6896d0) r6
                if (r6 == 0) goto L_0x026d
                va.c0 r7 = p289va.C6892c0.this
                va.d0 r8 = r7.f21295q
                if (r6 == r8) goto L_0x0263
                ma.j r7 = r7.f21290l
                va.d0$d r8 = new va.d0$d
                r9 = 8192(0x2000, float:1.14794E-41)
                r8.<init>(r2, r3, r9)
                r6.mo23147a(r4, r7, r8)
                goto L_0x0265
            L_0x0263:
                r9 = 8192(0x2000, float:1.14794E-41)
            L_0x0265:
                va.c0 r3 = p289va.C6892c0.this
                android.util.SparseArray<va.d0> r3 = r3.f21285g
                r3.put(r5, r6)
                goto L_0x026f
            L_0x026d:
                r9 = 8192(0x2000, float:1.14794E-41)
            L_0x026f:
                int r13 = r13 + 1
                goto L_0x0229
            L_0x0272:
                va.c0 r0 = p289va.C6892c0.this
                int r2 = r0.f21279a
                r3 = 2
                if (r2 != r3) goto L_0x028b
                boolean r2 = r0.f21292n
                if (r2 != 0) goto L_0x02ae
                ma.j r0 = r0.f21290l
                r0.mo20708n()
                va.c0 r0 = p289va.C6892c0.this
                r2 = 0
                r0.f21291m = r2
                r3 = 1
                r0.f21292n = r3
                goto L_0x02ae
            L_0x028b:
                r2 = 0
                r3 = 1
                android.util.SparseArray<va.d0> r0 = r0.f21285g
                int r4 = r1.f21303d
                r0.remove(r4)
                va.c0 r0 = p289va.C6892c0.this
                int r4 = r0.f21279a
                if (r4 != r3) goto L_0x029c
                r6 = 0
                goto L_0x02a1
            L_0x029c:
                int r2 = r0.f21291m
                r4 = -1
                int r6 = r2 + -1
            L_0x02a1:
                r0.f21291m = r6
                if (r6 != 0) goto L_0x02ae
                ma.j r0 = r0.f21290l
                r0.mo20708n()
                va.c0 r0 = p289va.C6892c0.this
                r0.f21292n = r3
            L_0x02ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p289va.C6892c0.C6894b.mo23146b(ub.r):void");
        }
    }

    public C6892c0() {
        C6812y yVar = new C6812y(0);
        this.f21281c = Collections.singletonList(yVar);
        this.f21282d = new C6803r(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f21286h = sparseBooleanArray;
        this.f21287i = new SparseBooleanArray();
        SparseArray<C6896d0> sparseArray = new SparseArray<>();
        this.f21285g = sparseArray;
        this.f21283e = new SparseIntArray();
        this.f21288j = new C6890b0();
        this.f21297s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.f21285g.put(sparseArray2.keyAt(i), (C6896d0) sparseArray2.valueAt(i));
        }
        this.f21285g.put(0, new C6930y(new C6893a()));
        this.f21295q = null;
    }

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        boolean z;
        C6887a0 a0Var;
        boolean z2;
        long j3;
        if (this.f21279a != 2) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        int size = this.f21281c.size();
        for (int i = 0; i < size; i++) {
            C6812y yVar = this.f21281c.get(i);
            if (yVar.mo23034c() == -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (yVar.mo23034c() != 0) {
                    synchronized (yVar) {
                        j3 = yVar.f21069a;
                    }
                    if (j3 == j2) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            synchronized (yVar) {
                yVar.f21069a = j2;
                yVar.f21071c = -9223372036854775807L;
            }
        }
        if (!(j2 == 0 || (a0Var = this.f21289k) == null)) {
            a0Var.mo21568c(j2);
        }
        this.f21282d.mo23004w(0);
        this.f21283e.clear();
        for (int i2 = 0; i2 < this.f21285g.size(); i2++) {
            this.f21285g.valueAt(i2).mo23149c();
        }
        this.f21296r = 0;
    }

    /* renamed from: b */
    public final boolean mo21593b(C5736i iVar) throws IOException {
        boolean z;
        byte[] bArr = this.f21282d.f21038a;
        C5732e eVar = (C5732e) iVar;
        eVar.mo21583j(0, 940, bArr, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                } else if (bArr[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                eVar.mo21582i(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f21290l = jVar;
    }

    /* renamed from: h */
    public final int mo21595h(C5736i iVar, C5749s sVar) throws IOException {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        C6896d0 d0Var;
        boolean z6;
        int i3;
        boolean z7;
        boolean z8;
        boolean z9;
        C5749s sVar2 = sVar;
        C5732e eVar = (C5732e) iVar;
        long j = eVar.f18590c;
        int i4 = 1;
        if (this.f21292n) {
            if (j == -1 || this.f21279a == 2) {
                z7 = false;
            } else {
                z7 = true;
            }
            long j2 = -9223372036854775807L;
            if (z7) {
                C6890b0 b0Var = this.f21288j;
                if (!b0Var.f21270d) {
                    int i5 = this.f21297s;
                    if (i5 <= 0) {
                        b0Var.mo23144a(eVar);
                        return 0;
                    }
                    if (!b0Var.f21272f) {
                        int min = (int) Math.min((long) b0Var.f21267a, j);
                        long j3 = j - ((long) min);
                        if (eVar.f18591d != j3) {
                            sVar2.f18624a = j3;
                            return i4;
                        }
                        b0Var.f21269c.mo23004w(min);
                        eVar.f18593f = 0;
                        eVar.mo21583j(0, min, b0Var.f21269c.f21038a, false);
                        C6803r rVar = b0Var.f21269c;
                        int i6 = rVar.f21039b;
                        int i7 = rVar.f21040c;
                        int i8 = i7 - 188;
                        while (true) {
                            if (i8 < i6) {
                                break;
                            }
                            byte[] bArr = rVar.f21038a;
                            int i9 = -4;
                            int i11 = 0;
                            while (true) {
                                if (i9 > 4) {
                                    z9 = false;
                                    break;
                                }
                                int i12 = (i9 * 188) + i8;
                                if (i12 < i6 || i12 >= i7 || bArr[i12] != 71) {
                                    i11 = 0;
                                } else {
                                    i11++;
                                    if (i11 == 5) {
                                        z9 = true;
                                        break;
                                    }
                                }
                                i9++;
                            }
                            if (z9) {
                                long x = C13641g.m34135x(rVar, i8, i5);
                                if (x != -9223372036854775807L) {
                                    j2 = x;
                                    break;
                                }
                            }
                            i8--;
                        }
                        b0Var.f21274h = j2;
                        b0Var.f21272f = true;
                    } else if (b0Var.f21274h == -9223372036854775807L) {
                        b0Var.mo23144a(eVar);
                        return 0;
                    } else if (!b0Var.f21271e) {
                        int min2 = (int) Math.min((long) b0Var.f21267a, j);
                        long j4 = (long) 0;
                        if (eVar.f18591d != j4) {
                            sVar2.f18624a = j4;
                            return i4;
                        }
                        b0Var.f21269c.mo23004w(min2);
                        eVar.f18593f = 0;
                        eVar.mo21583j(0, min2, b0Var.f21269c.f21038a, false);
                        C6803r rVar2 = b0Var.f21269c;
                        int i13 = rVar2.f21039b;
                        int i14 = rVar2.f21040c;
                        while (true) {
                            if (i13 >= i14) {
                                break;
                            }
                            if (rVar2.f21038a[i13] == 71) {
                                long x2 = C13641g.m34135x(rVar2, i13, i5);
                                if (x2 != -9223372036854775807L) {
                                    j2 = x2;
                                    break;
                                }
                            }
                            i13++;
                        }
                        b0Var.f21273g = j2;
                        b0Var.f21271e = true;
                    } else {
                        long j5 = b0Var.f21273g;
                        if (j5 == -9223372036854775807L) {
                            b0Var.mo23144a(eVar);
                            return 0;
                        }
                        b0Var.f21275i = b0Var.f21268b.mo23033b(b0Var.f21274h) - b0Var.f21268b.mo23033b(j5);
                        b0Var.mo23144a(eVar);
                        return 0;
                    }
                    i4 = 0;
                    return i4;
                }
            }
            if (!this.f21293o) {
                this.f21293o = true;
                C6890b0 b0Var2 = this.f21288j;
                long j6 = b0Var2.f21275i;
                if (j6 != -9223372036854775807L) {
                    C6887a0 a0Var = r3;
                    z = false;
                    i = 2;
                    C6887a0 a0Var2 = new C6887a0(b0Var2.f21268b, j6, j, this.f21297s, this.f21280b);
                    this.f21289k = a0Var;
                    this.f21290l.mo20707k(a0Var.f18553a);
                } else {
                    z = false;
                    i = 2;
                    this.f21290l.mo20707k(new C5750t.C5752b(j6));
                }
            } else {
                z = false;
                i = 2;
            }
            if (this.f21294p) {
                this.f21294p = z;
                mo21592a(0, 0);
                if (eVar.f18591d != 0) {
                    sVar2.f18624a = 0;
                    return 1;
                }
            }
            z2 = true;
            C6887a0 a0Var3 = this.f21289k;
            if (a0Var3 != null) {
                if (a0Var3.f18555c != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    return a0Var3.mo21567a(eVar, sVar2);
                }
            }
        } else {
            z2 = true;
            z = false;
            i = 2;
        }
        C6803r rVar3 = this.f21282d;
        byte[] bArr2 = rVar3.f21038a;
        int i15 = rVar3.f21039b;
        if (9400 - i15 < 188) {
            int i16 = rVar3.f21040c - i15;
            if (i16 > 0) {
                System.arraycopy(bArr2, i15, bArr2, z, i16);
            }
            this.f21282d.mo23005x(i16, bArr2);
        }
        while (true) {
            C6803r rVar4 = this.f21282d;
            int i17 = rVar4.f21040c;
            if (i17 - rVar4.f21039b >= 188) {
                z3 = true;
                break;
            }
            int read = eVar.read(bArr2, i17, 9400 - i17);
            if (read == -1) {
                z3 = false;
                break;
            }
            this.f21282d.mo23006y(i17 + read);
        }
        if (!z3) {
            return -1;
        }
        C6803r rVar5 = this.f21282d;
        int i18 = rVar5.f21039b;
        int i19 = rVar5.f21040c;
        byte[] bArr3 = rVar5.f21038a;
        int i21 = i18;
        while (i21 < i19 && bArr3[i21] != 71) {
            i21++;
        }
        this.f21282d.mo23007z(i21);
        int i22 = i21 + 188;
        if (i22 > i19) {
            int i23 = (i21 - i18) + this.f21296r;
            this.f21296r = i23;
            if (this.f21279a == i && i23 > 376) {
                throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f21296r = z;
        }
        C6803r rVar6 = this.f21282d;
        int i24 = rVar6.f21040c;
        if (i22 > i24) {
            return z;
        }
        int c = rVar6.mo22984c();
        if ((8388608 & c) != 0) {
            this.f21282d.mo23007z(i22);
            return z;
        }
        if ((4194304 & c) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i25 = i2 | 0;
        int i26 = (2096896 & c) >> 8;
        if ((c & 32) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((c & 16) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            d0Var = this.f21285g.get(i26);
        } else {
            d0Var = null;
        }
        if (d0Var == null) {
            this.f21282d.mo23007z(i22);
            return z;
        }
        if (this.f21279a != i) {
            int i27 = c & 15;
            int i28 = this.f21283e.get(i26, i27 - 1);
            this.f21283e.put(i26, i27);
            if (i28 == i27) {
                this.f21282d.mo23007z(i22);
                return z;
            } else if (i27 != ((i28 + z2) & 15)) {
                d0Var.mo23149c();
            }
        }
        if (z4) {
            int p = this.f21282d.mo22997p();
            if ((this.f21282d.mo22997p() & 64) != 0) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            i25 |= i3;
            this.f21282d.mo22981A(p - (z2 ? 1 : 0));
        }
        boolean z11 = this.f21292n;
        if (this.f21279a == i || z11 || !this.f21287i.get(i26, z)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            this.f21282d.mo23006y(i22);
            d0Var.mo23148b(i25, this.f21282d);
            this.f21282d.mo23006y(i24);
        }
        if (this.f21279a != i && !z11 && this.f21292n && j != -1) {
            this.f21294p = z2;
        }
        this.f21282d.mo23007z(i22);
        return z ? 1 : 0;
    }

    public final void release() {
    }
}
