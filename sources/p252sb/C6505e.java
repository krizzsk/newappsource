package p252sb;

import java.util.Arrays;

/* renamed from: sb.e */
public final class C6505e {

    /* renamed from: a */
    public final int f20294a;

    /* renamed from: b */
    public final C6504d[] f20295b;

    /* renamed from: c */
    public int f20296c;

    public C6505e(C6504d... dVarArr) {
        this.f20295b = dVarArr;
        this.f20294a = dVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6505e.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f20295b, ((C6505e) obj).f20295b);
    }

    public final int hashCode() {
        if (this.f20296c == 0) {
            this.f20296c = 527 + Arrays.hashCode(this.f20295b);
        }
        return this.f20296c;
    }
}
