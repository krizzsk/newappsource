package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import p267u0.C6674a;
import p267u0.C6675b;

/* renamed from: androidx.constraintlayout.core.c */
public final class C0680c {

    /* renamed from: p */
    public static boolean f2351p = false;

    /* renamed from: q */
    public static int f2352q = 1000;

    /* renamed from: a */
    public boolean f2353a;

    /* renamed from: b */
    public int f2354b;

    /* renamed from: c */
    public C0682d f2355c;

    /* renamed from: d */
    public int f2356d;

    /* renamed from: e */
    public int f2357e;

    /* renamed from: f */
    public C0678b[] f2358f;

    /* renamed from: g */
    public boolean f2359g;

    /* renamed from: h */
    public boolean[] f2360h;

    /* renamed from: i */
    public int f2361i;

    /* renamed from: j */
    public int f2362j;

    /* renamed from: k */
    public int f2363k;

    /* renamed from: l */
    public final C6674a f2364l;

    /* renamed from: m */
    public SolverVariable[] f2365m;

    /* renamed from: n */
    public int f2366n;

    /* renamed from: o */
    public C0678b f2367o;

    /* renamed from: androidx.constraintlayout.core.c$a */
    public interface C0681a {
        /* renamed from: a */
        SolverVariable mo2727a(boolean[] zArr);
    }

    public C0680c() {
        this.f2353a = false;
        this.f2354b = 0;
        this.f2356d = 32;
        this.f2357e = 32;
        this.f2358f = null;
        this.f2359g = false;
        this.f2360h = new boolean[32];
        this.f2361i = 1;
        this.f2362j = 0;
        this.f2363k = 32;
        this.f2365m = new SolverVariable[f2352q];
        this.f2366n = 0;
        this.f2358f = new C0678b[32];
        mo2754s();
        C6674a aVar = new C6674a();
        this.f2364l = aVar;
        this.f2355c = new C0682d(aVar);
        this.f2367o = new C0678b(aVar);
    }

