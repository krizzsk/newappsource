package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.sequences.C24177b;
import lf0.C24236l;
import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25486u;
import zf0.C25488w;

public final class PackageFragmentProviderImpl implements C25488w {

    /* renamed from: a */
    public final Collection<C25486u> f60428a;

    public PackageFragmentProviderImpl(ArrayList arrayList) {
        this.f60428a = arrayList;
    }

    /* renamed from: a */
    public final void mo53521a(C25066c cVar, ArrayList arrayList) {
        C24362h.m61211f(cVar, "fqName");
        for (T next : this.f60428a) {
            if (C24362h.m61206a(((C25486u) next).mo53401f(), cVar)) {
                arrayList.add(next);
            }
        }
    }

    /* renamed from: b */
    public final List<C25486u> mo53522b(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        Collection<C25486u> collection = this.f60428a;
        ArrayList arrayList = new ArrayList();
        for (T next : collection) {
            if (C24362h.m61206a(((C25486u) next).mo53401f(), cVar)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final boolean mo53523c(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        Collection<C25486u> collection = this.f60428a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        for (C25486u f : collection) {
            if (C24362h.m61206a(f.mo53401f(), cVar)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public final Collection<C25066c> mo53524n(C25066c cVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(cVar, "fqName");
        C24362h.m61211f(lVar, "nameFilter");
        return C17875h.m44285I(C24177b.m60553n0(C24177b.m60543d0(C24177b.m60549j0(C23825c.m58506c0(this.f60428a), PackageFragmentProviderImpl$getSubPackagesOf$1.f60429f), new PackageFragmentProviderImpl$getSubPackagesOf$2(cVar))));
    }
}
