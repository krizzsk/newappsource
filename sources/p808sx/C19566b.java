package p808sx;

import a20.C13387a;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.tripplanner.TripPlannerActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.utils.Color;
import com.moovit.image.model.ResourceImage;
import com.moovit.location.mappicker.MapLocationPickerActivity;
import com.moovit.map.C16245a;
import com.moovit.map.C16281i;
import com.moovit.map.LineStyle;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;

/* renamed from: sx.b */
public final /* synthetic */ class C19566b implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ int f49737a;

    /* renamed from: b */
    public final /* synthetic */ MapFragment f49738b;

    /* renamed from: c */
    public final /* synthetic */ MoovitActivity f49739c;

    /* renamed from: d */
    public final /* synthetic */ Parcelable f49740d;

    public /* synthetic */ C19566b(MoovitActivity moovitActivity, MapFragment mapFragment, Parcelable parcelable, int i) {
        this.f49737a = i;
        this.f49739c = moovitActivity;
        this.f49738b = mapFragment;
        this.f49740d = parcelable;
    }

    /* renamed from: a */
    public final void mo21406a() {
        switch (this.f49737a) {
            case 0:
                TripPlannerActivity tripPlannerActivity = (TripPlannerActivity) this.f49739c;
                MapFragment mapFragment = this.f49738b;
                Polyline polyline = (Polyline) this.f49740d;
                int i = TripPlannerActivity.f40505q0;
                tripPlannerActivity.getClass();
                Context requireContext = mapFragment.requireContext();
                if (tripPlannerActivity.f40507X == null) {
                    Color.C15756a aVar = Color.f40999c;
                    LineStyle.LineJoin lineJoin = LineStyle.LineJoin.NONE;
                    Color d = Color.m40220d(R.attr.colorSurfaceInverse, requireContext);
                    C21100e.m49373x(d, "color");
                    LineStyle.LineJoin lineJoin2 = LineStyle.LineJoin.ROUND;
                    C21100e.m49373x(lineJoin2, "lineJoin");
                    C21100e.m49357p(10.0f, "strokeWidth");
                    tripPlannerActivity.f40507X = new LineStyle(d, 10.0f, lineJoin2, (Bitmap) null, (Bitmap) null, BitmapDescriptorFactory.HUE_RED);
                }
                tripPlannerActivity.f40513o0 = mapFragment.mo48662w2(polyline, tripPlannerActivity.f40507X);
                Context applicationContext = tripPlannerActivity.getApplicationContext();
                C13387a[] aVarArr = new C13387a[2];
                if (tripPlannerActivity.f40509Z == null) {
                    tripPlannerActivity.f40509Z = new MarkerZoomStyle(new ResourceImage(R.drawable.ic_trip_start_16_on_surface_emphasis_high, new String[0]));
                }
                aVarArr[0] = tripPlannerActivity.f40509Z;
                if (tripPlannerActivity.f40511m0 == null) {
                    tripPlannerActivity.f40511m0 = new MarkerZoomStyle(new ResourceImage(R.drawable.ic_map_end_trip_36_secondary, new String[0]));
                }
                aVarArr[1] = tripPlannerActivity.f40511m0;
                mapFragment.mo48607C2(new C16245a.C16251f(mapFragment, polyline.getBounds(), mapFragment.mo48617N2(C16281i.m41515k(applicationContext, aVarArr)), new C16245a.C16249d(0)), true);
                return;
            default:
                MapLocationPickerActivity mapLocationPickerActivity = (MapLocationPickerActivity) this.f49739c;
                MapFragment mapFragment2 = this.f49738b;
                LatLonE6 latLonE6 = (LatLonE6) this.f49740d;
                int i2 = MapLocationPickerActivity.f42272q0;
                mapLocationPickerActivity.getClass();
                mapFragment2.mo48663x2(latLonE6);
                LocationDescriptor l = LocationDescriptor.m17771l(latLonE6);
                mapLocationPickerActivity.f42281p0.mo49939g(AnalyticsAttributeKey.ADDRESS_TYPE, "address");
                mapLocationPickerActivity.mo48575C2(l);
                return;
        }
    }
}
