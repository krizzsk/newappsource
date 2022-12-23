package mi0;

import hi0.C23529c0;
import hi0.C23556q;
import hi0.C23558r;
import hi0.C23566v;
import hi0.C23571x;
import ii0.C23607a;
import ii0.C23610d;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import ki0.C23799e;
import li0.C24315c;
import li0.C24318e;
import li0.C24321h;
import li0.C24323j;
import mf0.C24362h;
import p001a0.C0016g;
import si0.C24887a0;
import si0.C24893c0;
import si0.C24895d0;
import si0.C24898f;
import si0.C24901h;
import si0.C24902i;
import si0.C24906m;

/* renamed from: mi0.a */
public final class C24388a implements C24315c {

    /* renamed from: a */
    public final C23566v f61731a;

    /* renamed from: b */
    public final C23799e f61732b;

    /* renamed from: c */
    public final C24902i f61733c;

    /* renamed from: d */
    public final C24901h f61734d;

    /* renamed from: e */
    public int f61735e = 0;

    /* renamed from: f */
    public long f61736f = 262144;

    /* renamed from: g */
    public C23556q f61737g;

    /* renamed from: mi0.a$a */
    public abstract class C24389a implements C24893c0 {

        /* renamed from: b */
        public final C24906m f61738b;

        /* renamed from: c */
        public boolean f61739c;

        public C24389a() {
            this.f61738b = new C24906m(C24388a.this.f61733c.mo58974E());
        }

        /* renamed from: E */
        public final C24895d0 mo58974E() {
            return this.f61738b;
        }

        /* renamed from: e */
        public final void mo60536e() {
            C24388a aVar = C24388a.this;
            int i = aVar.f61735e;
            if (i != 6) {
                if (i == 5) {
                    C24388a.m61358i(aVar, this.f61738b);
                    C24388a.this.f61735e = 6;
                    return;
                }
                StringBuilder k = C13555b.m33972k("state: ");
                k.append(C24388a.this.f61735e);
                throw new IllegalStateException(k.toString());
            }
        }

        /* renamed from: m */
        public long mo53601m(C24898f fVar, long j) throws IOException {
            try {
                return C24388a.this.f61733c.mo53601m(fVar, j);
            } catch (IOException e) {
                C24388a.this.f61732b.mo59042h();
                mo60536e();
                throw e;
            }
        }
    }

    /* renamed from: mi0.a$b */
    public final class C24390b implements C24887a0 {

        /* renamed from: b */
        public final C24906m f61741b;

        /* renamed from: c */
        public boolean f61742c;

        public C24390b() {
            this.f61741b = new C24906m(C24388a.this.f61734d.mo60537E());
        }

        /* renamed from: E */
        public final C24895d0 mo60537E() {
            return this.f61741b;
        }

        /* renamed from: P */
        public final void mo58998P(C24898f fVar, long j) throws IOException {
            if (this.f61742c) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C24388a.this.f61734d.mo61378E1(j);
                C24388a.this.f61734d.mo61387Q("\r\n");
                C24388a.this.f61734d.mo58998P(fVar, j);
                C24388a.this.f61734d.mo61387Q("\r\n");
            }
        }

        public final synchronized void close() throws IOException {
            if (!this.f61742c) {
                this.f61742c = true;
                C24388a.this.f61734d.mo61387Q("0\r\n\r\n");
                C24388a.m61358i(C24388a.this, this.f61741b);
                C24388a.this.f61735e = 3;
            }
        }

