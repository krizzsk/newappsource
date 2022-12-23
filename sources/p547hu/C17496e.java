package p547hu;

import b00.C13557b;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13752e;
import ce0.C21100e;
import com.appsflyer.internal.referrer.Payload;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7843b;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPattern;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TripId;
import com.moovit.util.ServerIdMap;
import com.moovit.util.time.Time;
import com.moovit.util.time.TimeFrequency;
import g30.C4776h;
import h20.C17297b;
import i30.C5267c;
import i30.C5269e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p054d0.C4303q;
import p495fq.C17057b;
import p732pq.C18949j;
import p824tp.C19728f;
import p977zz.C20935e;

/* renamed from: hu.e */
public final class C17496e extends C13557b<C17497f, Void, C17497f> {

    /* renamed from: j */
    public static final /* synthetic */ int f45040j = 0;

    /* renamed from: b */
    public final C13752e f45041b;

    /* renamed from: c */
    public final C19728f f45042c;

    /* renamed from: d */
    public final Time f45043d;

    /* renamed from: e */
    public final List<ServerId> f45044e;

    /* renamed from: f */
    public final ServerId f45045f;

    /* renamed from: g */
    public final ServerId f45046g;

    /* renamed from: h */
    public final C17297b f45047h;

    /* renamed from: i */
    public final C20935e<C17497f> f45048i;

    public C17496e(C13752e eVar, C19728f fVar, Time time, ArrayList arrayList, ServerId serverId, ServerId serverId2, C17297b bVar, C17057b bVar2) {
        C21100e.m49373x(eVar, "requestContext");
        this.f45041b = eVar;
        C21100e.m49373x(fVar, "metroContext");
        this.f45042c = fVar;
        C21100e.m49373x(time, "time");
        this.f45043d = time;
        C21100e.m49373x(arrayList, "lineIds");
        this.f45044e = arrayList;
        C21100e.m49373x(serverId, "originStopId");
        this.f45045f = serverId;
        this.f45046g = serverId2;
        C21100e.m49373x(bVar, Payload.RESPONSE);
        this.f45047h = bVar;
        C21100e.m49373x(bVar2, WidgetMessageParser.KEY_CALLBACK);
        this.f45048i = bVar2;
    }

    /* renamed from: a */
    public final ServerIdMap mo49961a(Collection collection) {
        try {
            C13752e eVar = this.f45041b;
            C4776h hVar = this.f45042c.f50165a;
            C5269e eVar2 = new C5269e();
            C21100e.m49373x(eVar, "requestContext");
            C21100e.m49373x(hVar, "metroInfo");
            eVar2.f17412b.mo47002b(MetroEntityType.TRANSIT_STOP, collection);
            return new C5267c(eVar, "LineScheduleProcessResponseTask", hVar, eVar2).mo21062P().f17404a;
        } catch (Exception unused) {
            return null;
        }
    }

