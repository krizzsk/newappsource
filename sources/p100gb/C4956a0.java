package p100gb;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.exoplayer2.drm.C3915c;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import java.io.EOFException;
import java.io.IOException;
import p009a8.C0114n;
import p100gb.C5010z;
import p161la.C5653b;
import p173ma.C5754v;
import p265tb.C6645a;
import p265tb.C6652e;
import p265tb.C6658j;
import p277ub.C6774a0;
import p277ub.C6792n;
import p277ub.C6803r;
import p431cy.C16525b;

/* renamed from: gb.a0 */
public final class C4956a0 implements C5754v {

    /* renamed from: A */
    public Format f16745A;

    /* renamed from: B */
    public boolean f16746B;

    /* renamed from: C */
    public boolean f16747C;

    /* renamed from: a */
    public final C5010z f16748a;

    /* renamed from: b */
    public final C4957a f16749b = new C4957a();

    /* renamed from: c */
    public final C4974f0<C4958b> f16750c = new C4974f0<>(new C0114n(8));

    /* renamed from: d */
    public final C3915c f16751d;

    /* renamed from: e */
    public final C3912b.C3913a f16752e;

    /* renamed from: f */
    public final Looper f16753f;

    /* renamed from: g */
    public C4959c f16754g;

    /* renamed from: h */
    public Format f16755h;

    /* renamed from: i */
    public DrmSession f16756i;

    /* renamed from: j */
    public int f16757j = 1000;

    /* renamed from: k */
    public int[] f16758k = new int[1000];

    /* renamed from: l */
    public long[] f16759l = new long[1000];

    /* renamed from: m */
    public int[] f16760m = new int[1000];

    /* renamed from: n */
    public int[] f16761n = new int[1000];

    /* renamed from: o */
    public long[] f16762o = new long[1000];

    /* renamed from: p */
    public C5754v.C5755a[] f16763p = new C5754v.C5755a[1000];

    /* renamed from: q */
    public int f16764q;

    /* renamed from: r */
    public int f16765r;

    /* renamed from: s */
    public int f16766s;

    /* renamed from: t */
    public int f16767t;

    /* renamed from: u */
    public long f16768u = Long.MIN_VALUE;

    /* renamed from: v */
    public long f16769v = Long.MIN_VALUE;

    /* renamed from: w */
    public long f16770w = Long.MIN_VALUE;

    /* renamed from: x */
    public boolean f16771x;

    /* renamed from: y */
    public boolean f16772y = true;

    /* renamed from: z */
    public boolean f16773z = true;

    /* renamed from: gb.a0$a */
    public static final class C4957a {

        /* renamed from: a */
        public int f16774a;

        /* renamed from: b */
        public long f16775b;

        /* renamed from: c */
        public C5754v.C5755a f16776c;
    }

    /* renamed from: gb.a0$b */
    public static final class C4958b {

        /* renamed from: a */
        public final Format f16777a;

        /* renamed from: b */
        public final C3915c.C3917b f16778b;

        public C4958b(Format format, C3915c.C3917b bVar) {
            this.f16777a = format;
            this.f16778b = bVar;
        }
    }

    /* renamed from: gb.a0$c */
    public interface C4959c {
    }

    public C4956a0(C6658j jVar, Looper looper, C3915c cVar, C3912b.C3913a aVar) {
        this.f16753f = looper;
        this.f16751d = cVar;
        this.f16752e = aVar;
        this.f16748a = new C5010z(jVar);
    }

    /* renamed from: a */
    public final int mo20630a(C6652e eVar, int i, boolean z) {
        return mo20644o(eVar, i, z);
    }

    /* renamed from: b */
    public final void mo20631b(int i, C6803r rVar) {
        mo20634e(rVar, i);
    }

