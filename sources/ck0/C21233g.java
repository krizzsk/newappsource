package ck0;

import ck0.C21227c;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: ck0.g */
public final class C21233g extends C21227c.C21228a {

    /* renamed from: a */
    public static final C21233g f53172a = new C21233g();

    /* renamed from: a */
    public final C21227c mo53590a(Type type) {
        if (C21273u.m49949e(type) != C21226b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C21232f(C21273u.m49948d(0, (ParameterizedType) type));
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
