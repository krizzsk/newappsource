package com.moovit.sdk.profilers;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.app.JobIntentService;
import com.moovit.sdk.profilers.activity.ActivityProfiler;
import com.moovit.sdk.profilers.activity.config.ActivityConfig;
import com.moovit.sdk.profilers.activitytransition.ActivityTransitionProfiler;
import com.moovit.sdk.profilers.activitytransition.config.ActivityTransitionConfig;
import com.moovit.sdk.profilers.config.BaseConfig;
import com.moovit.sdk.profilers.places.PlacesProfiler;
import com.moovit.sdk.profilers.places.config.PlacesConfig;
import com.moovit.sdk.profilers.steps.StepsCounterProfiler;
import com.moovit.sdk.profilers.steps.config.StepsCounterConfig;
import com.moovit.sdk.profilers.wifiscan.WifiScansProfiler;
import com.moovit.sdk.profilers.wifiscan.config.WifiScansConfig;
import e70.C4590c;
import e70.C4591d;
import f00.C16919g;
import h70.C25735a;
import java.util.HashSet;
import java.util.List;
import q70.C19095b;
import r70.C19247a;
import v70.C13174j;
import v70.C13177m;
import y70.C13256a;

public class ProfilersManager extends JobIntentService {

    /* renamed from: i */
    public static final String f43010i;

    /* renamed from: j */
    public static final String f43011j;

    /* renamed from: k */
    public static final String f43012k;

    /* renamed from: l */
    public static C16919g.C16925f f43013l = new C16919g.C16925f("configuration_handler_last_modified_key", -1);

