package p938yk;

import java.util.Objects;
import p819tk.C19686c;

/* renamed from: yk.a */
public final class C20735a extends C19686c {

    /* renamed from: b */
    public final C20737b f52335b;

    /* renamed from: yk.a$a */
    public static class C20736a {
    }

    public C20735a(C20737b bVar) {
        this.f52335b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20735a.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f52335b, ((C20735a) obj).f52335b);
    }

    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        C20737b bVar = this.f52335b;
        if (bVar != null) {
            i = bVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
