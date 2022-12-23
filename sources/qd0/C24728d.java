package qd0;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import hi0.C23529c0;
import hi0.C23533d0;
import hi0.C23534e;
import hi0.C23536e0;
import hi0.C23562t;
import java.io.IOException;
import rd0.C24791a;
import si0.C24898f;
import si0.C24902i;
import si0.C24905l;
import si0.C24911r;

/* renamed from: qd0.d */
public final class C24728d<T> implements C24725a<T> {

    /* renamed from: c */
    public static final /* synthetic */ int f62593c = 0;

    /* renamed from: a */
    public final C24791a<C23536e0, T> f62594a;

    /* renamed from: b */
    public C23534e f62595b;

    /* renamed from: qd0.d$a */
    public static final class C24729a extends C23536e0 {

        /* renamed from: c */
        public final C23536e0 f62596c;

        /* renamed from: d */
        public IOException f62597d;

        /* renamed from: qd0.d$a$a */
        public class C24730a extends C24905l {
            public C24730a(C24902i iVar) {
                super(iVar);
            }

            /* renamed from: m */
            public final long mo53601m(C24898f fVar, long j) throws IOException {
                try {
                    return super.mo53601m(fVar, j);
                } catch (IOException e) {
                    C24729a.this.f62597d = e;
                    throw e;
                }
            }
        }

        public C24729a(C23536e0 e0Var) {
            this.f62596c = e0Var;
        }

        public final void close() {
            this.f62596c.close();
        }

        /* renamed from: i */
        public final long mo53598i() {
            return this.f62596c.mo53598i();
        }

        /* renamed from: q */
        public final C23562t mo53599q() {
            return this.f62596c.mo53599q();
        }

        /* renamed from: t */
        public final C24902i mo53600t() {
            return C24911r.m62547c(new C24730a(this.f62596c.mo53600t()));
        }
    }

    /* renamed from: qd0.d$b */
    public static final class C24731b extends C23536e0 {

        /* renamed from: c */
        public final C23562t f62599c;

        /* renamed from: d */
        public final long f62600d;

        public C24731b(C23562t tVar, long j) {
            this.f62599c = tVar;
            this.f62600d = j;
        }

        /* renamed from: i */
        public final long mo53598i() {
            return this.f62600d;
        }

        /* renamed from: q */
        public final C23562t mo53599q() {
            return this.f62599c;
        }

        /* renamed from: t */
        public final C24902i mo53600t() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C24728d(C23534e eVar, C24791a<C23536e0, T> aVar) {
        this.f62595b = eVar;
        this.f62594a = aVar;
    }

    /* renamed from: b */
    public static C24732e m62218b(C23529c0 c0Var, C24791a aVar) throws IOException {
        C23536e0 e0Var = c0Var.f59416h;
        C23529c0.C23530a aVar2 = new C23529c0.C23530a(c0Var);
        aVar2.f59430g = new C24731b(e0Var.mo53599q(), e0Var.mo53598i());
        C23529c0 a = aVar2.mo58645a();
        int i = a.f59412d;
        if (i < 200 || i >= 300) {
            try {
                C24898f fVar = new C24898f();
                e0Var.mo53600t().mo61398W1(fVar);
                new C23533d0(e0Var.mo53599q(), e0Var.mo53598i(), fVar);
                if (!a.mo58644v()) {
                    return new C24732e(a, (Object) null);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } finally {
                e0Var.close();
            }
        } else if (i == 204 || i == 205) {
            e0Var.close();
            if (a.mo58644v()) {
                return new C24732e(a, (Object) null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } else {
            C24729a aVar3 = new C24729a(e0Var);
            try {
                Object a2 = aVar.mo61242a(aVar3);
                if (a.mo58644v()) {
                    return new C24732e(a, a2);
                }
                throw new IllegalArgumentException("rawResponse must be successful response");
            } catch (RuntimeException e) {
                IOException iOException = aVar3.f62597d;
                if (iOException == null) {
                    throw e;
                }
                throw iOException;
            }
        }
    }

    /* renamed from: a */
    public final C24732e<T> mo61216a() throws IOException {
        C23534e eVar;
        synchronized (this) {
            eVar = this.f62595b;
        }
        return m62218b(FirebasePerfOkHttpClient.execute(eVar), this.f62594a);
    }
}
