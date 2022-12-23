package nb0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: nb0.a */
public final class C12937a extends C12941e<Object> {

    /* renamed from: a */
    public final /* synthetic */ Constructor f32069a;

    /* renamed from: b */
    public final /* synthetic */ Class f32070b;

    public C12937a(Constructor constructor, Class cls) {
        this.f32069a = constructor;
        this.f32070b = cls;
    }

    /* renamed from: a */
    public final Object mo39819a() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        return this.f32069a.newInstance((Object[]) null);
    }

    public final String toString() {
        return this.f32070b.getName();
    }
}
