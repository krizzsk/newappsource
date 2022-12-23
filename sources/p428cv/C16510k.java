package p428cv;

/* renamed from: cv.k */
public final class C16510k {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002d A[SYNTHETIC, Splitter:B:19:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0035 A[SYNTHETIC, Splitter:B:26:0x0035] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m41991a(android.content.Context r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "EMULATOR_FILENAME"
            java.util.Properties r1 = new java.util.Properties
            r1.<init>()
            r2 = 0
            java.io.File r3 = r4.getFileStreamPath(r0)     // Catch:{ Exception -> 0x0031, all -> 0x0029 }
            boolean r3 = r3.exists()     // Catch:{ Exception -> 0x0031, all -> 0x0029 }
            if (r3 == 0) goto L_0x0028
            java.io.FileInputStream r4 = r4.openFileInput(r0)     // Catch:{ Exception -> 0x0031, all -> 0x0029 }
            r1.load(r4)     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            java.lang.String r5 = r1.getProperty(r5)     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            if (r4 == 0) goto L_0x0022
            r4.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            return r5
        L_0x0023:
            r5 = move-exception
            r2 = r4
            goto L_0x002b
        L_0x0026:
            goto L_0x0033
        L_0x0028:
            return r2
        L_0x0029:
            r4 = move-exception
            r5 = r4
        L_0x002b:
            if (r2 == 0) goto L_0x0030
            r2.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            throw r5
        L_0x0031:
            r4 = r2
        L_0x0033:
            if (r4 == 0) goto L_0x0038
            r4.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p428cv.C16510k.m41991a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r2 != null) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040 A[SYNTHETIC, Splitter:B:14:0x0040] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m41992b(java.lang.String r7) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String r2 = "/system/bin/cat"
            java.lang.String r3 = "/proc/meminfo"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.lang.ProcessBuilder r3 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.lang.Process r2 = r3.start()     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
        L_0x001c:
            int r4 = r2.read(r3)     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            r5 = -1
            if (r4 == r5) goto L_0x0048
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            r4.<init>()     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            r4.append(r0)     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            r4.append(r5)     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            goto L_0x001c
        L_0x0038:
            r7 = move-exception
            r1 = r2
            goto L_0x003e
        L_0x003b:
            goto L_0x0046
        L_0x003d:
            r7 = move-exception
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            throw r7
        L_0x0044:
            r2 = r1
        L_0x0046:
            if (r2 == 0) goto L_0x004b
        L_0x0048:
            r2.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            java.lang.String r2 = "line.separator"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.String[] r0 = r0.split(r2)
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L_0x0058:
            if (r4 >= r2) goto L_0x0079
            r5 = r0[r4]
            boolean r6 = r5.startsWith(r7)
            if (r6 == 0) goto L_0x0076
            java.lang.String r7 = ":"
            java.lang.String[] r7 = r5.split(r7)
            int r0 = r7.length
            r1 = 1
            if (r0 <= r1) goto L_0x0073
            r7 = r7[r1]
            java.lang.String r7 = r7.trim()
            return r7
        L_0x0073:
            r7 = r7[r3]
            return r7
        L_0x0076:
            int r4 = r4 + 1
            goto L_0x0058
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p428cv.C16510k.m41992b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static boolean m41993c(String str) {
        return str == null || str.equals("");
    }

    /* renamed from: d */
    public static boolean m41994d(String str) {
        return str.equals("000000000000000") || str.equals("9774d56d682e549c") || str.equals("358673013795895");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004c A[SYNTHETIC, Splitter:B:30:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0053 A[SYNTHETIC, Splitter:B:34:0x0053] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m41995e(android.content.Context r5, java.lang.String r6, java.lang.String r7) throws java.lang.Exception {
        /*
            java.lang.String r0 = "EMULATOR_FILENAME"
            java.util.Properties r1 = new java.util.Properties
            r1.<init>()
            r2 = 0
            java.io.File r3 = r5.getFileStreamPath(r0)     // Catch:{ all -> 0x0047 }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0047 }
            if (r4 != 0) goto L_0x0015
            r3.createNewFile()     // Catch:{ all -> 0x0047 }
        L_0x0015:
            java.io.FileInputStream r3 = r5.openFileInput(r0)     // Catch:{ all -> 0x0047 }
            r1.load(r3)     // Catch:{ all -> 0x0042 }
            if (r7 == 0) goto L_0x0029
            java.lang.String r4 = ""
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0029
            r1.setProperty(r6, r7)     // Catch:{ all -> 0x0042 }
        L_0x0029:
            r6 = 32768(0x8000, float:4.5918E-41)
            java.io.FileOutputStream r5 = r5.openFileOutput(r0, r6)     // Catch:{ all -> 0x0042 }
            r1.store(r5, r2)     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x003a
            r3.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x003a
        L_0x0039:
        L_0x003a:
            if (r5 == 0) goto L_0x003f
            r5.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            return
        L_0x0040:
            r6 = move-exception
            goto L_0x0045
        L_0x0042:
            r5 = move-exception
            r6 = r5
            r5 = r2
        L_0x0045:
            r2 = r3
            goto L_0x004a
        L_0x0047:
            r5 = move-exception
            r6 = r5
            r5 = r2
        L_0x004a:
            if (r2 == 0) goto L_0x0051
            r2.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0051
        L_0x0050:
        L_0x0051:
            if (r5 == 0) goto L_0x0056
            r5.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p428cv.C16510k.m41995e(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
