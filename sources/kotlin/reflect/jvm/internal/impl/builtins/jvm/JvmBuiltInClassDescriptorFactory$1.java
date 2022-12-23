package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import wf0.C25137a;
import zf0.C25485t;
import zf0.C25486u;

final class JvmBuiltInClassDescriptorFactory$1 extends Lambda implements C24236l<C25485t, C25137a> {

    /* renamed from: f */
    public static final JvmBuiltInClassDescriptorFactory$1 f60391f = new JvmBuiltInClassDescriptorFactory$1();

    public JvmBuiltInClassDescriptorFactory$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        C25485t tVar = (C25485t) obj;
        C24362h.m61211f(tVar, "module");
        List<C25486u> m0 = tVar.mo59458k0(C23882a.f60409f).mo59446m0();
        ArrayList arrayList = new ArrayList();
        for (T next : m0) {
            if (next instanceof C25137a) {
                arrayList.add(next);
            }
        }
        return (C25137a) C23825c.m58513j0(arrayList);
    }
}
