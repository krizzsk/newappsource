package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import rf0.C24806h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lrf0/h;", "it", "", "invoke", "(Lrf0/h;)Ljava/lang/String;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class StringsKt__StringsKt$splitToSequence$1 extends Lambda implements C24236l<C24806h, String> {
    public final /* synthetic */ CharSequence $this_splitToSequence;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$splitToSequence$1(String str) {
        super(1);
        this.$this_splitToSequence = str;
    }

    public final Object invoke(Object obj) {
        C24806h hVar = (C24806h) obj;
        C24362h.m61211f(hVar, "it");
        return C24179b.m60578Z(this.$this_splitToSequence, hVar);
    }
}
