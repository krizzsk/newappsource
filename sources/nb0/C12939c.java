package nb0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: nb0.c */
public final class C12939c extends C12941e<Object> {

    /* renamed from: a */
    public final /* synthetic */ Method f32074a;

    /* renamed from: b */
    public final /* synthetic */ Class f32075b;

    /* renamed from: c */
    public final /* synthetic */ int f32076c;

    public C12939c(Method method, Class cls, int i) {
        this.f32074a = method;
        this.f32075b = cls;
        this.f32076c = i;
    }

    /* renamed from: a */
    public final Object mo39819a() throws InvocationTargetException, IllegalAccessException {
        return this.f32074a.invoke((Object) null, new Object[]{this.f32075b, Integer.valueOf(this.f32076c)});
    }

    public final String toString() {
        return this.f32075b.getName();
    }
}
