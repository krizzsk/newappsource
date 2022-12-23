package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
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

public class MVUserProfileResponse implements TBase<MVUserProfileResponse, _Fields>, Serializable, Cloneable, Comparable<MVUserProfileResponse> {

    /* renamed from: b */
    public static final C25113c f30637b = new C25113c("avatar", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30638c = new C25113c("currentPoints", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30639d = new C25113c("pointsToNextLevel", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f30640e = new C25113c("backgroundImage", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f30641f = new C25113c("userProfile", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f30642g = new C25113c("avatarId", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f30643h = new C25113c("editorData", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f30644i = new C25113c("isRegisteredToCarpool", (byte) 2, 8);

    /* renamed from: j */
    public static final C25113c f30645j = new C25113c("passengerWorkData", (byte) 12, 9);

    /* renamed from: k */
    public static final C25113c f30646k = new C25113c("registeredToRideSharing", (byte) 2, 10);

    /* renamed from: l */
    public static final C25113c f30647l = new C25113c("phoneNumber", (byte) 11, 11);

    /* renamed from: m */
    public static final C25113c f30648m = new C25113c("registeredEmployee", (byte) 2, 12);

    /* renamed from: n */
    public static final C25113c f30649n = new C25113c("registeredToTOD", (byte) 2, 13);

    /* renamed from: o */
    public static final C25113c f30650o = new C25113c("isAcceptedMoovitWondoCobrandLegal", (byte) 2, 14);

    /* renamed from: p */
    public static final C25113c f30651p = new C25113c("adsTargeting", (byte) 12, 15);

    /* renamed from: q */
    public static final HashMap f30652q;

    /* renamed from: r */
    public static final Map<_Fields, FieldMetaData> f30653r;
    private short __isset_bitfield = 0;
    public MVUserProfileAdsTargetingData adsTargeting;
    public int avatar;
    public int avatarId;
    public int backgroundImage;
    public int currentPoints;
    public MVUserProfileEditorData editorData;
    public boolean isAcceptedMoovitWondoCobrandLegal;
    public boolean isRegisteredToCarpool;
    private _Fields[] optionals = {_Fields.BACKGROUND_IMAGE, _Fields.USER_PROFILE, _Fields.AVATAR_ID, _Fields.EDITOR_DATA, _Fields.IS_REGISTERED_TO_CARPOOL, _Fields.PASSENGER_WORK_DATA, _Fields.REGISTERED_TO_RIDE_SHARING, _Fields.PHONE_NUMBER, _Fields.REGISTERED_EMPLOYEE, _Fields.REGISTERED_TO_TOD, _Fields.IS_ACCEPTED_MOOVIT_WONDO_COBRAND_LEGAL, _Fields.ADS_TARGETING};
    public MVCarPoolWorkDetails passengerWorkData;
    public String phoneNumber;
    public int pointsToNextLevel;
    public boolean registeredEmployee;
    public boolean registeredToRideSharing;
    public boolean registeredToTOD;
    public MVUserProfileData userProfile;

    public enum _Fields implements C25085c {
        AVATAR(1, "avatar"),
        CURRENT_POINTS(2, "currentPoints"),
        POINTS_TO_NEXT_LEVEL(3, "pointsToNextLevel"),
        BACKGROUND_IMAGE(4, "backgroundImage"),
        USER_PROFILE(5, "userProfile"),
        AVATAR_ID(6, "avatarId"),
        EDITOR_DATA(7, "editorData"),
        IS_REGISTERED_TO_CARPOOL(8, "isRegisteredToCarpool"),
        PASSENGER_WORK_DATA(9, "passengerWorkData"),
        REGISTERED_TO_RIDE_SHARING(10, "registeredToRideSharing"),
        PHONE_NUMBER(11, "phoneNumber"),
        REGISTERED_EMPLOYEE(12, "registeredEmployee"),
        REGISTERED_TO_TOD(13, "registeredToTOD"),
        IS_ACCEPTED_MOOVIT_WONDO_COBRAND_LEGAL(14, "isAcceptedMoovitWondoCobrandLegal"),
        ADS_TARGETING(15, "adsTargeting");
        
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
                    return AVATAR;
                case 2:
                    return CURRENT_POINTS;
                case 3:
                    return POINTS_TO_NEXT_LEVEL;
                case 4:
                    return BACKGROUND_IMAGE;
                case 5:
                    return USER_PROFILE;
                case 6:
                    return AVATAR_ID;
                case 7:
                    return EDITOR_DATA;
                case 8:
                    return IS_REGISTERED_TO_CARPOOL;
                case 9:
                    return PASSENGER_WORK_DATA;
                case 10:
                    return REGISTERED_TO_RIDE_SHARING;
                case 11:
                    return PHONE_NUMBER;
                case 12:
                    return REGISTERED_EMPLOYEE;
                case 13:
                    return REGISTERED_TO_TOD;
                case 14:
                    return IS_ACCEPTED_MOOVIT_WONDO_COBRAND_LEGAL;
                case 15:
                    return ADS_TARGETING;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserProfileResponse$a */
    public static class C11989a extends C25239c<MVUserProfileResponse> {
        public C11989a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserProfileResponse mVUserProfileResponse = (MVUserProfileResponse) tBase;
            mVUserProfileResponse.mo35538J();
            C25113c cVar = MVUserProfileResponse.f30637b;
            gVar.mo61687K();
            gVar.mo61711x(MVUserProfileResponse.f30637b);
            gVar.mo61678B(mVUserProfileResponse.avatar);
            gVar.mo61712y();
            gVar.mo61711x(MVUserProfileResponse.f30638c);
            gVar.mo61678B(mVUserProfileResponse.currentPoints);
            gVar.mo61712y();
            gVar.mo61711x(MVUserProfileResponse.f30639d);
            gVar.mo61678B(mVUserProfileResponse.pointsToNextLevel);
            gVar.mo61712y();
            if (mVUserProfileResponse.mo35546i()) {
                gVar.mo61711x(MVUserProfileResponse.f30640e);
                gVar.mo61678B(mVUserProfileResponse.backgroundImage);
                gVar.mo61712y();
            }
            if (mVUserProfileResponse.userProfile != null && mVUserProfileResponse.mo35558u()) {
                gVar.mo61711x(MVUserProfileResponse.f30641f);
                mVUserProfileResponse.userProfile.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVUserProfileResponse.mo35544h()) {
                gVar.mo61711x(MVUserProfileResponse.f30642g);
                gVar.mo61678B(mVUserProfileResponse.avatarId);
                gVar.mo61712y();
            }
            if (mVUserProfileResponse.editorData != null && mVUserProfileResponse.mo35548k()) {
                gVar.mo61711x(MVUserProfileResponse.f30643h);
                mVUserProfileResponse.editorData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVUserProfileResponse.mo35550m()) {
                gVar.mo61711x(MVUserProfileResponse.f30644i);
                gVar.mo61708u(mVUserProfileResponse.isRegisteredToCarpool);
                gVar.mo61712y();
            }
            if (mVUserProfileResponse.passengerWorkData != null && mVUserProfileResponse.mo35551o()) {
                gVar.mo61711x(MVUserProfileResponse.f30645j);
                mVUserProfileResponse.passengerWorkData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVUserProfileResponse.mo35555s()) {
                gVar.mo61711x(MVUserProfileResponse.f30646k);
                gVar.mo61708u(mVUserProfileResponse.registeredToRideSharing);
                gVar.mo61712y();
            }
            if (mVUserProfileResponse.phoneNumber != null && mVUserProfileResponse.mo35552p()) {
                gVar.mo61711x(MVUserProfileResponse.f30647l);
                gVar.mo61686J(mVUserProfileResponse.phoneNumber);
                gVar.mo61712y();
            }
            if (mVUserProfileResponse.mo35554r()) {
                gVar.mo61711x(MVUserProfileResponse.f30648m);
                gVar.mo61708u(mVUserProfileResponse.registeredEmployee);
                gVar.mo61712y();
            }
            if (mVUserProfileResponse.mo35556t()) {
                gVar.mo61711x(MVUserProfileResponse.f30649n);
                gVar.mo61708u(mVUserProfileResponse.registeredToTOD);
                gVar.mo61712y();
            }
            if (mVUserProfileResponse.mo35549l()) {
                gVar.mo61711x(MVUserProfileResponse.f30650o);
                gVar.mo61708u(mVUserProfileResponse.isAcceptedMoovitWondoCobrandLegal);
                gVar.mo61712y();
            }
            if (mVUserProfileResponse.adsTargeting != null && mVUserProfileResponse.mo35542f()) {
                gVar.mo61711x(MVUserProfileResponse.f30651p);
                mVUserProfileResponse.adsTargeting.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserProfileResponse mVUserProfileResponse = (MVUserProfileResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUserProfileResponse.mo35538J();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserProfileResponse.avatar = gVar.mo61696i();
                            mVUserProfileResponse.mo35560w();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserProfileResponse.currentPoints = gVar.mo61696i();
                            mVUserProfileResponse.mo35531A();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserProfileResponse.pointsToNextLevel = gVar.mo61696i();
                            mVUserProfileResponse.mo35534F();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserProfileResponse.backgroundImage = gVar.mo61696i();
                            mVUserProfileResponse.mo35561y();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVUserProfileData mVUserProfileData = new MVUserProfileData();
                            mVUserProfileResponse.userProfile = mVUserProfileData;
                            mVUserProfileData.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserProfileResponse.avatarId = gVar.mo61696i();
                            mVUserProfileResponse.mo35559v();
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVUserProfileEditorData mVUserProfileEditorData = new MVUserProfileEditorData();
                            mVUserProfileResponse.editorData = mVUserProfileEditorData;
                            mVUserProfileEditorData.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserProfileResponse.isRegisteredToCarpool = gVar.mo61690c();
                            mVUserProfileResponse.mo35533E();
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCarPoolWorkDetails mVCarPoolWorkDetails = new MVCarPoolWorkDetails();
                            mVUserProfileResponse.passengerWorkData = mVCarPoolWorkDetails;
                            mVCarPoolWorkDetails.mo25201C1(gVar);
                            break;
                        }
                    case 10:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserProfileResponse.registeredToRideSharing = gVar.mo61690c();
                            mVUserProfileResponse.mo35536H();
                            break;
                        }
                    case 11:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserProfileResponse.phoneNumber = gVar.mo61704q();
                            break;
                        }
                    case 12:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserProfileResponse.registeredEmployee = gVar.mo61690c();
                            mVUserProfileResponse.mo35535G();
                            break;
                        }
                    case 13:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserProfileResponse.registeredToTOD = gVar.mo61690c();
                            mVUserProfileResponse.mo35537I();
                            break;
                        }
                    case 14:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserProfileResponse.isAcceptedMoovitWondoCobrandLegal = gVar.mo61690c();
                            mVUserProfileResponse.mo35532D();
                            break;
                        }
                    case 15:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVUserProfileAdsTargetingData mVUserProfileAdsTargetingData = new MVUserProfileAdsTargetingData();
                            mVUserProfileResponse.adsTargeting = mVUserProfileAdsTargetingData;
                            mVUserProfileAdsTargetingData.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserProfileResponse$b */
    public static class C11990b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11989a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserProfileResponse$c */
    public static class C11991c extends C25240d<MVUserProfileResponse> {
        public C11991c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserProfileResponse mVUserProfileResponse = (MVUserProfileResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserProfileResponse.mo35543g()) {
                bitSet.set(0);
            }
            if (mVUserProfileResponse.mo35547j()) {
                bitSet.set(1);
            }
            if (mVUserProfileResponse.mo35553q()) {
                bitSet.set(2);
            }
            if (mVUserProfileResponse.mo35546i()) {
                bitSet.set(3);
            }
            if (mVUserProfileResponse.mo35558u()) {
                bitSet.set(4);
            }
            if (mVUserProfileResponse.mo35544h()) {
                bitSet.set(5);
            }
            if (mVUserProfileResponse.mo35548k()) {
                bitSet.set(6);
            }
            if (mVUserProfileResponse.mo35550m()) {
                bitSet.set(7);
            }
            if (mVUserProfileResponse.mo35551o()) {
                bitSet.set(8);
            }
            if (mVUserProfileResponse.mo35555s()) {
                bitSet.set(9);
            }
            if (mVUserProfileResponse.mo35552p()) {
                bitSet.set(10);
            }
            if (mVUserProfileResponse.mo35554r()) {
                bitSet.set(11);
            }
            if (mVUserProfileResponse.mo35556t()) {
                bitSet.set(12);
            }
            if (mVUserProfileResponse.mo35549l()) {
                bitSet.set(13);
            }
            if (mVUserProfileResponse.mo35542f()) {
                bitSet.set(14);
            }
            jVar.mo61738U(bitSet, 15);
            if (mVUserProfileResponse.mo35543g()) {
                jVar.mo61678B(mVUserProfileResponse.avatar);
            }
            if (mVUserProfileResponse.mo35547j()) {
                jVar.mo61678B(mVUserProfileResponse.currentPoints);
            }
            if (mVUserProfileResponse.mo35553q()) {
                jVar.mo61678B(mVUserProfileResponse.pointsToNextLevel);
            }
            if (mVUserProfileResponse.mo35546i()) {
                jVar.mo61678B(mVUserProfileResponse.backgroundImage);
            }
            if (mVUserProfileResponse.mo35558u()) {
                mVUserProfileResponse.userProfile.mo25202X0(jVar);
            }
            if (mVUserProfileResponse.mo35544h()) {
                jVar.mo61678B(mVUserProfileResponse.avatarId);
            }
            if (mVUserProfileResponse.mo35548k()) {
                mVUserProfileResponse.editorData.mo25202X0(jVar);
            }
            if (mVUserProfileResponse.mo35550m()) {
                jVar.mo61708u(mVUserProfileResponse.isRegisteredToCarpool);
            }
            if (mVUserProfileResponse.mo35551o()) {
                mVUserProfileResponse.passengerWorkData.mo25202X0(jVar);
            }
            if (mVUserProfileResponse.mo35555s()) {
                jVar.mo61708u(mVUserProfileResponse.registeredToRideSharing);
            }
            if (mVUserProfileResponse.mo35552p()) {
                jVar.mo61686J(mVUserProfileResponse.phoneNumber);
            }
            if (mVUserProfileResponse.mo35554r()) {
                jVar.mo61708u(mVUserProfileResponse.registeredEmployee);
            }
            if (mVUserProfileResponse.mo35556t()) {
                jVar.mo61708u(mVUserProfileResponse.registeredToTOD);
            }
            if (mVUserProfileResponse.mo35549l()) {
                jVar.mo61708u(mVUserProfileResponse.isAcceptedMoovitWondoCobrandLegal);
            }
            if (mVUserProfileResponse.mo35542f()) {
                mVUserProfileResponse.adsTargeting.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserProfileResponse mVUserProfileResponse = (MVUserProfileResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(15);
            if (T.get(0)) {
                mVUserProfileResponse.avatar = jVar.mo61696i();
                mVUserProfileResponse.mo35560w();
            }
            if (T.get(1)) {
                mVUserProfileResponse.currentPoints = jVar.mo61696i();
                mVUserProfileResponse.mo35531A();
            }
            if (T.get(2)) {
                mVUserProfileResponse.pointsToNextLevel = jVar.mo61696i();
                mVUserProfileResponse.mo35534F();
            }
            if (T.get(3)) {
                mVUserProfileResponse.backgroundImage = jVar.mo61696i();
                mVUserProfileResponse.mo35561y();
            }
            if (T.get(4)) {
                MVUserProfileData mVUserProfileData = new MVUserProfileData();
                mVUserProfileResponse.userProfile = mVUserProfileData;
                mVUserProfileData.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVUserProfileResponse.avatarId = jVar.mo61696i();
                mVUserProfileResponse.mo35559v();
            }
            if (T.get(6)) {
                MVUserProfileEditorData mVUserProfileEditorData = new MVUserProfileEditorData();
                mVUserProfileResponse.editorData = mVUserProfileEditorData;
                mVUserProfileEditorData.mo25201C1(jVar);
            }
            if (T.get(7)) {
                mVUserProfileResponse.isRegisteredToCarpool = jVar.mo61690c();
                mVUserProfileResponse.mo35533E();
            }
            if (T.get(8)) {
                MVCarPoolWorkDetails mVCarPoolWorkDetails = new MVCarPoolWorkDetails();
                mVUserProfileResponse.passengerWorkData = mVCarPoolWorkDetails;
                mVCarPoolWorkDetails.mo25201C1(jVar);
            }
            if (T.get(9)) {
                mVUserProfileResponse.registeredToRideSharing = jVar.mo61690c();
                mVUserProfileResponse.mo35536H();
            }
            if (T.get(10)) {
                mVUserProfileResponse.phoneNumber = jVar.mo61704q();
            }
            if (T.get(11)) {
                mVUserProfileResponse.registeredEmployee = jVar.mo61690c();
                mVUserProfileResponse.mo35535G();
            }
            if (T.get(12)) {
                mVUserProfileResponse.registeredToTOD = jVar.mo61690c();
                mVUserProfileResponse.mo35537I();
            }
            if (T.get(13)) {
                mVUserProfileResponse.isAcceptedMoovitWondoCobrandLegal = jVar.mo61690c();
                mVUserProfileResponse.mo35532D();
            }
            if (T.get(14)) {
                MVUserProfileAdsTargetingData mVUserProfileAdsTargetingData = new MVUserProfileAdsTargetingData();
                mVUserProfileResponse.adsTargeting = mVUserProfileAdsTargetingData;
                mVUserProfileAdsTargetingData.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserProfileResponse$d */
    public static class C11992d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11991c(0);
        }
    }

    static {
        new C17394d0("MVUserProfileResponse");
        HashMap hashMap = new HashMap();
        f30652q = hashMap;
        hashMap.put(C25239c.class, new C11990b());
        hashMap.put(C25240d.class, new C11992d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.AVATAR, new FieldMetaData("avatar", (byte) 3, new FieldValueMetaData((byte) 8, "MVImageReferenceWithoutParams")));
        enumMap.put(_Fields.CURRENT_POINTS, new FieldMetaData("currentPoints", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.POINTS_TO_NEXT_LEVEL, new FieldMetaData("pointsToNextLevel", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.BACKGROUND_IMAGE, new FieldMetaData("backgroundImage", (byte) 2, new FieldValueMetaData((byte) 8, "MVImageReferenceWithoutParams")));
        enumMap.put(_Fields.USER_PROFILE, new FieldMetaData("userProfile", (byte) 2, new StructMetaData(MVUserProfileData.class)));
        enumMap.put(_Fields.AVATAR_ID, new FieldMetaData("avatarId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.EDITOR_DATA, new FieldMetaData("editorData", (byte) 2, new StructMetaData(MVUserProfileEditorData.class)));
        enumMap.put(_Fields.IS_REGISTERED_TO_CARPOOL, new FieldMetaData("isRegisteredToCarpool", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PASSENGER_WORK_DATA, new FieldMetaData("passengerWorkData", (byte) 2, new StructMetaData(MVCarPoolWorkDetails.class)));
        enumMap.put(_Fields.REGISTERED_TO_RIDE_SHARING, new FieldMetaData("registeredToRideSharing", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PHONE_NUMBER, new FieldMetaData("phoneNumber", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REGISTERED_EMPLOYEE, new FieldMetaData("registeredEmployee", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.REGISTERED_TO_TOD, new FieldMetaData("registeredToTOD", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS_ACCEPTED_MOOVIT_WONDO_COBRAND_LEGAL, new FieldMetaData("isAcceptedMoovitWondoCobrandLegal", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ADS_TARGETING, new FieldMetaData("adsTargeting", (byte) 2, new StructMetaData(MVUserProfileAdsTargetingData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30653r = unmodifiableMap;
        FieldMetaData.m61947a(MVUserProfileResponse.class, unmodifiableMap);
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
    public final void mo35531A() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f30652q.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo35532D() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 9, true);
    }

    /* renamed from: E */
    public final void mo35533E() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: F */
    public final void mo35534F() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: G */
    public final void mo35535G() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 7, true);
    }

    /* renamed from: H */
    public final void mo35536H() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: I */
    public final void mo35537I() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 8, true);
    }

    /* renamed from: J */
    public final void mo35538J() throws TException {
        MVUserProfileData mVUserProfileData = this.userProfile;
        if (mVUserProfileData != null) {
            mVUserProfileData.getClass();
        }
        MVUserProfileEditorData mVUserProfileEditorData = this.editorData;
        if (mVUserProfileEditorData != null) {
            mVUserProfileEditorData.getClass();
        }
        MVCarPoolWorkDetails mVCarPoolWorkDetails = this.passengerWorkData;
        if (mVCarPoolWorkDetails != null) {
            mVCarPoolWorkDetails.getClass();
        }
        MVUserProfileAdsTargetingData mVUserProfileAdsTargetingData = this.adsTargeting;
        if (mVUserProfileAdsTargetingData != null) {
            mVUserProfileAdsTargetingData.getClass();
        }
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30652q.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0090 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo35539a(com.tranzmate.moovit.protocol.users.MVUserProfileResponse r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.avatar
            int r2 = r5.avatar
            if (r1 == r2) goto L_0x000b
            return r0
        L_0x000b:
            int r1 = r4.currentPoints
            int r2 = r5.currentPoints
            if (r1 == r2) goto L_0x0012
            return r0
        L_0x0012:
            int r1 = r4.pointsToNextLevel
            int r2 = r5.pointsToNextLevel
            if (r1 == r2) goto L_0x0019
            return r0
        L_0x0019:
            boolean r1 = r4.mo35546i()
            boolean r2 = r5.mo35546i()
            if (r1 != 0) goto L_0x0025
            if (r2 == 0) goto L_0x0032
        L_0x0025:
            if (r1 == 0) goto L_0x0162
            if (r2 != 0) goto L_0x002b
            goto L_0x0162
        L_0x002b:
            int r1 = r4.backgroundImage
            int r2 = r5.backgroundImage
            if (r1 == r2) goto L_0x0032
            return r0
        L_0x0032:
            boolean r1 = r4.mo35558u()
            boolean r2 = r5.mo35558u()
            if (r1 != 0) goto L_0x003e
            if (r2 == 0) goto L_0x004f
        L_0x003e:
            if (r1 == 0) goto L_0x0162
            if (r2 != 0) goto L_0x0044
            goto L_0x0162
        L_0x0044:
            com.tranzmate.moovit.protocol.users.MVUserProfileData r1 = r4.userProfile
            com.tranzmate.moovit.protocol.users.MVUserProfileData r2 = r5.userProfile
            boolean r1 = r1.mo35513a(r2)
            if (r1 != 0) goto L_0x004f
            return r0
        L_0x004f:
            boolean r1 = r4.mo35544h()
            boolean r2 = r5.mo35544h()
            if (r1 != 0) goto L_0x005b
            if (r2 == 0) goto L_0x0068
        L_0x005b:
            if (r1 == 0) goto L_0x0162
            if (r2 != 0) goto L_0x0061
            goto L_0x0162
        L_0x0061:
            int r1 = r4.avatarId
            int r2 = r5.avatarId
            if (r1 == r2) goto L_0x0068
            return r0
        L_0x0068:
            boolean r1 = r4.mo35548k()
            boolean r2 = r5.mo35548k()
            r3 = 1
            if (r1 != 0) goto L_0x0075
            if (r2 == 0) goto L_0x0091
        L_0x0075:
            if (r1 == 0) goto L_0x0162
            if (r2 != 0) goto L_0x007b
            goto L_0x0162
        L_0x007b:
            com.tranzmate.moovit.protocol.users.MVUserProfileEditorData r1 = r4.editorData
            com.tranzmate.moovit.protocol.users.MVUserProfileEditorData r2 = r5.editorData
            if (r2 != 0) goto L_0x0086
            r1.getClass()
        L_0x0084:
            r1 = 0
            goto L_0x008e
        L_0x0086:
            int r1 = r1.moderationLevel
            int r2 = r2.moderationLevel
            if (r1 == r2) goto L_0x008d
            goto L_0x0084
        L_0x008d:
            r1 = 1
        L_0x008e:
            if (r1 != 0) goto L_0x0091
            return r0
        L_0x0091:
            boolean r1 = r4.mo35550m()
            boolean r2 = r5.mo35550m()
            if (r1 != 0) goto L_0x009d
            if (r2 == 0) goto L_0x00aa
        L_0x009d:
            if (r1 == 0) goto L_0x0162
            if (r2 != 0) goto L_0x00a3
            goto L_0x0162
        L_0x00a3:
            boolean r1 = r4.isRegisteredToCarpool
            boolean r2 = r5.isRegisteredToCarpool
            if (r1 == r2) goto L_0x00aa
            return r0
        L_0x00aa:
            boolean r1 = r4.mo35551o()
            boolean r2 = r5.mo35551o()
            if (r1 != 0) goto L_0x00b6
            if (r2 == 0) goto L_0x00c7
        L_0x00b6:
            if (r1 == 0) goto L_0x0162
            if (r2 != 0) goto L_0x00bc
            goto L_0x0162
        L_0x00bc:
            com.tranzmate.moovit.protocol.common.MVCarPoolWorkDetails r1 = r4.passengerWorkData
            com.tranzmate.moovit.protocol.common.MVCarPoolWorkDetails r2 = r5.passengerWorkData
            boolean r1 = r1.mo26090a(r2)
            if (r1 != 0) goto L_0x00c7
            return r0
        L_0x00c7:
            boolean r1 = r4.mo35555s()
            boolean r2 = r5.mo35555s()
            if (r1 != 0) goto L_0x00d3
            if (r2 == 0) goto L_0x00e0
        L_0x00d3:
            if (r1 == 0) goto L_0x0162
            if (r2 != 0) goto L_0x00d9
            goto L_0x0162
        L_0x00d9:
            boolean r1 = r4.registeredToRideSharing
            boolean r2 = r5.registeredToRideSharing
            if (r1 == r2) goto L_0x00e0
            return r0
        L_0x00e0:
            boolean r1 = r4.mo35552p()
            boolean r2 = r5.mo35552p()
            if (r1 != 0) goto L_0x00ec
            if (r2 == 0) goto L_0x00fd
        L_0x00ec:
            if (r1 == 0) goto L_0x0162
            if (r2 != 0) goto L_0x00f2
            goto L_0x0162
        L_0x00f2:
            java.lang.String r1 = r4.phoneNumber
            java.lang.String r2 = r5.phoneNumber
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00fd
            return r0
        L_0x00fd:
            boolean r1 = r4.mo35554r()
            boolean r2 = r5.mo35554r()
            if (r1 != 0) goto L_0x0109
            if (r2 == 0) goto L_0x0115
        L_0x0109:
            if (r1 == 0) goto L_0x0162
            if (r2 != 0) goto L_0x010e
            goto L_0x0162
        L_0x010e:
            boolean r1 = r4.registeredEmployee
            boolean r2 = r5.registeredEmployee
            if (r1 == r2) goto L_0x0115
            return r0
        L_0x0115:
            boolean r1 = r4.mo35556t()
            boolean r2 = r5.mo35556t()
            if (r1 != 0) goto L_0x0121
            if (r2 == 0) goto L_0x012d
        L_0x0121:
            if (r1 == 0) goto L_0x0162
            if (r2 != 0) goto L_0x0126
            goto L_0x0162
        L_0x0126:
            boolean r1 = r4.registeredToTOD
            boolean r2 = r5.registeredToTOD
            if (r1 == r2) goto L_0x012d
            return r0
        L_0x012d:
            boolean r1 = r4.mo35549l()
            boolean r2 = r5.mo35549l()
            if (r1 != 0) goto L_0x0139
            if (r2 == 0) goto L_0x0145
        L_0x0139:
            if (r1 == 0) goto L_0x0162
            if (r2 != 0) goto L_0x013e
            goto L_0x0162
        L_0x013e:
            boolean r1 = r4.isAcceptedMoovitWondoCobrandLegal
            boolean r2 = r5.isAcceptedMoovitWondoCobrandLegal
            if (r1 == r2) goto L_0x0145
            return r0
        L_0x0145:
            boolean r1 = r4.mo35542f()
            boolean r2 = r5.mo35542f()
            if (r1 != 0) goto L_0x0151
            if (r2 == 0) goto L_0x0161
        L_0x0151:
            if (r1 == 0) goto L_0x0162
            if (r2 != 0) goto L_0x0156
            goto L_0x0162
        L_0x0156:
            com.tranzmate.moovit.protocol.users.MVUserProfileAdsTargetingData r1 = r4.adsTargeting
            com.tranzmate.moovit.protocol.users.MVUserProfileAdsTargetingData r5 = r5.adsTargeting
            boolean r5 = r1.mo35506a(r5)
            if (r5 != 0) goto L_0x0161
            return r0
        L_0x0161:
            return r3
        L_0x0162:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.users.MVUserProfileResponse.mo35539a(com.tranzmate.moovit.protocol.users.MVUserProfileResponse):boolean");
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUserProfileResponse mVUserProfileResponse = (MVUserProfileResponse) obj;
        if (!getClass().equals(mVUserProfileResponse.getClass())) {
            return getClass().getName().compareTo(mVUserProfileResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35543g()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35543g()));
        if (compareTo2 != 0 || ((mo35543g() && (compareTo2 = C25082a.m62839c(this.avatar, mVUserProfileResponse.avatar)) != 0) || (compareTo2 = Boolean.valueOf(mo35547j()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35547j()))) != 0 || ((mo35547j() && (compareTo2 = C25082a.m62839c(this.currentPoints, mVUserProfileResponse.currentPoints)) != 0) || (compareTo2 = Boolean.valueOf(mo35553q()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35553q()))) != 0 || ((mo35553q() && (compareTo2 = C25082a.m62839c(this.pointsToNextLevel, mVUserProfileResponse.pointsToNextLevel)) != 0) || (compareTo2 = Boolean.valueOf(mo35546i()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35546i()))) != 0 || ((mo35546i() && (compareTo2 = C25082a.m62839c(this.backgroundImage, mVUserProfileResponse.backgroundImage)) != 0) || (compareTo2 = Boolean.valueOf(mo35558u()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35558u()))) != 0 || ((mo35558u() && (compareTo2 = this.userProfile.compareTo(mVUserProfileResponse.userProfile)) != 0) || (compareTo2 = Boolean.valueOf(mo35544h()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35544h()))) != 0 || ((mo35544h() && (compareTo2 = C25082a.m62839c(this.avatarId, mVUserProfileResponse.avatarId)) != 0) || (compareTo2 = Boolean.valueOf(mo35548k()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35548k()))) != 0 || ((mo35548k() && (compareTo2 = this.editorData.compareTo(mVUserProfileResponse.editorData)) != 0) || (compareTo2 = Boolean.valueOf(mo35550m()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35550m()))) != 0 || ((mo35550m() && (compareTo2 = C25082a.m62848l(this.isRegisteredToCarpool, mVUserProfileResponse.isRegisteredToCarpool)) != 0) || (compareTo2 = Boolean.valueOf(mo35551o()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35551o()))) != 0 || ((mo35551o() && (compareTo2 = this.passengerWorkData.compareTo(mVUserProfileResponse.passengerWorkData)) != 0) || (compareTo2 = Boolean.valueOf(mo35555s()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35555s()))) != 0 || ((mo35555s() && (compareTo2 = C25082a.m62848l(this.registeredToRideSharing, mVUserProfileResponse.registeredToRideSharing)) != 0) || (compareTo2 = Boolean.valueOf(mo35552p()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35552p()))) != 0 || ((mo35552p() && (compareTo2 = this.phoneNumber.compareTo(mVUserProfileResponse.phoneNumber)) != 0) || (compareTo2 = Boolean.valueOf(mo35554r()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35554r()))) != 0 || ((mo35554r() && (compareTo2 = C25082a.m62848l(this.registeredEmployee, mVUserProfileResponse.registeredEmployee)) != 0) || (compareTo2 = Boolean.valueOf(mo35556t()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35556t()))) != 0 || ((mo35556t() && (compareTo2 = C25082a.m62848l(this.registeredToTOD, mVUserProfileResponse.registeredToTOD)) != 0) || (compareTo2 = Boolean.valueOf(mo35549l()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35549l()))) != 0 || ((mo35549l() && (compareTo2 = C25082a.m62848l(this.isAcceptedMoovitWondoCobrandLegal, mVUserProfileResponse.isAcceptedMoovitWondoCobrandLegal)) != 0) || (compareTo2 = Boolean.valueOf(mo35542f()).compareTo(Boolean.valueOf(mVUserProfileResponse.mo35542f()))) != 0))))))))))))))) {
            return compareTo2;
        }
        if (!mo35542f() || (compareTo = this.adsTargeting.compareTo(mVUserProfileResponse.adsTargeting)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVUserProfileResponse)) {
            return mo35539a((MVUserProfileResponse) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35542f() {
        return this.adsTargeting != null;
    }

    /* renamed from: g */
    public final boolean mo35543g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo35544h() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35546i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: j */
    public final boolean mo35547j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final boolean mo35548k() {
        return this.editorData != null;
    }

    /* renamed from: l */
    public final boolean mo35549l() {
        return C13637c.m34053H(this.__isset_bitfield, 9);
    }

    /* renamed from: m */
    public final boolean mo35550m() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: o */
    public final boolean mo35551o() {
        return this.passengerWorkData != null;
    }

    /* renamed from: p */
    public final boolean mo35552p() {
        return this.phoneNumber != null;
    }

    /* renamed from: q */
    public final boolean mo35553q() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: r */
    public final boolean mo35554r() {
        return C13637c.m34053H(this.__isset_bitfield, 7);
    }

    /* renamed from: s */
    public final boolean mo35555s() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: t */
    public final boolean mo35556t() {
        return C13637c.m34053H(this.__isset_bitfield, 8);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUserProfileResponse(", "avatar:");
        C0016g.m42z(n, this.avatar, ", ", "currentPoints:");
        C0016g.m42z(n, this.currentPoints, ", ", "pointsToNextLevel:");
        n.append(this.pointsToNextLevel);
        if (mo35546i()) {
            n.append(", ");
            n.append("backgroundImage:");
            n.append(this.backgroundImage);
        }
        if (mo35558u()) {
            n.append(", ");
            n.append("userProfile:");
            MVUserProfileData mVUserProfileData = this.userProfile;
            if (mVUserProfileData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVUserProfileData);
            }
        }
        if (mo35544h()) {
            n.append(", ");
            n.append("avatarId:");
            n.append(this.avatarId);
        }
        if (mo35548k()) {
            n.append(", ");
            n.append("editorData:");
            MVUserProfileEditorData mVUserProfileEditorData = this.editorData;
            if (mVUserProfileEditorData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVUserProfileEditorData);
            }
        }
        if (mo35550m()) {
            n.append(", ");
            n.append("isRegisteredToCarpool:");
            n.append(this.isRegisteredToCarpool);
        }
        if (mo35551o()) {
            n.append(", ");
            n.append("passengerWorkData:");
            MVCarPoolWorkDetails mVCarPoolWorkDetails = this.passengerWorkData;
            if (mVCarPoolWorkDetails == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCarPoolWorkDetails);
            }
        }
        if (mo35555s()) {
            n.append(", ");
            n.append("registeredToRideSharing:");
            n.append(this.registeredToRideSharing);
        }
        if (mo35552p()) {
            n.append(", ");
            n.append("phoneNumber:");
            String str = this.phoneNumber;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo35554r()) {
            n.append(", ");
            n.append("registeredEmployee:");
            n.append(this.registeredEmployee);
        }
        if (mo35556t()) {
            n.append(", ");
            n.append("registeredToTOD:");
            n.append(this.registeredToTOD);
        }
        if (mo35549l()) {
            n.append(", ");
            n.append("isAcceptedMoovitWondoCobrandLegal:");
            n.append(this.isAcceptedMoovitWondoCobrandLegal);
        }
        if (mo35542f()) {
            n.append(", ");
            n.append("adsTargeting:");
            MVUserProfileAdsTargetingData mVUserProfileAdsTargetingData = this.adsTargeting;
            if (mVUserProfileAdsTargetingData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVUserProfileAdsTargetingData);
            }
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo35558u() {
        return this.userProfile != null;
    }

    /* renamed from: v */
    public final void mo35559v() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: w */
    public final void mo35560w() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: y */
    public final void mo35561y() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }
}
