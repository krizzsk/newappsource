package fg0;

import cf0.C21132f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import og0.C24596k;
import og0.C24611z;

/* renamed from: fg0.l */
public final class C23367l extends C23372q implements C24596k {

    /* renamed from: a */
    public final Constructor<?> f59149a;

    public C23367l(Constructor<?> constructor) {
        C24362h.m61211f(constructor, "member");
        this.f59149a = constructor;
    }

    /* renamed from: T */
    public final Member mo58497T() {
        return this.f59149a;
    }

    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f59149a.getTypeParameters();
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
    public final List<C24611z> mo58499h() {
        boolean z;
        Type[] genericParameterTypes = this.f59149a.getGenericParameterTypes();
        C24362h.m61210e(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return EmptyList.f60173b;
        }
        Class<?> declaringClass = this.f59149a.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C21132f.m49433P0(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = this.f59149a.getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                parameterAnnotations = (Annotation[][]) C21132f.m49433P0(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            return mo58508U(genericParameterTypes, parameterAnnotations, this.f59149a.isVarArgs());
        }
        throw new IllegalStateException(C24362h.m61216k(this.f59149a, "Illegal generic signature: "));
    }
}
