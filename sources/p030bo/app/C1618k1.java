package p030bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.PermissionUtils;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.BrazeGeofence;
import com.google.android.gms.location.LocationServices;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: bo.app.k1 */
public class C1618k1 implements C1700u1 {

    /* renamed from: n */
    public static final String f5770n = AppboyLogger.getBrazeLogTag(C1618k1.class);

    /* renamed from: a */
    public final Context f5771a;

    /* renamed from: b */
    public final BrazeConfigurationProvider f5772b;

    /* renamed from: c */
    public final C1558d4 f5773c;

    /* renamed from: d */
    public final C1707v1 f5774d;

    /* renamed from: e */
    public final Object f5775e = new Object();

    /* renamed from: f */
    public final SharedPreferences f5776f;

    /* renamed from: g */
    public final List<BrazeGeofence> f5777g;

    /* renamed from: h */
    public final PendingIntent f5778h;

    /* renamed from: i */
    public final PendingIntent f5779i;

    /* renamed from: j */
    public C1626l1 f5780j;

    /* renamed from: k */
    public C1602i2 f5781k;

    /* renamed from: l */
    public boolean f5782l;

    /* renamed from: m */
    public int f5783m;

    public C1618k1(Context context, String str, C1707v1 v1Var, BrazeConfigurationProvider brazeConfigurationProvider, C1558d4 d4Var, C1600i0 i0Var) {
        boolean z = false;
        this.f5782l = false;
        this.f5771a = context.getApplicationContext();
        this.f5774d = v1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences(m4356b(str), 0);
        this.f5776f = sharedPreferences;
        this.f5772b = brazeConfigurationProvider;
        this.f5773c = d4Var;
        if (C1629l4.m4453a(d4Var) && mo6178a(context)) {
            z = true;
        }
        this.f5782l = z;
        this.f5783m = C1629l4.m4454b(d4Var);
        this.f5777g = C1629l4.m4452a(sharedPreferences);
        this.f5778h = C1629l4.m4455b(context);
        this.f5779i = C1629l4.m4451a(context);
        this.f5780j = new C1626l1(context, str, d4Var, i0Var);
        mo6184c(true);
    }

    /* renamed from: b */
    public static String m4356b(String str) {
        return C25541a.m63881k("com.appboy.managers.geofences.storage.", str);
    }

    /* renamed from: a */
    public void mo6171a() {
        String str = f5770n;
        AppboyLogger.m5448d(str, "Request to set up geofences received.");
        this.f5782l = C1629l4.m4453a(this.f5773c) && mo6178a(this.f5771a);
        if (this.f5772b.getIsAutomaticGeofenceRequestsEnabled()) {
            mo6183b(true);
        } else {
            AppboyLogger.m5448d(str, "Not automatically requesting Geofences on initialization due to configuration.");
        }
    }

    /* renamed from: c */
    public void mo6184c(boolean z) {
        if (!this.f5782l) {
            AppboyLogger.m5448d(f5770n, "Braze geofences not enabled. Geofences not set up.");
        } else if (z) {
            synchronized (this.f5775e) {
                mo6176a(this.f5777g, this.f5778h);
            }
        }
    }

