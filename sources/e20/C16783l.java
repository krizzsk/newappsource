package e20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.view.FormatTextView;
import com.moovit.database.DbEntityRef;
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
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.BicycleStop;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import e20.C16769e;
import j80.C12772a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import mf0.C24361g;
import p153l0.C5551b;
import p435de.C16596f;
import p504fz.C17133e;
import p641lu.C18277b;
import p824tp.C19728f;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p828tt.C19765f;
import p952yy.C20787c;
import p977zz.C20950l0;
import p977zz.C20964s0;
import q00.C19047a;
import q00.C19053d;

/* renamed from: e20.l */
public final class C16783l {

    /* renamed from: a */
    public static final C18277b f43688a = new C18277b(2);

    /* renamed from: b */
    public static final HashSet f43689b = new HashSet(Arrays.asList(new Integer[]{2, 5, 7, 9, 11, 12, 13, 14, 15, 16, 17, 18}));

    /* renamed from: e20.l$a */
    public static class C16784a implements Leg.C16144a<Void> {

        /* renamed from: b */
        public final LinkedHashSet<DbEntityRef<TransitLine>> f43690b = new LinkedHashSet<>();

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo39909a(CarLeg carLeg) {
            return null;
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            for (WaitToTransitLineLeg next : waitToMultiTransitLinesLeg.f42117b) {
                next.getClass();
                this.f43690b.add(next.f42135f);
            }
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
                this.f43690b.add(next.f42110d);
            }
            return null;
        }

        /* renamed from: e */
        public final /* bridge */ /* synthetic */ Object mo39913e(WalkLeg walkLeg) {
            return null;
        }

