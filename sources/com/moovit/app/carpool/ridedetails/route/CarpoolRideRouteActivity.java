package com.moovit.app.carpool.ridedetails.route;

import android.content.Intent;
import android.os.Bundle;
import b00.C13556a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.carpool.ridedetails.route.network.PolylineDescriptor;
import com.moovit.app.itinerary.C15043f;
import com.moovit.carpool.CarpoolRide;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.utils.Color;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.map.C16281i;
import com.moovit.map.LineStyle;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import e20.C16769e;
import e20.C16783l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p641lu.C18277b;
import p802sr.C19521a;
import p824tp.C19735m;
import p826tr.C19750a;
import p826tr.C19753c;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

public class CarpoolRideRouteActivity extends MoovitAppActivity {

    /* renamed from: w0 */
    public static final /* synthetic */ int f37892w0 = 0;

    /* renamed from: U */
    public C13556a f37893U;

    /* renamed from: X */
    public List<PolylineDescriptor> f37894X;

    /* renamed from: Y */
    public Polyline f37895Y;

    /* renamed from: Z */
    public CarpoolRide f37896Z;

    /* renamed from: l0 */
    public LatLonE6 f37897l0;

    /* renamed from: m0 */
    public LatLonE6 f37898m0;

    /* renamed from: n0 */
    public Itinerary f37899n0;

    /* renamed from: o0 */
    public MapFragment f37900o0;

    /* renamed from: p0 */
    public C15043f f37901p0;

    /* renamed from: q0 */
    public MarkerZoomStyle f37902q0;

    /* renamed from: r0 */
    public MarkerZoomStyle f37903r0;

    /* renamed from: s0 */
    public boolean f37904s0;

    /* renamed from: t0 */
    public boolean f37905t0;

    /* renamed from: u0 */
    public final C14840a f37906u0 = new C14840a();

    /* renamed from: v0 */
    public final C14841b f37907v0 = new C14841b();

    /* renamed from: com.moovit.app.carpool.ridedetails.route.CarpoolRideRouteActivity$a */
    public class C14840a implements MapFragment.C16237r {
        public C14840a() {
        }

        /* renamed from: a */
        public final void mo21406a() {
            CarpoolRideRouteActivity.m37413y2(CarpoolRideRouteActivity.this);
        }
    }

