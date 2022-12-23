package p009a8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.concurrent.atomic.AtomicBoolean;
import mf0.C24362h;
import p262t8.C6606a;

/* renamed from: a8.d0 */
public final class C0098d0 {

    /* renamed from: a */
    public static final C0098d0 f291a = new C0098d0();

    /* renamed from: b */
    public static final AtomicBoolean f292b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final AtomicBoolean f293c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final C0099a f294d = new C0099a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e */
    public static final C0099a f295e = new C0099a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: f */
    public static final C0099a f296f = new C0099a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: g */
    public static final C0099a f297g = new C0099a(false, "auto_event_setup_enabled");

    /* renamed from: h */
    public static final C0099a f298h = new C0099a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: i */
    public static SharedPreferences f299i;

    /* renamed from: a8.d0$a */
    public static final class C0099a {

        /* renamed from: a */
        public boolean f300a;

        /* renamed from: b */
        public String f301b;

        /* renamed from: c */
        public Boolean f302c;

        /* renamed from: d */
        public long f303d;

        public C0099a(boolean z, String str) {
            this.f300a = z;
            this.f301b = str;
        }

        /* renamed from: a */
        public final boolean mo212a() {
            Boolean bool = this.f302c;
            return bool == null ? this.f300a : bool.booleanValue();
        }
    }

