package p406cg;

import java.lang.reflect.Method;

/* renamed from: cg.m */
public final class C13826m extends C13829p {

    /* renamed from: a */
    public final /* synthetic */ Method f34022a;

    /* renamed from: b */
    public final /* synthetic */ int f34023b;

    public C13826m(Method method, int i) {
        this.f34022a = method;
        this.f34023b = i;
    }

    /* renamed from: b */
    public final <T> T mo40754b(Class<T> cls) throws Exception {
        C13829p.m34503a(cls);
        return this.f34022a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f34023b)});
    }
}
