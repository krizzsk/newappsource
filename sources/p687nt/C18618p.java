package p687nt;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.C1208m;
import b00.C13557b;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13752e;
import c70.C13753f;
import c70.C13756i;
import c70.C13776p;
import ce0.C21100e;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.useraccount.manager.favorites.StopFavorite;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polygon;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.database.DbEntityRef;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImageSet;
import com.moovit.map.C16285j;
import com.moovit.map.MapFragment;
import com.moovit.map.MapFragmentView;
import com.moovit.map.items.C16283a;
import com.moovit.map.items.C16284b;
import com.moovit.map.items.MapItem;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.tracing.TraceEvent;
import com.moovit.transit.C7843b;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import com.moovit.util.time.StopRealTimeInformation;
import com.tranzmate.R;
import g30.C4776h;
import i30.C5265a;
import i30.C5267c;
import i30.C5268d;
import i30.C5269e;
import j40.C5384a;
import j80.C12775d;
import j80.C12778f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p241s0.C6302b;
import p241s0.C6307g;
import p241s0.C6313h;
import p314xa.C7191i;
import p358af.C13437d;
import p435de.C16596f;
import p455dy.C16753e;
import p687nt.C18591c;
import p762qz.C19206b;
import p824tp.C19728f;
import p874vr.C20199a;
import p875vs.C20228e;
import p906wz.C20436g;
import p952yy.C20786b;
import p952yy.C20787c;
import p952yy.C20792f;
import p952yy.C20793g;
import p977zz.C20944i0;
import p977zz.C20975x0;
import q00.C19047a;
import q00.C19053d;
import t90.C13121b;

/* renamed from: nt.p */
public final class C18618p extends C13557b<Object, Object, C18626h> {

    /* renamed from: s */
    public static final /* synthetic */ int f47429s = 0;

    /* renamed from: b */
    public final C18619a f47430b = new C18619a();

    /* renamed from: c */
    public final C18620b f47431c = new C18620b();

    /* renamed from: d */
    public final C7191i f47432d = new C7191i(this, 2);

    /* renamed from: e */
    public final C18616n f47433e = new C18616n(this);

    /* renamed from: f */
    public final C6313h<String, Float> f47434f = new C6313h<>(50);

    /* renamed from: g */
    public final C19728f f47435g;

    /* renamed from: h */
    public final C19047a f47436h;

    /* renamed from: i */
    public final C13756i f47437i;

    /* renamed from: j */
    public final MapFragment f47438j;

    /* renamed from: k */
    public final float f47439k;

    /* renamed from: l */
    public final C16753e f47440l;

    /* renamed from: m */
    public final C12778f f47441m;

    /* renamed from: n */
    public final C13121b f47442n;

    /* renamed from: o */
    public C18624f f47443o;

    /* renamed from: p */
    public C18623e f47444p;

    /* renamed from: q */
    public final C18625g f47445q;

    /* renamed from: r */
    public final AtomicReference<C13776p> f47446r;

    /* renamed from: nt.p$a */
    public class C18619a implements C13722f<MapItem> {
        public C18619a() {
        }

