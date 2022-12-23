package p657mn;

import java.util.Objects;

/* renamed from: mn.a */
public final class C18405a {

    /* renamed from: a */
    public final long f46926a;

    /* renamed from: b */
    public final String f46927b;

    public C18405a(long j, String str) {
        this.f46926a = j;
        this.f46927b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18405a.class != obj.getClass()) {
            return false;
        }
        C18405a aVar = (C18405a) obj;
        if (this.f46926a != aVar.f46926a || !this.f46927b.equals(aVar.f46927b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.f46926a), this.f46927b});
    }
}
