package androidx.paging;

import androidx.paging.PagingSource;
import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import wh0.C25177g;
import wh0.C25235z;

@C23413c(mo58554c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", mo58555f = "LegacyPageFetcher.kt", mo58556l = {53}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo59060d2 = {"", "K", "V", "Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 5, 1})
final class LegacyPageFetcher$scheduleLoad$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ PagingSource.C1096a<Object> $params;
    public final /* synthetic */ LoadType $type;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C1106b<Object, Object> this$0;

    @C23413c(mo58554c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", mo58555f = "LegacyPageFetcher.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo59060d2 = {"", "K", "V", "Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 5, 1})
    /* renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1$1 */
    public static final class C10871 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
        public int label;

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            return new C10871(bVar, bVar2, loadType, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C10871) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C17885a.m44475z0(obj);
                PagingSource.C1100b<Object, Object> bVar = bVar;
                if (bVar instanceof PagingSource.C1100b.C1102b) {
                    bVar2.mo4430a(loadType, (PagingSource.C1100b.C1102b) bVar);
                } else if (bVar instanceof PagingSource.C1100b.C1101a) {
                    C1106b<Object, Object> bVar2 = bVar2;
                    ((PagingSource.C1100b.C1101a) bVar).getClass();
                    if (!bVar2.f4179h.get()) {
                        C24362h.m61211f((Object) null, "error");
                        throw null;
                    }
                }
                return C21050d.f52856a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyPageFetcher$scheduleLoad$1(C1106b<Object, Object> bVar, PagingSource.C1096a<Object> aVar, LoadType loadType, C23349c<? super LegacyPageFetcher$scheduleLoad$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
        this.$params = aVar;
        this.$type = loadType;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        LegacyPageFetcher$scheduleLoad$1 legacyPageFetcher$scheduleLoad$1 = new LegacyPageFetcher$scheduleLoad$1(this.this$0, this.$params, this.$type, cVar);
        legacyPageFetcher$scheduleLoad$1.L$0 = obj;
        return legacyPageFetcher$scheduleLoad$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((LegacyPageFetcher$scheduleLoad$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        C25235z zVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            C25235z zVar2 = (C25235z) this.L$0;
            PagingSource<K, V> pagingSource = this.this$0.f4174c;
            PagingSource.C1096a<Object> aVar = this.$params;
            this.L$0 = zVar2;
            this.label = 1;
            Object a = pagingSource.mo4402a(aVar, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            zVar = zVar2;
            obj = a;
        } else if (i == 1) {
            zVar = (C25235z) this.L$0;
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        final PagingSource.C1100b bVar = (PagingSource.C1100b) obj;
        final C1106b<Object, Object> bVar2 = this.this$0;
        if (bVar2.f4174c.f4148a.f18784e) {
            bVar2.f4179h.set(true);
            return C21050d.f52856a;
        }
        CoroutineDispatcher coroutineDispatcher = bVar2.f4175d;
        final LoadType loadType = this.$type;
        C25177g.m63218b(zVar, coroutineDispatcher, new C10871((C23349c<? super C10871>) null), 2);
        return C21050d.f52856a;
    }
}
