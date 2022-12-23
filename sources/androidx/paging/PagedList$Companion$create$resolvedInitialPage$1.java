package androidx.paging;

import androidx.paging.PagingSource;
import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", mo58555f = "PagedList.kt", mo58556l = {184}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo59060d2 = {"", "K", "T", "Lwh0/z;", "Landroidx/paging/PagingSource$b$b;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 5, 1})
final class PagedList$Companion$create$resolvedInitialPage$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super PagingSource.C1100b.C1102b<Object, Object>>, Object> {
    public final /* synthetic */ PagingSource<Object, Object> $pagingSource;
    public final /* synthetic */ PagingSource.C1096a.C1099c<Object> $params;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagedList$Companion$create$resolvedInitialPage$1(PagingSource<Object, Object> pagingSource, PagingSource.C1096a.C1099c<Object> cVar, C23349c<? super PagedList$Companion$create$resolvedInitialPage$1> cVar2) {
        super(2, cVar2);
        this.$pagingSource = pagingSource;
        this.$params = cVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new PagedList$Companion$create$resolvedInitialPage$1(this.$pagingSource, this.$params, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PagedList$Companion$create$resolvedInitialPage$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            PagingSource<Object, Object> pagingSource = this.$pagingSource;
            PagingSource.C1096a.C1099c<Object> cVar = this.$params;
            this.label = 1;
            obj = pagingSource.mo4402a(cVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PagingSource.C1100b bVar = (PagingSource.C1100b) obj;
        if (bVar instanceof PagingSource.C1100b.C1102b) {
            return (PagingSource.C1100b.C1102b) bVar;
        }
        if (!(bVar instanceof PagingSource.C1100b.C1101a)) {
            throw new NoWhenBranchMatchedException();
        }
        ((PagingSource.C1100b.C1101a) bVar).getClass();
        throw null;
    }
}
