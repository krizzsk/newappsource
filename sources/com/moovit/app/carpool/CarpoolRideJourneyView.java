package com.moovit.app.carpool;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ce0.C21100e;
import com.moovit.carpool.CarpoolLocationDescriptor;
import com.moovit.carpool.CarpoolRide;
import com.moovit.carpool.CarpoolRideDetour;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.design.view.list.TripleListItemView;
import com.moovit.image.model.Image;
import com.moovit.itinerary.model.leg.BicycleLeg;
import com.moovit.itinerary.model.leg.BicycleRentalLeg;
import com.moovit.itinerary.model.leg.CarLeg;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.itinerary.model.leg.DocklessBicycleLeg;
import com.moovit.itinerary.model.leg.DocklessCarLeg;
import com.moovit.itinerary.model.leg.DocklessMopedLeg;
import com.moovit.itinerary.model.leg.DocklessScooterLeg;
import com.moovit.itinerary.model.leg.EventLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTaxiLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.itinerary.model.leg.WalkLeg;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.DistanceUtils;
import com.tranzmate.R;
import e20.C16783l;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p583jk.C17884p;
import p977zz.C20941h;
import p977zz.C20964s0;

public class CarpoolRideJourneyView extends LinearLayout {

    /* renamed from: d */
    public static final /* synthetic */ int f37648d = 0;

    /* renamed from: b */
    public final Paint f37649b;

    /* renamed from: c */
    public final int f37650c;

    /* renamed from: com.moovit.app.carpool.CarpoolRideJourneyView$a */
    public static /* synthetic */ class C14787a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37651a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.transit.TransitType$VehicleType[] r0 = com.moovit.transit.TransitType.VehicleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37651a = r0
                com.moovit.transit.TransitType$VehicleType r1 = com.moovit.transit.TransitType.VehicleType.TRAM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37651a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.transit.TransitType$VehicleType r1 = com.moovit.transit.TransitType.VehicleType.SUBWAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37651a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.transit.TransitType$VehicleType r1 = com.moovit.transit.TransitType.VehicleType.TRAIN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37651a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.transit.TransitType$VehicleType r1 = com.moovit.transit.TransitType.VehicleType.FERRY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37651a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.transit.TransitType$VehicleType r1 = com.moovit.transit.TransitType.VehicleType.CABLE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37651a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.transit.TransitType$VehicleType r1 = com.moovit.transit.TransitType.VehicleType.GONDOLA     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f37651a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.transit.TransitType$VehicleType r1 = com.moovit.transit.TransitType.VehicleType.FUNICULAR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f37651a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.moovit.transit.TransitType$VehicleType r1 = com.moovit.transit.TransitType.VehicleType.BUS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.carpool.CarpoolRideJourneyView.C14787a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.carpool.CarpoolRideJourneyView$b */
    public static class C14788b implements Leg.C16144a<List<View>> {

        /* renamed from: b */
        public final ViewGroup f37652b;

        /* renamed from: c */
        public final Context f37653c;

        /* renamed from: d */
        public final List<Leg> f37654d;

        /* renamed from: e */
        public final CarpoolRideDetour f37655e;

        /* renamed from: f */
        public TripPlannerLocations f37656f;

        /* renamed from: g */
        public final int f37657g;

        public C14788b(CarpoolRideJourneyView carpoolRideJourneyView, TripPlannerLocations tripPlannerLocations, List list, CarpoolRideDetour carpoolRideDetour) {
            this.f37652b = carpoolRideJourneyView;
            this.f37656f = tripPlannerLocations;
            this.f37653c = carpoolRideJourneyView.getContext();
            C21100e.m49373x(list, "legs");
            this.f37654d = list;
            this.f37655e = carpoolRideDetour;
            this.f37657g = list.lastIndexOf((TransitLineLeg) C16783l.m42477i(list, list.size(), 2));
        }

