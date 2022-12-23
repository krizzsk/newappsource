package com.moovit.app.itinerary;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import ce0.C21100e;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.app.taxi.providers.TaxiTripPlanConfig;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.UiUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.Itinerary;
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
import com.moovit.map.C16281i;
import com.moovit.map.C16285j;
import com.moovit.map.LineStyle;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.map.collections.category.types.BicycleStationMetadata;
import com.moovit.network.model.ServerId;
import com.moovit.transit.BicycleProvider;
import com.moovit.transit.BicycleStop;
import com.moovit.transit.C7843b;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitStopPathway;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import e20.C16769e;
import e20.C16783l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o20.C18699e;
import o20.C18711q;
import p241s0.C6302b;
import p641lu.C18277b;
import p762qz.C19206b;
import p824tp.C19735m;
import p824tp.C19739q;
import p824tp.C19745w;
import p977zz.C20944i0;
import p977zz.C20964s0;
import p977zz.C20975x0;

/* renamed from: com.moovit.app.itinerary.f */
public final class C15043f {

    /* renamed from: a */
    public final Context f38549a;

    /* renamed from: b */
    public final MapFragment f38550b;

    /* renamed from: c */
    public final C15048e f38551c;

    /* renamed from: d */
    public final C15047d f38552d;

    /* renamed from: e */
    public final C15049f f38553e;

    /* renamed from: f */
    public final MarkerZoomStyle f38554f;

    /* renamed from: g */
    public final MarkerZoomStyle f38555g;

    /* renamed from: h */
    public final MarkerZoomStyle f38556h;

    /* renamed from: i */
    public final C6302b f38557i = new C6302b();

    /* renamed from: j */
    public final MarkerZoomStyle f38558j;

    /* renamed from: k */
    public final MarkerZoomStyle f38559k;

    /* renamed from: l */
    public final Rect f38560l;

    /* renamed from: m */
    public Itinerary f38561m;

    /* renamed from: n */
    public C16769e.C16772c f38562n;

    /* renamed from: o */
    public final ArrayList f38563o;

    /* renamed from: p */
    public final ArrayList f38564p;

    /* renamed from: q */
    public final ArrayList f38565q;

    /* renamed from: r */
    public final ArrayList f38566r;

    /* renamed from: s */
    public final ArrayList f38567s;

    /* renamed from: t */
    public final ArrayList f38568t;

    /* renamed from: u */
    public final ArrayList f38569u;

    /* renamed from: v */
    public final C18711q f38570v;

    /* renamed from: w */
    public final ArrayList f38571w;

    /* renamed from: x */
    public final ArrayList f38572x;

    /* renamed from: y */
    public final ArrayList f38573y;

    /* renamed from: z */
    public final ArrayList f38574z;

    /* renamed from: com.moovit.app.itinerary.f$a */
    public class C15044a implements MapFragment.C16237r {

        /* renamed from: a */
        public final Itinerary f38575a;

        public C15044a(Itinerary itinerary) {
            C21100e.m49373x(itinerary, "itinerary");
            this.f38575a = itinerary;
        }

        /* renamed from: a */
        public final void mo21406a() {
            C15043f.this.mo45311b(this.f38575a);
        }
    }

    /* renamed from: com.moovit.app.itinerary.f$b */
    public class C15045b implements MapFragment.C16237r {

        /* renamed from: a */
        public final Leg f38577a;

        /* renamed from: b */
        public final boolean f38578b;

        public C15045b(Leg leg, boolean z) {
            C21100e.m49373x(leg, "leg");
            this.f38577a = leg;
            this.f38578b = z;
        }

        /* renamed from: a */
        public final void mo21406a() {
            C15043f.this.mo45312c(this.f38577a, this.f38578b);
        }
    }

    /* renamed from: com.moovit.app.itinerary.f$c */
    public class C15046c implements MapFragment.C16237r {

        /* renamed from: a */
        public final Itinerary f38580a;

        /* renamed from: b */
        public final C16769e.C16772c f38581b;

        public C15046c(Itinerary itinerary, C16769e.C16772c cVar) {
            C21100e.m49373x(itinerary, "itinerary");
            this.f38580a = itinerary;
            this.f38581b = cVar;
        }

        /* renamed from: a */
        public final void mo21406a() {
            C15043f.this.mo45313d(this.f38580a, this.f38581b);
        }
    }

    /* renamed from: com.moovit.app.itinerary.f$d */
    public class C15047d implements Leg.C16144a<Void> {
        public C15047d() {
        }

        /* renamed from: a */
        public final Object mo39909a(CarLeg carLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.m38076a(C15043f.this, carLeg.f41962f.getBounds());
            return null;
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            mo45316o(waitToMultiTransitLinesLeg.mo48467b());
            return null;
        }

        /* renamed from: c */
        public final Object mo39911c(TaxiLeg taxiLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.LOCATION, false);
            C15043f.m38076a(C15043f.this, taxiLeg.f42102g.getBounds());
            return null;
        }

