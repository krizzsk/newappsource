package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo59060d2 = {"<anonymous>", "", "line", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class StringsKt__IndentKt$getIndentFunction$2 extends Lambda implements C24236l<String, String> {
    public final /* synthetic */ String $indent = "";

    public StringsKt__IndentKt$getIndentFunction$2() {
        super(1);
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        C24362h.m61211f(str, "line");
        return C0016g.m31o(new StringBuilder(), this.$indent, str);
    }
}
