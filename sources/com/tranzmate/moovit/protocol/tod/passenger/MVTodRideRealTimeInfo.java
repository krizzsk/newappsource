package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
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

public class MVTodRideRealTimeInfo implements TBase<MVTodRideRealTimeInfo, _Fields>, Serializable, Cloneable, Comparable<MVTodRideRealTimeInfo> {

    /* renamed from: b */
    public static final C25113c f29561b = new C25113c("rideId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29562c = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29563d = new C25113c("pickTime", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f29564e = new C25113c("dropOffTime", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f29565f = new C25113c("futureWayPoints", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f29566g = new C25113c("rideStatus", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f29567h = new C25113c("journeyStatus", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f29568i = new C25113c("requiredPassengerAction", (byte) 12, 8);

    /* renamed from: j */
    public static final C25113c f29569j = new C25113c("vehicleRealTimeInfo", (byte) 12, 9);

    /* renamed from: k */
    public static final C25113c f29570k = new C25113c("destinationChangeAllowed", (byte) 2, 10);

    /* renamed from: l */
    public static final C25113c f29571l = new C25113c("requiredPassengerScreen", (byte) 12, 11);

    /* renamed from: m */
    public static final C25113c f29572m = new C25113c("rideUpdate", (byte) 12, 12);

    /* renamed from: n */
    public static final C25113c f29573n = new C25113c("dropRequestAllowed", (byte) 2, 13);

    /* renamed from: o */
    public static final HashMap f29574o;

    /* renamed from: p */
    public static final Map<_Fields, FieldMetaData> f29575p;
    private byte __isset_bitfield = 0;
    public boolean destinationChangeAllowed;
    public long dropOffTime;
    public boolean dropRequestAllowed;
    public List<MVTodRideWayPoint> futureWayPoints;
    public MVTodJourneyStatus journeyStatus;
    public MVGpsLocation location;
    private _Fields[] optionals = {_Fields.PICK_TIME, _Fields.DROP_OFF_TIME, _Fields.JOURNEY_STATUS, _Fields.REQUIRED_PASSENGER_ACTION, _Fields.VEHICLE_REAL_TIME_INFO, _Fields.DESTINATION_CHANGE_ALLOWED, _Fields.REQUIRED_PASSENGER_SCREEN, _Fields.RIDE_UPDATE, _Fields.DROP_REQUEST_ALLOWED};
    public long pickTime;
    public MVTodPassengerAction requiredPassengerAction;
    public MVTodPassengerScreen requiredPassengerScreen;
    public String rideId;
    public MVTodRideStatus rideStatus;
    public MVTodRide rideUpdate;
    public MVTodVehicleRealTimeInfo vehicleRealTimeInfo;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        LOCATION(2, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        PICK_TIME(3, "pickTime"),
        DROP_OFF_TIME(4, "dropOffTime"),
        FUTURE_WAY_POINTS(5, "futureWayPoints"),
        RIDE_STATUS(6, "rideStatus"),
        JOURNEY_STATUS(7, "journeyStatus"),
        REQUIRED_PASSENGER_ACTION(8, "requiredPassengerAction"),
        VEHICLE_REAL_TIME_INFO(9, "vehicleRealTimeInfo"),
        DESTINATION_CHANGE_ALLOWED(10, "destinationChangeAllowed"),
        REQUIRED_PASSENGER_SCREEN(11, "requiredPassengerScreen"),
        RIDE_UPDATE(12, "rideUpdate"),
        DROP_REQUEST_ALLOWED(13, "dropRequestAllowed");
        
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
                    return LOCATION;
                case 3:
                    return PICK_TIME;
                case 4:
                    return DROP_OFF_TIME;
                case 5:
                    return FUTURE_WAY_POINTS;
                case 6:
                    return RIDE_STATUS;
                case 7:
                    return JOURNEY_STATUS;
                case 8:
                    return REQUIRED_PASSENGER_ACTION;
                case 9:
                    return VEHICLE_REAL_TIME_INFO;
                case 10:
                    return DESTINATION_CHANGE_ALLOWED;
                case 11:
                    return REQUIRED_PASSENGER_SCREEN;
                case 12:
                    return RIDE_UPDATE;
                case 13:
                    return DROP_REQUEST_ALLOWED;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfo$a */
    public static class C11315a extends C25239c<MVTodRideRealTimeInfo> {
        public C11315a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRideRealTimeInfo mVTodRideRealTimeInfo = (MVTodRideRealTimeInfo) tBase;
            mVTodRideRealTimeInfo.mo33725y();
            C25113c cVar = MVTodRideRealTimeInfo.f29561b;
            gVar.mo61687K();
            if (mVTodRideRealTimeInfo.rideId != null) {
                gVar.mo61711x(MVTodRideRealTimeInfo.f29561b);
                gVar.mo61686J(mVTodRideRealTimeInfo.rideId);
                gVar.mo61712y();
            }
            if (mVTodRideRealTimeInfo.location != null) {
                gVar.mo61711x(MVTodRideRealTimeInfo.f29562c);
                mVTodRideRealTimeInfo.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRideRealTimeInfo.mo33713l()) {
                gVar.mo61711x(MVTodRideRealTimeInfo.f29563d);
                gVar.mo61679C(mVTodRideRealTimeInfo.pickTime);
                gVar.mo61712y();
            }
            if (mVTodRideRealTimeInfo.mo33707g()) {
                gVar.mo61711x(MVTodRideRealTimeInfo.f29564e);
                gVar.mo61679C(mVTodRideRealTimeInfo.dropOffTime);
                gVar.mo61712y();
            }
            if (mVTodRideRealTimeInfo.futureWayPoints != null) {
                gVar.mo61711x(MVTodRideRealTimeInfo.f29565f);
                gVar.mo61680D(new C25119e((byte) 12, mVTodRideRealTimeInfo.futureWayPoints.size()));
                for (MVTodRideWayPoint X0 : mVTodRideRealTimeInfo.futureWayPoints) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTodRideRealTimeInfo.rideStatus != null) {
                gVar.mo61711x(MVTodRideRealTimeInfo.f29566g);
                gVar.mo61678B(mVTodRideRealTimeInfo.rideStatus.getValue());
                gVar.mo61712y();
            }
            if (mVTodRideRealTimeInfo.journeyStatus != null && mVTodRideRealTimeInfo.mo33711j()) {
                gVar.mo61711x(MVTodRideRealTimeInfo.f29567h);
                gVar.mo61678B(mVTodRideRealTimeInfo.journeyStatus.getValue());
                gVar.mo61712y();
            }
            if (mVTodRideRealTimeInfo.requiredPassengerAction != null && mVTodRideRealTimeInfo.mo33714m()) {
                gVar.mo61711x(MVTodRideRealTimeInfo.f29568i);
                mVTodRideRealTimeInfo.requiredPassengerAction.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRideRealTimeInfo.vehicleRealTimeInfo != null && mVTodRideRealTimeInfo.mo33719s()) {
                gVar.mo61711x(MVTodRideRealTimeInfo.f29569j);
                mVTodRideRealTimeInfo.vehicleRealTimeInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRideRealTimeInfo.mo33706f()) {
                gVar.mo61711x(MVTodRideRealTimeInfo.f29570k);
                gVar.mo61708u(mVTodRideRealTimeInfo.destinationChangeAllowed);
                gVar.mo61712y();
            }
            if (mVTodRideRealTimeInfo.requiredPassengerScreen != null && mVTodRideRealTimeInfo.mo33715o()) {
                gVar.mo61711x(MVTodRideRealTimeInfo.f29571l);
                mVTodRideRealTimeInfo.requiredPassengerScreen.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRideRealTimeInfo.rideUpdate != null && mVTodRideRealTimeInfo.mo33718r()) {
                gVar.mo61711x(MVTodRideRealTimeInfo.f29572m);
                mVTodRideRealTimeInfo.rideUpdate.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRideRealTimeInfo.mo33708h()) {
                gVar.mo61711x(MVTodRideRealTimeInfo.f29573n);
                gVar.mo61708u(mVTodRideRealTimeInfo.dropRequestAllowed);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRideRealTimeInfo mVTodRideRealTimeInfo = (MVTodRideRealTimeInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodRideRealTimeInfo.mo33725y();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideRealTimeInfo.rideId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVGpsLocation mVGpsLocation = new MVGpsLocation();
                            mVTodRideRealTimeInfo.location = mVGpsLocation;
                            mVGpsLocation.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideRealTimeInfo.pickTime = gVar.mo61697j();
                            mVTodRideRealTimeInfo.mo33724w();
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideRealTimeInfo.dropOffTime = gVar.mo61697j();
                            mVTodRideRealTimeInfo.mo33722u();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVTodRideRealTimeInfo.futureWayPoints = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVTodRideWayPoint mVTodRideWayPoint = new MVTodRideWayPoint();
                                mVTodRideWayPoint.mo25201C1(gVar);
                                mVTodRideRealTimeInfo.futureWayPoints.add(mVTodRideWayPoint);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideRealTimeInfo.rideStatus = MVTodRideStatus.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideRealTimeInfo.journeyStatus = MVTodJourneyStatus.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTodPassengerAction mVTodPassengerAction = new MVTodPassengerAction();
                            mVTodRideRealTimeInfo.requiredPassengerAction = mVTodPassengerAction;
                            mVTodPassengerAction.mo25201C1(gVar);
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTodVehicleRealTimeInfo mVTodVehicleRealTimeInfo = new MVTodVehicleRealTimeInfo();
                            mVTodRideRealTimeInfo.vehicleRealTimeInfo = mVTodVehicleRealTimeInfo;
                            mVTodVehicleRealTimeInfo.mo25201C1(gVar);
                            break;
                        }
                    case 10:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideRealTimeInfo.destinationChangeAllowed = gVar.mo61690c();
                            mVTodRideRealTimeInfo.mo33720t();
                            break;
                        }
                    case 11:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTodPassengerScreen mVTodPassengerScreen = new MVTodPassengerScreen();
                            mVTodRideRealTimeInfo.requiredPassengerScreen = mVTodPassengerScreen;
                            mVTodPassengerScreen.mo25201C1(gVar);
                            break;
                        }
                    case 12:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTodRide mVTodRide = new MVTodRide();
                            mVTodRideRealTimeInfo.rideUpdate = mVTodRide;
                            mVTodRide.mo25201C1(gVar);
                            break;
                        }
                    case 13:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideRealTimeInfo.dropRequestAllowed = gVar.mo61690c();
                            mVTodRideRealTimeInfo.mo33723v();
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfo$b */
    public static class C11316b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11315a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfo$c */
    public static class C11317c extends C25240d<MVTodRideRealTimeInfo> {
        public C11317c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRideRealTimeInfo mVTodRideRealTimeInfo = (MVTodRideRealTimeInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodRideRealTimeInfo.mo33716p()) {
                bitSet.set(0);
            }
            if (mVTodRideRealTimeInfo.mo33712k()) {
                bitSet.set(1);
            }
            if (mVTodRideRealTimeInfo.mo33713l()) {
                bitSet.set(2);
            }
            if (mVTodRideRealTimeInfo.mo33707g()) {
                bitSet.set(3);
            }
            if (mVTodRideRealTimeInfo.mo33710i()) {
                bitSet.set(4);
            }
            if (mVTodRideRealTimeInfo.mo33717q()) {
                bitSet.set(5);
            }
            if (mVTodRideRealTimeInfo.mo33711j()) {
                bitSet.set(6);
            }
            if (mVTodRideRealTimeInfo.mo33714m()) {
                bitSet.set(7);
            }
            if (mVTodRideRealTimeInfo.mo33719s()) {
                bitSet.set(8);
            }
            if (mVTodRideRealTimeInfo.mo33706f()) {
                bitSet.set(9);
            }
            if (mVTodRideRealTimeInfo.mo33715o()) {
                bitSet.set(10);
            }
            if (mVTodRideRealTimeInfo.mo33718r()) {
                bitSet.set(11);
            }
            if (mVTodRideRealTimeInfo.mo33708h()) {
                bitSet.set(12);
            }
            jVar.mo61738U(bitSet, 13);
            if (mVTodRideRealTimeInfo.mo33716p()) {
                jVar.mo61686J(mVTodRideRealTimeInfo.rideId);
            }
            if (mVTodRideRealTimeInfo.mo33712k()) {
                mVTodRideRealTimeInfo.location.mo25202X0(jVar);
            }
            if (mVTodRideRealTimeInfo.mo33713l()) {
                jVar.mo61679C(mVTodRideRealTimeInfo.pickTime);
            }
            if (mVTodRideRealTimeInfo.mo33707g()) {
                jVar.mo61679C(mVTodRideRealTimeInfo.dropOffTime);
            }
            if (mVTodRideRealTimeInfo.mo33710i()) {
                jVar.mo61678B(mVTodRideRealTimeInfo.futureWayPoints.size());
                for (MVTodRideWayPoint X0 : mVTodRideRealTimeInfo.futureWayPoints) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTodRideRealTimeInfo.mo33717q()) {
                jVar.mo61678B(mVTodRideRealTimeInfo.rideStatus.getValue());
            }
            if (mVTodRideRealTimeInfo.mo33711j()) {
                jVar.mo61678B(mVTodRideRealTimeInfo.journeyStatus.getValue());
            }
            if (mVTodRideRealTimeInfo.mo33714m()) {
                mVTodRideRealTimeInfo.requiredPassengerAction.mo25202X0(jVar);
            }
            if (mVTodRideRealTimeInfo.mo33719s()) {
                mVTodRideRealTimeInfo.vehicleRealTimeInfo.mo25202X0(jVar);
            }
            if (mVTodRideRealTimeInfo.mo33706f()) {
                jVar.mo61708u(mVTodRideRealTimeInfo.destinationChangeAllowed);
            }
            if (mVTodRideRealTimeInfo.mo33715o()) {
                mVTodRideRealTimeInfo.requiredPassengerScreen.mo25202X0(jVar);
            }
            if (mVTodRideRealTimeInfo.mo33718r()) {
                mVTodRideRealTimeInfo.rideUpdate.mo25202X0(jVar);
            }
            if (mVTodRideRealTimeInfo.mo33708h()) {
                jVar.mo61708u(mVTodRideRealTimeInfo.dropRequestAllowed);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRideRealTimeInfo mVTodRideRealTimeInfo = (MVTodRideRealTimeInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(13);
            if (T.get(0)) {
                mVTodRideRealTimeInfo.rideId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVTodRideRealTimeInfo.location = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVTodRideRealTimeInfo.pickTime = jVar.mo61697j();
                mVTodRideRealTimeInfo.mo33724w();
            }
            if (T.get(3)) {
                mVTodRideRealTimeInfo.dropOffTime = jVar.mo61697j();
                mVTodRideRealTimeInfo.mo33722u();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVTodRideRealTimeInfo.futureWayPoints = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTodRideWayPoint mVTodRideWayPoint = new MVTodRideWayPoint();
                    mVTodRideWayPoint.mo25201C1(jVar);
                    mVTodRideRealTimeInfo.futureWayPoints.add(mVTodRideWayPoint);
                }
            }
            if (T.get(5)) {
                mVTodRideRealTimeInfo.rideStatus = MVTodRideStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(6)) {
                mVTodRideRealTimeInfo.journeyStatus = MVTodJourneyStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(7)) {
                MVTodPassengerAction mVTodPassengerAction = new MVTodPassengerAction();
                mVTodRideRealTimeInfo.requiredPassengerAction = mVTodPassengerAction;
                mVTodPassengerAction.mo25201C1(jVar);
            }
            if (T.get(8)) {
                MVTodVehicleRealTimeInfo mVTodVehicleRealTimeInfo = new MVTodVehicleRealTimeInfo();
                mVTodRideRealTimeInfo.vehicleRealTimeInfo = mVTodVehicleRealTimeInfo;
                mVTodVehicleRealTimeInfo.mo25201C1(jVar);
            }
            if (T.get(9)) {
                mVTodRideRealTimeInfo.destinationChangeAllowed = jVar.mo61690c();
                mVTodRideRealTimeInfo.mo33720t();
            }
            if (T.get(10)) {
                MVTodPassengerScreen mVTodPassengerScreen = new MVTodPassengerScreen();
                mVTodRideRealTimeInfo.requiredPassengerScreen = mVTodPassengerScreen;
                mVTodPassengerScreen.mo25201C1(jVar);
            }
            if (T.get(11)) {
                MVTodRide mVTodRide = new MVTodRide();
                mVTodRideRealTimeInfo.rideUpdate = mVTodRide;
                mVTodRide.mo25201C1(jVar);
            }
            if (T.get(12)) {
                mVTodRideRealTimeInfo.dropRequestAllowed = jVar.mo61690c();
                mVTodRideRealTimeInfo.mo33723v();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfo$d */
    public static class C11318d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11317c(0);
        }
    }

    static {
        new C17394d0("MVTodRideRealTimeInfo");
        HashMap hashMap = new HashMap();
        f29574o = hashMap;
        hashMap.put(C25239c.class, new C11316b());
        hashMap.put(C25240d.class, new C11318d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVGpsLocation.class)));
        enumMap.put(_Fields.PICK_TIME, new FieldMetaData("pickTime", (byte) 2, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.DROP_OFF_TIME, new FieldMetaData("dropOffTime", (byte) 2, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.FUTURE_WAY_POINTS, new FieldMetaData("futureWayPoints", (byte) 3, new ListMetaData(new StructMetaData(MVTodRideWayPoint.class))));
        enumMap.put(_Fields.RIDE_STATUS, new FieldMetaData("rideStatus", (byte) 3, new EnumMetaData(MVTodRideStatus.class)));
        enumMap.put(_Fields.JOURNEY_STATUS, new FieldMetaData("journeyStatus", (byte) 2, new EnumMetaData(MVTodJourneyStatus.class)));
        enumMap.put(_Fields.REQUIRED_PASSENGER_ACTION, new FieldMetaData("requiredPassengerAction", (byte) 2, new StructMetaData(MVTodPassengerAction.class)));
        enumMap.put(_Fields.VEHICLE_REAL_TIME_INFO, new FieldMetaData("vehicleRealTimeInfo", (byte) 2, new StructMetaData(MVTodVehicleRealTimeInfo.class)));
        enumMap.put(_Fields.DESTINATION_CHANGE_ALLOWED, new FieldMetaData("destinationChangeAllowed", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.REQUIRED_PASSENGER_SCREEN, new FieldMetaData("requiredPassengerScreen", (byte) 2, new StructMetaData(MVTodPassengerScreen.class)));
        enumMap.put(_Fields.RIDE_UPDATE, new FieldMetaData("rideUpdate", (byte) 2, new StructMetaData(MVTodRide.class)));
        enumMap.put(_Fields.DROP_REQUEST_ALLOWED, new FieldMetaData("dropRequestAllowed", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29575p = unmodifiableMap;
        FieldMetaData.m61947a(MVTodRideRealTimeInfo.class, unmodifiableMap);
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
        ((C25238b) f29574o.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29574o.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33703a(MVTodRideRealTimeInfo mVTodRideRealTimeInfo) {
        if (mVTodRideRealTimeInfo == null) {
            return false;
        }
        boolean p = mo33716p();
        boolean p2 = mVTodRideRealTimeInfo.mo33716p();
        if ((p || p2) && (!p || !p2 || !this.rideId.equals(mVTodRideRealTimeInfo.rideId))) {
            return false;
        }
        boolean k = mo33712k();
        boolean k2 = mVTodRideRealTimeInfo.mo33712k();
        if ((k || k2) && (!k || !k2 || !this.location.mo26178a(mVTodRideRealTimeInfo.location))) {
            return false;
        }
        boolean l = mo33713l();
        boolean l2 = mVTodRideRealTimeInfo.mo33713l();
        if ((l || l2) && (!l || !l2 || this.pickTime != mVTodRideRealTimeInfo.pickTime)) {
            return false;
        }
        boolean g = mo33707g();
        boolean g2 = mVTodRideRealTimeInfo.mo33707g();
        if ((g || g2) && (!g || !g2 || this.dropOffTime != mVTodRideRealTimeInfo.dropOffTime)) {
            return false;
        }
        boolean i = mo33710i();
        boolean i2 = mVTodRideRealTimeInfo.mo33710i();
        if ((i || i2) && (!i || !i2 || !this.futureWayPoints.equals(mVTodRideRealTimeInfo.futureWayPoints))) {
            return false;
        }
        boolean q = mo33717q();
        boolean q2 = mVTodRideRealTimeInfo.mo33717q();
        if ((q || q2) && (!q || !q2 || !this.rideStatus.equals(mVTodRideRealTimeInfo.rideStatus))) {
            return false;
        }
        boolean j = mo33711j();
        boolean j2 = mVTodRideRealTimeInfo.mo33711j();
        if ((j || j2) && (!j || !j2 || !this.journeyStatus.equals(mVTodRideRealTimeInfo.journeyStatus))) {
            return false;
        }
        boolean m = mo33714m();
        boolean m2 = mVTodRideRealTimeInfo.mo33714m();
        if ((m || m2) && (!m || !m2 || !this.requiredPassengerAction.mo33529a(mVTodRideRealTimeInfo.requiredPassengerAction))) {
            return false;
        }
        boolean s = mo33719s();
        boolean s2 = mVTodRideRealTimeInfo.mo33719s();
        if ((s || s2) && (!s || !s2 || !this.vehicleRealTimeInfo.mo33905a(mVTodRideRealTimeInfo.vehicleRealTimeInfo))) {
            return false;
        }
        boolean f = mo33706f();
        boolean f2 = mVTodRideRealTimeInfo.mo33706f();
        if ((f || f2) && (!f || !f2 || this.destinationChangeAllowed != mVTodRideRealTimeInfo.destinationChangeAllowed)) {
            return false;
        }
        boolean o = mo33715o();
        boolean o2 = mVTodRideRealTimeInfo.mo33715o();
        if ((o || o2) && (!o || !o2 || !this.requiredPassengerScreen.mo33619a(mVTodRideRealTimeInfo.requiredPassengerScreen))) {
            return false;
        }
        boolean r = mo33718r();
        boolean r2 = mVTodRideRealTimeInfo.mo33718r();
        if ((r || r2) && (!r || !r2 || !this.rideUpdate.mo33655a(mVTodRideRealTimeInfo.rideUpdate))) {
            return false;
        }
        boolean h = mo33708h();
        boolean h2 = mVTodRideRealTimeInfo.mo33708h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || this.dropRequestAllowed != mVTodRideRealTimeInfo.dropRequestAllowed) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int l;
        MVTodRideRealTimeInfo mVTodRideRealTimeInfo = (MVTodRideRealTimeInfo) obj;
        if (!getClass().equals(mVTodRideRealTimeInfo.getClass())) {
            return getClass().getName().compareTo(mVTodRideRealTimeInfo.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33716p()).compareTo(Boolean.valueOf(mVTodRideRealTimeInfo.mo33716p()));
        if (compareTo != 0 || ((mo33716p() && (compareTo = this.rideId.compareTo(mVTodRideRealTimeInfo.rideId)) != 0) || (compareTo = Boolean.valueOf(mo33712k()).compareTo(Boolean.valueOf(mVTodRideRealTimeInfo.mo33712k()))) != 0 || ((mo33712k() && (compareTo = this.location.compareTo(mVTodRideRealTimeInfo.location)) != 0) || (compareTo = Boolean.valueOf(mo33713l()).compareTo(Boolean.valueOf(mVTodRideRealTimeInfo.mo33713l()))) != 0 || ((mo33713l() && (compareTo = C25082a.m62840d(this.pickTime, mVTodRideRealTimeInfo.pickTime)) != 0) || (compareTo = Boolean.valueOf(mo33707g()).compareTo(Boolean.valueOf(mVTodRideRealTimeInfo.mo33707g()))) != 0 || ((mo33707g() && (compareTo = C25082a.m62840d(this.dropOffTime, mVTodRideRealTimeInfo.dropOffTime)) != 0) || (compareTo = Boolean.valueOf(mo33710i()).compareTo(Boolean.valueOf(mVTodRideRealTimeInfo.mo33710i()))) != 0 || ((mo33710i() && (compareTo = C25082a.m62844h(this.futureWayPoints, mVTodRideRealTimeInfo.futureWayPoints)) != 0) || (compareTo = Boolean.valueOf(mo33717q()).compareTo(Boolean.valueOf(mVTodRideRealTimeInfo.mo33717q()))) != 0 || ((mo33717q() && (compareTo = this.rideStatus.compareTo(mVTodRideRealTimeInfo.rideStatus)) != 0) || (compareTo = Boolean.valueOf(mo33711j()).compareTo(Boolean.valueOf(mVTodRideRealTimeInfo.mo33711j()))) != 0 || ((mo33711j() && (compareTo = this.journeyStatus.compareTo(mVTodRideRealTimeInfo.journeyStatus)) != 0) || (compareTo = Boolean.valueOf(mo33714m()).compareTo(Boolean.valueOf(mVTodRideRealTimeInfo.mo33714m()))) != 0 || ((mo33714m() && (compareTo = this.requiredPassengerAction.compareTo(mVTodRideRealTimeInfo.requiredPassengerAction)) != 0) || (compareTo = Boolean.valueOf(mo33719s()).compareTo(Boolean.valueOf(mVTodRideRealTimeInfo.mo33719s()))) != 0 || ((mo33719s() && (compareTo = this.vehicleRealTimeInfo.compareTo(mVTodRideRealTimeInfo.vehicleRealTimeInfo)) != 0) || (compareTo = Boolean.valueOf(mo33706f()).compareTo(Boolean.valueOf(mVTodRideRealTimeInfo.mo33706f()))) != 0 || ((mo33706f() && (compareTo = C25082a.m62848l(this.destinationChangeAllowed, mVTodRideRealTimeInfo.destinationChangeAllowed)) != 0) || (compareTo = Boolean.valueOf(mo33715o()).compareTo(Boolean.valueOf(mVTodRideRealTimeInfo.mo33715o()))) != 0 || ((mo33715o() && (compareTo = this.requiredPassengerScreen.compareTo(mVTodRideRealTimeInfo.requiredPassengerScreen)) != 0) || (compareTo = Boolean.valueOf(mo33718r()).compareTo(Boolean.valueOf(mVTodRideRealTimeInfo.mo33718r()))) != 0 || ((mo33718r() && (compareTo = this.rideUpdate.compareTo(mVTodRideRealTimeInfo.rideUpdate)) != 0) || (compareTo = Boolean.valueOf(mo33708h()).compareTo(Boolean.valueOf(mVTodRideRealTimeInfo.mo33708h()))) != 0))))))))))))) {
            return compareTo;
        }
        if (!mo33708h() || (l = C25082a.m62848l(this.dropRequestAllowed, mVTodRideRealTimeInfo.dropRequestAllowed)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodRideRealTimeInfo)) {
            return mo33703a((MVTodRideRealTimeInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33706f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo33707g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo33708h() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33710i() {
        return this.futureWayPoints != null;
    }

    /* renamed from: j */
    public final boolean mo33711j() {
        return this.journeyStatus != null;
    }

    /* renamed from: k */
    public final boolean mo33712k() {
        return this.location != null;
    }

    /* renamed from: l */
    public final boolean mo33713l() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: m */
    public final boolean mo33714m() {
        return this.requiredPassengerAction != null;
    }

    /* renamed from: o */
    public final boolean mo33715o() {
        return this.requiredPassengerScreen != null;
    }

    /* renamed from: p */
    public final boolean mo33716p() {
        return this.rideId != null;
    }

    /* renamed from: q */
    public final boolean mo33717q() {
        return this.rideStatus != null;
    }

    /* renamed from: r */
    public final boolean mo33718r() {
        return this.rideUpdate != null;
    }

    /* renamed from: s */
    public final boolean mo33719s() {
        return this.vehicleRealTimeInfo != null;
    }

    /* renamed from: t */
    public final void mo33720t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodRideRealTimeInfo(", "rideId:");
        String str = this.rideId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("location:");
        MVGpsLocation mVGpsLocation = this.location;
        if (mVGpsLocation == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVGpsLocation);
        }
        if (mo33713l()) {
            n.append(", ");
            n.append("pickTime:");
            n.append(this.pickTime);
        }
        if (mo33707g()) {
            n.append(", ");
            n.append("dropOffTime:");
            n.append(this.dropOffTime);
        }
        n.append(", ");
        n.append("futureWayPoints:");
        List<MVTodRideWayPoint> list = this.futureWayPoints;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("rideStatus:");
        MVTodRideStatus mVTodRideStatus = this.rideStatus;
        if (mVTodRideStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodRideStatus);
        }
        if (mo33711j()) {
            n.append(", ");
            n.append("journeyStatus:");
            MVTodJourneyStatus mVTodJourneyStatus = this.journeyStatus;
            if (mVTodJourneyStatus == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodJourneyStatus);
            }
        }
        if (mo33714m()) {
            n.append(", ");
            n.append("requiredPassengerAction:");
            MVTodPassengerAction mVTodPassengerAction = this.requiredPassengerAction;
            if (mVTodPassengerAction == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodPassengerAction);
            }
        }
        if (mo33719s()) {
            n.append(", ");
            n.append("vehicleRealTimeInfo:");
            MVTodVehicleRealTimeInfo mVTodVehicleRealTimeInfo = this.vehicleRealTimeInfo;
            if (mVTodVehicleRealTimeInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodVehicleRealTimeInfo);
            }
        }
        if (mo33706f()) {
            n.append(", ");
            n.append("destinationChangeAllowed:");
            n.append(this.destinationChangeAllowed);
        }
        if (mo33715o()) {
            n.append(", ");
            n.append("requiredPassengerScreen:");
            MVTodPassengerScreen mVTodPassengerScreen = this.requiredPassengerScreen;
            if (mVTodPassengerScreen == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodPassengerScreen);
            }
        }
        if (mo33718r()) {
            n.append(", ");
            n.append("rideUpdate:");
            MVTodRide mVTodRide = this.rideUpdate;
            if (mVTodRide == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodRide);
            }
        }
        if (mo33708h()) {
            n.append(", ");
            n.append("dropRequestAllowed:");
            n.append(this.dropRequestAllowed);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo33722u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: v */
    public final void mo33723v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: w */
    public final void mo33724w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: y */
    public final void mo33725y() throws TException {
        MVGpsLocation mVGpsLocation = this.location;
        if (mVGpsLocation != null) {
            mVGpsLocation.mo26193r();
        }
        MVTodVehicleRealTimeInfo mVTodVehicleRealTimeInfo = this.vehicleRealTimeInfo;
        if (mVTodVehicleRealTimeInfo != null) {
            mVTodVehicleRealTimeInfo.mo33913j();
        }
        MVTodRide mVTodRide = this.rideUpdate;
        if (mVTodRide != null) {
            mVTodRide.mo33654P();
        }
    }
}
