package lg0;

import bf0.C21050d;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import mf0.C24362h;
import rh0.C24814b;
import zf0.C25432c;

/* renamed from: lg0.b */
public final class C24250b extends C24814b.C24815a<C25432c, C21050d> {

    /* renamed from: a */
    public final /* synthetic */ C25432c f61531a;

    /* renamed from: b */
    public final /* synthetic */ Set<Object> f61532b;

    /* renamed from: c */
    public final /* synthetic */ C24236l<MemberScope, Collection<Object>> f61533c;

    public C24250b(LazyJavaClassDescriptor lazyJavaClassDescriptor, Set set, C24236l lVar) {
        this.f61531a = lazyJavaClassDescriptor;
        this.f61532b = set;
        this.f61533c = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo53186a() {
        return C21050d.f52856a;
    }

    /* renamed from: c */
    public final boolean mo53188c(Object obj) {
        C25432c cVar = (C25432c) obj;
        C24362h.m61211f(cVar, "current");
        if (cVar != this.f61531a) {
            MemberScope r0 = cVar.mo53515r0();
            C24362h.m61210e(r0, "current.staticScope");
            if (r0 instanceof C24251c) {
                this.f61532b.addAll(this.f61533c.invoke(r0));
                return false;
            }
        }
        return true;
    }
}
