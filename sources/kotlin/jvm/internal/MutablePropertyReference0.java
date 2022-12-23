package kotlin.jvm.internal;

import mf0.C24365j;
import sf0.C24854a;
import sf0.C24859f;
import sf0.C24862h;

public abstract class MutablePropertyReference0 extends MutablePropertyReference implements C24859f {
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public C24854a computeReflected() {
        return C24365j.f61688a.mo59366d(this);
    }

    public C24862h.C24863a getGetter() {
        return ((C24859f) getReflected()).getGetter();
    }

    public C24859f.C24860a getSetter() {
        return ((C24859f) getReflected()).getSetter();
    }

    public Object invoke() {
        return get();
    }
}
