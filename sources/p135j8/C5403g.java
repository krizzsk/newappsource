package p135j8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref$ObjectRef;
import mf0.C24362h;

/* renamed from: j8.g */
public final class C5403g implements InvocationHandler {

    /* renamed from: a */
    public final /* synthetic */ Object f17740a;

    /* renamed from: b */
    public final /* synthetic */ Ref$ObjectRef<String> f17741b;

    /* renamed from: c */
    public final /* synthetic */ ReentrantLock f17742c;

    /* renamed from: d */
    public final /* synthetic */ Condition f17743d;

    public C5403g(Object obj, Ref$ObjectRef<String> ref$ObjectRef, ReentrantLock reentrantLock, Condition condition) {
        this.f17740a = obj;
        this.f17741b = ref$ObjectRef;
        this.f17742c = reentrantLock;
        this.f17743d = condition;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C24362h.m61211f(method, "method");
        C24362h.m61211f(objArr, "objects");
        try {
            if (C24362h.m61206a(method.getName(), "onChecksumsReady") && objArr.length == 1) {
                List list = objArr[0];
                if (list instanceof List) {
                    for (Object next : list) {
                        if (next != null) {
                            Method method2 = next.getClass().getMethod("getSplitName", new Class[0]);
                            C24362h.m61210e(method2, "c.javaClass.getMethod(\"getSplitName\")");
                            Method method3 = next.getClass().getMethod("getType", new Class[0]);
                            C24362h.m61210e(method3, "c.javaClass.getMethod(\"getType\")");
                            if (method2.invoke(next, new Object[0]) == null && C24362h.m61206a(method3.invoke(next, new Object[0]), this.f17740a)) {
                                Method method4 = next.getClass().getMethod("getValue", new Class[0]);
                                C24362h.m61210e(method4, "c.javaClass.getMethod(\"getValue\")");
                                Object invoke = method4.invoke(next, new Object[0]);
                                if (invoke != null) {
                                    this.f17741b.element = new BigInteger(1, (byte[]) invoke).toString(16);
                                    this.f17742c.lock();
                                    this.f17743d.signalAll();
                                    this.f17742c.unlock();
                                    return null;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            C5404h hVar = C5404h.f17744a;
        }
        return null;
    }
}
