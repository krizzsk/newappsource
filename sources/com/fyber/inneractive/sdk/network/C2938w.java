package com.fyber.inneractive.sdk.network;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.UnknownHostException;
import java.util.Comparator;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.network.w */
public class C2938w {

    /* renamed from: f */
    public static final ThreadFactory f10063f = new C2939a();

    /* renamed from: a */
    public BlockingQueue<C2889b0<?>> f10064a = new PriorityBlockingQueue(100, new C2941c((C2939a) null));

    /* renamed from: b */
    public volatile boolean f10065b = false;

    /* renamed from: c */
    public final Handler f10066c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public final ThreadPoolExecutor f10067d = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), f10063f);

    /* renamed from: e */
    public final Runnable f10068e = new C2940b();

    /* renamed from: com.fyber.inneractive.sdk.network.w$a */
    public class C2939a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f10069a = new AtomicInteger(100);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format(Locale.ENGLISH, "FyberMarketplace-Network-%02d", new Object[]{Integer.valueOf(this.f10069a.getAndIncrement())}));
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.network.w$b */
    public class C2940b implements Runnable {
        public C2940b() {
        }

        public void run() {
            C2889b0 b0Var;
            C2886a aVar;
            C2887a0 a0Var;
            C2938w wVar = C2938w.this;
            wVar.getClass();
            Process.setThreadPriority(10);
            while (wVar.f10065b) {
                try {
                    b0Var = wVar.f10064a.take();
                } catch (InterruptedException unused) {
                    if (!wVar.f10065b) {
                        Thread.currentThread().interrupt();
                    }
                    b0Var = null;
                }
                if (b0Var != null && !b0Var.mo13670e()) {
                    b0Var.mo13666a(C2916m0.RUNNING);
                    try {
                        if (!b0Var.mo13670e() && b0Var.mo13669c() != null) {
                            aVar = b0Var.mo13672g();
                            if (!(aVar == null || aVar.f9873b == null || b0Var.mo13670e())) {
                                b0Var.mo13667a(aVar.f9873b, (Exception) null, true);
                            }
                            C2908j a = wVar.mo13725a((C2889b0<?>) b0Var, (C2886a<?>) aVar);
                            a0Var = wVar.mo13724a(b0Var, a);
                            wVar.mo13728a(b0Var, a, a0Var);
                            wVar.mo13727a(b0Var, a0Var);
                            wVar.mo13729b(b0Var);
                        }
                    } catch (Exception e) {
                        IAlog.m9901a("failed fetching cache data", e, new Object[0]);
                        b0Var.mo13667a(null, e, true);
                    }
                    aVar = null;
                    b0Var.mo13667a(aVar.f9873b, (Exception) null, true);
                    try {
                        C2908j a2 = wVar.mo13725a((C2889b0<?>) b0Var, (C2886a<?>) aVar);
                        a0Var = wVar.mo13724a(b0Var, a2);
                        try {
                            wVar.mo13728a(b0Var, a2, a0Var);
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        a0Var = null;
                        try {
                            b0Var.mo13667a(null, e, false);
                            wVar.mo13727a(b0Var, a0Var);
                            wVar.mo13729b(b0Var);
                        } catch (Throwable th) {
                            th = th;
                            wVar.mo13727a(b0Var, a0Var);
                            wVar.mo13729b(b0Var);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        a0Var = null;
                        th = th2;
                        wVar.mo13727a(b0Var, a0Var);
                        wVar.mo13729b(b0Var);
                        throw th;
                    }
                    wVar.mo13727a(b0Var, a0Var);
                    wVar.mo13729b(b0Var);
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.network.w$c */
    public static class C2941c implements Comparator<C2889b0> {
        public C2941c() {
        }

        public int compare(Object obj, Object obj2) {
            return ((C2889b0) obj).mo13671f().ordinal() - ((C2889b0) obj2).mo13671f().ordinal();
        }

        public /* synthetic */ C2941c(C2939a aVar) {
            this();
        }
    }

    /* renamed from: a */
    public final <T> void mo13727a(C2889b0<T> b0Var, C2887a0 a0Var) {
        try {
            if (!b0Var.mo13670e() && a0Var != null) {
                b0Var.mo13667a(a0Var.f9874a, (Exception) null, false);
            }
        } catch (Exception e) {
            IAlog.m9901a("failed notifying the listener request complete", e, new Object[0]);
            b0Var.mo13667a(null, e, false);
        }
    }

    /* renamed from: b */
    public final void mo13729b(C2889b0<?> b0Var) {
        try {
            b0Var.mo13668b();
        } catch (Exception unused) {
        }
        b0Var.mo13666a(C2916m0.DONE);
    }

    /* renamed from: c */
    public void mo13730c(C2889b0<?> b0Var) {
        this.f10064a.offer(b0Var);
        b0Var.mo13666a(C2916m0.QUEUED);
    }

    /* renamed from: a */
    public final <T> void mo13728a(C2889b0<T> b0Var, C2908j jVar, C2887a0 a0Var) {
        try {
            if (!b0Var.mo13670e() && b0Var.mo13669c() != null && a0Var != null && jVar != null && jVar.f9920a == 200) {
                b0Var.mo13665a(a0Var, b0Var.mo13669c(), jVar.f9924e);
            }
        } catch (Exception e) {
            IAlog.m9901a("Failed cache network response data", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final <T> C2887a0 mo13724a(C2889b0<T> b0Var, C2908j jVar) throws Exception {
        if (jVar == null) {
            return null;
        }
        try {
            if (b0Var.mo13670e()) {
                return null;
            }
            int i = jVar.f9920a;
            if (i == 200) {
                return b0Var.mo13662a(jVar.f9922c, jVar.f9923d, i);
            }
            if (i == 304) {
                b0Var.mo13667a(null, (Exception) new C2899f(), false);
                return null;
            }
            b0Var.mo13667a(null, (Exception) new C2921n0(jVar.f9920a, jVar.f9921b), false);
            return null;
        } catch (Exception e) {
            IAlog.m9901a("failed parsing network request", e, new Object[0]);
            throw e;
        }
    }

    /* renamed from: a */
    public final C2908j mo13725a(C2889b0<?> b0Var, C2886a<?> aVar) throws Exception {
        try {
            if (b0Var.mo13670e()) {
                return null;
            }
            String str = aVar != null ? aVar.f9872a : "";
            mo13726a(b0Var);
            return b0Var.mo13663a(str);
        } catch (C2888b | UnknownHostException e) {
            IAlog.m9901a("failed sending network request", e, new Object[0]);
            if (b0Var.mo13675j()) {
                this.f10066c.postDelayed(new C2942x(this, b0Var), (long) b0Var.mo13680p());
            }
            throw e;
        } catch (Exception e2) {
            IAlog.m9901a("failed sending network request", e2, new Object[0]);
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r0.isConnectedOrConnecting() != false) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13726a(com.fyber.inneractive.sdk.network.C2889b0<?> r4) throws com.fyber.inneractive.sdk.network.C2888b {
        /*
            r3 = this;
            com.fyber.inneractive.sdk.config.global.s r4 = r4.mo13673h()
            if (r4 == 0) goto L_0x0050
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.g> r0 = com.fyber.inneractive.sdk.config.global.features.C2646g.class
            com.fyber.inneractive.sdk.config.global.features.e r4 = r4.mo13264a(r0)
            com.fyber.inneractive.sdk.config.global.features.g r4 = (com.fyber.inneractive.sdk.config.global.features.C2646g) r4
            if (r4 == 0) goto L_0x0050
            java.lang.String r0 = "should_use_is_network_connected"
            r1 = 0
            boolean r4 = r4.mo13239a((java.lang.String) r0, (boolean) r1)
            if (r4 == 0) goto L_0x0050
            r4 = 1
            android.app.Application r0 = com.fyber.inneractive.sdk.util.C3707l.f12893a     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x003d }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x002b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x003d }
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = com.fyber.inneractive.sdk.util.C3707l.m9966b((java.lang.String) r2)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0045
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.isConnectedOrConnecting()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0045
            goto L_0x0044
        L_0x003d:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file."
            com.fyber.inneractive.sdk.util.IAlog.m9903b(r1, r0)
        L_0x0044:
            r1 = 1
        L_0x0045:
            if (r1 == 0) goto L_0x0048
            goto L_0x0050
        L_0x0048:
            com.fyber.inneractive.sdk.network.b r4 = new com.fyber.inneractive.sdk.network.b
            java.lang.String r0 = "No network connection"
            r4.<init>((java.lang.String) r0)
            throw r4
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C2938w.mo13726a(com.fyber.inneractive.sdk.network.b0):void");
    }
}