    /* renamed from: com.moovit.app.carpool.ridedetails.route.CarpoolRideRouteActivity$b */
    public class C14841b extends C20438i<C19753c, C19750a> {
        public C14841b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19753c cVar2 = (C19753c) cVar;
            CarpoolRideRouteActivity.this.f37893U = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19753c cVar2 = (C19753c) cVar;
            CarpoolRideRouteActivity carpoolRideRouteActivity = CarpoolRideRouteActivity.this;
            ArrayList arrayList = ((C19750a) gVar).f50228m;
            carpoolRideRouteActivity.f37894X = arrayList;
            carpoolRideRouteActivity.f37895Y = null;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PolylineDescriptor polylineDescriptor = (PolylineDescriptor) it.next();
                if (polylineDescriptor.f37911b == 1) {
                    carpoolRideRouteActivity.f37895Y = polylineDescriptor.f37912c;
                    break;
                }
            }
            Itinerary itinerary = carpoolRideRouteActivity.f37899n0;
            if (itinerary != null) {
                C18277b bVar = C16783l.f43688a;
                CarpoolLeg carpoolLeg = (CarpoolLeg) C16783l.m42476h(itinerary.mo48295u0(), -1, 7);
                if (carpoolLeg != null) {
                    carpoolLeg.f41983s = carpoolRideRouteActivity.f37895Y;
                }
            }
            CarpoolRideRouteActivity carpoolRideRouteActivity2 = CarpoolRideRouteActivity.this;
            carpoolRideRouteActivity2.f37904s0 = true;
            carpoolRideRouteActivity2.f37905t0 = true;
            CarpoolRideRouteActivity.m37413y2(carpoolRideRouteActivity2);
        }

        /* renamed from: w */
        public final /* bridge */ /* synthetic */ boolean mo21415w(C20431c cVar, Exception exc) {
            C19753c cVar2 = (C19753c) cVar;
            return false;
        }
    }

    /* renamed from: y2 */
    public static void m37413y2(CarpoolRideRouteActivity carpoolRideRouteActivity) {
        int i;
        LineStyle lineStyle;
        if (carpoolRideRouteActivity.f37900o0.mo48624U2()) {
            Itinerary itinerary = carpoolRideRouteActivity.f37899n0;
            if (itinerary == null) {
                if (carpoolRideRouteActivity.f37905t0) {
                    carpoolRideRouteActivity.f37900o0.mo48610F2();
                    MapFragment mapFragment = carpoolRideRouteActivity.f37900o0;
                    LatLonE6 latLonE6 = carpoolRideRouteActivity.f37896Z.f40913e.f40896d;
                    mapFragment.mo48646o2(latLonE6, latLonE6, carpoolRideRouteActivity.f37902q0);
                    MapFragment mapFragment2 = carpoolRideRouteActivity.f37900o0;
                    LatLonE6 latLonE62 = carpoolRideRouteActivity.f37896Z.f40915g.f40896d;
                    mapFragment2.mo48646o2(latLonE62, latLonE62, carpoolRideRouteActivity.f37903r0);
                    carpoolRideRouteActivity.f37905t0 = false;
                }
                if (carpoolRideRouteActivity.f37904s0) {
                    carpoolRideRouteActivity.f37900o0.mo48613I2();
                    Polyline polyline = carpoolRideRouteActivity.f37895Y;
                    if (polyline != null) {
                        carpoolRideRouteActivity.f37900o0.mo48662w2(polyline, C16281i.m41519o(carpoolRideRouteActivity, Color.m40220d(C19735m.colorPrimary, carpoolRideRouteActivity)));
                    }
                    for (PolylineDescriptor next : carpoolRideRouteActivity.f37894X) {
                        Polyline polyline2 = next.f37912c;
                        if (!(polyline2 == null || (i = next.f37911b) == 1)) {
                            MapFragment mapFragment3 = carpoolRideRouteActivity.f37900o0;
                            if (i == 0) {
                                lineStyle = C16281i.m41521q(carpoolRideRouteActivity);
                            } else if (i == 1) {
                                lineStyle = C16281i.m41519o(carpoolRideRouteActivity, Color.m40220d(C19735m.colorPrimary, carpoolRideRouteActivity));
                            } else {
                                StringBuilder k = C13555b.m33972k("Could not find a line style for: ");
                                k.append(next.f37911b);
                                throw new IllegalArgumentException(k.toString());
                            }
                            mapFragment3.mo48662w2(polyline2, lineStyle);
                        }
                    }
                    carpoolRideRouteActivity.f37904s0 = false;
                }
            } else {
                carpoolRideRouteActivity.f37901p0.mo45313d(itinerary, (C16769e.C16772c) null);
            }
            carpoolRideRouteActivity.mo44920z2();
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.carpool_ride_route_activity);
        Intent intent = getIntent();
        this.f37896Z = (CarpoolRide) intent.getParcelableExtra("ride");
        this.f37897l0 = (LatLonE6) intent.getParcelableExtra(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f37898m0 = (LatLonE6) intent.getParcelableExtra("destination");
        Itinerary itinerary = (Itinerary) intent.getParcelableExtra("itinerary");
        this.f37899n0 = itinerary;
        if (itinerary != null) {
            C18277b bVar = C16783l.f43688a;
            CarpoolLeg carpoolLeg = (CarpoolLeg) C16783l.m42476h(itinerary.mo48295u0(), -1, 7);
            if (carpoolLeg != null) {
                this.f37896Z = carpoolLeg.f41980p;
            }
        }
        this.f37902q0 = C16281i.m41518n(this, getString(R.string.carpool_pickup_label));
        this.f37903r0 = C16281i.m41518n(this, getString(R.string.carpool_dropoff_label));
        MapFragment mapFragment = (MapFragment) getSupportFragmentManager().mo3983z(R.id.map_fragment);
        this.f37900o0 = mapFragment;
        mapFragment.mo48656t2(this.f37906u0);
        this.f37900o0.mo48658u2(new C19521a(this));
        this.f37901p0 = new C15043f(this, this.f37900o0);
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        C13556a aVar = this.f37893U;
        if (aVar != null) {
            aVar.cancel(true);
            this.f37893U = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LatLonE6 latLonE6 = this.f37897l0;
        if (latLonE6 != null) {
            arrayList.add(latLonE6);
            arrayList2.add(0);
        }
        arrayList.add(this.f37896Z.f40913e.f40896d);
        arrayList.add(this.f37896Z.f40915g.f40896d);
        arrayList2.add(1);
        LatLonE6 latLonE62 = this.f37898m0;
        if (latLonE62 != null) {
            arrayList.add(latLonE62);
            arrayList2.add(0);
        }
        C19753c cVar = new C19753c(mo44548x1(), arrayList, arrayList2, System.currentTimeMillis());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f37893U = mo44527k2("polylines_request", cVar, requestOptions, this.f37907v0);
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("CARPOOL_SUPPORT_VALIDATOR");
        return s1;
    }

    /* renamed from: z2 */
    public final void mo44920z2() {
        Itinerary itinerary = this.f37899n0;
        if (itinerary != null) {
            this.f37901p0.mo45311b(itinerary);
        } else if (this.f37895Y != null) {
            this.f37900o0.mo48606B2(C16281i.m41515k(getApplicationContext(), this.f37902q0, this.f37903r0), this.f37895Y.getBounds(), true);
        }
    }
}
