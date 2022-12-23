package p638lr;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.carpool.ActiveCarpoolRide;
import com.moovit.carpool.C15725a;
import com.moovit.carpool.CarpoolDriver;
import com.moovit.carpool.CarpoolRideRequest;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.carpool.HistoricalCarpoolRide;
import com.moovit.carpool.RideRequestStatus;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.carpool.MVCarpoolDriver;
import com.tranzmate.moovit.protocol.carpool.MVPassengerActiveRide;
import com.tranzmate.moovit.protocol.carpool.MVPassengerFutureRide;
import com.tranzmate.moovit.protocol.carpool.MVPassengerHistoricalRide;
import com.tranzmate.moovit.protocol.carpool.MVPassengerRidesResponse;
import com.tranzmate.moovit.protocol.carpool.MVRideRequest;
import com.tranzmate.moovit.protocol.carpool.MVRideRequestMetaData;
import com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.apache.thrift.TBase;

/* renamed from: lr.f */
public final class C18259f extends C13780t<C18258e, C18259f, MVPassengerRidesResponse> {

    /* renamed from: m */
    public List<FutureCarpoolRide> f46578m;

    /* renamed from: n */
    public List<ActiveCarpoolRide> f46579n;

    /* renamed from: o */
    public List<HistoricalCarpoolRide> f46580o;

    /* renamed from: p */
    public List<HistoricalCarpoolRide> f46581p;

    /* renamed from: q */
    public List<CarpoolRideRequest> f46582q;

