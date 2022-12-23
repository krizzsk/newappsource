package com.masabi.justride.sdk.p415ui.features.universalticket.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p605ki.C18067u;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Landroid/widget/Button;", "invoke"}, mo59061k = 3, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame$button$2 */
final class UniversalTicketButtonFrame$button$2 extends Lambda implements C24225a<Button> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UniversalTicketButtonFrame this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UniversalTicketButtonFrame$button$2(UniversalTicketButtonFrame universalTicketButtonFrame, Context context) {
        super(0);
        this.this$0 = universalTicketButtonFrame;
        this.$context = context;
    }

    public final Object invoke() {
        Button button = new Button(this.$context, (AttributeSet) null, 0, C18067u.JustRideSDKUniversalTicketButton);
        button.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        button.setClickable(false);
        button.setFocusable(false);
        return button;
    }
}