        /* renamed from: d */
        public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            TransitLineLeg b = multiTransitLinesLeg.mo48440b();
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.m38076a(C15043f.this, b.f42112f.getBounds());
            return null;
        }

        /* renamed from: f */
        public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.m38076a(C15043f.this, bicycleRentalLeg.f41953h.getBounds());
            return null;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            mo45316o(waitToTransitLineLeg);
            return null;
        }

        /* renamed from: h */
        public final Object mo39916h(CarpoolLeg carpoolLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.m38076a(C15043f.this, carpoolLeg.mo48340w1().getBounds());
            return null;
        }

        /* renamed from: i */
        public final Object mo39917i(BicycleLeg bicycleLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.m38076a(C15043f.this, bicycleLeg.f41943f.getBounds());
            return null;
        }

        /* renamed from: j */
        public final /* bridge */ /* synthetic */ Object mo39918j(EventLeg eventLeg) {
            return null;
        }

        /* renamed from: k */
        public final Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.m38076a(C15043f.this, docklessBicycleLeg.f42000f.getBounds());
            return null;
        }

        /* renamed from: l */
        public final Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.this.f38550b.mo48664z2(waitToTaxiLeg.f42125e.mo24310d(), 18.0f);
            return null;
        }

        /* renamed from: m */
        public final Object mo39921m(DocklessCarLeg docklessCarLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.m38076a(C15043f.this, docklessCarLeg.f42022f.getBounds());
            return null;
        }

        /* renamed from: n */
        public final Object mo39922n(TransitLineLeg transitLineLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.m38076a(C15043f.this, transitLineLeg.f42112f.getBounds());
            return null;
        }

        /* renamed from: o */
        public final Void mo45316o(WaitToTransitLineLeg waitToTransitLineLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.this.f38550b.mo48664z2(waitToTransitLineLeg.mo48332W().mo24310d(), 18.0f);
            return null;
        }

        /* renamed from: p */
        public final Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.m38076a(C15043f.this, docklessScooterLeg.f42066f.getBounds());
            return null;
        }

        /* renamed from: q */
        public final Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.m38076a(C15043f.this, ((Polylon) pathwayWalkLeg.mo48340w1()).f40990c);
            return null;
        }

        /* renamed from: r */
        public final Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.m38076a(C15043f.this, docklessMopedLeg.f42044f.getBounds());
            return null;
        }

        /* renamed from: s */
        public Void mo39913e(WalkLeg walkLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.NONE, false);
            C15043f.m38076a(C15043f.this, walkLeg.f42151f.getBounds());
            return null;
        }
    }

    /* renamed from: com.moovit.app.itinerary.f$e */
    public class C15048e implements Leg.C16144a<Void> {
        public C15048e() {
        }

        /* renamed from: a */
        public final Object mo39909a(CarLeg carLeg) {
            C15043f.this.f38563o.add(carLeg.f41962f);
            C15043f fVar = C15043f.this;
            ArrayList arrayList = fVar.f38564p;
            Context context = fVar.f38549a;
            arrayList.add(C16281i.m41519o(context, Color.m40220d(C19735m.colorPrimary, context)));
            LocationDescriptor locationDescriptor = carLeg.f41960d;
            Image image = locationDescriptor.f23656k;
            if (image != null) {
                C15043f.this.f38565q.add(locationDescriptor.mo24310d());
                C15043f.this.f38566r.add(carLeg);
                C15043f.this.f38567s.add(new MarkerZoomStyle(image));
            }
            LocationDescriptor locationDescriptor2 = carLeg.f41961e;
            Image image2 = locationDescriptor2.f23656k;
            if (image2 == null) {
                return null;
            }
            C15043f.this.f38565q.add(locationDescriptor2.mo24310d());
            C15043f.this.f38566r.add(carLeg);
            C15043f.this.f38567s.add(new MarkerZoomStyle(image2));
            return null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            return null;
        }

        /* renamed from: c */
        public final Object mo39911c(TaxiLeg taxiLeg) {
            TaxiProvider taxiProvider;
            TaxiTripPlanConfig taxiTripPlanConfig;
            Image image;
            ServerId serverId = taxiLeg.f42097b;
            Polyline polyline = taxiLeg.f42102g;
            C15043f.this.f38563o.add(polyline);
            C15043f fVar = C15043f.this;
            fVar.f38564p.add(C16281i.m41511g(fVar.f38549a));
            C15043f.this.f38565q.add(polyline.mo24347y(0));
            C15043f.this.f38566r.add(taxiLeg);
            C15043f fVar2 = C15043f.this;
            ArrayList arrayList = fVar2.f38567s;
            MarkerZoomStyle markerZoomStyle = (MarkerZoomStyle) fVar2.f38557i.getOrDefault(serverId, null);
            if (markerZoomStyle == null) {
                TaxiProvidersManager b = TaxiProvidersManager.m39496b(fVar2.f38549a.getApplicationContext());
                if (b != null) {
                    taxiProvider = b.mo46163c(serverId);
                } else {
                    taxiProvider = null;
                }
                if (taxiProvider != null) {
                    taxiTripPlanConfig = taxiProvider.f39977l;
                } else {
                    taxiTripPlanConfig = null;
                }
                if (taxiTripPlanConfig != null) {
                    image = taxiTripPlanConfig.f39993g;
                } else {
                    image = null;
                }
                if (image != null) {
                    MarkerZoomStyle markerZoomStyle2 = new MarkerZoomStyle(image);
                    C16281i.m41523s(fVar2.f38549a, fVar2.f38560l, markerZoomStyle2);
                    markerZoomStyle = markerZoomStyle2;
                } else {
                    markerZoomStyle = fVar2.f38556h;
                }
                fVar2.f38557i.put(serverId, markerZoomStyle);
            }
            arrayList.add(markerZoomStyle);
            return null;
        }

        /* renamed from: d */
        public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            mo45319s(multiTransitLinesLeg.mo48440b());
            return null;
        }

        /* renamed from: e */
        public final Object mo39913e(WalkLeg walkLeg) {
            Polyline w1;
            LineStyle q = C16281i.m41521q(C15043f.this.f38549a);
            Polyline polyline = walkLeg.f42151f;
            Itinerary itinerary = C15043f.this.f38561m;
            C18277b bVar = C16783l.f43688a;
            List<Leg> u0 = itinerary.mo48295u0();
            Leg u = C16783l.m42489u(u0.indexOf(walkLeg), u0);
            if (!(u == null || (w1 = u.mo48340w1()) == null)) {
                ArrayList arrayList = new ArrayList(polyline.getPoints());
                arrayList.add(w1.mo24347y(0));
                polyline = new Polylon(arrayList, true);
            }
            C15043f.this.f38563o.add(polyline);
            C15043f.this.f38564p.add(q);
            return null;
        }

        /* renamed from: f */
        public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            Polyline w1;
            LineStyle e = C16281i.m41509e(C15043f.this.f38549a);
            Polyline polyline = bicycleRentalLeg.f41953h;
            Itinerary itinerary = C15043f.this.f38561m;
            C18277b bVar = C16783l.f43688a;
            List<Leg> u0 = itinerary.mo48295u0();
            Leg u = C16783l.m42489u(u0.indexOf(bicycleRentalLeg), u0);
            if (!(u == null || (w1 = u.mo48340w1()) == null)) {
                ArrayList arrayList = new ArrayList(polyline.getPoints());
                arrayList.add(w1.mo24347y(0));
                polyline = new Polylon(arrayList, true);
            }
            C15043f.this.f38563o.add(polyline);
            C15043f.this.f38564p.add(e);
            for (DbEntityRef<BicycleStop> dbEntityRef : bicycleRentalLeg.f41950e) {
                mo45318o((BicycleStop) dbEntityRef.get(), true, false);
            }
            DbEntityRef<BicycleStop> c = bicycleRentalLeg.mo48345c();
            if (c != null) {
                mo45318o(c.get(), true, true);
            }
            for (DbEntityRef<BicycleStop> dbEntityRef2 : bicycleRentalLeg.f41952g) {
                mo45318o((BicycleStop) dbEntityRef2.get(), false, false);
            }
            DbEntityRef<BicycleStop> b = bicycleRentalLeg.mo48344b();
            if (b == null) {
                return null;
            }
            mo45318o(b.get(), false, true);
            return null;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            return null;
        }

        /* renamed from: h */
        public final Object mo39916h(CarpoolLeg carpoolLeg) {
            C15043f.this.f38563o.add(carpoolLeg.mo48340w1());
            C15043f fVar = C15043f.this;
            ArrayList arrayList = fVar.f38564p;
            Context context = fVar.f38549a;
            arrayList.add(C16281i.m41519o(context, Color.m40220d(C19735m.colorPrimary, context)));
            C15043f.this.f38565q.add(carpoolLeg.f41969e.mo24310d());
            C15043f.this.f38566r.add(carpoolLeg);
            C15043f fVar2 = C15043f.this;
            fVar2.f38567s.add(fVar2.f38558j);
            C15043f.this.f38565q.add(carpoolLeg.f41970f.mo24310d());
            C15043f.this.f38566r.add(carpoolLeg);
            C15043f fVar3 = C15043f.this;
            fVar3.f38567s.add(fVar3.f38559k);
            return null;
        }

        /* renamed from: i */
        public final Object mo39917i(BicycleLeg bicycleLeg) {
            Polyline w1;
            LineStyle e = C16281i.m41509e(C15043f.this.f38549a);
            Polyline polyline = bicycleLeg.f41943f;
            Itinerary itinerary = C15043f.this.f38561m;
            C18277b bVar = C16783l.f43688a;
            List<Leg> u0 = itinerary.mo48295u0();
            Leg u = C16783l.m42489u(u0.indexOf(bicycleLeg), u0);
            if (!(u == null || (w1 = u.mo48340w1()) == null)) {
                ArrayList arrayList = new ArrayList(polyline.getPoints());
                arrayList.add(w1.mo24347y(0));
                polyline = new Polylon(arrayList, true);
            }
            C15043f.this.f38563o.add(polyline);
            C15043f.this.f38564p.add(e);
            return null;
        }

        /* renamed from: j */
        public final /* bridge */ /* synthetic */ Object mo39918j(EventLeg eventLeg) {
            return null;
        }

        /* renamed from: k */
        public final Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            C15043f.this.f38563o.add(docklessBicycleLeg.f42000f);
            C15043f fVar = C15043f.this;
            fVar.f38564p.add(C16281i.m41511g(fVar.f38549a));
            C15043f.this.f38565q.add(docklessBicycleLeg.f41998d.mo24310d());
            C15043f.this.f38566r.add(docklessBicycleLeg);
            C15043f.this.f38567s.add(new MarkerZoomStyle(docklessBicycleLeg.f42002h.f42011g));
            return null;
        }

        /* renamed from: l */
        public final /* bridge */ /* synthetic */ Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            return null;
        }

        /* renamed from: m */
        public final Object mo39921m(DocklessCarLeg docklessCarLeg) {
            C15043f.this.f38563o.add(docklessCarLeg.f42022f);
            C15043f fVar = C15043f.this;
            fVar.f38564p.add(C16281i.m41511g(fVar.f38549a));
            C15043f.this.f38565q.add(docklessCarLeg.f42020d.mo24310d());
            C15043f.this.f38566r.add(docklessCarLeg);
            C15043f.this.f38567s.add(new MarkerZoomStyle(docklessCarLeg.f42024h.f42033g));
            return null;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ Object mo39922n(TransitLineLeg transitLineLeg) {
            mo45319s(transitLineLeg);
            return null;
        }

        /* renamed from: o */
        public final void mo45318o(BicycleStop bicycleStop, boolean z, boolean z2) {
            ResourceImage resourceImage;
            boolean z3;
            int i;
            int i2;
            BicycleStop bicycleStop2 = bicycleStop;
            BicycleProvider bicycleProvider = bicycleStop2.f23636b.get();
            if (bicycleProvider != null) {
                int m = C16783l.m42481m(C15043f.this.f38562n, bicycleStop2.f23637c);
                int l = C16783l.m42480l(C15043f.this.f38562n, bicycleStop2.f23637c);
                String str = "";
                String str2 = "0";
                if (z) {
                    String l2 = bicycleStop2.f23636b.get().f23631d.mo46956l();
                    String l3 = bicycleStop2.f23636b.get().f23632e.mo46956l();
                    if (m < 0 || !z2) {
                        i2 = C16028g.m40831i(C19739q.mvf_bicycle_station_background_small_padding);
                    } else {
                        i2 = C16028g.m40831i(C19739q.mvf_bicycle_station_background_large_padding);
                    }
                    String valueOf = String.valueOf(i2);
                    if (m < 0 || z2) {
                        str2 = String.valueOf(C16028g.m40831i(C19739q.mvf_bicycle_station_icon));
                    }
                    if (m >= 0) {
                        Object[] objArr = {Integer.valueOf(m)};
                        String str3 = C20964s0.f52718a;
                        str = String.format((Locale) null, "%d", objArr);
                    }
                    resourceImage = new ResourceImage(C19745w.mvf_bicycle_station, l2, l3, valueOf, str2, str);
                } else {
                    Context context = C15043f.this.f38549a;
                    String l4 = Color.m40220d(C19735m.colorSurfaceInverse, context).mo46956l();
                    String l5 = Color.m40220d(C19735m.colorOnSurfaceInverse, context).mo46956l();
                    if (l < 0 || !z2) {
                        i = C16028g.m40831i(C19739q.mvf_bicycle_station_background_small_padding);
                    } else {
                        i = C16028g.m40831i(C19739q.mvf_bicycle_station_background_large_padding);
                    }
                    String valueOf2 = String.valueOf(i);
                    if (l < 0 || z2) {
                        str2 = String.valueOf(C16028g.m40831i(C19739q.mvf_bicycle_station_dock_icon));
                    }
                    if (l >= 0) {
                        Object[] objArr2 = {Integer.valueOf(l)};
                        String str4 = C20964s0.f52718a;
                        str = String.format((Locale) null, "%d", objArr2);
                    }
                    resourceImage = new ResourceImage(C19745w.mvf_bicycle_station, l4, l5, valueOf2, str2, str);
                }
                ResourceImage resourceImage2 = resourceImage;
                LocationDescriptor b = LocationDescriptor.m17768b(bicycleStop);
                long currentTimeMillis = System.currentTimeMillis();
                String str5 = bicycleProvider.f23630c;
                Image image = bicycleProvider.f23634g;
                if (m < 0 || l < 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                BicycleStationMetadata bicycleStationMetadata = new BicycleStationMetadata(m, l, b, currentTimeMillis, str5, image, (String) null, z3);
                C15043f.this.f38571w.add(bicycleStop2.f23640f);
                C15043f.this.f38572x.add(bicycleStationMetadata);
                C15043f.this.f38573y.add(new MarkerZoomStyle(resourceImage2));
            }
        }

        /* renamed from: p */
        public final Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            C15043f.this.f38563o.add(docklessScooterLeg.f42066f);
            C15043f fVar = C15043f.this;
            fVar.f38564p.add(C16281i.m41511g(fVar.f38549a));
            C15043f.this.f38565q.add(docklessScooterLeg.f42064d.mo24310d());
            C15043f.this.f38566r.add(docklessScooterLeg);
            C15043f.this.f38567s.add(new MarkerZoomStyle(docklessScooterLeg.f42068h.f42077g));
            return null;
        }

        /* renamed from: q */
        public final Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            boolean z;
            TransitStop transitStop = pathwayWalkLeg.f42092d.get();
            ServerId serverId = pathwayWalkLeg.f42093e;
            ServerId serverId2 = pathwayWalkLeg.f42094f;
            for (TransitStopPathway next : transitStop.f23739k) {
                ServerId serverId3 = next.f23748b;
                boolean e = C20975x0.m49118e(serverId, serverId3);
                boolean e2 = C20975x0.m49118e(serverId2, serverId3);
                int i = 1;
                if (e || e2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i2 = next.f23749c;
                    if (!e || !next.mo24419c()) {
                        if (!e2 || !next.mo24420d()) {
                            i = i2;
                        } else {
                            i = 2;
                        }
                    }
                    MarkerZoomStyle j = C16281i.m41514j(i, false);
                    C15043f.this.f38565q.add(next.f23751e);
                    C15043f.this.f38566r.add(new C20944i0(transitStop, serverId3));
                    C15043f.this.f38567s.add(j);
                }
            }
            return null;
        }

        /* renamed from: r */
        public final Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            C15043f.this.f38563o.add(docklessMopedLeg.f42044f);
            C15043f fVar = C15043f.this;
            fVar.f38564p.add(C16281i.m41511g(fVar.f38549a));
            C15043f.this.f38565q.add(docklessMopedLeg.f42042d.mo24310d());
            C15043f.this.f38566r.add(docklessMopedLeg);
            C15043f.this.f38567s.add(new MarkerZoomStyle(docklessMopedLeg.f42046h.f42055g));
            return null;
        }

        /* renamed from: s */
        public final Void mo45319s(TransitLineLeg transitLineLeg) {
            Color a = C7843b.m17874a(C15043f.this.f38549a, transitLineLeg.f42110d.get().mo24369b());
            Color b = C7843b.m17875b(C15043f.this.f38549a, a);
            LineStyle o = C16281i.m41519o(C15043f.this.f38549a, a);
            Polyline polyline = transitLineLeg.f42112f;
            C15043f.this.f38563o.add(polyline);
            C15043f.this.f38564p.add(o);
            List<T> entities = DbEntityRef.getEntities(transitLineLeg.f42111e);
            SparseArray sparseArray = new SparseArray(2);
            sparseArray.append(0, (Object) null);
            sparseArray.append(1400, C16281i.m41516l(a, b, (Float) null));
            for (int i = 1; i < entities.size() - 1; i++) {
                TransitStop transitStop = (TransitStop) entities.get(i);
                C15043f.this.f38568t.add(transitStop.f23732d);
                C15043f.this.f38569u.add(transitStop);
                C15043f.this.f38574z.add(sparseArray);
            }
            if (!C15043f.this.f38565q.contains(polyline.mo24347y(0))) {
                SparseArray<MarkerZoomStyle> c = MarkerZoomStyle.m41440c(((TransitStop) entities.get(0)).f23738j);
                C16281i.m41507c(c);
                C15043f.this.f38568t.add(polyline.mo24347y(0));
                C15043f.this.f38569u.add((Object) null);
                C15043f.this.f38574z.add(c);
            }
            if (!C15043f.this.f38565q.contains(polyline.mo24347y(polyline.mo24338U0() - 1))) {
                SparseArray<MarkerZoomStyle> c2 = MarkerZoomStyle.m41440c(((TransitStop) entities.get(entities.size() - 1)).f23738j);
                C16281i.m41507c(c2);
                C15043f.this.f38568t.add(polyline.mo24347y(polyline.mo24338U0() - 1));
                C15043f.this.f38569u.add((Object) null);
                C15043f.this.f38574z.add(c2);
            }
            return null;
        }
    }

    /* renamed from: com.moovit.app.itinerary.f$f */
    public class C15049f extends C15047d {
        public C15049f() {
            super();
        }

        /* renamed from: e */
        public final /* bridge */ /* synthetic */ Object mo39913e(WalkLeg walkLeg) {
            mo45317s(walkLeg);
            return null;
        }

        /* renamed from: s */
        public final Void mo45317s(WalkLeg walkLeg) {
            C15043f.this.f38550b.mo48641l3(MapFragment.MapFollowMode.BOTH, false);
            return null;
        }
    }

    /* renamed from: com.moovit.app.itinerary.f$g */
    public class C15050g implements MapFragment.C16237r {

        /* renamed from: a */
        public final Itinerary f38586a;

        /* renamed from: b */
        public final C16769e.C16772c f38587b;

        public C15050g(Itinerary itinerary, C16769e.C16772c cVar) {
            C21100e.m49373x(itinerary, "itinerary");
            this.f38586a = itinerary;
            this.f38587b = cVar;
        }

        /* renamed from: a */
        public final void mo21406a() {
            C15043f.this.mo45314e(this.f38586a, this.f38587b);
        }
    }

    public C15043f(Context context, MapFragment mapFragment) {
        C15041e eVar = new C15041e();
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f38549a = context;
        C21100e.m49373x(mapFragment, "mapFragment");
        this.f38550b = mapFragment;
        this.f38570v = mapFragment.mo48614K2(1);
        this.f38551c = new C15048e();
        this.f38552d = new C15047d();
        this.f38553e = new C15049f();
        MarkerZoomStyle markerZoomStyle = new MarkerZoomStyle(new ResourceImage(C19739q.ic_trip_start_16_on_surface_emphasis_high, new String[0]));
        this.f38554f = markerZoomStyle;
        MarkerZoomStyle h = C16281i.m41512h();
        this.f38555g = h;
        MarkerZoomStyle markerZoomStyle2 = new MarkerZoomStyle(new ResourceImage(C19739q.ic_map_taxi_32, new String[0]));
        this.f38556h = markerZoomStyle2;
        MarkerZoomStyle n = C16281i.m41518n(context, context.getString(R.string.carpool_pickup_label));
        this.f38558j = n;
        MarkerZoomStyle n2 = C16281i.m41518n(context, context.getString(R.string.carpool_dropoff_label));
        this.f38559k = n2;
        this.f38560l = C16281i.m41515k(context, markerZoomStyle, h, markerZoomStyle2, n, n2);
        this.f38561m = null;
        this.f38563o = new ArrayList();
        this.f38564p = new ArrayList();
        this.f38565q = new ArrayList();
        this.f38566r = new ArrayList();
        this.f38567s = new ArrayList();
        this.f38568t = new ArrayList();
        this.f38569u = new ArrayList();
        this.f38574z = new ArrayList();
        this.f38571w = new ArrayList();
        this.f38572x = new ArrayList();
        this.f38573y = new ArrayList();
        C16281i.C16282a aVar = new C16281i.C16282a(context);
        mapFragment.f42341D0 = aVar;
        C16285j jVar = mapFragment.f42368n;
        if (jVar != null) {
            jVar.mo48813u(aVar);
        }
        mapFragment.mo48658u2(eVar);
    }

    /* renamed from: a */
    public static void m38076a(C15043f fVar, BoxE6 boxE6) {
        fVar.f38550b.mo48606B2(fVar.f38560l, boxE6, false);
    }

    /* renamed from: b */
    public final void mo45311b(Itinerary itinerary) {
        boolean z;
        if (!this.f38550b.mo48624U2()) {
            this.f38550b.mo48656t2(new C15044a(itinerary));
            return;
        }
        if (((Polylon) itinerary.mo48296w1()).mo24338U0() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Rect rect = new Rect(this.f38560l);
            int g = UiUtils.m40248g(this.f38549a, 11.0f);
            rect.bottom += g;
            rect.top += g;
            rect.left += g;
            rect.right += g;
            this.f38550b.mo48605A2(rect, ((Polylon) itinerary.mo48296w1()).f40990c, true);
        }
    }

    /* renamed from: c */
    public final void mo45312c(Leg leg, boolean z) {
        Leg.C16144a aVar;
        if (!this.f38550b.mo48624U2()) {
            this.f38550b.mo48656t2(new C15045b(leg, z));
            return;
        }
        if (z) {
            aVar = this.f38553e;
        } else {
            aVar = this.f38552d;
        }
        leg.mo48338i0(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0052, code lost:
        if (com.moovit.commons.geo.LatLonE6.m40174c(r0, r7) < 100.0f) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c5 A[LOOP:0: B:24:0x00bf->B:26:0x00c5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e6 A[LOOP:1: B:28:0x00e4->B:29:0x00e6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0107 A[LOOP:2: B:31:0x0105->B:32:0x0107, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x012e A[LOOP:3: B:34:0x012c->B:35:0x012e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015b A[LOOP:4: B:37:0x0159->B:38:0x015b, LOOP_END] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45313d(com.moovit.itinerary.model.Itinerary r6, e20.C16769e.C16772c r7) {
        /*
            r5 = this;
            com.moovit.map.MapFragment r0 = r5.f38550b
            boolean r0 = r0.mo48624U2()
            if (r0 != 0) goto L_0x0013
            com.moovit.map.MapFragment r0 = r5.f38550b
            com.moovit.app.itinerary.f$c r1 = new com.moovit.app.itinerary.f$c
            r1.<init>(r6, r7)
            r0.mo48656t2(r1)
            return
        L_0x0013:
            java.lang.String r0 = "itinerary"
            ce0.C21100e.m49373x(r6, r0)
            r5.f38561m = r6
            r5.f38562n = r7
            com.moovit.itinerary.model.leg.Leg r7 = r6.mo48289b()
            com.moovit.commons.geo.Polyline r0 = r7.mo48340w1()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0029
            goto L_0x0054
        L_0x0029:
            com.moovit.transit.LocationDescriptor$LocationType r0 = com.moovit.transit.LocationDescriptor.LocationType.BICYCLE_STOP
            lu.b r3 = e20.C16783l.f43688a
            com.moovit.transit.LocationDescriptor r3 = r7.mo48334e2()
            boolean r0 = r3.mo24316j(r0)
            if (r0 == 0) goto L_0x0056
            com.moovit.transit.LocationDescriptor r0 = r7.mo48332W()
            com.moovit.commons.geo.LatLonE6 r0 = r0.mo24310d()
            com.moovit.transit.LocationDescriptor r7 = r7.mo48334e2()
            com.moovit.commons.geo.LatLonE6 r7 = r7.mo24310d()
            r0.getClass()
            float r7 = com.moovit.commons.geo.LatLonE6.m40174c(r0, r7)
            r0 = 1120403456(0x42c80000, float:100.0)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0056
        L_0x0054:
            r7 = 0
            goto L_0x0057
        L_0x0056:
            r7 = 1
        L_0x0057:
            r0 = 0
            if (r7 == 0) goto L_0x0077
            java.util.ArrayList r7 = r5.f38565q
            com.moovit.itinerary.model.leg.Leg r3 = r6.mo48289b()
            com.moovit.commons.geo.Polyline r3 = r3.mo48340w1()
            com.moovit.commons.geo.LatLonE6 r3 = r3.mo24347y(r1)
            r7.add(r3)
            java.util.ArrayList r7 = r5.f38566r
            r7.add(r0)
            java.util.ArrayList r7 = r5.f38567s
            com.moovit.map.MarkerZoomStyle r3 = r5.f38554f
            r7.add(r3)
        L_0x0077:
            com.moovit.itinerary.model.leg.Leg r7 = r6.mo48290c()
            com.moovit.commons.geo.Polyline r3 = r7.mo48340w1()
            if (r3 != 0) goto L_0x0082
            goto L_0x0090
        L_0x0082:
            com.moovit.transit.LocationDescriptor$LocationType r3 = com.moovit.transit.LocationDescriptor.LocationType.BICYCLE_STOP
            lu.b r4 = e20.C16783l.f43688a
            com.moovit.transit.LocationDescriptor r7 = r7.mo48334e2()
            boolean r7 = r7.mo24316j(r3)
            if (r7 == 0) goto L_0x0092
        L_0x0090:
            r7 = 0
            goto L_0x0093
        L_0x0092:
            r7 = 1
        L_0x0093:
            if (r7 == 0) goto L_0x00b7
            com.moovit.itinerary.model.leg.Leg r7 = r6.mo48290c()
            com.moovit.commons.geo.Polyline r7 = r7.mo48340w1()
            java.util.ArrayList r3 = r5.f38565q
            int r4 = r7.mo24338U0()
            int r4 = r4 - r2
            com.moovit.commons.geo.LatLonE6 r7 = r7.mo24347y(r4)
            r3.add(r7)
            java.util.ArrayList r7 = r5.f38566r
            r7.add(r0)
            java.util.ArrayList r7 = r5.f38567s
            com.moovit.map.MarkerZoomStyle r0 = r5.f38555g
            r7.add(r0)
        L_0x00b7:
            java.util.List r6 = r6.mo48295u0()
            java.util.Iterator r6 = r6.iterator()
        L_0x00bf:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00d1
            java.lang.Object r7 = r6.next()
            com.moovit.itinerary.model.leg.Leg r7 = (com.moovit.itinerary.model.leg.Leg) r7
            com.moovit.app.itinerary.f$e r0 = r5.f38551c
            r7.mo48338i0(r0)
            goto L_0x00bf
        L_0x00d1:
            com.moovit.map.MapFragment r6 = r5.f38550b
            r6.mo48609E2()
            com.moovit.map.MapFragment r6 = r5.f38550b
            o20.q r7 = r5.f38570v
            r6.mo48611G2(r7)
            java.util.ArrayList r6 = r5.f38563o
            int r6 = r6.size()
            r7 = 0
        L_0x00e4:
            if (r7 >= r6) goto L_0x00fe
            com.moovit.map.MapFragment r0 = r5.f38550b
            java.util.ArrayList r2 = r5.f38563o
            java.lang.Object r2 = r2.get(r7)
            com.moovit.commons.geo.Polyline r2 = (com.moovit.commons.geo.Polyline) r2
            java.util.ArrayList r3 = r5.f38564p
            java.lang.Object r3 = r3.get(r7)
            com.moovit.map.LineStyle r3 = (com.moovit.map.LineStyle) r3
            r0.mo48662w2(r2, r3)
            int r7 = r7 + 1
            goto L_0x00e4
        L_0x00fe:
            java.util.ArrayList r6 = r5.f38567s
            int r6 = r6.size()
            r7 = 0
        L_0x0105:
            if (r7 >= r6) goto L_0x0125
            com.moovit.map.MapFragment r0 = r5.f38550b
            java.util.ArrayList r2 = r5.f38565q
            java.lang.Object r2 = r2.get(r7)
            qz.b r2 = (p762qz.C19206b) r2
            java.util.ArrayList r3 = r5.f38566r
            java.lang.Object r3 = r3.get(r7)
            java.util.ArrayList r4 = r5.f38567s
            java.lang.Object r4 = r4.get(r7)
            com.moovit.map.MarkerZoomStyle r4 = (com.moovit.map.MarkerZoomStyle) r4
            r0.mo48646o2(r2, r3, r4)
            int r7 = r7 + 1
            goto L_0x0105
        L_0x0125:
            java.util.ArrayList r6 = r5.f38574z
            int r6 = r6.size()
            r7 = 0
        L_0x012c:
            if (r7 >= r6) goto L_0x0153
            com.moovit.map.MapFragment r0 = r5.f38550b
            java.util.ArrayList r2 = r5.f38568t
            java.lang.Object r2 = r2.get(r7)
            qz.b r2 = (p762qz.C19206b) r2
            java.util.ArrayList r3 = r5.f38569u
            java.lang.Object r3 = r3.get(r7)
            java.util.ArrayList r4 = r5.f38574z
            java.lang.Object r4 = r4.get(r7)
            android.util.SparseArray r4 = (android.util.SparseArray) r4
            r0.getClass()
            o20.e r4 = o20.C18699e.m45697a(r4)
            r0.mo48648p2(r2, r3, r4)
            int r7 = r7 + 1
            goto L_0x012c
        L_0x0153:
            java.util.ArrayList r6 = r5.f38573y
            int r6 = r6.size()
        L_0x0159:
            if (r1 >= r6) goto L_0x0180
            com.moovit.map.MapFragment r7 = r5.f38550b
            java.util.ArrayList r0 = r5.f38571w
            java.lang.Object r0 = r0.get(r1)
            qz.b r0 = (p762qz.C19206b) r0
            java.util.ArrayList r2 = r5.f38572x
            java.lang.Object r2 = r2.get(r1)
            o20.e r3 = new o20.e
            java.util.ArrayList r4 = r5.f38573y
            java.lang.Object r4 = r4.get(r1)
            com.moovit.map.MarkerZoomStyle r4 = (com.moovit.map.MarkerZoomStyle) r4
            r3.<init>(r4)
            o20.q r4 = r5.f38570v
            r7.mo48650q2(r0, r2, r3, r4)
            int r1 = r1 + 1
            goto L_0x0159
        L_0x0180:
            r5.mo45315f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.itinerary.C15043f.mo45313d(com.moovit.itinerary.model.Itinerary, e20.e$c):void");
    }

    /* renamed from: e */
    public final void mo45314e(Itinerary itinerary, C16769e.C16772c cVar) {
        if (!this.f38550b.mo48624U2()) {
            this.f38550b.mo48656t2(new C15050g(itinerary, cVar));
            return;
        }
        C21100e.m49373x(itinerary, "itinerary");
        this.f38561m = itinerary;
        this.f38562n = cVar;
        for (Leg i0 : itinerary.mo48295u0()) {
            i0.mo48338i0(this.f38551c);
        }
        this.f38550b.mo48611G2(this.f38570v);
        int size = this.f38573y.size();
        for (int i = 0; i < size; i++) {
            this.f38550b.mo48650q2((C19206b) this.f38571w.get(i), this.f38572x.get(i), new C18699e((MarkerZoomStyle) this.f38573y.get(i)), this.f38570v);
        }
        mo45315f();
    }

    /* renamed from: f */
    public final void mo45315f() {
        this.f38561m = null;
        this.f38562n = null;
        this.f38563o.clear();
        this.f38564p.clear();
        this.f38565q.clear();
        this.f38566r.clear();
        this.f38567s.clear();
        this.f38568t.clear();
        this.f38569u.clear();
        this.f38574z.clear();
        this.f38571w.clear();
        this.f38572x.clear();
        this.f38573y.clear();
    }
}
