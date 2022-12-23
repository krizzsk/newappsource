package com.moovit.app.tod.bottomsheet.stateviews;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import c00.C13717b;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.google.android.material.chip.Chip;
import com.moovit.app.animation.AnimationPlayer;
import com.moovit.app.animation.LocalAnimation;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideVehicle;
import com.moovit.app.tod.model.TodRideVehicleAC;
import com.moovit.app.tod.model.TodRideVehicleAction;
import com.moovit.app.tod.model.TodRideVehicleAudio;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import j00.C17682a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k00.C17988b;
import p330z2.C7442r;
import p370ar.C13506a;
import p502fx.C17122g;
import p927xw.C20652s;
import p977zz.C20941h;
import p977zz.C20944i0;

public class TodAutonomousRideHeadingDropOffView extends TodMotionLayoutView {

    /* renamed from: n */
    public static final /* synthetic */ int f40135n = 0;

    /* renamed from: d */
    public final MotionLayout f40136d;

    /* renamed from: e */
    public final LottieAnimationView f40137e;

    /* renamed from: f */
    public final LottieAnimationView f40138f;

    /* renamed from: g */
    public final TextView f40139g;

    /* renamed from: h */
    public final TextView f40140h;

    /* renamed from: i */
    public final TextView f40141i;

    /* renamed from: j */
    public final TextView f40142j;

    /* renamed from: k */
    public final TextView f40143k;

    /* renamed from: l */
    public final List<C20944i0<Chip, ListItemView>> f40144l;

    /* renamed from: m */
    public boolean f40145m;

    /* renamed from: com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideHeadingDropOffView$a */
    public class C15478a extends C17682a {
        public C15478a() {
        }

        public final void onAnimationEnd(Animator animator) {
            TodRide currentRide = TodAutonomousRideHeadingDropOffView.this.getCurrentRide();
            if (currentRide != null) {
                currentRide.f40280r.mo44768c(TodAutonomousRideHeadingDropOffView.this.f40137e, LocalAnimation.CAR_DRIVES_BG, new C13506a(-1));
                currentRide.f40280r.mo44768c(TodAutonomousRideHeadingDropOffView.this.f40138f, LocalAnimation.CAR_DRIVES_CAR, new C13506a(-1));
                TodAutonomousRideHeadingDropOffView.this.f40137e.f6419f.f6483d.removeListener(this);
            }
        }
    }