    /* renamed from: n */
    public static int m1925n(ConstraintAnchor constraintAnchor) {
        SolverVariable solverVariable = constraintAnchor.f2382i;
        if (solverVariable != null) {
            return (int) (solverVariable.f2328f + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.constraintlayout.core.SolverVariable mo2737a(androidx.constraintlayout.core.SolverVariable.Type r6) {
        /*
            r5 = this;
            u0.a r0 = r5.f2364l
            java.lang.Object r0 = r0.f20754d
            u0.b r0 = (p267u0.C6675b) r0
            int r1 = r0.f20756b
            r2 = 0
            if (r1 <= 0) goto L_0x0018
            int r1 = r1 + -1
            java.lang.Object r3 = r0.f20757c
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = r3[r1]
            r3[r1] = r2
            r0.f20756b = r1
            r2 = r4
        L_0x0018:
            androidx.constraintlayout.core.SolverVariable r2 = (androidx.constraintlayout.core.SolverVariable) r2
            if (r2 != 0) goto L_0x0024
            androidx.constraintlayout.core.SolverVariable r2 = new androidx.constraintlayout.core.SolverVariable
            r2.<init>(r6)
            r2.f2332j = r6
            goto L_0x0029
        L_0x0024:
            r2.mo2710f()
            r2.f2332j = r6
        L_0x0029:
            int r6 = r5.f2366n
            int r0 = f2352q
            if (r6 < r0) goto L_0x003d
            int r0 = r0 * 2
            f2352q = r0
            androidx.constraintlayout.core.SolverVariable[] r6 = r5.f2365m
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            androidx.constraintlayout.core.SolverVariable[] r6 = (androidx.constraintlayout.core.SolverVariable[]) r6
            r5.f2365m = r6
        L_0x003d:
            androidx.constraintlayout.core.SolverVariable[] r6 = r5.f2365m
            int r0 = r5.f2366n
            int r1 = r0 + 1
            r5.f2366n = r1
            r6[r0] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0680c.mo2737a(androidx.constraintlayout.core.SolverVariable$Type):androidx.constraintlayout.core.SolverVariable");
    }

    /* renamed from: b */
    public final void mo2738b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        C0678b l = mo2748l();
        if (solverVariable2 == solverVariable3) {
            l.f2349d.mo2722h(solverVariable, 1.0f);
            l.f2349d.mo2722h(solverVariable4, 1.0f);
            l.f2349d.mo2722h(solverVariable2, -2.0f);
        } else if (f == 0.5f) {
            l.f2349d.mo2722h(solverVariable, 1.0f);
            l.f2349d.mo2722h(solverVariable2, -1.0f);
            l.f2349d.mo2722h(solverVariable3, -1.0f);
            l.f2349d.mo2722h(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                l.f2347b = (float) ((-i) + i2);
            }
        } else if (f <= BitmapDescriptorFactory.HUE_RED) {
            l.f2349d.mo2722h(solverVariable, -1.0f);
            l.f2349d.mo2722h(solverVariable2, 1.0f);
            l.f2347b = (float) i;
        } else if (f >= 1.0f) {
            l.f2349d.mo2722h(solverVariable4, -1.0f);
            l.f2349d.mo2722h(solverVariable3, 1.0f);
            l.f2347b = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            l.f2349d.mo2722h(solverVariable, f2 * 1.0f);
            l.f2349d.mo2722h(solverVariable2, f2 * -1.0f);
            l.f2349d.mo2722h(solverVariable3, -1.0f * f);
            l.f2349d.mo2722h(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                l.f2347b = (((float) i2) * f) + (((float) (-i)) * f2);
            }
        }
        if (i3 != 8) {
            l.mo2728b(this, i3);
        }
        mo2739c(l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c1, code lost:
        if (r4.f2335m <= 1) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        if (r4.f2335m <= 1) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ce, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00eb, code lost:
        if (r4.f2335m <= 1) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f4, code lost:
        if (r4.f2335m <= 1) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f8, code lost:
        r14 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01c7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2739c(androidx.constraintlayout.core.C0678b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f2362j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f2363k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f2361i
            int r2 = r2 + r3
            int r4 = r0.f2357e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.mo2750o()
        L_0x0016:
            boolean r2 = r1.f2350e
            if (r2 != 0) goto L_0x01c9
            androidx.constraintlayout.core.b[] r2 = r0.f2358f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x0083
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x0073
            androidx.constraintlayout.core.b$a r6 = r1.f2349d
            int r6 = r6.mo2720f()
            r7 = 0
        L_0x002b:
            if (r7 >= r6) goto L_0x0044
            androidx.constraintlayout.core.b$a r8 = r1.f2349d
            androidx.constraintlayout.core.SolverVariable r8 = r8.mo2715b(r7)
            int r9 = r8.f2326d
            if (r9 != r5) goto L_0x003c
            boolean r9 = r8.f2329g
            if (r9 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> r9 = r1.f2348c
            r9.add(r8)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> r6 = r1.f2348c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0071
            r7 = 0
        L_0x004d:
            if (r7 >= r6) goto L_0x006b
            java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> r8 = r1.f2348c
            java.lang.Object r8 = r8.get(r7)
            androidx.constraintlayout.core.SolverVariable r8 = (androidx.constraintlayout.core.SolverVariable) r8
            boolean r9 = r8.f2329g
            if (r9 == 0) goto L_0x005f
            r1.mo2734h(r0, r8, r3)
            goto L_0x0068
        L_0x005f:
            androidx.constraintlayout.core.b[] r9 = r0.f2358f
            int r8 = r8.f2326d
            r8 = r9[r8]
            r1.mo2735i(r0, r8, r3)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x004d
        L_0x006b:
            java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> r6 = r1.f2348c
            r6.clear()
            goto L_0x0022
        L_0x0071:
            r2 = 1
            goto L_0x0022
        L_0x0073:
            androidx.constraintlayout.core.SolverVariable r2 = r1.f2346a
            if (r2 == 0) goto L_0x0083
            androidx.constraintlayout.core.b$a r2 = r1.f2349d
            int r2 = r2.mo2720f()
            if (r2 != 0) goto L_0x0083
            r1.f2350e = r3
            r0.f2353a = r3
        L_0x0083:
            boolean r2 = r17.mo2731e()
            if (r2 == 0) goto L_0x008a
            return
        L_0x008a:
            float r2 = r1.f2347b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x009c
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f2347b = r2
            androidx.constraintlayout.core.b$a r2 = r1.f2349d
            r2.mo2718d()
        L_0x009c:
            androidx.constraintlayout.core.b$a r2 = r1.f2349d
            int r2 = r2.mo2720f()
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x00a9:
            if (r8 >= r2) goto L_0x010e
            androidx.constraintlayout.core.b$a r15 = r1.f2349d
            float r15 = r15.mo2723i(r8)
            androidx.constraintlayout.core.b$a r4 = r1.f2349d
            androidx.constraintlayout.core.SolverVariable r4 = r4.mo2715b(r8)
            androidx.constraintlayout.core.SolverVariable$Type r5 = r4.f2332j
            androidx.constraintlayout.core.SolverVariable$Type r7 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r5 != r7) goto L_0x00e1
            if (r9 != 0) goto L_0x00c4
            int r5 = r4.f2335m
            if (r5 > r3) goto L_0x00ce
            goto L_0x00cc
        L_0x00c4:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d2
            int r5 = r4.f2335m
            if (r5 > r3) goto L_0x00ce
        L_0x00cc:
            r12 = 1
            goto L_0x00cf
        L_0x00ce:
            r12 = 0
        L_0x00cf:
            r9 = r4
            r11 = r15
            goto L_0x010a
        L_0x00d2:
            if (r12 != 0) goto L_0x010a
            int r5 = r4.f2335m
            if (r5 > r3) goto L_0x00da
            r5 = 1
            goto L_0x00db
        L_0x00da:
            r5 = 0
        L_0x00db:
            if (r5 == 0) goto L_0x010a
            r9 = r4
            r11 = r15
            r12 = 1
            goto L_0x010a
        L_0x00e1:
            if (r9 != 0) goto L_0x010a
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x010a
            if (r10 != 0) goto L_0x00ee
            int r5 = r4.f2335m
            if (r5 > r3) goto L_0x00f8
            goto L_0x00f6
        L_0x00ee:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00fc
            int r5 = r4.f2335m
            if (r5 > r3) goto L_0x00f8
        L_0x00f6:
            r14 = 1
            goto L_0x00f9
        L_0x00f8:
            r14 = 0
        L_0x00f9:
            r10 = r4
            r13 = r15
            goto L_0x010a
        L_0x00fc:
            if (r14 != 0) goto L_0x010a
            int r5 = r4.f2335m
            if (r5 > r3) goto L_0x0104
            r5 = 1
            goto L_0x0105
        L_0x0104:
            r5 = 0
        L_0x0105:
            if (r5 == 0) goto L_0x010a
            r10 = r4
            r13 = r15
            r14 = 1
        L_0x010a:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a9
        L_0x010e:
            if (r9 == 0) goto L_0x0111
            goto L_0x0112
        L_0x0111:
            r9 = r10
        L_0x0112:
            if (r9 != 0) goto L_0x0116
            r2 = 1
            goto L_0x011a
        L_0x0116:
            r1.mo2733g(r9)
            r2 = 0
        L_0x011a:
            androidx.constraintlayout.core.b$a r4 = r1.f2349d
            int r4 = r4.mo2720f()
            if (r4 != 0) goto L_0x0124
            r1.f2350e = r3
        L_0x0124:
            if (r2 == 0) goto L_0x01b1
            int r2 = r0.f2361i
            int r2 = r2 + r3
            int r4 = r0.f2357e
            if (r2 < r4) goto L_0x0130
            r16.mo2750o()
        L_0x0130:
            androidx.constraintlayout.core.SolverVariable$Type r2 = androidx.constraintlayout.core.SolverVariable.Type.SLACK
            androidx.constraintlayout.core.SolverVariable r2 = r0.mo2737a(r2)
            int r4 = r0.f2354b
            int r4 = r4 + r3
            r0.f2354b = r4
            int r5 = r0.f2361i
            int r5 = r5 + r3
            r0.f2361i = r5
            r2.f2325c = r4
            u0.a r5 = r0.f2364l
            java.lang.Object r5 = r5.f20755e
            androidx.constraintlayout.core.SolverVariable[] r5 = (androidx.constraintlayout.core.SolverVariable[]) r5
            r5[r4] = r2
            r1.f2346a = r2
            int r4 = r0.f2362j
            r16.mo2744h(r17)
            int r5 = r0.f2362j
            int r4 = r4 + r3
            if (r5 != r4) goto L_0x01b1
            androidx.constraintlayout.core.b r4 = r0.f2367o
            r4.getClass()
            r5 = 0
            r4.f2346a = r5
            androidx.constraintlayout.core.b$a r5 = r4.f2349d
            r5.clear()
            r5 = 0
        L_0x0164:
            androidx.constraintlayout.core.b$a r7 = r1.f2349d
            int r7 = r7.mo2720f()
            if (r5 >= r7) goto L_0x0180
            androidx.constraintlayout.core.b$a r7 = r1.f2349d
            androidx.constraintlayout.core.SolverVariable r7 = r7.mo2715b(r5)
            androidx.constraintlayout.core.b$a r8 = r1.f2349d
            float r8 = r8.mo2723i(r5)
            androidx.constraintlayout.core.b$a r9 = r4.f2349d
            r9.mo2716c(r7, r8, r3)
            int r5 = r5 + 1
            goto L_0x0164
        L_0x0180:
            androidx.constraintlayout.core.b r4 = r0.f2367o
            r0.mo2753r(r4)
            int r4 = r2.f2326d
            r5 = -1
            if (r4 != r5) goto L_0x01af
            androidx.constraintlayout.core.SolverVariable r4 = r1.f2346a
            if (r4 != r2) goto L_0x0198
            r4 = 0
            androidx.constraintlayout.core.SolverVariable r2 = r1.mo2732f(r4, r2)
            if (r2 == 0) goto L_0x0198
            r1.mo2733g(r2)
        L_0x0198:
            boolean r2 = r1.f2350e
            if (r2 != 0) goto L_0x01a1
            androidx.constraintlayout.core.SolverVariable r2 = r1.f2346a
            r2.mo2712h(r0, r1)
        L_0x01a1:
            u0.a r2 = r0.f2364l
            java.lang.Object r2 = r2.f20753c
            u0.b r2 = (p267u0.C6675b) r2
            r2.mo22845a(r1)
            int r2 = r0.f2362j
            int r2 = r2 - r3
            r0.f2362j = r2
        L_0x01af:
            r2 = 1
            goto L_0x01b2
        L_0x01b1:
            r2 = 0
        L_0x01b2:
            androidx.constraintlayout.core.SolverVariable r4 = r1.f2346a
            if (r4 == 0) goto L_0x01c3
            androidx.constraintlayout.core.SolverVariable$Type r4 = r4.f2332j
            androidx.constraintlayout.core.SolverVariable$Type r5 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r4 == r5) goto L_0x01c4
            float r4 = r1.f2347b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            r3 = 0
        L_0x01c4:
            if (r3 != 0) goto L_0x01c7
            return
        L_0x01c7:
            r4 = r2
            goto L_0x01ca
        L_0x01c9:
            r4 = 0
        L_0x01ca:
            if (r4 != 0) goto L_0x01cf
            r16.mo2744h(r17)
        L_0x01cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0680c.mo2739c(androidx.constraintlayout.core.b):void");
    }

    /* renamed from: d */
    public final void mo2740d(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.f2326d;
        if (i2 == -1) {
            solverVariable.mo2711g(this, (float) i);
            for (int i3 = 0; i3 < this.f2354b + 1; i3++) {
                SolverVariable solverVariable2 = ((SolverVariable[]) this.f2364l.f20755e)[i3];
            }
        } else if (i2 != -1) {
            C0678b bVar = this.f2358f[i2];
            if (bVar.f2350e) {
                bVar.f2347b = (float) i;
            } else if (bVar.f2349d.mo2720f() == 0) {
                bVar.f2350e = true;
                bVar.f2347b = (float) i;
            } else {
                C0678b l = mo2748l();
                if (i < 0) {
                    l.f2347b = (float) (i * -1);
                    l.f2349d.mo2722h(solverVariable, 1.0f);
                } else {
                    l.f2347b = (float) i;
                    l.f2349d.mo2722h(solverVariable, -1.0f);
                }
                mo2739c(l);
            }
        } else {
            C0678b l2 = mo2748l();
            l2.f2346a = solverVariable;
            float f = (float) i;
            solverVariable.f2328f = f;
            l2.f2347b = f;
            l2.f2350e = true;
            mo2739c(l2);
        }
    }

    /* renamed from: e */
    public final void mo2741e(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (i2 == 8 && solverVariable2.f2329g && solverVariable.f2326d == -1) {
            solverVariable.mo2711g(this, solverVariable2.f2328f + ((float) i));
            return;
        }
        C0678b l = mo2748l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.f2347b = (float) i;
        }
        if (!z) {
            l.f2349d.mo2722h(solverVariable, -1.0f);
            l.f2349d.mo2722h(solverVariable2, 1.0f);
        } else {
            l.f2349d.mo2722h(solverVariable, 1.0f);
            l.f2349d.mo2722h(solverVariable2, -1.0f);
        }
        if (i2 != 8) {
            l.mo2728b(this, i2);
        }
        mo2739c(l);
    }

    /* renamed from: f */
    public final void mo2742f(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0678b l = mo2748l();
        SolverVariable m = mo2749m();
        m.f2327e = 0;
        l.mo2729c(solverVariable, solverVariable2, m, i);
        if (i2 != 8) {
            l.f2349d.mo2722h(mo2746j(i2), (float) ((int) (l.f2349d.mo2724j(m) * -1.0f)));
        }
        mo2739c(l);
    }

    /* renamed from: g */
    public final void mo2743g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0678b l = mo2748l();
        SolverVariable m = mo2749m();
        m.f2327e = 0;
        l.mo2730d(solverVariable, solverVariable2, m, i);
        if (i2 != 8) {
            l.f2349d.mo2722h(mo2746j(i2), (float) ((int) (l.f2349d.mo2724j(m) * -1.0f)));
        }
        mo2739c(l);
    }

    /* renamed from: h */
    public final void mo2744h(C0678b bVar) {
        int i;
        if (bVar.f2350e) {
            bVar.f2346a.mo2711g(this, bVar.f2347b);
        } else {
            C0678b[] bVarArr = this.f2358f;
            int i2 = this.f2362j;
            bVarArr[i2] = bVar;
            SolverVariable solverVariable = bVar.f2346a;
            solverVariable.f2326d = i2;
            this.f2362j = i2 + 1;
            solverVariable.mo2712h(this, bVar);
        }
        if (this.f2353a) {
            int i3 = 0;
            while (i3 < this.f2362j) {
                if (this.f2358f[i3] == null) {
                    System.out.println("WTF");
                }
                C0678b bVar2 = this.f2358f[i3];
                if (bVar2 != null && bVar2.f2350e) {
                    bVar2.f2346a.mo2711g(this, bVar2.f2347b);
                    ((C6675b) this.f2364l.f20753c).mo22845a(bVar2);
                    this.f2358f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f2362j;
                        if (i4 >= i) {
                            break;
                        }
                        C0678b[] bVarArr2 = this.f2358f;
                        int i6 = i4 - 1;
                        C0678b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f2346a;
                        if (solverVariable2.f2326d == i4) {
                            solverVariable2.f2326d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f2358f[i5] = null;
                    }
                    this.f2362j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f2353a = false;
        }
    }

    /* renamed from: i */
    public final void mo2745i() {
        for (int i = 0; i < this.f2362j; i++) {
            C0678b bVar = this.f2358f[i];
            bVar.f2346a.f2328f = bVar.f2347b;
        }
    }

    /* renamed from: j */
    public final SolverVariable mo2746j(int i) {
        if (this.f2361i + 1 >= this.f2357e) {
            mo2750o();
        }
        SolverVariable a = mo2737a(SolverVariable.Type.ERROR);
        int i2 = this.f2354b + 1;
        this.f2354b = i2;
        this.f2361i++;
        a.f2325c = i2;
        a.f2327e = i;
        ((SolverVariable[]) this.f2364l.f20755e)[i2] = a;
        C0682d dVar = this.f2355c;
        dVar.f2371i.f2372a = a;
        Arrays.fill(a.f2331i, BitmapDescriptorFactory.HUE_RED);
        a.f2331i[a.f2327e] = 1.0f;
        dVar.mo2756j(a);
        return a;
    }

    /* renamed from: k */
    public final SolverVariable mo2747k(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f2361i + 1 >= this.f2357e) {
            mo2750o();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f2382i;
            if (solverVariable == null) {
                constraintAnchor.mo2770k();
                solverVariable = constraintAnchor.f2382i;
            }
            int i = solverVariable.f2325c;
            if (i == -1 || i > this.f2354b || ((SolverVariable[]) this.f2364l.f20755e)[i] == null) {
                if (i != -1) {
                    solverVariable.mo2710f();
                }
                int i2 = this.f2354b + 1;
                this.f2354b = i2;
                this.f2361i++;
                solverVariable.f2325c = i2;
                solverVariable.f2332j = SolverVariable.Type.UNRESTRICTED;
                ((SolverVariable[]) this.f2364l.f20755e)[i2] = solverVariable;
            }
        }
        return solverVariable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.constraintlayout.core.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.constraintlayout.core.C0678b mo2748l() {
        /*
            r6 = this;
            u0.a r0 = r6.f2364l
            java.lang.Object r1 = r0.f20753c
            u0.b r1 = (p267u0.C6675b) r1
            int r2 = r1.f20756b
            r3 = 0
            if (r2 <= 0) goto L_0x0018
            int r2 = r2 + -1
            java.lang.Object r4 = r1.f20757c
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = r4[r2]
            r4[r2] = r3
            r1.f20756b = r2
            goto L_0x0019
        L_0x0018:
            r5 = r3
        L_0x0019:
            androidx.constraintlayout.core.b r5 = (androidx.constraintlayout.core.C0678b) r5
            if (r5 != 0) goto L_0x0023
            androidx.constraintlayout.core.b r5 = new androidx.constraintlayout.core.b
            r5.<init>(r0)
            goto L_0x0030
        L_0x0023:
            r5.f2346a = r3
            androidx.constraintlayout.core.b$a r0 = r5.f2349d
            r0.clear()
            r0 = 0
            r5.f2347b = r0
            r0 = 0
            r5.f2350e = r0
        L_0x0030:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0680c.mo2748l():androidx.constraintlayout.core.b");
    }

    /* renamed from: m */
    public final SolverVariable mo2749m() {
        if (this.f2361i + 1 >= this.f2357e) {
            mo2750o();
        }
        SolverVariable a = mo2737a(SolverVariable.Type.SLACK);
        int i = this.f2354b + 1;
        this.f2354b = i;
        this.f2361i++;
        a.f2325c = i;
        ((SolverVariable[]) this.f2364l.f20755e)[i] = a;
        return a;
    }

    /* renamed from: o */
    public final void mo2750o() {
        int i = this.f2356d * 2;
        this.f2356d = i;
        this.f2358f = (C0678b[]) Arrays.copyOf(this.f2358f, i);
        C6674a aVar = this.f2364l;
        aVar.f20755e = (SolverVariable[]) Arrays.copyOf((SolverVariable[]) aVar.f20755e, this.f2356d);
        int i2 = this.f2356d;
        this.f2360h = new boolean[i2];
        this.f2357e = i2;
        this.f2363k = i2;
    }

    /* renamed from: p */
    public final void mo2751p() throws Exception {
        if (this.f2355c.mo2731e()) {
            mo2745i();
        } else if (this.f2359g) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f2362j) {
                    z = true;
                    break;
                } else if (!this.f2358f[i].f2350e) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo2752q(this.f2355c);
            } else {
                mo2745i();
            }
        } else {
            mo2752q(this.f2355c);
        }
    }

    /* renamed from: q */
    public final void mo2752q(C0682d dVar) throws Exception {
        float f;
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            int i3 = this.f2362j;
            f = BitmapDescriptorFactory.HUE_RED;
            i = 1;
            if (i2 >= i3) {
                z = false;
                break;
            }
            C0678b bVar = this.f2358f[i2];
            if (bVar.f2346a.f2332j != SolverVariable.Type.UNRESTRICTED && bVar.f2347b < BitmapDescriptorFactory.HUE_RED) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i4 = 0;
            while (!z2) {
                i4 += i;
                float f2 = Float.MAX_VALUE;
                int i5 = 0;
                int i6 = -1;
                int i7 = -1;
                int i8 = 0;
                while (i5 < this.f2362j) {
                    C0678b bVar2 = this.f2358f[i5];
                    if (bVar2.f2346a.f2332j != SolverVariable.Type.UNRESTRICTED && !bVar2.f2350e && bVar2.f2347b < f) {
                        int f3 = bVar2.f2349d.mo2720f();
                        int i9 = 0;
                        while (i9 < f3) {
                            SolverVariable b = bVar2.f2349d.mo2715b(i9);
                            float j = bVar2.f2349d.mo2724j(b);
                            if (j > f) {
                                for (int i11 = 0; i11 < 9; i11++) {
                                    float f4 = b.f2330h[i11] / j;
                                    if ((f4 < f2 && i11 == i8) || i11 > i8) {
                                        i7 = b.f2325c;
                                        i8 = i11;
                                        f2 = f4;
                                        i6 = i5;
                                    }
                                }
                            }
                            i9++;
                            f = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                    i5++;
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                if (i6 != -1) {
                    C0678b bVar3 = this.f2358f[i6];
                    bVar3.f2346a.f2326d = -1;
                    bVar3.mo2733g(((SolverVariable[]) this.f2364l.f20755e)[i7]);
                    SolverVariable solverVariable = bVar3.f2346a;
                    solverVariable.f2326d = i6;
                    solverVariable.mo2712h(this, bVar3);
                } else {
                    z2 = true;
                }
                if (i4 > this.f2361i / 2) {
                    z2 = true;
                }
                f = BitmapDescriptorFactory.HUE_RED;
                i = 1;
            }
        }
        mo2753r(dVar);
        mo2745i();
    }

    /* renamed from: r */
    public final void mo2753r(C0678b bVar) {
        for (int i = 0; i < this.f2361i; i++) {
            this.f2360h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 < this.f2361i * 2) {
                SolverVariable solverVariable = bVar.f2346a;
                if (solverVariable != null) {
                    this.f2360h[solverVariable.f2325c] = true;
                }
                SolverVariable a = bVar.mo2727a(this.f2360h);
                if (a != null) {
                    boolean[] zArr = this.f2360h;
                    int i3 = a.f2325c;
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                    } else {
                        return;
                    }
                }
                if (a != null) {
                    float f = Float.MAX_VALUE;
                    int i4 = -1;
                    for (int i5 = 0; i5 < this.f2362j; i5++) {
                        C0678b bVar2 = this.f2358f[i5];
                        if (bVar2.f2346a.f2332j != SolverVariable.Type.UNRESTRICTED && !bVar2.f2350e && bVar2.f2349d.mo2714a(a)) {
                            float j = bVar2.f2349d.mo2724j(a);
                            if (j < BitmapDescriptorFactory.HUE_RED) {
                                float f2 = (-bVar2.f2347b) / j;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    if (i4 > -1) {
                        C0678b bVar3 = this.f2358f[i4];
                        bVar3.f2346a.f2326d = -1;
                        bVar3.mo2733g(a);
                        SolverVariable solverVariable2 = bVar3.f2346a;
                        solverVariable2.f2326d = i4;
                        solverVariable2.mo2712h(this, bVar3);
                    }
                } else {
                    z = true;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: s */
    public final void mo2754s() {
        for (int i = 0; i < this.f2362j; i++) {
            C0678b bVar = this.f2358f[i];
            if (bVar != null) {
                ((C6675b) this.f2364l.f20753c).mo22845a(bVar);
            }
            this.f2358f[i] = null;
        }
    }

    /* renamed from: t */
    public final void mo2755t() {
        C6674a aVar;
        int i = 0;
        while (true) {
            aVar = this.f2364l;
            SolverVariable[] solverVariableArr = (SolverVariable[]) aVar.f20755e;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.mo2710f();
            }
            i++;
        }
        C6675b bVar = (C6675b) aVar.f20754d;
        SolverVariable[] solverVariableArr2 = this.f2365m;
        int i2 = this.f2366n;
        bVar.getClass();
        if (i2 > solverVariableArr2.length) {
            i2 = solverVariableArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            SolverVariable solverVariable2 = solverVariableArr2[i3];
            int i4 = bVar.f20756b;
            Object[] objArr = (Object[]) bVar.f20757c;
            if (i4 < objArr.length) {
                objArr[i4] = solverVariable2;
                bVar.f20756b = i4 + 1;
            }
        }
        this.f2366n = 0;
        Arrays.fill((SolverVariable[]) this.f2364l.f20755e, (Object) null);
        this.f2354b = 0;
        C0682d dVar = this.f2355c;
        dVar.f2370h = 0;
        dVar.f2347b = BitmapDescriptorFactory.HUE_RED;
        this.f2361i = 1;
        for (int i5 = 0; i5 < this.f2362j; i5++) {
            C0678b bVar2 = this.f2358f[i5];
        }
        mo2754s();
        this.f2362j = 0;
        this.f2367o = new C0678b(this.f2364l);
    }
}
