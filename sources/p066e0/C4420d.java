package p066e0;

import android.util.Size;

/* renamed from: e0.d */
public final class C4420d extends C4448o0 {

    /* renamed from: a */
    public final Size f15487a;

    /* renamed from: b */
    public final Size f15488b;

    /* renamed from: c */
    public final Size f15489c;

    public C4420d(Size size, Size size2, Size size3) {
        if (size != null) {
            this.f15487a = size;
            if (size2 != null) {
                this.f15488b = size2;
                if (size3 != null) {
                    this.f15489c = size3;
                    return;
                }
                throw new NullPointerException("Null recordSize");
            }
            throw new NullPointerException("Null previewSize");
        }
        throw new NullPointerException("Null analysisSize");
    }

    /* renamed from: a */
    public final Size mo19938a() {
        return this.f15487a;
    }

    /* renamed from: b */
    public final Size mo19939b() {
        return this.f15488b;
    }

    /* renamed from: c */
    public final Size mo19940c() {
        return this.f15489c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4448o0)) {
            return false;
        }
        C4448o0 o0Var = (C4448o0) obj;
        if (!this.f15487a.equals(o0Var.mo19938a()) || !this.f15488b.equals(o0Var.mo19939b()) || !this.f15489c.equals(o0Var.mo19940c())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f15487a.hashCode() ^ 1000003) * 1000003) ^ this.f15488b.hashCode()) * 1000003) ^ this.f15489c.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("SurfaceSizeDefinition{analysisSize=");
        k.append(this.f15487a);
        k.append(", previewSize=");
        k.append(this.f15488b);
        k.append(", recordSize=");
        k.append(this.f15489c);
        k.append("}");
        return k.toString();
    }
}
