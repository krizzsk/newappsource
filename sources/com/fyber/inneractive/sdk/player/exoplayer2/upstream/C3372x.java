package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.appboy.models.InAppMessageBase;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x */
public final class C3372x {

    /* renamed from: a */
    public final ExecutorService f12066a;

    /* renamed from: b */
    public C3374b<? extends C3375c> f12067b;

    /* renamed from: c */
    public IOException f12068c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$a */
    public interface C3373a<T extends C3375c> {
        /* renamed from: a */
        int mo14162a(T t, long j, long j2, IOException iOException);

        /* renamed from: a */
        void mo14165a(T t, long j, long j2);

        /* renamed from: a */
        void mo14166a(T t, long j, long j2, boolean z);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$c */
    public interface C3375c {
        /* renamed from: a */
        boolean mo14134a();

        /* renamed from: b */
        void mo14135b();

        void load() throws IOException, InterruptedException;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$d */
    public static final class C3376d extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3376d(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Unexpected "
                java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
                java.lang.Class r1 = r3.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3372x.C3376d.<init>(java.lang.Throwable):void");
        }
    }

    public C3372x(String str) {
        this.f12066a = C3406u.m8601c(str);
    }

    /* renamed from: a */
    public <T extends C3375c> long mo14514a(T t, C3373a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        C3380a.m8507b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C3374b(myLooper, t, aVar, i, elapsedRealtime).mo14519a(0);
        return elapsedRealtime;
    }

    /* renamed from: b */
    public boolean mo14516b() {
        return this.f12067b != null;
    }

    /* renamed from: c */
    public void mo14517c() throws IOException {
        IOException iOException = this.f12068c;
        if (iOException == null) {
            C3374b<? extends C3375c> bVar = this.f12067b;
            if (bVar != null) {
                int i = bVar.f12071c;
                IOException iOException2 = bVar.f12073e;
                if (iOException2 != null && bVar.f12074f > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: d */
    public void mo14518d() {
        C3374b<? extends C3375c> bVar = this.f12067b;
        if (bVar != null) {
            bVar.mo14520a(true);
        }
        this.f12066a.shutdown();
    }

    /* renamed from: a */
    public void mo14515a() {
        this.f12067b.mo14520a(false);
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$b */
    public final class C3374b<T extends C3375c> extends Handler implements Runnable {

        /* renamed from: a */
        public final T f12069a;

        /* renamed from: b */
        public final C3373a<T> f12070b;

        /* renamed from: c */
        public final int f12071c;

        /* renamed from: d */
        public final long f12072d;

        /* renamed from: e */
        public IOException f12073e;

        /* renamed from: f */
        public int f12074f;

        /* renamed from: g */
        public volatile Thread f12075g;

        /* renamed from: h */
        public volatile boolean f12076h;

        public C3374b(Looper looper, T t, C3373a<T> aVar, int i, long j) {
            super(looper);
            this.f12069a = t;
            this.f12070b = aVar;
            this.f12071c = i;
            this.f12072d = j;
        }

        /* renamed from: a */
        public void mo14519a(long j) {
            C3380a.m8507b(C3372x.this.f12067b == null);
            C3372x xVar = C3372x.this;
            xVar.f12067b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
                return;
            }
            this.f12073e = null;
            xVar.f12066a.execute(this);
        }

        public void handleMessage(Message message) {
            int i;
            if (!this.f12076h) {
                int i2 = message.what;
                if (i2 == 0) {
                    this.f12073e = null;
                    C3372x xVar = C3372x.this;
                    xVar.f12066a.execute(xVar.f12067b);
                } else if (i2 != 4) {
                    C3372x.this.f12067b = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.f12072d;
                    if (this.f12069a.mo14134a()) {
                        this.f12070b.mo14166a(this.f12069a, elapsedRealtime, j, false);
                        return;
                    }
                    int i3 = message.what;
                    if (i3 == 1) {
                        this.f12070b.mo14166a(this.f12069a, elapsedRealtime, j, false);
                    } else if (i3 == 2) {
                        this.f12070b.mo14165a(this.f12069a, elapsedRealtime, j);
                    } else if (i3 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f12073e = iOException;
                        int a = this.f12070b.mo14162a(this.f12069a, elapsedRealtime, j, iOException);
                        if (a == 3) {
                            C3372x.this.f12068c = this.f12073e;
                        } else if (a != 2) {
                            if (a == 1) {
                                i = 1;
                            } else {
                                i = this.f12074f + 1;
                            }
                            this.f12074f = i;
                            mo14519a((long) Math.min((i - 1) * 1000, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS));
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            try {
                this.f12075g = Thread.currentThread();
                if (!this.f12069a.mo14134a()) {
                    C3404s.m8583a("load:" + this.f12069a.getClass().getSimpleName());
                    this.f12069a.load();
                    C3404s.m8582a();
                }
                if (!this.f12076h) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e) {
                if (!this.f12076h) {
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (InterruptedException unused) {
                C3380a.m8507b(this.f12069a.mo14134a());
                if (!this.f12076h) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e2) {
                if (!this.f12076h) {
                    obtainMessage(3, new C3376d(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                if (!this.f12076h) {
                    obtainMessage(3, new C3376d(e3)).sendToTarget();
                }
            } catch (Error e4) {
                if (!this.f12076h) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                C3404s.m8582a();
                throw th;
            }
        }

        /* renamed from: a */
        public void mo14520a(boolean z) {
            this.f12076h = z;
            this.f12073e = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f12069a.mo14135b();
                if (this.f12075g != null) {
                    this.f12075g.interrupt();
                }
            }
            if (z) {
                C3372x.this.f12067b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f12070b.mo14166a(this.f12069a, elapsedRealtime, elapsedRealtime - this.f12072d, true);
            }
        }
    }
}
