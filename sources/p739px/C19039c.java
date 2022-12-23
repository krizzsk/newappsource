package p739px;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.slider.Slider;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.animation.LocalAnimation;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideVehicleAC;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import java.util.Arrays;
import p066e0.C4454r0;
import p073e7.C4584b;
import p370ar.C13506a;
import p543hq.C17474b;
import p567iq.C17635b;
import p584jl.C17885a;

/* renamed from: px.c */
public class C19039c extends C15676b<MoovitAppActivity> {

    /* renamed from: s */
    public static final String[] f48415s = {"#3aaefc", "#57a6fc", "#719df9", "#8994f3", "#9e8aeb", "#b17edf", "#c173d1", "#ce67c0", "#d95bad", "#e05098", "#e44783", "#e4406c", "#e13e56", "#da3f3f"};

    /* renamed from: h */
    public TodRideVehicleAC f48416h;

    /* renamed from: i */
    public LottieAnimationView f48417i;

    /* renamed from: j */
    public FloatingActionButton f48418j;

    /* renamed from: k */
    public TextView f48419k;

    /* renamed from: l */
    public ImageView f48420l;

    /* renamed from: m */
    public Slider f48421m;

    /* renamed from: n */
    public ImageView f48422n;

    /* renamed from: o */
    public ImageView f48423o;

    /* renamed from: p */
    public Slider f48424p;

    /* renamed from: q */
    public ImageView f48425q;

    /* renamed from: r */
    public TodRide f48426r;

    public C19039c() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(requireContext()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: S1 */
    public final void mo51496S1(int i, boolean z) {
        LocalAnimation localAnimation;
        if (!z) {
            this.f48417i.setTag((Object) null);
            this.f48417i.clearAnimation();
            this.f48417i.setImageResource(R.drawable.img_tod_autonomuos_ride_car_ac);
            return;
        }
        if (i > Math.round((this.f48424p.getValueTo() + this.f48424p.getValueFrom()) / 2.0f)) {
            localAnimation = LocalAnimation.CAR_AC_HEAT;
        } else {
            localAnimation = LocalAnimation.CAR_AC_FREEZE;
        }
        this.f48426r.f40280r.mo44768c(this.f48417i, localAnimation, new C13506a(-1));
    }

    /* renamed from: T1 */
    public final void mo51497T1() {
        int i;
        int i2;
        boolean isActivated = this.f48418j.isActivated();
        FloatingActionButton floatingActionButton = this.f48418j;
        if (isActivated) {
            i = 2131952807;
        } else {
            i = 2131952808;
        }
        C17885a.m44443j(floatingActionButton, i);
        TextView textView = this.f48419k;
        if (isActivated) {
            i2 = R.string.tod_ac_on;
        } else {
            i2 = R.string.tod_ac_off;
        }
        textView.setText(i2);
        mo51496S1((int) this.f48424p.getValue(), isActivated);
        UiUtils.m40262u(Arrays.asList(new View[]{this.f48420l, this.f48421m, this.f48422n, this.f48423o, this.f48424p, this.f48425q}), isActivated);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle K1 = mo46752K1();
        this.f48416h = (TodRideVehicleAC) K1.getParcelable("vehicleAC");
        this.f48426r = (TodRide) K1.getParcelable("ride");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TodRideVehicleAC todRideVehicleAC;
        int i;
        String str;
        View inflate = layoutInflater.inflate(R.layout.tod_ac_dialog_fragment, viewGroup, false);
        if (bundle != null) {
            todRideVehicleAC = (TodRideVehicleAC) bundle.getParcelable("vehicleAC");
        } else {
            todRideVehicleAC = null;
        }
        if (todRideVehicleAC == null) {
            todRideVehicleAC = this.f48416h;
        }
        FloatingActionButton floatingActionButton = (FloatingActionButton) inflate.findViewById(R.id.fab);
        this.f48418j = floatingActionButton;
        floatingActionButton.setActivated(todRideVehicleAC.f40309b);
        this.f48418j.setOnClickListener(new C4584b(this, 26));
        this.f48417i = (LottieAnimationView) inflate.findViewById(R.id.animation_view);
        this.f48419k = (TextView) inflate.findViewById(R.id.ac_state);
        this.f48420l = (ImageView) inflate.findViewById(R.id.small_fan);
        this.f48421m = (Slider) inflate.findViewById(R.id.fan_level_slider);
        this.f48422n = (ImageView) inflate.findViewById(R.id.big_fan);
        this.f48423o = (ImageView) inflate.findViewById(R.id.cold);
        this.f48424p = (Slider) inflate.findViewById(R.id.temperature_slider);
        this.f48425q = (ImageView) inflate.findViewById(R.id.hot);
        ((Button) inflate.findViewById(R.id.save_button)).setOnClickListener(new C19037a(this, 0));
        this.f48421m.setValue((float) todRideVehicleAC.f40310c);
        Slider slider = this.f48424p;
        int valueFrom = (int) slider.getValueFrom();
        int valueTo = (int) this.f48424p.getValueTo();
        SparseArray sparseArray = new SparseArray(Math.max(0, valueTo - valueFrom));
        ColorStateList trackActiveTintList = slider.getTrackActiveTintList();
        int colorForState = trackActiveTintList.getColorForState(new int[]{-16842910}, trackActiveTintList.getDefaultColor());
        int[][] iArr = {new int[]{-16842910}, new int[0]};
        int i2 = 0;
        while (valueFrom <= valueTo) {
            String[] strArr = f48415s;
            if (i2 < 14) {
                i = i2 + 1;
                str = strArr[i2];
            } else {
                i = i2;
                str = strArr[13];
            }
            sparseArray.append(valueFrom, new ColorStateList(iArr, new int[]{colorForState, Color.parseColor(str)}));
            valueFrom++;
            i2 = i;
        }
        this.f48424p.setValue(todRideVehicleAC.f40311d);
        this.f48424p.setLabelFormatter(new C4454r0(10));
        Slider slider2 = this.f48424p;
        slider2.setTrackActiveTintList((ColorStateList) sparseArray.get((int) slider2.getValue()));
        this.f48424p.mo42220v(new C19038b(this, sparseArray));
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("vehicleAC", new TodRideVehicleAC((int) this.f48421m.getValue(), this.f48424p.getValue(), this.f48418j.isActivated()));
    }

    public final void onStart() {
        super.onStart();
        Context requireContext = requireContext();
        C17635b.m43779f(requireContext).f50173c.mo22849g(requireContext, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_tod_ride_ac");
        mo22564R1(aVar.mo49933a());
    }

    public final void onStop() {
        super.onStop();
        mo22564R1(new C17474b(AnalyticsEventKey.CLOSE_POPUP));
        Context requireContext = requireContext();
        C17635b.m43779f(requireContext).f50173c.mo22847b(requireContext, AnalyticsFlowKey.POPUP, true);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo51497T1();
    }
}
