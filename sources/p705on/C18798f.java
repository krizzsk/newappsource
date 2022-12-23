package p705on;

import java.util.Objects;
import p752qn.C19148f;

/* renamed from: on.f */
public final class C18798f {

    /* renamed from: a */
    public final C18805l f47858a;

    /* renamed from: b */
    public final Integer f47859b;

    /* renamed from: c */
    public final C19148f f47860c;

    public C18798f(C18805l lVar, Integer num, C19148f fVar) {
        this.f47858a = lVar;
        this.f47859b = num;
        this.f47860c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18798f.class != obj.getClass()) {
            return false;
        }
        C18798f fVar = (C18798f) obj;
        if (!Objects.equals(this.f47858a, fVar.f47858a) || !Objects.equals(this.f47859b, fVar.f47859b) || !Objects.equals(this.f47860c, fVar.f47860c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47858a, this.f47859b, this.f47860c});
    }
}
