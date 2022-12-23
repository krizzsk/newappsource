package p714ow;

import c00.C13717b;
import c00.C13723g;
import c00.C13733n;
import c70.C13749c;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.app.surveys.recorder.events.SurveyEvent;
import com.moovit.app.surveys.recorder.events.SurveyItineraryEvent;
import com.moovit.app.surveys.recorder.events.SurveyLineGroupEvent;
import com.moovit.app.surveys.recorder.events.SurveyStopEvent;
import com.moovit.app.surveys.recorder.events.SurveySuggestedRoutesEvent;
import com.moovit.app.wondo.tickets.model.WondoCampaign;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitActivity;
import com.moovit.util.time.Time;
import com.tranzmate.moovit.protocol.surveys.MVItineraryEvent;
import com.tranzmate.moovit.protocol.surveys.MVSuggestedRoutesEvent;
import com.tranzmate.moovit.protocol.surveys.MVSurveyEvent;
import com.tranzmate.moovit.protocol.surveys.MVSurveyLineGroupEvent;
import com.tranzmate.moovit.protocol.surveys.MVSurveyStopEvent;
import com.tranzmate.moovit.protocol.tripplanner.MVJourney;
import com.tranzmate.moovit.protocol.tripplanner.MVTime;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItinerary;
import com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineAlternative;
import com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineLegDepartureTimes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import k40.C5479c;
import m50.C18331g;
import p252sb.C6501a;
import p372at.C13520f;
import p394br.C13659e;
import p595jw.C17948a;
import p810sz.C19617r;

