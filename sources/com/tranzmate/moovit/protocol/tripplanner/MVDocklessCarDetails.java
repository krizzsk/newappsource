package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVDocklessCarDetails implements TBase<MVDocklessCarDetails, _Fields>, Serializable, Cloneable, Comparable<MVDocklessCarDetails> {

    /* renamed from: b */
    public static final C25113c f29876b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29877c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29878d = new C25113c(ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL, (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f29879e = new C25113c("numOfSeats", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f29880f = new C25113c("drivingRate", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f29881g = new C25113c("fuelLevel", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f29882h = new C25113c("operatorName", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f29883i = new C25113c("largeImage", (byte) 12, 8);

    /* renamed from: j */
    public static final C25113c f29884j = new C25113c("mapImage", (byte) 12, 9);

    /* renamed from: k */
    public static final C25113c f29885k = new C25113c("smallImage", (byte) 12, 10);

    /* renamed from: l */
    public static final C25113c f29886l = new C25113c("operatorId", (byte) 8, 11);

    /* renamed from: m */
    public static final C25113c f29887m = new C25113c("serviceId", (byte) 8, 12);

    /* renamed from: n */
    public static final HashMap f29888n;

    /* renamed from: o */
    public static final Map<_Fields, FieldMetaData> f29889o;
    private byte __isset_bitfield = 0;
    public int batteryLevel;
    public String drivingRate;
    public int fuelLevel;

    /* renamed from: id */
    public String f29890id;
    public MVImageReferenceWithParams largeImage;
    public MVImageReferenceWithParams mapImage;
    public String name;
    public int numOfSeats;
    public int operatorId;
    public String operatorName;
    private _Fields[] optionals = {_Fields.BATTERY_LEVEL, _Fields.NUM_OF_SEATS, _Fields.DRIVING_RATE, _Fields.FUEL_LEVEL, _Fields.SERVICE_ID};
    public int serviceId;
    public MVImageReferenceWithParams smallImage;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        NAME(2, "name"),
        BATTERY_LEVEL(3, ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL),
        NUM_OF_SEATS(4, "numOfSeats"),
        DRIVING_RATE(5, "drivingRate"),
        FUEL_LEVEL(6, "fuelLevel"),
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
                    return ID;
                case 2:
                    return NAME;
                case 3:
                    return BATTERY_LEVEL;
                case 4:
                    return NUM_OF_SEATS;
                case 5:
                    return DRIVING_RATE;
                case 6:
                    return FUEL_LEVEL;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVDocklessCarDetails$a */
    public static class C11521a extends C25239c<MVDocklessCarDetails> {
        public C11521a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessCarDetails mVDocklessCarDetails = (MVDocklessCarDetails) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVDocklessCarDetails.largeImage;
            C25113c cVar = MVDocklessCarDetails.f29876b;
            gVar.mo61687K();
            if (mVDocklessCarDetails.f29890id != null) {
                gVar.mo61711x(MVDocklessCarDetails.f29876b);
                gVar.mo61686J(mVDocklessCarDetails.f29890id);
                gVar.mo61712y();
            }
            if (mVDocklessCarDetails.name != null) {
                gVar.mo61711x(MVDocklessCarDetails.f29877c);
                gVar.mo61686J(mVDocklessCarDetails.name);
                gVar.mo61712y();
            }
            if (mVDocklessCarDetails.mo34237f()) {
                gVar.mo61711x(MVDocklessCarDetails.f29878d);
                gVar.mo61678B(mVDocklessCarDetails.batteryLevel);
                gVar.mo61712y();
            }
            if (mVDocklessCarDetails.mo34245m()) {
                gVar.mo61711x(MVDocklessCarDetails.f29879e);
                gVar.mo61678B(mVDocklessCarDetails.numOfSeats);
                gVar.mo61712y();
            }
            if (mVDocklessCarDetails.drivingRate != null && mVDocklessCarDetails.mo34238g()) {
                gVar.mo61711x(MVDocklessCarDetails.f29880f);
                gVar.mo61686J(mVDocklessCarDetails.drivingRate);
                gVar.mo61712y();
            }
            if (mVDocklessCarDetails.mo34239h()) {
                gVar.mo61711x(MVDocklessCarDetails.f29881g);
                gVar.mo61678B(mVDocklessCarDetails.fuelLevel);
                gVar.mo61712y();
            }
            if (mVDocklessCarDetails.operatorName != null) {
                gVar.mo61711x(MVDocklessCarDetails.f29882h);
                gVar.mo61686J(mVDocklessCarDetails.operatorName);
                gVar.mo61712y();
            }
            if (mVDocklessCarDetails.largeImage != null) {
                gVar.mo61711x(MVDocklessCarDetails.f29883i);
                mVDocklessCarDetails.largeImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDocklessCarDetails.mapImage != null) {
                gVar.mo61711x(MVDocklessCarDetails.f29884j);
                mVDocklessCarDetails.mapImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDocklessCarDetails.smallImage != null) {
                gVar.mo61711x(MVDocklessCarDetails.f29885k);
                mVDocklessCarDetails.smallImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDocklessCarDetails.f29886l);
            gVar.mo61678B(mVDocklessCarDetails.operatorId);
            gVar.mo61712y();
            if (mVDocklessCarDetails.mo34248q()) {
                gVar.mo61711x(MVDocklessCarDetails.f29887m);
                gVar.mo61678B(mVDocklessCarDetails.serviceId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessCarDetails mVDocklessCarDetails = (MVDocklessCarDetails) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVDocklessCarDetails.largeImage;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCarDetails.f29890id = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCarDetails.name = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCarDetails.batteryLevel = gVar.mo61696i();
                            mVDocklessCarDetails.mo34250s();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCarDetails.numOfSeats = gVar.mo61696i();
                            mVDocklessCarDetails.mo34253u();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCarDetails.drivingRate = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCarDetails.fuelLevel = gVar.mo61696i();
                            mVDocklessCarDetails.mo34251t();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCarDetails.operatorName = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVDocklessCarDetails.largeImage = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams3 = new MVImageReferenceWithParams();
                            mVDocklessCarDetails.mapImage = mVImageReferenceWithParams3;
                            mVImageReferenceWithParams3.mo25201C1(gVar);
                            break;
                        }
                    case 10:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams4 = new MVImageReferenceWithParams();
                            mVDocklessCarDetails.smallImage = mVImageReferenceWithParams4;
                            mVImageReferenceWithParams4.mo25201C1(gVar);
                            break;
                        }
                    case 11:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCarDetails.operatorId = gVar.mo61696i();
                            mVDocklessCarDetails.mo34254v();
                            break;
                        }
                    case 12:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCarDetails.serviceId = gVar.mo61696i();
                            mVDocklessCarDetails.mo34255w();
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVDocklessCarDetails$b */
    public static class C11522b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11521a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVDocklessCarDetails$c */
    public static class C11523c extends C25240d<MVDocklessCarDetails> {
        public C11523c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessCarDetails mVDocklessCarDetails = (MVDocklessCarDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDocklessCarDetails.mo34241i()) {
                bitSet.set(0);
            }
            if (mVDocklessCarDetails.mo34244l()) {
                bitSet.set(1);
            }
            if (mVDocklessCarDetails.mo34237f()) {
                bitSet.set(2);
            }
            if (mVDocklessCarDetails.mo34245m()) {
                bitSet.set(3);
            }
            if (mVDocklessCarDetails.mo34238g()) {
                bitSet.set(4);
            }
            if (mVDocklessCarDetails.mo34239h()) {
                bitSet.set(5);
            }
            if (mVDocklessCarDetails.mo34247p()) {
                bitSet.set(6);
            }
            if (mVDocklessCarDetails.mo34242j()) {
                bitSet.set(7);
            }
            if (mVDocklessCarDetails.mo34243k()) {
                bitSet.set(8);
            }
            if (mVDocklessCarDetails.mo34249r()) {
                bitSet.set(9);
            }
            if (mVDocklessCarDetails.mo34246o()) {
                bitSet.set(10);
            }
            if (mVDocklessCarDetails.mo34248q()) {
                bitSet.set(11);
            }
            jVar.mo61738U(bitSet, 12);
            if (mVDocklessCarDetails.mo34241i()) {
                jVar.mo61686J(mVDocklessCarDetails.f29890id);
            }
            if (mVDocklessCarDetails.mo34244l()) {
                jVar.mo61686J(mVDocklessCarDetails.name);
            }
            if (mVDocklessCarDetails.mo34237f()) {
                jVar.mo61678B(mVDocklessCarDetails.batteryLevel);
            }
            if (mVDocklessCarDetails.mo34245m()) {
                jVar.mo61678B(mVDocklessCarDetails.numOfSeats);
            }
            if (mVDocklessCarDetails.mo34238g()) {
                jVar.mo61686J(mVDocklessCarDetails.drivingRate);
            }
            if (mVDocklessCarDetails.mo34239h()) {
                jVar.mo61678B(mVDocklessCarDetails.fuelLevel);
            }
            if (mVDocklessCarDetails.mo34247p()) {
                jVar.mo61686J(mVDocklessCarDetails.operatorName);
            }
            if (mVDocklessCarDetails.mo34242j()) {
                mVDocklessCarDetails.largeImage.mo25202X0(jVar);
            }
            if (mVDocklessCarDetails.mo34243k()) {
                mVDocklessCarDetails.mapImage.mo25202X0(jVar);
            }
            if (mVDocklessCarDetails.mo34249r()) {
                mVDocklessCarDetails.smallImage.mo25202X0(jVar);
            }
            if (mVDocklessCarDetails.mo34246o()) {
                jVar.mo61678B(mVDocklessCarDetails.operatorId);
            }
            if (mVDocklessCarDetails.mo34248q()) {
                jVar.mo61678B(mVDocklessCarDetails.serviceId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessCarDetails mVDocklessCarDetails = (MVDocklessCarDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(12);
            if (T.get(0)) {
                mVDocklessCarDetails.f29890id = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVDocklessCarDetails.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVDocklessCarDetails.batteryLevel = jVar.mo61696i();
                mVDocklessCarDetails.mo34250s();
            }
            if (T.get(3)) {
                mVDocklessCarDetails.numOfSeats = jVar.mo61696i();
                mVDocklessCarDetails.mo34253u();
            }
            if (T.get(4)) {
                mVDocklessCarDetails.drivingRate = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVDocklessCarDetails.fuelLevel = jVar.mo61696i();
                mVDocklessCarDetails.mo34251t();
            }
            if (T.get(6)) {
                mVDocklessCarDetails.operatorName = jVar.mo61704q();
            }
            if (T.get(7)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVDocklessCarDetails.largeImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(8)) {
                MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                mVDocklessCarDetails.mapImage = mVImageReferenceWithParams2;
                mVImageReferenceWithParams2.mo25201C1(jVar);
            }
            if (T.get(9)) {
                MVImageReferenceWithParams mVImageReferenceWithParams3 = new MVImageReferenceWithParams();
                mVDocklessCarDetails.smallImage = mVImageReferenceWithParams3;
                mVImageReferenceWithParams3.mo25201C1(jVar);
            }
            if (T.get(10)) {
                mVDocklessCarDetails.operatorId = jVar.mo61696i();
                mVDocklessCarDetails.mo34254v();
            }
            if (T.get(11)) {
                mVDocklessCarDetails.serviceId = jVar.mo61696i();
                mVDocklessCarDetails.mo34255w();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVDocklessCarDetails$d */
    public static class C11524d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11523c(0);
        }
    }

    static {
        new C17394d0("MVDocklessCarDetails");
        HashMap hashMap = new HashMap();
        f29888n = hashMap;
        hashMap.put(C25239c.class, new C11522b());
        hashMap.put(C25240d.class, new C11524d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BATTERY_LEVEL, new FieldMetaData(ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL, (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NUM_OF_SEATS, new FieldMetaData("numOfSeats", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DRIVING_RATE, new FieldMetaData("drivingRate", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FUEL_LEVEL, new FieldMetaData("fuelLevel", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.OPERATOR_NAME, new FieldMetaData("operatorName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LARGE_IMAGE, new FieldMetaData("largeImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.MAP_IMAGE, new FieldMetaData("mapImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.SMALL_IMAGE, new FieldMetaData("smallImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.OPERATOR_ID, new FieldMetaData("operatorId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SERVICE_ID, new FieldMetaData("serviceId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29889o = unmodifiableMap;
        FieldMetaData.m61947a(MVDocklessCarDetails.class, unmodifiableMap);
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
        ((C25238b) f29888n.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29888n.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVDocklessCarDetails mVDocklessCarDetails = (MVDocklessCarDetails) obj;
        if (!getClass().equals(mVDocklessCarDetails.getClass())) {
            return getClass().getName().compareTo(mVDocklessCarDetails.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34241i()).compareTo(Boolean.valueOf(mVDocklessCarDetails.mo34241i()));
        if (compareTo != 0 || ((mo34241i() && (compareTo = this.f29890id.compareTo(mVDocklessCarDetails.f29890id)) != 0) || (compareTo = Boolean.valueOf(mo34244l()).compareTo(Boolean.valueOf(mVDocklessCarDetails.mo34244l()))) != 0 || ((mo34244l() && (compareTo = this.name.compareTo(mVDocklessCarDetails.name)) != 0) || (compareTo = Boolean.valueOf(mo34237f()).compareTo(Boolean.valueOf(mVDocklessCarDetails.mo34237f()))) != 0 || ((mo34237f() && (compareTo = C25082a.m62839c(this.batteryLevel, mVDocklessCarDetails.batteryLevel)) != 0) || (compareTo = Boolean.valueOf(mo34245m()).compareTo(Boolean.valueOf(mVDocklessCarDetails.mo34245m()))) != 0 || ((mo34245m() && (compareTo = C25082a.m62839c(this.numOfSeats, mVDocklessCarDetails.numOfSeats)) != 0) || (compareTo = Boolean.valueOf(mo34238g()).compareTo(Boolean.valueOf(mVDocklessCarDetails.mo34238g()))) != 0 || ((mo34238g() && (compareTo = this.drivingRate.compareTo(mVDocklessCarDetails.drivingRate)) != 0) || (compareTo = Boolean.valueOf(mo34239h()).compareTo(Boolean.valueOf(mVDocklessCarDetails.mo34239h()))) != 0 || ((mo34239h() && (compareTo = C25082a.m62839c(this.fuelLevel, mVDocklessCarDetails.fuelLevel)) != 0) || (compareTo = Boolean.valueOf(mo34247p()).compareTo(Boolean.valueOf(mVDocklessCarDetails.mo34247p()))) != 0 || ((mo34247p() && (compareTo = this.operatorName.compareTo(mVDocklessCarDetails.operatorName)) != 0) || (compareTo = Boolean.valueOf(mo34242j()).compareTo(Boolean.valueOf(mVDocklessCarDetails.mo34242j()))) != 0 || ((mo34242j() && (compareTo = this.largeImage.compareTo(mVDocklessCarDetails.largeImage)) != 0) || (compareTo = Boolean.valueOf(mo34243k()).compareTo(Boolean.valueOf(mVDocklessCarDetails.mo34243k()))) != 0 || ((mo34243k() && (compareTo = this.mapImage.compareTo(mVDocklessCarDetails.mapImage)) != 0) || (compareTo = Boolean.valueOf(mo34249r()).compareTo(Boolean.valueOf(mVDocklessCarDetails.mo34249r()))) != 0 || ((mo34249r() && (compareTo = this.smallImage.compareTo(mVDocklessCarDetails.smallImage)) != 0) || (compareTo = Boolean.valueOf(mo34246o()).compareTo(Boolean.valueOf(mVDocklessCarDetails.mo34246o()))) != 0 || ((mo34246o() && (compareTo = C25082a.m62839c(this.operatorId, mVDocklessCarDetails.operatorId)) != 0) || (compareTo = Boolean.valueOf(mo34248q()).compareTo(Boolean.valueOf(mVDocklessCarDetails.mo34248q()))) != 0)))))))))))) {
            return compareTo;
        }
        if (!mo34248q() || (c = C25082a.m62839c(this.serviceId, mVDocklessCarDetails.serviceId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDocklessCarDetails)) {
            return false;
        }
        MVDocklessCarDetails mVDocklessCarDetails = (MVDocklessCarDetails) obj;
        boolean i = mo34241i();
        boolean i2 = mVDocklessCarDetails.mo34241i();
        if ((i || i2) && (!i || !i2 || !this.f29890id.equals(mVDocklessCarDetails.f29890id))) {
            return false;
        }
        boolean l = mo34244l();
        boolean l2 = mVDocklessCarDetails.mo34244l();
        if ((l || l2) && (!l || !l2 || !this.name.equals(mVDocklessCarDetails.name))) {
            return false;
        }
        boolean f = mo34237f();
        boolean f2 = mVDocklessCarDetails.mo34237f();
        if ((f || f2) && (!f || !f2 || this.batteryLevel != mVDocklessCarDetails.batteryLevel)) {
            return false;
        }
        boolean m = mo34245m();
        boolean m2 = mVDocklessCarDetails.mo34245m();
        if ((m || m2) && (!m || !m2 || this.numOfSeats != mVDocklessCarDetails.numOfSeats)) {
            return false;
        }
        boolean g = mo34238g();
        boolean g2 = mVDocklessCarDetails.mo34238g();
        if ((g || g2) && (!g || !g2 || !this.drivingRate.equals(mVDocklessCarDetails.drivingRate))) {
            return false;
        }
        boolean h = mo34239h();
        boolean h2 = mVDocklessCarDetails.mo34239h();
        if ((h || h2) && (!h || !h2 || this.fuelLevel != mVDocklessCarDetails.fuelLevel)) {
            return false;
        }
        boolean p = mo34247p();
        boolean p2 = mVDocklessCarDetails.mo34247p();
        if ((p || p2) && (!p || !p2 || !this.operatorName.equals(mVDocklessCarDetails.operatorName))) {
            return false;
        }
        boolean j = mo34242j();
        boolean j2 = mVDocklessCarDetails.mo34242j();
        if ((j || j2) && (!j || !j2 || !this.largeImage.mo26245a(mVDocklessCarDetails.largeImage))) {
            return false;
        }
        boolean k = mo34243k();
        boolean k2 = mVDocklessCarDetails.mo34243k();
        if ((k || k2) && (!k || !k2 || !this.mapImage.mo26245a(mVDocklessCarDetails.mapImage))) {
            return false;
        }
        boolean r = mo34249r();
        boolean r2 = mVDocklessCarDetails.mo34249r();
        if (((r || r2) && (!r || !r2 || !this.smallImage.mo26245a(mVDocklessCarDetails.smallImage))) || this.operatorId != mVDocklessCarDetails.operatorId) {
            return false;
        }
        boolean q = mo34248q();
        boolean q2 = mVDocklessCarDetails.mo34248q();
        if ((q || q2) && (!q || !q2 || this.serviceId != mVDocklessCarDetails.serviceId)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34237f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34238g() {
        return this.drivingRate != null;
    }

    /* renamed from: h */
    public final boolean mo34239h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34241i() {
        return this.f29890id != null;
    }

    /* renamed from: j */
    public final boolean mo34242j() {
        return this.largeImage != null;
    }

    /* renamed from: k */
    public final boolean mo34243k() {
        return this.mapImage != null;
    }

    /* renamed from: l */
    public final boolean mo34244l() {
        return this.name != null;
    }

    /* renamed from: m */
    public final boolean mo34245m() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: o */
    public final boolean mo34246o() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: p */
    public final boolean mo34247p() {
        return this.operatorName != null;
    }

    /* renamed from: q */
    public final boolean mo34248q() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: r */
    public final boolean mo34249r() {
        return this.smallImage != null;
    }

    /* renamed from: s */
    public final void mo34250s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: t */
    public final void mo34251t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDocklessCarDetails(", "id:");
        String str = this.f29890id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("name:");
        String str2 = this.name;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo34237f()) {
            n.append(", ");
            n.append("batteryLevel:");
            n.append(this.batteryLevel);
        }
        if (mo34245m()) {
            n.append(", ");
            n.append("numOfSeats:");
            n.append(this.numOfSeats);
        }
        if (mo34238g()) {
            n.append(", ");
            n.append("drivingRate:");
            String str3 = this.drivingRate;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo34239h()) {
            n.append(", ");
            n.append("fuelLevel:");
            n.append(this.fuelLevel);
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
        if (mo34248q()) {
            n.append(", ");
            n.append("serviceId:");
            n.append(this.serviceId);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo34253u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: v */
    public final void mo34254v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: w */
    public final void mo34255w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }
}
