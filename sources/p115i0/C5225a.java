package p115i0;

/* renamed from: i0.a */
public final class C5225a extends C5229e {

    /* renamed from: a */
    public final float f17314a;

    /* renamed from: b */
    public final float f17315b;

    /* renamed from: c */
    public final float f17316c;

    /* renamed from: d */
    public final float f17317d;

    public C5225a(float f, float f2, float f3, float f4) {
        this.f17314a = f;
        this.f17315b = f2;
        this.f17316c = f3;
        this.f17317d = f4;
    }

    /* renamed from: a */
    public final float mo20997a() {
        return this.f17317d;
    }

    /* renamed from: b */
    public final float mo20998b() {
        return this.f17315b;
    }

    /* renamed from: c */
    public final float mo20999c() {
        return this.f17316c;
    }

    /* renamed from: d */
    public final float mo21000d() {
        return this.f17314a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5229e)) {
            return false;
        }
        C5229e eVar = (C5229e) obj;
        if (Float.floatToIntBits(this.f17314a) == Float.floatToIntBits(eVar.mo21000d()) && Float.floatToIntBits(this.f17315b) == Float.floatToIntBits(eVar.mo20998b()) && Float.floatToIntBits(this.f17316c) == Float.floatToIntBits(eVar.mo20999c()) && Float.floatToIntBits(this.f17317d) == Float.floatToIntBits(eVar.mo20997a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f17314a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f17315b)) * 1000003) ^ Float.floatToIntBits(this.f17316c)) * 1000003) ^ Float.floatToIntBits(this.f17317d);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ImmutableZoomState{zoomRatio=");
        k.append(this.f17314a);
        k.append(", maxZoomRatio=");
        k.append(this.f17315b);
        k.append(", minZoomRatio=");
        k.append(this.f17316c);
        k.append(", linearZoom=");
        k.append(this.f17317d);
        k.append("}");
        return k.toString();
    }
}
