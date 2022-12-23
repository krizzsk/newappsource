package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22736yk;
import com.veriff.sdk.internal.C22757yu;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p001a0.C0016g;

public final class aad implements C22799zu {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C22746yp f53300a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C22788zm f53301b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final abk f53302c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final abj f53303d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f53304e = 0;

    /* renamed from: f */
    private long f53305f = 262144;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C22736yk f53306g;

    /* renamed from: com.veriff.sdk.internal.aad$a */
    public abstract class C21280a implements aca {

        /* renamed from: a */
        public final abo f53307a;

        /* renamed from: b */
        public boolean f53308b;

        private C21280a() {
            this.f53307a = new abo(aad.this.f53302c.mo53672a());
        }

        /* renamed from: a */
        public acb mo53672a() {
            return this.f53307a;
        }

        /* renamed from: b */
        public final void mo53673b() {
            if (aad.this.f53304e != 6) {
                if (aad.this.f53304e == 5) {
                    aad.this.m49982a(this.f53307a);
                    int unused = aad.this.f53304e = 6;
                    return;
                }
                StringBuilder k = C13555b.m33972k("state: ");
                k.append(aad.this.f53304e);
                throw new IllegalStateException(k.toString());
            }
        }

        /* renamed from: a */
        public long mo53671a(abi abi, long j) throws IOException {
            try {
                return aad.this.f53302c.mo53671a(abi, j);
            } catch (IOException e) {
                aad.this.f53301b.mo57512a();
                mo53673b();
                throw e;
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.aad$b */
    public final class C21281b implements abz {

        /* renamed from: b */
        private final abo f53311b;

        /* renamed from: c */
        private boolean f53312c;

        public C21281b() {
            this.f53311b = new abo(aad.this.f53303d.mo53674a());
        }

        /* renamed from: a */
        public acb mo53674a() {
            return this.f53311b;
        }

        /* renamed from: a_ */
        public void mo53675a_(abi abi, long j) throws IOException {
            if (this.f53312c) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                aad.this.f53303d.mo53907l(j);
                aad.this.f53303d.mo53870b("\r\n");
                aad.this.f53303d.mo53675a_(abi, j);
                aad.this.f53303d.mo53870b("\r\n");
            }
        }

        public synchronized void close() throws IOException {
            if (!this.f53312c) {
                this.f53312c = true;
                aad.this.f53303d.mo53870b("0\r\n\r\n");
                aad.this.m49982a(this.f53311b);
                int unused = aad.this.f53304e = 3;
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f53312c) {
                aad.this.f53303d.flush();
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.aad$c */
    public class C21282c extends C21280a {

        /* renamed from: e */
        private final C22738yl f53314e;

        /* renamed from: f */
        private long f53315f = -1;

        /* renamed from: g */
        private boolean f53316g = true;

        public C21282c(C22738yl ylVar) {
            super();
            this.f53314e = ylVar;
        }

        /* renamed from: c */
        private void m50010c() throws IOException {
            if (this.f53315f != -1) {
                aad.this.f53302c.mo53916s();
            }
            try {
                this.f53315f = aad.this.f53302c.mo53912p();
                String trim = aad.this.f53302c.mo53916s().trim();
                if (this.f53315f < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f53315f + trim + "\"");
                } else if (this.f53315f == 0) {
                    this.f53316g = false;
                    aad aad = aad.this;
                    C22736yk unused = aad.f53306g = aad.m49988f();
                    C22802zw.m56028a(aad.this.f53300a.mo57348h(), this.f53314e, aad.this.f53306g);
                    mo53673b();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        /* renamed from: a */
        public long mo53671a(abi abi, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
            } else if (this.f53308b) {
                throw new IllegalStateException("closed");
            } else if (!this.f53316g) {
                return -1;
            } else {
                long j2 = this.f53315f;
                if (j2 == 0 || j2 == -1) {
                    m50010c();
                    if (!this.f53316g) {
                        return -1;
                    }
                }
                long a = super.mo53671a(abi, Math.min(j, this.f53315f));
                if (a != -1) {
                    this.f53315f -= a;
                    return a;
                }
                aad.this.f53301b.mo57512a();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo53673b();
                throw protocolException;
            }
        }

        public void close() throws IOException {
            if (!this.f53308b) {
                if (this.f53316g && !C22766za.m55837a((aca) this, 100, TimeUnit.MILLISECONDS)) {
                    aad.this.f53301b.mo57512a();
                    mo53673b();
                }
                this.f53308b = true;
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.aad$d */
    public class C21283d extends C21280a {

        /* renamed from: e */
        private long f53318e;

        public C21283d(long j) {
            super();
            this.f53318e = j;
            if (j == 0) {
                mo53673b();
            }
        }

        /* renamed from: a */
        public long mo53671a(abi abi, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
            } else if (!this.f53308b) {
                long j2 = this.f53318e;
                if (j2 == 0) {
                    return -1;
                }
                long a = super.mo53671a(abi, Math.min(j2, j));
                if (a != -1) {
                    long j3 = this.f53318e - a;
                    this.f53318e = j3;
                    if (j3 == 0) {
                        mo53673b();
                    }
                    return a;
                }
                aad.this.f53301b.mo57512a();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo53673b();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.f53308b) {
                if (this.f53318e != 0 && !C22766za.m55837a((aca) this, 100, TimeUnit.MILLISECONDS)) {
                    aad.this.f53301b.mo57512a();
                    mo53673b();
                }
                this.f53308b = true;
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.aad$e */
    public final class C21284e implements abz {

        /* renamed from: b */
        private final abo f53320b;

        /* renamed from: c */
        private boolean f53321c;

        private C21284e() {
            this.f53320b = new abo(aad.this.f53303d.mo53674a());
        }

        /* renamed from: a */
        public acb mo53674a() {
            return this.f53320b;
        }

        /* renamed from: a_ */
        public void mo53675a_(abi abi, long j) throws IOException {
            if (!this.f53321c) {
                C22766za.m55833a(abi.mo53864b(), 0, j);
                aad.this.f53303d.mo53675a_(abi, j);
                return;
            }
            throw new IllegalStateException("closed");
        }

        public void close() throws IOException {
            if (!this.f53321c) {
                this.f53321c = true;
                aad.this.m49982a(this.f53320b);
                int unused = aad.this.f53304e = 3;
            }
        }

        public void flush() throws IOException {
            if (!this.f53321c) {
                aad.this.f53303d.flush();
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.aad$f */
    public class C21285f extends C21280a {

        /* renamed from: e */
        private boolean f53322e;

        private C21285f(aad aad) {
            super();
        }

        /* renamed from: a */
        public long mo53671a(abi abi, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
            } else if (this.f53308b) {
                throw new IllegalStateException("closed");
            } else if (this.f53322e) {
                return -1;
            } else {
                long a = super.mo53671a(abi, j);
                if (a != -1) {
                    return a;
                }
                this.f53322e = true;
                mo53673b();
                return -1;
            }
        }

        public void close() throws IOException {
            if (!this.f53308b) {
                if (!this.f53322e) {
                    mo53673b();
                }
                this.f53308b = true;
            }
        }
    }

    public aad(C22746yp ypVar, C22788zm zmVar, abk abk, abj abj) {
        this.f53300a = ypVar;
        this.f53301b = zmVar;
        this.f53302c = abk;
        this.f53303d = abj;
    }

    /* renamed from: h */
    private abz m49992h() {
        if (this.f53304e == 1) {
            this.f53304e = 2;
            return new C21284e();
        }
        StringBuilder k = C13555b.m33972k("state: ");
        k.append(this.f53304e);
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: i */
    private aca m49993i() {
        if (this.f53304e == 4) {
            this.f53304e = 5;
            this.f53301b.mo57512a();
            return new C21285f();
        }
        StringBuilder k = C13555b.m33972k("state: ");
        k.append(this.f53304e);
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: e */
    private String m49987e() throws IOException {
        String f = this.f53302c.mo53889f(this.f53305f);
        this.f53305f -= (long) f.length();
        return f;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public C22736yk m49988f() throws IOException {
        C22736yk.C22737a aVar = new C22736yk.C22737a();
        while (true) {
            String e = m49987e();
            if (e.length() == 0) {
                return aVar.mo57277a();
            }
            C22763yy.f57691a.mo57371a(aVar, e);
        }
    }

    /* renamed from: g */
    private abz m49990g() {
        if (this.f53304e == 1) {
            this.f53304e = 2;
            return new C21281b();
        }
        StringBuilder k = C13555b.m33972k("state: ");
        k.append(this.f53304e);
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: b */
    public aca mo53666b(C22757yu yuVar) {
        if (!C22802zw.m56035d(yuVar)) {
            return m49978a(0);
        }
        if ("chunked".equalsIgnoreCase(yuVar.mo57415a("Transfer-Encoding"))) {
            return m49979a(yuVar.mo57414a().mo57390a());
        }
        long a = C22802zw.m56025a(yuVar);
        if (a != -1) {
            return m49978a(a);
        }
        return m49993i();
    }

    /* renamed from: c */
    public void mo53668c() throws IOException {
        this.f53303d.flush();
    }

    /* renamed from: d */
    public void mo53670d() {
        C22788zm zmVar = this.f53301b;
        if (zmVar != null) {
            zmVar.mo57519c();
        }
    }

    /* renamed from: c */
    public void mo53669c(C22757yu yuVar) throws IOException {
        long a = C22802zw.m56025a(yuVar);
        if (a != -1) {
            aca a2 = m49978a(a);
            C22766za.m55847b(a2, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            a2.close();
        }
    }

    /* renamed from: a */
    public C22788zm mo53663a() {
        return this.f53301b;
    }

    /* renamed from: a */
    public abz mo53661a(C22752ys ysVar, long j) throws IOException {
        if (ysVar.mo57396d() != null && ysVar.mo57396d().mo57412c()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if ("chunked".equalsIgnoreCase(ysVar.mo57392a("Transfer-Encoding"))) {
            return m49990g();
        } else {
            if (j != -1) {
                return m49992h();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    /* renamed from: b */
    public void mo53667b() throws IOException {
        this.f53303d.flush();
    }

    /* renamed from: a */
    public void mo53665a(C22752ys ysVar) throws IOException {
        mo53664a(ysVar.mo57395c(), aaa.m49967a(ysVar, this.f53301b.mo57518b().mo57450b().type()));
    }

    /* renamed from: a */
    public long mo53660a(C22757yu yuVar) {
        if (!C22802zw.m56035d(yuVar)) {
            return 0;
        }
        if ("chunked".equalsIgnoreCase(yuVar.mo57415a("Transfer-Encoding"))) {
            return -1;
        }
        return C22802zw.m56025a(yuVar);
    }

    /* renamed from: a */
    public void mo53664a(C22736yk ykVar, String str) throws IOException {
        if (this.f53304e == 0) {
            this.f53303d.mo53870b(str).mo53870b("\r\n");
            int a = ykVar.mo57265a();
            for (int i = 0; i < a; i++) {
                this.f53303d.mo53870b(ykVar.mo57266a(i)).mo53870b(": ").mo53870b(ykVar.mo57269b(i)).mo53870b("\r\n");
            }
            this.f53303d.mo53870b("\r\n");
            this.f53304e = 1;
            return;
        }
        StringBuilder k = C13555b.m33972k("state: ");
        k.append(this.f53304e);
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: a */
    public C22757yu.C22758a mo53662a(boolean z) throws IOException {
        int i = this.f53304e;
        if (i == 1 || i == 3) {
            try {
                aac a = aac.m49975a(m49987e());
                C22757yu.C22758a a2 = new C22757yu.C22758a().mo57437a(a.f53297a).mo57433a(a.f53298b).mo57441a(a.f53299c).mo57436a(m49988f());
                if (z && a.f53298b == 100) {
                    return null;
                }
                if (a.f53298b == 100) {
                    this.f53304e = 3;
                    return a2;
                }
                this.f53304e = 4;
                return a2;
            } catch (EOFException e) {
                C22788zm zmVar = this.f53301b;
                throw new IOException(C25541a.m63881k("unexpected end of stream on ", zmVar != null ? zmVar.mo57518b().mo57449a().mo57137a().mo57303p() : "unknown"), e);
            }
        } else {
            StringBuilder k = C13555b.m33972k("state: ");
            k.append(this.f53304e);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: a */
    private aca m49978a(long j) {
        if (this.f53304e == 4) {
            this.f53304e = 5;
            return new C21283d(j);
        }
        StringBuilder k = C13555b.m33972k("state: ");
        k.append(this.f53304e);
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: a */
    private aca m49979a(C22738yl ylVar) {
        if (this.f53304e == 4) {
            this.f53304e = 5;
            return new C21282c(ylVar);
        }
        StringBuilder k = C13555b.m33972k("state: ");
        k.append(this.f53304e);
        throw new IllegalStateException(k.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49982a(abo abo) {
        acb a = abo.mo53955a();
        abo.mo53954a(acb.f53608c);
        a.mo53959f();
        a.mo53962p_();
    }
}
