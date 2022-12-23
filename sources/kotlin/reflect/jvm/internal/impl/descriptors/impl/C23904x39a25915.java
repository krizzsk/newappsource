package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import cf0.C21136j;
import cg0.C21183m;
import cg0.C21199x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import zf0.C25487v;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2 */
final class C23904x39a25915 extends Lambda implements C24225a<C21183m> {
    public final /* synthetic */ C23909c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23904x39a25915(C23909c cVar) {
        super(0);
        this.this$0 = cVar;
    }

    public final Object invoke() {
        C23909c cVar = this.this$0;
        C21199x xVar = cVar.f60518h;
        if (xVar != null) {
            List<C23909c> a = xVar.mo53538a();
            this.this$0.mo59457W();
            a.contains(this.this$0);
            for (C23909c cVar2 : a) {
                cVar2.getClass();
            }
            ArrayList arrayList = new ArrayList(C21136j.m49436X(a, 10));
            for (C23909c cVar3 : a) {
                C25487v vVar = cVar3.f60519i;
                C24362h.m61208c(vVar);
                arrayList.add(vVar);
            }
            return new C21183m(arrayList, C24362h.m61216k(this.this$0.getName(), "CompositeProvider@ModuleDescriptor for "));
        }
        StringBuilder k = C13555b.m33972k("Dependencies of module ");
        String str = cVar.getName().f63263b;
        C24362h.m61210e(str, "name.toString()");
        k.append(str);
        k.append(" were not set before querying module content");
        throw new AssertionError(k.toString());
    }
}
