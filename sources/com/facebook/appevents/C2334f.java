package com.facebook.appevents;

/* renamed from: com.facebook.appevents.f */
public final /* synthetic */ class C2334f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f8527b;

    public /* synthetic */ C2334f(int i) {
        this.f8527b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f2, code lost:
        if (r1 == false) goto L_0x00f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.f8527b
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0063;
                case 1: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0081
        L_0x0009:
            c8.a r0 = p040c8.C1802a.f6291a
            java.lang.Class<c8.a> r0 = p040c8.C1802a.class
            boolean r3 = p262t8.C6606a.m15601b(r0)
            if (r3 == 0) goto L_0x0014
            goto L_0x0062
        L_0x0014:
            android.content.Context r3 = p009a8.C0115o.m210a()     // Catch:{ all -> 0x005e }
            com.facebook.internal.b r4 = com.facebook.internal.C2376b.f8604f     // Catch:{ all -> 0x005e }
            com.facebook.internal.b r3 = com.facebook.internal.C2376b.C2377a.m6272a(r3)     // Catch:{ all -> 0x005e }
            if (r3 == 0) goto L_0x0026
            boolean r3 = r3.f8609e     // Catch:{ all -> 0x005e }
            if (r3 == 0) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            if (r3 != 0) goto L_0x0062
            c8.a r3 = p040c8.C1802a.f6291a     // Catch:{ all -> 0x005e }
            r3.getClass()     // Catch:{ all -> 0x005e }
            boolean r4 = p262t8.C6606a.m15601b(r3)     // Catch:{ all -> 0x005e }
            if (r4 == 0) goto L_0x0035
            goto L_0x005b
        L_0x0035:
            com.facebook.internal.FetchedAppSettingsManager r4 = com.facebook.internal.FetchedAppSettingsManager.f8592a     // Catch:{ all -> 0x0057 }
            java.lang.String r4 = p009a8.C0115o.m211b()     // Catch:{ all -> 0x0057 }
            com.facebook.internal.s r1 = com.facebook.internal.FetchedAppSettingsManager.m6264f(r4, r1)     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x0042
            goto L_0x005b
        L_0x0042:
            java.lang.String r1 = r1.f8718k     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x0047
            goto L_0x005b
        L_0x0047:
            java.util.concurrent.CopyOnWriteArraySet r4 = p040c8.C1804c.m5115a()     // Catch:{ JSONException -> 0x005b }
            r4.clear()     // Catch:{ JSONException -> 0x005b }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005b }
            r4.<init>(r1)     // Catch:{ JSONException -> 0x005b }
            p040c8.C1804c.C1805a.m5117a(r4)     // Catch:{ JSONException -> 0x005b }
            goto L_0x005b
        L_0x0057:
            r1 = move-exception
            p262t8.C6606a.m15600a(r3, r1)     // Catch:{ all -> 0x005e }
        L_0x005b:
            p040c8.C1802a.f6292b = r2     // Catch:{ all -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r1 = move-exception
            p262t8.C6606a.m15600a(r0, r1)
        L_0x0062:
            return
        L_0x0063:
            java.lang.Class<com.facebook.appevents.g> r0 = com.facebook.appevents.C2335g.class
            boolean r1 = p262t8.C6606a.m15601b(r0)
            if (r1 == 0) goto L_0x006c
            goto L_0x0080
        L_0x006c:
            int r1 = com.facebook.appevents.C2336h.f8534a     // Catch:{ all -> 0x007c }
            androidx.lifecycle.u r1 = com.facebook.appevents.C2335g.f8530c     // Catch:{ all -> 0x007c }
            com.facebook.appevents.C2336h.m6202a(r1)     // Catch:{ all -> 0x007c }
            androidx.lifecycle.u r1 = new androidx.lifecycle.u     // Catch:{ all -> 0x007c }
            r2 = 3
            r1.<init>((int) r2)     // Catch:{ all -> 0x007c }
            com.facebook.appevents.C2335g.f8530c = r1     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r1 = move-exception
            p262t8.C6606a.m15600a(r0, r1)
        L_0x0080:
            return
        L_0x0081:
            com.facebook.appevents.ml.ModelManager r0 = com.facebook.appevents.p047ml.ModelManager.f8546a
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r3 = "models"
            java.lang.Class<com.facebook.appevents.ml.ModelManager> r4 = com.facebook.appevents.p047ml.ModelManager.class
            boolean r5 = p262t8.C6606a.m15601b(r4)
            if (r5 == 0) goto L_0x0091
            goto L_0x0121
        L_0x0091:
            android.content.Context r5 = p009a8.C0115o.m210a()     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            java.lang.String r6 = "com.facebook.internal.MODEL_STORE"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r6, r1)     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            r6 = 0
            java.lang.String r6 = r5.getString(r3, r6)     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            if (r6 == 0) goto L_0x00b4
            int r7 = r6.length()     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            if (r7 != 0) goto L_0x00aa
            r7 = 1
            goto L_0x00ab
        L_0x00aa:
            r7 = 0
        L_0x00ab:
            if (r7 == 0) goto L_0x00ae
            goto L_0x00b4
        L_0x00ae:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            goto L_0x00b9
        L_0x00b4:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            r7.<init>()     // Catch:{ Exception -> 0x0121, all -> 0x011d }
        L_0x00b9:
            r8 = 0
            long r10 = r5.getLong(r0, r8)     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            com.facebook.internal.FeatureManager r6 = com.facebook.internal.FeatureManager.f8588a     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            com.facebook.internal.FeatureManager$Feature r6 = com.facebook.internal.FeatureManager.Feature.ModelRequest     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            boolean r6 = com.facebook.internal.FeatureManager.m6257c(r6)     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            if (r6 == 0) goto L_0x00f4
            int r6 = r7.length()     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            if (r6 == 0) goto L_0x00f4
            com.facebook.appevents.ml.ModelManager r6 = com.facebook.appevents.p047ml.ModelManager.f8546a     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            r6.getClass()     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            boolean r12 = p262t8.C6606a.m15601b(r6)     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            if (r12 == 0) goto L_0x00db
            goto L_0x00f2
        L_0x00db:
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 != 0) goto L_0x00e0
            goto L_0x00f2
        L_0x00e0:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ee }
            long r8 = r8 - r10
            r10 = 259200000(0xf731400, double:1.280618154E-315)
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x00f2
            r1 = 1
            goto L_0x00f2
        L_0x00ee:
            r2 = move-exception
            p262t8.C6606a.m15600a(r6, r2)     // Catch:{ Exception -> 0x0121, all -> 0x011d }
        L_0x00f2:
            if (r1 != 0) goto L_0x0114
        L_0x00f4:
            com.facebook.appevents.ml.ModelManager r1 = com.facebook.appevents.p047ml.ModelManager.f8546a     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            org.json.JSONObject r7 = r1.mo12495c()     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            if (r7 != 0) goto L_0x00fd
            goto L_0x0121
        L_0x00fd:
            android.content.SharedPreferences$Editor r1 = r5.edit()     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            java.lang.String r2 = r7.toString()     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r2)     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            r0.apply()     // Catch:{ Exception -> 0x0121, all -> 0x011d }
        L_0x0114:
            com.facebook.appevents.ml.ModelManager r0 = com.facebook.appevents.p047ml.ModelManager.f8546a     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            r0.mo12493a(r7)     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            r0.mo12494b()     // Catch:{ Exception -> 0x0121, all -> 0x011d }
            goto L_0x0121
        L_0x011d:
            r0 = move-exception
            p262t8.C6606a.m15600a(r4, r0)
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2334f.run():void");
    }
}
