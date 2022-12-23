package p843uk;

import java.util.Objects;

/* renamed from: uk.p */
public final class C19946p {

    /* renamed from: a */
    public final String f50674a;

    /* renamed from: b */
    public final C19931g f50675b;

    /* renamed from: c */
    public final C19924d f50676c;

    public C19946p(String str, C19931g gVar, C19924d dVar) {
        this.f50674a = str;
        this.f50675b = gVar;
        this.f50676c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19946p.class != obj.getClass()) {
            return false;
        }
        C19946p pVar = (C19946p) obj;
        if (!this.f50674a.equals(pVar.f50674a) || !Objects.equals(this.f50675b, pVar.f50675b) || !Objects.equals(this.f50676c, pVar.f50676c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50674a, this.f50675b, this.f50676c});
    }
}
