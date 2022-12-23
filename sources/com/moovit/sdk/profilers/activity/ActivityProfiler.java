package com.moovit.sdk.profilers.activity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseIntArray;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.ProfilerType;
import com.moovit.sdk.profilers.activity.config.ActivityConfig;
import com.moovit.sdk.utils.SafeBroadcastReceiver;
import e70.C4589b;
import n70.C18535a;
import p687nt.C18588a;
import p926xv.C20628i;
import p977zz.C20927a0;

public final class ActivityProfiler extends C18535a<ActivityConfig> {

    /* renamed from: n */
    public static final String f43016n;

    /* renamed from: o */
    public static final String f43017o;

    /* renamed from: p */
    public static final SparseIntArray f43018p;

    /* renamed from: q */
    public static volatile ActivityProfiler f43019q;

    public static class ActivityReceiver extends SafeBroadcastReceiver {
        /* renamed from: a */
        public final void mo23871a(Context context, Intent intent) {
            String str;
            ActivityProfiler w = ActivityProfiler.m41887w(context);
            ActivityRecognitionResult extractResult = ActivityRecognitionResult.extractResult(intent);
            ProfilerLog.m41879c(w.f47186a).mo49244b("ActivityProfiler", "New Activity Detected");
            if (extractResult != null) {
                StringBuilder sb = new StringBuilder();
                int size = ActivityProfiler.f43018p.size();
                for (int i = 0; i < size; i++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Integer.toString(extractResult.getActivityConfidence(ActivityProfiler.f43018p.keyAt(i))));
                    if (i == size - 1) {
                        str = "";
                    } else {
                        str = AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR;
                    }
                    sb2.append(str);
                    sb.append(sb2.toString());
                }
                w.mo50949u("activities.dat", w.f47188c, Long.valueOf(System.currentTimeMillis()), Long.valueOf(extractResult.getTime()), sb.toString());
            }
        }
    }

    public static class StartStopReceiver extends SafeBroadcastReceiver {
        /* renamed from: a */
        public final void mo23871a(Context context, Intent intent) {
            ActivityProfiler w = ActivityProfiler.m41887w(context);
            String action = intent.getAction();
            if (ActivityProfiler.f43016n.equals(action)) {
                w.mo50945q(intent, true);
            } else if (ActivityProfiler.f43017o.equals(action)) {
                w.mo50945q(intent, false);
            } else {
                throw new IllegalArgumentException(C25541a.m63881k("Unrecognized action: ", action));
            }
        }
    }

    static {
        Class<ActivityProfiler> cls = ActivityProfiler.class;
        f43016n = C13555b.m33969h(cls, new StringBuilder(), ".start");
        f43017o = C13555b.m33969h(cls, new StringBuilder(), ".stop");
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43018p = sparseIntArray;
        sparseIntArray.append(3, 0);
        sparseIntArray.append(7, 1);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(0, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(2, 5);
        sparseIntArray.append(5, 6);
    }

    public ActivityProfiler(Context context) {
        super(context, "activity", ProfilerType.ACTIVITY_RECOGNITION, ActivityConfig.f43021g, ActivityConfig.f43020f);
    }

    /* renamed from: w */
    public static ActivityProfiler m41887w(Context context) {
        if (f43019q == null) {
            synchronized (ActivityProfiler.class) {
                if (f43019q == null) {
                    f43019q = new ActivityProfiler(context.getApplicationContext());
                }
            }
        }
        return f43019q;
    }

    /* renamed from: a */
    public final int mo49250a() {
        return 2;
    }

    /* renamed from: d */
    public final String mo49251d() {
        return "activity_profiler_config_file_name";
    }

    /* renamed from: f */
    public final String mo49252f() {
        return "activities.dat";
    }

    /* renamed from: h */
    public final String mo49253h() {
        return mo50937b() != null ? ((ActivityConfig) mo50937b()).toString() : "activity profiler config is null";
    }

    /* renamed from: i */
    public final Intent mo49254i() {
        return new Intent(f43017o, (Uri) null, this.f47186a, StartStopReceiver.class);
    }

    /* renamed from: m */
    public final void mo49255m(int i) {
        String str;
        super.mo49255m(i);
        PendingIntent v = mo49258v(C20927a0.m49010e(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING));
        ProfilerLog c = ProfilerLog.m41879c(this.f47186a);
        StringBuilder k = C13555b.m33972k("Activity Recognition Intent is: ");
        if (v == null) {
            str = "Null";
        } else {
            str = "Not null";
        }
        k.append(str);
        c.mo49244b("ActivityProfiler", k.toString());
        int e = C20927a0.m49010e(134217728);
        if (i == 3 || i == 4) {
            Context context = this.f47186a;
            ActivityRecognition.getClient(context).removeActivityUpdates(mo49258v(e)).addOnCompleteListener(AsyncTask.SERIAL_EXECUTOR, new C20628i(context, 4));
        }
        long j = ((ActivityConfig) mo50937b()).f43022e;
        if (j == -1) {
            j = Long.MAX_VALUE;
        }
        Context context2 = this.f47186a;
        ActivityRecognition.getClient(context2).requestActivityUpdates(j, mo49258v(e)).addOnCompleteListener(AsyncTask.SERIAL_EXECUTOR, new C18588a(context2, 6));
    }

    /* renamed from: p */
    public final void mo49256p(int i) {
        super.mo49256p(i);
        if (i == 0) {
            int e = C20927a0.m49010e(134217728);
            Context context = this.f47186a;
            ActivityRecognition.getClient(context).removeActivityUpdates(mo49258v(e)).addOnCompleteListener(AsyncTask.SERIAL_EXECUTOR, new C20628i(context, 4));
            mo50938c().delete();
        }
    }

    /* renamed from: r */
    public final boolean mo49257r(Intent intent) {
        return mo50946s(intent, "activity_profiler_config_extra");
    }

    /* renamed from: v */
    public final PendingIntent mo49258v(int i) {
        return PendingIntent.getBroadcast(this.f47186a, C4589b.activity_profiler_request_id, new Intent(this.f47186a, ActivityReceiver.class), i);
    }
}