    /* renamed from: a */
    public static final boolean m168a() {
        Class<C0098d0> cls = C0098d0.class;
        if (C6606a.m15601b(cls)) {
            return false;
        }
        try {
            f291a.mo205d();
            return f296f.mo212a();
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m169b() {
        Class<C0098d0> cls = C0098d0.class;
        if (C6606a.m15601b(cls)) {
            return false;
        }
        try {
            f291a.mo205d();
            return f295e.mo212a();
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return false;
        }
    }

    /* renamed from: c */
    public final void mo204c() {
        if (!C6606a.m15601b(this)) {
            try {
                C0099a aVar = f297g;
                mo209h(aVar);
                long currentTimeMillis = System.currentTimeMillis();
                if (aVar.f302c == null || currentTimeMillis - aVar.f303d >= 604800000) {
                    aVar.f302c = null;
                    aVar.f303d = 0;
                    if (f293c.compareAndSet(false, true)) {
                        C0115o.m212c().execute(new C0096c0(currentTimeMillis));
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: d */
    public final void mo205d() {
        if (!C6606a.m15601b(this)) {
            try {
                if (C0115o.m217h()) {
                    int i = 0;
                    if (f292b.compareAndSet(false, true)) {
                        SharedPreferences sharedPreferences = C0115o.m210a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                        C24362h.m61210e(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                        f299i = sharedPreferences;
                        C0099a[] aVarArr = {f295e, f296f, f294d};
                        if (!C6606a.m15601b(this)) {
                            while (i < 3) {
                                C0099a aVar = aVarArr[i];
                                i++;
                                if (aVar == f297g) {
                                    mo204c();
                                } else if (aVar.f302c == null) {
                                    mo209h(aVar);
                                    if (aVar.f302c == null) {
                                        mo206e(aVar);
                                    }
                                } else {
                                    mo211j(aVar);
                                }
                            }
                        }
                        mo204c();
                        mo208g();
                        mo207f();
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4 = com.facebook.internal.C2397f0.f8630a;
        r4 = p009a8.C0115o.f331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo206e(p009a8.C0098d0.C0099a r4) {
        /*
            r3 = this;
            boolean r0 = p262t8.C6606a.m15601b(r3)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r3.mo210i()     // Catch:{ all -> 0x0043 }
            android.content.Context r0 = p009a8.C0115o.m210a()     // Catch:{ NameNotFoundException -> 0x003e }
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x003e }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x003e }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x003e }
            java.lang.String r1 = "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)"
            mf0.C24362h.m61210e(r0, r1)     // Catch:{ NameNotFoundException -> 0x003e }
            android.os.Bundle r1 = r0.metaData     // Catch:{ NameNotFoundException -> 0x003e }
            if (r1 == 0) goto L_0x0042
            java.lang.String r2 = r4.f301b     // Catch:{ NameNotFoundException -> 0x003e }
            boolean r1 = r1.containsKey(r2)     // Catch:{ NameNotFoundException -> 0x003e }
            if (r1 == 0) goto L_0x0042
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x003e }
            java.lang.String r1 = r4.f301b     // Catch:{ NameNotFoundException -> 0x003e }
            boolean r2 = r4.f300a     // Catch:{ NameNotFoundException -> 0x003e }
            boolean r0 = r0.getBoolean(r1, r2)     // Catch:{ NameNotFoundException -> 0x003e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x003e }
            r4.f302c = r0     // Catch:{ NameNotFoundException -> 0x003e }
            goto L_0x0042
        L_0x003e:
            com.facebook.internal.f0 r4 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0043 }
            a8.o r4 = p009a8.C0115o.f331a     // Catch:{ all -> 0x0043 }
        L_0x0042:
            return
        L_0x0043:
            r4 = move-exception
            p262t8.C6606a.m15600a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0098d0.mo206e(a8.d0$a):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:34|35|36|(3:38|39|(8:40|41|42|(1:44)(1:45)|46|47|(1:49)(0)|52))|50|52|53|(1:55)(1:56)|(2:60|70)(1:69)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00cc */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f1 A[Catch:{ all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f3 A[Catch:{ all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fc A[Catch:{ all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[Catch:{ all -> 0x010b }, RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo207f() {
        /*
            r16 = this;
            java.lang.String r0 = "previous"
            java.lang.String r1 = "com.facebook.sdk.USER_SETTINGS_BITMASK"
            boolean r2 = p262t8.C6606a.m15601b(r16)
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicBoolean r2 = f292b     // Catch:{ all -> 0x010b }
            boolean r2 = r2.get()     // Catch:{ all -> 0x010b }
            if (r2 != 0) goto L_0x0014
            return
        L_0x0014:
            boolean r2 = p009a8.C0115o.m217h()     // Catch:{ all -> 0x010b }
            if (r2 != 0) goto L_0x001b
            return
        L_0x001b:
            android.content.Context r2 = p009a8.C0115o.m210a()     // Catch:{ all -> 0x010b }
            a8.d0$a r3 = f294d     // Catch:{ all -> 0x010b }
            boolean r3 = r3.mo212a()     // Catch:{ all -> 0x010b }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            int r3 = r3 << r5
            r3 = r3 | r5
            a8.d0$a r6 = f295e     // Catch:{ all -> 0x010b }
            boolean r6 = r6.mo212a()     // Catch:{ all -> 0x010b }
            if (r6 == 0) goto L_0x0038
            r6 = 1
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            int r6 = r6 << r4
            r3 = r3 | r6
            a8.d0$a r6 = f296f     // Catch:{ all -> 0x010b }
            boolean r6 = r6.mo212a()     // Catch:{ all -> 0x010b }
            if (r6 == 0) goto L_0x0045
            r6 = 1
            goto L_0x0046
        L_0x0045:
            r6 = 0
        L_0x0046:
            r7 = 2
            int r6 = r6 << r7
            r3 = r3 | r6
            a8.d0$a r6 = f298h     // Catch:{ all -> 0x010b }
            boolean r6 = r6.mo212a()     // Catch:{ all -> 0x010b }
            if (r6 == 0) goto L_0x0053
            r6 = 1
            goto L_0x0054
        L_0x0053:
            r6 = 0
        L_0x0054:
            r8 = 3
            int r6 = r6 << r8
            r3 = r3 | r6
            android.content.SharedPreferences r6 = f299i     // Catch:{ all -> 0x010b }
            java.lang.String r9 = "userSettingPref"
            r10 = 0
            if (r6 == 0) goto L_0x0107
            int r6 = r6.getInt(r1, r5)     // Catch:{ all -> 0x010b }
            if (r6 == r3) goto L_0x0106
            android.content.SharedPreferences r11 = f299i     // Catch:{ all -> 0x010b }
            if (r11 == 0) goto L_0x0102
            android.content.SharedPreferences$Editor r9 = r11.edit()     // Catch:{ all -> 0x010b }
            android.content.SharedPreferences$Editor r1 = r9.putInt(r1, r3)     // Catch:{ all -> 0x010b }
            r1.apply()     // Catch:{ all -> 0x010b }
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ca }
            java.lang.String r9 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x00ca }
            r11 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r9, r11)     // Catch:{ NameNotFoundException -> 0x00ca }
            java.lang.String r9 = "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)"
            mf0.C24362h.m61210e(r1, r9)     // Catch:{ NameNotFoundException -> 0x00ca }
            android.os.Bundle r9 = r1.metaData     // Catch:{ NameNotFoundException -> 0x00ca }
            if (r9 == 0) goto L_0x00ca
            java.lang.String r9 = "com.facebook.sdk.AutoInitEnabled"
            java.lang.String r11 = "com.facebook.sdk.AutoLogAppEventsEnabled"
            java.lang.String r12 = "com.facebook.sdk.AdvertiserIDCollectionEnabled"
            java.lang.String r13 = "com.facebook.sdk.MonitorEnabled"
            java.lang.String[] r9 = new java.lang.String[]{r9, r11, r12, r13}     // Catch:{ NameNotFoundException -> 0x00ca }
            r11 = 4
            boolean[] r11 = new boolean[r11]     // Catch:{ NameNotFoundException -> 0x00ca }
            r11[r5] = r4     // Catch:{ NameNotFoundException -> 0x00ca }
            r11[r4] = r4     // Catch:{ NameNotFoundException -> 0x00ca }
            r11[r7] = r4     // Catch:{ NameNotFoundException -> 0x00ca }
            r11[r8] = r4     // Catch:{ NameNotFoundException -> 0x00ca }
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x00a5:
            int r15 = r12 + 1
            android.os.Bundle r4 = r1.metaData     // Catch:{ NameNotFoundException -> 0x00cc }
            r5 = r9[r12]     // Catch:{ NameNotFoundException -> 0x00cc }
            boolean r4 = r4.containsKey(r5)     // Catch:{ NameNotFoundException -> 0x00cc }
            if (r4 == 0) goto L_0x00b3
            r4 = 1
            goto L_0x00b4
        L_0x00b3:
            r4 = 0
        L_0x00b4:
            int r4 = r4 << r12
            r13 = r13 | r4
            android.os.Bundle r4 = r1.metaData     // Catch:{ NameNotFoundException -> 0x00cc }
            r5 = r9[r12]     // Catch:{ NameNotFoundException -> 0x00cc }
            boolean r7 = r11[r12]     // Catch:{ NameNotFoundException -> 0x00cc }
            boolean r4 = r4.getBoolean(r5, r7)     // Catch:{ NameNotFoundException -> 0x00cc }
            int r4 = r4 << r12
            r14 = r14 | r4
            if (r15 <= r8) goto L_0x00c5
            goto L_0x00cc
        L_0x00c5:
            r12 = r15
            r4 = 1
            r5 = 0
            r7 = 2
            goto L_0x00a5
        L_0x00ca:
            r13 = 0
            r14 = 0
        L_0x00cc:
            com.facebook.appevents.j r1 = new com.facebook.appevents.j     // Catch:{ all -> 0x010b }
            r1.<init>((android.content.Context) r2, (java.lang.String) r10)     // Catch:{ all -> 0x010b }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x010b }
            r2.<init>()     // Catch:{ all -> 0x010b }
            java.lang.String r4 = "usage"
            r2.putInt(r4, r13)     // Catch:{ all -> 0x010b }
            java.lang.String r4 = "initial"
            r2.putInt(r4, r14)     // Catch:{ all -> 0x010b }
            r2.putInt(r0, r6)     // Catch:{ all -> 0x010b }
            java.lang.String r4 = "current"
            r2.putInt(r4, r3)     // Catch:{ all -> 0x010b }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x010b }
            r3 = 2
            r0 = r0 & r3
            if (r0 == 0) goto L_0x00f3
            r4 = 1
            goto L_0x00f4
        L_0x00f3:
            r4 = 0
        L_0x00f4:
            if (r4 != 0) goto L_0x00fc
            boolean r0 = m169b()     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x0106
        L_0x00fc:
            java.lang.String r0 = "fb_sdk_settings_changed"
            r1.mo12486f(r0, r2)     // Catch:{ all -> 0x010b }
            goto L_0x0106
        L_0x0102:
            mf0.C24362h.m61217l(r9)     // Catch:{ all -> 0x010b }
            throw r10     // Catch:{ all -> 0x010b }
        L_0x0106:
            return
        L_0x0107:
            mf0.C24362h.m61217l(r9)     // Catch:{ all -> 0x010b }
            throw r10     // Catch:{ all -> 0x010b }
        L_0x010b:
            r0 = move-exception
            r1 = r16
            p262t8.C6606a.m15600a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0098d0.mo207f():void");
    }

    /* renamed from: g */
    public final void mo208g() {
        if (!C6606a.m15601b(this)) {
            try {
                Context a = C0115o.m210a();
                ApplicationInfo applicationInfo = a.getPackageManager().getApplicationInfo(a.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE);
                C24362h.m61210e(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    boolean containsKey = bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
                    boolean containsKey2 = applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                    m168a();
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:20|21|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r4 = com.facebook.internal.C2397f0.f8630a;
        r4 = p009a8.C0115o.f331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0048 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo209h(p009a8.C0098d0.C0099a r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            boolean r1 = p262t8.C6606a.m15601b(r3)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            r3.mo210i()     // Catch:{ all -> 0x004d }
            android.content.SharedPreferences r1 = f299i     // Catch:{ JSONException -> 0x0048 }
            if (r1 == 0) goto L_0x0040
            java.lang.String r2 = r4.f301b     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r1 = r1.getString(r2, r0)     // Catch:{ JSONException -> 0x0048 }
            if (r1 != 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            int r1 = r0.length()     // Catch:{ JSONException -> 0x0048 }
            if (r1 <= 0) goto L_0x0022
            r1 = 1
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            if (r1 == 0) goto L_0x004c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0048 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r0 = "value"
            boolean r0 = r1.getBoolean(r0)     // Catch:{ JSONException -> 0x0048 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ JSONException -> 0x0048 }
            r4.f302c = r0     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r0 = "last_timestamp"
            long r0 = r1.getLong(r0)     // Catch:{ JSONException -> 0x0048 }
            r4.f303d = r0     // Catch:{ JSONException -> 0x0048 }
            goto L_0x004c
        L_0x0040:
            java.lang.String r4 = "userSettingPref"
            mf0.C24362h.m61217l(r4)     // Catch:{ JSONException -> 0x0048 }
            r4 = 0
            throw r4     // Catch:{ JSONException -> 0x0048 }
        L_0x0048:
            com.facebook.internal.f0 r4 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x004d }
            a8.o r4 = p009a8.C0115o.f331a     // Catch:{ all -> 0x004d }
        L_0x004c:
            return
        L_0x004d:
            r4 = move-exception
            p262t8.C6606a.m15600a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0098d0.mo209h(a8.d0$a):void");
    }

    /* renamed from: i */
    public final void mo210i() {
        if (!C6606a.m15601b(this)) {
            try {
                if (!f292b.get()) {
                    throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r5 = com.facebook.internal.C2397f0.f8630a;
        r5 = p009a8.C0115o.f331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo211j(p009a8.C0098d0.C0099a r5) {
        /*
            r4 = this;
            boolean r0 = p262t8.C6606a.m15601b(r4)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r4.mo210i()     // Catch:{ all -> 0x0044 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x003f }
            r0.<init>()     // Catch:{ Exception -> 0x003f }
            java.lang.String r1 = "value"
            java.lang.Boolean r2 = r5.f302c     // Catch:{ Exception -> 0x003f }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x003f }
            java.lang.String r1 = "last_timestamp"
            long r2 = r5.f303d     // Catch:{ Exception -> 0x003f }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x003f }
            android.content.SharedPreferences r1 = f299i     // Catch:{ Exception -> 0x003f }
            if (r1 == 0) goto L_0x0037
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Exception -> 0x003f }
            java.lang.String r5 = r5.f301b     // Catch:{ Exception -> 0x003f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r1.putString(r5, r0)     // Catch:{ Exception -> 0x003f }
            r5.apply()     // Catch:{ Exception -> 0x003f }
            r4.mo207f()     // Catch:{ Exception -> 0x003f }
            goto L_0x0043
        L_0x0037:
            java.lang.String r5 = "userSettingPref"
            mf0.C24362h.m61217l(r5)     // Catch:{ Exception -> 0x003f }
            r5 = 0
            throw r5     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            com.facebook.internal.f0 r5 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x0044 }
            a8.o r5 = p009a8.C0115o.f331a     // Catch:{ all -> 0x0044 }
        L_0x0043:
            return
        L_0x0044:
            r5 = move-exception
            p262t8.C6606a.m15600a(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0098d0.mo211j(a8.d0$a):void");
    }
}
