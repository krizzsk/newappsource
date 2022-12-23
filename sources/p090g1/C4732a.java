package p090g1;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.core.app.NotificationManagerCompat;
import com.appboy.models.outgoing.FacebookUser;
import java.io.File;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import mf0.C24361g;
import p116i1.C5238b;
import p116i1.C5247f;
import p177n1.C5799a;
import p177n1.C5806f;
import p358af.C13437d;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: g1.a */
public class C4732a {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    /* renamed from: g1.a$a */
    public static class C4733a {
        /* renamed from: a */
        public static void m12028a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        public static void m12029b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: g1.a$b */
    public static class C4734b {
        /* renamed from: a */
        public static File[] m12030a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        public static File[] m12031b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        public static File[] m12032c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: g1.a$c */
    public static class C4735c {
        /* renamed from: a */
        public static File m12033a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        public static Drawable m12034b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        public static File m12035c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: g1.a$d */
    public static class C4736d {
        /* renamed from: a */
        public static int m12036a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        public static <T> T m12037b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: c */
        public static String m12038c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: g1.a$e */
    public static class C4737e {
        /* renamed from: a */
        public static Context m12039a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        public static File m12040b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        public static boolean m12041c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: g1.a$f */
    public static class C4738f {
        /* renamed from: a */
        public static Intent m12042a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            if ((i & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, C4732a.obtainAndCheckReceiverPermission(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }

        /* renamed from: b */
        public static ComponentName m12043b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: g1.a$g */
    public static class C4739g {
        /* renamed from: a */
        public static Executor m12044a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* renamed from: g1.a$h */
    public static class C4740h {
        /* renamed from: a */
        public static String m12045a(Context context) {
            return context.getAttributionTag();
        }
    }

    /* renamed from: g1.a$i */
    public static class C4741i {
        /* renamed from: a */
        public static Intent m12046a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    /* renamed from: g1.a$j */
    public static final class C4742j {

        /* renamed from: a */
        public static final HashMap<Class<?>, String> f16030a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f16030a = hashMap;
            if (Build.VERSION.SDK_INT >= 22) {
                hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, "alarm");
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        } else if (C5799a.m14229c() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } else {
            if (NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                return 0;
            }
            return -1;
        }
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4737e.m12039a(context);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File createFilesDir(java.io.File r2) {
        /*
            java.lang.Object r0 = sSync
            monitor-enter(r0)
            boolean r1 = r2.exists()     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x0014
            boolean r1 = r2.mkdirs()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return r2
        L_0x0011:
            r2.getPath()     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return r2
        L_0x0016:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p090g1.C4732a.createFilesDir(java.io.File):java.io.File");
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C4740h.m12045a(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return C4735c.m12033a(context);
    }

    public static int getColor(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4736d.m12036a(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C5247f.C5250c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C5247f.C5251d dVar = new C5247f.C5251d(resources, theme);
        synchronized (C5247f.f17367c) {
            SparseArray sparseArray = C5247f.f17366b.get(dVar);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (cVar = (C5247f.C5250c) sparseArray.get(i)) == null)) {
                if (!cVar.f17369b.equals(resources.getConfiguration()) || (!(theme == null && cVar.f17370c == 0) && (theme == null || cVar.f17370c != theme.hashCode()))) {
                    sparseArray.remove(i);
                } else {
                    colorStateList2 = cVar.f17368a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        if (!z) {
            try {
                colorStateList = C5238b.m13254a(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateList != null) {
            synchronized (C5247f.f17367c) {
                WeakHashMap<C5247f.C5251d, SparseArray<C5247f.C5250c>> weakHashMap = C5247f.f17366b;
                SparseArray sparseArray2 = weakHashMap.get(dVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(dVar, sparseArray2);
                }
                sparseArray2.append(i, new C5247f.C5250c(colorStateList, dVar.f17371a.getConfiguration(), theme));
            }
            return colorStateList;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return C5247f.C5249b.m13267b(resources, i, theme);
        } else {
            return resources.getColorStateList(i);
        }
    }

    public static File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4737e.m12040b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static Drawable getDrawable(Context context, int i) {
        return C4735c.m12034b(context, i);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return C4734b.m12030a(context);
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return C4734b.m12031b(context, str);
    }

    public static Executor getMainExecutor(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4739g.m12044a(context);
        }
        return new C5806f(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return C4735c.m12035c(context);
    }

    public static File[] getObbDirs(Context context) {
        return C4734b.m12032c(context);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4736d.m12037b(context, cls);
        }
        String systemServiceName = getSystemServiceName(context, cls);
        if (systemServiceName != null) {
            return context.getSystemService(systemServiceName);
        }
        return null;
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4736d.m12038c(context, cls);
        }
        return C4742j.f16030a.get(cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4737e.m12041c(context);
        }
        return false;
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (C24361g.m61191v(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(C13437d.m33706k("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, (String) null, (Handler) null, i);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, (Bundle) null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        C4733a.m12029b(context, intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C4738f.m12043b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int i2 = i & 1;
        if (i2 == 0 || (i & 4) == 0) {
            if (i2 != 0) {
                i |= 2;
            }
            int i3 = i;
            int i4 = i3 & 2;
            if (i4 == 0 && (i3 & 4) == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            } else if (i4 != 0 && (i3 & 4) != 0) {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            } else if (C5799a.m14229c()) {
                return C4741i.m12046a(context, broadcastReceiver, intentFilter, str, handler, i3);
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    return C4738f.m12042a(context, broadcastReceiver, intentFilter, str, handler, i3);
                }
                if ((i3 & 4) == 0 || str != null) {
                    return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
                }
                return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
            }
        } else {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        C4733a.m12028a(context, intentArr, bundle);
        return true;
    }
}
