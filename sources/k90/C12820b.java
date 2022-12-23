package k90;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c00.C13723g;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.message.TicketAgencyMessage;
import com.moovit.ticketing.storedvalue.StoredValueStatus;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.ticketing.validation.provider.agency.AgencySummaryInfo;
import com.moovit.util.CurrencyAmount;
import j90.C12789b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import m80.C12866b;
import m80.C12868d;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import m80.C12875k;
import m80.C12887v;
import p054d0.C4314v;
import p112ha.C5182f0;
import p242s1.C6333d0;
import p372at.C13514a;
import p543hq.C17474b;
import p613kq.C18114a;
import p644lx.C18284b;
import p80.C12991b;
import p801sq.C19519h;
import p808sx.C19568d;
import p977zz.C20941h;
import p977zz.C20944i0;
import p977zz.C20964s0;
import w40.C25761d;

/* renamed from: k90.b */
public class C12820b extends C15682c<MoovitActivity> {

    /* renamed from: v */
    public static final /* synthetic */ int f31687v = 0;

    /* renamed from: n */
    public final C19568d f31688n = new C19568d(this, 13);

    /* renamed from: o */
    public final C12821a f31689o = new C12821a();

    /* renamed from: p */
    public final ArrayList f31690p = new ArrayList();

    /* renamed from: q */
    public SwipeRefreshLayout f31691q;

    /* renamed from: r */
    public View f31692r;

    /* renamed from: s */
    public View f31693s;

    /* renamed from: t */
    public C12819a f31694t = null;

    /* renamed from: u */
    public Button f31695u;

