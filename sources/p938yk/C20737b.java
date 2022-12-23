package p938yk;

import java.util.Objects;

/* renamed from: yk.b */
public final class C20737b {

    /* renamed from: a */
    public final String f52336a;

    public C20737b(String str) {
        this.f52336a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20737b.class != obj.getClass()) {
            return false;
        }
        return this.f52336a.equals(((C20737b) obj).f52336a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f52336a});
    }
}
