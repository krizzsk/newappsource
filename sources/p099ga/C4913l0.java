package p099ga;

import com.google.android.exoplayer2.C3873a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C3997b;
import p100gb.C4961b0;
import p100gb.C4962c;
import p100gb.C4984m;
import p100gb.C4987o;
import p252sb.C6506f;
import p252sb.C6508g;
import p277ub.C6776b0;
import p583jk.C17875h;
import p584jl.C17885a;

/* renamed from: ga.l0 */
public final class C4913l0 {

    /* renamed from: a */
    public final C4984m f16608a;

    /* renamed from: b */
    public final Object f16609b;

    /* renamed from: c */
    public final C4961b0[] f16610c;

    /* renamed from: d */
    public boolean f16611d;

    /* renamed from: e */
    public boolean f16612e;

    /* renamed from: f */
    public C4916m0 f16613f;

    /* renamed from: g */
    public boolean f16614g;

    /* renamed from: h */
    public final boolean[] f16615h;

    /* renamed from: i */
    public final C4952y0[] f16616i;

    /* renamed from: j */
    public final C6506f f16617j;

    /* renamed from: k */
    public final C4924q0 f16618k;

    /* renamed from: l */
    public C4913l0 f16619l;

    /* renamed from: m */
    public TrackGroupArray f16620m = TrackGroupArray.f14011e;

    /* renamed from: n */
    public C6508g f16621n;

    /* renamed from: o */
    public long f16622o;

