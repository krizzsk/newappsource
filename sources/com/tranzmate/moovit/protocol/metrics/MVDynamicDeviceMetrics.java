package com.tranzmate.moovit.protocol.metrics;

import com.appboy.support.StringUtils;
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

public class MVDynamicDeviceMetrics implements TBase<MVDynamicDeviceMetrics, _Fields>, Serializable, Cloneable, Comparable<MVDynamicDeviceMetrics> {

    /* renamed from: b */
    public static final C25113c f26390b = new C25113c("androidVersion", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26391c = new C25113c("androidApi", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f26392d = new C25113c("timeZone", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f26393e = new C25113c("runtimeTotalMem", (byte) 10, 6);

    /* renamed from: f */
    public static final C25113c f26394f = new C25113c("runtimeFreeMem", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f26395g = new C25113c("availableMemory", (byte) 10, 7);

    /* renamed from: h */
    public static final C25113c f26396h = new C25113c("isLow", (byte) 2, 8);

    /* renamed from: i */
    public static final C25113c f26397i = new C25113c("internalTotalBytes", (byte) 10, 9);

    /* renamed from: j */
    public static final C25113c f26398j = new C25113c("internalAvailableBytes", (byte) 10, 10);

    /* renamed from: k */
    public static final C25113c f26399k = new C25113c("externalTotalBytes", (byte) 10, 11);

    /* renamed from: l */
    public static final C25113c f26400l = new C25113c("externalAvailableBytes", (byte) 10, 12);

    /* renamed from: m */
    public static final C25113c f26401m = new C25113c("networks", (byte) 15, 13);

    /* renamed from: n */
    public static final C25113c f26402n = new C25113c("avilableLocationProviders", (byte) 15, 14);

    /* renamed from: o */
    public static final C25113c f26403o = new C25113c("battery", (byte) 12, 15);

    /* renamed from: p */
    public static final C25113c f26404p = new C25113c("networkOperatorName", (byte) 11, 16);

    /* renamed from: q */
    public static final C25113c f26405q = new C25113c("mobileDataState", (byte) 11, 17);

    /* renamed from: r */
    public static final C25113c f26406r = new C25113c("fontScale", (byte) 4, 18);

    /* renamed from: s */
    public static final C25113c f26407s = new C25113c("contentSizeIphone", (byte) 11, 19);

    /* renamed from: t */
    public static final HashMap f26408t;

    /* renamed from: u */
    public static final Map<_Fields, FieldMetaData> f26409u;
    private short __isset_bitfield = 0;
    public int androidApi;
    public String androidVersion;
    public long availableMemory;
    public List<String> avilableLocationProviders;
    public MVBatteryMetrics battery;
    public String contentSizeIphone;
    public long externalAvailableBytes;
    public long externalTotalBytes;
    public double fontScale;
    public long internalAvailableBytes;
    public long internalTotalBytes;
    public boolean isLow;
    public String mobileDataState;
    public String networkOperatorName;
    public List<MVNetworkMetrics> networks;
    public long runtimeFreeMem;
    public long runtimeTotalMem;
    public MVDeviceTimeZone timeZone;

    public enum _Fields implements C25085c {
        ANDROID_VERSION(1, "androidVersion"),
        ANDROID_API(2, "androidApi"),
        TIME_ZONE(3, "timeZone"),
        RUNTIME_TOTAL_MEM(6, "runtimeTotalMem"),
        RUNTIME_FREE_MEM(5, "runtimeFreeMem"),
        AVAILABLE_MEMORY(7, "availableMemory"),
        IS_LOW(8, "isLow"),
        INTERNAL_TOTAL_BYTES(9, "internalTotalBytes"),
        INTERNAL_AVAILABLE_BYTES(10, "internalAvailableBytes"),
        EXTERNAL_TOTAL_BYTES(11, "externalTotalBytes"),
        EXTERNAL_AVAILABLE_BYTES(12, "externalAvailableBytes"),
        NETWORKS(13, "networks"),
        AVILABLE_LOCATION_PROVIDERS(14, "avilableLocationProviders"),
        BATTERY(15, "battery"),
        NETWORK_OPERATOR_NAME(16, "networkOperatorName"),
        MOBILE_DATA_STATE(17, "mobileDataState"),
        FONT_SCALE(18, "fontScale"),
        CONTENT_SIZE_IPHONE(19, "contentSizeIphone");
        
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
                    return ANDROID_VERSION;
                case 2:
                    return ANDROID_API;
                case 3:
                    return TIME_ZONE;
                case 5:
                    return RUNTIME_FREE_MEM;
                case 6:
                    return RUNTIME_TOTAL_MEM;
                case 7:
                    return AVAILABLE_MEMORY;
                case 8:
                    return IS_LOW;
                case 9:
                    return INTERNAL_TOTAL_BYTES;
                case 10:
                    return INTERNAL_AVAILABLE_BYTES;
                case 11:
                    return EXTERNAL_TOTAL_BYTES;
                case 12:
                    return EXTERNAL_AVAILABLE_BYTES;
                case 13:
                    return NETWORKS;
                case 14:
                    return AVILABLE_LOCATION_PROVIDERS;
                case 15:
                    return BATTERY;
                case 16:
                    return NETWORK_OPERATOR_NAME;
                case 17:
                    return MOBILE_DATA_STATE;
                case 18:
                    return FONT_SCALE;
                case 19:
                    return CONTENT_SIZE_IPHONE;
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

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDynamicDeviceMetrics$a */
    public static class C9138a extends C25239c<MVDynamicDeviceMetrics> {
        public C9138a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDynamicDeviceMetrics mVDynamicDeviceMetrics = (MVDynamicDeviceMetrics) tBase;
            MVDeviceTimeZone mVDeviceTimeZone = mVDynamicDeviceMetrics.timeZone;
            C25113c cVar = MVDynamicDeviceMetrics.f26390b;
            gVar.mo61687K();
            if (mVDynamicDeviceMetrics.androidVersion != null) {
                gVar.mo61711x(MVDynamicDeviceMetrics.f26390b);
                gVar.mo61686J(mVDynamicDeviceMetrics.androidVersion);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDynamicDeviceMetrics.f26391c);
            gVar.mo61678B(mVDynamicDeviceMetrics.androidApi);
            gVar.mo61712y();
            if (mVDynamicDeviceMetrics.timeZone != null) {
                gVar.mo61711x(MVDynamicDeviceMetrics.f26392d);
                mVDynamicDeviceMetrics.timeZone.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDynamicDeviceMetrics.f26394f);
            gVar.mo61679C(mVDynamicDeviceMetrics.runtimeFreeMem);
            gVar.mo61712y();
            gVar.mo61711x(MVDynamicDeviceMetrics.f26393e);
            gVar.mo61679C(mVDynamicDeviceMetrics.runtimeTotalMem);
            gVar.mo61712y();
            gVar.mo61711x(MVDynamicDeviceMetrics.f26395g);
            gVar.mo61679C(mVDynamicDeviceMetrics.availableMemory);
            gVar.mo61712y();
            gVar.mo61711x(MVDynamicDeviceMetrics.f26396h);
            gVar.mo61708u(mVDynamicDeviceMetrics.isLow);
            gVar.mo61712y();
            gVar.mo61711x(MVDynamicDeviceMetrics.f26397i);
            gVar.mo61679C(mVDynamicDeviceMetrics.internalTotalBytes);
            gVar.mo61712y();
            gVar.mo61711x(MVDynamicDeviceMetrics.f26398j);
            gVar.mo61679C(mVDynamicDeviceMetrics.internalAvailableBytes);
            gVar.mo61712y();
            gVar.mo61711x(MVDynamicDeviceMetrics.f26399k);
            gVar.mo61679C(mVDynamicDeviceMetrics.externalTotalBytes);
            gVar.mo61712y();
            gVar.mo61711x(MVDynamicDeviceMetrics.f26400l);
            gVar.mo61679C(mVDynamicDeviceMetrics.externalAvailableBytes);
            gVar.mo61712y();
            if (mVDynamicDeviceMetrics.networks != null) {
                gVar.mo61711x(MVDynamicDeviceMetrics.f26401m);
                gVar.mo61680D(new C25119e((byte) 12, mVDynamicDeviceMetrics.networks.size()));
                for (MVNetworkMetrics X0 : mVDynamicDeviceMetrics.networks) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVDynamicDeviceMetrics.avilableLocationProviders != null) {
                gVar.mo61711x(MVDynamicDeviceMetrics.f26402n);
                gVar.mo61680D(new C25119e((byte) 11, mVDynamicDeviceMetrics.avilableLocationProviders.size()));
                for (String J : mVDynamicDeviceMetrics.avilableLocationProviders) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVDynamicDeviceMetrics.battery != null) {
                gVar.mo61711x(MVDynamicDeviceMetrics.f26403o);
                mVDynamicDeviceMetrics.battery.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDynamicDeviceMetrics.networkOperatorName != null) {
                gVar.mo61711x(MVDynamicDeviceMetrics.f26404p);
                gVar.mo61686J(mVDynamicDeviceMetrics.networkOperatorName);
                gVar.mo61712y();
            }
            if (mVDynamicDeviceMetrics.mobileDataState != null) {
                gVar.mo61711x(MVDynamicDeviceMetrics.f26405q);
                gVar.mo61686J(mVDynamicDeviceMetrics.mobileDataState);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDynamicDeviceMetrics.f26406r);
            gVar.mo61710w(mVDynamicDeviceMetrics.fontScale);
            gVar.mo61712y();
            if (mVDynamicDeviceMetrics.contentSizeIphone != null) {
                gVar.mo61711x(MVDynamicDeviceMetrics.f26407s);
                gVar.mo61686J(mVDynamicDeviceMetrics.contentSizeIphone);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDynamicDeviceMetrics mVDynamicDeviceMetrics = (MVDynamicDeviceMetrics) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVDeviceTimeZone mVDeviceTimeZone = mVDynamicDeviceMetrics.timeZone;
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.androidVersion = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.androidApi = gVar.mo61696i();
                            mVDynamicDeviceMetrics.mo28460A();
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVDeviceTimeZone mVDeviceTimeZone2 = new MVDeviceTimeZone();
                            mVDynamicDeviceMetrics.timeZone = mVDeviceTimeZone2;
                            mVDeviceTimeZone2.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.runtimeFreeMem = gVar.mo61697j();
                            mVDynamicDeviceMetrics.mo28468L();
                            break;
                        }
                    case 6:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.runtimeTotalMem = gVar.mo61697j();
                            mVDynamicDeviceMetrics.mo28469M();
                            break;
                        }
                    case 7:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.availableMemory = gVar.mo61697j();
                            mVDynamicDeviceMetrics.mo28461D();
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.isLow = gVar.mo61690c();
                            mVDynamicDeviceMetrics.mo28467J();
                            break;
                        }
                    case 9:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.internalTotalBytes = gVar.mo61697j();
                            mVDynamicDeviceMetrics.mo28466I();
                            break;
                        }
                    case 10:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.internalAvailableBytes = gVar.mo61697j();
                            mVDynamicDeviceMetrics.mo28465H();
                            break;
                        }
                    case 11:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.externalTotalBytes = gVar.mo61697j();
                            mVDynamicDeviceMetrics.mo28463F();
                            break;
                        }
                    case 12:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.externalAvailableBytes = gVar.mo61697j();
                            mVDynamicDeviceMetrics.mo28462E();
                            break;
                        }
                    case 13:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVDynamicDeviceMetrics.networks = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVNetworkMetrics mVNetworkMetrics = new MVNetworkMetrics();
                                mVNetworkMetrics.mo25201C1(gVar);
                                mVDynamicDeviceMetrics.networks.add(mVNetworkMetrics);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 14:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVDynamicDeviceMetrics.avilableLocationProviders = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                mVDynamicDeviceMetrics.avilableLocationProviders.add(gVar.mo61704q());
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 15:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVBatteryMetrics mVBatteryMetrics = new MVBatteryMetrics();
                            mVDynamicDeviceMetrics.battery = mVBatteryMetrics;
                            mVBatteryMetrics.mo25201C1(gVar);
                            break;
                        }
                    case 16:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.networkOperatorName = gVar.mo61704q();
                            break;
                        }
                    case 17:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.mobileDataState = gVar.mo61704q();
                            break;
                        }
                    case 18:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.fontScale = gVar.mo61692e();
                            mVDynamicDeviceMetrics.mo28464G();
                            break;
                        }
                    case 19:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDynamicDeviceMetrics.contentSizeIphone = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDynamicDeviceMetrics$b */
    public static class C9139b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9138a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDynamicDeviceMetrics$c */
    public static class C9140c extends C25240d<MVDynamicDeviceMetrics> {
        public C9140c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDynamicDeviceMetrics mVDynamicDeviceMetrics = (MVDynamicDeviceMetrics) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDynamicDeviceMetrics.mo28474g()) {
                bitSet.set(0);
            }
            if (mVDynamicDeviceMetrics.mo28473f()) {
                bitSet.set(1);
            }
            if (mVDynamicDeviceMetrics.mo28492y()) {
                bitSet.set(2);
            }
            if (mVDynamicDeviceMetrics.mo28491w()) {
                bitSet.set(3);
            }
            if (mVDynamicDeviceMetrics.mo28490v()) {
                bitSet.set(4);
            }
            if (mVDynamicDeviceMetrics.mo28475h()) {
                bitSet.set(5);
            }
            if (mVDynamicDeviceMetrics.mo28485r()) {
                bitSet.set(6);
            }
            if (mVDynamicDeviceMetrics.mo28484q()) {
                bitSet.set(7);
            }
            if (mVDynamicDeviceMetrics.mo28483p()) {
                bitSet.set(8);
            }
            if (mVDynamicDeviceMetrics.mo28481m()) {
                bitSet.set(9);
            }
            if (mVDynamicDeviceMetrics.mo28480l()) {
                bitSet.set(10);
            }
            if (mVDynamicDeviceMetrics.mo28489u()) {
                bitSet.set(11);
            }
            if (mVDynamicDeviceMetrics.mo28477i()) {
                bitSet.set(12);
            }
            if (mVDynamicDeviceMetrics.mo28478j()) {
                bitSet.set(13);
            }
            if (mVDynamicDeviceMetrics.mo28487t()) {
                bitSet.set(14);
            }
            if (mVDynamicDeviceMetrics.mo28486s()) {
                bitSet.set(15);
            }
            if (mVDynamicDeviceMetrics.mo28482o()) {
                bitSet.set(16);
            }
            if (mVDynamicDeviceMetrics.mo28479k()) {
                bitSet.set(17);
            }
            jVar.mo61738U(bitSet, 18);
            if (mVDynamicDeviceMetrics.mo28474g()) {
                jVar.mo61686J(mVDynamicDeviceMetrics.androidVersion);
            }
            if (mVDynamicDeviceMetrics.mo28473f()) {
                jVar.mo61678B(mVDynamicDeviceMetrics.androidApi);
            }
            if (mVDynamicDeviceMetrics.mo28492y()) {
                mVDynamicDeviceMetrics.timeZone.mo25202X0(jVar);
            }
            if (mVDynamicDeviceMetrics.mo28491w()) {
                jVar.mo61679C(mVDynamicDeviceMetrics.runtimeTotalMem);
            }
            if (mVDynamicDeviceMetrics.mo28490v()) {
                jVar.mo61679C(mVDynamicDeviceMetrics.runtimeFreeMem);
            }
            if (mVDynamicDeviceMetrics.mo28475h()) {
                jVar.mo61679C(mVDynamicDeviceMetrics.availableMemory);
            }
            if (mVDynamicDeviceMetrics.mo28485r()) {
                jVar.mo61708u(mVDynamicDeviceMetrics.isLow);
            }
            if (mVDynamicDeviceMetrics.mo28484q()) {
                jVar.mo61679C(mVDynamicDeviceMetrics.internalTotalBytes);
            }
            if (mVDynamicDeviceMetrics.mo28483p()) {
                jVar.mo61679C(mVDynamicDeviceMetrics.internalAvailableBytes);
            }
            if (mVDynamicDeviceMetrics.mo28481m()) {
                jVar.mo61679C(mVDynamicDeviceMetrics.externalTotalBytes);
            }
            if (mVDynamicDeviceMetrics.mo28480l()) {
                jVar.mo61679C(mVDynamicDeviceMetrics.externalAvailableBytes);
            }
            if (mVDynamicDeviceMetrics.mo28489u()) {
                jVar.mo61678B(mVDynamicDeviceMetrics.networks.size());
                for (MVNetworkMetrics X0 : mVDynamicDeviceMetrics.networks) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVDynamicDeviceMetrics.mo28477i()) {
                jVar.mo61678B(mVDynamicDeviceMetrics.avilableLocationProviders.size());
                for (String J : mVDynamicDeviceMetrics.avilableLocationProviders) {
                    jVar.mo61686J(J);
                }
            }
            if (mVDynamicDeviceMetrics.mo28478j()) {
                mVDynamicDeviceMetrics.battery.mo25202X0(jVar);
            }
            if (mVDynamicDeviceMetrics.mo28487t()) {
                jVar.mo61686J(mVDynamicDeviceMetrics.networkOperatorName);
            }
            if (mVDynamicDeviceMetrics.mo28486s()) {
                jVar.mo61686J(mVDynamicDeviceMetrics.mobileDataState);
            }
            if (mVDynamicDeviceMetrics.mo28482o()) {
                jVar.mo61710w(mVDynamicDeviceMetrics.fontScale);
            }
            if (mVDynamicDeviceMetrics.mo28479k()) {
                jVar.mo61686J(mVDynamicDeviceMetrics.contentSizeIphone);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDynamicDeviceMetrics mVDynamicDeviceMetrics = (MVDynamicDeviceMetrics) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(18);
            if (T.get(0)) {
                mVDynamicDeviceMetrics.androidVersion = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVDynamicDeviceMetrics.androidApi = jVar.mo61696i();
                mVDynamicDeviceMetrics.mo28460A();
            }
            if (T.get(2)) {
                MVDeviceTimeZone mVDeviceTimeZone = new MVDeviceTimeZone();
                mVDynamicDeviceMetrics.timeZone = mVDeviceTimeZone;
                mVDeviceTimeZone.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVDynamicDeviceMetrics.runtimeTotalMem = jVar.mo61697j();
                mVDynamicDeviceMetrics.mo28469M();
            }
            if (T.get(4)) {
                mVDynamicDeviceMetrics.runtimeFreeMem = jVar.mo61697j();
                mVDynamicDeviceMetrics.mo28468L();
            }
            if (T.get(5)) {
                mVDynamicDeviceMetrics.availableMemory = jVar.mo61697j();
                mVDynamicDeviceMetrics.mo28461D();
            }
            if (T.get(6)) {
                mVDynamicDeviceMetrics.isLow = jVar.mo61690c();
                mVDynamicDeviceMetrics.mo28467J();
            }
            if (T.get(7)) {
                mVDynamicDeviceMetrics.internalTotalBytes = jVar.mo61697j();
                mVDynamicDeviceMetrics.mo28466I();
            }
            if (T.get(8)) {
                mVDynamicDeviceMetrics.internalAvailableBytes = jVar.mo61697j();
                mVDynamicDeviceMetrics.mo28465H();
            }
            if (T.get(9)) {
                mVDynamicDeviceMetrics.externalTotalBytes = jVar.mo61697j();
                mVDynamicDeviceMetrics.mo28463F();
            }
            if (T.get(10)) {
                mVDynamicDeviceMetrics.externalAvailableBytes = jVar.mo61697j();
                mVDynamicDeviceMetrics.mo28462E();
            }
            if (T.get(11)) {
                int i = jVar.mo61696i();
                mVDynamicDeviceMetrics.networks = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVNetworkMetrics mVNetworkMetrics = new MVNetworkMetrics();
                    mVNetworkMetrics.mo25201C1(jVar);
                    mVDynamicDeviceMetrics.networks.add(mVNetworkMetrics);
                }
            }
            if (T.get(12)) {
                int i3 = jVar.mo61696i();
                mVDynamicDeviceMetrics.avilableLocationProviders = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    mVDynamicDeviceMetrics.avilableLocationProviders.add(jVar.mo61704q());
                }
            }
            if (T.get(13)) {
                MVBatteryMetrics mVBatteryMetrics = new MVBatteryMetrics();
                mVDynamicDeviceMetrics.battery = mVBatteryMetrics;
                mVBatteryMetrics.mo25201C1(jVar);
            }
            if (T.get(14)) {
                mVDynamicDeviceMetrics.networkOperatorName = jVar.mo61704q();
            }
            if (T.get(15)) {
                mVDynamicDeviceMetrics.mobileDataState = jVar.mo61704q();
            }
            if (T.get(16)) {
                mVDynamicDeviceMetrics.fontScale = jVar.mo61692e();
                mVDynamicDeviceMetrics.mo28464G();
            }
            if (T.get(17)) {
                mVDynamicDeviceMetrics.contentSizeIphone = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDynamicDeviceMetrics$d */
    public static class C9141d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9140c(0);
        }
    }

    static {
        new C17394d0("MVDynamicDeviceMetrics");
        HashMap hashMap = new HashMap();
        f26408t = hashMap;
        hashMap.put(C25239c.class, new C9139b());
        hashMap.put(C25240d.class, new C9141d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ANDROID_VERSION, new FieldMetaData("androidVersion", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANDROID_API, new FieldMetaData("androidApi", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TIME_ZONE, new FieldMetaData("timeZone", (byte) 3, new StructMetaData(MVDeviceTimeZone.class)));
        enumMap.put(_Fields.RUNTIME_TOTAL_MEM, new FieldMetaData("runtimeTotalMem", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.RUNTIME_FREE_MEM, new FieldMetaData("runtimeFreeMem", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.AVAILABLE_MEMORY, new FieldMetaData("availableMemory", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.IS_LOW, new FieldMetaData("isLow", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.INTERNAL_TOTAL_BYTES, new FieldMetaData("internalTotalBytes", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.INTERNAL_AVAILABLE_BYTES, new FieldMetaData("internalAvailableBytes", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.EXTERNAL_TOTAL_BYTES, new FieldMetaData("externalTotalBytes", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.EXTERNAL_AVAILABLE_BYTES, new FieldMetaData("externalAvailableBytes", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.NETWORKS, new FieldMetaData("networks", (byte) 3, new ListMetaData(new StructMetaData(MVNetworkMetrics.class))));
        enumMap.put(_Fields.AVILABLE_LOCATION_PROVIDERS, new FieldMetaData("avilableLocationProviders", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.BATTERY, new FieldMetaData("battery", (byte) 3, new StructMetaData(MVBatteryMetrics.class)));
        enumMap.put(_Fields.NETWORK_OPERATOR_NAME, new FieldMetaData("networkOperatorName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MOBILE_DATA_STATE, new FieldMetaData("mobileDataState", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FONT_SCALE, new FieldMetaData("fontScale", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.CONTENT_SIZE_IPHONE, new FieldMetaData("contentSizeIphone", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26409u = unmodifiableMap;
        FieldMetaData.m61947a(MVDynamicDeviceMetrics.class, unmodifiableMap);
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
    public final void mo28460A() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f26408t.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo28461D() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: E */
    public final void mo28462E() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 8, true);
    }

    /* renamed from: F */
    public final void mo28463F() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 7, true);
    }

    /* renamed from: G */
    public final void mo28464G() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 9, true);
    }

    /* renamed from: H */
    public final void mo28465H() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: I */
    public final void mo28466I() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: J */
    public final void mo28467J() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: L */
    public final void mo28468L() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: M */
    public final void mo28469M() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26408t.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo28470a(MVDynamicDeviceMetrics mVDynamicDeviceMetrics) {
        if (mVDynamicDeviceMetrics == null) {
            return false;
        }
        boolean g = mo28474g();
        boolean g2 = mVDynamicDeviceMetrics.mo28474g();
        if (((g || g2) && (!g || !g2 || !this.androidVersion.equals(mVDynamicDeviceMetrics.androidVersion))) || this.androidApi != mVDynamicDeviceMetrics.androidApi) {
            return false;
        }
        boolean y = mo28492y();
        boolean y2 = mVDynamicDeviceMetrics.mo28492y();
        if (((y || y2) && (!y || !y2 || !this.timeZone.mo28430a(mVDynamicDeviceMetrics.timeZone))) || this.runtimeTotalMem != mVDynamicDeviceMetrics.runtimeTotalMem || this.runtimeFreeMem != mVDynamicDeviceMetrics.runtimeFreeMem || this.availableMemory != mVDynamicDeviceMetrics.availableMemory || this.isLow != mVDynamicDeviceMetrics.isLow || this.internalTotalBytes != mVDynamicDeviceMetrics.internalTotalBytes || this.internalAvailableBytes != mVDynamicDeviceMetrics.internalAvailableBytes || this.externalTotalBytes != mVDynamicDeviceMetrics.externalTotalBytes || this.externalAvailableBytes != mVDynamicDeviceMetrics.externalAvailableBytes) {
            return false;
        }
        boolean u = mo28489u();
        boolean u2 = mVDynamicDeviceMetrics.mo28489u();
        if ((u || u2) && (!u || !u2 || !this.networks.equals(mVDynamicDeviceMetrics.networks))) {
            return false;
        }
        boolean i = mo28477i();
        boolean i2 = mVDynamicDeviceMetrics.mo28477i();
        if ((i || i2) && (!i || !i2 || !this.avilableLocationProviders.equals(mVDynamicDeviceMetrics.avilableLocationProviders))) {
            return false;
        }
        boolean j = mo28478j();
        boolean j2 = mVDynamicDeviceMetrics.mo28478j();
        if ((j || j2) && (!j || !j2 || !this.battery.mo28407a(mVDynamicDeviceMetrics.battery))) {
            return false;
        }
        boolean t = mo28487t();
        boolean t2 = mVDynamicDeviceMetrics.mo28487t();
        if ((t || t2) && (!t || !t2 || !this.networkOperatorName.equals(mVDynamicDeviceMetrics.networkOperatorName))) {
            return false;
        }
        boolean s = mo28486s();
        boolean s2 = mVDynamicDeviceMetrics.mo28486s();
        if (((s || s2) && (!s || !s2 || !this.mobileDataState.equals(mVDynamicDeviceMetrics.mobileDataState))) || this.fontScale != mVDynamicDeviceMetrics.fontScale) {
            return false;
        }
        boolean k = mo28479k();
        boolean k2 = mVDynamicDeviceMetrics.mo28479k();
        if (!k && !k2) {
            return true;
        }
        if (!k || !k2 || !this.contentSizeIphone.equals(mVDynamicDeviceMetrics.contentSizeIphone)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDynamicDeviceMetrics mVDynamicDeviceMetrics = (MVDynamicDeviceMetrics) obj;
        if (!getClass().equals(mVDynamicDeviceMetrics.getClass())) {
            return getClass().getName().compareTo(mVDynamicDeviceMetrics.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28474g()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28474g()));
        if (compareTo2 != 0 || ((mo28474g() && (compareTo2 = this.androidVersion.compareTo(mVDynamicDeviceMetrics.androidVersion)) != 0) || (compareTo2 = Boolean.valueOf(mo28473f()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28473f()))) != 0 || ((mo28473f() && (compareTo2 = C25082a.m62839c(this.androidApi, mVDynamicDeviceMetrics.androidApi)) != 0) || (compareTo2 = Boolean.valueOf(mo28492y()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28492y()))) != 0 || ((mo28492y() && (compareTo2 = this.timeZone.compareTo(mVDynamicDeviceMetrics.timeZone)) != 0) || (compareTo2 = Boolean.valueOf(mo28491w()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28491w()))) != 0 || ((mo28491w() && (compareTo2 = C25082a.m62840d(this.runtimeTotalMem, mVDynamicDeviceMetrics.runtimeTotalMem)) != 0) || (compareTo2 = Boolean.valueOf(mo28490v()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28490v()))) != 0 || ((mo28490v() && (compareTo2 = C25082a.m62840d(this.runtimeFreeMem, mVDynamicDeviceMetrics.runtimeFreeMem)) != 0) || (compareTo2 = Boolean.valueOf(mo28475h()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28475h()))) != 0 || ((mo28475h() && (compareTo2 = C25082a.m62840d(this.availableMemory, mVDynamicDeviceMetrics.availableMemory)) != 0) || (compareTo2 = Boolean.valueOf(mo28485r()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28485r()))) != 0 || ((mo28485r() && (compareTo2 = C25082a.m62848l(this.isLow, mVDynamicDeviceMetrics.isLow)) != 0) || (compareTo2 = Boolean.valueOf(mo28484q()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28484q()))) != 0 || ((mo28484q() && (compareTo2 = C25082a.m62840d(this.internalTotalBytes, mVDynamicDeviceMetrics.internalTotalBytes)) != 0) || (compareTo2 = Boolean.valueOf(mo28483p()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28483p()))) != 0 || ((mo28483p() && (compareTo2 = C25082a.m62840d(this.internalAvailableBytes, mVDynamicDeviceMetrics.internalAvailableBytes)) != 0) || (compareTo2 = Boolean.valueOf(mo28481m()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28481m()))) != 0 || ((mo28481m() && (compareTo2 = C25082a.m62840d(this.externalTotalBytes, mVDynamicDeviceMetrics.externalTotalBytes)) != 0) || (compareTo2 = Boolean.valueOf(mo28480l()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28480l()))) != 0 || ((mo28480l() && (compareTo2 = C25082a.m62840d(this.externalAvailableBytes, mVDynamicDeviceMetrics.externalAvailableBytes)) != 0) || (compareTo2 = Boolean.valueOf(mo28489u()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28489u()))) != 0 || ((mo28489u() && (compareTo2 = C25082a.m62844h(this.networks, mVDynamicDeviceMetrics.networks)) != 0) || (compareTo2 = Boolean.valueOf(mo28477i()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28477i()))) != 0 || ((mo28477i() && (compareTo2 = C25082a.m62844h(this.avilableLocationProviders, mVDynamicDeviceMetrics.avilableLocationProviders)) != 0) || (compareTo2 = Boolean.valueOf(mo28478j()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28478j()))) != 0 || ((mo28478j() && (compareTo2 = this.battery.compareTo(mVDynamicDeviceMetrics.battery)) != 0) || (compareTo2 = Boolean.valueOf(mo28487t()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28487t()))) != 0 || ((mo28487t() && (compareTo2 = this.networkOperatorName.compareTo(mVDynamicDeviceMetrics.networkOperatorName)) != 0) || (compareTo2 = Boolean.valueOf(mo28486s()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28486s()))) != 0 || ((mo28486s() && (compareTo2 = this.mobileDataState.compareTo(mVDynamicDeviceMetrics.mobileDataState)) != 0) || (compareTo2 = Boolean.valueOf(mo28482o()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28482o()))) != 0 || ((mo28482o() && (compareTo2 = C25082a.m62838b(this.fontScale, mVDynamicDeviceMetrics.fontScale)) != 0) || (compareTo2 = Boolean.valueOf(mo28479k()).compareTo(Boolean.valueOf(mVDynamicDeviceMetrics.mo28479k()))) != 0)))))))))))))))))) {
            return compareTo2;
        }
        if (!mo28479k() || (compareTo = this.contentSizeIphone.compareTo(mVDynamicDeviceMetrics.contentSizeIphone)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVDynamicDeviceMetrics)) {
            return mo28470a((MVDynamicDeviceMetrics) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28473f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo28474g() {
        return this.androidVersion != null;
    }

    /* renamed from: h */
    public final boolean mo28475h() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28477i() {
        return this.avilableLocationProviders != null;
    }

    /* renamed from: j */
    public final boolean mo28478j() {
        return this.battery != null;
    }

    /* renamed from: k */
    public final boolean mo28479k() {
        return this.contentSizeIphone != null;
    }

    /* renamed from: l */
    public final boolean mo28480l() {
        return C13637c.m34053H(this.__isset_bitfield, 8);
    }

    /* renamed from: m */
    public final boolean mo28481m() {
        return C13637c.m34053H(this.__isset_bitfield, 7);
    }

    /* renamed from: o */
    public final boolean mo28482o() {
        return C13637c.m34053H(this.__isset_bitfield, 9);
    }

    /* renamed from: p */
    public final boolean mo28483p() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: q */
    public final boolean mo28484q() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: r */
    public final boolean mo28485r() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: s */
    public final boolean mo28486s() {
        return this.mobileDataState != null;
    }

    /* renamed from: t */
    public final boolean mo28487t() {
        return this.networkOperatorName != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDynamicDeviceMetrics(", "androidVersion:");
        String str = this.androidVersion;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("androidApi:");
        C0016g.m42z(n, this.androidApi, ", ", "timeZone:");
        MVDeviceTimeZone mVDeviceTimeZone = this.timeZone;
        if (mVDeviceTimeZone == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDeviceTimeZone);
        }
        n.append(", ");
        n.append("runtimeTotalMem:");
        C25541a.m63889t(n, this.runtimeTotalMem, ", ", "runtimeFreeMem:");
        C25541a.m63889t(n, this.runtimeFreeMem, ", ", "availableMemory:");
        C25541a.m63889t(n, this.availableMemory, ", ", "isLow:");
        C13555b.m33977q(n, this.isLow, ", ", "internalTotalBytes:");
        C25541a.m63889t(n, this.internalTotalBytes, ", ", "internalAvailableBytes:");
        C25541a.m63889t(n, this.internalAvailableBytes, ", ", "externalTotalBytes:");
        C25541a.m63889t(n, this.externalTotalBytes, ", ", "externalAvailableBytes:");
        C25541a.m63889t(n, this.externalAvailableBytes, ", ", "networks:");
        List<MVNetworkMetrics> list = this.networks;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("avilableLocationProviders:");
        List<String> list2 = this.avilableLocationProviders;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("battery:");
        MVBatteryMetrics mVBatteryMetrics = this.battery;
        if (mVBatteryMetrics == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVBatteryMetrics);
        }
        n.append(", ");
        n.append("networkOperatorName:");
        String str2 = this.networkOperatorName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("mobileDataState:");
        String str3 = this.mobileDataState;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("fontScale:");
        C16759e.m42355k(n, this.fontScale, ", ", "contentSizeIphone:");
        String str4 = this.contentSizeIphone;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo28489u() {
        return this.networks != null;
    }

    /* renamed from: v */
    public final boolean mo28490v() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: w */
    public final boolean mo28491w() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: y */
    public final boolean mo28492y() {
        return this.timeZone != null;
    }
}
