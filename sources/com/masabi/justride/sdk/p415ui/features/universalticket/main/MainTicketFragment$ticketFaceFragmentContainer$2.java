package com.masabi.justride.sdk.p415ui.features.universalticket.main;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p605ki.C18061o;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Landroidx/fragment/app/FragmentContainerView;", "invoke"}, mo59061k = 3, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment$ticketFaceFragmentContainer$2 */
public final class MainTicketFragment$ticketFaceFragmentContainer$2 extends Lambda implements C24225a<FragmentContainerView> {
    public final /* synthetic */ MainTicketFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainTicketFragment$ticketFaceFragmentContainer$2(MainTicketFragment mainTicketFragment) {
        super(0);
        this.this$0 = mainTicketFragment;
    }

    public final Object invoke() {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(this.this$0.requireContext());
        fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        fragmentContainerView.setId(C18061o.ticketFaceFragmentContainer);
        return fragmentContainerView;
    }
}
