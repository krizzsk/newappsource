package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.recyclerview.widget.RecyclerView;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.card.MaterialCardView;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.home.HomeActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16769e;
import e20.C16783l;
import kotlin.C23812a;
import kotlin.Metadata;
import mf0.C24362h;
import p242s1.C6354e;
import p250s9.C6489b;
import p373au.C13527c;
import p496fr.C17065b;
import p543hq.C17474b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo59060d2 = {"Lcom/moovit/app/home/dashboard/suggestions/itinerary/ItinerarySuggestionFragment;", "Lcom/moovit/c;", "Lcom/moovit/app/home/HomeActivity;", "<init>", "()V", "a", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public abstract class ItinerarySuggestionFragment extends C15682c<HomeActivity> {

    /* renamed from: r */
    public static final /* synthetic */ int f38318r = 0;

    /* renamed from: n */
    public final C21049c f38319n = C23812a.m58432b(new ItinerarySuggestionFragment$realTimeRefreshHelper$2(this));

    /* renamed from: o */
    public MaterialCardView f38320o;

    /* renamed from: p */
    public RecyclerView f38321p;

    /* renamed from: q */
    public Itinerary f38322q;

    /* renamed from: com.moovit.app.home.dashboard.suggestions.itinerary.ItinerarySuggestionFragment$a */
    public static final class C14971a extends RecyclerView.C1148v {

        /* renamed from: a */
        public final View f38323a;

        /* renamed from: b */
        public final C6354e f38324b;

        public C14971a(MaterialCardView materialCardView) {
            this.f38323a = materialCardView;
            this.f38324b = new C6354e(materialCardView.getContext(), new C14974c(this));
        }

        /* renamed from: b */
        public final boolean mo4910b(RecyclerView recyclerView, MotionEvent motionEvent) {
            C24362h.m61211f(recyclerView, "rv");
            C24362h.m61211f(motionEvent, "e");
            return this.f38324b.mo22474a(motionEvent);
        }
    }

    public ItinerarySuggestionFragment() {
        super(HomeActivity.class);
    }

    /* renamed from: m2 */
    public abstract ItineraryFragmentParams mo45169m2();

    /* renamed from: n2 */
    public final void mo45180n2(int i) {
        View l2 = mo46799l2(R.id.description);
        C24362h.m61210e(l2, "viewById(R.id.description)");
        ((TextView) l2).setVisibility(i);
        View l22 = mo46799l2(R.id.place_holder1);
        C24362h.m61210e(l22, "viewById(R.id.place_holder1)");
        ((FrameLayout) l22).setVisibility(i);
        View l23 = mo46799l2(R.id.place_holder2);
        C24362h.m61210e(l23, "viewById(R.id.place_holder2)");
        ((FrameLayout) l23).setVisibility(i);
    }

    /* renamed from: o2 */
    public final void mo45181o2(Itinerary itinerary) {
        String str;
        String str2;
        this.f38322q = itinerary;
        ((C16769e) this.f38319n.getValue()).mo49466h(itinerary);
        ((C16769e) this.f38319n.getValue()).mo23804e();
        mo45180n2(4);
        View l2 = mo46799l2(R.id.relative_time);
        C24362h.m61210e(l2, "viewById(R.id.relative_time)");
        ((TextView) l2).setText(C16783l.m42486r(requireContext(), itinerary));
        View l22 = mo46799l2(R.id.arrival_time);
        C24362h.m61210e(l22, "viewById(R.id.arrival_time)");
        TextView textView = (TextView) l22;
        Object[] objArr = new Object[1];
        Context requireContext = requireContext();
        long g = itinerary.mo48288K1().mo24631g();
        if (g <= 0) {
            str = null;
        } else {
            str = C7925b.m18024l(requireContext, g);
        }
        objArr[0] = str;
        textView.setText(getString(R.string.tripplan_itinerary_arrive, objArr));
        View l23 = mo46799l2(R.id.flow);
        C24362h.m61210e(l23, "viewById(R.id.flow)");
        ((Flow) l23).setVisibility(0);
        RecyclerView recyclerView = this.f38321p;
        if (recyclerView != null) {
            recyclerView.setAdapter(new C13527c(requireContext(), itinerary));
            RecyclerView recyclerView2 = this.f38321p;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
                View l24 = mo46799l2(R.id.metadata);
                C24362h.m61210e(l24, "viewById(R.id.metadata)");
                TextView textView2 = (TextView) l24;
                Object[] objArr2 = new Object[1];
                Context requireContext2 = requireContext();
                long g2 = itinerary.mo48294o1().mo24631g();
                if (g2 <= 0) {
                    str2 = null;
                } else {
                    str2 = C7925b.m18024l(requireContext2, g2);
                }
                objArr2[0] = str2;
                textView2.setText(getString(R.string.suggested_routes_departure_time, objArr2));
                textView2.setVisibility(0);
                MaterialCardView materialCardView = this.f38320o;
                if (materialCardView != null) {
                    materialCardView.setOnClickListener(new C17065b(1, this, itinerary));
                } else {
                    C24362h.m61217l("cardView");
                    throw null;
                }
            } else {
                C24362h.m61217l("legsPreviewView");
                throw null;
            }
        } else {
            C24362h.m61217l("legsPreviewView");
            throw null;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.suggestions_itinerary_fragment, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "suggestions_data_type_route");
        aVar.mo49939g(AnalyticsAttributeKey.SOURCE, mo45169m2().f38314f);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.DISTANCE;
        LatLonE6 d = mo45169m2().f38311c.mo24310d();
        LocationDescriptor locationDescriptor = mo45169m2().f38312d;
        d.getClass();
        aVar.mo49934b(analyticsAttributeKey, LatLonE6.m40174c(d, locationDescriptor));
        aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, mo45169m2().f38315g);
        mo46797j2(aVar.mo49933a());
    }

    public final void onStart() {
        super.onStart();
        if (this.f38322q != null) {
            ((C16769e) this.f38319n.getValue()).mo23804e();
        }
    }

    public final void onStop() {
        super.onStop();
        ((C16769e) this.f38319n.getValue()).mo23803d();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.card_view);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.card_view)");
        this.f38320o = (MaterialCardView) findViewById;
        View findViewById2 = view.findViewById(R.id.legs_preview);
        C24362h.m61210e(findViewById2, "view.findViewById(R.id.legs_preview)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f38321p = recyclerView;
        MaterialCardView materialCardView = this.f38320o;
        if (materialCardView != null) {
            recyclerView.f4279r.add(new C14971a(materialCardView));
            RecyclerView recyclerView2 = this.f38321p;
            if (recyclerView2 != null) {
                recyclerView2.setChildDrawingOrderCallback(new C6489b(10));
                View findViewById3 = view.findViewById(R.id.header);
                C24362h.m61210e(findViewById3, "view.findViewById(R.id.header)");
                ((TextView) findViewById3).setText(mo45169m2().f38310b);
                View findViewById4 = view.findViewById(R.id.destination);
                C24362h.m61210e(findViewById4, "view.findViewById(R.id.destination)");
                ((TextView) findViewById4).setText(getString(R.string.to_specific_destination_capitalized, mo45169m2().f38313e));
                return;
            }
            C24362h.m61217l("legsPreviewView");
            throw null;
        }
        C24362h.m61217l("cardView");
        throw null;
    }
}
