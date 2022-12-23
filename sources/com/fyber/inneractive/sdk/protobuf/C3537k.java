package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3534j0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.k */
public final class C3537k implements C3493e1 {

    /* renamed from: a */
    public final C3529j f12501a;

    /* renamed from: b */
    public int f12502b;

    /* renamed from: c */
    public int f12503c;

    /* renamed from: d */
    public int f12504d = 0;

    public C3537k(C3529j jVar) {
        C3529j jVar2 = (C3529j) C3609z.m9638a(jVar, "input");
        this.f12501a = jVar2;
        jVar2.f12475d = this;
    }

    /* renamed from: a */
    public <T> T mo14829a(Class<T> cls, C3562q qVar) throws IOException {
        mo15044b(3);
        return mo15045c(C3481b1.f12402c.mo14786a(cls), qVar);
    }

    /* renamed from: b */
    public final void mo15044b(int i) throws IOException {
        int i2 = this.f12502b;
        int i3 = C3584t1.f12572a;
        if ((i2 & 7) != i) {
            throw C3476a0.m8730d();
        }
    }

    /* renamed from: c */
    public final <T> T mo15045c(C3498f1<T> f1Var, C3562q qVar) throws IOException {
        int i = this.f12503c;
        this.f12503c = C3584t1.m9573a(this.f12502b >>> 3, 4);
        try {
            T a = f1Var.mo14890a();
            f1Var.mo14891a(a, this, qVar);
            f1Var.mo14898c(a);
            if (this.f12502b == this.f12503c) {
                return a;
            }
            throw C3476a0.m8733g();
        } finally {
            this.f12503c = i;
        }
    }

    /* renamed from: d */
    public int mo14840d() throws IOException {
        mo15044b(0);
        return this.f12501a.mo15002k();
    }

    /* renamed from: e */
    public int mo14842e() {
        return this.f12502b;
    }

    /* renamed from: f */
    public long mo14844f() throws IOException {
        mo15044b(0);
        return this.f12501a.mo15013v();
    }

    /* renamed from: g */
    public long mo14846g() throws IOException {
        mo15044b(1);
        return this.f12501a.mo15000i();
    }

    /* renamed from: h */
    public double mo14848h() throws IOException {
        mo15044b(1);
        return this.f12501a.mo14997f();
    }

    /* renamed from: i */
    public boolean mo14851i() throws IOException {
        int i;
        if (this.f12501a.mo14992c() || (i = this.f12502b) == this.f12503c) {
            return false;
        }
        return this.f12501a.mo14996e(i);
    }

    /* renamed from: j */
    public int mo14852j() throws IOException {
        mo15044b(0);
        return this.f12501a.mo15007p();
    }

    /* renamed from: k */
    public float mo14854k() throws IOException {
        mo15044b(5);
        return this.f12501a.mo15001j();
    }

    /* renamed from: l */
    public long mo14856l() throws IOException {
        mo15044b(0);
        return this.f12501a.mo15008q();
    }

    /* renamed from: m */
    public int mo14858m() throws IOException {
        mo15044b(5);
        return this.f12501a.mo15005n();
    }

    /* renamed from: n */
    public String mo14860n() throws IOException {
        mo15044b(2);
        return this.f12501a.mo15009r();
    }

    /* renamed from: o */
    public long mo14862o() throws IOException {
        mo15044b(0);
        return this.f12501a.mo15003l();
    }

    /* renamed from: p */
    public String mo14864p() throws IOException {
        mo15044b(2);
        return this.f12501a.mo15010s();
    }

    /* renamed from: q */
    public int mo14866q() throws IOException {
        mo15044b(5);
        return this.f12501a.mo14999h();
    }

    /* renamed from: r */
    public boolean mo14868r() throws IOException {
        mo15044b(0);
        return this.f12501a.mo14994d();
    }

    /* renamed from: s */
    public int mo14869s() throws IOException {
        int i = this.f12504d;
        if (i != 0) {
            this.f12502b = i;
            this.f12504d = 0;
        } else {
            this.f12502b = this.f12501a.mo15011t();
        }
        int i2 = this.f12502b;
        if (i2 == 0 || i2 == this.f12503c) {
            return Integer.MAX_VALUE;
        }
        int i3 = C3584t1.f12572a;
        return i2 >>> 3;
    }

