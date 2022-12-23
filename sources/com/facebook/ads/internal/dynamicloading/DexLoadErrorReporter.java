package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;

    /* renamed from: a */
    public static final AtomicBoolean f8459a = new AtomicBoolean();

    /* renamed from: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter$a */
    public class C2305a extends Thread {

        /* renamed from: b */
        public final /* synthetic */ Context f8460b;

        /* renamed from: c */
        public final /* synthetic */ String f8461c;

        public C2305a(Context context, String str) {
            this.f8460b = context;
            this.f8461c = str;
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0140 */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x014d A[SYNTHETIC, Splitter:B:23:0x014d] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0154 A[SYNTHETIC, Splitter:B:27:0x0154] */
        /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r18 = this;
                r0 = r18
                java.lang.String r1 = "data"
                java.lang.String r2 = ""
                java.lang.String r3 = "0"
                java.lang.String r4 = "attempt"
                java.lang.String r5 = "UTF-8"
                super.run()
                r6 = 0
                java.net.URL r7 = new java.net.URL     // Catch:{ all -> 0x0149 }
                java.lang.String r8 = "https://www.facebook.com/adnw_logging/"
                r7.<init>(r8)     // Catch:{ all -> 0x0149 }
                java.net.URLConnection r7 = r7.openConnection()     // Catch:{ all -> 0x0149 }
                java.lang.Object r7 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r7)     // Catch:{ all -> 0x0149 }
                java.net.URLConnection r7 = (java.net.URLConnection) r7     // Catch:{ all -> 0x0149 }
                java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ all -> 0x0149 }
                java.lang.String r8 = "POST"
                r7.setRequestMethod(r8)     // Catch:{ all -> 0x0147 }
                java.lang.String r8 = "Content-Type"
                java.lang.String r9 = "application/x-www-form-urlencoded;charset=UTF-8"
                r7.setRequestProperty(r8, r9)     // Catch:{ all -> 0x0147 }
                java.lang.String r8 = "Accept"
                java.lang.String r9 = "application/json"
                r7.setRequestProperty(r8, r9)     // Catch:{ all -> 0x0147 }
                java.lang.String r8 = "Accept-Charset"
                r7.setRequestProperty(r8, r5)     // Catch:{ all -> 0x0147 }
                java.lang.String r8 = "user-agent"
                java.lang.String r9 = "[FBAN/AudienceNetworkForAndroid;FBSN/Android]"
                r7.setRequestProperty(r8, r9)     // Catch:{ all -> 0x0147 }
                r8 = 1
                r7.setDoOutput(r8)     // Catch:{ all -> 0x0147 }
                r7.setDoInput(r8)     // Catch:{ all -> 0x0147 }
                r7.connect()     // Catch:{ all -> 0x0147 }
                java.util.UUID r8 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0147 }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0147 }
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x0147 }
                r9.<init>()     // Catch:{ all -> 0x0147 }
                r9.put(r4, r3)     // Catch:{ all -> 0x0147 }
                android.content.Context r10 = r0.f8460b     // Catch:{ all -> 0x0147 }
                com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.m6173a(r10, r9, r8)     // Catch:{ all -> 0x0147 }
                org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x0147 }
                r10.<init>()     // Catch:{ all -> 0x0147 }
                java.lang.String r11 = "subtype"
                java.lang.String r12 = "generic"
                r10.put(r11, r12)     // Catch:{ all -> 0x0147 }
                java.lang.String r11 = "subtype_code"
                java.lang.String r12 = "1320"
                r10.put(r11, r12)     // Catch:{ all -> 0x0147 }
                java.lang.String r11 = "caught_exception"
                java.lang.String r12 = "1"
                r10.put(r11, r12)     // Catch:{ all -> 0x0147 }
                java.lang.String r11 = "stacktrace"
                java.lang.String r12 = r0.f8461c     // Catch:{ all -> 0x0147 }
                r10.put(r11, r12)     // Catch:{ all -> 0x0147 }
                org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x0147 }
                r11.<init>()     // Catch:{ all -> 0x0147 }
                java.lang.String r12 = "id"
                java.util.UUID r13 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0147 }
                java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0147 }
                r11.put(r12, r13)     // Catch:{ all -> 0x0147 }
                java.lang.String r12 = "type"
                java.lang.String r13 = "debug"
                r11.put(r12, r13)     // Catch:{ all -> 0x0147 }
                java.lang.String r12 = "session_time"
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
                r13.<init>()     // Catch:{ all -> 0x0147 }
                r13.append(r2)     // Catch:{ all -> 0x0147 }
                long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0147 }
                r16 = 1000(0x3e8, double:4.94E-321)
                long r14 = r14 / r16
                r13.append(r14)     // Catch:{ all -> 0x0147 }
                java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0147 }
                r11.put(r12, r13)     // Catch:{ all -> 0x0147 }
                java.lang.String r12 = "time"
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
                r13.<init>()     // Catch:{ all -> 0x0147 }
                r13.append(r2)     // Catch:{ all -> 0x0147 }
                long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0147 }
                long r14 = r14 / r16
                r13.append(r14)     // Catch:{ all -> 0x0147 }
                java.lang.String r2 = r13.toString()     // Catch:{ all -> 0x0147 }
                r11.put(r12, r2)     // Catch:{ all -> 0x0147 }
                java.lang.String r2 = "session_id"
                r11.put(r2, r8)     // Catch:{ all -> 0x0147 }
                r11.put(r1, r10)     // Catch:{ all -> 0x0147 }
                r11.put(r4, r3)     // Catch:{ all -> 0x0147 }
                android.content.Context r2 = r0.f8460b     // Catch:{ all -> 0x0147 }
                com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.m6173a(r2, r10, r8)     // Catch:{ all -> 0x0147 }
                org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ all -> 0x0147 }
                r2.<init>()     // Catch:{ all -> 0x0147 }
                r2.put(r11)     // Catch:{ all -> 0x0147 }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x0147 }
                r3.<init>()     // Catch:{ all -> 0x0147 }
                r3.put(r1, r9)     // Catch:{ all -> 0x0147 }
                java.lang.String r1 = "events"
                r3.put(r1, r2)     // Catch:{ all -> 0x0147 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0147 }
                java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ all -> 0x0147 }
                java.io.OutputStream r3 = r7.getOutputStream()     // Catch:{ all -> 0x0147 }
                r2.<init>(r3)     // Catch:{ all -> 0x0147 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
                r3.<init>()     // Catch:{ all -> 0x0144 }
                java.lang.String r4 = "payload="
                r3.append(r4)     // Catch:{ all -> 0x0144 }
                java.lang.String r1 = java.net.URLEncoder.encode(r1, r5)     // Catch:{ all -> 0x0144 }
                r3.append(r1)     // Catch:{ all -> 0x0144 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0144 }
                r2.writeBytes(r1)     // Catch:{ all -> 0x0144 }
                r2.flush()     // Catch:{ all -> 0x0144 }
                r1 = 16384(0x4000, float:2.2959E-41)
                byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0144 }
                java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0144 }
                r3.<init>()     // Catch:{ all -> 0x0144 }
                java.io.InputStream r6 = r7.getInputStream()     // Catch:{ all -> 0x0144 }
            L_0x012e:
                int r4 = r6.read(r1)     // Catch:{ all -> 0x0144 }
                r5 = -1
                if (r4 == r5) goto L_0x013a
                r5 = 0
                r3.write(r1, r5, r4)     // Catch:{ all -> 0x0144 }
                goto L_0x012e
            L_0x013a:
                r3.flush()     // Catch:{ all -> 0x0144 }
                r2.close()     // Catch:{ Exception -> 0x0140 }
            L_0x0140:
                r6.close()     // Catch:{ Exception -> 0x015b }
                goto L_0x015b
            L_0x0144:
                r1 = r6
                r6 = r2
                goto L_0x014b
            L_0x0147:
                r1 = r6
                goto L_0x014b
            L_0x0149:
                r1 = r6
                r7 = r1
            L_0x014b:
                if (r6 == 0) goto L_0x0152
                r6.close()     // Catch:{ Exception -> 0x0151 }
                goto L_0x0152
            L_0x0151:
            L_0x0152:
                if (r1 == 0) goto L_0x0159
                r1.close()     // Catch:{ Exception -> 0x0158 }
                goto L_0x0159
            L_0x0158:
            L_0x0159:
                if (r7 == 0) goto L_0x015e
            L_0x015b:
                r7.disconnect()
            L_0x015e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.C2305a.run():void");
        }
    }

    /* renamed from: a */
    public static void m6173a(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }

    @SuppressLint({"CatchGeneralException"})
    public static void reportDexLoadingIssue(Context context, String str, double d) {
        AtomicBoolean atomicBoolean = f8459a;
        if (!atomicBoolean.get() && Math.random() < d) {
            atomicBoolean.set(true);
            new C2305a(context, str).start();
        }
    }
}
