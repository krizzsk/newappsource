package p066e0;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraInternal;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p054d0.C4289j0;

/* renamed from: e0.n */
public final class C4445n {

    /* renamed from: a */
    public final Object f15505a = new Object();

    /* renamed from: b */
    public final LinkedHashMap f15506b = new LinkedHashMap();

    public C4445n() {
        new HashSet();
    }

    /* renamed from: a */
    public final LinkedHashSet<CameraInternal> mo19983a() {
        LinkedHashSet<CameraInternal> linkedHashSet;
        synchronized (this.f15505a) {
            linkedHashSet = new LinkedHashSet<>(this.f15506b.values());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public final void mo19984b(C4440l lVar) throws InitializationException {
        synchronized (this.f15505a) {
            try {
                for (String str : lVar.getAvailableCameraIds()) {
                    C4289j0.m11435b("CameraRepository");
                    this.f15506b.put(str, lVar.getCamera(str));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }
}
