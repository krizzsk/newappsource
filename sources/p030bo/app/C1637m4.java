package p030bo.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.appboy.support.AppboyLogger;
import com.braze.models.BrazeGeofence;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p244s3.C6440o;
import p244s3.C6441p;
import p244s3.C6442q;
import p244s3.C6443r;
import p244s3.C6444s;
import p244s3.C6445t;

@SuppressLint({"MissingPermission"})
/* renamed from: bo.app.m4 */
public final class C1637m4 {

    /* renamed from: a */
    public static final String f5835a = AppboyLogger.getBrazeLogTag(C1637m4.class);

    /* renamed from: a */
    public static void m4481a(Context context, PendingIntent pendingIntent, C1700u1 u1Var) {
        try {
            AppboyLogger.m5448d(f5835a, "Requesting single location update from Google Play Services.");
            LocationRequest create = LocationRequest.create();
            create.setPriority(100);
            create.setNumUpdates(1);
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            LocationServices.getFusedLocationProviderClient(context).requestLocationUpdates(create, pendingIntent).addOnSuccessListener(new C6444s(u1Var, 0)).addOnFailureListener(new C6445t(u1Var, 0));
        } catch (SecurityException e) {
            AppboyLogger.m5460w(f5835a, "Failed to request location update due to security exception from insufficient permissions.", e);
        } catch (Exception e2) {
            AppboyLogger.m5460w(f5835a, "Failed to request location update due to exception.", e2);
        }
    }

