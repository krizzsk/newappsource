package com.veriff.sdk.internal;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class abg extends acb {

    /* renamed from: a */
    private static final long f53543a;

    /* renamed from: b */
    public static abg f53544b;

    /* renamed from: d */
    private static final long f53545d;

    /* renamed from: e */
    private boolean f53546e;

    /* renamed from: f */
    private abg f53547f;

    /* renamed from: g */
    private long f53548g;

    /* renamed from: com.veriff.sdk.internal.abg$a */
    public static final class C21319a extends Thread {
        public C21319a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.mo53754a();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<com.veriff.sdk.internal.abg> r0 = com.veriff.sdk.internal.abg.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                com.veriff.sdk.internal.abg r1 = com.veriff.sdk.internal.abg.m50323e()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                com.veriff.sdk.internal.abg r2 = com.veriff.sdk.internal.abg.f53544b     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                com.veriff.sdk.internal.abg.f53544b = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.mo53754a()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.abg.C21319a.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f53543a = millis;
        f53545d = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: a */
    private static synchronized void m50320a(abg abg, long j, boolean z) {
        Class<abg> cls = abg.class;
        synchronized (cls) {
            if (f53544b == null) {
                f53544b = new abg();
                new C21319a().start();
            }
            long nanoTime = System.nanoTime();
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i != 0 && z) {
                abg.f53548g = Math.min(j, abg.mo53958d() - nanoTime) + nanoTime;
            } else if (i != 0) {
                abg.f53548g = j + nanoTime;
            } else if (z) {
                abg.f53548g = abg.mo53958d();
            } else {
                throw new AssertionError();
            }
            long b = abg.m50322b(nanoTime);
            abg abg2 = f53544b;
            while (true) {
                abg abg3 = abg2.f53547f;
                if (abg3 == null) {
                    break;
                } else if (b < abg3.m50322b(nanoTime)) {
                    break;
                } else {
                    abg2 = abg2.f53547f;
                }
            }
            abg.f53547f = abg2.f53547f;
            abg2.f53547f = abg;
            if (abg2 == f53544b) {
                cls.notify();
            }
        }
    }

    /* renamed from: b */
    private long m50322b(long j) {
        return this.f53548g - j;
    }

    /* renamed from: e */
    public static abg m50323e() throws InterruptedException {
        Class<abg> cls = abg.class;
        abg abg = f53544b.f53547f;
        if (abg == null) {
            long nanoTime = System.nanoTime();
            cls.wait(f53543a);
            if (f53544b.f53547f != null || System.nanoTime() - nanoTime < f53545d) {
                return null;
            }
            return f53544b;
        }
        long b = abg.m50322b(System.nanoTime());
        if (b > 0) {
            long j = b / 1000000;
            cls.wait(j, (int) (b - (1000000 * j)));
            return null;
        }
        f53544b.f53547f = abg.f53547f;
        abg.f53547f = null;
        return abg;
    }

    /* renamed from: a */
    public void mo53754a() {
    }

    /* renamed from: c */
    public final void mo53838c() {
        if (!this.f53546e) {
            long q_ = mo53992q_();
            boolean o_ = mo53961o_();
            if (q_ != 0 || o_) {
                this.f53546e = true;
                m50320a(this, q_, o_);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* renamed from: n_ */
    public final boolean mo53839n_() {
        if (!this.f53546e) {
            return false;
        }
        this.f53546e = false;
        return m50321a(this);
    }

    /* renamed from: b */
    public final IOException mo53837b(IOException iOException) throws IOException {
        if (!mo53839n_()) {
            return iOException;
        }
        return mo53753a(iOException);
    }

    /* renamed from: a */
    private static synchronized boolean m50321a(abg abg) {
        synchronized (abg.class) {
            abg abg2 = f53544b;
            while (abg2 != null) {
                abg abg3 = abg2.f53547f;
                if (abg3 == abg) {
                    abg2.f53547f = abg.f53547f;
                    abg.f53547f = null;
                    return false;
                }
                abg2 = abg3;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final abz mo53834a(final abz abz) {
        return new abz() {
            /* renamed from: a */
            public acb mo53674a() {
                return abg.this;
            }

            /* renamed from: a_ */
            public void mo53675a_(abi abi, long j) throws IOException {
                acc.m50627a(abi.f53556b, 0, j);
                while (true) {
                    long j2 = 0;
                    if (j > 0) {
                        abw abw = abi.f53555a;
                        while (true) {
                            if (j2 >= 65536) {
                                break;
                            }
                            j2 += (long) (abw.f53598c - abw.f53597b);
                            if (j2 >= j) {
                                j2 = j;
                                break;
                            }
                            abw = abw.f53601f;
                        }
                        abg.this.mo53838c();
                        try {
                            abz.mo53675a_(abi, j2);
                            j -= j2;
                            abg.this.mo53836a(true);
                        } catch (IOException e) {
                            throw abg.this.mo53837b(e);
                        } catch (Throwable th) {
                            abg.this.mo53836a(false);
                            throw th;
                        }
                    } else {
                        return;
                    }
                }
            }

            public void close() throws IOException {
                abg.this.mo53838c();
                try {
                    abz.close();
                    abg.this.mo53836a(true);
                } catch (IOException e) {
                    throw abg.this.mo53837b(e);
                } catch (Throwable th) {
                    abg.this.mo53836a(false);
                    throw th;
                }
            }

            public void flush() throws IOException {
                abg.this.mo53838c();
                try {
                    abz.flush();
                    abg.this.mo53836a(true);
                } catch (IOException e) {
                    throw abg.this.mo53837b(e);
                } catch (Throwable th) {
                    abg.this.mo53836a(false);
                    throw th;
                }
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("AsyncTimeout.sink(");
                k.append(abz);
                k.append(")");
                return k.toString();
            }
        };
    }

    /* renamed from: a */
    public final aca mo53835a(final aca aca) {
        return new aca() {
            /* renamed from: a */
            public long mo53671a(abi abi, long j) throws IOException {
                abg.this.mo53838c();
                try {
                    long a = aca.mo53671a(abi, j);
                    abg.this.mo53836a(true);
                    return a;
                } catch (IOException e) {
                    throw abg.this.mo53837b(e);
                } catch (Throwable th) {
                    abg.this.mo53836a(false);
                    throw th;
                }
            }

            public void close() throws IOException {
                abg.this.mo53838c();
                try {
                    aca.close();
                    abg.this.mo53836a(true);
                } catch (IOException e) {
                    throw abg.this.mo53837b(e);
                } catch (Throwable th) {
                    abg.this.mo53836a(false);
                    throw th;
                }
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("AsyncTimeout.source(");
                k.append(aca);
                k.append(")");
                return k.toString();
            }

            /* renamed from: a */
            public acb mo53672a() {
                return abg.this;
            }
        };
    }

    /* renamed from: a */
    public final void mo53836a(boolean z) throws IOException {
        if (mo53839n_() && z) {
            throw mo53753a((IOException) null);
        }
    }

    /* renamed from: a */
    public IOException mo53753a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
