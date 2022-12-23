package p808sx;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p001a0.C0017h;
import p501fw.C17102a;
import p543hq.C17474b;
import p644lx.C18284b;
import p824tp.C19731i;

/* renamed from: sx.h */
public class C19572h extends C15676b<MoovitActivity> {

    /* renamed from: k */
    public static final /* synthetic */ int f49749k = 0;

    /* renamed from: h */
    public ArrayList f49750h;

    /* renamed from: i */
    public ArrayList f49751i;

    /* renamed from: j */
    public ViewGroup f49752j;

    /* renamed from: sx.h$a */
    public interface C19573a {
        /* renamed from: c */
        void mo45960c(Set<TripPlannerTransportType> set);
    }

    static {
        Class<C19572h> cls = C19572h.class;
    }

    public C19572h() {
        super(MoovitActivity.class);
        setStyle(0, 2131952798);
    }

    /* renamed from: T1 */
    public static void m46953T1(ListItemView listItemView) {
        int i;
        boolean isSelected = listItemView.isSelected();
        listItemView.setTitleThemeTextAppearance(R.attr.textAppearanceBodySmallStrong);
        if (isSelected) {
            i = R.attr.colorPrimary;
        } else {
            i = R.attr.colorOnSurfaceEmphasisLow;
        }
        listItemView.setTitleThemeTextColor(i);
        ImageView iconView = listItemView.getIconView();
        if (isSelected) {
            iconView.clearColorFilter();
            iconView.setAlpha(1.0f);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(BitmapDescriptorFactory.HUE_RED);
        iconView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        iconView.setAlpha(0.4f);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C19731i.m47197a(getActivity()).f50173c.mo22850h(AnalyticsFlowKey.POPUP_TRIP_PLAN_PREFERENCES_TEASER, bVar);
    }

    /* renamed from: S1 */
    public final HashSet mo51915S1() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f49752j.getChildCount(); i++) {
            View childAt = this.f49752j.getChildAt(i);
            if (childAt.isSelected()) {
                hashSet.add((TripPlannerTransportType) childAt.getTag());
            }
        }
        return hashSet;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f49750h = arguments.getParcelableArrayList("availableTransportTypes");
            this.f49751i = arguments.getParcelableArrayList("selectedTransportTypes");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.trip_planner_transport_types_fragment, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar.mo49942j(AnalyticsAttributeKey.AVAILABLE_SETTINGS_MASK, C0017h.m49F(this.f49750h));
        aVar.mo49942j(AnalyticsAttributeKey.SET_SETTINGS_MASK, C0017h.m50G(mo51915S1()));
        mo22564R1(aVar.mo49933a());
        FragmentActivity activity = getActivity();
        C19731i.m47197a(activity).f50173c.mo22847b(activity, AnalyticsFlowKey.POPUP_TRIP_PLAN_PREFERENCES_TEASER, true);
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        C19731i.m47197a(activity).f50173c.mo22849g(activity, AnalyticsFlowKey.POPUP_TRIP_PLAN_PREFERENCES_TEASER);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49942j(AnalyticsAttributeKey.AVAILABLE_SETTINGS_MASK, C0017h.m49F(this.f49750h));
        aVar.mo49942j(AnalyticsAttributeKey.SET_SETTINGS_MASK, C0017h.m50G(mo51915S1()));
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f49752j = (ViewGroup) view.findViewById(R.id.options_container);
        for (TripPlannerTransportTypeInfo tripPlannerTransportTypeInfo : this.f49750h) {
            ListItemView listItemView = (ListItemView) LayoutInflater.from(getContext()).inflate(R.layout.trip_planner_trasport_type_item_layout, this.f49752j, false);
            listItemView.setText((CharSequence) tripPlannerTransportTypeInfo.f23803c);
            ImageView iconView = listItemView.getIconView();
            iconView.setMaxWidth((int) UiUtils.m40246e(listItemView.getContext(), 24.0f));
            iconView.setMaxHeight((int) UiUtils.m40246e(listItemView.getContext(), 24.0f));
            iconView.setAdjustViewBounds(true);
            iconView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            iconView.setBackgroundResource(R.drawable.trip_planner_transport_type_icon_bg);
            listItemView.setIcon(tripPlannerTransportTypeInfo.f23804d);
            listItemView.setSelected(this.f49751i.contains(tripPlannerTransportTypeInfo.f23802b));
            m46953T1(listItemView);
            listItemView.setTag(tripPlannerTransportTypeInfo.f23802b);
            listItemView.setOnClickListener(new C18284b(this, 1));
            this.f49752j.addView(listItemView);
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.scroller);
        UiUtils.m40259r(nestedScrollView, new C19571g(nestedScrollView, view.findViewById(R.id.separator), 0));
        view.findViewById(R.id.save_button).setOnClickListener(new C17102a(this, 8));
    }
}
