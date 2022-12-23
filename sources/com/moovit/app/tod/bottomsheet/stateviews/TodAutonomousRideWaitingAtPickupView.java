package com.moovit.app.tod.bottomsheet.stateviews;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.moovit.app.animation.AnimationPlayer;
import com.moovit.app.animation.LocalAnimation;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideVehicle;
import com.moovit.app.tod.model.TodRideVehicleAction;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import j00.C17682a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p297w5.C6994a;
import p330z2.C7442r;
import p370ar.C13506a;
import p471eq.C16850a;
import p502fx.C17117b;
import p502fx.C17122g;
import p572iw.C17662e;
import p584jl.C17885a;
import p927xw.C20652s;

public class TodAutonomousRideWaitingAtPickupView extends TodMotionLayoutView {

    /* renamed from: r */
    public static final /* synthetic */ int f40162r = 0;

    /* renamed from: d */
    public final MotionLayout f40163d;

    /* renamed from: e */
    public final LottieAnimationView f40164e;

    /* renamed from: f */
    public final LottieAnimationView f40165f;

    /* renamed from: g */
    public final TextView f40166g;

    /* renamed from: h */
    public final TextView f40167h;

    /* renamed from: i */
    public final TextView f40168i;

    /* renamed from: j */
    public final TextView f40169j;

    /* renamed from: k */
    public final TextView f40170k;

    /* renamed from: l */
    public final TextView f40171l;

    /* renamed from: m */
    public final ImageButton f40172m;

    /* renamed from: n */
    public final Button f40173n;

    /* renamed from: o */
    public final List<Button> f40174o;

    /* renamed from: p */
    public boolean f40175p;

    /* renamed from: q */
    public final C15480a f40176q;

    /* renamed from: com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView$a */
    public class C15480a extends C17682a {
        public C15480a() {
        }

        public final void onAnimationEnd(Animator animator) {
            TodAutonomousRideWaitingAtPickupView.this.f40165f.setTag((Object) null);
            TodAutonomousRideWaitingAtPickupView.this.f40164e.f6419f.f6483d.removeListener(this);
        }
    }

