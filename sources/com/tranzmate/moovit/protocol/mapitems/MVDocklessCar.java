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

public class MVDocklessCar implements TBase<MVDocklessCar, _Fields>, Serializable, Cloneable, Comparable<MVDocklessCar> {

    /* renamed from: b */
    public static final C25113c f26274b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26275c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26276d = new C25113c(ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL, (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26277e = new C25113c("numOfSeats", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f26278f = new C25113c("drivingRate", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f26279g = new C25113c("fuelLevel", (byte) 8, 6);

    /* renamed from: h */
    public static final HashMap f26280h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f26281i;
    private byte __isset_bitfield = 0;
    public int batteryLevel;
    public String drivingRate;
    public int fuelLevel;

    /* renamed from: id */
    public String f26282id;
    public String name;
    public int numOfSeats;
    private _Fields[] optionals = {_Fields.BATTERY_LEVEL, _Fields.NUM_OF_SEATS, _Fields.DRIVING_RATE, _Fields.FUEL_LEVEL};

    public enum _Fields implements C25085c {
        ID(1, "id"),
        NAME(2, "name"),
        BATTERY_LEVEL(3, ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL),
        NUM_OF_SEATS(4, "numOfSeats"),
        DRIVING_RATE(5, "drivingRate"),
        FUEL_LEVEL(6, "fuelLevel");
        
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessCar$a */
    public static class C9081a extends C25239c<MVDocklessCar> {
        public C9081a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessCar mVDocklessCar = (MVDocklessCar) tBase;
            mVDocklessCar.getClass();
            C25113c cVar = MVDocklessCar.f26274b;
            gVar.mo61687K();
            if (mVDocklessCar.f26282id != null) {
                gVar.mo61711x(MVDocklessCar.f26274b);
                gVar.mo61686J(mVDocklessCar.f26282id);
                gVar.mo61712y();
            }
            if (mVDocklessCar.name != null) {
                gVar.mo61711x(MVDocklessCar.f26275c);
                gVar.mo61686J(mVDocklessCar.name);
                gVar.mo61712y();
            }
            if (mVDocklessCar.mo28266f()) {
                gVar.mo61711x(MVDocklessCar.f26276d);
                gVar.mo61678B(mVDocklessCar.batteryLevel);
                gVar.mo61712y();
            }
            if (mVDocklessCar.mo28272k()) {
                gVar.mo61711x(MVDocklessCar.f26277e);
                gVar.mo61678B(mVDocklessCar.numOfSeats);
                gVar.mo61712y();
            }
            if (mVDocklessCar.drivingRate != null && mVDocklessCar.mo28267g()) {
                gVar.mo61711x(MVDocklessCar.f26278f);
                gVar.mo61686J(mVDocklessCar.drivingRate);
                gVar.mo61712y();
            }
            if (mVDocklessCar.mo28268h()) {
                gVar.mo61711x(MVDocklessCar.f26279g);
                gVar.mo61678B(mVDocklessCar.fuelLevel);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessCar mVDocklessCar = (MVDocklessCar) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDocklessCar.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCar.f26282id = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCar.name = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCar.batteryLevel = gVar.mo61696i();
                            mVDocklessCar.mo28273l();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCar.numOfSeats = gVar.mo61696i();
                            mVDocklessCar.mo28275o();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCar.drivingRate = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessCar.fuelLevel = gVar.mo61696i();
                            mVDocklessCar.mo28274m();
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessCar$b */
    public static class C9082b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9081a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessCar$c */
    public static class C9083c extends C25240d<MVDocklessCar> {
        public C9083c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessCar mVDocklessCar = (MVDocklessCar) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDocklessCar.mo28270i()) {
                bitSet.set(0);
            }
            if (mVDocklessCar.mo28271j()) {
                bitSet.set(1);
            }
            if (mVDocklessCar.mo28266f()) {
                bitSet.set(2);
            }
            if (mVDocklessCar.mo28272k()) {
                bitSet.set(3);
            }
            if (mVDocklessCar.mo28267g()) {
                bitSet.set(4);
            }
            if (mVDocklessCar.mo28268h()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVDocklessCar.mo28270i()) {
                jVar.mo61686J(mVDocklessCar.f26282id);
            }
            if (mVDocklessCar.mo28271j()) {
                jVar.mo61686J(mVDocklessCar.name);
            }
            if (mVDocklessCar.mo28266f()) {
                jVar.mo61678B(mVDocklessCar.batteryLevel);
            }
            if (mVDocklessCar.mo28272k()) {
                jVar.mo61678B(mVDocklessCar.numOfSeats);
            }
            if (mVDocklessCar.mo28267g()) {
                jVar.mo61686J(mVDocklessCar.drivingRate);
            }
            if (mVDocklessCar.mo28268h()) {
                jVar.mo61678B(mVDocklessCar.fuelLevel);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessCar mVDocklessCar = (MVDocklessCar) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVDocklessCar.f26282id = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVDocklessCar.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVDocklessCar.batteryLevel = jVar.mo61696i();
                mVDocklessCar.mo28273l();
            }
            if (T.get(3)) {
                mVDocklessCar.numOfSeats = jVar.mo61696i();
                mVDocklessCar.mo28275o();
            }
            if (T.get(4)) {
                mVDocklessCar.drivingRate = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVDocklessCar.fuelLevel = jVar.mo61696i();
                mVDocklessCar.mo28274m();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessCar$d */
    public static class C9084d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9083c(0);
        }
    }

    static {
        new C17394d0("MVDocklessCar");
        HashMap hashMap = new HashMap();
        f26280h = hashMap;
        hashMap.put(C25239c.class, new C9082b());
        hashMap.put(C25240d.class, new C9084d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BATTERY_LEVEL, new FieldMetaData(ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL, (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NUM_OF_SEATS, new FieldMetaData("numOfSeats", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DRIVING_RATE, new FieldMetaData("drivingRate", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FUEL_LEVEL, new FieldMetaData("fuelLevel", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26281i = unmodifiableMap;
        FieldMetaData.m61947a(MVDocklessCar.class, unmodifiableMap);
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
        ((C25238b) f26280h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26280h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVDocklessCar mVDocklessCar = (MVDocklessCar) obj;
        if (!getClass().equals(mVDocklessCar.getClass())) {
            return getClass().getName().compareTo(mVDocklessCar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28270i()).compareTo(Boolean.valueOf(mVDocklessCar.mo28270i()));
        if (compareTo != 0 || ((mo28270i() && (compareTo = this.f26282id.compareTo(mVDocklessCar.f26282id)) != 0) || (compareTo = Boolean.valueOf(mo28271j()).compareTo(Boolean.valueOf(mVDocklessCar.mo28271j()))) != 0 || ((mo28271j() && (compareTo = this.name.compareTo(mVDocklessCar.name)) != 0) || (compareTo = Boolean.valueOf(mo28266f()).compareTo(Boolean.valueOf(mVDocklessCar.mo28266f()))) != 0 || ((mo28266f() && (compareTo = C25082a.m62839c(this.batteryLevel, mVDocklessCar.batteryLevel)) != 0) || (compareTo = Boolean.valueOf(mo28272k()).compareTo(Boolean.valueOf(mVDocklessCar.mo28272k()))) != 0 || ((mo28272k() && (compareTo = C25082a.m62839c(this.numOfSeats, mVDocklessCar.numOfSeats)) != 0) || (compareTo = Boolean.valueOf(mo28267g()).compareTo(Boolean.valueOf(mVDocklessCar.mo28267g()))) != 0 || ((mo28267g() && (compareTo = this.drivingRate.compareTo(mVDocklessCar.drivingRate)) != 0) || (compareTo = Boolean.valueOf(mo28268h()).compareTo(Boolean.valueOf(mVDocklessCar.mo28268h()))) != 0)))))) {
            return compareTo;
        }
        if (!mo28268h() || (c = C25082a.m62839c(this.fuelLevel, mVDocklessCar.fuelLevel)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDocklessCar)) {
            return false;
        }
        MVDocklessCar mVDocklessCar = (MVDocklessCar) obj;
        boolean i = mo28270i();
        boolean i2 = mVDocklessCar.mo28270i();
        if ((i || i2) && (!i || !i2 || !this.f26282id.equals(mVDocklessCar.f26282id))) {
            return false;
        }
        boolean j = mo28271j();
        boolean j2 = mVDocklessCar.mo28271j();
        if ((j || j2) && (!j || !j2 || !this.name.equals(mVDocklessCar.name))) {
            return false;
        }
        boolean f = mo28266f();
        boolean f2 = mVDocklessCar.mo28266f();
        if ((f || f2) && (!f || !f2 || this.batteryLevel != mVDocklessCar.batteryLevel)) {
            return false;
        }
        boolean k = mo28272k();
        boolean k2 = mVDocklessCar.mo28272k();
        if ((k || k2) && (!k || !k2 || this.numOfSeats != mVDocklessCar.numOfSeats)) {
            return false;
        }
        boolean g = mo28267g();
        boolean g2 = mVDocklessCar.mo28267g();
        if ((g || g2) && (!g || !g2 || !this.drivingRate.equals(mVDocklessCar.drivingRate))) {
            return false;
        }
        boolean h = mo28268h();
        boolean h2 = mVDocklessCar.mo28268h();
        if ((h || h2) && (!h || !h2 || this.fuelLevel != mVDocklessCar.fuelLevel)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28266f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo28267g() {
        return this.drivingRate != null;
    }

    /* renamed from: h */
    public final boolean mo28268h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28270i() {
        return this.f26282id != null;
    }

    /* renamed from: j */
    public final boolean mo28271j() {
        return this.name != null;
    }

    /* renamed from: k */
    public final boolean mo28272k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final void mo28273l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: m */
    public final void mo28274m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo28275o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDocklessCar(", "id:");
        String str = this.f26282id;
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
        if (mo28266f()) {
            n.append(", ");
            n.append("batteryLevel:");
            n.append(this.batteryLevel);
        }
        if (mo28272k()) {
            n.append(", ");
            n.append("numOfSeats:");
            n.append(this.numOfSeats);
        }
        if (mo28267g()) {
            n.append(", ");
            n.append("drivingRate:");
            String str3 = this.drivingRate;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo28268h()) {
            n.append(", ");
            n.append("fuelLevel:");
            n.append(this.fuelLevel);
        }
        n.append(")");
        return n.toString();
    }
}
