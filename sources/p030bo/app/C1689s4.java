package p030bo.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: bo.app.s4 */
public final class C1689s4 {
    /* renamed from: a */
    public static Method m4739a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Method m4741b(String str, String str2, Class<?>... clsArr) {
        try {
            return m4739a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m4738a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m4740a(String str, String str2, Class<?>... clsArr) {
        return m4741b(str, str2, clsArr) != null;
    }
}
