package e20;

import aa0.C7540l;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b00.C13556a;
import c00.C13717b;
import c00.C13723g;
import c70.C13752e;
import c70.C13756i;
import ce0.C21100e;
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
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.transit.Schedule;
import com.moovit.util.time.Time;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a0.C0016g;
import p011aa.C0141e;
import p241s0.C6302b;
import p504fz.C17133e;
import p504fz.C17134f;
import p504fz.C17135g;
import p824tp.C19728f;
import p906wz.C20431c;
import p906wz.C20436g;
import p952yy.C20786b;
import p952yy.C20787c;
import p952yy.C20789d;
import p952yy.C20791e;
import p977zz.C20944i0;
import p988j$.util.DesugarCollections;
import q00.C19047a;

/* renamed from: e20.e */
public abstract class C16769e extends C7540l {

    /* renamed from: d */
    public final C16770a f43653d;

    /* renamed from: e */
    public final C16771b f43654e;

    /* renamed from: f */
    public final Context f43655f;

    /* renamed from: g */
    public C13556a f43656g;

    /* renamed from: h */
    public C13556a f43657h;

    /* renamed from: i */
    public final C13756i f43658i;

    /* renamed from: j */
    public final RequestOptions f43659j;

    /* renamed from: k */
    public final ArrayList f43660k;

    /* renamed from: l */
    public final C16772c f43661l;