        /* renamed from: o */
        public final boolean mo19661o(Object obj) {
            boolean z;
            MapItem mapItem = (MapItem) obj;
            if (mapItem != null) {
                BoxE6 boxE6 = C18618p.this.f47443o.f47458c;
                LatLonE6 latLonE6 = mapItem.f42551d;
                boxE6.getClass();
                int i = latLonE6.f40980b;
                int i2 = latLonE6.f40981c;
                if (i < boxE6.f40964b || i > boxE6.f40965c || i2 < boxE6.f40966d || i2 > boxE6.f40967e) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z || !C18618p.this.f47443o.f47457b.mo46935h(mapItem.f42551d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: nt.p$b */
    public class C18620b implements C13722f<MapItem> {
        public C18620b() {
        }

        /* renamed from: o */
        public final boolean mo19661o(Object obj) {
            boolean z;
            ServerId serverId;
            boolean z2;
            Image image;
            MapItem mapItem = (MapItem) obj;
            if (mapItem != null) {
                C18618p pVar = C18618p.this;
                MapFragment mapFragment = pVar.f47438j;
                int i = (int) (pVar.f47439k * 100.0f);
                if (mapFragment.f42368n.mo48808p().isVisible()) {
                    mapFragment.f42368n.mo48795j();
                    ImageSet imageSet = mapItem.f42552e;
                    int indexOfKey = imageSet.f41813b.indexOfKey(i);
                    if (indexOfKey >= 0) {
                        image = imageSet.f41813b.valueAt(indexOfKey);
                    } else {
                        int i2 = ~indexOfKey;
                        if (i2 > 0) {
                            image = imageSet.f41813b.valueAt(i2 - 1);
                        } else {
                            image = null;
                        }
                    }
                    if (image != null) {
                        z = true;
                        C16753e eVar = C18618p.this.f47440l;
                        serverId = mapItem.f42550c;
                        if (serverId != null || eVar == null || !eVar.mo49442q(serverId)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z || z2) {
                        }
                    }
                }
                z = false;
                C16753e eVar2 = C18618p.this.f47440l;
                serverId = mapItem.f42550c;
                if (serverId != null) {
                }
                z2 = false;
                return !z ? false : false;
            }
            return true;
        }
    }

    /* renamed from: nt.p$c */
    public static class C18621c extends C1208m.C1210b {

        /* renamed from: a */
        public final List<C18591c.C18593b> f47449a;

        /* renamed from: b */
        public final List<C18591c.C18593b> f47450b;

        public C18621c(List<C18591c.C18593b> list, List<C18591c.C18593b> list2) {
            C21100e.m49373x(list, "oldItems");
            this.f47449a = list;
            C21100e.m49373x(list2, "newItems");
            this.f47450b = list2;
        }

        public final boolean areContentsTheSame(int i, int i2) {
            C18591c.C18593b bVar = this.f47449a.get(i);
            C18591c.C18593b bVar2 = this.f47450b.get(i2);
            if (bVar.f47342e != bVar2.f47342e || bVar.f47343f != bVar2.f47343f || !C20975x0.m49118e(bVar.f47341d, bVar2.f47341d) || !C20975x0.m49118e(bVar.f47345h, bVar2.f47345h)) {
                return false;
            }
            return true;
        }

        public final boolean areItemsTheSame(int i, int i2) {
            C18591c.C18593b bVar = this.f47449a.get(i);
            C18591c.C18593b bVar2 = this.f47450b.get(i2);
            if (bVar.f47338a != bVar2.f47338a || !C20975x0.m49118e(bVar.f47339b, bVar2.f47339b) || !C20975x0.m49118e(bVar.f47340c, bVar2.f47340c)) {
                return false;
            }
            return true;
        }

        public final int getNewListSize() {
            return this.f47450b.size();
        }

        public final int getOldListSize() {
            return this.f47449a.size();
        }
    }

    /* renamed from: nt.p$d */
    public static class C18622d implements Comparator<C20787c> {

        /* renamed from: b */
        public final TransitStop f47451b;

        /* renamed from: c */
        public final C16753e f47452c;

        /* renamed from: d */
        public final C20787c.C20788a f47453d = new C20787c.C20788a(Schedule.m17782D());

        public C18622d(C16753e eVar, TransitStop transitStop) {
            this.f47451b = transitStop;
            this.f47452c = eVar;
        }

        /* renamed from: a */
        public final boolean mo51011a(C16753e eVar, C20787c cVar) {
            ServerId serverId = this.f47451b.f23730b;
            ServerId serverId2 = cVar.f52457b;
            if (!serverId.equals(serverId2)) {
                C16596f a = C16596f.m42113a();
                a.mo49363b("lineArrivalsStopId=" + serverId2);
                a.mo49363b("stopId=" + serverId);
                a.mo49364c(new ApplicationBugException("Line arrivals stop ids mismatch"));
                return false;
            }
            ServerId serverId3 = cVar.f52456a;
            DbEntityRef<TransitLine> b = this.f47451b.mo24410b(serverId3);
            if (b == null) {
                C16596f a2 = C16596f.m42113a();
                a2.mo49363b("stopId=" + serverId);
                a2.mo49363b("lineId=" + serverId3);
                a2.mo49364c(new ApplicationBugException("Received line arrival that do not stops at the current stop"));
                return false;
            }
            TransitLine transitLine = b.get();
            if (transitLine != null) {
                return eVar.mo49441p(transitLine.mo24369b().f23694b);
            }
            C16596f a3 = C16596f.m42113a();
            a3.mo49363b("stopId=" + serverId);
            a3.mo49363b("lineId=" + serverId3);
            a3.mo49364c(new ApplicationBugException("Line isn't exists in the database"));
            return false;
        }

        public final int compare(Object obj, Object obj2) {
            C20787c cVar = (C20787c) obj;
            C20787c cVar2 = (C20787c) obj2;
            C16753e eVar = this.f47452c;
            if (eVar != null) {
                boolean a = mo51011a(eVar, cVar);
                boolean a2 = mo51011a(this.f47452c, cVar2);
                if (a && !a2) {
                    return -1;
                }
                if (!a && a2) {
                    return 1;
                }
            }
            return this.f47453d.compare(cVar, cVar2);
        }
    }

    /* renamed from: nt.p$e */
    public static class C18623e {

        /* renamed from: a */
        public final List<C18591c.C18593b> f47454a;

        /* renamed from: b */
        public final List<C18591c.C18593b> f47455b;

        public C18623e(List<C18591c.C18593b> list, List<C18591c.C18593b> list2) {
            C21100e.m49373x(list, "nearbyItems");
            this.f47454a = list;
            C21100e.m49373x(list2, "favoriteItems");
            this.f47455b = list2;
        }
    }

    /* renamed from: nt.p$f */
    public static class C18624f {

        /* renamed from: a */
        public final LatLonE6 f47456a;

        /* renamed from: b */
        public final Polygon f47457b;

        /* renamed from: c */
        public final BoxE6 f47458c;

        /* renamed from: d */
        public final float f47459d;

        /* renamed from: e */
        public final List<TransitStop> f47460e;

        /* renamed from: f */
        public final List<TransitStop> f47461f;

        /* renamed from: g */
        public final Map<ServerId, Integer> f47462g;

        /* renamed from: h */
        public final boolean f47463h;

        public C18624f(LatLonE6 latLonE6, Polygon polygon, float f, List<TransitStop> list, List<TransitStop> list2, Map<ServerId, Integer> map, boolean z) {
            C21100e.m49373x(latLonE6, "mapCenter");
            this.f47456a = latLonE6;
            C21100e.m49373x(polygon, "mapPolygon");
            this.f47457b = polygon;
            this.f47458c = BoxE6.m40166f(polygon.getPoints());
            this.f47459d = f;
            C21100e.m49373x(list, "nearbyStops");
            this.f47460e = list;
            C21100e.m49373x(list2, "favoriteStops");
            this.f47461f = list2;
            C21100e.m49373x(map, "walkingMinutesByStopId");
            this.f47462g = map;
            this.f47463h = z;
        }

        public final String toString() {
            return "NearbyData";
        }
    }

    /* renamed from: nt.p$g */
    public interface C18625g {
        /* renamed from: T */
        void mo50992T(C18626h hVar, boolean z);

        /* renamed from: X0 */
        void mo50994X0(int i);
    }

    /* renamed from: nt.p$h */
    public static class C18626h {

        /* renamed from: a */
        public final boolean f47464a;

        /* renamed from: b */
        public final C18624f f47465b;

        /* renamed from: c */
        public final Map<ServerId, List<C20787c>> f47466c;

        /* renamed from: d */
        public final List<C18591c.C18593b> f47467d;

        /* renamed from: e */
        public final C1208m.C1212d f47468e;

        /* renamed from: f */
        public final List<C18591c.C18593b> f47469f;

        /* renamed from: g */
        public final C1208m.C1212d f47470g;

        public C18626h(boolean z, C18624f fVar, Map<ServerId, List<C20787c>> map, List<C18591c.C18593b> list, C1208m.C1212d dVar, List<C18591c.C18593b> list2, C1208m.C1212d dVar2) {
            this.f47464a = z;
            C21100e.m49373x(fVar, "data");
            this.f47465b = fVar;
            C21100e.m49373x(map, "lineArrivalsByStopId");
            this.f47466c = map;
            this.f47467d = list;
            this.f47468e = dVar;
            this.f47469f = list2;
            this.f47470g = dVar2;
        }

        public final String toString() {
            return "NearbyResult";
        }
    }

    public C18618p(C19728f fVar, C19047a aVar, C13756i iVar, MapFragment mapFragment, C16753e eVar, C13121b bVar, C12778f fVar2, C18625g gVar) {
        boolean z;
        C19728f fVar3 = fVar;
        C19047a aVar2 = aVar;
        C13756i iVar2 = iVar;
        MapFragment mapFragment2 = mapFragment;
        C16753e eVar2 = eVar;
        C13121b bVar2 = bVar;
        C12778f fVar4 = fVar2;
        C18625g gVar2 = gVar;
        C21100e.m49373x(fVar3, "metroContext");
        this.f47435g = fVar3;
        C21100e.m49373x(aVar2, "configuration");
        this.f47436h = aVar2;
        C21100e.m49373x(iVar2, "requestManager");
        this.f47437i = iVar2;
        C21100e.m49373x(mapFragment2, "mapFragment");
        this.f47438j = mapFragment2;
        this.f47439k = mapFragment.mo48622S2();
        C21100e.m49373x(eVar2, "favoriteManager");
        this.f47440l = eVar2;
        C21100e.m49373x(bVar2, "traceManager");
        this.f47442n = bVar2;
        LatLonE6 L2 = mapFragment.mo48615L2();
        C16285j jVar = mapFragment2.f42368n;
        Rect rect = new Rect();
        View view = mapFragment.getView();
        if (view instanceof MapFragmentView) {
            ((MapFragmentView) view).mo48685a(rect);
        }
        Polylon a = jVar.mo48784a(rect);
        float S2 = mapFragment.mo48622S2();
        if (S2 < mapFragment2.f42372p) {
            z = true;
        } else {
            z = false;
        }
        this.f47443o = new C18624f(L2, a, S2, Collections.emptyList(), Collections.emptyList(), Collections.emptyMap(), z);
        this.f47444p = new C18623e(Collections.emptyList(), Collections.emptyList());
        C21100e.m49373x(fVar4, "serviceAlertsManager");
        this.f47441m = fVar4;
        C21100e.m49373x(gVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f47445q = gVar2;
        this.f47446r = new AtomicReference<>();
    }

    /* renamed from: d */
    public static int m45564d(Collection<? extends C19206b> collection, Polygon polygon) {
        boolean z;
        BoxE6 f = BoxE6.m40166f(polygon.getPoints());
        int i = 0;
        for (C19206b bVar : collection) {
            LatLonE6 location = bVar.getLocation();
            int i2 = location.f40980b;
            int i3 = location.f40981c;
            if (i2 < f.f40964b || i2 > f.f40965c || i3 < f.f40966d || i3 > f.f40967e) {
                z = false;
            } else {
                z = true;
            }
            if (z && polygon.mo46935h(bVar.getLocation())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static ArrayList m45565g(C12778f fVar, C16753e eVar, List list, Map map, Map map2, int i, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        TransitType.ViewType viewType;
        List<C20787c> list2;
        boolean z4;
        TransitLine transitLine;
        C12775d dVar;
        boolean z5;
        TransitAgency transitAgency;
        TransitType transitType;
        C16753e eVar2 = eVar;
        int i4 = i;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            TransitStop transitStop = (TransitStop) list.get(i5);
            ServerId serverId = transitStop.f23730b;
            if (!DbEntityRef.areFullyResolved(transitStop.f23735g)) {
                C16596f a = C16596f.m42113a();
                a.mo49363b("Stop Id: " + serverId);
                a.mo49364c(new ApplicationBugException("Nearby stop is not fully resolved"));
            } else {
                if (serverId == null || eVar2 == null || !eVar2.mo49442q(serverId)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Map map3 = map;
                if (i5 < 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int intValue = ((Integer) map3.get(serverId)).intValue();
                if (z3) {
                    i3 = 3;
                } else {
                    i3 = 2;
                }
                C18591c.C18593b bVar = r8;
                ServerId serverId2 = serverId;
                C18591c.C18593b bVar2 = new C18591c.C18593b(i3, transitStop, (TransitLine) null, (C20787c) null, intValue, z2, (C12775d) null, (C20944i0<Integer, Integer>) null);
                arrayList.add(bVar);
                if (z3) {
                    int size2 = arrayList.size();
                    List list3 = (List) map2.get(serverId2);
                    if (list3 != null || z) {
                        if (list3 == null) {
                            arrayList.addAll(Collections.nCopies(Math.min(transitStop.f23735g.size(), i4), new C18591c.C18593b(6, (TransitStop) null, (TransitLine) null, (C20787c) null, -1, false, (C12775d) null, (C20944i0<Integer, Integer>) null)));
                        } else {
                            ArrayList arrayList2 = new ArrayList(list3);
                            C18622d dVar2 = new C18622d(eVar2, transitStop);
                            int i6 = C7843b.f23777a;
                            Iterator<DbEntityRef<TransitLine>> it = transitStop.f23735g.iterator();
                            TransitType transitType2 = null;
                            while (true) {
                                if (it.hasNext()) {
                                    TransitLine transitLine2 = (TransitLine) it.next().get();
                                    if (!(transitLine2 == null || (transitAgency = transitLine2.mo24369b().f23696d.get()) == null || (transitType = transitAgency.f23674d.get()) == null)) {
                                        if (transitType2 != null && !transitType2.equals(transitType)) {
                                            transitType2 = null;
                                            break;
                                        }
                                        transitType2 = transitType;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (transitType2 == null) {
                                viewType = null;
                            } else {
                                viewType = transitType2.f23761f;
                            }
                            if (!TransitType.ViewType.PLATFORMS.equals(viewType) || transitStop.f23741m.isEmpty()) {
                                i2 = size;
                                list2 = m45567l(transitStop, arrayList2, i4, true, dVar2);
                            } else {
                                HashMap hashMap = new HashMap();
                                C6302b bVar3 = new C6302b();
                                Iterator it2 = arrayList2.iterator();
                                StopRealTimeInformation stopRealTimeInformation = null;
                                while (it2.hasNext()) {
                                    C20787c cVar = (C20787c) it2.next();
                                    DbEntityRef<TransitLine> b = transitStop.mo24410b(cVar.f52456a);
                                    if (b != null) {
                                        if (stopRealTimeInformation == null) {
                                            stopRealTimeInformation = cVar.f52459d;
                                        }
                                        int i7 = size;
                                        hashMap.putAll(cVar.f52460e);
                                        TransitLine transitLine3 = b.get();
                                        Iterator it3 = it2;
                                        C20944i0 i0Var = new C20944i0(transitLine3.mo24369b(), transitLine3.f23689e);
                                        C20944i0 i0Var2 = (C20944i0) bVar3.getOrDefault(i0Var, null);
                                        if (i0Var2 == null) {
                                            i0Var2 = new C20944i0(transitLine3, new ArrayList());
                                            bVar3.put(i0Var, i0Var2);
                                        }
                                        ((List) i0Var2.f52693b).addAll(cVar.f52458c.f23660b);
                                        List list4 = list;
                                        size = i7;
                                        it2 = it3;
                                    }
                                }
                                i2 = size;
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it4 = ((C6307g.C6312e) bVar3.values()).iterator();
                                while (true) {
                                    C6307g.C6308a aVar = (C6307g.C6308a) it4;
                                    if (!aVar.hasNext()) {
                                        break;
                                    }
                                    C20944i0 i0Var3 = (C20944i0) aVar.next();
                                    arrayList3.add(new C20787c(((TransitLine) i0Var3.f52692a).f23687c, transitStop.f23730b, new Schedule((List) i0Var3.f52693b, false), stopRealTimeInformation, hashMap));
                                    it4 = it4;
                                }
                                list2 = m45567l(transitStop, arrayList3, i4, false, dVar2);
                            }
                            for (C20787c cVar2 : list2) {
                                DbEntityRef<TransitLine> b2 = transitStop.mo24410b(cVar2.f52456a);
                                if (b2 == null) {
                                    transitLine = null;
                                } else {
                                    transitLine = b2.get();
                                }
                                if (transitLine != null && !cVar2.f52458c.isEmpty()) {
                                    try {
                                        dVar = (C12775d) Tasks.await(fVar.mo39625e(transitLine.mo24369b().f23694b));
                                    } catch (Exception unused) {
                                        ServerId serverId3 = transitLine.mo24369b().f23694b;
                                        dVar = null;
                                    }
                                    if (eVar2 == null || !eVar2.mo49441p(transitLine.mo24369b().f23694b)) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    C18591c.C18593b bVar4 = r8;
                                    C18591c.C18593b bVar5 = new C18591c.C18593b(5, transitStop, transitLine, cVar2, -1, z5, dVar, (C20944i0<Integer, Integer>) null);
                                    arrayList.add(bVar4);
                                }
                                Map map4 = map2;
                            }
                            if (arrayList.size() != size2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                arrayList.add(new C18591c.C18593b(4, transitStop, (TransitLine) null, (C20787c) null, -1, z2, (C12775d) null, (C20944i0<Integer, Integer>) null));
                            }
                            i5++;
                            size = i2;
                        }
                    }
                    i2 = size;
                    i5++;
                    size = i2;
                }
            }
            Map map5 = map2;
            i2 = size;
            i5++;
            size = i2;
        }
        return arrayList;
    }

    /* renamed from: k */
    public static ArrayList m45566k(C5268d dVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TransitStop c = dVar.mo21064c(((C5384a) it.next()).getServerId());
            if (c != null) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public static List m45567l(TransitStop transitStop, ArrayList arrayList, int i, boolean z, C18622d dVar) {
        List<DbEntityRef<TransitLine>> list = transitStop.f23735g;
        int min = Math.min(list.size(), i);
        Collections.sort(arrayList, dVar);
        if (arrayList.size() >= min) {
            return arrayList.subList(0, min);
        }
        if (z) {
            ServerId serverId = transitStop.f23730b;
            HashSet g = C13720d.m34277g(arrayList, (C13722f) null, new C20228e(1));
            for (DbEntityRef<TransitLine> serverId2 : list) {
                ServerId serverId3 = serverId2.getServerId();
                if (!g.contains(serverId3)) {
                    g.add(serverId3);
                    arrayList.add(new C20787c(serverId3, serverId, Schedule.f23657c, (StopRealTimeInformation) null, Collections.emptyMap()));
                    if (g.size() == min) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public static Object[] m45568m(Object... objArr) {
        C18624f fVar;
        C18624f fVar2;
        C18626h hVar;
        C18623e eVar;
        C18623e eVar2;
        Polygon polygon;
        Polygon polygon2 = null;
        if (objArr.length >= 1) {
            fVar = objArr[0];
        } else {
            fVar = null;
        }
        if (fVar instanceof C18624f) {
            fVar2 = fVar;
            hVar = null;
        } else if (fVar instanceof C18626h) {
            hVar = (C18626h) fVar;
            fVar2 = hVar.f47465b;
        } else {
            hVar = null;
            fVar2 = null;
        }
        if (objArr.length >= 2) {
            eVar = objArr[1];
        } else {
            eVar = null;
        }
        if (eVar instanceof C18623e) {
            eVar2 = eVar;
        } else {
            eVar2 = null;
        }
        if (objArr.length >= 3) {
            polygon = objArr[2];
        } else {
            polygon = null;
        }
        if (polygon instanceof Polygon) {
            polygon2 = polygon;
        }
        return new Object[]{fVar2, hVar, eVar2, polygon2};
    }

    /* renamed from: a */
    public final float mo51000a(LatLonE6 latLonE6, ServerId serverId) {
        if (latLonE6 == null) {
            return Float.MAX_VALUE;
        }
        LatLonE6 latLonE62 = this.f47443o.f47456a;
        String str = latLonE62.f40980b + "_" + latLonE62.f40981c + "#" + serverId.mo19751c();
        Float orDefault = this.f47434f.getOrDefault(str, null);
        if (orDefault == null) {
            LatLonE6 latLonE63 = this.f47443o.f47456a;
            latLonE63.getClass();
            orDefault = Float.valueOf(LatLonE6.m40174c(latLonE63, latLonE6));
            this.f47434f.put(str, orDefault);
        }
        return orDefault.floatValue();
    }

    /* renamed from: b */
    public final void mo51001b(C6302b bVar, ArrayList arrayList) {
        int ceil;
        arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TransitStop transitStop = (TransitStop) it.next();
            ServerId serverId = transitStop.f23730b;
            if (!bVar.containsKey(serverId)) {
                LatLonE6 latLonE6 = transitStop.f23732d;
                int i = -1;
                if (latLonE6 != null && (ceil = (int) Math.ceil((double) ((mo51000a(latLonE6, serverId) / ((Float) this.f47436h.mo51505b(C19053d.f48482u)).floatValue()) / 60.0f))) < 60) {
                    i = ceil;
                }
                bVar.put(serverId, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: c */
    public final LinkedHashSet mo51002c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(4);
        int min = Math.min(this.f47443o.f47460e.size(), 2);
        for (int i = 0; i < min; i++) {
            linkedHashSet.add(this.f47443o.f47460e.get(i).f23730b);
        }
        int min2 = Math.min(this.f47443o.f47461f.size(), 2);
        for (int i2 = 0; i2 < min2; i2++) {
            linkedHashSet.add(this.f47443o.f47461f.get(i2).f23730b);
        }
        return linkedHashSet;
    }

    public final Object doInBackground(Object[] objArr) {
        C18626h hVar;
        C18626h hVar2;
        TraceEvent traceEvent;
        C13121b bVar;
        Map<ServerId, List<C20787c>> map;
        try {
            C13121b bVar2 = this.f47442n;
            traceEvent = TraceEvent.NEAR_BY_ITEMS_ASYNC_TASK_COMPLETED;
            bVar2.mo40024b(traceEvent);
            Arrays.toString(objArr);
            Object[] m = m45568m(objArr);
            C18624f fVar = (C18624f) m[0];
            C18626h hVar3 = (C18626h) m[1];
            C18623e eVar = (C18623e) m[2];
            Polygon polygon = (Polygon) m[3];
            if (eVar != null) {
                this.f47444p = eVar;
            }
            hVar = null;
            if (fVar == null) {
                Set<MapItem> j = mo51008j();
                if (isCancelled()) {
                    this.f47442n.mo40025c(traceEvent);
                    isCancelled();
                    return hVar;
                }
                if (polygon != null) {
                    publishProgress(new Object[]{Integer.valueOf(m45564d(j, polygon))});
                }
                C18624f f = mo51005f(j);
                if (f != null) {
                    this.f47443o = f;
                }
            } else {
                this.f47443o = fVar;
                if (polygon != null) {
                    publishProgress(new Object[]{Integer.valueOf(m45564d(fVar.f47460e, polygon))});
                }
            }
            if (this.f47443o != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("favorite_stops_count", String.valueOf(this.f47443o.f47461f.size()));
                hashMap.put("near_by_stops_count", String.valueOf(this.f47443o.f47460e.size()));
                hashMap.put("map_center", this.f47443o.f47456a.toString());
                hashMap.put("map_zoom_level", String.valueOf(this.f47443o.f47459d));
                this.f47442n.mo40023a(traceEvent, hashMap);
            }
            if (!isCancelled()) {
                if (hVar3 == null) {
                    LinkedHashSet c = mo51002c();
                    if (fVar == null && !c.isEmpty()) {
                        C18626h h = mo51006h(Collections.emptyMap(), true);
                        publishProgress(new Object[]{h});
                        this.f47444p = new C18623e(h.f47467d, h.f47469f);
                    }
                    map = mo51007i(c);
                } else {
                    map = hVar3.f47466c;
                }
                hVar2 = mo51006h(map, false);
                bVar = this.f47442n;
                hVar = hVar2;
                bVar.mo40025c(traceEvent);
                isCancelled();
                return hVar;
            }
            this.f47442n.mo40025c(traceEvent);
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(new ApplicationBugException("NearbyItemsAsyncTask", e));
            hVar2 = mo51004e();
            bVar = this.f47442n;
            traceEvent = TraceEvent.NEAR_BY_ITEMS_ASYNC_TASK_COMPLETED;
        } catch (Throwable th) {
            this.f47442n.mo40025c(TraceEvent.NEAR_BY_ITEMS_ASYNC_TASK_COMPLETED);
            isCancelled();
            throw th;
        }
        isCancelled();
        return hVar;
    }

    /* renamed from: e */
    public final C18626h mo51004e() {
        List singletonList = Collections.singletonList(C18591c.C18593b.m45517a(R.drawable.img_empty_no_network, R.string.request_send_error_message));
        C1208m.C1212d a = C1208m.m3293a(new C18621c(this.f47444p.f47454a, singletonList), false);
        List singletonList2 = Collections.singletonList(C18591c.C18593b.m45517a(0, 0));
        return new C18626h(false, this.f47443o, Collections.emptyMap(), singletonList, a, singletonList2, C1208m.m3293a(new C18621c(this.f47444p.f47455b, singletonList2), false));
    }

    /* renamed from: f */
    public final C18624f mo51005f(Set<MapItem> set) throws Exception {
        List<StopFavorite> list;
        C20944i0 i0Var;
        C5268d dVar;
        boolean z;
        C16753e eVar = this.f47440l;
        if (eVar != null) {
            list = eVar.mo49438l();
        } else {
            list = Collections.emptyList();
        }
        if (isCancelled()) {
            return null;
        }
        set.size();
        if (set.isEmpty()) {
            i0Var = new C20944i0(Collections.emptyList(), Boolean.valueOf(this.f47443o.f47463h));
        } else {
            ArrayList arrayList = new ArrayList(set.size());
            C13723g.m34283d(set, arrayList, this.f47430b);
            int size = arrayList.size();
            C13723g.m34285f(arrayList, (ArrayList) null, this.f47431c);
            if (size != arrayList.size()) {
                z = true;
            } else {
                z = false;
            }
            Collections.sort(arrayList, this.f47432d);
            int size2 = arrayList.size();
            List list2 = arrayList;
            if (size2 > 10) {
                list2 = arrayList.subList(0, 10);
            }
            i0Var = new C20944i0(list2, Boolean.valueOf(z));
        }
        List list3 = (List) i0Var.f52692a;
        boolean equals = Boolean.TRUE.equals(i0Var.f52693b);
        if (isCancelled()) {
            return null;
        }
        HashSet hashSet = new HashSet(list.size() + list3.size());
        ServerId.m11394f(list3, hashSet);
        ServerId.m11394f(list, hashSet);
        hashSet.size();
        if (hashSet.isEmpty()) {
            dVar = C5268d.f17403i;
        } else {
            C13752e b = this.f47437i.mo40679b();
            C4776h hVar = C19728f.m47195a(b.f33852a).f50165a;
            C5269e d = C16759e.m42348d(hVar, "metroInfo");
            MetroEntityType metroEntityType = MetroEntityType.TRANSIT_STOP;
            d.f17412b.mo47002b(metroEntityType, hashSet);
            d.mo21067b(metroEntityType);
            C5267c cVar = new C5267c(b, "NearbyItemsAsyncTask", hVar, d);
            C13756i iVar = this.f47437i;
            dVar = C5265a.m13289Q(iVar.mo40681d(cVar.mo21061O(), cVar, iVar.f33867a));
        }
        ArrayList k = m45566k(dVar, list3);
        ArrayList k2 = m45566k(dVar, list);
        Collections.sort(k2, this.f47433e);
        if (isCancelled()) {
            return null;
        }
        C6302b bVar = new C6302b(list.size() + k.size());
        mo51001b(bVar, k);
        mo51001b(bVar, k2);
        C18624f fVar = this.f47443o;
        return new C18624f(fVar.f47456a, fVar.f47457b, fVar.f47459d, k, k2, bVar, equals);
    }

    /* renamed from: h */
    public final C18626h mo51006h(Map<ServerId, List<C20787c>> map, boolean z) {
        int intValue = ((Integer) this.f47436h.mo51505b(C20199a.f51274f0)).intValue();
        C12778f fVar = this.f47441m;
        C16753e eVar = this.f47440l;
        C18624f fVar2 = this.f47443o;
        ArrayList g = m45565g(fVar, eVar, fVar2.f47460e, fVar2.f47462g, map, intValue, z);
        if (g.isEmpty()) {
            if (this.f47443o.f47463h) {
                g.add(C18591c.C18593b.m45517a(R.drawable.img_empty_zoom_map, R.string.stations_around_zoom));
            } else {
                g.add(C18591c.C18593b.m45517a(R.drawable.img_empty_move_map, R.string.no_stations_found));
            }
        }
        C1208m.C1212d a = C1208m.m3293a(new C18621c(this.f47444p.f47454a, g), false);
        C12778f fVar3 = this.f47441m;
        C16753e eVar2 = this.f47440l;
        C18624f fVar4 = this.f47443o;
        ArrayList g2 = m45565g(fVar3, eVar2, fVar4.f47461f, fVar4.f47462g, map, intValue, z);
        if (g2.isEmpty()) {
            g2.add(C18591c.C18593b.m45517a(0, 0));
        }
        return new C18626h(true, this.f47443o, map, g, a, g2, C1208m.m3293a(new C18621c(this.f47444p.f47455b, g2), false));
    }

    /* renamed from: i */
    public final Map mo51007i(LinkedHashSet linkedHashSet) {
        try {
            linkedHashSet.size();
            if (linkedHashSet.isEmpty()) {
                return Collections.emptyMap();
            }
            C13752e b = this.f47437i.mo40679b();
            C19728f fVar = this.f47435g;
            C19047a aVar = this.f47436h;
            C21100e.m49373x(b, "requestContext");
            C21100e.m49373x(fVar, "metroContext");
            C21100e.m49373x(aVar, "configuration");
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            C20786b bVar = new C20786b();
            linkedHashSet2.addAll(linkedHashSet);
            bVar.f52453g = true;
            C20792f fVar2 = new C20792f(b, fVar, aVar, new ArrayList(linkedHashSet2), bVar);
            fVar2.mo5818H();
            if (isCancelled()) {
                return Collections.emptyMap();
            }
            C6302b bVar2 = new C6302b(linkedHashSet.size());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            while (true) {
                C20793g gVar = (C20793g) fVar2.mo40051G();
                if (gVar == null) {
                    break;
                }
                bVar2.put(gVar.f52480m, gVar.f52481n);
                if (isCancelled()) {
                    break;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (elapsedRealtime2 - elapsedRealtime >= 500) {
                    C18626h h = mo51006h(bVar2, true);
                    publishProgress(new Object[]{h});
                    this.f47444p = new C18623e(h.f47467d, h.f47469f);
                    elapsedRealtime = elapsedRealtime2;
                }
            }
            return bVar2;
        } catch (Exception unused) {
            return Collections.emptyMap();
        }
    }

    /* renamed from: j */
    public final Set<MapItem> mo51008j() {
        Map map;
        if (this.f47443o.f47463h) {
            return Collections.emptySet();
        }
        BoxE6 j = this.f47443o.f47458c.mo46899j(this.f47435g.f50165a.f16132g.getBounds());
        if (j == null) {
            BoxE6 boxE6 = this.f47443o.f47458c;
            return Collections.emptySet();
        }
        HashSet P = C16283a.m41526P(j);
        float f = this.f47443o.f47459d;
        P.size();
        if (P.isEmpty()) {
            return Collections.emptySet();
        }
        C13752e b = this.f47437i.mo40679b();
        ArrayList arrayList = new ArrayList(P.size());
        Iterator it = P.iterator();
        while (it.hasNext()) {
            C16283a aVar = new C16283a(b, MapItem.Type.STOP, (Point) it.next());
            arrayList.add(new C13753f(aVar.mo48776O(), aVar, C16283a.f42553y));
        }
        this.f47446r.set(new C13776p(arrayList));
        Tasks.call(MoovitExecutors.MAIN_THREAD, new C18617o(0, this, b));
        C13776p pVar = this.f47446r.get();
        if (pVar == null) {
            return Collections.emptySet();
        }
        if (!pVar.f33919g.block(20000) && !isCancelled()) {
            C13776p andSet = this.f47446r.getAndSet((Object) null);
            if (andSet != null) {
                andSet.cancel(false);
            }
            throw new ApplicationBugException("Unable to retrieve stop map items due to timeout.");
        } else if (isCancelled()) {
            return Collections.emptySet();
        } else {
            if (pVar.f33915e.isEmpty()) {
                CollectionHashMap.ArrayListHashMap arrayListHashMap = pVar.f33913c;
                if (arrayListHashMap.isEmpty()) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : arrayListHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        if (list.size() == 1) {
                            hashMap.put(str, (C20436g) list.get(0));
                        } else {
                            throw new IllegalArgumentException(C13437d.m33706k("Request ", str, " is a multi-response request"));
                        }
                    }
                    map = hashMap;
                }
                HashSet hashSet = new HashSet();
                for (C20436g gVar : map.values()) {
                    List<MapItem> list2 = ((C16284b) gVar).f42557m;
                    if (list2 != null) {
                        hashSet.addAll(list2);
                    }
                }
                return hashSet;
            }
            throw new ApplicationBugException("Unable to retrieve stop map items.", (Throwable) C13717b.m34256c(pVar.f33915e.values()));
        }
    }

    public final void onPostExecute(Object obj) {
        C18626h hVar = (C18626h) obj;
        super.onPostExecute(hVar);
        if (!isCancelled() && hVar != null) {
            this.f47445q.mo50992T(hVar, false);
        }
    }

    public final void onProgressUpdate(Object... objArr) {
        C18626h hVar;
        super.onProgressUpdate(objArr);
        if (!isCancelled()) {
            if (objArr.length == 1) {
                hVar = objArr[0];
            } else {
                hVar = null;
            }
            if (hVar != null) {
                if (hVar instanceof C18626h) {
                    this.f47445q.mo50992T(hVar, true);
                } else if (hVar instanceof Integer) {
                    this.f47445q.mo50994X0(((Integer) hVar).intValue());
                }
            }
        }
    }
}