    /* renamed from: com.moovit.sdk.profilers.ProfilersManager$a */
    public static /* synthetic */ class C16452a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43014a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.sdk.profilers.config.ConfigType[] r0 = com.moovit.sdk.profilers.config.ConfigType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43014a = r0
                com.moovit.sdk.profilers.config.ConfigType r1 = com.moovit.sdk.profilers.config.ConfigType.PLACES_CONFIG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43014a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.sdk.profilers.config.ConfigType r1 = com.moovit.sdk.profilers.config.ConfigType.ACTIVITY_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43014a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.sdk.profilers.config.ConfigType r1 = com.moovit.sdk.profilers.config.ConfigType.WIFI_SCANS_CONFIG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43014a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.sdk.profilers.config.ConfigType r1 = com.moovit.sdk.profilers.config.ConfigType.STEPS_COUNTER_CONFIG     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f43014a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.sdk.profilers.config.ConfigType r1 = com.moovit.sdk.profilers.config.ConfigType.ACTIVITY_TRANSITION_CONFIG     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.sdk.profilers.ProfilersManager.C16452a.<clinit>():void");
        }
    }

    static {
        String canonicalName = ProfilersManager.class.getCanonicalName();
        f43010i = C25541a.m63881k(canonicalName, ".START");
        f43011j = C25541a.m63881k(canonicalName, ".STOP");
        f43012k = C25541a.m63881k(canonicalName, ".SYNC");
    }

    /* renamed from: d */
    public final void mo3360d(Intent intent) {
        if (intent.getAction() != null) {
            ProfilerLog c = ProfilerLog.m41879c(this);
            StringBuilder k = C13555b.m33972k("Received action: ");
            k.append(intent.getAction());
            c.mo49244b("ProfilersManager", k.toString());
            intent.getAction();
            if (f43010i.equals(intent.getAction()) || f43012k.equals(intent.getAction())) {
                try {
                    C13174j jVar = new C13174j(new C13177m(this, C4591d.m11903a(this)), C4590c.server_path_cdn_server_url, C4590c.api_path_moovit_sdk_profiler_collection_configuration_cdn, "", C25735a.C25737b.class);
                    jVar.mo40057M();
                    mo49249f((C19095b) ((C25735a.C25737b) jVar.mo52626J()).f32718i);
                } catch (Exception e) {
                    e.getMessage();
                    throw e;
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
            if (f43011j.equals(intent.getAction())) {
                String str = ActivityProfiler.f43016n;
                Intent intent2 = new Intent(this, ActivityProfiler.StartStopReceiver.class);
                intent2.setAction(ActivityProfiler.f43017o);
                intent2.putExtra("stop_reason", 2);
                sendBroadcast(intent2);
                String str2 = PlacesProfiler.f43035n;
                Intent intent3 = new Intent(this, PlacesProfiler.StartStopReceiver.class);
                intent3.setAction(PlacesProfiler.f43036o);
                intent3.putExtra("stop_reason", 2);
                sendBroadcast(intent3);
                String str3 = WifiScansProfiler.f43054o;
                Intent intent4 = new Intent(this, WifiScansProfiler.StartStopReceiver.class);
                intent4.setAction(WifiScansProfiler.f43055p);
                intent4.putExtra("stop_reason", 2);
                sendBroadcast(intent4);
                String str4 = StepsCounterProfiler.f43048o;
                Intent intent5 = new Intent(this, StepsCounterProfiler.StartStopReceiver.class);
                intent5.setAction(StepsCounterProfiler.f43049p);
                intent5.putExtra("stop_reason", 2);
                sendBroadcast(intent5);
                String str5 = ActivityTransitionProfiler.f43023n;
                Intent intent6 = new Intent(this, ActivityTransitionProfiler.StartStopReceiver.class);
                intent6.setAction(ActivityTransitionProfiler.f43024o);
                intent6.putExtra("stop_reason", 2);
                sendBroadcast(intent6);
                SharedPreferences sharedPreferences = getSharedPreferences("moovit_sdk_cfg_last_modified_prefs_name", 0);
                C16919g.C16925f fVar = f43013l;
                fVar.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                fVar.mo49539b(edit);
                edit.apply();
            }
        }
    }

    /* renamed from: f */
    public final void mo49249f(C19095b bVar) {
        boolean z = false;
        SharedPreferences sharedPreferences = getSharedPreferences("moovit_sdk_cfg_last_modified_prefs_name", 0);
        long longValue = f43013l.mo19759a(sharedPreferences).longValue();
        if (longValue == -1 || bVar.f48538b != longValue) {
            f43013l.mo49545d(sharedPreferences, Long.valueOf(bVar.f48538b));
            z = true;
        }
        if (z) {
            C4591d.m11903a(this).getClass();
            C13256a.m33377b(this).mo40132a(new C19247a(C4591d.f15777f.f15781d, bVar.f48538b, System.currentTimeMillis()));
            HashSet hashSet = new HashSet();
            List<? extends BaseConfig> list = bVar.f48537a;
            if (list != null && !list.isEmpty()) {
                for (BaseConfig baseConfig : list) {
                    int i = C16452a.f43014a[baseConfig.f43034d.ordinal()];
                    if (i == 1) {
                        hashSet.add(ProfilerType.LOCATION);
                        String str = PlacesProfiler.f43035n;
                        Intent intent = new Intent(this, PlacesProfiler.StartStopReceiver.class);
                        intent.setAction(PlacesProfiler.f43035n);
                        intent.putExtra("places_profiler_config_extra", (PlacesConfig) baseConfig);
                        sendBroadcast(intent);
                    } else if (i == 2) {
                        hashSet.add(ProfilerType.ACTIVITY_RECOGNITION);
                        String str2 = ActivityProfiler.f43016n;
                        Intent intent2 = new Intent(this, ActivityProfiler.StartStopReceiver.class);
                        intent2.setAction(ActivityProfiler.f43016n);
                        intent2.putExtra("activity_profiler_config_extra", (ActivityConfig) baseConfig);
                        sendBroadcast(intent2);
                    } else if (i == 3) {
                        hashSet.add(ProfilerType.WIFI_SCANS);
                        String str3 = WifiScansProfiler.f43054o;
                        Intent intent3 = new Intent(this, WifiScansProfiler.StartStopReceiver.class);
                        intent3.setAction(WifiScansProfiler.f43054o);
                        intent3.putExtra("wifi_scans_profiler_config_extra", (WifiScansConfig) baseConfig);
                        sendBroadcast(intent3);
                    } else if (i == 4) {
                        hashSet.add(ProfilerType.STEPS_COUNTER);
                        String str4 = StepsCounterProfiler.f43048o;
                        Intent intent4 = new Intent(this, StepsCounterProfiler.StartStopReceiver.class);
                        intent4.setAction(StepsCounterProfiler.f43048o);
                        intent4.putExtra("steps_counter_profiler_config_extra", (StepsCounterConfig) baseConfig);
                        sendBroadcast(intent4);
                    } else if (i == 5) {
                        hashSet.add(ProfilerType.ACTIVITY_TRANSITION_RECOGNITION);
                        String str5 = ActivityTransitionProfiler.f43023n;
                        Intent intent5 = new Intent(this, ActivityTransitionProfiler.StartStopReceiver.class);
                        intent5.setAction(ActivityTransitionProfiler.f43023n);
                        intent5.putExtra("activity_transition_profiler_config_extra", (ActivityTransitionConfig) baseConfig);
                        sendBroadcast(intent5);
                    }
                }
            }
            if (!hashSet.contains(ProfilerType.LOCATION)) {
                String str6 = PlacesProfiler.f43035n;
                Intent intent6 = new Intent(this, PlacesProfiler.StartStopReceiver.class);
                intent6.setAction(PlacesProfiler.f43036o);
                intent6.putExtra("stop_reason", 2);
                sendBroadcast(intent6);
            }
            if (!hashSet.contains(ProfilerType.ACTIVITY_RECOGNITION)) {
                String str7 = ActivityProfiler.f43016n;
                Intent intent7 = new Intent(this, ActivityProfiler.StartStopReceiver.class);
                intent7.setAction(ActivityProfiler.f43017o);
                intent7.putExtra("stop_reason", 2);
                sendBroadcast(intent7);
            }
            if (!hashSet.contains(ProfilerType.WIFI_SCANS)) {
                String str8 = WifiScansProfiler.f43054o;
                Intent intent8 = new Intent(this, WifiScansProfiler.StartStopReceiver.class);
                intent8.setAction(WifiScansProfiler.f43055p);
                intent8.putExtra("stop_reason", 2);
                sendBroadcast(intent8);
            }
            if (!hashSet.contains(ProfilerType.STEPS_COUNTER)) {
                String str9 = StepsCounterProfiler.f43048o;
                Intent intent9 = new Intent(this, StepsCounterProfiler.StartStopReceiver.class);
                intent9.setAction(StepsCounterProfiler.f43049p);
                intent9.putExtra("stop_reason", 2);
                sendBroadcast(intent9);
            }
            if (!hashSet.contains(ProfilerType.ACTIVITY_TRANSITION_RECOGNITION)) {
                String str10 = ActivityTransitionProfiler.f43023n;
                Intent intent10 = new Intent(this, ActivityTransitionProfiler.StartStopReceiver.class);
                intent10.setAction(ActivityTransitionProfiler.f43024o);
                intent10.putExtra("stop_reason", 2);
                sendBroadcast(intent10);
            }
        }
    }
}
