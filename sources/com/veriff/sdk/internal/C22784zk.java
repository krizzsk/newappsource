package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import com.veriff.sdk.internal.C22757yu;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: com.veriff.sdk.internal.zk */
public final class C22784zk {

    /* renamed from: a */
    public final C22794zr f57768a;

    /* renamed from: b */
    public final C22713xw f57769b;

    /* renamed from: c */
    public final C22730yh f57770c;

    /* renamed from: d */
    public final C22787zl f57771d;

    /* renamed from: e */
    public final C22799zu f57772e;

    /* renamed from: f */
    private boolean f57773f;

    /* renamed from: com.veriff.sdk.internal.zk$a */
    public final class C22785a extends abm {

        /* renamed from: b */
        private boolean f57775b;

        /* renamed from: c */
        private long f57776c;

        /* renamed from: d */
        private long f57777d;

        /* renamed from: e */
        private boolean f57778e;

        public C22785a(abz abz, long j) {
            super(abz);
            this.f57776c = j;
        }

        /* renamed from: a */
        private IOException m55931a(IOException iOException) {
            if (this.f57775b) {
                return iOException;
            }
            this.f57775b = true;
            return C22784zk.this.mo57492a(this.f57777d, false, true, iOException);
        }

        /* renamed from: a_ */
        public void mo53675a_(abi abi, long j) throws IOException {
            if (!this.f57778e) {
                long j2 = this.f57776c;
                if (j2 == -1 || this.f57777d + j <= j2) {
                    try {
                        super.mo53675a_(abi, j);
                        this.f57777d += j;
                    } catch (IOException e) {
                        throw m55931a(e);
                    }
                } else {
                    StringBuilder k = C13555b.m33972k("expected ");
                    k.append(this.f57776c);
                    k.append(" bytes but received ");
                    k.append(this.f57777d + j);
                    throw new ProtocolException(k.toString());
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.f57778e) {
                this.f57778e = true;
                long j = this.f57776c;
                if (j == -1 || this.f57777d == j) {
                    try {
                        super.close();
                        m55931a((IOException) null);
                    } catch (IOException e) {
                        throw m55931a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw m55931a(e);
            }
        }
    }

    public C22784zk(C22794zr zrVar, C22713xw xwVar, C22730yh yhVar, C22787zl zlVar, C22799zu zuVar) {
        this.f57768a = zrVar;
        this.f57769b = xwVar;
        this.f57770c = yhVar;
        this.f57771d = zlVar;
        this.f57772e = zuVar;
    }

    /* renamed from: a */
    public C22788zm mo57491a() {
        return this.f57772e.mo53663a();
    }

    /* renamed from: b */
    public boolean mo57497b() {
        return this.f57773f;
    }

    /* renamed from: c */
    public void mo57498c() throws IOException {
        try {
            this.f57772e.mo53667b();
        } catch (IOException e) {
            this.f57770c.mo57239a(this.f57769b, e);
            mo57495a(e);
            throw e;
        }
    }

    /* renamed from: d */
    public void mo57499d() throws IOException {
        try {
            this.f57772e.mo53668c();
        } catch (IOException e) {
            this.f57770c.mo57239a(this.f57769b, e);
            mo57495a(e);
            throw e;
        }
    }

    /* renamed from: e */
    public void mo57500e() {
        this.f57770c.mo57252e(this.f57769b);
    }

    /* renamed from: f */
    public void mo57501f() {
        this.f57772e.mo53663a().mo57512a();
    }

    /* renamed from: g */
    public void mo57502g() {
        this.f57772e.mo53670d();
    }

    /* renamed from: h */
    public void mo57503h() {
        this.f57772e.mo53670d();
        this.f57768a.mo57541a(this, true, true, (IOException) null);
    }

    /* renamed from: i */
    public void mo57504i() {
        this.f57768a.mo57541a(this, true, false, (IOException) null);
    }

    /* renamed from: a */
    public void mo57493a(C22752ys ysVar) throws IOException {
        try {
            this.f57770c.mo57249c(this.f57769b);
            this.f57772e.mo53665a(ysVar);
            this.f57770c.mo57237a(this.f57769b, ysVar);
        } catch (IOException e) {
            this.f57770c.mo57239a(this.f57769b, e);
            mo57495a(e);
            throw e;
        }
    }

    /* renamed from: b */
    public C22759yv mo57496b(C22757yu yuVar) throws IOException {
        try {
            this.f57770c.mo57253f(this.f57769b);
            String a = yuVar.mo57415a(HttpHeader.CONTENT_TYPE);
            long a2 = this.f57772e.mo53660a(yuVar);
            return new C22805zz(a, a2, abr.m50508a((aca) new C22786b(this.f57772e.mo53666b(yuVar), a2)));
        } catch (IOException e) {
            this.f57770c.mo57248b(this.f57769b, e);
            mo57495a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public abz mo57489a(C22752ys ysVar, boolean z) throws IOException {
        this.f57773f = z;
        long b = ysVar.mo57396d().mo54067b();
        this.f57770c.mo57251d(this.f57769b);
        return new C22785a(this.f57772e.mo53661a(ysVar, b), b);
    }

    /* renamed from: com.veriff.sdk.internal.zk$b */
    public final class C22786b extends abn {

        /* renamed from: b */
        private final long f57780b;

        /* renamed from: c */
        private long f57781c;

        /* renamed from: d */
        private boolean f57782d;

        /* renamed from: e */
        private boolean f57783e;

        public C22786b(aca aca, long j) {
            super(aca);
            this.f57780b = j;
            if (j == 0) {
                mo57505a((IOException) null);
            }
        }

        /* renamed from: a */
        public long mo53671a(abi abi, long j) throws IOException {
            if (!this.f57783e) {
                try {
                    long a = mo53952b().mo53671a(abi, j);
                    if (a == -1) {
                        mo57505a((IOException) null);
                        return -1;
                    }
                    long j2 = this.f57781c + a;
                    long j3 = this.f57780b;
                    if (j3 != -1) {
                        if (j2 > j3) {
                            throw new ProtocolException("expected " + this.f57780b + " bytes but received " + j2);
                        }
                    }
                    this.f57781c = j2;
                    if (j2 == j3) {
                        mo57505a((IOException) null);
                    }
                    return a;
                } catch (IOException e) {
                    throw mo57505a(e);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.f57783e) {
                this.f57783e = true;
                try {
                    super.close();
                    mo57505a((IOException) null);
                } catch (IOException e) {
                    throw mo57505a(e);
                }
            }
        }

        /* renamed from: a */
        public IOException mo57505a(IOException iOException) {
            if (this.f57782d) {
                return iOException;
            }
            this.f57782d = true;
            return C22784zk.this.mo57492a(this.f57781c, true, false, iOException);
        }
    }

    /* renamed from: a */
    public C22757yu.C22758a mo57490a(boolean z) throws IOException {
        try {
            C22757yu.C22758a a = this.f57772e.mo53662a(z);
            if (a != null) {
                C22763yy.f57691a.mo57373a(a, this);
            }
            return a;
        } catch (IOException e) {
            this.f57770c.mo57248b(this.f57769b, e);
            mo57495a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public void mo57494a(C22757yu yuVar) {
        this.f57770c.mo57238a(this.f57769b, yuVar);
    }

    /* renamed from: a */
    public void mo57495a(IOException iOException) {
        this.f57771d.mo57508b();
        this.f57772e.mo53663a().mo57514a(iOException);
    }

    /* renamed from: a */
    public IOException mo57492a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            mo57495a(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.f57770c.mo57239a(this.f57769b, iOException);
            } else {
                this.f57770c.mo57234a(this.f57769b, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.f57770c.mo57248b(this.f57769b, iOException);
            } else {
                this.f57770c.mo57246b(this.f57769b, j);
            }
        }
        return this.f57768a.mo57541a(this, z2, z, iOException);
    }
}
