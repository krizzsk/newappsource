package com.moovit.app.map;

import aa0.C7530f;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.ads.C14742i;
import com.moovit.app.home.dashboard.C14944i;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.map.C16280h;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.map.collections.category.types.DocklessBicycleMetadata;
import com.moovit.map.collections.category.types.DocklessCarMetadata;
import com.moovit.map.collections.category.types.DocklessMopedMetadata;
import com.moovit.map.collections.category.types.DocklessScooterMetadata;
import com.moovit.map.walking.MapWalkingDirectionsActivity;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import k00.C17988b;
import p039c7.C1800c;
import p066e0.C4452q0;
import p066e0.C4454r0;
import p20.C18880g;
import p233r5.C6253a;
import p304x.C7070l;
import p310x5.C7159d;
import p451du.C16715l;
import p543hq.C17474b;
import p583jk.C17884p;
import p613kq.C18114a;
import p785ry.C19385e;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p824tp.C19728f;
import p824tp.C19731i;
import p874vr.C20199a;
import p977zz.C20941h;
import p977zz.C20964s0;
import q00.C19047a;
import q00.C19053d;
import q20.C19078d;

public class DocklessVehicleBottomSheetDialog extends C16280h<MoovitActivity> {

    /* renamed from: w */
    public static final /* synthetic */ int f38877w = 0;

    /* renamed from: u */
    public ViewModel f38878u;

    /* renamed from: v */
    public Object f38879v;

    public static class ViewModel implements Parcelable {
        public static final Parcelable.Creator<ViewModel> CREATOR = new C15117a();

        /* renamed from: r */
        public static final C15118b f38880r = new C15118b(ViewModel.class);

        /* renamed from: b */
        public final LatLonE6 f38881b;

        /* renamed from: c */
        public final Image f38882c;

        /* renamed from: d */
        public final Image f38883d;

        /* renamed from: e */
        public final Image f38884e;

        /* renamed from: f */
        public final String f38885f;

        /* renamed from: g */
        public final String f38886g;

        /* renamed from: h */
        public boolean f38887h;

        /* renamed from: i */
        public final int f38888i;

        /* renamed from: j */
        public final String f38889j;

        /* renamed from: k */
        public final int f38890k;

        /* renamed from: l */
        public final int f38891l;

        /* renamed from: m */
        public final AppDeepLink f38892m;

        /* renamed from: n */
        public final String f38893n;

        /* renamed from: o */
        public final boolean f38894o;

        /* renamed from: p */
        public int f38895p;

        /* renamed from: q */
        public int f38896q;

        /* renamed from: com.moovit.app.map.DocklessVehicleBottomSheetDialog$ViewModel$a */
        public class C15117a implements Parcelable.Creator<ViewModel> {
            public final Object createFromParcel(Parcel parcel) {
                return (ViewModel) C19612n.m46981v(parcel, ViewModel.f38880r);
            }

            public final Object[] newArray(int i) {
                return new ViewModel[i];
            }
        }

        /* renamed from: com.moovit.app.map.DocklessVehicleBottomSheetDialog$ViewModel$b */
        public class C15118b extends C19619s<ViewModel> {
            public C15118b(Class cls) {
                super(1, cls);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0 || i == 1;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                Image image;
                C19615p pVar2 = pVar;
                LatLonE6.C15743c cVar = LatLonE6.f40979g;
                pVar.getClass();
                LatLonE6 latLonE6 = (LatLonE6) cVar.read(pVar2);
                Image image2 = (Image) C16019d.m40803a().f41718d.read(pVar2);
                Image image3 = (Image) C16019d.m40803a().f41718d.read(pVar2);
                String p = pVar.mo51947p();
                String p2 = pVar.mo51947p();
                boolean b = pVar.mo51919b();
                int l = pVar.mo51924l();
                String t = pVar.mo51948t();
                int l2 = pVar.mo51924l();
                AppDeepLink appDeepLink = (AppDeepLink) pVar2.mo51962q(AppDeepLink.f40996d);
                String p3 = pVar.mo51947p();
                boolean b2 = pVar.mo51919b();
                int l3 = pVar.mo51924l();
                int l4 = pVar.mo51924l();
                int l5 = pVar.mo51924l();
                if (i >= 1) {
                    image = (Image) pVar2.mo51962q(C16019d.m40803a().f41718d);
                } else {
                    image = null;
                }
                return new ViewModel(latLonE6, image2, image3, image, p, p2, b, l, t, l2, l3, appDeepLink, p3, b2, l4, l5);
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                ViewModel viewModel = (ViewModel) obj;
                LatLonE6 latLonE6 = viewModel.f38881b;
                LatLonE6.C15742b bVar = LatLonE6.f40978f;
                qVar.getClass();
                bVar.write(latLonE6, qVar);
                C16019d.m40803a().f41718d.write(viewModel.f38882c, qVar);
                C16019d.m40803a().f41718d.write(viewModel.f38883d, qVar);
                qVar.mo51954p(viewModel.f38885f);
                qVar.mo51954p(viewModel.f38886g);
                qVar.mo51934b(viewModel.f38887h);
                qVar.mo51939l(viewModel.f38888i);
                qVar.mo51955t(viewModel.f38889j);
                qVar.mo51939l(viewModel.f38890k);
                qVar.mo51967q(viewModel.f38892m, AppDeepLink.f40996d);
                qVar.mo51954p(viewModel.f38893n);
                qVar.mo51934b(viewModel.f38894o);
                qVar.mo51939l(viewModel.f38891l);
                qVar.mo51939l(viewModel.f38895p);
                qVar.mo51939l(viewModel.f38896q);
                qVar.mo51967q(viewModel.f38884e, C16019d.m40803a().f41718d);
            }
        }

