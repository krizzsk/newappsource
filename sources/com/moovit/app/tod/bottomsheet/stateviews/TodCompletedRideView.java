package com.moovit.app.tod.bottomsheet.stateviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.moovit.app.tod.model.TodRide;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import p400bx.C13706b;
import p502fx.C17122g;
import p783rw.C19370b;

public class TodCompletedRideView extends ConstraintLayout implements C13706b {

    /* renamed from: k */
    public static final /* synthetic */ int f40183k = 0;

    /* renamed from: h */
    public final TextView f40184h;

    /* renamed from: i */
    public final TextView f40185i;

    /* renamed from: j */
    public final Button f40186j;

    public TodCompletedRideView() {
        throw null;
    }

    public TodCompletedRideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo40574a(TodRide todRide, C17122g gVar) {
        TodRide todRide2;
        boolean z;
        int i;
        this.f40184h.setText(todRide.f40267e.f40287e.mo24313f());
        if (gVar != null) {
            todRide2 = gVar.f44324l;
        } else {
            todRide2 = null;
        }
        if (todRide2 != null) {
            z = todRide2.f40277o;
        } else {
            z = todRide.f40277o;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        UiUtils.m40238F(i, this.f40185i, this.f40186j);
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

    public TodCompletedRideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.tod_completed_ride_view, this, true);
        this.f40184h = (TextView) findViewById(R.id.tod_completed_ride_subtitle);
        this.f40185i = (TextView) findViewById(R.id.rate_message);
        Button button = (Button) findViewById(R.id.rate_button);
        this.f40186j = button;
        button.setOnClickListener(new C19370b(this, 3));
    }
}
