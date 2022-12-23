package com.appsflyer;

import com.appsflyer.internal.model.event.BackgroundEvent;
import java.net.HttpURLConnection;

public class BackgroundHttpTask {
    private final BackgroundEvent values;

    public BackgroundHttpTask(BackgroundEvent backgroundEvent) {
        this.values = backgroundEvent;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.net.URLConnection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.net.HttpURLConnection doInBackground() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = ""
            com.appsflyer.internal.model.event.BackgroundEvent r0 = r1.values
            java.lang.String r3 = r0.urlString()
            com.appsflyer.internal.model.event.BackgroundEvent r0 = r1.values
            java.lang.String r0 = r0.body()
            com.appsflyer.internal.model.event.BackgroundEvent r4 = r1.values
            boolean r4 = r4.trackingStopped()
            com.appsflyer.internal.model.event.BackgroundEvent r5 = r1.values
            boolean r5 = r5.readResponse()
            com.appsflyer.internal.model.event.BackgroundEvent r6 = r1.values
            boolean r6 = r6.proxyMode()
            com.appsflyer.internal.model.event.BackgroundEvent r7 = r1.values
            boolean r7 = r7.isEncrypt()
            byte[] r8 = r0.getBytes()
            r9 = 0
            if (r4 == 0) goto L_0x0030
            return r9
        L_0x0030:
            r4 = 1
            r10 = 0
            java.net.URL r11 = new java.net.URL     // Catch:{ all -> 0x0175 }
            r11.<init>(r3)     // Catch:{ all -> 0x0175 }
            if (r6 == 0) goto L_0x0080
            com.appsflyer.internal.ad r12 = com.appsflyer.internal.C2069ad.$$a()     // Catch:{ all -> 0x0175 }
            java.lang.String r13 = r11.toString()     // Catch:{ all -> 0x0175 }
            java.lang.String r14 = "server_request"
            java.lang.String[] r15 = new java.lang.String[r4]     // Catch:{ all -> 0x0175 }
            r15[r10] = r0     // Catch:{ all -> 0x0175 }
            r12.AFDateFormat(r14, r13, r15)     // Catch:{ all -> 0x0175 }
            java.lang.String r12 = "UTF-8"
            byte[] r12 = r0.getBytes(r12)     // Catch:{ all -> 0x0175 }
            int r12 = r12.length     // Catch:{ all -> 0x0175 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            java.lang.String r14 = "call = "
            r13.<init>(r14)     // Catch:{ all -> 0x0175 }
            r13.append(r11)     // Catch:{ all -> 0x0175 }
            java.lang.String r14 = "; size = "
            r13.append(r14)     // Catch:{ all -> 0x0175 }
            r13.append(r12)     // Catch:{ all -> 0x0175 }
            java.lang.String r14 = " byte"
            r13.append(r14)     // Catch:{ all -> 0x0175 }
            if (r12 <= r4) goto L_0x006d
            java.lang.String r12 = "s"
            goto L_0x006e
        L_0x006d:
            r12 = r2
        L_0x006e:
            r13.append(r12)     // Catch:{ all -> 0x0175 }
            java.lang.String r12 = "; body = "
            r13.append(r12)     // Catch:{ all -> 0x0175 }
            r13.append(r0)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0175 }
            com.appsflyer.internal.C2103w.$$a(r0)     // Catch:{ all -> 0x0175 }
        L_0x0080:
            java.lang.String r0 = "AppsFlyer"
            int r0 = r0.hashCode()     // Catch:{ all -> 0x0175 }
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x0175 }
            java.net.URLConnection r0 = r11.openConnection()     // Catch:{ all -> 0x0175 }
            java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)     // Catch:{ all -> 0x0175 }
            java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch:{ all -> 0x0175 }
            r12 = r0
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ all -> 0x0175 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r12.setReadTimeout(r0)     // Catch:{ all -> 0x0172 }
            r12.setConnectTimeout(r0)     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "POST"
            r12.setRequestMethod(r0)     // Catch:{ all -> 0x0172 }
            r12.setDoInput(r4)     // Catch:{ all -> 0x0172 }
            r12.setDoOutput(r4)     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "Content-Type"
            if (r7 == 0) goto L_0x00b0
            java.lang.String r13 = "application/octet-stream"
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r13 = "application/json"
        L_0x00b2:
            r12.setRequestProperty(r0, r13)     // Catch:{ all -> 0x0172 }
            java.io.OutputStream r0 = r12.getOutputStream()     // Catch:{ all -> 0x0172 }
            if (r7 == 0) goto L_0x0136
            com.appsflyer.internal.model.event.BackgroundEvent r7 = r1.values     // Catch:{ all -> 0x0172 }
            java.lang.String r7 = r7.key()     // Catch:{ all -> 0x0172 }
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ all -> 0x012d }
            r13[r10] = r7     // Catch:{ all -> 0x012d }
            r14 = 0
            int r7 = android.widget.ExpandableListView.getPackedPositionChild(r14)     // Catch:{ all -> 0x012d }
            int r7 = 23 - r7
            int r14 = android.view.View.resolveSize(r10, r10)     // Catch:{ all -> 0x012d }
            int r14 = r14 + 23222
            char r14 = (char) r14     // Catch:{ all -> 0x012d }
            int r15 = android.text.TextUtils.indexOf(r2, r2, r10, r10)     // Catch:{ all -> 0x012d }
            int r15 = r15 + 24
            java.lang.Object r7 = com.appsflyer.internal.C2072c.$$a(r7, r14, r15)     // Catch:{ all -> 0x012d }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ all -> 0x012d }
            java.lang.String r14 = "values"
            java.lang.Class[] r15 = new java.lang.Class[r4]     // Catch:{ all -> 0x012d }
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r15[r10] = r16     // Catch:{ all -> 0x012d }
            java.lang.reflect.Method r7 = r7.getMethod(r14, r15)     // Catch:{ all -> 0x012d }
            java.lang.Object r7 = r7.invoke(r9, r13)     // Catch:{ all -> 0x012d }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x0124 }
            r9[r10] = r8     // Catch:{ all -> 0x0124 }
            int r8 = android.view.ViewConfiguration.getScrollBarSize()     // Catch:{ all -> 0x0124 }
            int r8 = r8 >> 8
            int r8 = r8 + 24
            int r13 = android.view.View.resolveSize(r10, r10)     // Catch:{ all -> 0x0124 }
            int r13 = 23222 - r13
            char r13 = (char) r13     // Catch:{ all -> 0x0124 }
            int r14 = android.text.TextUtils.indexOf(r2, r2, r10)     // Catch:{ all -> 0x0124 }
            int r14 = r14 + 24
            java.lang.Object r8 = com.appsflyer.internal.C2072c.$$a(r8, r13, r14)     // Catch:{ all -> 0x0124 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x0124 }
            java.lang.String r13 = "AFDateFormat"
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0124 }
            java.lang.Class<byte[]> r15 = byte[].class
            r14[r10] = r15     // Catch:{ all -> 0x0124 }
            java.lang.reflect.Method r8 = r8.getMethod(r13, r14)     // Catch:{ all -> 0x0124 }
            java.lang.Object r7 = r8.invoke(r7, r9)     // Catch:{ all -> 0x0124 }
            r8 = r7
            byte[] r8 = (byte[]) r8     // Catch:{ all -> 0x0124 }
            goto L_0x0136
        L_0x0124:
            r0 = move-exception
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x0172 }
            if (r5 == 0) goto L_0x012c
            throw r5     // Catch:{ all -> 0x0172 }
        L_0x012c:
            throw r0     // Catch:{ all -> 0x0172 }
        L_0x012d:
            r0 = move-exception
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x0172 }
            if (r5 == 0) goto L_0x0135
            throw r5     // Catch:{ all -> 0x0172 }
        L_0x0135:
            throw r0     // Catch:{ all -> 0x0172 }
        L_0x0136:
            r0.write(r8)     // Catch:{ all -> 0x0172 }
            r0.close()     // Catch:{ all -> 0x0172 }
            r12.connect()     // Catch:{ all -> 0x0172 }
            int r0 = r12.getResponseCode()     // Catch:{ all -> 0x0172 }
            if (r5 == 0) goto L_0x014d
            com.appsflyer.AppsFlyerLibCore r5 = com.appsflyer.AppsFlyerLibCore.getInstance()     // Catch:{ all -> 0x0172 }
            java.lang.String r2 = r5.readServerResponse(r12)     // Catch:{ all -> 0x0172 }
        L_0x014d:
            if (r6 == 0) goto L_0x0167
            com.appsflyer.internal.ad r5 = com.appsflyer.internal.C2069ad.$$a()     // Catch:{ all -> 0x0172 }
            java.lang.String r6 = r11.toString()     // Catch:{ all -> 0x0172 }
            java.lang.String r7 = "server_response"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x0172 }
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0172 }
            r8[r10] = r9     // Catch:{ all -> 0x0172 }
            r8[r4] = r2     // Catch:{ all -> 0x0172 }
            r5.AFDateFormat(r7, r6, r8)     // Catch:{ all -> 0x0172 }
        L_0x0167:
            r5 = 200(0xc8, float:2.8E-43)
            if (r0 != r5) goto L_0x0184
            java.lang.String r0 = "Status 200 ok"
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch:{ all -> 0x0172 }
            r4 = 0
            goto L_0x0184
        L_0x0172:
            r0 = move-exception
            r9 = r12
            goto L_0x0176
        L_0x0175:
            r0 = move-exception
        L_0x0176:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "Error while calling "
            java.lang.String r3 = r5.concat(r3)
            com.appsflyer.AFLogger.afErrorLog(r3, r0)
            r12 = r9
        L_0x0184:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Connection "
            r0.<init>(r3)
            if (r4 == 0) goto L_0x0190
            java.lang.String r3 = "error"
            goto L_0x0192
        L_0x0190:
            java.lang.String r3 = "call succeeded"
        L_0x0192:
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afInfoLog(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.BackgroundHttpTask.doInBackground():java.net.HttpURLConnection");
    }

    public void execute() {
        new Thread(new Runnable() {
            public final void run() {
                HttpURLConnection doInBackground = BackgroundHttpTask.this.doInBackground();
                if (doInBackground != null) {
                    doInBackground.disconnect();
                }
            }
        }).start();
    }
}
