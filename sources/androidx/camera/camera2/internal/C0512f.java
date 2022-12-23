package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.CaptureSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mf0.C24361g;
import p066e0.C4442l0;

/* renamed from: androidx.camera.camera2.internal.f */
public final class C0512f {

    /* renamed from: a */
    public final List<C4442l0> f1781a;

    public C0512f(CaptureSession captureSession, ArrayList arrayList) {
        boolean z;
        if (captureSession.f1738l == CaptureSession.State.OPENED) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder k = C13555b.m33972k("CaptureSession state must be OPENED. Current state:");
        k.append(captureSession.f1738l);
        C24361g.m61177o(z, k.toString());
        this.f1781a = Collections.unmodifiableList(new ArrayList(arrayList));
    }
}
