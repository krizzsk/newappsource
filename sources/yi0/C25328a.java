package yi0;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: yi0.a */
public final class C25328a {
    /* renamed from: a */
    public static <T> T m63628a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C25328a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
