package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.SessionConfig;

/* renamed from: androidx.camera.camera2.internal.a */
public final class C0507a extends Camera2CameraImpl.C0500f {

    /* renamed from: a */
    public final String f1764a;

    /* renamed from: b */
    public final Class<?> f1765b;

    /* renamed from: c */
    public final SessionConfig f1766c;

    /* renamed from: d */
    public final Size f1767d;

    public C0507a(String str, Class<?> cls, SessionConfig sessionConfig, Size size) {
        if (str != null) {
            this.f1764a = str;
            this.f1765b = cls;
            if (sessionConfig != null) {
                this.f1766c = sessionConfig;
                this.f1767d = size;
                return;
            }
            throw new NullPointerException("Null sessionConfig");
        }
        throw new NullPointerException("Null useCaseId");
    }

    /* renamed from: a */
    public final SessionConfig mo2280a() {
        return this.f1766c;
    }

    /* renamed from: b */
    public final Size mo2281b() {
        return this.f1767d;
    }

    /* renamed from: c */
    public final String mo2282c() {
        return this.f1764a;
    }

    /* renamed from: d */
    public final Class<?> mo2283d() {
        return this.f1765b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Camera2CameraImpl.C0500f)) {
            return false;
        }
        Camera2CameraImpl.C0500f fVar = (Camera2CameraImpl.C0500f) obj;
        if (this.f1764a.equals(fVar.mo2282c()) && this.f1765b.equals(fVar.mo2283d()) && this.f1766c.equals(fVar.mo2280a())) {
            Size size = this.f1767d;
            if (size == null) {
                if (fVar.mo2281b() == null) {
                    return true;
                }
            } else if (size.equals(fVar.mo2281b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f1764a.hashCode() ^ 1000003) * 1000003) ^ this.f1765b.hashCode()) * 1000003) ^ this.f1766c.hashCode()) * 1000003;
        Size size = this.f1767d;
        if (size == null) {
            i = 0;
        } else {
            i = size.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("UseCaseInfo{useCaseId=");
        k.append(this.f1764a);
        k.append(", useCaseType=");
        k.append(this.f1765b);
        k.append(", sessionConfig=");
        k.append(this.f1766c);
        k.append(", surfaceResolution=");
        k.append(this.f1767d);
        k.append("}");
        return k.toString();
    }
}
