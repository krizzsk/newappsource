package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import lf0.C24236l;
import lh0.C24307v;
import mf0.C24362h;
import mh0.C24376c;
import zf0.C25433c0;

public final class OperatorChecks$checks$3 extends Lambda implements C24236l<C23900c, String> {

    /* renamed from: f */
    public static final OperatorChecks$checks$3 f61378f = new OperatorChecks$checks$3();

    public OperatorChecks$checks$3() {
        super(1);
    }

    public final Object invoke(Object obj) {
        boolean z;
        C23900c cVar = (C23900c) obj;
        C24362h.m61211f(cVar, "$this$$receiver");
        C25433c0 O = cVar.mo53422O();
        if (O == null) {
            O = cVar.mo53423R();
        }
        OperatorChecks operatorChecks = OperatorChecks.f61374b;
        boolean z2 = false;
        if (O != null) {
            C24307v i = cVar.mo53443i();
            if (i == null) {
                z = false;
            } else {
                C24307v type = O.getType();
                C24362h.m61210e(type, "receiver.type");
                z = C24376c.f61714a.mo60531f(i, type);
            }
            if (z) {
                z2 = true;
            }
        }
        if (!z2) {
            return "receiver must be a supertype of the return type";
        }
        return null;
    }
}
