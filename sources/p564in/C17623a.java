package p564in;

import java.util.Objects;

/* renamed from: in.a */
public final class C17623a {

    /* renamed from: a */
    public final String f45305a;

    /* renamed from: b */
    public final String f45306b;

    public C17623a(String str, String str2) {
        this.f45305a = str;
        this.f45306b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17623a.class != obj.getClass()) {
            return false;
        }
        C17623a aVar = (C17623a) obj;
        if (!this.f45305a.equals(aVar.f45305a) || !this.f45306b.equals(aVar.f45306b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f45305a, this.f45306b});
    }
}
