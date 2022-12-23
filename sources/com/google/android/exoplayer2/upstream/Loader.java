package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.appboy.models.InAppMessageBase;
import com.google.android.exoplayer2.drm.DrmSession;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p100gb.C4956a0;
import p100gb.C4960b;
import p100gb.C5001x;
import p173ma.C5735h;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p277ub.C6813z;
import p583jk.C17875h;
import p583jk.C17884p;

public final class Loader {

    /* renamed from: d */
    public static final C4071b f14573d = new C4071b(2, -9223372036854775807L);

    /* renamed from: e */
    public static final C4071b f14574e = new C4071b(3, -9223372036854775807L);

    /* renamed from: a */
    public final ExecutorService f14575a;

    /* renamed from: b */
    public C4072c<? extends C4073d> f14576b;

    /* renamed from: c */
    public IOException f14577c;

    public static final class UnexpectedLoaderException extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnexpectedLoaderException(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r1 = r5.getMessage()
                int r2 = r0.length()
                int r2 = r2 + 13
                int r2 = p001a0.C0016g.m25h(r1, r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Unexpected "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ": "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                r4.<init>(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException.<init>(java.lang.Throwable):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$a */
    public interface C4070a<T extends C4073d> {
        /* renamed from: a */
        void mo16702a(T t, long j, long j2, boolean z);

        /* renamed from: e */
        void mo16703e(T t, long j, long j2);

        /* renamed from: j */
        C4071b mo16704j(T t, long j, long j2, IOException iOException, int i);
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$b */
    public static final class C4071b {

        /* renamed from: a */
        public final int f14578a;

        /* renamed from: b */
        public final long f14579b;

        public C4071b(int i, long j) {
            this.f14578a = i;
            this.f14579b = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.upstream.Loader$c */
    public final class C4072c<T extends C4073d> extends Handler implements Runnable {

        /* renamed from: b */
        public final int f14580b;

        /* renamed from: c */
        public final T f14581c;

        /* renamed from: d */
        public final long f14582d;

        /* renamed from: e */
        public C4070a<T> f14583e;

        /* renamed from: f */
        public IOException f14584f;

        /* renamed from: g */
        public int f14585g;

        /* renamed from: h */
        public Thread f14586h;

        /* renamed from: i */
        public boolean f14587i;

        /* renamed from: j */
        public volatile boolean f14588j;

        public C4072c(Looper looper, C5001x.C5002a aVar, C4070a aVar2, int i, long j) {
            super(looper);
            this.f14581c = aVar;
            this.f14583e = aVar2;
            this.f14580b = i;
            this.f14582d = j;
        }

        /* renamed from: a */
        public final void mo16705a(boolean z) {
            this.f14588j = z;
            this.f14584f = null;
            if (hasMessages(0)) {
                this.f14587i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f14587i = true;
                    ((C5001x.C5002a) this.f14581c).f16937g = true;
                    Thread thread = this.f14586h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                Loader.this.f14576b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C4070a<T> aVar = this.f14583e;
                aVar.getClass();
                aVar.mo16702a(this.f14581c, elapsedRealtime, elapsedRealtime - this.f14582d, true);
                this.f14583e = null;
            }
        }

        /* renamed from: b */
        public final void mo16706b(long j) {
            boolean z;
            if (Loader.this.f14576b == null) {
                z = true;
            } else {
                z = false;
            }
            C17875h.m44304o(z);
            Loader loader = Loader.this;
            loader.f14576b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
                return;
            }
            this.f14584f = null;
            loader.f14575a.execute(this);
        }

        public final void handleMessage(Message message) {
            if (!this.f14588j) {
                int i = message.what;
                if (i == 0) {
                    this.f14584f = null;
                    Loader loader = Loader.this;
                    ExecutorService executorService = loader.f14575a;
                    C4072c<? extends C4073d> cVar = loader.f14576b;
                    cVar.getClass();
                    executorService.execute(cVar);
                } else if (i != 3) {
                    Loader.this.f14576b = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.f14582d;
                    C4070a<T> aVar = this.f14583e;
                    aVar.getClass();
                    if (this.f14587i) {
                        aVar.mo16702a(this.f14581c, elapsedRealtime, j, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        try {
                            aVar.mo16703e(this.f14581c, elapsedRealtime, j);
                        } catch (RuntimeException e) {
                            C6776b0.m15968a("Unexpected exception handling load completed", e);
                            Loader.this.f14577c = new UnexpectedLoaderException(e);
                        }
                    } else if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f14584f = iOException;
                        int i3 = this.f14585g + 1;
                        this.f14585g = i3;
                        C4071b j2 = aVar.mo16704j(this.f14581c, elapsedRealtime, j, iOException, i3);
                        int i4 = j2.f14578a;
                        if (i4 == 3) {
                            Loader.this.f14577c = this.f14584f;
                        } else if (i4 != 2) {
                            if (i4 == 1) {
                                this.f14585g = 1;
                            }
                            long j3 = j2.f14579b;
                            if (j3 == -9223372036854775807L) {
                                j3 = (long) Math.min((this.f14585g - 1) * 1000, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
                            }
                            mo16706b(j3);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public final void run() {
            boolean z;
            String str;
            try {
                synchronized (this) {
                    if (!this.f14587i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f14586h = Thread.currentThread();
                }
                if (z) {
                    String simpleName = this.f14581c.getClass().getSimpleName();
                    if (simpleName.length() != 0) {
                        str = "load:".concat(simpleName);
                    } else {
                        str = new String("load:");
                    }
                    C17884p.m44368g(str);
                    ((C5001x.C5002a) this.f14581c).mo20718b();
                    C17884p.m44382v();
                }
                synchronized (this) {
                    this.f14586h = null;
                    Thread.interrupted();
                }
                if (!this.f14588j) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.f14588j) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Exception e2) {
                if (!this.f14588j) {
                    C6776b0.m15968a("Unexpected exception loading stream", e2);
                    obtainMessage(2, new UnexpectedLoaderException(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                if (!this.f14588j) {
                    C6776b0.m15968a("OutOfMemory error loading stream", e3);
                    obtainMessage(2, new UnexpectedLoaderException(e3)).sendToTarget();
                }
            } catch (Error e4) {
                if (!this.f14588j) {
                    C6776b0.m15968a("Unexpected error loading stream", e4);
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                C17884p.m44382v();
                throw th;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$d */
    public interface C4073d {
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$e */
    public interface C4074e {
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$f */
    public static final class C4075f implements Runnable {

        /* renamed from: b */
        public final C4074e f14590b;

        public C4075f(C4074e eVar) {
            this.f14590b = eVar;
        }

        public final void run() {
            C5001x xVar = (C5001x) this.f14590b;
            for (C4956a0 a0Var : xVar.f16924t) {
                a0Var.mo20643n(true);
                DrmSession drmSession = a0Var.f16756i;
                if (drmSession != null) {
                    drmSession.mo15954c(a0Var.f16752e);
                    a0Var.f16756i = null;
                    a0Var.f16755h = null;
                }
            }
            C4960b bVar = (C4960b) xVar.f16917m;
            C5735h hVar = bVar.f16780b;
            if (hVar != null) {
                hVar.release();
                bVar.f16780b = null;
            }
            bVar.f16781c = null;
        }
    }

    public Loader() {
        String str;
        if ("ProgressiveMediaPeriod".length() != 0) {
            str = "ExoPlayer:Loader:".concat("ProgressiveMediaPeriod");
        } else {
            str = new String("ExoPlayer:Loader:");
        }
        int i = C6774a0.f20959a;
        this.f14575a = Executors.newSingleThreadExecutor(new C6813z(str));
    }
}
