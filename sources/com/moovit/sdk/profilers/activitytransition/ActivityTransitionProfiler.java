package com.moovit.sdk.profilers.activitytransition;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.ProfilerType;
import com.moovit.sdk.profilers.activitytransition.config.ActivityTransitionConfig;
import com.moovit.sdk.protocol.ProtocolEnums$ActivityRecognitionType;
import com.moovit.sdk.utils.SafeBroadcastReceiver;
import e70.C4589b;
import java.util.HashMap;
import n70.C18535a;
import o70.C18721a;
import p484ff.C16978i0;
import p977zz.C20927a0;

public final class ActivityTransitionProfiler extends C18535a<ActivityTransitionConfig> {

    /* renamed from: n */
    public static final String f43023n;

    /* renamed from: o */
    public static final String f43024o;

    /* renamed from: p */
    public static final HashMap f43025p;

    /* renamed from: q */
    public static final HashMap f43026q;

    /* renamed from: r */
    public static volatile ActivityTransitionProfiler f43027r;

    public static class ActivityTransitionReceiver extends SafeBroadcastReceiver {
        /* renamed from: a */
        public final void mo23871a(Context context, Intent intent) {
            if (ActivityTransitionResult.hasResult(intent)) {
                for (ActivityTransitionEvent next : ActivityTransitionResult.extractResult(intent).getTransitionEvents()) {
                    ActivityTransitionProfiler w = ActivityTransitionProfiler.m41902w(context);
                    ProfilerLog.m41879c(w.f47186a).mo49244b("ActivityTransitionProfiler", "New Activity Transition Detected - Updating file");
                    if (next != null) {
                        long elapsedRealTimeNanos = (next.getElapsedRealTimeNanos() / 1000000) + (System.currentTimeMillis() - SystemClock.elapsedRealtime());
                        w.mo50949u("activities_transition.dat", w.f47188c, Long.valueOf(elapsedRealTimeNanos), Integer.valueOf(((ProtocolEnums$ActivityRecognitionType) ActivityTransitionProfiler.f43025p.get(Integer.valueOf(next.getActivityType()))).getValue()), Integer.valueOf(next.getTransitionType()));
                    }
                }
            }
        }
    }

    public static class StartStopReceiver extends SafeBroadcastReceiver {
        /* renamed from: a */
        public final void mo23871a(Context context, Intent intent) {
            ActivityTransitionProfiler w = ActivityTransitionProfiler.m41902w(context);
            String action = intent.getAction();
            if (ActivityTransitionProfiler.f43023n.equals(action)) {
                w.mo50945q(intent, true);
            } else if (ActivityTransitionProfiler.f43024o.equals(action)) {
                w.mo50945q(intent, false);
            } else {
                throw new IllegalArgumentException(C25541a.m63881k("Unrecognized action: ", action));
            }
        }
    }

    static {
        Class<ActivityTransitionProfiler> cls = ActivityTransitionProfiler.class;
        f43023n = C13555b.m33969h(cls, new StringBuilder(), ".start");
        f43024o = C13555b.m33969h(cls, new StringBuilder(), ".stop");
        HashMap hashMap = new HashMap();
        f43025p = hashMap;
        ProtocolEnums$ActivityRecognitionType protocolEnums$ActivityRecognitionType = ProtocolEnums$ActivityRecognitionType.STILL;
        hashMap.put(3, protocolEnums$ActivityRecognitionType);
        ProtocolEnums$ActivityRecognitionType protocolEnums$ActivityRecognitionType2 = ProtocolEnums$ActivityRecognitionType.WALKING;
        hashMap.put(7, protocolEnums$ActivityRecognitionType2);
        ProtocolEnums$ActivityRecognitionType protocolEnums$ActivityRecognitionType3 = ProtocolEnums$ActivityRecognitionType.RUNNING;
        hashMap.put(8, protocolEnums$ActivityRecognitionType3);
        ProtocolEnums$ActivityRecognitionType protocolEnums$ActivityRecognitionType4 = ProtocolEnums$ActivityRecognitionType.IN_VEHICLE;
        hashMap.put(0, protocolEnums$ActivityRecognitionType4);
        ProtocolEnums$ActivityRecognitionType protocolEnums$ActivityRecognitionType5 = ProtocolEnums$ActivityRecognitionType.ON_BICYCLE;
        hashMap.put(1, protocolEnums$ActivityRecognitionType5);
        ProtocolEnums$ActivityRecognitionType protocolEnums$ActivityRecognitionType6 = ProtocolEnums$ActivityRecognitionType.ON_FOOT;
        hashMap.put(2, protocolEnums$ActivityRecognitionType6);
        ProtocolEnums$ActivityRecognitionType protocolEnums$ActivityRecognitionType7 = ProtocolEnums$ActivityRecognitionType.TILTING;
        hashMap.put(5, protocolEnums$ActivityRecognitionType7);
        HashMap hashMap2 = new HashMap();
        f43026q = hashMap2;
        hashMap2.put(protocolEnums$ActivityRecognitionType, 3);
        hashMap2.put(protocolEnums$ActivityRecognitionType2, 7);
        hashMap2.put(protocolEnums$ActivityRecognitionType3, 8);
        hashMap2.put(protocolEnums$ActivityRecognitionType4, 0);
        hashMap2.put(protocolEnums$ActivityRecognitionType5, 1);
        hashMap2.put(protocolEnums$ActivityRecognitionType6, 2);
        hashMap2.put(protocolEnums$ActivityRecognitionType7, 5);
    }

