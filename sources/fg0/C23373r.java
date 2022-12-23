package fg0;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import mf0.C24362h;
import og0.C24602q;
import og0.C24611z;
import sf0.C24855b;
import ug0.C25069e;

/* renamed from: fg0.r */
public final class C23373r extends C23372q implements C24602q {

    /* renamed from: a */
    public final Method f59153a;

    public C23373r(Method method) {
        C24362h.m61211f(method, "member");
        this.f59153a = method;
    }

    /* renamed from: E */
    public final C23379w mo58517E() {
        C23379w wVar;
        Type genericReturnType = this.f59153a.getGenericReturnType();
        C24362h.m61210e(genericReturnType, "member.genericReturnType");
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new C23377u(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) {
            wVar = new C23364i(genericReturnType);
        } else if (genericReturnType instanceof WildcardType) {
            wVar = new C23382z((WildcardType) genericReturnType);
        } else {
            wVar = new C23366k(genericReturnType);
        }
        return wVar;
    }

    /* renamed from: R */
    public final boolean mo58518R() {
        return mo58519V() != null;
    }

    /* renamed from: T */
    public final Member mo58497T() {
        return this.f59153a;
    }

    /* renamed from: V */
    public final C23359e mo58519V() {
        C23359e pVar;
        Object defaultValue = this.f59153a.getDefaultValue();
        if (defaultValue == null) {
            return null;
        }
        Class<?> cls = defaultValue.getClass();
        List<C24855b<? extends Object>> list = ReflectClassUtilKt.f60530a;
        if (Enum.class.isAssignableFrom(cls)) {
            pVar = new C23369n((C25069e) null, (Enum) defaultValue);
        } else if (defaultValue instanceof Annotation) {
            pVar = new C23360f((C25069e) null, (Annotation) defaultValue);
        } else if (defaultValue instanceof Object[]) {
            pVar = new C23363h((C25069e) null, (Object[]) defaultValue);
        } else if (defaultValue instanceof Class) {
            pVar = new C23365j((C25069e) null, (Class) defaultValue);
        } else {
            pVar = new C23371p(defaultValue, (C25069e) null);
        }
        return pVar;
    }

    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f59153a.getTypeParameters();
        C24362h.m61210e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        int length = typeParameters.length;
        int i = 0;
        while (i < length) {
            TypeVariable typeVariable = typeParameters[i];
            i++;
            arrayList.add(new C23380x(typeVariable));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List<C24611z> mo58520h() {
        Type[] genericParameterTypes = this.f59153a.getGenericParameterTypes();
        C24362h.m61210e(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = this.f59153a.getParameterAnnotations();
        C24362h.m61210e(parameterAnnotations, "member.parameterAnnotations");
        return mo58508U(genericParameterTypes, parameterAnnotations, this.f59153a.isVarArgs());
    }
}
