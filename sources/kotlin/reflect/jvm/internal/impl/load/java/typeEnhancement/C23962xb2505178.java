package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import bf0.C21050d;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import pg0.C24698d;
import pg0.C24702h;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$8 */
public final class C23962xb2505178 extends Lambda implements C24236l<C24702h.C24703a.C24704a, C21050d> {
    public final /* synthetic */ String $JFBiFunction;
    public final /* synthetic */ String $JLObject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23962xb2505178(String str, String str2) {
        super(1);
        this.$JLObject = str;
        this.$JFBiFunction = str2;
    }

    public final Object invoke(Object obj) {
        C24702h.C24703a.C24704a aVar = (C24702h.C24703a.C24704a) obj;
        C24362h.m61211f(aVar, "$this$function");
        String str = this.$JLObject;
        C24698d dVar = PredefinedEnhancementInfoKt.f60726b;
        aVar.mo61185a(str, dVar);
        String str2 = this.$JFBiFunction;
        C24698d dVar2 = PredefinedEnhancementInfoKt.f60725a;
        aVar.mo61185a(str2, dVar, dVar, PredefinedEnhancementInfoKt.f60727c, dVar2);
        aVar.mo61186b(this.$JLObject, dVar2);
        return C21050d.f52856a;
    }
}
