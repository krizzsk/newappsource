package p705on;

import java.util.Objects;
import p752qn.C19148f;

/* renamed from: on.c */
public final class C18795c {

    /* renamed from: a */
    public final C18810p f47844a;

    /* renamed from: b */
    public final String f47845b;

    /* renamed from: c */
    public final C19148f f47846c;

    /* renamed from: d */
    public final C18804k f47847d;

    public C18795c(C18810p pVar, String str, C19148f fVar, C18804k kVar) {
        this.f47844a = pVar;
        this.f47845b = str;
        this.f47846c = fVar;
        this.f47847d = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18795c.class != obj.getClass()) {
            return false;
        }
        C18795c cVar = (C18795c) obj;
        if (!Objects.equals(this.f47844a, cVar.f47844a) || !Objects.equals(this.f47845b, cVar.f47845b) || !Objects.equals(this.f47846c, cVar.f47846c) || !Objects.equals(this.f47847d, cVar.f47847d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47844a, this.f47845b, this.f47846c, this.f47847d});
    }
}
