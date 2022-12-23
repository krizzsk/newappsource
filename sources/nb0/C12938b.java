package nb0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: nb0.b */
public final class C12938b extends C12941e<Object> {

    /* renamed from: a */
    public final /* synthetic */ Method f32071a;

    /* renamed from: b */
    public final /* synthetic */ Object f32072b;

    /* renamed from: c */
    public final /* synthetic */ Class f32073c;

    public C12938b(Method method, Object obj, Class cls) {
        this.f32071a = method;
        this.f32072b = obj;
        this.f32073c = cls;
    }

    /* renamed from: a */
    public final Object mo39819a() throws InvocationTargetException, IllegalAccessException {
        return this.f32071a.invoke(this.f32072b, new Object[]{this.f32073c});
    }

    public final String toString() {
        return this.f32073c.getName();
    }
}
