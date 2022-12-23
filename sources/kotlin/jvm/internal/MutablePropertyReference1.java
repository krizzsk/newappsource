package kotlin.jvm.internal;

import mf0.C24365j;
import sf0.C24854a;
import sf0.C24861g;
import sf0.C24864i;

public abstract class MutablePropertyReference1 extends MutablePropertyReference implements C24861g {
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public final C24854a computeReflected() {
        return C24365j.m61220b(this);
    }

    public final C24864i.C24865a getGetter() {
        return ((C24861g) getReflected()).getGetter();
    }

    public final Object invoke(Object obj) {
        return ((MutablePropertyReference1Impl) this).get(obj);
    }
}
