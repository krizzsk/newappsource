package p099ga;

import android.os.Handler;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import p039c7.C1801d;
import p099ga.C4879e1;
import p100gb.C4987o;
import p112ha.C5196m0;
import p113hb.C5213a;
import p583jk.C17875h;

/* renamed from: ga.n0 */
public final class C4918n0 {

    /* renamed from: a */
    public final C4879e1.C4881b f16632a = new C4879e1.C4881b();

    /* renamed from: b */
    public final C4879e1.C4882c f16633b = new C4879e1.C4882c();

    /* renamed from: c */
    public final C5196m0 f16634c;

    /* renamed from: d */
    public final Handler f16635d;

    /* renamed from: e */
    public long f16636e;

    /* renamed from: f */
    public int f16637f;

    /* renamed from: g */
    public boolean f16638g;

    /* renamed from: h */
    public C4913l0 f16639h;

    /* renamed from: i */
    public C4913l0 f16640i;

    /* renamed from: j */
    public C4913l0 f16641j;

    /* renamed from: k */
    public int f16642k;

    /* renamed from: l */
    public Object f16643l;

    /* renamed from: m */
    public long f16644m;

    public C4918n0(C5196m0 m0Var, Handler handler) {
        this.f16634c = m0Var;
        this.f16635d = handler;
    }

    /* renamed from: m */
    public static C4987o.C4988a m12466m(C4879e1 e1Var, Object obj, long j, long j2, C4879e1.C4881b bVar) {
        Object obj2 = obj;
        long j3 = j;
        C4879e1 e1Var2 = e1Var;
        C4879e1.C4881b bVar2 = bVar;
        e1Var.mo20346g(obj2, bVar2);
        C5213a aVar = bVar2.f16421g;
        long j4 = bVar2.f16418d;
        int length = aVar.f17304c.length - 1;
        while (length >= 0) {
            boolean z = false;
            if (j3 != Long.MIN_VALUE) {
                long j5 = aVar.f17304c[length];
                if (j5 != Long.MIN_VALUE ? j3 < j5 : !(j4 != -9223372036854775807L && j3 >= j4)) {
                    z = true;
                }
            }
            if (!z) {
                break;
            }
            length--;
        }
        if (length < 0 || !aVar.f17305d[length].mo20994b()) {
            length = -1;
        }
        if (length == -1) {
            return new C4987o.C4988a(obj2, j2, bVar2.mo20466b(j3));
        }
        long j6 = j2;
        return new C4987o.C4988a(obj, length, bVar2.mo20467c(length), j2);
    }

    /* renamed from: a */
    public final C4913l0 mo20564a() {
        C4913l0 l0Var = this.f16639h;
        if (l0Var == null) {
            return null;
        }
        if (l0Var == this.f16640i) {
            this.f16640i = l0Var.f16619l;
        }
        l0Var.mo20558f();
        int i = this.f16642k - 1;
        this.f16642k = i;
        if (i == 0) {
            this.f16641j = null;
            C4913l0 l0Var2 = this.f16639h;
            this.f16643l = l0Var2.f16609b;
            this.f16644m = l0Var2.f16613f.f16623a.f16860d;
        }
        this.f16639h = this.f16639h.f16619l;
        mo20573j();
        return this.f16639h;
    }

    /* renamed from: b */
    public final void mo20565b() {
        if (this.f16642k != 0) {
            C4913l0 l0Var = this.f16639h;
            C17875h.m44306q(l0Var);
            this.f16643l = l0Var.f16609b;
            this.f16644m = l0Var.f16613f.f16623a.f16860d;
            while (l0Var != null) {
                l0Var.mo20558f();
                l0Var = l0Var.f16619l;
            }
            this.f16639h = null;
            this.f16641j = null;
            this.f16640i = null;
            this.f16642k = 0;
            mo20573j();
        }
    }

