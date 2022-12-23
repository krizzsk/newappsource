package p586jn;

import java.util.Objects;

/* renamed from: jn.f */
public final class C17900f {

    /* renamed from: a */
    public final String f45939a;

    /* renamed from: b */
    public final String f45940b;

    /* renamed from: c */
    public final String f45941c;

    public C17900f(String str, String str2, String str3) {
        this.f45941c = str;
        this.f45939a = str2;
        this.f45940b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17900f.class != obj.getClass()) {
            return false;
        }
        C17900f fVar = (C17900f) obj;
        if (!this.f45941c.equals(fVar.f45941c) || !this.f45939a.equals(fVar.f45939a) || !Objects.equals(this.f45940b, fVar.f45940b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f45941c, this.f45939a, this.f45940b});
    }
}
