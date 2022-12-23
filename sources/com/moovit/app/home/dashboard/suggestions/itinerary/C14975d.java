package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.transit.Schedule;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import e20.C16769e;
import e20.C16783l;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import p641lu.C18277b;
import p977zz.C20958p0;
import p977zz.C20964s0;

/* renamed from: com.moovit.app.home.dashboard.suggestions.itinerary.d */
public final class C14975d extends C16769e {

    /* renamed from: m */
    public final /* synthetic */ ItinerarySuggestionFragment f38333m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14975d(ItinerarySuggestionFragment itinerarySuggestionFragment, Context context) {
        super(context);
        this.f38333m = itinerarySuggestionFragment;
    }

    /* renamed from: f */
    public final void mo45154f(C16769e.C16772c cVar) {
        Schedule w;
        Time m;
        C24362h.m61211f(cVar, "itineraryRealTimeInfo");
        if (this.f38333m.getContext() != null) {
            ItinerarySuggestionFragment itinerarySuggestionFragment = this.f38333m;
            int i = ItinerarySuggestionFragment.f38318r;
            Context requireContext = itinerarySuggestionFragment.requireContext();
            C24362h.m61210e(requireContext, "requireContext()");
            Itinerary itinerary = itinerarySuggestionFragment.f38322q;
            if (itinerary != null) {
                C18277b bVar = C16783l.f43688a;
                Leg h = C16783l.m42476h(itinerary.mo48295u0(), -1, 3, 10);
                if (h != null && (w = C16783l.m42491w(cVar, h, false)) != null && (m = w.mo24326m()) != null) {
                    long g = m.mo24631g();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(C20964s0.m49085c(requireContext, R.drawable.ic_real_time_12_live));
                    Context context = requireContext;
                    SpannableStringBuilder f = C7925b.f23937d.mo24606f(context, System.currentTimeMillis(), g, Long.MAX_VALUE, EmptySet.f60175b);
                    C24362h.m61210e(f, "getPassiveMinutesSpanFor…X_VALUE, emptySet<Any>())");
                    spannableStringBuilder.append(f);
                    spannableStringBuilder.setSpan(C20964s0.m49084b(requireContext, R.attr.textAppearanceCaptionStrong, R.attr.colorLive), 1, spannableStringBuilder.length(), 33);
                    View l2 = itinerarySuggestionFragment.mo46799l2(R.id.metadata);
                    C24362h.m61210e(l2, "viewById(R.id.metadata)");
                    ((TextView) l2).setText(C20958p0.m49077a(itinerarySuggestionFragment.requireContext().getText(R.string.suggested_routes_leaves_now), spannableStringBuilder));
                    return;
                }
                return;
            }
            C24362h.m61217l("itinerary");
            throw null;
        }
    }
}
