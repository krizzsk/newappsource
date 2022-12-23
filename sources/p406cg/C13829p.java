package p406cg;

import java.lang.reflect.Modifier;

/* renamed from: cg.p */
public abstract class C13829p {
    /* renamed from: a */
    public static void m34503a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException(C25541a.m63876f(cls, C13555b.m33972k("Interface can't be instantiated! Interface name: ")));
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException(C25541a.m63876f(cls, C13555b.m33972k("Abstract class can't be instantiated! Class name: ")));
        }
    }

    /* renamed from: b */
    public abstract <T> T mo40754b(Class<T> cls) throws Exception;
}
