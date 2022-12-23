package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEvent;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVRide implements TBase<MVRide, _Fields>, Serializable, Cloneable, Comparable<MVRide> {

    /* renamed from: b */
    public static final C25113c f24845b = new C25113c("rideId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24846c = new C25113c("journey", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24847d = new C25113c("departureTime", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f24848e = new C25113c("maxNumPassengers", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f24849f = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f24850g = new C25113c("fullPrice", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f24851h = new C25113c("recurrentDetails", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f24852i = new C25113c("arrivalTime", (byte) 10, 8);

    /* renamed from: j */
    public static final C25113c f24853j = new C25113c("driverRoutes", (byte) 15, 9);

    /* renamed from: k */
    public static final C25113c f24854k = new C25113c("parking", (byte) 12, 10);

    /* renamed from: l */
    public static final C25113c f24855l = new C25113c("eventMetadata", (byte) 12, 11);

    /* renamed from: m */
    public static final C25113c f24856m = new C25113c("numberOfTickets", (byte) 8, 12);

    /* renamed from: n */
    public static final HashMap f24857n;

    /* renamed from: o */
    public static final Map<_Fields, FieldMetaData> f24858o;
    private byte __isset_bitfield = 0;
    public long arrivalTime;
    public long departureTime;
    public List<MVDriverRouteDetails> driverRoutes;
    public MVRSEvent eventMetadata;
    public MVCarPoolPrice fullPrice;
    public MVJourneyInfo journey;
    public int maxNumPassengers;
    public int numberOfTickets;
    private _Fields[] optionals = {_Fields.FULL_PRICE, _Fields.RECURRENT_DETAILS, _Fields.ARRIVAL_TIME, _Fields.DRIVER_ROUTES, _Fields.PARKING, _Fields.EVENT_METADATA, _Fields.NUMBER_OF_TICKETS};
    public MVParking parking;
    public MVCarPoolPrice price;
    public MVRecurrentRideDetails recurrentDetails;
    public int rideId;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        JOURNEY(2, "journey"),
        DEPARTURE_TIME(3, "departureTime"),
        MAX_NUM_PASSENGERS(4, "maxNumPassengers"),
        PRICE(5, InAppPurchaseMetaData.KEY_PRICE),
        FULL_PRICE(6, "fullPrice"),
        RECURRENT_DETAILS(7, "recurrentDetails"),
        ARRIVAL_TIME(8, "arrivalTime"),
        DRIVER_ROUTES(9, "driverRoutes"),
        PARKING(10, "parking"),
        EVENT_METADATA(11, "eventMetadata"),
        NUMBER_OF_TICKETS(12, "numberOfTickets");
        
        private static final Map<String, _Fields> byName = null;
        private final String _fieldName;
        private final short _thriftId;

        /* access modifiers changed from: public */
        static {
            byName = new HashMap();
            Iterator<E> it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        private _Fields(short s, String str) {
            this._thriftId = s;
            this._fieldName = str;
        }

        public static _Fields findByName(String str) {
            return byName.get(str);
        }

        public static _Fields findByThriftId(int i) {
            switch (i) {
                case 1:
                    return RIDE_ID;
                case 2:
                    return JOURNEY;
                case 3:
                    return DEPARTURE_TIME;
                case 4:
                    return MAX_NUM_PASSENGERS;
                case 5:
                    return PRICE;
                case 6:
                    return FULL_PRICE;
                case 7:
                    return RECURRENT_DETAILS;
                case 8:
                    return ARRIVAL_TIME;
                case 9:
                    return DRIVER_ROUTES;
                case 10:
                    return PARKING;
                case 11:
                    return EVENT_METADATA;
                case 12:
                    return NUMBER_OF_TICKETS;
                default:
                    return null;
            }
        }

        public static _Fields findByThriftIdOrThrow(int i) {
            _Fields findByThriftId = findByThriftId(i);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException(C25541a.m63878h("Field ", i, " doesn't exist!"));
        }

        public String getFieldName() {
            return this._fieldName;
        }

        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRide$a */
    public static class C8299a extends C25239c<MVRide> {
        public C8299a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRide mVRide = (MVRide) tBase;
            mVRide.mo25867y();
            C25113c cVar = MVRide.f24845b;
            gVar.mo61687K();
            gVar.mo61711x(MVRide.f24845b);
            gVar.mo61678B(mVRide.rideId);
            gVar.mo61712y();
            if (mVRide.journey != null) {
                gVar.mo61711x(MVRide.f24846c);
                mVRide.journey.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVRide.f24847d);
            gVar.mo61679C(mVRide.departureTime);
            gVar.mo61712y();
            gVar.mo61711x(MVRide.f24848e);
            gVar.mo61678B(mVRide.maxNumPassengers);
            gVar.mo61712y();
            if (mVRide.price != null) {
                gVar.mo61711x(MVRide.f24849f);
                mVRide.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRide.fullPrice != null && mVRide.mo25853j()) {
                gVar.mo61711x(MVRide.f24850g);
                mVRide.fullPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRide.recurrentDetails != null && mVRide.mo25859q()) {
                gVar.mo61711x(MVRide.f24851h);
                mVRide.recurrentDetails.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRide.mo25848f()) {
                gVar.mo61711x(MVRide.f24852i);
                gVar.mo61679C(mVRide.arrivalTime);
                gVar.mo61712y();
            }
            if (mVRide.driverRoutes != null && mVRide.mo25850h()) {
                gVar.mo61711x(MVRide.f24853j);
                gVar.mo61680D(new C25119e((byte) 12, mVRide.driverRoutes.size()));
                for (MVDriverRouteDetails X0 : mVRide.driverRoutes) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVRide.parking != null && mVRide.mo25857o()) {
                gVar.mo61711x(MVRide.f24854k);
                mVRide.parking.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRide.eventMetadata != null && mVRide.mo25852i()) {
                gVar.mo61711x(MVRide.f24855l);
                mVRide.eventMetadata.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRide.mo25856m()) {
                gVar.mo61711x(MVRide.f24856m);
                gVar.mo61678B(mVRide.numberOfTickets);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRide mVRide = (MVRide) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVRide.mo25867y();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRide.rideId = gVar.mo61696i();
                            mVRide.mo25866w();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVJourneyInfo mVJourneyInfo = new MVJourneyInfo();
                            mVRide.journey = mVJourneyInfo;
                            mVJourneyInfo.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRide.departureTime = gVar.mo61697j();
                            mVRide.mo25862t();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRide.maxNumPassengers = gVar.mo61696i();
                            mVRide.mo25864u();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCarPoolPrice mVCarPoolPrice = new MVCarPoolPrice();
                            mVRide.price = mVCarPoolPrice;
                            mVCarPoolPrice.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCarPoolPrice mVCarPoolPrice2 = new MVCarPoolPrice();
                            mVRide.fullPrice = mVCarPoolPrice2;
                            mVCarPoolPrice2.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVRecurrentRideDetails mVRecurrentRideDetails = new MVRecurrentRideDetails();
                            mVRide.recurrentDetails = mVRecurrentRideDetails;
                            mVRecurrentRideDetails.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRide.arrivalTime = gVar.mo61697j();
                            mVRide.mo25861s();
                            break;
                        }
                    case 9:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVRide.driverRoutes = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVDriverRouteDetails mVDriverRouteDetails = new MVDriverRouteDetails();
                                mVDriverRouteDetails.mo25201C1(gVar);
                                mVRide.driverRoutes.add(mVDriverRouteDetails);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 10:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVParking mVParking = new MVParking();
                            mVRide.parking = mVParking;
                            mVParking.mo25201C1(gVar);
                            break;
                        }
                    case 11:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVRSEvent mVRSEvent = new MVRSEvent();
                            mVRide.eventMetadata = mVRSEvent;
                            mVRSEvent.mo25201C1(gVar);
                            break;
                        }
                    case 12:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRide.numberOfTickets = gVar.mo61696i();
                            mVRide.mo25865v();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRide$b */
    public static class C8300b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8299a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRide$c */
    public static class C8301c extends C25240d<MVRide> {
        public C8301c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRide mVRide = (MVRide) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRide.mo25860r()) {
                bitSet.set(0);
            }
            if (mVRide.mo25854k()) {
                bitSet.set(1);
            }
            if (mVRide.mo25849g()) {
                bitSet.set(2);
            }
            if (mVRide.mo25855l()) {
                bitSet.set(3);
            }
            if (mVRide.mo25858p()) {
                bitSet.set(4);
            }
            if (mVRide.mo25853j()) {
                bitSet.set(5);
            }
            if (mVRide.mo25859q()) {
                bitSet.set(6);
            }
            if (mVRide.mo25848f()) {
                bitSet.set(7);
            }
            if (mVRide.mo25850h()) {
                bitSet.set(8);
            }
            if (mVRide.mo25857o()) {
                bitSet.set(9);
            }
            if (mVRide.mo25852i()) {
                bitSet.set(10);
            }
            if (mVRide.mo25856m()) {
                bitSet.set(11);
            }
            jVar.mo61738U(bitSet, 12);
            if (mVRide.mo25860r()) {
                jVar.mo61678B(mVRide.rideId);
            }
            if (mVRide.mo25854k()) {
                mVRide.journey.mo25202X0(jVar);
            }
            if (mVRide.mo25849g()) {
                jVar.mo61679C(mVRide.departureTime);
            }
            if (mVRide.mo25855l()) {
                jVar.mo61678B(mVRide.maxNumPassengers);
            }
            if (mVRide.mo25858p()) {
                mVRide.price.mo25202X0(jVar);
            }
            if (mVRide.mo25853j()) {
                mVRide.fullPrice.mo25202X0(jVar);
            }
            if (mVRide.mo25859q()) {
                mVRide.recurrentDetails.mo25202X0(jVar);
            }
            if (mVRide.mo25848f()) {
                jVar.mo61679C(mVRide.arrivalTime);
            }
            if (mVRide.mo25850h()) {
                jVar.mo61678B(mVRide.driverRoutes.size());
                for (MVDriverRouteDetails X0 : mVRide.driverRoutes) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVRide.mo25857o()) {
                mVRide.parking.mo25202X0(jVar);
            }
            if (mVRide.mo25852i()) {
                mVRide.eventMetadata.mo25202X0(jVar);
            }
            if (mVRide.mo25856m()) {
                jVar.mo61678B(mVRide.numberOfTickets);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRide mVRide = (MVRide) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(12);
            if (T.get(0)) {
                mVRide.rideId = jVar.mo61696i();
                mVRide.mo25866w();
            }
            if (T.get(1)) {
                MVJourneyInfo mVJourneyInfo = new MVJourneyInfo();
                mVRide.journey = mVJourneyInfo;
                mVJourneyInfo.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVRide.departureTime = jVar.mo61697j();
                mVRide.mo25862t();
            }
            if (T.get(3)) {
                mVRide.maxNumPassengers = jVar.mo61696i();
                mVRide.mo25864u();
            }
            if (T.get(4)) {
                MVCarPoolPrice mVCarPoolPrice = new MVCarPoolPrice();
                mVRide.price = mVCarPoolPrice;
                mVCarPoolPrice.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVCarPoolPrice mVCarPoolPrice2 = new MVCarPoolPrice();
                mVRide.fullPrice = mVCarPoolPrice2;
                mVCarPoolPrice2.mo25201C1(jVar);
            }
            if (T.get(6)) {
                MVRecurrentRideDetails mVRecurrentRideDetails = new MVRecurrentRideDetails();
                mVRide.recurrentDetails = mVRecurrentRideDetails;
                mVRecurrentRideDetails.mo25201C1(jVar);
            }
            if (T.get(7)) {
                mVRide.arrivalTime = jVar.mo61697j();
                mVRide.mo25861s();
            }
            if (T.get(8)) {
                int i = jVar.mo61696i();
                mVRide.driverRoutes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVDriverRouteDetails mVDriverRouteDetails = new MVDriverRouteDetails();
                    mVDriverRouteDetails.mo25201C1(jVar);
                    mVRide.driverRoutes.add(mVDriverRouteDetails);
                }
            }
            if (T.get(9)) {
                MVParking mVParking = new MVParking();
                mVRide.parking = mVParking;
                mVParking.mo25201C1(jVar);
            }
            if (T.get(10)) {
                MVRSEvent mVRSEvent = new MVRSEvent();
                mVRide.eventMetadata = mVRSEvent;
                mVRSEvent.mo25201C1(jVar);
            }
            if (T.get(11)) {
                mVRide.numberOfTickets = jVar.mo61696i();
                mVRide.mo25865v();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRide$d */
    public static class C8302d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8301c(0);
        }
    }

    static {
        new C17394d0("MVRide");
        HashMap hashMap = new HashMap();
        f24857n = hashMap;
        hashMap.put(C25239c.class, new C8300b());
        hashMap.put(C25240d.class, new C8302d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.JOURNEY, new FieldMetaData("journey", (byte) 3, new StructMetaData(MVJourneyInfo.class)));
        enumMap.put(_Fields.DEPARTURE_TIME, new FieldMetaData("departureTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.MAX_NUM_PASSENGERS, new FieldMetaData("maxNumPassengers", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCarPoolPrice.class)));
        enumMap.put(_Fields.FULL_PRICE, new FieldMetaData("fullPrice", (byte) 2, new StructMetaData(MVCarPoolPrice.class)));
        enumMap.put(_Fields.RECURRENT_DETAILS, new FieldMetaData("recurrentDetails", (byte) 2, new StructMetaData(MVRecurrentRideDetails.class)));
        enumMap.put(_Fields.ARRIVAL_TIME, new FieldMetaData("arrivalTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.DRIVER_ROUTES, new FieldMetaData("driverRoutes", (byte) 2, new ListMetaData(new StructMetaData(MVDriverRouteDetails.class))));
        enumMap.put(_Fields.PARKING, new FieldMetaData("parking", (byte) 2, new StructMetaData(MVParking.class)));
        enumMap.put(_Fields.EVENT_METADATA, new FieldMetaData("eventMetadata", (byte) 2, new StructMetaData(MVRSEvent.class)));
        enumMap.put(_Fields.NUMBER_OF_TICKETS, new FieldMetaData("numberOfTickets", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24858o = unmodifiableMap;
        FieldMetaData.m61947a(MVRide.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
            mo25201C1(new C25112b(new C25276a((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            mo25202X0(new C25112b(new C25276a((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f24857n.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24857n.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25845a(MVRide mVRide) {
        if (mVRide == null || this.rideId != mVRide.rideId) {
            return false;
        }
        boolean k = mo25854k();
        boolean k2 = mVRide.mo25854k();
        if (((k || k2) && (!k || !k2 || !this.journey.mo25634a(mVRide.journey))) || this.departureTime != mVRide.departureTime || this.maxNumPassengers != mVRide.maxNumPassengers) {
            return false;
        }
        boolean p = mo25858p();
        boolean p2 = mVRide.mo25858p();
        if ((p || p2) && (!p || !p2 || !this.price.mo25461a(mVRide.price))) {
            return false;
        }
        boolean j = mo25853j();
        boolean j2 = mVRide.mo25853j();
        if ((j || j2) && (!j || !j2 || !this.fullPrice.mo25461a(mVRide.fullPrice))) {
            return false;
        }
        boolean q = mo25859q();
        boolean q2 = mVRide.mo25859q();
        if ((q || q2) && (!q || !q2 || !this.recurrentDetails.mo25836a(mVRide.recurrentDetails))) {
            return false;
        }
        boolean f = mo25848f();
        boolean f2 = mVRide.mo25848f();
        if ((f || f2) && (!f || !f2 || this.arrivalTime != mVRide.arrivalTime)) {
            return false;
        }
        boolean h = mo25850h();
        boolean h2 = mVRide.mo25850h();
        if ((h || h2) && (!h || !h2 || !this.driverRoutes.equals(mVRide.driverRoutes))) {
            return false;
        }
        boolean o = mo25857o();
        boolean o2 = mVRide.mo25857o();
        if ((o || o2) && (!o || !o2 || !this.parking.mo25644a(mVRide.parking))) {
            return false;
        }
        boolean i = mo25852i();
        boolean i2 = mVRide.mo25852i();
        if ((i || i2) && (!i || !i2 || !this.eventMetadata.mo31216a(mVRide.eventMetadata))) {
            return false;
        }
        boolean m = mo25856m();
        boolean m2 = mVRide.mo25856m();
        if (!m && !m2) {
            return true;
        }
        if (!m || !m2 || this.numberOfTickets != mVRide.numberOfTickets) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVRide mVRide = (MVRide) obj;
        if (!getClass().equals(mVRide.getClass())) {
            return getClass().getName().compareTo(mVRide.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25860r()).compareTo(Boolean.valueOf(mVRide.mo25860r()));
        if (compareTo != 0 || ((mo25860r() && (compareTo = C25082a.m62839c(this.rideId, mVRide.rideId)) != 0) || (compareTo = Boolean.valueOf(mo25854k()).compareTo(Boolean.valueOf(mVRide.mo25854k()))) != 0 || ((mo25854k() && (compareTo = this.journey.compareTo(mVRide.journey)) != 0) || (compareTo = Boolean.valueOf(mo25849g()).compareTo(Boolean.valueOf(mVRide.mo25849g()))) != 0 || ((mo25849g() && (compareTo = C25082a.m62840d(this.departureTime, mVRide.departureTime)) != 0) || (compareTo = Boolean.valueOf(mo25855l()).compareTo(Boolean.valueOf(mVRide.mo25855l()))) != 0 || ((mo25855l() && (compareTo = C25082a.m62839c(this.maxNumPassengers, mVRide.maxNumPassengers)) != 0) || (compareTo = Boolean.valueOf(mo25858p()).compareTo(Boolean.valueOf(mVRide.mo25858p()))) != 0 || ((mo25858p() && (compareTo = this.price.compareTo(mVRide.price)) != 0) || (compareTo = Boolean.valueOf(mo25853j()).compareTo(Boolean.valueOf(mVRide.mo25853j()))) != 0 || ((mo25853j() && (compareTo = this.fullPrice.compareTo(mVRide.fullPrice)) != 0) || (compareTo = Boolean.valueOf(mo25859q()).compareTo(Boolean.valueOf(mVRide.mo25859q()))) != 0 || ((mo25859q() && (compareTo = this.recurrentDetails.compareTo(mVRide.recurrentDetails)) != 0) || (compareTo = Boolean.valueOf(mo25848f()).compareTo(Boolean.valueOf(mVRide.mo25848f()))) != 0 || ((mo25848f() && (compareTo = C25082a.m62840d(this.arrivalTime, mVRide.arrivalTime)) != 0) || (compareTo = Boolean.valueOf(mo25850h()).compareTo(Boolean.valueOf(mVRide.mo25850h()))) != 0 || ((mo25850h() && (compareTo = C25082a.m62844h(this.driverRoutes, mVRide.driverRoutes)) != 0) || (compareTo = Boolean.valueOf(mo25857o()).compareTo(Boolean.valueOf(mVRide.mo25857o()))) != 0 || ((mo25857o() && (compareTo = this.parking.compareTo(mVRide.parking)) != 0) || (compareTo = Boolean.valueOf(mo25852i()).compareTo(Boolean.valueOf(mVRide.mo25852i()))) != 0 || ((mo25852i() && (compareTo = this.eventMetadata.compareTo(mVRide.eventMetadata)) != 0) || (compareTo = Boolean.valueOf(mo25856m()).compareTo(Boolean.valueOf(mVRide.mo25856m()))) != 0)))))))))))) {
            return compareTo;
        }
        if (!mo25856m() || (c = C25082a.m62839c(this.numberOfTickets, mVRide.numberOfTickets)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVRide)) {
            return mo25845a((MVRide) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25848f() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: g */
    public final boolean mo25849g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo25850h() {
        return this.driverRoutes != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25852i() {
        return this.eventMetadata != null;
    }

    /* renamed from: j */
    public final boolean mo25853j() {
        return this.fullPrice != null;
    }

    /* renamed from: k */
    public final boolean mo25854k() {
        return this.journey != null;
    }

    /* renamed from: l */
    public final boolean mo25855l() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: m */
    public final boolean mo25856m() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: o */
    public final boolean mo25857o() {
        return this.parking != null;
    }

    /* renamed from: p */
    public final boolean mo25858p() {
        return this.price != null;
    }

    /* renamed from: q */
    public final boolean mo25859q() {
        return this.recurrentDetails != null;
    }

    /* renamed from: r */
    public final boolean mo25860r() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: s */
    public final void mo25861s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: t */
    public final void mo25862t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRide(", "rideId:");
        C0016g.m42z(n, this.rideId, ", ", "journey:");
        MVJourneyInfo mVJourneyInfo = this.journey;
        if (mVJourneyInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVJourneyInfo);
        }
        n.append(", ");
        n.append("departureTime:");
        C25541a.m63889t(n, this.departureTime, ", ", "maxNumPassengers:");
        C0016g.m42z(n, this.maxNumPassengers, ", ", "price:");
        MVCarPoolPrice mVCarPoolPrice = this.price;
        if (mVCarPoolPrice == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolPrice);
        }
        if (mo25853j()) {
            n.append(", ");
            n.append("fullPrice:");
            MVCarPoolPrice mVCarPoolPrice2 = this.fullPrice;
            if (mVCarPoolPrice2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCarPoolPrice2);
            }
        }
        if (mo25859q()) {
            n.append(", ");
            n.append("recurrentDetails:");
            MVRecurrentRideDetails mVRecurrentRideDetails = this.recurrentDetails;
            if (mVRecurrentRideDetails == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVRecurrentRideDetails);
            }
        }
        if (mo25848f()) {
            n.append(", ");
            n.append("arrivalTime:");
            n.append(this.arrivalTime);
        }
        if (mo25850h()) {
            n.append(", ");
            n.append("driverRoutes:");
            List<MVDriverRouteDetails> list = this.driverRoutes;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo25857o()) {
            n.append(", ");
            n.append("parking:");
            MVParking mVParking = this.parking;
            if (mVParking == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVParking);
            }
        }
        if (mo25852i()) {
            n.append(", ");
            n.append("eventMetadata:");
            MVRSEvent mVRSEvent = this.eventMetadata;
            if (mVRSEvent == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVRSEvent);
            }
        }
        if (mo25856m()) {
            n.append(", ");
            n.append("numberOfTickets:");
            n.append(this.numberOfTickets);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo25864u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: v */
    public final void mo25865v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: w */
    public final void mo25866w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: y */
    public final void mo25867y() throws TException {
        MVParkingMetaData mVParkingMetaData;
        MVJourneyInfo mVJourneyInfo = this.journey;
        if (mVJourneyInfo != null) {
            MVRideLocationDescriptor mVRideLocationDescriptor = mVJourneyInfo.pickup;
            if (mVRideLocationDescriptor != null) {
                mVRideLocationDescriptor.mo25878j();
            }
            MVRideLocationDescriptor mVRideLocationDescriptor2 = mVJourneyInfo.dropoff;
            if (mVRideLocationDescriptor2 != null) {
                mVRideLocationDescriptor2.mo25878j();
            }
        }
        MVRecurrentRideDetails mVRecurrentRideDetails = this.recurrentDetails;
        MVParking mVParking = this.parking;
        if (!(mVParking == null || (mVParkingMetaData = mVParking.parkingMetadata) == null)) {
            mVParkingMetaData.mo25667q();
        }
        MVRSEvent mVRSEvent = this.eventMetadata;
        if (mVRSEvent != null) {
            mVRSEvent.mo31231r();
        }
    }
}