    /* renamed from: k90.b$a */
    public class C12821a extends BroadcastReceiver {
        public C12821a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C12820b bVar = C12820b.this;
            bVar.f31694t = null;
            bVar.mo39649n2(false);
        }
    }

    public C12820b() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "CONFIGURATION", "TICKETING_CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        C12991b bVar = (C12991b) mo46776J1("TICKETING_CONFIGURATION");
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(C12869e.swipe_refresh_layout);
        this.f31691q = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeColors(C20941h.m49043f(C12866b.colorSecondary, view.getContext()));
        this.f31691q.setOnRefreshListener(new C4314v(this, 20));
        View findViewById = view.findViewById(C12869e.empty_validation_view);
        this.f31693s = findViewById;
        Button button = (Button) findViewById.findViewById(C12869e.login_button);
        this.f31695u = button;
        button.setText(getString(C12873i.payment_wallet_login));
        this.f31695u.setOnClickListener(new C18284b(this, 18));
        Button button2 = (Button) this.f31693s.findViewById(C12869e.purchase_button);
        button2.setOnClickListener(this.f31688n);
        UiUtils.m40235C(button2, C12875k.m32665e(bVar), 8);
        View findViewById2 = view.findViewById(C12869e.content);
        this.f31692r = findViewById2;
        Button button3 = (Button) findViewById2.findViewById(C12869e.button);
        button3.setOnClickListener(this.f31688n);
        UiUtils.m40235C(button3, C12875k.m32665e(bVar), 8);
        mo39649n2(false);
    }

    /* renamed from: m2 */
    public final void mo39648m2(C12819a aVar) {
        List list;
        String str;
        boolean z;
        int i;
        int i2;
        C12819a aVar2 = aVar;
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i3 = C12869e.card_view;
        Fragment z2 = childFragmentManager.mo3983z(i3);
        String str2 = null;
        int i4 = 8;
        if (aVar2 != null) {
            this.f31692r.setVisibility(0);
            this.f31693s.setVisibility(8);
            if (z2 == null) {
                C0909a aVar3 = new C0909a(childFragmentManager);
                C12789b bVar = this.f31694t.f31682a;
                requireContext();
                aVar3.mo4111f(i3, bVar.mo39635a(), (String) null);
                aVar3.mo4043i();
            }
        } else {
            this.f31692r.setVisibility(8);
            this.f31693s.setVisibility(0);
            Button button = this.f31695u;
            if (C25761d.m64299a().mo83590e()) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            button.setVisibility(i2);
            if (z2 != null) {
                C0909a aVar4 = new C0909a(childFragmentManager);
                aVar4.mo4050p(z2);
                aVar4.mo4043i();
            }
        }
        this.f31690p.clear();
        if (aVar2 != null) {
            list = (List) C13723g.m34283d(aVar2.f31683b, this.f31690p, new C13514a(5));
        } else {
            list = Collections.emptyList();
        }
        ViewGroup viewGroup = (ViewGroup) this.f31692r.findViewById(C12869e.container);
        UiUtils.m40250i(viewGroup, C12870f.wallet_agency_list_item, 0, list.size());
        int i5 = 0;
        while (i5 < list.size()) {
            AgencySummaryInfo agencySummaryInfo = (AgencySummaryInfo) list.get(i5);
            View childAt = viewGroup.getChildAt(i5);
            ListItemView listItemView = (ListItemView) childAt.findViewById(C12869e.list_item);
            Context context = listItemView.getContext();
            TicketAgency ticketAgency = agencySummaryInfo.f23573b;
            listItemView.setIcon(ticketAgency.mo24222b());
            listItemView.setTitle((CharSequence) ticketAgency.mo24223c());
            C20944i0<CurrencyAmount, StoredValueStatus> i0Var = agencySummaryInfo.f23574c;
            if (i0Var != null) {
                str = ((CurrencyAmount) i0Var.f52692a).toString();
            } else {
                str = str2;
            }
            String d = C12875k.m32664d(context, agencySummaryInfo);
            boolean z3 = true;
            if (agencySummaryInfo.f23578g > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = C12868d.ic_alert_16_problem;
            } else {
                i = 0;
            }
            if (str == null && d == null && agencySummaryInfo.f23575d > 0) {
                SpannableString spannableString = new SpannableString(getString(C12873i.tickets_center_empty_agency_subtitle));
                spannableString.setSpan(new ForegroundColorSpan(C20941h.m49043f(C12866b.colorError, context)), 0, spannableString.length(), 33);
            } else {
                CharSequence q = C20964s0.m49099q(context.getString(C12873i.string_list_delimiter_dot), str, d);
                if (str == null || i0Var.f52693b != StoredValueStatus.LOW_BALANCE) {
                    listItemView.setSubtitle(q);
                } else {
                    SpannableString spannableString2 = new SpannableString(q);
                    spannableString2.setSpan(new ForegroundColorSpan(C20941h.m49043f(((StoredValueStatus) i0Var.f52693b).colorAttrId, context)), 0, str.length(), 33);
                    listItemView.setSubtitle((CharSequence) spannableString2);
                    i = ((StoredValueStatus) i0Var.f52693b).iconResId;
                }
            }
            listItemView.setIconTopEndDecorationDrawable(i);
            TextView textView = (TextView) childAt.findViewById(C12869e.message_view);
            TicketAgencyMessage ticketAgencyMessage = agencySummaryInfo.f23579h;
            if (ticketAgencyMessage != null) {
                if (ticketAgencyMessage.f23244d <= System.currentTimeMillis()) {
                    z3 = false;
                }
                if (z3) {
                    TicketAgencyMessage.Type type = ticketAgencyMessage.f23242b;
                    textView.setText(ticketAgencyMessage.f23243c);
                    C6333d0.m15032t(textView, C20941h.m49044g(type.getBackgroundColorAttr(), textView.getContext()));
                    C15780a.m40272e(textView, type.getIconResId());
                    textView.setVisibility(0);
                    C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "agency_message_impression");
                    aVar5.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, ticketAgencyMessage.f23242b.name());
                    mo46797j2(aVar5.mo49933a());
                    i4 = 8;
                    i5++;
                    str2 = null;
                }
            }
            i4 = 8;
            textView.setVisibility(8);
            i5++;
            str2 = null;
        }
        View findViewById = this.f31692r.findViewById(C12869e.no_items_text);
        if (list.isEmpty()) {
            i4 = 0;
        }
        findViewById.setVisibility(i4);
        C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "wallet_provider_validation_tab");
        aVar6.mo49941i(AnalyticsAttributeKey.IS_LOGGED_IN, C25761d.m64299a().mo83590e());
        if (aVar2 != null) {
            aVar6.mo49937e(AnalyticsAttributeKey.ID, aVar2.f31682a.f31612a);
            aVar6.mo49935c(AnalyticsAttributeKey.ACTIVE_COUNT, aVar2.f31684c);
            aVar6.mo49935c(AnalyticsAttributeKey.VALID_COUNT, aVar2.f31685d);
            aVar6.mo49941i(AnalyticsAttributeKey.IS_STORED_VALUE_SUPPORTED, aVar2.f31686e);
        }
        mo46797j2(aVar6.mo49933a());
    }

    /* renamed from: n2 */
    public final void mo39649n2(boolean z) {
        C12819a aVar;
        if (isResumed() && mo46775H1()) {
            C12991b bVar = (C12991b) mo46776J1("TICKETING_CONFIGURATION");
            List<ServerId> list = bVar.f32162d;
            if (!list.isEmpty()) {
                if (z || (aVar = this.f31694t) == null) {
                    ServerId serverId = (ServerId) mo46782Q1().getParcelable("providerId");
                    if (serverId == null || !list.contains(serverId)) {
                        serverId = list.get(0);
                    }
                    C12887v.m32668b().mo39736g(z).onSuccessTask(MoovitExecutors.COMPUTATION, new C5182f0(4, bVar, serverId)).addOnSuccessListener((Activity) requireActivity(), new C18114a(this, 14)).addOnCompleteListener((Activity) requireActivity(), new C19519h(this, 7));
                    return;
                }
                mo39648m2(aVar);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C12887v.m32673k(requireContext(), this.f31689o);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C12870f.user_wallet_provider_validation_info_fragment, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        C12887v.m32674l(requireContext(), this.f31689o);
    }

    public final void onResume() {
        super.onResume();
        mo39649n2(false);
    }
}
