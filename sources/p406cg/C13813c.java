package p406cg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: cg.c */
public final class C13813c implements C13821j<Object> {

    /* renamed from: b */
    public final /* synthetic */ Constructor f34000b;

    public C13813c(Constructor constructor) {
        this.f34000b = constructor;
    }

    /* renamed from: g */
    public final Object mo40737g() {
        try {
            return this.f34000b.newInstance((Object[]) null);
        } catch (InstantiationException e) {
            StringBuilder k = C13555b.m33972k("Failed to invoke ");
            k.append(this.f34000b);
            k.append(" with no args");
            throw new RuntimeException(k.toString(), e);
        } catch (InvocationTargetException e2) {
            StringBuilder k2 = C13555b.m33972k("Failed to invoke ");
            k2.append(this.f34000b);
            k2.append(" with no args");
            throw new RuntimeException(k2.toString(), e2.getTargetException());
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
