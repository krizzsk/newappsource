package p234r6;

import java.lang.reflect.InvocationTargetException;

@Deprecated
/* renamed from: r6.e */
public final class C6258e {
    /* renamed from: a */
    public static C6256c m14845a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof C6256c) {
                    return (C6256c) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (InstantiationException e) {
                m14846b(cls, e);
                throw null;
            } catch (IllegalAccessException e2) {
                m14846b(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m14846b(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m14846b(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: b */
    public static void m14846b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(C25541a.m63880j("Unable to instantiate GlideModule implementation for ", cls), reflectiveOperationException);
    }
}
