package p843uk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p705on.C18810p;
import p752qn.C19148f;

/* renamed from: uk.c */
public final class C19922c {

    /* renamed from: a */
    public final C19148f f50591a;

    /* renamed from: b */
    public final String f50592b;

    /* renamed from: c */
    public final List<C19947q> f50593c;

    /* renamed from: d */
    public final String f50594d;

    /* renamed from: e */
    public final C18810p f50595e;

    public C19922c(C19148f fVar, String str, ArrayList arrayList, String str2, C18810p pVar) {
        this.f50591a = fVar;
        this.f50592b = str;
        this.f50593c = arrayList;
        this.f50594d = str2;
        this.f50595e = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19922c.class != obj.getClass()) {
            return false;
        }
        C19922c cVar = (C19922c) obj;
        if (!Objects.equals(this.f50591a, cVar.f50591a) || !Objects.equals(this.f50592b, cVar.f50592b) || !Objects.equals(this.f50593c, cVar.f50593c) || !Objects.equals(this.f50594d, cVar.f50594d) || !Objects.equals(this.f50595e, cVar.f50595e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50591a, this.f50592b, this.f50593c, this.f50594d, this.f50595e});
    }
}
