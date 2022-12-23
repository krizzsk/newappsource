package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.Lifecycle;

public class LifecycleService extends Service implements C1033p {

    /* renamed from: b */
    public final C1011h0 f3883b = new C1011h0(this);

    public final Lifecycle getLifecycle() {
        return this.f3883b.f3939a;
    }

    public final IBinder onBind(Intent intent) {
        C1011h0 h0Var = this.f3883b;
        h0Var.getClass();
        h0Var.mo4303a(Lifecycle.Event.ON_START);
        return null;
    }

    public void onCreate() {
        C1011h0 h0Var = this.f3883b;
        h0Var.getClass();
        h0Var.mo4303a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        C1011h0 h0Var = this.f3883b;
        h0Var.getClass();
        h0Var.mo4303a(Lifecycle.Event.ON_STOP);
        h0Var.mo4303a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    public final void onStart(Intent intent, int i) {
        C1011h0 h0Var = this.f3883b;
        h0Var.getClass();
        h0Var.mo4303a(Lifecycle.Event.ON_START);
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
