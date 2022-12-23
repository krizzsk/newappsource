package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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

public class MVCreateUserRequest implements TBase<MVCreateUserRequest, _Fields>, Serializable, Cloneable, Comparable<MVCreateUserRequest> {

    /* renamed from: b */
    public static final C25113c f30367b = new C25113c("userLocation", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f30368c = new C25113c("selectedMetroAreaId", (byte) 6, 2);

    /* renamed from: d */
    public static final C25113c f30369d = new C25113c("locale", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f30370e = new C25113c("deviceName", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f30371f = new C25113c("osVersion", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f30372g = new C25113c("phoneOsType", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f30373h = new C25113c("downloadProviderKey", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f30374i = new C25113c("advertisingId", (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f30375j = new C25113c("appsflyerId", (byte) 11, 9);

    /* renamed from: k */
    public static final C25113c f30376k = new C25113c("limitAdTrackingEnabled", (byte) 2, 10);

    /* renamed from: l */
    public static final C25113c f30377l = new C25113c("screenResolution", (byte) 8, 11);

    /* renamed from: m */
    public static final C25113c f30378m = new C25113c("requestTime", (byte) 10, 12);

    /* renamed from: n */
    public static final C25113c f30379n = new C25113c("userType", (byte) 8, 13);

    /* renamed from: o */
    public static final C25113c f30380o = new C25113c("authType", (byte) 8, 14);

    /* renamed from: p */
    public static final C25113c f30381p = new C25113c("uniqueId", (byte) 11, 15);

    /* renamed from: q */
    public static final C25113c f30382q = new C25113c("externalApiKey", (byte) 11, 16);

    /* renamed from: r */
    public static final C25113c f30383r = new C25113c("thirdPartyLicenceKey", (byte) 11, 17);

    /* renamed from: s */
    public static final C25113c f30384s = new C25113c("previousUserKey", (byte) 11, 18);

    /* renamed from: t */
    public static final C25113c f30385t = new C25113c("installationId", (byte) 11, 19);

    /* renamed from: u */
    public static final HashMap f30386u;

    /* renamed from: v */
    public static final Map<_Fields, FieldMetaData> f30387v;
    private byte __isset_bitfield = 0;
    public String advertisingId;
    public String appsflyerId;
    public MVAuthTokenType authType;
    public String deviceName;
    public MVDownloadProviderKey downloadProviderKey;
    public String externalApiKey;
    public String installationId;
    public boolean limitAdTrackingEnabled;
    public MVLocale locale;
    private _Fields[] optionals = {_Fields.USER_LOCATION, _Fields.SELECTED_METRO_AREA_ID, _Fields.REQUEST_TIME, _Fields.USER_TYPE, _Fields.AUTH_TYPE, _Fields.UNIQUE_ID, _Fields.EXTERNAL_API_KEY, _Fields.THIRD_PARTY_LICENCE_KEY, _Fields.PREVIOUS_USER_KEY, _Fields.INSTALLATION_ID};
    public String osVersion;
    public MVPhoneOsTypes phoneOsType;
    public String previousUserKey;
    public long requestTime;
    public MVClientResolution screenResolution;
    public short selectedMetroAreaId;
    public String thirdPartyLicenceKey;
    public String uniqueId;
    public MVLatLon userLocation;
    public MVUserType userType;

    public enum _Fields implements C25085c {
        USER_LOCATION(1, "userLocation"),
        SELECTED_METRO_AREA_ID(2, "selectedMetroAreaId"),
        LOCALE(3, "locale"),
        DEVICE_NAME(4, "deviceName"),
        OS_VERSION(5, "osVersion"),
        PHONE_OS_TYPE(6, "phoneOsType"),
        DOWNLOAD_PROVIDER_KEY(7, "downloadProviderKey"),
        ADVERTISING_ID(8, "advertisingId"),
        APPSFLYER_ID(9, "appsflyerId"),
        LIMIT_AD_TRACKING_ENABLED(10, "limitAdTrackingEnabled"),
        SCREEN_RESOLUTION(11, "screenResolution"),
        REQUEST_TIME(12, "requestTime"),
        USER_TYPE(13, "userType"),
        AUTH_TYPE(14, "authType"),
        UNIQUE_ID(15, "uniqueId"),
        EXTERNAL_API_KEY(16, "externalApiKey"),
        THIRD_PARTY_LICENCE_KEY(17, "thirdPartyLicenceKey"),
        PREVIOUS_USER_KEY(18, "previousUserKey"),
        INSTALLATION_ID(19, "installationId");
        
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
                    return USER_LOCATION;
                case 2:
                    return SELECTED_METRO_AREA_ID;
                case 3:
                    return LOCALE;
                case 4:
                    return DEVICE_NAME;
                case 5:
                    return OS_VERSION;
                case 6:
                    return PHONE_OS_TYPE;
                case 7:
                    return DOWNLOAD_PROVIDER_KEY;
                case 8:
                    return ADVERTISING_ID;
                case 9:
                    return APPSFLYER_ID;
                case 10:
                    return LIMIT_AD_TRACKING_ENABLED;
                case 11:
                    return SCREEN_RESOLUTION;
                case 12:
                    return REQUEST_TIME;
                case 13:
                    return USER_TYPE;
                case 14:
                    return AUTH_TYPE;
                case 15:
                    return UNIQUE_ID;
                case 16:
                    return EXTERNAL_API_KEY;
                case 17:
                    return THIRD_PARTY_LICENCE_KEY;
                case 18:
                    return PREVIOUS_USER_KEY;
                case 19:
                    return INSTALLATION_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCreateUserRequest$a */
    public static class C11791a extends C25239c<MVCreateUserRequest> {
        public C11791a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreateUserRequest mVCreateUserRequest = (MVCreateUserRequest) tBase;
            MVLatLon mVLatLon = mVCreateUserRequest.userLocation;
            C25113c cVar = MVCreateUserRequest.f30367b;
            gVar.mo61687K();
            if (mVCreateUserRequest.userLocation != null && mVCreateUserRequest.mo35092y()) {
                gVar.mo61711x(MVCreateUserRequest.f30367b);
                mVCreateUserRequest.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.mo35089u()) {
                gVar.mo61711x(MVCreateUserRequest.f30368c);
                gVar.mo61677A(mVCreateUserRequest.selectedMetroAreaId);
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.locale != null) {
                gVar.mo61711x(MVCreateUserRequest.f30369d);
                mVCreateUserRequest.locale.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.deviceName != null) {
                gVar.mo61711x(MVCreateUserRequest.f30370e);
                gVar.mo61686J(mVCreateUserRequest.deviceName);
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.osVersion != null) {
                gVar.mo61711x(MVCreateUserRequest.f30371f);
                gVar.mo61686J(mVCreateUserRequest.osVersion);
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.phoneOsType != null) {
                gVar.mo61711x(MVCreateUserRequest.f30372g);
                gVar.mo61678B(mVCreateUserRequest.phoneOsType.getValue());
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.downloadProviderKey != null) {
                gVar.mo61711x(MVCreateUserRequest.f30373h);
                mVCreateUserRequest.downloadProviderKey.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.advertisingId != null) {
                gVar.mo61711x(MVCreateUserRequest.f30374i);
                gVar.mo61686J(mVCreateUserRequest.advertisingId);
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.appsflyerId != null) {
                gVar.mo61711x(MVCreateUserRequest.f30375j);
                gVar.mo61686J(mVCreateUserRequest.appsflyerId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCreateUserRequest.f30376k);
            gVar.mo61708u(mVCreateUserRequest.limitAdTrackingEnabled);
            gVar.mo61712y();
            if (mVCreateUserRequest.screenResolution != null) {
                gVar.mo61711x(MVCreateUserRequest.f30377l);
                gVar.mo61678B(mVCreateUserRequest.screenResolution.getValue());
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.mo35086s()) {
                gVar.mo61711x(MVCreateUserRequest.f30378m);
                gVar.mo61679C(mVCreateUserRequest.requestTime);
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.userType != null && mVCreateUserRequest.mo35067A()) {
                gVar.mo61711x(MVCreateUserRequest.f30379n);
                gVar.mo61678B(mVCreateUserRequest.userType.getValue());
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.authType != null && mVCreateUserRequest.mo35075h()) {
                gVar.mo61711x(MVCreateUserRequest.f30380o);
                gVar.mo61678B(mVCreateUserRequest.authType.getValue());
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.uniqueId != null && mVCreateUserRequest.mo35091w()) {
                gVar.mo61711x(MVCreateUserRequest.f30381p);
                gVar.mo61686J(mVCreateUserRequest.uniqueId);
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.externalApiKey != null && mVCreateUserRequest.mo35079k()) {
                gVar.mo61711x(MVCreateUserRequest.f30382q);
                gVar.mo61686J(mVCreateUserRequest.externalApiKey);
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.thirdPartyLicenceKey != null && mVCreateUserRequest.mo35090v()) {
                gVar.mo61711x(MVCreateUserRequest.f30383r);
                gVar.mo61686J(mVCreateUserRequest.thirdPartyLicenceKey);
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.previousUserKey != null && mVCreateUserRequest.mo35085r()) {
                gVar.mo61711x(MVCreateUserRequest.f30384s);
                gVar.mo61686J(mVCreateUserRequest.previousUserKey);
                gVar.mo61712y();
            }
            if (mVCreateUserRequest.installationId != null && mVCreateUserRequest.mo35080l()) {
                gVar.mo61711x(MVCreateUserRequest.f30385t);
                gVar.mo61686J(mVCreateUserRequest.installationId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreateUserRequest mVCreateUserRequest = (MVCreateUserRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVCreateUserRequest.userLocation;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVCreateUserRequest.userLocation = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 6) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.selectedMetroAreaId = gVar.mo61695h();
                            mVCreateUserRequest.mo35070F();
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocale mVLocale = new MVLocale();
                            mVCreateUserRequest.locale = mVLocale;
                            mVLocale.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.deviceName = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.osVersion = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.phoneOsType = MVPhoneOsTypes.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVDownloadProviderKey mVDownloadProviderKey = new MVDownloadProviderKey();
                            mVCreateUserRequest.downloadProviderKey = mVDownloadProviderKey;
                            mVDownloadProviderKey.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.advertisingId = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.appsflyerId = gVar.mo61704q();
                            break;
                        }
                    case 10:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.limitAdTrackingEnabled = gVar.mo61690c();
                            mVCreateUserRequest.mo35068D();
                            break;
                        }
                    case 11:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.screenResolution = MVClientResolution.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 12:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.requestTime = gVar.mo61697j();
                            mVCreateUserRequest.mo35069E();
                            break;
                        }
                    case 13:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.userType = MVUserType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 14:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.authType = MVAuthTokenType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 15:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.uniqueId = gVar.mo61704q();
                            break;
                        }
                    case 16:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.externalApiKey = gVar.mo61704q();
                            break;
                        }
                    case 17:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.thirdPartyLicenceKey = gVar.mo61704q();
                            break;
                        }
                    case 18:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.previousUserKey = gVar.mo61704q();
                            break;
                        }
                    case 19:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUserRequest.installationId = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCreateUserRequest$b */
    public static class C11792b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11791a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCreateUserRequest$c */
    public static class C11793c extends C25240d<MVCreateUserRequest> {
        public C11793c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreateUserRequest mVCreateUserRequest = (MVCreateUserRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCreateUserRequest.mo35092y()) {
                bitSet.set(0);
            }
            if (mVCreateUserRequest.mo35089u()) {
                bitSet.set(1);
            }
            if (mVCreateUserRequest.mo35082o()) {
                bitSet.set(2);
            }
            if (mVCreateUserRequest.mo35077i()) {
                bitSet.set(3);
            }
            if (mVCreateUserRequest.mo35083p()) {
                bitSet.set(4);
            }
            if (mVCreateUserRequest.mo35084q()) {
                bitSet.set(5);
            }
            if (mVCreateUserRequest.mo35078j()) {
                bitSet.set(6);
            }
            if (mVCreateUserRequest.mo35073f()) {
                bitSet.set(7);
            }
            if (mVCreateUserRequest.mo35074g()) {
                bitSet.set(8);
            }
            if (mVCreateUserRequest.mo35081m()) {
                bitSet.set(9);
            }
            if (mVCreateUserRequest.mo35087t()) {
                bitSet.set(10);
            }
            if (mVCreateUserRequest.mo35086s()) {
                bitSet.set(11);
            }
            if (mVCreateUserRequest.mo35067A()) {
                bitSet.set(12);
            }
            if (mVCreateUserRequest.mo35075h()) {
                bitSet.set(13);
            }
            if (mVCreateUserRequest.mo35091w()) {
                bitSet.set(14);
            }
            if (mVCreateUserRequest.mo35079k()) {
                bitSet.set(15);
            }
            if (mVCreateUserRequest.mo35090v()) {
                bitSet.set(16);
            }
            if (mVCreateUserRequest.mo35085r()) {
                bitSet.set(17);
            }
            if (mVCreateUserRequest.mo35080l()) {
                bitSet.set(18);
            }
            jVar.mo61738U(bitSet, 19);
            if (mVCreateUserRequest.mo35092y()) {
                mVCreateUserRequest.userLocation.mo25202X0(jVar);
            }
            if (mVCreateUserRequest.mo35089u()) {
                jVar.mo61677A(mVCreateUserRequest.selectedMetroAreaId);
            }
            if (mVCreateUserRequest.mo35082o()) {
                mVCreateUserRequest.locale.mo25202X0(jVar);
            }
            if (mVCreateUserRequest.mo35077i()) {
                jVar.mo61686J(mVCreateUserRequest.deviceName);
            }
            if (mVCreateUserRequest.mo35083p()) {
                jVar.mo61686J(mVCreateUserRequest.osVersion);
            }
            if (mVCreateUserRequest.mo35084q()) {
                jVar.mo61678B(mVCreateUserRequest.phoneOsType.getValue());
            }
            if (mVCreateUserRequest.mo35078j()) {
                mVCreateUserRequest.downloadProviderKey.mo25202X0(jVar);
            }
            if (mVCreateUserRequest.mo35073f()) {
                jVar.mo61686J(mVCreateUserRequest.advertisingId);
            }
            if (mVCreateUserRequest.mo35074g()) {
                jVar.mo61686J(mVCreateUserRequest.appsflyerId);
            }
            if (mVCreateUserRequest.mo35081m()) {
                jVar.mo61708u(mVCreateUserRequest.limitAdTrackingEnabled);
            }
            if (mVCreateUserRequest.mo35087t()) {
                jVar.mo61678B(mVCreateUserRequest.screenResolution.getValue());
            }
            if (mVCreateUserRequest.mo35086s()) {
                jVar.mo61679C(mVCreateUserRequest.requestTime);
            }
            if (mVCreateUserRequest.mo35067A()) {
                jVar.mo61678B(mVCreateUserRequest.userType.getValue());
            }
            if (mVCreateUserRequest.mo35075h()) {
                jVar.mo61678B(mVCreateUserRequest.authType.getValue());
            }
            if (mVCreateUserRequest.mo35091w()) {
                jVar.mo61686J(mVCreateUserRequest.uniqueId);
            }
            if (mVCreateUserRequest.mo35079k()) {
                jVar.mo61686J(mVCreateUserRequest.externalApiKey);
            }
            if (mVCreateUserRequest.mo35090v()) {
                jVar.mo61686J(mVCreateUserRequest.thirdPartyLicenceKey);
            }
            if (mVCreateUserRequest.mo35085r()) {
                jVar.mo61686J(mVCreateUserRequest.previousUserKey);
            }
            if (mVCreateUserRequest.mo35080l()) {
                jVar.mo61686J(mVCreateUserRequest.installationId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreateUserRequest mVCreateUserRequest = (MVCreateUserRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(19);
            if (T.get(0)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVCreateUserRequest.userLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVCreateUserRequest.selectedMetroAreaId = jVar.mo61695h();
                mVCreateUserRequest.mo35070F();
            }
            if (T.get(2)) {
                MVLocale mVLocale = new MVLocale();
                mVCreateUserRequest.locale = mVLocale;
                mVLocale.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVCreateUserRequest.deviceName = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVCreateUserRequest.osVersion = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVCreateUserRequest.phoneOsType = MVPhoneOsTypes.findByValue(jVar.mo61696i());
            }
            if (T.get(6)) {
                MVDownloadProviderKey mVDownloadProviderKey = new MVDownloadProviderKey();
                mVCreateUserRequest.downloadProviderKey = mVDownloadProviderKey;
                mVDownloadProviderKey.mo25201C1(jVar);
            }
            if (T.get(7)) {
                mVCreateUserRequest.advertisingId = jVar.mo61704q();
            }
            if (T.get(8)) {
                mVCreateUserRequest.appsflyerId = jVar.mo61704q();
            }
            if (T.get(9)) {
                mVCreateUserRequest.limitAdTrackingEnabled = jVar.mo61690c();
                mVCreateUserRequest.mo35068D();
            }
            if (T.get(10)) {
                mVCreateUserRequest.screenResolution = MVClientResolution.findByValue(jVar.mo61696i());
            }
            if (T.get(11)) {
                mVCreateUserRequest.requestTime = jVar.mo61697j();
                mVCreateUserRequest.mo35069E();
            }
            if (T.get(12)) {
                mVCreateUserRequest.userType = MVUserType.findByValue(jVar.mo61696i());
            }
            if (T.get(13)) {
                mVCreateUserRequest.authType = MVAuthTokenType.findByValue(jVar.mo61696i());
            }
            if (T.get(14)) {
                mVCreateUserRequest.uniqueId = jVar.mo61704q();
            }
            if (T.get(15)) {
                mVCreateUserRequest.externalApiKey = jVar.mo61704q();
            }
            if (T.get(16)) {
                mVCreateUserRequest.thirdPartyLicenceKey = jVar.mo61704q();
            }
            if (T.get(17)) {
                mVCreateUserRequest.previousUserKey = jVar.mo61704q();
            }
            if (T.get(18)) {
                mVCreateUserRequest.installationId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCreateUserRequest$d */
    public static class C11794d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11793c(0);
        }
    }

    static {
        new C17394d0("MVCreateUserRequest");
        HashMap hashMap = new HashMap();
        f30386u = hashMap;
        hashMap.put(C25239c.class, new C11792b());
        hashMap.put(C25240d.class, new C11794d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.SELECTED_METRO_AREA_ID, new FieldMetaData("selectedMetroAreaId", (byte) 2, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.LOCALE, new FieldMetaData("locale", (byte) 3, new StructMetaData(MVLocale.class)));
        enumMap.put(_Fields.DEVICE_NAME, new FieldMetaData("deviceName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.OS_VERSION, new FieldMetaData("osVersion", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PHONE_OS_TYPE, new FieldMetaData("phoneOsType", (byte) 3, new EnumMetaData(MVPhoneOsTypes.class)));
        enumMap.put(_Fields.DOWNLOAD_PROVIDER_KEY, new FieldMetaData("downloadProviderKey", (byte) 3, new StructMetaData(MVDownloadProviderKey.class)));
        enumMap.put(_Fields.ADVERTISING_ID, new FieldMetaData("advertisingId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.APPSFLYER_ID, new FieldMetaData("appsflyerId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LIMIT_AD_TRACKING_ENABLED, new FieldMetaData("limitAdTrackingEnabled", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SCREEN_RESOLUTION, new FieldMetaData("screenResolution", (byte) 3, new EnumMetaData(MVClientResolution.class)));
        enumMap.put(_Fields.REQUEST_TIME, new FieldMetaData("requestTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.USER_TYPE, new FieldMetaData("userType", (byte) 2, new EnumMetaData(MVUserType.class)));
        enumMap.put(_Fields.AUTH_TYPE, new FieldMetaData("authType", (byte) 2, new EnumMetaData(MVAuthTokenType.class)));
        enumMap.put(_Fields.UNIQUE_ID, new FieldMetaData("uniqueId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.EXTERNAL_API_KEY, new FieldMetaData("externalApiKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.THIRD_PARTY_LICENCE_KEY, new FieldMetaData("thirdPartyLicenceKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PREVIOUS_USER_KEY, new FieldMetaData("previousUserKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INSTALLATION_ID, new FieldMetaData("installationId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30387v = unmodifiableMap;
        FieldMetaData.m61947a(MVCreateUserRequest.class, unmodifiableMap);
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
    public final boolean mo35067A() {
        return this.userType != null;
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f30386u.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo35068D() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: E */
    public final void mo35069E() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: F */
    public final void mo35070F() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30386u.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCreateUserRequest mVCreateUserRequest = (MVCreateUserRequest) obj;
        if (!getClass().equals(mVCreateUserRequest.getClass())) {
            return getClass().getName().compareTo(mVCreateUserRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35092y()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35092y()));
        if (compareTo2 != 0 || ((mo35092y() && (compareTo2 = this.userLocation.compareTo(mVCreateUserRequest.userLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo35089u()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35089u()))) != 0 || ((mo35089u() && (compareTo2 = C25082a.m62847k(this.selectedMetroAreaId, mVCreateUserRequest.selectedMetroAreaId)) != 0) || (compareTo2 = Boolean.valueOf(mo35082o()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35082o()))) != 0 || ((mo35082o() && (compareTo2 = this.locale.compareTo(mVCreateUserRequest.locale)) != 0) || (compareTo2 = Boolean.valueOf(mo35077i()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35077i()))) != 0 || ((mo35077i() && (compareTo2 = this.deviceName.compareTo(mVCreateUserRequest.deviceName)) != 0) || (compareTo2 = Boolean.valueOf(mo35083p()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35083p()))) != 0 || ((mo35083p() && (compareTo2 = this.osVersion.compareTo(mVCreateUserRequest.osVersion)) != 0) || (compareTo2 = Boolean.valueOf(mo35084q()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35084q()))) != 0 || ((mo35084q() && (compareTo2 = this.phoneOsType.compareTo(mVCreateUserRequest.phoneOsType)) != 0) || (compareTo2 = Boolean.valueOf(mo35078j()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35078j()))) != 0 || ((mo35078j() && (compareTo2 = this.downloadProviderKey.compareTo(mVCreateUserRequest.downloadProviderKey)) != 0) || (compareTo2 = Boolean.valueOf(mo35073f()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35073f()))) != 0 || ((mo35073f() && (compareTo2 = this.advertisingId.compareTo(mVCreateUserRequest.advertisingId)) != 0) || (compareTo2 = Boolean.valueOf(mo35074g()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35074g()))) != 0 || ((mo35074g() && (compareTo2 = this.appsflyerId.compareTo(mVCreateUserRequest.appsflyerId)) != 0) || (compareTo2 = Boolean.valueOf(mo35081m()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35081m()))) != 0 || ((mo35081m() && (compareTo2 = C25082a.m62848l(this.limitAdTrackingEnabled, mVCreateUserRequest.limitAdTrackingEnabled)) != 0) || (compareTo2 = Boolean.valueOf(mo35087t()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35087t()))) != 0 || ((mo35087t() && (compareTo2 = this.screenResolution.compareTo(mVCreateUserRequest.screenResolution)) != 0) || (compareTo2 = Boolean.valueOf(mo35086s()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35086s()))) != 0 || ((mo35086s() && (compareTo2 = C25082a.m62840d(this.requestTime, mVCreateUserRequest.requestTime)) != 0) || (compareTo2 = Boolean.valueOf(mo35067A()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35067A()))) != 0 || ((mo35067A() && (compareTo2 = this.userType.compareTo(mVCreateUserRequest.userType)) != 0) || (compareTo2 = Boolean.valueOf(mo35075h()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35075h()))) != 0 || ((mo35075h() && (compareTo2 = this.authType.compareTo(mVCreateUserRequest.authType)) != 0) || (compareTo2 = Boolean.valueOf(mo35091w()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35091w()))) != 0 || ((mo35091w() && (compareTo2 = this.uniqueId.compareTo(mVCreateUserRequest.uniqueId)) != 0) || (compareTo2 = Boolean.valueOf(mo35079k()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35079k()))) != 0 || ((mo35079k() && (compareTo2 = this.externalApiKey.compareTo(mVCreateUserRequest.externalApiKey)) != 0) || (compareTo2 = Boolean.valueOf(mo35090v()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35090v()))) != 0 || ((mo35090v() && (compareTo2 = this.thirdPartyLicenceKey.compareTo(mVCreateUserRequest.thirdPartyLicenceKey)) != 0) || (compareTo2 = Boolean.valueOf(mo35085r()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35085r()))) != 0 || ((mo35085r() && (compareTo2 = this.previousUserKey.compareTo(mVCreateUserRequest.previousUserKey)) != 0) || (compareTo2 = Boolean.valueOf(mo35080l()).compareTo(Boolean.valueOf(mVCreateUserRequest.mo35080l()))) != 0))))))))))))))))))) {
            return compareTo2;
        }
        if (!mo35080l() || (compareTo = this.installationId.compareTo(mVCreateUserRequest.installationId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCreateUserRequest)) {
            return false;
        }
        MVCreateUserRequest mVCreateUserRequest = (MVCreateUserRequest) obj;
        boolean y = mo35092y();
        boolean y2 = mVCreateUserRequest.mo35092y();
        if ((y || y2) && (!y || !y2 || !this.userLocation.mo26290a(mVCreateUserRequest.userLocation))) {
            return false;
        }
        boolean u = mo35089u();
        boolean u2 = mVCreateUserRequest.mo35089u();
        if ((u || u2) && (!u || !u2 || this.selectedMetroAreaId != mVCreateUserRequest.selectedMetroAreaId)) {
            return false;
        }
        boolean o = mo35082o();
        boolean o2 = mVCreateUserRequest.mo35082o();
        if ((o || o2) && (!o || !o2 || !this.locale.mo35206a(mVCreateUserRequest.locale))) {
            return false;
        }
        boolean i = mo35077i();
        boolean i2 = mVCreateUserRequest.mo35077i();
        if ((i || i2) && (!i || !i2 || !this.deviceName.equals(mVCreateUserRequest.deviceName))) {
            return false;
        }
        boolean p = mo35083p();
        boolean p2 = mVCreateUserRequest.mo35083p();
        if ((p || p2) && (!p || !p2 || !this.osVersion.equals(mVCreateUserRequest.osVersion))) {
            return false;
        }
        boolean q = mo35084q();
        boolean q2 = mVCreateUserRequest.mo35084q();
        if ((q || q2) && (!q || !q2 || !this.phoneOsType.equals(mVCreateUserRequest.phoneOsType))) {
            return false;
        }
        boolean j = mo35078j();
        boolean j2 = mVCreateUserRequest.mo35078j();
        if ((j || j2) && (!j || !j2 || !this.downloadProviderKey.mo35098a(mVCreateUserRequest.downloadProviderKey))) {
            return false;
        }
        boolean f = mo35073f();
        boolean f2 = mVCreateUserRequest.mo35073f();
        if ((f || f2) && (!f || !f2 || !this.advertisingId.equals(mVCreateUserRequest.advertisingId))) {
            return false;
        }
        boolean g = mo35074g();
        boolean g2 = mVCreateUserRequest.mo35074g();
        if (((g || g2) && (!g || !g2 || !this.appsflyerId.equals(mVCreateUserRequest.appsflyerId))) || this.limitAdTrackingEnabled != mVCreateUserRequest.limitAdTrackingEnabled) {
            return false;
        }
        boolean t = mo35087t();
        boolean t2 = mVCreateUserRequest.mo35087t();
        if ((t || t2) && (!t || !t2 || !this.screenResolution.equals(mVCreateUserRequest.screenResolution))) {
            return false;
        }
        boolean s = mo35086s();
        boolean s2 = mVCreateUserRequest.mo35086s();
        if ((s || s2) && (!s || !s2 || this.requestTime != mVCreateUserRequest.requestTime)) {
            return false;
        }
        boolean A = mo35067A();
        boolean A2 = mVCreateUserRequest.mo35067A();
        if ((A || A2) && (!A || !A2 || !this.userType.equals(mVCreateUserRequest.userType))) {
            return false;
        }
        boolean h = mo35075h();
        boolean h2 = mVCreateUserRequest.mo35075h();
        if ((h || h2) && (!h || !h2 || !this.authType.equals(mVCreateUserRequest.authType))) {
            return false;
        }
        boolean w = mo35091w();
        boolean w2 = mVCreateUserRequest.mo35091w();
        if ((w || w2) && (!w || !w2 || !this.uniqueId.equals(mVCreateUserRequest.uniqueId))) {
            return false;
        }
        boolean k = mo35079k();
        boolean k2 = mVCreateUserRequest.mo35079k();
        if ((k || k2) && (!k || !k2 || !this.externalApiKey.equals(mVCreateUserRequest.externalApiKey))) {
            return false;
        }
        boolean v = mo35090v();
        boolean v2 = mVCreateUserRequest.mo35090v();
        if ((v || v2) && (!v || !v2 || !this.thirdPartyLicenceKey.equals(mVCreateUserRequest.thirdPartyLicenceKey))) {
            return false;
        }
        boolean r = mo35085r();
        boolean r2 = mVCreateUserRequest.mo35085r();
        if ((r || r2) && (!r || !r2 || !this.previousUserKey.equals(mVCreateUserRequest.previousUserKey))) {
            return false;
        }
        boolean l = mo35080l();
        boolean l2 = mVCreateUserRequest.mo35080l();
        if ((l || l2) && (!l || !l2 || !this.installationId.equals(mVCreateUserRequest.installationId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35073f() {
        return this.advertisingId != null;
    }

    /* renamed from: g */
    public final boolean mo35074g() {
        return this.appsflyerId != null;
    }

    /* renamed from: h */
    public final boolean mo35075h() {
        return this.authType != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35077i() {
        return this.deviceName != null;
    }

    /* renamed from: j */
    public final boolean mo35078j() {
        return this.downloadProviderKey != null;
    }

    /* renamed from: k */
    public final boolean mo35079k() {
        return this.externalApiKey != null;
    }

    /* renamed from: l */
    public final boolean mo35080l() {
        return this.installationId != null;
    }

    /* renamed from: m */
    public final boolean mo35081m() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: o */
    public final boolean mo35082o() {
        return this.locale != null;
    }

    /* renamed from: p */
    public final boolean mo35083p() {
        return this.osVersion != null;
    }

    /* renamed from: q */
    public final boolean mo35084q() {
        return this.phoneOsType != null;
    }

    /* renamed from: r */
    public final boolean mo35085r() {
        return this.previousUserKey != null;
    }

    /* renamed from: s */
    public final boolean mo35086s() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: t */
    public final boolean mo35087t() {
        return this.screenResolution != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVCreateUserRequest(");
        boolean z2 = false;
        if (mo35092y()) {
            sb.append("userLocation:");
            MVLatLon mVLatLon = this.userLocation;
            if (mVLatLon == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVLatLon);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo35089u()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("selectedMetroAreaId:");
            sb.append(this.selectedMetroAreaId);
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("locale:");
        MVLocale mVLocale = this.locale;
        if (mVLocale == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVLocale);
        }
        sb.append(", ");
        sb.append("deviceName:");
        String str = this.deviceName;
        if (str == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("osVersion:");
        String str2 = this.osVersion;
        if (str2 == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("phoneOsType:");
        MVPhoneOsTypes mVPhoneOsTypes = this.phoneOsType;
        if (mVPhoneOsTypes == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVPhoneOsTypes);
        }
        sb.append(", ");
        sb.append("downloadProviderKey:");
        MVDownloadProviderKey mVDownloadProviderKey = this.downloadProviderKey;
        if (mVDownloadProviderKey == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVDownloadProviderKey);
        }
        sb.append(", ");
        sb.append("advertisingId:");
        String str3 = this.advertisingId;
        if (str3 == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("appsflyerId:");
        String str4 = this.appsflyerId;
        if (str4 == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("limitAdTrackingEnabled:");
        C13555b.m33977q(sb, this.limitAdTrackingEnabled, ", ", "screenResolution:");
        MVClientResolution mVClientResolution = this.screenResolution;
        if (mVClientResolution == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVClientResolution);
        }
        if (mo35086s()) {
            sb.append(", ");
            sb.append("requestTime:");
            sb.append(this.requestTime);
        }
        if (mo35067A()) {
            sb.append(", ");
            sb.append("userType:");
            MVUserType mVUserType = this.userType;
            if (mVUserType == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVUserType);
            }
        }
        if (mo35075h()) {
            sb.append(", ");
            sb.append("authType:");
            MVAuthTokenType mVAuthTokenType = this.authType;
            if (mVAuthTokenType == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVAuthTokenType);
            }
        }
        if (mo35091w()) {
            sb.append(", ");
            sb.append("uniqueId:");
            String str5 = this.uniqueId;
            if (str5 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str5);
            }
        }
        if (mo35079k()) {
            sb.append(", ");
            sb.append("externalApiKey:");
            String str6 = this.externalApiKey;
            if (str6 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str6);
            }
        }
        if (mo35090v()) {
            sb.append(", ");
            sb.append("thirdPartyLicenceKey:");
            String str7 = this.thirdPartyLicenceKey;
            if (str7 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str7);
            }
        }
        if (mo35085r()) {
            sb.append(", ");
            sb.append("previousUserKey:");
            String str8 = this.previousUserKey;
            if (str8 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str8);
            }
        }
        if (mo35080l()) {
            sb.append(", ");
            sb.append("installationId:");
            String str9 = this.installationId;
            if (str9 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str9);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean mo35089u() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: v */
    public final boolean mo35090v() {
        return this.thirdPartyLicenceKey != null;
    }

    /* renamed from: w */
    public final boolean mo35091w() {
        return this.uniqueId != null;
    }

    /* renamed from: y */
    public final boolean mo35092y() {
        return this.userLocation != null;
    }
}
