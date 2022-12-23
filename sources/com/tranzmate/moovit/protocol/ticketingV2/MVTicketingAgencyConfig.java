package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
import com.usebutton.sdk.internal.api.AppActionRequest;
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
import org.apache.thrift.meta_data.MapMetaData;
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
import vi0.C25120f;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVTicketingAgencyConfig implements TBase<MVTicketingAgencyConfig, _Fields>, Serializable, Cloneable, Comparable<MVTicketingAgencyConfig> {

    /* renamed from: b */
    public static final C25113c f29218b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29219c = new C25113c("agencyKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29220d = new C25113c("agencyName", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29221e = new C25113c("agencyId", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f29222f = new C25113c("backgroundImage", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f29223g = new C25113c(AppActionRequest.KEY_CAPABILITIES, (byte) 15, 6);

    /* renamed from: h */
    public static final C25113c f29224h = new C25113c("sdkConfigFileUrl", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f29225i = new C25113c("purchasePaymentContext", (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f29226j = new C25113c("splitConfig", (byte) 12, 9);

    /* renamed from: k */
    public static final C25113c f29227k = new C25113c("agencyImage", (byte) 12, 10);

    /* renamed from: l */
    public static final C25113c f29228l = new C25113c("serviceAreas", (byte) 15, 11);

    /* renamed from: m */
    public static final C25113c f29229m = new C25113c("properties", (byte) 13, 12);

    /* renamed from: n */
    public static final C25113c f29230n = new C25113c("walletPaymentContext", (byte) 11, 13);

    /* renamed from: o */
    public static final HashMap f29231o;

    /* renamed from: p */
    public static final Map<_Fields, FieldMetaData> f29232p;
    private byte __isset_bitfield = 0;
    public int agencyId;
    public MVImageReferenceWithParams agencyImage;
    public String agencyKey;
    public String agencyName;
    public MVImageReferenceWithParams backgroundImage;
    public List<MVTicketingAgencyCapabilities> capabilities;
    private _Fields[] optionals = {_Fields.AGENCY_ID, _Fields.BACKGROUND_IMAGE, _Fields.SDK_CONFIG_FILE_URL, _Fields.SPLIT_CONFIG, _Fields.AGENCY_IMAGE, _Fields.SERVICE_AREAS, _Fields.PROPERTIES};
    public Map<String, String> properties;
    public int providerId;
    public String purchasePaymentContext;
    public String sdkConfigFileUrl;
    public List<String> serviceAreas;
    public MVPurchaseSplitConfiguration splitConfig;
    public String walletPaymentContext;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        AGENCY_KEY(2, "agencyKey"),
        AGENCY_NAME(3, "agencyName"),
        AGENCY_ID(4, "agencyId"),
        BACKGROUND_IMAGE(5, "backgroundImage"),
        CAPABILITIES(6, AppActionRequest.KEY_CAPABILITIES),
        SDK_CONFIG_FILE_URL(7, "sdkConfigFileUrl"),
        PURCHASE_PAYMENT_CONTEXT(8, "purchasePaymentContext"),
        SPLIT_CONFIG(9, "splitConfig"),
        AGENCY_IMAGE(10, "agencyImage"),
        SERVICE_AREAS(11, "serviceAreas"),
        PROPERTIES(12, "properties"),
        WALLET_PAYMENT_CONTEXT(13, "walletPaymentContext");
        
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
                    return PROVIDER_ID;
                case 2:
                    return AGENCY_KEY;
                case 3:
                    return AGENCY_NAME;
                case 4:
                    return AGENCY_ID;
                case 5:
                    return BACKGROUND_IMAGE;
                case 6:
                    return CAPABILITIES;
                case 7:
                    return SDK_CONFIG_FILE_URL;
                case 8:
                    return PURCHASE_PAYMENT_CONTEXT;
                case 9:
                    return SPLIT_CONFIG;
                case 10:
                    return AGENCY_IMAGE;
                case 11:
                    return SERVICE_AREAS;
                case 12:
                    return PROPERTIES;
                case 13:
                    return WALLET_PAYMENT_CONTEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyConfig$a */
    public static class C11101a extends C25239c<MVTicketingAgencyConfig> {
        public C11101a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketingAgencyConfig mVTicketingAgencyConfig = (MVTicketingAgencyConfig) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVTicketingAgencyConfig.backgroundImage;
            C25113c cVar = MVTicketingAgencyConfig.f29218b;
            gVar.mo61687K();
            gVar.mo61711x(MVTicketingAgencyConfig.f29218b);
            gVar.mo61678B(mVTicketingAgencyConfig.providerId);
            gVar.mo61712y();
            if (mVTicketingAgencyConfig.agencyKey != null) {
                gVar.mo61711x(MVTicketingAgencyConfig.f29219c);
                gVar.mo61686J(mVTicketingAgencyConfig.agencyKey);
                gVar.mo61712y();
            }
            if (mVTicketingAgencyConfig.agencyName != null) {
                gVar.mo61711x(MVTicketingAgencyConfig.f29220d);
                gVar.mo61686J(mVTicketingAgencyConfig.agencyName);
                gVar.mo61712y();
            }
            if (mVTicketingAgencyConfig.mo33139f()) {
                gVar.mo61711x(MVTicketingAgencyConfig.f29221e);
                gVar.mo61678B(mVTicketingAgencyConfig.agencyId);
                gVar.mo61712y();
            }
            if (mVTicketingAgencyConfig.backgroundImage != null && mVTicketingAgencyConfig.mo33144j()) {
                gVar.mo61711x(MVTicketingAgencyConfig.f29222f);
                mVTicketingAgencyConfig.backgroundImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTicketingAgencyConfig.capabilities != null) {
                gVar.mo61711x(MVTicketingAgencyConfig.f29223g);
                gVar.mo61680D(new C25119e((byte) 8, mVTicketingAgencyConfig.capabilities.size()));
                for (MVTicketingAgencyCapabilities value : mVTicketingAgencyConfig.capabilities) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTicketingAgencyConfig.sdkConfigFileUrl != null && mVTicketingAgencyConfig.mo33149p()) {
                gVar.mo61711x(MVTicketingAgencyConfig.f29224h);
                gVar.mo61686J(mVTicketingAgencyConfig.sdkConfigFileUrl);
                gVar.mo61712y();
            }
            if (mVTicketingAgencyConfig.purchasePaymentContext != null) {
                gVar.mo61711x(MVTicketingAgencyConfig.f29225i);
                gVar.mo61686J(mVTicketingAgencyConfig.purchasePaymentContext);
                gVar.mo61712y();
            }
            if (mVTicketingAgencyConfig.splitConfig != null && mVTicketingAgencyConfig.mo33151r()) {
                gVar.mo61711x(MVTicketingAgencyConfig.f29226j);
                mVTicketingAgencyConfig.splitConfig.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTicketingAgencyConfig.agencyImage != null && mVTicketingAgencyConfig.mo33140g()) {
                gVar.mo61711x(MVTicketingAgencyConfig.f29227k);
                mVTicketingAgencyConfig.agencyImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTicketingAgencyConfig.serviceAreas != null && mVTicketingAgencyConfig.mo33150q()) {
                gVar.mo61711x(MVTicketingAgencyConfig.f29228l);
                gVar.mo61680D(new C25119e((byte) 11, mVTicketingAgencyConfig.serviceAreas.size()));
                for (String J : mVTicketingAgencyConfig.serviceAreas) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTicketingAgencyConfig.properties != null && mVTicketingAgencyConfig.mo33146l()) {
                gVar.mo61711x(MVTicketingAgencyConfig.f29229m);
                gVar.mo61682F(new C25120f((byte) 11, (byte) 11, mVTicketingAgencyConfig.properties.size()));
                for (Map.Entry next : mVTicketingAgencyConfig.properties.entrySet()) {
                    gVar.mo61686J((String) next.getKey());
                    gVar.mo61686J((String) next.getValue());
                }
                gVar.mo61683G();
                gVar.mo61712y();
            }
            if (mVTicketingAgencyConfig.walletPaymentContext != null) {
                gVar.mo61711x(MVTicketingAgencyConfig.f29230n);
                gVar.mo61686J(mVTicketingAgencyConfig.walletPaymentContext);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketingAgencyConfig mVTicketingAgencyConfig = (MVTicketingAgencyConfig) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVTicketingAgencyConfig.backgroundImage;
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingAgencyConfig.providerId = gVar.mo61696i();
                            mVTicketingAgencyConfig.mo33155u();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingAgencyConfig.agencyKey = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingAgencyConfig.agencyName = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingAgencyConfig.agencyId = gVar.mo61696i();
                            mVTicketingAgencyConfig.mo33153t();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVTicketingAgencyConfig.backgroundImage = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVTicketingAgencyConfig.capabilities = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                mVTicketingAgencyConfig.capabilities.add(MVTicketingAgencyCapabilities.findByValue(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingAgencyConfig.sdkConfigFileUrl = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingAgencyConfig.purchasePaymentContext = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPurchaseSplitConfiguration mVPurchaseSplitConfiguration = new MVPurchaseSplitConfiguration();
                            mVTicketingAgencyConfig.splitConfig = mVPurchaseSplitConfiguration;
                            mVPurchaseSplitConfiguration.mo25201C1(gVar);
                            break;
                        }
                    case 10:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams3 = new MVImageReferenceWithParams();
                            mVTicketingAgencyConfig.agencyImage = mVImageReferenceWithParams3;
                            mVImageReferenceWithParams3.mo25201C1(gVar);
                            break;
                        }
                    case 11:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVTicketingAgencyConfig.serviceAreas = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                mVTicketingAgencyConfig.serviceAreas.add(gVar.mo61704q());
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 12:
                        if (b != 13) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25120f m = gVar.mo61700m();
                            mVTicketingAgencyConfig.properties = new HashMap(m.f63398c * 2);
                            while (i < m.f63398c) {
                                mVTicketingAgencyConfig.properties.put(gVar.mo61704q(), gVar.mo61704q());
                                i++;
                            }
                            gVar.mo61701n();
                            break;
                        }
                    case 13:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingAgencyConfig.walletPaymentContext = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyConfig$b */
    public static class C11102b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11101a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyConfig$c */
    public static class C11103c extends C25240d<MVTicketingAgencyConfig> {
        public C11103c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketingAgencyConfig mVTicketingAgencyConfig = (MVTicketingAgencyConfig) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTicketingAgencyConfig.mo33147m()) {
                bitSet.set(0);
            }
            if (mVTicketingAgencyConfig.mo33141h()) {
                bitSet.set(1);
            }
            if (mVTicketingAgencyConfig.mo33143i()) {
                bitSet.set(2);
            }
            if (mVTicketingAgencyConfig.mo33139f()) {
                bitSet.set(3);
            }
            if (mVTicketingAgencyConfig.mo33144j()) {
                bitSet.set(4);
            }
            if (mVTicketingAgencyConfig.mo33145k()) {
                bitSet.set(5);
            }
            if (mVTicketingAgencyConfig.mo33149p()) {
                bitSet.set(6);
            }
            if (mVTicketingAgencyConfig.mo33148o()) {
                bitSet.set(7);
            }
            if (mVTicketingAgencyConfig.mo33151r()) {
                bitSet.set(8);
            }
            if (mVTicketingAgencyConfig.mo33140g()) {
                bitSet.set(9);
            }
            if (mVTicketingAgencyConfig.mo33150q()) {
                bitSet.set(10);
            }
            if (mVTicketingAgencyConfig.mo33146l()) {
                bitSet.set(11);
            }
            if (mVTicketingAgencyConfig.mo33152s()) {
                bitSet.set(12);
            }
            jVar.mo61738U(bitSet, 13);
            if (mVTicketingAgencyConfig.mo33147m()) {
                jVar.mo61678B(mVTicketingAgencyConfig.providerId);
            }
            if (mVTicketingAgencyConfig.mo33141h()) {
                jVar.mo61686J(mVTicketingAgencyConfig.agencyKey);
            }
            if (mVTicketingAgencyConfig.mo33143i()) {
                jVar.mo61686J(mVTicketingAgencyConfig.agencyName);
            }
            if (mVTicketingAgencyConfig.mo33139f()) {
                jVar.mo61678B(mVTicketingAgencyConfig.agencyId);
            }
            if (mVTicketingAgencyConfig.mo33144j()) {
                mVTicketingAgencyConfig.backgroundImage.mo25202X0(jVar);
            }
            if (mVTicketingAgencyConfig.mo33145k()) {
                jVar.mo61678B(mVTicketingAgencyConfig.capabilities.size());
                for (MVTicketingAgencyCapabilities value : mVTicketingAgencyConfig.capabilities) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVTicketingAgencyConfig.mo33149p()) {
                jVar.mo61686J(mVTicketingAgencyConfig.sdkConfigFileUrl);
            }
            if (mVTicketingAgencyConfig.mo33148o()) {
                jVar.mo61686J(mVTicketingAgencyConfig.purchasePaymentContext);
            }
            if (mVTicketingAgencyConfig.mo33151r()) {
                mVTicketingAgencyConfig.splitConfig.mo25202X0(jVar);
            }
            if (mVTicketingAgencyConfig.mo33140g()) {
                mVTicketingAgencyConfig.agencyImage.mo25202X0(jVar);
            }
            if (mVTicketingAgencyConfig.mo33150q()) {
                jVar.mo61678B(mVTicketingAgencyConfig.serviceAreas.size());
                for (String J : mVTicketingAgencyConfig.serviceAreas) {
                    jVar.mo61686J(J);
                }
            }
            if (mVTicketingAgencyConfig.mo33146l()) {
                jVar.mo61678B(mVTicketingAgencyConfig.properties.size());
                for (Map.Entry next : mVTicketingAgencyConfig.properties.entrySet()) {
                    jVar.mo61686J((String) next.getKey());
                    jVar.mo61686J((String) next.getValue());
                }
            }
            if (mVTicketingAgencyConfig.mo33152s()) {
                jVar.mo61686J(mVTicketingAgencyConfig.walletPaymentContext);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketingAgencyConfig mVTicketingAgencyConfig = (MVTicketingAgencyConfig) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(13);
            if (T.get(0)) {
                mVTicketingAgencyConfig.providerId = jVar.mo61696i();
                mVTicketingAgencyConfig.mo33155u();
            }
            if (T.get(1)) {
                mVTicketingAgencyConfig.agencyKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTicketingAgencyConfig.agencyName = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVTicketingAgencyConfig.agencyId = jVar.mo61696i();
                mVTicketingAgencyConfig.mo33153t();
            }
            if (T.get(4)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTicketingAgencyConfig.backgroundImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(5)) {
                int i = jVar.mo61696i();
                mVTicketingAgencyConfig.capabilities = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVTicketingAgencyConfig.capabilities.add(MVTicketingAgencyCapabilities.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(6)) {
                mVTicketingAgencyConfig.sdkConfigFileUrl = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVTicketingAgencyConfig.purchasePaymentContext = jVar.mo61704q();
            }
            if (T.get(8)) {
                MVPurchaseSplitConfiguration mVPurchaseSplitConfiguration = new MVPurchaseSplitConfiguration();
                mVTicketingAgencyConfig.splitConfig = mVPurchaseSplitConfiguration;
                mVPurchaseSplitConfiguration.mo25201C1(jVar);
            }
            if (T.get(9)) {
                MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                mVTicketingAgencyConfig.agencyImage = mVImageReferenceWithParams2;
                mVImageReferenceWithParams2.mo25201C1(jVar);
            }
            if (T.get(10)) {
                int i3 = jVar.mo61696i();
                mVTicketingAgencyConfig.serviceAreas = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    mVTicketingAgencyConfig.serviceAreas.add(jVar.mo61704q());
                }
            }
            if (T.get(11)) {
                int i5 = jVar.mo61696i();
                mVTicketingAgencyConfig.properties = new HashMap(i5 * 2);
                for (int i6 = 0; i6 < i5; i6++) {
                    mVTicketingAgencyConfig.properties.put(jVar.mo61704q(), jVar.mo61704q());
                }
            }
            if (T.get(12)) {
                mVTicketingAgencyConfig.walletPaymentContext = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyConfig$d */
    public static class C11104d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11103c(0);
        }
    }

    static {
        new C17394d0("MVTicketingAgencyConfig");
        HashMap hashMap = new HashMap();
        f29231o = hashMap;
        hashMap.put(C25239c.class, new C11102b());
        hashMap.put(C25240d.class, new C11104d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_NAME, new FieldMetaData("agencyName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.BACKGROUND_IMAGE, new FieldMetaData("backgroundImage", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.CAPABILITIES, new FieldMetaData(AppActionRequest.KEY_CAPABILITIES, (byte) 3, new ListMetaData(new EnumMetaData(MVTicketingAgencyCapabilities.class))));
        enumMap.put(_Fields.SDK_CONFIG_FILE_URL, new FieldMetaData("sdkConfigFileUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PURCHASE_PAYMENT_CONTEXT, new FieldMetaData("purchasePaymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SPLIT_CONFIG, new FieldMetaData("splitConfig", (byte) 2, new StructMetaData(MVPurchaseSplitConfiguration.class)));
        enumMap.put(_Fields.AGENCY_IMAGE, new FieldMetaData("agencyImage", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.SERVICE_AREAS, new FieldMetaData("serviceAreas", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 11, "GoogleEncodedPolygon"))));
        enumMap.put(_Fields.PROPERTIES, new FieldMetaData("properties", (byte) 2, new MapMetaData(new FieldValueMetaData((byte) 11, false), new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.WALLET_PAYMENT_CONTEXT, new FieldMetaData("walletPaymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29232p = unmodifiableMap;
        FieldMetaData.m61947a(MVTicketingAgencyConfig.class, unmodifiableMap);
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
        ((C25238b) f29231o.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29231o.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTicketingAgencyConfig mVTicketingAgencyConfig = (MVTicketingAgencyConfig) obj;
        if (!getClass().equals(mVTicketingAgencyConfig.getClass())) {
            return getClass().getName().compareTo(mVTicketingAgencyConfig.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33147m()).compareTo(Boolean.valueOf(mVTicketingAgencyConfig.mo33147m()));
        if (compareTo2 != 0 || ((mo33147m() && (compareTo2 = C25082a.m62839c(this.providerId, mVTicketingAgencyConfig.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo33141h()).compareTo(Boolean.valueOf(mVTicketingAgencyConfig.mo33141h()))) != 0 || ((mo33141h() && (compareTo2 = this.agencyKey.compareTo(mVTicketingAgencyConfig.agencyKey)) != 0) || (compareTo2 = Boolean.valueOf(mo33143i()).compareTo(Boolean.valueOf(mVTicketingAgencyConfig.mo33143i()))) != 0 || ((mo33143i() && (compareTo2 = this.agencyName.compareTo(mVTicketingAgencyConfig.agencyName)) != 0) || (compareTo2 = Boolean.valueOf(mo33139f()).compareTo(Boolean.valueOf(mVTicketingAgencyConfig.mo33139f()))) != 0 || ((mo33139f() && (compareTo2 = C25082a.m62839c(this.agencyId, mVTicketingAgencyConfig.agencyId)) != 0) || (compareTo2 = Boolean.valueOf(mo33144j()).compareTo(Boolean.valueOf(mVTicketingAgencyConfig.mo33144j()))) != 0 || ((mo33144j() && (compareTo2 = this.backgroundImage.compareTo(mVTicketingAgencyConfig.backgroundImage)) != 0) || (compareTo2 = Boolean.valueOf(mo33145k()).compareTo(Boolean.valueOf(mVTicketingAgencyConfig.mo33145k()))) != 0 || ((mo33145k() && (compareTo2 = C25082a.m62844h(this.capabilities, mVTicketingAgencyConfig.capabilities)) != 0) || (compareTo2 = Boolean.valueOf(mo33149p()).compareTo(Boolean.valueOf(mVTicketingAgencyConfig.mo33149p()))) != 0 || ((mo33149p() && (compareTo2 = this.sdkConfigFileUrl.compareTo(mVTicketingAgencyConfig.sdkConfigFileUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo33148o()).compareTo(Boolean.valueOf(mVTicketingAgencyConfig.mo33148o()))) != 0 || ((mo33148o() && (compareTo2 = this.purchasePaymentContext.compareTo(mVTicketingAgencyConfig.purchasePaymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo33151r()).compareTo(Boolean.valueOf(mVTicketingAgencyConfig.mo33151r()))) != 0 || ((mo33151r() && (compareTo2 = this.splitConfig.compareTo(mVTicketingAgencyConfig.splitConfig)) != 0) || (compareTo2 = Boolean.valueOf(mo33140g()).compareTo(Boolean.valueOf(mVTicketingAgencyConfig.mo33140g()))) != 0 || ((mo33140g() && (compareTo2 = this.agencyImage.compareTo(mVTicketingAgencyConfig.agencyImage)) != 0) || (compareTo2 = Boolean.valueOf(mo33150q()).compareTo(Boolean.valueOf(mVTicketingAgencyConfig.mo33150q()))) != 0 || ((mo33150q() && (compareTo2 = C25082a.m62844h(this.serviceAreas, mVTicketingAgencyConfig.serviceAreas)) != 0) || (compareTo2 = Boolean.valueOf(mo33146l()).compareTo(Boolean.valueOf(mVTicketingAgencyConfig.mo33146l()))) != 0 || ((mo33146l() && (compareTo2 = C25082a.m62845i(this.properties, mVTicketingAgencyConfig.properties)) != 0) || (compareTo2 = Boolean.valueOf(mo33152s()).compareTo(Boolean.valueOf(mVTicketingAgencyConfig.mo33152s()))) != 0))))))))))))) {
            return compareTo2;
        }
        if (!mo33152s() || (compareTo = this.walletPaymentContext.compareTo(mVTicketingAgencyConfig.walletPaymentContext)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTicketingAgencyConfig)) {
            return false;
        }
        MVTicketingAgencyConfig mVTicketingAgencyConfig = (MVTicketingAgencyConfig) obj;
        if (this.providerId != mVTicketingAgencyConfig.providerId) {
            return false;
        }
        boolean h = mo33141h();
        boolean h2 = mVTicketingAgencyConfig.mo33141h();
        if ((h || h2) && (!h || !h2 || !this.agencyKey.equals(mVTicketingAgencyConfig.agencyKey))) {
            return false;
        }
        boolean i = mo33143i();
        boolean i2 = mVTicketingAgencyConfig.mo33143i();
        if ((i || i2) && (!i || !i2 || !this.agencyName.equals(mVTicketingAgencyConfig.agencyName))) {
            return false;
        }
        boolean f = mo33139f();
        boolean f2 = mVTicketingAgencyConfig.mo33139f();
        if ((f || f2) && (!f || !f2 || this.agencyId != mVTicketingAgencyConfig.agencyId)) {
            return false;
        }
        boolean j = mo33144j();
        boolean j2 = mVTicketingAgencyConfig.mo33144j();
        if ((j || j2) && (!j || !j2 || !this.backgroundImage.mo26245a(mVTicketingAgencyConfig.backgroundImage))) {
            return false;
        }
        boolean k = mo33145k();
        boolean k2 = mVTicketingAgencyConfig.mo33145k();
        if ((k || k2) && (!k || !k2 || !this.capabilities.equals(mVTicketingAgencyConfig.capabilities))) {
            return false;
        }
        boolean p = mo33149p();
        boolean p2 = mVTicketingAgencyConfig.mo33149p();
        if ((p || p2) && (!p || !p2 || !this.sdkConfigFileUrl.equals(mVTicketingAgencyConfig.sdkConfigFileUrl))) {
            return false;
        }
        boolean o = mo33148o();
        boolean o2 = mVTicketingAgencyConfig.mo33148o();
        if ((o || o2) && (!o || !o2 || !this.purchasePaymentContext.equals(mVTicketingAgencyConfig.purchasePaymentContext))) {
            return false;
        }
        boolean r = mo33151r();
        boolean r2 = mVTicketingAgencyConfig.mo33151r();
        if ((r || r2) && (!r || !r2 || !this.splitConfig.mo32712a(mVTicketingAgencyConfig.splitConfig))) {
            return false;
        }
        boolean g = mo33140g();
        boolean g2 = mVTicketingAgencyConfig.mo33140g();
        if ((g || g2) && (!g || !g2 || !this.agencyImage.mo26245a(mVTicketingAgencyConfig.agencyImage))) {
            return false;
        }
        boolean q = mo33150q();
        boolean q2 = mVTicketingAgencyConfig.mo33150q();
        if ((q || q2) && (!q || !q2 || !this.serviceAreas.equals(mVTicketingAgencyConfig.serviceAreas))) {
            return false;
        }
        boolean l = mo33146l();
        boolean l2 = mVTicketingAgencyConfig.mo33146l();
        if ((l || l2) && (!l || !l2 || !this.properties.equals(mVTicketingAgencyConfig.properties))) {
            return false;
        }
        boolean s = mo33152s();
        boolean s2 = mVTicketingAgencyConfig.mo33152s();
        if ((s || s2) && (!s || !s2 || !this.walletPaymentContext.equals(mVTicketingAgencyConfig.walletPaymentContext))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33139f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo33140g() {
        return this.agencyImage != null;
    }

    /* renamed from: h */
    public final boolean mo33141h() {
        return this.agencyKey != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33143i() {
        return this.agencyName != null;
    }

    /* renamed from: j */
    public final boolean mo33144j() {
        return this.backgroundImage != null;
    }

    /* renamed from: k */
    public final boolean mo33145k() {
        return this.capabilities != null;
    }

    /* renamed from: l */
    public final boolean mo33146l() {
        return this.properties != null;
    }

    /* renamed from: m */
    public final boolean mo33147m() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: o */
    public final boolean mo33148o() {
        return this.purchasePaymentContext != null;
    }

    /* renamed from: p */
    public final boolean mo33149p() {
        return this.sdkConfigFileUrl != null;
    }

    /* renamed from: q */
    public final boolean mo33150q() {
        return this.serviceAreas != null;
    }

    /* renamed from: r */
    public final boolean mo33151r() {
        return this.splitConfig != null;
    }

    /* renamed from: s */
    public final boolean mo33152s() {
        return this.walletPaymentContext != null;
    }

    /* renamed from: t */
    public final void mo33153t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTicketingAgencyConfig(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "agencyKey:");
        String str = this.agencyKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("agencyName:");
        String str2 = this.agencyName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo33139f()) {
            n.append(", ");
            n.append("agencyId:");
            n.append(this.agencyId);
        }
        if (mo33144j()) {
            n.append(", ");
            n.append("backgroundImage:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.backgroundImage;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        n.append(", ");
        n.append("capabilities:");
        List<MVTicketingAgencyCapabilities> list = this.capabilities;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo33149p()) {
            n.append(", ");
            n.append("sdkConfigFileUrl:");
            String str3 = this.sdkConfigFileUrl;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(", ");
        n.append("purchasePaymentContext:");
        String str4 = this.purchasePaymentContext;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        if (mo33151r()) {
            n.append(", ");
            n.append("splitConfig:");
            MVPurchaseSplitConfiguration mVPurchaseSplitConfiguration = this.splitConfig;
            if (mVPurchaseSplitConfiguration == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPurchaseSplitConfiguration);
            }
        }
        if (mo33140g()) {
            n.append(", ");
            n.append("agencyImage:");
            MVImageReferenceWithParams mVImageReferenceWithParams2 = this.agencyImage;
            if (mVImageReferenceWithParams2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams2);
            }
        }
        if (mo33150q()) {
            n.append(", ");
            n.append("serviceAreas:");
            List<String> list2 = this.serviceAreas;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        if (mo33146l()) {
            n.append(", ");
            n.append("properties:");
            Map<String, String> map = this.properties;
            if (map == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(map);
            }
        }
        n.append(", ");
        n.append("walletPaymentContext:");
        String str5 = this.walletPaymentContext;
        if (str5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str5);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo33155u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }
}
