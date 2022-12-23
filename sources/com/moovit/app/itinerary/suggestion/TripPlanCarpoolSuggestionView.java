package com.moovit.app.itinerary.suggestion;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.TextView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16769e;
import e20.C16783l;
import java.util.Locale;
import p977zz.C20958p0;
import p977zz.C20964s0;

public class TripPlanCarpoolSuggestionView extends TripPlanSuggestionView<CarpoolLeg> {
    public TripPlanCarpoolSuggestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: v */
    public final boolean mo45330v(ListItemView listItemView, TextView textView, TextView textView2, Itinerary itinerary, Leg leg, C16769e.C16772c cVar) {
        CharSequence charSequence;
        CarpoolLeg carpoolLeg = (CarpoolLeg) leg;
        Context context = getContext();
        listItemView.setIcon(carpoolLeg.f41973i);
        String l = C7925b.m18024l(context, carpoolLeg.f41966b.f23901b);
        if (carpoolLeg.f41972h != CarpoolLeg.CarpoolType.NEARBY_DRIVERS) {
            charSequence = context.getString(R.string.suggest_routes_single_carpool_ride_leg_subtitle_1, new Object[]{l});
        } else {
            CharSequence text = context.getText(R.string.dashboard_favorites_carpool_ride_title);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(C20964s0.m49085c(context, R.drawable.ic_real_time_12_live));
            spannableStringBuilder.append(C7925b.f23936c.mo24602b(context, 0));
            spannableStringBuilder.setSpan(C20964s0.m49084b(context, R.attr.textAppearanceCaptionStrong, R.attr.colorLive), 1, spannableStringBuilder.length(), 33);
            charSequence = C20958p0.m49077a(text, spannableStringBuilder);
        }
        textView.setText(charSequence);
        String r = C16783l.m42486r(context, itinerary);
        String string = context.getString(R.string.suggested_routes_duration);
        Object[] objArr = {r};
        String str = C20964s0.f52718a;
        textView2.setText(String.format((Locale) null, string, objArr));
        return true;
    }

    public TripPlanCarpoolSuggestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
