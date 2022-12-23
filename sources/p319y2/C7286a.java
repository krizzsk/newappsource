package p319y2;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: y2.a */
public final class C7286a {

    /* renamed from: a */
    public static long f22404a;

    /* renamed from: b */
    public static Method f22405b;

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m16884a() {
        try {
            if (f22405b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f22405b == null) {
                f22404a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f22405b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f22405b.invoke((Object) null, new Object[]{Long.valueOf(f22404a)})).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
