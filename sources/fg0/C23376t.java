package fg0;

import java.util.Collection;
import kotlin.collections.EmptyList;
import lf0.C24236l;
import mf0.C24362h;
import og0.C24585a;
import og0.C24605t;
import ug0.C25066c;

/* renamed from: fg0.t */
public final class C23376t extends C23368m implements C24605t {

    /* renamed from: a */
    public final C25066c f59154a;

    public C23376t(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        this.f59154a = cVar;
    }

    /* renamed from: F */
    public final void mo58487F() {
    }

    /* renamed from: I */
    public final EmptyList mo58521I(C24236l lVar) {
        C24362h.m61211f(lVar, "nameFilter");
        return EmptyList.f60173b;
    }

    /* renamed from: c */
    public final C24585a mo58494c(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23376t) || !C24362h.m61206a(this.f59154a, ((C23376t) obj).f59154a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C25066c mo58523f() {
        return this.f59154a;
    }

    public final Collection getAnnotations() {
        return EmptyList.f60173b;
    }

    public final int hashCode() {
        return this.f59154a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C23376t.class, sb, ": ");
        sb.append(this.f59154a);
        return sb.toString();
    }

    /* renamed from: v */
    public final EmptyList mo58526v() {
        return EmptyList.f60173b;
    }
}
