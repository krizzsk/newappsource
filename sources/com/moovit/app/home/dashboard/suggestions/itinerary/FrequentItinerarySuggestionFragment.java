package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.C1021l0;
import androidx.lifecycle.C1043v;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mf0.C24362h;
import mf0.C24365j;
import p259t5.C6592b;
import p522gt.C17226a;
import p609km.C18097c;
import p977zz.C20964s0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/moovit/app/home/dashboard/suggestions/itinerary/FrequentItinerarySuggestionFragment;", "Lcom/moovit/app/home/dashboard/suggestions/itinerary/ItinerarySuggestionFragment;", "<init>", "()V", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class FrequentItinerarySuggestionFragment extends ItinerarySuggestionFragment {

    /* renamed from: u */
    public static final /* synthetic */ int f38307u = 0;

    /* renamed from: s */
    public final C1021l0 f38308s;

    /* renamed from: t */
    public final C21049c f38309t = C23812a.m58432b(new FrequentItinerarySuggestionFragment$params$2(this));

    public FrequentItinerarySuggestionFragment() {
        C21049c a = C23812a.m58431a(LazyThreadSafetyMode.NONE, new C14965xccf3e5d9(new C14964xccf3e5d8(this)));
        this.f38308s = C18097c.m44768b(this, C24365j.m61219a(ItinerarySuggestionViewModel.class), new C14966xccf3e5da(a), new C14967xccf3e5db(a), new C14968xccf3e5dc(this, a));
    }

    /* renamed from: m2 */
    public final ItineraryFragmentParams mo45169m2() {
        return (ItineraryFragmentParams) this.f38309t.getValue();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ItinerarySuggestionViewModel itinerarySuggestionViewModel = (ItinerarySuggestionViewModel) this.f38308s.getValue();
        LocationDescriptor locationDescriptor = mo45169m2().f38312d;
        itinerarySuggestionViewModel.getClass();
        C24362h.m61211f(locationDescriptor, "destination");
        ((C1043v) itinerarySuggestionViewModel.f38325c.getValue()).setValue(locationDescriptor);
        ((ItinerarySuggestionViewModel) this.f38308s.getValue()).f38327e.observe(getViewLifecycleOwner(), new C17226a(new FrequentItinerarySuggestionFragment$onViewCreated$1(this), 0));
        View findViewById = view.findViewById(R.id.search_button);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.search_button)");
        ((Button) findViewById).setOnClickListener(new C6592b(this, 12));
    }

    /* renamed from: p2 */
    public final void mo45170p2(boolean z) {
        View l2 = mo46799l2(R.id.description);
        C24362h.m61210e(l2, "viewById(R.id.description)");
        TextView textView = (TextView) l2;
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TextAppearanceSpan b = C20964s0.m49084b(requireContext(), R.attr.textAppearanceCaptionStrong, R.attr.colorError);
            spannableStringBuilder.append(getString(R.string.suggested_routes_oops));
            spannableStringBuilder.setSpan(b, 0, spannableStringBuilder.length(), 33);
            textView.setText(spannableStringBuilder);
            return;
        }
        textView.setText(R.string.ride_mode_calculating_eta);
    }

    /* renamed from: q2 */
    public final void mo45171q2(int i) {
        View l2 = mo46799l2(R.id.description);
        C24362h.m61210e(l2, "viewById(R.id.description)");
        ((TextView) l2).setVisibility(i);
        View findViewById = getView().findViewById(R.id.search_button);
        C24362h.m61210e(findViewById, "viewById(view, R.id.search_button)");
        ((Button) findViewById).setVisibility(i);
    }
}
