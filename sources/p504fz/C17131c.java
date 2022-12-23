package p504fz;

import aa0.C7530f;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.map.C16280h;
import com.moovit.map.MapFragment;
import com.moovit.map.collections.category.types.BicycleStationMetadata;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.C7925b;
import java.util.Set;
import p066e0.C4452q0;
import p373au.C13535g;
import p543hq.C17474b;
import p583jk.C17884p;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19735m;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p977zz.C20941h;
import p977zz.C20964s0;
import q00.C19047a;
import q00.C19053d;
import q20.C19078d;

/* renamed from: fz.c */
public class C17131c extends C16280h<MoovitActivity> {

    /* renamed from: w */
    public static final /* synthetic */ int f44358w = 0;

    /* renamed from: u */
    public BicycleStationMetadata f44359u;

    /* renamed from: v */
    public LatLonE6 f44360v;

    /* renamed from: I1 */
    public final Set<String> mo22562I1() {
        return C16530d.m42016i(2, "METRO_CONTEXT", "CONFIGURATION");
    }

    /* renamed from: O1 */
    public final void mo22563O1(View view) {
        Task<TContinuationResult> onSuccessTask = C7530f.m17272e(view.getContext(), (C19728f) mo46750H1("METRO_CONTEXT"), LocationDescriptor.m17770k(this.f44360v)).onSuccessTask(MoovitExecutors.COMPUTATION, new C4452q0(17));
        BicycleStationMetadata bicycleStationMetadata = this.f44359u;
        String str = bicycleStationMetadata.f42477f;
        Image image = bicycleStationMetadata.f42478g;
        ImageView imageView = (ImageView) view.findViewById(C19740r.provider_icon);
        C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
        ((TextView) view.findViewById(C19740r.provider_name)).setText(str);
        ((TextView) view.findViewById(C19740r.transit_type)).setText(C19746x.popup_bike_station);
        onSuccessTask.addOnSuccessListener(new C17129a((TextView) view.findViewById(C19740r.provider_location), 0));
        BicycleStationMetadata bicycleStationMetadata2 = this.f44359u;
        int i = bicycleStationMetadata2.f42473b;
        int i2 = bicycleStationMetadata2.f42474c;
        TextView textView = (TextView) view.findViewById(C19740r.free_docks_title);
        TextView textView2 = (TextView) view.findViewById(C19740r.free_docks_number);
        TextView textView3 = (TextView) view.findViewById(C19740r.available_bikes_title);
        TextView textView4 = (TextView) view.findViewById(C19740r.available_bikes_number);
        int f = C20941h.m49043f(C19735m.colorCritical, view.getContext());
        if (i == 0) {
            textView4.setTextColor(f);
            textView3.setTextColor(f);
        }
        if (i2 == 0) {
            textView.setTextColor(f);
            textView2.setTextColor(f);
        }
        textView4.setText(String.valueOf(i));
        textView2.setText(String.valueOf(i2));
        LatLonE6 latLonE6 = this.f44360v;
        Button button = (Button) view.findViewById(C19740r.navigate_button);
        View findViewById = view.findViewById(C19740r.divider);
        C19047a aVar = (C19047a) mo46750H1("CONFIGURATION");
        if (!((Boolean) aVar.mo51505b(C19053d.f48474m)).booleanValue()) {
            UiUtils.m40238F(8, button, findViewById);
        } else {
            int c = C19078d.m46201c(view.getContext(), latLonE6, aVar);
            if (c >= 20) {
                UiUtils.m40238F(8, button, findViewById);
            } else {
                SpannableStringBuilder b = C7925b.f23935b.mo24602b(view.getContext(), (long) c);
                UiUtils.m40267z(button, findViewById);
                button.setText(b);
                button.setOnClickListener(new C13535g(5, this, latLonE6));
                UiUtils.m40238F(0, button, findViewById);
            }
        }
        String d = C7925b.m18016d(view.getContext(), this.f44359u.f42476e);
        ((ListItemView) view.findViewById(C19740r.extra_info_section)).setTitle((CharSequence) getString(C19746x.popup_update, d));
        LatLonE6 latLonE62 = this.f44360v;
        int round = Math.round(C7530f.m17271d(view.getContext(), latLonE62));
        if (round > 0) {
            onSuccessTask.addOnSuccessListener(new C17130b(this, (ListItemView) view.findViewById(C19740r.location_item), view, round, latLonE62));
        }
        String str2 = this.f44359u.f42479h;
        ListItemView listItemView = (ListItemView) view.findViewById(C19740r.driving_rate_item);
        if (str2 != null && !C20964s0.m49090h(str2)) {
            listItemView.setAccessoryText((CharSequence) str2);
            listItemView.setVisibility(0);
        }
        String string = getString(C19746x.popup_bike_station_lower);
        ((TextView) view.findViewById(C19740r.hide_icon_item)).setText(getString(C19746x.popup_remove_description, string));
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C19731i.m47197a(getActivity()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: V1 */
    public final void mo22565V1(View view, BottomSheetBehavior<?> bottomSheetBehavior) {
        bottomSheetBehavior.setPeekHeight(view.findViewById(C19740r.container).getMinimumHeight());
    }

    /* renamed from: W1 */
    public final void mo39514W1(Toolbar toolbar, BottomSheetBehavior<?> bottomSheetBehavior) {
        super.mo39514W1(toolbar, bottomSheetBehavior);
        toolbar.setTitle((CharSequence) this.f44359u.f42477f);
    }

    /* renamed from: Y1 */
    public final View mo22566Y1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(C19742t.bicycle_station_bottom_dialog, viewGroup, false);
    }

    /* renamed from: Z1 */
    public final LatLonE6 mo22567Z1() {
        return this.f44360v;
    }

    /* renamed from: a2 */
    public final void mo22568a2(MapFragment mapFragment) {
    }

    /* renamed from: b2 */
    public final void mo22569b2(MapFragment mapFragment) {
    }

    /* renamed from: c2 */
    public final void mo49724c2(LatLonE6 latLonE6) {
        Uri f;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "get_directions");
        mo22564R1(aVar.mo49933a());
        Context context = getContext();
        if (context != null && (f = C7530f.m17273f(LocationDescriptor.m17770k(latLonE6))) != null) {
            Intent intent = new Intent();
            intent.setData(f);
            intent.setPackage(context.getPackageName());
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                startActivity(intent);
                dismissAllowingStateLoss();
                return;
            }
            intent.setPackage((String) null);
            startActivity(Intent.createChooser(intent, context.getString(C19746x.open_file_chooser)));
            dismissAllowingStateLoss();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle K1 = mo46752K1();
        BicycleStationMetadata bicycleStationMetadata = (BicycleStationMetadata) K1.getParcelable("metadata");
        C21100e.m49373x(bicycleStationMetadata, "metadata");
        this.f44359u = bicycleStationMetadata;
        LatLonE6 latLonE6 = (LatLonE6) K1.getParcelable(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f44360v = latLonE6;
    }

    public final void onPause() {
        boolean z;
        super.onPause();
        Context context = getContext();
        int round = Math.round(C7530f.m17271d(context, this.f44360v));
        if (getView().findViewById(C19740r.navigate_button).getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        String a = C19078d.m46199a(context, (String) null, z);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_bikes");
        aVar.mo49935c(AnalyticsAttributeKey.DISTANCE, round);
        aVar.mo49945m(AnalyticsAttributeKey.ACTION, a);
        aVar.mo49945m(AnalyticsAttributeKey.PROVIDER, this.f44359u.f42477f);
        mo22564R1(aVar.mo49933a());
        C19731i.m47197a(context).f50173c.mo22847b(context, AnalyticsFlowKey.POPUP, true);
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        C19731i.m47197a(activity).f50173c.mo22849g(activity, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_bikes");
        mo22564R1(aVar.mo49933a());
    }
}
