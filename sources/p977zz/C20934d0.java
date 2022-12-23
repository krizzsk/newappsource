package p977zz;

import android.content.Context;
import android.location.LocationManager;
import android.provider.Settings;
import com.appboy.models.outgoing.FacebookUser;
import java.util.Collections;
import java.util.List;
import p090g1.C4732a;

/* renamed from: zz.d0 */
public final class C20934d0 {
    /* renamed from: a */
    public static boolean m49030a(Context context) {
        try {
            return C4732a.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m49031b(Context context) {
        try {
            return C4732a.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m49032c(Context context) {
        return m49031b(context) || m49030a(context);
    }

    /* renamed from: d */
    public static boolean m49033d(Context context, String... strArr) {
        List<T> list;
        List<String> providers = ((LocationManager) context.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY)).getProviders(true);
        if (providers == null) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(providers);
        }
        for (String contains : strArr) {
            if (list.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m49034e(Context context) {
        try {
            if (C20943i.m49051d(28)) {
                LocationManager locationManager = (LocationManager) context.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
                if (locationManager == null || !locationManager.isLocationEnabled()) {
                    return false;
                }
                return true;
            } else if (!C20943i.m49051d(19)) {
                return !C20964s0.m49090h(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
            } else {
                if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                    return true;
                }
                return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
