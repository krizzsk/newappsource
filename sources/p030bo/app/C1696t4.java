package p030bo.app;

import com.appboy.support.AppboyLogger;

/* renamed from: bo.app.t4 */
public class C1696t4 {

    /* renamed from: a */
    public static final String f6011a = AppboyLogger.getBrazeLogTag(C1696t4.class);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043 A[SYNTHETIC, Splitter:B:16:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050 A[SYNTHETIC, Splitter:B:22:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m4768a(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Caught exception while trying to close system properties reader."
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0039 }
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0039 }
            r4 = 0
            java.lang.String r5 = "/system/bin/getprop"
            r3[r4] = r5     // Catch:{ Exception -> 0x0039 }
            r4 = 1
            r3[r4] = r6     // Catch:{ Exception -> 0x0039 }
            java.lang.Process r6 = r2.exec(r3)     // Catch:{ Exception -> 0x0039 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0039 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0039 }
            java.io.InputStream r4 = r6.getInputStream()     // Catch:{ Exception -> 0x0039 }
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0039 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r7 = r2.readLine()     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            r6.destroy()     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            r2.close()     // Catch:{ Exception -> 0x0047 }
            goto L_0x004d
        L_0x0031:
            r6 = move-exception
            r1 = r2
            goto L_0x004e
        L_0x0034:
            r6 = move-exception
            r1 = r2
            goto L_0x003a
        L_0x0037:
            r6 = move-exception
            goto L_0x004e
        L_0x0039:
            r6 = move-exception
        L_0x003a:
            java.lang.String r2 = f6011a     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = "Caught exception while trying to read Braze logger tag from system properties."
            com.appboy.support.AppboyLogger.m5452e(r2, r3, r6)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x004d
            r1.close()     // Catch:{ Exception -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r6 = move-exception
            java.lang.String r1 = f6011a
            com.appboy.support.AppboyLogger.m5452e(r1, r0, r6)
        L_0x004d:
            return r7
        L_0x004e:
            if (r1 == 0) goto L_0x005a
            r1.close()     // Catch:{ Exception -> 0x0054 }
            goto L_0x005a
        L_0x0054:
            r7 = move-exception
            java.lang.String r1 = f6011a
            com.appboy.support.AppboyLogger.m5452e(r1, r0, r7)
        L_0x005a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1696t4.m4768a(java.lang.String, java.lang.String):java.lang.String");
    }
}
