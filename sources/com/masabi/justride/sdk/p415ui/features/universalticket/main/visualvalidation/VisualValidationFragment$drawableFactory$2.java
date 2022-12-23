package com.masabi.justride.sdk.p415ui.features.universalticket.main.visualvalidation;

import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p389bl.C13641g;
import p611ko.C18110b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lko/b;", "invoke", "()Lko/b;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.visualvalidation.VisualValidationFragment$drawableFactory$2 */
public final class VisualValidationFragment$drawableFactory$2 extends Lambda implements C24225a<C18110b> {
    public final /* synthetic */ VisualValidationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VisualValidationFragment$drawableFactory$2(VisualValidationFragment visualValidationFragment) {
        super(0);
        this.this$0 = visualValidationFragment;
    }

    public final Object invoke() {
        DisplayMetrics l = C13641g.m34124l(this.this$0);
        C24362h.m61210e(l, "displayMetrics");
        return new C18110b(l);
    }
}
