package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kh0.C23787c;
import kh0.C23792h;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25434d;
import zf0.C25486u;

public final class NotFoundClasses$classes$1 extends Lambda implements C24236l<NotFoundClasses.C23888a, C25432c> {
    public final /* synthetic */ NotFoundClasses this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotFoundClasses$classes$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.this$0 = notFoundClasses;
    }

    public final Object invoke(Object obj) {
        C25434d dVar;
        int i;
        NotFoundClasses.C23888a aVar = (NotFoundClasses.C23888a) obj;
        C24362h.m61211f(aVar, "$dstr$classId$typeParametersCount");
        C25065b bVar = aVar.f60423a;
        List<Integer> list = aVar.f60424b;
        if (!bVar.f63252c) {
            C25065b g = bVar.mo61573g();
            if (g == null) {
                C23787c<C25066c, C25486u> cVar = this.this$0.f60421c;
                C25066c h = bVar.mo61574h();
                C24362h.m61210e(h, "classId.packageFqName");
                dVar = (C25434d) ((LockBasedStorageManager.C24148k) cVar).invoke(h);
            } else {
                dVar = this.this$0.mo59412a(g, C23825c.m58508e0(list, 1));
            }
            C25434d dVar2 = dVar;
            boolean k = bVar.mo61578k();
            C23792h hVar = this.this$0.f60419a;
            C25069e j = bVar.mo61577j();
            C24362h.m61210e(j, "classId.shortClassName");
            Integer num = (Integer) C23825c.m58515l0(list);
            if (num == null) {
                i = 0;
            } else {
                i = num.intValue();
            }
            return new NotFoundClasses.C23889b(hVar, dVar2, j, k, i);
        }
        throw new UnsupportedOperationException(C24362h.m61216k(bVar, "Unresolved local class: "));
    }
}
