package p910xf;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCanceledListener;

/* renamed from: xf.i */
public final /* synthetic */ class C20480i implements OnCanceledListener {

    /* renamed from: b */
    public final /* synthetic */ CancellationTokenSource f51853b;

    public /* synthetic */ C20480i(CancellationTokenSource cancellationTokenSource) {
        this.f51853b = cancellationTokenSource;
    }

    public final void onCanceled() {
        this.f51853b.cancel();
    }
}
