package com.masabi.justride.sdk.p415ui.features.universalticket.main;

import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p389bl.C13641g;
import p584jl.C17885a;
import p605ki.C18061o;
import p611ko.C18110b;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, mo59061k = 3, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment$visualValidationAndTicketFaceLinearLayout$2 */
public final class MainTicketFragment$visualValidationAndTicketFaceLinearLayout$2 extends Lambda implements C24225a<LinearLayout> {
    public final /* synthetic */ MainTicketFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainTicketFragment$visualValidationAndTicketFaceLinearLayout$2(MainTicketFragment mainTicketFragment) {
        super(0);
        this.this$0 = mainTicketFragment;
    }

    public final Object invoke() {
        LinearLayout linearLayout = new LinearLayout(this.this$0.requireContext());
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        DisplayMetrics l = C13641g.m34124l(this.this$0);
        C24362h.m61210e(l, "displayMetrics");
        marginLayoutParams.topMargin = (int) C17885a.m44410L(l, 5.0f);
        DisplayMetrics l2 = C13641g.m34124l(this.this$0);
        C24362h.m61210e(l2, "displayMetrics");
        marginLayoutParams.bottomMargin = (int) C17885a.m44410L(l2, 5.0f);
        linearLayout.setLayoutParams(marginLayoutParams);
        C18110b bVar = this.this$0.f37254g;
        if (bVar != null) {
            linearLayout.setBackground(bVar.mo50548a(8.0f, 0));
            linearLayout.setClipToOutline(true);
            linearLayout.setId(C18061o.visualBlockLayout);
            return linearLayout;
        }
        C24362h.m61217l("drawableFactory");
        throw null;
    }
}