    /* renamed from: e20.e$a */
    public class C16770a extends C0141e {
        public C16770a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C20789d dVar = (C20789d) cVar;
            C16769e eVar = C16769e.this;
            if (eVar.f43656g != null) {
                eVar.f43656g = null;
                eVar.mo45154f(eVar.f43661l);
            }
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C20789d dVar = (C20789d) cVar;
            C20787c cVar2 = ((C20791e) gVar).f52474m;
            if (cVar2 != null) {
                C16772c cVar3 = C16769e.this.f43661l;
                cVar3.getClass();
                cVar3.f43664b.put(C16772c.m42385a(cVar2.f52456a, cVar2.f52457b, (ServerId) null, (Time) null), cVar2);
            }
        }
    }

    /* renamed from: e20.e$b */
    public class C16771b extends C0141e {
        public C16771b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17134f fVar = (C17134f) cVar;
            C16769e eVar = C16769e.this;
            if (eVar.f43657h != null) {
                eVar.f43657h = null;
                eVar.mo45154f(eVar.f43661l);
            }
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17134f fVar = (C17134f) cVar;
            C17133e eVar = ((C17135g) gVar).f44366m;
            if (eVar != null) {
                C16769e.this.f43661l.f43665c.put(eVar.f44362a, eVar);
            }
        }
    }

    /* renamed from: e20.e$c */
    public static class C16772c implements Cloneable {

        /* renamed from: b */
        public final Map<String, C20787c> f43664b = DesugarCollections.synchronizedMap(new C6302b());

        /* renamed from: c */
        public final Map<ServerId, C17133e> f43665c = DesugarCollections.synchronizedMap(new C6302b());

        /* renamed from: d */
        public final Map<String, C20787c> f43666d = DesugarCollections.synchronizedMap(new C6302b());

        /* renamed from: a */
        public static String m42385a(ServerId serverId, ServerId serverId2, ServerId serverId3, Time time) {
            String str = serverId + "_" + serverId2;
            if (serverId3 != null) {
                str = str + "_" + serverId3;
            }
            if (time == null) {
                return str;
            }
            StringBuilder t = C0016g.m36t(str, "_");
            t.append(time.f23901b);
            return t.toString();
        }

        /* renamed from: b */
        public final C20787c mo49467b(ServerId serverId, ServerId serverId2, ServerId serverId3, Time time) {
            Schedule schedule;
            String a = m42385a(serverId, serverId2, serverId3, time);
            C20787c cVar = this.f43666d.get(a);
            if (cVar != null) {
                return cVar;
            }
            C20787c cVar2 = this.f43664b.get(m42385a(serverId, serverId2, (ServerId) null, (Time) null));
            if (cVar2 == null) {
                return null;
            }
            ArrayList<T> c = C13723g.m34282c(cVar2.f52458c.f23660b, new C16774f(0, time, serverId3));
            if (c.isEmpty()) {
                schedule = null;
            } else {
                schedule = new Schedule(c, true);
            }
            if (schedule == null) {
                return null;
            }
            C20787c cVar3 = new C20787c(serverId, serverId2, schedule, cVar2.f52459d, cVar2.f52460e);
            this.f43666d.put(a, cVar3);
            return cVar3;
        }

        public final Object clone() throws CloneNotSupportedException {
            C16772c cVar = (C16772c) super.clone();
            cVar.f43664b.putAll(this.f43664b);
            cVar.f43665c.putAll(this.f43665c);
            return cVar;
        }
    }

    /* renamed from: e20.e$d */
    public static class C16773d implements Leg.C16144a<Void> {

        /* renamed from: b */
        public final Context f43667b;

        /* renamed from: c */
        public final HashSet f43668c = new HashSet();

        /* renamed from: d */
        public final HashSet f43669d = new HashSet();

        /* renamed from: e */
        public final HashSet f43670e = new HashSet();

        /* renamed from: f */
        public final HashSet f43671f = new HashSet();

        public C16773d(Context context) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f43667b = context;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo39909a(CarLeg carLeg) {
            return null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            return null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ Object mo39911c(TaxiLeg taxiLeg) {
            return null;
        }

        /* renamed from: d */
        public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            for (TransitLineLeg next : multiTransitLinesLeg.f42086b) {
                next.getClass();
                mo39922n(next);
            }
            return null;
        }

        /* renamed from: e */
        public final /* bridge */ /* synthetic */ Object mo39913e(WalkLeg walkLeg) {
            return null;
        }

        /* renamed from: f */
        public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            if (C16783l.m42468E(bicycleRentalLeg, this.f43667b)) {
                C16783l.m42464A(this.f43670e, bicycleRentalLeg);
                return null;
            }
            C16783l.m42464A(this.f43671f, bicycleRentalLeg);
            return null;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            return null;
        }

        /* renamed from: h */
        public final /* bridge */ /* synthetic */ Object mo39916h(CarpoolLeg carpoolLeg) {
            return null;
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ Object mo39917i(BicycleLeg bicycleLeg) {
            return null;
        }

        /* renamed from: j */
        public final /* bridge */ /* synthetic */ Object mo39918j(EventLeg eventLeg) {
            return null;
        }

        /* renamed from: k */
        public final /* bridge */ /* synthetic */ Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            return null;
        }

        /* renamed from: l */
        public final /* bridge */ /* synthetic */ Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            return null;
        }

        /* renamed from: m */
        public final /* bridge */ /* synthetic */ Object mo39921m(DocklessCarLeg docklessCarLeg) {
            return null;
        }

        /* renamed from: n */
        public final Object mo39922n(TransitLineLeg transitLineLeg) {
            ServerId serverId = transitLineLeg.f42110d.getServerId();
            ServerId serverId2 = transitLineLeg.mo48460c().getServerId();
            if (C16783l.m42468E(transitLineLeg, this.f43667b)) {
                this.f43668c.add(new C20944i0(serverId, serverId2));
                return null;
            }
            this.f43669d.add(new C20944i0(serverId, serverId2));
            return null;
        }

        /* renamed from: p */
        public final /* bridge */ /* synthetic */ Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            return null;
        }

        /* renamed from: q */
        public final /* bridge */ /* synthetic */ Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            return null;
        }

        /* renamed from: r */
        public final /* bridge */ /* synthetic */ Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            return null;
        }
    }

    public C16769e(Context context) {
        this(context, new Handler(Looper.getMainLooper()), 20000);
    }

    /* renamed from: a */
    public final void mo19433a() {
        boolean z;
        C19728f a;
        C19047a a2;
        boolean z2;
        C16773d dVar = new C16773d(this.f43655f);
        Iterator it = this.f43660k.iterator();
        while (it.hasNext()) {
            for (Leg i0 : ((Itinerary) it.next()).mo48295u0()) {
                i0.mo48338i0(dVar);
            }
        }
        C13556a aVar = this.f43656g;
        if (aVar != null) {
            aVar.cancel(true);
            this.f43656g = null;
        }
        C13752e b = this.f43658i.mo40679b();
        if (!(b == null || (a = C19728f.m47195a(b.f33852a)) == null || (a2 = C19047a.m46164a(b.f33852a)) == null)) {
            dVar.f43669d.removeAll(dVar.f43668c);
            Iterator it2 = dVar.f43669d.iterator();
            boolean z3 = false;
            while (it2.hasNext()) {
                C20944i0 i0Var = (C20944i0) it2.next();
                C16772c cVar = this.f43661l;
                cVar.getClass();
                String a3 = C16772c.m42385a((ServerId) i0Var.f52692a, (ServerId) i0Var.f52693b, (ServerId) null, (Time) null);
                Set<String> keySet = cVar.f43666d.keySet();
                synchronized (cVar.f43666d) {
                    C13723g.m34285f(keySet, (ArrayList) null, new C16775g(a3, 0));
                }
                if (cVar.f43664b.remove(a3) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 |= z2;
            }
            if (z3) {
                mo45154f(this.f43661l);
            }
            if (!dVar.f43668c.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                C20786b bVar = new C20786b();
                Iterator it3 = dVar.f43668c.iterator();
                while (it3.hasNext()) {
                    C20944i0 i0Var2 = (C20944i0) it3.next();
                    arrayList.add((ServerId) i0Var2.f52692a);
                    arrayList2.add((ServerId) i0Var2.f52693b);
                }
                bVar.f52452f = true;
                C20789d dVar2 = new C20789d(b, a, a2, arrayList, arrayList2, bVar);
                this.f43656g = this.f43658i.mo40684g(dVar2.f52463B, dVar2, this.f43659j, this.f43653d);
            }
        }
        C13556a aVar2 = this.f43657h;
        if (aVar2 != null) {
            aVar2.cancel(true);
            this.f43657h = null;
        }
        C13752e b2 = this.f43658i.mo40679b();
        if (b2 != null) {
            dVar.f43671f.removeAll(dVar.f43670e);
            Iterator it4 = dVar.f43671f.iterator();
            boolean z4 = false;
            while (it4.hasNext()) {
                if (this.f43661l.f43665c.remove((ServerId) it4.next()) != null) {
                    z = true;
                } else {
                    z = false;
                }
                z4 |= z;
            }
            if (z4) {
                mo45154f(this.f43661l);
            }
            if (!dVar.f43670e.isEmpty()) {
                C17134f fVar = new C17134f(b2, dVar.f43670e);
                C13756i iVar = this.f43658i;
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C17134f.class, sb, "#");
                sb.append(C13717b.m34269p(fVar.f44365w));
                this.f43657h = iVar.mo40684g(sb.toString(), fVar, this.f43659j, this.f43654e);
            }
        }
        mo23802c();
    }

    /* renamed from: b */
    public final void mo21414b() {
        C13556a aVar = this.f43656g;
        if (aVar != null) {
            aVar.cancel(true);
            this.f43656g = null;
        }
        C13556a aVar2 = this.f43657h;
        if (aVar2 != null) {
            aVar2.cancel(true);
            this.f43657h = null;
        }
    }

    /* renamed from: f */
    public abstract void mo45154f(C16772c cVar);

    /* renamed from: g */
    public final void mo49465g(List<Itinerary> list) {
        C13556a aVar = this.f43656g;
        if (aVar != null) {
            aVar.cancel(true);
            this.f43656g = null;
        }
        C13556a aVar2 = this.f43657h;
        if (aVar2 != null) {
            aVar2.cancel(true);
            this.f43657h = null;
        }
        C16772c cVar = this.f43661l;
        cVar.f43664b.clear();
        cVar.f43666d.clear();
        cVar.f43665c.clear();
        this.f43660k.clear();
        ArrayList arrayList = this.f43660k;
        C21100e.m49373x(list, "itineraries");
        arrayList.addAll(list);
    }

    /* renamed from: h */
    public final void mo49466h(Itinerary itinerary) {
        C21100e.m49373x(itinerary, "itinerary");
        mo49465g(Collections.singletonList(itinerary));
    }

    public C16769e(Context context, Handler handler, long j) {
        super(handler, j);
        this.f43653d = new C16770a();
        this.f43654e = new C16771b();
        this.f43656g = null;
        this.f43657h = null;
        C13756i iVar = (C13756i) context.getSystemService("request_manager");
        if (iVar != null) {
            this.f43655f = context;
            this.f43658i = iVar;
            RequestOptions c = iVar.mo40680c();
            c.f42909f = true;
            this.f43659j = c;
            this.f43660k = new ArrayList();
            this.f43661l = new C16772c();
            return;
        }
        throw new IllegalArgumentException("The context must be a moovit context");
    }
}
