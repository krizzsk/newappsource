package p030bo.app;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.appboy.support.AppboyLogger;
import com.braze.configuration.BrazeConfigurationProvider;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;
import p030bo.app.C1651o2;

/* renamed from: bo.app.q1 */
public class C1670q1 implements C1716w1 {

    /* renamed from: h */
    public static final String f5946h = AppboyLogger.getBrazeLogTag(C1670q1.class);

    /* renamed from: a */
    public final Context f5947a;

    /* renamed from: b */
    public final C1724x1 f5948b;

    /* renamed from: c */
    public final C1709v3 f5949c;

    /* renamed from: d */
    public final BrazeConfigurationProvider f5950d;

    /* renamed from: e */
    public String f5951e;

    /* renamed from: f */
    public String f5952f;

    /* renamed from: g */
    public final SharedPreferences f5953g;

    public C1670q1(Context context, BrazeConfigurationProvider brazeConfigurationProvider, C1724x1 x1Var, C1709v3 v3Var) {
        context.getClass();
        this.f5947a = context;
        this.f5950d = brazeConfigurationProvider;
        this.f5948b = x1Var;
        this.f5949c = v3Var;
        this.f5953g = context.getSharedPreferences("com.appboy.managers.device_data_provider", 0);
    }

    /* renamed from: a */
    public void mo6310a(String str) {
        this.f5953g.edit().putString("google_ad_id", str).apply();
    }

    /* renamed from: b */
    public C1651o2 mo6312b() {
        this.f5949c.mo6408a(mo6315e());
        return (C1651o2) this.f5949c.mo6369a();
    }

    /* renamed from: c */
    public String mo6313c() {
        String str = this.f5951e;
        if (str != null) {
            return str;
        }
        PackageInfo h = mo6319h();
        if (h != null) {
            String str2 = h.versionName;
            this.f5951e = str2;
            return str2;
        }
        AppboyLogger.m5448d(f5946h, "App version could not be read. Returning null");
        return null;
    }

    /* renamed from: d */
    public Boolean mo6314d() {
        if (!this.f5953g.contains("ad_tracking_enabled")) {
            return null;
        }
        return Boolean.valueOf(this.f5953g.getBoolean("ad_tracking_enabled", true));
    }

    /* renamed from: e */
    public C1651o2 mo6315e() {
        return new C1651o2.C1653b(this.f5950d).mo6267a(mo6322k()).mo6270b(mo6323l()).mo6274e(Build.MODEL).mo6273d(m4625a(mo6324m())).mo6276g(mo6325n().getID()).mo6275f(m4624a(this.f5947a, mo6321j())).mo6271c(Boolean.valueOf(mo6317g())).mo6269b(Boolean.valueOf(mo6320i())).mo6272c(mo6316f()).mo6266a(mo6314d()).mo6268a();
    }

    /* renamed from: f */
    public String mo6316f() {
        return this.f5953g.getString("google_ad_id", (String) null);
    }

    /* renamed from: g */
    public boolean mo6317g() {
        Object a;
        if (Build.VERSION.SDK_INT >= 24) {
            NotificationManager notificationManager = (NotificationManager) this.f5947a.getSystemService("notification");
            if (notificationManager != null) {
                return notificationManager.areNotificationsEnabled();
            }
            return true;
        }
        try {
            Method b = C1689s4.m4741b("androidx.core.app.NotificationManagerCompat", "from", Context.class);
            if (b == null || (a = C1689s4.m4738a((Object) null, b, this.f5947a)) == null) {
                return true;
            }
            Method a2 = C1689s4.m4739a(a.getClass(), "areNotificationsEnabled", (Class<?>[]) new Class[0]);
            if (a2 == null) {
                return true;
            }
            Object a3 = C1689s4.m4738a(a, a2, new Object[0]);
            if (a3 instanceof Boolean) {
                return ((Boolean) a3).booleanValue();
            }
            return true;
        } catch (Exception e) {
            AppboyLogger.m5452e(f5946h, "Failed to read notifications enabled state from NotificationManagerCompat.", e);
            return true;
        }
    }

    public String getDeviceId() {
        String a = this.f5948b.mo6342a();
        if (a == null) {
            AppboyLogger.m5459w(f5946h, "Error reading deviceId, received a null value.");
        }
        return a;
    }

    /* renamed from: h */
    public final PackageInfo mo6319h() {
        String packageName = this.f5947a.getPackageName();
        try {
            return this.f5947a.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String str = f5946h;
            AppboyLogger.m5452e(str, "Unable to inspect package [" + packageName + "]", e);
            return this.f5947a.getPackageManager().getPackageArchiveInfo(this.f5947a.getApplicationInfo().sourceDir, 0);
        }
    }

    /* renamed from: i */
    public final boolean mo6320i() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            return ((ActivityManager) this.f5947a.getSystemService("activity")).isBackgroundRestricted();
        } catch (Exception e) {
            AppboyLogger.m5452e(f5946h, "Failed to collect background restriction information from Activity Manager", e);
            return false;
        }
    }

    /* renamed from: j */
    public final boolean mo6321j() {
        return this.f5947a.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: k */
    public final String mo6322k() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    /* renamed from: l */
    public final String mo6323l() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f5947a.getSystemService("phone");
            int phoneType = telephonyManager.getPhoneType();
            if (phoneType != 0) {
                if (phoneType == 1 || phoneType == 2) {
                    return telephonyManager.getNetworkOperatorName();
                }
                AppboyLogger.m5459w(f5946h, "Unknown phone type");
            }
        } catch (Resources.NotFoundException e) {
            AppboyLogger.m5452e(f5946h, "Caught resources not found exception while reading the phone carrier name.", e);
        } catch (SecurityException e2) {
            AppboyLogger.m5452e(f5946h, "Caught security exception while reading the phone carrier name.", e2);
        }
        return null;
    }

    /* renamed from: m */
    public final Locale mo6324m() {
        return Locale.getDefault();
    }

    /* renamed from: n */
    public final TimeZone mo6325n() {
        return TimeZone.getDefault();
    }

    /* renamed from: a */
    public void mo6311a(boolean z) {
        this.f5953g.edit().putBoolean("ad_tracking_enabled", !z).apply();
    }

    /* renamed from: a */
    public String mo6309a() {
        long j;
        String str = this.f5952f;
        if (str != null) {
            return str;
        }
        PackageInfo h = mo6319h();
        if (h != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j = h.getLongVersionCode();
            } else {
                j = (long) h.versionCode;
            }
            String str2 = j + ".0.0.0";
            this.f5952f = str2;
            return str2;
        }
        AppboyLogger.m5448d(f5946h, "App version code could not be read. Returning null");
        return null;
    }

    /* renamed from: a */
    public static String m4624a(Context context, boolean z) {
        int i;
        int i2;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            i2 = bounds.width();
            i = bounds.height();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i3 = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
            i2 = i3;
            i = i4;
        }
        if (z) {
            return i + "x" + i2;
        }
        return i2 + "x" + i;
    }

    /* renamed from: a */
    public static String m4625a(Locale locale) {
        return locale.toString();
    }
}
