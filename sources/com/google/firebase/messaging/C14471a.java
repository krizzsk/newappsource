package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p001a0.C0017h;

/* renamed from: com.google.firebase.messaging.a */
public final class C14471a {

    /* renamed from: a */
    public final SharedPreferences f36587a;

    /* renamed from: com.google.firebase.messaging.a$a */
    public static class C14472a {

        /* renamed from: d */
        public static final long f36588d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: e */
        public static final /* synthetic */ int f36589e = 0;

        /* renamed from: a */
        public final String f36590a;

        /* renamed from: b */
        public final String f36591b;

        /* renamed from: c */
        public final long f36592c;

        public C14472a(String str, String str2, long j) {
            this.f36590a = str;
            this.f36591b = str2;
            this.f36592c = j;
        }

        /* renamed from: a */
        public static C14472a m36064a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C14472a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C14472a(jSONObject.getString(FirebaseMessagingService.EXTRA_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                e.toString();
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        if (android.util.Log.isLoggable(com.google.firebase.messaging.FirebaseMessaging.TAG, 3) != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        r4.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14471a(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r0, r1)
            r3.f36587a = r0
            java.lang.String r1 = "com.google.android.gms.appid-no-backup"
            java.io.File r4 = p090g1.C4732a.getNoBackupFilesDir(r4)
            java.io.File r2 = new java.io.File
            r2.<init>(r4, r1)
            boolean r4 = r2.exists()
            if (r4 == 0) goto L_0x001e
            goto L_0x0051
        L_0x001e:
            boolean r4 = r2.createNewFile()     // Catch:{ IOException -> 0x0044 }
            if (r4 == 0) goto L_0x0051
            monitor-enter(r3)     // Catch:{ IOException -> 0x0044 }
            java.util.Map r4 = r0.getAll()     // Catch:{ all -> 0x0041 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0044 }
            if (r4 != 0) goto L_0x0051
            monitor-enter(r3)     // Catch:{ IOException -> 0x0044 }
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch:{ all -> 0x003e }
            android.content.SharedPreferences$Editor r4 = r4.clear()     // Catch:{ all -> 0x003e }
            r4.commit()     // Catch:{ all -> 0x003e }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0044 }
            goto L_0x0051
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0044 }
            throw r4     // Catch:{ IOException -> 0x0044 }
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0044 }
            throw r4     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r4 = move-exception
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0051
            r4.getMessage()
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C14471a.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public static String m36063a(String str, String str2) {
        return C0017h.m56M(str, "|T|", str2, "|", "*");
    }
}
