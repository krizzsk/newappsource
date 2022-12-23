package com.moovit.app.home.dashboard;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c00.C13723g;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.taxi.C15413a;
import com.moovit.app.taxi.providers.TaxiDashboardConfig;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.location.C16202a;
import com.moovit.payment.account.model.PaymentAccount;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import p073e7.C4584b;
import p484ff.C16984m;
import p543hq.C17474b;
import p583jk.C17884p;
import p858uz.C20061g;
import p910xf.C20481j;
import w40.C25761d;

/* renamed from: com.moovit.app.home.dashboard.w */
public class C14988w extends C15682c<MoovitActivity> {

    /* renamed from: o */
    public static final /* synthetic */ int f38360o = 0;

    /* renamed from: n */
    public final C14989a f38361n = new C14989a();

    /* renamed from: com.moovit.app.home.dashboard.w$a */
    public class C14989a extends BroadcastReceiver {
        public C14989a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C14988w wVar = C14988w.this;
            int i = C14988w.f38360o;
            wVar.mo45190m2();
        }
    }

    public C14988w() {
        super(MoovitActivity.class);
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(getContext()).getPermissionAwareLowAccuracyRareUpdates();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("TAXI_PROVIDERS_MANAGER");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo45190m2();
    }

    /* renamed from: m2 */
    public final void mo45190m2() {
        if (getView() != null && this.f40824e && mo46775H1()) {
            C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity(), new C16984m(this, 5)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C20481j(this, 1));
        }
    }

    /* renamed from: n2 */
    public final void mo45191n2(PaymentAccount paymentAccount) {
        View view = getView();
        if (view != null) {
            Context context = view.getContext();
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.list_view);
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                for (int i2 = 0; i2 < childCount; i2++) {
                    viewGroup.getChildAt(i2).setVisibility(8);
                }
                ArrayList<T> c = C13723g.m34282c(((TaxiProvidersManager) mo46776J1("TAXI_PROVIDERS_MANAGER")).f39985b, new C14987v(context, paymentAccount, LatLonE6.m40177j(mo46780O1())));
                int size = c.size();
                int childCount2 = viewGroup.getChildCount() - 1;
                if (childCount2 != size) {
                    if (childCount2 > size) {
                        viewGroup.removeViews(size, childCount2 - size);
                    } else {
                        LayoutInflater from = LayoutInflater.from(getContext());
                        while (childCount2 < size) {
                            View inflate = from.inflate(R.layout.taxi_section_list_item, viewGroup, false);
                            inflate.setOnClickListener(new C4584b(this, 12));
                            viewGroup.addView(inflate);
                            childCount2++;
                        }
                    }
                }
                int i3 = 0;
                while (i3 < size) {
                    TaxiProvider taxiProvider = (TaxiProvider) c.get(i3);
                    i3++;
                    ListItemView listItemView = (ListItemView) viewGroup.getChildAt(i3);
                    TaxiDashboardConfig taxiDashboardConfig = taxiProvider.f39978m;
                    listItemView.setTag(taxiProvider);
                    Image image = taxiProvider.f39971f;
                    ImageView iconView = listItemView.getIconView();
                    C17884p.m44354Y(iconView).mo51642v(image).mo51628o0(image).mo22738w(R.drawable.ic_taxi_box_24_on_surface_emphasis_low).mo22730m(R.drawable.ic_taxi_box_24_on_surface_emphasis_low).mo10850T(iconView);
                    listItemView.setTitle((CharSequence) taxiDashboardConfig.f39933c);
                    listItemView.setSubtitle((CharSequence) taxiDashboardConfig.f39934d);
                    C15413a.m39456a((TextView) listItemView.getAccessoryView(), taxiDashboardConfig.f39936f);
                    listItemView.setVisibility(0);
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.TAXI_EXPOSED);
                    aVar.mo49939g(AnalyticsAttributeKey.PROVIDER, taxiProvider.f39968c);
                    mo46797j2(aVar.mo49933a());
                }
                ListItemView listItemView2 = (ListItemView) view.findViewById(R.id.header);
                if (size <= 0) {
                    i = 8;
                }
                listItemView2.setVisibility(i);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.taxi_section_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C25761d.m64300h(requireContext(), this.f38361n);
        mo45190m2();
    }

    public final void onStop() {
        super.onStop();
        C25761d.m64301k(requireContext(), this.f38361n);
    }
}
