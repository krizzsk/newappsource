package mg0;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import lh0.C24312z;
import mf0.C24362h;
import zf0.C25448i0;

/* renamed from: mg0.a */
public final class C24371a {

    /* renamed from: a */
    public final TypeUsage f61706a;

    /* renamed from: b */
    public final JavaTypeFlexibility f61707b;

    /* renamed from: c */
    public final boolean f61708c;

    /* renamed from: d */
    public final Set<C25448i0> f61709d;

    /* renamed from: e */
    public final C24312z f61710e;

    public C24371a(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, Set<? extends C25448i0> set, C24312z zVar) {
        C24362h.m61211f(typeUsage, "howThisTypeIsUsed");
        C24362h.m61211f(javaTypeFlexibility, "flexibility");
        this.f61706a = typeUsage;
        this.f61707b = javaTypeFlexibility;
        this.f61708c = z;
        this.f61709d = set;
        this.f61710e = zVar;
    }

    /* renamed from: a */
    public static C24371a m61248a(C24371a aVar, JavaTypeFlexibility javaTypeFlexibility, Set<C25448i0> set, C24312z zVar, int i) {
        TypeUsage typeUsage = (i & 1) != 0 ? aVar.f61706a : null;
        if ((i & 2) != 0) {
            javaTypeFlexibility = aVar.f61707b;
        }
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        boolean z = (i & 4) != 0 ? aVar.f61708c : false;
        if ((i & 8) != 0) {
            set = aVar.f61709d;
        }
        Set<C25448i0> set2 = set;
        if ((i & 16) != 0) {
            zVar = aVar.f61710e;
        }
        aVar.getClass();
        C24362h.m61211f(typeUsage, "howThisTypeIsUsed");
        C24362h.m61211f(javaTypeFlexibility2, "flexibility");
        return new C24371a(typeUsage, javaTypeFlexibility2, z, set2, zVar);
    }

    /* renamed from: b */
    public final C24371a mo60518b(JavaTypeFlexibility javaTypeFlexibility) {
        C24362h.m61211f(javaTypeFlexibility, "flexibility");
        return m61248a(this, javaTypeFlexibility, (Set) null, (C24312z) null, 29);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24371a)) {
            return false;
        }
        C24371a aVar = (C24371a) obj;
        return this.f61706a == aVar.f61706a && this.f61707b == aVar.f61707b && this.f61708c == aVar.f61708c && C24362h.m61206a(this.f61709d, aVar.f61709d) && C24362h.m61206a(this.f61710e, aVar.f61710e);
    }

    public final int hashCode() {
        int hashCode = (this.f61707b.hashCode() + (this.f61706a.hashCode() * 31)) * 31;
        boolean z = this.f61708c;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        Set<C25448i0> set = this.f61709d;
        int i2 = 0;
        int hashCode2 = (i + (set == null ? 0 : set.hashCode())) * 31;
        C24312z zVar = this.f61710e;
        if (zVar != null) {
            i2 = zVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("JavaTypeAttributes(howThisTypeIsUsed=");
        k.append(this.f61706a);
        k.append(", flexibility=");
        k.append(this.f61707b);
        k.append(", isForAnnotationParameter=");
        k.append(this.f61708c);
        k.append(", visitedTypeParameters=");
        k.append(this.f61709d);
        k.append(", defaultType=");
        k.append(this.f61710e);
        k.append(')');
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24371a(TypeUsage typeUsage, boolean z, Set set, int i) {
        this(typeUsage, (i & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : null, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : set, (C24312z) null);
    }
}
