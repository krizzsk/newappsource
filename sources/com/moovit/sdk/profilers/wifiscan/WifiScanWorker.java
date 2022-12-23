package com.moovit.sdk.profilers.wifiscan;

import android.content.Context;
import android.location.Location;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import androidx.work.C1388b;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import c00.C13720d;
import c00.C13722f;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.facebook.appevents.C2342l;
import com.google.android.gms.tasks.Tasks;
import com.moovit.sdk.datacollection.sensors.WifiSensorValue;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.ProfilerType;
import g70.C4844b;
import j70.C17714b;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p583jk.C17884p;
import p977zz.C20934d0;
import p977zz.C20943i;
import p977zz.C20964s0;

public class WifiScanWorker extends Worker {
    public WifiScanWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final ListenableWorker.C1379a doWork() {
        Location location;
        List list;
        C1388b inputData = getInputData();
        ProfilerLog.m41879c(getApplicationContext()).mo49244b("WifiScanWorker", "Starting scanning wifis");
        try {
            location = (Location) Tasks.await(C4844b.m12164a(getApplicationContext()));
        } catch (InterruptedException | ExecutionException e) {
            e.getMessage();
            location = null;
        }
        if (location == null || C20943i.m49052e(location)) {
            location = null;
        }
        Context applicationContext = getApplicationContext();
        if (!C20934d0.m49031b(applicationContext)) {
            list = Collections.emptyList();
        } else {
            WifiManager wifiManager = (WifiManager) applicationContext.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                ProfilerLog.m41879c(applicationContext).mo49244b("WifiScanWorker", "WifiManager is NULL");
                list = null;
            } else {
                list = C13720d.m34273c(wifiManager.getScanResults(), (C13722f) null, new C2342l(21));
            }
            if (list == null) {
                list = Collections.emptyList();
            }
        }
        ProfilerLog c = ProfilerLog.m41879c(getApplicationContext());
        StringBuilder k = C13555b.m33972k("Scanning wifis was done with result size ");
        k.append(list.size());
        c.mo49244b("WifiScanWorker", k.toString());
        WifiSensorValue wifiSensorValue = new WifiSensorValue(list, true, location);
        String join = TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, C13720d.m34273c(wifiSensorValue.f42990b, (C13722f) null, new C17714b(wifiSensorValue)));
        String b = inputData.mo5691b("folder_name");
        String b2 = inputData.mo5691b("file_name");
        if (C20964s0.m49090h(join)) {
            C17884p.m44357a0(getApplicationContext(), b, b2, Long.toString(System.currentTimeMillis()) + ',' + Integer.toString(ProfilerType.WIFI_SCANS.getSensorType()));
        } else {
            Context applicationContext2 = getApplicationContext();
            ProfilerType profilerType = ProfilerType.WIFI_SCANS;
            Object[] objArr = {join};
            String str = Long.toString(System.currentTimeMillis()) + ',' + Integer.toString(profilerType.getSensorType()) + ',' + C20964s0.m49102t(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, objArr);
            ProfilerLog c2 = ProfilerLog.m41879c(applicationContext2);
            StringBuilder k2 = C13555b.m33972k("CSV DATA ");
            k2.append(profilerType.name());
            c2.mo49244b(k2.toString(), str);
            C17884p.m44357a0(applicationContext2, b, b2, str);
        }
        return new ListenableWorker.C1379a.C1382c();
    }
}
