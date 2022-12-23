package fg0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C23912a;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import mf0.C24361g;
import mf0.C24362h;
import og0.C24585a;
import sf0.C24855b;
import ug0.C25065b;
import ug0.C25069e;

/* renamed from: fg0.d */
public final class C23358d extends C23368m implements C24585a {

    /* renamed from: a */
    public final Annotation f59139a;

    public C23358d(Annotation annotation) {
        C24362h.m61211f(annotation, "annotation");
        this.f59139a = annotation;
    }

    /* renamed from: K */
    public final void mo58474K() {
    }

    /* renamed from: N */
    public final ArrayList mo58475N() {
        Object obj;
        Method[] declaredMethods = C24361g.m61144N(C24361g.m61140J(this.f59139a)).getDeclaredMethods();
        C24362h.m61210e(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            i++;
            Object invoke = method.invoke(this.f59139a, new Object[0]);
            C24362h.m61210e(invoke, "method.invoke(annotation)");
            C25069e i2 = C25069e.m62820i(method.getName());
            Class<?> cls = invoke.getClass();
            List<C24855b<? extends Object>> list = ReflectClassUtilKt.f60530a;
            if (Enum.class.isAssignableFrom(cls)) {
                obj = new C23369n(i2, (Enum) invoke);
            } else if (invoke instanceof Annotation) {
                obj = new C23360f(i2, (Annotation) invoke);
            } else if (invoke instanceof Object[]) {
                obj = new C23363h(i2, (Object[]) invoke);
            } else if (invoke instanceof Class) {
                obj = new C23365j(i2, (Class) invoke);
            } else {
                obj = new C23371p(invoke, i2);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final C25065b mo58476d() {
        return ReflectClassUtilKt.m58949a(C24361g.m61144N(C24361g.m61140J(this.f59139a)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C23358d) && C24362h.m61206a(this.f59139a, ((C23358d) obj).f59139a);
    }

    public final int hashCode() {
        return this.f59139a.hashCode();
    }

    /* renamed from: i */
    public final void mo58479i() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C23358d.class, sb, ": ");
        sb.append(this.f59139a);
        return sb.toString();
    }

    /* renamed from: x */
    public final C23912a mo58481x() {
        return new C23912a(C24361g.m61144N(C24361g.m61140J(this.f59139a)));
    }
}
