package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import sf0.C24866j;
import tf0.C24973i;
import tf0.C24979k;
import zf0.C25490y;

@Metadata(mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo59060d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KParameterImpl$annotations$2 extends Lambda implements C24225a<List<? extends Annotation>> {
    public final /* synthetic */ KParameterImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KParameterImpl$annotations$2(KParameterImpl kParameterImpl) {
        super(0);
        this.this$0 = kParameterImpl;
    }

    public final Object invoke() {
        KParameterImpl kParameterImpl = this.this$0;
        C24866j<Object>[] jVarArr = KParameterImpl.f60247e;
        C24973i.C24974a aVar = kParameterImpl.f60251d;
        C24866j<Object> jVar = KParameterImpl.f60247e[0];
        Object invoke = aVar.invoke();
        C24362h.m61210e(invoke, "<get-descriptor>(...)");
        return C24979k.m62675b((C25490y) invoke);
    }
}
