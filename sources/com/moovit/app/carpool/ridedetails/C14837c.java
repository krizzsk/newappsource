package com.moovit.app.carpool.ridedetails;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.ridedetails.route.CarpoolRideRouteActivity;
import com.moovit.carpool.CarpoolRide;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.tripplanner.TripPlannerLocations;
import e20.C16783l;
import p543hq.C17474b;

/* renamed from: com.moovit.app.carpool.ridedetails.c */
public final class C14837c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ CarpoolRideDetailsFragment f37889b;

    public C14837c(CarpoolRideDetailsFragment carpoolRideDetailsFragment) {
        this.f37889b = carpoolRideDetailsFragment;
    }

    public final void onClick(View view) {
        LatLonE6 latLonE6;
        LatLonE6 latLonE62;
        CarpoolRideDetailsActivity carpoolRideDetailsActivity = (CarpoolRideDetailsActivity) this.f37889b.f37861E;
        carpoolRideDetailsActivity.getClass();
        Class<CarpoolRideRouteActivity> cls = CarpoolRideRouteActivity.class;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_view_ride_on_map_clicked");
        carpoolRideDetailsActivity.mo44545v2(aVar.mo49933a());
        Itinerary itinerary = carpoolRideDetailsActivity.f37846x0;
        if (itinerary == null || !C16783l.m42469a(itinerary, 7) || !C16783l.m42469a(carpoolRideDetailsActivity.f37846x0, 2)) {
            TripPlannerLocations tripPlannerLocations = carpoolRideDetailsActivity.f37845w0;
            if (tripPlannerLocations != null) {
                latLonE62 = tripPlannerLocations.f23786b.mo24310d();
                latLonE6 = carpoolRideDetailsActivity.f37845w0.f23787c.mo24310d();
            } else {
                latLonE62 = LatLonE6.m40177j(carpoolRideDetailsActivity.mo44542u1());
                latLonE6 = null;
            }
            CarpoolRide carpoolRide = carpoolRideDetailsActivity.f37836n0;
            Intent intent = new Intent(carpoolRideDetailsActivity, cls);
            intent.putExtra("ride", carpoolRide);
            intent.putExtra(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, latLonE62);
            intent.putExtra("destination", latLonE6);
            carpoolRideDetailsActivity.startActivity(intent);
            return;
        }
        Itinerary itinerary2 = carpoolRideDetailsActivity.f37846x0;
        Intent intent2 = new Intent(carpoolRideDetailsActivity, cls);
        intent2.putExtra("itinerary", itinerary2);
        carpoolRideDetailsActivity.startActivity(intent2);
    }
}
