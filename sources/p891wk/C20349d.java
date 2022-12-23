package p891wk;

import java.util.Objects;

/* renamed from: wk.d */
public final class C20349d {

    /* renamed from: a */
    public final String f51525a;

    /* renamed from: b */
    public final String f51526b;

    public C20349d(String str, String str2) {
        this.f51526b = str2;
        this.f51525a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20349d.class != obj.getClass()) {
            return false;
        }
        C20349d dVar = (C20349d) obj;
        if (!Objects.equals(this.f51525a, dVar.f51525a) || !Objects.equals(this.f51526b, dVar.f51526b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51525a, this.f51526b});
    }
}
