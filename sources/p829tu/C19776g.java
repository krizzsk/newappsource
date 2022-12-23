package p829tu;

import android.content.Context;
import android.graphics.Point;
import c00.C13720d;
import c00.C13721e;
import c00.C13722f;
import c70.C13749c;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.tod.model.TodDaysOfWeek;
import com.moovit.app.tod.model.TodSubscriptionJourneyInfo;
import com.moovit.app.tod.model.TodSubscriptionOrderInfo;
import com.moovit.app.tod.model.TodSubscriptionShuttleInfo;
import com.moovit.app.tod.model.TodWeeklyShuttleSubscription;
import com.moovit.commons.request.BadResponseException;
import com.moovit.image.model.Image;
import com.moovit.map.items.C16283a;
import com.moovit.map.items.MapItem;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegMissingFare;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegPurchasableFare;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.DayTime;
import com.tranzmate.moovit.protocol.common.MVDayTime;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingItineraryFare;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingItineraryLegFare;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingItineraryMissingFare;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscription;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionJourneyInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionOrderInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionShuttleInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodWeeklyShuttleSubscription;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType;
import p543hq.C17478e;
import p596jx.C17964m;
import p80.C12991b;
import p810sz.C19617r;
import q80.C13036y;

/* renamed from: tu.g */
public final /* synthetic */ class C19776g implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f50272b;

    /* renamed from: c */
    public final /* synthetic */ Object f50273c;

    public /* synthetic */ C19776g(Object obj, int i) {
        this.f50272b = i;
        this.f50273c = obj;
    }

    public final Object convert(Object obj) {
        boolean z;
        TicketItineraryLegPurchasableFare.Type type;
        DayTime dayTime;
        boolean z2 = true;
        switch (this.f50272b) {
            case 0:
                C19778i iVar = (C19778i) this.f50273c;
                iVar.getClass();
                return Tasks.call(MoovitExecutors.f37327IO, new C16283a(iVar.f50276b, MapItem.Type.STOP, (Point) obj));
            case 1:
                Context context = (Context) this.f50273c;
                MVTodSubscription mVTodSubscription = (MVTodSubscription) obj;
                F f = mVTodSubscription.setField_;
                F f2 = MVTodSubscription._Fields.WEEKLY_SHUTTLE_SUBSCRIPTION;
                if (f != f2) {
                    z2 = false;
                }
                if (!z2) {
                    throw new BadResponseException("Unsupported tod subscription result");
                } else if (f == f2) {
                    MVTodWeeklyShuttleSubscription mVTodWeeklyShuttleSubscription = (MVTodWeeklyShuttleSubscription) mVTodSubscription.value_;
                    String str = mVTodWeeklyShuttleSubscription.f29693id;
                    DayTime dayTime2 = null;
                    TodDaysOfWeek todDaysOfWeek = new TodDaysOfWeek(C13720d.m34277g(mVTodWeeklyShuttleSubscription.enrolledDays.includedDays, (C13722f) null, new C17478e(4)));
                    MVTodSubscriptionShuttleInfo mVTodSubscriptionShuttleInfo = mVTodWeeklyShuttleSubscription.shuttleInfo;
                    String str2 = mVTodSubscriptionShuttleInfo.patternId;
                    String str3 = mVTodSubscriptionShuttleInfo.patternName;
                    ServerId serverId = new ServerId(mVTodSubscriptionShuttleInfo.taxiProviderId);
                    Image c = C17964m.m44596c(context, serverId);
                    MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo = mVTodSubscriptionShuttleInfo.journeyInfo;
                    LocationDescriptor j = C13749c.m34324j(mVTodSubscriptionJourneyInfo.pickup, (MVLocationSourceType) null);
                    if (mVTodSubscriptionJourneyInfo.mo33818i()) {
                        MVDayTime mVDayTime = mVTodSubscriptionJourneyInfo.pickupDayTime;
                        dayTime = new DayTime(mVDayTime.hourOfDay, mVDayTime.minutes, 0);
                    } else {
                        dayTime = null;
                    }
                    LocationDescriptor j2 = C13749c.m34324j(mVTodSubscriptionJourneyInfo.dropoff, (MVLocationSourceType) null);
                    if (mVTodSubscriptionJourneyInfo.mo33814f()) {
                        MVDayTime mVDayTime2 = mVTodSubscriptionJourneyInfo.dropOffDayTime;
                        dayTime2 = new DayTime(mVDayTime2.hourOfDay, mVDayTime2.minutes, 0);
                    }
                    TodSubscriptionJourneyInfo todSubscriptionJourneyInfo = new TodSubscriptionJourneyInfo(j, dayTime, j2, dayTime2);
                    MVTodSubscriptionOrderInfo mVTodSubscriptionOrderInfo = mVTodSubscriptionShuttleInfo.orderInfo;
                    return new TodWeeklyShuttleSubscription(str, todDaysOfWeek, new TodSubscriptionShuttleInfo(str2, str3, serverId, c, todSubscriptionJourneyInfo, new TodSubscriptionOrderInfo(mVTodSubscriptionOrderInfo.numberOfPassengers, C13749c.m34318d(mVTodSubscriptionOrderInfo.price))));
                } else {
                    MVTodSubscription.m29502k((MVTodSubscription._Fields) mVTodSubscription.setField_);
                    throw new RuntimeException("Cannot get field 'weeklyShuttleSubscription' because union is currently set to weeklyShuttleSubscription");
                }
            default:
                C12991b bVar = (C12991b) this.f50273c;
                MVTicketingItineraryFare mVTicketingItineraryFare = (MVTicketingItineraryFare) obj;
                C19617r rVar = C13036y.f32248a;
                F f3 = mVTicketingItineraryFare.setField_;
                F f4 = MVTicketingItineraryFare._Fields.FARE;
                if (f3 == f4) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    F f5 = MVTicketingItineraryFare._Fields.MISSING_FARE;
                    if (f3 != f5) {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalStateException("Unknown leg fare: " + mVTicketingItineraryFare);
                    } else if (f3 == f5) {
                        return new TicketItineraryLegMissingFare(((MVTicketingItineraryMissingFare) mVTicketingItineraryFare.value_).fareName);
                    } else {
                        StringBuilder k = C13555b.m33972k("Cannot get field 'missingFare' because union is currently set to ");
                        k.append(MVTicketingItineraryFare.m28691k((MVTicketingItineraryFare._Fields) mVTicketingItineraryFare.setField_).f63355a);
                        throw new RuntimeException(k.toString());
                    }
                } else if (f3 == f4) {
                    MVTicketingItineraryLegFare mVTicketingItineraryLegFare = (MVTicketingItineraryLegFare) mVTicketingItineraryFare.value_;
                    TicketFare f6 = C13036y.m32954f(bVar, mVTicketingItineraryLegFare.fare);
                    int i = C13036y.C13037a.f32251c[mVTicketingItineraryLegFare.type.ordinal()];
                    if (i == 1) {
                        type = TicketItineraryLegPurchasableFare.Type.PURCHASABLE;
                    } else if (i == 2) {
                        type = TicketItineraryLegPurchasableFare.Type.INCLUDED;
                    } else {
                        throw new IllegalStateException("Unknown purchasable fare type");
                    }
                    return new TicketItineraryLegPurchasableFare(f6, type);
                } else {
                    StringBuilder k2 = C13555b.m33972k("Cannot get field 'fare' because union is currently set to ");
                    k2.append(MVTicketingItineraryFare.m28691k((MVTicketingItineraryFare._Fields) mVTicketingItineraryFare.setField_).f63355a);
                    throw new RuntimeException(k2.toString());
                }
        }
    }
}
