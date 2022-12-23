package com.fyber.inneractive.sdk.config;

import android.content.Context;

/* renamed from: com.fyber.inneractive.sdk.config.s */
public class C2696s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f9416a;

    /* renamed from: b */
    public final /* synthetic */ C2697t f9417b;

    public C2696s(Context context, C2697t tVar) {
        this.f9416a = context;
        this.f9417b = tVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = r5.f9416a     // Catch:{ ClassNotFoundException -> 0x003b }
            com.fyber.inneractive.sdk.config.t r2 = r5.f9417b     // Catch:{ ClassNotFoundException -> 0x003b }
            com.fyber.inneractive.sdk.config.C2698u.m6769a(r1, r2)     // Catch:{ ClassNotFoundException -> 0x003b }
            java.lang.String r1 = com.fyber.inneractive.sdk.config.C2672k.m6749a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x003a
            android.content.Context r1 = r5.f9416a
            com.fyber.inneractive.sdk.config.t r2 = r5.f9417b
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x003a }
            java.lang.String r3 = "limit_ad_tracking"
            int r3 = android.provider.Settings.Secure.getInt(r1, r3)     // Catch:{ SettingNotFoundException -> 0x003a }
            r4 = 1
            if (r3 == 0) goto L_0x0024
            r0 = 1
        L_0x0024:
            java.lang.String r3 = "advertising_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r3)     // Catch:{ SettingNotFoundException -> 0x003a }
            com.fyber.inneractive.sdk.config.k r2 = (com.fyber.inneractive.sdk.config.C2672k) r2     // Catch:{ SettingNotFoundException -> 0x003a }
            monitor-enter(r2)     // Catch:{ SettingNotFoundException -> 0x003a }
            com.fyber.inneractive.sdk.config.k$c r3 = r2.f9344b     // Catch:{ all -> 0x0037 }
            r3.f9346a = r1     // Catch:{ all -> 0x0037 }
            r3.f9347b = r0     // Catch:{ all -> 0x0037 }
            r3.f9348c = r4     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)     // Catch:{ SettingNotFoundException -> 0x003a }
            goto L_0x003a
        L_0x0037:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ SettingNotFoundException -> 0x003a }
            throw r0     // Catch:{ SettingNotFoundException -> 0x003a }
        L_0x003a:
            return
        L_0x003b:
            r1 = move-exception
            java.lang.String r2 = "SDK internal error: Make sure that Google Play Services for Mobile Ads is added to the compile dependencies of your project"
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.fyber.inneractive.sdk.util.IAlog.m9903b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.C2696s.run():void");
    }
}
