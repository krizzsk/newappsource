package p179n3;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: n3.d */
public final class C5845d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f18832b;

    /* renamed from: c */
    public final /* synthetic */ Notification f18833c;

    /* renamed from: d */
    public final /* synthetic */ SystemForegroundService f18834d;

    public C5845d(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.f18834d = systemForegroundService;
        this.f18832b = i;
        this.f18833c = notification;
    }

    public final void run() {
        this.f18834d.f5220f.notify(this.f18832b, this.f18833c);
    }
}
