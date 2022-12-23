package androidx.paging;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1", mo58555f = "ContiguousPagedList.kt", mo58556l = {}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo59060d2 = {"", "K", "V", "Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 5, 1})
public final class ContiguousPagedList$tryDispatchBoundaryCallbacks$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ boolean $dispatchBegin;
    public final /* synthetic */ boolean $dispatchEnd;
    public int label;
    public final /* synthetic */ ContiguousPagedList<K, V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList$tryDispatchBoundaryCallbacks$1(ContiguousPagedList<K, V> contiguousPagedList, boolean z, boolean z2, C23349c<? super ContiguousPagedList$tryDispatchBoundaryCallbacks$1> cVar) {
        super(2, cVar);
        this.this$0 = contiguousPagedList;
        this.$dispatchBegin = z;
        this.$dispatchEnd = z2;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new ContiguousPagedList$tryDispatchBoundaryCallbacks$1(this.this$0, this.$dispatchBegin, this.$dispatchEnd, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ContiguousPagedList$tryDispatchBoundaryCallbacks$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C17885a.m44475z0(obj);
            ContiguousPagedList<K, V> contiguousPagedList = this.this$0;
            boolean z = this.$dispatchBegin;
            boolean z2 = this.$dispatchEnd;
            int i = ContiguousPagedList.f4091v;
            contiguousPagedList.getClass();
            if (z) {
                C24362h.m61208c((Object) null);
                throw null;
            } else if (!z2) {
                return C21050d.f52856a;
            } else {
                C24362h.m61208c((Object) null);
                throw null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
