package p891wk;

import java.util.Objects;

/* renamed from: wk.o */
public final class C20360o {

    /* renamed from: a */
    public final String f51573a;

    /* renamed from: b */
    public final Boolean f51574b;

    /* renamed from: c */
    public final Long f51575c;

    public C20360o(String str, Boolean bool, Long l) {
        this.f51573a = str;
        this.f51574b = bool;
        this.f51575c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20360o.class != obj.getClass()) {
            return false;
        }
        C20360o oVar = (C20360o) obj;
        if (!Objects.equals(this.f51573a, oVar.f51573a) || !Objects.equals(this.f51574b, oVar.f51574b) || !Objects.equals(this.f51575c, oVar.f51575c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51573a, this.f51574b, this.f51575c});
    }
}
