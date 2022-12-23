package androidx.camera.core;

import androidx.camera.core.CameraState;

/* renamed from: androidx.camera.core.c */
public final class C0547c extends CameraState.C0530a {

    /* renamed from: a */
    public final int f1888a;

    /* renamed from: b */
    public final Throwable f1889b;

    public C0547c(int i, Throwable th) {
        this.f1888a = i;
        this.f1889b = th;
    }

    /* renamed from: a */
    public final Throwable mo2356a() {
        return this.f1889b;
    }

    /* renamed from: b */
    public final int mo2357b() {
        return this.f1888a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState.C0530a)) {
            return false;
        }
        CameraState.C0530a aVar = (CameraState.C0530a) obj;
        if (this.f1888a == aVar.mo2357b()) {
            Throwable th = this.f1889b;
            if (th == null) {
                if (aVar.mo2356a() == null) {
                    return true;
                }
            } else if (th.equals(aVar.mo2356a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f1888a ^ 1000003) * 1000003;
        Throwable th = this.f1889b;
        if (th == null) {
            i = 0;
        } else {
            i = th.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("StateError{code=");
        k.append(this.f1888a);
        k.append(", cause=");
        k.append(this.f1889b);
        k.append("}");
        return k.toString();
    }
}
