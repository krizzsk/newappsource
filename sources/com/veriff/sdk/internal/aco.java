package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22713xw;
import java.io.IOException;
import java.util.Objects;

final class aco<T> implements ace<T> {

    /* renamed from: a */
    private final act f53655a;

    /* renamed from: b */
    private final Object[] f53656b;

    /* renamed from: c */
    private final C22713xw.C22714a f53657c;

    /* renamed from: d */
    private final aci<C22759yv, T> f53658d;

    /* renamed from: e */
    private volatile boolean f53659e;

    /* renamed from: f */
    private C22713xw f53660f;

    /* renamed from: g */
    private Throwable f53661g;

    /* renamed from: h */
    private boolean f53662h;

    /* renamed from: com.veriff.sdk.internal.aco$a */
    public static final class C21358a extends C22759yv {

        /* renamed from: a */
        public IOException f53665a;

        /* renamed from: b */
        private final C22759yv f53666b;

        /* renamed from: c */
        private final abk f53667c;

        public C21358a(C22759yv yvVar) {
            this.f53666b = yvVar;
            this.f53667c = abr.m50508a((aca) new abn(yvVar.mo54033c()) {
                /* renamed from: a */
                public long mo53671a(abi abi, long j) throws IOException {
                    try {
                        return super.mo53671a(abi, j);
                    } catch (IOException e) {
                        C21358a.this.f53665a = e;
                        throw e;
                    }
                }
            });
        }

        /* renamed from: a */
        public C22742yn mo54031a() {
            return this.f53666b.mo54031a();
        }

        /* renamed from: b */
        public long mo54032b() {
            return this.f53666b.mo54032b();
        }

        /* renamed from: c */
        public abk mo54033c() {
            return this.f53667c;
        }

        public void close() {
            this.f53666b.close();
        }

        /* renamed from: d */
        public void mo54035d() throws IOException {
            IOException iOException = this.f53665a;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.aco$b */
    public static final class C21360b extends C22759yv {

        /* renamed from: a */
        private final C22742yn f53669a;

        /* renamed from: b */
        private final long f53670b;

        public C21360b(C22742yn ynVar, long j) {
            this.f53669a = ynVar;
            this.f53670b = j;
        }

        /* renamed from: a */
        public C22742yn mo54031a() {
            return this.f53669a;
        }

        /* renamed from: b */
        public long mo54032b() {
            return this.f53670b;
        }

        /* renamed from: c */
        public abk mo54033c() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public aco(act act, Object[] objArr, C22713xw.C22714a aVar, aci<C22759yv, T> aci) {
        this.f53655a = act;
        this.f53656b = objArr;
        this.f53657c = aVar;
        this.f53658d = aci;
    }

    /* renamed from: f */
    private C22713xw m50712f() throws IOException {
        C22713xw xwVar = this.f53660f;
        if (xwVar != null) {
            return xwVar;
        }
        Throwable th = this.f53661g;
        if (th == null) {
            try {
                C22713xw g = m50713g();
                this.f53660f = g;
                return g;
            } catch (IOException | Error | RuntimeException e) {
                acz.m50841a(e);
                this.f53661g = e;
                throw e;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    /* renamed from: g */
    private C22713xw m50713g() throws IOException {
        C22713xw a = this.f53657c.mo57191a(this.f53655a.mo54068a(this.f53656b));
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: a */
    public void mo54003a(final acg<T> acg) {
        C22713xw xwVar;
        Throwable th;
        Objects.requireNonNull(acg, "callback == null");
        synchronized (this) {
            if (!this.f53662h) {
                this.f53662h = true;
                xwVar = this.f53660f;
                th = this.f53661g;
                if (xwVar == null && th == null) {
                    try {
                        C22713xw g = m50713g();
                        this.f53660f = g;
                        xwVar = g;
                    } catch (Throwable th2) {
                        th = th2;
                        acz.m50841a(th);
                        this.f53661g = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            acg.mo54011a_(this, th);
            return;
        }
        if (this.f53659e) {
            xwVar.mo57189c();
        }
        xwVar.mo57187a(new C22715xx() {
            /* renamed from: a */
            public void mo54029a(C22713xw xwVar, C22757yu yuVar) {
                try {
                    try {
                        acg.mo54010a(aco.this, aco.this.mo54026a(yuVar));
                    } catch (Throwable th) {
                        acz.m50841a(th);
                        th.printStackTrace();
                    }
                } catch (Throwable th2) {
                    acz.m50841a(th2);
                    m50721a(th2);
                }
            }

            /* renamed from: a */
            public void mo54030a(C22713xw xwVar, IOException iOException) {
                m50721a(iOException);
            }

            /* renamed from: a */
            private void m50721a(Throwable th) {
                try {
                    acg.mo54011a_(aco.this, th);
                } catch (Throwable th2) {
                    acz.m50841a(th2);
                    th2.printStackTrace();
                }
            }
        });
    }

    /* renamed from: b */
    public boolean mo54004b() {
        boolean z = true;
        if (this.f53659e) {
            return true;
        }
        synchronized (this) {
            C22713xw xwVar = this.f53660f;
            if (xwVar == null || !xwVar.mo57190d()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public synchronized C22752ys mo54005c() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m50712f().mo57186a();
    }

    /* renamed from: d */
    public aco<T> mo54006e() {
        return new aco<>(this.f53655a, this.f53656b, this.f53657c, this.f53658d);
    }

    /* renamed from: a */
    public acu<T> mo54026a(C22757yu yuVar) throws IOException {
        C22759yv h = yuVar.mo57424h();
        C22757yu a = yuVar.mo57425i().mo57440a((C22759yv) new C21360b(h.mo54031a(), h.mo54032b())).mo57443a();
        int c = a.mo57418c();
        if (c < 200 || c >= 300) {
            try {
                return acu.m50800a(acz.m50830a(h), a);
            } finally {
                h.close();
            }
        } else if (c == 204 || c == 205) {
            h.close();
            return acu.m50802a(null, a);
        } else {
            C21358a aVar = new C21358a(h);
            try {
                return acu.m50802a(this.f53658d.mo53996a(aVar), a);
            } catch (RuntimeException e) {
                aVar.mo54035d();
                throw e;
            }
        }
    }

    /* renamed from: a */
    public void mo54002a() {
        C22713xw xwVar;
        this.f53659e = true;
        synchronized (this) {
            xwVar = this.f53660f;
        }
        if (xwVar != null) {
            xwVar.mo57189c();
        }
    }
}
