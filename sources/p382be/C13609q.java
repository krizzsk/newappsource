package p382be;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* renamed from: be.q */
public final class C13609q implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C13610r f33577a;

    public C13609q(C13610r rVar) {
        this.f33577a = rVar;
    }

    public final void onBackgroundStateChanged(boolean z) {
        if (z) {
            this.f33577a.getClass();
            C13600h hVar = this.f33577a.f33578a;
            hVar.f33568c.removeCallbacks(hVar.f33569d);
            return;
        }
        this.f33577a.getClass();
        this.f33577a.getClass();
    }
}