    /* renamed from: a */
    public boolean mo6178a(Context context) {
        if (!m4355a(this.f5772b)) {
            AppboyLogger.m5448d(f5770n, "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.");
            return false;
        } else if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            AppboyLogger.m5453i(f5770n, "Fine grained location permissions not found. Geofences not enabled.");
            return false;
        } else if (Build.VERSION.SDK_INT >= 29 && !PermissionUtils.hasPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            AppboyLogger.m5453i(f5770n, "Background location access permission not found. Geofences not enabled.");
            return false;
        } else if (!C1645n4.m4526a(context)) {
            AppboyLogger.m5448d(f5770n, "Google Play Services not available. Geofences not enabled.");
            return false;
        } else {
            try {
                if (Class.forName("com.google.android.gms.location.LocationServices", false, C1618k1.class.getClassLoader()) != null) {
                    AppboyLogger.m5448d(f5770n, "Location permissions granted and Google Play Services available. Braze Geofencing enabled via config.");
                    return true;
                }
                throw new RuntimeException("com.google.android.gms.location.LocationServices not found.");
            } catch (Exception unused) {
                AppboyLogger.m5448d(f5770n, "Google Play Services Location API not found. Geofences not enabled.");
                return false;
            }
        }
    }

    /* renamed from: b */
    public void mo6181b(PendingIntent pendingIntent) {
        String str = f5770n;
        AppboyLogger.m5448d(str, "Tearing down geofences.");
        if (pendingIntent != null) {
            AppboyLogger.m5448d(str, "Unregistering any Braze geofences from Google Play Services.");
            LocationServices.getGeofencingClient(this.f5771a).removeGeofences(pendingIntent);
        }
        synchronized (this.f5775e) {
            AppboyLogger.m5448d(str, "Deleting locally stored geofences.");
            SharedPreferences.Editor edit = this.f5776f.edit();
            edit.clear();
            this.f5777g.clear();
            edit.apply();
        }
    }

    /* renamed from: b */
    public void mo6182b(String str, C1546c0 c0Var) {
        if (!this.f5782l) {
            AppboyLogger.m5459w(f5770n, "Braze geofences not enabled. Not posting geofence report.");
            return;
        }
        try {
            C1687s2 c = C1687s2.m4707c(str, c0Var.toString().toLowerCase(Locale.US));
            if (mo6179a(str, c0Var)) {
                this.f5774d.mo6243b((C1594h2) c);
            }
            if (this.f5780j.mo6208a(DateTimeUtils.nowInSeconds(), mo6170a(str), c0Var)) {
                this.f5774d.mo6230a((C1594h2) c);
            }
        } catch (Exception e) {
            AppboyLogger.m5460w(f5770n, "Failed to record geofence transition.", e);
        }
    }

    /* renamed from: a */
    public boolean mo6179a(String str, C1546c0 c0Var) {
        synchronized (this.f5775e) {
            BrazeGeofence a = mo6170a(str);
            if (a != null) {
                if (c0Var.equals(C1546c0.ENTER)) {
                    boolean analyticsEnabledEnter = a.getAnalyticsEnabledEnter();
                    return analyticsEnabledEnter;
                } else if (c0Var.equals(C1546c0.EXIT)) {
                    boolean analyticsEnabledExit = a.getAnalyticsEnabledExit();
                    return analyticsEnabledExit;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public void mo6183b(boolean z) {
        if (!this.f5782l) {
            AppboyLogger.m5448d(f5770n, "Braze geofences not enabled. Not requesting geofences.");
        } else if (this.f5780j.mo6209a(z, DateTimeUtils.nowInSeconds())) {
            mo6172a(this.f5779i);
        }
    }

    /* renamed from: a */
    public BrazeGeofence mo6170a(String str) {
        synchronized (this.f5775e) {
            for (BrazeGeofence next : this.f5777g) {
                if (next.getId().equals(str)) {
                    return next;
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public void mo6180b() {
        if (!this.f5782l) {
            AppboyLogger.m5448d(f5770n, "Braze geofences not enabled. Not un-registering geofences.");
            return;
        }
        AppboyLogger.m5448d(f5770n, "Tearing down all geofences.");
        mo6181b(this.f5778h);
    }

    /* renamed from: a */
    public void mo6174a(C1602i2 i2Var) {
        if (!this.f5782l) {
            AppboyLogger.m5448d(f5770n, "Braze geofences not enabled. Not requesting geofences.");
        } else if (i2Var != null) {
            this.f5781k = i2Var;
            this.f5774d.mo6231a(i2Var);
        }
    }

    /* renamed from: a */
    public void mo6173a(C1525a3 a3Var) {
        if (a3Var == null) {
            AppboyLogger.m5459w(f5770n, "Could not configure geofence manager from server config. Server config was null.");
            return;
        }
        boolean e = a3Var.mo5886e();
        String str = f5770n;
        AppboyLogger.m5448d(str, "Geofences enabled server config value " + e + " received.");
        boolean z = e && mo6178a(this.f5771a);
        if (z != this.f5782l) {
            this.f5782l = z;
            StringBuilder k = C13555b.m33972k("Geofences enabled status newly set to ");
            k.append(this.f5782l);
            k.append(" during server config update.");
            AppboyLogger.m5453i(str, k.toString());
            if (this.f5782l) {
                mo6184c(false);
                if (this.f5772b.getIsAutomaticGeofenceRequestsEnabled()) {
                    mo6183b(true);
                }
            } else {
                mo6181b(this.f5778h);
            }
        } else {
            StringBuilder k2 = C13555b.m33972k("Geofences enabled status ");
            k2.append(this.f5782l);
            k2.append(" unchanged during server config update.");
            AppboyLogger.m5448d(str, k2.toString());
        }
        int g = a3Var.mo5888g();
        if (g >= 0) {
            this.f5783m = g;
            StringBuilder k3 = C13555b.m33972k("Max number to register newly set to ");
            k3.append(this.f5783m);
            k3.append(" via server config.");
            AppboyLogger.m5453i(str, k3.toString());
        }
        this.f5780j.mo6206a(a3Var);
    }

    /* renamed from: a */
    public void mo6175a(List<BrazeGeofence> list) {
        if (list == null) {
            AppboyLogger.m5459w(f5770n, "Braze geofence list was null. Not adding new geofences to local storage.");
        } else if (!this.f5782l) {
            AppboyLogger.m5459w(f5770n, "Braze geofences not enabled. Not adding new geofences to local storage.");
        } else {
            if (this.f5781k != null) {
                for (BrazeGeofence next : list) {
                    next.setDistanceFromGeofenceRefresh(C1675q4.m4657a(this.f5781k.getLatitude(), this.f5781k.getLongitude(), next.getLatitude(), next.getLongitude()));
                }
                Collections.sort(list);
            }
            synchronized (this.f5775e) {
                String str = f5770n;
                AppboyLogger.m5448d(str, "Received new geofence list of size: " + list.size());
                SharedPreferences.Editor edit = this.f5776f.edit();
                edit.clear();
                this.f5777g.clear();
                int i = 0;
                Iterator<BrazeGeofence> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BrazeGeofence next2 = it.next();
                    if (i == this.f5783m) {
                        String str2 = f5770n;
                        AppboyLogger.m5448d(str2, "Reached maximum number of new geofences: " + this.f5783m);
                        break;
                    }
                    this.f5777g.add(next2);
                    String str3 = f5770n;
                    AppboyLogger.m5448d(str3, "Adding new geofence to local storage: " + next2.toString());
                    edit.putString(next2.getId(), next2.forJsonPut().toString());
                    i++;
                }
                edit.apply();
                String str4 = f5770n;
                AppboyLogger.m5448d(str4, "Added " + this.f5777g.size() + " new geofences to local storage.");
            }
            this.f5780j.mo6207a(list);
            mo6184c(true);
        }
    }

    /* renamed from: a */
    public void mo6177a(boolean z) {
        if (z) {
            AppboyLogger.m5448d(f5770n, "Single location request was successful, storing last updated time.");
            this.f5780j.mo6205a(DateTimeUtils.nowInSeconds());
            return;
        }
        AppboyLogger.m5448d(f5770n, "Single location request was unsuccessful, not storing last updated time.");
    }

    /* renamed from: a */
    public void mo6172a(PendingIntent pendingIntent) {
        C1637m4.m4481a(this.f5771a, pendingIntent, (C1700u1) this);
    }

    /* renamed from: a */
    public void mo6176a(List<BrazeGeofence> list, PendingIntent pendingIntent) {
        C1637m4.m4490b(this.f5771a, list, pendingIntent);
    }

    /* renamed from: a */
    public static boolean m4355a(BrazeConfigurationProvider brazeConfigurationProvider) {
        return brazeConfigurationProvider.getIsGeofencesEnabled();
    }
}
