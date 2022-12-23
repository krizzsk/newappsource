package fg0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import og0.C24585a;
import og0.C24591f;

/* renamed from: fg0.i */
public final class C23364i extends C23379w implements C24591f {

    /* renamed from: a */
    public final Type f59143a;

    /* renamed from: b */
    public final C23379w f59144b;

    /* renamed from: c */
    public final EmptyList f59145c;

    public C23364i(Type type) {
        C23379w wVar;
        C23379w iVar;
        this.f59143a = type;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            C24362h.m61210e(genericComponentType, "genericComponentType");
            boolean z = genericComponentType instanceof Class;
            if (z) {
                Class cls = (Class) genericComponentType;
                if (cls.isPrimitive()) {
                    wVar = new C23377u(cls);
                    this.f59144b = wVar;
                    this.f59145c = EmptyList.f60173b;
                }
            }
            if ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) {
                iVar = new C23364i(genericComponentType);
            } else if (genericComponentType instanceof WildcardType) {
                iVar = new C23382z((WildcardType) genericComponentType);
            } else {
                iVar = new C23366k(genericComponentType);
            }
        } else {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (cls2.isArray()) {
                    Class<?> componentType = cls2.getComponentType();
                    C24362h.m61210e(componentType, "getComponentType()");
                    if (componentType.isPrimitive()) {
                        iVar = new C23377u(componentType);
                    } else if ((componentType instanceof GenericArrayType) || componentType.isArray()) {
                        iVar = new C23364i(componentType);
                    } else if (componentType instanceof WildcardType) {
                        iVar = new C23382z((WildcardType) componentType);
                    } else {
                        iVar = new C23366k(componentType);
                    }
                }
            }
            StringBuilder k = C13555b.m33972k("Not an array type (");
            k.append(type.getClass());
            k.append("): ");
            k.append(type);
            throw new IllegalArgumentException(k.toString());
        }
        wVar = iVar;
        this.f59144b = wVar;
        this.f59145c = EmptyList.f60173b;
    }

    /* renamed from: B */
    public final C23379w mo58486B() {
        return this.f59144b;
    }

    /* renamed from: F */
    public final void mo58487F() {
    }

    /* renamed from: T */
    public final Type mo58488T() {
        return this.f59143a;
    }

    public final Collection<C24585a> getAnnotations() {
        return this.f59145c;
    }
}
