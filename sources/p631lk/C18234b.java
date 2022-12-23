package p631lk;

import java.util.Objects;

/* renamed from: lk.b */
public final class C18234b {

    /* renamed from: a */
    public final String f46516a;

    /* renamed from: b */
    public final String f46517b;

    public C18234b(String str, String str2) {
        this.f46516a = str;
        this.f46517b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18234b.class != obj.getClass()) {
            return false;
        }
        C18234b bVar = (C18234b) obj;
        if (!this.f46516a.equals(bVar.f46516a) || !Objects.equals(this.f46517b, bVar.f46517b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f46516a, this.f46517b});
    }
}