    /* renamed from: b */
    public static void m4490b(Context context, List<BrazeGeofence> list, PendingIntent pendingIntent) {
        try {
            List<BrazeGeofence> a = C1629l4.m4452a(m4488b(context));
            if (list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (BrazeGeofence next : a) {
                    arrayList.add(next.getId());
                    String str = f5835a;
                    AppboyLogger.m5448d(str, "Obsolete geofence will be un-registered: " + next.getId());
                }
                if (!arrayList.isEmpty()) {
                    m4489b(context, arrayList);
                    String str2 = f5835a;
                    AppboyLogger.m5448d(str2, "No new geofences to register. Cleared " + a.size() + " previously registered geofences.");
                    return;
                }
                AppboyLogger.m5448d(f5835a, "No new geofences to register. No geofences are currently registered.");
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            for (BrazeGeofence next2 : list) {
                hashSet.add(next2.getId());
                boolean z = true;
                for (BrazeGeofence next3 : a) {
                    if (next2.getId().equals(next3.getId()) && next2.equivalentServerData(next3)) {
                        z = false;
                    }
                }
                if (z) {
                    String str3 = f5835a;
                    AppboyLogger.m5448d(str3, "New geofence will be registered: " + next2.getId());
                    arrayList2.add(next2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (BrazeGeofence next4 : a) {
                if (!hashSet.contains(next4.getId())) {
                    arrayList3.add(next4.getId());
                    String str4 = f5835a;
                    AppboyLogger.m5448d(str4, "Obsolete geofence will be un-registered: " + next4.getId());
                }
            }
            if (!arrayList3.isEmpty()) {
                String str5 = f5835a;
                AppboyLogger.m5448d(str5, "Un-registering " + arrayList3.size() + " obsolete geofences from Google Play Services.");
                m4489b(context, arrayList3);
            } else {
                AppboyLogger.m5448d(f5835a, "No obsolete geofences need to be unregistered from Google Play Services.");
            }
            if (!arrayList2.isEmpty()) {
                String str6 = f5835a;
                AppboyLogger.m5448d(str6, "Registering " + arrayList2.size() + " new geofences with Google Play Services.");
                m4483a(context, (List<BrazeGeofence>) arrayList2, pendingIntent);
                return;
            }
            AppboyLogger.m5448d(f5835a, "No new geofences need to be registered with Google Play Services.");
        } catch (SecurityException e) {
            AppboyLogger.m5452e(f5835a, "Security exception while adding geofences.", e);
        } catch (Exception e2) {
            AppboyLogger.m5452e(f5835a, "Exception while adding geofences.", e2);
        }
    }

    /* renamed from: c */
    public static void m4493c(Context context, List<BrazeGeofence> list) {
        SharedPreferences.Editor edit = m4488b(context).edit();
        for (BrazeGeofence next : list) {
            edit.putString(next.getId(), next.forJsonPut().toString());
            String str = f5835a;
            StringBuilder k = C13555b.m33972k("Geofence with id: ");
            k.append(next.getId());
            k.append(" added to shared preferences.");
            AppboyLogger.m5457v(str, k.toString());
        }
        edit.apply();
    }

    /* renamed from: a */
    public static /* synthetic */ void m4486a(C1700u1 u1Var, Void voidR) {
        AppboyLogger.m5457v(f5835a, "Single location request from Google Play services was successful.");
        u1Var.mo6177a(true);
    }

    /* renamed from: a */
    public static /* synthetic */ void m4485a(C1700u1 u1Var, Exception exc) {
        AppboyLogger.m5452e(f5835a, "Failed to get single location update from Google Play services.", exc);
        u1Var.mo6177a(false);
    }

    /* renamed from: a */
    public static void m4480a(Context context) {
        AppboyLogger.m5448d(f5835a, "Deleting registered geofence cache.");
        SharedPreferences.Editor edit = m4488b(context).edit();
        edit.clear();
        edit.apply();
    }

    /* renamed from: a */
    public static void m4483a(Context context, List<BrazeGeofence> list, PendingIntent pendingIntent) {
        ArrayList arrayList = new ArrayList();
        for (BrazeGeofence geofence : list) {
            arrayList.add(geofence.toGeofence());
        }
        LocationServices.getGeofencingClient(context).addGeofences(new GeofencingRequest.Builder().addGeofences(arrayList).setInitialTrigger(0).build(), pendingIntent).addOnSuccessListener(new C6442q(0, context, list)).addOnFailureListener(new C6443r(0));
    }

    /* renamed from: a */
    public static /* synthetic */ void m4484a(Context context, List list, Void voidR) {
        AppboyLogger.m5448d(f5835a, "Geofences successfully registered with Google Play Services.");
        m4493c(context, list);
    }

    /* renamed from: a */
    public static /* synthetic */ void m4487a(Exception exc) {
        if (exc instanceof ApiException) {
            int statusCode = ((ApiException) exc).getStatusCode();
            if (statusCode != 0) {
                switch (statusCode) {
                    case 1000:
                        String str = f5835a;
                        AppboyLogger.m5459w(str, "Geofences not registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: " + statusCode);
                        return;
                    case 1001:
                        String str2 = f5835a;
                        AppboyLogger.m5459w(str2, "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: " + statusCode);
                        return;
                    case 1002:
                        String str3 = f5835a;
                        AppboyLogger.m5459w(str3, "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: " + statusCode);
                        return;
                    default:
                        String str4 = f5835a;
                        AppboyLogger.m5459w(str4, "Geofence pending result returned unknown status code: " + statusCode);
                        return;
                }
            } else {
                AppboyLogger.m5448d(f5835a, "Received Geofence registration success code in failure block with Google Play Services.");
            }
        } else {
            AppboyLogger.m5452e(f5835a, "Geofence exception encountered while adding geofences.", exc);
        }
    }

    /* renamed from: b */
    public static void m4489b(Context context, List<String> list) {
        LocationServices.getGeofencingClient(context).removeGeofences(list).addOnSuccessListener(new C6440o(context, list)).addOnFailureListener(new C6441p(0));
    }

    /* renamed from: b */
    public static /* synthetic */ void m4491b(Context context, List list, Void voidR) {
        AppboyLogger.m5448d(f5835a, "Geofences successfully un-registered with Google Play Services.");
        m4482a(context, (List<String>) list);
    }

    /* renamed from: b */
    public static /* synthetic */ void m4492b(Exception exc) {
        if (exc instanceof ApiException) {
            int statusCode = ((ApiException) exc).getStatusCode();
            if (statusCode != 0) {
                switch (statusCode) {
                    case 1000:
                        String str = f5835a;
                        AppboyLogger.m5459w(str, "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: " + statusCode);
                        return;
                    case 1001:
                        String str2 = f5835a;
                        AppboyLogger.m5459w(str2, "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: " + statusCode);
                        return;
                    case 1002:
                        String str3 = f5835a;
                        AppboyLogger.m5459w(str3, "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: " + statusCode);
                        return;
                    default:
                        String str4 = f5835a;
                        AppboyLogger.m5459w(str4, "Geofence pending result returned unknown status code: " + statusCode);
                        return;
                }
            } else {
                AppboyLogger.m5448d(f5835a, "Received Geofence un-registration success code in failure block with Google Play Services.");
            }
        } else {
            AppboyLogger.m5452e(f5835a, "Geofence exception encountered while removing geofences.", exc);
        }
    }

    /* renamed from: a */
    public static void m4482a(Context context, List<String> list) {
        SharedPreferences.Editor edit = m4488b(context).edit();
        for (String next : list) {
            edit.remove(next);
            String str = f5835a;
            AppboyLogger.m5457v(str, "Geofence with id: " + next + " removed from shared preferences.");
        }
        edit.apply();
    }

    /* renamed from: b */
    public static SharedPreferences m4488b(Context context) {
        return context.getSharedPreferences("com.appboy.support.geofences", 0);
    }
}
