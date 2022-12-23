package com.moovit.gcm.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import i10.C17538b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p451du.C16705b;

public class GcmNotificationPublisher extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f41527a = 0;

    public final void onReceive(Context context, Intent intent) {
        GcmNotification gcmNotification = (GcmNotification) intent.getParcelableExtra("notification");
        if (gcmNotification != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            ExecutorService executorService = MoovitExecutors.COMPUTATION;
            Tasks.call(executorService, new C17538b(context, gcmNotification)).addOnCompleteListener((Executor) executorService, new C16705b(goAsync, 1));
        }
    }
}
