package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p244s3.C6447v;
import p304x.C7073m;
import p484ff.C16980j0;

/* renamed from: com.google.firebase.messaging.c */
public final class C14475c implements ServiceConnection {

    /* renamed from: b */
    public final Context f36594b;

    /* renamed from: c */
    public final Intent f36595c;

    /* renamed from: d */
    public final ScheduledExecutorService f36596d;

    /* renamed from: e */
    public final ArrayDeque f36597e = new ArrayDeque();

    /* renamed from: f */
    public C14473b f36598f;

    /* renamed from: g */
    public boolean f36599g = false;

    /* renamed from: com.google.firebase.messaging.c$a */
    public static class C14476a {

        /* renamed from: a */
        public final Intent f36600a;

        /* renamed from: b */
        public final TaskCompletionSource<Void> f36601b = new TaskCompletionSource<>();

        public C14476a(Intent intent) {
            this.f36600a = intent;
        }
    }

    public C14475c(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.f36594b = applicationContext;
        this.f36595c = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f36596d = scheduledThreadPoolExecutor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(r4.f36594b, r4.f36595c, r4, 65) != false) goto L_0x0054;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43439a() {
        /*
            r4 = this;
            monitor-enter(r4)
        L_0x0001:
            java.util.ArrayDeque r0 = r4.f36597e     // Catch:{ all -> 0x0058 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x0056
            com.google.firebase.messaging.b r0 = r4.f36598f     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0021
            java.util.ArrayDeque r0 = r4.f36597e     // Catch:{ all -> 0x0058 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0058 }
            com.google.firebase.messaging.c$a r0 = (com.google.firebase.messaging.C14475c.C14476a) r0     // Catch:{ all -> 0x0058 }
            com.google.firebase.messaging.b r1 = r4.f36598f     // Catch:{ all -> 0x0058 }
            r1.mo43438a(r0)     // Catch:{ all -> 0x0058 }
            goto L_0x0001
        L_0x0021:
            boolean r0 = r4.f36599g     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0054
        L_0x0026:
            r0 = 1
            r4.f36599g = r0     // Catch:{ all -> 0x0058 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ SecurityException -> 0x003a }
            android.content.Context r1 = r4.f36594b     // Catch:{ SecurityException -> 0x003a }
            android.content.Intent r2 = r4.f36595c     // Catch:{ SecurityException -> 0x003a }
            r3 = 65
            boolean r0 = r0.bindService(r1, r2, r4, r3)     // Catch:{ SecurityException -> 0x003a }
            if (r0 == 0) goto L_0x003a
            goto L_0x0054
        L_0x003a:
            r0 = 0
            r4.f36599g = r0     // Catch:{ all -> 0x0058 }
        L_0x003d:
            java.util.ArrayDeque r0 = r4.f36597e     // Catch:{ all -> 0x0058 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x0054
            java.util.ArrayDeque r0 = r4.f36597e     // Catch:{ all -> 0x0058 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0058 }
            com.google.firebase.messaging.c$a r0 = (com.google.firebase.messaging.C14475c.C14476a) r0     // Catch:{ all -> 0x0058 }
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r0.f36601b     // Catch:{ all -> 0x0058 }
            r1 = 0
            r0.trySetResult(r1)     // Catch:{ all -> 0x0058 }
            goto L_0x003d
        L_0x0054:
            monitor-exit(r4)
            return
        L_0x0056:
            monitor-exit(r4)
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C14475c.mo43439a():void");
    }

    /* renamed from: b */
    public final synchronized Task<Void> mo43440b(Intent intent) {
        C14476a aVar;
        boolean z;
        long j;
        aVar = new C14476a(intent);
        ScheduledExecutorService scheduledExecutorService = this.f36596d;
        if ((aVar.f36600a.getFlags() & 268435456) != 0) {
            z = true;
        } else {
            z = false;
        }
        C7073m mVar = new C7073m(aVar, 7);
        if (z) {
            j = C16980j0.f44078a;
        } else {
            j = 9000;
        }
        aVar.f36601b.getTask().addOnCompleteListener((Executor) scheduledExecutorService, new C6447v(scheduledExecutorService.schedule(mVar, j, TimeUnit.MILLISECONDS), 1));
        this.f36597e.add(aVar);
        mo43439a();
        return aVar.f36601b.getTask();
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable(FirebaseMessaging.TAG, 3)) {
            Objects.toString(componentName);
        }
        this.f36599g = false;
        if (!(iBinder instanceof C14473b)) {
            Objects.toString(iBinder);
            while (!this.f36597e.isEmpty()) {
                ((C14476a) this.f36597e.poll()).f36601b.trySetResult(null);
            }
            return;
        }
        this.f36598f = (C14473b) iBinder;
        mo43439a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(FirebaseMessaging.TAG, 3)) {
            Objects.toString(componentName);
        }
        mo43439a();
    }
}
