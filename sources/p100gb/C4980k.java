package p100gb;

import android.os.Handler;
import p099ga.C4879e1;
import p099ga.C4901j0;
import p100gb.C4969e;
import p100gb.C4987o;
import p113hb.C5213a;
import p265tb.C6658j;
import p265tb.C6671u;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: gb.k */
public final class C4980k extends C4969e<Void> {

    /* renamed from: j */
    public final C4987o f16837j;

    /* renamed from: k */
    public final boolean f16838k;

    /* renamed from: l */
    public final C4879e1.C4882c f16839l;

    /* renamed from: m */
    public final C4879e1.C4881b f16840m;

    /* renamed from: n */
    public C4981a f16841n;

    /* renamed from: o */
    public C4979j f16842o;

    /* renamed from: p */
    public boolean f16843p;

    /* renamed from: q */
    public boolean f16844q;

    /* renamed from: r */
    public boolean f16845r;

    /* renamed from: gb.k$a */
    public static final class C4981a extends C4975g {

        /* renamed from: e */
        public static final Object f16846e = new Object();

        /* renamed from: c */
        public final Object f16847c;

        /* renamed from: d */
        public final Object f16848d;

        public C4981a(C4879e1 e1Var, Object obj, Object obj2) {
            super(e1Var);
            this.f16847c = obj;
            this.f16848d = obj2;
        }

        /* renamed from: b */
        public final int mo20342b(Object obj) {
            Object obj2;
            C4879e1 e1Var = this.f16822b;
            if (f16846e.equals(obj) && (obj2 = this.f16848d) != null) {
                obj = obj2;
            }
            return e1Var.mo20342b(obj);
        }

        /* renamed from: f */
        public final C4879e1.C4881b mo20345f(int i, C4879e1.C4881b bVar, boolean z) {
            this.f16822b.mo20345f(i, bVar, z);
            if (C6774a0.m15941a(bVar.f16416b, this.f16848d) && z) {
                bVar.f16416b = f16846e;
            }
            return bVar;
        }

        /* renamed from: l */
        public final Object mo20348l(int i) {
            Object l = this.f16822b.mo20348l(i);
            if (C6774a0.m15941a(l, this.f16848d)) {
                return f16846e;
            }
            return l;
        }

        /* renamed from: n */
        public final C4879e1.C4882c mo20349n(int i, C4879e1.C4882c cVar, long j) {
            this.f16822b.mo20349n(i, cVar, j);
            if (C6774a0.m15941a(cVar.f16424a, this.f16847c)) {
                cVar.f16424a = C4879e1.C4882c.f16422r;
            }
            return cVar;
        }
    }

    /* renamed from: gb.k$b */
    public static final class C4982b extends C4879e1 {

        /* renamed from: b */
        public final C4901j0 f16849b;

        public C4982b(C4901j0 j0Var) {
            this.f16849b = j0Var;
        }

        /* renamed from: b */
        public final int mo20342b(Object obj) {
            return obj == C4981a.f16846e ? 0 : -1;
        }

        /* renamed from: f */
        public final C4879e1.C4881b mo20345f(int i, C4879e1.C4881b bVar, boolean z) {
            int i2;
            Object obj = null;
            if (z) {
                i2 = 0;
            } else {
                i2 = null;
            }
            if (z) {
                obj = C4981a.f16846e;
            }
            C5213a aVar = C5213a.f17301g;
            bVar.f16415a = i2;
            bVar.f16416b = obj;
            bVar.f16417c = 0;
            bVar.f16418d = -9223372036854775807L;
            bVar.f16419e = 0;
            bVar.f16421g = aVar;
            bVar.f16420f = true;
            return bVar;
        }

        /* renamed from: h */
        public final int mo20458h() {
            return 1;
        }

        /* renamed from: l */
        public final Object mo20348l(int i) {
            return C4981a.f16846e;
        }

