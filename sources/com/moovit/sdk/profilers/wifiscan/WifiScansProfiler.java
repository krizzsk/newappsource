package com.moovit.sdk.profilers.wifiscan;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.ProfilerType;
import com.moovit.sdk.profilers.schedule.ScheduleBasedProfiler;
import com.moovit.sdk.profilers.wifiscan.config.WifiScansConfig;
import com.moovit.sdk.utils.SafeBroadcastReceiver;
import com.moovit.sdk.utils.WorkManagerReceiver;

public final class WifiScansProfiler extends ScheduleBasedProfiler<WifiScansConfig> {

    /* renamed from: o */
    public static final String f43054o;

    /* renamed from: p */
    public static final String f43055p;

    /* renamed from: q */
    public static volatile WifiScansProfiler f43056q;

    public static class StartStopReceiver extends SafeBroadcastReceiver {
        /* renamed from: a */
        public final void mo23871a(Context context, Intent intent) {
            WifiScansProfiler y = WifiScansProfiler.m41951y(context);
            String action = intent.getAction();
            if (WifiScansProfiler.f43054o.equals(action)) {
                y.mo50945q(intent, true);
            } else if (WifiScansProfiler.f43055p.equals(action)) {
                y.mo50945q(intent, false);
            } else {
                throw new IllegalArgumentException(C25541a.m63881k("Unrecognized action: ", action));
            }
        }
    }

    static {
        Class<WifiScansProfiler> cls = WifiScansProfiler.class;
        f43054o = C13555b.m33969h(cls, new StringBuilder(), ".start");
        f43055p = C13555b.m33969h(cls, new StringBuilder(), ".stop");
    }

    public WifiScansProfiler(Context context) {
        super(context, "wifi_scans", ProfilerType.WIFI_SCANS, WifiScansConfig.f43058h, WifiScansConfig.f43057g);
    }

    /* renamed from: y */
    public static WifiScansProfiler m41951y(Context context) {
        if (f43056q == null) {
            synchronized (WifiScansProfiler.class) {
                if (f43056q == null) {
                    f43056q = new WifiScansProfiler(context.getApplicationContext());
                }
            }
        }
        return f43056q;
    }

    /* renamed from: d */
    public final String mo49251d() {
        return "wifi_scans_profiler_config_file_name";
    }

    /* renamed from: f */
    public final String mo49252f() {
        return "wifis_around.dat";
    }

    /* renamed from: i */
    public final Intent mo49254i() {
        return new Intent(f43055p, (Uri) null, this.f47186a, StartStopReceiver.class);
    }

    /* renamed from: r */
    public final boolean mo49257r(Intent intent) {
        return mo50946s(intent, "wifi_scans_profiler_config_extra");
    }

    /* renamed from: w */
    public final void mo49275w() {
        ProfilerLog.m41879c(this.f47186a).mo49244b("WifiScansProfiler", "Time Fence End");
        WorkManagerReceiver.m17339b(this.f47186a, "com.moovit.sdk.action.CANCEL_WIFI_SCAN");
    }

    /* renamed from: x */
    public final void mo49276x() {
        ProfilerLog.m41879c(this.f47186a).mo49244b("WifiScansProfiler", "Time Fence Start");
        WorkManagerReceiver.m17339b(this.f47186a, "com.moovit.sdk.action.SCHEDULE_WIFI_SCAN");
    }
}
