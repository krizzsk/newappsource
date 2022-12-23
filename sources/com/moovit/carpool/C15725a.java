package com.moovit.carpool;

import android.net.Uri;
import c70.C13749c;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.BadResponseException;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.carpool.MVCar;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolPrice;
import com.tranzmate.moovit.protocol.carpool.MVCarpoolDriver;
import com.tranzmate.moovit.protocol.carpool.MVConfirmationRate;
import com.tranzmate.moovit.protocol.carpool.MVInvitationState;
import com.tranzmate.moovit.protocol.carpool.MVJourneyInfo;
import com.tranzmate.moovit.protocol.carpool.MVPassengerFutureRide;
import com.tranzmate.moovit.protocol.carpool.MVPassengerHistoricalRide;
import com.tranzmate.moovit.protocol.carpool.MVPassengerStop;
import com.tranzmate.moovit.protocol.carpool.MVPassengerStops;
import com.tranzmate.moovit.protocol.carpool.MVRide;
import com.tranzmate.moovit.protocol.carpool.MVRideLocationDescriptor;
import com.tranzmate.moovit.protocol.carpool.MVStreetViewDetails;
import com.tranzmate.moovit.protocol.common.MVCarPoolWorkDetails;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType;
import java.util.HashMap;

/* renamed from: com.moovit.carpool.a */
public final class C15725a {

    /* renamed from: com.moovit.carpool.a$a */
    public static /* synthetic */ class C15726a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40955a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f40956b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus[] r0 = com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40956b = r0
                r1 = 1
                com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus r2 = com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus.WAITING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f40956b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus r3 = com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus.CANCELED_BY_PASSENGER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f40956b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus r4 = com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus.FULFILLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f40956b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus r5 = com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus.UNFULFILLED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.tranzmate.moovit.protocol.carpool.MVInvitationState[] r4 = com.tranzmate.moovit.protocol.carpool.MVInvitationState.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f40955a = r4
                com.tranzmate.moovit.protocol.carpool.MVInvitationState r5 = com.tranzmate.moovit.protocol.carpool.MVInvitationState.INVITED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f40955a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.tranzmate.moovit.protocol.carpool.MVInvitationState r4 = com.tranzmate.moovit.protocol.carpool.MVInvitationState.INTERESTED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f40955a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.tranzmate.moovit.protocol.carpool.MVInvitationState r1 = com.tranzmate.moovit.protocol.carpool.MVInvitationState.NOT_INTERESTED     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f40955a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.tranzmate.moovit.protocol.carpool.MVInvitationState r1 = com.tranzmate.moovit.protocol.carpool.MVInvitationState.APPROVED     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f40955a     // Catch:{ NoSuchFieldError -> 0x006d }
                com.tranzmate.moovit.protocol.carpool.MVInvitationState r1 = com.tranzmate.moovit.protocol.carpool.MVInvitationState.REJECTED     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f40955a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.tranzmate.moovit.protocol.carpool.MVInvitationState r1 = com.tranzmate.moovit.protocol.carpool.MVInvitationState.CANCELED     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f40955a     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.tranzmate.moovit.protocol.carpool.MVInvitationState r1 = com.tranzmate.moovit.protocol.carpool.MVInvitationState.TIME_CHANGED_AFTER_APPROVAL     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.carpool.C15725a.C15726a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static CarpoolDriver m40154a(MVCarpoolDriver mVCarpoolDriver) {
        CarpoolCar carpoolCar;
        Uri uri;
        String str;
        long j;
        short s;
        CarpoolCompany carpoolCompany;
        boolean z;
        CarpoolConfirmationRate carpoolConfirmationRate;
        String str2;
        String str3;
        MVCarpoolDriver mVCarpoolDriver2 = mVCarpoolDriver;
        if (mVCarpoolDriver2 == null) {
            return null;
        }
        String str4 = mVCarpoolDriver2.driverId;
        String str5 = mVCarpoolDriver2.firstName;
        String str6 = mVCarpoolDriver2.lastName;
        String str7 = mVCarpoolDriver2.phoneNumber;
        MVCar mVCar = mVCarpoolDriver2.car;
        if (mVCar != null) {
            carpoolCar = new CarpoolCar(mVCar.number, mVCar.model, mVCar.color);
        } else {
            carpoolCar = new CarpoolCar((String) null, (String) null, (String) null);
        }
        float f = (float) mVCarpoolDriver2.rating;
        String str8 = mVCarpoolDriver2.profilePhotoUrl;
        if (str8 == null) {
            uri = null;
        } else {
            uri = Uri.parse(str8);
        }
        int i = mVCarpoolDriver2.fbFriendsNum;
        String str9 = mVCarpoolDriver2.selfDescription;
        short s2 = mVCarpoolDriver2.age;
        short s3 = mVCarpoolDriver2.numFinishedRides;
        long j2 = mVCarpoolDriver2.registrationDate;
        short s4 = mVCarpoolDriver2.numRatings;
        if (mVCarpoolDriver.mo25535o()) {
            str = mVCarpoolDriver2.fbId;
        } else {
            str = null;
        }
        if (mVCarpoolDriver.mo25533l()) {
            MVCarPoolWorkDetails mVCarPoolWorkDetails = mVCarpoolDriver2.driversWorkData;
            if (mVCarPoolWorkDetails.mo26097i()) {
                s = s4;
                str2 = mVCarPoolWorkDetails.workName;
            } else {
                s = s4;
                str2 = null;
            }
            if (mVCarPoolWorkDetails.mo26095h()) {
                str3 = mVCarPoolWorkDetails.workEmail;
                j = j2;
            } else {
                j = j2;
                str3 = null;
            }
            carpoolCompany = new CarpoolCompany(str2, str3);
        } else {
            s = s4;
            j = j2;
            carpoolCompany = null;
        }
        boolean z2 = mVCarpoolDriver2.allowDetour;
        if (!mVCarpoolDriver.mo25531j() || !mVCarpoolDriver2.driverConfirmationSettings.mo25597g()) {
            z = z2;
            carpoolConfirmationRate = null;
        } else {
            MVConfirmationRate mVConfirmationRate = mVCarpoolDriver2.driverConfirmationSettings.rate;
            z = z2;
            carpoolConfirmationRate = new CarpoolConfirmationRate(mVConfirmationRate.responseRate, mVConfirmationRate.approvalRate, mVConfirmationRate.responseTime);
        }
        return new CarpoolDriver(str4, str5, str6, str7, carpoolCar, f, uri, i, str9, s2, s3, j, s, str, carpoolCompany, z, carpoolConfirmationRate);
    }

