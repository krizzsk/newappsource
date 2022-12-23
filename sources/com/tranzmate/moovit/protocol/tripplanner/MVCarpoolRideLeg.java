package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetourDetails;
import com.tranzmate.moovit.protocol.carpool.MVCarpoolDriver;
import com.tranzmate.moovit.protocol.carpool.MVPassengerStops;
import com.tranzmate.moovit.protocol.carpool.MVRide;
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

public class MVCarpoolRideLeg implements TBase<MVCarpoolRideLeg, _Fields>, Serializable, Cloneable, Comparable<MVCarpoolRideLeg> {

    /* renamed from: b */
    public static final C25113c f29851b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29852c = new C25113c("driver", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29853d = new C25113c("ride", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29854e = new C25113c("stops", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f29855f = new C25113c("detourDetails", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f29856g = new C25113c("carpoolSource", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f29857h = new C25113c("deepLink", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f29858i = new C25113c("isEstimatedTimes", (byte) 2, 8);

    /* renamed from: j */
    public static final C25113c f29859j = new C25113c("walkingToPickup", (byte) 8, 9);

    /* renamed from: k */
    public static final C25113c f29860k = new C25113c("walkingToDestination", (byte) 8, 10);

    /* renamed from: l */
    public static final C25113c f29861l = new C25113c("attributes", (byte) 15, 11);

    /* renamed from: m */
    public static final C25113c f29862m = new C25113c("appInstallDeepLink", (byte) 11, 12);

    /* renamed from: n */
    public static final C25113c f29863n = new C25113c("carpoolType", (byte) 8, 13);

    /* renamed from: o */
    public static final HashMap f29864o;

    /* renamed from: p */
    public static final Map<_Fields, FieldMetaData> f29865p;
    private byte __isset_bitfield = 0;
    public String appInstallDeepLink;
    public List<MVCarpoolRideAttributes> attributes;
    public MVCarPoolSource carpoolSource;
    public MVCarpoolType carpoolType;
    public String deepLink;
    public MVCarPoolDetourTPDetails detourDetails;
    public MVCarpoolDriver driver;
    public boolean isEstimatedTimes;
    private _Fields[] optionals = {_Fields.DEEP_LINK, _Fields.IS_ESTIMATED_TIMES, _Fields.WALKING_TO_PICKUP, _Fields.WALKING_TO_DESTINATION, _Fields.ATTRIBUTES, _Fields.APP_INSTALL_DEEP_LINK};
    public MVRide ride;
    public MVPassengerStops stops;
    public MVTime time;
    public int walkingToDestination;
    public int walkingToPickup;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        DRIVER(2, "driver"),
        RIDE(3, "ride"),
        STOPS(4, "stops"),
        DETOUR_DETAILS(5, "detourDetails"),
        CARPOOL_SOURCE(6, "carpoolSource"),
        DEEP_LINK(7, "deepLink"),
        IS_ESTIMATED_TIMES(8, "isEstimatedTimes"),
        WALKING_TO_PICKUP(9, "walkingToPickup"),
        WALKING_TO_DESTINATION(10, "walkingToDestination"),
        ATTRIBUTES(11, "attributes"),
        APP_INSTALL_DEEP_LINK(12, "appInstallDeepLink"),
        CARPOOL_TYPE(13, "carpoolType");
        
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
                    return TIME;
                case 2:
                    return DRIVER;
                case 3:
                    return RIDE;
                case 4:
                    return STOPS;
                case 5:
                    return DETOUR_DETAILS;
                case 6:
                    return CARPOOL_SOURCE;
                case 7:
                    return DEEP_LINK;
                case 8:
                    return IS_ESTIMATED_TIMES;
                case 9:
                    return WALKING_TO_PICKUP;
                case 10:
                    return WALKING_TO_DESTINATION;
                case 11:
                    return ATTRIBUTES;
                case 12:
                    return APP_INSTALL_DEEP_LINK;
                case 13:
                    return CARPOOL_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarpoolRideLeg$a */
    public static class C11513a extends C25239c<MVCarpoolRideLeg> {
        public C11513a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolRideLeg mVCarpoolRideLeg = (MVCarpoolRideLeg) tBase;
            mVCarpoolRideLeg.mo34216w();
            C25113c cVar = MVCarpoolRideLeg.f29851b;
            gVar.mo61687K();
            if (mVCarpoolRideLeg.time != null) {
                gVar.mo61711x(MVCarpoolRideLeg.f29851b);
                mVCarpoolRideLeg.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarpoolRideLeg.driver != null) {
                gVar.mo61711x(MVCarpoolRideLeg.f29852c);
                mVCarpoolRideLeg.driver.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarpoolRideLeg.ride != null) {
                gVar.mo61711x(MVCarpoolRideLeg.f29853d);
                mVCarpoolRideLeg.ride.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarpoolRideLeg.stops != null) {
                gVar.mo61711x(MVCarpoolRideLeg.f29854e);
                mVCarpoolRideLeg.stops.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarpoolRideLeg.detourDetails != null) {
                gVar.mo61711x(MVCarpoolRideLeg.f29855f);
                mVCarpoolRideLeg.detourDetails.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarpoolRideLeg.carpoolSource != null) {
                gVar.mo61711x(MVCarpoolRideLeg.f29856g);
                gVar.mo61678B(mVCarpoolRideLeg.carpoolSource.getValue());
                gVar.mo61712y();
            }
            if (mVCarpoolRideLeg.deepLink != null && mVCarpoolRideLeg.mo34203j()) {
                gVar.mo61711x(MVCarpoolRideLeg.f29857h);
                gVar.mo61686J(mVCarpoolRideLeg.deepLink);
                gVar.mo61712y();
            }
            if (mVCarpoolRideLeg.mo34206m()) {
                gVar.mo61711x(MVCarpoolRideLeg.f29858i);
                gVar.mo61708u(mVCarpoolRideLeg.isEstimatedTimes);
                gVar.mo61712y();
            }
            if (mVCarpoolRideLeg.mo34211s()) {
                gVar.mo61711x(MVCarpoolRideLeg.f29859j);
                gVar.mo61678B(mVCarpoolRideLeg.walkingToPickup);
                gVar.mo61712y();
            }
            if (mVCarpoolRideLeg.mo34210r()) {
                gVar.mo61711x(MVCarpoolRideLeg.f29860k);
                gVar.mo61678B(mVCarpoolRideLeg.walkingToDestination);
                gVar.mo61712y();
            }
            if (mVCarpoolRideLeg.attributes != null && mVCarpoolRideLeg.mo34199g()) {
                gVar.mo61711x(MVCarpoolRideLeg.f29861l);
                gVar.mo61680D(new C25119e((byte) 8, mVCarpoolRideLeg.attributes.size()));
                for (MVCarpoolRideAttributes value : mVCarpoolRideLeg.attributes) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVCarpoolRideLeg.appInstallDeepLink != null && mVCarpoolRideLeg.mo34198f()) {
                gVar.mo61711x(MVCarpoolRideLeg.f29862m);
                gVar.mo61686J(mVCarpoolRideLeg.appInstallDeepLink);
                gVar.mo61712y();
            }
            if (mVCarpoolRideLeg.carpoolType != null) {
                gVar.mo61711x(MVCarpoolRideLeg.f29863n);
                gVar.mo61678B(mVCarpoolRideLeg.carpoolType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolRideLeg mVCarpoolRideLeg = (MVCarpoolRideLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCarpoolRideLeg.mo34216w();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTime mVTime = new MVTime();
                            mVCarpoolRideLeg.time = mVTime;
                            mVTime.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCarpoolDriver mVCarpoolDriver = new MVCarpoolDriver();
                            mVCarpoolRideLeg.driver = mVCarpoolDriver;
                            mVCarpoolDriver.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVRide mVRide = new MVRide();
                            mVCarpoolRideLeg.ride = mVRide;
                            mVRide.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPassengerStops mVPassengerStops = new MVPassengerStops();
                            mVCarpoolRideLeg.stops = mVPassengerStops;
                            mVPassengerStops.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCarPoolDetourTPDetails mVCarPoolDetourTPDetails = new MVCarPoolDetourTPDetails();
                            mVCarpoolRideLeg.detourDetails = mVCarPoolDetourTPDetails;
                            mVCarPoolDetourTPDetails.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolRideLeg.carpoolSource = MVCarPoolSource.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolRideLeg.deepLink = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolRideLeg.isEstimatedTimes = gVar.mo61690c();
                            mVCarpoolRideLeg.mo34212t();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolRideLeg.walkingToPickup = gVar.mo61696i();
                            mVCarpoolRideLeg.mo34215v();
                            break;
                        }
                    case 10:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolRideLeg.walkingToDestination = gVar.mo61696i();
                            mVCarpoolRideLeg.mo34214u();
                            break;
                        }
                    case 11:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVCarpoolRideLeg.attributes = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVCarpoolRideLeg.attributes.add(MVCarpoolRideAttributes.findByValue(gVar.mo61696i()));
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 12:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolRideLeg.appInstallDeepLink = gVar.mo61704q();
                            break;
                        }
                    case 13:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolRideLeg.carpoolType = MVCarpoolType.findByValue(gVar.mo61696i());
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarpoolRideLeg$b */
    public static class C11514b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11513a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarpoolRideLeg$c */
    public static class C11515c extends C25240d<MVCarpoolRideLeg> {
        public C11515c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolRideLeg mVCarpoolRideLeg = (MVCarpoolRideLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarpoolRideLeg.mo34209q()) {
                bitSet.set(0);
            }
            if (mVCarpoolRideLeg.mo34205l()) {
                bitSet.set(1);
            }
            if (mVCarpoolRideLeg.mo34207o()) {
                bitSet.set(2);
            }
            if (mVCarpoolRideLeg.mo34208p()) {
                bitSet.set(3);
            }
            if (mVCarpoolRideLeg.mo34204k()) {
                bitSet.set(4);
            }
            if (mVCarpoolRideLeg.mo34200h()) {
                bitSet.set(5);
            }
            if (mVCarpoolRideLeg.mo34203j()) {
                bitSet.set(6);
            }
            if (mVCarpoolRideLeg.mo34206m()) {
                bitSet.set(7);
            }
            if (mVCarpoolRideLeg.mo34211s()) {
                bitSet.set(8);
            }
            if (mVCarpoolRideLeg.mo34210r()) {
                bitSet.set(9);
            }
            if (mVCarpoolRideLeg.mo34199g()) {
                bitSet.set(10);
            }
            if (mVCarpoolRideLeg.mo34198f()) {
                bitSet.set(11);
            }
            if (mVCarpoolRideLeg.mo34202i()) {
                bitSet.set(12);
            }
            jVar.mo61738U(bitSet, 13);
            if (mVCarpoolRideLeg.mo34209q()) {
                mVCarpoolRideLeg.time.mo25202X0(jVar);
            }
            if (mVCarpoolRideLeg.mo34205l()) {
                mVCarpoolRideLeg.driver.mo25202X0(jVar);
            }
            if (mVCarpoolRideLeg.mo34207o()) {
                mVCarpoolRideLeg.ride.mo25202X0(jVar);
            }
            if (mVCarpoolRideLeg.mo34208p()) {
                mVCarpoolRideLeg.stops.mo25202X0(jVar);
            }
            if (mVCarpoolRideLeg.mo34204k()) {
                mVCarpoolRideLeg.detourDetails.mo25202X0(jVar);
            }
            if (mVCarpoolRideLeg.mo34200h()) {
                jVar.mo61678B(mVCarpoolRideLeg.carpoolSource.getValue());
            }
            if (mVCarpoolRideLeg.mo34203j()) {
                jVar.mo61686J(mVCarpoolRideLeg.deepLink);
            }
            if (mVCarpoolRideLeg.mo34206m()) {
                jVar.mo61708u(mVCarpoolRideLeg.isEstimatedTimes);
            }
            if (mVCarpoolRideLeg.mo34211s()) {
                jVar.mo61678B(mVCarpoolRideLeg.walkingToPickup);
            }
            if (mVCarpoolRideLeg.mo34210r()) {
                jVar.mo61678B(mVCarpoolRideLeg.walkingToDestination);
            }
            if (mVCarpoolRideLeg.mo34199g()) {
                jVar.mo61678B(mVCarpoolRideLeg.attributes.size());
                for (MVCarpoolRideAttributes value : mVCarpoolRideLeg.attributes) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVCarpoolRideLeg.mo34198f()) {
                jVar.mo61686J(mVCarpoolRideLeg.appInstallDeepLink);
            }
            if (mVCarpoolRideLeg.mo34202i()) {
                jVar.mo61678B(mVCarpoolRideLeg.carpoolType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolRideLeg mVCarpoolRideLeg = (MVCarpoolRideLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(13);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVCarpoolRideLeg.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVCarpoolDriver mVCarpoolDriver = new MVCarpoolDriver();
                mVCarpoolRideLeg.driver = mVCarpoolDriver;
                mVCarpoolDriver.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVRide mVRide = new MVRide();
                mVCarpoolRideLeg.ride = mVRide;
                mVRide.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVPassengerStops mVPassengerStops = new MVPassengerStops();
                mVCarpoolRideLeg.stops = mVPassengerStops;
                mVPassengerStops.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVCarPoolDetourTPDetails mVCarPoolDetourTPDetails = new MVCarPoolDetourTPDetails();
                mVCarpoolRideLeg.detourDetails = mVCarPoolDetourTPDetails;
                mVCarPoolDetourTPDetails.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVCarpoolRideLeg.carpoolSource = MVCarPoolSource.findByValue(jVar.mo61696i());
            }
            if (T.get(6)) {
                mVCarpoolRideLeg.deepLink = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVCarpoolRideLeg.isEstimatedTimes = jVar.mo61690c();
                mVCarpoolRideLeg.mo34212t();
            }
            if (T.get(8)) {
                mVCarpoolRideLeg.walkingToPickup = jVar.mo61696i();
                mVCarpoolRideLeg.mo34215v();
            }
            if (T.get(9)) {
                mVCarpoolRideLeg.walkingToDestination = jVar.mo61696i();
                mVCarpoolRideLeg.mo34214u();
            }
            if (T.get(10)) {
                int i = jVar.mo61696i();
                mVCarpoolRideLeg.attributes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVCarpoolRideLeg.attributes.add(MVCarpoolRideAttributes.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(11)) {
                mVCarpoolRideLeg.appInstallDeepLink = jVar.mo61704q();
            }
            if (T.get(12)) {
                mVCarpoolRideLeg.carpoolType = MVCarpoolType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarpoolRideLeg$d */
    public static class C11516d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11515c(0);
        }
    }

    static {
        new C17394d0("MVCarpoolRideLeg");
        HashMap hashMap = new HashMap();
        f29864o = hashMap;
        hashMap.put(C25239c.class, new C11514b());
        hashMap.put(C25240d.class, new C11516d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.DRIVER, new FieldMetaData("driver", (byte) 3, new StructMetaData(MVCarpoolDriver.class)));
        enumMap.put(_Fields.RIDE, new FieldMetaData("ride", (byte) 3, new StructMetaData(MVRide.class)));
        enumMap.put(_Fields.STOPS, new FieldMetaData("stops", (byte) 3, new StructMetaData(MVPassengerStops.class)));
        enumMap.put(_Fields.DETOUR_DETAILS, new FieldMetaData("detourDetails", (byte) 3, new StructMetaData(MVCarPoolDetourTPDetails.class)));
        enumMap.put(_Fields.CARPOOL_SOURCE, new FieldMetaData("carpoolSource", (byte) 3, new EnumMetaData(MVCarPoolSource.class)));
        enumMap.put(_Fields.DEEP_LINK, new FieldMetaData("deepLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_ESTIMATED_TIMES, new FieldMetaData("isEstimatedTimes", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.WALKING_TO_PICKUP, new FieldMetaData("walkingToPickup", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.WALKING_TO_DESTINATION, new FieldMetaData("walkingToDestination", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ATTRIBUTES, new FieldMetaData("attributes", (byte) 2, new ListMetaData(new EnumMetaData(MVCarpoolRideAttributes.class))));
        enumMap.put(_Fields.APP_INSTALL_DEEP_LINK, new FieldMetaData("appInstallDeepLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CARPOOL_TYPE, new FieldMetaData("carpoolType", (byte) 3, new EnumMetaData(MVCarpoolType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29865p = unmodifiableMap;
        FieldMetaData.m61947a(MVCarpoolRideLeg.class, unmodifiableMap);
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
        ((C25238b) f29864o.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29864o.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCarpoolRideLeg mVCarpoolRideLeg = (MVCarpoolRideLeg) obj;
        if (!getClass().equals(mVCarpoolRideLeg.getClass())) {
            return getClass().getName().compareTo(mVCarpoolRideLeg.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34209q()).compareTo(Boolean.valueOf(mVCarpoolRideLeg.mo34209q()));
        if (compareTo2 != 0 || ((mo34209q() && (compareTo2 = this.time.compareTo(mVCarpoolRideLeg.time)) != 0) || (compareTo2 = Boolean.valueOf(mo34205l()).compareTo(Boolean.valueOf(mVCarpoolRideLeg.mo34205l()))) != 0 || ((mo34205l() && (compareTo2 = this.driver.compareTo(mVCarpoolRideLeg.driver)) != 0) || (compareTo2 = Boolean.valueOf(mo34207o()).compareTo(Boolean.valueOf(mVCarpoolRideLeg.mo34207o()))) != 0 || ((mo34207o() && (compareTo2 = this.ride.compareTo(mVCarpoolRideLeg.ride)) != 0) || (compareTo2 = Boolean.valueOf(mo34208p()).compareTo(Boolean.valueOf(mVCarpoolRideLeg.mo34208p()))) != 0 || ((mo34208p() && (compareTo2 = this.stops.compareTo(mVCarpoolRideLeg.stops)) != 0) || (compareTo2 = Boolean.valueOf(mo34204k()).compareTo(Boolean.valueOf(mVCarpoolRideLeg.mo34204k()))) != 0 || ((mo34204k() && (compareTo2 = this.detourDetails.compareTo(mVCarpoolRideLeg.detourDetails)) != 0) || (compareTo2 = Boolean.valueOf(mo34200h()).compareTo(Boolean.valueOf(mVCarpoolRideLeg.mo34200h()))) != 0 || ((mo34200h() && (compareTo2 = this.carpoolSource.compareTo(mVCarpoolRideLeg.carpoolSource)) != 0) || (compareTo2 = Boolean.valueOf(mo34203j()).compareTo(Boolean.valueOf(mVCarpoolRideLeg.mo34203j()))) != 0 || ((mo34203j() && (compareTo2 = this.deepLink.compareTo(mVCarpoolRideLeg.deepLink)) != 0) || (compareTo2 = Boolean.valueOf(mo34206m()).compareTo(Boolean.valueOf(mVCarpoolRideLeg.mo34206m()))) != 0 || ((mo34206m() && (compareTo2 = C25082a.m62848l(this.isEstimatedTimes, mVCarpoolRideLeg.isEstimatedTimes)) != 0) || (compareTo2 = Boolean.valueOf(mo34211s()).compareTo(Boolean.valueOf(mVCarpoolRideLeg.mo34211s()))) != 0 || ((mo34211s() && (compareTo2 = C25082a.m62839c(this.walkingToPickup, mVCarpoolRideLeg.walkingToPickup)) != 0) || (compareTo2 = Boolean.valueOf(mo34210r()).compareTo(Boolean.valueOf(mVCarpoolRideLeg.mo34210r()))) != 0 || ((mo34210r() && (compareTo2 = C25082a.m62839c(this.walkingToDestination, mVCarpoolRideLeg.walkingToDestination)) != 0) || (compareTo2 = Boolean.valueOf(mo34199g()).compareTo(Boolean.valueOf(mVCarpoolRideLeg.mo34199g()))) != 0 || ((mo34199g() && (compareTo2 = C25082a.m62844h(this.attributes, mVCarpoolRideLeg.attributes)) != 0) || (compareTo2 = Boolean.valueOf(mo34198f()).compareTo(Boolean.valueOf(mVCarpoolRideLeg.mo34198f()))) != 0 || ((mo34198f() && (compareTo2 = this.appInstallDeepLink.compareTo(mVCarpoolRideLeg.appInstallDeepLink)) != 0) || (compareTo2 = Boolean.valueOf(mo34202i()).compareTo(Boolean.valueOf(mVCarpoolRideLeg.mo34202i()))) != 0))))))))))))) {
            return compareTo2;
        }
        if (!mo34202i() || (compareTo = this.carpoolType.compareTo(mVCarpoolRideLeg.carpoolType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCarpoolRideLeg)) {
            return false;
        }
        MVCarpoolRideLeg mVCarpoolRideLeg = (MVCarpoolRideLeg) obj;
        boolean q = mo34209q();
        boolean q2 = mVCarpoolRideLeg.mo34209q();
        if ((q || q2) && (!q || !q2 || !this.time.mo34573a(mVCarpoolRideLeg.time))) {
            return false;
        }
        boolean l = mo34205l();
        boolean l2 = mVCarpoolRideLeg.mo34205l();
        if ((l || l2) && (!l || !l2 || !this.driver.mo25523a(mVCarpoolRideLeg.driver))) {
            return false;
        }
        boolean o = mo34207o();
        boolean o2 = mVCarpoolRideLeg.mo34207o();
        if ((o || o2) && (!o || !o2 || !this.ride.mo25845a(mVCarpoolRideLeg.ride))) {
            return false;
        }
        boolean p = mo34208p();
        boolean p2 = mVCarpoolRideLeg.mo34208p();
        if ((p || p2) && (!p || !p2 || !this.stops.mo25800a(mVCarpoolRideLeg.stops))) {
            return false;
        }
        boolean k = mo34204k();
        boolean k2 = mVCarpoolRideLeg.mo34204k();
        if ((k || k2) && (!k || !k2 || !this.detourDetails.mo34185a(mVCarpoolRideLeg.detourDetails))) {
            return false;
        }
        boolean h = mo34200h();
        boolean h2 = mVCarpoolRideLeg.mo34200h();
        if ((h || h2) && (!h || !h2 || !this.carpoolSource.equals(mVCarpoolRideLeg.carpoolSource))) {
            return false;
        }
        boolean j = mo34203j();
        boolean j2 = mVCarpoolRideLeg.mo34203j();
        if ((j || j2) && (!j || !j2 || !this.deepLink.equals(mVCarpoolRideLeg.deepLink))) {
            return false;
        }
        boolean m = mo34206m();
        boolean m2 = mVCarpoolRideLeg.mo34206m();
        if ((m || m2) && (!m || !m2 || this.isEstimatedTimes != mVCarpoolRideLeg.isEstimatedTimes)) {
            return false;
        }
        boolean s = mo34211s();
        boolean s2 = mVCarpoolRideLeg.mo34211s();
        if ((s || s2) && (!s || !s2 || this.walkingToPickup != mVCarpoolRideLeg.walkingToPickup)) {
            return false;
        }
        boolean r = mo34210r();
        boolean r2 = mVCarpoolRideLeg.mo34210r();
        if ((r || r2) && (!r || !r2 || this.walkingToDestination != mVCarpoolRideLeg.walkingToDestination)) {
            return false;
        }
        boolean g = mo34199g();
        boolean g2 = mVCarpoolRideLeg.mo34199g();
        if ((g || g2) && (!g || !g2 || !this.attributes.equals(mVCarpoolRideLeg.attributes))) {
            return false;
        }
        boolean f = mo34198f();
        boolean f2 = mVCarpoolRideLeg.mo34198f();
        if ((f || f2) && (!f || !f2 || !this.appInstallDeepLink.equals(mVCarpoolRideLeg.appInstallDeepLink))) {
            return false;
        }
        boolean i = mo34202i();
        boolean i2 = mVCarpoolRideLeg.mo34202i();
        if ((i || i2) && (!i || !i2 || !this.carpoolType.equals(mVCarpoolRideLeg.carpoolType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34198f() {
        return this.appInstallDeepLink != null;
    }

    /* renamed from: g */
    public final boolean mo34199g() {
        return this.attributes != null;
    }

    /* renamed from: h */
    public final boolean mo34200h() {
        return this.carpoolSource != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34202i() {
        return this.carpoolType != null;
    }

    /* renamed from: j */
    public final boolean mo34203j() {
        return this.deepLink != null;
    }

    /* renamed from: k */
    public final boolean mo34204k() {
        return this.detourDetails != null;
    }

    /* renamed from: l */
    public final boolean mo34205l() {
        return this.driver != null;
    }

    /* renamed from: m */
    public final boolean mo34206m() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: o */
    public final boolean mo34207o() {
        return this.ride != null;
    }

    /* renamed from: p */
    public final boolean mo34208p() {
        return this.stops != null;
    }

    /* renamed from: q */
    public final boolean mo34209q() {
        return this.time != null;
    }

    /* renamed from: r */
    public final boolean mo34210r() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: s */
    public final boolean mo34211s() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: t */
    public final void mo34212t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarpoolRideLeg(", "time:");
        MVTime mVTime = this.time;
        if (mVTime == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTime);
        }
        n.append(", ");
        n.append("driver:");
        MVCarpoolDriver mVCarpoolDriver = this.driver;
        if (mVCarpoolDriver == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarpoolDriver);
        }
        n.append(", ");
        n.append("ride:");
        MVRide mVRide = this.ride;
        if (mVRide == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRide);
        }
        n.append(", ");
        n.append("stops:");
        MVPassengerStops mVPassengerStops = this.stops;
        if (mVPassengerStops == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPassengerStops);
        }
        n.append(", ");
        n.append("detourDetails:");
        MVCarPoolDetourTPDetails mVCarPoolDetourTPDetails = this.detourDetails;
        if (mVCarPoolDetourTPDetails == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolDetourTPDetails);
        }
        n.append(", ");
        n.append("carpoolSource:");
        MVCarPoolSource mVCarPoolSource = this.carpoolSource;
        if (mVCarPoolSource == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolSource);
        }
        if (mo34203j()) {
            n.append(", ");
            n.append("deepLink:");
            String str = this.deepLink;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo34206m()) {
            n.append(", ");
            n.append("isEstimatedTimes:");
            n.append(this.isEstimatedTimes);
        }
        if (mo34211s()) {
            n.append(", ");
            n.append("walkingToPickup:");
            n.append(this.walkingToPickup);
        }
        if (mo34210r()) {
            n.append(", ");
            n.append("walkingToDestination:");
            n.append(this.walkingToDestination);
        }
        if (mo34199g()) {
            n.append(", ");
            n.append("attributes:");
            List<MVCarpoolRideAttributes> list = this.attributes;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo34198f()) {
            n.append(", ");
            n.append("appInstallDeepLink:");
            String str2 = this.appInstallDeepLink;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(", ");
        n.append("carpoolType:");
        MVCarpoolType mVCarpoolType = this.carpoolType;
        if (mVCarpoolType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarpoolType);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo34214u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: v */
    public final void mo34215v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: w */
    public final void mo34216w() throws TException {
        MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails;
        MVRide mVRide = this.ride;
        if (mVRide != null) {
            mVRide.mo25867y();
        }
        MVPassengerStops mVPassengerStops = this.stops;
        if (mVPassengerStops != null) {
            mVPassengerStops.mo25808j();
        }
        MVCarPoolDetourTPDetails mVCarPoolDetourTPDetails = this.detourDetails;
        if (mVCarPoolDetourTPDetails != null && (mVCarPoolRideDetourDetails = mVCarPoolDetourTPDetails.details) != null) {
            mVCarPoolRideDetourDetails.mo25488l();
        }
    }
}
