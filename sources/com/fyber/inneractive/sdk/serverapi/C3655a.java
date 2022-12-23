package com.fyber.inneractive.sdk.serverapi;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C2618a;
import com.fyber.inneractive.sdk.config.C2619a0;
import com.fyber.inneractive.sdk.config.C2628d0;
import com.fyber.inneractive.sdk.config.C2684r;
import com.fyber.inneractive.sdk.config.C2701x;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3707l;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.io.File;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.serverapi.a */
public class C3655a {

    /* renamed from: a */
    public static final HashMap<String, Integer> f12779a = new C3656a();

    /* renamed from: b */
    public static final List<String> f12780b = Arrays.asList(new String[]{"POWER_SAVE_MODE_OPEN", "SmartModeStatus"});

    /* renamed from: com.fyber.inneractive.sdk.serverapi.a$a */
    public class C3656a extends HashMap<String, Integer> {
        public C3656a() {
            put("HUAWEI", 4);
            put("XIAOMI", 1);
        }
    }

    /* renamed from: a */
    public static String m9854a() {
        try {
            Intent registerReceiver = C3707l.f12893a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return "";
            }
            return m9855a(((float) (registerReceiver.getIntExtra("level", -1) * 100)) / ((float) registerReceiver.getIntExtra("scale", -1)));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m9855a(float f) {
        return f < 5.0f ? DiskLruCache.VERSION_1 : f <= 9.0f ? "2" : f <= 24.0f ? "3" : f <= 39.0f ? "4" : f <= 54.0f ? "5" : f <= 69.0f ? "6" : f <= 84.0f ? "7" : f <= 100.0f ? "8" : "";
    }

    /* renamed from: b */
    public static Long m9856b() {
        long j;
        C2628d0 d0Var = IAConfigManager.f9202J.f9236x;
        d0Var.getClass();
        String str = "";
        try {
            String str2 = d0Var.f9280c.get("SESSION_STAMP");
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            j = Long.parseLong(str);
        } catch (Exception unused) {
            j = 0;
        }
        return Long.valueOf(TimeUnit.SECONDS.convert(SystemClock.elapsedRealtime() - j, TimeUnit.MILLISECONDS));
    }

    /* renamed from: c */
    public static String m9857c() {
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            return "unity3d";
        } catch (Throwable unused) {
            return "native";
        }
    }

    /* renamed from: d */
    public static Long m9858d() {
        try {
            Application application = C3707l.f12893a;
            return Long.valueOf((m9851a(application, true) + application.getCacheDir().getFreeSpace()) / 1048576);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Long m9859e() {
        try {
            return Long.valueOf(TimeUnit.MINUTES.convert((long) Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()), TimeUnit.MILLISECONDS));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r7.isRemovable() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r8 = m9851a(com.fyber.inneractive.sdk.util.C3707l.f12893a, false) / 1048576;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0051 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Long m9860f() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1048576(0x100000, double:5.180654E-318)
            r4 = 0
            r6 = 26
            if (r0 < r6) goto L_0x0061
            android.app.Application r0 = com.fyber.inneractive.sdk.util.C3707l.f12893a     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = "storagestats"
            java.lang.Object r0 = r0.getSystemService(r6)     // Catch:{ all -> 0x0072 }
            android.app.usage.StorageStatsManager r0 = (android.app.usage.StorageStatsManager) r0     // Catch:{ all -> 0x0072 }
            android.app.Application r6 = com.fyber.inneractive.sdk.util.C3707l.f12893a     // Catch:{ all -> 0x0072 }
            java.lang.String r7 = "storage"
            java.lang.Object r6 = r6.getSystemService(r7)     // Catch:{ all -> 0x0072 }
            android.os.storage.StorageManager r6 = (android.os.storage.StorageManager) r6     // Catch:{ all -> 0x0072 }
            java.util.List r6 = r6.getStorageVolumes()     // Catch:{ all -> 0x0072 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0072 }
        L_0x0028:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0072 }
            if (r7 == 0) goto L_0x0072
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0072 }
            android.os.storage.StorageVolume r7 = (android.p014os.storage.StorageVolume) r7     // Catch:{ all -> 0x0072 }
            java.lang.String r8 = r7.getUuid()     // Catch:{ all -> 0x0051 }
            if (r8 != 0) goto L_0x003d
            java.util.UUID r8 = android.os.storage.StorageManager.UUID_DEFAULT     // Catch:{ all -> 0x0051 }
            goto L_0x0049
        L_0x003d:
            java.lang.String r8 = r7.getUuid()     // Catch:{ all -> 0x0051 }
            byte[] r8 = r8.getBytes()     // Catch:{ all -> 0x0051 }
            java.util.UUID r8 = java.util.UUID.nameUUIDFromBytes(r8)     // Catch:{ all -> 0x0051 }
        L_0x0049:
            if (r8 == 0) goto L_0x0028
            long r8 = r0.getTotalBytes(r8)     // Catch:{ all -> 0x0051 }
            long r8 = r8 / r2
            goto L_0x005f
        L_0x0051:
            boolean r7 = r7.isRemovable()     // Catch:{ all -> 0x0028 }
            if (r7 == 0) goto L_0x0028
            android.app.Application r7 = com.fyber.inneractive.sdk.util.C3707l.f12893a     // Catch:{ all -> 0x0028 }
            long r7 = m9851a(r7, r1)     // Catch:{ all -> 0x0028 }
            long r8 = r7 / r2
        L_0x005f:
            long r4 = r4 + r8
            goto L_0x0028
        L_0x0061:
            android.app.Application r0 = com.fyber.inneractive.sdk.util.C3707l.f12893a     // Catch:{ all -> 0x0072 }
            long r6 = m9851a(r0, r1)     // Catch:{ all -> 0x0072 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ all -> 0x0072 }
            long r0 = r0.getTotalSpace()     // Catch:{ all -> 0x0072 }
            long r6 = r6 + r0
            long r4 = r6 / r2
        L_0x0072:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.serverapi.C3655a.m9860f():java.lang.Long");
    }