        public ViewModel(LatLonE6 latLonE6, Image image, Image image2, Image image3, String str, String str2, boolean z, int i, String str3, int i2, int i3, AppDeepLink appDeepLink, String str4, boolean z2, int i4, int i5) {
            C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            this.f38881b = latLonE6;
            C21100e.m49373x(image, "mapIcon");
            this.f38882c = image;
            C21100e.m49373x(image2, "image");
            this.f38883d = image2;
            this.f38884e = image3;
            this.f38885f = str;
            C21100e.m49373x(str2, "title");
            this.f38886g = str2;
            this.f38887h = z;
            this.f38888i = i;
            this.f38889j = str3;
            this.f38890k = i2;
            this.f38891l = i3;
            this.f38892m = appDeepLink;
            this.f38893n = str4;
            this.f38894o = z2;
            this.f38895p = i4;
            this.f38896q = i5;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, f38880r);
        }
    }

    /* renamed from: c2 */
    public static void m38541c2(DocklessVehicleBottomSheetDialog docklessVehicleBottomSheetDialog) {
        ViewModel viewModel = docklessVehicleBottomSheetDialog.f38878u;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "get_directions");
        docklessVehicleBottomSheetDialog.mo22564R1(aVar.mo49933a());
        docklessVehicleBottomSheetDialog.startActivity(MapWalkingDirectionsActivity.m41577y2(docklessVehicleBottomSheetDialog.requireContext(), LocationDescriptor.m17770k(viewModel.f38881b), viewModel.f38882c));
    }

    /* renamed from: d2 */
    public static void m38542d2(DocklessVehicleBottomSheetDialog docklessVehicleBottomSheetDialog, MapFragment mapFragment) {
        docklessVehicleBottomSheetDialog.getClass();
        MarkerZoomStyle markerZoomStyle = new MarkerZoomStyle(docklessVehicleBottomSheetDialog.f38878u.f38884e);
        LatLonE6 latLonE6 = docklessVehicleBottomSheetDialog.f38878u.f38881b;
        docklessVehicleBottomSheetDialog.f38879v = mapFragment.mo48646o2(latLonE6, latLonE6, markerZoomStyle);
    }

    /* renamed from: e2 */
    public static DocklessVehicleBottomSheetDialog m38543e2(ViewModel viewModel) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("viewModel", viewModel);
        DocklessVehicleBottomSheetDialog docklessVehicleBottomSheetDialog = new DocklessVehicleBottomSheetDialog();
        docklessVehicleBottomSheetDialog.setArguments(bundle);
        return docklessVehicleBottomSheetDialog;
    }

    /* renamed from: f2 */
    public static DocklessVehicleBottomSheetDialog m38544f2(C18880g gVar, DocklessBicycleMetadata docklessBicycleMetadata) {
        int i;
        int i2;
        C18880g gVar2 = gVar;
        DocklessBicycleMetadata docklessBicycleMetadata2 = docklessBicycleMetadata;
        boolean z = docklessBicycleMetadata2.f42496f;
        if (z) {
            i = R.string.popup_dockless_ebike;
        } else {
            i = R.string.popup_dockless_bike;
        }
        if (z) {
            i2 = R.string.popup_dockless_ebike_lower;
        } else {
            i2 = R.string.popup_dockless_bike_lower;
        }
        return m38543e2(new ViewModel(gVar2.f48054b, gVar2.f48055c, docklessBicycleMetadata2.f42493c, gVar2.f48056d, docklessBicycleMetadata2.f42492b, docklessBicycleMetadata2.f42494d, docklessBicycleMetadata2.f42496f, docklessBicycleMetadata2.f42497g, docklessBicycleMetadata2.f42499i, -1, docklessBicycleMetadata2.f42498h, docklessBicycleMetadata2.f42495e, "popup_dockless_bicycle", true, i, i2));
    }

    /* renamed from: g2 */
    public static DocklessVehicleBottomSheetDialog m38545g2(C18880g gVar, DocklessCarMetadata docklessCarMetadata) {
        boolean z;
        int i;
        C18880g gVar2 = gVar;
        DocklessCarMetadata docklessCarMetadata2 = docklessCarMetadata;
        if (docklessCarMetadata2.f42505f == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = docklessCarMetadata2.f42506g;
        } else {
            i = docklessCarMetadata2.f42507h;
        }
        return m38543e2(new ViewModel(gVar2.f48054b, gVar2.f48055c, docklessCarMetadata2.f42502c, gVar2.f48056d, docklessCarMetadata2.f42501b, docklessCarMetadata2.f42503d, z, i, docklessCarMetadata2.f42509j, docklessCarMetadata2.f42508i, -1, docklessCarMetadata2.f42504e, "popup_dockless_car", true, R.string.popup_dockless_car, R.string.popup_dockless_car_lower));
    }

    /* renamed from: h2 */
    public static DocklessVehicleBottomSheetDialog m38546h2(C18880g gVar, DocklessMopedMetadata docklessMopedMetadata) {
        C18880g gVar2 = gVar;
        DocklessMopedMetadata docklessMopedMetadata2 = docklessMopedMetadata;
        return m38543e2(new ViewModel(gVar2.f48054b, gVar2.f48055c, docklessMopedMetadata2.f42512c, gVar2.f48056d, docklessMopedMetadata2.f42511b, docklessMopedMetadata2.f42513d, docklessMopedMetadata2.f42515f, docklessMopedMetadata2.f42516g, docklessMopedMetadata2.f42518i, -1, docklessMopedMetadata2.f42517h, docklessMopedMetadata2.f42514e, "popup_dockless_moped", true, R.string.popup_dockless_emoped, R.string.popup_dockless_emoped_lower));
    }

    /* renamed from: i2 */
    public static DocklessVehicleBottomSheetDialog m38547i2(C18880g gVar, DocklessScooterMetadata docklessScooterMetadata) {
        int i;
        int i2;
        C18880g gVar2 = gVar;
        DocklessScooterMetadata docklessScooterMetadata2 = docklessScooterMetadata;
        boolean z = docklessScooterMetadata2.f42524f;
        if (z) {
            i = R.string.popup_dockless_escooter;
        } else {
            i = R.string.popup_dockless_scooter;
        }
        if (z) {
            i2 = R.string.popup_dockless_escooter_lower;
        } else {
            i2 = R.string.popup_dockless_scooter_lower;
        }
        return m38543e2(new ViewModel(gVar2.f48054b, gVar2.f48055c, docklessScooterMetadata2.f42521c, gVar2.f48056d, docklessScooterMetadata2.f42520b, docklessScooterMetadata2.f42522d, docklessScooterMetadata2.f42524f, docklessScooterMetadata2.f42525g, docklessScooterMetadata2.f42527i, -1, docklessScooterMetadata2.f42526h, docklessScooterMetadata2.f42523e, "popup_dockless_scooter", true, i, i2));
    }

    /* renamed from: I1 */
    public final Set<String> mo22562I1() {
        return C16530d.m42016i(2, "METRO_CONTEXT", "CONFIGURATION");
    }

    /* renamed from: O1 */
    public final void mo22563O1(View view) {
        int i;
        View view2 = view;
        Task<LocationDescriptor> e = C7530f.m17272e(view.getContext(), (C19728f) mo46750H1("METRO_CONTEXT"), LocationDescriptor.m17770k(this.f38878u.f38881b));
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Task<TContinuationResult> onSuccessTask = e.onSuccessTask(executorService, new C4452q0(17));
        ViewModel viewModel = this.f38878u;
        int i2 = viewModel.f38895p;
        String str = viewModel.f38885f;
        String str2 = viewModel.f38886g;
        Image image = viewModel.f38883d;
        ImageView imageView = (ImageView) view2.findViewById(R.id.provider_icon);
        C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
        ((TextView) view2.findViewById(R.id.provider_name)).setText(str);
        String string = getString(i2);
        ((TextView) view2.findViewById(R.id.transit_type_and_id)).setText(C20964s0.m49099q(getString(R.string.string_list_delimiter_dot), string, str2));
        onSuccessTask.addOnSuccessListener(new C18114a((TextView) view2.findViewById(R.id.provider_location), 4));
        ViewModel viewModel2 = this.f38878u;
        boolean z = viewModel2.f38887h;
        int i3 = viewModel2.f38888i;
        if (i3 != -1) {
            int b = C19078d.m46200b(i3);
            if (z) {
                i = R.drawable.ic_power_24;
            } else {
                i = R.drawable.ic_fuel_24;
            }
            Drawable c = C17988b.m44612c(view.getContext(), i, b);
            TextView textView = (TextView) view2.findViewById(R.id.fuel_or_battery_level_icon);
            textView.setText(getString(R.string.format_percentage, Integer.valueOf(i3)));
            textView.setTextColor(C20941h.m49044g(b, view.getContext()));
            UiUtils.m40261t(textView, UiUtils.Edge.TOP, c);
            textView.setVisibility(0);
        }
        LatLonE6 latLonE6 = this.f38878u.f38881b;
        Button button = (Button) view2.findViewById(R.id.navigate_button);
        C19047a aVar = (C19047a) mo46750H1("CONFIGURATION");
        if (!((Boolean) aVar.mo51505b(C19053d.f48474m)).booleanValue()) {
            button.setVisibility(8);
        } else {
            int c2 = C19078d.m46201c(view.getContext(), latLonE6, aVar);
            if (c2 >= 20) {
                button.setVisibility(8);
            } else {
                button.setText(C7925b.f23935b.mo24602b(view.getContext(), (long) c2));
                button.setOnClickListener(new C1800c(this, 13));
                button.setVisibility(0);
            }
        }
        AppDeepLink appDeepLink = this.f38878u.f38892m;
        Button button2 = (Button) view2.findViewById(R.id.action_button);
        if (appDeepLink == null) {
            button2.setVisibility(8);
        }
        button2.setOnClickListener(new C7159d(1, this, appDeepLink));
        ViewModel viewModel3 = this.f38878u;
        String str3 = viewModel3.f38885f;
        AppDeepLink appDeepLink2 = viewModel3.f38892m;
        if (appDeepLink2 != null && ((Boolean) ((C19047a) mo46750H1("CONFIGURATION")).mo51505b(C20199a.f51307y0)).booleanValue()) {
            View findViewById = view2.findViewById(R.id.promo_code_action_button);
            findViewById.setOnClickListener(new C6253a(2, this, str3, appDeepLink2));
            C19385e eVar = C19385e.f49315c;
            String str4 = appDeepLink2.f40997b;
            Task<TContinuationResult> onSuccessTask2 = eVar.mo51792b().onSuccessTask(executorService, new C4454r0(11));
            if (!C20964s0.m49090h(str4)) {
                onSuccessTask2 = onSuccessTask2.onSuccessTask(executorService, new C7070l(str4, 12));
            }
            onSuccessTask2.addOnSuccessListener((Activity) this.f40792c, (OnSuccessListener<? super TContinuationResult>) new C14742i(this, findViewById, view2));
        }
        LatLonE6 latLonE62 = this.f38878u.f38881b;
        int round = Math.round(C7530f.m17271d(view.getContext(), latLonE62));
        if (round > 0) {
            onSuccessTask.addOnSuccessListener(new C15119a(this, (ListItemView) view2.findViewById(R.id.location_item), view, round, latLonE62));
        }
        String str5 = this.f38878u.f38889j;
        ListItemView listItemView = (ListItemView) view2.findViewById(R.id.driving_rate_item);
        if (str5 != null && !C20964s0.m49090h(str5)) {
            listItemView.setAccessoryText((CharSequence) str5);
            listItemView.setVisibility(0);
        }
        int i4 = this.f38878u.f38890k;
        if (i4 > -1) {
            ListItemView listItemView2 = (ListItemView) view2.findViewById(R.id.num_of_seats_item);
            listItemView2.setAccessoryText((CharSequence) getString(R.string.format_number, Integer.valueOf(i4)));
            listItemView2.setVisibility(0);
        }
        int i5 = this.f38878u.f38891l;
        if (i5 > -1) {
            ListItemView listItemView3 = (ListItemView) view2.findViewById(R.id.num_of_helmets_item);
            listItemView3.setAccessoryText((CharSequence) getString(R.string.format_number, Integer.valueOf(i5)));
            listItemView3.setVisibility(0);
        }
        ((TextView) view2.findViewById(R.id.hide_icon_item)).setText(getString(R.string.popup_remove_description, getString(this.f38878u.f38896q)));
        mo45494j2(view);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C19731i.m47197a(getActivity()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: V1 */
    public final void mo22565V1(View view, BottomSheetBehavior<?> bottomSheetBehavior) {
        View findViewById = view.findViewById(R.id.content);
        if (findViewById != null) {
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C15120b(findViewById, findViewById.findViewById(R.id.cta_bottom_divider), (ViewGroup) findViewById.findViewById(R.id.content_layout), bottomSheetBehavior));
        }
    }

    /* renamed from: W1 */
    public final void mo39514W1(Toolbar toolbar, BottomSheetBehavior<?> bottomSheetBehavior) {
        super.mo39514W1(toolbar, bottomSheetBehavior);
        toolbar.setTitle((CharSequence) this.f38878u.f38885f);
    }

    /* renamed from: Y1 */
    public final View mo22566Y1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.dockless_vehicle_bottom_dialog, viewGroup, false);
    }

    /* renamed from: Z1 */
    public final LatLonE6 mo22567Z1() {
        return this.f38878u.f38881b;
    }

    /* renamed from: a2 */
    public final void mo22568a2(MapFragment mapFragment) {
        if (this.f38879v != null) {
            mapFragment.mo48656t2(new C16715l(this, mapFragment, 1));
        }
    }

    /* renamed from: b2 */
    public final void mo22569b2(MapFragment mapFragment) {
        if (this.f38878u.f38884e != null) {
            mapFragment.mo48656t2(new C14944i(1, this, mapFragment));
        }
    }

    /* renamed from: j2 */
    public final void mo45494j2(View view) {
        boolean z;
        boolean z2;
        boolean z3;
        View findViewById = view.findViewById(R.id.promo_code_action_button);
        View findViewById2 = view.findViewById(R.id.cta_upper_divider);
        View findViewById3 = view.findViewById(R.id.cta_bottom_divider);
        if (findViewById.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i = 8;
        if (z) {
            UiUtils.m40238F(8, findViewById2, findViewById3);
            return;
        }
        View findViewById4 = view.findViewById(R.id.action_button);
        View findViewById5 = view.findViewById(R.id.navigate_button);
        if (findViewById4.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (findViewById5.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 || z3) {
            i = 0;
        }
        UiUtils.m40238F(i, findViewById2, findViewById3);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewModel viewModel = (ViewModel) mo46752K1().getParcelable("viewModel");
        C21100e.m49373x(viewModel, "viewModel");
        this.f38878u = viewModel;
    }

    public final void onPause() {
        boolean z;
        String str;
        super.onPause();
        Context requireContext = requireContext();
        int round = Math.round(C7530f.m17271d(requireContext, this.f38878u.f38881b));
        if (requireView().findViewById(R.id.navigate_button).getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        AppDeepLink appDeepLink = this.f38878u.f38892m;
        if (appDeepLink != null) {
            str = appDeepLink.f40997b;
        } else {
            str = null;
        }
        String a = C19078d.m46199a(requireContext, str, z);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, this.f38878u.f38893n);
        aVar.mo49935c(AnalyticsAttributeKey.DISTANCE, round);
        aVar.mo49945m(AnalyticsAttributeKey.ACTION, a);
        aVar.mo49939g(AnalyticsAttributeKey.PROVIDER, this.f38878u.f38885f);
        mo22564R1(aVar.mo49933a());
        C19731i.m47197a(requireContext).f50173c.mo22847b(requireContext, AnalyticsFlowKey.POPUP, true);
    }

    public final void onResume() {
        super.onResume();
        View view = getView();
        AppDeepLink appDeepLink = this.f38878u.f38892m;
        Button button = (Button) view.findViewById(R.id.action_button);
        if (appDeepLink == null) {
            button.setVisibility(8);
        }
        button.setOnClickListener(new C7159d(1, this, appDeepLink));
        Context requireContext = requireContext();
        C19731i.m47197a(requireContext).f50173c.mo22849g(requireContext, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, this.f38878u.f38893n);
        mo22564R1(aVar.mo49933a());
    }
}
