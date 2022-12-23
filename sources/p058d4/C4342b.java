package p058d4;

import java.lang.reflect.InvocationTargetException;
import p257t3.C6557a;
import p296w4.C6990g;
import p296w4.C6992h;
import p331z3.C7453a;
import p331z3.C7454b;

/* renamed from: d4.b */
public final class C4342b {

    /* renamed from: c */
    public static C4342b f15307c = new C4342b();

    /* renamed from: a */
    public C7453a f15308a;

    /* renamed from: b */
    public Object f15309b;

    /* renamed from: a */
    public final void mo19849a(C6557a aVar, Object obj) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> cls;
        Object obj2 = this.f15309b;
        if (obj2 == null) {
            this.f15309b = obj;
        } else if (obj2 != obj) {
            throw new IllegalAccessException("Only certain classes can access this method.");
        }
        String a = C6992h.m16472a("logback.ContextSelector");
        if (a == null) {
            this.f15308a = new C7454b(aVar);
        } else if (!a.equals("JNDI")) {
            if (!C6990g.f21761a) {
                try {
                    cls = Thread.currentThread().getContextClassLoader().loadClass(a);
                } catch (Throwable unused) {
                }
                this.f15308a = (C7453a) cls.getConstructor(new Class[]{C6557a.class}).newInstance(new Object[]{aVar});
            }
            cls = Class.forName(a);
            this.f15308a = (C7453a) cls.getConstructor(new Class[]{C6557a.class}).newInstance(new Object[]{aVar});
        } else {
            throw new RuntimeException("JNDI not supported");
        }
    }
}
