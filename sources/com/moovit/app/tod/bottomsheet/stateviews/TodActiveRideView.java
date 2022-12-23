package com.moovit.app.tod.bottomsheet.stateviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import c20.C13744a;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideVehicle;
import com.moovit.app.tod.view.TodRideJourneyView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.tranzmate.R;
import p502fx.C17122g;
import p927xw.C20652s;
import p977zz.C20964s0;

public class TodActiveRideView extends TodMotionLayoutView {

    /* renamed from: d */
    public final MotionLayout f40128d;

    /* renamed from: e */
    public final TextView f40129e;

    /* renamed from: f */
    public final TextView f40130f;

    /* renamed from: g */
    public final TextView f40131g;

    /* renamed from: h */
    public final TextView f40132h;

    /* renamed from: i */
    public final ImageView f40133i;

    /* renamed from: j */
    public final TodRideJourneyView f40134j;

    public TodActiveRideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo40574a(TodRide todRide, C17122g gVar) {
        String str;
        String str2;
        this.f40193c = todRide;
        Context context = getContext();
        TodRideVehicle todRideVehicle = todRide.f40268f;
        UiUtils.m40234B(this.f40129e, C20652s.m48553h(context, todRide, gVar));
        UiUtils.m40234B(this.f40130f, C20652s.m48550e(todRide, gVar));
        UiUtils.m40234B(this.f40131g, todRide.f40273k);
        TextView textView = this.f40132h;
        Image image = null;
        if (todRideVehicle != null) {
            str = todRideVehicle.f40302b;
        } else {
            str = null;
        }
        if (todRideVehicle != null) {
            str2 = todRideVehicle.f40303c;
        } else {
            str2 = null;
        }
        CharSequence q = C20964s0.m49099q(" · ", str, str2);
        if (C20964s0.m49090h(q)) {
            q = null;
        }
        UiUtils.m40234B(textView, q);
        if (todRideVehicle != null) {
            image = todRideVehicle.f40307g;
        }
        if (image == null) {
            image = new ResourceImage(R.drawable.img_traditional_tod_ride_default, new String[0]);
        }
        C13744a.m34300b(this.f40133i, image);
        this.f40134j.setJourney(todRide.f40267e);
        if (gVar != null) {
            this.f40134j.setJourneyStatus(gVar.f44315c);
        }
    }

    public MotionLayout getMotionLayout() {
        return this.f40128d;
    }

    public TodActiveRideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.tod_active_ride_view, this, true);
        this.f40128d = (MotionLayout) findViewById(R.id.container);
        this.f40129e = (TextView) findViewById(R.id.tod_active_ride_realtime_title);
        this.f40130f = (TextView) findViewById(R.id.tod_active_ride_realtime_subtitle);
        this.f40131g = (TextView) findViewById(R.id.tod_active_ride_realtime_provider);
        this.f40132h = (TextView) findViewById(R.id.tod_active_ride_realtime_vehicle_info);
        this.f40133i = (ImageView) findViewById(R.id.tod_active_ride_realtime_car_image);
        this.f40134j = (TodRideJourneyView) findViewById(R.id.tod_active_ride_realtime_journey);
    }
}
