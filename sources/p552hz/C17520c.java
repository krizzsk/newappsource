package p552hz;

import aa0.C7530f;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.FragmentActivity;
import b00.C13556a;
import c70.C13751d;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.car.operators.C15684a;
import com.moovit.car.operators.CarOperator;
import com.moovit.car.requests.CarDetails;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.map.C16280h;
import com.moovit.map.MapFragment;
import com.moovit.map.collections.category.types.CarSharingMetadata;
import com.moovit.request.RequestOptions;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.C7925b;
import java.text.DecimalFormat;
import java.util.Set;
import k00.C17988b;
import p054d0.C4291k0;
import p066e0.C4452q0;
import p451du.C16723t;
import p504fz.C17129a;
import p543hq.C17474b;
import p575iz.C17680a;
import p583jk.C17884p;
import p761qy.C19201a;
import p808sx.C19568d;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p977zz.C20941h;
import p977zz.C20964s0;
import p977zz.C20975x0;
import q00.C19047a;
import q00.C19053d;
import q20.C19078d;
import r10.C19220d;
import r10.C19221e;

/* renamed from: hz.c */
public class C17520c extends C16280h<MoovitActivity> {

    /* renamed from: w */
    public static final /* synthetic */ int f45103w = 0;

    /* renamed from: u */
    public CarSharingMetadata f45104u;

    /* renamed from: v */
    public C13556a f45105v;

    /* renamed from: hz.c$a */
    public interface C17521a {
        /* renamed from: a */
        void mo49973a();
    }

    /* renamed from: c2 */
    public static void m43641c2(C17520c cVar, Exception exc) {
        cVar.f40792c.mo44530n2(C13751d.m34341b(cVar.requireContext(), (String) null, exc));
        cVar.dismissAllowingStateLoss();
    }

    /* renamed from: I1 */
    public final Set<String> mo22562I1() {
        return C16530d.m42016i(2, "METRO_CONTEXT", "CONFIGURATION");
    }

    /* renamed from: O1 */
    public final void mo22563O1(View view) {
        CarDetails carDetails = this.f45104u.f42486e;
        if (carDetails == null) {
            View view2 = getView();
            if (view2 != null) {
                ((ContentLoadingProgressBar) view2.findViewById(C19740r.progress_bar)).mo3436b();
                view2.findViewById(C19740r.car_details).setVisibility(4);
            }
            C17680a aVar = new C17680a(this.f40792c.mo44548x1(), this.f45104u.f42485d);
            A a = this.f40792c;
            a.getClass();
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            this.f45105v = a.mo44527k2("carDetailsRequest", aVar, requestOptions, new C17519b(this));
            return;
        }
        mo49968d2(carDetails);
        mo49972h2();
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
        toolbar.setTitle((CharSequence) this.f45104u.f42484c);
    }

