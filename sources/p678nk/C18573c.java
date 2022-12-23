package p678nk;

import java.util.Objects;

/* renamed from: nk.c */
public final class C18573c {

    /* renamed from: a */
    public final String f47273a;

    /* renamed from: b */
    public final String f47274b;

    /* renamed from: c */
    public final String f47275c;

    /* renamed from: d */
    public final Boolean f47276d;

    public C18573c(String str, String str2, String str3, Boolean bool) {
        this.f47273a = str;
        this.f47274b = str2;
        this.f47275c = str3;
        this.f47276d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18573c.class != obj.getClass()) {
            return false;
        }
        C18573c cVar = (C18573c) obj;
        if (!Objects.equals(this.f47273a, cVar.f47273a) || !Objects.equals(this.f47274b, cVar.f47274b) || !Objects.equals(this.f47275c, cVar.f47275c) || !Objects.equals(this.f47276d, cVar.f47276d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47273a, this.f47274b, this.f47275c, this.f47276d});
    }
}
