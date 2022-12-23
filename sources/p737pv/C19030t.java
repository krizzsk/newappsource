package p737pv;

import c00.C13717b;
import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.ridesharing.model.EventDriver;
import com.moovit.ridesharing.model.EventInstance;
import com.moovit.ridesharing.model.EventRequest;
import com.moovit.ridesharing.model.EventRequestStatus;
import com.moovit.ridesharing.model.EventRide;
import com.moovit.ridesharing.model.EventVehicle;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.moovit.protocol.carpool.MVCarpoolDriver;
import com.tranzmate.moovit.protocol.carpool.MVPassengerActiveRide;
import com.tranzmate.moovit.protocol.carpool.MVPassengerFutureRide;
import com.tranzmate.moovit.protocol.carpool.MVPassengerHistoricalRide;
import com.tranzmate.moovit.protocol.carpool.MVPassengerRidesResponse;
import com.tranzmate.moovit.protocol.carpool.MVPassengerStops;
import com.tranzmate.moovit.protocol.carpool.MVRideLocationDescriptor;
import com.tranzmate.moovit.protocol.carpool.MVRideRequest;
import com.tranzmate.moovit.protocol.carpool.MVRideRequestStatus;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType;
import d70.C16536a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.apache.thrift.TBase;
import p977zz.C20964s0;

/* renamed from: pv.t */
public final class C19030t extends C13780t<C19029s, C19030t, MVPassengerRidesResponse> {

    /* renamed from: m */
    public List<EventRequest> f48396m;

    /* renamed from: n */
    public List<EventRequest> f48397n;

    /* renamed from: o */
    public List<EventRequest> f48398o;

    /* renamed from: p */
    public List<EventRequest> f48399p;

    /* renamed from: q */
    public List<EventRequest> f48400q;

