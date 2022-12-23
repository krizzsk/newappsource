package p110h8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import mf0.C24362h;
import p262t8.C6606a;

/* renamed from: h8.j */
public final class C5151j {

    /* renamed from: a */
    public static final /* synthetic */ int f17205a = 0;

    static {
        new C5151j();
    }

    /* renamed from: a */
    public static final Class<?> m13064a(String str) {
        Class<C5151j> cls = C5151j.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public static final Method m13065b(Class<?> cls, String str, Class<?>... clsArr) {
        Class<C5151j> cls2 = C5151j.class;
        if (C6606a.m15601b(cls2)) {
            return null;
        }
        try {
            C24362h.m61211f(clsArr, "args");
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            C6606a.m15600a(cls2, th);
            return null;
        }
    }

    /* renamed from: c */
    public static final Method m13066c(Class<?> cls, String str, Class<?>... clsArr) {
        Class<C5151j> cls2 = C5151j.class;
        if (C6606a.m15601b(cls2)) {
            return null;
        }
        try {
            C24362h.m61211f(cls, "clazz");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            C6606a.m15600a(cls2, th);
            return null;
        }
    }

    /* renamed from: d */
    public static final Object m13067d(Method method, Class cls, Object obj, Object... objArr) {
        Class<C5151j> cls2 = C5151j.class;
        if (C6606a.m15601b(cls2)) {
            return null;
        }
        try {
            C24362h.m61211f(cls, "clazz");
            C24362h.m61211f(method, "method");
            C24362h.m61211f(objArr, "args");
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            C6606a.m15600a(cls2, th);
            return null;
        }
    }
}
