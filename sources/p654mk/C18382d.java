package p654mk;

import java.util.Objects;
import p819tk.C19686c;

/* renamed from: mk.d */
public final class C18382d extends C19686c {

    /* renamed from: b */
    public String f46855b;

    /* renamed from: c */
    public String f46856c;

    public C18382d(String str, String str2) {
        this.f46855b = str;
        this.f46856c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18382d.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C18382d dVar = (C18382d) obj;
        if (!this.f46855b.equals(dVar.f46855b) || !this.f46856c.equals(dVar.f46856c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f46855b, this.f46856c});
    }
}
