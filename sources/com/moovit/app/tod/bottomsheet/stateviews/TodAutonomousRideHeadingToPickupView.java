package com.moovit.app.tod.bottomsheet.stateviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.moovit.app.animation.LocalAnimation;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideVehicle;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import p039c7.C1800c;
import p370ar.C13506a;
import p502fx.C17122g;
import p927xw.C20652s;

public class TodAutonomousRideHeadingToPickupView extends TodMotionLayoutView {

    /* renamed from: q */
    public static final /* synthetic */ int f40148q = 0;

    /* renamed from: d */
    public final MotionLayout f40149d;

    /* renamed from: e */
    public final TextView f40150e;

    /* renamed from: f */
    public final TextView f40151f;

    /* renamed from: g */
    public final LottieAnimationView f40152g;

    /* renamed from: h */
    public final LottieAnimationView f40153h;

    /* renamed from: i */
    public final TextView f40154i;

    /* renamed from: j */
    public final TextView f40155j;

    /* renamed from: k */
    public final TextView f40156k;

    /* renamed from: l */
    public final ImageView f40157l;

    /* renamed from: m */
    public final ImageButton f40158m;

    /* renamed from: n */
    public final TextView f40159n;

    /* renamed from: o */
    public final TextView f40160o;

    /* renamed from: p */
    public boolean f40161p;

    public TodAutonomousRideHeadingToPickupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo40574a(TodRide todRide, C17122g gVar) {
        String str;
        this.f40193c = todRide;
        UiUtils.m40234B(this.f40150e, C20652s.m48553h(getContext(), todRide, gVar));
        UiUtils.m40234B(this.f40151f, C20652s.m48550e(todRide, gVar));
        TodRideVehicle todRideVehicle = todRide.f40268f;
        TextView textView = this.f40154i;
        String str2 = null;
        if (todRideVehicle != null) {
            str = todRideVehicle.f40306f;
        } else {
            str = null;
        }
        UiUtils.m40234B(textView, str);
        TextView textView2 = this.f40155j;
        if (todRideVehicle != null) {
            str2 = todRideVehicle.f40302b;
        }
        UiUtils.m40234B(textView2, str2);
        this.f40156k.setText(C20652s.m48552g(todRideVehicle));
        C20652s.m48554i(gVar, this.f40157l, this.f40158m);
        UiUtils.m40267z(this.f40157l, this.f40159n);
        UiUtils.m40267z(this.f40157l, this.f40160o);
        if (gVar == null || !this.f40161p) {
            todRide.f40280r.mo44768c(this.f40152g, LocalAnimation.CAR_DRIVES_BG, new C13506a(-1));
            todRide.f40280r.mo44768c(this.f40153h, LocalAnimation.CAR_DRIVES_CAR, new C13506a(-1));
            this.f40161p = true;
        }
    }

    /* renamed from: b */
    public final boolean mo46277b() {
        return this.f40157l.getVisibility() == 8;
    }

    public MotionLayout getMotionLayout() {
        return this.f40149d;
    }

    public TodAutonomousRideHeadingToPickupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.tod_autonomous_ride_heading_to_pickup_view, this, true);
        this.f40149d = (MotionLayout) findViewById(R.id.container);
        this.f40150e = (TextView) findViewById(R.id.tod_autonomous_ride_title);
        this.f40152g = (LottieAnimationView) findViewById(R.id.tod_autonomous_ride_car_anim_bg);
        this.f40153h = (LottieAnimationView) findViewById(R.id.tod_autonomous_ride_car_anim);
        this.f40151f = (TextView) findViewById(R.id.tod_autonomous_ride_subtitle);
        this.f40154i = (TextView) findViewById(R.id.tod_autonomous_ride_car_model);
        this.f40155j = (TextView) findViewById(R.id.tod_autonomous_ride_license_plate);
        this.f40156k = (TextView) findViewById(R.id.tod_autonomous_ride_vehicle_info);
        this.f40157l = (ImageView) findViewById(R.id.tod_autonomous_ride_color_bar);
        this.f40159n = (TextView) findViewById(R.id.tod_autonomous_ride_color_bar_title);
        this.f40160o = (TextView) findViewById(R.id.tod_autonomous_ride_color_bar_message);
        ImageButton imageButton = (ImageButton) findViewById(R.id.tod_autonomous_ride_color_button);
        this.f40158m = imageButton;
        imageButton.setOnClickListener(new C1800c(this, 26));
    }
}
