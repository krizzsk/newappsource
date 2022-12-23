package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22794zr;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001a0.C0016g;
import p054d0.C4278e0;

/* renamed from: com.veriff.sdk.internal.zn */
public final class C22789zn {

    /* renamed from: c */
    public static final /* synthetic */ boolean f57812c = true;

    /* renamed from: d */
    private static final Executor f57813d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C22766za.m55831a("OkHttp ConnectionPool", true));

    /* renamed from: a */
    public final C22790zo f57814a = new C22790zo();

    /* renamed from: b */
    public boolean f57815b;

    /* renamed from: e */
    private final int f57816e;

    /* renamed from: f */
    private final long f57817f;

    /* renamed from: g */
    private final Runnable f57818g = new C4278e0(this, 12);

    /* renamed from: h */
    private final Deque<C22788zm> f57819h = new ArrayDeque();

    public C22789zn(int i, long j, TimeUnit timeUnit) {
        this.f57816e = i;
        this.f57817f = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException(C0016g.m29l("keepAliveDuration <= 0: ", j));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m55966a() {
        /*
            r6 = this;
        L_0x0000:
            long r0 = java.lang.System.nanoTime()
            long r0 = r6.mo57524a((long) r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000f
            return
        L_0x000f:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0000
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r0 / r2
            long r2 = r2 * r4
            long r0 = r0 - r2
            monitor-enter(r6)
            int r1 = (int) r0
            r6.wait(r4, r1)     // Catch:{ InterruptedException -> 0x0025 }
            goto L_0x0025
        L_0x0023:
            r0 = move-exception
            goto L_0x0027
        L_0x0025:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            goto L_0x0000
        L_0x0027:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22789zn.m55966a():void");
    }

    /* renamed from: b */
    public boolean mo57528b(C22788zm zmVar) {
        if (!f57812c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (zmVar.f57797b || this.f57816e == 0) {
            this.f57819h.remove(zmVar);
            return true;
        } else {
            notifyAll();
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo57527a(C22702xs xsVar, C22794zr zrVar, List<C22761yw> list, boolean z) {
        if (f57812c || Thread.holdsLock(this)) {
            for (C22788zm next : this.f57819h) {
                if ((!z || next.mo57522f()) && next.mo57515a(xsVar, list)) {
                    zrVar.mo57545a(next);
                    return true;
                }
            }
            return false;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void mo57526a(C22788zm zmVar) {
        if (f57812c || Thread.holdsLock(this)) {
            if (!this.f57815b) {
                this.f57815b = true;
                f57813d.execute(this.f57818g);
            }
            this.f57819h.add(zmVar);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public long mo57524a(long j) {
        synchronized (this) {
            C22788zm zmVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (C22788zm next : this.f57819h) {
                if (m55965a(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - next.f57801f;
                    if (j3 > j2) {
                        zmVar = next;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.f57817f;
            if (j2 < j4) {
                if (i <= this.f57816e) {
                    if (i > 0) {
                        long j5 = j4 - j2;
                        return j5;
                    } else if (i2 > 0) {
                        return j4;
                    } else {
                        this.f57815b = false;
                        return -1;
                    }
                }
            }
            this.f57819h.remove(zmVar);
            C22766za.m55836a(zmVar.mo57520d());
            return 0;
        }
    }

    /* renamed from: a */
    private int m55965a(C22788zm zmVar, long j) {
        List<Reference<C22794zr>> list = zmVar.f57800e;
        int i = 0;
        while (i < list.size()) {
            Reference reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder k = C13555b.m33972k("A connection to ");
                k.append(zmVar.mo57518b().mo57449a().mo57137a());
                k.append(" was leaked. Did you forget to close a response body?");
                aay.m50281e().mo53801a(k.toString(), ((C22794zr.C22796a) reference).f57850a);
                list.remove(i);
                zmVar.f57797b = true;
                if (list.isEmpty()) {
                    zmVar.f57801f = j - this.f57817f;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* renamed from: a */
    public void mo57525a(C22761yw ywVar, IOException iOException) {
        if (ywVar.mo57450b().type() != Proxy.Type.DIRECT) {
            C22702xs a = ywVar.mo57449a();
            a.mo57145g().connectFailed(a.mo57137a().mo57283a(), ywVar.mo57450b().address(), iOException);
        }
        this.f57814a.mo57529a(ywVar);
    }
}