        public final synchronized void flush() throws IOException {
            if (!this.f61742c) {
                C24388a.this.f61734d.flush();
            }
        }
    }

    /* renamed from: mi0.a$c */
    public class C24391c extends C24389a {

        /* renamed from: e */
        public final C23558r f61744e;

        /* renamed from: f */
        public long f61745f = -1;

        /* renamed from: g */
        public boolean f61746g = true;

        public C24391c(C23558r rVar) {
            super();
            this.f61744e = rVar;
        }

        public final void close() throws IOException {
            boolean z;
            if (!this.f61739c) {
                if (this.f61746g) {
                    try {
                        z = C23610d.m57810r(this, 100, TimeUnit.MILLISECONDS);
                    } catch (IOException unused) {
                        z = false;
                    }
                    if (!z) {
                        C24388a.this.f61732b.mo59042h();
                        mo60536e();
                    }
                }
                this.f61739c = true;
            }
        }

        /* renamed from: m */
        public final long mo53601m(C24898f fVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
            } else if (this.f61739c) {
                throw new IllegalStateException("closed");
            } else if (!this.f61746g) {
                return -1;
            } else {
                long j2 = this.f61745f;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        C24388a.this.f61733c.mo61440z0();
                    }
                    try {
                        this.f61745f = C24388a.this.f61733c.mo61409f2();
                        String trim = C24388a.this.f61733c.mo61440z0().trim();
                        if (this.f61745f < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f61745f + trim + "\"");
                        }
                        if (this.f61745f == 0) {
                            this.f61746g = false;
                            C24388a aVar = C24388a.this;
                            aVar.f61737g = aVar.mo60534k();
                            C24388a aVar2 = C24388a.this;
                            C24318e.m61059d(aVar2.f61731a.f59583j, this.f61744e, aVar2.f61737g);
                            mo60536e();
                        }
                        if (!this.f61746g) {
                            return -1;
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long m = super.mo53601m(fVar, Math.min(j, this.f61745f));
                if (m != -1) {
                    this.f61745f -= m;
                    return m;
                }
                C24388a.this.f61732b.mo59042h();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo60536e();
                throw protocolException;
            }
        }
    }

    /* renamed from: mi0.a$d */
    public class C24392d extends C24389a {

        /* renamed from: e */
        public long f61748e;

        public C24392d(long j) {
            super();
            this.f61748e = j;
            if (j == 0) {
                mo60536e();
            }
        }

        public final void close() throws IOException {
            boolean z;
            if (!this.f61739c) {
                if (this.f61748e != 0) {
                    try {
                        z = C23610d.m57810r(this, 100, TimeUnit.MILLISECONDS);
                    } catch (IOException unused) {
                        z = false;
                    }
                    if (!z) {
                        C24388a.this.f61732b.mo59042h();
                        mo60536e();
                    }
                }
                this.f61739c = true;
            }
        }

        /* renamed from: m */
        public final long mo53601m(C24898f fVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
            } else if (!this.f61739c) {
                long j2 = this.f61748e;
                if (j2 == 0) {
                    return -1;
                }
                long m = super.mo53601m(fVar, Math.min(j2, j));
                if (m != -1) {
                    long j3 = this.f61748e - m;
                    this.f61748e = j3;
                    if (j3 == 0) {
                        mo60536e();
                    }
                    return m;
                }
                C24388a.this.f61732b.mo59042h();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo60536e();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* renamed from: mi0.a$e */
    public final class C24393e implements C24887a0 {

        /* renamed from: b */
        public final C24906m f61750b;

        /* renamed from: c */
        public boolean f61751c;

        public C24393e() {
            this.f61750b = new C24906m(C24388a.this.f61734d.mo60537E());
        }

        /* renamed from: E */
        public final C24895d0 mo60537E() {
            return this.f61750b;
        }

        /* renamed from: P */
        public final void mo58998P(C24898f fVar, long j) throws IOException {
            if (!this.f61751c) {
                long j2 = fVar.f62947c;
                byte[] bArr = C23610d.f59684a;
                if ((0 | j) < 0 || 0 > j2 || j2 - 0 < j) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                C24388a.this.f61734d.mo58998P(fVar, j);
                return;
            }
            throw new IllegalStateException("closed");
        }

        public final void close() throws IOException {
            if (!this.f61751c) {
                this.f61751c = true;
                C24388a.m61358i(C24388a.this, this.f61750b);
                C24388a.this.f61735e = 3;
            }
        }

        public final void flush() throws IOException {
            if (!this.f61751c) {
                C24388a.this.f61734d.flush();
            }
        }
    }

    /* renamed from: mi0.a$f */
    public class C24394f extends C24389a {

        /* renamed from: e */
        public boolean f61753e;

        public C24394f(C24388a aVar) {
            super();
        }

        public final void close() throws IOException {
            if (!this.f61739c) {
                if (!this.f61753e) {
                    mo60536e();
                }
                this.f61739c = true;
            }
        }

        /* renamed from: m */
        public final long mo53601m(C24898f fVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
            } else if (this.f61739c) {
                throw new IllegalStateException("closed");
            } else if (this.f61753e) {
                return -1;
            } else {
                long m = super.mo53601m(fVar, j);
                if (m != -1) {
                    return m;
                }
                this.f61753e = true;
                mo60536e();
                return -1;
            }
        }
    }

    public C24388a(C23566v vVar, C23799e eVar, C24902i iVar, C24901h hVar) {
        this.f61731a = vVar;
        this.f61732b = eVar;
        this.f61733c = iVar;
        this.f61734d = hVar;
    }

    /* renamed from: i */
    public static void m61358i(C24388a aVar, C24906m mVar) {
        aVar.getClass();
        C24895d0 d0Var = mVar.f62955e;
        C24895d0.C24896a aVar2 = C24895d0.f62942d;
        C24362h.m61211f(aVar2, "delegate");
        mVar.f62955e = aVar2;
        d0Var.mo61367a();
        d0Var.mo61368b();
    }

    /* renamed from: a */
    public final void mo60454a() throws IOException {
        this.f61734d.flush();
    }

    /* renamed from: b */
    public final long mo60455b(C23529c0 c0Var) {
        if (!C24318e.m61057b(c0Var)) {
            return 0;
        }
        if ("chunked".equalsIgnoreCase(c0Var.mo58641r("Transfer-Encoding"))) {
            return -1;
        }
        return C24318e.m61056a(c0Var);
    }

    /* renamed from: c */
    public final C24887a0 mo60456c(C23571x xVar, long j) throws IOException {
        if ("chunked".equalsIgnoreCase(xVar.mo58725a("Transfer-Encoding"))) {
            if (this.f61735e == 1) {
                this.f61735e = 2;
                return new C24390b();
            }
            StringBuilder k = C13555b.m33972k("state: ");
            k.append(this.f61735e);
            throw new IllegalStateException(k.toString());
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f61735e == 1) {
            this.f61735e = 2;
            return new C24393e();
        } else {
            StringBuilder k2 = C13555b.m33972k("state: ");
            k2.append(this.f61735e);
            throw new IllegalStateException(k2.toString());
        }
    }

    public final void cancel() {
        C23799e eVar = this.f61732b;
        if (eVar != null) {
            C23610d.m57797e(eVar.f60118d);
        }
    }

    /* renamed from: d */
    public final void mo60458d(C23571x xVar) throws IOException {
        boolean z;
        Proxy.Type type = this.f61732b.f60117c.f59462b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(xVar.f59637b);
        sb.append(' ');
        if (xVar.f59636a.f59534a.equals("https") || type != Proxy.Type.HTTP) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            sb.append(xVar.f59636a);
        } else {
            sb.append(C24321h.m61067a(xVar.f59636a));
        }
        sb.append(" HTTP/1.1");
        mo60535l(xVar.f59638c, sb.toString());
    }

    /* renamed from: e */
    public final C23529c0.C23530a mo60459e(boolean z) throws IOException {
        String str;
        int i = this.f61735e;
        if (i == 1 || i == 3) {
            C23558r.C23559a aVar = null;
            try {
                String u = this.f61733c.mo61429u(this.f61736f);
                this.f61736f -= (long) u.length();
                C24323j a = C24323j.m61070a(u);
                C23529c0.C23530a aVar2 = new C23529c0.C23530a();
                aVar2.f59425b = a.f61628a;
                aVar2.f59426c = a.f61629b;
                aVar2.f59427d = a.f61630c;
                aVar2.f59429f = mo60534k().mo58684e();
                if (z && a.f61629b == 100) {
                    return null;
                }
                if (a.f61629b == 100) {
                    this.f61735e = 3;
                    return aVar2;
                }
                this.f61735e = 4;
                return aVar2;
            } catch (EOFException e) {
                C23799e eVar = this.f61732b;
                if (eVar != null) {
                    C23558r rVar = eVar.f60117c.f59461a.f59369a;
                    rVar.getClass();
                    try {
                        C23558r.C23559a aVar3 = new C23558r.C23559a();
                        aVar3.mo58708c(rVar, "/...");
                        aVar = aVar3;
                    } catch (IllegalArgumentException unused) {
                    }
                    aVar.getClass();
                    aVar.f59544b = C23558r.m57722b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                    aVar.f59545c = C23558r.m57722b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                    str = aVar.mo58707b().f59542i;
                } else {
                    str = "unknown";
                }
                throw new IOException(C25541a.m63881k("unexpected end of stream on ", str), e);
            }
        } else {
            StringBuilder k = C13555b.m33972k("state: ");
            k.append(this.f61735e);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: f */
    public final C23799e mo60460f() {
        return this.f61732b;
    }

    /* renamed from: g */
    public final void mo60461g() throws IOException {
        this.f61734d.flush();
    }

    /* renamed from: h */
    public final C24893c0 mo60462h(C23529c0 c0Var) {
        if (!C24318e.m61057b(c0Var)) {
            return mo60533j(0);
        }
        if ("chunked".equalsIgnoreCase(c0Var.mo58641r("Transfer-Encoding"))) {
            C23558r rVar = c0Var.f59410b.f59636a;
            if (this.f61735e == 4) {
                this.f61735e = 5;
                return new C24391c(rVar);
            }
            StringBuilder k = C13555b.m33972k("state: ");
            k.append(this.f61735e);
            throw new IllegalStateException(k.toString());
        }
        long a = C24318e.m61056a(c0Var);
        if (a != -1) {
            return mo60533j(a);
        }
        if (this.f61735e == 4) {
            this.f61735e = 5;
            this.f61732b.mo59042h();
            return new C24394f(this);
        }
        StringBuilder k2 = C13555b.m33972k("state: ");
        k2.append(this.f61735e);
        throw new IllegalStateException(k2.toString());
    }

    /* renamed from: j */
    public final C24392d mo60533j(long j) {
        if (this.f61735e == 4) {
            this.f61735e = 5;
            return new C24392d(j);
        }
        StringBuilder k = C13555b.m33972k("state: ");
        k.append(this.f61735e);
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: k */
    public final C23556q mo60534k() throws IOException {
        C23556q.C23557a aVar = new C23556q.C23557a();
        while (true) {
            String u = this.f61733c.mo61429u(this.f61736f);
            this.f61736f -= (long) u.length();
            if (u.length() == 0) {
                return new C23556q(aVar);
            }
            C23607a.f59680a.getClass();
            aVar.mo58691b(u);
        }
    }

    /* renamed from: l */
    public final void mo60535l(C23556q qVar, String str) throws IOException {
        if (this.f61735e == 0) {
            this.f61734d.mo61387Q(str).mo61387Q("\r\n");
            int length = qVar.f59531a.length / 2;
            for (int i = 0; i < length; i++) {
                this.f61734d.mo61387Q(qVar.mo58683d(i)).mo61387Q(": ").mo61387Q(qVar.mo58686g(i)).mo61387Q("\r\n");
            }
            this.f61734d.mo61387Q("\r\n");
            this.f61735e = 1;
            return;
        }
        StringBuilder k = C13555b.m33972k("state: ");
        k.append(this.f61735e);
        throw new IllegalStateException(k.toString());
    }
}
