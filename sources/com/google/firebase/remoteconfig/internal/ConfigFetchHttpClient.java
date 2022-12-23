package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.amazonaws.util.DateUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p103h1.C5036a;
import p988j$.util.DesugarTimeZone;

public class ConfigFetchHttpClient {

    /* renamed from: h */
    public static final Pattern f36676h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    public final Context f36677a;

    /* renamed from: b */
    public final String f36678b;

    /* renamed from: c */
    public final String f36679c;

    /* renamed from: d */
    public final String f36680d;

    /* renamed from: e */
    public final String f36681e;

    /* renamed from: f */
    public final long f36682f;

    /* renamed from: g */
    public final long f36683g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        String str4;
        this.f36677a = context;
        this.f36678b = str;
        this.f36679c = str2;
        Matcher matcher = f36676h.matcher(str);
        if (matcher.matches()) {
            str4 = matcher.group(1);
        } else {
            str4 = null;
        }
        this.f36680d = str4;
        this.f36681e = str3;
        this.f36682f = j;
        this.f36683g = j2;
    }

    /* renamed from: c */
    public static JSONObject m36241c(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    /* renamed from: d */
    public static void m36242d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: a */
    public final JSONObject mo43590a(String str, String str2, Map<String, String> map, Long l) throws FirebaseRemoteConfigClientException {
        long j;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f36678b);
            Locale locale = this.f36677a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f36677a.getPackageManager().getPackageInfo(this.f36677a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i >= 28) {
                        j = C5036a.m12862b(packageInfo);
                    } else {
                        j = (long) packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f36677a.getPackageName());
            hashMap.put("sdkVersion", "21.1.2");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (l != null) {
                long longValue = l.longValue();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(Long.valueOf(longValue)));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    /* renamed from: b */
    public final HttpURLConnection mo43591b() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{this.f36680d, this.f36681e})).openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:30|31|32|33|34|(3:38|39|40)|41|(2:43|44)|(3:48|49|50)|51|(2:53|54)|(3:57|58|59)|60|61|62|63) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0128 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x007b A[LOOP:0: B:10:0x0075->B:12:0x007b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ad A[Catch:{ IOException | JSONException -> 0x0146, all -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013c A[SYNTHETIC, Splitter:B:67:0x013c] */
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.C14535a.C14536a fetch(java.net.HttpURLConnection r5, java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.Long r11, java.util.Date r12) throws com.google.firebase.remoteconfig.FirebaseRemoteConfigException {
        /*
            r4 = this;
            r0 = 1
            r5.setDoOutput(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r4.f36682f
            long r2 = r1.toMillis(r2)
            int r3 = (int) r2
            r5.setConnectTimeout(r3)
            long r2 = r4.f36683g
            long r1 = r1.toMillis(r2)
            int r2 = (int) r1
            r5.setReadTimeout(r2)
            java.lang.String r1 = "If-None-Match"
            r5.setRequestProperty(r1, r9)
            java.lang.String r9 = r4.f36679c
            java.lang.String r1 = "X-Goog-Api-Key"
            r5.setRequestProperty(r1, r9)
            android.content.Context r9 = r4.f36677a
            java.lang.String r9 = r9.getPackageName()
            java.lang.String r1 = "X-Android-Package"
            r5.setRequestProperty(r1, r9)
            r9 = 0
            r1 = 0
            android.content.Context r2 = r4.f36677a     // Catch:{ NameNotFoundException -> 0x004a }
            java.lang.String r3 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x004a }
            byte[] r2 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(r2, r3)     // Catch:{ NameNotFoundException -> 0x004a }
            if (r2 != 0) goto L_0x0045
            android.content.Context r2 = r4.f36677a     // Catch:{ NameNotFoundException -> 0x004a }
            r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x004a }
            goto L_0x004f
        L_0x0045:
            java.lang.String r2 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(r2, r9)     // Catch:{ NameNotFoundException -> 0x004a }
            goto L_0x0050
        L_0x004a:
            android.content.Context r2 = r4.f36677a
            r2.getPackageName()
        L_0x004f:
            r2 = r1
        L_0x0050:
            java.lang.String r3 = "X-Android-Cert"
            r5.setRequestProperty(r3, r2)
            java.lang.String r2 = "X-Google-GFE-Can-Retry"
            java.lang.String r3 = "yes"
            r5.setRequestProperty(r2, r3)
            java.lang.String r2 = "X-Goog-Firebase-Installations-Auth"
            r5.setRequestProperty(r2, r7)
            java.lang.String r2 = "application/json"
            java.lang.String r3 = "Content-Type"
            r5.setRequestProperty(r3, r2)
            java.lang.String r3 = "Accept"
            r5.setRequestProperty(r3, r2)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0075:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0091
            java.lang.Object r2 = r10.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r5.setRequestProperty(r3, r2)
            goto L_0x0075
        L_0x0091:
            org.json.JSONObject r6 = r4.mo43590a(r6, r7, r8, r11)     // Catch:{ IOException -> 0x0148, JSONException -> 0x0146 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x0148, JSONException -> 0x0146 }
            java.lang.String r7 = "utf-8"
            byte[] r6 = r6.getBytes(r7)     // Catch:{ IOException -> 0x0148, JSONException -> 0x0146 }
            m36242d(r5, r6)     // Catch:{ IOException -> 0x0148, JSONException -> 0x0146 }
            r5.connect()     // Catch:{ IOException -> 0x0148, JSONException -> 0x0146 }
            int r6 = r5.getResponseCode()     // Catch:{ IOException -> 0x0148, JSONException -> 0x0146 }
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 != r7) goto L_0x013c
            java.lang.String r6 = "ETag"
            java.lang.String r6 = r5.getHeaderField(r6)     // Catch:{ IOException -> 0x0148, JSONException -> 0x0146 }
            org.json.JSONObject r7 = m36241c(r5)     // Catch:{ IOException -> 0x0148, JSONException -> 0x0146 }
            r5.disconnect()
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ IOException -> 0x00c1 }
            r5.close()     // Catch:{ IOException -> 0x00c1 }
        L_0x00c1:
            java.lang.String r5 = "state"
            java.lang.Object r5 = r7.get(r5)     // Catch:{ JSONException -> 0x00cf }
            java.lang.String r8 = "NO_CHANGE"
            boolean r5 = r5.equals(r8)     // Catch:{ JSONException -> 0x00cf }
            r5 = r5 ^ r0
            goto L_0x00d1
        L_0x00cf:
            r5 = 1
        L_0x00d1:
            if (r5 != 0) goto L_0x00d9
            com.google.firebase.remoteconfig.internal.a$a r5 = new com.google.firebase.remoteconfig.internal.a$a
            r5.<init>(r0, r1, r1)
            return r5
        L_0x00d9:
            int r5 = p886wf.C20299d.f51468f     // Catch:{ JSONException -> 0x0133 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0133 }
            r5.<init>()     // Catch:{ JSONException -> 0x0133 }
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0133 }
            r8.<init>()     // Catch:{ JSONException -> 0x0133 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0133 }
            r10.<init>()     // Catch:{ JSONException -> 0x0133 }
            java.lang.String r11 = "entries"
            org.json.JSONObject r11 = r7.getJSONObject(r11)     // Catch:{ JSONException -> 0x00f1 }
            goto L_0x00f3
        L_0x00f1:
            r11 = r1
        L_0x00f3:
            if (r11 == 0) goto L_0x00ff
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r11 = r11.toString()     // Catch:{ JSONException -> 0x00ff }
            r0.<init>(r11)     // Catch:{ JSONException -> 0x00ff }
            r5 = r0
        L_0x00ff:
            java.lang.String r11 = "experimentDescriptions"
            org.json.JSONArray r11 = r7.getJSONArray(r11)     // Catch:{ JSONException -> 0x0106 }
            goto L_0x0108
        L_0x0106:
            r11 = r1
        L_0x0108:
            if (r11 == 0) goto L_0x0114
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r11 = r11.toString()     // Catch:{ JSONException -> 0x0114 }
            r0.<init>(r11)     // Catch:{ JSONException -> 0x0114 }
            r8 = r0
        L_0x0114:
            java.lang.String r11 = "personalizationMetadata"
            org.json.JSONObject r1 = r7.getJSONObject(r11)     // Catch:{ JSONException -> 0x011b }
            goto L_0x011c
        L_0x011b:
        L_0x011c:
            if (r1 == 0) goto L_0x0128
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0128 }
            java.lang.String r11 = r1.toString()     // Catch:{ JSONException -> 0x0128 }
            r7.<init>(r11)     // Catch:{ JSONException -> 0x0128 }
            r10 = r7
        L_0x0128:
            wf.d r7 = new wf.d     // Catch:{ JSONException -> 0x0133 }
            r7.<init>(r5, r12, r8, r10)     // Catch:{ JSONException -> 0x0133 }
            com.google.firebase.remoteconfig.internal.a$a r5 = new com.google.firebase.remoteconfig.internal.a$a
            r5.<init>(r9, r7, r6)
            return r5
        L_0x0133:
            r5 = move-exception
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r6 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.String r7 = "Fetch failed: fetch response could not be parsed."
            r6.<init>(r7, r5)
            throw r6
        L_0x013c:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r7 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch:{ IOException -> 0x0148, JSONException -> 0x0146 }
            java.lang.String r8 = r5.getResponseMessage()     // Catch:{ IOException -> 0x0148, JSONException -> 0x0146 }
            r7.<init>(r6, r8)     // Catch:{ IOException -> 0x0148, JSONException -> 0x0146 }
            throw r7     // Catch:{ IOException -> 0x0148, JSONException -> 0x0146 }
        L_0x0146:
            r6 = move-exception
            goto L_0x0149
        L_0x0148:
            r6 = move-exception
        L_0x0149:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r7 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException     // Catch:{ all -> 0x0151 }
            java.lang.String r8 = "The client had an error while calling the backend!"
            r7.<init>(r8, r6)     // Catch:{ all -> 0x0151 }
            throw r7     // Catch:{ all -> 0x0151 }
        L_0x0151:
            r6 = move-exception
            r5.disconnect()
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ IOException -> 0x015c }
            r5.close()     // Catch:{ IOException -> 0x015c }
        L_0x015c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date):com.google.firebase.remoteconfig.internal.a$a");
    }
}
