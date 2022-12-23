package p843uk;

import java.util.Objects;
import p705on.C18804k;
import p705on.C18810p;
import p752qn.C19148f;

/* renamed from: uk.k0 */
public final class C19940k0 {

    /* renamed from: a */
    public final String f50647a;

    /* renamed from: b */
    public final C19148f f50648b;

    /* renamed from: c */
    public final C18804k f50649c;

    /* renamed from: d */
    public final String f50650d;

    /* renamed from: e */
    public final String f50651e;

    /* renamed from: f */
    public final C18810p f50652f;

    public C19940k0(String str, C19148f fVar, C18804k kVar, String str2, String str3, C18810p pVar) {
        this.f50647a = str;
        this.f50648b = fVar;
        this.f50649c = kVar;
        this.f50650d = str2;
        this.f50651e = str3;
        this.f50652f = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19940k0.class != obj.getClass()) {
            return false;
        }
        C19940k0 k0Var = (C19940k0) obj;
        if (!Objects.equals(this.f50647a, k0Var.f50647a) || !Objects.equals(this.f50648b, k0Var.f50648b) || !Objects.equals(this.f50649c, k0Var.f50649c) || !Objects.equals(this.f50650d, k0Var.f50650d) || !Objects.equals(this.f50651e, k0Var.f50651e) || !Objects.equals(this.f50652f, k0Var.f50652f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50647a, this.f50648b, this.f50649c, this.f50650d, this.f50651e, this.f50652f});
    }
}
