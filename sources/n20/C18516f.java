package n20;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.MoovitApplication;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.CallableRunnable;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.metrics.MVDisplayMetrics;
import com.tranzmate.moovit.protocol.metrics.MVStaticDeviceMetrics;
import com.tranzmate.moovit.protocol.metrics.MVStaticMetricsServerMessage;
import f30.C4674a;
import f30.C4676c;
import f30.C4677d;
import f30.C4678e;
import f30.C4679f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m20.C18322a;
import org.apache.thrift.TBase;
import p081f3.C4648b;
import p081f3.C4665k;
import p401bz.C13709c;
import p401bz.C13712f;
import p824tp.C19722a0;
import p824tp.C19731i;
import p977zz.C20933d;
import p977zz.C20943i;
import q00.C19047a;
import q00.C19053d;

/* renamed from: n20.f */
public final class C18516f implements C18322a {

    /* renamed from: n20.f$a */
    public static class C18517a extends C13712f {
        public C18517a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final TBase mo21426a() {
            long j;
            List<Sensor> list;
            Context context = this.f33791b;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C4679f fVar = new C4679f();
            Runtime runtime = Runtime.getRuntime();
            runtime.maxMemory();
            runtime.totalMemory();
            runtime.freeMemory();
            int availableProcessors = runtime.availableProcessors();
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            if (C20943i.m49051d(16)) {
                j = memoryInfo.totalMem;
            } else {
                j = -1;
            }
            long j2 = memoryInfo.threshold;
            C4676c a = C4676c.m11987a();
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long totalBytes = statFs.getTotalBytes();
            statFs.getFreeBytes();
            statFs.getAvailableBytes();
            arrayList.add(new C4678e(context, 0));
            arrayList.add(new C4678e(context, 1));
            LocationManager locationManager = (LocationManager) context.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            if (locationManager != null) {
                Collections.unmodifiableList(locationManager.getAllProviders());
            } else {
                Collections.emptyList();
            }
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager != null) {
                list = sensorManager.getSensorList(-1);
            } else {
                list = Collections.emptyList();
            }
            for (Sensor type : list) {
                arrayList2.add(Integer.valueOf(type.getType()));
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            new C4674a(context);
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getNetworkOperatorName();
            telephonyManager.getDataState();
            context.getResources().getConfiguration();
            String str = fVar.f15938a;
            String str2 = fVar.f15939b;
            String str3 = fVar.f15940c;
            String str4 = fVar.f15941d;
            List<String> asList = Arrays.asList(fVar.f15944g);
            long j3 = totalBytes;
            long j4 = a.f15924b;
            ArrayList arrayList3 = arrayList2;
            int i = displayMetrics.widthPixels;
            long j5 = j4;
            int i2 = displayMetrics.heightPixels;
            long j6 = j2;
            double d = (double) displayMetrics.density;
            int i3 = displayMetrics.densityDpi;
            MVDisplayMetrics mVDisplayMetrics = new MVDisplayMetrics();
            mVDisplayMetrics.widthPixels = i;
            mVDisplayMetrics.mo28455p();
            mVDisplayMetrics.heightPixels = i2;
            mVDisplayMetrics.mo28454o();
            mVDisplayMetrics.density = d;
            mVDisplayMetrics.mo28453m();
            mVDisplayMetrics.densityDpi = i3;
            mVDisplayMetrics.mo28452l();
            mVDisplayMetrics.xdpi = (double) displayMetrics.xdpi;
            mVDisplayMetrics.mo28456q();
            mVDisplayMetrics.ydpi = (double) displayMetrics.ydpi;
            mVDisplayMetrics.mo28457r();
            MVStaticDeviceMetrics mVStaticDeviceMetrics = new MVStaticDeviceMetrics();
            mVStaticDeviceMetrics.device = str;
            mVStaticDeviceMetrics.deviceModel = str2;
            mVStaticDeviceMetrics.displayBuildId = str3;
            mVStaticDeviceMetrics.deviceManufacturer = str4;
            mVStaticDeviceMetrics.supportedAbis = asList;
            mVStaticDeviceMetrics.runtimeAvailableProcessors = availableProcessors;
            mVStaticDeviceMetrics.mo28547v();
            mVStaticDeviceMetrics.totalMemory = j;
            mVStaticDeviceMetrics.mo28548w();
            mVStaticDeviceMetrics.lowThreshouldMemory = j6;
            mVStaticDeviceMetrics.mo28546u();
            mVStaticDeviceMetrics.internalTotalBytes = j5;
            mVStaticDeviceMetrics.mo28544t();
            mVStaticDeviceMetrics.externalTotalBytes = j3;
            mVStaticDeviceMetrics.mo28543s();
            mVStaticDeviceMetrics.avilableSensorIds = arrayList3;
            mVStaticDeviceMetrics.display = mVDisplayMetrics;
            long currentTimeMillis = System.currentTimeMillis();
            MVStaticMetricsServerMessage mVStaticMetricsServerMessage = new MVStaticMetricsServerMessage();
            mVStaticMetricsServerMessage.device = mVStaticDeviceMetrics;
            mVStaticMetricsServerMessage.timestamp = currentTimeMillis;
            mVStaticMetricsServerMessage.mo28554h();
            MVServerMessage mVServerMessage = new MVServerMessage();
            mVServerMessage.setField_ = MVServerMessage._Fields.STATIC_METRICS;
            mVServerMessage.value_ = mVStaticMetricsServerMessage;
            return mVServerMessage;
        }
    }

