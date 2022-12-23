package com.masabi.justride.sdk.p415ui.features.universalticket.regulations;

import android.content.res.Resources;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p584jl.C17885a;
import p605ki.C18059m;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo59061k = 3, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.regulations.TicketRegulationsFragment$bodyTextView$2 */
public final class TicketRegulationsFragment$bodyTextView$2 extends Lambda implements C24225a<TextView> {
    public final /* synthetic */ TicketRegulationsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TicketRegulationsFragment$bodyTextView$2(TicketRegulationsFragment ticketRegulationsFragment) {
        super(0);
        this.this$0 = ticketRegulationsFragment;
    }

    public final Object invoke() {
        TextView textView = new TextView(this.this$0.getContext());
        TicketRegulationsFragment ticketRegulationsFragment = this.this$0;
        int i = TicketRegulationsFragment.f37283f;
        Resources resources = ticketRegulationsFragment.getResources();
        int i2 = C18059m.com_masabi_justride_sdk_universal_ticket_default_padding;
        textView.setPadding(resources.getDimensionPixelSize(i2), 0, this.this$0.getResources().getDimensionPixelSize(i2), 0);
        C17885a.m44471x0(textView);
        return textView;
    }
}