    /* renamed from: c */
    public final void mo20632c(Format format) {
        boolean z;
        boolean z2;
        synchronized (this) {
            z = false;
            this.f16773z = false;
            if (!C6774a0.m15941a(format, this.f16745A)) {
                if (this.f16750c.f16820b.size() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    SparseArray<V> sparseArray = this.f16750c.f16820b;
                    if (((C4958b) sparseArray.valueAt(sparseArray.size() - 1)).f16777a.equals(format)) {
                        SparseArray<V> sparseArray2 = this.f16750c.f16820b;
                        this.f16745A = ((C4958b) sparseArray2.valueAt(sparseArray2.size() - 1)).f16777a;
                        Format format2 = this.f16745A;
                        this.f16746B = C6792n.m15988a(format2.f13418m, format2.f13415j);
                        this.f16747C = false;
                        z = true;
                    }
                }
                this.f16745A = format;
                Format format22 = this.f16745A;
                this.f16746B = C6792n.m15988a(format22.f13418m, format22.f13415j);
                this.f16747C = false;
                z = true;
            }
        }
        C4959c cVar = this.f16754g;
        if (cVar != null && z) {
            C5001x xVar = (C5001x) cVar;
            xVar.f16921q.post(xVar.f16919o);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b8, code lost:
        if (((p100gb.C4956a0.C4958b) r10.valueAt(r10.size() - 1)).f16777a.equals(r9.f16745A) == false) goto L_0x00ba;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20633d(long r10, int r12, int r13, int r14, p173ma.C5754v.C5755a r15) {
        /*
            r9 = this;
            r0 = r12 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r9.f16772y
            if (r4 == 0) goto L_0x0012
            if (r3 != 0) goto L_0x0010
            return
        L_0x0010:
            r9.f16772y = r1
        L_0x0012:
            r3 = 0
            long r10 = r10 + r3
            boolean r3 = r9.f16746B
            if (r3 == 0) goto L_0x003b
            long r3 = r9.f16768u
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0020
            return
        L_0x0020:
            if (r0 != 0) goto L_0x003b
            boolean r0 = r9.f16747C
            if (r0 != 0) goto L_0x0039
            com.google.android.exoplayer2.Format r0 = r9.f16745A
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            int r0 = r0 + 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r9.f16747C = r2
        L_0x0039:
            r12 = r12 | 1
        L_0x003b:
            gb.z r0 = r9.f16748a
            long r3 = r0.f16972g
            long r5 = (long) r13
            long r3 = r3 - r5
            long r5 = (long) r14
            long r3 = r3 - r5
            monitor-enter(r9)
            int r14 = r9.f16764q     // Catch:{ all -> 0x0156 }
            if (r14 <= 0) goto L_0x0061
            int r14 = r14 - r2
            int r14 = r9.mo20639j(r14)     // Catch:{ all -> 0x0156 }
            long[] r0 = r9.f16759l     // Catch:{ all -> 0x0156 }
            r5 = r0[r14]     // Catch:{ all -> 0x0156 }
            int[] r0 = r9.f16760m     // Catch:{ all -> 0x0156 }
            r14 = r0[r14]     // Catch:{ all -> 0x0156 }
            long r7 = (long) r14     // Catch:{ all -> 0x0156 }
            long r5 = r5 + r7
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 > 0) goto L_0x005d
            r14 = 1
            goto L_0x005e
        L_0x005d:
            r14 = 0
        L_0x005e:
            p583jk.C17875h.m44301k(r14)     // Catch:{ all -> 0x0156 }
        L_0x0061:
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            r14 = r14 & r12
            if (r14 == 0) goto L_0x0068
            r14 = 1
            goto L_0x0069
        L_0x0068:
            r14 = 0
        L_0x0069:
            r9.f16771x = r14     // Catch:{ all -> 0x0156 }
            long r5 = r9.f16770w     // Catch:{ all -> 0x0156 }
            long r5 = java.lang.Math.max(r5, r10)     // Catch:{ all -> 0x0156 }
            r9.f16770w = r5     // Catch:{ all -> 0x0156 }
            int r14 = r9.f16764q     // Catch:{ all -> 0x0156 }
            int r14 = r9.mo20639j(r14)     // Catch:{ all -> 0x0156 }
            long[] r0 = r9.f16762o     // Catch:{ all -> 0x0156 }
            r0[r14] = r10     // Catch:{ all -> 0x0156 }
            long[] r10 = r9.f16759l     // Catch:{ all -> 0x0156 }
            r10[r14] = r3     // Catch:{ all -> 0x0156 }
            int[] r10 = r9.f16760m     // Catch:{ all -> 0x0156 }
            r10[r14] = r13     // Catch:{ all -> 0x0156 }
            int[] r10 = r9.f16761n     // Catch:{ all -> 0x0156 }
            r10[r14] = r12     // Catch:{ all -> 0x0156 }
            ma.v$a[] r10 = r9.f16763p     // Catch:{ all -> 0x0156 }
            r10[r14] = r15     // Catch:{ all -> 0x0156 }
            int[] r10 = r9.f16758k     // Catch:{ all -> 0x0156 }
            r10[r14] = r1     // Catch:{ all -> 0x0156 }
            gb.f0<gb.a0$b> r10 = r9.f16750c     // Catch:{ all -> 0x0156 }
            android.util.SparseArray<V> r10 = r10.f16820b     // Catch:{ all -> 0x0156 }
            int r10 = r10.size()     // Catch:{ all -> 0x0156 }
            if (r10 != 0) goto L_0x009d
            r10 = 1
            goto L_0x009e
        L_0x009d:
            r10 = 0
        L_0x009e:
            if (r10 != 0) goto L_0x00ba
            gb.f0<gb.a0$b> r10 = r9.f16750c     // Catch:{ all -> 0x0156 }
            android.util.SparseArray<V> r10 = r10.f16820b     // Catch:{ all -> 0x0156 }
            int r11 = r10.size()     // Catch:{ all -> 0x0156 }
            int r11 = r11 + -1
            java.lang.Object r10 = r10.valueAt(r11)     // Catch:{ all -> 0x0156 }
            gb.a0$b r10 = (p100gb.C4956a0.C4958b) r10     // Catch:{ all -> 0x0156 }
            com.google.android.exoplayer2.Format r10 = r10.f16777a     // Catch:{ all -> 0x0156 }
            com.google.android.exoplayer2.Format r11 = r9.f16745A     // Catch:{ all -> 0x0156 }
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x0156 }
            if (r10 != 0) goto L_0x00e2
        L_0x00ba:
            com.google.android.exoplayer2.drm.c r10 = r9.f16751d     // Catch:{ all -> 0x0156 }
            if (r10 == 0) goto L_0x00cc
            android.os.Looper r11 = r9.f16753f     // Catch:{ all -> 0x0156 }
            r11.getClass()     // Catch:{ all -> 0x0156 }
            com.google.android.exoplayer2.drm.b$a r12 = r9.f16752e     // Catch:{ all -> 0x0156 }
            com.google.android.exoplayer2.Format r13 = r9.f16745A     // Catch:{ all -> 0x0156 }
            com.google.android.exoplayer2.drm.c$b r10 = r10.mo15970e(r11, r12, r13)     // Catch:{ all -> 0x0156 }
            goto L_0x00ce
        L_0x00cc:
            a8.k r10 = com.google.android.exoplayer2.drm.C3915c.C3917b.f13731a0     // Catch:{ all -> 0x0156 }
        L_0x00ce:
            gb.f0<gb.a0$b> r11 = r9.f16750c     // Catch:{ all -> 0x0156 }
            int r12 = r9.f16765r     // Catch:{ all -> 0x0156 }
            int r13 = r9.f16764q     // Catch:{ all -> 0x0156 }
            int r12 = r12 + r13
            gb.a0$b r13 = new gb.a0$b     // Catch:{ all -> 0x0156 }
            com.google.android.exoplayer2.Format r14 = r9.f16745A     // Catch:{ all -> 0x0156 }
            r14.getClass()     // Catch:{ all -> 0x0156 }
            r13.<init>(r14, r10)     // Catch:{ all -> 0x0156 }
            r11.mo20677a(r12, r13)     // Catch:{ all -> 0x0156 }
        L_0x00e2:
            int r10 = r9.f16764q     // Catch:{ all -> 0x0156 }
            int r10 = r10 + r2
            r9.f16764q = r10     // Catch:{ all -> 0x0156 }
            int r11 = r9.f16757j     // Catch:{ all -> 0x0156 }
            if (r10 != r11) goto L_0x0154
            int r10 = r11 + 1000
            int[] r12 = new int[r10]     // Catch:{ all -> 0x0156 }
            long[] r13 = new long[r10]     // Catch:{ all -> 0x0156 }
            long[] r14 = new long[r10]     // Catch:{ all -> 0x0156 }
            int[] r15 = new int[r10]     // Catch:{ all -> 0x0156 }
            int[] r0 = new int[r10]     // Catch:{ all -> 0x0156 }
            ma.v$a[] r2 = new p173ma.C5754v.C5755a[r10]     // Catch:{ all -> 0x0156 }
            int r3 = r9.f16766s     // Catch:{ all -> 0x0156 }
            int r11 = r11 - r3
            long[] r4 = r9.f16759l     // Catch:{ all -> 0x0156 }
            java.lang.System.arraycopy(r4, r3, r13, r1, r11)     // Catch:{ all -> 0x0156 }
            long[] r3 = r9.f16762o     // Catch:{ all -> 0x0156 }
            int r4 = r9.f16766s     // Catch:{ all -> 0x0156 }
            java.lang.System.arraycopy(r3, r4, r14, r1, r11)     // Catch:{ all -> 0x0156 }
            int[] r3 = r9.f16761n     // Catch:{ all -> 0x0156 }
            int r4 = r9.f16766s     // Catch:{ all -> 0x0156 }
            java.lang.System.arraycopy(r3, r4, r15, r1, r11)     // Catch:{ all -> 0x0156 }
            int[] r3 = r9.f16760m     // Catch:{ all -> 0x0156 }
            int r4 = r9.f16766s     // Catch:{ all -> 0x0156 }
            java.lang.System.arraycopy(r3, r4, r0, r1, r11)     // Catch:{ all -> 0x0156 }
            ma.v$a[] r3 = r9.f16763p     // Catch:{ all -> 0x0156 }
            int r4 = r9.f16766s     // Catch:{ all -> 0x0156 }
            java.lang.System.arraycopy(r3, r4, r2, r1, r11)     // Catch:{ all -> 0x0156 }
            int[] r3 = r9.f16758k     // Catch:{ all -> 0x0156 }
            int r4 = r9.f16766s     // Catch:{ all -> 0x0156 }
            java.lang.System.arraycopy(r3, r4, r12, r1, r11)     // Catch:{ all -> 0x0156 }
            int r3 = r9.f16766s     // Catch:{ all -> 0x0156 }
            long[] r4 = r9.f16759l     // Catch:{ all -> 0x0156 }
            java.lang.System.arraycopy(r4, r1, r13, r11, r3)     // Catch:{ all -> 0x0156 }
            long[] r4 = r9.f16762o     // Catch:{ all -> 0x0156 }
            java.lang.System.arraycopy(r4, r1, r14, r11, r3)     // Catch:{ all -> 0x0156 }
            int[] r4 = r9.f16761n     // Catch:{ all -> 0x0156 }
            java.lang.System.arraycopy(r4, r1, r15, r11, r3)     // Catch:{ all -> 0x0156 }
            int[] r4 = r9.f16760m     // Catch:{ all -> 0x0156 }
            java.lang.System.arraycopy(r4, r1, r0, r11, r3)     // Catch:{ all -> 0x0156 }
            ma.v$a[] r4 = r9.f16763p     // Catch:{ all -> 0x0156 }
            java.lang.System.arraycopy(r4, r1, r2, r11, r3)     // Catch:{ all -> 0x0156 }
            int[] r4 = r9.f16758k     // Catch:{ all -> 0x0156 }
            java.lang.System.arraycopy(r4, r1, r12, r11, r3)     // Catch:{ all -> 0x0156 }
            r9.f16759l = r13     // Catch:{ all -> 0x0156 }
            r9.f16762o = r14     // Catch:{ all -> 0x0156 }
            r9.f16761n = r15     // Catch:{ all -> 0x0156 }
            r9.f16760m = r0     // Catch:{ all -> 0x0156 }
            r9.f16763p = r2     // Catch:{ all -> 0x0156 }
            r9.f16758k = r12     // Catch:{ all -> 0x0156 }
            r9.f16766s = r1     // Catch:{ all -> 0x0156 }
            r9.f16757j = r10     // Catch:{ all -> 0x0156 }
        L_0x0154:
            monitor-exit(r9)
            return
        L_0x0156:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p100gb.C4956a0.mo20633d(long, int, int, int, ma.v$a):void");
    }

    /* renamed from: e */
    public final void mo20634e(C6803r rVar, int i) {
        C5010z zVar = this.f16748a;
        while (i > 0) {
            int b = zVar.mo20724b(i);
            C5010z.C5011a aVar = zVar.f16971f;
            C6645a aVar2 = aVar.f16976d;
            rVar.mo22983b(((int) (zVar.f16972g - aVar.f16973a)) + aVar2.f20646b, b, aVar2.f20645a);
            i -= b;
            long j = zVar.f16972g + ((long) b);
            zVar.f16972g = j;
            C5010z.C5011a aVar3 = zVar.f16971f;
            if (j == aVar3.f16974b) {
                zVar.f16971f = aVar3.f16977e;
            }
        }
        zVar.getClass();
    }

    /* renamed from: f */
    public final long mo20635f(int i) {
        this.f16769v = Math.max(this.f16769v, mo20638i(i));
        this.f16764q -= i;
        int i2 = this.f16765r + i;
        this.f16765r = i2;
        int i3 = this.f16766s + i;
        this.f16766s = i3;
        int i4 = this.f16757j;
        if (i3 >= i4) {
            this.f16766s = i3 - i4;
        }
        int i5 = this.f16767t - i;
        this.f16767t = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.f16767t = 0;
        }
        C4974f0<C4958b> f0Var = this.f16750c;
        while (i6 < f0Var.f16820b.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < f0Var.f16820b.keyAt(i7)) {
                break;
            }
            f0Var.f16821c.accept(f0Var.f16820b.valueAt(i6));
            f0Var.f16820b.removeAt(i6);
            int i8 = f0Var.f16819a;
            if (i8 > 0) {
                f0Var.f16819a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.f16764q != 0) {
            return this.f16759l[this.f16766s];
        }
        int i9 = this.f16766s;
        if (i9 == 0) {
            i9 = this.f16757j;
        }
        int i11 = i9 - 1;
        return this.f16759l[i11] + ((long) this.f16760m[i11]);
    }

    /* renamed from: g */
    public final void mo20636g() {
        long j;
        C5010z zVar = this.f16748a;
        synchronized (this) {
            int i = this.f16764q;
            if (i == 0) {
                j = -1;
            } else {
                j = mo20635f(i);
            }
        }
        zVar.mo20723a(j);
    }

    /* renamed from: h */
    public final int mo20637h(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f16762o[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f16761n[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f16757j) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: i */
    public final long mo20638i(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int j2 = mo20639j(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f16762o[j2]);
            if ((this.f16761n[j2] & 1) != 0) {
                break;
            }
            j2--;
            if (j2 == -1) {
                j2 = this.f16757j - 1;
            }
        }
        return j;
    }

    /* renamed from: j */
    public final int mo20639j(int i) {
        int i2 = this.f16766s + i;
        int i3 = this.f16757j;
        if (i2 < i3) {
            return i2;
        }
        return i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        return r2;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo20640k(boolean r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f16767t     // Catch:{ all -> 0x003f }
            int r1 = r4.f16764q     // Catch:{ all -> 0x003f }
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            if (r1 != 0) goto L_0x0020
            if (r5 != 0) goto L_0x001e
            boolean r5 = r4.f16771x     // Catch:{ all -> 0x003f }
            if (r5 != 0) goto L_0x001e
            com.google.android.exoplayer2.Format r5 = r4.f16745A     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x001d
            com.google.android.exoplayer2.Format r0 = r4.f16755h     // Catch:{ all -> 0x003f }
            if (r5 == r0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            monitor-exit(r4)
            return r2
        L_0x0020:
            gb.f0<gb.a0$b> r5 = r4.f16750c     // Catch:{ all -> 0x003f }
            int r1 = r4.f16765r     // Catch:{ all -> 0x003f }
            int r1 = r1 + r0
            java.lang.Object r5 = r5.mo20678b(r1)     // Catch:{ all -> 0x003f }
            gb.a0$b r5 = (p100gb.C4956a0.C4958b) r5     // Catch:{ all -> 0x003f }
            com.google.android.exoplayer2.Format r5 = r5.f16777a     // Catch:{ all -> 0x003f }
            com.google.android.exoplayer2.Format r0 = r4.f16755h     // Catch:{ all -> 0x003f }
            if (r5 == r0) goto L_0x0033
            monitor-exit(r4)
            return r2
        L_0x0033:
            int r5 = r4.f16767t     // Catch:{ all -> 0x003f }
            int r5 = r4.mo20639j(r5)     // Catch:{ all -> 0x003f }
            boolean r5 = r4.mo20641l(r5)     // Catch:{ all -> 0x003f }
            monitor-exit(r4)
            return r5
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p100gb.C4956a0.mo20640k(boolean):boolean");
    }

    /* renamed from: l */
    public final boolean mo20641l(int i) {
        DrmSession drmSession = this.f16756i;
        if (drmSession == null || drmSession.getState() == 4 || ((this.f16761n[i] & 1073741824) == 0 && this.f16756i.mo15956e())) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo20642m(Format format, C16525b bVar) {
        boolean z;
        DrmInitData drmInitData;
        Format format2;
        Format format3 = this.f16755h;
        if (format3 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            drmInitData = null;
        } else {
            drmInitData = format3.f13421p;
        }
        this.f16755h = format;
        DrmInitData drmInitData2 = format.f13421p;
        C3915c cVar = this.f16751d;
        if (cVar != null) {
            Class<? extends C5653b> f = cVar.mo15971f(format);
            Format.C3872b b = format.mo15797b();
            b.f13435D = f;
            format2 = b.mo15806a();
        } else {
            format2 = format;
        }
        bVar.f43144b = format2;
        bVar.f43143a = this.f16756i;
        if (this.f16751d != null) {
            if (z || !C6774a0.m15941a(drmInitData, drmInitData2)) {
                DrmSession drmSession = this.f16756i;
                C3915c cVar2 = this.f16751d;
                Looper looper = this.f16753f;
                looper.getClass();
                DrmSession d = cVar2.mo15969d(looper, this.f16752e, format);
                this.f16756i = d;
                bVar.f43143a = d;
                if (drmSession != null) {
                    drmSession.mo15954c(this.f16752e);
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo20643n(boolean z) {
        C5010z zVar = this.f16748a;
        C5010z.C5011a aVar = zVar.f16969d;
        if (aVar.f16975c) {
            C5010z.C5011a aVar2 = zVar.f16971f;
            int i = (((int) (aVar2.f16973a - aVar.f16973a)) / zVar.f16967b) + (aVar2.f16975c ? 1 : 0);
            C6645a[] aVarArr = new C6645a[i];
            int i2 = 0;
            while (i2 < i) {
                aVarArr[i2] = aVar.f16976d;
                aVar.f16976d = null;
                C5010z.C5011a aVar3 = aVar.f16977e;
                aVar.f16977e = null;
                i2++;
                aVar = aVar3;
            }
            zVar.f16966a.mo22831a(aVarArr);
        }
        C5010z.C5011a aVar4 = new C5010z.C5011a(0, zVar.f16967b);
        zVar.f16969d = aVar4;
        zVar.f16970e = aVar4;
        zVar.f16971f = aVar4;
        zVar.f16972g = 0;
        zVar.f16966a.mo22832b();
        this.f16764q = 0;
        this.f16765r = 0;
        this.f16766s = 0;
        this.f16767t = 0;
        this.f16772y = true;
        this.f16768u = Long.MIN_VALUE;
        this.f16769v = Long.MIN_VALUE;
        this.f16770w = Long.MIN_VALUE;
        this.f16771x = false;
        C4974f0<C4958b> f0Var = this.f16750c;
        for (int i3 = 0; i3 < f0Var.f16820b.size(); i3++) {
            f0Var.f16821c.accept(f0Var.f16820b.valueAt(i3));
        }
        f0Var.f16819a = -1;
        f0Var.f16820b.clear();
        if (z) {
            this.f16745A = null;
            this.f16773z = true;
        }
    }

    /* renamed from: o */
    public final int mo20644o(C6652e eVar, int i, boolean z) throws IOException {
        C5010z zVar = this.f16748a;
        int b = zVar.mo20724b(i);
        C5010z.C5011a aVar = zVar.f16971f;
        C6645a aVar2 = aVar.f16976d;
        int read = eVar.read(aVar2.f20645a, ((int) (zVar.f16972g - aVar.f16973a)) + aVar2.f20646b, b);
        if (read != -1) {
            long j = zVar.f16972g + ((long) read);
            zVar.f16972g = j;
            C5010z.C5011a aVar3 = zVar.f16971f;
            if (j != aVar3.f16974b) {
                return read;
            }
            zVar.f16971f = aVar3.f16977e;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: p */
    public final synchronized boolean mo20645p(long r11, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            monitor-enter(r10)     // Catch:{ all -> 0x0046 }
            r0 = 0
            r10.f16767t = r0     // Catch:{ all -> 0x0048 }
            gb.z r1 = r10.f16748a     // Catch:{ all -> 0x0048 }
            gb.z$a r2 = r1.f16969d     // Catch:{ all -> 0x0048 }
            r1.f16970e = r2     // Catch:{ all -> 0x0048 }
            monitor-exit(r10)     // Catch:{ all -> 0x0046 }
            int r4 = r10.mo20639j(r0)     // Catch:{ all -> 0x0046 }
            int r1 = r10.f16767t     // Catch:{ all -> 0x0046 }
            int r2 = r10.f16764q     // Catch:{ all -> 0x0046 }
            r9 = 1
            if (r1 == r2) goto L_0x0019
            r3 = 1
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            if (r3 == 0) goto L_0x0044
            long[] r3 = r10.f16762o     // Catch:{ all -> 0x0046 }
            r5 = r3[r4]     // Catch:{ all -> 0x0046 }
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0044
            long r5 = r10.f16770w     // Catch:{ all -> 0x0046 }
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x002d
            if (r13 != 0) goto L_0x002d
            goto L_0x0044
        L_0x002d:
            int r5 = r2 - r1
            r8 = 1
            r3 = r10
            r6 = r11
            int r13 = r3.mo20637h(r4, r5, r6, r8)     // Catch:{ all -> 0x0046 }
            r1 = -1
            if (r13 != r1) goto L_0x003b
            monitor-exit(r10)
            return r0
        L_0x003b:
            r10.f16768u = r11     // Catch:{ all -> 0x0046 }
            int r11 = r10.f16767t     // Catch:{ all -> 0x0046 }
            int r11 = r11 + r13
            r10.f16767t = r11     // Catch:{ all -> 0x0046 }
            monitor-exit(r10)
            return r9
        L_0x0044:
            monitor-exit(r10)
            return r0
        L_0x0046:
            r11 = move-exception
            goto L_0x004b
        L_0x0048:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0046 }
            throw r11     // Catch:{ all -> 0x0046 }
        L_0x004b:
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p100gb.C4956a0.mo20645p(long, boolean):boolean");
    }
}
