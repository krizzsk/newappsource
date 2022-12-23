package nb0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: nb0.d */
public final class C12940d extends C12941e<Object> {

    /* renamed from: a */
    public final /* synthetic */ Method f32077a;

    /* renamed from: b */
    public final /* synthetic */ Class f32078b;

    public C12940d(Method method, Class cls) {
        this.f32077a = method;
        this.f32078b = cls;
    }

    /* renamed from: a */
    public final Object mo39819a() throws InvocationTargetException, IllegalAccessException {
        return this.f32077a.invoke((Object) null, new Object[]{this.f32078b, Object.class});
    }

    public final String toString() {
        return this.f32078b.getName();
    }
}
