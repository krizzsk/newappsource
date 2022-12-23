package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.tripplanner.MVWalkLeg;
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

public class MVTodOrderAssignment implements TBase<MVTodOrderAssignment, _Fields>, Serializable, Cloneable, Comparable<MVTodOrderAssignment> {

    /* renamed from: b */
    public static final C25113c f29412b = new C25113c("rideId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29413c = new C25113c("pickupTime", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f29414d = new C25113c("journeyInfo", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29415e = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f29416f = new C25113c("vehicle", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f29417g = new C25113c("dropoffTime", (byte) 10, 6);

    /* renamed from: h */
    public static final C25113c f29418h = new C25113c("lengthMeters", (byte) 4, 7);

    /* renamed from: i */
    public static final C25113c f29419i = new C25113c("taxiProviderId", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f29420j = new C25113c("walkToPickup", (byte) 12, 9);

    /* renamed from: k */
    public static final C25113c f29421k = new C25113c("walkFromDropOff", (byte) 12, 10);

    /* renamed from: l */
    public static final C25113c f29422l = new C25113c("isReservation", (byte) 2, 11);

    /* renamed from: m */
    public static final C25113c f29423m = new C25113c("maxPrice", (byte) 12, 12);

    /* renamed from: n */
    public static final C25113c f29424n = new C25113c("reservationLockTime", (byte) 10, 13);

    /* renamed from: o */
    public static final C25113c f29425o = new C25113c("assignmentId", (byte) 11, 14);

    /* renamed from: p */
    public static final C25113c f29426p = new C25113c("todZoneId", (byte) 8, 15);

    /* renamed from: q */
    public static final C25113c f29427q = new C25113c("inAppPaymentAllowed", (byte) 2, 16);

    /* renamed from: r */
    public static final C25113c f29428r = new C25113c("faresExplanationURL", (byte) 11, 17);

    /* renamed from: s */
    public static final C25113c f29429s = new C25113c("orderMode", (byte) 8, 18);

    /* renamed from: t */
    public static final HashMap f29430t;

    /* renamed from: u */
    public static final Map<_Fields, FieldMetaData> f29431u;
    private byte __isset_bitfield = 0;
    public String assignmentId;
    public long dropoffTime;
    public String faresExplanationURL;
    public boolean inAppPaymentAllowed;
    public boolean isReservation;
    public MVTodRideJourneyInfo journeyInfo;
    public double lengthMeters;
    public MVCurrencyAmount maxPrice;
    private _Fields[] optionals = {_Fields.PRICE, _Fields.VEHICLE, _Fields.DROPOFF_TIME, _Fields.LENGTH_METERS, _Fields.WALK_TO_PICKUP, _Fields.WALK_FROM_DROP_OFF, _Fields.MAX_PRICE, _Fields.RESERVATION_LOCK_TIME, _Fields.ASSIGNMENT_ID, _Fields.IN_APP_PAYMENT_ALLOWED, _Fields.FARES_EXPLANATION_URL, _Fields.ORDER_MODE};
    public MVTodOrderMode orderMode;
    public long pickupTime;
    public MVCurrencyAmount price;
    public long reservationLockTime;
    public String rideId;
    public int taxiProviderId;
    public int todZoneId;
    public MVTodVehicle vehicle;
    public MVWalkLeg walkFromDropOff;
    public MVWalkLeg walkToPickup;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        PICKUP_TIME(2, "pickupTime"),
        JOURNEY_INFO(3, "journeyInfo"),
        PRICE(4, InAppPurchaseMetaData.KEY_PRICE),
        VEHICLE(5, "vehicle"),
        DROPOFF_TIME(6, "dropoffTime"),
        LENGTH_METERS(7, "lengthMeters"),
        TAXI_PROVIDER_ID(8, "taxiProviderId"),
        WALK_TO_PICKUP(9, "walkToPickup"),
        WALK_FROM_DROP_OFF(10, "walkFromDropOff"),
        IS_RESERVATION(11, "isReservation"),
        MAX_PRICE(12, "maxPrice"),
        RESERVATION_LOCK_TIME(13, "reservationLockTime"),
        ASSIGNMENT_ID(14, "assignmentId"),
        TOD_ZONE_ID(15, "todZoneId"),
        IN_APP_PAYMENT_ALLOWED(16, "inAppPaymentAllowed"),
        FARES_EXPLANATION_URL(17, "faresExplanationURL"),
        ORDER_MODE(18, "orderMode");
        
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
                    return PICKUP_TIME;
                case 3:
                    return JOURNEY_INFO;
                case 4:
                    return PRICE;
                case 5:
                    return VEHICLE;
                case 6:
                    return DROPOFF_TIME;
                case 7:
                    return LENGTH_METERS;
                case 8:
                    return TAXI_PROVIDER_ID;
                case 9:
                    return WALK_TO_PICKUP;
                case 10:
                    return WALK_FROM_DROP_OFF;
                case 11:
                    return IS_RESERVATION;
                case 12:
                    return MAX_PRICE;
                case 13:
                    return RESERVATION_LOCK_TIME;
                case 14:
                    return ASSIGNMENT_ID;
                case 15:
                    return TOD_ZONE_ID;
                case 16:
                    return IN_APP_PAYMENT_ALLOWED;
                case 17:
                    return FARES_EXPLANATION_URL;
                case 18:
                    return ORDER_MODE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderAssignment$a */
    public static class C11241a extends C25239c<MVTodOrderAssignment> {
        public C11241a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodOrderAssignment mVTodOrderAssignment = (MVTodOrderAssignment) tBase;
            mVTodOrderAssignment.mo33464L();
            C25113c cVar = MVTodOrderAssignment.f29412b;
            gVar.mo61687K();
            if (mVTodOrderAssignment.rideId != null) {
                gVar.mo61711x(MVTodOrderAssignment.f29412b);
                gVar.mo61686J(mVTodOrderAssignment.rideId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodOrderAssignment.f29413c);
            gVar.mo61679C(mVTodOrderAssignment.pickupTime);
            gVar.mo61712y();
            if (mVTodOrderAssignment.journeyInfo != null) {
                gVar.mo61711x(MVTodOrderAssignment.f29414d);
                mVTodOrderAssignment.journeyInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodOrderAssignment.price != null && mVTodOrderAssignment.mo33478q()) {
                gVar.mo61711x(MVTodOrderAssignment.f29415e);
                mVTodOrderAssignment.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodOrderAssignment.vehicle != null && mVTodOrderAssignment.mo33484v()) {
                gVar.mo61711x(MVTodOrderAssignment.f29416f);
                mVTodOrderAssignment.vehicle.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodOrderAssignment.mo33468g()) {
                gVar.mo61711x(MVTodOrderAssignment.f29417g);
                gVar.mo61679C(mVTodOrderAssignment.dropoffTime);
                gVar.mo61712y();
            }
            if (mVTodOrderAssignment.mo33474l()) {
                gVar.mo61711x(MVTodOrderAssignment.f29418h);
                gVar.mo61710w(mVTodOrderAssignment.lengthMeters);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodOrderAssignment.f29419i);
            gVar.mo61678B(mVTodOrderAssignment.taxiProviderId);
            gVar.mo61712y();
            if (mVTodOrderAssignment.walkToPickup != null && mVTodOrderAssignment.mo33486y()) {
                gVar.mo61711x(MVTodOrderAssignment.f29420j);
                mVTodOrderAssignment.walkToPickup.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodOrderAssignment.walkFromDropOff != null && mVTodOrderAssignment.mo33485w()) {
                gVar.mo61711x(MVTodOrderAssignment.f29421k);
                mVTodOrderAssignment.walkFromDropOff.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodOrderAssignment.f29422l);
            gVar.mo61708u(mVTodOrderAssignment.isReservation);
            gVar.mo61712y();
            if (mVTodOrderAssignment.maxPrice != null && mVTodOrderAssignment.mo33475m()) {
                gVar.mo61711x(MVTodOrderAssignment.f29423m);
                mVTodOrderAssignment.maxPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodOrderAssignment.mo33479r()) {
                gVar.mo61711x(MVTodOrderAssignment.f29424n);
                gVar.mo61679C(mVTodOrderAssignment.reservationLockTime);
                gVar.mo61712y();
            }
            if (mVTodOrderAssignment.assignmentId != null && mVTodOrderAssignment.mo33467f()) {
                gVar.mo61711x(MVTodOrderAssignment.f29425o);
                gVar.mo61686J(mVTodOrderAssignment.assignmentId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodOrderAssignment.f29426p);
            gVar.mo61678B(mVTodOrderAssignment.todZoneId);
            gVar.mo61712y();
            if (mVTodOrderAssignment.mo33471i()) {
                gVar.mo61711x(MVTodOrderAssignment.f29427q);
                gVar.mo61708u(mVTodOrderAssignment.inAppPaymentAllowed);
                gVar.mo61712y();
            }
            if (mVTodOrderAssignment.faresExplanationURL != null && mVTodOrderAssignment.mo33469h()) {
                gVar.mo61711x(MVTodOrderAssignment.f29428r);
                gVar.mo61686J(mVTodOrderAssignment.faresExplanationURL);
                gVar.mo61712y();
            }
            if (mVTodOrderAssignment.orderMode != null && mVTodOrderAssignment.mo33476o()) {
                gVar.mo61711x(MVTodOrderAssignment.f29429s);
                gVar.mo61678B(mVTodOrderAssignment.orderMode.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodOrderAssignment mVTodOrderAssignment = (MVTodOrderAssignment) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodOrderAssignment.mo33464L();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderAssignment.rideId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderAssignment.pickupTime = gVar.mo61697j();
                            mVTodOrderAssignment.mo33460G();
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTodRideJourneyInfo mVTodRideJourneyInfo = new MVTodRideJourneyInfo();
                            mVTodOrderAssignment.journeyInfo = mVTodRideJourneyInfo;
                            mVTodRideJourneyInfo.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                            mVTodOrderAssignment.price = mVCurrencyAmount;
                            mVCurrencyAmount.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTodVehicle mVTodVehicle = new MVTodVehicle();
                            mVTodOrderAssignment.vehicle = mVTodVehicle;
                            mVTodVehicle.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderAssignment.dropoffTime = gVar.mo61697j();
                            mVTodOrderAssignment.mo33456A();
                            break;
                        }
                    case 7:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderAssignment.lengthMeters = gVar.mo61692e();
                            mVTodOrderAssignment.mo33459F();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderAssignment.taxiProviderId = gVar.mo61696i();
                            mVTodOrderAssignment.mo33462I();
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVWalkLeg mVWalkLeg = new MVWalkLeg();
                            mVTodOrderAssignment.walkToPickup = mVWalkLeg;
                            mVWalkLeg.mo25201C1(gVar);
                            break;
                        }
                    case 10:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVWalkLeg mVWalkLeg2 = new MVWalkLeg();
                            mVTodOrderAssignment.walkFromDropOff = mVWalkLeg2;
                            mVWalkLeg2.mo25201C1(gVar);
                            break;
                        }
                    case 11:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderAssignment.isReservation = gVar.mo61690c();
                            mVTodOrderAssignment.mo33458E();
                            break;
                        }
                    case 12:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVTodOrderAssignment.maxPrice = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 13:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderAssignment.reservationLockTime = gVar.mo61697j();
                            mVTodOrderAssignment.mo33461H();
                            break;
                        }
                    case 14:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderAssignment.assignmentId = gVar.mo61704q();
                            break;
                        }
                    case 15:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderAssignment.todZoneId = gVar.mo61696i();
                            mVTodOrderAssignment.mo33463J();
                            break;
                        }
                    case 16:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderAssignment.inAppPaymentAllowed = gVar.mo61690c();
                            mVTodOrderAssignment.mo33457D();
                            break;
                        }
                    case 17:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderAssignment.faresExplanationURL = gVar.mo61704q();
                            break;
                        }
                    case 18:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderAssignment.orderMode = MVTodOrderMode.findByValue(gVar.mo61696i());
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderAssignment$b */
    public static class C11242b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11241a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderAssignment$c */
    public static class C11243c extends C25240d<MVTodOrderAssignment> {
        public C11243c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodOrderAssignment mVTodOrderAssignment = (MVTodOrderAssignment) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodOrderAssignment.mo33480s()) {
                bitSet.set(0);
            }
            if (mVTodOrderAssignment.mo33477p()) {
                bitSet.set(1);
            }
            if (mVTodOrderAssignment.mo33473k()) {
                bitSet.set(2);
            }
            if (mVTodOrderAssignment.mo33478q()) {
                bitSet.set(3);
            }
            if (mVTodOrderAssignment.mo33484v()) {
                bitSet.set(4);
            }
            if (mVTodOrderAssignment.mo33468g()) {
                bitSet.set(5);
            }
            if (mVTodOrderAssignment.mo33474l()) {
                bitSet.set(6);
            }
            if (mVTodOrderAssignment.mo33481t()) {
                bitSet.set(7);
            }
            if (mVTodOrderAssignment.mo33486y()) {
                bitSet.set(8);
            }
            if (mVTodOrderAssignment.mo33485w()) {
                bitSet.set(9);
            }
            if (mVTodOrderAssignment.mo33472j()) {
                bitSet.set(10);
            }
            if (mVTodOrderAssignment.mo33475m()) {
                bitSet.set(11);
            }
            if (mVTodOrderAssignment.mo33479r()) {
                bitSet.set(12);
            }
            if (mVTodOrderAssignment.mo33467f()) {
                bitSet.set(13);
            }
            if (mVTodOrderAssignment.mo33483u()) {
                bitSet.set(14);
            }
            if (mVTodOrderAssignment.mo33471i()) {
                bitSet.set(15);
            }
            if (mVTodOrderAssignment.mo33469h()) {
                bitSet.set(16);
            }
            if (mVTodOrderAssignment.mo33476o()) {
                bitSet.set(17);
            }
            jVar.mo61738U(bitSet, 18);
            if (mVTodOrderAssignment.mo33480s()) {
                jVar.mo61686J(mVTodOrderAssignment.rideId);
            }
            if (mVTodOrderAssignment.mo33477p()) {
                jVar.mo61679C(mVTodOrderAssignment.pickupTime);
            }
            if (mVTodOrderAssignment.mo33473k()) {
                mVTodOrderAssignment.journeyInfo.mo25202X0(jVar);
            }
            if (mVTodOrderAssignment.mo33478q()) {
                mVTodOrderAssignment.price.mo25202X0(jVar);
            }
            if (mVTodOrderAssignment.mo33484v()) {
                mVTodOrderAssignment.vehicle.mo25202X0(jVar);
            }
            if (mVTodOrderAssignment.mo33468g()) {
                jVar.mo61679C(mVTodOrderAssignment.dropoffTime);
            }
            if (mVTodOrderAssignment.mo33474l()) {
                jVar.mo61710w(mVTodOrderAssignment.lengthMeters);
            }
            if (mVTodOrderAssignment.mo33481t()) {
                jVar.mo61678B(mVTodOrderAssignment.taxiProviderId);
            }
            if (mVTodOrderAssignment.mo33486y()) {
                mVTodOrderAssignment.walkToPickup.mo25202X0(jVar);
            }
            if (mVTodOrderAssignment.mo33485w()) {
                mVTodOrderAssignment.walkFromDropOff.mo25202X0(jVar);
            }
            if (mVTodOrderAssignment.mo33472j()) {
                jVar.mo61708u(mVTodOrderAssignment.isReservation);
            }
            if (mVTodOrderAssignment.mo33475m()) {
                mVTodOrderAssignment.maxPrice.mo25202X0(jVar);
            }
            if (mVTodOrderAssignment.mo33479r()) {
                jVar.mo61679C(mVTodOrderAssignment.reservationLockTime);
            }
            if (mVTodOrderAssignment.mo33467f()) {
                jVar.mo61686J(mVTodOrderAssignment.assignmentId);
            }
            if (mVTodOrderAssignment.mo33483u()) {
                jVar.mo61678B(mVTodOrderAssignment.todZoneId);
            }
            if (mVTodOrderAssignment.mo33471i()) {
                jVar.mo61708u(mVTodOrderAssignment.inAppPaymentAllowed);
            }
            if (mVTodOrderAssignment.mo33469h()) {
                jVar.mo61686J(mVTodOrderAssignment.faresExplanationURL);
            }
            if (mVTodOrderAssignment.mo33476o()) {
                jVar.mo61678B(mVTodOrderAssignment.orderMode.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodOrderAssignment mVTodOrderAssignment = (MVTodOrderAssignment) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(18);
            if (T.get(0)) {
                mVTodOrderAssignment.rideId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodOrderAssignment.pickupTime = jVar.mo61697j();
                mVTodOrderAssignment.mo33460G();
            }
            if (T.get(2)) {
                MVTodRideJourneyInfo mVTodRideJourneyInfo = new MVTodRideJourneyInfo();
                mVTodOrderAssignment.journeyInfo = mVTodRideJourneyInfo;
                mVTodRideJourneyInfo.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTodOrderAssignment.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVTodVehicle mVTodVehicle = new MVTodVehicle();
                mVTodOrderAssignment.vehicle = mVTodVehicle;
                mVTodVehicle.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVTodOrderAssignment.dropoffTime = jVar.mo61697j();
                mVTodOrderAssignment.mo33456A();
            }
            if (T.get(6)) {
                mVTodOrderAssignment.lengthMeters = jVar.mo61692e();
                mVTodOrderAssignment.mo33459F();
            }
            if (T.get(7)) {
                mVTodOrderAssignment.taxiProviderId = jVar.mo61696i();
                mVTodOrderAssignment.mo33462I();
            }
            if (T.get(8)) {
                MVWalkLeg mVWalkLeg = new MVWalkLeg();
                mVTodOrderAssignment.walkToPickup = mVWalkLeg;
                mVWalkLeg.mo25201C1(jVar);
            }
            if (T.get(9)) {
                MVWalkLeg mVWalkLeg2 = new MVWalkLeg();
                mVTodOrderAssignment.walkFromDropOff = mVWalkLeg2;
                mVWalkLeg2.mo25201C1(jVar);
            }
            if (T.get(10)) {
                mVTodOrderAssignment.isReservation = jVar.mo61690c();
                mVTodOrderAssignment.mo33458E();
            }
            if (T.get(11)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVTodOrderAssignment.maxPrice = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
            if (T.get(12)) {
                mVTodOrderAssignment.reservationLockTime = jVar.mo61697j();
                mVTodOrderAssignment.mo33461H();
            }
            if (T.get(13)) {
                mVTodOrderAssignment.assignmentId = jVar.mo61704q();
            }
            if (T.get(14)) {
                mVTodOrderAssignment.todZoneId = jVar.mo61696i();
                mVTodOrderAssignment.mo33463J();
            }
            if (T.get(15)) {
                mVTodOrderAssignment.inAppPaymentAllowed = jVar.mo61690c();
                mVTodOrderAssignment.mo33457D();
            }
            if (T.get(16)) {
                mVTodOrderAssignment.faresExplanationURL = jVar.mo61704q();
            }
            if (T.get(17)) {
                mVTodOrderAssignment.orderMode = MVTodOrderMode.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderAssignment$d */
    public static class C11244d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11243c(0);
        }
    }

    static {
        new C17394d0("MVTodOrderAssignment");
        HashMap hashMap = new HashMap();
        f29430t = hashMap;
        hashMap.put(C25239c.class, new C11242b());
        hashMap.put(C25240d.class, new C11244d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PICKUP_TIME, new FieldMetaData("pickupTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.JOURNEY_INFO, new FieldMetaData("journeyInfo", (byte) 3, new StructMetaData(MVTodRideJourneyInfo.class)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.VEHICLE, new FieldMetaData("vehicle", (byte) 2, new StructMetaData(MVTodVehicle.class)));
        enumMap.put(_Fields.DROPOFF_TIME, new FieldMetaData("dropoffTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.LENGTH_METERS, new FieldMetaData("lengthMeters", (byte) 2, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.TAXI_PROVIDER_ID, new FieldMetaData("taxiProviderId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.WALK_TO_PICKUP, new FieldMetaData("walkToPickup", (byte) 2, new StructMetaData(MVWalkLeg.class)));
        enumMap.put(_Fields.WALK_FROM_DROP_OFF, new FieldMetaData("walkFromDropOff", (byte) 2, new StructMetaData(MVWalkLeg.class)));
        enumMap.put(_Fields.IS_RESERVATION, new FieldMetaData("isReservation", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.MAX_PRICE, new FieldMetaData("maxPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.RESERVATION_LOCK_TIME, new FieldMetaData("reservationLockTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.ASSIGNMENT_ID, new FieldMetaData("assignmentId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TOD_ZONE_ID, new FieldMetaData("todZoneId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IN_APP_PAYMENT_ALLOWED, new FieldMetaData("inAppPaymentAllowed", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.FARES_EXPLANATION_URL, new FieldMetaData("faresExplanationURL", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ORDER_MODE, new FieldMetaData("orderMode", (byte) 2, new EnumMetaData(MVTodOrderMode.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29431u = unmodifiableMap;
        FieldMetaData.m61947a(MVTodOrderAssignment.class, unmodifiableMap);
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
    public final void mo33456A() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f29430t.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo33457D() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 7, true);
    }

    /* renamed from: E */
    public final void mo33458E() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: F */
    public final void mo33459F() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: G */
    public final void mo33460G() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: H */
    public final void mo33461H() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: I */
    public final void mo33462I() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: J */
    public final void mo33463J() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: L */
    public final void mo33464L() throws TException {
        MVTodRideJourneyInfo mVTodRideJourneyInfo = this.journeyInfo;
        if (mVTodRideJourneyInfo != null) {
            mVTodRideJourneyInfo.mo33691o();
        }
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount != null) {
            mVCurrencyAmount.getClass();
        }
        MVTodVehicle mVTodVehicle = this.vehicle;
        if (mVTodVehicle != null) {
            mVTodVehicle.getClass();
        }
        MVWalkLeg mVWalkLeg = this.walkToPickup;
        if (mVWalkLeg != null) {
            mVWalkLeg.mo34905j();
        }
        MVWalkLeg mVWalkLeg2 = this.walkFromDropOff;
        if (mVWalkLeg2 != null) {
            mVWalkLeg2.mo34905j();
        }
        MVCurrencyAmount mVCurrencyAmount2 = this.maxPrice;
        if (mVCurrencyAmount2 != null) {
            mVCurrencyAmount2.getClass();
        }
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29430t.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodOrderAssignment mVTodOrderAssignment = (MVTodOrderAssignment) obj;
        if (!getClass().equals(mVTodOrderAssignment.getClass())) {
            return getClass().getName().compareTo(mVTodOrderAssignment.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33480s()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33480s()));
        if (compareTo2 != 0 || ((mo33480s() && (compareTo2 = this.rideId.compareTo(mVTodOrderAssignment.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo33477p()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33477p()))) != 0 || ((mo33477p() && (compareTo2 = C25082a.m62840d(this.pickupTime, mVTodOrderAssignment.pickupTime)) != 0) || (compareTo2 = Boolean.valueOf(mo33473k()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33473k()))) != 0 || ((mo33473k() && (compareTo2 = this.journeyInfo.compareTo(mVTodOrderAssignment.journeyInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo33478q()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33478q()))) != 0 || ((mo33478q() && (compareTo2 = this.price.compareTo(mVTodOrderAssignment.price)) != 0) || (compareTo2 = Boolean.valueOf(mo33484v()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33484v()))) != 0 || ((mo33484v() && (compareTo2 = this.vehicle.compareTo(mVTodOrderAssignment.vehicle)) != 0) || (compareTo2 = Boolean.valueOf(mo33468g()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33468g()))) != 0 || ((mo33468g() && (compareTo2 = C25082a.m62840d(this.dropoffTime, mVTodOrderAssignment.dropoffTime)) != 0) || (compareTo2 = Boolean.valueOf(mo33474l()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33474l()))) != 0 || ((mo33474l() && (compareTo2 = C25082a.m62838b(this.lengthMeters, mVTodOrderAssignment.lengthMeters)) != 0) || (compareTo2 = Boolean.valueOf(mo33481t()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33481t()))) != 0 || ((mo33481t() && (compareTo2 = C25082a.m62839c(this.taxiProviderId, mVTodOrderAssignment.taxiProviderId)) != 0) || (compareTo2 = Boolean.valueOf(mo33486y()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33486y()))) != 0 || ((mo33486y() && (compareTo2 = this.walkToPickup.compareTo(mVTodOrderAssignment.walkToPickup)) != 0) || (compareTo2 = Boolean.valueOf(mo33485w()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33485w()))) != 0 || ((mo33485w() && (compareTo2 = this.walkFromDropOff.compareTo(mVTodOrderAssignment.walkFromDropOff)) != 0) || (compareTo2 = Boolean.valueOf(mo33472j()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33472j()))) != 0 || ((mo33472j() && (compareTo2 = C25082a.m62848l(this.isReservation, mVTodOrderAssignment.isReservation)) != 0) || (compareTo2 = Boolean.valueOf(mo33475m()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33475m()))) != 0 || ((mo33475m() && (compareTo2 = this.maxPrice.compareTo(mVTodOrderAssignment.maxPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo33479r()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33479r()))) != 0 || ((mo33479r() && (compareTo2 = C25082a.m62840d(this.reservationLockTime, mVTodOrderAssignment.reservationLockTime)) != 0) || (compareTo2 = Boolean.valueOf(mo33467f()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33467f()))) != 0 || ((mo33467f() && (compareTo2 = this.assignmentId.compareTo(mVTodOrderAssignment.assignmentId)) != 0) || (compareTo2 = Boolean.valueOf(mo33483u()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33483u()))) != 0 || ((mo33483u() && (compareTo2 = C25082a.m62839c(this.todZoneId, mVTodOrderAssignment.todZoneId)) != 0) || (compareTo2 = Boolean.valueOf(mo33471i()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33471i()))) != 0 || ((mo33471i() && (compareTo2 = C25082a.m62848l(this.inAppPaymentAllowed, mVTodOrderAssignment.inAppPaymentAllowed)) != 0) || (compareTo2 = Boolean.valueOf(mo33469h()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33469h()))) != 0 || ((mo33469h() && (compareTo2 = this.faresExplanationURL.compareTo(mVTodOrderAssignment.faresExplanationURL)) != 0) || (compareTo2 = Boolean.valueOf(mo33476o()).compareTo(Boolean.valueOf(mVTodOrderAssignment.mo33476o()))) != 0)))))))))))))))))) {
            return compareTo2;
        }
        if (!mo33476o() || (compareTo = this.orderMode.compareTo(mVTodOrderAssignment.orderMode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodOrderAssignment)) {
            return false;
        }
        MVTodOrderAssignment mVTodOrderAssignment = (MVTodOrderAssignment) obj;
        boolean s = mo33480s();
        boolean s2 = mVTodOrderAssignment.mo33480s();
        if (((s || s2) && (!s || !s2 || !this.rideId.equals(mVTodOrderAssignment.rideId))) || this.pickupTime != mVTodOrderAssignment.pickupTime) {
            return false;
        }
        boolean k = mo33473k();
        boolean k2 = mVTodOrderAssignment.mo33473k();
        if ((k || k2) && (!k || !k2 || !this.journeyInfo.mo33679a(mVTodOrderAssignment.journeyInfo))) {
            return false;
        }
        boolean q = mo33478q();
        boolean q2 = mVTodOrderAssignment.mo33478q();
        if ((q || q2) && (!q || !q2 || !this.price.mo26102a(mVTodOrderAssignment.price))) {
            return false;
        }
        boolean v = mo33484v();
        boolean v2 = mVTodOrderAssignment.mo33484v();
        if ((v || v2) && (!v || !v2 || !this.vehicle.mo33843a(mVTodOrderAssignment.vehicle))) {
            return false;
        }
        boolean g = mo33468g();
        boolean g2 = mVTodOrderAssignment.mo33468g();
        if ((g || g2) && (!g || !g2 || this.dropoffTime != mVTodOrderAssignment.dropoffTime)) {
            return false;
        }
        boolean l = mo33474l();
        boolean l2 = mVTodOrderAssignment.mo33474l();
        if (((l || l2) && (!l || !l2 || this.lengthMeters != mVTodOrderAssignment.lengthMeters)) || this.taxiProviderId != mVTodOrderAssignment.taxiProviderId) {
            return false;
        }
        boolean y = mo33486y();
        boolean y2 = mVTodOrderAssignment.mo33486y();
        if ((y || y2) && (!y || !y2 || !this.walkToPickup.mo34897a(mVTodOrderAssignment.walkToPickup))) {
            return false;
        }
        boolean w = mo33485w();
        boolean w2 = mVTodOrderAssignment.mo33485w();
        if (((w || w2) && (!w || !w2 || !this.walkFromDropOff.mo34897a(mVTodOrderAssignment.walkFromDropOff))) || this.isReservation != mVTodOrderAssignment.isReservation) {
            return false;
        }
        boolean m = mo33475m();
        boolean m2 = mVTodOrderAssignment.mo33475m();
        if ((m || m2) && (!m || !m2 || !this.maxPrice.mo26102a(mVTodOrderAssignment.maxPrice))) {
            return false;
        }
        boolean r = mo33479r();
        boolean r2 = mVTodOrderAssignment.mo33479r();
        if ((r || r2) && (!r || !r2 || this.reservationLockTime != mVTodOrderAssignment.reservationLockTime)) {
            return false;
        }
        boolean f = mo33467f();
        boolean f2 = mVTodOrderAssignment.mo33467f();
        if (((f || f2) && (!f || !f2 || !this.assignmentId.equals(mVTodOrderAssignment.assignmentId))) || this.todZoneId != mVTodOrderAssignment.todZoneId) {
            return false;
        }
        boolean i = mo33471i();
        boolean i2 = mVTodOrderAssignment.mo33471i();
        if ((i || i2) && (!i || !i2 || this.inAppPaymentAllowed != mVTodOrderAssignment.inAppPaymentAllowed)) {
            return false;
        }
        boolean h = mo33469h();
        boolean h2 = mVTodOrderAssignment.mo33469h();
        if ((h || h2) && (!h || !h2 || !this.faresExplanationURL.equals(mVTodOrderAssignment.faresExplanationURL))) {
            return false;
        }
        boolean o = mo33476o();
        boolean o2 = mVTodOrderAssignment.mo33476o();
        if ((o || o2) && (!o || !o2 || !this.orderMode.equals(mVTodOrderAssignment.orderMode))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33467f() {
        return this.assignmentId != null;
    }

    /* renamed from: g */
    public final boolean mo33468g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo33469h() {
        return this.faresExplanationURL != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33471i() {
        return C13637c.m34053H(this.__isset_bitfield, 7);
    }

    /* renamed from: j */
    public final boolean mo33472j() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: k */
    public final boolean mo33473k() {
        return this.journeyInfo != null;
    }

    /* renamed from: l */
    public final boolean mo33474l() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: m */
    public final boolean mo33475m() {
        return this.maxPrice != null;
    }

    /* renamed from: o */
    public final boolean mo33476o() {
        return this.orderMode != null;
    }

    /* renamed from: p */
    public final boolean mo33477p() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: q */
    public final boolean mo33478q() {
        return this.price != null;
    }

    /* renamed from: r */
    public final boolean mo33479r() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: s */
    public final boolean mo33480s() {
        return this.rideId != null;
    }

    /* renamed from: t */
    public final boolean mo33481t() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodOrderAssignment(", "rideId:");
        String str = this.rideId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("pickupTime:");
        C25541a.m63889t(n, this.pickupTime, ", ", "journeyInfo:");
        MVTodRideJourneyInfo mVTodRideJourneyInfo = this.journeyInfo;
        if (mVTodRideJourneyInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodRideJourneyInfo);
        }
        if (mo33478q()) {
            n.append(", ");
            n.append("price:");
            MVCurrencyAmount mVCurrencyAmount = this.price;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        if (mo33484v()) {
            n.append(", ");
            n.append("vehicle:");
            MVTodVehicle mVTodVehicle = this.vehicle;
            if (mVTodVehicle == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodVehicle);
            }
        }
        if (mo33468g()) {
            n.append(", ");
            n.append("dropoffTime:");
            n.append(this.dropoffTime);
        }
        if (mo33474l()) {
            n.append(", ");
            n.append("lengthMeters:");
            n.append(this.lengthMeters);
        }
        n.append(", ");
        n.append("taxiProviderId:");
        n.append(this.taxiProviderId);
        if (mo33486y()) {
            n.append(", ");
            n.append("walkToPickup:");
            MVWalkLeg mVWalkLeg = this.walkToPickup;
            if (mVWalkLeg == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVWalkLeg);
            }
        }
        if (mo33485w()) {
            n.append(", ");
            n.append("walkFromDropOff:");
            MVWalkLeg mVWalkLeg2 = this.walkFromDropOff;
            if (mVWalkLeg2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVWalkLeg2);
            }
        }
        n.append(", ");
        n.append("isReservation:");
        n.append(this.isReservation);
        if (mo33475m()) {
            n.append(", ");
            n.append("maxPrice:");
            MVCurrencyAmount mVCurrencyAmount2 = this.maxPrice;
            if (mVCurrencyAmount2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount2);
            }
        }
        if (mo33479r()) {
            n.append(", ");
            n.append("reservationLockTime:");
            n.append(this.reservationLockTime);
        }
        if (mo33467f()) {
            n.append(", ");
            n.append("assignmentId:");
            String str2 = this.assignmentId;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(", ");
        n.append("todZoneId:");
        n.append(this.todZoneId);
        if (mo33471i()) {
            n.append(", ");
            n.append("inAppPaymentAllowed:");
            n.append(this.inAppPaymentAllowed);
        }
        if (mo33469h()) {
            n.append(", ");
            n.append("faresExplanationURL:");
            String str3 = this.faresExplanationURL;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo33476o()) {
            n.append(", ");
            n.append("orderMode:");
            MVTodOrderMode mVTodOrderMode = this.orderMode;
            if (mVTodOrderMode == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodOrderMode);
            }
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo33483u() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: v */
    public final boolean mo33484v() {
        return this.vehicle != null;
    }

    /* renamed from: w */
    public final boolean mo33485w() {
        return this.walkFromDropOff != null;
    }

    /* renamed from: y */
    public final boolean mo33486y() {
        return this.walkToPickup != null;
    }
}
