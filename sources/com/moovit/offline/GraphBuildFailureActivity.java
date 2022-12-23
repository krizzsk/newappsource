package com.moovit.offline;

import android.app.ActivityManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.design.view.AlertMessageView;
import f30.C4674a;
import f30.C4676c;
import f30.C4678e;
import f30.C4679f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p543hq.C17474b;
import p597jy.C17979a;
import p824tp.C19740r;
import p824tp.C19742t;
import p977zz.C20943i;

public final class GraphBuildFailureActivity extends MoovitActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f15143U = 0;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C19742t.graph_build_failure_activity);
        getIntent().getIntExtra("errorCode", 1000);
        AlertMessageView alertMessageView = (AlertMessageView) findViewById(C19740r.failure_view);
        alertMessageView.setSubtitle(0);
        alertMessageView.setNegativeButtonClickListener(new C17979a(this, 5));
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        long j;
        List<Sensor> list;
        int intExtra = getIntent().getIntExtra("errorCode", -1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C4679f fVar = new C4679f();
        Runtime runtime = Runtime.getRuntime();
        runtime.maxMemory();
        runtime.totalMemory();
        runtime.freeMemory();
        int availableProcessors = runtime.availableProcessors();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        if (C20943i.m49051d(16)) {
            j = memoryInfo.totalMem;
        } else {
            j = -1;
        }
        long j2 = memoryInfo.availMem;
        C4676c a = C4676c.m11987a();
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        statFs.getTotalBytes();
        statFs.getFreeBytes();
        statFs.getAvailableBytes();
        arrayList.add(new C4678e(this, 0));
        arrayList.add(new C4678e(this, 1));
        LocationManager locationManager = (LocationManager) getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        if (locationManager != null) {
            Collections.unmodifiableList(locationManager.getAllProviders());
        } else {
            Collections.emptyList();
        }
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        if (sensorManager != null) {
            list = sensorManager.getSensorList(-1);
        } else {
            list = Collections.emptyList();
        }
        for (Sensor type : list) {
            arrayList2.add(Integer.valueOf(type.getType()));
        }
        getResources().getDisplayMetrics();
        new C4674a(this);
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        telephonyManager.getNetworkOperatorName();
        telephonyManager.getDataState();
        getResources().getConfiguration();
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49935c(AnalyticsAttributeKey.REASON, intExtra);
        m1.mo49935c(AnalyticsAttributeKey.NUM_OF_CORES, availableProcessors);
        m1.mo49939g(AnalyticsAttributeKey.SUPPORTED_ABIS, TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, fVar.f15944g));
        m1.mo49936d(AnalyticsAttributeKey.TOTAL_MEMORY, j);
        m1.mo49936d(AnalyticsAttributeKey.AVAILABLE_MEMORY, j2);
        m1.mo49936d(AnalyticsAttributeKey.TOTAL_INTERNAL_STORAGE, a.f15924b);
        m1.mo49936d(AnalyticsAttributeKey.AVAILABLE_INTERNAL_STORAGE, a.f15926d);
        return m1;
    }
}