    /* renamed from: c */
    public final C4916m0 mo20566c(C4879e1 e1Var, C4913l0 l0Var, long j) {
        long j2;
        C4879e1 e1Var2 = e1Var;
        C4913l0 l0Var2 = l0Var;
        C4916m0 m0Var = l0Var2.f16613f;
        long j3 = (l0Var2.f16622o + m0Var.f16627e) - j;
        long j4 = 0;
        if (m0Var.f16628f) {
            int d = e1Var.mo20456d(e1Var2.mo20342b(m0Var.f16623a.f16857a), this.f16632a, this.f16633b, this.f16637f, this.f16638g);
            if (d == -1) {
                return null;
            }
            int i = e1Var2.mo20345f(d, this.f16632a, true).f16417c;
            Object obj = this.f16632a.f16416b;
            long j5 = m0Var.f16623a.f16860d;
            if (e1Var2.mo20462m(i, this.f16633b).f16438o == d) {
                Pair<Object, Long> j6 = e1Var.mo20461j(this.f16633b, this.f16632a, i, -9223372036854775807L, Math.max(0, j3));
                if (j6 == null) {
                    return null;
                }
                obj = j6.first;
                long longValue = ((Long) j6.second).longValue();
                C4913l0 l0Var3 = l0Var2.f16619l;
                if (l0Var3 == null || !l0Var3.f16609b.equals(obj)) {
                    j5 = this.f16636e;
                    this.f16636e = 1 + j5;
                } else {
                    j5 = l0Var3.f16613f.f16623a.f16860d;
                }
                j2 = longValue;
                j4 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return mo20567d(e1Var, m12466m(e1Var, obj, j2, j5, this.f16632a), j4, j2);
        }
        C4987o.C4988a aVar = m0Var.f16623a;
        e1Var2.mo20346g(aVar.f16857a, this.f16632a);
        if (aVar.mo20688a()) {
            int i2 = aVar.f16858b;
            C5213a.C5214a aVar2 = this.f16632a.f16421g.f17305d[i2];
            int i3 = aVar2.f17308a;
            if (i3 == -1) {
                return null;
            }
            int a = aVar2.mo20993a(aVar.f16859c);
            if (a < i3) {
                return mo20568e(e1Var, aVar.f16857a, i2, a, m0Var.f16625c, aVar.f16860d);
            }
            long j7 = m0Var.f16625c;
            if (j7 == -9223372036854775807L) {
                C4879e1.C4882c cVar = this.f16633b;
                C4879e1.C4881b bVar = this.f16632a;
                Pair<Object, Long> j8 = e1Var.mo20461j(cVar, bVar, bVar.f16417c, -9223372036854775807L, Math.max(0, j3));
                if (j8 == null) {
                    return null;
                }
                j7 = ((Long) j8.second).longValue();
            }
            return mo20569f(e1Var, aVar.f16857a, j7, m0Var.f16625c, aVar.f16860d);
        }
        int c = this.f16632a.mo20467c(aVar.f16861e);
        C4879e1.C4881b bVar2 = this.f16632a;
        int i4 = aVar.f16861e;
        if (c == bVar2.f16421g.f17305d[i4].f17308a) {
            Object obj2 = aVar.f16857a;
            long j9 = m0Var.f16627e;
            return mo20569f(e1Var, obj2, j9, j9, aVar.f16860d);
        }
        return mo20568e(e1Var, aVar.f16857a, i4, c, m0Var.f16627e, aVar.f16860d);
    }

    /* renamed from: d */
    public final C4916m0 mo20567d(C4879e1 e1Var, C4987o.C4988a aVar, long j, long j2) {
        C4987o.C4988a aVar2 = aVar;
        C4879e1 e1Var2 = e1Var;
        e1Var.mo20346g(aVar2.f16857a, this.f16632a);
        if (aVar.mo20688a()) {
            return mo20568e(e1Var, aVar2.f16857a, aVar2.f16858b, aVar2.f16859c, j, aVar2.f16860d);
        }
        return mo20569f(e1Var, aVar2.f16857a, j2, j, aVar2.f16860d);
    }

    /* renamed from: e */
    public final C4916m0 mo20568e(C4879e1 e1Var, Object obj, int i, int i2, long j, long j2) {
        long j3;
        long j4;
        int i3 = i;
        int i4 = i2;
        C4987o.C4988a aVar = new C4987o.C4988a(obj, i, i2, j2);
        long a = e1Var.mo20346g(obj, this.f16632a).mo20465a(i3, i4);
        if (i4 == this.f16632a.mo20467c(i3)) {
            j3 = this.f16632a.f16421g.f17306e;
        } else {
            j3 = 0;
        }
        if (a == -9223372036854775807L || j3 < a) {
            j4 = j3;
        } else {
            j4 = Math.max(0, a - 1);
        }
        return new C4916m0(aVar, j4, j, -9223372036854775807L, a, false, false, false);
    }

    /* renamed from: f */
    public final C4916m0 mo20569f(C4879e1 e1Var, Object obj, long j, long j2, long j3) {
        boolean z;
        long j4;
        long j5;
        C4879e1 e1Var2 = e1Var;
        Object obj2 = obj;
        long j6 = j;
        e1Var2.mo20346g(obj2, this.f16632a);
        int b = this.f16632a.mo20466b(j6);
        C4987o.C4988a aVar = new C4987o.C4988a(obj2, j3, b);
        if (aVar.mo20688a() || b != -1) {
            z = false;
        } else {
            z = true;
        }
        boolean i = mo20572i(e1Var2, aVar);
        boolean h = mo20571h(e1Var2, aVar, z);
        if (b != -1) {
            j4 = this.f16632a.f16421g.f17304c[b];
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) {
            j5 = this.f16632a.f16418d;
        } else {
            j5 = j4;
        }
        if (j5 != -9223372036854775807L && j6 >= j5) {
            j6 = Math.max(0, j5 - 1);
        }
        return new C4916m0(aVar, j6, j2, j4, j5, z, i, h);
    }

    /* renamed from: g */
    public final C4916m0 mo20570g(C4879e1 e1Var, C4916m0 m0Var) {
        boolean z;
        long j;
        C4987o.C4988a aVar = m0Var.f16623a;
        if (aVar.mo20688a() || aVar.f16861e != -1) {
            z = false;
        } else {
            z = true;
        }
        boolean i = mo20572i(e1Var, aVar);
        boolean h = mo20571h(e1Var, aVar, z);
        e1Var.mo20346g(m0Var.f16623a.f16857a, this.f16632a);
        if (aVar.mo20688a()) {
            j = this.f16632a.mo20465a(aVar.f16858b, aVar.f16859c);
        } else {
            j = m0Var.f16626d;
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                j = this.f16632a.f16418d;
            }
        }
        return new C4916m0(aVar, m0Var.f16624b, m0Var.f16625c, m0Var.f16626d, j, z, i, h);
    }

