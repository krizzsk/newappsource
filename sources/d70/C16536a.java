package d70;

import c70.C13749c;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polylon;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.ridesharing.model.Event;
import com.moovit.ridesharing.model.EventBookingOption;
import com.moovit.ridesharing.model.EventDriver;
import com.moovit.ridesharing.model.EventInstance;
import com.moovit.ridesharing.model.EventRequest;
import com.moovit.ridesharing.model.EventRide;
import com.moovit.ridesharing.model.EventVehicleType;
import com.moovit.ridesharing.model.RideSharingRegistrationSteps;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.moovit.protocol.carpool.MVDriverRouteDetails;
import com.tranzmate.moovit.protocol.carpool.MVPassengerStops;
import com.tranzmate.moovit.protocol.carpool.MVRide;
import com.tranzmate.moovit.protocol.carpool.MVRideLocationDescriptor;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVDirection;
import com.tranzmate.moovit.protocol.common.MVVehicleType;
import com.tranzmate.moovit.protocol.ridesharing.MVEventRegistrationSteps;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEvent;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEventTransitOption;
import com.tranzmate.moovit.protocol.ridesharing.MVRSSuperEvent;
import com.tranzmate.moovit.protocol.ridesharing.MVRideEntityId;
import java.util.Collections;
import java.util.List;
import p977zz.C20964s0;
import x00.C20440a;

/* renamed from: d70.a */
public final class C16536a {

