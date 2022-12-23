package p179n3;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: n3.c */
public final class C5844c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f18828b;

    /* renamed from: c */
    public final /* synthetic */ Notification f18829c;

    /* renamed from: d */
    public final /* synthetic */ int f18830d;

    /* renamed from: e */
    public final /* synthetic */ SystemForegroundService f18831e;

    public C5844c(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.f18831e = systemForegroundService;
        this.f18828b = i;
        this.f18829c = notification;
        this.f18830d = i2;
    }

    public final void run() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f18831e.startForeground(this.f18828b, this.f18829c, this.f18830d);
        } else {
            this.f18831e.startForeground(this.f18828b, this.f18829c);
        }
    }
}