        /* renamed from: o */
        public static int m37202o(DbEntityRef<TransitLine> dbEntityRef) {
            TransitAgency transitAgency;
            TransitType transitType;
            TransitLine transitLine = dbEntityRef.get();
            if (transitLine == null || (transitAgency = transitLine.mo24369b().f23696d.get()) == null || (transitType = transitAgency.f23674d.get()) == null) {
                return R.drawable.ic_transit_type_circ_bus_24_on_surface_emphasis_medium;
            }
            switch (C14787a.f37651a[transitType.f23760e.ordinal()]) {
                case 1:
                    return R.drawable.ic_transit_type_circ_tram_24_on_surface_emphasis_medium;
                case 2:
                    return R.drawable.ic_transit_type_circ_subway_24_on_surface_emphasis_medium;
                case 3:
                    return R.drawable.ic_transit_type_circ_rail_24_on_surface_emphasis_medium;
                case 4:
                    return R.drawable.ic_transit_type_circ_ferry_24_on_surface_emphasis_medium;
                case 5:
                    return R.drawable.ic_transit_type_circ_cable_car_24_on_surface_emphasis_medium;
                case 6:
                    return R.drawable.ic_transit_type_circ_gondola_24_on_surface_emphasis_medium;
                case 7:
                    return R.drawable.ic_transit_type_circ_funicular_24_on_surface_emphasis_medium;
                default:
                    return R.drawable.ic_transit_type_circ_bus_24_on_surface_emphasis_medium;
            }
        }

        /* renamed from: a */
        public final Object mo39909a(CarLeg carLeg) {
            throw new UnsupportedOperationException("CarLeg isn't supported!");
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            throw new UnsupportedOperationException("WaitToMultiTransitLinesLeg isn't supported!");
        }

        /* renamed from: c */
        public final Object mo39911c(TaxiLeg taxiLeg) {
            throw new UnsupportedOperationException("TaxiLeg isn't supported!");
        }

        /* renamed from: d */
        public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            throw new UnsupportedOperationException("MultiTransitLinesLeg isn't supported!");
        }

