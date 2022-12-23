package fg0;

import fg0.C23352a;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import mf0.C24362h;
import og0.C24607v;
import og0.C24608w;

/* renamed from: fg0.v */
public final class C23378v extends C23372q implements C24607v {

    /* renamed from: a */
    public final Object f59157a;

    public C23378v(Object obj) {
        C24362h.m61211f(obj, "recordComponent");
        this.f59157a = obj;
    }

    /* renamed from: T */
    public final Member mo58497T() {
        Object obj = this.f59157a;
        C24362h.m61211f(obj, "recordComponent");
        C23352a.C23353a aVar = C23352a.f59127a;
        Method method = null;
        if (aVar == null) {
            Class<?> cls = obj.getClass();
            try {
                aVar = new C23352a.C23353a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new C23352a.C23353a((Method) null, (Method) null);
            }
            C23352a.f59127a = aVar;
        }
        Method method2 = aVar.f59129b;
        if (method2 != null) {
            Object invoke = method2.invoke(obj, new Object[0]);
            if (invoke != null) {
                method = (Method) invoke;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Method");
            }
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    /* renamed from: b */
    public final boolean mo58528b() {
        return false;
    }

    public final C24608w getType() {
        Object obj = this.f59157a;
        C24362h.m61211f(obj, "recordComponent");
        C23352a.C23353a aVar = C23352a.f59127a;
        Class cls = null;
        if (aVar == null) {
            Class<?> cls2 = obj.getClass();
            try {
                aVar = new C23352a.C23353a(cls2.getMethod("getType", new Class[0]), cls2.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new C23352a.C23353a((Method) null, (Method) null);
            }
            C23352a.f59127a = aVar;
        }
        Method method = aVar.f59128a;
        if (method != null) {
            Object invoke = method.invoke(obj, new Object[0]);
            if (invoke != null) {
                cls = (Class) invoke;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
            }
        }
        if (cls != null) {
            return new C23366k(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
