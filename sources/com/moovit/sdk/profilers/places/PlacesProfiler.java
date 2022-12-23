package com.moovit.sdk.profilers.places;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Tasks;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.ProfilerType;
import com.moovit.sdk.profilers.places.config.PlacesConfig;
import com.moovit.sdk.utils.SafeBroadcastReceiver;
import e70.C4589b;
import g70.C4843a;
import g70.C4844b;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import n70.C18535a;
import p688nu.C18632d;
import p977zz.C20927a0;
import p977zz.C20934d0;
import p977zz.C20943i;
import p977zz.C20964s0;

public final class PlacesProfiler extends C18535a<PlacesConfig> {

    /* renamed from: n */
    public static final String f43035n;

    /* renamed from: o */
    public static final String f43036o;

    /* renamed from: p */
    public static volatile PlacesProfiler f43037p;

    public static class LocationReceiver extends SafeBroadcastReceiver {
        /* renamed from: a */
        public final void mo23871a(Context context, Intent intent) {
            String str;
            String str2;
            String str3;
            String str4;
            if (intent == null) {
                ProfilerLog.m41879c(context).mo49244b("PlacesProfiler", "intent == null");
                return;
            }
            if (LocationAvailability.hasLocationAvailability(intent)) {
                ProfilerLog.m41879c(context).mo49244b("PlacesProfiler", LocationAvailability.extractLocationAvailability(intent).toString());
            }
            if (LocationResult.hasResult(intent)) {
                LocationResult extractResult = LocationResult.extractResult(intent);
                ProfilerLog.m41879c(context).mo49244b("PlacesProfiler", extractResult.toString());
                PlacesProfiler v = PlacesProfiler.m41917v(context);
                ProfilerLog.m41879c(v.f47186a).mo49244b("PlacesProfiler", "New Location Received - Updating file");
                List<Location> locations = extractResult.getLocations();
                if (locations.isEmpty()) {
                    v.mo50942l("Received empty location result");
                    return;
                }
                try {
                    PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(v.mo50939e(), "locations.dat"), true)));
                    long currentTimeMillis = System.currentTimeMillis();
                    extractResult.getLocations().size();
                    v.mo50942l("Received " + extractResult.getLocations().size() + " locations");
                    for (Location next : locations) {
                        if (next != null) {
                            if (!C20943i.m49052e(next)) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(Long.toString(currentTimeMillis));
                                arrayList.add(Integer.toString(v.f47188c.getSensorType()));
                                arrayList.add(Long.toString(next.getTime()));
                                Object[] objArr = {Double.valueOf(next.getLatitude())};
                                String str5 = C20964s0.f52718a;
                                arrayList.add(String.format((Locale) null, "%.6f", objArr));
                                arrayList.add(String.format((Locale) null, "%.6f", new Object[]{Double.valueOf(next.getLongitude())}));
                                if (next.hasAccuracy()) {
                                    str = Integer.toString((int) next.getAccuracy());
                                } else {
                                    str = "";
                                }
                                arrayList.add(str);
                                if (next.hasSpeed()) {
                                    str2 = String.format((Locale) null, "%.1f", new Object[]{Float.valueOf(next.getSpeed())});
                                } else {
                                    str2 = "";
                                }
                                arrayList.add(str2);
                                if (next.hasBearing()) {
                                    str3 = String.format((Locale) null, "%.2f", new Object[]{Float.valueOf(next.getBearing())});
                                } else {
                                    str3 = "";
                                }
                                arrayList.add(str3);
                                if (next.hasAltitude()) {
                                    str4 = String.format((Locale) null, "%.1f", new Object[]{Double.valueOf(next.getAltitude())});
                                } else {
                                    str4 = "";
                                }
                                arrayList.add(str4);
                                arrayList.add("");
                                arrayList.add(C20964s0.m49088f(next.getProvider()));
                                arrayList.add("");
                                printWriter.println(TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, arrayList));
                                ProfilerLog.m41879c(v.f47186a).mo49244b("DATA PlacesProfiler", TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, arrayList));
                            }
                        }
                    }
                    printWriter.close();
                    v.mo50943n();
                } catch (IOException unused) {
                    v.mo50942l("Error writing locations");
                }
            }
        }
    }

    public static class StartStopReceiver extends SafeBroadcastReceiver {
        /* renamed from: a */
        public final void mo23871a(Context context, Intent intent) {
            PlacesProfiler v = PlacesProfiler.m41917v(context);
            String action = intent.getAction();
            if (PlacesProfiler.f43035n.equals(action)) {
                v.mo50945q(intent, true);
            } else if (PlacesProfiler.f43036o.equals(action)) {
                v.mo50945q(intent, false);
            } else {
                throw new IllegalArgumentException(C25541a.m63881k("Unrecognized action: ", action));
            }
        }
    }

    static {
        Class<PlacesProfiler> cls = PlacesProfiler.class;
        f43035n = C13555b.m33969h(cls, new StringBuilder(), ".start");
        f43036o = C13555b.m33969h(cls, new StringBuilder(), ".stop");
    }

    public PlacesProfiler(Context context) {
        super(context, "places", ProfilerType.LOCATION, PlacesConfig.f43039k, PlacesConfig.f43038j);
    }

    /* renamed from: v */
    public static PlacesProfiler m41917v(Context context) {
        if (f43037p == null) {
            synchronized (PlacesProfiler.class) {
                if (f43037p == null) {
                    f43037p = new PlacesProfiler(context.getApplicationContext());
                }
            }
        }
        return f43037p;
    }

    /* renamed from: a */
    public final int mo49250a() {
        return 2;
    }

    /* renamed from: d */
    public final String mo49251d() {
        return "places_profiler_config_file_name";
    }

    /* renamed from: f */
    public final String mo49252f() {
        return "locations.dat";
    }

    /* renamed from: h */
    public final String mo49253h() {
        return mo50937b() != null ? ((PlacesConfig) mo50937b()).toString() : "place profiler config is null";
    }

    /* renamed from: i */
    public final Intent mo49254i() {
        return new Intent(f43036o, (Uri) null, this.f47186a, StartStopReceiver.class);
    }

    /* renamed from: m */
    public final void mo49255m(int i) {
        String str;
        int i2;
        super.mo49255m(i);
        PendingIntent w = mo49269w(C20927a0.m49010e(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING));
        ProfilerLog c = ProfilerLog.m41879c(this.f47186a);
        StringBuilder k = C13555b.m33972k("Location Intent is: ");
        if (w == null) {
            str = "Null";
        } else {
            str = "Not null";
        }
        k.append(str);
        c.mo49244b("PlacesProfiler", k.toString());
        int i3 = 134217728;
        if (C20943i.m49051d(31)) {
            i3 = 167772160;
        }
        if (i == 3 || i == 4) {
            Context context = this.f47186a;
            LocationServices.getFusedLocationProviderClient(context).flushLocations().addOnCompleteListener(AsyncTask.SERIAL_EXECUTOR, new C4843a(context, 0));
            C4844b.m12165b(this.f47186a, mo49269w(i3));
        }
        Context context2 = this.f47186a;
        LocationRequest create = LocationRequest.create();
        PlacesConfig placesConfig = (PlacesConfig) mo50937b();
        placesConfig.getClass();
        int i4 = PlacesConfig.C16462d.f43045a[placesConfig.f43040e.ordinal()];
        if (i4 == 1) {
            i2 = 100;
        } else if (i4 == 3) {
            i2 = 104;
        } else if (i4 != 4) {
            i2 = 102;
        } else {
            i2 = 105;
        }
        LocationRequest maxWaitTime = create.setPriority(i2).setInterval((long) ((PlacesConfig) mo50937b()).f43041f).setFastestInterval((long) ((PlacesConfig) mo50937b()).f43042g).setSmallestDisplacement((float) ((PlacesConfig) mo50937b()).f43043h).setMaxWaitTime((long) ((PlacesConfig) mo50937b()).f43044i);
        PendingIntent w2 = mo49269w(i3);
        if (C20934d0.m49032c(context2)) {
            LocationServices.getFusedLocationProviderClient(context2).requestLocationUpdates(maxWaitTime, w2).addOnCompleteListener(AsyncTask.SERIAL_EXECUTOR, new C18632d(context2, 3));
        } else {
            Tasks.forException(new SecurityException("Missing location permissions."));
        }
    }

    /* renamed from: p */
    public final void mo49256p(int i) {
        super.mo49256p(i);
        if (i == 0) {
            int i2 = 134217728;
            if (C20943i.m49051d(31)) {
                i2 = 167772160;
            }
            C4844b.m12165b(this.f47186a, mo49269w(i2));
            mo50938c().delete();
        }
    }

    /* renamed from: r */
    public final boolean mo49257r(Intent intent) {
        return mo50946s(intent, "places_profiler_config_extra");
    }

    /* renamed from: w */
    public final PendingIntent mo49269w(int i) {
        return PendingIntent.getBroadcast(this.f47186a, C4589b.places_profiler_locations_request_id, new Intent(this.f47186a, LocationReceiver.class), i);
    }
}
