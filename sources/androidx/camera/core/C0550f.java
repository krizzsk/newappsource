package androidx.camera.core;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.f */
public final /* synthetic */ class C0550f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ CameraX f1895b;

    /* renamed from: c */
    public final /* synthetic */ Context f1896c;

    /* renamed from: d */
    public final /* synthetic */ Executor f1897d;

    /* renamed from: e */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f1898e;

    /* renamed from: f */
    public final /* synthetic */ long f1899f;

    public /* synthetic */ C0550f(CameraX cameraX, Context context, Executor executor, CallbackToFutureAdapter.C0673a aVar, long j) {
        this.f1895b = cameraX;
        this.f1896c = context;
        this.f1897d = executor;
        this.f1898e = aVar;
        this.f1899f = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            androidx.camera.core.CameraX r1 = r12.f1895b
            android.content.Context r0 = r12.f1896c
            java.util.concurrent.Executor r2 = r12.f1897d
            androidx.concurrent.futures.CallbackToFutureAdapter$a r5 = r12.f1898e
            long r3 = r12.f1899f
            r1.getClass()
            r6 = 0
            android.app.Application r7 = p078f0.C4637d.m11953b(r0)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r1.f1836i = r7     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            if (r7 != 0) goto L_0x001c
            android.content.Context r0 = p078f0.C4637d.m11952a(r0)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r1.f1836i = r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
        L_0x001c:
            androidx.camera.core.g r0 = r1.f1830c     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            e0.l$a r0 = r0.mo2433t()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            if (r0 == 0) goto L_0x00a9
            java.util.concurrent.Executor r7 = r1.f1831d     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            android.os.Handler r8 = r1.f1832e     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            e0.a r9 = new e0.a     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r9.<init>(r7, r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            androidx.camera.core.g r7 = r1.f1830c     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            d0.l r7 = r7.mo2432s()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            android.content.Context r8 = r1.f1836i     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            x.s r0 = r0.mo19975a(r8, r9, r7)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r1.f1833f = r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            androidx.camera.core.g r0 = r1.f1830c     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            e0.k$a r0 = r0.mo2434u()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            if (r0 == 0) goto L_0x009c
            android.content.Context r8 = r1.f1836i     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            e0.l r9 = r1.f1833f     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            y.a0 r9 = r9.mo19972a()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            e0.l r10 = r1.f1833f     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.util.LinkedHashSet r10 = r10.getAvailableCameraIds()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            x.o0 r0 = r0.newInstance(r8, r9, r10)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r1.f1834g = r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            androidx.camera.core.g r0 = r1.f1830c     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            androidx.camera.core.impl.UseCaseConfigFactory$b r0 = r0.mo2435v()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            if (r0 == 0) goto L_0x0089
            android.content.Context r8 = r1.f1836i     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            x.q0 r0 = r0.newInstance(r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r1.f1835h = r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            boolean r0 = r2 instanceof p054d0.C4283h     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            if (r0 == 0) goto L_0x0073
            r0 = r2
            d0.h r0 = (p054d0.C4283h) r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            e0.l r8 = r1.f1833f     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r0.mo19801a(r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
        L_0x0073:
            e0.n r0 = r1.f1828a     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            e0.l r8 = r1.f1833f     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r0.mo19984b(r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            android.content.Context r0 = r1.f1836i     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            e0.n r8 = r1.f1828a     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            androidx.camera.core.impl.CameraValidator.m1583a(r0, r8, r7)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r1.mo2358a()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r5.mo2697b(r6)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            goto L_0x010e
        L_0x0089:
            androidx.camera.core.InitializationException r0 = new androidx.camera.core.InitializationException     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.lang.String r8 = "Invalid app configuration provided. Missing UseCaseConfigFactory."
            r7.<init>(r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r0.<init>(r7)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            throw r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            goto L_0x00b6
        L_0x0098:
            r0 = move-exception
            goto L_0x00b6
        L_0x009a:
            r0 = move-exception
            goto L_0x00b6
        L_0x009c:
            androidx.camera.core.InitializationException r0 = new androidx.camera.core.InitializationException     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.lang.String r8 = "Invalid app configuration provided. Missing CameraDeviceSurfaceManager."
            r7.<init>(r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r0.<init>(r7)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            throw r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
        L_0x00a9:
            androidx.camera.core.InitializationException r0 = new androidx.camera.core.InitializationException     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.lang.String r8 = "Invalid app configuration provided. Missing CameraFactory."
            r7.<init>(r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r0.<init>(r7)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            throw r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
        L_0x00b6:
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r3
            r9 = 2500(0x9c4, double:1.235E-320)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x00e9
            java.lang.String r0 = "CameraX"
            android.os.SystemClock.elapsedRealtime()
            p054d0.C4289j0.m11435b(r0)
            android.os.Handler r6 = r1.f1832e
            d0.n r7 = new d0.n
            r0 = r7
            r0.<init>(r1, r2, r3, r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x00db
            boolean unused = r6.postDelayed(r7, "retry_token", 500)
            goto L_0x010e
        L_0x00db:
            android.os.Message r0 = android.os.Message.obtain(r6, r7)
            java.lang.String r1 = "retry_token"
            r0.obj = r1
            r1 = 500(0x1f4, double:2.47E-321)
            r6.sendMessageDelayed(r0, r1)
            goto L_0x010e
        L_0x00e9:
            java.lang.Object r2 = r1.f1829b
            monitor-enter(r2)
            androidx.camera.core.CameraX$InternalInitState r3 = androidx.camera.core.CameraX.InternalInitState.INITIALIZING_ERROR     // Catch:{ all -> 0x010f }
            r1.f1838k = r3     // Catch:{ all -> 0x010f }
            monitor-exit(r2)     // Catch:{ all -> 0x010f }
            boolean r1 = r0 instanceof androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException
            if (r1 == 0) goto L_0x00fe
            java.lang.String r0 = "CameraX"
            p054d0.C4289j0.m11435b(r0)
            r5.mo2697b(r6)
            goto L_0x010e
        L_0x00fe:
            boolean r1 = r0 instanceof androidx.camera.core.InitializationException
            if (r1 == 0) goto L_0x0106
            r5.mo2698c(r0)
            goto L_0x010e
        L_0x0106:
            androidx.camera.core.InitializationException r1 = new androidx.camera.core.InitializationException
            r1.<init>(r0)
            r5.mo2698c(r1)
        L_0x010e:
            return
        L_0x010f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x010f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0550f.run():void");
    }
}
