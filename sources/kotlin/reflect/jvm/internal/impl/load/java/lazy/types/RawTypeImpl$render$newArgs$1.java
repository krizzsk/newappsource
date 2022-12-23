package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

public final class RawTypeImpl$render$newArgs$1 extends Lambda implements C24236l<String, CharSequence> {

    /* renamed from: f */
    public static final RawTypeImpl$render$newArgs$1 f60714f = new RawTypeImpl$render$newArgs$1();

    public RawTypeImpl$render$newArgs$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        C24362h.m61211f(str, "it");
        return C24362h.m61216k(str, "(raw) ");
    }
}