    public ActivityTransitionProfiler(Context context) {
        super(context, "activity_transition", ProfilerType.ACTIVITY_TRANSITION_RECOGNITION, ActivityTransitionConfig.f43030h, ActivityTransitionConfig.f43029g);
    }

    /* renamed from: w */
    public static ActivityTransitionProfiler m41902w(Context context) {
        if (f43027r == null) {
            synchronized (ActivityTransitionProfiler.class) {
                if (f43027r == null) {
                    f43027r = new ActivityTransitionProfiler(context.getApplicationContext());
                }
            }
        }
        return f43027r;
    }

    /* renamed from: a */
    public final int mo49250a() {
        return 2;
    }

    /* renamed from: d */
    public final String mo49251d() {
        return "activity_transition_profiler_config_file_name";
    }

    /* renamed from: f */
    public final String mo49252f() {
        return "activities_transition.dat";
    }

    /* renamed from: h */
    public final String mo49253h() {
        return mo50937b() != null ? ((ActivityTransitionConfig) mo50937b()).toString() : "activity profiler config is null";
    }

    /* renamed from: i */
    public final Intent mo49254i() {
        return new Intent(f43024o, (Uri) null, this.f47186a, StartStopReceiver.class);
    }

    /* renamed from: m */
    public final void mo49255m(int i) {
        String str;
        Task<Void> task;
        super.mo49255m(i);
        PendingIntent v = mo49264v(C20927a0.m49010e(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING));
        ProfilerLog c = ProfilerLog.m41879c(this.f47186a);
        StringBuilder k = C13555b.m33972k("Activity Transition Intent is: ");
        if (v == null) {
            str = "Null";
        } else {
            str = "Not null";
        }
        k.append(str);
        c.mo49244b("ActivityTransitionProfiler", k.toString());
        int e = C20927a0.m49010e(134217728);
        if (i == 3 || i == 4) {
            ProfilerLog.m41879c(this.f47186a).mo49244b("ActivityTransitionProfiler", "removeActivityTransitionUpdates()");
            Context context = this.f47186a;
            Task<Void> removeActivityTransitionUpdates = ActivityRecognition.getClient(context).removeActivityTransitionUpdates(mo49264v(e));
            removeActivityTransitionUpdates.addOnCompleteListener(AsyncTask.SERIAL_EXECUTOR, (OnCompleteListener<Void>) new C16978i0(context, 6));
            task = removeActivityTransitionUpdates;
        } else {
            task = Tasks.forResult(null);
        }
        task.addOnCompleteListener(new C18721a(this, e));
    }

    /* renamed from: p */
    public final void mo49256p(int i) {
        super.mo49256p(i);
        if (i == 0) {
            int e = C20927a0.m49010e(134217728);
            Context context = this.f47186a;
            ActivityRecognition.getClient(context).removeActivityTransitionUpdates(mo49264v(e)).addOnCompleteListener(AsyncTask.SERIAL_EXECUTOR, new C16978i0(context, 6));
            mo50938c().delete();
        }
    }

    /* renamed from: r */
    public final boolean mo49257r(Intent intent) {
        return mo50946s(intent, "activity_transition_profiler_config_extra");
    }

    /* renamed from: v */
    public final PendingIntent mo49264v(int i) {
        return PendingIntent.getBroadcast(this.f47186a, C4589b.activity_transition_profiler_request_id, new Intent(this.f47186a, ActivityTransitionReceiver.class), i);
    }
}
