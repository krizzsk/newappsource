package p259t5;

/* renamed from: t5.d */
public final /* synthetic */ class C6594d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f20415b;

    public /* synthetic */ C6594d(int i) {
        this.f20415b = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: j8.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: j8.k} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f20415b
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x000a
        L_0x0006:
            com.appboy.p044ui.inappmessage.AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true)
            return
        L_0x000a:
            j8.i r0 = p135j8.C5396c.f17725g
            if (r0 != 0) goto L_0x0086
            android.content.Context r0 = p009a8.C0115o.m210a()
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)
            r1 = 0
            java.lang.String r3 = "com.facebook.appevents.SessionInfo.sessionStartTime"
            long r3 = r0.getLong(r3, r1)
            java.lang.String r5 = "com.facebook.appevents.SessionInfo.sessionEndTime"
            long r5 = r0.getLong(r5, r1)
            r7 = 0
            java.lang.String r8 = "com.facebook.appevents.SessionInfo.sessionId"
            java.lang.String r8 = r0.getString(r8, r7)
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 == 0) goto L_0x0084
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 == 0) goto L_0x0084
            if (r8 != 0) goto L_0x0036
            goto L_0x0084
        L_0x0036:
            j8.i r1 = new j8.i
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1.<init>(r2, r3)
            r2 = 0
            java.lang.String r3 = "com.facebook.appevents.SessionInfo.interruptionCount"
            int r0 = r0.getInt(r3, r2)
            r1.f17749d = r0
            android.content.Context r0 = p009a8.C0115o.m210a()
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)
            java.lang.String r3 = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage"
            boolean r4 = r0.contains(r3)
            if (r4 != 0) goto L_0x005d
            goto L_0x006c
        L_0x005d:
            java.lang.String r3 = r0.getString(r3, r7)
            java.lang.String r4 = "com.facebook.appevents.SourceApplicationInfo.openedByApplink"
            boolean r0 = r0.getBoolean(r4, r2)
            j8.k r7 = new j8.k
            r7.<init>(r3, r0)
        L_0x006c:
            r1.f17751f = r7
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.f17750e = r0
            java.util.UUID r0 = java.util.UUID.fromString(r8)
            java.lang.String r2 = "fromString(sessionIDStr)"
            mf0.C24362h.m61210e(r0, r2)
            r1.f17748c = r0
            r7 = r1
        L_0x0084:
            p135j8.C5396c.f17725g = r7
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p259t5.C6594d.run():void");
    }
}
