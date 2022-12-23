package com.moovit.sdk.profilers.schedule;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.gms.awareness.Awareness;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.awareness.fence.FenceQueryResponse;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.awareness.fence.FenceUpdateRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.app.ads.C14737e;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.ProfilerType;
import com.moovit.sdk.profilers.schedule.ScheduleConfig;
import com.moovit.sdk.profilers.steps.StepsCounterProfiler;
import com.moovit.sdk.profilers.wifiscan.WifiScansProfiler;
import com.moovit.sdk.utils.SafeBroadcastReceiver;
import g70.C4843a;
import n70.C18535a;
import n70.C18536b;
import p244s3.C6447v;
import p451du.C16705b;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20927a0;

public abstract class ScheduleBasedProfiler<PC extends ScheduleConfig> extends C18535a<PC> {

    /* renamed from: n */
    public static final int[] f43046n = {1, 2, 3, 4, 5, 6, 7};

    public static class ScheduleFenceReceiver extends SafeBroadcastReceiver {
        /* renamed from: a */
        public final void mo23871a(Context context, Intent intent) {
            ScheduleBasedProfiler scheduleBasedProfiler;
            FenceState extract = FenceState.extract(intent);
            C18536b a = C18536b.m45451a();
            String stringExtra = intent.getStringExtra("profiler_name");
            a.getClass();
            stringExtra.getClass();
            if (stringExtra.equals("steps_counter")) {
                scheduleBasedProfiler = StepsCounterProfiler.m41939y(context);
            } else if (!stringExtra.equals("wifi_scans")) {
                scheduleBasedProfiler = null;
            } else {
                scheduleBasedProfiler = WifiScansProfiler.m41951y(context);
            }
            int currentState = extract.getCurrentState();
            if (currentState == 0) {
                ProfilerLog.m41879c(context).mo49244b("ScheduleBasedProfiler", "FenceState.UNKNOWN");
            } else if (currentState == 1) {
                ProfilerLog.m41879c(context).mo49244b("ScheduleBasedProfiler", "FenceState.FALSE");
                scheduleBasedProfiler.mo49275w();
            } else if (currentState == 2) {
                ProfilerLog.m41879c(context).mo49244b("ScheduleBasedProfiler", "FenceState.TRUE");
                scheduleBasedProfiler.mo49276x();
            }
        }
    }

    public ScheduleBasedProfiler(Context context, String str, ProfilerType profilerType, C19620t tVar, C19621u uVar) {
        super(context, str, profilerType, tVar, uVar);
    }

    /* renamed from: a */
    public final int mo49250a() {
        return 2;
    }

    /* renamed from: m */
    public final void mo49255m(int i) {
        String str;
        super.mo49255m(i);
        PendingIntent v = mo49274v(C20927a0.m49010e(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING));
        ProfilerLog c = ProfilerLog.m41879c(this.f47186a);
        StringBuilder k = C13555b.m33972k("Time fence Intent is: ");
        if (v == null) {
            str = "Null";
        } else {
            str = "Not null";
        }
        k.append(str);
        c.mo49244b("ScheduleBasedProfiler", k.toString());
        Context context = this.f47186a;
        Task<FenceQueryResponse> queryFences = Awareness.getFenceClient(context).queryFences(FenceQueryRequest.forFences(this.f47189d));
        queryFences.addOnCompleteListener(AsyncTask.SERIAL_EXECUTOR, (OnCompleteListener<FenceQueryResponse>) new C6447v(context, 6));
        queryFences.addOnCompleteListener(new C14737e(this, 5));
        queryFences.addOnCompleteListener(new C4843a(this, 1));
    }

    /* renamed from: p */
    public final void mo49256p(int i) {
        super.mo49256p(i);
        mo49275w();
        FenceUpdateRequest build = new FenceUpdateRequest.Builder().removeFence(this.f47189d).build();
        Context context = this.f47186a;
        Awareness.getFenceClient(context).updateFences(build).addOnCompleteListener(AsyncTask.SERIAL_EXECUTOR, new C16705b(context, 6));
    }

    /* renamed from: v */
    public final PendingIntent mo49274v(int i) {
        Intent intent = new Intent(this.f47186a, ScheduleFenceReceiver.class);
        StringBuilder k = C13555b.m33972k("data://?=");
        k.append(this.f47189d);
        intent.setData(Uri.parse(k.toString()));
        intent.putExtra("profiler_name", this.f47189d);
        return PendingIntent.getBroadcast(this.f47186a, 657, intent, i);
    }

    /* renamed from: w */
    public abstract void mo49275w();

    /* renamed from: x */
    public abstract void mo49276x();
}
