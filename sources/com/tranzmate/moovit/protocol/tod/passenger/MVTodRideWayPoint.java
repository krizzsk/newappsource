package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.models.outgoing.FacebookUser;
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

public class MVTodRideWayPoint implements TBase<MVTodRideWayPoint, _Fields>, Serializable, Cloneable, Comparable<MVTodRideWayPoint> {

    /* renamed from: b */
    public static final C25113c f29603b = new C25113c("id", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29604c = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29605d = new C25113c("locationName", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29606e = new C25113c("bearing", (byte) 4, 4);

    /* renamed from: f */
    public static final C25113c f29607f = new C25113c("pickupPassengersCount", (byte) 3, 5);

    /* renamed from: g */
    public static final C25113c f29608g = new C25113c("dropOffPassengersCount", (byte) 3, 6);

    /* renamed from: h */
    public static final C25113c f29609h = new C25113c("type", (byte) 8, 7);

    /* renamed from: i */
    public static final HashMap f29610i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f29611j;
    private byte __isset_bitfield = 0;
    public double bearing;
    public byte dropOffPassengersCount;

    /* renamed from: id */
    public int f29612id;
    public MVLatLon location;
    public String locationName;
    public byte pickupPassengersCount;
    public MVTodRideWayPointType type;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        LOCATION(2, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        LOCATION_NAME(3, "locationName"),
        BEARING(4, "bearing"),
        PICKUP_PASSENGERS_COUNT(5, "pickupPassengersCount"),
        DROP_OFF_PASSENGERS_COUNT(6, "dropOffPassengersCount"),
        TYPE(7, "type");
        
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
                    return LOCATION;
                case 3:
                    return LOCATION_NAME;
                case 4:
                    return BEARING;
                case 5:
                    return PICKUP_PASSENGERS_COUNT;
                case 6:
                    return DROP_OFF_PASSENGERS_COUNT;
                case 7:
                    return TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPoint$a */
    public static class C11336a extends C25239c<MVTodRideWayPoint> {
        public C11336a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRideWayPoint mVTodRideWayPoint = (MVTodRideWayPoint) tBase;
            MVLatLon mVLatLon = mVTodRideWayPoint.location;
            C25113c cVar = MVTodRideWayPoint.f29603b;
            gVar.mo61687K();
            gVar.mo61711x(MVTodRideWayPoint.f29603b);
            gVar.mo61678B(mVTodRideWayPoint.f29612id);
            gVar.mo61712y();
            if (mVTodRideWayPoint.location != null) {
                gVar.mo61711x(MVTodRideWayPoint.f29604c);
                mVTodRideWayPoint.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRideWayPoint.locationName != null) {
                gVar.mo61711x(MVTodRideWayPoint.f29605d);
                gVar.mo61686J(mVTodRideWayPoint.locationName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodRideWayPoint.f29606e);
            gVar.mo61710w(mVTodRideWayPoint.bearing);
            gVar.mo61712y();
            gVar.mo61711x(MVTodRideWayPoint.f29607f);
            gVar.mo61709v(mVTodRideWayPoint.pickupPassengersCount);
            gVar.mo61712y();
            gVar.mo61711x(MVTodRideWayPoint.f29608g);
            gVar.mo61709v(mVTodRideWayPoint.dropOffPassengersCount);
            gVar.mo61712y();
            if (mVTodRideWayPoint.type != null) {
                gVar.mo61711x(MVTodRideWayPoint.f29609h);
                gVar.mo61678B(mVTodRideWayPoint.type.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRideWayPoint mVTodRideWayPoint = (MVTodRideWayPoint) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVTodRideWayPoint.location;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideWayPoint.f29612id = gVar.mo61696i();
                            mVTodRideWayPoint.mo33784p(true);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVTodRideWayPoint.location = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideWayPoint.locationName = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideWayPoint.bearing = gVar.mo61692e();
                            mVTodRideWayPoint.mo33782m();
                            break;
                        }
                    case 5:
                        if (b != 3) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideWayPoint.pickupPassengersCount = gVar.mo61691d();
                            mVTodRideWayPoint.mo33785q();
                            break;
                        }
                    case 6:
                        if (b != 3) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideWayPoint.dropOffPassengersCount = gVar.mo61691d();
                            mVTodRideWayPoint.mo33783o();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideWayPoint.type = MVTodRideWayPointType.findByValue(gVar.mo61696i());
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPoint$b */
    public static class C11337b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11336a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPoint$c */
    public static class C11338c extends C25240d<MVTodRideWayPoint> {
        public C11338c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRideWayPoint mVTodRideWayPoint = (MVTodRideWayPoint) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodRideWayPoint.mo33776h()) {
                bitSet.set(0);
            }
            if (mVTodRideWayPoint.mo33778i()) {
                bitSet.set(1);
            }
            if (mVTodRideWayPoint.mo33779j()) {
                bitSet.set(2);
            }
            if (mVTodRideWayPoint.mo33774f()) {
                bitSet.set(3);
            }
            if (mVTodRideWayPoint.mo33780k()) {
                bitSet.set(4);
            }
            if (mVTodRideWayPoint.mo33775g()) {
                bitSet.set(5);
            }
            if (mVTodRideWayPoint.mo33781l()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVTodRideWayPoint.mo33776h()) {
                jVar.mo61678B(mVTodRideWayPoint.f29612id);
            }
            if (mVTodRideWayPoint.mo33778i()) {
                mVTodRideWayPoint.location.mo25202X0(jVar);
            }
            if (mVTodRideWayPoint.mo33779j()) {
                jVar.mo61686J(mVTodRideWayPoint.locationName);
            }
            if (mVTodRideWayPoint.mo33774f()) {
                jVar.mo61710w(mVTodRideWayPoint.bearing);
            }
            if (mVTodRideWayPoint.mo33780k()) {
                jVar.mo61716P(mVTodRideWayPoint.pickupPassengersCount);
            }
            if (mVTodRideWayPoint.mo33775g()) {
                jVar.mo61716P(mVTodRideWayPoint.dropOffPassengersCount);
            }
            if (mVTodRideWayPoint.mo33781l()) {
                jVar.mo61678B(mVTodRideWayPoint.type.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRideWayPoint mVTodRideWayPoint = (MVTodRideWayPoint) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVTodRideWayPoint.f29612id = jVar.mo61696i();
                mVTodRideWayPoint.mo33784p(true);
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVTodRideWayPoint.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVTodRideWayPoint.locationName = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVTodRideWayPoint.bearing = jVar.mo61692e();
                mVTodRideWayPoint.mo33782m();
            }
            if (T.get(4)) {
                mVTodRideWayPoint.pickupPassengersCount = jVar.mo61691d();
                mVTodRideWayPoint.mo33785q();
            }
            if (T.get(5)) {
                mVTodRideWayPoint.dropOffPassengersCount = jVar.mo61691d();
                mVTodRideWayPoint.mo33783o();
            }
            if (T.get(6)) {
                mVTodRideWayPoint.type = MVTodRideWayPointType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideWayPoint$d */
    public static class C11339d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11338c(0);
        }
    }

    static {
        new C17394d0("MVTodRideWayPoint");
        HashMap hashMap = new HashMap();
        f29610i = hashMap;
        hashMap.put(C25239c.class, new C11337b());
        hashMap.put(C25240d.class, new C11339d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.LOCATION_NAME, new FieldMetaData("locationName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BEARING, new FieldMetaData("bearing", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.PICKUP_PASSENGERS_COUNT, new FieldMetaData("pickupPassengersCount", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.DROP_OFF_PASSENGERS_COUNT, new FieldMetaData("dropOffPassengersCount", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVTodRideWayPointType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29611j = unmodifiableMap;
        FieldMetaData.m61947a(MVTodRideWayPoint.class, unmodifiableMap);
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
        ((C25238b) f29610i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29610i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodRideWayPoint mVTodRideWayPoint = (MVTodRideWayPoint) obj;
        if (!getClass().equals(mVTodRideWayPoint.getClass())) {
            return getClass().getName().compareTo(mVTodRideWayPoint.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33776h()).compareTo(Boolean.valueOf(mVTodRideWayPoint.mo33776h()));
        if (compareTo2 != 0 || ((mo33776h() && (compareTo2 = C25082a.m62839c(this.f29612id, mVTodRideWayPoint.f29612id)) != 0) || (compareTo2 = Boolean.valueOf(mo33778i()).compareTo(Boolean.valueOf(mVTodRideWayPoint.mo33778i()))) != 0 || ((mo33778i() && (compareTo2 = this.location.compareTo(mVTodRideWayPoint.location)) != 0) || (compareTo2 = Boolean.valueOf(mo33779j()).compareTo(Boolean.valueOf(mVTodRideWayPoint.mo33779j()))) != 0 || ((mo33779j() && (compareTo2 = this.locationName.compareTo(mVTodRideWayPoint.locationName)) != 0) || (compareTo2 = Boolean.valueOf(mo33774f()).compareTo(Boolean.valueOf(mVTodRideWayPoint.mo33774f()))) != 0 || ((mo33774f() && (compareTo2 = C25082a.m62838b(this.bearing, mVTodRideWayPoint.bearing)) != 0) || (compareTo2 = Boolean.valueOf(mo33780k()).compareTo(Boolean.valueOf(mVTodRideWayPoint.mo33780k()))) != 0 || ((mo33780k() && (compareTo2 = C25082a.m62837a(this.pickupPassengersCount, mVTodRideWayPoint.pickupPassengersCount)) != 0) || (compareTo2 = Boolean.valueOf(mo33775g()).compareTo(Boolean.valueOf(mVTodRideWayPoint.mo33775g()))) != 0 || ((mo33775g() && (compareTo2 = C25082a.m62837a(this.dropOffPassengersCount, mVTodRideWayPoint.dropOffPassengersCount)) != 0) || (compareTo2 = Boolean.valueOf(mo33781l()).compareTo(Boolean.valueOf(mVTodRideWayPoint.mo33781l()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo33781l() || (compareTo = this.type.compareTo(mVTodRideWayPoint.type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodRideWayPoint)) {
            return false;
        }
        MVTodRideWayPoint mVTodRideWayPoint = (MVTodRideWayPoint) obj;
        if (this.f29612id != mVTodRideWayPoint.f29612id) {
            return false;
        }
        boolean i = mo33778i();
        boolean i2 = mVTodRideWayPoint.mo33778i();
        if ((i || i2) && (!i || !i2 || !this.location.mo26290a(mVTodRideWayPoint.location))) {
            return false;
        }
        boolean j = mo33779j();
        boolean j2 = mVTodRideWayPoint.mo33779j();
        if (((j || j2) && (!j || !j2 || !this.locationName.equals(mVTodRideWayPoint.locationName))) || this.bearing != mVTodRideWayPoint.bearing || this.pickupPassengersCount != mVTodRideWayPoint.pickupPassengersCount || this.dropOffPassengersCount != mVTodRideWayPoint.dropOffPassengersCount) {
            return false;
        }
        boolean l = mo33781l();
        boolean l2 = mVTodRideWayPoint.mo33781l();
        if ((l || l2) && (!l || !l2 || !this.type.equals(mVTodRideWayPoint.type))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33774f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo33775g() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: h */
    public final boolean mo33776h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33778i() {
        return this.location != null;
    }

    /* renamed from: j */
    public final boolean mo33779j() {
        return this.locationName != null;
    }

    /* renamed from: k */
    public final boolean mo33780k() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: l */
    public final boolean mo33781l() {
        return this.type != null;
    }

    /* renamed from: m */
    public final void mo33782m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: o */
    public final void mo33783o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: p */
    public final void mo33784p(boolean z) {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: q */
    public final void mo33785q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodRideWayPoint(", "id:");
        C0016g.m42z(n, this.f29612id, ", ", "location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("locationName:");
        String str = this.locationName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("bearing:");
        C16759e.m42355k(n, this.bearing, ", ", "pickupPassengersCount:");
        C0016g.m42z(n, this.pickupPassengersCount, ", ", "dropOffPassengersCount:");
        C0016g.m42z(n, this.dropOffPassengersCount, ", ", "type:");
        MVTodRideWayPointType mVTodRideWayPointType = this.type;
        if (mVTodRideWayPointType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodRideWayPointType);
        }
        n.append(")");
        return n.toString();
    }
}
