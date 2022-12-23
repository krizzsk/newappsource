package p927xw;

import a10.C13386a;
import aa0.C7530f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.Location;
import android.os.Parcelable;
import android.util.SparseArray;
import c70.C13756i;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.facebook.internal.C2435w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.tod.model.TodJourneyStatus;
import com.moovit.app.tod.model.TodRideJourney;
import com.moovit.app.tod.model.TodRideStatus;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.Geofence;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.C16025f;
import com.moovit.image.model.Image;
import com.moovit.map.C16281i;
import com.moovit.map.C16286k;
import com.moovit.map.LineStyle;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import k00.C17988b;
import p001a0.C0016g;
import p502fx.C17124i;
import p526gx.C17248a;
import p526gx.C17251d;
import p526gx.C17252e;
import p526gx.C17253f;
import p665mv.C18465a;
import p693nz.C18659h;
import p762qz.C19207c;
import p977zz.C20938f0;
import v10.C20065a;
import w20.C20275b;

/* renamed from: xw.f */
public final class C20637f {

    /* renamed from: u */
    public static final C18659h<String, Polyline> f52176u = new C18659h<>(15);

    /* renamed from: a */
    public final C19207c.C19208a f52177a = new C19207c.C19208a();

    /* renamed from: b */
    public final Context f52178b;

    /* renamed from: c */
    public final MapFragment f52179c;

    /* renamed from: d */
    public final MarkerZoomStyle f52180d;

    /* renamed from: e */
    public final MarkerZoomStyle f52181e;

    /* renamed from: f */
    public MarkerZoomStyle f52182f;

    /* renamed from: g */
    public MarkerZoomStyle f52183g;

    /* renamed from: h */
    public final MarkerZoomStyle f52184h;

    /* renamed from: i */
    public final LineStyle f52185i;

    /* renamed from: j */
    public final LineStyle f52186j;

    /* renamed from: k */
    public final LineStyle f52187k;

    /* renamed from: l */
    public final C16286k f52188l;

    /* renamed from: m */
    public final C16286k f52189m;

    /* renamed from: n */
    public final SparseArray<Object> f52190n = new SparseArray<>();

    /* renamed from: o */
    public final SparseArray<Object> f52191o = new SparseArray<>();

    /* renamed from: p */
    public final HashMap f52192p = new HashMap();

    /* renamed from: q */
    public final SparseArray<List<Object>> f52193q = new SparseArray<>();

    /* renamed from: r */
    public final Object[] f52194r = new Object[3];

    /* renamed from: s */
    public Rect f52195s = null;

    /* renamed from: t */
    public final C20938f0<String, Integer> f52196t = new C20938f0<>();

    /* renamed from: xw.f$a */
    public class C20638a extends C16025f<C20065a> {

        /* renamed from: i */
        public final /* synthetic */ BoxE6 f52197i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20638a(Context context, ArrayList arrayList, BoxE6 boxE6) {
            super(context, arrayList);
            this.f52197i = boxE6;
        }

        /* renamed from: f */
        public final void mo48195f(HashMap hashMap, boolean z) {
            Rect d = C16281i.m41508d(hashMap.values());
            int g = UiUtils.m40248g(C20637f.this.f52178b, 16.0f);
            d.left += g;
            d.top += g;
            d.right += g;
            d.bottom += g;
            C20637f fVar = C20637f.this;
            fVar.f52195s = d;
            fVar.mo52816a(this.f52197i);
        }
    }

