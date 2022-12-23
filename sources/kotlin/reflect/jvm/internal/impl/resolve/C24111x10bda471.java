package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import lf0.C24240p;
import lh0.C24274i0;
import mf0.C24362h;
import mh0.C24376c;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25448i0;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1 */
public final class C24111x10bda471 implements C24376c.C24377a {

    /* renamed from: a */
    public final /* synthetic */ boolean f61182a;

    /* renamed from: b */
    public final /* synthetic */ C23894a f61183b;

    /* renamed from: c */
    public final /* synthetic */ C23894a f61184c;

    public C24111x10bda471(C23894a aVar, C23894a aVar2, boolean z) {
        this.f61182a = z;
        this.f61183b = aVar;
        this.f61184c = aVar2;
    }

    /* renamed from: a */
    public final boolean mo60168a(C24274i0 i0Var, C24274i0 i0Var2) {
        C24362h.m61211f(i0Var, "c1");
        C24362h.m61211f(i0Var2, "c2");
        if (C24362h.m61206a(i0Var, i0Var2)) {
            return true;
        }
        C25437e o = i0Var.mo53460o();
        C25437e o2 = i0Var2.mo53460o();
        if (!(o instanceof C25448i0) || !(o2 instanceof C25448i0)) {
            return false;
        }
        boolean z = this.f61182a;
        final C23894a aVar = this.f61183b;
        final C23894a aVar2 = this.f61184c;
        return C24116a.f61198a.mo60176b((C25448i0) o, (C25448i0) o2, z, new C24240p<C25442g, C25442g, Boolean>() {
            public final Object invoke(Object obj, Object obj2) {
                boolean z;
                C25442g gVar = (C25442g) obj2;
                if (!C24362h.m61206a((C25442g) obj, aVar) || !C24362h.m61206a(gVar, aVar2)) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
    }
}