    /* JADX WARNING: type inference failed for: r4v7, types: [gb.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4913l0(p099ga.C4952y0[] r3, long r4, p252sb.C6506f r6, p265tb.C6658j r7, p099ga.C4924q0 r8, p099ga.C4916m0 r9, p252sb.C6508g r10) {
        /*
            r2 = this;
            r2.<init>()
            r2.f16616i = r3
            r2.f16622o = r4
            r2.f16617j = r6
            r2.f16618k = r8
            gb.o$a r4 = r9.f16623a
            java.lang.Object r5 = r4.f16857a
            r2.f16609b = r5
            r2.f16613f = r9
            com.google.android.exoplayer2.source.TrackGroupArray r5 = com.google.android.exoplayer2.source.TrackGroupArray.f14011e
            r2.f16620m = r5
            r2.f16621n = r10
            int r5 = r3.length
            gb.b0[] r5 = new p100gb.C4961b0[r5]
            r2.f16610c = r5
            int r3 = r3.length
            boolean[] r3 = new boolean[r3]
            r2.f16615h = r3
            long r5 = r9.f16624b
            long r9 = r9.f16626d
            r8.getClass()
            java.lang.Object r3 = r4.f16857a
            int r0 = p099ga.C4855a.f16282e
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r0 = r3.first
            java.lang.Object r3 = r3.second
            gb.o$a r3 = r4.mo20691b(r3)
            java.util.HashMap r4 = r8.f16653c
            java.lang.Object r4 = r4.get(r0)
            ga.q0$c r4 = (p099ga.C4924q0.C4927c) r4
            r4.getClass()
            java.util.HashSet r0 = r8.f16658h
            r0.add(r4)
            java.util.HashMap<ga.q0$c, ga.q0$b> r0 = r8.f16657g
            java.lang.Object r0 = r0.get(r4)
            ga.q0$b r0 = (p099ga.C4924q0.C4926b) r0
            if (r0 == 0) goto L_0x0059
            gb.o r1 = r0.f16666a
            gb.o$b r0 = r0.f16667b
            r1.mo20625n(r0)
        L_0x0059:
            java.util.ArrayList r0 = r4.f16671c
            r0.add(r3)
            gb.k r0 = r4.f16669a
            gb.j r3 = r0.mo20684g(r3, r7, r5)
            java.util.IdentityHashMap<gb.m, ga.q0$c> r5 = r8.f16652b
            r5.put(r3, r4)
            r8.mo20582d()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0081
            r4 = -9223372036854775808
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0081
            gb.c r4 = new gb.c
            r4.<init>(r3, r9)
            r3 = r4
        L_0x0081:
            r2.f16608a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p099ga.C4913l0.<init>(ga.y0[], long, sb.f, tb.j, ga.q0, ga.m0, sb.g):void");
    }

    /* renamed from: a */
    public final long mo20553a(C6508g gVar, long j, boolean z, boolean[] zArr) {
        boolean z2;
        C6508g gVar2 = gVar;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= gVar2.f20299a) {
                break;
            }
            boolean[] zArr2 = this.f16615h;
            if (z || !gVar2.mo22612a(this.f16621n, i)) {
                z3 = false;
            }
            zArr2[i] = z3;
            i++;
        }
        C4961b0[] b0VarArr = this.f16610c;
        int i2 = 0;
        while (true) {
            C4952y0[] y0VarArr = this.f16616i;
            if (i2 >= y0VarArr.length) {
                break;
            }
            if (((C3873a) y0VarArr[i2]).f13462b == 7) {
                b0VarArr[i2] = null;
            }
            i2++;
        }
        mo20554b();
        this.f16621n = gVar2;
        mo20555c();
        long d = this.f16608a.mo20654d(gVar2.f20301c, this.f16615h, this.f16610c, zArr, j);
        C4961b0[] b0VarArr2 = this.f16610c;
        int i3 = 0;
        while (true) {
            C4952y0[] y0VarArr2 = this.f16616i;
            if (i3 >= y0VarArr2.length) {
                break;
            }
            if (((C3873a) y0VarArr2[i3]).f13462b == 7 && this.f16621n.mo22613b(i3)) {
                b0VarArr2[i3] = new C17885a();
            }
            i3++;
        }
        this.f16612e = false;
        int i4 = 0;
        while (true) {
            C4961b0[] b0VarArr3 = this.f16610c;
            if (i4 >= b0VarArr3.length) {
                return d;
            }
            if (b0VarArr3[i4] != null) {
                C17875h.m44304o(gVar2.mo22613b(i4));
                if (((C3873a) this.f16616i[i4]).f13462b != 7) {
                    this.f16612e = true;
                }
            } else {
                if (gVar2.f20301c[i4] == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C17875h.m44304o(z2);
            }
            i4++;
        }
    }

    /* renamed from: b */
    public final void mo20554b() {
        boolean z;
        int i = 0;
        if (this.f16619l == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            while (true) {
                C6508g gVar = this.f16621n;
                if (i < gVar.f20299a) {
                    boolean b = gVar.mo22613b(i);
                    C3997b bVar = this.f16621n.f20301c[i];
                    if (b && bVar != null) {
                        bVar.mo16331e();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo20555c() {
        boolean z;
        int i = 0;
        if (this.f16619l == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            while (true) {
                C6508g gVar = this.f16621n;
                if (i < gVar.f20299a) {
                    boolean b = gVar.mo22613b(i);
                    C3997b bVar = this.f16621n.f20301c[i];
                    if (b && bVar != null) {
                        bVar.mo16334i();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final long mo20556d() {
        long j;
        if (!this.f16611d) {
            return this.f16613f.f16624b;
        }
        if (this.f16612e) {
            j = this.f16608a.mo20663q();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.f16613f.f16627e;
        }
        return j;
    }

    /* renamed from: e */
    public final long mo20557e() {
        return this.f16613f.f16624b + this.f16622o;
    }

    /* renamed from: f */
    public final void mo20558f() {
        mo20554b();
        long j = this.f16613f.f16626d;
        C4924q0 q0Var = this.f16618k;
        C4984m mVar = this.f16608a;
        if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
            q0Var.mo20585g(mVar);
            return;
        }
        try {
            q0Var.mo20585g(((C4962c) mVar).f16782b);
        } catch (RuntimeException e) {
            C6776b0.m15968a("Period release failed.", e);
        }
    }

    /* renamed from: g */
    public final C6508g mo20559g(float f, C4879e1 e1Var) throws ExoPlaybackException {
        C6506f fVar = this.f16617j;
        C4952y0[] y0VarArr = this.f16616i;
        TrackGroupArray trackGroupArray = this.f16620m;
        C4987o.C4988a aVar = this.f16613f.f16623a;
        C6508g b = fVar.mo16342b(y0VarArr, trackGroupArray);
        for (C3997b bVar : b.f20301c) {
            if (bVar != null) {
                bVar.mo16333g();
            }
        }
        return b;
    }
}
