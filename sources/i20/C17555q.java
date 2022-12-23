package i20;

import com.moovit.location.LocationTracker;
import com.veriff.sdk.camera.camera2.interop.Camera2CameraControl;

/* renamed from: i20.q */
public final /* synthetic */ class C17555q implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f45155b;

    /* renamed from: c */
    public final /* synthetic */ boolean f45156c;

    /* renamed from: d */
    public final /* synthetic */ Object f45157d;

    public /* synthetic */ C17555q(int i, Object obj, boolean z) {
        this.f45155b = i;
        this.f45157d = obj;
        this.f45156c = z;
    }

    public final void run() {
        switch (this.f45155b) {
            case 0:
                boolean z = this.f45156c;
                int i = LocationTracker.f42267i;
                ((LocationTracker) this.f45157d).mo48531j(z);
                return;
            default:
                ((Camera2CameraControl) this.f45157d).lambda$setActive$7(this.f45156c);
                return;
        }
    }
}
