package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodVehicle implements TBase<MVTodVehicle, _Fields>, Serializable, Cloneable, Comparable<MVTodVehicle> {

    /* renamed from: b */
    public static final C25113c f29644b = new C25113c("numOfSeats", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29645c = new C25113c("isAccessible", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f29646d = new C25113c("licencePlate", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29647e = new C25113c("driverName", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f29648f = new C25113c("acceptsCharge", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f29649g = new C25113c(ServerParameters.MODEL, (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f29650h = new C25113c("isAutonomous", (byte) 2, 7);

    /* renamed from: i */
    public static final HashMap f29651i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f29652j;
    private byte __isset_bitfield = 0;
    public boolean acceptsCharge;
    public String driverName;
    public boolean isAccessible;
    public boolean isAutonomous;
    public String licencePlate;
    public String model;
    public int numOfSeats;
    private _Fields[] optionals = {_Fields.LICENCE_PLATE, _Fields.DRIVER_NAME, _Fields.ACCEPTS_CHARGE, _Fields.MODEL, _Fields.IS_AUTONOMOUS};

    public enum _Fields implements C25085c {
        NUM_OF_SEATS(1, "numOfSeats"),
        IS_ACCESSIBLE(2, "isAccessible"),
        LICENCE_PLATE(3, "licencePlate"),
        DRIVER_NAME(4, "driverName"),
        ACCEPTS_CHARGE(5, "acceptsCharge"),
        MODEL(6, ServerParameters.MODEL),
        IS_AUTONOMOUS(7, "isAutonomous");
        
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
                    return NUM_OF_SEATS;
                case 2:
                    return IS_ACCESSIBLE;
                case 3:
                    return LICENCE_PLATE;
                case 4:
                    return DRIVER_NAME;
                case 5:
                    return ACCEPTS_CHARGE;
                case 6:
                    return MODEL;
                case 7:
                    return IS_AUTONOMOUS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicle$a */
    public static class C11361a extends C25239c<MVTodVehicle> {
        public C11361a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicle mVTodVehicle = (MVTodVehicle) tBase;
            mVTodVehicle.getClass();
            C25113c cVar = MVTodVehicle.f29644b;
            gVar.mo61687K();
            gVar.mo61711x(MVTodVehicle.f29644b);
            gVar.mo61678B(mVTodVehicle.numOfSeats);
            gVar.mo61712y();
            gVar.mo61711x(MVTodVehicle.f29645c);
            gVar.mo61708u(mVTodVehicle.isAccessible);
            gVar.mo61712y();
            if (mVTodVehicle.licencePlate != null && mVTodVehicle.mo33851j()) {
                gVar.mo61711x(MVTodVehicle.f29646d);
                gVar.mo61686J(mVTodVehicle.licencePlate);
                gVar.mo61712y();
            }
            if (mVTodVehicle.driverName != null && mVTodVehicle.mo33847g()) {
                gVar.mo61711x(MVTodVehicle.f29647e);
                gVar.mo61686J(mVTodVehicle.driverName);
                gVar.mo61712y();
            }
            if (mVTodVehicle.mo33846f()) {
                gVar.mo61711x(MVTodVehicle.f29648f);
                gVar.mo61708u(mVTodVehicle.acceptsCharge);
                gVar.mo61712y();
            }
            if (mVTodVehicle.model != null && mVTodVehicle.mo33852k()) {
                gVar.mo61711x(MVTodVehicle.f29649g);
                gVar.mo61686J(mVTodVehicle.model);
                gVar.mo61712y();
            }
            if (mVTodVehicle.mo33850i()) {
                gVar.mo61711x(MVTodVehicle.f29650h);
                gVar.mo61708u(mVTodVehicle.isAutonomous);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicle mVTodVehicle = (MVTodVehicle) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodVehicle.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodVehicle.numOfSeats = gVar.mo61696i();
                            mVTodVehicle.mo33857q();
                            break;
                        }
                    case 2:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodVehicle.isAccessible = gVar.mo61690c();
                            mVTodVehicle.mo33855o();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodVehicle.licencePlate = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodVehicle.driverName = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodVehicle.acceptsCharge = gVar.mo61690c();
                            mVTodVehicle.mo33854m();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodVehicle.model = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodVehicle.isAutonomous = gVar.mo61690c();
                            mVTodVehicle.mo33856p();
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicle$b */
    public static class C11362b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11361a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicle$c */
    public static class C11363c extends C25240d<MVTodVehicle> {
        public C11363c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicle mVTodVehicle = (MVTodVehicle) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodVehicle.mo33853l()) {
                bitSet.set(0);
            }
            if (mVTodVehicle.mo33848h()) {
                bitSet.set(1);
            }
            if (mVTodVehicle.mo33851j()) {
                bitSet.set(2);
            }
            if (mVTodVehicle.mo33847g()) {
                bitSet.set(3);
            }
            if (mVTodVehicle.mo33846f()) {
                bitSet.set(4);
            }
            if (mVTodVehicle.mo33852k()) {
                bitSet.set(5);
            }
            if (mVTodVehicle.mo33850i()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVTodVehicle.mo33853l()) {
                jVar.mo61678B(mVTodVehicle.numOfSeats);
            }
            if (mVTodVehicle.mo33848h()) {
                jVar.mo61708u(mVTodVehicle.isAccessible);
            }
            if (mVTodVehicle.mo33851j()) {
                jVar.mo61686J(mVTodVehicle.licencePlate);
            }
            if (mVTodVehicle.mo33847g()) {
                jVar.mo61686J(mVTodVehicle.driverName);
            }
            if (mVTodVehicle.mo33846f()) {
                jVar.mo61708u(mVTodVehicle.acceptsCharge);
            }
            if (mVTodVehicle.mo33852k()) {
                jVar.mo61686J(mVTodVehicle.model);
            }
            if (mVTodVehicle.mo33850i()) {
                jVar.mo61708u(mVTodVehicle.isAutonomous);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicle mVTodVehicle = (MVTodVehicle) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVTodVehicle.numOfSeats = jVar.mo61696i();
                mVTodVehicle.mo33857q();
            }
            if (T.get(1)) {
                mVTodVehicle.isAccessible = jVar.mo61690c();
                mVTodVehicle.mo33855o();
            }
            if (T.get(2)) {
                mVTodVehicle.licencePlate = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVTodVehicle.driverName = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVTodVehicle.acceptsCharge = jVar.mo61690c();
                mVTodVehicle.mo33854m();
            }
            if (T.get(5)) {
                mVTodVehicle.model = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVTodVehicle.isAutonomous = jVar.mo61690c();
                mVTodVehicle.mo33856p();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicle$d */
    public static class C11364d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11363c(0);
        }
    }

    static {
        new C17394d0("MVTodVehicle");
        HashMap hashMap = new HashMap();
        f29651i = hashMap;
        hashMap.put(C25239c.class, new C11362b());
        hashMap.put(C25240d.class, new C11364d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NUM_OF_SEATS, new FieldMetaData("numOfSeats", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IS_ACCESSIBLE, new FieldMetaData("isAccessible", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.LICENCE_PLATE, new FieldMetaData("licencePlate", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DRIVER_NAME, new FieldMetaData("driverName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACCEPTS_CHARGE, new FieldMetaData("acceptsCharge", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.MODEL, new FieldMetaData(ServerParameters.MODEL, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_AUTONOMOUS, new FieldMetaData("isAutonomous", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29652j = unmodifiableMap;
        FieldMetaData.m61947a(MVTodVehicle.class, unmodifiableMap);
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
        ((C25238b) f29651i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29651i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33843a(MVTodVehicle mVTodVehicle) {
        if (mVTodVehicle == null || this.numOfSeats != mVTodVehicle.numOfSeats || this.isAccessible != mVTodVehicle.isAccessible) {
            return false;
        }
        boolean j = mo33851j();
        boolean j2 = mVTodVehicle.mo33851j();
        if ((j || j2) && (!j || !j2 || !this.licencePlate.equals(mVTodVehicle.licencePlate))) {
            return false;
        }
        boolean g = mo33847g();
        boolean g2 = mVTodVehicle.mo33847g();
        if ((g || g2) && (!g || !g2 || !this.driverName.equals(mVTodVehicle.driverName))) {
            return false;
        }
        boolean f = mo33846f();
        boolean f2 = mVTodVehicle.mo33846f();
        if ((f || f2) && (!f || !f2 || this.acceptsCharge != mVTodVehicle.acceptsCharge)) {
            return false;
        }
        boolean k = mo33852k();
        boolean k2 = mVTodVehicle.mo33852k();
        if ((k || k2) && (!k || !k2 || !this.model.equals(mVTodVehicle.model))) {
            return false;
        }
        boolean i = mo33850i();
        boolean i2 = mVTodVehicle.mo33850i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || this.isAutonomous != mVTodVehicle.isAutonomous) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int l;
        MVTodVehicle mVTodVehicle = (MVTodVehicle) obj;
        if (!getClass().equals(mVTodVehicle.getClass())) {
            return getClass().getName().compareTo(mVTodVehicle.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33853l()).compareTo(Boolean.valueOf(mVTodVehicle.mo33853l()));
        if (compareTo != 0 || ((mo33853l() && (compareTo = C25082a.m62839c(this.numOfSeats, mVTodVehicle.numOfSeats)) != 0) || (compareTo = Boolean.valueOf(mo33848h()).compareTo(Boolean.valueOf(mVTodVehicle.mo33848h()))) != 0 || ((mo33848h() && (compareTo = C25082a.m62848l(this.isAccessible, mVTodVehicle.isAccessible)) != 0) || (compareTo = Boolean.valueOf(mo33851j()).compareTo(Boolean.valueOf(mVTodVehicle.mo33851j()))) != 0 || ((mo33851j() && (compareTo = this.licencePlate.compareTo(mVTodVehicle.licencePlate)) != 0) || (compareTo = Boolean.valueOf(mo33847g()).compareTo(Boolean.valueOf(mVTodVehicle.mo33847g()))) != 0 || ((mo33847g() && (compareTo = this.driverName.compareTo(mVTodVehicle.driverName)) != 0) || (compareTo = Boolean.valueOf(mo33846f()).compareTo(Boolean.valueOf(mVTodVehicle.mo33846f()))) != 0 || ((mo33846f() && (compareTo = C25082a.m62848l(this.acceptsCharge, mVTodVehicle.acceptsCharge)) != 0) || (compareTo = Boolean.valueOf(mo33852k()).compareTo(Boolean.valueOf(mVTodVehicle.mo33852k()))) != 0 || ((mo33852k() && (compareTo = this.model.compareTo(mVTodVehicle.model)) != 0) || (compareTo = Boolean.valueOf(mo33850i()).compareTo(Boolean.valueOf(mVTodVehicle.mo33850i()))) != 0))))))) {
            return compareTo;
        }
        if (!mo33850i() || (l = C25082a.m62848l(this.isAutonomous, mVTodVehicle.isAutonomous)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodVehicle)) {
            return mo33843a((MVTodVehicle) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33846f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo33847g() {
        return this.driverName != null;
    }

    /* renamed from: h */
    public final boolean mo33848h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33850i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: j */
    public final boolean mo33851j() {
        return this.licencePlate != null;
    }

    /* renamed from: k */
    public final boolean mo33852k() {
        return this.model != null;
    }

    /* renamed from: l */
    public final boolean mo33853l() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: m */
    public final void mo33854m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo33855o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo33856p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: q */
    public final void mo33857q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodVehicle(", "numOfSeats:");
        C0016g.m42z(n, this.numOfSeats, ", ", "isAccessible:");
        n.append(this.isAccessible);
        if (mo33851j()) {
            n.append(", ");
            n.append("licencePlate:");
            String str = this.licencePlate;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo33847g()) {
            n.append(", ");
            n.append("driverName:");
            String str2 = this.driverName;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo33846f()) {
            n.append(", ");
            n.append("acceptsCharge:");
            n.append(this.acceptsCharge);
        }
        if (mo33852k()) {
            n.append(", ");
            n.append("model:");
            String str3 = this.model;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo33850i()) {
            n.append(", ");
            n.append("isAutonomous:");
            n.append(this.isAutonomous);
        }
        n.append(")");
        return n.toString();
    }
}
