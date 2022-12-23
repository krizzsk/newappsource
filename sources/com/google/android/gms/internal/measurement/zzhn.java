package com.google.android.gms.internal.measurement;

public final class zzhn {
    private static volatile zzif zza;

    private zzhn() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        throw r14;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0120 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzif zza(android.content.Context r14) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.zzhn> r0 = com.google.android.gms.internal.measurement.zzhn.class
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzif r1 = zza     // Catch:{ all -> 0x013b }
            if (r1 != 0) goto L_0x0139
            java.lang.String r1 = android.os.Build.TYPE     // Catch:{ all -> 0x013b }
            java.lang.String r2 = android.os.Build.TAGS     // Catch:{ all -> 0x013b }
            java.lang.String r3 = "eng"
            boolean r3 = r1.equals(r3)     // Catch:{ all -> 0x013b }
            if (r3 != 0) goto L_0x001b
            java.lang.String r3 = "userdebug"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x013b }
            if (r1 == 0) goto L_0x002c
        L_0x001b:
            java.lang.String r1 = "dev-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x013b }
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = "test-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x013b }
            if (r1 == 0) goto L_0x002c
            goto L_0x0033
        L_0x002c:
            com.google.android.gms.internal.measurement.zzif r14 = com.google.android.gms.internal.measurement.zzif.zzc()     // Catch:{ all -> 0x013b }
        L_0x0030:
            r1 = r14
            goto L_0x0131
        L_0x0033:
            boolean r1 = com.google.android.gms.internal.measurement.zzha.zzb()     // Catch:{ all -> 0x013b }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r14.isDeviceProtectedStorage()     // Catch:{ all -> 0x013b }
            if (r1 != 0) goto L_0x0043
            android.content.Context r14 = r14.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x013b }
        L_0x0043:
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x013b }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0134 }
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ RuntimeException -> 0x0068 }
            java.lang.String r4 = "phenotype_hermetic"
            java.io.File r4 = r14.getDir(r4, r2)     // Catch:{ RuntimeException -> 0x0068 }
            java.lang.String r5 = "overrides.txt"
            r3.<init>(r4, r5)     // Catch:{ RuntimeException -> 0x0068 }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0134 }
            if (r4 == 0) goto L_0x0063
            com.google.android.gms.internal.measurement.zzif r3 = com.google.android.gms.internal.measurement.zzif.zzd(r3)     // Catch:{ all -> 0x0134 }
            goto L_0x006c
        L_0x0063:
            com.google.android.gms.internal.measurement.zzif r3 = com.google.android.gms.internal.measurement.zzif.zzc()     // Catch:{ all -> 0x0134 }
            goto L_0x006c
        L_0x0068:
            com.google.android.gms.internal.measurement.zzif r3 = com.google.android.gms.internal.measurement.zzif.zzc()     // Catch:{ all -> 0x0134 }
        L_0x006c:
            boolean r4 = r3.zzb()     // Catch:{ all -> 0x0134 }
            if (r4 == 0) goto L_0x0128
            java.lang.Object r3 = r3.zza()     // Catch:{ all -> 0x0134 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0134 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0121 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0121 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0121 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x0121 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0121 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0121 }
            r5 = 1
            s0.h r6 = new s0.h     // Catch:{ all -> 0x00f1 }
            r6.<init>()     // Catch:{ all -> 0x00f1 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x00f1 }
            r7.<init>()     // Catch:{ all -> 0x00f1 }
        L_0x0092:
            java.lang.String r8 = r4.readLine()     // Catch:{ all -> 0x00f1 }
            if (r8 == 0) goto L_0x00f3
            java.lang.String r9 = " "
            r10 = 3
            java.lang.String[] r8 = r8.split(r9, r10)     // Catch:{ all -> 0x00f1 }
            int r9 = r8.length     // Catch:{ all -> 0x00f1 }
            if (r9 == r10) goto L_0x00a3
            goto L_0x0092
        L_0x00a3:
            r9 = r8[r2]     // Catch:{ all -> 0x00f1 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x00f1 }
            r10.<init>(r9)     // Catch:{ all -> 0x00f1 }
            r9 = r8[r5]     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x00f1 }
            r11.<init>(r9)     // Catch:{ all -> 0x00f1 }
            java.lang.String r9 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x00f1 }
            r11 = 2
            r12 = r8[r11]     // Catch:{ all -> 0x00f1 }
            java.lang.Object r12 = r7.get(r12)     // Catch:{ all -> 0x00f1 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x00f1 }
            if (r12 != 0) goto L_0x00d8
            r8 = r8[r11]     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x00f1 }
            r11.<init>(r8)     // Catch:{ all -> 0x00f1 }
            java.lang.String r12 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x00f1 }
            int r8 = r12.length()     // Catch:{ all -> 0x00f1 }
            r13 = 1024(0x400, float:1.435E-42)
            if (r8 < r13) goto L_0x00d5
            if (r12 != r11) goto L_0x00d8
        L_0x00d5:
            r7.put(r11, r12)     // Catch:{ all -> 0x00f1 }
        L_0x00d8:
            boolean r8 = r6.containsKey(r10)     // Catch:{ all -> 0x00f1 }
            if (r8 != 0) goto L_0x00e6
            s0.h r8 = new s0.h     // Catch:{ all -> 0x00f1 }
            r8.<init>()     // Catch:{ all -> 0x00f1 }
            r6.put(r10, r8)     // Catch:{ all -> 0x00f1 }
        L_0x00e6:
            r8 = 0
            java.lang.Object r8 = r6.getOrDefault(r10, r8)     // Catch:{ all -> 0x00f1 }
            s0.h r8 = (p241s0.C6313h) r8     // Catch:{ all -> 0x00f1 }
            r8.put(r9, r12)     // Catch:{ all -> 0x00f1 }
            goto L_0x0092
        L_0x00f1:
            r14 = move-exception
            goto L_0x0106
        L_0x00f3:
            r3.toString()     // Catch:{ all -> 0x00f1 }
            r14.getPackageName()     // Catch:{ all -> 0x00f1 }
            com.google.android.gms.internal.measurement.zzhg r14 = new com.google.android.gms.internal.measurement.zzhg     // Catch:{ all -> 0x00f1 }
            r14.<init>(r6)     // Catch:{ all -> 0x00f1 }
            r4.close()     // Catch:{ IOException -> 0x0121 }
            com.google.android.gms.internal.measurement.zzif r14 = com.google.android.gms.internal.measurement.zzif.zzd(r14)     // Catch:{ all -> 0x0134 }
            goto L_0x012c
        L_0x0106:
            r4.close()     // Catch:{ all -> 0x010a }
            goto L_0x0120
        L_0x010a:
            r3 = move-exception
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0120 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r4[r2] = r6     // Catch:{ Exception -> 0x0120 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r4 = r6.getDeclaredMethod(r7, r4)     // Catch:{ Exception -> 0x0120 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0120 }
            r5[r2] = r3     // Catch:{ Exception -> 0x0120 }
            r4.invoke(r14, r5)     // Catch:{ Exception -> 0x0120 }
        L_0x0120:
            throw r14     // Catch:{ IOException -> 0x0121 }
        L_0x0121:
            r14 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0134 }
            r2.<init>(r14)     // Catch:{ all -> 0x0134 }
            throw r2     // Catch:{ all -> 0x0134 }
        L_0x0128:
            com.google.android.gms.internal.measurement.zzif r14 = com.google.android.gms.internal.measurement.zzif.zzc()     // Catch:{ all -> 0x0134 }
        L_0x012c:
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x013b }
            goto L_0x0030
        L_0x0131:
            zza = r1     // Catch:{ all -> 0x013b }
            goto L_0x0139
        L_0x0134:
            r14 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x013b }
            throw r14     // Catch:{ all -> 0x013b }
        L_0x0139:
            monitor-exit(r0)     // Catch:{ all -> 0x013b }
            return r1
        L_0x013b:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x013b }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhn.zza(android.content.Context):com.google.android.gms.internal.measurement.zzif");
    }
}
