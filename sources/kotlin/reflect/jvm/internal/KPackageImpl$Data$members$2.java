package kotlin.reflect.jvm.internal;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24225a;
import mf0.C24362h;
import sf0.C24866j;
import tf0.C24973i;

@Metadata(mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo59060d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KPackageImpl$Data$members$2 extends Lambda implements C24225a<Collection<? extends KCallableImpl<?>>> {
    public final /* synthetic */ KPackageImpl this$0;
    public final /* synthetic */ KPackageImpl.Data this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$members$2(KPackageImpl.Data data, KPackageImpl kPackageImpl) {
        super(0);
        this.this$0 = kPackageImpl;
        this.this$1 = data;
    }

    public final Object invoke() {
        KPackageImpl kPackageImpl = this.this$0;
        C24973i.C24974a aVar = this.this$1.f60243d;
        C24866j<Object> jVar = KPackageImpl.Data.f60241g[1];
        Object invoke = aVar.invoke();
        C24362h.m61210e(invoke, "<get-scope>(...)");
        return kPackageImpl.mo59318i((MemberScope) invoke, KDeclarationContainerImpl.MemberBelonginess.DECLARED);
    }
}
