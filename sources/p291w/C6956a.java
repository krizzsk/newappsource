package p291w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0588l;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.Config;
import p032c0.C1755e;
import p054d0.C4307s;

/* renamed from: w.a */
public final class C6956a extends C1755e {

    /* renamed from: A */
    public static final C0572a f21708A = Config.C0564a.m1591a(CameraCaptureSession.StateCallback.class, "camera2.cameraCaptureSession.stateCallback");

    /* renamed from: B */
    public static final C0572a f21709B = Config.C0564a.m1591a(CameraCaptureSession.CaptureCallback.class, "camera2.cameraCaptureSession.captureCallback");

    /* renamed from: C */
    public static final C0572a f21710C = Config.C0564a.m1591a(C6959c.class, "camera2.cameraEvent.callback");

    /* renamed from: D */
    public static final C0572a f21711D = Config.C0564a.m1591a(Object.class, "camera2.captureRequest.tag");

    /* renamed from: E */
    public static final C0572a f21712E = Config.C0564a.m1591a(String.class, "camera2.cameraCaptureSession.physicalCameraId");

    /* renamed from: y */
    public static final C0572a f21713y = Config.C0564a.m1591a(Integer.TYPE, "camera2.captureRequest.templateType");

    /* renamed from: z */
    public static final C0572a f21714z = Config.C0564a.m1591a(CameraDevice.StateCallback.class, "camera2.cameraDevice.stateCallback");

    /* renamed from: w.a$a */
    public static final class C6957a implements C4307s<C6956a> {

        /* renamed from: a */
        public final C0589m f21715a = C0589m.m1674t();

        /* renamed from: a */
        public final void mo23202a(CaptureRequest.Key key, Object obj) {
            this.f21715a.mo2503w(C6956a.m16424s(key), obj);
        }

        public final C0588l getMutableConfig() {
            throw null;
        }
    }

    public C6956a(Config config) {
        super(config);
    }

    /* renamed from: s */
    public static C0572a m16424s(CaptureRequest.Key key) {
        StringBuilder k = C13555b.m33972k("camera2.captureRequest.option.");
        k.append(key.getName());
        return new C0572a(k.toString(), Object.class, key);
    }
}
