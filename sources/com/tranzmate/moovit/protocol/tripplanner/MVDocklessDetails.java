package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
import com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType;
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

public class MVDocklessDetails implements TBase<MVDocklessDetails, _Fields>, Serializable, Cloneable, Comparable<MVDocklessDetails> {

    /* renamed from: b */
    public static final C25113c f29892b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29893c = new C25113c("id", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29894d = new C25113c("vehicleName", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29895e = new C25113c(ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL, (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f29896f = new C25113c("numOfHelmets", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f29897g = new C25113c("drivingRate", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f29898h = new C25113c("operatorName", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f29899i = new C25113c("largeImage", (byte) 12, 8);

    /* renamed from: j */
    public static final C25113c f29900j = new C25113c("mapImage", (byte) 12, 9);

    /* renamed from: k */
    public static final C25113c f29901k = new C25113c("smallImage", (byte) 12, 10);

    /* renamed from: l */
    public static final C25113c f29902l = new C25113c("operatorId", (byte) 8, 11);

    /* renamed from: m */
    public static final C25113c f29903m = new C25113c("serviceId", (byte) 8, 12);

    /* renamed from: n */
    public static final HashMap f29904n;

    /* renamed from: o */
    public static final Map<_Fields, FieldMetaData> f29905o;
    private byte __isset_bitfield = 0;
    public int batteryLevel;
    public String drivingRate;

    /* renamed from: id */
    public String f29906id;
    public MVImageReferenceWithParams largeImage;
    public MVImageReferenceWithParams mapImage;
    public int numOfHelmets;
    public int operatorId;
    public String operatorName;
    private _Fields[] optionals = {_Fields.BATTERY_LEVEL, _Fields.NUM_OF_HELMETS, _Fields.DRIVING_RATE, _Fields.SERVICE_ID};
    public int serviceId;
    public MVImageReferenceWithParams smallImage;
    public MVDocklessVehicleType type;
    public String vehicleName;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        ID(2, "id"),
        VEHICLE_NAME(3, "vehicleName"),
        BATTERY_LEVEL(4, ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL),
        NUM_OF_HELMETS(5, "numOfHelmets"),
        DRIVING_RATE(6, "drivingRate"),
        OPERATOR_NAME(7, "operatorName"),
        LARGE_IMAGE(8, "largeImage"),
        MAP_IMAGE(9, "mapImage"),
        SMALL_IMAGE(10, "smallImage"),
        OPERATOR_ID(11, "operatorId"),
        SERVICE_ID(12, "serviceId");
        
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
                    return TYPE;
                case 2:
                    return ID;
                case 3:
                    return VEHICLE_NAME;
                case 4:
                    return BATTERY_LEVEL;
                case 5:
                    return NUM_OF_HELMETS;
                case 6:
                    return DRIVING_RATE;
                case 7:
                    return OPERATOR_NAME;
                case 8:
                    return LARGE_IMAGE;
                case 9:
                    return MAP_IMAGE;
                case 10:
                    return SMALL_IMAGE;
                case 11:
                    return OPERATOR_ID;
                case 12:
                    return SERVICE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVDocklessDetails$a */
    public static class C11525a extends C25239c<MVDocklessDetails> {
        public C11525a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessDetails mVDocklessDetails = (MVDocklessDetails) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVDocklessDetails.largeImage;
            C25113c cVar = MVDocklessDetails.f29892b;
            gVar.mo61687K();
            if (mVDocklessDetails.type != null) {
                gVar.mo61711x(MVDocklessDetails.f29892b);
                gVar.mo61678B(mVDocklessDetails.type.getValue());
                gVar.mo61712y();
            }
            if (mVDocklessDetails.f29906id != null) {
                gVar.mo61711x(MVDocklessDetails.f29893c);
                gVar.mo61686J(mVDocklessDetails.f29906id);
                gVar.mo61712y();
            }
            if (mVDocklessDetails.vehicleName != null) {
                gVar.mo61711x(MVDocklessDetails.f29894d);
                gVar.mo61686J(mVDocklessDetails.vehicleName);
                gVar.mo61712y();
            }
            if (mVDocklessDetails.mo34259f()) {
                gVar.mo61711x(MVDocklessDetails.f29895e);
                gVar.mo61678B(mVDocklessDetails.batteryLevel);
                gVar.mo61712y();
            }
            if (mVDocklessDetails.mo34265k()) {
                gVar.mo61711x(MVDocklessDetails.f29896f);
                gVar.mo61678B(mVDocklessDetails.numOfHelmets);
                gVar.mo61712y();
            }
            if (mVDocklessDetails.drivingRate != null && mVDocklessDetails.mo34260g()) {
                gVar.mo61711x(MVDocklessDetails.f29897g);
                gVar.mo61686J(mVDocklessDetails.drivingRate);
                gVar.mo61712y();
            }
            if (mVDocklessDetails.operatorName != null) {
                gVar.mo61711x(MVDocklessDetails.f29898h);
                gVar.mo61686J(mVDocklessDetails.operatorName);
                gVar.mo61712y();
            }
            if (mVDocklessDetails.largeImage != null) {
                gVar.mo61711x(MVDocklessDetails.f29899i);
                mVDocklessDetails.largeImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDocklessDetails.mapImage != null) {
                gVar.mo61711x(MVDocklessDetails.f29900j);
                mVDocklessDetails.mapImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDocklessDetails.smallImage != null) {
                gVar.mo61711x(MVDocklessDetails.f29901k);
                mVDocklessDetails.smallImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDocklessDetails.f29902l);
            gVar.mo61678B(mVDocklessDetails.operatorId);
            gVar.mo61712y();
            if (mVDocklessDetails.mo34268o()) {
                gVar.mo61711x(MVDocklessDetails.f29903m);
                gVar.mo61678B(mVDocklessDetails.serviceId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessDetails mVDocklessDetails = (MVDocklessDetails) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVDocklessDetails.largeImage;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessDetails.type = MVDocklessVehicleType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessDetails.f29906id = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessDetails.vehicleName = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessDetails.batteryLevel = gVar.mo61696i();
                            mVDocklessDetails.mo34272s();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessDetails.numOfHelmets = gVar.mo61696i();
                            mVDocklessDetails.mo34273t();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessDetails.drivingRate = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessDetails.operatorName = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVDocklessDetails.largeImage = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams3 = new MVImageReferenceWithParams();
                            mVDocklessDetails.mapImage = mVImageReferenceWithParams3;
                            mVImageReferenceWithParams3.mo25201C1(gVar);
                            break;
                        }
                    case 10:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams4 = new MVImageReferenceWithParams();
                            mVDocklessDetails.smallImage = mVImageReferenceWithParams4;
                            mVImageReferenceWithParams4.mo25201C1(gVar);
                            break;
                        }
                    case 11:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessDetails.operatorId = gVar.mo61696i();
                            mVDocklessDetails.mo34275u();
                            break;
                        }
                    case 12:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessDetails.serviceId = gVar.mo61696i();
                            mVDocklessDetails.mo34276v();
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVDocklessDetails$b */
    public static class C11526b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11525a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVDocklessDetails$c */
    public static class C11527c extends C25240d<MVDocklessDetails> {
        public C11527c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessDetails mVDocklessDetails = (MVDocklessDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDocklessDetails.mo34270q()) {
                bitSet.set(0);
            }
            if (mVDocklessDetails.mo34261h()) {
                bitSet.set(1);
            }
            if (mVDocklessDetails.mo34271r()) {
                bitSet.set(2);
            }
            if (mVDocklessDetails.mo34259f()) {
                bitSet.set(3);
            }
            if (mVDocklessDetails.mo34265k()) {
                bitSet.set(4);
            }
            if (mVDocklessDetails.mo34260g()) {
                bitSet.set(5);
            }
            if (mVDocklessDetails.mo34267m()) {
                bitSet.set(6);
            }
            if (mVDocklessDetails.mo34263i()) {
                bitSet.set(7);
            }
            if (mVDocklessDetails.mo34264j()) {
                bitSet.set(8);
            }
            if (mVDocklessDetails.mo34269p()) {
                bitSet.set(9);
            }
            if (mVDocklessDetails.mo34266l()) {
                bitSet.set(10);
            }
            if (mVDocklessDetails.mo34268o()) {
                bitSet.set(11);
            }
            jVar.mo61738U(bitSet, 12);
            if (mVDocklessDetails.mo34270q()) {
                jVar.mo61678B(mVDocklessDetails.type.getValue());
            }
            if (mVDocklessDetails.mo34261h()) {
                jVar.mo61686J(mVDocklessDetails.f29906id);
            }
            if (mVDocklessDetails.mo34271r()) {
                jVar.mo61686J(mVDocklessDetails.vehicleName);
            }
            if (mVDocklessDetails.mo34259f()) {
                jVar.mo61678B(mVDocklessDetails.batteryLevel);
            }
            if (mVDocklessDetails.mo34265k()) {
                jVar.mo61678B(mVDocklessDetails.numOfHelmets);
            }
            if (mVDocklessDetails.mo34260g()) {
                jVar.mo61686J(mVDocklessDetails.drivingRate);
            }
            if (mVDocklessDetails.mo34267m()) {
                jVar.mo61686J(mVDocklessDetails.operatorName);
            }
            if (mVDocklessDetails.mo34263i()) {
                mVDocklessDetails.largeImage.mo25202X0(jVar);
            }
            if (mVDocklessDetails.mo34264j()) {
                mVDocklessDetails.mapImage.mo25202X0(jVar);
            }
            if (mVDocklessDetails.mo34269p()) {
                mVDocklessDetails.smallImage.mo25202X0(jVar);
            }
            if (mVDocklessDetails.mo34266l()) {
                jVar.mo61678B(mVDocklessDetails.operatorId);
            }
            if (mVDocklessDetails.mo34268o()) {
                jVar.mo61678B(mVDocklessDetails.serviceId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessDetails mVDocklessDetails = (MVDocklessDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(12);
            if (T.get(0)) {
                mVDocklessDetails.type = MVDocklessVehicleType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVDocklessDetails.f29906id = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVDocklessDetails.vehicleName = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVDocklessDetails.batteryLevel = jVar.mo61696i();
                mVDocklessDetails.mo34272s();
            }
            if (T.get(4)) {
                mVDocklessDetails.numOfHelmets = jVar.mo61696i();
                mVDocklessDetails.mo34273t();
            }
            if (T.get(5)) {
                mVDocklessDetails.drivingRate = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVDocklessDetails.operatorName = jVar.mo61704q();
            }
            if (T.get(7)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVDocklessDetails.largeImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(8)) {
                MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                mVDocklessDetails.mapImage = mVImageReferenceWithParams2;
                mVImageReferenceWithParams2.mo25201C1(jVar);
            }
            if (T.get(9)) {
                MVImageReferenceWithParams mVImageReferenceWithParams3 = new MVImageReferenceWithParams();
                mVDocklessDetails.smallImage = mVImageReferenceWithParams3;
                mVImageReferenceWithParams3.mo25201C1(jVar);
            }
            if (T.get(10)) {
                mVDocklessDetails.operatorId = jVar.mo61696i();
                mVDocklessDetails.mo34275u();
            }
            if (T.get(11)) {
                mVDocklessDetails.serviceId = jVar.mo61696i();
                mVDocklessDetails.mo34276v();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVDocklessDetails$d */
    public static class C11528d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11527c(0);
        }
    }

    static {
        new C17394d0("MVDocklessDetails");
        HashMap hashMap = new HashMap();
        f29904n = hashMap;
        hashMap.put(C25239c.class, new C11526b());
        hashMap.put(C25240d.class, new C11528d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVDocklessVehicleType.class)));
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VEHICLE_NAME, new FieldMetaData("vehicleName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BATTERY_LEVEL, new FieldMetaData(ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL, (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NUM_OF_HELMETS, new FieldMetaData("numOfHelmets", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DRIVING_RATE, new FieldMetaData("drivingRate", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.OPERATOR_NAME, new FieldMetaData("operatorName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LARGE_IMAGE, new FieldMetaData("largeImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.MAP_IMAGE, new FieldMetaData("mapImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.SMALL_IMAGE, new FieldMetaData("smallImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.OPERATOR_ID, new FieldMetaData("operatorId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SERVICE_ID, new FieldMetaData("serviceId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29905o = unmodifiableMap;
        FieldMetaData.m61947a(MVDocklessDetails.class, unmodifiableMap);
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
        ((C25238b) f29904n.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29904n.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVDocklessDetails mVDocklessDetails = (MVDocklessDetails) obj;
        if (!getClass().equals(mVDocklessDetails.getClass())) {
            return getClass().getName().compareTo(mVDocklessDetails.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34270q()).compareTo(Boolean.valueOf(mVDocklessDetails.mo34270q()));
        if (compareTo != 0 || ((mo34270q() && (compareTo = this.type.compareTo(mVDocklessDetails.type)) != 0) || (compareTo = Boolean.valueOf(mo34261h()).compareTo(Boolean.valueOf(mVDocklessDetails.mo34261h()))) != 0 || ((mo34261h() && (compareTo = this.f29906id.compareTo(mVDocklessDetails.f29906id)) != 0) || (compareTo = Boolean.valueOf(mo34271r()).compareTo(Boolean.valueOf(mVDocklessDetails.mo34271r()))) != 0 || ((mo34271r() && (compareTo = this.vehicleName.compareTo(mVDocklessDetails.vehicleName)) != 0) || (compareTo = Boolean.valueOf(mo34259f()).compareTo(Boolean.valueOf(mVDocklessDetails.mo34259f()))) != 0 || ((mo34259f() && (compareTo = C25082a.m62839c(this.batteryLevel, mVDocklessDetails.batteryLevel)) != 0) || (compareTo = Boolean.valueOf(mo34265k()).compareTo(Boolean.valueOf(mVDocklessDetails.mo34265k()))) != 0 || ((mo34265k() && (compareTo = C25082a.m62839c(this.numOfHelmets, mVDocklessDetails.numOfHelmets)) != 0) || (compareTo = Boolean.valueOf(mo34260g()).compareTo(Boolean.valueOf(mVDocklessDetails.mo34260g()))) != 0 || ((mo34260g() && (compareTo = this.drivingRate.compareTo(mVDocklessDetails.drivingRate)) != 0) || (compareTo = Boolean.valueOf(mo34267m()).compareTo(Boolean.valueOf(mVDocklessDetails.mo34267m()))) != 0 || ((mo34267m() && (compareTo = this.operatorName.compareTo(mVDocklessDetails.operatorName)) != 0) || (compareTo = Boolean.valueOf(mo34263i()).compareTo(Boolean.valueOf(mVDocklessDetails.mo34263i()))) != 0 || ((mo34263i() && (compareTo = this.largeImage.compareTo(mVDocklessDetails.largeImage)) != 0) || (compareTo = Boolean.valueOf(mo34264j()).compareTo(Boolean.valueOf(mVDocklessDetails.mo34264j()))) != 0 || ((mo34264j() && (compareTo = this.mapImage.compareTo(mVDocklessDetails.mapImage)) != 0) || (compareTo = Boolean.valueOf(mo34269p()).compareTo(Boolean.valueOf(mVDocklessDetails.mo34269p()))) != 0 || ((mo34269p() && (compareTo = this.smallImage.compareTo(mVDocklessDetails.smallImage)) != 0) || (compareTo = Boolean.valueOf(mo34266l()).compareTo(Boolean.valueOf(mVDocklessDetails.mo34266l()))) != 0 || ((mo34266l() && (compareTo = C25082a.m62839c(this.operatorId, mVDocklessDetails.operatorId)) != 0) || (compareTo = Boolean.valueOf(mo34268o()).compareTo(Boolean.valueOf(mVDocklessDetails.mo34268o()))) != 0)))))))))))) {
            return compareTo;
        }
        if (!mo34268o() || (c = C25082a.m62839c(this.serviceId, mVDocklessDetails.serviceId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDocklessDetails)) {
            return false;
        }
        MVDocklessDetails mVDocklessDetails = (MVDocklessDetails) obj;
        boolean q = mo34270q();
        boolean q2 = mVDocklessDetails.mo34270q();
        if ((q || q2) && (!q || !q2 || !this.type.equals(mVDocklessDetails.type))) {
            return false;
        }
        boolean h = mo34261h();
        boolean h2 = mVDocklessDetails.mo34261h();
        if ((h || h2) && (!h || !h2 || !this.f29906id.equals(mVDocklessDetails.f29906id))) {
            return false;
        }
        boolean r = mo34271r();
        boolean r2 = mVDocklessDetails.mo34271r();
        if ((r || r2) && (!r || !r2 || !this.vehicleName.equals(mVDocklessDetails.vehicleName))) {
            return false;
        }
        boolean f = mo34259f();
        boolean f2 = mVDocklessDetails.mo34259f();
        if ((f || f2) && (!f || !f2 || this.batteryLevel != mVDocklessDetails.batteryLevel)) {
            return false;
        }
        boolean k = mo34265k();
        boolean k2 = mVDocklessDetails.mo34265k();
        if ((k || k2) && (!k || !k2 || this.numOfHelmets != mVDocklessDetails.numOfHelmets)) {
            return false;
        }
        boolean g = mo34260g();
        boolean g2 = mVDocklessDetails.mo34260g();
        if ((g || g2) && (!g || !g2 || !this.drivingRate.equals(mVDocklessDetails.drivingRate))) {
            return false;
        }
        boolean m = mo34267m();
        boolean m2 = mVDocklessDetails.mo34267m();
        if ((m || m2) && (!m || !m2 || !this.operatorName.equals(mVDocklessDetails.operatorName))) {
            return false;
        }
        boolean i = mo34263i();
        boolean i2 = mVDocklessDetails.mo34263i();
        if ((i || i2) && (!i || !i2 || !this.largeImage.mo26245a(mVDocklessDetails.largeImage))) {
            return false;
        }
        boolean j = mo34264j();
        boolean j2 = mVDocklessDetails.mo34264j();
        if ((j || j2) && (!j || !j2 || !this.mapImage.mo26245a(mVDocklessDetails.mapImage))) {
            return false;
        }
        boolean p = mo34269p();
        boolean p2 = mVDocklessDetails.mo34269p();
        if (((p || p2) && (!p || !p2 || !this.smallImage.mo26245a(mVDocklessDetails.smallImage))) || this.operatorId != mVDocklessDetails.operatorId) {
            return false;
        }
        boolean o = mo34268o();
        boolean o2 = mVDocklessDetails.mo34268o();
        if ((o || o2) && (!o || !o2 || this.serviceId != mVDocklessDetails.serviceId)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34259f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34260g() {
        return this.drivingRate != null;
    }

    /* renamed from: h */
    public final boolean mo34261h() {
        return this.f29906id != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34263i() {
        return this.largeImage != null;
    }

    /* renamed from: j */
    public final boolean mo34264j() {
        return this.mapImage != null;
    }

    /* renamed from: k */
    public final boolean mo34265k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final boolean mo34266l() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: m */
    public final boolean mo34267m() {
        return this.operatorName != null;
    }

    /* renamed from: o */
    public final boolean mo34268o() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: p */
    public final boolean mo34269p() {
        return this.smallImage != null;
    }

    /* renamed from: q */
    public final boolean mo34270q() {
        return this.type != null;
    }

    /* renamed from: r */
    public final boolean mo34271r() {
        return this.vehicleName != null;
    }

    /* renamed from: s */
    public final void mo34272s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: t */
    public final void mo34273t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDocklessDetails(", "type:");
        MVDocklessVehicleType mVDocklessVehicleType = this.type;
        if (mVDocklessVehicleType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDocklessVehicleType);
        }
        n.append(", ");
        n.append("id:");
        String str = this.f29906id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("vehicleName:");
        String str2 = this.vehicleName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo34259f()) {
            n.append(", ");
            n.append("batteryLevel:");
            n.append(this.batteryLevel);
        }
        if (mo34265k()) {
            n.append(", ");
            n.append("numOfHelmets:");
            n.append(this.numOfHelmets);
        }
        if (mo34260g()) {
            n.append(", ");
            n.append("drivingRate:");
            String str3 = this.drivingRate;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(", ");
        n.append("operatorName:");
        String str4 = this.operatorName;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("largeImage:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.largeImage;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(", ");
        n.append("mapImage:");
        MVImageReferenceWithParams mVImageReferenceWithParams2 = this.mapImage;
        if (mVImageReferenceWithParams2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams2);
        }
        n.append(", ");
        n.append("smallImage:");
        MVImageReferenceWithParams mVImageReferenceWithParams3 = this.smallImage;
        if (mVImageReferenceWithParams3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams3);
        }
        n.append(", ");
        n.append("operatorId:");
        n.append(this.operatorId);
        if (mo34268o()) {
            n.append(", ");
            n.append("serviceId:");
            n.append(this.serviceId);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo34275u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: v */
    public final void mo34276v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }
}
