package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import ag0.C20986c;
import ag0.C20989e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C23816b;
import kotlin.collections.C23825c;
import kotlin.sequences.C24177b;
import mf0.C24362h;
import th0.C24999f;
import ug0.C25066c;

public final class CompositeAnnotations implements C20989e {

    /* renamed from: b */
    public final List<C20989e> f60443b;

    public CompositeAnnotations(List<? extends C20989e> list) {
        C24362h.m61211f(list, "delegates");
        this.f60443b = list;
    }

    /* renamed from: b1 */
    public final boolean mo53070b1(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        Iterator<Object> it = C23825c.m58506c0(this.f60443b).iterator();
        while (it.hasNext()) {
            if (((C20989e) it.next()).mo53070b1(cVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final C20986c mo53071c(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        return (C20986c) C24177b.m60546g0(C24177b.m60550k0(C23825c.m58506c0(this.f60443b), new CompositeAnnotations$findAnnotation$1(cVar)));
    }

    public final boolean isEmpty() {
        List<C20989e> list = this.f60443b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (C20989e isEmpty : list) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<C20986c> iterator() {
        return new C24999f.C25000a(C24177b.m60547h0(C23825c.m58506c0(this.f60443b), CompositeAnnotations$iterator$1.f60444f));
    }

    public CompositeAnnotations(C20989e... eVarArr) {
        this((List<? extends C20989e>) C23816b.m58452h1(eVarArr));
    }
}
