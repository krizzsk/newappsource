package androidx.camera.lifecycle;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.C1033p;

/* renamed from: androidx.camera.lifecycle.a */
public final class C0646a extends LifecycleCameraRepository.C0645a {

    /* renamed from: a */
    public final C1033p f2222a;

    /* renamed from: b */
    public final CameraUseCaseAdapter.C0606a f2223b;

    public C0646a(C1033p pVar, CameraUseCaseAdapter.C0606a aVar) {
        if (pVar != null) {
            this.f2222a = pVar;
            if (aVar != null) {
                this.f2223b = aVar;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    /* renamed from: a */
    public final CameraUseCaseAdapter.C0606a mo2604a() {
        return this.f2223b;
    }

    /* renamed from: b */
    public final C1033p mo2605b() {
        return this.f2222a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.C0645a)) {
            return false;
        }
        LifecycleCameraRepository.C0645a aVar = (LifecycleCameraRepository.C0645a) obj;
        if (!this.f2222a.equals(aVar.mo2605b()) || !this.f2223b.equals(aVar.mo2604a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f2222a.hashCode() ^ 1000003) * 1000003) ^ this.f2223b.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Key{lifecycleOwner=");
        k.append(this.f2222a);
        k.append(", cameraId=");
        k.append(this.f2223b);
        k.append("}");
        return k.toString();
    }
}
