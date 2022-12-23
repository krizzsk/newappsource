package p067e1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: e1.f */
public final class C4483f {

    /* renamed from: a */
    public static final Class<?> f15550a;

    /* renamed from: b */
    public static final Field f15551b;

    /* renamed from: c */
    public static final Field f15552c;

    /* renamed from: d */
    public static final Method f15553d;

    /* renamed from: e */
    public static final Method f15554e;

    /* renamed from: f */
    public static final Method f15555f;

    /* renamed from: g */
    public static final Handler f15556g = new Handler(Looper.getMainLooper());

    /* renamed from: e1.f$a */
    public static final class C4484a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b */
        public Object f15557b;

        /* renamed from: c */
        public Activity f15558c;

        /* renamed from: d */
        public final int f15559d;

        /* renamed from: e */
        public boolean f15560e = false;

        /* renamed from: f */
        public boolean f15561f = false;

        /* renamed from: g */
        public boolean f15562g = false;

        public C4484a(Activity activity) {
            this.f15558c = activity;
            this.f15559d = activity.hashCode();
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
            if (this.f15558c == activity) {
                this.f15558c = null;
                this.f15561f = true;
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (this.f15561f && !this.f15562g && !this.f15560e) {
                Object obj = this.f15557b;
                int i = this.f15559d;
                boolean z = false;
                try {
                    Object obj2 = C4483f.f15552c.get(activity);
                    if (obj2 == obj) {
                        if (activity.hashCode() == i) {
                            C4483f.f15556g.postAtFrontOfQueue(new C4481e(C4483f.f15551b.get(activity), obj2));
                            z = true;
                        }
                    }
                } catch (Throwable unused) {
                }
                if (z) {
                    this.f15562g = true;
                    this.f15557b = null;
                }
            }
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
            if (this.f15558c == activity) {
                this.f15560e = true;
            }
        }

        public final void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d A[SYNTHETIC, Splitter:B:23:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081  */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            f15556g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            f15550a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r3.setAccessible(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            f15551b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0030 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0032
        L_0x0030:
            r0 = r1
        L_0x0032:
            f15552c = r0
            java.lang.Class<?> r0 = f15550a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L_0x003e
            goto L_0x0055
        L_0x003e:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x0054 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x0054 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0054 }
            r7[r2] = r8     // Catch:{ all -> 0x0054 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch:{ all -> 0x0054 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x0054 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0054:
        L_0x0055:
            r0 = r1
        L_0x0056:
            f15553d = r0
            java.lang.Class<?> r0 = f15550a
            if (r0 != 0) goto L_0x005d
            goto L_0x006f
        L_0x005d:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x006f }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x006f }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x006f }
            r7[r2] = r8     // Catch:{ all -> 0x006f }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x006f }
            r0.setAccessible(r2)     // Catch:{ all -> 0x006f }
            goto L_0x0070
        L_0x006f:
            r0 = r1
        L_0x0070:
            f15554e = r0
            java.lang.Class<?> r0 = f15550a
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r4 == r7) goto L_0x0081
            r7 = 27
            if (r4 != r7) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r4 = 0
            goto L_0x0082
        L_0x0081:
            r4 = 1
        L_0x0082:
            if (r4 == 0) goto L_0x00bb
            if (r0 != 0) goto L_0x0087
            goto L_0x00bb
        L_0x0087:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x00bb }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x00bb }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch:{ all -> 0x00bb }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch:{ all -> 0x00bb }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00bb }
            r7[r3] = r5     // Catch:{ all -> 0x00bb }
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00bb }
            r7[r3] = r5     // Catch:{ all -> 0x00bb }
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00bb }
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00bb }
            r3 = 7
            r7[r3] = r5     // Catch:{ all -> 0x00bb }
            r3 = 8
            r7[r3] = r5     // Catch:{ all -> 0x00bb }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x00bb }
            r0.setAccessible(r2)     // Catch:{ all -> 0x00bb }
            r1 = r0
        L_0x00bb:
            f15555f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067e1.C4483f.<clinit>():void");
    }
}
