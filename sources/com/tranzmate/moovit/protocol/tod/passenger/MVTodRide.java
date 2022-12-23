package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVTodRide implements TBase<MVTodRide, _Fields>, Serializable, Cloneable, Comparable<MVTodRide> {

    /* renamed from: b */
    public static final C25113c f29528b = new C25113c("rideId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29529c = new C25113c("orderTime", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f29530d = new C25113c(ServerParameters.STATUS, (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f29531e = new C25113c("journeyInfo", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f29532f = new C25113c("vehicle", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f29533g = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f29534h = new C25113c("supportPhoneNumber", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f29535i = new C25113c("taxiProviderId", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f29536j = new C25113c("numOfPassengers", (byte) 8, 9);

    /* renamed from: k */
    public static final C25113c f29537k = new C25113c("isAccessible", (byte) 2, 10);

    /* renamed from: l */
    public static final C25113c f29538l = new C25113c("rating", (byte) 8, 11);

    /* renamed from: m */
    public static final C25113c f29539m = new C25113c("canRate", (byte) 2, 12);

    /* renamed from: n */
    public static final C25113c f29540n = new C25113c("privateRide", (byte) 2, 13);

    /* renamed from: o */
    public static final C25113c f29541o = new C25113c("numberOfAccessiblePassengers", (byte) 8, 14);

    /* renamed from: p */
    public static final C25113c f29542p = new C25113c("reservationLockTime", (byte) 10, 15);

    /* renamed from: q */
    public static final C25113c f29543q = new C25113c("isReservation", (byte) 2, 16);

    /* renamed from: r */
    public static final C25113c f29544r = new C25113c("paymentIssue", (byte) 2, 17);

    /* renamed from: s */
    public static final C25113c f29545s = new C25113c("dropOffTime", (byte) 10, 18);

    /* renamed from: t */
    public static final HashMap f29546t;

    /* renamed from: u */
    public static final Map<_Fields, FieldMetaData> f29547u;
    private short __isset_bitfield = 0;
    public boolean canRate;
    public long dropOffTime;
    public boolean isAccessible;
    public boolean isReservation;
    public MVTodRideJourneyInfo journeyInfo;
    public int numOfPassengers;
    public int numberOfAccessiblePassengers;
    private _Fields[] optionals = {_Fields.VEHICLE, _Fields.PRICE, _Fields.SUPPORT_PHONE_NUMBER, _Fields.RATING, _Fields.CAN_RATE, _Fields.PRIVATE_RIDE, _Fields.NUMBER_OF_ACCESSIBLE_PASSENGERS, _Fields.RESERVATION_LOCK_TIME, _Fields.IS_RESERVATION, _Fields.PAYMENT_ISSUE, _Fields.DROP_OFF_TIME};
    public long orderTime;
    public boolean paymentIssue;
    public MVCurrencyAmount price;
    public boolean privateRide;
    public int rating;
    public long reservationLockTime;
    public String rideId;
    public MVTodRideStatus status;
    public String supportPhoneNumber;
    public int taxiProviderId;
    public MVTodVehicle vehicle;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        ORDER_TIME(2, "orderTime"),
        STATUS(3, ServerParameters.STATUS),
        JOURNEY_INFO(4, "journeyInfo"),
        VEHICLE(5, "vehicle"),
        PRICE(6, InAppPurchaseMetaData.KEY_PRICE),
        SUPPORT_PHONE_NUMBER(7, "supportPhoneNumber"),
        TAXI_PROVIDER_ID(8, "taxiProviderId"),
        NUM_OF_PASSENGERS(9, "numOfPassengers"),
        IS_ACCESSIBLE(10, "isAccessible"),
        RATING(11, "rating"),
        CAN_RATE(12, "canRate"),
        PRIVATE_RIDE(13, "privateRide"),
        NUMBER_OF_ACCESSIBLE_PASSENGERS(14, "numberOfAccessiblePassengers"),
        RESERVATION_LOCK_TIME(15, "reservationLockTime"),
        IS_RESERVATION(16, "isReservation"),
        PAYMENT_ISSUE(17, "paymentIssue"),
        DROP_OFF_TIME(18, "dropOffTime");
        
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
                    return ORDER_TIME;
                case 3:
                    return STATUS;
                case 4:
                    return JOURNEY_INFO;
                case 5:
                    return VEHICLE;
                case 6:
                    return PRICE;
                case 7:
                    return SUPPORT_PHONE_NUMBER;
                case 8:
                    return TAXI_PROVIDER_ID;
                case 9:
                    return NUM_OF_PASSENGERS;
                case 10:
                    return IS_ACCESSIBLE;
                case 11:
                    return RATING;
                case 12:
                    return CAN_RATE;
                case 13:
                    return PRIVATE_RIDE;
                case 14:
                    return NUMBER_OF_ACCESSIBLE_PASSENGERS;
                case 15:
                    return RESERVATION_LOCK_TIME;
                case 16:
                    return IS_RESERVATION;
                case 17:
                    return PAYMENT_ISSUE;
                case 18:
                    return DROP_OFF_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRide$a */
    public static class C11303a extends C25239c<MVTodRide> {
        public C11303a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRide mVTodRide = (MVTodRide) tBase;
            mVTodRide.mo33654P();
            C25113c cVar = MVTodRide.f29528b;
            gVar.mo61687K();
            if (mVTodRide.rideId != null) {
                gVar.mo61711x(MVTodRide.f29528b);
                gVar.mo61686J(mVTodRide.rideId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodRide.f29529c);
            gVar.mo61679C(mVTodRide.orderTime);
            gVar.mo61712y();
            if (mVTodRide.status != null) {
                gVar.mo61711x(MVTodRide.f29530d);
                gVar.mo61678B(mVTodRide.status.getValue());
                gVar.mo61712y();
            }
            if (mVTodRide.journeyInfo != null) {
                gVar.mo61711x(MVTodRide.f29531e);
                mVTodRide.journeyInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRide.vehicle != null && mVTodRide.mo33677y()) {
                gVar.mo61711x(MVTodRide.f29532f);
                mVTodRide.vehicle.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRide.price != null && mVTodRide.mo33668p()) {
                gVar.mo61711x(MVTodRide.f29533g);
                mVTodRide.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRide.supportPhoneNumber != null && mVTodRide.mo33675v()) {
                gVar.mo61711x(MVTodRide.f29534h);
                gVar.mo61686J(mVTodRide.supportPhoneNumber);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodRide.f29535i);
            gVar.mo61678B(mVTodRide.taxiProviderId);
            gVar.mo61712y();
            gVar.mo61711x(MVTodRide.f29536j);
            gVar.mo61678B(mVTodRide.numOfPassengers);
            gVar.mo61712y();
            gVar.mo61711x(MVTodRide.f29537k);
            gVar.mo61708u(mVTodRide.isAccessible);
            gVar.mo61712y();
            if (mVTodRide.mo33670r()) {
                gVar.mo61711x(MVTodRide.f29538l);
                gVar.mo61678B(mVTodRide.rating);
                gVar.mo61712y();
            }
            if (mVTodRide.mo33658f()) {
                gVar.mo61711x(MVTodRide.f29539m);
                gVar.mo61708u(mVTodRide.canRate);
                gVar.mo61712y();
            }
            if (mVTodRide.mo33669q()) {
                gVar.mo61711x(MVTodRide.f29540n);
                gVar.mo61708u(mVTodRide.privateRide);
                gVar.mo61712y();
            }
            if (mVTodRide.mo33665l()) {
                gVar.mo61711x(MVTodRide.f29541o);
                gVar.mo61678B(mVTodRide.numberOfAccessiblePassengers);
                gVar.mo61712y();
            }
            if (mVTodRide.mo33671s()) {
                gVar.mo61711x(MVTodRide.f29542p);
                gVar.mo61679C(mVTodRide.reservationLockTime);
                gVar.mo61712y();
            }
            if (mVTodRide.mo33662i()) {
                gVar.mo61711x(MVTodRide.f29543q);
                gVar.mo61708u(mVTodRide.isReservation);
                gVar.mo61712y();
            }
            if (mVTodRide.mo33667o()) {
                gVar.mo61711x(MVTodRide.f29544r);
                gVar.mo61708u(mVTodRide.paymentIssue);
                gVar.mo61712y();
            }
            if (mVTodRide.mo33659g()) {
                gVar.mo61711x(MVTodRide.f29545s);
                gVar.mo61679C(mVTodRide.dropOffTime);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRide mVTodRide = (MVTodRide) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodRide.mo33654P();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.rideId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.orderTime = gVar.mo61697j();
                            mVTodRide.mo33648I();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.status = MVTodRideStatus.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTodRideJourneyInfo mVTodRideJourneyInfo = new MVTodRideJourneyInfo();
                            mVTodRide.journeyInfo = mVTodRideJourneyInfo;
                            mVTodRideJourneyInfo.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTodVehicle mVTodVehicle = new MVTodVehicle();
                            mVTodRide.vehicle = mVTodVehicle;
                            mVTodVehicle.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                            mVTodRide.price = mVCurrencyAmount;
                            mVCurrencyAmount.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.supportPhoneNumber = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.taxiProviderId = gVar.mo61696i();
                            mVTodRide.mo33653O();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.numOfPassengers = gVar.mo61696i();
                            mVTodRide.mo33646G();
                            break;
                        }
                    case 10:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.isAccessible = gVar.mo61690c();
                            mVTodRide.mo33644E();
                            break;
                        }
                    case 11:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.rating = gVar.mo61696i();
                            mVTodRide.mo33651M();
                            break;
                        }
                    case 12:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.canRate = gVar.mo61690c();
                            mVTodRide.mo33642A();
                            break;
                        }
                    case 13:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.privateRide = gVar.mo61690c();
                            mVTodRide.mo33650L();
                            break;
                        }
                    case 14:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.numberOfAccessiblePassengers = gVar.mo61696i();
                            mVTodRide.mo33647H();
                            break;
                        }
                    case 15:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.reservationLockTime = gVar.mo61697j();
                            mVTodRide.mo33652N();
                            break;
                        }
                    case 16:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.isReservation = gVar.mo61690c();
                            mVTodRide.mo33645F();
                            break;
                        }
                    case 17:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.paymentIssue = gVar.mo61690c();
                            mVTodRide.mo33649J();
                            break;
                        }
                    case 18:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRide.dropOffTime = gVar.mo61697j();
                            mVTodRide.mo33643D();
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRide$b */
    public static class C11304b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11303a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRide$c */
    public static class C11305c extends C25240d<MVTodRide> {
        public C11305c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRide mVTodRide = (MVTodRide) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodRide.mo33672t()) {
                bitSet.set(0);
            }
            if (mVTodRide.mo33666m()) {
                bitSet.set(1);
            }
            if (mVTodRide.mo33674u()) {
                bitSet.set(2);
            }
            if (mVTodRide.mo33663j()) {
                bitSet.set(3);
            }
            if (mVTodRide.mo33677y()) {
                bitSet.set(4);
            }
            if (mVTodRide.mo33668p()) {
                bitSet.set(5);
            }
            if (mVTodRide.mo33675v()) {
                bitSet.set(6);
            }
            if (mVTodRide.mo33676w()) {
                bitSet.set(7);
            }
            if (mVTodRide.mo33664k()) {
                bitSet.set(8);
            }
            if (mVTodRide.mo33660h()) {
                bitSet.set(9);
            }
            if (mVTodRide.mo33670r()) {
                bitSet.set(10);
            }
            if (mVTodRide.mo33658f()) {
                bitSet.set(11);
            }
            if (mVTodRide.mo33669q()) {
                bitSet.set(12);
            }
            if (mVTodRide.mo33665l()) {
                bitSet.set(13);
            }
            if (mVTodRide.mo33671s()) {
                bitSet.set(14);
            }
            if (mVTodRide.mo33662i()) {
                bitSet.set(15);
            }
            if (mVTodRide.mo33667o()) {
                bitSet.set(16);
            }
            if (mVTodRide.mo33659g()) {
                bitSet.set(17);
            }
            jVar.mo61738U(bitSet, 18);
            if (mVTodRide.mo33672t()) {
                jVar.mo61686J(mVTodRide.rideId);
            }
            if (mVTodRide.mo33666m()) {
                jVar.mo61679C(mVTodRide.orderTime);
            }
            if (mVTodRide.mo33674u()) {
                jVar.mo61678B(mVTodRide.status.getValue());
            }
            if (mVTodRide.mo33663j()) {
                mVTodRide.journeyInfo.mo25202X0(jVar);
            }
            if (mVTodRide.mo33677y()) {
                mVTodRide.vehicle.mo25202X0(jVar);
            }
            if (mVTodRide.mo33668p()) {
                mVTodRide.price.mo25202X0(jVar);
            }
            if (mVTodRide.mo33675v()) {
                jVar.mo61686J(mVTodRide.supportPhoneNumber);
            }
            if (mVTodRide.mo33676w()) {
                jVar.mo61678B(mVTodRide.taxiProviderId);
            }
            if (mVTodRide.mo33664k()) {
                jVar.mo61678B(mVTodRide.numOfPassengers);
            }
            if (mVTodRide.mo33660h()) {
                jVar.mo61708u(mVTodRide.isAccessible);
            }
            if (mVTodRide.mo33670r()) {
                jVar.mo61678B(mVTodRide.rating);
            }
            if (mVTodRide.mo33658f()) {
                jVar.mo61708u(mVTodRide.canRate);
            }
            if (mVTodRide.mo33669q()) {
                jVar.mo61708u(mVTodRide.privateRide);
            }
            if (mVTodRide.mo33665l()) {
                jVar.mo61678B(mVTodRide.numberOfAccessiblePassengers);
            }
            if (mVTodRide.mo33671s()) {
                jVar.mo61679C(mVTodRide.reservationLockTime);
            }
            if (mVTodRide.mo33662i()) {
                jVar.mo61708u(mVTodRide.isReservation);
            }
            if (mVTodRide.mo33667o()) {
                jVar.mo61708u(mVTodRide.paymentIssue);
            }
            if (mVTodRide.mo33659g()) {
                jVar.mo61679C(mVTodRide.dropOffTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRide mVTodRide = (MVTodRide) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(18);
            if (T.get(0)) {
                mVTodRide.rideId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodRide.orderTime = jVar.mo61697j();
                mVTodRide.mo33648I();
            }
            if (T.get(2)) {
                mVTodRide.status = MVTodRideStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                MVTodRideJourneyInfo mVTodRideJourneyInfo = new MVTodRideJourneyInfo();
                mVTodRide.journeyInfo = mVTodRideJourneyInfo;
                mVTodRideJourneyInfo.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVTodVehicle mVTodVehicle = new MVTodVehicle();
                mVTodRide.vehicle = mVTodVehicle;
                mVTodVehicle.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTodRide.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVTodRide.supportPhoneNumber = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVTodRide.taxiProviderId = jVar.mo61696i();
                mVTodRide.mo33653O();
            }
            if (T.get(8)) {
                mVTodRide.numOfPassengers = jVar.mo61696i();
                mVTodRide.mo33646G();
            }
            if (T.get(9)) {
                mVTodRide.isAccessible = jVar.mo61690c();
                mVTodRide.mo33644E();
            }
            if (T.get(10)) {
                mVTodRide.rating = jVar.mo61696i();
                mVTodRide.mo33651M();
            }
            if (T.get(11)) {
                mVTodRide.canRate = jVar.mo61690c();
                mVTodRide.mo33642A();
            }
            if (T.get(12)) {
                mVTodRide.privateRide = jVar.mo61690c();
                mVTodRide.mo33650L();
            }
            if (T.get(13)) {
                mVTodRide.numberOfAccessiblePassengers = jVar.mo61696i();
                mVTodRide.mo33647H();
            }
            if (T.get(14)) {
                mVTodRide.reservationLockTime = jVar.mo61697j();
                mVTodRide.mo33652N();
            }
            if (T.get(15)) {
                mVTodRide.isReservation = jVar.mo61690c();
                mVTodRide.mo33645F();
            }
            if (T.get(16)) {
                mVTodRide.paymentIssue = jVar.mo61690c();
                mVTodRide.mo33649J();
            }
            if (T.get(17)) {
                mVTodRide.dropOffTime = jVar.mo61697j();
                mVTodRide.mo33643D();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRide$d */
    public static class C11306d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11305c(0);
        }
    }

    static {
        new C17394d0("MVTodRide");
        HashMap hashMap = new HashMap();
        f29546t = hashMap;
        hashMap.put(C25239c.class, new C11304b());
        hashMap.put(C25240d.class, new C11306d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ORDER_TIME, new FieldMetaData("orderTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVTodRideStatus.class)));
        enumMap.put(_Fields.JOURNEY_INFO, new FieldMetaData("journeyInfo", (byte) 3, new StructMetaData(MVTodRideJourneyInfo.class)));
        enumMap.put(_Fields.VEHICLE, new FieldMetaData("vehicle", (byte) 2, new StructMetaData(MVTodVehicle.class)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.SUPPORT_PHONE_NUMBER, new FieldMetaData("supportPhoneNumber", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TAXI_PROVIDER_ID, new FieldMetaData("taxiProviderId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NUM_OF_PASSENGERS, new FieldMetaData("numOfPassengers", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IS_ACCESSIBLE, new FieldMetaData("isAccessible", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.RATING, new FieldMetaData("rating", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CAN_RATE, new FieldMetaData("canRate", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PRIVATE_RIDE, new FieldMetaData("privateRide", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.NUMBER_OF_ACCESSIBLE_PASSENGERS, new FieldMetaData("numberOfAccessiblePassengers", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RESERVATION_LOCK_TIME, new FieldMetaData("reservationLockTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.IS_RESERVATION, new FieldMetaData("isReservation", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PAYMENT_ISSUE, new FieldMetaData("paymentIssue", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.DROP_OFF_TIME, new FieldMetaData("dropOffTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29547u = unmodifiableMap;
        FieldMetaData.m61947a(MVTodRide.class, unmodifiableMap);
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

    /* renamed from: A */
    public final void mo33642A() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f29546t.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo33643D() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 11, true);
    }

    /* renamed from: E */
    public final void mo33644E() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: F */
    public final void mo33645F() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 9, true);
    }

    /* renamed from: G */
    public final void mo33646G() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: H */
    public final void mo33647H() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 7, true);
    }

    /* renamed from: I */
    public final void mo33648I() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: J */
    public final void mo33649J() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 10, true);
    }

    /* renamed from: L */
    public final void mo33650L() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: M */
    public final void mo33651M() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: N */
    public final void mo33652N() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 8, true);
    }

    /* renamed from: O */
    public final void mo33653O() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: P */
    public final void mo33654P() throws TException {
        MVTodRideJourneyInfo mVTodRideJourneyInfo = this.journeyInfo;
        if (mVTodRideJourneyInfo != null) {
            mVTodRideJourneyInfo.mo33691o();
        }
        MVTodVehicle mVTodVehicle = this.vehicle;
        if (mVTodVehicle != null) {
            mVTodVehicle.getClass();
        }
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount != null) {
            mVCurrencyAmount.getClass();
        }
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29546t.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33655a(MVTodRide mVTodRide) {
        if (mVTodRide == null) {
            return false;
        }
        boolean t = mo33672t();
        boolean t2 = mVTodRide.mo33672t();
        if (((t || t2) && (!t || !t2 || !this.rideId.equals(mVTodRide.rideId))) || this.orderTime != mVTodRide.orderTime) {
            return false;
        }
        boolean u = mo33674u();
        boolean u2 = mVTodRide.mo33674u();
        if ((u || u2) && (!u || !u2 || !this.status.equals(mVTodRide.status))) {
            return false;
        }
        boolean j = mo33663j();
        boolean j2 = mVTodRide.mo33663j();
        if ((j || j2) && (!j || !j2 || !this.journeyInfo.mo33679a(mVTodRide.journeyInfo))) {
            return false;
        }
        boolean y = mo33677y();
        boolean y2 = mVTodRide.mo33677y();
        if ((y || y2) && (!y || !y2 || !this.vehicle.mo33843a(mVTodRide.vehicle))) {
            return false;
        }
        boolean p = mo33668p();
        boolean p2 = mVTodRide.mo33668p();
        if ((p || p2) && (!p || !p2 || !this.price.mo26102a(mVTodRide.price))) {
            return false;
        }
        boolean v = mo33675v();
        boolean v2 = mVTodRide.mo33675v();
        if (((v || v2) && (!v || !v2 || !this.supportPhoneNumber.equals(mVTodRide.supportPhoneNumber))) || this.taxiProviderId != mVTodRide.taxiProviderId || this.numOfPassengers != mVTodRide.numOfPassengers || this.isAccessible != mVTodRide.isAccessible) {
            return false;
        }
        boolean r = mo33670r();
        boolean r2 = mVTodRide.mo33670r();
        if ((r || r2) && (!r || !r2 || this.rating != mVTodRide.rating)) {
            return false;
        }
        boolean f = mo33658f();
        boolean f2 = mVTodRide.mo33658f();
        if ((f || f2) && (!f || !f2 || this.canRate != mVTodRide.canRate)) {
            return false;
        }
        boolean q = mo33669q();
        boolean q2 = mVTodRide.mo33669q();
        if ((q || q2) && (!q || !q2 || this.privateRide != mVTodRide.privateRide)) {
            return false;
        }
        boolean l = mo33665l();
        boolean l2 = mVTodRide.mo33665l();
        if ((l || l2) && (!l || !l2 || this.numberOfAccessiblePassengers != mVTodRide.numberOfAccessiblePassengers)) {
            return false;
        }
        boolean s = mo33671s();
        boolean s2 = mVTodRide.mo33671s();
        if ((s || s2) && (!s || !s2 || this.reservationLockTime != mVTodRide.reservationLockTime)) {
            return false;
        }
        boolean i = mo33662i();
        boolean i2 = mVTodRide.mo33662i();
        if ((i || i2) && (!i || !i2 || this.isReservation != mVTodRide.isReservation)) {
            return false;
        }
        boolean o = mo33667o();
        boolean o2 = mVTodRide.mo33667o();
        if ((o || o2) && (!o || !o2 || this.paymentIssue != mVTodRide.paymentIssue)) {
            return false;
        }
        boolean g = mo33659g();
        boolean g2 = mVTodRide.mo33659g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || this.dropOffTime != mVTodRide.dropOffTime) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int d;
        MVTodRide mVTodRide = (MVTodRide) obj;
        if (!getClass().equals(mVTodRide.getClass())) {
            return getClass().getName().compareTo(mVTodRide.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33672t()).compareTo(Boolean.valueOf(mVTodRide.mo33672t()));
        if (compareTo != 0 || ((mo33672t() && (compareTo = this.rideId.compareTo(mVTodRide.rideId)) != 0) || (compareTo = Boolean.valueOf(mo33666m()).compareTo(Boolean.valueOf(mVTodRide.mo33666m()))) != 0 || ((mo33666m() && (compareTo = C25082a.m62840d(this.orderTime, mVTodRide.orderTime)) != 0) || (compareTo = Boolean.valueOf(mo33674u()).compareTo(Boolean.valueOf(mVTodRide.mo33674u()))) != 0 || ((mo33674u() && (compareTo = this.status.compareTo(mVTodRide.status)) != 0) || (compareTo = Boolean.valueOf(mo33663j()).compareTo(Boolean.valueOf(mVTodRide.mo33663j()))) != 0 || ((mo33663j() && (compareTo = this.journeyInfo.compareTo(mVTodRide.journeyInfo)) != 0) || (compareTo = Boolean.valueOf(mo33677y()).compareTo(Boolean.valueOf(mVTodRide.mo33677y()))) != 0 || ((mo33677y() && (compareTo = this.vehicle.compareTo(mVTodRide.vehicle)) != 0) || (compareTo = Boolean.valueOf(mo33668p()).compareTo(Boolean.valueOf(mVTodRide.mo33668p()))) != 0 || ((mo33668p() && (compareTo = this.price.compareTo(mVTodRide.price)) != 0) || (compareTo = Boolean.valueOf(mo33675v()).compareTo(Boolean.valueOf(mVTodRide.mo33675v()))) != 0 || ((mo33675v() && (compareTo = this.supportPhoneNumber.compareTo(mVTodRide.supportPhoneNumber)) != 0) || (compareTo = Boolean.valueOf(mo33676w()).compareTo(Boolean.valueOf(mVTodRide.mo33676w()))) != 0 || ((mo33676w() && (compareTo = C25082a.m62839c(this.taxiProviderId, mVTodRide.taxiProviderId)) != 0) || (compareTo = Boolean.valueOf(mo33664k()).compareTo(Boolean.valueOf(mVTodRide.mo33664k()))) != 0 || ((mo33664k() && (compareTo = C25082a.m62839c(this.numOfPassengers, mVTodRide.numOfPassengers)) != 0) || (compareTo = Boolean.valueOf(mo33660h()).compareTo(Boolean.valueOf(mVTodRide.mo33660h()))) != 0 || ((mo33660h() && (compareTo = C25082a.m62848l(this.isAccessible, mVTodRide.isAccessible)) != 0) || (compareTo = Boolean.valueOf(mo33670r()).compareTo(Boolean.valueOf(mVTodRide.mo33670r()))) != 0 || ((mo33670r() && (compareTo = C25082a.m62839c(this.rating, mVTodRide.rating)) != 0) || (compareTo = Boolean.valueOf(mo33658f()).compareTo(Boolean.valueOf(mVTodRide.mo33658f()))) != 0 || ((mo33658f() && (compareTo = C25082a.m62848l(this.canRate, mVTodRide.canRate)) != 0) || (compareTo = Boolean.valueOf(mo33669q()).compareTo(Boolean.valueOf(mVTodRide.mo33669q()))) != 0 || ((mo33669q() && (compareTo = C25082a.m62848l(this.privateRide, mVTodRide.privateRide)) != 0) || (compareTo = Boolean.valueOf(mo33665l()).compareTo(Boolean.valueOf(mVTodRide.mo33665l()))) != 0 || ((mo33665l() && (compareTo = C25082a.m62839c(this.numberOfAccessiblePassengers, mVTodRide.numberOfAccessiblePassengers)) != 0) || (compareTo = Boolean.valueOf(mo33671s()).compareTo(Boolean.valueOf(mVTodRide.mo33671s()))) != 0 || ((mo33671s() && (compareTo = C25082a.m62840d(this.reservationLockTime, mVTodRide.reservationLockTime)) != 0) || (compareTo = Boolean.valueOf(mo33662i()).compareTo(Boolean.valueOf(mVTodRide.mo33662i()))) != 0 || ((mo33662i() && (compareTo = C25082a.m62848l(this.isReservation, mVTodRide.isReservation)) != 0) || (compareTo = Boolean.valueOf(mo33667o()).compareTo(Boolean.valueOf(mVTodRide.mo33667o()))) != 0 || ((mo33667o() && (compareTo = C25082a.m62848l(this.paymentIssue, mVTodRide.paymentIssue)) != 0) || (compareTo = Boolean.valueOf(mo33659g()).compareTo(Boolean.valueOf(mVTodRide.mo33659g()))) != 0)))))))))))))))))) {
            return compareTo;
        }
        if (!mo33659g() || (d = C25082a.m62840d(this.dropOffTime, mVTodRide.dropOffTime)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodRide)) {
            return mo33655a((MVTodRide) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33658f() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: g */
    public final boolean mo33659g() {
        return C13637c.m34053H(this.__isset_bitfield, 11);
    }

    /* renamed from: h */
    public final boolean mo33660h() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33662i() {
        return C13637c.m34053H(this.__isset_bitfield, 9);
    }

    /* renamed from: j */
    public final boolean mo33663j() {
        return this.journeyInfo != null;
    }

    /* renamed from: k */
    public final boolean mo33664k() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: l */
    public final boolean mo33665l() {
        return C13637c.m34053H(this.__isset_bitfield, 7);
    }

    /* renamed from: m */
    public final boolean mo33666m() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: o */
    public final boolean mo33667o() {
        return C13637c.m34053H(this.__isset_bitfield, 10);
    }

    /* renamed from: p */
    public final boolean mo33668p() {
        return this.price != null;
    }

    /* renamed from: q */
    public final boolean mo33669q() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: r */
    public final boolean mo33670r() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: s */
    public final boolean mo33671s() {
        return C13637c.m34053H(this.__isset_bitfield, 8);
    }

    /* renamed from: t */
    public final boolean mo33672t() {
        return this.rideId != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodRide(", "rideId:");
        String str = this.rideId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("orderTime:");
        C25541a.m63889t(n, this.orderTime, ", ", "status:");
        MVTodRideStatus mVTodRideStatus = this.status;
        if (mVTodRideStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodRideStatus);
        }
        n.append(", ");
        n.append("journeyInfo:");
        MVTodRideJourneyInfo mVTodRideJourneyInfo = this.journeyInfo;
        if (mVTodRideJourneyInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodRideJourneyInfo);
        }
        if (mo33677y()) {
            n.append(", ");
            n.append("vehicle:");
            MVTodVehicle mVTodVehicle = this.vehicle;
            if (mVTodVehicle == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodVehicle);
            }
        }
        if (mo33668p()) {
            n.append(", ");
            n.append("price:");
            MVCurrencyAmount mVCurrencyAmount = this.price;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        if (mo33675v()) {
            n.append(", ");
            n.append("supportPhoneNumber:");
            String str2 = this.supportPhoneNumber;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(", ");
        n.append("taxiProviderId:");
        C0016g.m42z(n, this.taxiProviderId, ", ", "numOfPassengers:");
        C0016g.m42z(n, this.numOfPassengers, ", ", "isAccessible:");
        n.append(this.isAccessible);
        if (mo33670r()) {
            n.append(", ");
            n.append("rating:");
            n.append(this.rating);
        }
        if (mo33658f()) {
            n.append(", ");
            n.append("canRate:");
            n.append(this.canRate);
        }
        if (mo33669q()) {
            n.append(", ");
            n.append("privateRide:");
            n.append(this.privateRide);
        }
        if (mo33665l()) {
            n.append(", ");
            n.append("numberOfAccessiblePassengers:");
            n.append(this.numberOfAccessiblePassengers);
        }
        if (mo33671s()) {
            n.append(", ");
            n.append("reservationLockTime:");
            n.append(this.reservationLockTime);
        }
        if (mo33662i()) {
            n.append(", ");
            n.append("isReservation:");
            n.append(this.isReservation);
        }
        if (mo33667o()) {
            n.append(", ");
            n.append("paymentIssue:");
            n.append(this.paymentIssue);
        }
        if (mo33659g()) {
            n.append(", ");
            n.append("dropOffTime:");
            n.append(this.dropOffTime);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo33674u() {
        return this.status != null;
    }

    /* renamed from: v */
    public final boolean mo33675v() {
        return this.supportPhoneNumber != null;
    }

    /* renamed from: w */
    public final boolean mo33676w() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: y */
    public final boolean mo33677y() {
        return this.vehicle != null;
    }
}
