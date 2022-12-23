package com.fyber.inneractive.sdk.serverapi;

import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.C3705k;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3725r;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.C3747z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.serverapi.b */
public class C3657b implements C3658c {

    /* renamed from: d */
    public static final List<Integer> f12781d = Arrays.asList(new Integer[]{5});

    /* renamed from: e */
    public static final List<Integer> f12782e = Arrays.asList(new Integer[]{2, 5});

    /* renamed from: f */
    public static final List<String> f12783f = Arrays.asList(new String[]{"video/mp4", "video/webm", "video/3gpp", "application/x-mpegURL"});

    /* renamed from: a */
    public C2666s f12784a;

    /* renamed from: b */
    public Location f12785b = C3747z.C3748a.f12955a.mo15399a();

    /* renamed from: c */
    public String f12786c = C3705k.m9948j();

    public C3657b(C2666s sVar) {
        this.f12784a = sVar;
    }

    /* renamed from: a */
    public String mo15301a() {
        try {
            return ((TelephonyManager) C3707l.f12893a.getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public String mo15305b() {
        int i = C3705k.f12885c;
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    /* renamed from: c */
    public String mo15306c() {
        if (!mo15317n() || ((double) this.f12785b.getAccuracy()) == 0.0d) {
            return null;
        }
        return String.valueOf(this.f12785b.getAccuracy());
    }

    /* renamed from: d */
    public String mo15307d() {
        if (mo15317n()) {
            return String.valueOf(this.f12785b.getLatitude());
        }
        return null;
    }

    /* renamed from: e */
    public String mo15308e() {
        if (mo15317n()) {
            return String.valueOf(this.f12785b.getLongitude());
        }
        return null;
    }

    /* renamed from: f */
    public String mo15309f() {
        double d;
        if (!mo15317n()) {
            return null;
        }
        Location location = this.f12785b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long elapsedRealtimeNanos2 = location.getElapsedRealtimeNanos();
        if (elapsedRealtimeNanos <= 0 || elapsedRealtimeNanos2 <= 0) {
            d = 0.0d;
        } else {
            d = ((double) (elapsedRealtimeNanos - elapsedRealtimeNanos2)) / 1.0E9d;
        }
        if (d < 0.0d) {
            return null;
        }
        return String.format(Locale.ENGLISH, "%.2f", new Object[]{Double.valueOf(d)});
    }

    /* renamed from: g */
    public String mo15310g() {
        if (mo15317n()) {
            Location location = this.f12785b;
            float f = BitmapDescriptorFactory.HUE_RED;
            if (Build.VERSION.SDK_INT >= 26) {
                f = location.getVerticalAccuracyMeters();
            }
            if (((double) f) != 0.0d) {
                return String.valueOf(f);
            }
        }
        return null;
    }

    /* renamed from: h */
    public String mo15311h() {
        String str = this.f12786c;
        if (str == null) {
            return "";
        }
        return str.substring(0, Math.min(3, str.length()));
    }

    /* renamed from: i */
    public String mo15312i() {
        String str = this.f12786c;
        if (str == null) {
            return "";
        }
        return str.substring(Math.min(3, str.length()));
    }

    /* renamed from: j */
    public String mo15313j() {
        return C3707l.f12893a.getPackageName();
    }

    /* renamed from: k */
    public String mo15314k() {
        try {
            return C3707l.f12893a.getPackageManager().getPackageInfo(C3707l.f12893a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: l */
    public int mo15315l() {
        return C3707l.m9968c(C3707l.m9970d());
    }

    /* renamed from: m */
    public int mo15316m() {
        return C3707l.m9968c(C3707l.m9972e());
    }

    /* renamed from: n */
    public boolean mo15317n() {
        return this.f12785b != null;
    }

    /* renamed from: o */
    public boolean mo15318o() {
        if ((!C3725r.m9983a()) || IAConfigManager.f9202J.f9230r) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String mo15303a(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('-');
        sb.append("Android");
        sb.append('-');
        sb.append("8.1.5");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(InneractiveAdManager.getDevPlatform());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo15304a(Map<String, String> map, String str) {
        String str2;
        HashMap<String, Integer> hashMap = C3655a.f12779a;
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str2 = "unity3d";
        } catch (Throwable unused) {
            str2 = "native";
        }
        map.put("frmn", str2);
        map.put("dsk_t", C3727s.m9989a(C3655a.m9860f()));
        map.put("dsk_a", C3727s.m9989a(C3655a.m9858d()));
        map.put("headset", m9869a(C3655a.m9867m()));
        map.put("is_muted", m9869a(C3655a.m9865k()));
        map.put("btry_c", m9869a(C3655a.m9864j()));
        map.put("btry_l", C3655a.m9854a());
        map.put("bt_con", m9869a(C3655a.m9862h()));
        map.put("tod", C3727s.m9989a(C3655a.m9859e()));
        map.put("apnm", m9869a(C3655a.m9861g()));
        map.put("dnd", m9869a(C3655a.m9866l()));
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        map.put("lng", iAConfigManager.f9228p);
        String a = iAConfigManager.f9236x.mo13209a(C3655a.m9852a(str), "LAST_DOMAIN_SHOWED");
        if (!TextUtils.isEmpty(a) && a.contains(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR)) {
            a = a.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR)[0];
        }
        map.put("ldomain", a);
        map.put("lbundle", iAConfigManager.f9236x.mo13209a(C3655a.m9852a(str), "LAST_APP_BUNDLE_ID"));
        String a2 = iAConfigManager.f9236x.mo13209a(C3655a.m9852a(str), "LAST_CLICKED");
        String str3 = "";
        if (TextUtils.equals(a2, "0")) {
            a2 = str3;
        }
        map.put("lclick", a2);
        String a3 = iAConfigManager.f9236x.mo13209a(C3655a.m9852a(str), "LAST_VAST_SKIPED");
        if (TextUtils.equals(a3, "0")) {
            a3 = str3;
        }
        map.put("v_lskip", a3);
        UnitDisplayType a4 = C3655a.m9852a(str);
        if (a4.isFullscreenUnit()) {
            str3 = iAConfigManager.f9236x.mo13209a(a4, "LAST_VAST_CLICKED_TYPE");
        }
        map.put("v_lclicktype", str3);
        map.put("sdur", C3727s.m9989a(C3655a.m9856b()));
        map.put("userid", IAConfigManager.m6635e());
        map.put("low_power_mode", m9869a(C3655a.m9868n()));
        map.put("dark_mode", m9869a(C3655a.m9863i()));
        map.put("d_api", String.valueOf(Build.VERSION.SDK_INT));
    }

    /* renamed from: a */
    public static String m9869a(Boolean bool) {
        if (bool == null) {
            return "";
        }
        return bool.booleanValue() ? DiskLruCache.VERSION_1 : "0";
    }

    /* renamed from: a */
    public String mo15302a(Intent intent) {
        return C3655a.m9855a(((float) (intent.getIntExtra("level", -1) * 100)) / ((float) intent.getIntExtra("scale", -1)));
    }
}
