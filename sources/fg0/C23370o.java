package fg0;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import mf0.C24362h;
import og0.C24599n;
import og0.C24608w;

/* renamed from: fg0.o */
public final class C23370o extends C23372q implements C24599n {

    /* renamed from: a */
    public final Field f59151a;

    public C23370o(Field field) {
        C24362h.m61211f(field, "member");
        this.f59151a = field;
    }

    /* renamed from: M */
    public final boolean mo58502M() {
        return this.f59151a.isEnumConstant();
    }

    /* renamed from: S */
    public final void mo58503S() {
    }

    /* renamed from: T */
    public final Member mo58497T() {
        return this.f59151a;
    }

    public final C24608w getType() {
        C24608w wVar;
        Type genericType = this.f59151a.getGenericType();
        C24362h.m61210e(genericType, "member.genericType");
        boolean z = genericType instanceof Class;
        if (z) {
            Class cls = (Class) genericType;
            if (cls.isPrimitive()) {
                return new C23377u(cls);
            }
        }
        if ((genericType instanceof GenericArrayType) || (z && ((Class) genericType).isArray())) {
            wVar = new C23364i(genericType);
        } else if (genericType instanceof WildcardType) {
            wVar = new C23382z((WildcardType) genericType);
        } else {
            wVar = new C23366k(genericType);
        }
        return wVar;
    }
}
