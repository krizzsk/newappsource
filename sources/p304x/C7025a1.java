package p304x;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.C0525o;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;
import p695od.C18728c;

/* renamed from: x.a1 */
public interface C7025a1 {
    /* renamed from: a */
    void mo2284a(List<C0578e> list);

    /* renamed from: b */
    void mo2285b();

    /* renamed from: c */
    List<C0578e> mo2286c();

    void close();

    /* renamed from: d */
    SessionConfig mo2288d();

    /* renamed from: e */
    void mo2289e(SessionConfig sessionConfig);

    /* renamed from: f */
    C18728c<Void> mo2290f(SessionConfig sessionConfig, CameraDevice cameraDevice, C0525o oVar);

    C18728c release();
}
