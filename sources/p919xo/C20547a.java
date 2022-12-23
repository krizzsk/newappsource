package p919xo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1044w;
import bf0.C21050d;
import cf0.C21136j;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.masabi.justride.sdk.exception.MissingArgumentException;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.p415ui.features.universalticket.components.FrostedScrollView;
import com.masabi.justride.sdk.p415ui.features.universalticket.details.purchase.ParcelablePaymentCardInfo;
import com.masabi.justride.sdk.p415ui.features.universalticket.details.trip.Trip;
import com.masabi.justride.sdk.p415ui.features.universalticket.regulations.TicketRegulationsFragment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import p090g1.C4732a;
import p368ap.C13503b;
import p392bp.C13651a;
import p422cp.C16469a;
import p446dp.C16691a;
import p583jk.C17884p;
import p584jl.C17885a;
import p605ki.C18059m;
import p605ki.C18060n;
import p605ki.C18061o;
import p605ki.C18063q;
import p634ln.C18247a;
import p701oj.C18768l;
import p752qn.C19143a;
import p752qn.C19146d;
import p752qn.C19147e;
import p752qn.C19150h;
import p871vo.C20178e;
import p871vo.C20193i;
import p891wk.C20364s;
import p942yo.C20747a;
import p966zo.C20880a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lxo/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: xo.a */
public final class C20547a extends Fragment {

    /* renamed from: b */
    public C18768l f51981b;

    /* renamed from: xo.a$a */
    public static final class C20548a<T> implements C1044w<C20364s> {

        /* renamed from: a */
        public final /* synthetic */ C20547a f51982a;

        public C20548a(C20547a aVar) {
            this.f51982a = aVar;
        }

