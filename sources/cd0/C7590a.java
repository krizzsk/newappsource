package cd0;

import com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl;

/* renamed from: cd0.a */
public final /* synthetic */ class C7590a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraControlImpl f23106b;

    /* renamed from: c */
    public final /* synthetic */ boolean f23107c;

    /* renamed from: d */
    public final /* synthetic */ boolean f23108d;

    public /* synthetic */ C7590a(Camera2CameraControlImpl camera2CameraControlImpl, boolean z, boolean z2) {
        this.f23106b = camera2CameraControlImpl;
        this.f23107c = z;
        this.f23108d = z2;
    }

    public final void run() {
        this.f23106b.lambda$cancelAfAeTrigger$7(this.f23107c, this.f23108d);
    }
}
