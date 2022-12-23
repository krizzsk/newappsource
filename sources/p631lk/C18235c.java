package p631lk;

import java.util.Objects;

/* renamed from: lk.c */
public final class C18235c {

    /* renamed from: a */
    public final String f46518a;

    /* renamed from: b */
    public final long f46519b;

    /* renamed from: c */
    public final String f46520c;

    /* renamed from: d */
    public final String f46521d;

    public C18235c(long j, String str, String str2, String str3) {
        this.f46518a = str;
        this.f46519b = j;
        this.f46520c = str2;
        this.f46521d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18235c.class != obj.getClass()) {
            return false;
        }
        C18235c cVar = (C18235c) obj;
        if (this.f46519b != cVar.f46519b || !this.f46518a.equals(cVar.f46518a) || !this.f46520c.equals(cVar.f46520c) || !this.f46521d.equals(cVar.f46521d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f46518a, Long.valueOf(this.f46519b), this.f46520c, this.f46521d});
    }
}
