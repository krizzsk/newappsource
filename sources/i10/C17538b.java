package i10;

import android.content.Context;
import com.moovit.commons.utils.CallableRunnable;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.gcm.notification.GcmNotificationPublisher;
import p977zz.C20933d;

/* renamed from: i10.b */
public final /* synthetic */ class C17538b implements CallableRunnable {

    /* renamed from: b */
    public final /* synthetic */ Context f45128b;

    /* renamed from: c */
    public final /* synthetic */ GcmNotification f45129c;

    public /* synthetic */ C17538b(Context context, GcmNotification gcmNotification) {
        this.f45128b = context;
        this.f45129c = gcmNotification;
    }

    public final /* synthetic */ void onError(Throwable th) {
        C20933d.m49028c(this, th);
    }

    public final /* synthetic */ void run() {
        C20933d.m49029d(this);
    }

    public final void runSafe() {
        Context context = this.f45128b;
        GcmNotification gcmNotification = this.f45129c;
        int i = GcmNotificationPublisher.f41527a;
        C17537a.f45127a.mo50003b(context, gcmNotification);
    }
}
