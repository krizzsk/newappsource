package p924xt;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import ja0.C12797f;
import o00.C18669f;
import o00.C18670g;

/* renamed from: xt.c */
public final class C20588c extends C20584a {
    public C20588c() {
        super(8);
    }

    /* renamed from: a */
    public final void mo52782a(C12797f fVar, Itinerary itinerary, TripPlannerLocations tripPlannerLocations) {
        super.mo52782a(fVar, itinerary, tripPlannerLocations);
        FormatTextView formatTextView = (FormatTextView) fVar.mo39639f(R.id.arrival_time);
        formatTextView.setText((CharSequence) null);
        C20589d.m48368f(formatTextView, itinerary);
        C20589d.m48367e(fVar, itinerary);
        TextView textView = (TextView) fVar.mo39639f(R.id.fare);
        textView.setText((CharSequence) null);
        CurrencyAmount currencyAmount = itinerary.f41895c.f41904f;
        if (currencyAmount == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(currencyAmount.toString());
        textView.setVisibility(0);
    }

    /* renamed from: h */
    public final View mo52786h(ViewGroup viewGroup) {
        View e = C13715c.m34239e(viewGroup, R.layout.suggested_routes_default_result, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) e.findViewById(R.id.legs_preview);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.screen_edge) - UiUtils.m40249h(viewGroup.getResources(), 3.0f);
        recyclerView.mo4593g(C18669f.m45651e(dimensionPixelSize), -1);
        recyclerView.mo4593g(C18670g.m45652e(dimensionPixelSize), -1);
        return e;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: k */
    public final int mo52787k() {
        return 0;
    }

    /* renamed from: n */
    public final boolean mo52788n(Itinerary itinerary) {
        return true;
    }
}
