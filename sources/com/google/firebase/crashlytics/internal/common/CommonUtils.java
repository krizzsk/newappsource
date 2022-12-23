package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public final class CommonUtils {

    /* renamed from: a */
    public static final char[] f36471a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static long f36472b = -1;

    public enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, Architecture> matcher = null;

        /* access modifiers changed from: public */
        static {
            Architecture architecture;
            Architecture architecture2;
            Architecture architecture3;
            Architecture architecture4;
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put("armeabi-v7a", architecture3);
            hashMap.put("armeabi", architecture2);
            hashMap.put("arm64-v8a", architecture4);
            hashMap.put("x86", architecture);
        }

        public static Architecture getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                return UNKNOWN;
            }
            Architecture architecture = matcher.get(str.toLowerCase(Locale.US));
            if (architecture == null) {
                return UNKNOWN;
            }
            return architecture;
        }
    }

    /* renamed from: a */
    public static void m35963a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static long m35964b(int i, String str, String str2) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m35965c(java.io.File r6) {
        /*
            java.lang.String r0 = "MemTotal"
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L_0x0047
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x003d
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x003a }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x003a }
            int r4 = r3.length     // Catch:{ Exception -> 0x003a }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x003a }
            boolean r4 = r4.equals(r0)     // Catch:{ Exception -> 0x003a }
            if (r4 == 0) goto L_0x0015
            r6 = r3[r5]     // Catch:{ Exception -> 0x003a }
            r2 = r6
            goto L_0x003d
        L_0x0037:
            r6 = move-exception
            goto L_0x0043
        L_0x0039:
            r1 = r2
        L_0x003a:
            r6.toString()     // Catch:{ all -> 0x0041 }
        L_0x003d:
            m35963a(r1)
            goto L_0x0047
        L_0x0041:
            r6 = move-exception
            r2 = r1
        L_0x0043:
            m35963a(r2)
            throw r6
        L_0x0047:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CommonUtils.m35965c(java.io.File):java.lang.String");
    }

    /* renamed from: d */
    public static int m35966d() {
        boolean z;
        boolean i = m35971i();
        if (m35972j()) {
            i |= true;
        }
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            z = true;
        } else {
            z = false;
        }
        return z ? i | true ? 1 : 0 : i ? 1 : 0;
    }

    /* renamed from: e */
    public static String m35967e(Context context) {
        int f = m35968f(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (f == 0) {
            f = m35968f(context, "com.crashlytics.android.build_id", "string");
        }
        if (f != 0) {
            return context.getResources().getString(f);
        }
        return null;
    }

    /* renamed from: f */
    public static int m35968f(Context context, String str, String str2) {
        String str3;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                str3 = context.getResources().getResourcePackageName(i);
                if (MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID.equals(str3)) {
                    str3 = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                str3 = context.getPackageName();
            }
        } else {
            str3 = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, str3);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|(5:7|8|9|10|(1:12)(2:13|(1:15)(2:16|(1:18))))|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0056 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized long m35969g() {
        /*
            java.lang.Class<com.google.firebase.crashlytics.internal.common.CommonUtils> r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.class
            monitor-enter(r0)
            long r1 = f36472b     // Catch:{ all -> 0x005c }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0058
            r1 = 0
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x005c }
            java.lang.String r4 = "/proc/meminfo"
            r3.<init>(r4)     // Catch:{ all -> 0x005c }
            java.lang.String r3 = m35965c(r3)     // Catch:{ all -> 0x005c }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x005c }
            if (r4 != 0) goto L_0x0056
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x005c }
            java.lang.String r3 = r3.toUpperCase(r4)     // Catch:{ all -> 0x005c }
            java.lang.String r4 = "KB"
            boolean r4 = r3.endsWith(r4)     // Catch:{ NumberFormatException -> 0x0056 }
            if (r4 == 0) goto L_0x0035
            java.lang.String r4 = "KB"
            r5 = 1024(0x400, float:1.435E-42)
            long r1 = m35964b(r5, r3, r4)     // Catch:{ NumberFormatException -> 0x0056 }
            goto L_0x0056
        L_0x0035:
            java.lang.String r4 = "MB"
            boolean r4 = r3.endsWith(r4)     // Catch:{ NumberFormatException -> 0x0056 }
            if (r4 == 0) goto L_0x0046
            java.lang.String r4 = "MB"
            r5 = 1048576(0x100000, float:1.469368E-39)
            long r1 = m35964b(r5, r3, r4)     // Catch:{ NumberFormatException -> 0x0056 }
            goto L_0x0056
        L_0x0046:
            java.lang.String r4 = "GB"
            boolean r4 = r3.endsWith(r4)     // Catch:{ NumberFormatException -> 0x0056 }
            if (r4 == 0) goto L_0x0056
            java.lang.String r4 = "GB"
            r5 = 1073741824(0x40000000, float:2.0)
            long r1 = m35964b(r5, r3, r4)     // Catch:{ NumberFormatException -> 0x0056 }
        L_0x0056:
            f36472b = r1     // Catch:{ all -> 0x005c }
        L_0x0058:
            long r1 = f36472b     // Catch:{ all -> 0x005c }
            monitor-exit(r0)
            return r1
        L_0x005c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CommonUtils.m35969g():long");
    }

    /* renamed from: h */
    public static String m35970h(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f36471a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: i */
    public static boolean m35971i() {
        if (!Build.PRODUCT.contains(ServerParameters.ANDROID_SDK_INT)) {
            String str = Build.HARDWARE;
            if (str.contains("goldfish") || str.contains("ranchu")) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m35972j() {
        boolean i = m35971i();
        String str = Build.TAGS;
        if ((!i && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (i || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static String m35973k(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }
}
