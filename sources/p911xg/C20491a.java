package p911xg;

/* renamed from: xg.a */
public final class C20491a {

    /* renamed from: a */
    public static final Class<?> f51881a;

    /* renamed from: b */
    public static final boolean f51882b;

    static {
        Class<?> cls;
        boolean z;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f51881a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z = true;
        } else {
            z = false;
        }
        f51882b = z;
    }

    /* renamed from: a */
    public static boolean m48115a() {
        return f51881a != null && !f51882b;
    }
}
