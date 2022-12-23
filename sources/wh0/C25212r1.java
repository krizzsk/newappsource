package wh0;

/* renamed from: wh0.r1 */
public final class C25212r1 {

    /* renamed from: a */
    public static final ThreadLocal<C25202o0> f63483a = new ThreadLocal<>();

    /* renamed from: a */
    public static C25202o0 m63301a() {
        ThreadLocal<C25202o0> threadLocal = f63483a;
        C25202o0 o0Var = threadLocal.get();
        if (o0Var != null) {
            return o0Var;
        }
        C25174f fVar = new C25174f(Thread.currentThread());
        threadLocal.set(fVar);
        return fVar;
    }
}