    /* renamed from: b */
    public static FutureCarpoolRide m40155b(MVPassengerFutureRide mVPassengerFutureRide, CarpoolDriver carpoolDriver) {
        FutureCarpoolRide.InvitationState invitationState;
        CarpoolRide f = m40159f(mVPassengerFutureRide.ride, carpoolDriver);
        MVInvitationState mVInvitationState = mVPassengerFutureRide.invitationState;
        if (mVInvitationState == null) {
            invitationState = null;
        } else {
            switch (C15726a.f40955a[mVInvitationState.ordinal()]) {
                case 1:
                    invitationState = FutureCarpoolRide.InvitationState.INVITED;
                    break;
                case 2:
                    invitationState = FutureCarpoolRide.InvitationState.INTERESTED;
                    break;
                case 3:
                    invitationState = FutureCarpoolRide.InvitationState.NOT_INTERESTED;
                    break;
                case 4:
                    invitationState = FutureCarpoolRide.InvitationState.APPROVED_BY_DRIVER;
                    break;
                case 5:
                    invitationState = FutureCarpoolRide.InvitationState.REJECTED_BY_DRIVER;
                    break;
                case 6:
                    invitationState = FutureCarpoolRide.InvitationState.CANCELED_BY_PASSENGER;
                    break;
                case 7:
                    invitationState = FutureCarpoolRide.InvitationState.APPROVED_WITH_TIME_CHANGE_BY_DRIVER;
                    break;
                default:
                    throw new BadResponseException("Unknown invitation state value: " + mVInvitationState);
            }
        }
        return new FutureCarpoolRide(f, invitationState, mVPassengerFutureRide.isCanceled, m40158e(mVPassengerFutureRide.stops));
    }

    /* renamed from: c */
    public static HistoricalCarpoolRide m40156c(MVPassengerHistoricalRide mVPassengerHistoricalRide, HashMap hashMap) {
        CarpoolDriver carpoolDriver = (CarpoolDriver) hashMap.get(mVPassengerHistoricalRide.driverId);
        if (carpoolDriver != null) {
            return new HistoricalCarpoolRide(m40159f(mVPassengerHistoricalRide.ride, carpoolDriver), mVPassengerHistoricalRide.isCanceled, mVPassengerHistoricalRide.canReportMissing, mVPassengerHistoricalRide.canRate, m40158e(mVPassengerHistoricalRide.stops));
        }
        StringBuilder k = C13555b.m33972k("Missing driver with id ");
        k.append(mVPassengerHistoricalRide.driverId);
        k.append(" for ride ");
        k.append(mVPassengerHistoricalRide.ride.rideId);
        throw new BadResponseException(k.toString());
    }

    /* renamed from: d */
    public static CarpoolLocationDescriptor m40157d(MVRideLocationDescriptor mVRideLocationDescriptor) {
        CameraDescriptor cameraDescriptor;
        if (mVRideLocationDescriptor == null) {
            return null;
        }
        String str = mVRideLocationDescriptor.name;
        String str2 = mVRideLocationDescriptor.address;
        LatLonE6 h = C13749c.m34322h(mVRideLocationDescriptor.latlon);
        BoxE6 g = BoxE6.m40167g(h);
        MVStreetViewDetails mVStreetViewDetails = mVRideLocationDescriptor.streetViewDetails;
        if (mVStreetViewDetails == null) {
            cameraDescriptor = null;
        } else {
            cameraDescriptor = new CameraDescriptor((float) mVStreetViewDetails.bearing, (float) mVStreetViewDetails.tilt, (float) mVStreetViewDetails.zoomLevel);
        }
        return new CarpoolLocationDescriptor(str, str2, h, g, cameraDescriptor);
    }

