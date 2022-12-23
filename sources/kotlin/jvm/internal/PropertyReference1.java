package kotlin.jvm.internal;

import mf0.C24365j;
import sf0.C24854a;
import sf0.C24864i;

public abstract class PropertyReference1 extends PropertyReference implements C24864i {
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public C24854a computeReflected() {
        return C24365j.m61221c(this);
    }

    public C24864i.C24865a getGetter() {
        return ((C24864i) getReflected()).getGetter();
    }

    public Object invoke(Object obj) {
        return get(obj);
    }
}
