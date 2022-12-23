package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;

/* renamed from: androidx.camera.core.d */
public final class C0548d extends SurfaceRequest.C0535e {

    /* renamed from: a */
    public final int f1890a;

    /* renamed from: b */
    public final Surface f1891b;

    public C0548d(int i, Surface surface) {
        this.f1890a = i;
        if (surface != null) {
            this.f1891b = surface;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    /* renamed from: a */
    public final int mo2361a() {
        return this.f1890a;
    }

    /* renamed from: b */
    public final Surface mo2362b() {
        return this.f1891b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.C0535e)) {
            return false;
        }
        SurfaceRequest.C0535e eVar = (SurfaceRequest.C0535e) obj;
        if (this.f1890a != eVar.mo2361a() || !this.f1891b.equals(eVar.mo2362b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f1890a ^ 1000003) * 1000003) ^ this.f1891b.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Result{resultCode=");
        k.append(this.f1890a);
        k.append(", surface=");
        k.append(this.f1891b);
        k.append("}");
        return k.toString();
    }
}
