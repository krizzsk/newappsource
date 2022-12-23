package s90;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import c00.C13717b;
import c00.C13723g;
import com.google.android.material.tabs.TabLayout;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.wallet.UserWalletTab;
import h90.C12739a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import k00.C17988b;
import m80.C12868d;
import m80.C12869e;
import m80.C12870f;
import m80.C12875k;
import m80.C12887v;
import p244s3.C6444s;
import p304x.C7072l1;
import p543hq.C17474b;
import p613kq.C18114a;
import p80.C12991b;
import p970zs.C20888b;

/* renamed from: s90.f */
public class C13078f extends C15682c<MoovitActivity> {

    /* renamed from: s */
    public static final HashSet f32353s = new HashSet(Arrays.asList(new UserWalletTab[]{UserWalletTab.VALIDATION, UserWalletTab.STORED_VALUE, UserWalletTab.AVAILABLE, UserWalletTab.EXPIRED}));

    /* renamed from: n */
    public final C13079a f32354n = new C13079a();

    /* renamed from: o */
    public final C13080b f32355o = new C13080b();

    /* renamed from: p */
    public TabLayout f32356p;

    /* renamed from: q */
    public ViewPager f32357q;

    /* renamed from: r */
    public List<UserWalletTab> f32358r;

    /* renamed from: s90.f$a */
    public class C13079a extends ViewPager.SimpleOnPageChangeListener {
        public C13079a() {
        }

        public final void onPageSelected(int i) {
            int b = C13078f.this.f32357q.mo47353b(i);
            C13078f fVar = C13078f.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SWIPE);
            aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, b);
            aVar.mo49945m(AnalyticsAttributeKey.TYPE, C13078f.this.f32358r.get(b).analyticsType);
            fVar.mo46797j2(aVar.mo49933a());
        }
    }

    /* renamed from: s90.f$b */
    public class C13080b extends BroadcastReceiver {
        public C13080b() {
        }

        public final void onReceive(Context context, Intent intent) {
            C13078f fVar = C13078f.this;
            fVar.getClass();
            C12887v.m32668b().mo39736g(false).addOnSuccessListener((Activity) fVar.requireActivity(), new C6444s(fVar, 9));
        }
    }

    public C13078f() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("TICKETING_CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        this.f32357q = (com.moovit.commons.view.pager.ViewPager) view.findViewById(C12869e.view_pager);
        TabLayout tabLayout = (TabLayout) view.findViewById(C12869e.tabs);
        this.f32356p = tabLayout;
        tabLayout.setInlineLabel(true);
        C12887v.m32668b().mo39736g(false).continueWith(MoovitExecutors.COMPUTATION, new C13077e((C12991b) mo46776J1("TICKETING_CONFIGURATION"))).addOnSuccessListener((Activity) requireActivity(), new C18114a(this, 16));
    }

    /* renamed from: m2 */
    public final void mo39946m2(UserWalletTab userWalletTab, int i) {
        TabLayout.C14143g g;
        List<UserWalletTab> list = this.f32358r;
        if (list != null && this.f32357q != null && this.f32356p != null && (g = this.f32356p.mo42295g(this.f32357q.mo47353b(list.indexOf(userWalletTab)))) != null) {
            g.mo42363b(C17988b.m44611b(i, getContext()));
        }
    }

    /* renamed from: n2 */
    public final void mo39947n2(C13076d dVar) {
        List<C12739a> list;
        int i;
        List<Ticket> list2;
        Ticket ticket;
        Ticket.Alert alert = null;
        if (dVar != null) {
            list = dVar.f32349d;
        } else {
            list = null;
        }
        boolean a = C13723g.m34280a(list, new C20888b(2));
        UserWalletTab userWalletTab = UserWalletTab.STORED_VALUE;
        if (a) {
            i = C12868d.ic_alert_ring_16_critical;
        } else {
            i = 0;
        }
        mo39946m2(userWalletTab, i);
        if (dVar != null) {
            list2 = dVar.f32346a;
        } else {
            list2 = null;
        }
        if (!C13717b.m34258e(list2) && (ticket = (Ticket) Collections.max(list2, new C7072l1(7))) != null) {
            alert = ticket.f23488q;
        }
        mo39946m2(UserWalletTab.AVAILABLE, C12875k.m32666f(alert));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C12870f.user_wallet_fragment, viewGroup, false);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C12887v.m32674l(requireContext(), this.f32355o);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C12887v.m32673k(requireContext(), this.f32355o);
    }
}