        public final void onChanged(Object obj) {
            String str;
            Date date;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            C20364s sVar = (C20364s) obj;
            C18768l lVar = this.f51982a.f51981b;
            C24362h.m61208c(lVar);
            FrostedScrollView frostedScrollView = lVar.f47764b;
            C20547a aVar = this.f51982a;
            C24362h.m61210e(sVar, "it");
            C19150h hVar = sVar.f51623a;
            C24362h.m61210e(hVar, "it.ticketDetails");
            Context requireContext = aVar.requireContext();
            C24362h.m61210e(requireContext, "requireContext()");
            LinearLayout linearLayout = new LinearLayout(requireContext);
            linearLayout.setId(View.generateViewId());
            linearLayout.setOrientation(1);
            linearLayout.setShowDividers(2);
            linearLayout.setDividerDrawable(C4732a.getDrawable(requireContext, C18060n.com_masabi_justride_sdk_list_divider));
            linearLayout.setDividerPadding(aVar.getResources().getDimensionPixelSize(C18059m.com_masabi_justride_sdk_universal_ticket_default_padding));
            C19143a aVar2 = hVar.f48722o;
            C24362h.m61210e(aVar2, "ticketDetails.activationSummary");
            Date date2 = aVar2.f48674e;
            C19143a aVar3 = hVar.f48722o;
            C24362h.m61210e(aVar3, "ticketDetails.activationSummary");
            Date date3 = aVar3.f48675f;
            List<C19147e> list = hVar.f48729v;
            C24362h.m61210e(list, "ticketDetails.paymentDetails");
            Date D = C17885a.m44394D(hVar.f48721n);
            String str7 = hVar.f48713f;
            C24362h.m61210e(str7, "ticketDetails.ticketId");
            String str8 = hVar.f48712e;
            C24362h.m61210e(str8, "ticketDetails.state");
            FragmentManager childFragmentManager = aVar.getChildFragmentManager();
            childFragmentManager.getClass();
            C0909a aVar4 = new C0909a(childFragmentManager);
            int i = C18061o.validityFragmentContainer;
            linearLayout.addView(C20547a.m48281H1(i, requireContext));
            C16691a aVar5 = new C16691a();
            Bundle bundle = new Bundle();
            C20364s sVar2 = sVar;
            bundle.putString("TICKET_ID_KEY", str7);
            aVar5.setArguments(bundle);
            aVar4.mo4111f(i, aVar5, (String) null);
            if (date2 != null) {
                int i2 = C18061o.activationStartFragmentContainer;
                linearLayout.addView(C20547a.m48281H1(i2, requireContext));
                C20880a aVar6 = new C20880a();
                Bundle bundle2 = new Bundle();
                date = D;
                str = str7;
                bundle2.putLong("ACTIVATION_START_TIMESTAMP", date2.getTime());
                C21050d dVar = C21050d.f52856a;
                aVar6.setArguments(bundle2);
                aVar4.mo4111f(i2, aVar6, (String) null);
            } else {
                date = D;
                str = str7;
            }
            if (date3 != null && C24362h.m61206a(str8, "ACTIVE")) {
                int i3 = C18061o.activationEndFragmentContainer;
                linearLayout.addView(C20547a.m48281H1(i3, requireContext));
                C20747a aVar7 = new C20747a();
                Bundle bundle3 = new Bundle();
                bundle3.putLong("ACTIVATION_END_TIMESTAMP", date3.getTime());
                C21050d dVar2 = C21050d.f52856a;
                aVar7.setArguments(bundle3);
                aVar4.mo4111f(i3, aVar7, (String) null);
            }
            int i4 = C18061o.tripFragmentContainer;
            linearLayout.addView(C20547a.m48281H1(i4, requireContext));
            C16469a aVar8 = new C16469a();
            Bundle bundle4 = new Bundle();
            bundle4.putString("TICKET_ID_KEY", hVar.f48713f);
            C18247a aVar9 = hVar.f48725r;
            if (aVar9 != null) {
                str2 = aVar9.f46553b;
            } else {
                str2 = null;
            }
            if (aVar9 != null) {
                str3 = aVar9.f46556e;
            } else {
                str3 = null;
            }
            String str9 = hVar.f48728u;
            C18247a aVar10 = hVar.f48723p;
            if (aVar10 != null) {
                str4 = aVar10.f46553b;
            } else {
                str4 = null;
            }
            if (aVar10 != null) {
                str5 = aVar10.f46556e;
            } else {
                str5 = null;
            }
            String str10 = hVar.f48720m;
            C24362h.m61210e(str10, "ticketDetails.productDisplayName");
            String str11 = hVar.f48714g;
            C19146d dVar3 = hVar.f48726s;
            if (dVar3 != null) {
                str6 = dVar3.f48688a;
            } else {
                str6 = null;
            }
            bundle4.putParcelable("TRIP", new Trip(str2, str3, str9, str4, str5, str10, str11, str6));
            C21050d dVar4 = C21050d.f52856a;
            aVar8.setArguments(bundle4);
            aVar4.mo4111f(i4, aVar8, (String) null);
            int i5 = C18061o.purchaseFragmentContainer;
            linearLayout.addView(C20547a.m48281H1(i5, requireContext));
            C13503b bVar = new C13503b();
            ArrayList arrayList = new ArrayList(C21136j.m49436X(list, 10));
            for (C19147e eVar : list) {
                C24362h.m61211f(eVar, "paymentCardInfo");
                String str12 = eVar.f48692a;
                C24362h.m61210e(str12, "paymentCardInfo.maskedPan");
                String str13 = eVar.f48693b;
                C24362h.m61210e(str13, "paymentCardInfo.paymentCardType");
                arrayList.add(new ParcelablePaymentCardInfo(str12, str13));
            }
            Bundle bundle5 = new Bundle();
            bundle5.putParcelableArrayList("PAYMENT_CARD_INFO_LIST", new ArrayList(arrayList));
            bundle5.putLong("PURCHASE_DATE", date.getTime());
            C21050d dVar5 = C21050d.f52856a;
            bVar.setArguments(bundle5);
            aVar4.mo4111f(i5, bVar, (String) null);
            int i6 = C18061o.ticketIdFragmentContainer;
            linearLayout.addView(C20547a.m48281H1(i6, requireContext));
            C13651a aVar11 = new C13651a();
            Bundle bundle6 = new Bundle();
            bundle6.putString("TICKET_ID_KEY", str);
            aVar11.setArguments(bundle6);
            aVar4.mo4111f(i6, aVar11, (String) null);
            aVar4.mo4040d();
            frostedScrollView.mo44452a(linearLayout);
            C20547a aVar12 = this.f51982a;
            TicketDisplayConfiguration ticketDisplayConfiguration = sVar2.f51631i;
            C24362h.m61210e(ticketDisplayConfiguration, "it.ticketDisplayConfiguration");
            C18768l lVar2 = aVar12.f51981b;
            C24362h.m61208c(lVar2);
            lVar2.f47763a.setTextColor(ticketDisplayConfiguration.f37096m);
            C18768l lVar3 = aVar12.f51981b;
            C24362h.m61208c(lVar3);
            lVar3.f47766d.setTextColor(ticketDisplayConfiguration.f37096m);
            C18768l lVar4 = aVar12.f51981b;
            C24362h.m61208c(lVar4);
            Button button = lVar4.f47763a;
            C24362h.m61210e(button, "binding.backButton");
            C17884p.m44362d(button, C18060n.com_masabi_justride_sdk_icon_back_small);
            C18768l lVar5 = aVar12.f51981b;
            C24362h.m61208c(lVar5);
            Button button2 = lVar5.f47766d;
            C24362h.m61210e(button2, "binding.termsButton");
            C17884p.m44362d(button2, C18060n.com_masabi_justride_sdk_icon_terms);
        }
    }

