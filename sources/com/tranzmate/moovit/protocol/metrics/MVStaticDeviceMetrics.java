package com.tranzmate.moovit.protocol.metrics;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVStaticDeviceMetrics implements TBase<MVStaticDeviceMetrics, _Fields>, Serializable, Cloneable, Comparable<MVStaticDeviceMetrics> {

    /* renamed from: b */
    public static final C25113c f26428b = new C25113c(ServerParameters.DEVICE_KEY, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26429c = new C25113c("deviceModel", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26430d = new C25113c("displayBuildId", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26431e = new C25113c("deviceManufacturer", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26432f = new C25113c("supportedAbis", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f26433g = new C25113c("runtimeAvailableProcessors", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f26434h = new C25113c("totalMemory", (byte) 10, 7);

    /* renamed from: i */
    public static final C25113c f26435i = new C25113c("lowThreshouldMemory", (byte) 10, 8);

    /* renamed from: j */
    public static final C25113c f26436j = new C25113c("internalTotalBytes", (byte) 10, 9);

    /* renamed from: k */
    public static final C25113c f26437k = new C25113c("externalTotalBytes", (byte) 10, 10);

    /* renamed from: l */
    public static final C25113c f26438l = new C25113c("avilableSensorIds", (byte) 15, 11);

    /* renamed from: m */
    public static final C25113c f26439m = new C25113c("display", (byte) 12, 12);

    /* renamed from: n */
    public static final HashMap f26440n;

    /* renamed from: o */
    public static final Map<_Fields, FieldMetaData> f26441o;
    private byte __isset_bitfield = 0;
    public List<Integer> avilableSensorIds;
    public String device;
    public String deviceManufacturer;
    public String deviceModel;
    public MVDisplayMetrics display;
    public String displayBuildId;
    public long externalTotalBytes;
    public long internalTotalBytes;
    public long lowThreshouldMemory;
    public int runtimeAvailableProcessors;
    public List<String> supportedAbis;
    public long totalMemory;

    public enum _Fields implements C25085c {
        DEVICE(1, ServerParameters.DEVICE_KEY),
        DEVICE_MODEL(2, "deviceModel"),
        DISPLAY_BUILD_ID(3, "displayBuildId"),
        DEVICE_MANUFACTURER(4, "deviceManufacturer"),
        SUPPORTED_ABIS(5, "supportedAbis"),
        RUNTIME_AVAILABLE_PROCESSORS(6, "runtimeAvailableProcessors"),
        TOTAL_MEMORY(7, "totalMemory"),
        LOW_THRESHOULD_MEMORY(8, "lowThreshouldMemory"),
        INTERNAL_TOTAL_BYTES(9, "internalTotalBytes"),
        EXTERNAL_TOTAL_BYTES(10, "externalTotalBytes"),
        AVILABLE_SENSOR_IDS(11, "avilableSensorIds"),
        DISPLAY(12, "display");
        
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
                    return DEVICE;
                case 2:
                    return DEVICE_MODEL;
                case 3:
                    return DISPLAY_BUILD_ID;
                case 4:
                    return DEVICE_MANUFACTURER;
                case 5:
                    return SUPPORTED_ABIS;
                case 6:
                    return RUNTIME_AVAILABLE_PROCESSORS;
                case 7:
                    return TOTAL_MEMORY;
                case 8:
                    return LOW_THRESHOULD_MEMORY;
                case 9:
                    return INTERNAL_TOTAL_BYTES;
                case 10:
                    return EXTERNAL_TOTAL_BYTES;
                case 11:
                    return AVILABLE_SENSOR_IDS;
                case 12:
                    return DISPLAY;
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

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVStaticDeviceMetrics$a */
    public static class C9150a extends C25239c<MVStaticDeviceMetrics> {
        public C9150a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStaticDeviceMetrics mVStaticDeviceMetrics = (MVStaticDeviceMetrics) tBase;
            MVDisplayMetrics mVDisplayMetrics = mVStaticDeviceMetrics.display;
            C25113c cVar = MVStaticDeviceMetrics.f26428b;
            gVar.mo61687K();
            if (mVStaticDeviceMetrics.device != null) {
                gVar.mo61711x(MVStaticDeviceMetrics.f26428b);
                gVar.mo61686J(mVStaticDeviceMetrics.device);
                gVar.mo61712y();
            }
            if (mVStaticDeviceMetrics.deviceModel != null) {
                gVar.mo61711x(MVStaticDeviceMetrics.f26429c);
                gVar.mo61686J(mVStaticDeviceMetrics.deviceModel);
                gVar.mo61712y();
            }
            if (mVStaticDeviceMetrics.displayBuildId != null) {
                gVar.mo61711x(MVStaticDeviceMetrics.f26430d);
                gVar.mo61686J(mVStaticDeviceMetrics.displayBuildId);
                gVar.mo61712y();
            }
            if (mVStaticDeviceMetrics.deviceManufacturer != null) {
                gVar.mo61711x(MVStaticDeviceMetrics.f26431e);
                gVar.mo61686J(mVStaticDeviceMetrics.deviceManufacturer);
                gVar.mo61712y();
            }
            if (mVStaticDeviceMetrics.supportedAbis != null) {
                gVar.mo61711x(MVStaticDeviceMetrics.f26432f);
                gVar.mo61680D(new C25119e((byte) 11, mVStaticDeviceMetrics.supportedAbis.size()));
                for (String J : mVStaticDeviceMetrics.supportedAbis) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVStaticDeviceMetrics.f26433g);
            gVar.mo61678B(mVStaticDeviceMetrics.runtimeAvailableProcessors);
            gVar.mo61712y();
            gVar.mo61711x(MVStaticDeviceMetrics.f26434h);
            gVar.mo61679C(mVStaticDeviceMetrics.totalMemory);
            gVar.mo61712y();
            gVar.mo61711x(MVStaticDeviceMetrics.f26435i);
            gVar.mo61679C(mVStaticDeviceMetrics.lowThreshouldMemory);
            gVar.mo61712y();
            gVar.mo61711x(MVStaticDeviceMetrics.f26436j);
            gVar.mo61679C(mVStaticDeviceMetrics.internalTotalBytes);
            gVar.mo61712y();
            gVar.mo61711x(MVStaticDeviceMetrics.f26437k);
            gVar.mo61679C(mVStaticDeviceMetrics.externalTotalBytes);
            gVar.mo61712y();
            if (mVStaticDeviceMetrics.avilableSensorIds != null) {
                gVar.mo61711x(MVStaticDeviceMetrics.f26438l);
                gVar.mo61680D(new C25119e((byte) 8, mVStaticDeviceMetrics.avilableSensorIds.size()));
                for (Integer intValue : mVStaticDeviceMetrics.avilableSensorIds) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVStaticDeviceMetrics.display != null) {
                gVar.mo61711x(MVStaticDeviceMetrics.f26439m);
                mVStaticDeviceMetrics.display.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStaticDeviceMetrics mVStaticDeviceMetrics = (MVStaticDeviceMetrics) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVDisplayMetrics mVDisplayMetrics = mVStaticDeviceMetrics.display;
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticDeviceMetrics.device = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticDeviceMetrics.deviceModel = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticDeviceMetrics.displayBuildId = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticDeviceMetrics.deviceManufacturer = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVStaticDeviceMetrics.supportedAbis = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                mVStaticDeviceMetrics.supportedAbis.add(gVar.mo61704q());
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticDeviceMetrics.runtimeAvailableProcessors = gVar.mo61696i();
                            mVStaticDeviceMetrics.mo28547v();
                            break;
                        }
                    case 7:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticDeviceMetrics.totalMemory = gVar.mo61697j();
                            mVStaticDeviceMetrics.mo28548w();
                            break;
                        }
                    case 8:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticDeviceMetrics.lowThreshouldMemory = gVar.mo61697j();
                            mVStaticDeviceMetrics.mo28546u();
                            break;
                        }
                    case 9:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticDeviceMetrics.internalTotalBytes = gVar.mo61697j();
                            mVStaticDeviceMetrics.mo28544t();
                            break;
                        }
                    case 10:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticDeviceMetrics.externalTotalBytes = gVar.mo61697j();
                            mVStaticDeviceMetrics.mo28543s();
                            break;
                        }
                    case 11:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVStaticDeviceMetrics.avilableSensorIds = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVStaticDeviceMetrics.avilableSensorIds, i, 1);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 12:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVDisplayMetrics mVDisplayMetrics2 = new MVDisplayMetrics();
                            mVStaticDeviceMetrics.display = mVDisplayMetrics2;
                            mVDisplayMetrics2.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVStaticDeviceMetrics$b */
    public static class C9151b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9150a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVStaticDeviceMetrics$c */
    public static class C9152c extends C25240d<MVStaticDeviceMetrics> {
        public C9152c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStaticDeviceMetrics mVStaticDeviceMetrics = (MVStaticDeviceMetrics) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStaticDeviceMetrics.mo28531g()) {
                bitSet.set(0);
            }
            if (mVStaticDeviceMetrics.mo28534i()) {
                bitSet.set(1);
            }
            if (mVStaticDeviceMetrics.mo28536k()) {
                bitSet.set(2);
            }
            if (mVStaticDeviceMetrics.mo28532h()) {
                bitSet.set(3);
            }
            if (mVStaticDeviceMetrics.mo28541q()) {
                bitSet.set(4);
            }
            if (mVStaticDeviceMetrics.mo28540p()) {
                bitSet.set(5);
            }
            if (mVStaticDeviceMetrics.mo28542r()) {
                bitSet.set(6);
            }
            if (mVStaticDeviceMetrics.mo28539o()) {
                bitSet.set(7);
            }
            if (mVStaticDeviceMetrics.mo28538m()) {
                bitSet.set(8);
            }
            if (mVStaticDeviceMetrics.mo28537l()) {
                bitSet.set(9);
            }
            if (mVStaticDeviceMetrics.mo28530f()) {
                bitSet.set(10);
            }
            if (mVStaticDeviceMetrics.mo28535j()) {
                bitSet.set(11);
            }
            jVar.mo61738U(bitSet, 12);
            if (mVStaticDeviceMetrics.mo28531g()) {
                jVar.mo61686J(mVStaticDeviceMetrics.device);
            }
            if (mVStaticDeviceMetrics.mo28534i()) {
                jVar.mo61686J(mVStaticDeviceMetrics.deviceModel);
            }
            if (mVStaticDeviceMetrics.mo28536k()) {
                jVar.mo61686J(mVStaticDeviceMetrics.displayBuildId);
            }
            if (mVStaticDeviceMetrics.mo28532h()) {
                jVar.mo61686J(mVStaticDeviceMetrics.deviceManufacturer);
            }
            if (mVStaticDeviceMetrics.mo28541q()) {
                jVar.mo61678B(mVStaticDeviceMetrics.supportedAbis.size());
                for (String J : mVStaticDeviceMetrics.supportedAbis) {
                    jVar.mo61686J(J);
                }
            }
            if (mVStaticDeviceMetrics.mo28540p()) {
                jVar.mo61678B(mVStaticDeviceMetrics.runtimeAvailableProcessors);
            }
            if (mVStaticDeviceMetrics.mo28542r()) {
                jVar.mo61679C(mVStaticDeviceMetrics.totalMemory);
            }
            if (mVStaticDeviceMetrics.mo28539o()) {
                jVar.mo61679C(mVStaticDeviceMetrics.lowThreshouldMemory);
            }
            if (mVStaticDeviceMetrics.mo28538m()) {
                jVar.mo61679C(mVStaticDeviceMetrics.internalTotalBytes);
            }
            if (mVStaticDeviceMetrics.mo28537l()) {
                jVar.mo61679C(mVStaticDeviceMetrics.externalTotalBytes);
            }
            if (mVStaticDeviceMetrics.mo28530f()) {
                jVar.mo61678B(mVStaticDeviceMetrics.avilableSensorIds.size());
                for (Integer intValue : mVStaticDeviceMetrics.avilableSensorIds) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVStaticDeviceMetrics.mo28535j()) {
                mVStaticDeviceMetrics.display.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStaticDeviceMetrics mVStaticDeviceMetrics = (MVStaticDeviceMetrics) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(12);
            if (T.get(0)) {
                mVStaticDeviceMetrics.device = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVStaticDeviceMetrics.deviceModel = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVStaticDeviceMetrics.displayBuildId = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVStaticDeviceMetrics.deviceManufacturer = jVar.mo61704q();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVStaticDeviceMetrics.supportedAbis = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVStaticDeviceMetrics.supportedAbis.add(jVar.mo61704q());
                }
            }
            if (T.get(5)) {
                mVStaticDeviceMetrics.runtimeAvailableProcessors = jVar.mo61696i();
                mVStaticDeviceMetrics.mo28547v();
            }
            if (T.get(6)) {
                mVStaticDeviceMetrics.totalMemory = jVar.mo61697j();
                mVStaticDeviceMetrics.mo28548w();
            }
            if (T.get(7)) {
                mVStaticDeviceMetrics.lowThreshouldMemory = jVar.mo61697j();
                mVStaticDeviceMetrics.mo28546u();
            }
            if (T.get(8)) {
                mVStaticDeviceMetrics.internalTotalBytes = jVar.mo61697j();
                mVStaticDeviceMetrics.mo28544t();
            }
            if (T.get(9)) {
                mVStaticDeviceMetrics.externalTotalBytes = jVar.mo61697j();
                mVStaticDeviceMetrics.mo28543s();
            }
            if (T.get(10)) {
                int i3 = jVar.mo61696i();
                mVStaticDeviceMetrics.avilableSensorIds = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4 = C13437d.m33701f(jVar.mo61696i(), mVStaticDeviceMetrics.avilableSensorIds, i4, 1)) {
                }
            }
            if (T.get(11)) {
                MVDisplayMetrics mVDisplayMetrics = new MVDisplayMetrics();
                mVStaticDeviceMetrics.display = mVDisplayMetrics;
                mVDisplayMetrics.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVStaticDeviceMetrics$d */
    public static class C9153d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9152c(0);
        }
    }

    static {
        new C17394d0("MVStaticDeviceMetrics");
        HashMap hashMap = new HashMap();
        f26440n = hashMap;
        hashMap.put(C25239c.class, new C9151b());
        hashMap.put(C25240d.class, new C9153d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DEVICE, new FieldMetaData(ServerParameters.DEVICE_KEY, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DEVICE_MODEL, new FieldMetaData("deviceModel", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DISPLAY_BUILD_ID, new FieldMetaData("displayBuildId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DEVICE_MANUFACTURER, new FieldMetaData("deviceManufacturer", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUPPORTED_ABIS, new FieldMetaData("supportedAbis", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.RUNTIME_AVAILABLE_PROCESSORS, new FieldMetaData("runtimeAvailableProcessors", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TOTAL_MEMORY, new FieldMetaData("totalMemory", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.LOW_THRESHOULD_MEMORY, new FieldMetaData("lowThreshouldMemory", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.INTERNAL_TOTAL_BYTES, new FieldMetaData("internalTotalBytes", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.EXTERNAL_TOTAL_BYTES, new FieldMetaData("externalTotalBytes", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.AVILABLE_SENSOR_IDS, new FieldMetaData("avilableSensorIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.DISPLAY, new FieldMetaData("display", (byte) 3, new StructMetaData(MVDisplayMetrics.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26441o = unmodifiableMap;
        FieldMetaData.m61947a(MVStaticDeviceMetrics.class, unmodifiableMap);
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
        ((C25238b) f26440n.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26440n.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo28527a(MVStaticDeviceMetrics mVStaticDeviceMetrics) {
        if (mVStaticDeviceMetrics == null) {
            return false;
        }
        boolean g = mo28531g();
        boolean g2 = mVStaticDeviceMetrics.mo28531g();
        if ((g || g2) && (!g || !g2 || !this.device.equals(mVStaticDeviceMetrics.device))) {
            return false;
        }
        boolean i = mo28534i();
        boolean i2 = mVStaticDeviceMetrics.mo28534i();
        if ((i || i2) && (!i || !i2 || !this.deviceModel.equals(mVStaticDeviceMetrics.deviceModel))) {
            return false;
        }
        boolean k = mo28536k();
        boolean k2 = mVStaticDeviceMetrics.mo28536k();
        if ((k || k2) && (!k || !k2 || !this.displayBuildId.equals(mVStaticDeviceMetrics.displayBuildId))) {
            return false;
        }
        boolean h = mo28532h();
        boolean h2 = mVStaticDeviceMetrics.mo28532h();
        if ((h || h2) && (!h || !h2 || !this.deviceManufacturer.equals(mVStaticDeviceMetrics.deviceManufacturer))) {
            return false;
        }
        boolean q = mo28541q();
        boolean q2 = mVStaticDeviceMetrics.mo28541q();
        if (((q || q2) && (!q || !q2 || !this.supportedAbis.equals(mVStaticDeviceMetrics.supportedAbis))) || this.runtimeAvailableProcessors != mVStaticDeviceMetrics.runtimeAvailableProcessors || this.totalMemory != mVStaticDeviceMetrics.totalMemory || this.lowThreshouldMemory != mVStaticDeviceMetrics.lowThreshouldMemory || this.internalTotalBytes != mVStaticDeviceMetrics.internalTotalBytes || this.externalTotalBytes != mVStaticDeviceMetrics.externalTotalBytes) {
            return false;
        }
        boolean f = mo28530f();
        boolean f2 = mVStaticDeviceMetrics.mo28530f();
        if ((f || f2) && (!f || !f2 || !this.avilableSensorIds.equals(mVStaticDeviceMetrics.avilableSensorIds))) {
            return false;
        }
        boolean j = mo28535j();
        boolean j2 = mVStaticDeviceMetrics.mo28535j();
        if (!j && !j2) {
            return true;
        }
        if (!j || !j2 || !this.display.mo28442a(mVStaticDeviceMetrics.display)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVStaticDeviceMetrics mVStaticDeviceMetrics = (MVStaticDeviceMetrics) obj;
        if (!getClass().equals(mVStaticDeviceMetrics.getClass())) {
            return getClass().getName().compareTo(mVStaticDeviceMetrics.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28531g()).compareTo(Boolean.valueOf(mVStaticDeviceMetrics.mo28531g()));
        if (compareTo2 != 0 || ((mo28531g() && (compareTo2 = this.device.compareTo(mVStaticDeviceMetrics.device)) != 0) || (compareTo2 = Boolean.valueOf(mo28534i()).compareTo(Boolean.valueOf(mVStaticDeviceMetrics.mo28534i()))) != 0 || ((mo28534i() && (compareTo2 = this.deviceModel.compareTo(mVStaticDeviceMetrics.deviceModel)) != 0) || (compareTo2 = Boolean.valueOf(mo28536k()).compareTo(Boolean.valueOf(mVStaticDeviceMetrics.mo28536k()))) != 0 || ((mo28536k() && (compareTo2 = this.displayBuildId.compareTo(mVStaticDeviceMetrics.displayBuildId)) != 0) || (compareTo2 = Boolean.valueOf(mo28532h()).compareTo(Boolean.valueOf(mVStaticDeviceMetrics.mo28532h()))) != 0 || ((mo28532h() && (compareTo2 = this.deviceManufacturer.compareTo(mVStaticDeviceMetrics.deviceManufacturer)) != 0) || (compareTo2 = Boolean.valueOf(mo28541q()).compareTo(Boolean.valueOf(mVStaticDeviceMetrics.mo28541q()))) != 0 || ((mo28541q() && (compareTo2 = C25082a.m62844h(this.supportedAbis, mVStaticDeviceMetrics.supportedAbis)) != 0) || (compareTo2 = Boolean.valueOf(mo28540p()).compareTo(Boolean.valueOf(mVStaticDeviceMetrics.mo28540p()))) != 0 || ((mo28540p() && (compareTo2 = C25082a.m62839c(this.runtimeAvailableProcessors, mVStaticDeviceMetrics.runtimeAvailableProcessors)) != 0) || (compareTo2 = Boolean.valueOf(mo28542r()).compareTo(Boolean.valueOf(mVStaticDeviceMetrics.mo28542r()))) != 0 || ((mo28542r() && (compareTo2 = C25082a.m62840d(this.totalMemory, mVStaticDeviceMetrics.totalMemory)) != 0) || (compareTo2 = Boolean.valueOf(mo28539o()).compareTo(Boolean.valueOf(mVStaticDeviceMetrics.mo28539o()))) != 0 || ((mo28539o() && (compareTo2 = C25082a.m62840d(this.lowThreshouldMemory, mVStaticDeviceMetrics.lowThreshouldMemory)) != 0) || (compareTo2 = Boolean.valueOf(mo28538m()).compareTo(Boolean.valueOf(mVStaticDeviceMetrics.mo28538m()))) != 0 || ((mo28538m() && (compareTo2 = C25082a.m62840d(this.internalTotalBytes, mVStaticDeviceMetrics.internalTotalBytes)) != 0) || (compareTo2 = Boolean.valueOf(mo28537l()).compareTo(Boolean.valueOf(mVStaticDeviceMetrics.mo28537l()))) != 0 || ((mo28537l() && (compareTo2 = C25082a.m62840d(this.externalTotalBytes, mVStaticDeviceMetrics.externalTotalBytes)) != 0) || (compareTo2 = Boolean.valueOf(mo28530f()).compareTo(Boolean.valueOf(mVStaticDeviceMetrics.mo28530f()))) != 0 || ((mo28530f() && (compareTo2 = C25082a.m62844h(this.avilableSensorIds, mVStaticDeviceMetrics.avilableSensorIds)) != 0) || (compareTo2 = Boolean.valueOf(mo28535j()).compareTo(Boolean.valueOf(mVStaticDeviceMetrics.mo28535j()))) != 0)))))))))))) {
            return compareTo2;
        }
        if (!mo28535j() || (compareTo = this.display.compareTo(mVStaticDeviceMetrics.display)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVStaticDeviceMetrics)) {
            return mo28527a((MVStaticDeviceMetrics) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28530f() {
        return this.avilableSensorIds != null;
    }

    /* renamed from: g */
    public final boolean mo28531g() {
        return this.device != null;
    }

    /* renamed from: h */
    public final boolean mo28532h() {
        return this.deviceManufacturer != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28534i() {
        return this.deviceModel != null;
    }

    /* renamed from: j */
    public final boolean mo28535j() {
        return this.display != null;
    }

    /* renamed from: k */
    public final boolean mo28536k() {
        return this.displayBuildId != null;
    }

    /* renamed from: l */
    public final boolean mo28537l() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: m */
    public final boolean mo28538m() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: o */
    public final boolean mo28539o() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: p */
    public final boolean mo28540p() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: q */
    public final boolean mo28541q() {
        return this.supportedAbis != null;
    }

    /* renamed from: r */
    public final boolean mo28542r() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: s */
    public final void mo28543s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: t */
    public final void mo28544t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStaticDeviceMetrics(", "device:");
        String str = this.device;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("deviceModel:");
        String str2 = this.deviceModel;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("displayBuildId:");
        String str3 = this.displayBuildId;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("deviceManufacturer:");
        String str4 = this.deviceManufacturer;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("supportedAbis:");
        List<String> list = this.supportedAbis;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("runtimeAvailableProcessors:");
        C0016g.m42z(n, this.runtimeAvailableProcessors, ", ", "totalMemory:");
        C25541a.m63889t(n, this.totalMemory, ", ", "lowThreshouldMemory:");
        C25541a.m63889t(n, this.lowThreshouldMemory, ", ", "internalTotalBytes:");
        C25541a.m63889t(n, this.internalTotalBytes, ", ", "externalTotalBytes:");
        C25541a.m63889t(n, this.externalTotalBytes, ", ", "avilableSensorIds:");
        List<Integer> list2 = this.avilableSensorIds;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("display:");
        MVDisplayMetrics mVDisplayMetrics = this.display;
        if (mVDisplayMetrics == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDisplayMetrics);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo28546u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: v */
    public final void mo28547v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: w */
    public final void mo28548w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }
}
