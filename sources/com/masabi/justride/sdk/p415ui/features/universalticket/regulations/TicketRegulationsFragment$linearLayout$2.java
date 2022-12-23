package com.masabi.justride.sdk.p415ui.features.universalticket.regulations;

import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, mo59061k = 3, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.regulations.TicketRegulationsFragment$linearLayout$2 */
public final class TicketRegulationsFragment$linearLayout$2 extends Lambda implements C24225a<LinearLayout> {
    public final /* synthetic */ TicketRegulationsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TicketRegulationsFragment$linearLayout$2(TicketRegulationsFragment ticketRegulationsFragment) {
        super(0);
        this.this$0 = ticketRegulationsFragment;
    }

    public final Object invoke() {
        LinearLayout linearLayout = new LinearLayout(this.this$0.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView((TextView) this.this$0.f37286d.getValue());
        linearLayout.addView((TextView) this.this$0.f37287e.getValue());
        return linearLayout;
    }
}
