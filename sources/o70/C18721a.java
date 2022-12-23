package o70;

import android.app.PendingIntent;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.activitytransition.ActivityTransitionProfiler;
import com.moovit.sdk.profilers.activitytransition.config.ActivityTransitionConfig;
import com.moovit.sdk.protocol.ProtocolEnums$ActivityRecognitionType;
import java.util.ArrayList;
import java.util.HashMap;
import p484ff.C16982k0;

/* renamed from: o70.a */
public final /* synthetic */ class C18721a implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ ActivityTransitionProfiler f47632b;

    /* renamed from: c */
    public final /* synthetic */ int f47633c;

    public /* synthetic */ C18721a(ActivityTransitionProfiler activityTransitionProfiler, int i) {
        this.f47632b = activityTransitionProfiler;
        this.f47633c = i;
    }

    public final void onComplete(Task task) {
        ActivityTransitionProfiler activityTransitionProfiler = this.f47632b;
        int i = this.f47633c;
        ProfilerLog.m41879c(activityTransitionProfiler.f47186a).mo49244b("ActivityTransitionProfiler", "requestActivityTransitionUpdates()");
        Context context = activityTransitionProfiler.f47186a;
        ArrayList arrayList = new ArrayList();
        ActivityTransitionConfig activityTransitionConfig = (ActivityTransitionConfig) activityTransitionProfiler.mo50937b();
        if (activityTransitionConfig != null) {
            for (ProtocolEnums$ActivityRecognitionType next : activityTransitionConfig.f43031e.keySet()) {
                ActivityTransition.Builder builder = new ActivityTransition.Builder();
                HashMap hashMap = ActivityTransitionProfiler.f43026q;
                arrayList.add(builder.setActivityType(((Integer) hashMap.get(next)).intValue()).setActivityTransition(0).build());
                arrayList.add(new ActivityTransition.Builder().setActivityType(((Integer) hashMap.get(next)).intValue()).setActivityTransition(1).build());
            }
        }
        PendingIntent v = activityTransitionProfiler.mo49264v(i);
        ActivityRecognition.getClient(context).requestActivityTransitionUpdates(new ActivityTransitionRequest(arrayList), v).addOnCompleteListener(AsyncTask.SERIAL_EXECUTOR, new C16982k0(context, 3));
    }
}