/* renamed from: ow.b */
public final /* synthetic */ class C18848b implements C13733n {

    /* renamed from: b */
    public final /* synthetic */ int f47989b;

    public /* synthetic */ C18848b(int i) {
        this.f47989b = i;
    }

    public final Object convert(Object obj) {
        List<String> list;
        Itinerary itinerary;
        switch (this.f47989b) {
            case 0:
                SurveyEvent surveyEvent = (SurveyEvent) obj;
                C19617r rVar = C17948a.f46011a;
                int i = surveyEvent.f39879b;
                if (i == 0) {
                    SurveyLineGroupEvent surveyLineGroupEvent = (SurveyLineGroupEvent) surveyEvent;
                    long j = surveyLineGroupEvent.f39880c;
                    int i2 = surveyLineGroupEvent.mo46047c().getServerId().f15142b;
                    MVSurveyLineGroupEvent mVSurveyLineGroupEvent = new MVSurveyLineGroupEvent();
                    mVSurveyLineGroupEvent.timestamp = j;
                    mVSurveyLineGroupEvent.mo31965q();
                    mVSurveyLineGroupEvent.lineGroupId = i2;
                    mVSurveyLineGroupEvent.mo31961l();
                    if (surveyLineGroupEvent.mo46048d() != null) {
                        mVSurveyLineGroupEvent.lineId = surveyLineGroupEvent.mo46048d().getServerId().f15142b;
                        mVSurveyLineGroupEvent.mo31962m();
                    }
                    if (surveyLineGroupEvent.mo46050f() != null) {
                        mVSurveyLineGroupEvent.stopId = surveyLineGroupEvent.mo46050f().getServerId().f15142b;
                        mVSurveyLineGroupEvent.mo31964p();
                    }
                    LatLonE6 latLonE6 = surveyLineGroupEvent.f39888g;
                    if (latLonE6 != null) {
                        mVSurveyLineGroupEvent.userLocation = C13749c.m34332r(latLonE6);
                    }
                    Time time = surveyLineGroupEvent.f39889h;
                    if (time != null) {
                        mVSurveyLineGroupEvent.nextDeparture = time.mo24631g();
                        mVSurveyLineGroupEvent.mo31963o();
                    }
                    new Time(surveyLineGroupEvent.f39880c).toString();
                    Objects.toString(surveyLineGroupEvent.mo46047c());
                    Objects.toString(surveyLineGroupEvent.mo46048d());
                    Objects.toString(surveyLineGroupEvent.mo46050f());
                    Objects.toString(surveyLineGroupEvent.f39888g);
                    Objects.toString(surveyLineGroupEvent.f39889h);
                    MVSurveyEvent mVSurveyEvent = new MVSurveyEvent();
                    mVSurveyEvent.setField_ = MVSurveyEvent._Fields.LINE_GROUP_EVENT;
                    mVSurveyEvent.value_ = mVSurveyLineGroupEvent;
                    return mVSurveyEvent;
                } else if (i == 1) {
                    SurveyStopEvent surveyStopEvent = (SurveyStopEvent) surveyEvent;
                    long j2 = surveyStopEvent.f39880c;
                    int i3 = surveyStopEvent.mo46054c().getServerId().f15142b;
                    MVSurveyStopEvent mVSurveyStopEvent = new MVSurveyStopEvent();
                    mVSurveyStopEvent.timestamp = j2;
                    mVSurveyStopEvent.mo31997o();
                    mVSurveyStopEvent.stopId = i3;
                    mVSurveyStopEvent.mo31996m();
                    LatLonE6 latLonE62 = surveyStopEvent.f39892e;
                    if (latLonE62 != null) {
                        mVSurveyStopEvent.userLocation = C13749c.m34332r(latLonE62);
                        LatLonE6 latLonE63 = surveyStopEvent.f39892e;
                        LatLonE6 latLonE64 = surveyStopEvent.mo46054c().get().f23732d;
                        latLonE63.getClass();
                        mVSurveyStopEvent.distance = Math.round(LatLonE6.m40174c(latLonE63, latLonE64));
                        mVSurveyStopEvent.mo31994k();
                    }
                    Time time2 = surveyStopEvent.f39893f;
                    if (time2 != null) {
                        mVSurveyStopEvent.nextDeparture = time2.mo24631g();
                        mVSurveyStopEvent.mo31995l();
                    }
                    new Time(surveyStopEvent.f39880c).toString();
                    Objects.toString(surveyStopEvent.mo46054c());
                    Objects.toString(surveyStopEvent.f39892e);
                    Objects.toString(surveyStopEvent.f39893f);
                    MVSurveyEvent mVSurveyEvent2 = new MVSurveyEvent();
                    mVSurveyEvent2.setField_ = MVSurveyEvent._Fields.STOP_EVENT;
                    mVSurveyEvent2.value_ = mVSurveyStopEvent;
                    return mVSurveyEvent2;
                } else if (i == 2) {
                    SurveySuggestedRoutesEvent surveySuggestedRoutesEvent = (SurveySuggestedRoutesEvent) surveyEvent;
                    HistoryItem historyItem = surveySuggestedRoutesEvent.f39896e;
                    if (historyItem != null) {
                        ArrayList c = C13723g.m34282c((List) historyItem.mo45080Z1(new C13520f()), new C13659e(1));
                        if (c.isEmpty()) {
                            list = Collections.emptyList();
                        } else {
                            list = Collections.singletonList(((Itinerary) c.get(0)).f41894b);
                        }
                        Time time3 = null;
                        if (!c.isEmpty()) {
                            itinerary = (Itinerary) Collections.max(c, new C6501a(2));
                        } else {
                            itinerary = null;
                        }
                        new Time(surveySuggestedRoutesEvent.f39880c).toString();
                        C13717b.m34269p(list);
                        if (itinerary != null) {
                            time3 = itinerary.mo48288K1();
                        }
                        Objects.toString(time3);
                        long j3 = surveySuggestedRoutesEvent.f39880c;
                        MVSuggestedRoutesEvent mVSuggestedRoutesEvent = new MVSuggestedRoutesEvent();
                        mVSuggestedRoutesEvent.timestamp = j3;
                        mVSuggestedRoutesEvent.mo31927j();
                        mVSuggestedRoutesEvent.itineraryGuids = list;
                        if (itinerary != null) {
                            mVSuggestedRoutesEvent.lastArrival = itinerary.mo48288K1().mo24631g();
                            mVSuggestedRoutesEvent.mo31926i();
                        }
                        MVSurveyEvent mVSurveyEvent3 = new MVSurveyEvent();
                        mVSurveyEvent3.setField_ = MVSurveyEvent._Fields.SUGGESTED_ROUTES_EVENT;
                        mVSurveyEvent3.value_ = mVSuggestedRoutesEvent;
                        return mVSurveyEvent3;
                    }
                    throw new IllegalStateException("Did you called SurveyEvent.resolve(...)?");
                } else if (i == 3) {
                    SurveyItineraryEvent surveyItineraryEvent = (SurveyItineraryEvent) surveyEvent;
                    MVTripPlanItinerary q = C16080a.m40961q(surveyItineraryEvent.mo46042c());
                    MVJourney mVJourney = new MVJourney(C13749c.m34335u(surveyItineraryEvent.mo46042c().mo48289b().mo48332W()), C13749c.m34335u(surveyItineraryEvent.mo46042c().mo48290c().mo48334e2()));
                    new Time(surveyItineraryEvent.f39880c).toString();
                    String str = surveyItineraryEvent.mo46042c().f41894b;
                    surveyItineraryEvent.mo46042c().mo48289b().mo48332W().mo24313f();
                    surveyItineraryEvent.mo46042c().mo48290c().mo48334e2().mo24313f();
                    long j4 = surveyItineraryEvent.f39880c;
                    MVItineraryEvent mVItineraryEvent = new MVItineraryEvent();
                    mVItineraryEvent.timestamp = j4;
                    mVItineraryEvent.mo31869i();
                    mVItineraryEvent.itinerary = q;
                    mVItineraryEvent.journey = mVJourney;
                    MVSurveyEvent mVSurveyEvent4 = new MVSurveyEvent();
                    mVSurveyEvent4.setField_ = MVSurveyEvent._Fields.ITINERARY_EVENT;
                    mVSurveyEvent4.value_ = mVItineraryEvent;
                    return mVSurveyEvent4;
                } else {
                    StringBuilder k = C13555b.m33972k("Unknown survey event type: ");
                    k.append(surveyEvent.f39879b);
                    throw new IllegalStateException(k.toString());
                }
            case 1:
                return ((WondoCampaign) obj).f40694b;
            case 2:
                return Integer.valueOf(((ServerId) obj).f15142b);
            case 3:
                WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) obj;
                MVTime v = C16080a.m40966v(waitToTransitLineLeg);
                int c2 = C5479c.m13666c(waitToTransitLineLeg.f42135f);
                MVWaitToLineLegDepartureTimes A = C16080a.m40940A(waitToTransitLineLeg.f42138i);
                boolean z = waitToTransitLineLeg.f42140k;
                MVWaitToLineAlternative mVWaitToLineAlternative = new MVWaitToLineAlternative();
                mVWaitToLineAlternative.time = v;
                mVWaitToLineAlternative.waitToLineId = c2;
                mVWaitToLineAlternative.mo34829l();
                mVWaitToLineAlternative.futureDepartureTimes = A;
                mVWaitToLineAlternative.waitOnVehicle = z;
                mVWaitToLineAlternative.mo34828k();
                return mVWaitToLineAlternative;
            case 5:
                return Boolean.valueOf(((C18331g) obj).mo50785m2());
            default:
                return ((PurchaseSplitActivity) obj).f23285Y;
        }
    }
}