    /* renamed from: h */
    public final boolean mo20571h(C4879e1 e1Var, C4987o.C4988a aVar, boolean z) {
        boolean z2;
        int b = e1Var.mo20342b(aVar.f16857a);
        if (e1Var.mo20462m(e1Var.mo20345f(b, this.f16632a, false).f16417c, this.f16633b).f16432i) {
            return false;
        }
        if (e1Var.mo20456d(b, this.f16632a, this.f16633b, this.f16637f, this.f16638g) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo20572i(C4879e1 e1Var, C4987o.C4988a aVar) {
        boolean z;
        if (aVar.mo20688a() || aVar.f16861e != -1) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        int i = e1Var.mo20346g(aVar.f16857a, this.f16632a).f16417c;
        if (e1Var.mo20462m(i, this.f16633b).f16439p == e1Var.mo20342b(aVar.f16857a)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo20573j() {
        C4987o.C4988a aVar;
        if (this.f16634c != null) {
            int i = ImmutableList.f36196c;
            ImmutableList.C14367a aVar2 = new ImmutableList.C14367a();
            for (C4913l0 l0Var = this.f16639h; l0Var != null; l0Var = l0Var.f16619l) {
                aVar2.mo43128b(l0Var.f16613f.f16623a);
            }
            C4913l0 l0Var2 = this.f16640i;
            if (l0Var2 == null) {
                aVar = null;
            } else {
                aVar = l0Var2.f16613f.f16623a;
            }
            this.f16635d.post(new C1801d(1, this, aVar2, aVar));
        }
    }

    /* renamed from: k */
    public final boolean mo20574k(C4913l0 l0Var) {
        boolean z;
        boolean z2 = false;
        if (l0Var != null) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        if (l0Var.equals(this.f16641j)) {
            return false;
        }
        this.f16641j = l0Var;
        while (true) {
            l0Var = l0Var.f16619l;
            if (l0Var == null) {
                break;
            }
            if (l0Var == this.f16640i) {
                this.f16640i = this.f16639h;
                z2 = true;
            }
            l0Var.mo20558f();
            this.f16642k--;
        }
        C4913l0 l0Var2 = this.f16641j;
        if (l0Var2.f16619l != null) {
            l0Var2.mo20554b();
            l0Var2.f16619l = null;
            l0Var2.mo20555c();
        }
        mo20573j();
        return z2;
    }

    /* renamed from: l */
    public final C4987o.C4988a mo20575l(C4879e1 e1Var, Object obj, long j) {
        long j2;
        int b;
        int i = e1Var.mo20346g(obj, this.f16632a).f16417c;
        Object obj2 = this.f16643l;
        if (obj2 == null || (b = e1Var.mo20342b(obj2)) == -1 || e1Var.mo20345f(b, this.f16632a, false).f16417c != i) {
            C4913l0 l0Var = this.f16639h;
            while (true) {
                if (l0Var == null) {
                    C4913l0 l0Var2 = this.f16639h;
                    while (true) {
                        if (l0Var2 != null) {
                            int b2 = e1Var.mo20342b(l0Var2.f16609b);
                            if (b2 != -1 && e1Var.mo20345f(b2, this.f16632a, false).f16417c == i) {
                                j2 = l0Var2.f16613f.f16623a.f16860d;
                                break;
                            }
                            l0Var2 = l0Var2.f16619l;
                        } else {
                            j2 = this.f16636e;
                            this.f16636e = 1 + j2;
                            if (this.f16639h == null) {
                                this.f16643l = obj;
                                this.f16644m = j2;
                            }
                        }
                    }
                } else if (l0Var.f16609b.equals(obj)) {
                    j2 = l0Var.f16613f.f16623a.f16860d;
                    break;
                } else {
                    l0Var = l0Var.f16619l;
                }
            }
        } else {
            j2 = this.f16644m;
        }
        return m12466m(e1Var, obj, j, j2, this.f16632a);
    }

    /* renamed from: n */
    public final boolean mo20576n(C4879e1 e1Var) {
        C4913l0 l0Var;
        C4913l0 l0Var2 = this.f16639h;
        if (l0Var2 == null) {
            return true;
        }
        int b = e1Var.mo20342b(l0Var2.f16609b);
        while (true) {
            b = e1Var.mo20456d(b, this.f16632a, this.f16633b, this.f16637f, this.f16638g);
            while (true) {
                l0Var = l0Var2.f16619l;
                if (l0Var != null && !l0Var2.f16613f.f16628f) {
                    l0Var2 = l0Var;
                }
            }
            if (b == -1 || l0Var == null || e1Var.mo20342b(l0Var.f16609b) != b) {
                boolean k = mo20574k(l0Var2);
                l0Var2.f16613f = mo20570g(e1Var, l0Var2.f16613f);
            } else {
                l0Var2 = l0Var;
            }
        }
        boolean k2 = mo20574k(l0Var2);
        l0Var2.f16613f = mo20570g(e1Var, l0Var2.f16613f);
        return !k2;
    }

    /* renamed from: o */
    public final boolean mo20577o(C4879e1 e1Var, long j, long j2) {
        C4916m0 m0Var;
        boolean z;
        long j3;
        boolean z2;
        boolean k;
        boolean z3;
        C4879e1 e1Var2 = e1Var;
        C4913l0 l0Var = null;
        for (C4913l0 l0Var2 = this.f16639h; l0Var2 != null; l0Var2 = l0Var2.f16619l) {
            C4916m0 m0Var2 = l0Var2.f16613f;
            if (l0Var == null) {
                m0Var = mo20570g(e1Var2, m0Var2);
                long j4 = j;
            } else {
                C4916m0 c = mo20566c(e1Var2, l0Var, j);
                if (c == null) {
                    k = mo20574k(l0Var);
                } else {
                    if (m0Var2.f16624b != c.f16624b || !m0Var2.f16623a.equals(c.f16623a)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        k = mo20574k(l0Var);
                    } else {
                        m0Var = c;
                    }
                }
                return !k;
            }
            l0Var2.f16613f = m0Var.mo20560a(m0Var2.f16625c);
            long j5 = m0Var2.f16627e;
            long j6 = m0Var.f16627e;
            if (j5 == -9223372036854775807L || j5 == j6) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (j6 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = l0Var2.f16622o + j6;
                }
                if (l0Var2 != this.f16640i || (j2 != Long.MIN_VALUE && j2 < j3)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (mo20574k(l0Var2) || z2) {
                    return false;
                }
                return true;
            }
            l0Var = l0Var2;
        }
        return true;
    }
}
