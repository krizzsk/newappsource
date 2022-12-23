package p484ff;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: ff.g */
public final class C16972g {

    /* renamed from: a */
    public final ExecutorService f44050a;

    /* renamed from: b */
    public final Context f44051b;

    /* renamed from: c */
    public final C16991t f44052c;

    public C16972g(Context context, C16991t tVar, ExecutorService executorService) {
        this.f44050a = executorService;
        this.f44051b = context;
        this.f44052c = tVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3 A[SYNTHETIC, Splitter:B:31:0x00a3] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49598a() {
        /*
            r10 = this;
            ff.t r0 = r10.f44052c
            java.lang.String r1 = "gcm.n.noui"
            boolean r0 = r0.mo49626a(r1)
            r1 = 1
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            android.content.Context r0 = r10.f44051b
            java.lang.String r2 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            r2 = 0
            if (r0 == 0) goto L_0x001e
            goto L_0x0059
        L_0x001e:
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            if (r0 != 0) goto L_0x0029
            r3 = 10
            android.os.SystemClock.sleep(r3)
        L_0x0029:
            int r0 = android.os.Process.myPid()
            android.content.Context r3 = r10.f44051b
            java.lang.String r4 = "activity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.List r3 = r3.getRunningAppProcesses()
            if (r3 == 0) goto L_0x0059
            java.util.Iterator r3 = r3.iterator()
        L_0x0041:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r5 = r4.pid
            if (r5 != r0) goto L_0x0041
            int r0 = r4.importance
            r3 = 100
            if (r0 != r3) goto L_0x0059
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x005d
            return r2
        L_0x005d:
            ff.t r0 = r10.f44052c
            java.lang.String r3 = "gcm.n.image"
            java.lang.String r0 = r0.mo49630e(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 == 0) goto L_0x006d
            goto L_0x0079
        L_0x006d:
            ff.q r3 = new ff.q     // Catch:{ MalformedURLException -> 0x0078 }
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0078 }
            r5.<init>(r0)     // Catch:{ MalformedURLException -> 0x0078 }
            r3.<init>(r5)     // Catch:{ MalformedURLException -> 0x0078 }
            goto L_0x007a
        L_0x0078:
        L_0x0079:
            r3 = r4
        L_0x007a:
            if (r3 == 0) goto L_0x0096
            java.util.concurrent.ExecutorService r0 = r10.f44050a
            com.google.android.gms.tasks.TaskCompletionSource r5 = new com.google.android.gms.tasks.TaskCompletionSource
            r5.<init>()
            x.r r6 = new x.r
            r7 = 14
            r6.<init>(r7, r3, r5)
            java.util.concurrent.Future r0 = r0.submit(r6)
            r3.f44099c = r0
            com.google.android.gms.tasks.Task r0 = r5.getTask()
            r3.f44100d = r0
        L_0x0096:
            android.content.Context r0 = r10.f44051b
            ff.t r5 = r10.f44052c
            ff.e$a r0 = p484ff.C16967e.m42804a(r0, r5)
            e1.y r5 = r0.f44039a
            if (r3 != 0) goto L_0x00a3
            goto L_0x00e9
        L_0x00a3:
            com.google.android.gms.tasks.Task<android.graphics.Bitmap> r6 = r3.f44100d     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            com.google.android.gms.tasks.Task r6 = (com.google.android.gms.tasks.Task) r6     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            r7 = 5
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            java.lang.Object r6 = com.google.android.gms.tasks.Tasks.await(r6, r7, r9)     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            r5.mo20035g(r6)     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            e1.u r7 = new e1.u     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            r7.<init>()     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            if (r6 != 0) goto L_0x00c1
            r8 = r4
            goto L_0x00c8
        L_0x00c1:
            androidx.core.graphics.drawable.IconCompat r8 = new androidx.core.graphics.drawable.IconCompat     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            r8.<init>(r1)     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            r8.f3345b = r6     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
        L_0x00c8:
            r7.f15616a = r8     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            r7.f15617b = r4     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            r7.f15618c = r1     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            r5.mo20037i(r7)     // Catch:{ ExecutionException -> 0x00e1, InterruptedException -> 0x00d6, TimeoutException -> 0x00d2 }
            goto L_0x00e9
        L_0x00d2:
            r3.close()
            goto L_0x00e9
        L_0x00d6:
            r3.close()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            goto L_0x00e9
        L_0x00e1:
            r3 = move-exception
            java.lang.Throwable r3 = r3.getCause()
            java.util.Objects.toString(r3)
        L_0x00e9:
            android.content.Context r3 = r10.f44051b
            java.lang.String r4 = "notification"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            java.lang.String r4 = r0.f44040b
            e1.y r0 = r0.f44039a
            android.app.Notification r0 = r0.mo20030a()
            r3.notify(r4, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p484ff.C16972g.mo49598a():boolean");
    }
}
