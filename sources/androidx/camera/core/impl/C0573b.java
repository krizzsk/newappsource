package androidx.camera.core.impl;

import androidx.camera.core.impl.SurfaceConfig;

/* renamed from: androidx.camera.core.impl.b */
public final class C0573b extends SurfaceConfig {

    /* renamed from: a */
    public final SurfaceConfig.ConfigType f1954a;

    /* renamed from: b */
    public final SurfaceConfig.ConfigSize f1955b;

    public C0573b(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize) {
        if (configType != null) {
            this.f1954a = configType;
            if (configSize != null) {
                this.f1955b = configSize;
                return;
            }
            throw new NullPointerException("Null configSize");
        }
        throw new NullPointerException("Null configType");
    }

    /* renamed from: a */
    public final SurfaceConfig.ConfigSize mo2465a() {
        return this.f1955b;
    }

    /* renamed from: b */
    public final SurfaceConfig.ConfigType mo2466b() {
        return this.f1954a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
        if (!this.f1954a.equals(surfaceConfig.mo2466b()) || !this.f1955b.equals(surfaceConfig.mo2465a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f1954a.hashCode() ^ 1000003) * 1000003) ^ this.f1955b.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("SurfaceConfig{configType=");
        k.append(this.f1954a);
        k.append(", configSize=");
        k.append(this.f1955b);
        k.append("}");
        return k.toString();
    }
}
