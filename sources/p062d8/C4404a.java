package p062d8;

import com.facebook.GraphRequest;

/* renamed from: d8.a */
public final /* synthetic */ class C4404a implements GraphRequest.C2280b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.util.LinkedHashMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076 A[Catch:{ all -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084 A[Catch:{ all -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092 A[Catch:{ all -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093 A[Catch:{ all -> 0x00bd }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo200b(p009a8.C0124u r14) {
        /*
            r13 = this;
            d8.b r0 = p062d8.C4405b.f15466a
            r0.getClass()
            java.lang.String r0 = "CloudBridge Settings API response is not a valid json: \n%s "
            java.lang.String r1 = "TAG"
            com.facebook.FacebookRequestError r2 = r14.f366c
            r3 = 0
            r4 = 1
            r5 = 0
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            if (r2 == 0) goto L_0x011d
            com.facebook.internal.x$a r0 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.APP_EVENTS
            java.lang.String r1 = p062d8.C4405b.f15467b
            if (r1 == 0) goto L_0x0117
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r2 = r2.toString()
            r7[r3] = r2
            com.facebook.FacebookRequestError r14 = r14.f366c
            com.facebook.FacebookException r14 = r14.f8424j
            java.lang.String r14 = java.lang.String.valueOf(r14)
            r7[r4] = r14
            java.lang.String r14 = " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n "
            com.facebook.internal.C2436x.C2437a.m6390b(r0, r1, r14, r7)
            java.lang.Class<d8.b> r14 = p062d8.C4405b.class
            boolean r2 = p262t8.C6606a.m15601b(r14)
            if (r2 == 0) goto L_0x003c
            goto L_0x00c1
        L_0x003c:
            android.content.Context r2 = p009a8.C0115o.m210a()     // Catch:{ all -> 0x00bd }
            java.lang.String r7 = "com.facebook.sdk.CloudBridgeSavedCredentials"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r7, r3)     // Catch:{ all -> 0x00bd }
            if (r2 != 0) goto L_0x004a
            goto L_0x00c1
        L_0x004a:
            com.facebook.appevents.cloudbridge.SettingsAPIFields r7 = com.facebook.appevents.cloudbridge.SettingsAPIFields.DATASETID     // Catch:{ all -> 0x00bd }
            java.lang.String r8 = r7.getRawValue()     // Catch:{ all -> 0x00bd }
            java.lang.String r8 = r2.getString(r8, r5)     // Catch:{ all -> 0x00bd }
            com.facebook.appevents.cloudbridge.SettingsAPIFields r9 = com.facebook.appevents.cloudbridge.SettingsAPIFields.URL     // Catch:{ all -> 0x00bd }
            java.lang.String r10 = r9.getRawValue()     // Catch:{ all -> 0x00bd }
            java.lang.String r10 = r2.getString(r10, r5)     // Catch:{ all -> 0x00bd }
            com.facebook.appevents.cloudbridge.SettingsAPIFields r11 = com.facebook.appevents.cloudbridge.SettingsAPIFields.ACCESSKEY     // Catch:{ all -> 0x00bd }
            java.lang.String r12 = r11.getRawValue()     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = r2.getString(r12, r5)     // Catch:{ all -> 0x00bd }
            if (r8 == 0) goto L_0x0073
            boolean r12 = uh0.C25081h.m62831B(r8)     // Catch:{ all -> 0x00bd }
            if (r12 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r12 = 0
            goto L_0x0074
        L_0x0073:
            r12 = 1
        L_0x0074:
            if (r12 != 0) goto L_0x00c1
            if (r10 == 0) goto L_0x0081
            boolean r12 = uh0.C25081h.m62831B(r10)     // Catch:{ all -> 0x00bd }
            if (r12 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r12 = 0
            goto L_0x0082
        L_0x0081:
            r12 = 1
        L_0x0082:
            if (r12 != 0) goto L_0x00c1
            if (r2 == 0) goto L_0x008f
            boolean r12 = uh0.C25081h.m62831B(r2)     // Catch:{ all -> 0x00bd }
            if (r12 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r12 = 0
            goto L_0x0090
        L_0x008f:
            r12 = 1
        L_0x0090:
            if (r12 == 0) goto L_0x0093
            goto L_0x00c1
        L_0x0093:
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00bd }
            r12.<init>()     // Catch:{ all -> 0x00bd }
            java.lang.String r9 = r9.getRawValue()     // Catch:{ all -> 0x00bd }
            r12.put(r9, r10)     // Catch:{ all -> 0x00bd }
            java.lang.String r7 = r7.getRawValue()     // Catch:{ all -> 0x00bd }
            r12.put(r7, r8)     // Catch:{ all -> 0x00bd }
            java.lang.String r7 = r11.getRawValue()     // Catch:{ all -> 0x00bd }
            r12.put(r7, r2)     // Catch:{ all -> 0x00bd }
            java.lang.String r7 = " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n "
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x00bd }
            r9[r3] = r8     // Catch:{ all -> 0x00bd }
            r9[r4] = r10     // Catch:{ all -> 0x00bd }
            r9[r6] = r2     // Catch:{ all -> 0x00bd }
            com.facebook.internal.C2436x.C2437a.m6390b(r0, r1, r7, r9)     // Catch:{ all -> 0x00bd }
            r5 = r12
            goto L_0x00c1
        L_0x00bd:
            r0 = move-exception
            p262t8.C6606a.m15600a(r14, r0)
        L_0x00c1:
            if (r5 == 0) goto L_0x01fc
            java.net.URL r14 = new java.net.URL
            com.facebook.appevents.cloudbridge.SettingsAPIFields r0 = com.facebook.appevents.cloudbridge.SettingsAPIFields.URL
            java.lang.String r0 = r0.getRawValue()
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r14.<init>(r0)
            java.util.HashSet<java.lang.Integer> r0 = com.facebook.appevents.cloudbridge.C2329a.f8501a
            com.facebook.appevents.cloudbridge.SettingsAPIFields r0 = com.facebook.appevents.cloudbridge.SettingsAPIFields.DATASETID
            java.lang.String r0 = r0.getRawValue()
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r14.getProtocol()
            r1.append(r2)
            java.lang.String r2 = "://"
            r1.append(r2)
            java.lang.String r14 = r14.getHost()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            com.facebook.appevents.cloudbridge.SettingsAPIFields r1 = com.facebook.appevents.cloudbridge.SettingsAPIFields.ACCESSKEY
            java.lang.String r1 = r1.getRawValue()
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.facebook.appevents.cloudbridge.C2329a.m6192b(r0, r14, r1)
            p062d8.C4405b.f15468c = r4
            goto L_0x01fc
        L_0x0117:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r6)
            throw r14
        L_0x011d:
            com.facebook.internal.x$a r2 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r2 = com.facebook.LoggingBehavior.APP_EVENTS
            java.lang.String r7 = p062d8.C4405b.f15467b
            if (r7 == 0) goto L_0x01fd
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r3] = r14
            java.lang.String r8 = " \n\nGraph Response Received: \n================\n%s\n\n "
            com.facebook.internal.C2436x.C2437a.m6390b(r2, r7, r8, r6)
            org.json.JSONObject r14 = r14.f365b
            com.facebook.internal.f0 r6 = com.facebook.internal.C2397f0.f8630a     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            if (r14 != 0) goto L_0x0135
            goto L_0x013b
        L_0x0135:
            java.lang.String r5 = "data"
            java.lang.Object r5 = r14.get(r5)     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
        L_0x013b:
            if (r5 == 0) goto L_0x01c9
            org.json.JSONArray r5 = (org.json.JSONArray) r5     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.util.ArrayList r14 = com.facebook.internal.C2397f0.m6313g(r5)     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.lang.Object r14 = kotlin.collections.C23825c.m58515l0(r14)     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            r5.<init>(r14)     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.util.HashMap r14 = com.facebook.internal.C2397f0.m6314h(r5)     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            com.facebook.appevents.cloudbridge.SettingsAPIFields r5 = com.facebook.appevents.cloudbridge.SettingsAPIFields.URL     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.lang.String r5 = r5.getRawValue()     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.lang.Object r5 = r14.get(r5)     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            com.facebook.appevents.cloudbridge.SettingsAPIFields r6 = com.facebook.appevents.cloudbridge.SettingsAPIFields.DATASETID     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.lang.String r6 = r6.getRawValue()     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.lang.Object r6 = r14.get(r6)     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            com.facebook.appevents.cloudbridge.SettingsAPIFields r8 = com.facebook.appevents.cloudbridge.SettingsAPIFields.ACCESSKEY     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.lang.String r8 = r8.getRawValue()     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.lang.Object r8 = r14.get(r8)     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            if (r5 == 0) goto L_0x01c3
            if (r6 == 0) goto L_0x01c3
            if (r8 != 0) goto L_0x017d
            goto L_0x01c3
        L_0x017d:
            com.facebook.appevents.cloudbridge.C2329a.m6192b(r6, r5, r8)     // Catch:{ MalformedURLException -> 0x01ab }
            p062d8.C4405b.m11580a(r14)     // Catch:{ MalformedURLException -> 0x01ab }
            com.facebook.appevents.cloudbridge.SettingsAPIFields r0 = com.facebook.appevents.cloudbridge.SettingsAPIFields.ENABLED
            java.lang.String r1 = r0.getRawValue()
            java.lang.Object r1 = r14.get(r1)
            if (r1 == 0) goto L_0x01a8
            java.lang.String r0 = r0.getRawValue()
            java.lang.Object r14 = r14.get(r0)
            if (r14 == 0) goto L_0x01a0
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r3 = r14.booleanValue()
            goto L_0x01a8
        L_0x01a0:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            r14.<init>(r0)
            throw r14
        L_0x01a8:
            p062d8.C4405b.f15468c = r3
            goto L_0x01fc
        L_0x01ab:
            r14 = move-exception
            com.facebook.internal.x$a r0 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.APP_EVENTS
            java.lang.String r2 = p062d8.C4405b.f15467b
            mf0.C24362h.m61210e(r2, r1)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r14 = p626lf.C18201b.m44927y(r14)
            r1[r3] = r14
            java.lang.String r14 = "CloudBridge Settings API response doesn't have valid url\n %s "
            com.facebook.internal.C2436x.C2437a.m6390b(r0, r2, r14, r1)
            goto L_0x01fc
        L_0x01c3:
            java.lang.String r14 = "CloudBridge Settings API response doesn't have valid data"
            com.facebook.internal.C2436x.C2437a.m6389a(r2, r7, r14)
            goto L_0x01fc
        L_0x01c9:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            java.lang.String r2 = "null cannot be cast to non-null type org.json.JSONArray"
            r14.<init>(r2)     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
            throw r14     // Catch:{ JSONException -> 0x01e7, NullPointerException -> 0x01d1 }
        L_0x01d1:
            r14 = move-exception
            com.facebook.internal.x$a r2 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r2 = com.facebook.LoggingBehavior.APP_EVENTS
            java.lang.String r5 = p062d8.C4405b.f15467b
            mf0.C24362h.m61210e(r5, r1)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r14 = p626lf.C18201b.m44927y(r14)
            r1[r3] = r14
            com.facebook.internal.C2436x.C2437a.m6390b(r2, r5, r0, r1)
            goto L_0x01fc
        L_0x01e7:
            r14 = move-exception
            com.facebook.internal.x$a r2 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r2 = com.facebook.LoggingBehavior.APP_EVENTS
            java.lang.String r5 = p062d8.C4405b.f15467b
            mf0.C24362h.m61210e(r5, r1)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r14 = p626lf.C18201b.m44927y(r14)
            r1[r3] = r14
            com.facebook.internal.C2436x.C2437a.m6390b(r2, r5, r0, r1)
        L_0x01fc:
            return
        L_0x01fd:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r6)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p062d8.C4404a.mo200b(a8.u):void");
    }
}