    /* renamed from: g */
    public static Boolean m9861g() {
        try {
            boolean z = false;
            if (Settings.System.getInt(C3707l.f12893a.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: h */
    public static Boolean m9862h() {
        if (C3707l.m9966b("android.permission.BLUETOOTH")) {
            try {
                BluetoothManager bluetoothManager = (BluetoothManager) C3707l.f12893a.getSystemService("bluetooth");
                if (bluetoothManager.getAdapter().getProfileConnectionState(1) != 2) {
                    if (bluetoothManager.getAdapter().getProfileConnectionState(2) != 2) {
                        return null;
                    }
                }
                return Boolean.TRUE;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: i */
    public static Boolean m9863i() {
        boolean z;
        if ((C3707l.f12893a.getResources().getConfiguration().uiMode & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: j */
    public static Boolean m9864j() {
        try {
            Intent registerReceiver = C3707l.f12893a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z = true;
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("plugged", -1);
                if (!(intExtra == 1 || intExtra == 2)) {
                    if (intExtra == 4) {
                    }
                }
                return Boolean.valueOf(z);
            }
            z = false;
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static Boolean m9865k() {
        try {
            boolean z = false;
            int ringerMode = ((AudioManager) C3707l.f12893a.getSystemService("audio")).getRingerMode();
            if (ringerMode == 0 || ringerMode == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static Boolean m9866l() {
        boolean z;
        try {
            NotificationManager notificationManager = (NotificationManager) C3707l.f12893a.getSystemService("notification");
            if (Build.VERSION.SDK_INT < 23) {
                return null;
            }
            int a = notificationManager.getCurrentInterruptionFilter();
            if (a < 2 || a > 4) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static Boolean m9867m() {
        boolean z;
        try {
            AudioManager audioManager = (AudioManager) C3707l.f12893a.getSystemService("audio");
            if (Build.VERSION.SDK_INT >= 23) {
                z = false;
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    if (audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                        z = true;
                    }
                }
            } else {
                z = audioManager.isWiredHeadsetOn();
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static Boolean m9868n() {
        Integer num;
        boolean z;
        try {
            String upperCase = Build.MANUFACTURER.toUpperCase(Locale.getDefault());
            if (TextUtils.isEmpty(upperCase) || !f12779a.containsKey(upperCase)) {
                return Boolean.valueOf(((PowerManager) C3707l.f12893a.getSystemService("power")).isPowerSaveMode());
            }
            try {
                for (String str : f12780b) {
                    int i = Settings.System.getInt(C3707l.f12893a.getContentResolver(), str, -1);
                    if (i != -1 && (num = f12779a.get(upperCase)) != null) {
                        if (num.intValue() == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static UnitDisplayType m9852a(String str) {
        C2702y yVar;
        UnitDisplayType unitDisplayType = UnitDisplayType.INTERSTITIAL;
        C2701x a = C2618a.m6639a(str);
        if (a == null || a.f9420a.size() <= 0 || (yVar = a.f9420a.get(0)) == null) {
            return unitDisplayType;
        }
        C2619a0 a0Var = yVar.f9427f;
        C2684r rVar = yVar.f9424c;
        if (a0Var != null) {
            return a0Var.f9256j;
        }
        return rVar != null ? rVar.f9368b : unitDisplayType;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m9851a(android.content.Context r3, boolean r4) {
        /*
            java.lang.String r0 = com.fyber.inneractive.sdk.util.C3707l.m9964b()     // Catch:{ all -> 0x001f }
            r1 = 0
            java.io.File[] r1 = r3.getExternalFilesDirs(r1)     // Catch:{ all -> 0x001f }
            int r1 = r1.length     // Catch:{ all -> 0x001f }
            r2 = 2
            if (r1 < r2) goto L_0x001f
            java.lang.String r1 = "mounted"
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x001d
            java.lang.String r1 = "mounted_ro"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001f
        L_0x001d:
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r0 == 0) goto L_0x0036
            if (r4 == 0) goto L_0x002d
            java.io.File r3 = m9853a((android.content.Context) r3)     // Catch:{ all -> 0x0036 }
            long r3 = r3.getFreeSpace()     // Catch:{ all -> 0x0036 }
            goto L_0x0038
        L_0x002d:
            java.io.File r3 = m9853a((android.content.Context) r3)     // Catch:{ all -> 0x0036 }
            long r3 = r3.getTotalSpace()     // Catch:{ all -> 0x0036 }
            goto L_0x0038
        L_0x0036:
            r3 = 0
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.serverapi.C3655a.m9851a(android.content.Context, boolean):long");
    }

    /* renamed from: a */
    public static File m9853a(Context context) {
        if (context == null) {
            return null;
        }
        for (File file : context.getExternalCacheDirs()) {
            if (!Environment.isExternalStorageEmulated(file)) {
                return file;
            }
        }
        return null;
    }
}
