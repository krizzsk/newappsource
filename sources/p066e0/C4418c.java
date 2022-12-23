package p066e0;

import android.util.Size;
import android.view.Surface;
import p358af.C13437d;

/* renamed from: e0.c */
public final class C4418c extends C4431h0 {

    /* renamed from: a */
    public final Surface f15480a;

    /* renamed from: b */
    public final Size f15481b;

    /* renamed from: c */
    public final int f15482c;

    public C4418c(Surface surface, Size size, int i) {
        if (surface != null) {
            this.f15480a = surface;
            this.f15481b = size;
            this.f15482c = i;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    /* renamed from: a */
    public final int mo19931a() {
        return this.f15482c;
    }

    /* renamed from: b */
    public final Size mo19932b() {
        return this.f15481b;
    }

    /* renamed from: c */
    public final Surface mo19933c() {
        return this.f15480a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4431h0)) {
            return false;
        }
        C4431h0 h0Var = (C4431h0) obj;
        if (!this.f15480a.equals(h0Var.mo19933c()) || !this.f15481b.equals(h0Var.mo19932b()) || this.f15482c != h0Var.mo19931a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f15480a.hashCode() ^ 1000003) * 1000003) ^ this.f15481b.hashCode()) * 1000003) ^ this.f15482c;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("OutputSurface{surface=");
        k.append(this.f15480a);
        k.append(", size=");
        k.append(this.f15481b);
        k.append(", imageFormat=");
        return C13437d.m33707l(k, this.f15482c, "}");
    }
}
