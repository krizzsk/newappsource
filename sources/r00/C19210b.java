package r00;

import ce0.C21100e;
import java.lang.Enum;
import java.util.List;

/* renamed from: r00.b */
public abstract class C19210b<E extends Enum<E>, T> extends C19213e<T> {

    /* renamed from: c */
    public final Class<E> f48813c;

    public C19210b(String str, Class<E> cls, List<T> list) {
        super(str, list);
        C21100e.m49373x(cls, "clazz");
        this.f48813c = cls;
    }

    /* renamed from: c */
    public final T mo51507c(String str) throws Exception {
        try {
            return mo51506d(Enum.valueOf(this.f48813c, str));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public abstract T mo51506d(E e) throws Exception;
}