        /* renamed from: n */
        public final C4879e1.C4882c mo20349n(int i, C4879e1.C4882c cVar, long j) {
            C4879e1.C4882c cVar2 = cVar;
            Object obj = C4879e1.C4882c.f16422r;
            cVar.mo20471b(this.f16849b, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (C4901j0.C4906e) null, 0, -9223372036854775807L, 0);
            C4879e1.C4882c cVar3 = cVar;
            cVar3.f16435l = true;
            return cVar3;
        }

        /* renamed from: o */
        public final int mo20463o() {
            return 1;
        }
    }

    public C4980k(C4987o oVar, boolean z) {
        boolean z2;
        this.f16837j = oVar;
        if (z) {
            oVar.mo20623l();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f16838k = z2;
        this.f16839l = new C4879e1.C4882c();
        this.f16840m = new C4879e1.C4881b();
        oVar.mo20624m();
        this.f16841n = new C4981a(new C4982b(oVar.mo20683c()), C4879e1.C4882c.f16422r, C4981a.f16846e);
    }

    /* renamed from: a */
    public final void mo20682a(C4984m mVar) {
        C4979j jVar = (C4979j) mVar;
        if (jVar.f16834f != null) {
            C4987o oVar = jVar.f16833e;
            oVar.getClass();
            oVar.mo20682a(jVar.f16834f);
        }
        if (mVar == this.f16842o) {
            this.f16842o = null;
        }
    }

    /* renamed from: c */
    public final C4901j0 mo20683c() {
        return this.f16837j.mo20683c();
    }

    /* renamed from: k */
    public final void mo20685k() {
    }

    /* renamed from: q */
    public final void mo20628q(C6671u uVar) {
        this.f16798i = uVar;
        this.f16797h = C6774a0.m15949i((Handler.Callback) null);
        if (!this.f16838k) {
            this.f16843p = true;
            mo20674s(this.f16837j);
        }
    }

    /* renamed from: r */
    public final void mo20629r() {
        this.f16844q = false;
        this.f16843p = false;
        for (C4969e.C4971b next : this.f16796g.values()) {
            next.f16803a.mo20616b(next.f16804b);
            next.f16803a.mo20618e(next.f16805c);
            next.f16803a.mo20622j(next.f16805c);
        }
        this.f16796g.clear();
    }

    /* renamed from: t */
    public final C4979j mo20684g(C4987o.C4988a aVar, C6658j jVar, long j) {
        boolean z;
        C4979j jVar2 = new C4979j(aVar, jVar, j);
        C4987o oVar = this.f16837j;
        if (jVar2.f16833e == null) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        jVar2.f16833e = oVar;
        if (this.f16844q) {
            Object obj = aVar.f16857a;
            if (this.f16841n.f16848d != null && obj.equals(C4981a.f16846e)) {
                obj = this.f16841n.f16848d;
            }
            C4987o.C4988a b = aVar.mo20691b(obj);
            long j2 = jVar2.mo20681j(j);
            C4987o oVar2 = jVar2.f16833e;
            oVar2.getClass();
            C4984m g = oVar2.mo20684g(b, jVar, j2);
            jVar2.f16834f = g;
            if (jVar2.f16835g != null) {
                g.mo20653c(jVar2, j2);
            }
        } else {
            this.f16842o = jVar2;
            if (!this.f16843p) {
                this.f16843p = true;
                mo20674s(this.f16837j);
            }
        }
        return jVar2;
    }

    /* renamed from: u */
    public final void mo20687u(long j) {
        C4979j jVar = this.f16842o;
        int b = this.f16841n.mo20342b(jVar.f16830b.f16857a);
        if (b != -1) {
            C4981a aVar = this.f16841n;
            C4879e1.C4881b bVar = this.f16840m;
            aVar.mo20345f(b, bVar, false);
            long j2 = bVar.f16418d;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            jVar.f16836h = j;
        }
    }
}
