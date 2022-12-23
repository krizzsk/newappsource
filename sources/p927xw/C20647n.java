package p927xw;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import c00.C13723g;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.tod.model.TodRideVehicleColorBar;
import com.moovit.commons.utils.Color;
import com.tranzmate.R;
import j00.C17691i;
import java.util.Arrays;
import java.util.List;
import p394br.C13661g;
import p471eq.C16850a;
import p501fw.C17102a;
import p543hq.C17474b;
import p567iq.C17635b;
import p589jq.C17910b;
import p599kc.C18017a;

/* renamed from: xw.n */
public class C20647n extends C15676b<MoovitAppActivity> {

    /* renamed from: k */
    public static final String f52214k = C20647n.class.getSimpleName();

    /* renamed from: h */
    public TodRideVehicleColorBar f52215h;

    /* renamed from: i */
    public ImageView f52216i;

    /* renamed from: j */
    public List<View> f52217j;

    public C20647n() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(requireContext()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: S1 */
    public final void mo52824S1() {
        Color color;
        View view = (View) C13723g.m34286g(this.f52217j, new C17910b(6));
        if (view != null) {
            color = (Color) view.getTag();
        } else {
            color = Color.f41004h;
        }
        ObjectAnimator.ofArgb(this.f52216i, C17691i.f45447e, new int[]{color.f41007b}).start();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f52215h = (TodRideVehicleColorBar) mo46752K1().getParcelable("colorBar");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.tod_ride_color_bar_dialog_fragment, viewGroup, false);
        this.f52216i = (ImageView) inflate.findViewById(R.id.color_indicator);
        this.f52217j = Arrays.asList(new View[]{inflate.findViewById(R.id.color1), inflate.findViewById(R.id.color2), inflate.findViewById(R.id.color3), inflate.findViewById(R.id.color4), inflate.findViewById(R.id.color5), inflate.findViewById(R.id.color6)});
        C18017a aVar = new C18017a(inflate.getContext());
        ColorStateList valueOf = ColorStateList.valueOf(aVar.mo50512a(this.f52217j.get(0).getElevation(), aVar.f46137d));
        for (View next : this.f52217j) {
            next.setTag(new Color(android.graphics.Color.parseColor((String) next.getTag())));
            next.setBackgroundTintList(valueOf);
            next.setOnClickListener(new C17102a(this, 4));
        }
        ((Button) inflate.findViewById(R.id.save_action)).setOnClickListener(new C16850a(this, 23));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        Context requireContext = requireContext();
        C17635b.m43779f(requireContext).f50173c.mo22849g(requireContext, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_tod_ride_color_bar");
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
        View view2 = (View) C13723g.m34286g(this.f52217j, new C13661g(this.f52215h.f40314b, 3));
        if (view2 != null) {
            view2.setActivated(true);
        }
        mo52824S1();
    }
}
