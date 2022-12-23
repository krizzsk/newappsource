package fg0;

import cf0.C21136j;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C23912a;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import mf0.C24362h;
import og0.C24585a;
import og0.C24594i;
import og0.C24595j;
import ug0.C25066c;

/* renamed from: fg0.k */
public final class C23366k extends C23379w implements C24595j {

    /* renamed from: a */
    public final Type f59147a;

    /* renamed from: b */
    public final C23368m f59148b;

    public C23366k(Type type) {
        C23368m mVar;
        C24362h.m61211f(type, "reflectType");
        this.f59147a = type;
        if (type instanceof Class) {
            mVar = new C23912a((Class) type);
        } else if (type instanceof TypeVariable) {
            mVar = new C23380x((TypeVariable) type);
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType != null) {
                mVar = new C23912a((Class) rawType);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
            }
        } else {
            StringBuilder k = C13555b.m33972k("Not a classifier type (");
            k.append(type.getClass());
            k.append("): ");
            k.append(type);
            throw new IllegalStateException(k.toString());
        }
        this.f59148b = mVar;
    }

    /* renamed from: F */
    public final void mo58487F() {
    }

    /* renamed from: H */
    public final String mo58491H() {
        return this.f59147a.toString();
    }

    /* renamed from: L */
    public final String mo58492L() {
        throw new UnsupportedOperationException(C24362h.m61216k(this.f59147a, "Type not found: "));
    }

    /* renamed from: T */
    public final Type mo58488T() {
        return this.f59147a;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [fg0.m, og0.i] */
    /* renamed from: a */
    public final C24594i mo58493a() {
        return this.f59148b;
    }

    /* renamed from: c */
    public final C24585a mo58494c(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        return null;
    }

    public final Collection<C24585a> getAnnotations() {
        return EmptyList.f60173b;
    }

    /* renamed from: u */
    public final boolean mo58495u() {
        boolean z;
        Type type = this.f59147a;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        C24362h.m61210e(typeParameters, "getTypeParameters()");
        if (typeParameters.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final ArrayList mo58496z() {
        Object obj;
        Object obj2;
        List<Type> c = ReflectClassUtilKt.m58951c(this.f59147a);
        ArrayList arrayList = new ArrayList(C21136j.m49436X(c, 10));
        for (Type type : c) {
            C24362h.m61211f(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    obj = new C23377u(cls);
                    arrayList.add(obj);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                obj2 = new C23364i(type);
            } else if (type instanceof WildcardType) {
                obj2 = new C23382z((WildcardType) type);
            } else {
                obj2 = new C23366k(type);
            }
            obj = obj2;
            arrayList.add(obj);
        }
        return arrayList;
    }
}
