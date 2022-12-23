package f10;

import com.moovit.commons.utils.CallableRunnable;
import com.moovit.gcm.GcmNotificationActivity;
import com.moovit.gcm.notification.GcmNotification;
import p977zz.C20933d;

/* renamed from: f10.b */
public final /* synthetic */ class C16931b implements CallableRunnable {

    /* renamed from: b */
    public final /* synthetic */ GcmNotificationActivity f43942b;

    /* renamed from: c */
    public final /* synthetic */ int f43943c;

    /* renamed from: d */
    public final /* synthetic */ GcmNotification f43944d;

    public /* synthetic */ C16931b(GcmNotificationActivity gcmNotificationActivity, int i, GcmNotification gcmNotification) {
        this.f43942b = gcmNotificationActivity;
        this.f43943c = i;
        this.f43944d = gcmNotification;
    }

    public final /* synthetic */ void onError(Throwable th) {
        C20933d.m49028c(this, th);
    }

    public final /* synthetic */ void run() {
        C20933d.m49029d(this);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0033=Splitter:B:14:0x0033, B:27:0x0083=Splitter:B:27:0x0083} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void runSafe() {
        /*
            r9 = this;
            com.moovit.gcm.GcmNotificationActivity r0 = r9.f43942b
            int r1 = r9.f43943c
            com.moovit.gcm.notification.GcmNotification r2 = r9.f43944d
            java.lang.String r3 = com.moovit.gcm.GcmNotificationActivity.f41492x
            r0.getClass()
            i10.a r3 = i10.C17537a.f45127a
            monitor-enter(r3)
            ce0.C21100e.m49355o()     // Catch:{ all -> 0x00a7 }
            if (r2 != 0) goto L_0x001c
            androidx.core.app.NotificationManagerCompat r0 = androidx.core.app.NotificationManagerCompat.from(r0)     // Catch:{ all -> 0x00a7 }
            r0.cancel(r1)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r3)
            goto L_0x007f
        L_0x001c:
            com.moovit.gcm.payload.GcmPayload r1 = r2.f41524g     // Catch:{ all -> 0x00a7 }
            r1.mo47977c()     // Catch:{ all -> 0x00a7 }
            r1 = 1
            r4 = 0
            r5 = 0
            com.moovit.gcm.payload.GcmPayload r6 = r2.f41524g     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            f10.a r7 = f10.C16930a.m42749a()     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            com.moovit.gcm.payload.GcmPayload$a r7 = r7.mo49553d(r0)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            if (r7 == 0) goto L_0x0033
            r6.mo47976b(r7)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
        L_0x0033:
            f10.C16935f.m42761d(r0, r4)     // Catch:{ all -> 0x00a7 }
            androidx.core.app.NotificationManagerCompat r4 = androidx.core.app.NotificationManagerCompat.from(r0)     // Catch:{ all -> 0x00a7 }
            int r5 = r2.f41525h     // Catch:{ all -> 0x00a7 }
            r4.cancel(r5)     // Catch:{ all -> 0x00a7 }
            com.moovit.gcm.payload.GcmPayload r4 = r2.f41524g     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.f41546b     // Catch:{ all -> 0x00a7 }
            i10.C17537a.m43665a(r0, r4, r1)     // Catch:{ all -> 0x00a7 }
            k10.a r1 = k10.C17993a.f46075a     // Catch:{ all -> 0x00a7 }
        L_0x0048:
            com.moovit.gcm.payload.GcmPayload r4 = r2.f41524g     // Catch:{ all -> 0x00a7 }
            goto L_0x0072
        L_0x004b:
            r5 = move-exception
            goto L_0x0083
        L_0x004d:
            r1 = move-exception
            de.f r6 = p435de.C16596f.m42113a()     // Catch:{ all -> 0x0080 }
            com.moovit.commons.utils.ApplicationBugException r7 = new com.moovit.commons.utils.ApplicationBugException     // Catch:{ all -> 0x0080 }
            java.lang.String r8 = "Error executing GCM notification"
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0080 }
            r6.mo49364c(r7)     // Catch:{ all -> 0x0080 }
            f10.C16935f.m42761d(r0, r4)     // Catch:{ all -> 0x00a7 }
            androidx.core.app.NotificationManagerCompat r1 = androidx.core.app.NotificationManagerCompat.from(r0)     // Catch:{ all -> 0x00a7 }
            int r4 = r2.f41525h     // Catch:{ all -> 0x00a7 }
            r1.cancel(r4)     // Catch:{ all -> 0x00a7 }
            com.moovit.gcm.payload.GcmPayload r1 = r2.f41524g     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = r1.f41546b     // Catch:{ all -> 0x00a7 }
            i10.C17537a.m43665a(r0, r1, r5)     // Catch:{ all -> 0x00a7 }
            k10.a r1 = k10.C17993a.f46075a     // Catch:{ all -> 0x00a7 }
            goto L_0x0048
        L_0x0072:
            java.lang.String r4 = r4.f41546b     // Catch:{ all -> 0x00a7 }
            r1.mo50495k(r0, r4)     // Catch:{ all -> 0x00a7 }
            f10.a r1 = f10.C16930a.m42749a()     // Catch:{ all -> 0x00a7 }
            r1.mo49557h(r0, r2)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r3)
        L_0x007f:
            return
        L_0x0080:
            r1 = move-exception
            r5 = r1
            r1 = 0
        L_0x0083:
            f10.C16935f.m42761d(r0, r4)     // Catch:{ all -> 0x00a7 }
            androidx.core.app.NotificationManagerCompat r4 = androidx.core.app.NotificationManagerCompat.from(r0)     // Catch:{ all -> 0x00a7 }
            int r6 = r2.f41525h     // Catch:{ all -> 0x00a7 }
            r4.cancel(r6)     // Catch:{ all -> 0x00a7 }
            com.moovit.gcm.payload.GcmPayload r4 = r2.f41524g     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.f41546b     // Catch:{ all -> 0x00a7 }
            i10.C17537a.m43665a(r0, r4, r1)     // Catch:{ all -> 0x00a7 }
            k10.a r1 = k10.C17993a.f46075a     // Catch:{ all -> 0x00a7 }
            com.moovit.gcm.payload.GcmPayload r4 = r2.f41524g     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.f41546b     // Catch:{ all -> 0x00a7 }
            r1.mo50495k(r0, r4)     // Catch:{ all -> 0x00a7 }
            f10.a r1 = f10.C16930a.m42749a()     // Catch:{ all -> 0x00a7 }
            r1.mo49557h(r0, r2)     // Catch:{ all -> 0x00a7 }
            throw r5     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f10.C16931b.runSafe():void");
    }
}
