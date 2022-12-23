package p752qn;

import java.util.Objects;

/* renamed from: qn.c */
public final class C19145c {

    /* renamed from: a */
    public final String f48685a;

    /* renamed from: b */
    public final String f48686b;

    /* renamed from: c */
    public final boolean f48687c;

    public C19145c(String str, String str2, boolean z) {
        this.f48685a = str;
        this.f48686b = str2;
        this.f48687c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19145c.class != obj.getClass()) {
            return false;
        }
        C19145c cVar = (C19145c) obj;
        if (this.f48687c != cVar.f48687c || !Objects.equals(this.f48685a, cVar.f48685a) || !this.f48686b.equals(cVar.f48686b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f48685a, this.f48686b, Boolean.valueOf(this.f48687c)});
    }
}