    /* renamed from: n20.f$b */
    public static class C18518b extends C13712f {

        /* renamed from: c */
        public final C19722a0 f47139c;

        /* renamed from: d */
        public final String f47140d;

        public C18518b(Context context, C19722a0 a0Var, String str) {
            super(context);
            this.f47139c = a0Var;
            this.f47140d = str;
        }

        /* renamed from: a */
        public final TBase mo21426a() {
            return C4677d.m11988a(this.f33791b, this.f47139c, this.f47140d);
        }
    }

    /* renamed from: n20.f$c */
    public static class C18519c implements CallableRunnable {

        /* renamed from: b */
        public final boolean f47141b;

        /* renamed from: c */
        public final String f47142c;

        public C18519c(boolean z, String str) {
            this.f47141b = z;
            this.f47142c = str;
        }

        public final /* synthetic */ void onError(Throwable th) {
            C20933d.m49028c(this, th);
        }

        public final /* synthetic */ void run() {
            C20933d.m49029d(this);
        }

        public final void runSafe() {
            C19722a0 a0Var;
            C19047a aVar;
            MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
            if (moovitApplication != null) {
                if (!UserContextLoader.m40004l(moovitApplication)) {
                    a0Var = null;
                } else {
                    a0Var = (C19722a0) moovitApplication.f37321e.mo50695h("USER_CONTEXT", true);
                }
                if (a0Var != null && (aVar = (C19047a) moovitApplication.f37321e.mo50695h("CONFIGURATION", true)) != null && ((Boolean) aVar.mo51505b(C19053d.f48450B)).booleanValue()) {
                    C19731i.m47197a(moovitApplication).f50172b.mo42913b(new C18518b(moovitApplication, a0Var, this.f47142c), this.f47141b);
                }
            }
        }
    }

    /* renamed from: d */
    public static void m45397d(Context context, C19722a0 a0Var) {
        if (C13709c.m34226b(context) != null) {
            C19731i.m47197a(context).f50172b.mo42914c(Arrays.asList(new C13712f[]{new C18517a(context), new C18518b(context, a0Var, (String) null)}), true);
        }
    }

    /* renamed from: a */
    public final String mo50104a() {
        return "metrics_report";
    }

    /* renamed from: b */
    public final C4665k mo50105b() {
        TimeUnit timeUnit = TimeUnit.HOURS;
        C4665k.C4666a b = C16530d.m42009b(this, 6, timeUnit, 2, timeUnit);
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15887c = NetworkType.CONNECTED;
        return (C4665k) ((C4665k.C4666a) b.mo20192f(new C4648b(aVar))).mo20190b();
    }

    /* renamed from: c */
    public final ListenableWorker.C1379a mo50106c(Context context) {
        C20933d.m49029d(new C18519c(true, "periodic_task"));
        return new ListenableWorker.C1379a.C1382c();
    }
}
