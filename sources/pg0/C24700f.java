package pg0;

import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import mf0.C24362h;

/* renamed from: pg0.f */
public final class C24700f {

    /* renamed from: a */
    public final NullabilityQualifier f62537a;

    /* renamed from: b */
    public final boolean f62538b;

    public C24700f(NullabilityQualifier nullabilityQualifier, boolean z) {
        C24362h.m61211f(nullabilityQualifier, "qualifier");
        this.f62537a = nullabilityQualifier;
        this.f62538b = z;
    }

    /* renamed from: a */
    public static C24700f m62168a(C24700f fVar, NullabilityQualifier nullabilityQualifier, boolean z, int i) {
        if ((i & 1) != 0) {
            nullabilityQualifier = fVar.f62537a;
        }
        if ((i & 2) != 0) {
            z = fVar.f62538b;
        }
        fVar.getClass();
        C24362h.m61211f(nullabilityQualifier, "qualifier");
        return new C24700f(nullabilityQualifier, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24700f)) {
            return false;
        }
        C24700f fVar = (C24700f) obj;
        return this.f62537a == fVar.f62537a && this.f62538b == fVar.f62538b;
    }

    public final int hashCode() {
        int hashCode = this.f62537a.hashCode() * 31;
        boolean z = this.f62538b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("NullabilityQualifierWithMigrationStatus(qualifier=");
        k.append(this.f62537a);
        k.append(", isForWarningOnly=");
        return C13715c.m34247m(k, this.f62538b, ')');
    }
}
