package p009a8;

import java.util.concurrent.Callable;

/* renamed from: a8.m */
public final /* synthetic */ class C0113m implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f328b;

    /* renamed from: c */
    public final /* synthetic */ Object f329c;

    public /* synthetic */ C0113m(Object obj, int i) {
        this.f328b = i;
        this.f329c = obj;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [wf.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049 A[SYNTHETIC, Splitter:B:18:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051 A[Catch:{ FileNotFoundException | JSONException -> 0x004d, all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f A[SYNTHETIC, Splitter:B:42:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fa A[SYNTHETIC, Splitter:B:62:0x00fa] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015d A[SYNTHETIC, Splitter:B:78:0x015d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r7 = this;
            int r0 = r7.f328b
            r1 = 0
            r2 = 0
            switch(r0) {
                case 0: goto L_0x005a;
                case 1: goto L_0x0016;
                case 2: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0176
        L_0x0009:
            java.lang.Object r0 = r7.f329c
            com.moovit.app.tod.bookingflow.TodBookingOrderViewModel r0 = (com.moovit.app.tod.bookingflow.TodBookingOrderViewModel) r0
            android.app.Application r0 = r0.f3907b
            com.moovit.MoovitApplication r0 = (com.moovit.MoovitApplication) r0
            c70.e r0 = com.moovit.app.tod.bookingflow.TodBookingOrderViewModel.m39599a(r0)
            return r0
        L_0x0016:
            java.lang.Object r0 = r7.f329c
            wf.h r0 = (p886wf.C20303h) r0
            monitor-enter(r0)
            android.content.Context r3 = r0.f51487a     // Catch:{ FileNotFoundException | JSONException -> 0x004d, all -> 0x0046 }
            java.lang.String r4 = r0.f51488b     // Catch:{ FileNotFoundException | JSONException -> 0x004d, all -> 0x0046 }
            java.io.FileInputStream r3 = r3.openFileInput(r4)     // Catch:{ FileNotFoundException | JSONException -> 0x004d, all -> 0x0046 }
            int r4 = r3.available()     // Catch:{ FileNotFoundException | JSONException -> 0x0044, all -> 0x0041 }
            byte[] r5 = new byte[r4]     // Catch:{ FileNotFoundException | JSONException -> 0x0044, all -> 0x0041 }
            r3.read(r5, r1, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0044, all -> 0x0041 }
            java.lang.String r1 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x0044, all -> 0x0041 }
            java.lang.String r4 = "UTF-8"
            r1.<init>(r5, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0044, all -> 0x0041 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x0044, all -> 0x0041 }
            r4.<init>(r1)     // Catch:{ FileNotFoundException | JSONException -> 0x0044, all -> 0x0041 }
            wf.d r2 = p886wf.C20299d.m47869a(r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0044, all -> 0x0041 }
            r3.close()     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)
            goto L_0x0059
        L_0x0041:
            r1 = move-exception
            r2 = r3
            goto L_0x0047
        L_0x0044:
            goto L_0x004f
        L_0x0046:
            r1 = move-exception
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ all -> 0x0055 }
        L_0x004c:
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x004d:
            r3 = r2
        L_0x004f:
            if (r3 == 0) goto L_0x0058
            r3.close()     // Catch:{ all -> 0x0055 }
            goto L_0x0058
        L_0x0055:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0058:
            monitor-exit(r0)
        L_0x0059:
            return r2
        L_0x005a:
            java.lang.Object r0 = r7.f329c
            a8.o$a r0 = (p009a8.C0115o.C0116a) r0
            a8.o r3 = p009a8.C0115o.f331a
            a8.e$a r3 = p009a8.C0100e.f304f
            a8.e r3 = r3.mo216a()
            a8.a r4 = r3.f307b
            android.content.SharedPreferences r5 = r4.f270a
            java.lang.String r6 = "com.facebook.AccessTokenManager.CachedAccessToken"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0087
            android.content.SharedPreferences r4 = r4.f270a
            java.lang.String r4 = r4.getString(r6, r2)
            if (r4 == 0) goto L_0x0087
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0086 }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x0086 }
            java.util.Date r4 = com.facebook.AccessToken.f8348m     // Catch:{ JSONException -> 0x0086 }
            com.facebook.AccessToken r4 = com.facebook.AccessToken.C2266c.m6109a(r5)     // Catch:{ JSONException -> 0x0086 }
            goto L_0x0088
        L_0x0086:
        L_0x0087:
            r4 = r2
        L_0x0088:
            if (r4 == 0) goto L_0x008d
            r3.mo215c(r4, r1)
        L_0x008d:
            a8.w$a r3 = p009a8.C0127w.f369d
            a8.w r3 = r3.mo282a()
            a8.v r4 = r3.f372b
            android.content.SharedPreferences r4 = r4.f368a
            java.lang.String r5 = "com.facebook.ProfileManager.CachedProfile"
            java.lang.String r4 = r4.getString(r5, r2)
            if (r4 == 0) goto L_0x00ab
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00aa }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x00aa }
            com.facebook.Profile r4 = new com.facebook.Profile     // Catch:{ JSONException -> 0x00aa }
            r4.<init>((org.json.JSONObject) r5)     // Catch:{ JSONException -> 0x00aa }
            goto L_0x00ac
        L_0x00aa:
        L_0x00ab:
            r4 = r2
        L_0x00ac:
            if (r4 == 0) goto L_0x00b1
            r3.mo281a(r4, r1)
        L_0x00b1:
            java.util.Date r3 = com.facebook.AccessToken.f8348m
            boolean r3 = com.facebook.AccessToken.C2266c.m6111c()
            if (r3 == 0) goto L_0x00c8
            android.os.Parcelable$Creator<com.facebook.Profile> r3 = com.facebook.Profile.CREATOR
            a8.w$a r3 = p009a8.C0127w.f369d
            a8.w r3 = r3.mo282a()
            com.facebook.Profile r3 = r3.f373c
            if (r3 != 0) goto L_0x00c8
            com.facebook.Profile.C2287b.m6157a()
        L_0x00c8:
            if (r0 != 0) goto L_0x00cb
            goto L_0x00ce
        L_0x00cb:
            r0.mo260a()
        L_0x00ce:
            android.content.Context r0 = p009a8.C0115o.m210a()
            java.lang.String r3 = p009a8.C0115o.f334d
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = com.facebook.appevents.C2338j.f8537c
            boolean r4 = p009a8.C0098d0.m169b()
            if (r4 != 0) goto L_0x00dd
            goto L_0x00f1
        L_0x00dd:
            com.facebook.appevents.j r4 = new com.facebook.appevents.j
            r4.<init>((android.content.Context) r0, (java.lang.String) r3)
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = com.facebook.appevents.C2338j.m6206b()
            if (r3 == 0) goto L_0x016a
            x.v r5 = new x.v
            r6 = 7
            r5.<init>(r6, r0, r4)
            r3.execute(r5)
        L_0x00f1:
            java.lang.Class<a8.d0> r0 = p009a8.C0098d0.class
            boolean r3 = p262t8.C6606a.m15601b(r0)
            if (r3 == 0) goto L_0x00fa
            goto L_0x0144
        L_0x00fa:
            android.content.Context r3 = p009a8.C0115o.m210a()     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            java.lang.String r5 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            java.lang.String r5 = "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)"
            mf0.C24362h.m61210e(r4, r5)     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            if (r4 == 0) goto L_0x0144
            java.lang.String r5 = "com.facebook.sdk.AutoAppLinkEnabled"
            boolean r1 = r4.getBoolean(r5, r1)     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            if (r1 == 0) goto L_0x0144
            com.facebook.appevents.j r1 = new com.facebook.appevents.j     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            r1.<init>((android.content.Context) r3, (java.lang.String) r2)     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            boolean r4 = com.facebook.internal.C2397f0.m6329w()     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            if (r4 != 0) goto L_0x0134
            java.lang.String r4 = "SchemeWarning"
            java.lang.String r5 = "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest"
            r3.putString(r4, r5)     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
        L_0x0134:
            java.lang.String r4 = "fb_auto_applink"
            boolean r5 = p009a8.C0098d0.m169b()     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            if (r5 == 0) goto L_0x0144
            r1.mo12484d(r3, r4)     // Catch:{ NameNotFoundException -> 0x0144, all -> 0x0140 }
            goto L_0x0144
        L_0x0140:
            r1 = move-exception
            p262t8.C6606a.m15600a(r0, r1)
        L_0x0144:
            android.content.Context r0 = p009a8.C0115o.m210a()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "getApplicationContext().applicationContext"
            mf0.C24362h.m61210e(r0, r1)
            com.facebook.appevents.j r1 = new com.facebook.appevents.j
            r1.<init>((android.content.Context) r0, (java.lang.String) r2)
            boolean r0 = p262t8.C6606a.m15601b(r1)
            if (r0 == 0) goto L_0x015d
            goto L_0x0169
        L_0x015d:
            java.lang.String r0 = com.facebook.appevents.C2335g.f8528a     // Catch:{ all -> 0x0165 }
            com.facebook.appevents.FlushReason r0 = com.facebook.appevents.FlushReason.EXPLICIT     // Catch:{ all -> 0x0165 }
            com.facebook.appevents.C2335g.m6198c(r0)     // Catch:{ all -> 0x0165 }
            goto L_0x0169
        L_0x0165:
            r0 = move-exception
            p262t8.C6606a.m15600a(r1, r0)
        L_0x0169:
            return r2
        L_0x016a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0176:
            java.lang.Object r0 = r7.f329c
            m80.v r0 = (m80.C12887v) r0
            com.moovit.MoovitApplication<?, ?, ?> r0 = r0.f31895a
            c70.e r0 = m80.C12887v.m32669d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0113m.call():java.lang.Object");
    }
}