    /* renamed from: com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView$b */
    public static /* synthetic */ class C15481b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40178a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.app.tod.model.TodRideVehicleAction[] r0 = com.moovit.app.tod.model.TodRideVehicleAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40178a = r0
                com.moovit.app.tod.model.TodRideVehicleAction r1 = com.moovit.app.tod.model.TodRideVehicleAction.BEEP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40178a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.tod.model.TodRideVehicleAction r1 = com.moovit.app.tod.model.TodRideVehicleAction.FLASH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideWaitingAtPickupView.C15481b.<clinit>():void");
        }
    }

    public TodAutonomousRideWaitingAtPickupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo40574a(TodRide todRide, C17122g gVar) {
        String str;
        String str2;
        C7442r rVar;
        List list;
        C17117b bVar;
        int i;
        TodRideVehicleAction todRideVehicleAction;
        this.f40193c = todRide;
        Context context = getContext();
        UiUtils.m40234B(this.f40166g, C20652s.m48553h(context, todRide, gVar));
        UiUtils.m40234B(this.f40167h, C20652s.m48550e(todRide, gVar));
        TodRideVehicle todRideVehicle = todRide.f40268f;
        TextView textView = this.f40168i;
        if (todRideVehicle != null) {
            str = todRideVehicle.f40306f;
        } else {
            str = null;
        }
        UiUtils.m40234B(textView, str);
        TextView textView2 = this.f40169j;
        if (todRideVehicle != null) {
            str2 = todRideVehicle.f40302b;
        } else {
            str2 = null;
        }
        UiUtils.m40234B(textView2, str2);
        this.f40170k.setText(C20652s.m48552g(todRideVehicle));
        int i2 = 0;
        C20652s.m48554i(gVar, this.f40172m);
        if (gVar != null) {
            rVar = gVar.f44321i;
        } else {
            rVar = null;
        }
        if (rVar != null) {
            list = (List) rVar.f22858b;
        } else {
            list = Collections.emptyList();
        }
        int i3 = 0;
        for (Button next : this.f40174o) {
            if (i3 < list.size()) {
                i = i3 + 1;
                todRideVehicleAction = (TodRideVehicleAction) list.get(i3);
            } else {
                i = i3;
                todRideVehicleAction = null;
            }
            next.setTag(todRideVehicleAction);
            if (todRideVehicleAction != null) {
                int i4 = C15481b.f40178a[todRideVehicleAction.ordinal()];
                if (i4 == 1) {
                    next.setText(R.string.tod_autonomous_ride_beep);
                    C17885a.m44467v0(next, R.drawable.ic_tod_autonomous_ride_horn_16);
                    next.setVisibility(0);
                } else if (i4 != 2) {
                    next.setVisibility(8);
                } else {
                    next.setText(R.string.tod_autonomous_ride_flash);
                    C17885a.m44467v0(next, R.drawable.ic_tod_autonomous_ride_flash_16);
                    next.setVisibility(0);
                }
            } else {
                next.setVisibility(8);
            }
            i3 = i;
        }
        Button button = this.f40173n;
        TextView textView3 = this.f40171l;
        if (gVar == null || (bVar = gVar.f44320h) == null) {
            UiUtils.m40238F(8, button, textView3);
        } else {
            C20652s.m48546a(button, textView3, bVar);
        }
        int f = (int) UiUtils.m40247f(context.getResources(), 16.0f);
        MotionLayout motionLayout = this.f40163d;
        int paddingLeft = motionLayout.getPaddingLeft();
        int paddingTop = this.f40163d.getPaddingTop();
        int paddingRight = this.f40163d.getPaddingRight();
        if (mo46277b()) {
            i2 = f;
        }
        motionLayout.setPadding(paddingLeft, paddingTop, paddingRight, i2);
        if (gVar == null || !this.f40175p) {
            AnimationPlayer animationPlayer = todRide.f40280r;
            LottieAnimationView lottieAnimationView = this.f40164e;
            LocalAnimation localAnimation = LocalAnimation.CAR_ARRIVES_BG;
            C13506a aVar = C13506a.f33421c;
            animationPlayer.mo44768c(lottieAnimationView, localAnimation, aVar);
            todRide.f40280r.mo44768c(this.f40165f, LocalAnimation.CAR_ARRIVES_CAR, aVar);
            this.f40175p = true;
        }
    }

    /* renamed from: b */
    public final boolean mo46277b() {
        return this.f40173n.getVisibility() == 8;
    }

    public MotionLayout getMotionLayout() {
        return this.f40163d;
    }

    public TodAutonomousRideWaitingAtPickupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40176q = new C15480a();
        LayoutInflater.from(context).inflate(R.layout.tod_autonomous_ride_waiting_at_pickup_view, this, true);
        this.f40163d = (MotionLayout) findViewById(R.id.container);
        this.f40164e = (LottieAnimationView) findViewById(R.id.tod_autonomous_ride_car_anim_bg);
        this.f40165f = (LottieAnimationView) findViewById(R.id.tod_autonomous_ride_car_anim);
        this.f40166g = (TextView) findViewById(R.id.tod_autonomous_ride_title);
        this.f40167h = (TextView) findViewById(R.id.tod_autonomous_ride_subtitle);
        this.f40168i = (TextView) findViewById(R.id.tod_autonomous_ride_car_model);
        this.f40169j = (TextView) findViewById(R.id.tod_autonomous_ride_license_plate);
        this.f40170k = (TextView) findViewById(R.id.tod_autonomous_ride_vehicle_info);
        this.f40171l = (TextView) findViewById(R.id.tod_autonomous_ride_button_instruction);
        ImageButton imageButton = (ImageButton) findViewById(R.id.tod_autonomous_ride_color_button);
        this.f40172m = imageButton;
        imageButton.setOnClickListener(new C6994a(this, 26));
        Button button = (Button) findViewById(R.id.tod_autonomous_ride_passenger_action_button);
        this.f40173n = button;
        button.setOnClickListener(new C16850a(this, 24));
        List<Button> asList = Arrays.asList(new Button[]{(Button) findViewById(R.id.tod_autonomous_ride_vehicle_action_button_1), (Button) findViewById(R.id.tod_autonomous_ride_vehicle_action_button_2)});
        this.f40174o = asList;
        C17662e eVar = new C17662e(this, 3);
        for (Button onClickListener : asList) {
            onClickListener.setOnClickListener(eVar);
        }
    }
}
