package p030bo.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.CancellationSignal;
import com.appboy.Constants;
import com.appboy.enums.LocationProviderName;
import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.IntentUtils;
import com.appboy.support.PermissionUtils;
import com.appsflyer.ServerParameters;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.receivers.BrazeActionReceiver;
import java.util.EnumSet;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p244s3.C6439n;
import p988j$.util.function.Consumer;

@SuppressLint({"MissingPermission"})
/* renamed from: bo.app.m1 */
public class C1634m1 implements C1735y1 {

    /* renamed from: g */
    public static final String f5826g = AppboyLogger.getBrazeLogTag(C1634m1.class);

    /* renamed from: h */
    public static final long f5827h = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: a */
    public final Context f5828a;

    /* renamed from: b */
    public final LocationManager f5829b;

    /* renamed from: c */
    public final C1707v1 f5830c;

    /* renamed from: d */
    public final boolean f5831d;

    /* renamed from: e */
    public final EnumSet<LocationProviderName> f5832e;

    /* renamed from: f */
    public final ThreadPoolExecutor f5833f;

    public C1634m1(Context context, C1707v1 v1Var, BrazeConfigurationProvider brazeConfigurationProvider, ThreadPoolExecutor threadPoolExecutor) {
        this.f5828a = context;
        this.f5830c = v1Var;
        this.f5833f = threadPoolExecutor;
        this.f5829b = (LocationManager) context.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f5831d = m4473a(brazeConfigurationProvider);
        if (brazeConfigurationProvider.getCustomLocationProviderNames().isEmpty()) {
            this.f5832e = EnumSet.of(LocationProviderName.PASSIVE, LocationProviderName.NETWORK);
        } else {
            this.f5832e = brazeConfigurationProvider.getCustomLocationProviderNames();
        }
        String str = f5826g;
        StringBuilder k = C13555b.m33972k("Using location providers: ");
        k.append(this.f5832e);
        AppboyLogger.m5457v(str, k.toString());
    }

    /* renamed from: a */
    public boolean mo6221a(C1602i2 i2Var) {
        try {
            this.f5830c.mo6243b((C1594h2) C1687s2.m4690a(i2Var));
            return true;
        } catch (Exception e) {
            AppboyLogger.m5460w(f5826g, "Failed to log location recorded event.", e);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public boolean mo6220a() {
        Location a;
        if (!this.f5831d) {
            AppboyLogger.m5453i(f5826g, "Did not request single location update. Location collection is disabled.");
            return false;
        }
        boolean hasPermission = PermissionUtils.hasPermission(this.f5828a, "android.permission.ACCESS_FINE_LOCATION");
        boolean hasPermission2 = PermissionUtils.hasPermission(this.f5828a, "android.permission.ACCESS_COARSE_LOCATION");
        if (!hasPermission2 && !hasPermission) {
            AppboyLogger.m5453i(f5826g, "Did not request single location update. Neither fine nor coarse location permissions found.");
            return false;
        } else if (!hasPermission || (a = m4469a(this.f5829b)) == null) {
            String a2 = m4470a(this.f5829b, this.f5832e, hasPermission, hasPermission2);
            if (a2 == null) {
                AppboyLogger.m5448d(f5826g, "Could not request single location update. Could not find suitable location provider.");
                return false;
            }
            String str = f5826g;
            AppboyLogger.m5448d(str, "Requesting single location update with provider: " + a2);
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    this.f5829b.getCurrentLocation(a2, (CancellationSignal) null, this.f5833f, Consumer.Wrapper.convert(new C6439n(this)));
                } else {
                    mo6219a(a2);
                }
                return true;
            } catch (SecurityException e) {
                AppboyLogger.m5460w(f5826g, "Failed to request single location update due to security exception from insufficient permissions.", e);
                return false;
            } catch (Exception e2) {
                AppboyLogger.m5460w(f5826g, "Failed to request single location update due to exception.", e2);
                return false;
            }
        } else {
            String str2 = f5826g;
            AppboyLogger.m5448d(str2, "Setting user location to last known GPS location: " + a);
            mo6221a((C1602i2) new C1643n2(a));
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4471a(Location location) {
        String str = f5826g;
        AppboyLogger.m5448d(str, "Location manager getCurrentLocation got location: " + location);
        if (location != null) {
            mo6221a((C1602i2) new C1643n2(location));
        }
    }

    /* renamed from: a */
    public final void mo6219a(String str) {
        this.f5829b.requestSingleUpdate(str, PendingIntent.getBroadcast(this.f5828a, 0, new Intent(Constants.APPBOY_ACTION_RECEIVER_SINGLE_LOCATION_UPDATE_INTENT_ACTION).setClass(this.f5828a, BrazeActionReceiver.class), IntentUtils.getDefaultPendingIntentFlags() | 134217728));
    }

    /* renamed from: a */
    public static boolean m4473a(BrazeConfigurationProvider brazeConfigurationProvider) {
        if (brazeConfigurationProvider.isLocationCollectionEnabled()) {
            AppboyLogger.m5453i(f5826g, "Location collection enabled via sdk configuration.");
            return true;
        }
        AppboyLogger.m5453i(f5826g, "Location collection disabled via sdk configuration.");
        return false;
    }

    /* renamed from: a */
    public static String m4470a(LocationManager locationManager, EnumSet<LocationProviderName> enumSet, boolean z, boolean z2) {
        if (z && enumSet.contains(LocationProviderName.GPS) && locationManager.isProviderEnabled("gps")) {
            return "gps";
        }
        if ((z2 || z) && enumSet.contains(LocationProviderName.NETWORK) && locationManager.isProviderEnabled(ServerParameters.NETWORK)) {
            return ServerParameters.NETWORK;
        }
        if (!z || !enumSet.contains(LocationProviderName.PASSIVE) || !locationManager.isProviderEnabled("passive")) {
            return null;
        }
        return "passive";
    }

    /* renamed from: a */
    public static Location m4469a(LocationManager locationManager) {
        Location lastKnownLocation;
        if (!locationManager.isProviderEnabled("gps") || (lastKnownLocation = locationManager.getLastKnownLocation("gps")) == null) {
            return null;
        }
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds() - lastKnownLocation.getTime();
        if (nowInMilliseconds > f5827h) {
            String str = f5826g;
            AppboyLogger.m5457v(str, "Last known GPS location is too old and will not be used. Age ms: " + nowInMilliseconds);
            return null;
        }
        String str2 = f5826g;
        AppboyLogger.m5448d(str2, "Using last known GPS location: " + lastKnownLocation);
        return lastKnownLocation;
    }
}
