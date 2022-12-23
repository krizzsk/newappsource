package hg0;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import mf0.C24362h;
import pg0.C24700f;

/* renamed from: hg0.i */
public final class C23469i {

    /* renamed from: a */
    public final C24700f f59251a;

    /* renamed from: b */
    public final Collection<AnnotationQualifierApplicabilityType> f59252b;

    /* renamed from: c */
    public final boolean f59253c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C23469i(C24700f fVar, List list) {
        this(fVar, list, fVar.f62537a == NullabilityQualifier.NOT_NULL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23469i)) {
            return false;
        }
        C23469i iVar = (C23469i) obj;
        return C24362h.m61206a(this.f59251a, iVar.f59251a) && C24362h.m61206a(this.f59252b, iVar.f59252b) && this.f59253c == iVar.f59253c;
    }

    public final int hashCode() {
        int hashCode = (this.f59252b.hashCode() + (this.f59251a.hashCode() * 31)) * 31;
        boolean z = this.f59253c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("JavaDefaultQualifiers(nullabilityQualifier=");
        k.append(this.f59251a);
        k.append(", qualifierApplicabilityTypes=");
        k.append(this.f59252b);
        k.append(", definitelyNotNull=");
        return C13715c.m34247m(k, this.f59253c, ')');
    }

    public C23469i(C24700f fVar, Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z) {
        C24362h.m61211f(collection, "qualifierApplicabilityTypes");
        this.f59251a = fVar;
        this.f59252b = collection;
        this.f59253c = z;
    }
}
