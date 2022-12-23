package fg0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import mf0.C24362h;
import og0.C24593h;
import ug0.C25069e;

/* renamed from: fg0.j */
public final class C23365j extends C23359e implements C24593h {

    /* renamed from: b */
    public final Class<?> f59146b;

    public C23365j(C25069e eVar, Class<?> cls) {
        super(eVar);
        this.f59146b = cls;
    }

    /* renamed from: b */
    public final C23379w mo58490b() {
        Class<?> cls = this.f59146b;
        C24362h.m61211f(cls, "type");
        if (cls.isPrimitive()) {
            return new C23377u(cls);
        }
        if ((cls instanceof GenericArrayType) || cls.isArray()) {
            return new C23364i(cls);
        }
        if (cls instanceof WildcardType) {
            return new C23382z((WildcardType) cls);
        }
        return new C23366k(cls);
    }
}
