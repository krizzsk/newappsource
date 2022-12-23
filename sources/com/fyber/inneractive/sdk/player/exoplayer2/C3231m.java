package com.fyber.inneractive.sdk.player.exoplayer2;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.m */
public final class C3231m {

    /* renamed from: d */
    public static final C3231m f11655d = new C3231m(1.0f, 1.0f);

    /* renamed from: a */
    public final float f11656a;

    /* renamed from: b */
    public final float f11657b;

    /* renamed from: c */
    public final int f11658c;

    public C3231m(float f, float f2) {
        this.f11656a = f;
        this.f11657b = f2;
        this.f11658c = Math.round(f * 1000.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3231m.class != obj.getClass()) {
            return false;
        }
        C3231m mVar = (C3231m) obj;
        if (this.f11656a == mVar.f11656a && this.f11657b == mVar.f11657b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f11657b) + ((Float.floatToRawIntBits(this.f11656a) + 527) * 31);
    }
}