    /* renamed from: e */
    public static PassengerRideStops m40158e(MVPassengerStops mVPassengerStops) {
        Short sh;
        Short sh2;
        LocationDescriptor locationDescriptor;
        MVPassengerStop mVPassengerStop = mVPassengerStops.pickUp;
        short s = mVPassengerStop.stopSeq;
        LocationDescriptor locationDescriptor2 = null;
        if (mVPassengerStop.mo25793f()) {
            sh = Short.valueOf(mVPassengerStop.routeId);
        } else {
            sh = null;
        }
        PassengerRideStop passengerRideStop = new PassengerRideStop(s, sh);
        MVPassengerStop mVPassengerStop2 = mVPassengerStops.dropOff;
        short s2 = mVPassengerStop2.stopSeq;
        if (mVPassengerStop2.mo25793f()) {
            sh2 = Short.valueOf(mVPassengerStop2.routeId);
        } else {
            sh2 = null;
        }
        PassengerRideStop passengerRideStop2 = new PassengerRideStop(s2, sh2);
        if (mVPassengerStops.mo25805h()) {
            locationDescriptor = C13749c.m34324j(mVPassengerStops.origin, (MVLocationSourceType) null);
        } else {
            locationDescriptor = null;
        }
        if (mVPassengerStops.mo25803f()) {
            locationDescriptor2 = C13749c.m34324j(mVPassengerStops.destination, (MVLocationSourceType) null);
        }
        return new PassengerRideStops(passengerRideStop, passengerRideStop2, locationDescriptor, locationDescriptor2);
    }

    /* renamed from: f */
    public static CarpoolRide m40159f(MVRide mVRide, CarpoolDriver carpoolDriver) {
        CurrencyAmount currencyAmount;
        ServerId serverId = new ServerId(mVRide.rideId);
        MVJourneyInfo mVJourneyInfo = mVRide.journey;
        CarpoolLocationDescriptor d = m40157d(mVJourneyInfo.pickup);
        String str = mVJourneyInfo.pickupComment;
        CarpoolLocationDescriptor d2 = m40157d(mVJourneyInfo.dropoff);
        String str2 = mVJourneyInfo.dropOffComment;
        CurrencyAmount c = C13749c.m34317c(mVRide.price);
        MVCarPoolPrice mVCarPoolPrice = mVRide.fullPrice;
        if (mVCarPoolPrice == null) {
            currencyAmount = c;
        } else {
            currencyAmount = C13749c.m34317c(mVCarPoolPrice);
        }
        return new CarpoolRide(serverId, carpoolDriver, mVRide.departureTime, d, str, d2, str2, c, currencyAmount);
    }

    /* renamed from: g */
    public static MVPassengerStops m40160g(PassengerRideStops passengerRideStops) {
        PassengerRideStop passengerRideStop = passengerRideStops.f40951b;
        short s = passengerRideStop.f40948b;
        MVPassengerStop mVPassengerStop = new MVPassengerStop();
        mVPassengerStop.stopSeq = s;
        mVPassengerStop.mo25797i();
        Short sh = passengerRideStop.f40949c;
        if (sh != null) {
            mVPassengerStop.routeId = sh.shortValue();
            mVPassengerStop.mo25795h();
        }
        PassengerRideStop passengerRideStop2 = passengerRideStops.f40952c;
        short s2 = passengerRideStop2.f40948b;
        MVPassengerStop mVPassengerStop2 = new MVPassengerStop();
        mVPassengerStop2.stopSeq = s2;
        mVPassengerStop2.mo25797i();
        Short sh2 = passengerRideStop2.f40949c;
        if (sh2 != null) {
            mVPassengerStop2.routeId = sh2.shortValue();
            mVPassengerStop2.mo25795h();
        }
        MVPassengerStops mVPassengerStops = new MVPassengerStops();
        mVPassengerStops.pickUp = mVPassengerStop;
        mVPassengerStops.dropOff = mVPassengerStop2;
        LocationDescriptor locationDescriptor = passengerRideStops.f40953d;
        if (locationDescriptor != null) {
            mVPassengerStops.origin = C13749c.m34335u(locationDescriptor);
        }
        LocationDescriptor locationDescriptor2 = passengerRideStops.f40954e;
        if (locationDescriptor2 != null) {
            mVPassengerStops.destination = C13749c.m34335u(locationDescriptor2);
        }
        return mVPassengerStops;
    }
}
