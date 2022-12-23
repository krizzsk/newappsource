package com.moovit.app.tod.bottomsheet.stateviews;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.view.TodRideJourneyView;
import com.moovit.commons.view.FormatTextView;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import p400bx.C13706b;
import p502fx.C17122g;
import p927xw.C20652s;
import p977zz.C20964s0;

public class TodFutureRideView extends ConstraintLayout implements C13706b {

    /* renamed from: h */
    public final TextView f40187h;

    /* renamed from: i */
    public final FormatTextView f40188i;

    /* renamed from: j */
    public final FormatTextView f40189j;

    /* renamed from: k */
    public final TodRideJourneyView f40190k;

    /* renamed from: l */
    public final Group f40191l;

    public TodFutureRideView() {
        throw null;
    }

    public TodFutureRideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo40574a(TodRide todRide, C17122g gVar) {
        Context context = getContext();
        this.f40187h.setText(C20652s.m48553h(context, todRide, gVar));
        FormatTextView formatTextView = this.f40188i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(todRide.f40273k);
        int i = 0;
        spannableStringBuilder.setSpan(C20964s0.m49084b(context, R.attr.textAppearanceBodySmallStrong, R.attr.colorOnSurfaceEmphasisHigh), 0, spannableStringBuilder.length(), 33);
        formatTextView.setSpannedArguments(spannableStringBuilder);
        FormatTextView formatTextView2 = this.f40189j;
        long j = todRide.f40282t;
        if (j < 0) {
            formatTextView2.setVisibility(8);
        } else {
            Context context2 = formatTextView2.getContext();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C7925b.m18024l(context2, j));
            spannableStringBuilder2.setSpan(C20964s0.m49084b(context2, R.attr.textAppearanceBodySmallStrong, R.attr.colorOnSurfaceEmphasisHigh), 0, spannableStringBuilder2.length(), 33);
            formatTextView2.setSpannedArguments(spannableStringBuilder2);
            formatTextView2.setVisibility(0);
        }
        Group group = this.f40191l;
        if (!todRide.f40279q) {
            i = 8;
        }
        group.setVisibility(i);
        this.f40190k.setJourney(todRide.f40267e);
    }

    public /* bridge */ /* synthetic */ int getPeekHeight() {
        return -1;
    }

    /* renamed from: h */
    public final View mo40576h() {
        return this;
    }

    public /* bridge */ /* synthetic */ void setSlideOffset(float f) {
    }

    public TodFutureRideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.tod_future_ride_view, this, true);
        this.f40187h = (TextView) findViewById(R.id.tod_future_ride_header);
        this.f40188i = (FormatTextView) findViewById(R.id.tod_future_ride_subtitle);
        this.f40189j = (FormatTextView) findViewById(R.id.tod_future_ride_drop_off_time);
        this.f40190k = (TodRideJourneyView) findViewById(R.id.tod_future_ride_journey);
        this.f40191l = (Group) findViewById(R.id.group_tod_future_ride_status);
    }
}
