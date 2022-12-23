package com.moovit.app.itinerary;

import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import com.moovit.app.itinerary.view.NextArrivalsView;
import com.moovit.app.itinerary.view.SingleLegCard;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.Schedule;
import com.moovit.util.time.Time;
import e20.C16769e;
import e20.C16783l;
import java.util.ArrayList;
import java.util.List;
import p019b0.C1436m;
import p241s0.C6302b;
import p641lu.C18277b;
import p716oy.C18860a;
import p952yy.C20787c;

/* renamed from: com.moovit.app.itinerary.j */
public final class C15054j extends C16769e {

    /* renamed from: m */
    public final /* synthetic */ ItineraryStepsBaseActivity f38593m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15054j(ItineraryStepsBaseActivity itineraryStepsBaseActivity, Context context) {
        super(context);
        this.f38593m = itineraryStepsBaseActivity;
    }

    /* renamed from: f */
    public final void mo45154f(C16769e.C16772c cVar) {
        Schedule schedule;
        Time time;
        C16769e.C16772c cVar2 = cVar;
        ItineraryStepsBaseActivity itineraryStepsBaseActivity = this.f38593m;
        itineraryStepsBaseActivity.f38503m0.mo45314e(itineraryStepsBaseActivity.f38499X, cVar2);
        List<Leg> u0 = itineraryStepsBaseActivity.f38499X.mo48295u0();
        int size = u0.size();
        for (int i = 0; i < size; i++) {
            int H2 = itineraryStepsBaseActivity.mo45282H2(i);
            ViewPager viewPager = itineraryStepsBaseActivity.f38502l0;
            SingleLegCard singleLegCard = (SingleLegCard) viewPager.mo47352a(viewPager.mo47354c(H2));
            if (singleLegCard != null) {
                Leg leg = u0.get(i);
                int type = leg.getType();
                if (type == 1) {
                    LocationDescriptor.LocationType locationType = LocationDescriptor.LocationType.BICYCLE_STOP;
                    C18277b bVar = C16783l.f43688a;
                    if (leg.mo48334e2().mo24316j(locationType)) {
                        singleLegCard.mo45356N(C16783l.m42481m(cVar2, leg.mo48334e2().f23649d));
                    }
                } else if (type == 3) {
                    Time time2 = null;
                    WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) leg;
                    ServerId serverId = waitToTransitLineLeg.f42135f.getServerId();
                    ServerId serverId2 = waitToTransitLineLeg.f42136g.getServerId();
                    ServerId serverId3 = waitToTransitLineLeg.f42137h.getServerId();
                    if (C18860a.m45884a().f48029q) {
                        time2 = C16783l.m42482n(leg.mo48331K1());
                    }
                    C20787c b = cVar2.mo49467b(serverId, serverId2, serverId3, time2);
                    if (b == null || b.f52458c.isEmpty()) {
                        schedule = waitToTransitLineLeg.f42138i.f42142b;
                    } else {
                        schedule = b.f52458c;
                    }
                    if (singleLegCard.f38681Q.getType() == 3) {
                        singleLegCard.f38684T = schedule;
                        NextArrivalsView nextArrivalsView = singleLegCard.f38687m0;
                        if (nextArrivalsView != null) {
                            nextArrivalsView.mo45343a((WaitToTransitLineLeg) singleLegCard.f38681Q, schedule);
                        }
                    }
                    itineraryStepsBaseActivity.mo45284J2(i, H2, u0, schedule);
                } else if (type == 10) {
                    List<WaitToTransitLineLeg> list = ((WaitToMultiTransitLinesLeg) leg).f42117b;
                    ArrayList arrayList = new ArrayList(list.size());
                    C6302b bVar2 = new C6302b(list.size());
                    for (WaitToTransitLineLeg next : list) {
                        ServerId serverId4 = next.f42135f.getServerId();
                        ServerId serverId5 = next.f42136g.getServerId();
                        ServerId serverId6 = next.f42137h.getServerId();
                        if (C18860a.m45884a().f48029q) {
                            time = C16783l.m42482n(next.f42132c);
                        } else {
                            time = null;
                        }
                        C20787c b2 = cVar2.mo49467b(serverId4, serverId5, serverId6, time);
                        if (b2 != null && !b2.f52458c.isEmpty()) {
                            bVar2.put(serverId4, b2);
                            arrayList.add(b2.f52458c);
                        }
                    }
                    Schedule C = Schedule.m17781C(arrayList);
                    if (singleLegCard.f38681Q.getType() == 10) {
                        ArrayList<O> c = C13720d.m34273c(((WaitToMultiTransitLinesLeg) singleLegCard.f38681Q).f42117b, (C13722f) null, new C1436m(bVar2, 1));
                        singleLegCard.f38684T = C;
                        NextArrivalsView nextArrivalsView2 = singleLegCard.f38687m0;
                        if (nextArrivalsView2 != null) {
                            nextArrivalsView2.setLinesSchedules(c);
                        }
                    }
                    itineraryStepsBaseActivity.mo45284J2(i, H2, u0, C);
                } else if (type == 12) {
                    LocationDescriptor.LocationType locationType2 = LocationDescriptor.LocationType.BICYCLE_STOP;
                    C18277b bVar3 = C16783l.f43688a;
                    if (leg.mo48334e2().mo24316j(locationType2)) {
                        singleLegCard.mo45356N(C16783l.m42480l(cVar2, leg.mo48334e2().f23649d));
                    }
                }
            }
        }
    }
}