    /* renamed from: d70.a$a */
    public static /* synthetic */ class C16537a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43164a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f43165b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f43166c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f43167d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f43168e;

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|27|28|(2:29|30)|31|33|34|35|36|(2:37|38)|39|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|(2:29|30)|31|33|34|35|36|37|38|39|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|(2:29|30)|31|33|34|35|36|37|38|39|41|42|43|44|45|46|48) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0098 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00bd */
        static {
            /*
                com.tranzmate.moovit.protocol.carpool.MVInvitationState[] r0 = com.tranzmate.moovit.protocol.carpool.MVInvitationState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43168e = r0
                r1 = 1
                com.tranzmate.moovit.protocol.carpool.MVInvitationState r2 = com.tranzmate.moovit.protocol.carpool.MVInvitationState.INTERESTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f43168e     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.carpool.MVInvitationState r3 = com.tranzmate.moovit.protocol.carpool.MVInvitationState.REJECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f43168e     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.carpool.MVInvitationState r4 = com.tranzmate.moovit.protocol.carpool.MVInvitationState.APPROVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f43168e     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.carpool.MVInvitationState r5 = com.tranzmate.moovit.protocol.carpool.MVInvitationState.CANCELED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus[] r4 = com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f43167d = r4
                com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus r5 = com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus.WAITING     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f43167d     // Catch:{ NoSuchFieldError -> 0x004e }
                com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus r5 = com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus.CANCELED_BY_PASSENGER     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = f43167d     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus r5 = com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus.FULFILLED     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r4 = f43167d     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus r5 = com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus.UNFULFILLED     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                com.tranzmate.moovit.protocol.common.MVDirection[] r3 = com.tranzmate.moovit.protocol.common.MVDirection.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f43166c = r3
                com.tranzmate.moovit.protocol.common.MVDirection r4 = com.tranzmate.moovit.protocol.common.MVDirection.Forward     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r3 = f43166c     // Catch:{ NoSuchFieldError -> 0x007d }
                com.tranzmate.moovit.protocol.common.MVDirection r4 = com.tranzmate.moovit.protocol.common.MVDirection.Backward     // Catch:{ NoSuchFieldError -> 0x007d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                com.moovit.ridesharing.model.EventVehicleType[] r3 = com.moovit.ridesharing.model.EventVehicleType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f43165b = r3
                com.moovit.ridesharing.model.EventVehicleType r4 = com.moovit.ridesharing.model.EventVehicleType.BUS     // Catch:{ NoSuchFieldError -> 0x008e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                int[] r3 = f43165b     // Catch:{ NoSuchFieldError -> 0x0098 }
                com.moovit.ridesharing.model.EventVehicleType r4 = com.moovit.ridesharing.model.EventVehicleType.MINIBUS     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                int[] r3 = f43165b     // Catch:{ NoSuchFieldError -> 0x00a2 }
                com.moovit.ridesharing.model.EventVehicleType r4 = com.moovit.ridesharing.model.EventVehicleType.TAXI     // Catch:{ NoSuchFieldError -> 0x00a2 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a2 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x00a2 }
            L_0x00a2:
                com.tranzmate.moovit.protocol.common.MVVehicleType[] r3 = com.tranzmate.moovit.protocol.common.MVVehicleType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f43164a = r3
                com.tranzmate.moovit.protocol.common.MVVehicleType r4 = com.tranzmate.moovit.protocol.common.MVVehicleType.BUS     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                int[] r1 = f43164a     // Catch:{ NoSuchFieldError -> 0x00bd }
                com.tranzmate.moovit.protocol.common.MVVehicleType r3 = com.tranzmate.moovit.protocol.common.MVVehicleType.MINIBUS     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00bd:
                int[] r0 = f43164a     // Catch:{ NoSuchFieldError -> 0x00c7 }
                com.tranzmate.moovit.protocol.common.MVVehicleType r1 = com.tranzmate.moovit.protocol.common.MVVehicleType.TAXI     // Catch:{ NoSuchFieldError -> 0x00c7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c7 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c7 }
            L_0x00c7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d70.C16536a.C16537a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static Event m42029a(MVRSSuperEvent mVRSSuperEvent) {
        long j;
        ServerId serverId = new ServerId(mVRSSuperEvent.superEventId);
        Image g = C16028g.m40829g(mVRSSuperEvent.image);
        String str = mVRSSuperEvent.name;
        String str2 = mVRSSuperEvent.locationDescription;
        String str3 = mVRSSuperEvent.details;
        LatLonE6 h = C13749c.m34322h(mVRSSuperEvent.location);
        long j2 = mVRSSuperEvent.fromTime;
        if (mVRSSuperEvent.mo31380m()) {
            j = mVRSSuperEvent.toTime;
        } else {
            j = -1;
        }
        return new Event(serverId, g, str, str2, str3, h, j2, j);
    }

    /* renamed from: b */
    public static int m42030b(MVDirection mVDirection) {
        int i = C16537a.f43166c[mVDirection.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalStateException("Unknown event direction: " + mVDirection);
    }

    /* renamed from: c */
    public static EventInstance m42031c(MVRSEvent mVRSEvent) {
        Image image;
        String str;
        ServerId serverId;
        Event a = m42029a(mVRSEvent.superEvent);
        ServerId serverId2 = new ServerId(mVRSEvent.eventId);
        if (mVRSEvent.mo31224j()) {
            image = C16028g.m40829g(mVRSEvent.image);
        } else {
            image = a.f42912c;
        }
        Image image2 = image;
        if (mVRSEvent.mo31225k()) {
            str = mVRSEvent.name;
        } else {
            str = a.f42913d;
        }
        String str2 = str;
        long j = mVRSEvent.eventTripTime;
        EventVehicleType f = m42034f(mVRSEvent.vehicleType);
        int b = m42030b(mVRSEvent.direction);
        if (mVRSEvent.mo31219f()) {
            serverId = new ServerId(mVRSEvent.bucketId);
        } else {
            serverId = null;
        }
        return new EventInstance(a, serverId2, image2, str2, j, f, b, serverId);
    }

    /* renamed from: d */
    public static EventRequest.Key m42032d(EventInstance eventInstance, ServerId serverId, ServerId serverId2, MVPassengerStops mVPassengerStops) {
        ServerId serverId3;
        ServerId serverId4 = null;
        if (mVPassengerStops != null) {
            serverId3 = new ServerId(mVPassengerStops.pickUp.stopSeq);
        } else {
            serverId3 = null;
        }
        if (mVPassengerStops != null) {
            serverId4 = new ServerId(mVPassengerStops.dropOff.stopSeq);
        }
        return new EventRequest.Key(eventInstance.f42943b.f42911b, eventInstance.f42944c, serverId, serverId2, serverId3, serverId4);
    }

    /* renamed from: e */
    public static EventRide m42033e(MVRide mVRide, EventDriver eventDriver) {
        long j;
        Polylon polylon;
        int i;
        ServerId serverId = new ServerId(mVRide.rideId);
        long j2 = mVRide.departureTime;
        if (mVRide.mo25848f()) {
            j = mVRide.arrivalTime;
        } else {
            j = mVRide.eventMetadata.eventTripTime;
        }
        long j3 = j;
        if (mVRide.mo25850h()) {
            List<MVDriverRouteDetails> list = mVRide.driverRoutes;
            if (list == null) {
                i = 0;
            } else {
                i = list.size();
            }
            if (i > 0) {
                MVDriverRouteDetails mVDriverRouteDetails = mVRide.driverRoutes.get(0);
                if (mVDriverRouteDetails.mo25607h()) {
                    polylon = Polylon.m40195m(mVDriverRouteDetails.shape);
                    return new EventRide(serverId, j2, j3, polylon, eventDriver);
                }
            }
        }
        polylon = Polylon.m40193b(C13749c.m34322h(mVRide.journey.pickup.latlon), C13749c.m34322h(mVRide.journey.dropoff.latlon));
        return new EventRide(serverId, j2, j3, polylon, eventDriver);
    }

    /* renamed from: f */
    public static EventVehicleType m42034f(MVVehicleType mVVehicleType) {
        int i = C16537a.f43164a[mVVehicleType.ordinal()];
        if (i == 1) {
            return EventVehicleType.BUS;
        }
        if (i == 2) {
            return EventVehicleType.MINIBUS;
        }
        if (i == 3) {
            return EventVehicleType.TAXI;
        }
        throw new IllegalStateException("Unknown event vehicle type: " + mVVehicleType);
    }

    /* renamed from: g */
    public static LocationDescriptor m42035g(MVRideLocationDescriptor mVRideLocationDescriptor) {
        String str = mVRideLocationDescriptor.name;
        String str2 = mVRideLocationDescriptor.address;
        LocationDescriptor k = LocationDescriptor.m17770k(C13749c.m34322h(mVRideLocationDescriptor.latlon));
        if (!C20964s0.m49090h(str)) {
            k.f23651f = str;
        }
        if (!C20964s0.m49090h(str2)) {
            k.f23652g = Collections.singletonList(new C20440a((CharSequence) str2, (String) null));
        }
        return k;
    }

    /* renamed from: h */
    public static RideSharingRegistrationSteps m42036h(MVEventRegistrationSteps mVEventRegistrationSteps) {
        if (mVEventRegistrationSteps == null) {
            return null;
        }
        if (mVEventRegistrationSteps.phoneVerification || mVEventRegistrationSteps.personalName || mVEventRegistrationSteps.personalEmail || mVEventRegistrationSteps.creditCardInformation) {
            return new RideSharingRegistrationSteps(mVEventRegistrationSteps.phoneVerification, mVEventRegistrationSteps.personalName, mVEventRegistrationSteps.personalEmail, mVEventRegistrationSteps.creditCardInformation);
        }
        return null;
    }

    /* renamed from: i */
    public static MVRSEventTransitOption m42037i(EventBookingOption eventBookingOption) {
        boolean z;
        int i = eventBookingOption.f42927b.f15142b;
        long j = eventBookingOption.f42928c;
        MVVehicleType k = m42039k(eventBookingOption.f42929d);
        MVCurrencyAmount p = C13749c.m34330p(eventBookingOption.f42930e);
        MVRSEventTransitOption mVRSEventTransitOption = new MVRSEventTransitOption();
        mVRSEventTransitOption.eventId = i;
        mVRSEventTransitOption.mo31331p();
        mVRSEventTransitOption.eventTripTime = j;
        mVRSEventTransitOption.mo31332q();
        mVRSEventTransitOption.vehicleType = k;
        mVRSEventTransitOption.transitOptionPrice = p;
        if (eventBookingOption.f42931f.f23845c.compareTo(eventBookingOption.f42930e.f23845c) < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mVRSEventTransitOption.discountTransitOptionPrice = C13749c.m34330p(eventBookingOption.f42931f);
        }
        LocationDescriptor locationDescriptor = eventBookingOption.f42933h;
        if (locationDescriptor != null) {
            mVRSEventTransitOption.stopLocation = C13749c.m34335u(locationDescriptor);
        }
        String str = eventBookingOption.f42935j;
        if (str != null) {
            mVRSEventTransitOption.stopRideDetails = str;
        }
        return mVRSEventTransitOption;
    }

    /* renamed from: j */
    public static MVRideEntityId m42038j(EventRequest.Key key) {
        ServerId serverId = key.f42963d;
        if (serverId != null) {
            int i = serverId.f15142b;
            MVRideEntityId mVRideEntityId = new MVRideEntityId();
            mVRideEntityId.setField_ = MVRideEntityId._Fields.RIDE_REQUEST_ID;
            mVRideEntityId.value_ = Integer.valueOf(i);
            return mVRideEntityId;
        }
        ServerId serverId2 = key.f42964e;
        if (serverId2 != null) {
            int i2 = serverId2.f15142b;
            MVRideEntityId mVRideEntityId2 = new MVRideEntityId();
            mVRideEntityId2.setField_ = MVRideEntityId._Fields.RIDE_ID;
            mVRideEntityId2.value_ = Integer.valueOf(i2);
            return mVRideEntityId2;
        }
        throw new IllegalStateException("Illegal server key: " + key);
    }

    /* renamed from: k */
    public static MVVehicleType m42039k(EventVehicleType eventVehicleType) {
        int i = C16537a.f43165b[eventVehicleType.ordinal()];
        if (i == 1) {
            return MVVehicleType.BUS;
        }
        if (i == 2) {
            return MVVehicleType.MINIBUS;
        }
        if (i == 3) {
            return MVVehicleType.TAXI;
        }
        throw new IllegalStateException("Unknown event vehicle type: " + eventVehicleType);
    }
}
