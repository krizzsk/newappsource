package p406cg;

import java.lang.reflect.Method;

/* renamed from: cg.l */
public final class C13825l extends C13829p {

    /* renamed from: a */
    public final /* synthetic */ Method f34020a;

    /* renamed from: b */
    public final /* synthetic */ Object f34021b;

    public C13825l(Object obj, Method method) {
        this.f34020a = method;
        this.f34021b = obj;
    }

    /* renamed from: b */
    public final <T> T mo40754b(Class<T> cls) throws Exception {
        C13829p.m34503a(cls);
        return this.f34020a.invoke(this.f34021b, new Object[]{cls});
    }
}
