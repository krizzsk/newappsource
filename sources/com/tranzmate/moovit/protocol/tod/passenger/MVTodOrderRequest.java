package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationTarget;
import com.tranzmate.moovit.protocol.tripplanner.MVTimeType;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVTodOrderRequest implements TBase<MVTodOrderRequest, _Fields>, Serializable, Cloneable, Comparable<MVTodOrderRequest> {

    /* renamed from: b */
    public static final C25113c f29432b = new C25113c(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29433c = new C25113c("destination", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29434d = new C25113c("numberOfPassengers", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f29435e = new C25113c("userLocation", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f29436f = new C25113c("accessible", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f29437g = new C25113c("time", (byte) 10, 6);

    /* renamed from: h */
    public static final C25113c f29438h = new C25113c("providerCustomerId", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f29439i = new C25113c("includeWalkingLegs", (byte) 2, 8);

    /* renamed from: j */
    public static final C25113c f29440j = new C25113c("privateRide", (byte) 2, 9);

    /* renamed from: k */
    public static final C25113c f29441k = new C25113c("numberOfAccessiblePassengers", (byte) 8, 10);

    /* renamed from: l */
    public static final C25113c f29442l = new C25113c("timeType", (byte) 8, 11);

    /* renamed from: m */
    public static final C25113c f29443m = new C25113c("curbToCurbRide", (byte) 2, 12);

    /* renamed from: n */
    public static final C25113c f29444n = new C25113c("session", (byte) 12, 13);

    /* renamed from: o */
    public static final C25113c f29445o = new C25113c("additionalPassengersProfiles", (byte) 15, 14);

    /* renamed from: p */
    public static final C25113c f29446p = new C25113c("discountContextId", (byte) 11, 15);

    /* renamed from: q */
    public static final C25113c f29447q = new C25113c("additionalData", (byte) 11, 16);

    /* renamed from: r */
    public static final HashMap f29448r;

    /* renamed from: s */
    public static final Map<_Fields, FieldMetaData> f29449s;
    private byte __isset_bitfield = 0;
    public boolean accessible;
    public String additionalData;
    public List<MVTodSelectedProfile> additionalPassengersProfiles;
    public boolean curbToCurbRide;
    public MVLocationTarget destination;
    public String discountContextId;
    public boolean includeWalkingLegs;
    public int numberOfAccessiblePassengers;
    public int numberOfPassengers;
    private _Fields[] optionals = {_Fields.USER_LOCATION, _Fields.ACCESSIBLE, _Fields.TIME, _Fields.PROVIDER_CUSTOMER_ID, _Fields.INCLUDE_WALKING_LEGS, _Fields.PRIVATE_RIDE, _Fields.NUMBER_OF_ACCESSIBLE_PASSENGERS, _Fields.TIME_TYPE, _Fields.CURB_TO_CURB_RIDE, _Fields.SESSION, _Fields.ADDITIONAL_PASSENGERS_PROFILES, _Fields.DISCOUNT_CONTEXT_ID, _Fields.ADDITIONAL_DATA};
    public MVLocationTarget origin;
    public boolean privateRide;
    public String providerCustomerId;
    public MVTodSession session;
    public long time;
    public MVTimeType timeType;
    public MVGpsLocation userLocation;

    public enum _Fields implements C25085c {
        ORIGIN(1, AppMeasurementSdk.ConditionalUserProperty.ORIGIN),
        DESTINATION(2, "destination"),
        NUMBER_OF_PASSENGERS(3, "numberOfPassengers"),
        USER_LOCATION(4, "userLocation"),
        ACCESSIBLE(5, "accessible"),
        TIME(6, "time"),
        PROVIDER_CUSTOMER_ID(7, "providerCustomerId"),
        INCLUDE_WALKING_LEGS(8, "includeWalkingLegs"),
        PRIVATE_RIDE(9, "privateRide"),
        NUMBER_OF_ACCESSIBLE_PASSENGERS(10, "numberOfAccessiblePassengers"),
        TIME_TYPE(11, "timeType"),
        CURB_TO_CURB_RIDE(12, "curbToCurbRide"),
        SESSION(13, "session"),
        ADDITIONAL_PASSENGERS_PROFILES(14, "additionalPassengersProfiles"),
        DISCOUNT_CONTEXT_ID(15, "discountContextId"),
        ADDITIONAL_DATA(16, "additionalData");
        
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
                    return ORIGIN;
                case 2:
                    return DESTINATION;
                case 3:
                    return NUMBER_OF_PASSENGERS;
                case 4:
                    return USER_LOCATION;
                case 5:
                    return ACCESSIBLE;
                case 6:
                    return TIME;
                case 7:
                    return PROVIDER_CUSTOMER_ID;
                case 8:
                    return INCLUDE_WALKING_LEGS;
                case 9:
                    return PRIVATE_RIDE;
                case 10:
                    return NUMBER_OF_ACCESSIBLE_PASSENGERS;
                case 11:
                    return TIME_TYPE;
                case 12:
                    return CURB_TO_CURB_RIDE;
                case 13:
                    return SESSION;
                case 14:
                    return ADDITIONAL_PASSENGERS_PROFILES;
                case 15:
                    return DISCOUNT_CONTEXT_ID;
                case 16:
                    return ADDITIONAL_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderRequest$a */
    public static class C11245a extends C25239c<MVTodOrderRequest> {
        public C11245a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodOrderRequest mVTodOrderRequest = (MVTodOrderRequest) tBase;
            mVTodOrderRequest.mo33494H();
            C25113c cVar = MVTodOrderRequest.f29432b;
            gVar.mo61687K();
            if (mVTodOrderRequest.origin != null) {
                gVar.mo61711x(MVTodOrderRequest.f29432b);
                mVTodOrderRequest.origin.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodOrderRequest.destination != null) {
                gVar.mo61711x(MVTodOrderRequest.f29433c);
                mVTodOrderRequest.destination.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodOrderRequest.f29434d);
            gVar.mo61678B(mVTodOrderRequest.numberOfPassengers);
            gVar.mo61712y();
            if (mVTodOrderRequest.userLocation != null && mVTodOrderRequest.mo33514v()) {
                gVar.mo61711x(MVTodOrderRequest.f29435e);
                mVTodOrderRequest.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodOrderRequest.mo33497f()) {
                gVar.mo61711x(MVTodOrderRequest.f29436f);
                gVar.mo61708u(mVTodOrderRequest.accessible);
                gVar.mo61712y();
            }
            if (mVTodOrderRequest.mo33511t()) {
                gVar.mo61711x(MVTodOrderRequest.f29437g);
                gVar.mo61679C(mVTodOrderRequest.time);
                gVar.mo61712y();
            }
            if (mVTodOrderRequest.providerCustomerId != null && mVTodOrderRequest.mo33509r()) {
                gVar.mo61711x(MVTodOrderRequest.f29438h);
                gVar.mo61686J(mVTodOrderRequest.providerCustomerId);
                gVar.mo61712y();
            }
            if (mVTodOrderRequest.mo33504l()) {
                gVar.mo61711x(MVTodOrderRequest.f29439i);
                gVar.mo61708u(mVTodOrderRequest.includeWalkingLegs);
                gVar.mo61712y();
            }
            if (mVTodOrderRequest.mo33508q()) {
                gVar.mo61711x(MVTodOrderRequest.f29440j);
                gVar.mo61708u(mVTodOrderRequest.privateRide);
                gVar.mo61712y();
            }
            if (mVTodOrderRequest.mo33505m()) {
                gVar.mo61711x(MVTodOrderRequest.f29441k);
                gVar.mo61678B(mVTodOrderRequest.numberOfAccessiblePassengers);
                gVar.mo61712y();
            }
            if (mVTodOrderRequest.timeType != null && mVTodOrderRequest.mo33513u()) {
                gVar.mo61711x(MVTodOrderRequest.f29442l);
                gVar.mo61678B(mVTodOrderRequest.timeType.getValue());
                gVar.mo61712y();
            }
            if (mVTodOrderRequest.mo33501i()) {
                gVar.mo61711x(MVTodOrderRequest.f29443m);
                gVar.mo61708u(mVTodOrderRequest.curbToCurbRide);
                gVar.mo61712y();
            }
            if (mVTodOrderRequest.session != null && mVTodOrderRequest.mo33510s()) {
                gVar.mo61711x(MVTodOrderRequest.f29444n);
                mVTodOrderRequest.session.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodOrderRequest.additionalPassengersProfiles != null && mVTodOrderRequest.mo33499h()) {
                gVar.mo61711x(MVTodOrderRequest.f29445o);
                gVar.mo61680D(new C25119e((byte) 12, mVTodOrderRequest.additionalPassengersProfiles.size()));
                for (MVTodSelectedProfile X0 : mVTodOrderRequest.additionalPassengersProfiles) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTodOrderRequest.discountContextId != null && mVTodOrderRequest.mo33503k()) {
                gVar.mo61711x(MVTodOrderRequest.f29446p);
                gVar.mo61686J(mVTodOrderRequest.discountContextId);
                gVar.mo61712y();
            }
            if (mVTodOrderRequest.additionalData != null && mVTodOrderRequest.mo33498g()) {
                gVar.mo61711x(MVTodOrderRequest.f29447q);
                gVar.mo61686J(mVTodOrderRequest.additionalData);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodOrderRequest mVTodOrderRequest = (MVTodOrderRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodOrderRequest.mo33494H();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationTarget mVLocationTarget = new MVLocationTarget();
                            mVTodOrderRequest.origin = mVLocationTarget;
                            mVLocationTarget.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationTarget mVLocationTarget2 = new MVLocationTarget();
                            mVTodOrderRequest.destination = mVLocationTarget2;
                            mVLocationTarget2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderRequest.numberOfPassengers = gVar.mo61696i();
                            mVTodOrderRequest.mo33491E();
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVGpsLocation mVGpsLocation = new MVGpsLocation();
                            mVTodOrderRequest.userLocation = mVGpsLocation;
                            mVGpsLocation.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderRequest.accessible = gVar.mo61690c();
                            mVTodOrderRequest.mo33515w();
                            break;
                        }
                    case 6:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderRequest.time = gVar.mo61697j();
                            mVTodOrderRequest.mo33493G();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderRequest.providerCustomerId = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderRequest.includeWalkingLegs = gVar.mo61690c();
                            mVTodOrderRequest.mo33489A();
                            break;
                        }
                    case 9:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderRequest.privateRide = gVar.mo61690c();
                            mVTodOrderRequest.mo33492F();
                            break;
                        }
                    case 10:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderRequest.numberOfAccessiblePassengers = gVar.mo61696i();
                            mVTodOrderRequest.mo33490D();
                            break;
                        }
                    case 11:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderRequest.timeType = MVTimeType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 12:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderRequest.curbToCurbRide = gVar.mo61690c();
                            mVTodOrderRequest.mo33516y();
                            break;
                        }
                    case 13:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTodSession mVTodSession = new MVTodSession();
                            mVTodOrderRequest.session = mVTodSession;
                            mVTodSession.mo25201C1(gVar);
                            break;
                        }
                    case 14:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVTodOrderRequest.additionalPassengersProfiles = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVTodSelectedProfile mVTodSelectedProfile = new MVTodSelectedProfile();
                                mVTodSelectedProfile.mo25201C1(gVar);
                                mVTodOrderRequest.additionalPassengersProfiles.add(mVTodSelectedProfile);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 15:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderRequest.discountContextId = gVar.mo61704q();
                            break;
                        }
                    case 16:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodOrderRequest.additionalData = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderRequest$b */
    public static class C11246b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11245a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderRequest$c */
    public static class C11247c extends C25240d<MVTodOrderRequest> {
        public C11247c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodOrderRequest mVTodOrderRequest = (MVTodOrderRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodOrderRequest.mo33507p()) {
                bitSet.set(0);
            }
            if (mVTodOrderRequest.mo33502j()) {
                bitSet.set(1);
            }
            if (mVTodOrderRequest.mo33506o()) {
                bitSet.set(2);
            }
            if (mVTodOrderRequest.mo33514v()) {
                bitSet.set(3);
            }
            if (mVTodOrderRequest.mo33497f()) {
                bitSet.set(4);
            }
            if (mVTodOrderRequest.mo33511t()) {
                bitSet.set(5);
            }
            if (mVTodOrderRequest.mo33509r()) {
                bitSet.set(6);
            }
            if (mVTodOrderRequest.mo33504l()) {
                bitSet.set(7);
            }
            if (mVTodOrderRequest.mo33508q()) {
                bitSet.set(8);
            }
            if (mVTodOrderRequest.mo33505m()) {
                bitSet.set(9);
            }
            if (mVTodOrderRequest.mo33513u()) {
                bitSet.set(10);
            }
            if (mVTodOrderRequest.mo33501i()) {
                bitSet.set(11);
            }
            if (mVTodOrderRequest.mo33510s()) {
                bitSet.set(12);
            }
            if (mVTodOrderRequest.mo33499h()) {
                bitSet.set(13);
            }
            if (mVTodOrderRequest.mo33503k()) {
                bitSet.set(14);
            }
            if (mVTodOrderRequest.mo33498g()) {
                bitSet.set(15);
            }
            jVar.mo61738U(bitSet, 16);
            if (mVTodOrderRequest.mo33507p()) {
                mVTodOrderRequest.origin.mo25202X0(jVar);
            }
            if (mVTodOrderRequest.mo33502j()) {
                mVTodOrderRequest.destination.mo25202X0(jVar);
            }
            if (mVTodOrderRequest.mo33506o()) {
                jVar.mo61678B(mVTodOrderRequest.numberOfPassengers);
            }
            if (mVTodOrderRequest.mo33514v()) {
                mVTodOrderRequest.userLocation.mo25202X0(jVar);
            }
            if (mVTodOrderRequest.mo33497f()) {
                jVar.mo61708u(mVTodOrderRequest.accessible);
            }
            if (mVTodOrderRequest.mo33511t()) {
                jVar.mo61679C(mVTodOrderRequest.time);
            }
            if (mVTodOrderRequest.mo33509r()) {
                jVar.mo61686J(mVTodOrderRequest.providerCustomerId);
            }
            if (mVTodOrderRequest.mo33504l()) {
                jVar.mo61708u(mVTodOrderRequest.includeWalkingLegs);
            }
            if (mVTodOrderRequest.mo33508q()) {
                jVar.mo61708u(mVTodOrderRequest.privateRide);
            }
            if (mVTodOrderRequest.mo33505m()) {
                jVar.mo61678B(mVTodOrderRequest.numberOfAccessiblePassengers);
            }
            if (mVTodOrderRequest.mo33513u()) {
                jVar.mo61678B(mVTodOrderRequest.timeType.getValue());
            }
            if (mVTodOrderRequest.mo33501i()) {
                jVar.mo61708u(mVTodOrderRequest.curbToCurbRide);
            }
            if (mVTodOrderRequest.mo33510s()) {
                mVTodOrderRequest.session.mo25202X0(jVar);
            }
            if (mVTodOrderRequest.mo33499h()) {
                jVar.mo61678B(mVTodOrderRequest.additionalPassengersProfiles.size());
                for (MVTodSelectedProfile X0 : mVTodOrderRequest.additionalPassengersProfiles) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTodOrderRequest.mo33503k()) {
                jVar.mo61686J(mVTodOrderRequest.discountContextId);
            }
            if (mVTodOrderRequest.mo33498g()) {
                jVar.mo61686J(mVTodOrderRequest.additionalData);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodOrderRequest mVTodOrderRequest = (MVTodOrderRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(16);
            if (T.get(0)) {
                MVLocationTarget mVLocationTarget = new MVLocationTarget();
                mVTodOrderRequest.origin = mVLocationTarget;
                mVLocationTarget.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVLocationTarget mVLocationTarget2 = new MVLocationTarget();
                mVTodOrderRequest.destination = mVLocationTarget2;
                mVLocationTarget2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVTodOrderRequest.numberOfPassengers = jVar.mo61696i();
                mVTodOrderRequest.mo33491E();
            }
            if (T.get(3)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVTodOrderRequest.userLocation = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVTodOrderRequest.accessible = jVar.mo61690c();
                mVTodOrderRequest.mo33515w();
            }
            if (T.get(5)) {
                mVTodOrderRequest.time = jVar.mo61697j();
                mVTodOrderRequest.mo33493G();
            }
            if (T.get(6)) {
                mVTodOrderRequest.providerCustomerId = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVTodOrderRequest.includeWalkingLegs = jVar.mo61690c();
                mVTodOrderRequest.mo33489A();
            }
            if (T.get(8)) {
                mVTodOrderRequest.privateRide = jVar.mo61690c();
                mVTodOrderRequest.mo33492F();
            }
            if (T.get(9)) {
                mVTodOrderRequest.numberOfAccessiblePassengers = jVar.mo61696i();
                mVTodOrderRequest.mo33490D();
            }
            if (T.get(10)) {
                mVTodOrderRequest.timeType = MVTimeType.findByValue(jVar.mo61696i());
            }
            if (T.get(11)) {
                mVTodOrderRequest.curbToCurbRide = jVar.mo61690c();
                mVTodOrderRequest.mo33516y();
            }
            if (T.get(12)) {
                MVTodSession mVTodSession = new MVTodSession();
                mVTodOrderRequest.session = mVTodSession;
                mVTodSession.mo25201C1(jVar);
            }
            if (T.get(13)) {
                int i = jVar.mo61696i();
                mVTodOrderRequest.additionalPassengersProfiles = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTodSelectedProfile mVTodSelectedProfile = new MVTodSelectedProfile();
                    mVTodSelectedProfile.mo25201C1(jVar);
                    mVTodOrderRequest.additionalPassengersProfiles.add(mVTodSelectedProfile);
                }
            }
            if (T.get(14)) {
                mVTodOrderRequest.discountContextId = jVar.mo61704q();
            }
            if (T.get(15)) {
                mVTodOrderRequest.additionalData = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderRequest$d */
    public static class C11248d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11247c(0);
        }
    }

    static {
        new C17394d0("MVTodOrderRequest");
        HashMap hashMap = new HashMap();
        f29448r = hashMap;
        hashMap.put(C25239c.class, new C11246b());
        hashMap.put(C25240d.class, new C11248d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ORIGIN, new FieldMetaData(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 3, new StructMetaData(MVLocationTarget.class)));
        enumMap.put(_Fields.DESTINATION, new FieldMetaData("destination", (byte) 3, new StructMetaData(MVLocationTarget.class)));
        enumMap.put(_Fields.NUMBER_OF_PASSENGERS, new FieldMetaData("numberOfPassengers", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 2, new StructMetaData(MVGpsLocation.class)));
        enumMap.put(_Fields.ACCESSIBLE, new FieldMetaData("accessible", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.PROVIDER_CUSTOMER_ID, new FieldMetaData("providerCustomerId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INCLUDE_WALKING_LEGS, new FieldMetaData("includeWalkingLegs", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PRIVATE_RIDE, new FieldMetaData("privateRide", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.NUMBER_OF_ACCESSIBLE_PASSENGERS, new FieldMetaData("numberOfAccessiblePassengers", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TIME_TYPE, new FieldMetaData("timeType", (byte) 2, new EnumMetaData(MVTimeType.class)));
        enumMap.put(_Fields.CURB_TO_CURB_RIDE, new FieldMetaData("curbToCurbRide", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SESSION, new FieldMetaData("session", (byte) 2, new StructMetaData(MVTodSession.class)));
        enumMap.put(_Fields.ADDITIONAL_PASSENGERS_PROFILES, new FieldMetaData("additionalPassengersProfiles", (byte) 2, new ListMetaData(new StructMetaData(MVTodSelectedProfile.class))));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ADDITIONAL_DATA, new FieldMetaData("additionalData", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29449s = unmodifiableMap;
        FieldMetaData.m61947a(MVTodOrderRequest.class, unmodifiableMap);
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
    public final void mo33489A() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f29448r.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo33490D() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: E */
    public final void mo33491E() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: F */
    public final void mo33492F() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: G */
    public final void mo33493G() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: H */
    public final void mo33494H() throws TException {
        MVLocationTarget mVLocationTarget = this.origin;
        if (mVLocationTarget != null) {
            mVLocationTarget.mo34391h();
        }
        MVLocationTarget mVLocationTarget2 = this.destination;
        if (mVLocationTarget2 != null) {
            mVLocationTarget2.mo34391h();
        }
        MVGpsLocation mVGpsLocation = this.userLocation;
        if (mVGpsLocation != null) {
            mVGpsLocation.mo26193r();
        }
        MVTodSession mVTodSession = this.session;
        if (mVTodSession != null) {
            MVLocationTarget mVLocationTarget3 = mVTodSession.origin;
            if (mVLocationTarget3 != null) {
                mVLocationTarget3.mo34391h();
            }
            MVLocationTarget mVLocationTarget4 = mVTodSession.destination;
            if (mVLocationTarget4 != null) {
                mVLocationTarget4.mo34391h();
            }
        }
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29448r.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodOrderRequest mVTodOrderRequest = (MVTodOrderRequest) obj;
        if (!getClass().equals(mVTodOrderRequest.getClass())) {
            return getClass().getName().compareTo(mVTodOrderRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33507p()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33507p()));
        if (compareTo2 != 0 || ((mo33507p() && (compareTo2 = this.origin.compareTo(mVTodOrderRequest.origin)) != 0) || (compareTo2 = Boolean.valueOf(mo33502j()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33502j()))) != 0 || ((mo33502j() && (compareTo2 = this.destination.compareTo(mVTodOrderRequest.destination)) != 0) || (compareTo2 = Boolean.valueOf(mo33506o()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33506o()))) != 0 || ((mo33506o() && (compareTo2 = C25082a.m62839c(this.numberOfPassengers, mVTodOrderRequest.numberOfPassengers)) != 0) || (compareTo2 = Boolean.valueOf(mo33514v()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33514v()))) != 0 || ((mo33514v() && (compareTo2 = this.userLocation.compareTo(mVTodOrderRequest.userLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo33497f()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33497f()))) != 0 || ((mo33497f() && (compareTo2 = C25082a.m62848l(this.accessible, mVTodOrderRequest.accessible)) != 0) || (compareTo2 = Boolean.valueOf(mo33511t()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33511t()))) != 0 || ((mo33511t() && (compareTo2 = C25082a.m62840d(this.time, mVTodOrderRequest.time)) != 0) || (compareTo2 = Boolean.valueOf(mo33509r()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33509r()))) != 0 || ((mo33509r() && (compareTo2 = this.providerCustomerId.compareTo(mVTodOrderRequest.providerCustomerId)) != 0) || (compareTo2 = Boolean.valueOf(mo33504l()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33504l()))) != 0 || ((mo33504l() && (compareTo2 = C25082a.m62848l(this.includeWalkingLegs, mVTodOrderRequest.includeWalkingLegs)) != 0) || (compareTo2 = Boolean.valueOf(mo33508q()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33508q()))) != 0 || ((mo33508q() && (compareTo2 = C25082a.m62848l(this.privateRide, mVTodOrderRequest.privateRide)) != 0) || (compareTo2 = Boolean.valueOf(mo33505m()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33505m()))) != 0 || ((mo33505m() && (compareTo2 = C25082a.m62839c(this.numberOfAccessiblePassengers, mVTodOrderRequest.numberOfAccessiblePassengers)) != 0) || (compareTo2 = Boolean.valueOf(mo33513u()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33513u()))) != 0 || ((mo33513u() && (compareTo2 = this.timeType.compareTo(mVTodOrderRequest.timeType)) != 0) || (compareTo2 = Boolean.valueOf(mo33501i()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33501i()))) != 0 || ((mo33501i() && (compareTo2 = C25082a.m62848l(this.curbToCurbRide, mVTodOrderRequest.curbToCurbRide)) != 0) || (compareTo2 = Boolean.valueOf(mo33510s()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33510s()))) != 0 || ((mo33510s() && (compareTo2 = this.session.compareTo(mVTodOrderRequest.session)) != 0) || (compareTo2 = Boolean.valueOf(mo33499h()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33499h()))) != 0 || ((mo33499h() && (compareTo2 = C25082a.m62844h(this.additionalPassengersProfiles, mVTodOrderRequest.additionalPassengersProfiles)) != 0) || (compareTo2 = Boolean.valueOf(mo33503k()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33503k()))) != 0 || ((mo33503k() && (compareTo2 = this.discountContextId.compareTo(mVTodOrderRequest.discountContextId)) != 0) || (compareTo2 = Boolean.valueOf(mo33498g()).compareTo(Boolean.valueOf(mVTodOrderRequest.mo33498g()))) != 0)))))))))))))))) {
            return compareTo2;
        }
        if (!mo33498g() || (compareTo = this.additionalData.compareTo(mVTodOrderRequest.additionalData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodOrderRequest)) {
            return false;
        }
        MVTodOrderRequest mVTodOrderRequest = (MVTodOrderRequest) obj;
        boolean p = mo33507p();
        boolean p2 = mVTodOrderRequest.mo33507p();
        if ((p || p2) && (!p || !p2 || !this.origin.mo34386a(mVTodOrderRequest.origin))) {
            return false;
        }
        boolean j = mo33502j();
        boolean j2 = mVTodOrderRequest.mo33502j();
        if (((j || j2) && (!j || !j2 || !this.destination.mo34386a(mVTodOrderRequest.destination))) || this.numberOfPassengers != mVTodOrderRequest.numberOfPassengers) {
            return false;
        }
        boolean v = mo33514v();
        boolean v2 = mVTodOrderRequest.mo33514v();
        if ((v || v2) && (!v || !v2 || !this.userLocation.mo26178a(mVTodOrderRequest.userLocation))) {
            return false;
        }
        boolean f = mo33497f();
        boolean f2 = mVTodOrderRequest.mo33497f();
        if ((f || f2) && (!f || !f2 || this.accessible != mVTodOrderRequest.accessible)) {
            return false;
        }
        boolean t = mo33511t();
        boolean t2 = mVTodOrderRequest.mo33511t();
        if ((t || t2) && (!t || !t2 || this.time != mVTodOrderRequest.time)) {
            return false;
        }
        boolean r = mo33509r();
        boolean r2 = mVTodOrderRequest.mo33509r();
        if ((r || r2) && (!r || !r2 || !this.providerCustomerId.equals(mVTodOrderRequest.providerCustomerId))) {
            return false;
        }
        boolean l = mo33504l();
        boolean l2 = mVTodOrderRequest.mo33504l();
        if ((l || l2) && (!l || !l2 || this.includeWalkingLegs != mVTodOrderRequest.includeWalkingLegs)) {
            return false;
        }
        boolean q = mo33508q();
        boolean q2 = mVTodOrderRequest.mo33508q();
        if ((q || q2) && (!q || !q2 || this.privateRide != mVTodOrderRequest.privateRide)) {
            return false;
        }
        boolean m = mo33505m();
        boolean m2 = mVTodOrderRequest.mo33505m();
        if ((m || m2) && (!m || !m2 || this.numberOfAccessiblePassengers != mVTodOrderRequest.numberOfAccessiblePassengers)) {
            return false;
        }
        boolean u = mo33513u();
        boolean u2 = mVTodOrderRequest.mo33513u();
        if ((u || u2) && (!u || !u2 || !this.timeType.equals(mVTodOrderRequest.timeType))) {
            return false;
        }
        boolean i = mo33501i();
        boolean i2 = mVTodOrderRequest.mo33501i();
        if ((i || i2) && (!i || !i2 || this.curbToCurbRide != mVTodOrderRequest.curbToCurbRide)) {
            return false;
        }
        boolean s = mo33510s();
        boolean s2 = mVTodOrderRequest.mo33510s();
        if ((s || s2) && (!s || !s2 || !this.session.mo33798a(mVTodOrderRequest.session))) {
            return false;
        }
        boolean h = mo33499h();
        boolean h2 = mVTodOrderRequest.mo33499h();
        if ((h || h2) && (!h || !h2 || !this.additionalPassengersProfiles.equals(mVTodOrderRequest.additionalPassengersProfiles))) {
            return false;
        }
        boolean k = mo33503k();
        boolean k2 = mVTodOrderRequest.mo33503k();
        if ((k || k2) && (!k || !k2 || !this.discountContextId.equals(mVTodOrderRequest.discountContextId))) {
            return false;
        }
        boolean g = mo33498g();
        boolean g2 = mVTodOrderRequest.mo33498g();
        if ((g || g2) && (!g || !g2 || !this.additionalData.equals(mVTodOrderRequest.additionalData))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33497f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo33498g() {
        return this.additionalData != null;
    }

    /* renamed from: h */
    public final boolean mo33499h() {
        return this.additionalPassengersProfiles != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33501i() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: j */
    public final boolean mo33502j() {
        return this.destination != null;
    }

    /* renamed from: k */
    public final boolean mo33503k() {
        return this.discountContextId != null;
    }

    /* renamed from: l */
    public final boolean mo33504l() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: m */
    public final boolean mo33505m() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: o */
    public final boolean mo33506o() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: p */
    public final boolean mo33507p() {
        return this.origin != null;
    }

    /* renamed from: q */
    public final boolean mo33508q() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: r */
    public final boolean mo33509r() {
        return this.providerCustomerId != null;
    }

    /* renamed from: s */
    public final boolean mo33510s() {
        return this.session != null;
    }

    /* renamed from: t */
    public final boolean mo33511t() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodOrderRequest(", "origin:");
        MVLocationTarget mVLocationTarget = this.origin;
        if (mVLocationTarget == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationTarget);
        }
        n.append(", ");
        n.append("destination:");
        MVLocationTarget mVLocationTarget2 = this.destination;
        if (mVLocationTarget2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationTarget2);
        }
        n.append(", ");
        n.append("numberOfPassengers:");
        n.append(this.numberOfPassengers);
        if (mo33514v()) {
            n.append(", ");
            n.append("userLocation:");
            MVGpsLocation mVGpsLocation = this.userLocation;
            if (mVGpsLocation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVGpsLocation);
            }
        }
        if (mo33497f()) {
            n.append(", ");
            n.append("accessible:");
            n.append(this.accessible);
        }
        if (mo33511t()) {
            n.append(", ");
            n.append("time:");
            n.append(this.time);
        }
        if (mo33509r()) {
            n.append(", ");
            n.append("providerCustomerId:");
            String str = this.providerCustomerId;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo33504l()) {
            n.append(", ");
            n.append("includeWalkingLegs:");
            n.append(this.includeWalkingLegs);
        }
        if (mo33508q()) {
            n.append(", ");
            n.append("privateRide:");
            n.append(this.privateRide);
        }
        if (mo33505m()) {
            n.append(", ");
            n.append("numberOfAccessiblePassengers:");
            n.append(this.numberOfAccessiblePassengers);
        }
        if (mo33513u()) {
            n.append(", ");
            n.append("timeType:");
            MVTimeType mVTimeType = this.timeType;
            if (mVTimeType == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTimeType);
            }
        }
        if (mo33501i()) {
            n.append(", ");
            n.append("curbToCurbRide:");
            n.append(this.curbToCurbRide);
        }
        if (mo33510s()) {
            n.append(", ");
            n.append("session:");
            MVTodSession mVTodSession = this.session;
            if (mVTodSession == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodSession);
            }
        }
        if (mo33499h()) {
            n.append(", ");
            n.append("additionalPassengersProfiles:");
            List<MVTodSelectedProfile> list = this.additionalPassengersProfiles;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo33503k()) {
            n.append(", ");
            n.append("discountContextId:");
            String str2 = this.discountContextId;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo33498g()) {
            n.append(", ");
            n.append("additionalData:");
            String str3 = this.additionalData;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo33513u() {
        return this.timeType != null;
    }

    /* renamed from: v */
    public final boolean mo33514v() {
        return this.userLocation != null;
    }

    /* renamed from: w */
    public final void mo33515w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: y */
    public final void mo33516y() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }
}
