package com.masabi.justride.sdk.p415ui.features.universalticket.main;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import com.masabi.justride.sdk.p415ui.features.universalticket.components.UniversalTicketButtonFrame;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p389bl.C13641g;
import p584jl.C17885a;
import p605ki.C18061o;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Lcom/masabi/justride/sdk/ui/features/universalticket/components/UniversalTicketButtonFrame;", "invoke"}, mo59061k = 3, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment$importantActionButtonContainer$2 */
public final class MainTicketFragment$importantActionButtonContainer$2 extends Lambda implements C24225a<UniversalTicketButtonFrame> {
    public final /* synthetic */ MainTicketFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainTicketFragment$importantActionButtonContainer$2(MainTicketFragment mainTicketFragment) {
        super(0);
        this.this$0 = mainTicketFragment;
    }

    public final Object invoke() {
        Context requireContext = this.this$0.requireContext();
        C24362h.m61210e(requireContext, "requireContext()");
        UniversalTicketButtonFrame universalTicketButtonFrame = new UniversalTicketButtonFrame(requireContext, (AttributeSet) null, 0, (String) null, 62);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        DisplayMetrics l = C13641g.m34124l(this.this$0);
        C24362h.m61210e(l, "displayMetrics");
        int L = (int) C17885a.m44410L(l, 3.0f);
        marginLayoutParams.setMargins(0, L, 0, L);
        universalTicketButtonFrame.setLayoutParams(marginLayoutParams);
        universalTicketButtonFrame.setId(C18061o.importantActionButtonContainer);
        universalTicketButtonFrame.setButtonId(C18061o.importantActionButton);
        return universalTicketButtonFrame;
    }
}
