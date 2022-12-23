package p179n3;

import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: n3.e */
public final class C5846e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f18835b;

    /* renamed from: c */
    public final /* synthetic */ SystemForegroundService f18836c;

    public C5846e(SystemForegroundService systemForegroundService, int i) {
        this.f18836c = systemForegroundService;
        this.f18835b = i;
    }

    public final void run() {
        this.f18836c.f5220f.cancel(this.f18835b);
    }
}
