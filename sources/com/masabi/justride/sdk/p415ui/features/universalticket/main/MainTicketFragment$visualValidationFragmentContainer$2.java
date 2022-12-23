package com.masabi.justride.sdk.p415ui.features.universalticket.main;

import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p389bl.C13641g;
import p584jl.C17885a;
import p605ki.C18061o;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Landroidx/fragment/app/FragmentContainerView;", "invoke"}, mo59061k = 3, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment$visualValidationFragmentContainer$2 */
public final class MainTicketFragment$visualValidationFragmentContainer$2 extends Lambda implements C24225a<FragmentContainerView> {
    public final /* synthetic */ MainTicketFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainTicketFragment$visualValidationFragmentContainer$2(MainTicketFragment mainTicketFragment) {
        super(0);
        this.this$0 = mainTicketFragment;
    }

    public final Object invoke() {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(this.this$0.requireContext());
        DisplayMetrics l = C13641g.m34124l(this.this$0);
        C24362h.m61210e(l, "displayMetrics");
        fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) C17885a.m44410L(l, 50.0f)));
        fragmentContainerView.setId(C18061o.visualValidationFragmentContainer);
        return fragmentContainerView;
    }
}
