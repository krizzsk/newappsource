package mj0;

import java.lang.reflect.Constructor;
import java.util.Date;

/* renamed from: mj0.m */
public final class C24407m<T extends Date> {

    /* renamed from: a */
    public final Constructor<T> f61767a;

    public C24407m(Class<T> cls) throws Exception {
        this.f61767a = cls.getDeclaredConstructor(new Class[]{Long.TYPE});
    }
}