    public C18259f() {
        super(MVPassengerRidesResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z11;
        RideRequestStatus rideRequestStatus;
        C18258e eVar = (C18258e) aVar;
        MVPassengerRidesResponse mVPassengerRidesResponse = (MVPassengerRidesResponse) tBase;
        int i = 1;
        if ((eVar.f46577w & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || mVPassengerRidesResponse.mo25783h()) {
            if ((eVar.f46577w & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 || mVPassengerRidesResponse.mo25781f()) {
                if ((eVar.f46577w & 4) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 || mVPassengerRidesResponse.mo25786j()) {
                    if ((eVar.f46577w & 8) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4 || mVPassengerRidesResponse.mo25785i()) {
                        if ((eVar.f46577w & 16) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5 || mVPassengerRidesResponse.mo25787k()) {
                            HashMap hashMap = new HashMap();
                            for (MVCarpoolDriver next : mVPassengerRidesResponse.drivers) {
                                hashMap.put(next.driverId, C15725a.m40154a(next));
                            }
                            if ((eVar.f46577w & 1) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                ArrayList arrayList = new ArrayList(mVPassengerRidesResponse.futureRides.size());
                                for (MVPassengerFutureRide next2 : mVPassengerRidesResponse.futureRides) {
                                    if (!next2.ride.mo25852i()) {
                                        CarpoolDriver carpoolDriver = (CarpoolDriver) hashMap.get(next2.driverId);
                                        if (carpoolDriver != null) {
                                            arrayList.add(C15725a.m40155b(next2, carpoolDriver));
                                        } else {
                                            StringBuilder k = C13555b.m33972k("Missing driver with id ");
                                            k.append(next2.driverId);
                                            k.append(" for ride ");
                                            k.append(next2.ride.rideId);
                                            throw new BadResponseException(k.toString());
                                        }
                                    }
                                }
                                this.f46578m = Collections.unmodifiableList(arrayList);
                            }
                            if ((eVar.f46577w & 2) != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                ArrayList arrayList2 = new ArrayList(mVPassengerRidesResponse.activeRides.size());
                                for (MVPassengerActiveRide next3 : mVPassengerRidesResponse.activeRides) {
                                    if (!next3.ride.mo25852i()) {
                                        CarpoolDriver carpoolDriver2 = (CarpoolDriver) hashMap.get(next3.driverId);
                                        if (carpoolDriver2 != null) {
                                            arrayList2.add(new ActiveCarpoolRide(C15725a.m40159f(next3.ride, carpoolDriver2), next3.canReportMissing, next3.canRate, C15725a.m40158e(next3.stops)));
                                        } else {
                                            StringBuilder k2 = C13555b.m33972k("Missing driver with id ");
                                            k2.append(next3.driverId);
                                            k2.append(" for ride ");
                                            k2.append(next3.ride.rideId);
                                            throw new BadResponseException(k2.toString());
                                        }
                                    }
                                }
                                this.f46579n = Collections.unmodifiableList(arrayList2);
                            }
                            if ((eVar.f46577w & 4) != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                ArrayList arrayList3 = new ArrayList(mVPassengerRidesResponse.recentlyCompletedRides.size());
                                for (MVPassengerHistoricalRide next4 : mVPassengerRidesResponse.recentlyCompletedRides) {
                                    if (!next4.ride.mo25852i()) {
                                        arrayList3.add(C15725a.m40156c(next4, hashMap));
                                    }
                                }
                                this.f46580o = Collections.unmodifiableList(arrayList3);
                            }
                            if ((eVar.f46577w & 8) != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                ArrayList arrayList4 = new ArrayList(mVPassengerRidesResponse.historicalRides.size());
                                for (MVPassengerHistoricalRide next5 : mVPassengerRidesResponse.historicalRides) {
                                    if (!next5.ride.mo25852i()) {
                                        arrayList4.add(C15725a.m40156c(next5, hashMap));
                                    }
                                }
                                this.f46581p = Collections.unmodifiableList(arrayList4);
                            }
                            if ((eVar.f46577w & 16) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                ArrayList arrayList5 = new ArrayList(mVPassengerRidesResponse.requests.size());
                                for (MVRideRequest next6 : mVPassengerRidesResponse.requests) {
                                    if (!next6.data.mo25900g()) {
                                        ServerId serverId = new ServerId(next6.requestId);
                                        LocationDescriptor j = C13749c.m34324j(next6.data.pickUpLocation, (MVLocationSourceType) null);
                                        LocationDescriptor j2 = C13749c.m34324j(next6.data.dropOffLocation, (MVLocationSourceType) null);
                                        MVRideRequestMetaData mVRideRequestMetaData = next6.data;
                                        long j3 = mVRideRequestMetaData.pickUpFromTime;
                                        long j4 = mVRideRequestMetaData.pickUpUntilTime;
                                        int i2 = mVRideRequestMetaData.totalAllowedWalkingTimeMinutes;
                                        CurrencyAmount c = C13749c.m34317c(mVRideRequestMetaData.maxPriceAllowed);
                                        MVRideRequestStatus mVRideRequestStatus = next6.data.status;
                                        int i3 = C15725a.C15726a.f40956b[mVRideRequestStatus.ordinal()];
                                        if (i3 == i) {
                                            rideRequestStatus = RideRequestStatus.WAITING;
                                        } else if (i3 == 2) {
                                            rideRequestStatus = RideRequestStatus.CANCELED_BY_PASSENGER;
                                        } else if (i3 == 3) {
                                            rideRequestStatus = RideRequestStatus.FULFILLED;
                                        } else if (i3 == 4) {
                                            rideRequestStatus = RideRequestStatus.NOT_FULFILLED;
                                        } else {
                                            throw new IllegalStateException("Unknown type : " + mVRideRequestStatus);
                                        }
                                        arrayList5.add(new CarpoolRideRequest(serverId, j, j2, j3, j4, i2, c, rideRequestStatus));
                                        i = 1;
                                    }
                                }
                                this.f46582q = Collections.unmodifiableList(arrayList5);
                                return;
                            }
                            return;
                        }
                        throw new BadResponseException("We asked for ride requests, but received none");
                    }
                    throw new BadResponseException("We asked for historical rides, but received none");
                }
                throw new BadResponseException("We asked for recently completed rides, but received none");
            }
            throw new BadResponseException("We asked for active rides, but received none");
        }
        throw new BadResponseException("We asked for future rides, but received none");
    }
}
