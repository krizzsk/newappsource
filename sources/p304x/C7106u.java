package p304x;

import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.C0593q;
import androidx.camera.core.impl.SessionConfig;

/* renamed from: x.u */
public final /* synthetic */ class C7106u implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl f22093b;

    /* renamed from: c */
    public final /* synthetic */ String f22094c;

    /* renamed from: d */
    public final /* synthetic */ SessionConfig f22095d;

    public /* synthetic */ C7106u(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig) {
        this.f22093b = camera2CameraImpl;
        this.f22094c = str;
        this.f22095d = sessionConfig;
    }

    public final void run() {
        Camera2CameraImpl camera2CameraImpl = this.f22093b;
        String str = this.f22094c;
        SessionConfig sessionConfig = this.f22095d;
        camera2CameraImpl.getClass();
        camera2CameraImpl.mo2251j("Use case " + str + " ACTIVE");
        C0593q qVar = camera2CameraImpl.f1685b;
        C0593q.C0594a aVar = (C0593q.C0594a) qVar.f2020a.get(str);
        if (aVar == null) {
            aVar = new C0593q.C0594a(sessionConfig);
            qVar.f2020a.put(str, aVar);
        }
        aVar.f2023c = true;
        camera2CameraImpl.f1685b.mo2507d(str, sessionConfig);
        camera2CameraImpl.mo2234A();
    }
}
