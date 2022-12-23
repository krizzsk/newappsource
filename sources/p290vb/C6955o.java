package p290vb;

/* renamed from: vb.o */
public final class C6955o {

    /* renamed from: a */
    public final int f21704a;

    /* renamed from: b */
    public final int f21705b;

    /* renamed from: c */
    public final int f21706c;

    /* renamed from: d */
    public final float f21707d;

    public C6955o(int i, int i2, int i3, float f) {
        this.f21704a = i;
        this.f21705b = i2;
        this.f21706c = i3;
        this.f21707d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6955o)) {
            return false;
        }
        C6955o oVar = (C6955o) obj;
        if (this.f21704a == oVar.f21704a && this.f21705b == oVar.f21705b && this.f21706c == oVar.f21706c && this.f21707d == oVar.f21707d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f21707d) + ((((((217 + this.f21704a) * 31) + this.f21705b) * 31) + this.f21706c) * 31);
    }
}