    public final Object doInBackground(Object[] objArr) {
        ServerIdMap serverIdMap;
        TransitStop transitStop;
        boolean z;
        List list;
        C17497f fVar;
        List<TransitStop> list2;
        boolean z2;
        Map map;
        TransitStop transitStop2;
        TransitStop transitStop3;
        ServerId serverId;
        ServerId serverId2;
        Map<ServerId, List<TransitPatternTrips>> map2;
        Iterator it;
        int[] iArr;
        int[] iArr2;
        int i;
        int i2;
        int i3;
        C17497f[] fVarArr = (C17497f[]) objArr;
        ServerId serverId3 = this.f45046g;
        if (serverId3 != null) {
            serverIdMap = mo49961a(Arrays.asList(new ServerId[]{this.f45045f, serverId3}));
        } else {
            serverIdMap = mo49961a(Collections.singleton(this.f45045f));
        }
        if (serverIdMap == null) {
            return null;
        }
        TransitStop transitStop4 = (TransitStop) serverIdMap.get(this.f45045f);
        ServerId serverId4 = this.f45046g;
        if (serverId4 == null) {
            transitStop = null;
        } else {
            transitStop = (TransitStop) serverIdMap.get(serverId4);
        }
        TransitLineGroup transitLineGroup = this.f45047h.f44685m;
        ArrayList arrayList = new ArrayList(this.f45044e.size());
        for (ServerId c : this.f45044e) {
            TransitLine c2 = transitLineGroup.mo24377c(c);
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        Time time = this.f45043d;
        ServerId serverId5 = this.f45045f;
        ServerId serverId6 = this.f45046g;
        C17297b bVar = this.f45047h;
        if (serverId6 != null) {
            z = true;
        } else {
            z = false;
        }
        Map<ServerId, List<TransitPatternTrips>> map3 = bVar.f44686n;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            TransitLine transitLine = (TransitLine) it2.next();
            List list3 = map3.get(transitLine.f23687c);
            if (!C13717b.m34258e(list3)) {
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    TransitPatternTrips transitPatternTrips = (TransitPatternTrips) it3.next();
                    TransitPattern transitPattern = transitPatternTrips.f23717b;
                    if (transitPattern.mo24390g(serverId5) && (!z || transitPattern.mo24390g(serverId6))) {
                        it = it3;
                        ServerId serverId7 = transitPattern.f23708b;
                        map2 = map3;
                        int[] d = transitPattern.mo24386d(serverId5);
                        if (z) {
                            serverId2 = serverId5;
                            iArr = transitPattern.mo24386d(serverId6);
                        } else {
                            serverId2 = serverId5;
                            iArr = null;
                        }
                        serverId = serverId6;
                        int f = transitPattern.mo24389f() - 1;
                        Iterator<TripId> it4 = transitPatternTrips.f23718c.iterator();
                        while (it4.hasNext()) {
                            Iterator<TripId> it5 = it4;
                            TripId next = it4.next();
                            TransitStop transitStop5 = transitStop;
                            Schedule b = transitPatternTrips.mo24403b(next);
                            TransitPatternTrips transitPatternTrips2 = transitPatternTrips;
                            int length = d.length;
                            TransitStop transitStop6 = transitStop4;
                            int i4 = 0;
                            while (i4 < length) {
                                int i5 = length;
                                int i6 = d[i4];
                                if (i6 != f) {
                                    Time u = b.mo24331u(i6);
                                    if (!z) {
                                        arrayList2.add(new C17493b(transitLine, next, serverId7, u, (Time) null));
                                    } else {
                                        i = f;
                                        int length2 = iArr.length;
                                        iArr2 = d;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length2) {
                                                i2 = -1;
                                                i3 = -1;
                                                break;
                                            }
                                            int i8 = length2;
                                            i3 = iArr[i7];
                                            if (i3 > i6) {
                                                i2 = -1;
                                                break;
                                            }
                                            i7++;
                                            length2 = i8;
                                        }
                                        if (i3 != i2) {
                                            arrayList2.add(new C17493b(transitLine, next, serverId7, u, b.mo24331u(i3)));
                                        }
                                        i4++;
                                        length = i5;
                                        f = i;
                                        d = iArr2;
                                    }
                                }
                                i = f;
                                iArr2 = d;
                                i4++;
                                length = i5;
                                f = i;
                                d = iArr2;
                            }
                            it4 = it5;
                            transitStop = transitStop5;
                            transitPatternTrips = transitPatternTrips2;
                            transitStop4 = transitStop6;
                        }
                        transitStop2 = transitStop4;
                        transitStop3 = transitStop;
                    } else {
                        it = it3;
                        serverId2 = serverId5;
                        serverId = serverId6;
                        transitStop2 = transitStop4;
                        transitStop3 = transitStop;
                        map2 = map3;
                    }
                    it3 = it;
                    map3 = map2;
                    serverId5 = serverId2;
                    serverId6 = serverId;
                    transitStop = transitStop3;
                    transitStop4 = transitStop2;
                }
            }
            map3 = map3;
            serverId5 = serverId5;
            serverId6 = serverId6;
            transitStop = transitStop;
            transitStop4 = transitStop4;
        }
        TransitStop transitStop7 = transitStop4;
        TransitStop transitStop8 = transitStop;
        C13723g.m34285f(arrayList2, (ArrayList) null, new C17495d(time));
        Collections.sort(arrayList2);
        Time time2 = this.f45043d;
        if (arrayList.size() != 1) {
            list = Collections.emptyList();
        } else if (C13720d.m34277g(arrayList2, (C13722f) null, new C4303q(3)).size() != 1) {
            list = Collections.emptyList();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it6 = arrayList2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                TimeFrequency timeFrequency = ((C17493b) it6.next()).f45033e.f23908i;
                if (timeFrequency == null) {
                    linkedHashSet.clear();
                    break;
                }
                linkedHashSet.add(timeFrequency);
            }
            list = C13723g.m34282c(linkedHashSet, new C18949j(time2, 2));
        }
        if (fVarArr.length > 0) {
            fVar = fVarArr[0];
        } else {
            fVar = null;
        }
        if (fVar == null || !transitLineGroup.equals(fVar.f45049a)) {
            ServerId serverId8 = this.f45045f;
            C17297b bVar2 = this.f45047h;
            Map<ServerId, List<TransitPatternTrips>> map4 = bVar2.f44686n;
            if (transitLineGroup.f23695c == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                map = bVar2.f44687o;
            } else {
                map = C7843b.m17881h(arrayList, map4);
            }
            List<TransitStop> list4 = (List) map.get(((TransitLine) arrayList.get(0)).f23691g);
            ListIterator<TransitStop> listIterator = list4.listIterator();
            while (listIterator.hasNext()) {
                listIterator.remove();
                if (listIterator.next().f23730b.equals(serverId8)) {
                    break;
                }
            }
            ListIterator<TransitStop> listIterator2 = list4.listIterator();
            while (listIterator2.hasNext()) {
                ServerId serverId9 = listIterator2.next().f23730b;
                Iterator it7 = arrayList.iterator();
                boolean z3 = true;
                while (it7.hasNext()) {
                    List list5 = map4.get(((TransitLine) it7.next()).f23687c);
                    if (list5 != null) {
                        Iterator it8 = list5.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            }
                            TransitPattern transitPattern2 = ((TransitPatternTrips) it8.next()).f23717b;
                            if (transitPattern2.mo24390g(serverId8) && transitPattern2.mo24390g(serverId9)) {
                                z3 = false;
                                break;
                            }
                        }
                    }
                }
                if (z3) {
                    listIterator2.remove();
                }
            }
            list2 = list4;
        } else {
            list2 = fVar.f45054f;
        }
        return new C17497f(transitLineGroup, arrayList, transitStop7, transitStop8, arrayList2, list2, list);
    }

    public final void onPostExecute(Object obj) {
        C17497f fVar = (C17497f) obj;
        if (!isCancelled() && fVar != null) {
            this.f45048i.invoke(fVar);
        }
    }
}
