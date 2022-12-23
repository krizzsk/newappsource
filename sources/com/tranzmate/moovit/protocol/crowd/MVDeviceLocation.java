package com.tranzmate.moovit.protocol.crowd;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
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

public class MVDeviceLocation implements TBase<MVDeviceLocation, _Fields>, Serializable, Cloneable, Comparable<MVDeviceLocation> {

    /* renamed from: b */
    public static final C25113c f25372b = new C25113c("timestamp", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f25373c = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f25374d = new C25113c("speed", (byte) 4, 3);

    /* renamed from: e */
    public static final C25113c f25375e = new C25113c("bearing", (byte) 4, 4);

    /* renamed from: f */
    public static final C25113c f25376f = new C25113c("provider", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f25377g = new C25113c("altitude", (byte) 4, 6);

    /* renamed from: h */
    public static final C25113c f25378h = new C25113c("altitudeAccuracy", (byte) 4, 7);

    /* renamed from: i */
    public static final C25113c f25379i = new C25113c("floor", (byte) 8, 8);

    /* renamed from: j */
    public static final HashMap f25380j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f25381k;
    private byte __isset_bitfield = 0;
    public double altitude;
    public double altitudeAccuracy;
    public double bearing;
    public int floor;
    public MVGpsLocation location;
    private _Fields[] optionals = {_Fields.SPEED, _Fields.BEARING, _Fields.PROVIDER, _Fields.ALTITUDE, _Fields.ALTITUDE_ACCURACY, _Fields.FLOOR};
    public String provider;
    public double speed;
    public long timestamp;

    public enum _Fields implements C25085c {
        TIMESTAMP(1, "timestamp"),
        LOCATION(2, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        SPEED(3, "speed"),
        BEARING(4, "bearing"),
        PROVIDER(5, "provider"),
        ALTITUDE(6, "altitude"),
        ALTITUDE_ACCURACY(7, "altitudeAccuracy"),
        FLOOR(8, "floor");
        
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
                    return TIMESTAMP;
                case 2:
                    return LOCATION;
                case 3:
                    return SPEED;
                case 4:
                    return BEARING;
                case 5:
                    return PROVIDER;
                case 6:
                    return ALTITUDE;
                case 7:
                    return ALTITUDE_ACCURACY;
                case 8:
                    return FLOOR;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVDeviceLocation$a */
    public static class C8570a extends C25239c<MVDeviceLocation> {
        public C8570a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDeviceLocation mVDeviceLocation = (MVDeviceLocation) tBase;
            mVDeviceLocation.mo26817u();
            C25113c cVar = MVDeviceLocation.f25372b;
            gVar.mo61687K();
            gVar.mo61711x(MVDeviceLocation.f25372b);
            gVar.mo61679C(mVDeviceLocation.timestamp);
            gVar.mo61712y();
            if (mVDeviceLocation.location != null) {
                gVar.mo61711x(MVDeviceLocation.f25373c);
                mVDeviceLocation.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDeviceLocation.mo26808l()) {
                gVar.mo61711x(MVDeviceLocation.f25374d);
                gVar.mo61710w(mVDeviceLocation.speed);
                gVar.mo61712y();
            }
            if (mVDeviceLocation.mo26803h()) {
                gVar.mo61711x(MVDeviceLocation.f25375e);
                gVar.mo61710w(mVDeviceLocation.bearing);
                gVar.mo61712y();
            }
            if (mVDeviceLocation.provider != null && mVDeviceLocation.mo26807k()) {
                gVar.mo61711x(MVDeviceLocation.f25376f);
                gVar.mo61686J(mVDeviceLocation.provider);
                gVar.mo61712y();
            }
            if (mVDeviceLocation.mo26801f()) {
                gVar.mo61711x(MVDeviceLocation.f25377g);
                gVar.mo61710w(mVDeviceLocation.altitude);
                gVar.mo61712y();
            }
            if (mVDeviceLocation.mo26802g()) {
                gVar.mo61711x(MVDeviceLocation.f25378h);
                gVar.mo61710w(mVDeviceLocation.altitudeAccuracy);
                gVar.mo61712y();
            }
            if (mVDeviceLocation.mo26805i()) {
                gVar.mo61711x(MVDeviceLocation.f25379i);
                gVar.mo61678B(mVDeviceLocation.floor);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDeviceLocation mVDeviceLocation = (MVDeviceLocation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDeviceLocation.mo26817u();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDeviceLocation.timestamp = gVar.mo61697j();
                            mVDeviceLocation.mo26815t();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVGpsLocation mVGpsLocation = new MVGpsLocation();
                            mVDeviceLocation.location = mVGpsLocation;
                            mVGpsLocation.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDeviceLocation.speed = gVar.mo61692e();
                            mVDeviceLocation.mo26814s();
                            break;
                        }
                    case 4:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDeviceLocation.bearing = gVar.mo61692e();
                            mVDeviceLocation.mo26812q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDeviceLocation.provider = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDeviceLocation.altitude = gVar.mo61692e();
                            mVDeviceLocation.mo26811p();
                            break;
                        }
                    case 7:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDeviceLocation.altitudeAccuracy = gVar.mo61692e();
                            mVDeviceLocation.mo26810o();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDeviceLocation.floor = gVar.mo61696i();
                            mVDeviceLocation.mo26813r();
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVDeviceLocation$b */
    public static class C8571b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8570a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVDeviceLocation$c */
    public static class C8572c extends C25240d<MVDeviceLocation> {
        public C8572c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDeviceLocation mVDeviceLocation = (MVDeviceLocation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDeviceLocation.mo26809m()) {
                bitSet.set(0);
            }
            if (mVDeviceLocation.mo26806j()) {
                bitSet.set(1);
            }
            if (mVDeviceLocation.mo26808l()) {
                bitSet.set(2);
            }
            if (mVDeviceLocation.mo26803h()) {
                bitSet.set(3);
            }
            if (mVDeviceLocation.mo26807k()) {
                bitSet.set(4);
            }
            if (mVDeviceLocation.mo26801f()) {
                bitSet.set(5);
            }
            if (mVDeviceLocation.mo26802g()) {
                bitSet.set(6);
            }
            if (mVDeviceLocation.mo26805i()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVDeviceLocation.mo26809m()) {
                jVar.mo61679C(mVDeviceLocation.timestamp);
            }
            if (mVDeviceLocation.mo26806j()) {
                mVDeviceLocation.location.mo25202X0(jVar);
            }
            if (mVDeviceLocation.mo26808l()) {
                jVar.mo61710w(mVDeviceLocation.speed);
            }
            if (mVDeviceLocation.mo26803h()) {
                jVar.mo61710w(mVDeviceLocation.bearing);
            }
            if (mVDeviceLocation.mo26807k()) {
                jVar.mo61686J(mVDeviceLocation.provider);
            }
            if (mVDeviceLocation.mo26801f()) {
                jVar.mo61710w(mVDeviceLocation.altitude);
            }
            if (mVDeviceLocation.mo26802g()) {
                jVar.mo61710w(mVDeviceLocation.altitudeAccuracy);
            }
            if (mVDeviceLocation.mo26805i()) {
                jVar.mo61678B(mVDeviceLocation.floor);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDeviceLocation mVDeviceLocation = (MVDeviceLocation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVDeviceLocation.timestamp = jVar.mo61697j();
                mVDeviceLocation.mo26815t();
            }
            if (T.get(1)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVDeviceLocation.location = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVDeviceLocation.speed = jVar.mo61692e();
                mVDeviceLocation.mo26814s();
            }
            if (T.get(3)) {
                mVDeviceLocation.bearing = jVar.mo61692e();
                mVDeviceLocation.mo26812q();
            }
            if (T.get(4)) {
                mVDeviceLocation.provider = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVDeviceLocation.altitude = jVar.mo61692e();
                mVDeviceLocation.mo26811p();
            }
            if (T.get(6)) {
                mVDeviceLocation.altitudeAccuracy = jVar.mo61692e();
                mVDeviceLocation.mo26810o();
            }
            if (T.get(7)) {
                mVDeviceLocation.floor = jVar.mo61696i();
                mVDeviceLocation.mo26813r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVDeviceLocation$d */
    public static class C8573d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8572c(0);
        }
    }

    static {
        new C17394d0("MVDeviceLocation");
        HashMap hashMap = new HashMap();
        f25380j = hashMap;
        hashMap.put(C25239c.class, new C8571b());
        hashMap.put(C25240d.class, new C8573d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVGpsLocation.class)));
        enumMap.put(_Fields.SPEED, new FieldMetaData("speed", (byte) 2, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.BEARING, new FieldMetaData("bearing", (byte) 2, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.PROVIDER, new FieldMetaData("provider", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ALTITUDE, new FieldMetaData("altitude", (byte) 2, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.ALTITUDE_ACCURACY, new FieldMetaData("altitudeAccuracy", (byte) 2, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.FLOOR, new FieldMetaData("floor", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25381k = unmodifiableMap;
        FieldMetaData.m61947a(MVDeviceLocation.class, unmodifiableMap);
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
        ((C25238b) f25380j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25380j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26798a(MVDeviceLocation mVDeviceLocation) {
        if (mVDeviceLocation == null || this.timestamp != mVDeviceLocation.timestamp) {
            return false;
        }
        boolean j = mo26806j();
        boolean j2 = mVDeviceLocation.mo26806j();
        if ((j || j2) && (!j || !j2 || !this.location.mo26178a(mVDeviceLocation.location))) {
            return false;
        }
        boolean l = mo26808l();
        boolean l2 = mVDeviceLocation.mo26808l();
        if ((l || l2) && (!l || !l2 || this.speed != mVDeviceLocation.speed)) {
            return false;
        }
        boolean h = mo26803h();
        boolean h2 = mVDeviceLocation.mo26803h();
        if ((h || h2) && (!h || !h2 || this.bearing != mVDeviceLocation.bearing)) {
            return false;
        }
        boolean k = mo26807k();
        boolean k2 = mVDeviceLocation.mo26807k();
        if ((k || k2) && (!k || !k2 || !this.provider.equals(mVDeviceLocation.provider))) {
            return false;
        }
        boolean f = mo26801f();
        boolean f2 = mVDeviceLocation.mo26801f();
        if ((f || f2) && (!f || !f2 || this.altitude != mVDeviceLocation.altitude)) {
            return false;
        }
        boolean g = mo26802g();
        boolean g2 = mVDeviceLocation.mo26802g();
        if ((g || g2) && (!g || !g2 || this.altitudeAccuracy != mVDeviceLocation.altitudeAccuracy)) {
            return false;
        }
        boolean i = mo26805i();
        boolean i2 = mVDeviceLocation.mo26805i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || this.floor != mVDeviceLocation.floor) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVDeviceLocation mVDeviceLocation = (MVDeviceLocation) obj;
        if (!getClass().equals(mVDeviceLocation.getClass())) {
            return getClass().getName().compareTo(mVDeviceLocation.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26809m()).compareTo(Boolean.valueOf(mVDeviceLocation.mo26809m()));
        if (compareTo != 0 || ((mo26809m() && (compareTo = C25082a.m62840d(this.timestamp, mVDeviceLocation.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo26806j()).compareTo(Boolean.valueOf(mVDeviceLocation.mo26806j()))) != 0 || ((mo26806j() && (compareTo = this.location.compareTo(mVDeviceLocation.location)) != 0) || (compareTo = Boolean.valueOf(mo26808l()).compareTo(Boolean.valueOf(mVDeviceLocation.mo26808l()))) != 0 || ((mo26808l() && (compareTo = C25082a.m62838b(this.speed, mVDeviceLocation.speed)) != 0) || (compareTo = Boolean.valueOf(mo26803h()).compareTo(Boolean.valueOf(mVDeviceLocation.mo26803h()))) != 0 || ((mo26803h() && (compareTo = C25082a.m62838b(this.bearing, mVDeviceLocation.bearing)) != 0) || (compareTo = Boolean.valueOf(mo26807k()).compareTo(Boolean.valueOf(mVDeviceLocation.mo26807k()))) != 0 || ((mo26807k() && (compareTo = this.provider.compareTo(mVDeviceLocation.provider)) != 0) || (compareTo = Boolean.valueOf(mo26801f()).compareTo(Boolean.valueOf(mVDeviceLocation.mo26801f()))) != 0 || ((mo26801f() && (compareTo = C25082a.m62838b(this.altitude, mVDeviceLocation.altitude)) != 0) || (compareTo = Boolean.valueOf(mo26802g()).compareTo(Boolean.valueOf(mVDeviceLocation.mo26802g()))) != 0 || ((mo26802g() && (compareTo = C25082a.m62838b(this.altitudeAccuracy, mVDeviceLocation.altitudeAccuracy)) != 0) || (compareTo = Boolean.valueOf(mo26805i()).compareTo(Boolean.valueOf(mVDeviceLocation.mo26805i()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo26805i() || (c = C25082a.m62839c(this.floor, mVDeviceLocation.floor)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVDeviceLocation)) {
            return mo26798a((MVDeviceLocation) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26801f() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: g */
    public final boolean mo26802g() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: h */
    public final boolean mo26803h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26805i() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: j */
    public final boolean mo26806j() {
        return this.location != null;
    }

    /* renamed from: k */
    public final boolean mo26807k() {
        return this.provider != null;
    }

    /* renamed from: l */
    public final boolean mo26808l() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: m */
    public final boolean mo26809m() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: o */
    public final void mo26810o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: p */
    public final void mo26811p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: q */
    public final void mo26812q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: r */
    public final void mo26813r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: s */
    public final void mo26814s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: t */
    public final void mo26815t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDeviceLocation(", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "location:");
        MVGpsLocation mVGpsLocation = this.location;
        if (mVGpsLocation == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVGpsLocation);
        }
        if (mo26808l()) {
            n.append(", ");
            n.append("speed:");
            n.append(this.speed);
        }
        if (mo26803h()) {
            n.append(", ");
            n.append("bearing:");
            n.append(this.bearing);
        }
        if (mo26807k()) {
            n.append(", ");
            n.append("provider:");
            String str = this.provider;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo26801f()) {
            n.append(", ");
            n.append("altitude:");
            n.append(this.altitude);
        }
        if (mo26802g()) {
            n.append(", ");
            n.append("altitudeAccuracy:");
            n.append(this.altitudeAccuracy);
        }
        if (mo26805i()) {
            n.append(", ");
            n.append("floor:");
            n.append(this.floor);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo26817u() throws TException {
        MVGpsLocation mVGpsLocation = this.location;
        if (mVGpsLocation != null) {
            mVGpsLocation.mo26193r();
        }
    }
}
