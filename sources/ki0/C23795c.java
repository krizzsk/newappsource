package ki0;

import hi0.C23529c0;
import hi0.C23534e;
import hi0.C23550n;
import ii0.C23607a;
import java.io.IOException;
import java.net.ProtocolException;
import li0.C24315c;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import si0.C24887a0;
import si0.C24893c0;
import si0.C24898f;
import si0.C24904k;
import si0.C24905l;

/* renamed from: ki0.c */
public final class C23795c {

    /* renamed from: a */
    public final C23803h f60092a;

    /* renamed from: b */
    public final C23550n f60093b;

    /* renamed from: c */
    public final C23798d f60094c;

    /* renamed from: d */
    public final C24315c f60095d;

    /* renamed from: e */
    public boolean f60096e;

    /* renamed from: ki0.c$a */
    public final class C23796a extends C24904k {

        /* renamed from: c */
        public boolean f60097c;

        /* renamed from: d */
        public long f60098d;

        /* renamed from: e */
        public long f60099e;

        /* renamed from: f */
        public boolean f60100f;

        public C23796a(C24887a0 a0Var, long j) {
            super(a0Var);
            this.f60098d = j;
        }

        /* renamed from: P */
        public final void mo58998P(C24898f fVar, long j) throws IOException {
            if (!this.f60100f) {
                long j2 = this.f60098d;
                if (j2 == -1 || this.f60099e + j <= j2) {
                    try {
                        super.mo58998P(fVar, j);
                        this.f60099e += j;
                    } catch (IOException e) {
                        throw mo59029a(e);
                    }
                } else {
                    StringBuilder k = C13555b.m33972k("expected ");
                    k.append(this.f60098d);
                    k.append(" bytes but received ");
                    k.append(this.f60099e + j);
                    throw new ProtocolException(k.toString());
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        /* renamed from: a */
        public final IOException mo59029a(IOException iOException) {
            if (this.f60097c) {
                return iOException;
            }
            this.f60097c = true;
            return C23795c.this.mo59025a(false, true, iOException);
        }

        public final void close() throws IOException {
            if (!this.f60100f) {
                this.f60100f = true;
                long j = this.f60098d;
                if (j == -1 || this.f60099e == j) {
                    try {
                        super.close();
                        mo59029a((IOException) null);
                    } catch (IOException e) {
                        throw mo59029a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw mo59029a(e);
            }
        }
    }

    /* renamed from: ki0.c$b */
    public final class C23797b extends C24905l {

        /* renamed from: c */
        public final long f60102c;

        /* renamed from: d */
        public long f60103d;

        /* renamed from: e */
        public boolean f60104e;

        /* renamed from: f */
        public boolean f60105f;

        public C23797b(C24893c0 c0Var, long j) {
            super(c0Var);
            this.f60102c = j;
            if (j == 0) {
                mo59030a((IOException) null);
            }
        }

        /* renamed from: a */
        public final IOException mo59030a(IOException iOException) {
            if (this.f60104e) {
                return iOException;
            }
            this.f60104e = true;
            return C23795c.this.mo59025a(true, false, iOException);
        }

        public final void close() throws IOException {
            if (!this.f60105f) {
                this.f60105f = true;
                try {
                    super.close();
                    mo59030a((IOException) null);
                } catch (IOException e) {
                    throw mo59030a(e);
                }
            }
        }

        /* renamed from: m */
        public final long mo53601m(C24898f fVar, long j) throws IOException {
            if (!this.f60105f) {
                try {
                    long m = this.f62954b.mo53601m(fVar, j);
                    if (m == -1) {
                        mo59030a((IOException) null);
                        return -1;
                    }
                    long j2 = this.f60103d + m;
                    long j3 = this.f60102c;
                    if (j3 != -1) {
                        if (j2 > j3) {
                            throw new ProtocolException("expected " + this.f60102c + " bytes but received " + j2);
                        }
                    }
                    this.f60103d = j2;
                    if (j2 == j3) {
                        mo59030a((IOException) null);
                    }
                    return m;
                } catch (IOException e) {
                    throw mo59030a(e);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    public C23795c(C23803h hVar, C23534e eVar, C23550n nVar, C23798d dVar, C24315c cVar) {
        this.f60092a = hVar;
        this.f60093b = nVar;
        this.f60094c = dVar;
        this.f60095d = cVar;
    }

    /* renamed from: a */
    public final IOException mo59025a(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            mo59028d(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.f60093b.getClass();
            } else {
                this.f60093b.getClass();
            }
        }
        if (z) {
            if (iOException != null) {
                this.f60093b.getClass();
            } else {
                this.f60093b.getClass();
            }
        }
        return this.f60092a.mo59051c(this, z2, z, iOException);
    }

    /* renamed from: b */
    public final C23799e mo59026b() {
        return this.f60095d.mo60460f();
    }

    /* renamed from: c */
    public final C23529c0.C23530a mo59027c(boolean z) throws IOException {
        try {
            C23529c0.C23530a e = this.f60095d.mo60459e(z);
            if (e != null) {
                C23607a.f59680a.getClass();
                e.f59436m = this;
            }
            return e;
        } catch (IOException e2) {
            this.f60093b.getClass();
            mo59028d(e2);
            throw e2;
        }
    }

    /* renamed from: d */
    public final void mo59028d(IOException iOException) {
        boolean z;
        C23798d dVar = this.f60094c;
        synchronized (dVar.f60109c) {
            dVar.f60114h = true;
        }
        C23799e f = this.f60095d.mo60460f();
        synchronized (f.f60116b) {
            if (iOException instanceof StreamResetException) {
                ErrorCode errorCode = ((StreamResetException) iOException).errorCode;
                if (errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = f.f60128n + 1;
                    f.f60128n = i;
                    if (i > 1) {
                        f.f60125k = true;
                        f.f60126l++;
                    }
                } else if (errorCode != ErrorCode.CANCEL) {
                    f.f60125k = true;
                    f.f60126l++;
                }
            } else {
                if (f.f60122h != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || (iOException instanceof ConnectionShutdownException)) {
                    f.f60125k = true;
                    if (f.f60127m == 0) {
                        if (iOException != null) {
                            f.f60116b.mo59046a(f.f60117c, iOException);
                        }
                        f.f60126l++;
                    }
                }
            }
        }
    }
}
