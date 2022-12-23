package com.masabi.justride.sdk.p415ui.features.universalticket.main;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p605ki.C18061o;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo59061k = 3, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment$finalizationReasonTextView$2 */
public final class MainTicketFragment$finalizationReasonTextView$2 extends Lambda implements C24225a<TextView> {
    public final /* synthetic */ MainTicketFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainTicketFragment$finalizationReasonTextView$2(MainTicketFragment mainTicketFragment) {
        super(0);
        this.this$0 = mainTicketFragment;
    }

    public final Object invoke() {
        TextView J1 = MainTicketFragment.m36836J1(this.this$0);
        J1.setId(C18061o.finalizationReasonTextView);
        J1.setTextColor(-1);
        J1.setBackgroundColor(-16777216);
        return J1;
    }
}
