package kotlin.reflect.jvm.internal;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import lf0.C24225a;

@Metadata(mo59059d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo59060d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", "", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KClassImpl$Data$declaredNonStaticMembers$2 extends Lambda implements C24225a<Collection<? extends KCallableImpl<?>>> {
    public final /* synthetic */ KClassImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$declaredNonStaticMembers$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = kClassImpl;
    }

    public final Object invoke() {
        KClassImpl<T> kClassImpl = this.this$0;
        return kClassImpl.mo59318i(kClassImpl.mo59312t(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
    }
}
