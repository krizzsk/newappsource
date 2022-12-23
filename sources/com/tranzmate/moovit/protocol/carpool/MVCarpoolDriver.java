package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.tranzmate.moovit.protocol.common.MVCarPoolWorkDetails;
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

public class MVCarpoolDriver implements TBase<MVCarpoolDriver, _Fields>, Serializable, Cloneable, Comparable<MVCarpoolDriver> {

    /* renamed from: b */
    public static final C25113c f24663b = new C25113c("driverId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f24664c = new C25113c("firstName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f24665d = new C25113c("lastName", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f24666e = new C25113c("phoneNumber", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f24667f = new C25113c("car", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f24668g = new C25113c("rating", (byte) 4, 6);

    /* renamed from: h */
    public static final C25113c f24669h = new C25113c("profilePhotoUrl", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f24670i = new C25113c("fbFriendsNum", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f24671j = new C25113c("selfDescription", (byte) 11, 9);

    /* renamed from: k */
    public static final C25113c f24672k = new C25113c("registrationDate", (byte) 10, 10);

    /* renamed from: l */
    public static final C25113c f24673l = new C25113c("numRatings", (byte) 6, 11);

    /* renamed from: m */
    public static final C25113c f24674m = new C25113c("numFinishedRides", (byte) 6, 12);

    /* renamed from: n */
    public static final C25113c f24675n = new C25113c(InneractiveMediationDefs.KEY_AGE, (byte) 6, 13);

    /* renamed from: o */
    public static final C25113c f24676o = new C25113c("fbId", (byte) 11, 14);

    /* renamed from: p */
    public static final C25113c f24677p = new C25113c("allowMultiplePickupPoints", (byte) 2, 15);

    /* renamed from: q */
    public static final C25113c f24678q = new C25113c("driversWorkData", (byte) 12, 16);

    /* renamed from: r */
    public static final C25113c f24679r = new C25113c("allowDetour", (byte) 2, 17);

    /* renamed from: s */
    public static final C25113c f24680s = new C25113c("driverConfirmationSettings", (byte) 12, 18);

    /* renamed from: t */
    public static final HashMap f24681t;

    /* renamed from: u */
    public static final Map<_Fields, FieldMetaData> f24682u;
    private byte __isset_bitfield = 0;
    public short age;
    public boolean allowDetour;
    public boolean allowMultiplePickupPoints;
    public MVCar car;
    public MVDriverConfirmationSettings driverConfirmationSettings;
    public String driverId;
    public MVCarPoolWorkDetails driversWorkData;
    public int fbFriendsNum;
    public String fbId;
    public String firstName;
    public String lastName;
    public short numFinishedRides;
    public short numRatings;
    private _Fields[] optionals = {_Fields.PROFILE_PHOTO_URL, _Fields.FB_FRIENDS_NUM, _Fields.SELF_DESCRIPTION, _Fields.AGE, _Fields.FB_ID, _Fields.ALLOW_MULTIPLE_PICKUP_POINTS, _Fields.DRIVERS_WORK_DATA, _Fields.ALLOW_DETOUR, _Fields.DRIVER_CONFIRMATION_SETTINGS};
    public String phoneNumber;
    public String profilePhotoUrl;
    public double rating;
    public long registrationDate;
    public String selfDescription;

    public enum _Fields implements C25085c {
        DRIVER_ID(1, "driverId"),
        FIRST_NAME(2, "firstName"),
        LAST_NAME(3, "lastName"),
        PHONE_NUMBER(4, "phoneNumber"),
        CAR(5, "car"),
        RATING(6, "rating"),
        PROFILE_PHOTO_URL(7, "profilePhotoUrl"),
        FB_FRIENDS_NUM(8, "fbFriendsNum"),
        SELF_DESCRIPTION(9, "selfDescription"),
        REGISTRATION_DATE(10, "registrationDate"),
        NUM_RATINGS(11, "numRatings"),
        NUM_FINISHED_RIDES(12, "numFinishedRides"),
        AGE(13, InneractiveMediationDefs.KEY_AGE),
        FB_ID(14, "fbId"),
        ALLOW_MULTIPLE_PICKUP_POINTS(15, "allowMultiplePickupPoints"),
        DRIVERS_WORK_DATA(16, "driversWorkData"),
        ALLOW_DETOUR(17, "allowDetour"),
        DRIVER_CONFIRMATION_SETTINGS(18, "driverConfirmationSettings");
        
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
                    return DRIVER_ID;
                case 2:
                    return FIRST_NAME;
                case 3:
                    return LAST_NAME;
                case 4:
                    return PHONE_NUMBER;
                case 5:
                    return CAR;
                case 6:
                    return RATING;
                case 7:
                    return PROFILE_PHOTO_URL;
                case 8:
                    return FB_FRIENDS_NUM;
                case 9:
                    return SELF_DESCRIPTION;
                case 10:
                    return REGISTRATION_DATE;
                case 11:
                    return NUM_RATINGS;
                case 12:
                    return NUM_FINISHED_RIDES;
                case 13:
                    return AGE;
                case 14:
                    return FB_ID;
                case 15:
                    return ALLOW_MULTIPLE_PICKUP_POINTS;
                case 16:
                    return DRIVERS_WORK_DATA;
                case 17:
                    return ALLOW_DETOUR;
                case 18:
                    return DRIVER_CONFIRMATION_SETTINGS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarpoolDriver$a */
    public static class C8186a extends C25239c<MVCarpoolDriver> {
        public C8186a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolDriver mVCarpoolDriver = (MVCarpoolDriver) tBase;
            mVCarpoolDriver.getClass();
            C25113c cVar = MVCarpoolDriver.f24663b;
            gVar.mo61687K();
            if (mVCarpoolDriver.driverId != null) {
                gVar.mo61711x(MVCarpoolDriver.f24663b);
                gVar.mo61686J(mVCarpoolDriver.driverId);
                gVar.mo61712y();
            }
            if (mVCarpoolDriver.firstName != null) {
                gVar.mo61711x(MVCarpoolDriver.f24664c);
                gVar.mo61686J(mVCarpoolDriver.firstName);
                gVar.mo61712y();
            }
            if (mVCarpoolDriver.lastName != null) {
                gVar.mo61711x(MVCarpoolDriver.f24665d);
                gVar.mo61686J(mVCarpoolDriver.lastName);
                gVar.mo61712y();
            }
            if (mVCarpoolDriver.phoneNumber != null) {
                gVar.mo61711x(MVCarpoolDriver.f24666e);
                gVar.mo61686J(mVCarpoolDriver.phoneNumber);
                gVar.mo61712y();
            }
            if (mVCarpoolDriver.car != null) {
                gVar.mo61711x(MVCarpoolDriver.f24667f);
                mVCarpoolDriver.car.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCarpoolDriver.f24668g);
            gVar.mo61710w(mVCarpoolDriver.rating);
            gVar.mo61712y();
            if (mVCarpoolDriver.profilePhotoUrl != null && mVCarpoolDriver.mo25542u()) {
                gVar.mo61711x(MVCarpoolDriver.f24669h);
                gVar.mo61686J(mVCarpoolDriver.profilePhotoUrl);
                gVar.mo61712y();
            }
            if (mVCarpoolDriver.mo25534m()) {
                gVar.mo61711x(MVCarpoolDriver.f24670i);
                gVar.mo61678B(mVCarpoolDriver.fbFriendsNum);
                gVar.mo61712y();
            }
            if (mVCarpoolDriver.selfDescription != null && mVCarpoolDriver.mo25545y()) {
                gVar.mo61711x(MVCarpoolDriver.f24671j);
                gVar.mo61686J(mVCarpoolDriver.selfDescription);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCarpoolDriver.f24672k);
            gVar.mo61679C(mVCarpoolDriver.registrationDate);
            gVar.mo61712y();
            gVar.mo61711x(MVCarpoolDriver.f24673l);
            gVar.mo61677A(mVCarpoolDriver.numRatings);
            gVar.mo61712y();
            gVar.mo61711x(MVCarpoolDriver.f24674m);
            gVar.mo61677A(mVCarpoolDriver.numFinishedRides);
            gVar.mo61712y();
            if (mVCarpoolDriver.mo25526f()) {
                gVar.mo61711x(MVCarpoolDriver.f24675n);
                gVar.mo61677A(mVCarpoolDriver.age);
                gVar.mo61712y();
            }
            if (mVCarpoolDriver.fbId != null && mVCarpoolDriver.mo25535o()) {
                gVar.mo61711x(MVCarpoolDriver.f24676o);
                gVar.mo61686J(mVCarpoolDriver.fbId);
                gVar.mo61712y();
            }
            if (mVCarpoolDriver.mo25528h()) {
                gVar.mo61711x(MVCarpoolDriver.f24677p);
                gVar.mo61708u(mVCarpoolDriver.allowMultiplePickupPoints);
                gVar.mo61712y();
            }
            if (mVCarpoolDriver.driversWorkData != null && mVCarpoolDriver.mo25533l()) {
                gVar.mo61711x(MVCarpoolDriver.f24678q);
                mVCarpoolDriver.driversWorkData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarpoolDriver.mo25527g()) {
                gVar.mo61711x(MVCarpoolDriver.f24679r);
                gVar.mo61708u(mVCarpoolDriver.allowDetour);
                gVar.mo61712y();
            }
            if (mVCarpoolDriver.driverConfirmationSettings != null && mVCarpoolDriver.mo25531j()) {
                gVar.mo61711x(MVCarpoolDriver.f24680s);
                mVCarpoolDriver.driverConfirmationSettings.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolDriver mVCarpoolDriver = (MVCarpoolDriver) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCarpoolDriver.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.driverId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.firstName = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.lastName = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.phoneNumber = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCar mVCar = new MVCar();
                            mVCarpoolDriver.car = mVCar;
                            mVCar.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.rating = gVar.mo61692e();
                            mVCarpoolDriver.mo25521I();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.profilePhotoUrl = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.fbFriendsNum = gVar.mo61696i();
                            mVCarpoolDriver.mo25518F();
                            break;
                        }
                    case 9:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.selfDescription = gVar.mo61704q();
                            break;
                        }
                    case 10:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.registrationDate = gVar.mo61697j();
                            mVCarpoolDriver.mo25522J();
                            break;
                        }
                    case 11:
                        if (b != 6) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.numRatings = gVar.mo61695h();
                            mVCarpoolDriver.mo25520H();
                            break;
                        }
                    case 12:
                        if (b != 6) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.numFinishedRides = gVar.mo61695h();
                            mVCarpoolDriver.mo25519G();
                            break;
                        }
                    case 13:
                        if (b != 6) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.age = gVar.mo61695h();
                            mVCarpoolDriver.mo25515A();
                            break;
                        }
                    case 14:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.fbId = gVar.mo61704q();
                            break;
                        }
                    case 15:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.allowMultiplePickupPoints = gVar.mo61690c();
                            mVCarpoolDriver.mo25517E();
                            break;
                        }
                    case 16:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCarPoolWorkDetails mVCarPoolWorkDetails = new MVCarPoolWorkDetails();
                            mVCarpoolDriver.driversWorkData = mVCarPoolWorkDetails;
                            mVCarPoolWorkDetails.mo25201C1(gVar);
                            break;
                        }
                    case 17:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolDriver.allowDetour = gVar.mo61690c();
                            mVCarpoolDriver.mo25516D();
                            break;
                        }
                    case 18:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVDriverConfirmationSettings mVDriverConfirmationSettings = new MVDriverConfirmationSettings();
                            mVCarpoolDriver.driverConfirmationSettings = mVDriverConfirmationSettings;
                            mVDriverConfirmationSettings.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarpoolDriver$b */
    public static class C8187b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8186a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarpoolDriver$c */
    public static class C8188c extends C25240d<MVCarpoolDriver> {
        public C8188c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolDriver mVCarpoolDriver = (MVCarpoolDriver) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarpoolDriver.mo25532k()) {
                bitSet.set(0);
            }
            if (mVCarpoolDriver.mo25536p()) {
                bitSet.set(1);
            }
            if (mVCarpoolDriver.mo25537q()) {
                bitSet.set(2);
            }
            if (mVCarpoolDriver.mo25540t()) {
                bitSet.set(3);
            }
            if (mVCarpoolDriver.mo25530i()) {
                bitSet.set(4);
            }
            if (mVCarpoolDriver.mo25543v()) {
                bitSet.set(5);
            }
            if (mVCarpoolDriver.mo25542u()) {
                bitSet.set(6);
            }
            if (mVCarpoolDriver.mo25534m()) {
                bitSet.set(7);
            }
            if (mVCarpoolDriver.mo25545y()) {
                bitSet.set(8);
            }
            if (mVCarpoolDriver.mo25544w()) {
                bitSet.set(9);
            }
            if (mVCarpoolDriver.mo25539s()) {
                bitSet.set(10);
            }
            if (mVCarpoolDriver.mo25538r()) {
                bitSet.set(11);
            }
            if (mVCarpoolDriver.mo25526f()) {
                bitSet.set(12);
            }
            if (mVCarpoolDriver.mo25535o()) {
                bitSet.set(13);
            }
            if (mVCarpoolDriver.mo25528h()) {
                bitSet.set(14);
            }
            if (mVCarpoolDriver.mo25533l()) {
                bitSet.set(15);
            }
            if (mVCarpoolDriver.mo25527g()) {
                bitSet.set(16);
            }
            if (mVCarpoolDriver.mo25531j()) {
                bitSet.set(17);
            }
            jVar.mo61738U(bitSet, 18);
            if (mVCarpoolDriver.mo25532k()) {
                jVar.mo61686J(mVCarpoolDriver.driverId);
            }
            if (mVCarpoolDriver.mo25536p()) {
                jVar.mo61686J(mVCarpoolDriver.firstName);
            }
            if (mVCarpoolDriver.mo25537q()) {
                jVar.mo61686J(mVCarpoolDriver.lastName);
            }
            if (mVCarpoolDriver.mo25540t()) {
                jVar.mo61686J(mVCarpoolDriver.phoneNumber);
            }
            if (mVCarpoolDriver.mo25530i()) {
                mVCarpoolDriver.car.mo25202X0(jVar);
            }
            if (mVCarpoolDriver.mo25543v()) {
                jVar.mo61710w(mVCarpoolDriver.rating);
            }
            if (mVCarpoolDriver.mo25542u()) {
                jVar.mo61686J(mVCarpoolDriver.profilePhotoUrl);
            }
            if (mVCarpoolDriver.mo25534m()) {
                jVar.mo61678B(mVCarpoolDriver.fbFriendsNum);
            }
            if (mVCarpoolDriver.mo25545y()) {
                jVar.mo61686J(mVCarpoolDriver.selfDescription);
            }
            if (mVCarpoolDriver.mo25544w()) {
                jVar.mo61679C(mVCarpoolDriver.registrationDate);
            }
            if (mVCarpoolDriver.mo25539s()) {
                jVar.mo61677A(mVCarpoolDriver.numRatings);
            }
            if (mVCarpoolDriver.mo25538r()) {
                jVar.mo61677A(mVCarpoolDriver.numFinishedRides);
            }
            if (mVCarpoolDriver.mo25526f()) {
                jVar.mo61677A(mVCarpoolDriver.age);
            }
            if (mVCarpoolDriver.mo25535o()) {
                jVar.mo61686J(mVCarpoolDriver.fbId);
            }
            if (mVCarpoolDriver.mo25528h()) {
                jVar.mo61708u(mVCarpoolDriver.allowMultiplePickupPoints);
            }
            if (mVCarpoolDriver.mo25533l()) {
                mVCarpoolDriver.driversWorkData.mo25202X0(jVar);
            }
            if (mVCarpoolDriver.mo25527g()) {
                jVar.mo61708u(mVCarpoolDriver.allowDetour);
            }
            if (mVCarpoolDriver.mo25531j()) {
                mVCarpoolDriver.driverConfirmationSettings.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolDriver mVCarpoolDriver = (MVCarpoolDriver) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(18);
            if (T.get(0)) {
                mVCarpoolDriver.driverId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCarpoolDriver.firstName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVCarpoolDriver.lastName = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVCarpoolDriver.phoneNumber = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVCar mVCar = new MVCar();
                mVCarpoolDriver.car = mVCar;
                mVCar.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVCarpoolDriver.rating = jVar.mo61692e();
                mVCarpoolDriver.mo25521I();
            }
            if (T.get(6)) {
                mVCarpoolDriver.profilePhotoUrl = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVCarpoolDriver.fbFriendsNum = jVar.mo61696i();
                mVCarpoolDriver.mo25518F();
            }
            if (T.get(8)) {
                mVCarpoolDriver.selfDescription = jVar.mo61704q();
            }
            if (T.get(9)) {
                mVCarpoolDriver.registrationDate = jVar.mo61697j();
                mVCarpoolDriver.mo25522J();
            }
            if (T.get(10)) {
                mVCarpoolDriver.numRatings = jVar.mo61695h();
                mVCarpoolDriver.mo25520H();
            }
            if (T.get(11)) {
                mVCarpoolDriver.numFinishedRides = jVar.mo61695h();
                mVCarpoolDriver.mo25519G();
            }
            if (T.get(12)) {
                mVCarpoolDriver.age = jVar.mo61695h();
                mVCarpoolDriver.mo25515A();
            }
            if (T.get(13)) {
                mVCarpoolDriver.fbId = jVar.mo61704q();
            }
            if (T.get(14)) {
                mVCarpoolDriver.allowMultiplePickupPoints = jVar.mo61690c();
                mVCarpoolDriver.mo25517E();
            }
            if (T.get(15)) {
                MVCarPoolWorkDetails mVCarPoolWorkDetails = new MVCarPoolWorkDetails();
                mVCarpoolDriver.driversWorkData = mVCarPoolWorkDetails;
                mVCarPoolWorkDetails.mo25201C1(jVar);
            }
            if (T.get(16)) {
                mVCarpoolDriver.allowDetour = jVar.mo61690c();
                mVCarpoolDriver.mo25516D();
            }
            if (T.get(17)) {
                MVDriverConfirmationSettings mVDriverConfirmationSettings = new MVDriverConfirmationSettings();
                mVCarpoolDriver.driverConfirmationSettings = mVDriverConfirmationSettings;
                mVDriverConfirmationSettings.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarpoolDriver$d */
    public static class C8189d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8188c(0);
        }
    }

    static {
        new C17394d0("MVCarpoolDriver");
        String str = InneractiveMediationDefs.KEY_AGE;
        HashMap hashMap = new HashMap();
        f24681t = hashMap;
        hashMap.put(C25239c.class, new C8187b());
        hashMap.put(C25240d.class, new C8189d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DRIVER_ID, new FieldMetaData("driverId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FIRST_NAME, new FieldMetaData("firstName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LAST_NAME, new FieldMetaData("lastName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PHONE_NUMBER, new FieldMetaData("phoneNumber", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CAR, new FieldMetaData("car", (byte) 3, new StructMetaData(MVCar.class)));
        enumMap.put(_Fields.RATING, new FieldMetaData("rating", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.PROFILE_PHOTO_URL, new FieldMetaData("profilePhotoUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FB_FRIENDS_NUM, new FieldMetaData("fbFriendsNum", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SELF_DESCRIPTION, new FieldMetaData("selfDescription", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REGISTRATION_DATE, new FieldMetaData("registrationDate", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.NUM_RATINGS, new FieldMetaData("numRatings", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.NUM_FINISHED_RIDES, new FieldMetaData("numFinishedRides", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.AGE, new FieldMetaData(str, (byte) 2, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.FB_ID, new FieldMetaData("fbId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ALLOW_MULTIPLE_PICKUP_POINTS, new FieldMetaData("allowMultiplePickupPoints", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.DRIVERS_WORK_DATA, new FieldMetaData("driversWorkData", (byte) 2, new StructMetaData(MVCarPoolWorkDetails.class)));
        enumMap.put(_Fields.ALLOW_DETOUR, new FieldMetaData("allowDetour", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.DRIVER_CONFIRMATION_SETTINGS, new FieldMetaData("driverConfirmationSettings", (byte) 2, new StructMetaData(MVDriverConfirmationSettings.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24682u = unmodifiableMap;
        FieldMetaData.m61947a(MVCarpoolDriver.class, unmodifiableMap);
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
    public final void mo25515A() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f24681t.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo25516D() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 7, true);
    }

    /* renamed from: E */
    public final void mo25517E() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: F */
    public final void mo25518F() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: G */
    public final void mo25519G() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: H */
    public final void mo25520H() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: I */
    public final void mo25521I() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: J */
    public final void mo25522J() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24681t.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25523a(MVCarpoolDriver mVCarpoolDriver) {
        if (mVCarpoolDriver == null) {
            return false;
        }
        boolean k = mo25532k();
        boolean k2 = mVCarpoolDriver.mo25532k();
        if ((k || k2) && (!k || !k2 || !this.driverId.equals(mVCarpoolDriver.driverId))) {
            return false;
        }
        boolean p = mo25536p();
        boolean p2 = mVCarpoolDriver.mo25536p();
        if ((p || p2) && (!p || !p2 || !this.firstName.equals(mVCarpoolDriver.firstName))) {
            return false;
        }
        boolean q = mo25537q();
        boolean q2 = mVCarpoolDriver.mo25537q();
        if ((q || q2) && (!q || !q2 || !this.lastName.equals(mVCarpoolDriver.lastName))) {
            return false;
        }
        boolean t = mo25540t();
        boolean t2 = mVCarpoolDriver.mo25540t();
        if ((t || t2) && (!t || !t2 || !this.phoneNumber.equals(mVCarpoolDriver.phoneNumber))) {
            return false;
        }
        boolean i = mo25530i();
        boolean i2 = mVCarpoolDriver.mo25530i();
        if (((i || i2) && (!i || !i2 || !this.car.mo25408a(mVCarpoolDriver.car))) || this.rating != mVCarpoolDriver.rating) {
            return false;
        }
        boolean u = mo25542u();
        boolean u2 = mVCarpoolDriver.mo25542u();
        if ((u || u2) && (!u || !u2 || !this.profilePhotoUrl.equals(mVCarpoolDriver.profilePhotoUrl))) {
            return false;
        }
        boolean m = mo25534m();
        boolean m2 = mVCarpoolDriver.mo25534m();
        if ((m || m2) && (!m || !m2 || this.fbFriendsNum != mVCarpoolDriver.fbFriendsNum)) {
            return false;
        }
        boolean y = mo25545y();
        boolean y2 = mVCarpoolDriver.mo25545y();
        if (((y || y2) && (!y || !y2 || !this.selfDescription.equals(mVCarpoolDriver.selfDescription))) || this.registrationDate != mVCarpoolDriver.registrationDate || this.numRatings != mVCarpoolDriver.numRatings || this.numFinishedRides != mVCarpoolDriver.numFinishedRides) {
            return false;
        }
        boolean f = mo25526f();
        boolean f2 = mVCarpoolDriver.mo25526f();
        if ((f || f2) && (!f || !f2 || this.age != mVCarpoolDriver.age)) {
            return false;
        }
        boolean o = mo25535o();
        boolean o2 = mVCarpoolDriver.mo25535o();
        if ((o || o2) && (!o || !o2 || !this.fbId.equals(mVCarpoolDriver.fbId))) {
            return false;
        }
        boolean h = mo25528h();
        boolean h2 = mVCarpoolDriver.mo25528h();
        if ((h || h2) && (!h || !h2 || this.allowMultiplePickupPoints != mVCarpoolDriver.allowMultiplePickupPoints)) {
            return false;
        }
        boolean l = mo25533l();
        boolean l2 = mVCarpoolDriver.mo25533l();
        if ((l || l2) && (!l || !l2 || !this.driversWorkData.mo26090a(mVCarpoolDriver.driversWorkData))) {
            return false;
        }
        boolean g = mo25527g();
        boolean g2 = mVCarpoolDriver.mo25527g();
        if ((g || g2) && (!g || !g2 || this.allowDetour != mVCarpoolDriver.allowDetour)) {
            return false;
        }
        boolean j = mo25531j();
        boolean j2 = mVCarpoolDriver.mo25531j();
        if (!j && !j2) {
            return true;
        }
        if (!j || !j2 || !this.driverConfirmationSettings.mo25593a(mVCarpoolDriver.driverConfirmationSettings)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCarpoolDriver mVCarpoolDriver = (MVCarpoolDriver) obj;
        if (!getClass().equals(mVCarpoolDriver.getClass())) {
            return getClass().getName().compareTo(mVCarpoolDriver.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25532k()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25532k()));
        if (compareTo2 != 0 || ((mo25532k() && (compareTo2 = this.driverId.compareTo(mVCarpoolDriver.driverId)) != 0) || (compareTo2 = Boolean.valueOf(mo25536p()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25536p()))) != 0 || ((mo25536p() && (compareTo2 = this.firstName.compareTo(mVCarpoolDriver.firstName)) != 0) || (compareTo2 = Boolean.valueOf(mo25537q()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25537q()))) != 0 || ((mo25537q() && (compareTo2 = this.lastName.compareTo(mVCarpoolDriver.lastName)) != 0) || (compareTo2 = Boolean.valueOf(mo25540t()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25540t()))) != 0 || ((mo25540t() && (compareTo2 = this.phoneNumber.compareTo(mVCarpoolDriver.phoneNumber)) != 0) || (compareTo2 = Boolean.valueOf(mo25530i()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25530i()))) != 0 || ((mo25530i() && (compareTo2 = this.car.compareTo(mVCarpoolDriver.car)) != 0) || (compareTo2 = Boolean.valueOf(mo25543v()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25543v()))) != 0 || ((mo25543v() && (compareTo2 = C25082a.m62838b(this.rating, mVCarpoolDriver.rating)) != 0) || (compareTo2 = Boolean.valueOf(mo25542u()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25542u()))) != 0 || ((mo25542u() && (compareTo2 = this.profilePhotoUrl.compareTo(mVCarpoolDriver.profilePhotoUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo25534m()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25534m()))) != 0 || ((mo25534m() && (compareTo2 = C25082a.m62839c(this.fbFriendsNum, mVCarpoolDriver.fbFriendsNum)) != 0) || (compareTo2 = Boolean.valueOf(mo25545y()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25545y()))) != 0 || ((mo25545y() && (compareTo2 = this.selfDescription.compareTo(mVCarpoolDriver.selfDescription)) != 0) || (compareTo2 = Boolean.valueOf(mo25544w()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25544w()))) != 0 || ((mo25544w() && (compareTo2 = C25082a.m62840d(this.registrationDate, mVCarpoolDriver.registrationDate)) != 0) || (compareTo2 = Boolean.valueOf(mo25539s()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25539s()))) != 0 || ((mo25539s() && (compareTo2 = C25082a.m62847k(this.numRatings, mVCarpoolDriver.numRatings)) != 0) || (compareTo2 = Boolean.valueOf(mo25538r()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25538r()))) != 0 || ((mo25538r() && (compareTo2 = C25082a.m62847k(this.numFinishedRides, mVCarpoolDriver.numFinishedRides)) != 0) || (compareTo2 = Boolean.valueOf(mo25526f()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25526f()))) != 0 || ((mo25526f() && (compareTo2 = C25082a.m62847k(this.age, mVCarpoolDriver.age)) != 0) || (compareTo2 = Boolean.valueOf(mo25535o()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25535o()))) != 0 || ((mo25535o() && (compareTo2 = this.fbId.compareTo(mVCarpoolDriver.fbId)) != 0) || (compareTo2 = Boolean.valueOf(mo25528h()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25528h()))) != 0 || ((mo25528h() && (compareTo2 = C25082a.m62848l(this.allowMultiplePickupPoints, mVCarpoolDriver.allowMultiplePickupPoints)) != 0) || (compareTo2 = Boolean.valueOf(mo25533l()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25533l()))) != 0 || ((mo25533l() && (compareTo2 = this.driversWorkData.compareTo(mVCarpoolDriver.driversWorkData)) != 0) || (compareTo2 = Boolean.valueOf(mo25527g()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25527g()))) != 0 || ((mo25527g() && (compareTo2 = C25082a.m62848l(this.allowDetour, mVCarpoolDriver.allowDetour)) != 0) || (compareTo2 = Boolean.valueOf(mo25531j()).compareTo(Boolean.valueOf(mVCarpoolDriver.mo25531j()))) != 0)))))))))))))))))) {
            return compareTo2;
        }
        if (!mo25531j() || (compareTo = this.driverConfirmationSettings.compareTo(mVCarpoolDriver.driverConfirmationSettings)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCarpoolDriver)) {
            return mo25523a((MVCarpoolDriver) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25526f() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: g */
    public final boolean mo25527g() {
        return C13637c.m34053H(this.__isset_bitfield, 7);
    }

    /* renamed from: h */
    public final boolean mo25528h() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25530i() {
        return this.car != null;
    }

    /* renamed from: j */
    public final boolean mo25531j() {
        return this.driverConfirmationSettings != null;
    }

    /* renamed from: k */
    public final boolean mo25532k() {
        return this.driverId != null;
    }

    /* renamed from: l */
    public final boolean mo25533l() {
        return this.driversWorkData != null;
    }

    /* renamed from: m */
    public final boolean mo25534m() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: o */
    public final boolean mo25535o() {
        return this.fbId != null;
    }

    /* renamed from: p */
    public final boolean mo25536p() {
        return this.firstName != null;
    }

    /* renamed from: q */
    public final boolean mo25537q() {
        return this.lastName != null;
    }

    /* renamed from: r */
    public final boolean mo25538r() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: s */
    public final boolean mo25539s() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: t */
    public final boolean mo25540t() {
        return this.phoneNumber != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarpoolDriver(", "driverId:");
        String str = this.driverId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("firstName:");
        String str2 = this.firstName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("lastName:");
        String str3 = this.lastName;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("phoneNumber:");
        String str4 = this.phoneNumber;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("car:");
        MVCar mVCar = this.car;
        if (mVCar == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCar);
        }
        n.append(", ");
        n.append("rating:");
        n.append(this.rating);
        if (mo25542u()) {
            n.append(", ");
            n.append("profilePhotoUrl:");
            String str5 = this.profilePhotoUrl;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        if (mo25534m()) {
            n.append(", ");
            n.append("fbFriendsNum:");
            n.append(this.fbFriendsNum);
        }
        if (mo25545y()) {
            n.append(", ");
            n.append("selfDescription:");
            String str6 = this.selfDescription;
            if (str6 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str6);
            }
        }
        n.append(", ");
        n.append("registrationDate:");
        C25541a.m63889t(n, this.registrationDate, ", ", "numRatings:");
        C0016g.m42z(n, this.numRatings, ", ", "numFinishedRides:");
        n.append(this.numFinishedRides);
        if (mo25526f()) {
            n.append(", ");
            n.append("age:");
            n.append(this.age);
        }
        if (mo25535o()) {
            n.append(", ");
            n.append("fbId:");
            String str7 = this.fbId;
            if (str7 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str7);
            }
        }
        if (mo25528h()) {
            n.append(", ");
            n.append("allowMultiplePickupPoints:");
            n.append(this.allowMultiplePickupPoints);
        }
        if (mo25533l()) {
            n.append(", ");
            n.append("driversWorkData:");
            MVCarPoolWorkDetails mVCarPoolWorkDetails = this.driversWorkData;
            if (mVCarPoolWorkDetails == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCarPoolWorkDetails);
            }
        }
        if (mo25527g()) {
            n.append(", ");
            n.append("allowDetour:");
            n.append(this.allowDetour);
        }
        if (mo25531j()) {
            n.append(", ");
            n.append("driverConfirmationSettings:");
            MVDriverConfirmationSettings mVDriverConfirmationSettings = this.driverConfirmationSettings;
            if (mVDriverConfirmationSettings == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVDriverConfirmationSettings);
            }
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo25542u() {
        return this.profilePhotoUrl != null;
    }

    /* renamed from: v */
    public final boolean mo25543v() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: w */
    public final boolean mo25544w() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: y */
    public final boolean mo25545y() {
        return this.selfDescription != null;
    }
}
