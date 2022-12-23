package com.tranzmate.moovit.protocol.common;

import com.appboy.support.StringUtils;
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

public class MVGpsLocation implements TBase<MVGpsLocation, _Fields>, Serializable, Cloneable, Comparable<MVGpsLocation> {

    /* renamed from: b */
    public static final C25113c f25024b = new C25113c("latlon", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f25025c = new C25113c("accuracy", (byte) 4, 2);

    /* renamed from: d */
    public static final C25113c f25026d = new C25113c("timestamp", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f25027e = new C25113c("bearing", (byte) 4, 4);

    /* renamed from: f */
    public static final C25113c f25028f = new C25113c("speed", (byte) 4, 5);

    /* renamed from: g */
    public static final C25113c f25029g = new C25113c("altitude", (byte) 4, 6);

    /* renamed from: h */
    public static final HashMap f25030h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f25031i;
    private byte __isset_bitfield;
    public double accuracy;
    public double altitude;
    public double bearing;
    public MVLatLon latlon;
    private _Fields[] optionals;
    public double speed;
    public long timestamp;

    public enum _Fields implements C25085c {
        LATLON(1, "latlon"),
        ACCURACY(2, "accuracy"),
        TIMESTAMP(3, "timestamp"),
        BEARING(4, "bearing"),
        SPEED(5, "speed"),
        ALTITUDE(6, "altitude");
        
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
                    return LATLON;
                case 2:
                    return ACCURACY;
                case 3:
                    return TIMESTAMP;
                case 4:
                    return BEARING;
                case 5:
                    return SPEED;
                case 6:
                    return ALTITUDE;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVGpsLocation$a */
    public static class C8408a extends C25239c<MVGpsLocation> {
        public C8408a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGpsLocation mVGpsLocation = (MVGpsLocation) tBase;
            mVGpsLocation.mo26193r();
            C25113c cVar = MVGpsLocation.f25024b;
            gVar.mo61687K();
            if (mVGpsLocation.latlon != null) {
                gVar.mo61711x(MVGpsLocation.f25024b);
                mVGpsLocation.latlon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVGpsLocation.mo26181f()) {
                gVar.mo61711x(MVGpsLocation.f25025c);
                gVar.mo61710w(mVGpsLocation.accuracy);
                gVar.mo61712y();
            }
            if (mVGpsLocation.mo26187k()) {
                gVar.mo61711x(MVGpsLocation.f25026d);
                gVar.mo61679C(mVGpsLocation.timestamp);
                gVar.mo61712y();
            }
            if (mVGpsLocation.mo26183h()) {
                gVar.mo61711x(MVGpsLocation.f25027e);
                gVar.mo61710w(mVGpsLocation.bearing);
                gVar.mo61712y();
            }
            if (mVGpsLocation.mo26186j()) {
                gVar.mo61711x(MVGpsLocation.f25028f);
                gVar.mo61710w(mVGpsLocation.speed);
                gVar.mo61712y();
            }
            if (mVGpsLocation.mo26182g()) {
                gVar.mo61711x(MVGpsLocation.f25029g);
                gVar.mo61710w(mVGpsLocation.altitude);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGpsLocation mVGpsLocation = (MVGpsLocation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGpsLocation.mo26193r();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon = new MVLatLon();
                            mVGpsLocation.latlon = mVLatLon;
                            mVLatLon.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGpsLocation.accuracy = gVar.mo61692e();
                            mVGpsLocation.mo26188l();
                            break;
                        }
                    case 3:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGpsLocation.timestamp = gVar.mo61697j();
                            mVGpsLocation.mo26192q();
                            break;
                        }
                    case 4:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGpsLocation.bearing = gVar.mo61692e();
                            mVGpsLocation.mo26190o();
                            break;
                        }
                    case 5:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGpsLocation.speed = gVar.mo61692e();
                            mVGpsLocation.mo26191p();
                            break;
                        }
                    case 6:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGpsLocation.altitude = gVar.mo61692e();
                            mVGpsLocation.mo26189m();
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVGpsLocation$b */
    public static class C8409b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8408a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVGpsLocation$c */
    public static class C8410c extends C25240d<MVGpsLocation> {
        public C8410c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGpsLocation mVGpsLocation = (MVGpsLocation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGpsLocation.mo26185i()) {
                bitSet.set(0);
            }
            if (mVGpsLocation.mo26181f()) {
                bitSet.set(1);
            }
            if (mVGpsLocation.mo26187k()) {
                bitSet.set(2);
            }
            if (mVGpsLocation.mo26183h()) {
                bitSet.set(3);
            }
            if (mVGpsLocation.mo26186j()) {
                bitSet.set(4);
            }
            if (mVGpsLocation.mo26182g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVGpsLocation.mo26185i()) {
                mVGpsLocation.latlon.mo25202X0(jVar);
            }
            if (mVGpsLocation.mo26181f()) {
                jVar.mo61710w(mVGpsLocation.accuracy);
            }
            if (mVGpsLocation.mo26187k()) {
                jVar.mo61679C(mVGpsLocation.timestamp);
            }
            if (mVGpsLocation.mo26183h()) {
                jVar.mo61710w(mVGpsLocation.bearing);
            }
            if (mVGpsLocation.mo26186j()) {
                jVar.mo61710w(mVGpsLocation.speed);
            }
            if (mVGpsLocation.mo26182g()) {
                jVar.mo61710w(mVGpsLocation.altitude);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGpsLocation mVGpsLocation = (MVGpsLocation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVGpsLocation.latlon = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVGpsLocation.accuracy = jVar.mo61692e();
                mVGpsLocation.mo26188l();
            }
            if (T.get(2)) {
                mVGpsLocation.timestamp = jVar.mo61697j();
                mVGpsLocation.mo26192q();
            }
            if (T.get(3)) {
                mVGpsLocation.bearing = jVar.mo61692e();
                mVGpsLocation.mo26190o();
            }
            if (T.get(4)) {
                mVGpsLocation.speed = jVar.mo61692e();
                mVGpsLocation.mo26191p();
            }
            if (T.get(5)) {
                mVGpsLocation.altitude = jVar.mo61692e();
                mVGpsLocation.mo26189m();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVGpsLocation$d */
    public static class C8411d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8410c(0);
        }
    }

    static {
        new C17394d0("MVGpsLocation");
        HashMap hashMap = new HashMap();
        f25030h = hashMap;
        hashMap.put(C25239c.class, new C8409b());
        hashMap.put(C25240d.class, new C8411d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LATLON, new FieldMetaData("latlon", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.ACCURACY, new FieldMetaData("accuracy", (byte) 2, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.BEARING, new FieldMetaData("bearing", (byte) 2, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.SPEED, new FieldMetaData("speed", (byte) 2, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.ALTITUDE, new FieldMetaData("altitude", (byte) 2, new FieldValueMetaData((byte) 4, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25031i = unmodifiableMap;
        FieldMetaData.m61947a(MVGpsLocation.class, unmodifiableMap);
    }

    public MVGpsLocation() {
        this.__isset_bitfield = 0;
        this.optionals = new _Fields[]{_Fields.ACCURACY, _Fields.TIMESTAMP, _Fields.BEARING, _Fields.SPEED, _Fields.ALTITUDE};
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
        ((C25238b) f25030h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25030h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26178a(MVGpsLocation mVGpsLocation) {
        if (mVGpsLocation == null) {
            return false;
        }
        boolean i = mo26185i();
        boolean i2 = mVGpsLocation.mo26185i();
        if ((i || i2) && (!i || !i2 || !this.latlon.mo26290a(mVGpsLocation.latlon))) {
            return false;
        }
        boolean f = mo26181f();
        boolean f2 = mVGpsLocation.mo26181f();
        if ((f || f2) && (!f || !f2 || this.accuracy != mVGpsLocation.accuracy)) {
            return false;
        }
        boolean k = mo26187k();
        boolean k2 = mVGpsLocation.mo26187k();
        if ((k || k2) && (!k || !k2 || this.timestamp != mVGpsLocation.timestamp)) {
            return false;
        }
        boolean h = mo26183h();
        boolean h2 = mVGpsLocation.mo26183h();
        if ((h || h2) && (!h || !h2 || this.bearing != mVGpsLocation.bearing)) {
            return false;
        }
        boolean j = mo26186j();
        boolean j2 = mVGpsLocation.mo26186j();
        if ((j || j2) && (!j || !j2 || this.speed != mVGpsLocation.speed)) {
            return false;
        }
        boolean g = mo26182g();
        boolean g2 = mVGpsLocation.mo26182g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || this.altitude != mVGpsLocation.altitude) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int b;
        MVGpsLocation mVGpsLocation = (MVGpsLocation) obj;
        if (!getClass().equals(mVGpsLocation.getClass())) {
            return getClass().getName().compareTo(mVGpsLocation.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26185i()).compareTo(Boolean.valueOf(mVGpsLocation.mo26185i()));
        if (compareTo != 0 || ((mo26185i() && (compareTo = this.latlon.compareTo(mVGpsLocation.latlon)) != 0) || (compareTo = Boolean.valueOf(mo26181f()).compareTo(Boolean.valueOf(mVGpsLocation.mo26181f()))) != 0 || ((mo26181f() && (compareTo = C25082a.m62838b(this.accuracy, mVGpsLocation.accuracy)) != 0) || (compareTo = Boolean.valueOf(mo26187k()).compareTo(Boolean.valueOf(mVGpsLocation.mo26187k()))) != 0 || ((mo26187k() && (compareTo = C25082a.m62840d(this.timestamp, mVGpsLocation.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo26183h()).compareTo(Boolean.valueOf(mVGpsLocation.mo26183h()))) != 0 || ((mo26183h() && (compareTo = C25082a.m62838b(this.bearing, mVGpsLocation.bearing)) != 0) || (compareTo = Boolean.valueOf(mo26186j()).compareTo(Boolean.valueOf(mVGpsLocation.mo26186j()))) != 0 || ((mo26186j() && (compareTo = C25082a.m62838b(this.speed, mVGpsLocation.speed)) != 0) || (compareTo = Boolean.valueOf(mo26182g()).compareTo(Boolean.valueOf(mVGpsLocation.mo26182g()))) != 0)))))) {
            return compareTo;
        }
        if (!mo26182g() || (b = C25082a.m62838b(this.altitude, mVGpsLocation.altitude)) == 0) {
            return 0;
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVGpsLocation)) {
            return mo26178a((MVGpsLocation) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26181f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26182g() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: h */
    public final boolean mo26183h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26185i() {
        return this.latlon != null;
    }

    /* renamed from: j */
    public final boolean mo26186j() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: k */
    public final boolean mo26187k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final void mo26188l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: m */
    public final void mo26189m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: o */
    public final void mo26190o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: p */
    public final void mo26191p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: q */
    public final void mo26192q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: r */
    public final void mo26193r() throws TException {
        MVLatLon mVLatLon = this.latlon;
        if (mVLatLon != null) {
            mVLatLon.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGpsLocation(", "latlon:");
        MVLatLon mVLatLon = this.latlon;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        if (mo26181f()) {
            n.append(", ");
            n.append("accuracy:");
            n.append(this.accuracy);
        }
        if (mo26187k()) {
            n.append(", ");
            n.append("timestamp:");
            n.append(this.timestamp);
        }
        if (mo26183h()) {
            n.append(", ");
            n.append("bearing:");
            n.append(this.bearing);
        }
        if (mo26186j()) {
            n.append(", ");
            n.append("speed:");
            n.append(this.speed);
        }
        if (mo26182g()) {
            n.append(", ");
            n.append("altitude:");
            n.append(this.altitude);
        }
        n.append(")");
        return n.toString();
    }

    public MVGpsLocation(MVLatLon mVLatLon) {
        this();
        this.latlon = mVLatLon;
    }
}