    /* renamed from: xo.a$b */
    public static final class C20549b implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C20547a f51983b;

        public C20549b(C20547a aVar) {
            this.f51983b = aVar;
        }

        public final void onClick(View view) {
            Fragment parentFragment = this.f51983b.getParentFragment();
            if (!(parentFragment instanceof C20178e)) {
                parentFragment = null;
            }
            C20178e eVar = (C20178e) parentFragment;
            if (eVar != null) {
                eVar.mo52427N1();
            }
        }
    }

    /* renamed from: xo.a$c */
    public static final class C20550c implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C20547a f51984b;

        public C20550c(C20547a aVar) {
            this.f51984b = aVar;
        }

        public final void onClick(View view) {
            Fragment parentFragment = this.f51984b.getParentFragment();
            if (!(parentFragment instanceof C20178e)) {
                parentFragment = null;
            }
            C20178e eVar = (C20178e) parentFragment;
            if (eVar != null) {
                String str = eVar.f51195e;
                if (str != null) {
                    TicketRegulationsFragment ticketRegulationsFragment = new TicketRegulationsFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("TICKET_ID_KEY", str);
                    ticketRegulationsFragment.setArguments(bundle);
                    eVar.mo52426M1(ticketRegulationsFragment);
                    return;
                }
                C24362h.m61217l("ticketId");
                throw null;
            }
        }
    }

    /* renamed from: xo.a$d */
    public static final class C20551d implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C20547a f51985b;

        public C20551d(C20547a aVar) {
            this.f51985b = aVar;
        }

        public final void run() {
            boolean z;
            C20547a aVar = this.f51985b;
            C18768l lVar = aVar.f51981b;
            C24362h.m61208c(lVar);
            Button button = lVar.f47763a;
            C24362h.m61210e(button, "binding.backButton");
            int width = button.getWidth();
            C18768l lVar2 = aVar.f51981b;
            C24362h.m61208c(lVar2);
            Button button2 = lVar2.f47766d;
            C24362h.m61210e(button2, "binding.termsButton");
            int width2 = button2.getWidth();
            C18768l lVar3 = aVar.f51981b;
            C24362h.m61208c(lVar3);
            RelativeLayout relativeLayout = lVar3.f47765c;
            C24362h.m61210e(relativeLayout, "binding.navigationLayout");
            if (width + width2 > relativeLayout.getWidth()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12);
                C18768l lVar4 = aVar.f51981b;
                C24362h.m61208c(lVar4);
                Button button3 = lVar4.f47766d;
                C24362h.m61210e(button3, "binding.termsButton");
                layoutParams.addRule(3, button3.getId());
                layoutParams.addRule(20);
                C18768l lVar5 = aVar.f51981b;
                C24362h.m61208c(lVar5);
                Button button4 = lVar5.f47763a;
                C24362h.m61210e(button4, "binding.backButton");
                button4.setLayoutParams(layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(10);
                layoutParams2.addRule(20);
                C18768l lVar6 = aVar.f51981b;
                C24362h.m61208c(lVar6);
                Button button5 = lVar6.f47766d;
                C24362h.m61210e(button5, "binding.termsButton");
                button5.setLayoutParams(layoutParams2);
                return;
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(20);
            layoutParams3.addRule(15);
            C18768l lVar7 = aVar.f51981b;
            C24362h.m61208c(lVar7);
            Button button6 = lVar7.f47763a;
            C24362h.m61210e(button6, "binding.backButton");
            button6.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(21);
            layoutParams4.addRule(15);
            C18768l lVar8 = aVar.f51981b;
            C24362h.m61208c(lVar8);
            Button button7 = lVar8.f47766d;
            C24362h.m61210e(button7, "binding.termsButton");
            button7.setLayoutParams(layoutParams4);
        }
    }

    /* renamed from: H1 */
    public static FragmentContainerView m48281H1(int i, Context context) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(i);
        fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return fragmentContainerView;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_universal_ticket_details, viewGroup, false);
        int i = C18061o.backButton;
        Button button = (Button) inflate.findViewById(i);
        if (button != null) {
            i = C18061o.dottedLine;
            if (((ImageView) inflate.findViewById(i)) != null) {
                i = C18061o.frostedScrollView;
                FrostedScrollView frostedScrollView = (FrostedScrollView) inflate.findViewById(i);
                if (frostedScrollView != null) {
                    i = C18061o.navigationLayout;
                    RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(i);
                    if (relativeLayout != null) {
                        i = C18061o.termsButton;
                        Button button2 = (Button) inflate.findViewById(i);
                        if (button2 != null) {
                            LinearLayout linearLayout = (LinearLayout) inflate;
                            this.f51981b = new C18768l(linearLayout, button, frostedScrollView, relativeLayout, button2);
                            return linearLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f51981b = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        FragmentActivity requireActivity = requireActivity();
        C24362h.m61210e(requireActivity, "requireActivity()");
        if (arguments != null) {
            String string = arguments.getString("TICKET_ID_KEY");
            if (string != null) {
                C1019k0 b = new C1026n0(requireActivity).mo4314b(C20193i.class, string);
                C24362h.m61210e(b, "ViewModelProvider(owner)…ketViewModel::class.java)");
                ((C20193i) b).f51229b.observe(getViewLifecycleOwner(), new C20548a(this));
                C18768l lVar = this.f51981b;
                C24362h.m61208c(lVar);
                Button button = lVar.f47763a;
                C24362h.m61210e(button, "binding.backButton");
                C17884p.m44362d(button, C18060n.com_masabi_justride_sdk_icon_back_small);
                C18768l lVar2 = this.f51981b;
                C24362h.m61208c(lVar2);
                Button button2 = lVar2.f47766d;
                C24362h.m61210e(button2, "binding.termsButton");
                C17884p.m44362d(button2, C18060n.com_masabi_justride_sdk_icon_terms);
                C18768l lVar3 = this.f51981b;
                C24362h.m61208c(lVar3);
                lVar3.f47763a.setOnClickListener(new C20549b(this));
                C18768l lVar4 = this.f51981b;
                C24362h.m61208c(lVar4);
                lVar4.f47766d.setOnClickListener(new C20550c(this));
                view.post(new C20551d(this));
                return;
            }
            throw new MissingArgumentException("Cannot load fragment without ticket id.");
        }
        throw new MissingArgumentException("Cannot load fragment with null bundle.");
    }
}
