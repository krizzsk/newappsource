package androidx.paging;

import androidx.paging.PagedList;
import bf0.C21050d;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lf0.C24240p;
import mf0.C24362h;
import p178n2.C5816a;
import p178n2.C5824h;

@Metadata(mo59061k = 3, mo59062mv = {1, 5, 1}, mo59064xi = 48)
final /* synthetic */ class AsyncPagedListDiffer$loadStateListener$1 extends FunctionReferenceImpl implements C24240p<LoadType, C5824h, C21050d> {
    public AsyncPagedListDiffer$loadStateListener$1(C5816a aVar) {
        super(2, aVar, PagedList.C1093d.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        LoadType loadType = (LoadType) obj;
        C5824h hVar = (C5824h) obj2;
        C24362h.m61211f(loadType, "p0");
        C24362h.m61211f(hVar, "p1");
        ((PagedList.C1093d) this.receiver).mo4419b(loadType, hVar);
        return C21050d.f52856a;
    }
}