    public C20637f(Context context, MapFragment mapFragment) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f52178b = context;
        C21100e.m49373x(mapFragment, "mapFragment");
        this.f52179c = mapFragment;
        Color d = Color.m40220d(R.attr.colorPrimary, context);
        this.f52180d = C16281i.m41506b(R.drawable.wdg_tod_img_pickup_location_24);
        this.f52181e = C16281i.m41506b(R.drawable.wdg_tod_img_destination_36);
        this.f52184h = C16281i.m41516l(d, Color.m40220d(R.attr.colorOnPrimary, context), Float.valueOf(2.0f));
        this.f52185i = C16281i.m41521q(context);
        this.f52186j = C16281i.m41519o(context, d);
        this.f52187k = C16281i.m41519o(context, Color.m40220d(R.attr.colorSurfaceInverse, context));
        Color color = new Color(855638271);
        Color color2 = Color.f41004h;
        LineStyle.LineJoin lineJoin = LineStyle.LineJoin.NONE;
        C21100e.m49357p(6.0f, "strokeWidth");
        this.f52188l = new C16286k(color2, new LineStyle(color, 6.0f, lineJoin, (Bitmap) null, (Bitmap) null, BitmapDescriptorFactory.HUE_RED));
        Color color3 = new Color(872349696);
        C21100e.m49357p(6.0f, "strokeWidth");
        this.f52189m = new C16286k(color3, new LineStyle(color3, 6.0f, lineJoin, (Bitmap) null, (Bitmap) null, BitmapDescriptorFactory.HUE_RED));
    }

    /* renamed from: d */
    public static String m48511d(String str, LatLonE6 latLonE6, LatLonE6 latLonE62) {
        StringBuilder t = C0016g.m36t(str, ":");
        t.append(latLonE6.f40980b);
        t.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        t.append(latLonE6.f40981c);
        t.append(":");
        t.append(latLonE62.f40980b);
        t.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        t.append(latLonE62.f40981c);
        return t.toString();
    }

    /* renamed from: a */
    public final void mo52816a(BoxE6 boxE6) {
        if (!this.f52179c.mo48624U2()) {
            this.f52179c.mo48656t2(new C18465a(this, boxE6, 1));
            return;
        }
        Rect rect = this.f52195s;
        if (rect != null) {
            this.f52179c.mo48605A2(rect, boxE6, true);
            return;
        }
        Context context = this.f52178b;
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f52180d);
        arrayList.add(this.f52181e);
        arrayList.add(this.f52184h);
        MarkerZoomStyle markerZoomStyle = (MarkerZoomStyle) this.f52194r[1];
        if (markerZoomStyle != null) {
            arrayList.add(markerZoomStyle);
        }
        MarkerZoomStyle markerZoomStyle2 = this.f52182f;
        if (markerZoomStyle2 != null) {
            arrayList.add(markerZoomStyle2);
        }
        MarkerZoomStyle markerZoomStyle3 = this.f52183g;
        if (markerZoomStyle3 != null) {
            arrayList.add(markerZoomStyle3);
        }
        new C20638a(context, arrayList, boxE6).mo48196g();
    }

    /* renamed from: b */
    public final void mo52817b(Image image, TodRideJourney todRideJourney, TodRideStatus todRideStatus, C17253f fVar) {
        Polyline polyline;
        if (!this.f52179c.mo48624U2()) {
            this.f52179c.mo48656t2(new C20635d(this, image, todRideJourney, todRideStatus, fVar));
            return;
        }
        MarkerZoomStyle markerZoomStyle = null;
        if (fVar != null) {
            F f = this.f52196t.f52685a;
            F f2 = fVar.f44590a.f44586a;
            if (!f2.equals(f)) {
                this.f52196t.f52685a = f2;
                mo52818c();
                LocationDescriptor locationDescriptor = todRideJourney.f40284b;
                LocationDescriptor locationDescriptor2 = todRideJourney.f40285c;
                C21100e.m49373x(locationDescriptor2, "pickup");
                LocationDescriptor locationDescriptor3 = todRideJourney.f40286d;
                C21100e.m49373x(locationDescriptor3, "dropOff");
                LocationDescriptor locationDescriptor4 = todRideJourney.f40287e;
                TodJourneyStatus todJourneyStatus = fVar.f44593d.f44315c;
                boolean isPickedUp = todJourneyStatus.isPickedUp();
                boolean equals = todJourneyStatus.equals(TodJourneyStatus.ARRIVED_DROP_OFF);
                if (isPickedUp || equals) {
                    this.f52182f = null;
                    this.f52183g = C16281i.m41506b(R.drawable.wdg_tod_img_drop_off_24);
                    this.f52179c.mo48646o2(locationDescriptor3.mo24310d(), locationDescriptor3, this.f52183g);
                    mo52820f(locationDescriptor3.mo24310d(), locationDescriptor4.mo24310d());
                    this.f52179c.mo48646o2(locationDescriptor4.mo24310d(), locationDescriptor4, this.f52181e);
                } else {
                    this.f52182f = C16281i.m41506b(R.drawable.wdg_tod_img_pickup_location_24);
                    this.f52179c.mo48646o2(locationDescriptor2.mo24310d(), locationDescriptor2, this.f52182f);
                    mo52820f(locationDescriptor.mo24310d(), locationDescriptor2.mo24310d());
                    this.f52183g = C16281i.m41506b(R.drawable.wdg_tod_img_drop_off_24);
                    this.f52179c.mo48646o2(locationDescriptor3.mo24310d(), locationDescriptor3, this.f52183g);
                    mo52819e(locationDescriptor2.mo24310d(), locationDescriptor3.mo24310d());
                }
            }
            Integer num = (Integer) this.f52196t.f52686b;
            if (num == null || num.intValue() != fVar.f44592c) {
                C17248a aVar = fVar.f44590a.f44589d.get(fVar.f44592c);
                List<C17251d> list = fVar.f44590a.f44587b;
                int i = aVar.f44576b;
                C17251d dVar = list.get(i);
                Object obj = this.f52191o.get(dVar.f44582a);
                int i2 = aVar.f44577c;
                if (i2 == 0) {
                    polyline = dVar.f44585d;
                } else {
                    Polyline polyline2 = dVar.f44585d;
                    Parcelable.Creator<Polylon> creator = Polylon.CREATOR;
                    polyline = new Polylon(polyline2.getPoints().subList(i2, polyline2.mo24338U0()), -1.0f, false);
                }
                this.f52191o.put(dVar.f44582a, this.f52179c.mo48662w2(polyline, this.f52186j));
                if (obj != null) {
                    this.f52179c.mo48639j3(obj);
                }
                C17124i iVar = dVar.f44583b;
                if (iVar != null) {
                    if (aVar.f44577c > 0) {
                        mo52822h(iVar);
                    } else {
                        mo52821g(iVar);
                    }
                }
                C17124i iVar2 = dVar.f44584c;
                if (iVar2 != null) {
                    mo52821g(iVar2);
                }
                while (true) {
                    i++;
                    if (i >= list.size()) {
                        break;
                    }
                    C17251d dVar2 = list.get(i);
                    if (this.f52191o.get(dVar2.f44582a) == null) {
                        this.f52191o.put(dVar2.f44582a, this.f52179c.mo48662w2(dVar2.f44585d, this.f52186j));
                    }
                    C17124i iVar3 = dVar2.f44583b;
                    if (iVar3 != null) {
                        mo52821g(iVar3);
                    }
                    C17124i iVar4 = dVar2.f44584c;
                    if (iVar4 != null) {
                        mo52821g(iVar4);
                    }
                }
                LatLonE6 latLonE6 = fVar.f44590a.f44589d.get(fVar.f44592c).f44575a.f40974b;
                Object obj2 = this.f52194r[0];
                if (obj2 == null) {
                    if (image != null) {
                        markerZoomStyle = new MarkerZoomStyle(image);
                    }
                    Object o2 = this.f52179c.mo48646o2(latLonE6, latLonE6, markerZoomStyle);
                    Object[] objArr = this.f52194r;
                    objArr[0] = o2;
                    objArr[1] = markerZoomStyle;
                } else {
                    MapFragment mapFragment = this.f52179c;
                    MapFragment.m41340y2(mapFragment.f42368n.mo48783F(), obj2, latLonE6, this.f52177a);
                }
                Context context = this.f52179c.getContext();
                if (context != null) {
                    context.getApplicationContext();
                    if (((Boolean) C13386a.f33224d.f43936b).booleanValue()) {
                        C17252e eVar = fVar.f44590a;
                        C17248a aVar2 = eVar.f44589d.get(fVar.f44592c);
                        int i3 = aVar2.f44576b;
                        C17251d dVar3 = eVar.f44587b.get(i3);
                        if (this.f52193q.get(i3) == null) {
                            List<C17248a> list2 = eVar.f44589d;
                            ArrayList arrayList = new ArrayList(dVar3.f44585d.mo24338U0());
                            for (int i4 = 0; i4 < list2.size(); i4++) {
                                C17248a aVar3 = list2.get(i4);
                                int i5 = aVar3.f44576b;
                                int i6 = aVar2.f44576b;
                                if (i5 >= i6) {
                                    if (i5 > i6) {
                                        break;
                                    }
                                    arrayList.add(this.f52179c.mo48660v2(C7530f.m17269b(aVar3.f44575a, 60), this.f52188l));
                                }
                            }
                            this.f52193q.put(i3, arrayList);
                        }
                        Location location = fVar.f44593d.f44316d;
                        Polylon b = C7530f.m17269b(new Geofence(LatLonE6.m40177j(location), location.getAccuracy()), 60);
                        Object[] objArr2 = this.f52194r;
                        Object obj3 = objArr2[2];
                        objArr2[2] = this.f52179c.mo48660v2(b, this.f52189m);
                        if (obj3 != null) {
                            this.f52179c.mo48638i3(obj3);
                        }
                    }
                }
                C17252e eVar2 = fVar.f44590a;
                int i7 = eVar2.f44589d.get(fVar.f44592c).f44576b;
                for (int i8 = 0; i8 < i7; i8++) {
                    C17251d dVar4 = eVar2.f44587b.get(i8);
                    int i9 = dVar4.f44582a;
                    Object obj4 = this.f52191o.get(i9);
                    if (obj4 != null) {
                        this.f52179c.mo48639j3(obj4);
                        this.f52191o.remove(i9);
                    }
                    C17124i iVar5 = dVar4.f44583b;
                    if (iVar5 != null) {
                        mo52822h(iVar5);
                    }
                    C17124i iVar6 = dVar4.f44584c;
                    if (iVar6 != null) {
                        mo52822h(iVar6);
                    }
                    List<Object> list3 = this.f52193q.get(i9);
                    if (list3 != null) {
                        for (Object i32 : list3) {
                            this.f52179c.mo48638i3(i32);
                        }
                        this.f52193q.remove(i9);
                    }
                }
                this.f52196t.f52686b = Integer.valueOf(fVar.f44592c);
                return;
            }
            return;
        }
        LocationDescriptor locationDescriptor5 = todRideJourney.f40284b;
        LocationDescriptor locationDescriptor6 = todRideJourney.f40285c;
        LocationDescriptor locationDescriptor7 = todRideJourney.f40286d;
        LocationDescriptor locationDescriptor8 = todRideJourney.f40287e;
        if (locationDescriptor6 == null || locationDescriptor7 == null) {
            mo52818c();
            this.f52182f = null;
            this.f52183g = null;
            this.f52179c.mo48646o2(locationDescriptor5.mo24310d(), locationDescriptor5, this.f52180d);
            this.f52179c.mo48646o2(locationDescriptor8.mo24310d(), locationDescriptor8, this.f52181e);
            mo52819e(locationDescriptor5.mo24310d(), locationDescriptor8.mo24310d());
        } else if (TodRideStatus.COMPLETED.equals(todRideStatus)) {
            mo52818c();
            Context context2 = this.f52178b;
            this.f52183g = C16281i.m41513i(context2, R.drawable.wdg_tod_img_drop_off_24, C17988b.m44611b(R.drawable.wdg_tod_img_drop_off_24, context2), locationDescriptor7.mo24313f());
            this.f52179c.mo48646o2(locationDescriptor7.mo24310d(), locationDescriptor7, this.f52183g);
            this.f52179c.mo48646o2(locationDescriptor8.mo24310d(), locationDescriptor8, this.f52181e);
            mo52820f(locationDescriptor7.mo24310d(), locationDescriptor8.mo24310d());
        } else {
            mo52818c();
            Context context3 = this.f52178b;
            this.f52182f = C16281i.m41513i(context3, R.drawable.wdg_tod_img_pickup_location_24, C17988b.m44611b(R.drawable.wdg_tod_img_pickup_location_24, context3), locationDescriptor6.mo24313f());
            this.f52179c.mo48646o2(locationDescriptor6.mo24310d(), locationDescriptor6, this.f52182f);
            Context context4 = this.f52178b;
            this.f52183g = C16281i.m41513i(context4, R.drawable.wdg_tod_img_drop_off_24, C17988b.m44611b(R.drawable.wdg_tod_img_drop_off_24, context4), locationDescriptor7.mo24313f());
            this.f52179c.mo48646o2(locationDescriptor7.mo24310d(), locationDescriptor7, this.f52183g);
            this.f52179c.mo48646o2(locationDescriptor8.mo24310d(), locationDescriptor8, this.f52181e);
            mo52820f(locationDescriptor5.mo24310d(), locationDescriptor6.mo24310d());
            mo52819e(locationDescriptor6.mo24310d(), locationDescriptor7.mo24310d());
            mo52820f(locationDescriptor7.mo24310d(), locationDescriptor8.mo24310d());
        }
    }

    /* renamed from: c */
    public final void mo52818c() {
        this.f52179c.mo48609E2();
        this.f52190n.clear();
        this.f52191o.clear();
        this.f52193q.clear();
        this.f52192p.clear();
        Arrays.fill(this.f52194r, (Object) null);
        this.f52196t.f52686b = null;
    }

    /* renamed from: e */
    public final void mo52819e(LatLonE6 latLonE6, LatLonE6 latLonE62) {
        String d = m48511d("ride", latLonE6, latLonE62);
        Polyline polyline = f52176u.get(d);
        if (polyline != null) {
            this.f52179c.mo48662w2(polyline, this.f52187k);
        } else {
            Tasks.call(MoovitExecutors.COMPUTATION, new C2435w(1, latLonE6, latLonE62)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C20636e(this, d, latLonE6, latLonE62));
        }
    }

    /* renamed from: f */
    public final void mo52820f(LatLonE6 latLonE6, LatLonE6 latLonE62) {
        String d = m48511d("walking", latLonE6, latLonE62);
        Polyline polyline = f52176u.get(d);
        if (polyline != null) {
            this.f52179c.mo48662w2(polyline, this.f52185i);
            return;
        }
        C13756i a = C13756i.m34349a(this.f52178b.getApplicationContext());
        C20275b bVar = new C20275b(a.mo40679b(), latLonE6.mo46929u((Location) null), latLonE62.mo46929u((Location) null));
        RequestOptions c = a.mo40680c();
        c.f42909f = true;
        a.mo40684g(bVar.f51409w, bVar, c, new C20639g(this, d, latLonE6, latLonE62));
    }

    /* renamed from: g */
    public final void mo52821g(C17124i iVar) {
        ServerId serverId = iVar.f44328c;
        if (this.f52192p.get(serverId) == null) {
            this.f52192p.put(serverId, this.f52179c.mo48646o2(iVar, iVar, this.f52184h));
        }
    }

    /* renamed from: h */
    public final void mo52822h(C17124i iVar) {
        Object remove = this.f52192p.remove(iVar.f44328c);
        if (remove != null) {
            this.f52179c.mo48636g3(remove);
        }
    }
}
