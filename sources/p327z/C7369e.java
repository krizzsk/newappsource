package p327z;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import mf0.C24361g;

/* renamed from: z.e */
public final class C7369e extends C7367d {
    public C7369e(Surface surface) {
        super((Object) new OutputConfiguration(surface));
    }

    /* renamed from: a */
    public final void mo23575a(String str) {
        ((OutputConfiguration) getOutputConfiguration()).setPhysicalCameraId(str);
    }

    public final Object getOutputConfiguration() {
        C24361g.m61175n(this.f22594a instanceof OutputConfiguration);
        return this.f22594a;
    }

    public final String getPhysicalCameraId() {
        return null;
    }

    public C7369e(Object obj) {
        super(obj);
    }
}
