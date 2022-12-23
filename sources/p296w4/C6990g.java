package p296w4;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: w4.g */
public final class C6990g {

    /* renamed from: a */
    public static boolean f21761a = false;

    /* renamed from: w4.g$a */
    public static class C6991a implements PrivilegedAction<Boolean> {
        public final Object run() {
            try {
                AccessController.checkPermission(new RuntimePermission("getClassLoader"));
                return Boolean.TRUE;
            } catch (SecurityException unused) {
                return Boolean.FALSE;
            }
        }
    }

    static {
        String str = null;
        try {
            str = System.getProperty("logback.ignoreTCL", (String) null);
        } catch (SecurityException unused) {
        }
        if (str != null) {
            f21761a = Boolean.valueOf(str).booleanValue();
        }
        ((Boolean) AccessController.doPrivileged(new C6991a())).booleanValue();
    }

    /* renamed from: a */
    public static ClassLoader m16471a(Object obj) {
        if (obj != null) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            if (classLoader == null) {
                return ClassLoader.getSystemClassLoader();
            }
            return classLoader;
        }
        throw new NullPointerException("Argument cannot be null");
    }
}
