package p924xt;

import a00.C13382a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.view.FormatTextView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16769e;
import e20.C16783l;
import ja0.C12797f;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import p641lu.C18277b;
import p924xt.C20590e;
import p977zz.C20964s0;

/* renamed from: xt.d */
public abstract class C20589d {

    /* renamed from: b */
    public static HashSet f52074b = new HashSet(Arrays.asList(new Integer[]{8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21}));

    /* renamed from: a */
    public final int f52075a;

    public C20589d(int i) {
        this.f52075a = i;
    }

    /* renamed from: d */
    public static void m48366d(FormatTextView formatTextView) {
        Context context = formatTextView.getContext();
        formatTextView.setText(new SpannableStringBuilder(formatTextView.getText()).append(context.getResources().getString(R.string.string_list_delimiter_dot)).append(C20964s0.m49085c(context, R.drawable.ic_wheelchair_spannable_16_on_surface_emphasis_high)));
    }

    /* renamed from: e */
    public static void m48367e(C12797f fVar, Itinerary itinerary) {
        if (itinerary.f41895c.f41908j) {
            FormatTextView formatTextView = (FormatTextView) fVar.mo39639f(R.id.arrival_time);
            if (formatTextView == null || C20964s0.m49090h(formatTextView.getText())) {
                FormatTextView formatTextView2 = (FormatTextView) fVar.mo39639f(R.id.relative_time);
                if (formatTextView2 != null && !C20964s0.m49090h(formatTextView2.getText())) {
                    m48366d(formatTextView2);
                    return;
                }
                return;
            }
            m48366d(formatTextView);
        }
    }

    /* renamed from: f */
    public static void m48368f(FormatTextView formatTextView, Itinerary itinerary) {
        String str;
        Context context = formatTextView.getContext();
        C18277b bVar = C16783l.f43688a;
        long g = itinerary.mo48288K1().mo24631g();
        if (g <= 0) {
            str = null;
        } else {
            str = C7925b.m18024l(context, g);
        }
        if (!C20964s0.m49090h(str)) {
            if (C20964s0.m49090h(formatTextView.getFormat())) {
                formatTextView.setText(str);
            } else {
                formatTextView.setArguments(str);
            }
            formatTextView.setContentDescription(context.getString(R.string.tripplan_itinerary_arrive, new Object[]{str}));
        }
    }

    /* renamed from: i */
    public static C20589d m48369i(int i) {
        C20589d dVar = C20604l.f52118c.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException(C25541a.m63878h("Unable to find form with the given id (", i, ")"));
    }

    /* renamed from: l */
    public static C20589d m48370l(Itinerary itinerary) {
        for (C20589d next : C20604l.f52117b) {
            if (next.mo52788n(itinerary)) {
                return next;
            }
        }
        throw new IllegalStateException("Unable to find satisfying form");
    }

    /* renamed from: a */
    public void mo52782a(C12797f fVar, Itinerary itinerary, TripPlannerLocations tripPlannerLocations) {
        FormatTextView formatTextView = (FormatTextView) fVar.mo39639f(R.id.relative_time);
        formatTextView.setText((CharSequence) null);
        Context context = formatTextView.getContext();
        String r = C16783l.m42486r(context, itinerary);
        if (C20964s0.m49090h(formatTextView.getFormat())) {
            formatTextView.setText(r);
        } else {
            formatTextView.setArguments(r);
        }
        formatTextView.setContentDescription(context.getString(R.string.voice_over_tripplan_total_time, new Object[]{C7925b.m18020h(context, C16783l.m42485q(itinerary, TimeUnit.MILLISECONDS))}));
    }

    /* renamed from: b */
    public void mo52789b(C20590e.C20591a aVar, Itinerary itinerary) {
        aVar.f52079a.setVisibility(8);
    }

    /* renamed from: c */
    public void mo52783c(C20590e.C20592b bVar, Itinerary itinerary, C16769e.C16772c cVar) {
    }

    /* renamed from: g */
    public StringBuilder mo52790g(C20590e.C20592b bVar, int i) {
        Context e = bVar.mo39638e();
        StringBuilder sb = new StringBuilder();
        C13382a.m33666b(sb, e.getString(R.string.voice_over_lineview_route_letter, new Object[]{String.valueOf(i + 1)}));
        return sb;
    }

    /* renamed from: h */
    public abstract View mo52786h(ViewGroup viewGroup);

    @SuppressLint({"WrongConstant"})
    /* renamed from: j */
    public final <L extends Leg> L mo52791j(Itinerary itinerary) {
        if (mo52787k() != 0) {
            int[] iArr = {mo52787k()};
            C18277b bVar = C16783l.f43688a;
            return C16783l.m42476h(itinerary.mo48295u0(), -1, iArr);
        }
        throw new ApplicationBugException(getClass().getSimpleName() + " has no leg type!");
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: k */
    public abstract int mo52787k();

    /* renamed from: m */
    public void mo52784m(C20590e.C20592b bVar, Itinerary itinerary, StringBuilder sb) {
        Context e = bVar.mo39638e();
        TextView textView = (TextView) bVar.mo39639f(R.id.relative_time);
        if (textView != null) {
            C13382a.m33666b(sb, textView.getContentDescription());
        }
        TextView textView2 = (TextView) bVar.mo39639f(R.id.time);
        if (textView2 != null) {
            C13382a.m33666b(sb, textView2.getContentDescription());
        }
        TextView textView3 = (TextView) bVar.mo39639f(R.id.arrival_time);
        if (textView3 != null) {
            C13382a.m33666b(sb, textView3.getContentDescription());
        }
        TextView textView4 = (TextView) bVar.mo39639f(R.id.fare);
        if (textView4 != null && textView4.getVisibility() != 8) {
            C13382a.m33666b(sb, e.getString(R.string.voiceover_suggested_routes_fare, new Object[]{textView4.getText()}));
        }
    }

    /* renamed from: n */
    public abstract boolean mo52788n(Itinerary itinerary);
}
