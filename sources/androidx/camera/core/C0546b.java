package androidx.camera.core;

import androidx.camera.core.CameraState;

/* renamed from: androidx.camera.core.b */
public final class C0546b extends CameraState {

    /* renamed from: a */
    public final CameraState.Type f1886a;

    /* renamed from: b */
    public final CameraState.C0530a f1887b;

    public C0546b(CameraState.Type type, C0547c cVar) {
        if (type != null) {
            this.f1886a = type;
            this.f1887b = cVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: a */
    public final CameraState.C0530a mo2354a() {
        return this.f1887b;
    }

    /* renamed from: b */
    public final CameraState.Type mo2355b() {
        return this.f1886a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState)) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        if (this.f1886a.equals(cameraState.mo2355b())) {
            CameraState.C0530a aVar = this.f1887b;
            if (aVar == null) {
                if (cameraState.mo2354a() == null) {
                    return true;
                }
            } else if (aVar.equals(cameraState.mo2354a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f1886a.hashCode() ^ 1000003) * 1000003;
        CameraState.C0530a aVar = this.f1887b;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CameraState{type=");
        k.append(this.f1886a);
        k.append(", error=");
        k.append(this.f1887b);
        k.append("}");
        return k.toString();
    }
}