        /* renamed from: e */
        public final Object mo39913e(WalkLeg walkLeg) {
            ServerId serverId;
            DbEntityRef<TransitStop> dbEntityRef;
            TransitStop transitStop;
            TripleListItemView c = CarpoolRideJourneyView.m37201c(this.f37652b);
            c.setIcon((int) R.drawable.ic_transit_type_circ_walk_24_on_surface_emphasis_medium);
            c.setTitle((int) R.string.carpool_transit_walk_leg);
            LocationDescriptor locationDescriptor = walkLeg.f42150e;
            StringBuilder sb = new StringBuilder(locationDescriptor.mo24313f());
            if (LocationDescriptor.LocationType.STOP.equals(locationDescriptor.f23647b) && (serverId = locationDescriptor.f23649d) != null) {
                List<Leg> list = this.f37654d;
                WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) C16783l.m42476h(list, list.indexOf(walkLeg), 3);
                if (waitToTransitLineLeg != null) {
                    dbEntityRef = waitToTransitLineLeg.f42136g;
                } else {
                    dbEntityRef = null;
                }
                if (dbEntityRef != null && serverId.equals(dbEntityRef.getServerId()) && (transitStop = dbEntityRef.get()) != null && !C20964s0.m49090h(transitStop.f23733e)) {
                    sb.append(' ');
                    sb.append('(');
                    sb.append(transitStop.f23733e);
                    sb.append(')');
                }
            }
            c.setSubtitle((CharSequence) sb);
            c.setLabel(DistanceUtils.m17934a((int) DistanceUtils.m17936c(this.f37653c, walkLeg.f42151f.mo24339Z0()), this.f37653c));
            return Collections.singletonList(c);
        }

        /* renamed from: f */
        public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            throw new UnsupportedOperationException("BicycleRentalLeg isn't supported!");
        }

        /* renamed from: g */
        public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            View inflate = LayoutInflater.from(this.f37653c).inflate(R.layout.carpool_ride_journey_transit_leg_list_item, this.f37652b, false);
            ((ImageView) inflate.findViewById(R.id.icon)).setImageResource(m37202o(waitToTransitLineLeg.f42135f));
            TransitLineGroup transitLineGroup = waitToTransitLineLeg.f42135f.get().f23686b;
            Image b = transitLineGroup.mo24376b(4, transitLineGroup.f23697e);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.subtitle);
            C17884p.m44354Y(imageView).mo51642v(b).mo51628o0(b).mo10850T(imageView);
            return Collections.singletonList(inflate);
        }

        /* renamed from: h */
        public final Object mo39916h(CarpoolLeg carpoolLeg) {
            CarpoolLocationDescriptor carpoolLocationDescriptor;
            LocationDescriptor locationDescriptor;
            CarpoolRide carpoolRide = carpoolLeg.f41980p;
            CarpoolLocationDescriptor carpoolLocationDescriptor2 = null;
            if (carpoolRide != null) {
                carpoolLocationDescriptor = carpoolRide.f40913e;
            } else {
                carpoolLocationDescriptor = null;
            }
            TripPlannerLocations tripPlannerLocations = this.f37656f;
            if (tripPlannerLocations != null) {
                locationDescriptor = tripPlannerLocations.f23786b;
            } else {
                locationDescriptor = carpoolLeg.f41969e;
            }
            TripleListItemView b = CarpoolRideJourneyView.m37200b(this.f37653c, this.f37652b, carpoolLocationDescriptor, locationDescriptor, this.f37655e, R.drawable.ic_circ_carpool_24_secondary, R.string.carpool_transit_car_leg);
            if (carpoolRide != null) {
                carpoolLocationDescriptor2 = carpoolRide.f40915g;
            }
            return Arrays.asList(new View[]{b, CarpoolRideJourneyView.m37199a(this.f37653c, this.f37652b, carpoolLocationDescriptor2, carpoolLeg.f41970f, R.drawable.img_pin_circ_24, R.string.carpool_transit_car_dropoff_leg)});
        }

        /* renamed from: i */
        public final Object mo39917i(BicycleLeg bicycleLeg) {
            throw new UnsupportedOperationException("BicycleLeg isn't supported!");
        }

        /* renamed from: j */
        public final Object mo39918j(EventLeg eventLeg) {
            throw new UnsupportedOperationException("EventLeg isn't supported!");
        }

        /* renamed from: k */
        public final Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            throw new UnsupportedOperationException("DocklessBicycleLeg isn't supported!");
        }

        /* renamed from: l */
        public final Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            throw new UnsupportedOperationException("WaitToTaxiLeg isn't supported!");
        }

        /* renamed from: m */
        public final Object mo39921m(DocklessCarLeg docklessCarLeg) {
            throw new UnsupportedOperationException("DocklessCarLeg isn't supported!");
        }

        /* renamed from: n */
        public final Object mo39922n(TransitLineLeg transitLineLeg) {
            boolean z;
            int i;
            int indexOf = this.f37654d.indexOf(transitLineLeg);
            if (indexOf == this.f37657g) {
                z = true;
            } else {
                z = false;
            }
            TripleListItemView c = CarpoolRideJourneyView.m37201c(this.f37652b);
            if (z) {
                i = R.drawable.ic_flag_24_on_surface_emphasis_medium;
            } else {
                i = m37202o(transitLineLeg.f42110d);
            }
            c.setIcon(i);
            c.setTitle((int) R.string.carpool_transit_disembark_leg);
            c.setSubtitle((CharSequence) transitLineLeg.mo48334e2().mo24313f());
            if (z) {
                WalkLeg walkLeg = (WalkLeg) C16783l.m42476h(this.f37654d, indexOf, 1);
                if (walkLeg != null) {
                    String a = DistanceUtils.m17934a((int) DistanceUtils.m17936c(this.f37653c, walkLeg.f42151f.mo24339Z0()), this.f37653c);
                    c.setLabel(this.f37653c.getString(R.string.carpool_distance_from_dropoff, new Object[]{a}));
                }
            }
            return Collections.singletonList(c);
        }

        /* renamed from: p */
        public final Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            throw new UnsupportedOperationException("DocklessScooterLeg isn't supported!");
        }

        /* renamed from: q */
        public final /* bridge */ /* synthetic */ Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            return null;
        }

        /* renamed from: r */
        public final Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            throw new UnsupportedOperationException("DocklessMopedLeg isn't supported!");
        }
    }

    public CarpoolRideJourneyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static TripleListItemView m37199a(Context context, ViewGroup viewGroup, CarpoolLocationDescriptor carpoolLocationDescriptor, LocationDescriptor locationDescriptor, int i, int i2) {
        TripleListItemView c = m37201c(viewGroup);
        c.setIcon(i);
        c.setTitle(i2);
        String str = null;
        if (carpoolLocationDescriptor != null) {
            c.setSubtitle((CharSequence) carpoolLocationDescriptor.f40895c);
        } else if (locationDescriptor != null) {
            c.setSubtitle((CharSequence) locationDescriptor.mo24313f());
        } else {
            c.setSubtitle((CharSequence) null);
        }
        if (carpoolLocationDescriptor == null || locationDescriptor == null) {
            c.setLabel((CharSequence) null);
        } else {
            LatLonE6 latLonE6 = carpoolLocationDescriptor.f40896d;
            LatLonE6 d = locationDescriptor.mo24310d();
            latLonE6.getClass();
            float c2 = LatLonE6.m40174c(latLonE6, d);
            if (c2 >= 100.0f) {
                str = context.getString(R.string.carpool_distance_from_dropoff, new Object[]{DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, c2), context)});
            }
            c.setLabel(str);
        }
        return c;
    }

    /* renamed from: b */
    public static TripleListItemView m37200b(Context context, ViewGroup viewGroup, CarpoolLocationDescriptor carpoolLocationDescriptor, LocationDescriptor locationDescriptor, CarpoolRideDetour carpoolRideDetour, int i, int i2) {
        int i3;
        TripleListItemView c = m37201c(viewGroup);
        c.setIcon(i);
        c.setTitle(i2);
        String str = null;
        if (carpoolRideDetour != null) {
            if (locationDescriptor != null) {
                c.setSubtitle((CharSequence) locationDescriptor.mo24313f());
            } else if (carpoolLocationDescriptor != null) {
                c.setSubtitle((CharSequence) carpoolLocationDescriptor.f40895c);
            } else {
                c.setSubtitle((CharSequence) null);
            }
        } else if (carpoolLocationDescriptor != null) {
            c.setSubtitle((CharSequence) carpoolLocationDescriptor.f40895c);
        } else if (locationDescriptor != null) {
            c.setSubtitle((CharSequence) locationDescriptor.mo24313f());
        } else {
            c.setSubtitle((CharSequence) null);
        }
        if (carpoolRideDetour != null || carpoolLocationDescriptor == null || locationDescriptor == null) {
            c.setLabel((CharSequence) null);
        } else {
            LatLonE6 latLonE6 = carpoolLocationDescriptor.f40896d;
            LatLonE6 d = locationDescriptor.mo24310d();
            latLonE6.getClass();
            float c2 = LatLonE6.m40174c(latLonE6, d);
            if (c2 >= 100.0f) {
                if (LocationDescriptor.LocationType.CURRENT.equals(locationDescriptor.f23647b)) {
                    i3 = R.string.carpool_distance_from_pickup;
                } else {
                    i3 = R.string.carpool_distance_from_pickup_address;
                }
                str = context.getString(i3, new Object[]{DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, c2), context), locationDescriptor.mo24313f()});
            }
            c.setLabel(str);
        }
        return c;
    }

    /* renamed from: c */
    public static TripleListItemView m37201c(ViewGroup viewGroup) {
        TripleListItemView tripleListItemView = (TripleListItemView) C13715c.m34239e(viewGroup, R.layout.carpool_ride_journey_generic_leg_list_item, viewGroup, false);
        tripleListItemView.getIconView().setId(R.id.icon);
        return tripleListItemView;
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        super.draw(canvas);
        int childCount = getChildCount() - 1;
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            i3 += 2;
            View childAt2 = getChildAt(i3);
            ImageView imageView = (ImageView) childAt.findViewById(R.id.icon);
            ImageView imageView2 = (ImageView) childAt2.findViewById(R.id.icon);
            if (!(imageView == null || imageView2 == null)) {
                int bottom = imageView.getBottom() + childAt.getTop() + this.f37650c;
                int top = (imageView2.getTop() + childAt2.getTop()) - this.f37650c;
                if (bottom < top) {
                    if (C15780a.m40269b(this)) {
                        i = (childAt.getRight() - (childAt.getWidth() - imageView.getRight())) - (imageView.getWidth() / 2);
                        i2 = (childAt2.getRight() - (childAt2.getWidth() - imageView2.getRight())) - (imageView2.getWidth() / 2);
                    } else {
                        i = imageView.getLeft() + childAt.getLeft() + (imageView.getWidth() / 2);
                        i2 = (imageView2.getWidth() / 2) + imageView2.getLeft() + childAt2.getLeft();
                    }
                    canvas.drawLine((float) i, (float) bottom, (float) i2, (float) top, this.f37649b);
                }
            }
        }
    }

    public CarpoolRideJourneyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f37649b = paint;
        paint.setColor(C20941h.m49043f(R.attr.colorOnSurfaceEmphasisLow, context));
        paint.setStrokeWidth((float) UiUtils.m40249h(context.getResources(), 1.0f));
        paint.setStyle(Paint.Style.STROKE);
        this.f37650c = UiUtils.m40249h(context.getResources(), 4.0f);
        setOrientation(1);
        setWillNotDraw(false);
    }
}
