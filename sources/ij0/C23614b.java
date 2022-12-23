package ij0;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.simpleframework.xml.core.PersistenceException;

/* renamed from: ij0.b */
public final class C23614b implements InvocationHandler {

    /* renamed from: a */
    public final C23652n f59697a = new C23652n();

    /* renamed from: b */
    public final Class f59698b;

    /* renamed from: c */
    public final boolean f59699c;

    /* renamed from: d */
    public final boolean f59700d;

    public C23614b(Class cls, boolean z, boolean z2) {
        this.f59699c = z2;
        this.f59700d = z;
        this.f59698b = cls;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        if (name.equals("toString")) {
            return toString();
        }
        if (name.equals("equals")) {
            Annotation annotation = (Annotation) obj;
            Annotation annotation2 = objArr[0];
            if (annotation.annotationType() == annotation2.annotationType()) {
                return Boolean.valueOf(this.f59697a.mo58823a(annotation, annotation2));
            }
            throw new PersistenceException("Annotation %s is not the same as %s", annotation, annotation2);
        } else if (name.equals("annotationType")) {
            return this.f59698b;
        } else {
            if (name.equals("required")) {
                return Boolean.valueOf(this.f59700d);
            }
            if (name.equals("attribute")) {
                return Boolean.valueOf(this.f59699c);
            }
            return method.getDefaultValue();
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        Class cls = this.f59698b;
        if (cls != null) {
            String name = cls.getName();
            sb.append('@');
            sb.append(name);
            sb.append('(');
            Method[] declaredMethods = this.f59698b.getDeclaredMethods();
            for (int i = 0; i < declaredMethods.length; i++) {
                String name2 = declaredMethods[i].getName();
                Method method = declaredMethods[i];
                String name3 = method.getName();
                if (name3.equals("required")) {
                    obj = Boolean.valueOf(this.f59700d);
                } else if (name3.equals("attribute")) {
                    obj = Boolean.valueOf(this.f59699c);
                } else {
                    obj = method.getDefaultValue();
                }
                if (i > 0) {
                    sb.append(',');
                    sb.append(' ');
                }
                sb.append(name2);
                sb.append('=');
                sb.append(obj);
            }
            sb.append(')');
        }
        return sb.toString();
    }
}
