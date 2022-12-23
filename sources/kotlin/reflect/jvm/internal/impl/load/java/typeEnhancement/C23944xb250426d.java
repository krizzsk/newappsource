package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import bf0.C21050d;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import pg0.C24698d;
import pg0.C24702h;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$1$1 */
public final class C23944xb250426d extends Lambda implements C24236l<C24702h.C24703a.C24704a, C21050d> {
    public final /* synthetic */ String $JFConsumer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23944xb250426d(String str) {
        super(1);
        this.$JFConsumer = str;
    }

    public final Object invoke(Object obj) {
        C24702h.C24703a.C24704a aVar = (C24702h.C24703a.C24704a) obj;
        C24362h.m61211f(aVar, "$this$function");
        String str = this.$JFConsumer;
        C24698d dVar = PredefinedEnhancementInfoKt.f60726b;
        aVar.mo61185a(str, dVar, dVar);
        return C21050d.f52856a;
    }
}
