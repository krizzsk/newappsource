package com.tranzmate.moovit.protocol.crowd;

import com.appboy.models.outgoing.FacebookUser;
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

public class MVBeaconDetected implements TBase<MVBeaconDetected, _Fields>, Serializable, Cloneable, Comparable<MVBeaconDetected> {

    /* renamed from: b */
    public static final C25113c f25333b = new C25113c("beacon", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f25334c = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f25335d = new C25113c("timestamp", (byte) 10, 3);

    /* renamed from: e */
    public static final HashMap f25336e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25337f;
    private byte __isset_bitfield = 0;
    public MVBeacon beacon;
    public MVDeviceLocation location;
    private _Fields[] optionals = {_Fields.LOCATION};
    public long timestamp;

    public enum _Fields implements C25085c {
        BEACON(1, "beacon"),
        LOCATION(2, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        TIMESTAMP(3, "timestamp");
        
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
                return BEACON;
            }
            if (i == 2) {
                return LOCATION;
            }
            if (i != 3) {
                return null;
            }
            return TIMESTAMP;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBeaconDetected$a */
    public static class C8545a extends C25239c<MVBeaconDetected> {
        public C8545a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBeaconDetected mVBeaconDetected = (MVBeaconDetected) tBase;
            MVBeacon mVBeacon = mVBeaconDetected.beacon;
            MVDeviceLocation mVDeviceLocation = mVBeaconDetected.location;
            if (mVDeviceLocation != null) {
                mVDeviceLocation.mo26817u();
            }
            C25113c cVar = MVBeaconDetected.f25333b;
            gVar.mo61687K();
            if (mVBeaconDetected.beacon != null) {
                gVar.mo61711x(MVBeaconDetected.f25333b);
                mVBeaconDetected.beacon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVBeaconDetected.location != null && mVBeaconDetected.mo26739g()) {
                gVar.mo61711x(MVBeaconDetected.f25334c);
                mVBeaconDetected.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVBeaconDetected.f25335d);
            C25541a.m63891v(gVar, mVBeaconDetected.timestamp);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBeaconDetected mVBeaconDetected = (MVBeaconDetected) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 10) {
                            mVBeaconDetected.timestamp = gVar.mo61697j();
                            mVBeaconDetected.mo26742i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVDeviceLocation mVDeviceLocation = new MVDeviceLocation();
                        mVBeaconDetected.location = mVDeviceLocation;
                        mVDeviceLocation.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVBeacon mVBeacon = new MVBeacon();
                    mVBeaconDetected.beacon = mVBeacon;
                    mVBeacon.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVBeacon mVBeacon2 = mVBeaconDetected.beacon;
            MVDeviceLocation mVDeviceLocation2 = mVBeaconDetected.location;
            if (mVDeviceLocation2 != null) {
                mVDeviceLocation2.mo26817u();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBeaconDetected$b */
    public static class C8546b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8545a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBeaconDetected$c */
    public static class C8547c extends C25240d<MVBeaconDetected> {
        public C8547c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBeaconDetected mVBeaconDetected = (MVBeaconDetected) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBeaconDetected.mo26738f()) {
                bitSet.set(0);
            }
            if (mVBeaconDetected.mo26739g()) {
                bitSet.set(1);
            }
            if (mVBeaconDetected.mo26740h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVBeaconDetected.mo26738f()) {
                mVBeaconDetected.beacon.mo25202X0(jVar);
            }
            if (mVBeaconDetected.mo26739g()) {
                mVBeaconDetected.location.mo25202X0(jVar);
            }
            if (mVBeaconDetected.mo26740h()) {
                jVar.mo61679C(mVBeaconDetected.timestamp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBeaconDetected mVBeaconDetected = (MVBeaconDetected) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVBeacon mVBeacon = new MVBeacon();
                mVBeaconDetected.beacon = mVBeacon;
                mVBeacon.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVDeviceLocation mVDeviceLocation = new MVDeviceLocation();
                mVBeaconDetected.location = mVDeviceLocation;
                mVDeviceLocation.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVBeaconDetected.timestamp = jVar.mo61697j();
                mVBeaconDetected.mo26742i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBeaconDetected$d */
    public static class C8548d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8547c(0);
        }
    }

    static {
        new C17394d0("MVBeaconDetected");
        HashMap hashMap = new HashMap();
        f25336e = hashMap;
        hashMap.put(C25239c.class, new C8546b());
        hashMap.put(C25240d.class, new C8548d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BEACON, new FieldMetaData("beacon", (byte) 3, new StructMetaData(MVBeacon.class)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 2, new StructMetaData(MVDeviceLocation.class)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25337f = unmodifiableMap;
        FieldMetaData.m61947a(MVBeaconDetected.class, unmodifiableMap);
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
        ((C25238b) f25336e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25336e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVBeaconDetected mVBeaconDetected = (MVBeaconDetected) obj;
        if (!getClass().equals(mVBeaconDetected.getClass())) {
            return getClass().getName().compareTo(mVBeaconDetected.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26738f()).compareTo(Boolean.valueOf(mVBeaconDetected.mo26738f()));
        if (compareTo != 0 || ((mo26738f() && (compareTo = this.beacon.compareTo(mVBeaconDetected.beacon)) != 0) || (compareTo = Boolean.valueOf(mo26739g()).compareTo(Boolean.valueOf(mVBeaconDetected.mo26739g()))) != 0 || ((mo26739g() && (compareTo = this.location.compareTo(mVBeaconDetected.location)) != 0) || (compareTo = Boolean.valueOf(mo26740h()).compareTo(Boolean.valueOf(mVBeaconDetected.mo26740h()))) != 0))) {
            return compareTo;
        }
        if (!mo26740h() || (d = C25082a.m62840d(this.timestamp, mVBeaconDetected.timestamp)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVBeaconDetected)) {
            return false;
        }
        MVBeaconDetected mVBeaconDetected = (MVBeaconDetected) obj;
        boolean f = mo26738f();
        boolean f2 = mVBeaconDetected.mo26738f();
        if ((f || f2) && (!f || !f2 || !this.beacon.mo26720a(mVBeaconDetected.beacon))) {
            return false;
        }
        boolean g = mo26739g();
        boolean g2 = mVBeaconDetected.mo26739g();
        if (((g || g2) && (!g || !g2 || !this.location.mo26798a(mVBeaconDetected.location))) || this.timestamp != mVBeaconDetected.timestamp) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26738f() {
        return this.beacon != null;
    }

    /* renamed from: g */
    public final boolean mo26739g() {
        return this.location != null;
    }

    /* renamed from: h */
    public final boolean mo26740h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26742i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBeaconDetected(", "beacon:");
        MVBeacon mVBeacon = this.beacon;
        if (mVBeacon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVBeacon);
        }
        if (mo26739g()) {
            n.append(", ");
            n.append("location:");
            MVDeviceLocation mVDeviceLocation = this.location;
            if (mVDeviceLocation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVDeviceLocation);
            }
        }
        n.append(", ");
        n.append("timestamp:");
        return C25541a.m63884o(n, this.timestamp, ")");
    }
}
