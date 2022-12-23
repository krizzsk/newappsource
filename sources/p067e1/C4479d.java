package p067e1;

import android.app.Application;
import p067e1.C4483f;

/* renamed from: e1.d */
public final class C4479d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Application f15538b;

    /* renamed from: c */
    public final /* synthetic */ C4483f.C4484a f15539c;

    public C4479d(Application application, C4483f.C4484a aVar) {
        this.f15538b = application;
        this.f15539c = aVar;
    }

    public final void run() {
        this.f15538b.unregisterActivityLifecycleCallbacks(this.f15539c);
    }
}
