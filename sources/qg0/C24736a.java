package qg0;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import eg0.C23291b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import mf0.C24362h;
import qg0.C24757k;
import ug0.C25065b;
import ug0.C25069e;

/* renamed from: qg0.a */
public final class C24736a {

    /* renamed from: a */
    public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> f62612a;

    /* renamed from: b */
    public final /* synthetic */ HashMap<C24763n, List<Object>> f62613b;

    /* renamed from: qg0.a$a */
    public final class C24737a extends C24738b {

        /* renamed from: d */
        public final /* synthetic */ C24736a f62614d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24737a(C24736a aVar, C24763n nVar) {
            super(aVar, nVar);
            C24362h.m61211f(aVar, "this$0");
            this.f62614d = aVar;
        }

        /* renamed from: c */
        public final C24741d mo61225c(int i, C25065b bVar, C23291b bVar2) {
            C24763n nVar = this.f62615a;
            C24362h.m61211f(nVar, InAppPurchaseMetaData.KEY_SIGNATURE);
            C24763n nVar2 = new C24763n(nVar.f62663a + '@' + i);
            List list = this.f62614d.f62613b.get(nVar2);
            if (list == null) {
                list = new ArrayList();
                this.f62614d.f62613b.put(nVar2, list);
            }
            return AbstractBinaryClassAnnotationAndConstantLoader.m59174k(this.f62614d.f62612a, bVar, bVar2, list);
        }
    }

    /* renamed from: qg0.a$b */
    public class C24738b implements C24757k.C24760c {

        /* renamed from: a */
        public final C24763n f62615a;

        /* renamed from: b */
        public final ArrayList<Object> f62616b = new ArrayList<>();

        /* renamed from: c */
        public final /* synthetic */ C24736a f62617c;

        public C24738b(C24736a aVar, C24763n nVar) {
            C24362h.m61211f(aVar, "this$0");
            this.f62617c = aVar;
            this.f62615a = nVar;
        }

        /* renamed from: a */
        public final void mo59591a() {
            if (!this.f62616b.isEmpty()) {
                this.f62617c.f62613b.put(this.f62615a, this.f62616b);
            }
        }

        /* renamed from: b */
        public final C24757k.C24758a mo59592b(C25065b bVar, C23291b bVar2) {
            return AbstractBinaryClassAnnotationAndConstantLoader.m59174k(this.f62617c.f62612a, bVar, bVar2, this.f62616b);
        }
    }

    public C24736a(AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> abstractBinaryClassAnnotationAndConstantLoader, HashMap<C24763n, List<Object>> hashMap, HashMap<C24763n, Object> hashMap2) {
        this.f62612a = abstractBinaryClassAnnotationAndConstantLoader;
        this.f62613b = hashMap;
    }

    /* renamed from: a */
    public final C24738b mo61223a(C25069e eVar, String str) {
        C24362h.m61211f(str, "desc");
        String f = eVar.mo61604f();
        C24362h.m61210e(f, "name.asString()");
        return new C24738b(this, new C24763n(f + '#' + str));
    }

    /* renamed from: b */
    public final C24737a mo61224b(C25069e eVar, String str) {
        C24362h.m61211f(eVar, "name");
        String f = eVar.mo61604f();
        C24362h.m61210e(f, "name.asString()");
        return new C24737a(this, new C24763n(C24362h.m61216k(str, f)));
    }
}
