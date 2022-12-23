package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* renamed from: bo.app.o */
public final class C1648o implements C1658p {

    /* renamed from: b */
    public static final String f5869b = AppboyLogger.getBrazeLogTag(C1648o.class);

    /* renamed from: c */
    public static final int f5870c = ((int) TimeUnit.SECONDS.toMillis(15));

    /* renamed from: a */
    public final int f5871a;

    public C1648o(int i) {
        this.f5871a = i;
    }

    /* renamed from: a */
    public JSONObject mo6258a(URI uri, Map<String, String> map) {
        return mo6260a(uri, (JSONObject) null, map, C1554d0.GET);
    }

    /* renamed from: a */
    public JSONObject mo6259a(URI uri, Map<String, String> map, JSONObject jSONObject) {
        return mo6260a(uri, jSONObject, map, C1554d0.POST);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00af A[SYNTHETIC, Splitter:B:44:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010d A[SYNTHETIC, Splitter:B:61:0x010d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo6260a(java.net.URI r8, org.json.JSONObject r9, java.util.Map<java.lang.String, java.lang.String> r10, p030bo.app.C1554d0 r11) {
        /*
            r7 = this;
            java.lang.String r0 = "]"
            java.lang.String r1 = "Caught an error trying to close an InputStream"
            r2 = 1337(0x539, float:1.874E-42)
            android.net.TrafficStats.setThreadStatsTag(r2)
            java.net.URL r8 = p030bo.app.C1655o4.m4564a((java.net.URI) r8)
            r2 = 0
            if (r8 != 0) goto L_0x0018
            java.lang.String r8 = f5869b
            java.lang.String r9 = "Got null URL after converting Uri to URL. Ending request."
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r8, (java.lang.String) r9)
            return r2
        L_0x0018:
            java.net.HttpURLConnection r9 = r7.mo6257a((java.net.URL) r8, (org.json.JSONObject) r9, (java.util.Map<java.lang.String, java.lang.String>) r10, (p030bo.app.C1554d0) r11)     // Catch:{ IOException -> 0x00d9, JSONException -> 0x008c, all -> 0x0088 }
            if (r9 != 0) goto L_0x0041
            java.lang.String r10 = f5869b     // Catch:{ IOException -> 0x0083, JSONException -> 0x0080, all -> 0x007a }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0083, JSONException -> 0x0080, all -> 0x007a }
            r11.<init>()     // Catch:{ IOException -> 0x0083, JSONException -> 0x0080, all -> 0x007a }
            java.lang.String r3 = "Failed to setup connection to ["
            r11.append(r3)     // Catch:{ IOException -> 0x0083, JSONException -> 0x0080, all -> 0x007a }
            java.lang.String r3 = r8.toString()     // Catch:{ IOException -> 0x0083, JSONException -> 0x0080, all -> 0x007a }
            r11.append(r3)     // Catch:{ IOException -> 0x0083, JSONException -> 0x0080, all -> 0x007a }
            r11.append(r0)     // Catch:{ IOException -> 0x0083, JSONException -> 0x0080, all -> 0x007a }
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0083, JSONException -> 0x0080, all -> 0x007a }
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r10, (java.lang.String) r11)     // Catch:{ IOException -> 0x0083, JSONException -> 0x0080, all -> 0x007a }
            if (r9 == 0) goto L_0x0040
            r9.disconnect()
        L_0x0040:
            return r2
        L_0x0041:
            java.io.InputStream r10 = r7.mo6256a((java.net.HttpURLConnection) r9)     // Catch:{ IOException -> 0x0083, JSONException -> 0x0080, all -> 0x007a }
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0074, JSONException -> 0x006f, all -> 0x006a }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0074, JSONException -> 0x006f, all -> 0x006a }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r10, r4)     // Catch:{ IOException -> 0x0074, JSONException -> 0x006f, all -> 0x006a }
            r11.<init>(r3)     // Catch:{ IOException -> 0x0074, JSONException -> 0x006f, all -> 0x006a }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ IOException -> 0x0074, JSONException -> 0x006f, all -> 0x006a }
            java.lang.String r11 = m4532a((java.io.BufferedReader) r11)     // Catch:{ IOException -> 0x0074, JSONException -> 0x006f, all -> 0x006a }
            r3.<init>(r11)     // Catch:{ IOException -> 0x0074, JSONException -> 0x006f, all -> 0x006a }
            r9.disconnect()
            if (r10 == 0) goto L_0x0069
            r10.close()     // Catch:{ Exception -> 0x0063 }
            goto L_0x0069
        L_0x0063:
            r8 = move-exception
            java.lang.String r9 = f5869b
            com.appboy.support.AppboyLogger.m5452e(r9, r1, r8)
        L_0x0069:
            return r3
        L_0x006a:
            r8 = move-exception
            r2 = r9
            r9 = r10
            goto L_0x0106
        L_0x006f:
            r11 = move-exception
            r6 = r11
            r11 = r10
            r10 = r6
            goto L_0x008f
        L_0x0074:
            r11 = move-exception
            r2 = r9
            r9 = r10
            r10 = r11
            goto L_0x00db
        L_0x007a:
            r8 = move-exception
            r6 = r2
            r2 = r9
            r9 = r6
            goto L_0x0106
        L_0x0080:
            r10 = move-exception
            r11 = r2
            goto L_0x008f
        L_0x0083:
            r10 = move-exception
            r6 = r2
            r2 = r9
            r9 = r6
            goto L_0x00db
        L_0x0088:
            r8 = move-exception
            r9 = r2
            goto L_0x0106
        L_0x008c:
            r10 = move-exception
            r9 = r2
            r11 = r9
        L_0x008f:
            java.lang.String r3 = f5869b     // Catch:{ all -> 0x00d5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r4.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r5 = "Unable to parse json response from server. Response: ["
            r4.append(r5)     // Catch:{ all -> 0x00d5 }
            r4.append(r10)     // Catch:{ all -> 0x00d5 }
            r4.append(r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00d5 }
            com.appboy.support.AppboyLogger.m5452e(r3, r0, r10)     // Catch:{ all -> 0x00d5 }
            if (r9 == 0) goto L_0x00ad
            r9.disconnect()
        L_0x00ad:
            if (r11 == 0) goto L_0x00b9
            r11.close()     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00b9
        L_0x00b3:
            r9 = move-exception
            java.lang.String r10 = f5869b
            com.appboy.support.AppboyLogger.m5452e(r10, r1, r9)
        L_0x00b9:
            java.lang.String r9 = f5869b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Failed to get result from ["
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = "]."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r9, (java.lang.String) r8)
            return r2
        L_0x00d5:
            r8 = move-exception
            r2 = r9
            r9 = r11
            goto L_0x0106
        L_0x00d9:
            r10 = move-exception
            r9 = r2
        L_0x00db:
            bo.app.c1 r11 = new bo.app.c1     // Catch:{ all -> 0x0105 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0105 }
            r3.<init>()     // Catch:{ all -> 0x0105 }
            java.lang.String r4 = "Failed request to ["
            r3.append(r4)     // Catch:{ all -> 0x0105 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0105 }
            r3.append(r8)     // Catch:{ all -> 0x0105 }
            java.lang.String r8 = "], with message: ["
            r3.append(r8)     // Catch:{ all -> 0x0105 }
            java.lang.String r8 = r10.getMessage()     // Catch:{ all -> 0x0105 }
            r3.append(r8)     // Catch:{ all -> 0x0105 }
            r3.append(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x0105 }
            r11.<init>(r8, r10)     // Catch:{ all -> 0x0105 }
            throw r11     // Catch:{ all -> 0x0105 }
        L_0x0105:
            r8 = move-exception
        L_0x0106:
            if (r2 == 0) goto L_0x010b
            r2.disconnect()
        L_0x010b:
            if (r9 == 0) goto L_0x0117
            r9.close()     // Catch:{ Exception -> 0x0111 }
            goto L_0x0117
        L_0x0111:
            r9 = move-exception
            java.lang.String r10 = f5869b
            com.appboy.support.AppboyLogger.m5452e(r10, r1, r9)
        L_0x0117:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1648o.mo6260a(java.net.URI, org.json.JSONObject, java.util.Map, bo.app.d0):org.json.JSONObject");
    }

    /* renamed from: a */
    public final InputStream mo6256a(HttpURLConnection httpURLConnection) {
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode / 100 != 2) {
            StringBuilder r = C25541a.m63887r("Bad HTTP response code from Braze: [", responseCode, "] to url: ");
            r.append(httpURLConnection.getURL());
            throw new C1547c1(r.toString());
        } else if ("gzip".equalsIgnoreCase(httpURLConnection.getContentEncoding())) {
            return new GZIPInputStream(httpURLConnection.getInputStream());
        } else {
            return new BufferedInputStream(httpURLConnection.getInputStream());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection mo6257a(java.net.URL r3, org.json.JSONObject r4, java.util.Map<java.lang.String, java.lang.String> r5, p030bo.app.C1554d0 r6) {
        /*
            r2 = this;
            r0 = 0
            java.net.URLConnection r1 = p030bo.app.C1698u.m4769a(r3)     // Catch:{ IOException -> 0x0032 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x0032 }
            int r0 = f5870c     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            r1.setConnectTimeout(r0)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            int r0 = r2.f5871a     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            r1.setReadTimeout(r0)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            r0 = 0
            r1.setUseCaches(r0)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            r1.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            r1.setRequestMethod(r0)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            m4533a((java.net.HttpURLConnection) r1, (java.util.Map<java.lang.String, java.lang.String>) r5)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            bo.app.d0 r5 = p030bo.app.C1554d0.POST     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            if (r6 != r5) goto L_0x0029
            m4534a((java.net.HttpURLConnection) r1, (org.json.JSONObject) r4)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
        L_0x0029:
            return r1
        L_0x002a:
            r3 = move-exception
            r0 = r1
            goto L_0x005f
        L_0x002d:
            r4 = move-exception
            r0 = r1
            goto L_0x0033
        L_0x0030:
            r3 = move-exception
            goto L_0x005f
        L_0x0032:
            r4 = move-exception
        L_0x0033:
            bo.app.c1 r5 = new bo.app.c1     // Catch:{ all -> 0x0030 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r6.<init>()     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "Could not set up connection ["
            r6.append(r1)     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0030 }
            r6.append(r3)     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = "] ["
            r6.append(r3)     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x0030 }
            r6.append(r3)     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = "].  Braze will try to reconnect periodically."
            r6.append(r3)     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0030 }
            r5.<init>(r3, r4)     // Catch:{ all -> 0x0030 }
            throw r5     // Catch:{ all -> 0x0030 }
        L_0x005f:
            if (r0 == 0) goto L_0x0064
            r0.disconnect()
        L_0x0064:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1648o.mo6257a(java.net.URL, org.json.JSONObject, java.util.Map, bo.app.d0):java.net.HttpURLConnection");
    }

    /* renamed from: a */
    public static void m4533a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
    }

    /* renamed from: a */
    public static void m4534a(HttpURLConnection httpURLConnection, JSONObject jSONObject) {
        byte[] bytes = jSONObject.toString().getBytes("UTF-8");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setFixedLengthStreamingMode(bytes.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: a */
    public static String m4532a(BufferedReader bufferedReader) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return sb.toString();
            }
            sb.append(readLine);
        }
    }
}
