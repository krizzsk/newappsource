package zendesk.support;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.zendesk.logger.Logger;
import ge0.C23409b;
import ge0.C23410c;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class SupportSdkMetadata {
    private static final int BAD_VALUE = -1;
    private static final long BYTES_MULTIPLIER = 1024;
    private static final String DEVICE_INFO_API_VERSION = "device_api";
    private static final String DEVICE_INFO_BATTERY = "device_battery";
    private static final String DEVICE_INFO_DEVICE_NAME = "device_name";
    private static final String DEVICE_INFO_LOW_MEMORY = "device_low_memory";
    private static final String DEVICE_INFO_MANUFACTURER = "device_manufacturer";
    private static final String DEVICE_INFO_MODEL_TYPE = "device_model";
    private static final String DEVICE_INFO_OS_VERSION = "device_os";
    private static final String DEVICE_INFO_TOTAL_MEMORY = "device_total_memory";
    private static final String DEVICE_INFO_USED_MEMORY = "device_used_memory";
    private static final int EXPECTED_TOKEN_COUNT = 3;
    private static final String LOG_TAG = "SupportSdkMetadata";
    private final ActivityManager activityManager;
    private final Context context;

    public SupportSdkMetadata(Context context2) {
        this.context = context2;
        this.activityManager = (ActivityManager) context2.getSystemService("activity");
    }

    private int getBatteryLevel() {
        Intent registerReceiver = this.context.getApplicationContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("level", -1);
        }
        return -1;
    }

    private String getBytesInMb(long j) {
        return String.valueOf(j / 1048576);
    }

    private String getManufacturer() {
        boolean z;
        String str = Build.MANUFACTURER;
        if ("unknown".equals(str) || C23410c.m57534b(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        return str;
    }

    private String getModel() {
        boolean z;
        boolean z2;
        String str = Build.MODEL;
        if ("unknown".equals(str) || C23410c.m57534b(str)) {
            z = true;
        } else {
            z = false;
        }
        String str2 = Build.DEVICE;
        if ("unknown".equals(str2) || C23410c.m57534b(str2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return "";
        }
        if (str.equals(str2)) {
            return str;
        }
        return String.format(Locale.US, "%s/%s", new Object[]{str, str2});
    }

    private String getModelDeviceName() {
        return Build.DEVICE;
    }

    @TargetApi(16)
    private long getTotalMemory() {
        Logger.m57302a("Using getTotalMemoryApi() to determine memory", new Object[0]);
        return getTotalMemoryApi();
    }

    @TargetApi(16)
    private long getTotalMemoryApi() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053 A[SYNTHETIC, Splitter:B:16:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c A[Catch:{ NoSuchElementException -> 0x0098, NumberFormatException -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6 A[SYNTHETIC, Splitter:B:34:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long getTotalMemoryCompat() {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to close /proc/meminfo file stream: "
            r1 = 0
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            java.lang.String r5 = "/proc/meminfo"
            r4.<init>(r5)     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            java.lang.String r2 = r3.readLine()     // Catch:{ IOException -> 0x002e }
            r3.close()     // Catch:{ IOException -> 0x0018 }
            goto L_0x006e
        L_0x0018:
            r3 = move-exception
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.zendesk.logger.Logger.m57307f(r0, r3)
            goto L_0x006e
        L_0x002e:
            r2 = move-exception
            goto L_0x0037
        L_0x0030:
            r3 = move-exception
            goto L_0x00a4
        L_0x0033:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L_0x0037:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r4.<init>()     // Catch:{ all -> 0x00a0 }
            java.lang.String r5 = "Failed to determine total memory from /proc/meminfo: "
            r4.append(r5)     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x00a0 }
            r4.append(r2)     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x00a0 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a0 }
            com.zendesk.logger.Logger.m57304c(r2, r4)     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x006c
            r3.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x006c
        L_0x0057:
            r2 = move-exception
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.zendesk.logger.Logger.m57307f(r0, r2)
        L_0x006c:
            java.lang.String r2 = ""
        L_0x006e:
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r0.<init>(r2)
            r2 = -1
            int r4 = r0.countTokens()     // Catch:{ NoSuchElementException -> 0x0098, NumberFormatException -> 0x0090 }
            r5 = 3
            if (r4 != r5) goto L_0x009f
            r0.nextToken()     // Catch:{ NoSuchElementException -> 0x0098, NumberFormatException -> 0x0090 }
            java.lang.String r0 = r0.nextToken()     // Catch:{ NoSuchElementException -> 0x0098, NumberFormatException -> 0x0090 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NoSuchElementException -> 0x0098, NumberFormatException -> 0x0090 }
            long r0 = r0.longValue()     // Catch:{ NoSuchElementException -> 0x0098, NumberFormatException -> 0x0090 }
            r2 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r0
            goto L_0x009f
        L_0x0090:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Error reading memory size from proc/meminfo"
            com.zendesk.logger.Logger.m57304c(r1, r0)
            goto L_0x009f
        L_0x0098:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Error reading tokens from the /proc/meminfo"
            com.zendesk.logger.Logger.m57304c(r1, r0)
        L_0x009f:
            return r2
        L_0x00a0:
            r2 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L_0x00a4:
            if (r2 == 0) goto L_0x00bf
            r2.close()     // Catch:{ IOException -> 0x00aa }
            goto L_0x00bf
        L_0x00aa:
            r2 = move-exception
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.zendesk.logger.Logger.m57307f(r0, r1)
        L_0x00bf:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.SupportSdkMetadata.getTotalMemoryCompat():long");
    }

    private long getUsedMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return getTotalMemory() - memoryInfo.availMem;
    }

    private int getVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    private String getVersionName() {
        return Build.VERSION.RELEASE;
    }

    private boolean isLowMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public Map<String, String> getDeviceInfoAsMapForMetaData() {
        HashMap hashMap = new HashMap();
        hashMap.put(DEVICE_INFO_OS_VERSION, getVersionName());
        hashMap.put(DEVICE_INFO_API_VERSION, String.valueOf(getVersionCode()));
        hashMap.put(DEVICE_INFO_MODEL_TYPE, getModel());
        hashMap.put(DEVICE_INFO_DEVICE_NAME, getModelDeviceName());
        hashMap.put(DEVICE_INFO_MANUFACTURER, getManufacturer());
        hashMap.put(DEVICE_INFO_TOTAL_MEMORY, getBytesInMb(getTotalMemory()));
        hashMap.put(DEVICE_INFO_USED_MEMORY, getBytesInMb(getUsedMemory()));
        hashMap.put(DEVICE_INFO_LOW_MEMORY, String.valueOf(isLowMemory()));
        hashMap.put(DEVICE_INFO_BATTERY, String.valueOf(getBatteryLevel()));
        return hashMap;
    }

    public String getLocale() {
        return C23409b.m57532b(Locale.getDefault());
    }
}
