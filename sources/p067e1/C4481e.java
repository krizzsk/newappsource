package p067e1;

import java.lang.reflect.Method;

/* renamed from: e1.e */
public final class C4481e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Object f15547b;

    /* renamed from: c */
    public final /* synthetic */ Object f15548c;

    public C4481e(Object obj, Object obj2) {
        this.f15547b = obj;
        this.f15548c = obj2;
    }

    public final void run() {
        try {
            Method method = C4483f.f15553d;
            if (method != null) {
                method.invoke(this.f15547b, new Object[]{this.f15548c, Boolean.FALSE, "AppCompat recreation"});
                return;
            }
            C4483f.f15554e.invoke(this.f15547b, new Object[]{this.f15548c, Boolean.FALSE});
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }
}
