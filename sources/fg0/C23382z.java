package fg0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.C23816b;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import og0.C24585a;
import og0.C24586a0;

/* renamed from: fg0.z */
public final class C23382z extends C23379w implements C24586a0 {

    /* renamed from: a */
    public final WildcardType f59163a;

    /* renamed from: b */
    public final EmptyList f59164b = EmptyList.f60173b;

    public C23382z(WildcardType wildcardType) {
        this.f59163a = wildcardType;
    }

    /* renamed from: F */
    public final void mo58487F() {
    }

    /* renamed from: Q */
    public final boolean mo58541Q() {
        Type[] upperBounds = this.f59163a.getUpperBounds();
        C24362h.m61210e(upperBounds, "reflectType.upperBounds");
        return !C24362h.m61206a(C23816b.m58440V0(upperBounds), Object.class);
    }

    /* renamed from: T */
    public final Type mo58488T() {
        return this.f59163a;
    }

    public final Collection<C24585a> getAnnotations() {
        return this.f59164b;
    }

    /* renamed from: q */
    public final C23379w mo58542q() {
        C23379w iVar;
        C23377u uVar;
        Type[] upperBounds = this.f59163a.getUpperBounds();
        Type[] lowerBounds = this.f59163a.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException(C24362h.m61216k(this.f59163a, "Wildcard types with many bounds are not yet supported: "));
        }
        if (lowerBounds.length == 1) {
            Object c1 = C23816b.m58447c1(lowerBounds);
            C24362h.m61210e(c1, "lowerBounds.single()");
            Type type = (Type) c1;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    uVar = new C23377u(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                iVar = new C23364i(type);
                return iVar;
            }
            if (type instanceof WildcardType) {
                iVar = new C23382z((WildcardType) type);
            } else {
                iVar = new C23366k(type);
            }
            return iVar;
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            Type type2 = (Type) C23816b.m58447c1(upperBounds);
            if (C24362h.m61206a(type2, Object.class)) {
                return null;
            }
            C24362h.m61210e(type2, "ub");
            boolean z2 = type2 instanceof Class;
            if (z2) {
                Class cls2 = (Class) type2;
                if (cls2.isPrimitive()) {
                    uVar = new C23377u(cls2);
                }
            }
            if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
                iVar = new C23364i(type2);
                return iVar;
            }
            if (type2 instanceof WildcardType) {
                iVar = new C23382z((WildcardType) type2);
            } else {
                iVar = new C23366k(type2);
            }
            return iVar;
        }
        return uVar;
    }
}