    /* renamed from: com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideHeadingDropOffView$b */
    public static /* synthetic */ class C15479b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40147a;

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
                f40147a = r0
                com.moovit.app.tod.model.TodRideVehicleAction r1 = com.moovit.app.tod.model.TodRideVehicleAction.AC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40147a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.tod.model.TodRideVehicleAction r1 = com.moovit.app.tod.model.TodRideVehicleAction.AUDIO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideHeadingDropOffView.C15479b.<clinit>():void");
        }
    }

    public TodAutonomousRideHeadingDropOffView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo40574a(TodRide todRide, C17122g gVar) {
        C7442r rVar;
        List list;
        boolean z;
        int i;
        TodRideVehicleAction todRideVehicleAction;
        String str;
        int i2;
        int i3;
        int i4;
        TodRide todRide2 = todRide;
        C17122g gVar2 = gVar;
        this.f40193c = todRide2;
        UiUtils.m40234B(this.f40139g, C20652s.m48553h(getContext(), todRide2, gVar2));
        UiUtils.m40234B(this.f40140h, C20652s.m48550e(todRide, gVar));
        if (gVar2 != null) {
            rVar = gVar2.f44321i;
        } else {
            rVar = null;
        }
        if (rVar != null) {
            list = (List) rVar.f22858b;
        } else {
            list = Collections.emptyList();
        }
        int i5 = 0;
        for (C20944i0 next : this.f40144l) {
            if (i5 < list.size()) {
                i = i5 + 1;
                todRideVehicleAction = (TodRideVehicleAction) list.get(i5);
            } else {
                i = i5;
                todRideVehicleAction = null;
            }
            ((Chip) next.f52692a).setTag(todRideVehicleAction);
            ((ListItemView) next.f52693b).setTag(todRideVehicleAction);
            Chip chip = (Chip) next.f52692a;
            ListItemView listItemView = (ListItemView) next.f52693b;
            if (todRideVehicleAction == null || rVar == null) {
                UiUtils.m40238F(8, chip, listItemView);
            } else {
                int i6 = C15479b.f40147a[todRideVehicleAction.ordinal()];
                if (i6 == 1) {
                    TodRideVehicleAC todRideVehicleAC = (TodRideVehicleAC) rVar.f22860d;
                    if (todRideVehicleAC == null) {
                        UiUtils.m40238F(8, chip, listItemView);
                    } else {
                        Context context = listItemView.getContext();
                        if (todRideVehicleAC.f40309b) {
                            str = context.getString(R.string.tod_autonomous_ride_ac_temp, new Object[]{Float.valueOf(todRideVehicleAC.f40311d)});
                        } else {
                            str = context.getString(R.string.tod_ac_off);
                        }
                        listItemView.setIcon((int) R.drawable.ic_tod_autonomous_ride_ac_24_on_surface);
                        listItemView.setText((int) R.string.tod_autonomous_ride_ac);
                        listItemView.setAccessoryText((CharSequence) str);
                        if (todRideVehicleAC.f40309b) {
                            i2 = R.attr.colorPrimary;
                        } else {
                            i2 = R.attr.colorOnSurfaceEmphasisHigh;
                        }
                        ((TextView) listItemView.getAccessoryView()).setTextColor(C20941h.m49043f(i2, context));
                        chip.setChipIcon(C17988b.m44611b(R.drawable.ic_tod_autonomous_ride_ac_16, chip.getContext()));
                        chip.setText(str);
                        chip.setSelected(todRideVehicleAC.f40309b);
                        UiUtils.m40238F(0, chip, listItemView);
                    }
                } else if (i6 != 2) {
                    UiUtils.m40238F(8, chip, listItemView);
                } else {
                    TodRideVehicleAudio todRideVehicleAudio = (TodRideVehicleAudio) rVar.f22861e;
                    if (todRideVehicleAudio == null) {
                        UiUtils.m40238F(8, chip, listItemView);
                    } else {
                        Context context2 = listItemView.getContext();
                        if (todRideVehicleAudio.f40313b) {
                            i3 = R.string.tod_autonomous_ride_music_on;
                        } else {
                            i3 = R.string.tod_autonomous_ride_music_off;
                        }
                        String string = context2.getString(i3);
                        listItemView.setIcon((int) R.drawable.ic_tod_autonomous_ride_music_24_on_surface);
                        listItemView.setText((int) R.string.tod_autonomous_ride_music);
                        listItemView.setAccessoryText((CharSequence) string);
                        if (todRideVehicleAudio.f40313b) {
                            i4 = R.attr.colorPrimary;
                        } else {
                            i4 = R.attr.colorOnSurfaceEmphasisHigh;
                        }
                        ((TextView) listItemView.getAccessoryView()).setTextColor(C20941h.m49043f(i4, context2));
                        chip.setChipIcon(C17988b.m44611b(R.drawable.ic_tod_autonomous_ride_music_16, chip.getContext()));
                        chip.setText(string);
                        chip.setSelected(todRideVehicleAudio.f40313b);
                        UiUtils.m40238F(0, chip, listItemView);
                    }
                }
            }
            i5 = i;
        }
        TodRideVehicle todRideVehicle = todRide2.f40268f;
        if (!C13717b.m34258e(list) || todRideVehicle == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f40141i.setText(todRideVehicle.f40306f);
            this.f40142j.setText(todRideVehicle.f40302b);
            this.f40143k.setText(C20652s.m48552g(todRideVehicle));
            UiUtils.m40238F(0, this.f40141i, this.f40142j, this.f40143k);
        } else {
            UiUtils.m40238F(8, this.f40141i, this.f40142j, this.f40143k);
        }
        if (gVar2 == null || !this.f40145m) {
            AnimationPlayer animationPlayer = todRide2.f40280r;
            LottieAnimationView lottieAnimationView = this.f40137e;
            LocalAnimation localAnimation = LocalAnimation.START_RIDE_BG;
            C13506a aVar = C13506a.f33421c;
            animationPlayer.mo44768c(lottieAnimationView, localAnimation, aVar);
            todRide2.f40280r.mo44768c(this.f40138f, LocalAnimation.START_RIDE_CAR, aVar);
            this.f40145m = true;
        }
    }

    /* renamed from: b */
    public final boolean mo46277b() {
        for (C20944i0<Chip, ListItemView> i0Var : this.f40144l) {
            if (((ListItemView) i0Var.f52693b).getVisibility() == 0) {
                return false;
            }
        }
        return true;
    }

    public MotionLayout getMotionLayout() {
        return this.f40136d;
    }

    public TodAutonomousRideHeadingDropOffView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C15478a aVar = new C15478a();
        LayoutInflater.from(context).inflate(R.layout.tod_autonomous_ride_heading_to_drop_off_view, this, true);
        this.f40136d = (MotionLayout) findViewById(R.id.container);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.tod_autonomous_ride_car_anim_bg);
        this.f40137e = lottieAnimationView;
        lottieAnimationView.f6419f.f6483d.addListener(aVar);
        this.f40138f = (LottieAnimationView) findViewById(R.id.tod_autonomous_ride_car_anim);
        this.f40139g = (TextView) findViewById(R.id.tod_autonomous_ride_title);
        this.f40140h = (TextView) findViewById(R.id.tod_autonomous_ride_subtitle);
        this.f40141i = (TextView) findViewById(R.id.tod_autonomous_ride_car_model);
        this.f40142j = (TextView) findViewById(R.id.tod_autonomous_ride_license_plate);
        this.f40143k = (TextView) findViewById(R.id.tod_autonomous_ride_vehicle_info);
        List<C20944i0<Chip, ListItemView>> asList = Arrays.asList(new C20944i0[]{new C20944i0((Chip) findViewById(R.id.tod_autonomous_ride_button_1), (ListItemView) findViewById(R.id.tod_autonomous_ride_action_1)), new C20944i0((Chip) findViewById(R.id.tod_autonomous_ride_button_2), (ListItemView) findViewById(R.id.tod_autonomous_ride_action_2))});
        this.f40144l = asList;
        C4052r rVar = new C4052r(this, 26);
        for (C20944i0 next : asList) {
            ((Chip) next.f52692a).setOnClickListener(rVar);
            ((ListItemView) next.f52693b).setOnClickListener(rVar);
        }
    }
}
