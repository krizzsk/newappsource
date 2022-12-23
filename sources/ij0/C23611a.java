package ij0;

import gj0.C23422a;
import gj0.C23424c;
import gj0.C23425d;
import gj0.C23426e;
import gj0.C23428g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Map;
import lj0.C24330g;
import org.simpleframework.xml.core.C24664u;
import org.simpleframework.xml.stream.Verbosity;

/* renamed from: ij0.a */
public final class C23611a {

    /* renamed from: a */
    public final C24330g f59695a;

    /* renamed from: b */
    public final boolean f59696b;

    public C23611a(C23675u uVar, C24664u uVar2) {
        this.f59696b = uVar.mo58852c();
        this.f59695a = uVar2.f62448h;
    }

    /* renamed from: c */
    public static boolean m57815c(Class cls) {
        if (Number.class.isAssignableFrom(cls) || cls == Boolean.class || cls == Character.class) {
            return true;
        }
        return cls.isPrimitive();
    }

    /* renamed from: a */
    public final Annotation mo58738a(Class cls, Class[] clsArr) throws Exception {
        boolean z;
        boolean z2;
        Class<C23611a> cls2 = C23611a.class;
        ClassLoader classLoader = cls2.getClassLoader();
        boolean z3 = true;
        if (Map.class.isAssignableFrom(cls)) {
            if (clsArr == null || clsArr.length <= 0) {
                z = false;
            } else {
                Class superclass = clsArr[0].getSuperclass();
                Class cls3 = clsArr[0];
                if (superclass == null || (!superclass.isEnum() && !cls3.isEnum())) {
                    z = m57815c(cls3);
                } else {
                    z = true;
                }
            }
            if (z) {
                Verbosity verbosity = this.f59695a.f61632a;
                if (verbosity == null || verbosity != Verbosity.LOW) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    return mo58739b(classLoader, C23428g.class, true);
                }
            }
            return mo58739b(classLoader, C23428g.class, false);
        } else if (Collection.class.isAssignableFrom(cls)) {
            return mo58739b(classLoader, C23426e.class, false);
        } else {
            ClassLoader classLoader2 = cls2.getClassLoader();
            Class<?> componentType = cls.getComponentType();
            if (!cls.isArray()) {
                if (m57815c(cls)) {
                    Verbosity verbosity2 = this.f59695a.f61632a;
                    if (verbosity2 == null || verbosity2 != Verbosity.LOW) {
                        z3 = false;
                    }
                    if (z3) {
                        return mo58739b(classLoader2, C23422a.class, false);
                    }
                }
                return mo58739b(classLoader2, C23424c.class, false);
            } else if (m57815c(componentType)) {
                return mo58739b(classLoader2, C23424c.class, false);
            } else {
                return mo58739b(classLoader2, C23425d.class, false);
            }
        }
    }

    /* renamed from: b */
    public final Annotation mo58739b(ClassLoader classLoader, Class cls, boolean z) throws Exception {
        C23614b bVar = new C23614b(cls, this.f59696b, z);
        return (Annotation) Proxy.newProxyInstance(classLoader, new Class[]{cls}, bVar);
    }
}
