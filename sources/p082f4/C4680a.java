package p082f4;

import java.lang.reflect.Method;

/* renamed from: f4.a */
public final class C4680a {

    /* renamed from: c */
    public static final C4680a f15946c = new C4680a();

    /* renamed from: a */
    public Class<?> f15947a;

    /* renamed from: b */
    public Method f15948b;

    public C4680a() {
        try {
            mo20201a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo20201a() throws ClassNotFoundException, SecurityException, NoSuchMethodException {
        Class<String> cls = String.class;
        Class<?> loadClass = C4680a.class.getClassLoader().loadClass("android.os.SystemProperties");
        this.f15947a = loadClass;
        this.f15948b = loadClass.getMethod("get", new Class[]{cls, cls});
        this.f15947a.getMethod("getBoolean", new Class[]{cls, Boolean.TYPE});
    }
}
