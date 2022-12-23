package wf0;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import mf0.C24362h;
import ug0.C25065b;
import ug0.C25066c;

/* renamed from: wf0.b */
public final class C25138b {

    /* renamed from: a */
    public static final LinkedHashSet f63413a;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(set, 10));
        for (PrimitiveType primitiveType : set) {
            C24362h.m61211f(primitiveType, "primitiveType");
            arrayList.add(C23872e.f60330i.mo61581c(primitiveType.getTypeName()));
        }
        C25066c i = C23872e.C23873a.f60368f.mo61600i();
        C24362h.m61210e(i, "string.toSafe()");
        ArrayList y0 = C23825c.m58528y0(i, arrayList);
        C25066c i2 = C23872e.C23873a.f60370h.mo61600i();
        C24362h.m61210e(i2, "_boolean.toSafe()");
        ArrayList y02 = C23825c.m58528y0(i2, y0);
        C25066c i3 = C23872e.C23873a.f60372j.mo61600i();
        C24362h.m61210e(i3, "_enum.toSafe()");
        ArrayList y03 = C23825c.m58528y0(i3, y02);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = y03.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C25065b.m62790l((C25066c) it.next()));
        }
        f63413a = linkedHashSet;
    }
}
