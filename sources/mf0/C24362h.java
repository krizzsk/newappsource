package mf0;

import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;
import p358af.C13437d;

/* renamed from: mf0.h */
public final class C24362h {

    /* renamed from: mf0.h$a */
    public static class C24363a {
    }

    /* renamed from: a */
    public static boolean m61206a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m61207b(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(C25541a.m63881k(str, " must not be null"));
            m61215j(C24362h.class.getName(), illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: c */
    public static void m61208c(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            m61215j(C24362h.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    /* renamed from: d */
    public static void m61209d(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            m61215j(C24362h.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public static void m61210e(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(C25541a.m63881k(str, " must not be null"));
            m61215j(C24362h.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    /* renamed from: f */
    public static void m61211f(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(m61214i(str));
            m61215j(C24362h.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    /* renamed from: g */
    public static void m61212g(Object obj, String str) {
        if (obj == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m61214i(str));
            m61215j(C24362h.class.getName(), illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    /* renamed from: h */
    public static int m61213h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: i */
    public static String m61214i(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        StringBuilder h = C16759e.m42352h("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        h.append(str);
        return h.toString();
    }

    /* renamed from: j */
    public static void m61215j(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* renamed from: k */
    public static String m61216k(Object obj, String str) {
        return str + obj;
    }

    /* renamed from: l */
    public static void m61217l(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(C13437d.m33706k("lateinit property ", str, " has not been initialized"));
        m61215j(C24362h.class.getName(), uninitializedPropertyAccessException);
        throw uninitializedPropertyAccessException;
    }
}
