package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import bf0.C21050d;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import pg0.C24702h;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$3 */
public final class C23966xb2505534 extends Lambda implements C24236l<C24702h.C24703a.C24704a, C21050d> {
    public final /* synthetic */ String $JLObject;
    public final /* synthetic */ String $JUOptional;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23966xb2505534(String str, String str2) {
        super(1);
        this.$JLObject = str;
        this.$JUOptional = str2;
    }

    public final Object invoke(Object obj) {
        C24702h.C24703a.C24704a aVar = (C24702h.C24703a.C24704a) obj;
        C24362h.m61211f(aVar, "$this$function");
        aVar.mo61185a(this.$JLObject, PredefinedEnhancementInfoKt.f60725a);
        aVar.mo61186b(this.$JUOptional, PredefinedEnhancementInfoKt.f60726b, PredefinedEnhancementInfoKt.f60727c);
        return C21050d.f52856a;
    }
}
