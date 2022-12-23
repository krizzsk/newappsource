package androidx.paging;

import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import bf0.C21050d;
import ce0.C21100e;
import com.moovit.home.lines.search.C16002a;
import ff0.C23349c;
import gf0.C23413c;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p178n2.C5833n;
import p178n2.C5838o;
import p178n2.C5839p;
import p584jl.C17885a;
import wh0.C25192l;
import wh0.C25235z;

@C23413c(mo58554c = "androidx.paging.LegacyPagingSource$load$2", mo58555f = "LegacyPagingSource.kt", mo58556l = {111}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@"}, mo59060d2 = {"", "Key", "Value", "Lwh0/z;", "Landroidx/paging/PagingSource$b$b;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 5, 1})
public final class LegacyPagingSource$load$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super PagingSource.C1100b.C1102b<Key, Value>>, Object> {
    public final /* synthetic */ DataSource.C1086c<Key> $dataSourceParams;
    public final /* synthetic */ PagingSource.C1096a<Key> $params;
    public int label;
    public final /* synthetic */ LegacyPagingSource<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyPagingSource$load$2(LegacyPagingSource<Key, Value> legacyPagingSource, DataSource.C1086c<Key> cVar, PagingSource.C1096a<Key> aVar, C23349c<? super LegacyPagingSource$load$2> cVar2) {
        super(2, cVar2);
        this.this$0 = legacyPagingSource;
        this.$dataSourceParams = cVar;
        this.$params = aVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new LegacyPagingSource$load$2(this.this$0, this.$dataSourceParams, this.$params, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((LegacyPagingSource$load$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        int i;
        List list;
        int i2;
        int i3;
        List list2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            C17885a.m44475z0(obj);
            DataSource<Key, Value> dataSource = this.this$0.f4116c;
            DataSource.C1086c<Key> cVar = this.$dataSourceParams;
            this.label = 1;
            C5833n nVar = (C5833n) dataSource;
            nVar.getClass();
            if (cVar.f4109a == LoadType.REFRESH) {
                int i5 = cVar.f4111c;
                K k = cVar.f4110b;
                if (k != null) {
                    int intValue = ((Number) k).intValue();
                    if (cVar.f4112d) {
                        int max = Math.max(i5 / cVar.f4113e, 2);
                        int i6 = cVar.f4113e;
                        i5 = max * i6;
                        i2 = Math.max(0, ((intValue - (i5 / 2)) / i6) * i6);
                    } else {
                        i2 = Math.max(0, intValue - (i5 / 2));
                    }
                } else {
                    i2 = 0;
                }
                C5833n.C5835b bVar = new C5833n.C5835b(i2, i5, cVar.f4113e, cVar.f4112d);
                C25192l lVar = new C25192l(1, C21100e.m49351l0(this));
                lVar.mo61835t();
                C5838o oVar = new C5838o(nVar, lVar, bVar);
                C16002a aVar = (C16002a) nVar;
                if (aVar.f4103a.f18784e) {
                    i3 = 0;
                } else {
                    i3 = aVar.f41654b.f41681d;
                }
                if (i3 == 0) {
                    oVar.mo21713a(0, 0, Collections.emptyList());
                } else {
                    int max2 = Math.max(0, i2);
                    int min = Math.min(i3 - 1, (i5 + max2) - 1);
                    if (max2 < i3) {
                        list2 = aVar.mo48162d(max2, min);
                    } else {
                        list2 = Collections.emptyList();
                    }
                    oVar.mo21713a(max2, i3, list2);
                    Objects.toString(aVar.f41654b.f41679b);
                    list2.size();
                }
                obj = lVar.mo61834s();
            } else {
                K k2 = cVar.f4110b;
                C24362h.m61208c(k2);
                int intValue2 = ((Number) k2).intValue();
                int i7 = cVar.f4113e;
                if (cVar.f4109a == LoadType.PREPEND) {
                    i7 = Math.min(i7, intValue2);
                    intValue2 -= i7;
                }
                C5833n.C5837d dVar = new C5833n.C5837d(intValue2, i7);
                C25192l lVar2 = new C25192l(1, C21100e.m49351l0(this));
                lVar2.mo61835t();
                C5839p pVar = new C5839p(dVar, nVar, lVar2);
                C16002a aVar2 = (C16002a) nVar;
                if (aVar2.f4103a.f18784e) {
                    i = 0;
                } else {
                    i = aVar2.f41654b.f41681d;
                }
                if (i == 0) {
                    pVar.mo21714a(Collections.emptyList());
                } else {
                    int max3 = Math.max(0, intValue2);
                    int min2 = Math.min(i - 1, (i7 + max3) - 1);
                    if (max3 < i) {
                        list = aVar2.mo48162d(max3, min2);
                    } else {
                        list = Collections.emptyList();
                    }
                    pVar.mo21714a(list);
                    Objects.toString(aVar2.f41654b.f41679b);
                    list.size();
                }
                obj = lVar2.mo61834s();
            }
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i4 == 1) {
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PagingSource.C1096a<Key> aVar3 = this.$params;
        DataSource.C1084a aVar4 = (DataSource.C1084a) obj;
        List<Value> list3 = aVar4.f4104a;
        if (!list3.isEmpty() || !(aVar3 instanceof PagingSource.C1096a.C1098b)) {
            obj2 = aVar4.f4105b;
        } else {
            obj2 = null;
        }
        if (!aVar4.f4104a.isEmpty() || !(aVar3 instanceof PagingSource.C1096a.C1097a)) {
            obj3 = aVar4.f4106c;
        } else {
            obj3 = null;
        }
        return new PagingSource.C1100b.C1102b(list3, obj2, obj3, aVar4.f4107d, aVar4.f4108e);
    }
}
