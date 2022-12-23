package androidx.camera.core;

import android.graphics.Rect;
import androidx.camera.core.SurfaceRequest;
import p358af.C13437d;

/* renamed from: androidx.camera.core.e */
public final class C0549e extends SurfaceRequest.C0536f {

    /* renamed from: a */
    public final Rect f1892a;

    /* renamed from: b */
    public final int f1893b;

    /* renamed from: c */
    public final int f1894c;

    public C0549e(Rect rect, int i, int i2) {
        this.f1892a = rect;
        this.f1893b = i;
        this.f1894c = i2;
    }

    /* renamed from: a */
    public final Rect mo2363a() {
        return this.f1892a;
    }

    /* renamed from: b */
    public final int mo2364b() {
        return this.f1893b;
    }

    /* renamed from: c */
    public final int mo2365c() {
        return this.f1894c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.C0536f)) {
            return false;
        }
        SurfaceRequest.C0536f fVar = (SurfaceRequest.C0536f) obj;
        if (this.f1892a.equals(fVar.mo2363a()) && this.f1893b == fVar.mo2364b() && this.f1894c == fVar.mo2365c()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1892a.hashCode() ^ 1000003) * 1000003) ^ this.f1893b) * 1000003) ^ this.f1894c;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TransformationInfo{cropRect=");
        k.append(this.f1892a);
        k.append(", rotationDegrees=");
        k.append(this.f1893b);
        k.append(", targetRotation=");
        return C13437d.m33707l(k, this.f1894c, "}");
    }
}
