package p178n2;

import androidx.paging.C1103a;
import androidx.paging.LoadType;
import androidx.paging.PagedList;
import java.util.Iterator;
import lf0.C24240p;
import mf0.C24362h;

/* renamed from: n2.a */
public final class C5816a extends PagedList.C1093d {

    /* renamed from: d */
    public final /* synthetic */ C1103a<Object> f18763d;

    public C5816a(C1103a<Object> aVar) {
        this.f18763d = aVar;
    }

    /* renamed from: a */
    public final void mo4418a(LoadType loadType, C5824h hVar) {
        C24362h.m61211f(loadType, "type");
        C24362h.m61211f(hVar, "state");
        Iterator it = this.f18763d.f4169i.iterator();
        while (it.hasNext()) {
            ((C24240p) it.next()).invoke(loadType, hVar);
        }
    }
}
