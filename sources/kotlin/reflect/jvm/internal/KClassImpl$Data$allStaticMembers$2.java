package kotlin.reflect.jvm.internal;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import lf0.C24225a;
import mf0.C24362h;
import sf0.C24866j;
import tf0.C24973i;

@Metadata(mo59059d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo59060d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", "", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KClassImpl$Data$allStaticMembers$2 extends Lambda implements C24225a<List<? extends KCallableImpl<?>>> {
    public final /* synthetic */ KClassImpl<T>.Data this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$allStaticMembers$2(KClassImpl<T>.Data data) {
        super(0);
        this.this$0 = data;
    }

    public final Object invoke() {
        C24973i.C24974a aVar = this.this$0.f60216g;
        C24866j<Object>[] jVarArr = KClassImpl.Data.f60211l;
        C24866j<Object> jVar = jVarArr[11];
        Object invoke = aVar.invoke();
        C24362h.m61210e(invoke, "<get-declaredStaticMembers>(...)");
        C24973i.C24974a aVar2 = this.this$0.f60218i;
        C24866j<Object> jVar2 = jVarArr[13];
        Object invoke2 = aVar2.invoke();
        C24362h.m61210e(invoke2, "<get-inheritedStaticMembers>(...)");
        return C23825c.m58527x0((Collection) invoke2, (Collection) invoke);
    }
}
