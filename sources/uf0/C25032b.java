package uf0;

import ce0.C21100e;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import mf0.C24362h;
import p358af.C13437d;

/* renamed from: uf0.b */
public interface C25032b<M extends Member> {

    /* renamed from: uf0.b$a */
    public static final class C25033a {
        /* renamed from: a */
        public static <M extends Member> void m62749a(C25032b<? extends M> bVar, Object[] objArr) {
            C24362h.m61211f(bVar, "this");
            C24362h.m61211f(objArr, "args");
            if (C21100e.m49330Y(bVar) != objArr.length) {
                StringBuilder k = C13555b.m33972k("Callable expects ");
                k.append(C21100e.m49330Y(bVar));
                k.append(" arguments, but ");
                throw new IllegalArgumentException(C13437d.m33707l(k, objArr.length, " were provided."));
            }
        }
    }

    /* renamed from: a */
    Object mo59358a(Object[] objArr);

    /* renamed from: b */
    List<Type> mo59359b();

    /* renamed from: c */
    M mo59360c();

    /* renamed from: i */
    Type mo59361i();
}
