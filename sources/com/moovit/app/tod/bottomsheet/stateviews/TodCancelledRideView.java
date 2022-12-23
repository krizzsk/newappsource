package com.moovit.app.tod.bottomsheet.stateviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideStatus;
import com.moovit.app.tod.view.TodRideJourneyView;
import com.tranzmate.R;
import p400bx.C13706b;
import p502fx.C17122g;
import p927xw.C20652s;

public class TodCancelledRideView extends ConstraintLayout implements C13706b {

    /* renamed from: h */
    public final TextView f40179h;

    /* renamed from: i */
    public final TextView f40180i;

    /* renamed from: j */
    public final TodRideJourneyView f40181j;

    /* renamed from: k */
    public final ImageView f40182k;

    public TodCancelledRideView() {
        throw null;
    }

    public TodCancelledRideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo40574a(TodRide todRide, C17122g gVar) {
        String str;
        Context context = getContext();
        this.f40179h.setText(C20652s.m48553h(context, todRide, gVar));
        TextView textView = this.f40180i;
        TodRideStatus todRideStatus = todRide.f40266d;
        int i = C20652s.C20653a.f52226b[todRideStatus.ordinal()];
        if (i == 1) {
            str = context.getString(R.string.tod_passenger_ride_status_active_message);
        } else if (i == 2) {
            str = context.getString(R.string.tod_future_ride_provider_name, new Object[]{todRide.f40273k});
        } else if (i == 3) {
            str = context.getString(R.string.tod_passenger_ride_status_passenger_not_shown_title);
        } else if (i == 4 || i == 5) {
            str = context.getString(R.string.tod_passenger_ride_status_cancelled_message);
        } else {
            throw new IllegalStateException("Unhandled state: " + todRideStatus);
        }
        textView.setText(str);
        this.f40181j.setJourney(todRide.f40267e);
        if (gVar != null) {
            this.f40181j.setJourneyStatus(gVar.f44315c);
        }
    }

    public int getPeekHeight() {
        return (getHeight() - this.f40181j.getMeasuredHeight()) - this.f40182k.getMeasuredHeight();
    }

    /* renamed from: h */
    public final View mo40576h() {
        return this;
    }

    public /* bridge */ /* synthetic */ void setSlideOffset(float f) {
    }

    public TodCancelledRideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.tod_cancelled_ride_view, this, true);
        this.f40179h = (TextView) findViewById(R.id.tod_cancelled_ride_header);
        this.f40180i = (TextView) findViewById(R.id.tod_cancelled_ride_subtitle);
        this.f40181j = (TodRideJourneyView) findViewById(R.id.tod_cancelled_ride_journey);
        this.f40182k = (ImageView) findViewById(R.id.divider1);
    }
}