    public C19030t() {
        super(MVPassengerRidesResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        HashMap hashMap;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z11;
        MVLocationDescriptor mVLocationDescriptor;
        EventRequestStatus eventRequestStatus;
        MVRideLocationDescriptor mVRideLocationDescriptor;
        EventRequestStatus eventRequestStatus2;
        MVRideLocationDescriptor mVRideLocationDescriptor2;
        EventRequestStatus eventRequestStatus3;
        MVRideLocationDescriptor mVRideLocationDescriptor3;
        MVRideLocationDescriptor mVRideLocationDescriptor4;
        EventRequestStatus eventRequestStatus4;
        EventDriver eventDriver;
        EventVehicle eventVehicle;
        C19029s sVar = (C19029s) aVar;
        MVPassengerRidesResponse mVPassengerRidesResponse = (MVPassengerRidesResponse) tBase;
        if ((sVar.f48395w & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || mVPassengerRidesResponse.mo25783h()) {
            if ((sVar.f48395w & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 || mVPassengerRidesResponse.mo25781f()) {
                if ((sVar.f48395w & 8) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 || mVPassengerRidesResponse.mo25786j()) {
                    if ((sVar.f48395w & 16) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4 || mVPassengerRidesResponse.mo25785i()) {
                        if ((sVar.f48395w & 1) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5 || mVPassengerRidesResponse.mo25787k()) {
                            List<MVCarpoolDriver> list = mVPassengerRidesResponse.drivers;
                            if (!C13717b.m34258e(list)) {
                                HashMap hashMap2 = new HashMap(list.size());
                                for (MVCarpoolDriver next : mVPassengerRidesResponse.drivers) {
                                    String str = next.driverId;
                                    if ("Unknown".equalsIgnoreCase(next.firstName)) {
                                        eventDriver = null;
                                    } else {
                                        String str2 = next.driverId;
                                        String str3 = next.firstName;
                                        String str4 = next.lastName;
                                        String str5 = next.phoneNumber;
                                        if (next.mo25530i()) {
                                            String str6 = next.car.number;
                                            if (!C20964s0.m49090h(str6)) {
                                                eventVehicle = new EventVehicle(str6);
                                                eventDriver = new EventDriver(str2, str3, str4, str5, eventVehicle);
                                            }
                                        }
                                        eventVehicle = null;
                                        eventDriver = new EventDriver(str2, str3, str4, str5, eventVehicle);
                                    }
                                    hashMap2.put(str, eventDriver);
                                }
                                hashMap = hashMap2;
                            } else {
                                hashMap = Collections.emptyMap();
                            }
                            if ((sVar.f48395w & 2) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                ArrayList arrayList = new ArrayList(mVPassengerRidesResponse.futureRides.size());
                                for (MVPassengerFutureRide next2 : mVPassengerRidesResponse.futureRides) {
                                    if (next2.ride.mo25852i()) {
                                        EventInstance c = C16536a.m42031c(next2.ride.eventMetadata);
                                        if (c.f42949h == 1) {
                                            mVRideLocationDescriptor4 = next2.ride.journey.pickup;
                                        } else {
                                            mVRideLocationDescriptor4 = next2.ride.journey.dropoff;
                                        }
                                        LocationDescriptor g = C16536a.m42035g(mVRideLocationDescriptor4);
                                        EventRide e = C16536a.m42033e(next2.ride, (EventDriver) hashMap.get(next2.driverId));
                                        int i = C16536a.C16537a.f43168e[next2.invitationState.ordinal()];
                                        if (i == 2) {
                                            eventRequestStatus4 = EventRequestStatus.REJECTED_BY_PROVIDER;
                                        } else if (i == 3) {
                                            eventRequestStatus4 = EventRequestStatus.APPROVED_BY_PROVIDER;
                                        } else if (i != 4) {
                                            eventRequestStatus4 = EventRequestStatus.WAITING_FOR_PROVIDER_APPROVAL;
                                        } else {
                                            eventRequestStatus4 = EventRequestStatus.CANCELED_BY_PASSENGER;
                                        }
                                        arrayList.add(new EventRequest(2, c, g, eventRequestStatus4, C13749c.m34317c(next2.ride.price), e, next2.ride.numberOfTickets, C16536a.m42032d(c, (ServerId) null, e.f42969b, next2.stops)));
                                    }
                                }
                                this.f48396m = Collections.unmodifiableList(arrayList);
                            }
                            if ((sVar.f48395w & 4) != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                ArrayList arrayList2 = new ArrayList(mVPassengerRidesResponse.activeRides.size());
                                for (MVPassengerActiveRide next3 : mVPassengerRidesResponse.activeRides) {
                                    if (next3.ride.mo25852i()) {
                                        EventInstance c2 = C16536a.m42031c(next3.ride.eventMetadata);
                                        if (c2.f42949h == 1) {
                                            mVRideLocationDescriptor3 = next3.ride.journey.pickup;
                                        } else {
                                            mVRideLocationDescriptor3 = next3.ride.journey.dropoff;
                                        }
                                        LocationDescriptor g2 = C16536a.m42035g(mVRideLocationDescriptor3);
                                        EventRide e2 = C16536a.m42033e(next3.ride, (EventDriver) hashMap.get(next3.driverId));
                                        arrayList2.add(new EventRequest(4, c2, g2, EventRequestStatus.APPROVED_BY_PROVIDER, C13749c.m34317c(next3.ride.price), e2, next3.ride.numberOfTickets, C16536a.m42032d(c2, (ServerId) null, e2.f42969b, next3.stops)));
                                    }
                                }
                                this.f48397n = Collections.unmodifiableList(arrayList2);
                            }
                            if ((sVar.f48395w & 8) != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                ArrayList arrayList3 = new ArrayList(mVPassengerRidesResponse.recentlyCompletedRides.size());
                                for (MVPassengerHistoricalRide next4 : mVPassengerRidesResponse.recentlyCompletedRides) {
                                    if (next4.ride.mo25852i()) {
                                        EventInstance c3 = C16536a.m42031c(next4.ride.eventMetadata);
                                        if (c3.f42949h == 1) {
                                            mVRideLocationDescriptor2 = next4.ride.journey.pickup;
                                        } else {
                                            mVRideLocationDescriptor2 = next4.ride.journey.dropoff;
                                        }
                                        LocationDescriptor g3 = C16536a.m42035g(mVRideLocationDescriptor2);
                                        EventRide e3 = C16536a.m42033e(next4.ride, (EventDriver) hashMap.get(next4.driverId));
                                        if (next4.mo25745i()) {
                                            eventRequestStatus3 = EventRequestStatus.UNFULFILLED;
                                        } else {
                                            eventRequestStatus3 = EventRequestStatus.FULFILLED;
                                        }
                                        arrayList3.add(new EventRequest(8, c3, g3, eventRequestStatus3, C13749c.m34317c(next4.ride.price), e3, next4.ride.numberOfTickets, C16536a.m42032d(c3, (ServerId) null, e3.f42969b, next4.stops)));
                                    }
                                }
                                this.f48398o = Collections.unmodifiableList(arrayList3);
                            }
                            if ((sVar.f48395w & 16) != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                ArrayList arrayList4 = new ArrayList(mVPassengerRidesResponse.historicalRides.size());
                                for (MVPassengerHistoricalRide next5 : mVPassengerRidesResponse.historicalRides) {
                                    if (next5.ride.mo25852i()) {
                                        EventInstance c4 = C16536a.m42031c(next5.ride.eventMetadata);
                                        if (c4.f42949h == 1) {
                                            mVRideLocationDescriptor = next5.ride.journey.pickup;
                                        } else {
                                            mVRideLocationDescriptor = next5.ride.journey.dropoff;
                                        }
                                        LocationDescriptor g4 = C16536a.m42035g(mVRideLocationDescriptor);
                                        EventRide e4 = C16536a.m42033e(next5.ride, (EventDriver) hashMap.get(next5.driverId));
                                        if (next5.mo25745i()) {
                                            eventRequestStatus2 = EventRequestStatus.UNFULFILLED;
                                        } else {
                                            eventRequestStatus2 = EventRequestStatus.FULFILLED;
                                        }
                                        arrayList4.add(new EventRequest(16, c4, g4, eventRequestStatus2, C13749c.m34317c(next5.ride.price), e4, next5.ride.numberOfTickets, C16536a.m42032d(c4, (ServerId) null, e4.f42969b, next5.stops)));
                                    }
                                }
                                this.f48399p = Collections.unmodifiableList(arrayList4);
                            }
                            if ((sVar.f48395w & 1) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                ArrayList arrayList5 = new ArrayList(mVPassengerRidesResponse.requests.size());
                                for (MVRideRequest next6 : mVPassengerRidesResponse.requests) {
                                    if (next6.data.mo25900g()) {
                                        EventInstance c5 = C16536a.m42031c(next6.data.event);
                                        if (c5.f42949h == 1) {
                                            mVLocationDescriptor = next6.data.pickUpLocation;
                                        } else {
                                            mVLocationDescriptor = next6.data.dropOffLocation;
                                        }
                                        LocationDescriptor j = C13749c.m34324j(mVLocationDescriptor, (MVLocationSourceType) null);
                                        MVRideRequestStatus mVRideRequestStatus = next6.data.status;
                                        int i2 = C16536a.C16537a.f43167d[mVRideRequestStatus.ordinal()];
                                        if (i2 == 1) {
                                            eventRequestStatus = EventRequestStatus.WAITING_FOR_PROVIDER_APPROVAL;
                                        } else if (i2 == 2) {
                                            eventRequestStatus = EventRequestStatus.CANCELED_BY_PASSENGER;
                                        } else if (i2 == 3) {
                                            eventRequestStatus = EventRequestStatus.FULFILLED;
                                        } else if (i2 == 4) {
                                            eventRequestStatus = EventRequestStatus.UNFULFILLED;
                                        } else {
                                            throw new IllegalStateException("Unknown event request status: " + mVRideRequestStatus);
                                        }
                                        arrayList5.add(new EventRequest(1, c5, j, eventRequestStatus, C13749c.m34317c(next6.data.maxPriceAllowed), (EventRide) null, next6.data.numberOfTickets, C16536a.m42032d(c5, new ServerId(next6.requestId), (ServerId) null, (MVPassengerStops) null)));
                                    }
                                }
                                this.f48400q = Collections.unmodifiableList(arrayList5);
                                return;
                            }
                            return;
                        }
                        throw new BadResponseException("We asked for pending events, but received none");
                    }
                    throw new BadResponseException("We asked for historical events, but received none");
                }
                throw new BadResponseException("We asked for recently completed events, but received none");
            }
            throw new BadResponseException("We asked for active events, but received none");
        }
        throw new BadResponseException("We asked for future events, but received none");
    }
}