    /* renamed from: t */
    public long mo14870t() throws IOException {
        mo15044b(1);
        return this.f12501a.mo15006o();
    }

    /* renamed from: e */
    public void mo14843e(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3607y) {
            C3607y yVar = (C3607y) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 2) {
                int u = this.f12501a.mo15012u();
                mo15046c(u);
                int b = this.f12501a.mo14990b() + u;
                do {
                    yVar.mo15242c(this.f12501a.mo14999h());
                } while (this.f12501a.mo14990b() < b);
            } else if (i3 == 5) {
                do {
                    yVar.mo15242c(this.f12501a.mo14999h());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 2) {
                int u2 = this.f12501a.mo15012u();
                mo15046c(u2);
                int b2 = this.f12501a.mo14990b() + u2;
                do {
                    list.add(Integer.valueOf(this.f12501a.mo14999h()));
                } while (this.f12501a.mo14990b() < b2);
            } else if (i6 == 5) {
                do {
                    list.add(Integer.valueOf(this.f12501a.mo14999h()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: b */
    public <T> T mo14835b(Class<T> cls, C3562q qVar) throws IOException {
        mo15044b(2);
        return mo15047d(C3481b1.f12402c.mo14786a(cls), qVar);
    }

    /* renamed from: d */
    public final <T> T mo15047d(C3498f1<T> f1Var, C3562q qVar) throws IOException {
        int u = this.f12501a.mo15012u();
        C3529j jVar = this.f12501a;
        if (jVar.f12472a < jVar.f12473b) {
            int d = jVar.mo14993d(u);
            T a = f1Var.mo14890a();
            this.f12501a.f12472a++;
            f1Var.mo14891a(a, this, qVar);
            f1Var.mo14898c(a);
            this.f12501a.mo14987a(0);
            C3529j jVar2 = this.f12501a;
            jVar2.f12472a--;
            jVar2.mo14991c(d);
            return a;
        }
        throw C3476a0.m8734h();
    }

    /* renamed from: f */
    public void mo14845f(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3607y) {
            C3607y yVar = (C3607y) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 2) {
                int u = this.f12501a.mo15012u();
                mo15046c(u);
                int b = this.f12501a.mo14990b() + u;
                do {
                    yVar.mo15242c(this.f12501a.mo15005n());
                } while (this.f12501a.mo14990b() < b);
            } else if (i3 == 5) {
                do {
                    yVar.mo15242c(this.f12501a.mo15005n());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 2) {
                int u2 = this.f12501a.mo15012u();
                mo15046c(u2);
                int b2 = this.f12501a.mo14990b() + u2;
                do {
                    list.add(Integer.valueOf(this.f12501a.mo15005n()));
                } while (this.f12501a.mo14990b() < b2);
            } else if (i6 == 5) {
                do {
                    list.add(Integer.valueOf(this.f12501a.mo15005n()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: g */
    public void mo14847g(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3506h0) {
            C3506h0 h0Var = (C3506h0) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    h0Var.mo14915a(this.f12501a.mo15008q());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else if (i3 == 2) {
                int b = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    h0Var.mo14915a(this.f12501a.mo15008q());
                } while (this.f12501a.mo14990b() < b);
                mo15042a(b);
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Long.valueOf(this.f12501a.mo15008q()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else if (i6 == 2) {
                int b2 = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    list.add(Long.valueOf(this.f12501a.mo15008q()));
                } while (this.f12501a.mo14990b() < b2);
                mo15042a(b2);
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: h */
    public void mo14849h(List<C3508i> list) throws IOException {
        int t;
        int i = this.f12502b;
        int i2 = C3584t1.f12572a;
        if ((i & 7) == 2) {
            do {
                list.add(mo14827a());
                if (!this.f12501a.mo14992c()) {
                    t = this.f12501a.mo15011t();
                } else {
                    return;
                }
            } while (t == this.f12502b);
            this.f12504d = t;
            return;
        }
        throw C3476a0.m8730d();
    }

    /* renamed from: i */
    public void mo14850i(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3607y) {
            C3607y yVar = (C3607y) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    yVar.mo15242c(this.f12501a.mo15012u());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else if (i3 == 2) {
                int b = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    yVar.mo15242c(this.f12501a.mo15012u());
                } while (this.f12501a.mo14990b() < b);
                mo15042a(b);
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f12501a.mo15012u()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else if (i6 == 2) {
                int b2 = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    list.add(Integer.valueOf(this.f12501a.mo15012u()));
                } while (this.f12501a.mo14990b() < b2);
                mo15042a(b2);
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: j */
    public void mo14853j(List<Double> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3551n) {
            C3551n nVar = (C3551n) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 1) {
                do {
                    nVar.mo15124a(this.f12501a.mo14997f());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else if (i3 == 2) {
                int u = this.f12501a.mo15012u();
                mo15048d(u);
                int b = this.f12501a.mo14990b() + u;
                do {
                    nVar.mo15124a(this.f12501a.mo14997f());
                } while (this.f12501a.mo14990b() < b);
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 1) {
                do {
                    list.add(Double.valueOf(this.f12501a.mo14997f()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else if (i6 == 2) {
                int u2 = this.f12501a.mo15012u();
                mo15048d(u2);
                int b2 = this.f12501a.mo14990b() + u2;
                do {
                    list.add(Double.valueOf(this.f12501a.mo14997f()));
                } while (this.f12501a.mo14990b() < b2);
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: k */
    public void mo14855k(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3506h0) {
            C3506h0 h0Var = (C3506h0) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    h0Var.mo14915a(this.f12501a.mo15003l());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else if (i3 == 2) {
                int b = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    h0Var.mo14915a(this.f12501a.mo15003l());
                } while (this.f12501a.mo14990b() < b);
                mo15042a(b);
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Long.valueOf(this.f12501a.mo15003l()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else if (i6 == 2) {
                int b2 = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    list.add(Long.valueOf(this.f12501a.mo15003l()));
                } while (this.f12501a.mo14990b() < b2);
                mo15042a(b2);
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: l */
    public void mo14857l(List<Boolean> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3499g) {
            C3499g gVar = (C3499g) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    gVar.mo14900a(this.f12501a.mo14994d());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else if (i3 == 2) {
                int b = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    gVar.mo14900a(this.f12501a.mo14994d());
                } while (this.f12501a.mo14990b() < b);
                mo15042a(b);
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f12501a.mo14994d()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else if (i6 == 2) {
                int b2 = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    list.add(Boolean.valueOf(this.f12501a.mo14994d()));
                } while (this.f12501a.mo14990b() < b2);
                mo15042a(b2);
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: m */
    public void mo14859m(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3506h0) {
            C3506h0 h0Var = (C3506h0) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 1) {
                do {
                    h0Var.mo14915a(this.f12501a.mo15006o());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else if (i3 == 2) {
                int u = this.f12501a.mo15012u();
                mo15048d(u);
                int b = this.f12501a.mo14990b() + u;
                do {
                    h0Var.mo14915a(this.f12501a.mo15006o());
                } while (this.f12501a.mo14990b() < b);
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 1) {
                do {
                    list.add(Long.valueOf(this.f12501a.mo15006o()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else if (i6 == 2) {
                int u2 = this.f12501a.mo15012u();
                mo15048d(u2);
                int b2 = this.f12501a.mo14990b() + u2;
                do {
                    list.add(Long.valueOf(this.f12501a.mo15006o()));
                } while (this.f12501a.mo14990b() < b2);
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: n */
    public void mo14861n(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3506h0) {
            C3506h0 h0Var = (C3506h0) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 1) {
                do {
                    h0Var.mo14915a(this.f12501a.mo15000i());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else if (i3 == 2) {
                int u = this.f12501a.mo15012u();
                mo15048d(u);
                int b = this.f12501a.mo14990b() + u;
                do {
                    h0Var.mo14915a(this.f12501a.mo15000i());
                } while (this.f12501a.mo14990b() < b);
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 1) {
                do {
                    list.add(Long.valueOf(this.f12501a.mo15000i()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else if (i6 == 2) {
                int u2 = this.f12501a.mo15012u();
                mo15048d(u2);
                int b2 = this.f12501a.mo14990b() + u2;
                do {
                    list.add(Long.valueOf(this.f12501a.mo15000i()));
                } while (this.f12501a.mo14990b() < b2);
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: o */
    public void mo14863o(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3607y) {
            C3607y yVar = (C3607y) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    yVar.mo15242c(this.f12501a.mo15002k());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else if (i3 == 2) {
                int b = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    yVar.mo15242c(this.f12501a.mo15002k());
                } while (this.f12501a.mo14990b() < b);
                mo15042a(b);
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f12501a.mo15002k()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else if (i6 == 2) {
                int b2 = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    list.add(Integer.valueOf(this.f12501a.mo15002k()));
                } while (this.f12501a.mo14990b() < b2);
                mo15042a(b2);
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: p */
    public void mo14865p(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3607y) {
            C3607y yVar = (C3607y) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    yVar.mo15242c(this.f12501a.mo14998g());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else if (i3 == 2) {
                int b = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    yVar.mo15242c(this.f12501a.mo14998g());
                } while (this.f12501a.mo14990b() < b);
                mo15042a(b);
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f12501a.mo14998g()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else if (i6 == 2) {
                int b2 = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    list.add(Integer.valueOf(this.f12501a.mo14998g()));
                } while (this.f12501a.mo14990b() < b2);
                mo15042a(b2);
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: q */
    public void mo14867q(List<String> list) throws IOException {
        mo15043a(list, false);
    }

    /* renamed from: a */
    public <T> T mo14828a(C3498f1<T> f1Var, C3562q qVar) throws IOException {
        mo15044b(3);
        return mo15045c(f1Var, qVar);
    }

    /* renamed from: a */
    public C3508i mo14827a() throws IOException {
        mo15044b(2);
        return this.f12501a.mo14995e();
    }

    /* renamed from: b */
    public <T> T mo14834b(C3498f1<T> f1Var, C3562q qVar) throws IOException {
        mo15044b(2);
        return mo15047d(f1Var, qVar);
    }

    /* renamed from: a */
    public void mo14830a(List<Long> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3506h0) {
            C3506h0 h0Var = (C3506h0) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    h0Var.mo14915a(this.f12501a.mo15013v());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else if (i3 == 2) {
                int b = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    h0Var.mo14915a(this.f12501a.mo15013v());
                } while (this.f12501a.mo14990b() < b);
                mo15042a(b);
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Long.valueOf(this.f12501a.mo15013v()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else if (i6 == 2) {
                int b2 = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    list.add(Long.valueOf(this.f12501a.mo15013v()));
                } while (this.f12501a.mo14990b() < b2);
                mo15042a(b2);
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: b */
    public int mo14833b() throws IOException {
        mo15044b(0);
        return this.f12501a.mo14998g();
    }

    /* renamed from: b */
    public void mo14836b(List<String> list) throws IOException {
        mo15043a(list, true);
    }

    /* renamed from: b */
    public <T> void mo14837b(List<T> list, C3498f1<T> f1Var, C3562q qVar) throws IOException {
        int t;
        int i = this.f12502b;
        int i2 = C3584t1.f12572a;
        if ((i & 7) == 2) {
            do {
                list.add(mo15047d(f1Var, qVar));
                if (!this.f12501a.mo14992c() && this.f12504d == 0) {
                    t = this.f12501a.mo15011t();
                } else {
                    return;
                }
            } while (t == i);
            this.f12504d = t;
            return;
        }
        throw C3476a0.m8730d();
    }

    /* renamed from: c */
    public int mo14838c() throws IOException {
        mo15044b(0);
        return this.f12501a.mo15012u();
    }

    /* renamed from: c */
    public void mo14839c(List<Integer> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3607y) {
            C3607y yVar = (C3607y) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 0) {
                do {
                    yVar.mo15242c(this.f12501a.mo15007p());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else if (i3 == 2) {
                int b = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    yVar.mo15242c(this.f12501a.mo15007p());
                } while (this.f12501a.mo14990b() < b);
                mo15042a(b);
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 0) {
                do {
                    list.add(Integer.valueOf(this.f12501a.mo15007p()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else if (i6 == 2) {
                int b2 = this.f12501a.mo14990b() + this.f12501a.mo15012u();
                do {
                    list.add(Integer.valueOf(this.f12501a.mo15007p()));
                } while (this.f12501a.mo14990b() < b2);
                mo15042a(b2);
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: d */
    public void mo14841d(List<Float> list) throws IOException {
        int t;
        int t2;
        if (list instanceof C3603w) {
            C3603w wVar = (C3603w) list;
            int i = this.f12502b;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            if (i3 == 2) {
                int u = this.f12501a.mo15012u();
                mo15046c(u);
                int b = this.f12501a.mo14990b() + u;
                do {
                    wVar.mo15230a(this.f12501a.mo15001j());
                } while (this.f12501a.mo14990b() < b);
            } else if (i3 == 5) {
                do {
                    wVar.mo15230a(this.f12501a.mo15001j());
                    if (!this.f12501a.mo14992c()) {
                        t2 = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t2 == this.f12502b);
                this.f12504d = t2;
            } else {
                throw C3476a0.m8730d();
            }
        } else {
            int i4 = this.f12502b;
            int i5 = C3584t1.f12572a;
            int i6 = i4 & 7;
            if (i6 == 2) {
                int u2 = this.f12501a.mo15012u();
                mo15046c(u2);
                int b2 = this.f12501a.mo14990b() + u2;
                do {
                    list.add(Float.valueOf(this.f12501a.mo15001j()));
                } while (this.f12501a.mo14990b() < b2);
            } else if (i6 == 5) {
                do {
                    list.add(Float.valueOf(this.f12501a.mo15001j()));
                    if (!this.f12501a.mo14992c()) {
                        t = this.f12501a.mo15011t();
                    } else {
                        return;
                    }
                } while (t == this.f12502b);
                this.f12504d = t;
            } else {
                throw C3476a0.m8730d();
            }
        }
    }

    /* renamed from: a */
    public void mo15043a(List<String> list, boolean z) throws IOException {
        int t;
        int t2;
        int i = this.f12502b;
        int i2 = C3584t1.f12572a;
        if ((i & 7) != 2) {
            throw C3476a0.m8730d();
        } else if (!(list instanceof C3497f0) || z) {
            do {
                list.add(z ? mo14864p() : mo14860n());
                if (!this.f12501a.mo14992c()) {
                    t = this.f12501a.mo15011t();
                } else {
                    return;
                }
            } while (t == this.f12502b);
            this.f12504d = t;
        } else {
            C3497f0 f0Var = (C3497f0) list;
            do {
                f0Var.mo14821a(mo14827a());
                if (!this.f12501a.mo14992c()) {
                    t2 = this.f12501a.mo15011t();
                } else {
                    return;
                }
            } while (t2 == this.f12502b);
            this.f12504d = t2;
        }
    }

    /* renamed from: c */
    public final void mo15046c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C3476a0.m8733g();
        }
    }

    /* renamed from: d */
    public final void mo15048d(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C3476a0.m8733g();
        }
    }

    /* renamed from: a */
    public <T> void mo14831a(List<T> list, C3498f1<T> f1Var, C3562q qVar) throws IOException {
        int t;
        int i = this.f12502b;
        int i2 = C3584t1.f12572a;
        if ((i & 7) == 3) {
            do {
                list.add(mo15045c(f1Var, qVar));
                if (!this.f12501a.mo14992c() && this.f12504d == 0) {
                    t = this.f12501a.mo15011t();
                } else {
                    return;
                }
            } while (t == i);
            this.f12504d = t;
            return;
        }
        throw C3476a0.m8730d();
    }

    /* renamed from: a */
    public <K, V> void mo14832a(Map<K, V> map, C3534j0.C3535a<K, V> aVar, C3562q qVar) throws IOException {
        mo15044b(2);
        this.f12501a.mo14993d(this.f12501a.mo15012u());
        throw null;
    }

    /* renamed from: a */
    public final void mo15042a(int i) throws IOException {
        if (this.f12501a.mo14990b() != i) {
            throw C3476a0.m8735i();
        }
    }
}
