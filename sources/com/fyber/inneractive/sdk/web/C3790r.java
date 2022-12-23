package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.net.HttpURLConnection;

/* renamed from: com.fyber.inneractive.sdk.web.r */
public class C3790r {

    /* renamed from: b */
    public static final byte[] f13062b = new byte[0];

    /* renamed from: c */
    public static final C3790r f13063c = new C3790r();

    /* renamed from: a */
    public final C3788p<C3792t> f13064a = new C3788p<>(1048576);

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.web.C3791s m10089a(java.net.HttpURLConnection r11, java.nio.ByteBuffer r12) throws java.io.IOException {
        /*
            r11.connect()
            r0 = 0
            r1 = 0
        L_0x0005:
            r2 = 20
            r3 = 0
            if (r1 >= r2) goto L_0x00e3
            int r9 = r11.getResponseCode()
            r2 = 300(0x12c, float:4.2E-43)
            if (r9 < r2) goto L_0x003e
            r2 = 400(0x190, float:5.6E-43)
            if (r9 < r2) goto L_0x0017
            goto L_0x003e
        L_0x0017:
            java.lang.String r2 = "Location"
            java.lang.String r2 = r11.getHeaderField(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x0024
            return r3
        L_0x0024:
            r11.disconnect()
            java.net.URL r11 = new java.net.URL
            r11.<init>(r2)
            java.net.URLConnection r11 = r11.openConnection()
            java.lang.Object r11 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r11)
            java.net.URLConnection r11 = (java.net.URLConnection) r11
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11
            r11.connect()
            int r1 = r1 + 1
            goto L_0x0005
        L_0x003e:
            java.io.InputStream r1 = r11.getInputStream()     // Catch:{ all -> 0x005a }
            byte[] r12 = r12.array()     // Catch:{ all -> 0x0058 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0058 }
            r2.<init>()     // Catch:{ all -> 0x0058 }
        L_0x004b:
            int r4 = r1.read(r12)     // Catch:{ all -> 0x0056 }
            r5 = -1
            if (r4 == r5) goto L_0x005d
            r2.write(r12, r0, r4)     // Catch:{ all -> 0x0056 }
            goto L_0x004b
        L_0x0056:
            goto L_0x005d
        L_0x0058:
            goto L_0x005c
        L_0x005a:
            r1 = r3
        L_0x005c:
            r2 = r3
        L_0x005d:
            com.fyber.inneractive.sdk.util.C3727s.m9995b(r1)
            r11.disconnect()
            java.lang.String r12 = r11.getContentType()
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x0090
            java.lang.String r1 = ";"
            java.lang.String[] r12 = r12.split(r1)
            int r1 = r12.length
            if (r1 <= 0) goto L_0x007f
            r1 = r12[r0]
            java.lang.String r1 = r1.trim()
            goto L_0x0080
        L_0x007f:
            r1 = r4
        L_0x0080:
            int r5 = r12.length
            r6 = 1
            if (r5 <= r6) goto L_0x008d
            r12 = r12[r6]
            java.lang.String r12 = r12.trim()
            r8 = r12
            r7 = r1
            goto L_0x0092
        L_0x008d:
            r7 = r1
            r8 = r4
            goto L_0x0092
        L_0x0090:
            r7 = r4
            r8 = r7
        L_0x0092:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Map r12 = r11.getHeaderFields()
            if (r12 == 0) goto L_0x00c7
            java.util.Set r1 = r12.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a5:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00c7
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r12.get(r4)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x00a5
            int r10 = r5.size()
            if (r10 <= 0) goto L_0x00a5
            java.lang.Object r5 = r5.get(r0)
            r6.put(r4, r5)
            goto L_0x00a5
        L_0x00c7:
            java.lang.String r10 = r11.getResponseMessage()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto L_0x00d2
            return r3
        L_0x00d2:
            com.fyber.inneractive.sdk.web.s r11 = new com.fyber.inneractive.sdk.web.s
            if (r2 != 0) goto L_0x00d9
            byte[] r12 = f13062b
            goto L_0x00dd
        L_0x00d9:
            byte[] r12 = r2.toByteArray()
        L_0x00dd:
            r5 = r12
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r11
        L_0x00e3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.C3790r.m10089a(java.net.HttpURLConnection, java.nio.ByteBuffer):com.fyber.inneractive.sdk.web.s");
    }

    /* renamed from: a */
    public static void m10090a(WebResourceRequest webResourceRequest, HttpURLConnection httpURLConnection) {
        if (webResourceRequest.getRequestHeaders() != null && webResourceRequest.getRequestHeaders().size() > 0) {
            for (String next : webResourceRequest.getRequestHeaders().keySet()) {
                if (!(next == null || webResourceRequest.getRequestHeaders().get(next) == null)) {
                    httpURLConnection.setRequestProperty(next, webResourceRequest.getRequestHeaders().get(next));
                }
            }
        }
    }
}
