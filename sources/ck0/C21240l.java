package ck0;

import ck0.C21265q;
import com.amazonaws.http.HttpHeader;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import hi0.C23521b0;
import hi0.C23529c0;
import hi0.C23533d0;
import hi0.C23534e;
import hi0.C23536e0;
import hi0.C23538f;
import hi0.C23553o;
import hi0.C23558r;
import hi0.C23562t;
import hi0.C23563u;
import hi0.C23569w;
import hi0.C23571x;
import java.io.IOException;
import p358af.C13437d;
import si0.C24898f;
import si0.C24902i;
import si0.C24905l;
import si0.C24911r;

/* renamed from: ck0.l */
public final class C21240l<T> implements C21226b<T> {

    /* renamed from: b */
    public final C21271t<T, ?> f53184b;

    /* renamed from: c */
    public final Object[] f53185c;

    /* renamed from: d */
    public C23534e f53186d;

    /* renamed from: e */
    public Throwable f53187e;

    /* renamed from: f */
    public boolean f53188f;

    /* renamed from: ck0.l$a */
    public class C21241a implements C23538f {

        /* renamed from: b */
        public final /* synthetic */ C21229d f53189b;

        public C21241a(C21229d dVar) {
            this.f53189b = dVar;
        }

        /* renamed from: c */
        public final void mo5762c(C23534e eVar, IOException iOException) {
            try {
                this.f53189b.onFailure(iOException);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        /* renamed from: d */
        public final void mo5763d(C23534e eVar, C23529c0 c0Var) throws IOException {
            try {
                try {
                    this.f53189b.mo53591a(C21240l.this.mo53596g(c0Var));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: ck0.l$b */
    public static final class C21242b extends C23536e0 {

        /* renamed from: c */
        public final C23536e0 f53191c;

        /* renamed from: d */
        public IOException f53192d;

        /* renamed from: ck0.l$b$a */
        public class C21243a extends C24905l {
            public C21243a(C24902i iVar) {
                super(iVar);
            }

            /* renamed from: m */
            public final long mo53601m(C24898f fVar, long j) throws IOException {
                try {
                    return super.mo53601m(fVar, j);
                } catch (IOException e) {
                    C21242b.this.f53192d = e;
                    throw e;
                }
            }
        }

        public C21242b(C23536e0 e0Var) {
            this.f53191c = e0Var;
        }

        public final void close() {
            this.f53191c.close();
        }

        /* renamed from: i */
        public final long mo53598i() {
            return this.f53191c.mo53598i();
        }

        /* renamed from: q */
        public final C23562t mo53599q() {
            return this.f53191c.mo53599q();
        }

        /* renamed from: t */
        public final C24902i mo53600t() {
            return C24911r.m62547c(new C21243a(this.f53191c.mo53600t()));
        }
    }

    /* renamed from: ck0.l$c */
    public static final class C21244c extends C23536e0 {

        /* renamed from: c */
        public final C23562t f53194c;

        /* renamed from: d */
        public final long f53195d;

        public C21244c(C23562t tVar, long j) {
            this.f53194c = tVar;
            this.f53195d = j;
        }

        /* renamed from: i */
        public final long mo53598i() {
            return this.f53195d;
        }

        /* renamed from: q */
        public final C23562t mo53599q() {
            return this.f53194c;
        }

        /* renamed from: t */
        public final C24902i mo53600t() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C21240l(C21271t<T, ?> tVar, Object[] objArr) {
        this.f53184b = tVar;
        this.f53185c = objArr;
    }

    /* renamed from: C */
    public final C21267r<T> mo53584C() throws IOException {
        C23534e eVar;
        synchronized (this) {
            if (!this.f53188f) {
                this.f53188f = true;
                Throwable th = this.f53187e;
                if (th == null) {
                    eVar = this.f53186d;
                    if (eVar == null) {
                        try {
                            eVar = mo53595f();
                            this.f53186d = eVar;
                        } catch (IOException | RuntimeException e) {
                            this.f53187e = e;
                            throw e;
                        }
                    }
                } else if (th instanceof IOException) {
                    throw ((IOException) th);
                } else {
                    throw ((RuntimeException) th);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        return mo53596g(FirebasePerfOkHttpClient.execute(eVar));
    }

    /* renamed from: K0 */
    public final void mo53585K0(C21229d<T> dVar) {
        C23534e eVar;
        Throwable th;
        synchronized (this) {
            if (!this.f53188f) {
                this.f53188f = true;
                eVar = this.f53186d;
                th = this.f53187e;
                if (eVar == null && th == null) {
                    try {
                        C23534e f = mo53595f();
                        this.f53186d = f;
                        eVar = f;
                    } catch (Throwable th2) {
                        th = th2;
                        this.f53187e = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.onFailure(th);
        } else {
            FirebasePerfOkHttpClient.enqueue(eVar, new C21241a(dVar));
        }
    }

    public final C21226b clone() {
        return new C21240l(this.f53184b, this.f53185c);
    }

    /* renamed from: f */
    public final C23534e mo53595f() throws IOException {
        int i;
        C23558r rVar;
        C23558r.C23559a aVar;
        C21271t<T, ?> tVar = this.f53184b;
        Object[] objArr = this.f53185c;
        C21265q qVar = new C21265q(tVar.f53254e, tVar.f53252c, tVar.f53255f, tVar.f53256g, tVar.f53257h, tVar.f53258i, tVar.f53259j, tVar.f53260k);
        C21247o<?>[] oVarArr = tVar.f53261l;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        if (i == oVarArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                oVarArr[i2].mo53602a(qVar, objArr[i2]);
            }
            C23558r.C23559a aVar2 = qVar.f53220d;
            if (aVar2 != null) {
                rVar = aVar2.mo58707b();
            } else {
                C23558r rVar2 = qVar.f53218b;
                String str = qVar.f53219c;
                rVar2.getClass();
                try {
                    aVar = new C23558r.C23559a();
                    aVar.mo58708c(rVar2, str);
                } catch (IllegalArgumentException unused) {
                    aVar = null;
                }
                if (aVar != null) {
                    rVar = aVar.mo58707b();
                } else {
                    rVar = null;
                }
                if (rVar == null) {
                    StringBuilder k = C13555b.m33972k("Malformed URL. Base: ");
                    k.append(qVar.f53218b);
                    k.append(", Relative: ");
                    k.append(qVar.f53219c);
                    throw new IllegalArgumentException(k.toString());
                }
            }
            C21265q.C21266a aVar3 = qVar.f53226j;
            if (aVar3 == null) {
                C23553o.C23554a aVar4 = qVar.f53225i;
                if (aVar4 != null) {
                    aVar3 = new C23553o(aVar4.f59525a, aVar4.f59526b);
                } else {
                    C23563u.C23564a aVar5 = qVar.f53224h;
                    if (aVar5 != null) {
                        if (!aVar5.f59567c.isEmpty()) {
                            aVar3 = new C23563u(aVar5.f59565a, aVar5.f59566b, aVar5.f59567c);
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.");
                        }
                    } else if (qVar.f53223g) {
                        aVar3 = C23521b0.m57646c((C23562t) null, new byte[0]);
                    }
                }
            }
            C23562t tVar2 = qVar.f53222f;
            if (tVar2 != null) {
                if (aVar3 != null) {
                    aVar3 = new C21265q.C21266a(aVar3, tVar2);
                } else {
                    qVar.f53221e.f59644c.mo58690a(HttpHeader.CONTENT_TYPE, tVar2.f59553a);
                }
            }
            C23571x.C23572a aVar6 = qVar.f53221e;
            aVar6.mo58730d(rVar);
            aVar6.mo58728b(qVar.f53217a, aVar3);
            C23569w a = this.f53184b.f53250a.mo58647a(aVar6.mo58727a());
            if (a != null) {
                return a;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException(C13437d.m33707l(C25541a.m63887r("Argument count (", i, ") doesn't match expected count ("), oVarArr.length, ")"));
    }

    /* renamed from: g */
    public final C21267r<T> mo53596g(C23529c0 c0Var) throws IOException {
        C23536e0 e0Var = c0Var.f59416h;
        C23529c0.C23530a aVar = new C23529c0.C23530a(c0Var);
        aVar.f59430g = new C21244c(e0Var.mo53599q(), e0Var.mo53598i());
        C23529c0 a = aVar.mo58645a();
        int i = a.f59412d;
        if (i < 200 || i >= 300) {
            try {
                C24898f fVar = new C24898f();
                e0Var.mo53600t().mo61398W1(fVar);
                return C21267r.m49929a(new C23533d0(e0Var.mo53599q(), e0Var.mo53598i(), fVar), a);
            } finally {
                e0Var.close();
            }
        } else if (i == 204 || i == 205) {
            e0Var.close();
            return C21267r.m49930b(null, a);
        } else {
            C21242b bVar = new C21242b(e0Var);
            try {
                return C21267r.m49930b(this.f53184b.f53253d.convert(bVar), a);
            } catch (RuntimeException e) {
                IOException iOException = bVar.f53192d;
                if (iOException == null) {
                    throw e;
                }
                throw iOException;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z;
        synchronized (this) {
            C23534e eVar = this.f53186d;
            if (eVar == null || !((C23569w) eVar).isCanceled()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final Object m65755clone() throws CloneNotSupportedException {
        return new C21240l(this.f53184b, this.f53185c);
    }
}