    /* renamed from: Y1 */
    public final View mo22566Y1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(C19742t.car_sharing_bottom_dialog, viewGroup, false);
    }

    /* renamed from: Z1 */
    public final LatLonE6 mo22567Z1() {
        return this.f45104u.f42483b.mo24310d();
    }

    /* renamed from: a2 */
    public final void mo22568a2(MapFragment mapFragment) {
    }

    /* renamed from: b2 */
    public final void mo22569b2(MapFragment mapFragment) {
    }

    /* renamed from: d2 */
    public final void mo49968d2(CarDetails carDetails) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        CarDetails carDetails2 = carDetails;
        View view = getView();
        Task<TContinuationResult> onSuccessTask = C7530f.m17272e(view.getContext(), (C19728f) mo46750H1("METRO_CONTEXT"), this.f45104u.f42483b).onSuccessTask(MoovitExecutors.COMPUTATION, new C4452q0(17));
        ImageView imageView = (ImageView) view.findViewById(C19740r.provider_icon);
        CarOperator b = ((C15684a) this.f40792c.getSystemService("car_operator_provider_service")).mo46806b(carDetails2.f40840c);
        C19221e Y = C17884p.m44354Y(imageView);
        ((C19220d) Y.mo10871m().mo10854X(Integer.valueOf(b.mo46804e()))).mo10850T(imageView);
        ((TextView) view.findViewById(C19740r.provider_name)).setText(this.f45104u.f42484c);
        String string = getString(C19746x.popup_dockless_car);
        int i3 = 0;
        ((TextView) view.findViewById(C19740r.transit_type_and_model)).setText(C20964s0.m49102t(getString(C19746x.string_list_delimiter_dot), string, carDetails2.f40844g));
        onSuccessTask.addOnSuccessListener(new C17129a((TextView) view.findViewById(C19740r.provider_location), 1));
        byte b2 = carDetails2.f40849l;
        if (b2 != -1) {
            boolean equalsIgnoreCase = carDetails2.f40841d.equalsIgnoreCase("electricity");
            int b3 = C19078d.m46200b(b2);
            if (equalsIgnoreCase) {
                i2 = C19739q.ic_power_24;
            } else {
                i2 = C19739q.ic_fuel_24;
            }
            Drawable c = C17988b.m44612c(view.getContext(), i2, b3);
            TextView textView = (TextView) view.findViewById(C19740r.fuel_or_battery_level_icon);
            textView.setText(getString(C19746x.format_percentage, Byte.valueOf(b2)));
            textView.setTextColor(C20941h.m49044g(b3, view.getContext()));
            UiUtils.m40261t(textView, UiUtils.Edge.TOP, c);
            textView.setVisibility(0);
        }
        int i4 = C19740r.navigate_button;
        Button button = (Button) view.findViewById(i4);
        C19047a aVar = (C19047a) mo46750H1("CONFIGURATION");
        if (((Boolean) aVar.mo51505b(C19053d.f48474m)).booleanValue()) {
            button.setVisibility(8);
        } else {
            LatLonE6 d = this.f45104u.f42483b.mo24310d();
            int c2 = C19078d.m46201c(view.getContext(), d, aVar);
            if (c2 >= 20) {
                button.setVisibility(8);
            } else {
                button.setText(C7925b.f23935b.mo24602b(view.getContext(), (long) c2));
                button.setOnClickListener(new C16723t(4, this, d));
                button.setVisibility(0);
            }
        }
        mo49971g2(view);
        LatLonE6 d2 = this.f45104u.f42483b.mo24310d();
        int round = Math.round(C7530f.m17271d(view.getContext(), d2));
        if (round > 0) {
            onSuccessTask.addOnSuccessListener(new C17518a(this, (ListItemView) view.findViewById(C19740r.location_item), view, round, d2));
        }
        ListItemView listItemView = (ListItemView) view.findViewById(C19740r.transmission_type_item);
        listItemView.setAccessoryText((CharSequence) carDetails2.f40842e);
        listItemView.setVisibility(0);
        int i5 = carDetails2.f40848k;
        if (i5 > -1) {
            ListItemView listItemView2 = (ListItemView) view.findViewById(C19740r.num_of_seats_item);
            listItemView2.setAccessoryText((CharSequence) getString(C19746x.format_number, Integer.valueOf(i5)));
            listItemView2.setVisibility(0);
        }
        CarOperator b4 = ((C15684a) this.f40792c.getSystemService("car_operator_provider_service")).mo46806b(carDetails2.f40840c);
        byte byteValue = carDetails2.f40850m.byteValue();
        ListItemView listItemView3 = (ListItemView) view.findViewById(C19740r.interior_rating_item);
        listItemView3.setAccessoryDrawable(b4.mo46803d(byteValue));
        listItemView3.setVisibility(0);
        ListItemView listItemView4 = (ListItemView) view.findViewById(C19740r.engine_type_item);
        listItemView4.setAccessoryText((CharSequence) carDetails2.f40841d);
        listItemView4.setVisibility(0);
        ListItemView listItemView5 = (ListItemView) view.findViewById(C19740r.driving_rate_item);
        double d3 = carDetails2.f40852o;
        listItemView5.setAccessoryText((CharSequence) String.format("%s %s", new Object[]{new DecimalFormat("##.#").format(d3), carDetails2.f40846i}));
        listItemView5.setVisibility(0);
        ListItemView listItemView6 = (ListItemView) view.findViewById(C19740r.parking_rate_item);
        double d4 = carDetails2.f40851n;
        listItemView6.setAccessoryText((CharSequence) String.format("%s %s", new Object[]{new DecimalFormat("##.#").format(d4), carDetails2.f40845h}));
        listItemView6.setVisibility(0);
        String string2 = getString(C19746x.popup_dockless_car_lower);
        ((TextView) view.findViewById(C19740r.hide_icon_item)).setText(getString(C19746x.popup_remove_description, string2));
        Button button2 = (Button) view.findViewById(i4);
        if (((Button) view.findViewById(C19740r.action_button)).getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (button2.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        View findViewById = view.findViewById(C19740r.cta_upper_divider);
        View findViewById2 = view.findViewById(C19740r.cta_bottom_divider);
        if (z || z2) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        if (!z && !z2) {
            i3 = 8;
        }
        findViewById2.setVisibility(i3);
    }

    /* renamed from: e2 */
    public final void mo49969e2(String str) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        mo22564R1(aVar.mo49933a());
        CarDetails carDetails = this.f45104u.f42486e;
        mo46753L1(C17521a.class, new C4291k0(carDetails, 12));
        startActivity(((C15684a) this.f40792c.getSystemService("car_operator_provider_service")).mo46806b(carDetails.f40840c).mo46801b(this.f40792c, carDetails));
    }

    /* renamed from: f2 */
    public final void mo49970f2(LatLonE6 latLonE6) {
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

    /* renamed from: g2 */
    public final void mo49971g2(View view) {
        Button button = (Button) view.findViewById(C19740r.action_button);
        CarOperator b = ((C15684a) this.f40792c.getSystemService("car_operator_provider_service")).mo46806b(this.f45104u.f42486e.f40840c);
        Context context = view.getContext();
        b.mo46802c();
        if (C20964s0.m49090h("com.dn.drivenow")) {
            button.setVisibility(8);
        } else if (C20975x0.m49121h(context, "com.dn.drivenow")) {
            button.setOnClickListener(new C19568d(this, 1));
        } else if (C17884p.m44338I(context)) {
            button.setOnClickListener(new C19201a(this, 3));
        } else {
            button.setVisibility(8);
        }
    }

    /* renamed from: h2 */
    public final void mo49972h2() {
        View view = getView();
        if (view != null) {
            ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) view.findViewById(C19740r.progress_bar);
            contentLoadingProgressBar.setVisibility(8);
            contentLoadingProgressBar.mo3435a();
            view.findViewById(C19740r.car_details).setVisibility(0);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CarSharingMetadata carSharingMetadata = (CarSharingMetadata) mo46752K1().getParcelable("extra_car_station_metadata");
        C21100e.m49373x(carSharingMetadata, "extra_car_station_metadata");
        this.f45104u = carSharingMetadata;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C13556a aVar = this.f45105v;
        if (aVar != null) {
            aVar.cancel(true);
            this.f45105v = null;
        }
    }

    public final void onPause() {
        String str;
        String str2;
        int i;
        boolean z;
        super.onPause();
        Context context = getContext();
        CarSharingMetadata carSharingMetadata = this.f45104u;
        String str3 = null;
        if (carSharingMetadata != null) {
            str3 = carSharingMetadata.f42485d;
            ((C15684a) this.f40792c.getSystemService("car_operator_provider_service")).mo46806b(this.f45104u.f42486e.f40840c).mo46802c();
            i = Math.round(C7530f.m17271d(context, this.f45104u.f42483b.mo24310d()));
            if (getView().findViewById(C19740r.navigate_button).getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            str2 = C19078d.m46199a(context, "com.dn.drivenow", z);
            str = this.f45104u.f42484c;
        } else {
            i = -1;
            str2 = null;
            str = null;
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_cars");
        aVar.mo49945m(AnalyticsAttributeKey.SELECTED_ID, str3);
        aVar.mo49935c(AnalyticsAttributeKey.DISTANCE, i);
        aVar.mo49945m(AnalyticsAttributeKey.ACTION, str2);
        aVar.mo49945m(AnalyticsAttributeKey.PROVIDER, str);
        mo22564R1(aVar.mo49933a());
        C19731i.m47197a(context).f50173c.mo22847b(context, AnalyticsFlowKey.POPUP, true);
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        C19731i.m47197a(activity).f50173c.mo22849g(activity, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_cars");
        mo22564R1(aVar.mo49933a());
        if (getView() != null && this.f45104u.f42486e != null) {
            mo49971g2(getView());
        }
    }
}
