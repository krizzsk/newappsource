package p843uk;

import java.util.Objects;

/* renamed from: uk.d */
public final class C19924d {

    /* renamed from: a */
    public final String f50597a;

    /* renamed from: b */
    public final String f50598b;

    /* renamed from: c */
    public final String f50599c;

    public C19924d(String str, String str2, String str3) {
        this.f50597a = str;
        this.f50598b = str2;
        this.f50599c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19924d.class != obj.getClass()) {
            return false;
        }
        C19924d dVar = (C19924d) obj;
        if (!this.f50597a.equals(dVar.f50597a) || !this.f50598b.equals(dVar.f50598b) || !this.f50599c.equals(dVar.f50599c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50597a, this.f50598b, this.f50599c});
    }
}
