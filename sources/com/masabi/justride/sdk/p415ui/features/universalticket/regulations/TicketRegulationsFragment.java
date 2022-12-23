package com.masabi.justride.sdk.p415ui.features.universalticket.regulations;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1044w;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.masabi.justride.sdk.exception.MissingArgumentException;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.p415ui.features.universalticket.components.FrostedScrollView;
import kotlin.C23812a;
import kotlin.Metadata;
import mf0.C24361g;
import mf0.C24362h;
import p583jk.C17884p;
import p605ki.C18060n;
import p605ki.C18061o;
import p605ki.C18063q;
import p636lp.C18249a;
import p701oj.C18772p;
import p752qn.C19150h;
import p871vo.C20193i;
import p891wk.C20364s;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/masabi/justride/sdk/ui/features/universalticket/regulations/TicketRegulationsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.regulations.TicketRegulationsFragment */
public final class TicketRegulationsFragment extends Fragment {

    /* renamed from: f */
    public static final /* synthetic */ int f37283f = 0;

    /* renamed from: b */
    public C18772p f37284b;

    /* renamed from: c */
    public final C21049c f37285c = C23812a.m58432b(new TicketRegulationsFragment$linearLayout$2(this));

    /* renamed from: d */
    public final C21049c f37286d = C23812a.m58432b(new TicketRegulationsFragment$titleTextView$2(this));

    /* renamed from: e */
    public final C21049c f37287e = C23812a.m58432b(new TicketRegulationsFragment$bodyTextView$2(this));

    /* renamed from: com.masabi.justride.sdk.ui.features.universalticket.regulations.TicketRegulationsFragment$a */
    public static final class C14679a<T> implements C1044w<C20364s> {

        /* renamed from: a */
        public final /* synthetic */ TicketRegulationsFragment f37288a;

        public C14679a(TicketRegulationsFragment ticketRegulationsFragment) {
            this.f37288a = ticketRegulationsFragment;
        }

        public final void onChanged(Object obj) {
            C20364s sVar = (C20364s) obj;
            C24362h.m61210e(sVar, "it");
            C19150h hVar = sVar.f51623a;
            C24362h.m61210e(hVar, "it.ticketDetails");
            String str = hVar.f48732y;
            if (str == null) {
                str = "";
            }
            ((TextView) this.f37288a.f37287e.getValue()).setText(C24361g.m61186s0(str));
            TicketRegulationsFragment ticketRegulationsFragment = this.f37288a;
            TicketDisplayConfiguration ticketDisplayConfiguration = sVar.f51631i;
            C24362h.m61210e(ticketDisplayConfiguration, "it.ticketDisplayConfiguration");
            C18772p pVar = ticketRegulationsFragment.f37284b;
            C24362h.m61208c(pVar);
            pVar.f47777a.setTextColor(ticketDisplayConfiguration.f37096m);
            C18772p pVar2 = ticketRegulationsFragment.f37284b;
            C24362h.m61208c(pVar2);
            Button button = pVar2.f47777a;
            C24362h.m61210e(button, "binding.backButton");
            C17884p.m44362d(button, C18060n.com_masabi_justride_sdk_icon_back_small);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_universal_ticket_regulations, viewGroup, false);
        int i = C18061o.backButton;
        Button button = (Button) inflate.findViewById(i);
        if (button != null) {
            i = C18061o.dottedLine;
            if (((ImageView) inflate.findViewById(i)) != null) {
                i = C18061o.navigationLayout;
                if (((RelativeLayout) inflate.findViewById(i)) != null) {
                    i = C18061o.termsScrollView;
                    FrostedScrollView frostedScrollView = (FrostedScrollView) inflate.findViewById(i);
                    if (frostedScrollView != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        this.f37284b = new C18772p(linearLayout, button, frostedScrollView);
                        return linearLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f37284b = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C18772p pVar = this.f37284b;
        C24362h.m61208c(pVar);
        pVar.f47778b.mo44452a((LinearLayout) this.f37285c.getValue());
        C18772p pVar2 = this.f37284b;
        C24362h.m61208c(pVar2);
        Button button = pVar2.f47777a;
        C24362h.m61210e(button, "binding.backButton");
        C17884p.m44362d(button, C18060n.com_masabi_justride_sdk_icon_back_small);
        C18772p pVar3 = this.f37284b;
        C24362h.m61208c(pVar3);
        pVar3.f47777a.setOnClickListener(new C18249a(this));
        Bundle arguments = getArguments();
        FragmentActivity requireActivity = requireActivity();
        C24362h.m61210e(requireActivity, "requireActivity()");
        if (arguments != null) {
            String string = arguments.getString("TICKET_ID_KEY");
            if (string != null) {
                C1019k0 b = new C1026n0(requireActivity).mo4314b(C20193i.class, string);
                C24362h.m61210e(b, "ViewModelProvider(owner)…ketViewModel::class.java)");
                ((C20193i) b).f51229b.observe(getViewLifecycleOwner(), new C14679a(this));
                return;
            }
            throw new MissingArgumentException("Cannot load fragment without ticket id.");
        }
        throw new MissingArgumentException("Cannot load fragment with null bundle.");
    }
}
