package androidx.paging;

import bf0.C21050d;
import cf0.C21140n;
import ff0.C23349c;
import gf0.C23413c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p178n2.C5824h;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", mo58555f = "PagedList.kt", mo58556l = {}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, mo59060d2 = {"", "T", "Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 5, 1})
final class PagedList$dispatchStateChangeAsync$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ C5824h $state;
    public final /* synthetic */ LoadType $type;
    public int label;
    public final /* synthetic */ PagedList<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagedList$dispatchStateChangeAsync$1(PagedList<Object> pagedList, LoadType loadType, C5824h hVar, C23349c<? super PagedList$dispatchStateChangeAsync$1> cVar) {
        super(2, cVar);
        this.this$0 = pagedList;
        this.$type = loadType;
        this.$state = hVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new PagedList$dispatchStateChangeAsync$1(this.this$0, this.$type, this.$state, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PagedList$dispatchStateChangeAsync$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C17885a.m44475z0(obj);
            C21140n.m49440b0(this.this$0.f4126i, C10951.f4147f);
            ArrayList arrayList = this.this$0.f4126i;
            LoadType loadType = this.$type;
            C5824h hVar = this.$state;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C24240p pVar = (C24240p) ((WeakReference) it.next()).get();
                if (pVar != null) {
                    pVar.invoke(loadType, hVar);
                }
            }
            return C21050d.f52856a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
