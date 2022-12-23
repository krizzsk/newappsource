package p752qn;

import java.util.Objects;

/* renamed from: qn.d */
public final class C19146d {

    /* renamed from: a */
    public final String f48688a;

    /* renamed from: b */
    public final String f48689b;

    /* renamed from: c */
    public final String f48690c;

    /* renamed from: d */
    public final Integer f48691d;

    public C19146d(String str, String str2, String str3, Integer num) {
        this.f48688a = str;
        this.f48689b = str2;
        this.f48690c = str3;
        this.f48691d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19146d.class != obj.getClass()) {
            return false;
        }
        C19146d dVar = (C19146d) obj;
        if (!Objects.equals(this.f48688a, dVar.f48688a) || !Objects.equals(this.f48689b, dVar.f48689b) || !Objects.equals(this.f48690c, dVar.f48690c) || !Objects.equals(this.f48691d, dVar.f48691d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f48688a, this.f48689b, this.f48690c, this.f48691d});
    }
}
