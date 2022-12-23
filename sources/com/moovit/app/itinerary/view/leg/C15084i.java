package com.moovit.app.itinerary.view.leg;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import java.util.List;
import p977zz.C20930c;
import p977zz.C20958p0;
import p977zz.C20964s0;
import x00.C20440a;

/* renamed from: com.moovit.app.itinerary.view.leg.i */
public final class C15084i extends AbstractLegView<Leg> {
    public C15084i(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public final ServerId mo45368A(Leg leg) {
        if (leg.mo48332W().f23647b == LocationDescriptor.LocationType.STOP) {
            return leg.mo48332W().f23649d;
        }
        return null;
    }

    /* renamed from: l */
    public final String mo45382l() {
        Context context = getContext();
        LocationDescriptor W = getLeg().mo48332W();
        Time o1 = getLeg().mo48339o1();
        String f = W.mo24313f();
        String l = C7925b.m18024l(context, o1.mo24631g());
        return getContext().getString(R.string.voice_over_livedirections_start_card, new Object[]{f, l});
    }

    /* renamed from: u */
    public final AbstractLegView.FooterViewType mo45393u(Leg leg) {
        return AbstractLegView.FooterViewType.NONE;
    }

    /* renamed from: v */
    public final CharSequence mo45394v(Leg leg) {
        SpannableString spannableString = new SpannableString(C7925b.m18024l(getContext(), leg.mo48339o1().mo24631g()));
        spannableString.setSpan(C20964s0.m49084b(getContext(), R.attr.textAppearanceCaptionStrong, R.attr.colorOnSurfaceEmphasisHigh), 0, spannableString.length(), 33);
        return C20958p0.m49078b(C20930c.m49020b(getContext()), getResources().getString(R.string.tripplan_itinerary_leave_time_start_from), spannableString);
    }

    /* renamed from: w */
    public final Image mo45395w(Leg leg) {
        return leg.mo48332W().f23655j;
    }

    /* renamed from: x */
    public final ResourceImage mo45396x(Leg leg) {
        return new ResourceImage(R.drawable.ic_trip_origin_24_on_surface_emphasis_medium, new String[0]);
    }

    /* renamed from: y */
    public final List<C20440a> mo45397y(Leg leg) {
        return leg.mo48332W().f23652g;
    }

    /* renamed from: z */
    public final CharSequence mo45398z(Leg leg) {
        return leg.mo48332W().f23651f;
    }
}
