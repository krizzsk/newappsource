package p404ce;

import p001a0.C0016g;

/* renamed from: ce.m */
public final class C13800m {

    /* renamed from: a */
    public final Class<?> f33967a;

    /* renamed from: b */
    public final int f33968b;

    /* renamed from: c */
    public final int f33969c;

    public C13800m(int i, int i2, Class cls) {
        this.f33967a = cls;
        this.f33968b = i;
        this.f33969c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13800m)) {
            return false;
        }
        C13800m mVar = (C13800m) obj;
        if (this.f33967a == mVar.f33967a && this.f33968b == mVar.f33968b && this.f33969c == mVar.f33969c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f33967a.hashCode() ^ 1000003) * 1000003) ^ this.f33968b) * 1000003) ^ this.f33969c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f33967a);
        sb.append(", type=");
        int i = this.f33968b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.f33969c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else if (i2 == 2) {
            str2 = "deferred";
        } else {
            throw new AssertionError(C16759e.m42349e("Unsupported injection: ", i2));
        }
        return C0016g.m31o(sb, str2, "}");
    }
}
