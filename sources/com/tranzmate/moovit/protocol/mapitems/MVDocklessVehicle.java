package com.tranzmate.moovit.protocol.mapitems;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVDocklessVehicle implements TBase<MVDocklessVehicle, _Fields>, Serializable, Cloneable, Comparable<MVDocklessVehicle> {

    /* renamed from: b */
    public static final C25113c f26291b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26292c = new C25113c("vehicleName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26293d = new C25113c(ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL, (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26294e = new C25113c("numOfHelmets", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f26295f = new C25113c("drivingRate", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f26296g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26297h;
    private byte __isset_bitfield = 0;
    public int batteryLevel;
    public String drivingRate;
    public int numOfHelmets;
    private _Fields[] optionals = {_Fields.BATTERY_LEVEL, _Fields.NUM_OF_HELMETS, _Fields.DRIVING_RATE};
    public MVDocklessVehicleType type;
    public String vehicleName;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        VEHICLE_NAME(2, "vehicleName"),
        BATTERY_LEVEL(3, ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL),
        NUM_OF_HELMETS(4, "numOfHelmets"),
        DRIVING_RATE(5, "drivingRate");
        
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
            if (i == 1) {
                return TYPE;
            }
            if (i == 2) {
                return VEHICLE_NAME;
            }
            if (i == 3) {
                return BATTERY_LEVEL;
            }
            if (i == 4) {
                return NUM_OF_HELMETS;
            }
            if (i != 5) {
                return null;
            }
            return DRIVING_RATE;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicle$a */
    public static class C9089a extends C25239c<MVDocklessVehicle> {
        public C9089a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessVehicle mVDocklessVehicle = (MVDocklessVehicle) tBase;
            mVDocklessVehicle.getClass();
            C25113c cVar = MVDocklessVehicle.f26291b;
            gVar.mo61687K();
            if (mVDocklessVehicle.type != null) {
                gVar.mo61711x(MVDocklessVehicle.f26291b);
                gVar.mo61678B(mVDocklessVehicle.type.getValue());
                gVar.mo61712y();
            }
            if (mVDocklessVehicle.vehicleName != null) {
                gVar.mo61711x(MVDocklessVehicle.f26292c);
                gVar.mo61686J(mVDocklessVehicle.vehicleName);
                gVar.mo61712y();
            }
            if (mVDocklessVehicle.mo28290f()) {
                gVar.mo61711x(MVDocklessVehicle.f26293d);
                gVar.mo61678B(mVDocklessVehicle.batteryLevel);
                gVar.mo61712y();
            }
            if (mVDocklessVehicle.mo28292h()) {
                gVar.mo61711x(MVDocklessVehicle.f26294e);
                gVar.mo61678B(mVDocklessVehicle.numOfHelmets);
                gVar.mo61712y();
            }
            if (mVDocklessVehicle.drivingRate != null && mVDocklessVehicle.mo28291g()) {
                gVar.mo61711x(MVDocklessVehicle.f26295f);
                gVar.mo61686J(mVDocklessVehicle.drivingRate);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessVehicle mVDocklessVehicle = (MVDocklessVehicle) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDocklessVehicle.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVDocklessVehicle.drivingRate = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVDocklessVehicle.numOfHelmets = gVar.mo61696i();
                                mVDocklessVehicle.mo28297l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVDocklessVehicle.batteryLevel = gVar.mo61696i();
                            mVDocklessVehicle.mo28296k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVDocklessVehicle.vehicleName = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVDocklessVehicle.type = MVDocklessVehicleType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicle$b */
    public static class C9090b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9089a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicle$c */
    public static class C9091c extends C25240d<MVDocklessVehicle> {
        public C9091c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessVehicle mVDocklessVehicle = (MVDocklessVehicle) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDocklessVehicle.mo28294i()) {
                bitSet.set(0);
            }
            if (mVDocklessVehicle.mo28295j()) {
                bitSet.set(1);
            }
            if (mVDocklessVehicle.mo28290f()) {
                bitSet.set(2);
            }
            if (mVDocklessVehicle.mo28292h()) {
                bitSet.set(3);
            }
            if (mVDocklessVehicle.mo28291g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVDocklessVehicle.mo28294i()) {
                jVar.mo61678B(mVDocklessVehicle.type.getValue());
            }
            if (mVDocklessVehicle.mo28295j()) {
                jVar.mo61686J(mVDocklessVehicle.vehicleName);
            }
            if (mVDocklessVehicle.mo28290f()) {
                jVar.mo61678B(mVDocklessVehicle.batteryLevel);
            }
            if (mVDocklessVehicle.mo28292h()) {
                jVar.mo61678B(mVDocklessVehicle.numOfHelmets);
            }
            if (mVDocklessVehicle.mo28291g()) {
                jVar.mo61686J(mVDocklessVehicle.drivingRate);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessVehicle mVDocklessVehicle = (MVDocklessVehicle) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVDocklessVehicle.type = MVDocklessVehicleType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVDocklessVehicle.vehicleName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVDocklessVehicle.batteryLevel = jVar.mo61696i();
                mVDocklessVehicle.mo28296k();
            }
            if (T.get(3)) {
                mVDocklessVehicle.numOfHelmets = jVar.mo61696i();
                mVDocklessVehicle.mo28297l();
            }
            if (T.get(4)) {
                mVDocklessVehicle.drivingRate = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicle$d */
    public static class C9092d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9091c(0);
        }
    }

    static {
        new C17394d0("MVDocklessVehicle");
        HashMap hashMap = new HashMap();
        f26296g = hashMap;
        hashMap.put(C25239c.class, new C9090b());
        hashMap.put(C25240d.class, new C9092d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVDocklessVehicleType.class)));
        enumMap.put(_Fields.VEHICLE_NAME, new FieldMetaData("vehicleName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BATTERY_LEVEL, new FieldMetaData(ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL, (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NUM_OF_HELMETS, new FieldMetaData("numOfHelmets", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DRIVING_RATE, new FieldMetaData("drivingRate", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26297h = unmodifiableMap;
        FieldMetaData.m61947a(MVDocklessVehicle.class, unmodifiableMap);
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
        ((C25238b) f26296g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26296g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDocklessVehicle mVDocklessVehicle = (MVDocklessVehicle) obj;
        if (!getClass().equals(mVDocklessVehicle.getClass())) {
            return getClass().getName().compareTo(mVDocklessVehicle.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28294i()).compareTo(Boolean.valueOf(mVDocklessVehicle.mo28294i()));
        if (compareTo2 != 0 || ((mo28294i() && (compareTo2 = this.type.compareTo(mVDocklessVehicle.type)) != 0) || (compareTo2 = Boolean.valueOf(mo28295j()).compareTo(Boolean.valueOf(mVDocklessVehicle.mo28295j()))) != 0 || ((mo28295j() && (compareTo2 = this.vehicleName.compareTo(mVDocklessVehicle.vehicleName)) != 0) || (compareTo2 = Boolean.valueOf(mo28290f()).compareTo(Boolean.valueOf(mVDocklessVehicle.mo28290f()))) != 0 || ((mo28290f() && (compareTo2 = C25082a.m62839c(this.batteryLevel, mVDocklessVehicle.batteryLevel)) != 0) || (compareTo2 = Boolean.valueOf(mo28292h()).compareTo(Boolean.valueOf(mVDocklessVehicle.mo28292h()))) != 0 || ((mo28292h() && (compareTo2 = C25082a.m62839c(this.numOfHelmets, mVDocklessVehicle.numOfHelmets)) != 0) || (compareTo2 = Boolean.valueOf(mo28291g()).compareTo(Boolean.valueOf(mVDocklessVehicle.mo28291g()))) != 0))))) {
            return compareTo2;
        }
        if (!mo28291g() || (compareTo = this.drivingRate.compareTo(mVDocklessVehicle.drivingRate)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDocklessVehicle)) {
            return false;
        }
        MVDocklessVehicle mVDocklessVehicle = (MVDocklessVehicle) obj;
        boolean i = mo28294i();
        boolean i2 = mVDocklessVehicle.mo28294i();
        if ((i || i2) && (!i || !i2 || !this.type.equals(mVDocklessVehicle.type))) {
            return false;
        }
        boolean j = mo28295j();
        boolean j2 = mVDocklessVehicle.mo28295j();
        if ((j || j2) && (!j || !j2 || !this.vehicleName.equals(mVDocklessVehicle.vehicleName))) {
            return false;
        }
        boolean f = mo28290f();
        boolean f2 = mVDocklessVehicle.mo28290f();
        if ((f || f2) && (!f || !f2 || this.batteryLevel != mVDocklessVehicle.batteryLevel)) {
            return false;
        }
        boolean h = mo28292h();
        boolean h2 = mVDocklessVehicle.mo28292h();
        if ((h || h2) && (!h || !h2 || this.numOfHelmets != mVDocklessVehicle.numOfHelmets)) {
            return false;
        }
        boolean g = mo28291g();
        boolean g2 = mVDocklessVehicle.mo28291g();
        if ((g || g2) && (!g || !g2 || !this.drivingRate.equals(mVDocklessVehicle.drivingRate))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28290f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo28291g() {
        return this.drivingRate != null;
    }

    /* renamed from: h */
    public final boolean mo28292h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28294i() {
        return this.type != null;
    }

    /* renamed from: j */
    public final boolean mo28295j() {
        return this.vehicleName != null;
    }

    /* renamed from: k */
    public final void mo28296k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo28297l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDocklessVehicle(", "type:");
        MVDocklessVehicleType mVDocklessVehicleType = this.type;
        if (mVDocklessVehicleType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDocklessVehicleType);
        }
        n.append(", ");
        n.append("vehicleName:");
        String str = this.vehicleName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo28290f()) {
            n.append(", ");
            n.append("batteryLevel:");
            n.append(this.batteryLevel);
        }
        if (mo28292h()) {
            n.append(", ");
            n.append("numOfHelmets:");
            n.append(this.numOfHelmets);
        }
        if (mo28291g()) {
            n.append(", ");
            n.append("drivingRate:");
            String str2 = this.drivingRate;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
