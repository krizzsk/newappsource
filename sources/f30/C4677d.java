package f30;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.TrafficStats;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import androidx.core.app.NotificationManagerCompat;
import c00.C13720d;
import c00.C13722f;
import com.appboy.Constants;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.metrics.MVAppMetrics;
import com.tranzmate.moovit.protocol.metrics.MVBatteryMetrics;
import com.tranzmate.moovit.protocol.metrics.MVDeviceTimeZone;
import com.tranzmate.moovit.protocol.metrics.MVDynamicDeviceMetrics;
import com.tranzmate.moovit.protocol.metrics.MVDynamicMetricsServerMessage;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import p054d0.C4303q;
import p824tp.C19721a;
import p824tp.C19722a0;
import p824tp.C19731i;
import p977zz.C20934d0;
import p977zz.C20943i;
import p977zz.C20978z;
import s00.C19393f;

/* renamed from: f30.d */
public final class C4677d {
    /* renamed from: a */
    public static MVServerMessage m11988a(Context context, C19722a0 a0Var, String str) {
        List<T> list;
        List<Sensor> list2;
        String str2;
        String str3;
        C4675b bVar;
        int i;
        ConnectivityManager connectivityManager;
        Context context2 = context;
        String str4 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C4679f fVar = new C4679f();
        Runtime runtime = Runtime.getRuntime();
        runtime.maxMemory();
        long j = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        runtime.availableProcessors();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        long j2 = memoryInfo.availMem;
        boolean z = memoryInfo.lowMemory;
        C4676c a = C4676c.m11987a();
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        long totalBytes = statFs.getTotalBytes();
        statFs.getFreeBytes();
        long availableBytes = statFs.getAvailableBytes();
        arrayList.add(new C4678e(context2, 0));
        arrayList.add(new C4678e(context2, 1));
        LocationManager locationManager = (LocationManager) context2.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        if (locationManager != null) {
            list = Collections.unmodifiableList(locationManager.getAllProviders());
        } else {
            list = Collections.emptyList();
        }
        SensorManager sensorManager = (SensorManager) context2.getSystemService("sensor");
        List<T> list3 = list;
        if (sensorManager != null) {
            list2 = sensorManager.getSensorList(-1);
        } else {
            list2 = Collections.emptyList();
        }
        for (Sensor type : list2) {
            arrayList2.add(Integer.valueOf(type.getType()));
        }
        context.getResources().getDisplayMetrics();
        C4674a aVar = new C4674a(context2);
        TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        int dataState = telephonyManager.getDataState();
        Configuration configuration = context.getResources().getConfiguration();
        String str5 = networkOperatorName;
        long j3 = totalBytes;
        String str6 = fVar.f15942e;
        int i2 = fVar.f15943f;
        TimeZone timeZone = fVar.f15945h;
        boolean z2 = z;
        long j4 = j2;
        String id = timeZone.getID();
        String displayName = timeZone.getDisplayName();
        long j5 = freeMemory;
        int rawOffset = timeZone.getRawOffset();
        boolean useDaylightTime = timeZone.useDaylightTime();
        MVDeviceTimeZone mVDeviceTimeZone = new MVDeviceTimeZone();
        mVDeviceTimeZone.timeZoneId = id;
        mVDeviceTimeZone.timeZoneName = displayName;
        mVDeviceTimeZone.timeZoneRawOffset = rawOffset;
        mVDeviceTimeZone.mo28439k();
        mVDeviceTimeZone.timeZoneInDaylightTime = useDaylightTime;
        mVDeviceTimeZone.mo28438j();
        long j6 = a.f15924b;
        long j7 = a.f15926d;
        ArrayList c = C13720d.m34273c(arrayList, (C13722f) null, new C4303q(15));
        boolean z3 = aVar.f15912a;
        ArrayList arrayList3 = c;
        int i3 = aVar.f15913b;
        String str7 = "unknown";
        long j8 = j7;
        if (i3 == 0) {
            str2 = "on_battery";
        } else if (i3 == 1) {
            str2 = Constants.APPBOY_PUSH_ACCENT_KEY;
        } else if (i3 == 2) {
            str2 = "usb";
        } else if (i3 != 4) {
            str2 = str7;
        } else {
            str2 = "wireless";
        }
        long j9 = j6;
        int i4 = aVar.f15915d;
        MVBatteryMetrics mVBatteryMetrics = new MVBatteryMetrics();
        mVBatteryMetrics.isCharging = z3;
        mVBatteryMetrics.mo28426u();
        mVBatteryMetrics.chargePlugType = str2;
        mVBatteryMetrics.level = (double) aVar.f15914c;
        mVBatteryMetrics.mo28427v();
        mVBatteryMetrics.voltage = i4;
        mVBatteryMetrics.mo28428w();
        int i5 = aVar.f15916e;
        if (i5 != -1) {
            mVBatteryMetrics.capacity = i5;
            mVBatteryMetrics.mo28420p();
        }
        int i6 = aVar.f15917f;
        if (i6 != -1) {
            mVBatteryMetrics.chargeCounter = i6;
            mVBatteryMetrics.mo28421q();
        }
        int i7 = aVar.f15918g;
        if (i7 != -1) {
            mVBatteryMetrics.currentAverage = i7;
            mVBatteryMetrics.mo28422r();
        }
        int i8 = aVar.f15919h;
        if (i8 != -1) {
            mVBatteryMetrics.currentNow = i8;
            mVBatteryMetrics.mo28423s();
        }
        int i9 = aVar.f15920i;
        if (i9 != -1) {
            mVBatteryMetrics.energyCounter = i9;
            mVBatteryMetrics.mo28424t();
        }
        if (dataState == 0) {
            str3 = "disconnected";
        } else if (dataState == 1) {
            str3 = "connecting";
        } else if (dataState == 2) {
            str3 = "connected";
        } else if (dataState != 3) {
            str3 = str7;
        } else {
            str3 = "suspended";
        }
        double d = (double) configuration.fontScale;
        MVDynamicDeviceMetrics mVDynamicDeviceMetrics = new MVDynamicDeviceMetrics();
        mVDynamicDeviceMetrics.androidVersion = str6;
        mVDynamicDeviceMetrics.androidApi = i2;
        mVDynamicDeviceMetrics.mo28460A();
        mVDynamicDeviceMetrics.timeZone = mVDeviceTimeZone;
        mVDynamicDeviceMetrics.runtimeTotalMem = j;
        mVDynamicDeviceMetrics.mo28469M();
        mVDynamicDeviceMetrics.runtimeFreeMem = j5;
        mVDynamicDeviceMetrics.mo28468L();
        mVDynamicDeviceMetrics.availableMemory = j4;
        mVDynamicDeviceMetrics.mo28461D();
        mVDynamicDeviceMetrics.isLow = z2;
        mVDynamicDeviceMetrics.mo28467J();
        mVDynamicDeviceMetrics.internalTotalBytes = j9;
        mVDynamicDeviceMetrics.mo28466I();
        mVDynamicDeviceMetrics.internalAvailableBytes = j8;
        mVDynamicDeviceMetrics.mo28465H();
        mVDynamicDeviceMetrics.externalTotalBytes = j3;
        mVDynamicDeviceMetrics.mo28463F();
        mVDynamicDeviceMetrics.externalAvailableBytes = availableBytes;
        mVDynamicDeviceMetrics.mo28462E();
        mVDynamicDeviceMetrics.networks = arrayList3;
        mVDynamicDeviceMetrics.avilableLocationProviders = list3;
        mVDynamicDeviceMetrics.battery = mVBatteryMetrics;
        mVDynamicDeviceMetrics.networkOperatorName = str5;
        mVDynamicDeviceMetrics.mobileDataState = str3;
        mVDynamicDeviceMetrics.fontScale = d;
        mVDynamicDeviceMetrics.mo28464G();
        mVDynamicDeviceMetrics.contentSizeIphone = "";
        C19721a aVar2 = C19731i.m47197a(context).f50171a;
        String str8 = aVar2.f50152c;
        String str9 = aVar2.f50154e;
        if (C20943i.m49051d(24)) {
            bVar = new C4675b(context.getDataDir().getAbsolutePath());
        } else {
            bVar = null;
        }
        long d2 = C20978z.m49128d(new File(context.getFilesDir().getAbsolutePath()));
        long d3 = C20978z.m49128d(new File(context.getCacheDir().getAbsolutePath()));
        Context context3 = context;
        long d4 = C20978z.m49128d(new File(context3.getDatabasePath("moovit_v1.db").getParentFile().getAbsolutePath()));
        long j10 = d2;
        long databaseSize = DatabaseHelper.getDatabaseSize(context);
        boolean b = C20934d0.m49031b(context);
        boolean a2 = C20934d0.m49030a(context);
        SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
        ServerId serverId = a0Var.f50160a.f32927c;
        C19393f.f49325q.getClass();
        long j11 = databaseSize;
        long c2 = C19393f.m46693c(readableDatabase, serverId);
        int myUid = Process.myUid();
        C4675b bVar2 = bVar;
        boolean z4 = a2;
        long uidRxBytes = TrafficStats.getUidRxBytes(myUid);
        long uidTxBytes = TrafficStats.getUidTxBytes(myUid);
        if (!C20943i.m49051d(24) || (connectivityManager = (ConnectivityManager) context3.getSystemService("connectivity")) == null) {
            i = -1;
        } else {
            i = connectivityManager.getRestrictBackgroundStatus();
        }
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        MVDynamicDeviceMetrics mVDynamicDeviceMetrics2 = mVDynamicDeviceMetrics;
        boolean areNotificationsEnabled = from.areNotificationsEnabled();
        int importance = from.getImportance();
        C4675b bVar3 = bVar2;
        int i11 = serverId.f15142b;
        int i12 = importance;
        if (i == 1) {
            str7 = "disabled";
        } else if (i == 2) {
            str7 = "white_listed";
        } else if (i == 3) {
            str7 = "enabled";
        }
        MVAppMetrics mVAppMetrics = new MVAppMetrics();
        mVAppMetrics.clientVersion = str8;
        mVAppMetrics.clientFlavour = str9;
        mVAppMetrics.appFilesDirSize = j10;
        mVAppMetrics.mo28373J();
        mVAppMetrics.appCacheDirSize = d3;
        mVAppMetrics.mo28367D();
        mVAppMetrics.appDatabasesDirSize = d4;
        mVAppMetrics.mo28371H();
        mVAppMetrics.moovitDatabaseSize = j11;
        mVAppMetrics.mo28379Q();
        mVAppMetrics.userMetroId = i11;
        mVAppMetrics.mo28381S();
        mVAppMetrics.userMetroRevision = c2;
        mVAppMetrics.mo28382U();
        mVAppMetrics.hasFineLocationPermission = b;
        mVAppMetrics.mo28378P();
        mVAppMetrics.hasCoarseLocationPermission = z4;
        mVAppMetrics.mo28377O();
        mVAppMetrics.appDataSend = uidTxBytes;
        mVAppMetrics.mo28370G();
        mVAppMetrics.appDataReceived = uidRxBytes;
        mVAppMetrics.mo28369F();
        mVAppMetrics.restrictBackgroundStatus = str7;
        mVAppMetrics.areNotificationsEnabled = areNotificationsEnabled;
        mVAppMetrics.mo28374L();
        mVAppMetrics.notificationsImportance = i12;
        mVAppMetrics.mo28380R();
        mVAppMetrics.appDirSizeInstall = -1;
        mVAppMetrics.mo28372I();
        mVAppMetrics.hasCalendarPermission = false;
        mVAppMetrics.mo28376N();
        mVAppMetrics.hasATTPermission = false;
        mVAppMetrics.mo28375M();
        if (bVar3 != null) {
            mVAppMetrics.appDataDirSize = bVar3.f15922b;
            mVAppMetrics.mo28368E();
        }
        long currentTimeMillis = System.currentTimeMillis();
        MVDynamicMetricsServerMessage mVDynamicMetricsServerMessage = new MVDynamicMetricsServerMessage();
        MVDynamicMetricsServerMessage mVDynamicMetricsServerMessage2 = mVDynamicMetricsServerMessage;
        mVDynamicMetricsServerMessage2.device = mVDynamicDeviceMetrics2;
        mVDynamicMetricsServerMessage2.app = mVAppMetrics;
        mVDynamicMetricsServerMessage2.timestamp = currentTimeMillis;
        mVDynamicMetricsServerMessage2.mo28501j();
        String str10 = str;
        if (str10 != null) {
            mVDynamicMetricsServerMessage2.tag = str10;
        }
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.DYNAMIC_METRICS;
        mVServerMessage.value_ = mVDynamicMetricsServerMessage2;
        return mVServerMessage;
    }
}