        /* renamed from: f */
        public final /* bridge */ /* synthetic */ Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            return null;
        }

        /* renamed from: g */
        public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            this.f43690b.add(waitToTransitLineLeg.f42135f);
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
            this.f43690b.add(transitLineLeg.f42110d);
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

    /* renamed from: e20.l$b */
    public static class C16785b implements Leg.C16144a<Void> {

        /* renamed from: b */
        public final LinkedHashSet<DbEntityRef<TransitStop>> f43691b = new LinkedHashSet<>();

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo39909a(CarLeg carLeg) {
            return null;
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            for (WaitToTransitLineLeg next : waitToMultiTransitLinesLeg.f42117b) {
                next.getClass();
                mo39915g(next);
            }
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
        public final /* bridge */ /* synthetic */ Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            return null;
        }

        /* renamed from: g */
        public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            this.f43691b.add(waitToTransitLineLeg.f42136g);
            this.f43691b.add(waitToTransitLineLeg.f42137h);
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
            this.f43691b.add(transitLineLeg.mo48460c());
            this.f43691b.add(transitLineLeg.mo48459b());
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

    /* renamed from: e20.l$c */
    public static class C16786c implements Leg.C16144a<LineServiceAlertDigest> {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo39909a(CarLeg carLeg) {
            return null;
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            List<WaitToTransitLineLeg> list = waitToMultiTransitLinesLeg.f42117b;
            if (list.isEmpty()) {
                return null;
            }
            return ((WaitToTransitLineLeg) Collections.min(list, new C5551b(new C12772a(), 3))).f42139j;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ Object mo39911c(TaxiLeg taxiLeg) {
            return null;
        }

        /* renamed from: d */
        public final /* bridge */ /* synthetic */ Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            return null;
        }

        /* renamed from: e */
        public final /* bridge */ /* synthetic */ Object mo39913e(WalkLeg walkLeg) {
            return null;
        }

        /* renamed from: f */
        public final /* bridge */ /* synthetic */ Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            return null;
        }

        /* renamed from: g */
        public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            return waitToTransitLineLeg.f42139j;
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
        public final /* bridge */ /* synthetic */ Object mo39922n(TransitLineLeg transitLineLeg) {
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

    /* renamed from: e20.l$d */
    public static class C16787d implements Leg.C16144a<Void> {

        /* renamed from: b */
        public final C16769e.C16772c f43692b;

        /* renamed from: c */
        public final boolean f43693c;

        /* renamed from: d */
        public final ArrayList f43694d = new ArrayList();

        public C16787d(C16769e.C16772c cVar, boolean z) {
            C21100e.m49373x(cVar, "realTimeInfo");
            this.f43692b = cVar;
            this.f43693c = z;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo39909a(CarLeg carLeg) {
            return null;
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            for (WaitToTransitLineLeg next : waitToMultiTransitLinesLeg.f42117b) {
                next.getClass();
                mo39915g(next);
            }
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
        public final /* bridge */ /* synthetic */ Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            return null;
        }

        /* renamed from: g */
        public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            Time time;
            ServerId serverId = waitToTransitLineLeg.f42135f.getServerId();
            ServerId serverId2 = waitToTransitLineLeg.f42136g.getServerId();
            ServerId serverId3 = waitToTransitLineLeg.f42137h.getServerId();
            if (this.f43693c) {
                time = C16783l.m42482n(waitToTransitLineLeg.f42132c);
            } else {
                time = null;
            }
            C20787c b = this.f43692b.mo49467b(serverId, serverId2, serverId3, time);
            if (b != null) {
                this.f43694d.add(b.f52458c);
            }
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
            Time time;
            ServerId serverId = transitLineLeg.f42110d.getServerId();
            ServerId serverId2 = transitLineLeg.mo48460c().getServerId();
            ServerId serverId3 = transitLineLeg.mo48459b().getServerId();
            if (this.f43693c) {
                time = C16783l.m42482n(transitLineLeg.f42108b);
            } else {
                time = null;
            }
            C20787c b = this.f43692b.mo49467b(serverId, serverId2, serverId3, time);
            if (b != null) {
                this.f43694d.add(b.f52458c);
            }
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

    /* renamed from: A */
    public static void m42464A(HashSet hashSet, BicycleRentalLeg bicycleRentalLeg) {
        DbEntityRef<BicycleStop> c = bicycleRentalLeg.mo48345c();
        if (c != null) {
            hashSet.add(c.getServerId());
        }
        List<DbEntityRef<BicycleStop>> list = bicycleRentalLeg.f41950e;
        C18277b bVar = ServerId.f15138c;
        C13720d.m34276f(list, (C13722f) null, bVar, hashSet);
        DbEntityRef<BicycleStop> b = bicycleRentalLeg.mo48344b();
        if (b != null) {
            hashSet.add(b.getServerId());
        }
        C13720d.m34276f(bicycleRentalLeg.f41952g, (C13722f) null, bVar, hashSet);
    }

    /* renamed from: B */
    public static boolean m42465B(Itinerary itinerary, int i) {
        boolean z;
        if (!m42469a(itinerary, i)) {
            return false;
        }
        Iterator<Leg> it = itinerary.mo48295u0().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Leg next = it.next();
            if (next.getType() != i && f43689b.contains(Integer.valueOf(next.getType()))) {
                z = true;
                break;
            }
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static long m42466C(List<Itinerary> list) {
        long j = Long.MIN_VALUE;
        for (Itinerary K1 : list) {
            j = Math.max(j, K1.mo48288K1().mo24631g());
        }
        return j;
    }

    /* renamed from: D */
    public static boolean m42467D(Itinerary itinerary, MultiTransitLinesLeg multiTransitLinesLeg, int i) {
        Leg leg;
        int g = m42475g(itinerary.mo48295u0(), multiTransitLinesLeg);
        if (g == -1) {
            C16596f.m42113a().mo49364c(new ApplicationBugException("Leg index not found in itinerary."));
            return false;
        }
        if (g >= 1) {
            leg = itinerary.mo48295u0().get(g - 1);
        } else {
            leg = null;
        }
        if (!(leg instanceof WaitToMultiTransitLinesLeg)) {
            C16596f.m42113a().mo49364c(new ApplicationBugException("MultiTransitLinesLeg missing wait leg."));
            return false;
        }
        MultiTransitLinesLeg multiTransitLinesLeg2 = (MultiTransitLinesLeg) itinerary.mo48295u0().get(g);
        if (i == multiTransitLinesLeg2.f42087c) {
            return false;
        }
        multiTransitLinesLeg2.f42087c = i;
        multiTransitLinesLeg2.mo48440b();
        WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) leg;
        waitToMultiTransitLinesLeg.f42118c = i;
        waitToMultiTransitLinesLeg.mo48467b();
        return true;
    }

    /* renamed from: E */
    public static boolean m42468E(Leg leg, Context context) {
        int type = leg.getType();
        if (type != 2) {
            if (type != 3) {
                if (type != 9) {
                    if (type != 10) {
                        if (type == 12 && -15 <= C7925b.m18026n(System.currentTimeMillis(), leg.mo48331K1().mo24631g())) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            C19047a.C19048a aVar = C19047a.f48441d;
            return ((C20950l0) ((C19047a) context.getSystemService("user_configuration")).mo51505b(C19053d.f48484w)).mo53021b(Long.valueOf(C7925b.m18026n(System.currentTimeMillis(), leg.mo48331K1().mo24631g())));
        }
        C19047a.C19048a aVar2 = C19047a.f48441d;
        return ((C20950l0) ((C19047a) context.getSystemService("user_configuration")).mo51505b(C19053d.f48484w)).mo53021b(Long.valueOf(C7925b.m18026n(System.currentTimeMillis(), leg.mo48339o1().mo24631g())));
    }

    /* renamed from: a */
    public static boolean m42469a(Itinerary itinerary, int i) {
        for (Leg type : itinerary.mo48295u0()) {
            if (type.getType() == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m42470b(Itinerary itinerary, int... iArr) {
        return m42476h(itinerary.mo48295u0(), -1, iArr) != null;
    }

    /* renamed from: c */
    public static int m42471c(Itinerary itinerary) {
        int i = 0;
        if (itinerary != null) {
            for (Leg next : itinerary.mo48295u0()) {
                if (next.getType() == 9 && ((MultiTransitLinesLeg) next).f42086b.size() > 1) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: d */
    public static int m42472d(Itinerary itinerary) {
        int i = 0;
        if (itinerary != null) {
            for (Leg type : itinerary.mo48295u0()) {
                if (f43689b.contains(Integer.valueOf(type.getType()))) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public static int m42473e(Itinerary itinerary) {
        int i = 0;
        if (itinerary == null) {
            return 0;
        }
        for (Leg next : itinerary.mo48295u0()) {
            int type = next.getType();
            if (type == 10) {
                if (!((WaitToMultiTransitLinesLeg) next).mo48467b().f42140k) {
                }
            } else if (type == 3) {
                if (!((WaitToTransitLineLeg) next).f42140k) {
                }
            }
            i++;
        }
        return i;
    }

    /* renamed from: f */
    public static View m42474f(ViewGroup viewGroup, WaitToTransitLineLeg waitToTransitLineLeg) {
        TransitLine transitLine;
        if (!waitToTransitLineLeg.f42140k || (transitLine = waitToTransitLineLeg.f42135f.get()) == null) {
            return null;
        }
        String str = transitLine.mo24369b().f23697e;
        String f = waitToTransitLineLeg.mo48334e2().mo24313f();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C19742t.transit_line_leg_wait_on_vehicle_alert, viewGroup, false);
        FormatTextView formatTextView = (FormatTextView) inflate.findViewById(C19740r.text);
        formatTextView.setArguments(str, f);
        inflate.setContentDescription(formatTextView.getText());
        return inflate;
    }

    /* renamed from: g */
    public static int m42475g(List<Leg> list, Leg leg) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(leg)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static Leg m42476h(List<Leg> list, int i, int... iArr) {
        Leg leg;
        do {
            i++;
            if (i >= list.size()) {
                return null;
            }
            leg = list.get(i);
        } while (!C24361g.m61132B(iArr, leg.getType()));
        return leg;
    }

    /* renamed from: i */
    public static Leg m42477i(List<Leg> list, int i, int... iArr) {
        Leg leg;
        do {
            i--;
            if (i < 0) {
                return null;
            }
            leg = list.get(i);
        } while (!C24361g.m61132B(iArr, leg.getType()));
        return leg;
    }

    /* renamed from: j */
    public static ArrayList m42478j(Context context, List list) {
        return C13720d.m34273c(list, (C13722f) null, new C16782k(context));
    }

    /* renamed from: k */
    public static CharSequence m42479k(Context context, TransitLine transitLine) {
        C16181a.C16183b bVar = new C16181a.C16183b();
        HashSet hashSet = C19728f.f50164e;
        ((C19728f) context.getSystemService("metro_context")).mo52082b(LinePresentationType.ITINERARY).mo48496a(context, bVar, transitLine);
        CharSequence charSequence = bVar.f42181c;
        boolean z = !C20964s0.m49090h(charSequence);
        CharSequence charSequence2 = bVar.f42182d;
        boolean z2 = !C20964s0.m49090h(charSequence2);
        if (z && z2) {
            return C20964s0.m49102t(context.getString(C19746x.string_list_delimiter_dot), charSequence, charSequence2);
        } else if (z) {
            return charSequence;
        } else {
            if (z2) {
                return charSequence2;
            }
            return transitLine.mo24369b().f23697e;
        }
    }

    /* renamed from: l */
    public static int m42480l(C16769e.C16772c cVar, ServerId serverId) {
        C17133e eVar;
        if (cVar == null || (eVar = cVar.f43665c.get(serverId)) == null) {
            return -1;
        }
        return eVar.f44364c;
    }

    /* renamed from: m */
    public static int m42481m(C16769e.C16772c cVar, ServerId serverId) {
        C17133e eVar;
        if (cVar == null || (eVar = cVar.f43665c.get(serverId)) == null) {
            return -1;
        }
        return eVar.f44363b;
    }

    /* renamed from: n */
    public static Time m42482n(Time time) {
        if (time != null) {
            return new Time(time.f23901b - 1);
        }
        return null;
    }

    /* renamed from: o */
    public static LinkedHashSet<DbEntityRef<TransitLine>> m42483o(List<Leg> list) {
        C16784a aVar = new C16784a();
        for (Leg i0 : list) {
            i0.mo48338i0(aVar);
        }
        return aVar.f43690b;
    }

    /* renamed from: p */
    public static LinkedHashSet<DbEntityRef<TransitStop>> m42484p(List<Leg> list) {
        C16785b bVar = new C16785b();
        for (Leg i0 : list) {
            i0.mo48338i0(bVar);
        }
        return bVar.f43691b;
    }

    /* renamed from: q */
    public static long m42485q(Itinerary itinerary, TimeUnit timeUnit) {
        return timeUnit.convert(itinerary.mo48288K1().mo24631g() - itinerary.mo48294o1().mo24631g(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: r */
    public static String m42486r(Context context, Itinerary itinerary) {
        return C7925b.m18019g(context, m42485q(itinerary, TimeUnit.MILLISECONDS));
    }

    /* renamed from: s */
    public static long m42487s(Itinerary itinerary, TimeUnit timeUnit) {
        long j = 0;
        if (itinerary != null) {
            for (Leg next : itinerary.mo48295u0()) {
                if (next.getType() == 1) {
                    j += m42488t(next, timeUnit);
                }
            }
        }
        return j;
    }

    /* renamed from: t */
    public static long m42488t(Leg leg, TimeUnit timeUnit) {
        return timeUnit.convert(leg.mo48331K1().mo24631g() - leg.mo48339o1().mo24631g(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: u */
    public static Leg m42489u(int i, List list) {
        if (i < 0 || i >= list.size() - 1) {
            return null;
        }
        return (Leg) list.get(i + 1);
    }

    /* renamed from: v */
    public static TransitLineLeg m42490v(Leg leg) {
        if (leg instanceof MultiTransitLinesLeg) {
            return ((MultiTransitLinesLeg) leg).mo48440b();
        }
        if (leg instanceof TransitLineLeg) {
            return (TransitLineLeg) leg;
        }
        return null;
    }

    /* renamed from: w */
    public static Schedule m42491w(C16769e.C16772c cVar, Leg leg, boolean z) {
        Set<Leg> singleton = Collections.singleton(leg);
        C16787d dVar = new C16787d(cVar, z);
        for (Leg i0 : singleton) {
            i0.mo48338i0(dVar);
        }
        if (dVar.f43694d.isEmpty()) {
            return null;
        }
        return Schedule.m17781C(dVar.f43694d);
    }

    /* renamed from: x */
    public static ServiceStatusCategory m42492x(Leg leg) {
        LineServiceAlertDigest lineServiceAlertDigest = (LineServiceAlertDigest) leg.mo48338i0(new C16786c());
        if (lineServiceAlertDigest != null) {
            return lineServiceAlertDigest.f23186c.f23213b;
        }
        return ServiceStatusCategory.UNKNOWN;
    }

    /* renamed from: y */
    public static String m42493y(Context context, Schedule schedule) {
        List g = C13717b.m34260g(3, C13717b.m34265l(schedule.mo24327n(), new C19765f(1)));
        if (g.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            sb.append(C7925b.m18024l(context, ((Time) g.get(i)).mo24631g()));
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* renamed from: z */
    public static ArrayList m42494z(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
        ArrayList arrayList = new ArrayList();
        for (WaitToTransitLineLeg waitToTransitLineLeg : waitToMultiTransitLinesLeg.f42117b) {
            LineServiceAlertDigest lineServiceAlertDigest = waitToTransitLineLeg.f42139j;
            if (lineServiceAlertDigest != null) {
                arrayList.add(lineServiceAlertDigest);
            }
        }
        return arrayList;
    }
}
