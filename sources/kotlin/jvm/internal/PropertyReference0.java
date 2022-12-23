package kotlin.jvm.internal;

import mf0.C24365j;
import sf0.C24854a;
import sf0.C24862h;

public abstract class PropertyReference0 extends PropertyReference implements C24862h {
    public PropertyReference0(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, 1);
    }

    public final C24854a computeReflected() {
        return C24365j.f61688a.mo59368f(this);
    }

    public final C24862h.C24863a getGetter() {
        return ((C24862h) getReflected()).getGetter();
    }

    public final Object invoke() {
        return get();
    }
}
