package com.masabi.justride.sdk.p415ui.features.universalticket.regulations;

import android.content.res.Resources;
import android.widget.TextView;
import androidx.core.widget.C0801k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p605ki.C18059m;
import p605ki.C18066t;
import p605ki.C18067u;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo59061k = 3, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.regulations.TicketRegulationsFragment$titleTextView$2 */
public final class TicketRegulationsFragment$titleTextView$2 extends Lambda implements C24225a<TextView> {
    public final /* synthetic */ TicketRegulationsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TicketRegulationsFragment$titleTextView$2(TicketRegulationsFragment ticketRegulationsFragment) {
        super(0);
        this.this$0 = ticketRegulationsFragment;
    }

    public final Object invoke() {
        TextView textView = new TextView(this.this$0.getContext());
        textView.setText(this.this$0.getString(C18066t.com_masabi_justride_sdk_terms));
        C0801k.m2424f(textView, C18067u.JustRideSDKUniversalTitleTextAppearance);
        textView.setGravity(8388611);
        textView.setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.4f);
        TicketRegulationsFragment ticketRegulationsFragment = this.this$0;
        int i = TicketRegulationsFragment.f37283f;
        Resources resources = ticketRegulationsFragment.getResources();
        int i2 = C18059m.com_masabi_justride_sdk_universal_ticket_default_padding;
        textView.setPadding(resources.getDimensionPixelSize(i2), 0, this.this$0.getResources().getDimensionPixelSize(i2), this.this$0.getResources().getDimensionPixelSize(C18059m.com_masabi_justride_sdk_ticket_regulations_vertical_padding));
        return textView;
    }
}
