package com.moovit.sdk.datacollection.visibility;

import android.content.Intent;
import android.location.LocationManager;
import android.provider.Settings;
import androidx.core.app.JobIntentService;
import com.appboy.models.outgoing.FacebookUser;
import com.appsflyer.ServerParameters;
import com.moovit.sdk.profilers.ProfilerLog;
import k70.C18014a;
import p389bl.C13641g;
import p977zz.C20934d0;
import p977zz.C20943i;
import p977zz.C20975x0;
import y70.C13256a;

public class LocationStatusInfoChecker extends JobIntentService {

    /* renamed from: i */
    public static final String f42998i = C13555b.m33969h(LocationStatusInfoChecker.class, new StringBuilder(), ".ACTION_FORCE_SEND");

    /* renamed from: j */
    public static final String f42999j = C13555b.m33969h(LocationStatusInfoChecker.class, new StringBuilder(), ".ACTION_FORCE_SEND_FROM_PERIODIC");

    /* renamed from: d */
    public final void mo3360d(Intent intent) {
        LocationMode locationMode;
        ProfilerLog.m41879c(this).mo49244b("LocationStatusInfoChecker", "onHandleWork");
        boolean b = C20934d0.m49031b(this);
        boolean a = C20934d0.m49030a(this);
        if (C20943i.m49051d(19)) {
            try {
                int i = Settings.Secure.getInt(getContentResolver(), "location_mode");
                if (i == 0) {
                    locationMode = LocationMode.LOCATION_MODE_OFF;
                } else if (i == 1) {
                    locationMode = LocationMode.LOCATION_MODE_SENSORS_ONLY;
                } else if (i == 2) {
                    locationMode = LocationMode.LOCATION_MODE_BATTERY_SAVING;
                } else if (i != 3) {
                    locationMode = LocationMode.LOCATION_MODE_UNKNOWN;
                } else {
                    locationMode = LocationMode.LOCATION_MODE_HIGH_ACCURACY;
                }
            } catch (Settings.SettingNotFoundException e) {
                e.printStackTrace();
                locationMode = LocationMode.LOCATION_MODE_UNKNOWN;
            }
        } else {
            LocationManager locationManager = (LocationManager) getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            if (locationManager == null) {
                locationMode = LocationMode.LOCATION_MODE_UNKNOWN;
            } else if (locationManager.isProviderEnabled("gps")) {
                locationMode = LocationMode.LOCATION_MODE_HIGH_ACCURACY;
            } else if (locationManager.isProviderEnabled(ServerParameters.NETWORK)) {
                locationMode = LocationMode.LOCATION_MODE_KITKAT_NETWORK_ONLY;
            } else {
                locationMode = LocationMode.LOCATION_MODE_UNKNOWN;
            }
        }
        LocationStatusInfo locationStatusInfo = new LocationStatusInfo(locationMode, b, a);
        LocationStatusInfo locationStatusInfo2 = (LocationStatusInfo) C13641g.m34133v(this, "location_status_info_file_name", LocationStatusInfo.f42994f);
        boolean e2 = C20975x0.m49118e(intent.getAction(), f42999j);
        if (locationStatusInfo2 == null || !locationStatusInfo.equals(locationStatusInfo2) || C20975x0.m49118e(intent.getAction(), f42998i) || e2) {
            boolean z = !e2;
            ProfilerLog c = ProfilerLog.m41879c(this);
            StringBuilder k = C13555b.m33972k("sendAndSaveLocationStatus: locationMode = ");
            k.append(locationStatusInfo.f42995b);
            k.append(", accessFineLocation = ");
            k.append(locationStatusInfo.f42996c);
            k.append(", accessCoarseLocation = ");
            k.append(locationStatusInfo.f42997d);
            c.mo49244b("LocationStatusInfoChecker", k.toString());
            C13256a.m33377b(this).mo40132a(new C18014a(locationStatusInfo, System.currentTimeMillis(), z));
            C13641g.m34136y(this, "location_status_info_file_name", locationStatusInfo, LocationStatusInfo.f42993e);
        }
    }
}
