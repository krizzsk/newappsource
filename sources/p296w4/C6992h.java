package p296w4;

import java.lang.reflect.Method;
import p043ch.qos.logback.core.util.DynamicClassLoadingException;
import p043ch.qos.logback.core.util.IncompatibleClassException;
import p070e4.C4549d;
import p082f4.C4680a;
import p271u4.C6692c;

/* renamed from: w4.h */
public final class C6992h {
    /* renamed from: a */
    public static String m16472a(String str) {
        Method method;
        String str2;
        String str3 = null;
        try {
            String property = System.getProperty(str);
            if (property != null) {
                return property;
            }
            try {
                C4680a aVar = C4680a.f15946c;
                Class<?> cls = aVar.f15947a;
                if (!(cls == null || (method = aVar.f15948b) == null)) {
                    str2 = (String) method.invoke(cls, new Object[]{str, null});
                    if (str2 != null) {
                        if (str2.length() != 0) {
                            str3 = str2;
                        }
                    }
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (Exception unused) {
                str2 = null;
            } catch (IllegalArgumentException unused2) {
            }
            return str3;
        } catch (SecurityException unused3) {
            return null;
        }
    }

    /* renamed from: b */
    public static Object m16473b(String str, Class<?> cls, C4549d dVar) throws IncompatibleClassException, DynamicClassLoadingException {
        ClassLoader a = C6990g.m16471a(dVar);
        str.getClass();
        try {
            Class<?> loadClass = a.loadClass(str);
            if (cls.isAssignableFrom(loadClass)) {
                return loadClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IncompatibleClassException(cls, loadClass);
        } catch (IncompatibleClassException e) {
            throw e;
        } catch (Throwable th) {
            throw new DynamicClassLoadingException(C25541a.m63881k("Failed to instantiate type ", str), th);
        }
    }

    /* renamed from: c */
    public static boolean m16474c(String str) {
        return str == null || "".equals(str);
    }

    /* renamed from: d */
    public static void m16475d(C6692c cVar, String str, String str2) {
        try {
            System.setProperty(str, str2);
        } catch (SecurityException e) {
            cVar.mo21727f("Failed to set system property [" + str + "]", e);
        }
    }
}
