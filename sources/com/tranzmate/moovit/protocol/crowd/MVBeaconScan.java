package com.tranzmate.moovit.protocol.crowd;

import com.appboy.support.StringUtils;
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

public class MVBeaconScan implements TBase<MVBeaconScan, _Fields>, Serializable, Cloneable, Comparable<MVBeaconScan> {

    /* renamed from: b */
    public static final C25113c f25338b = new C25113c("beaconType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25339c = new C25113c("identifiers", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f25340d = new C25113c("lastKnownLocation", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f25341e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25342f;
    private byte __isset_bitfield = 0;
    public int beaconType;
    public List<String> identifiers;
    public MVDeviceLocation lastKnownLocation;
    private _Fields[] optionals = {_Fields.LAST_KNOWN_LOCATION};

    public enum _Fields implements C25085c {
        BEACON_TYPE(1, "beaconType"),
        IDENTIFIERS(2, "identifiers"),
        LAST_KNOWN_LOCATION(3, "lastKnownLocation");
        
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
                return BEACON_TYPE;
            }
            if (i == 2) {
                return IDENTIFIERS;
            }
            if (i != 3) {
                return null;
            }
            return LAST_KNOWN_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBeaconScan$a */
    public static class C8549a extends C25239c<MVBeaconScan> {
        public C8549a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBeaconScan mVBeaconScan = (MVBeaconScan) tBase;
            MVDeviceLocation mVDeviceLocation = mVBeaconScan.lastKnownLocation;
            if (mVDeviceLocation != null) {
                mVDeviceLocation.mo26817u();
            }
            C25113c cVar = MVBeaconScan.f25338b;
            gVar.mo61687K();
            gVar.mo61711x(MVBeaconScan.f25338b);
            gVar.mo61678B(mVBeaconScan.beaconType);
            gVar.mo61712y();
            if (mVBeaconScan.identifiers != null) {
                gVar.mo61711x(MVBeaconScan.f25339c);
                gVar.mo61680D(new C25119e((byte) 11, mVBeaconScan.identifiers.size()));
                for (String J : mVBeaconScan.identifiers) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVBeaconScan.lastKnownLocation != null && mVBeaconScan.mo26749h()) {
                gVar.mo61711x(MVBeaconScan.f25340d);
                mVBeaconScan.lastKnownLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBeaconScan mVBeaconScan = (MVBeaconScan) tBase;
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
                        } else if (b == 12) {
                            MVDeviceLocation mVDeviceLocation = new MVDeviceLocation();
                            mVBeaconScan.lastKnownLocation = mVDeviceLocation;
                            mVDeviceLocation.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVBeaconScan.identifiers = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            mVBeaconScan.identifiers.add(gVar.mo61704q());
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVBeaconScan.beaconType = gVar.mo61696i();
                    mVBeaconScan.mo26751i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVDeviceLocation mVDeviceLocation2 = mVBeaconScan.lastKnownLocation;
            if (mVDeviceLocation2 != null) {
                mVDeviceLocation2.mo26817u();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBeaconScan$b */
    public static class C8550b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8549a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBeaconScan$c */
    public static class C8551c extends C25240d<MVBeaconScan> {
        public C8551c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBeaconScan mVBeaconScan = (MVBeaconScan) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBeaconScan.mo26747f()) {
                bitSet.set(0);
            }
            if (mVBeaconScan.mo26748g()) {
                bitSet.set(1);
            }
            if (mVBeaconScan.mo26749h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVBeaconScan.mo26747f()) {
                jVar.mo61678B(mVBeaconScan.beaconType);
            }
            if (mVBeaconScan.mo26748g()) {
                jVar.mo61678B(mVBeaconScan.identifiers.size());
                for (String J : mVBeaconScan.identifiers) {
                    jVar.mo61686J(J);
                }
            }
            if (mVBeaconScan.mo26749h()) {
                mVBeaconScan.lastKnownLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBeaconScan mVBeaconScan = (MVBeaconScan) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVBeaconScan.beaconType = jVar.mo61696i();
                mVBeaconScan.mo26751i();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVBeaconScan.identifiers = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVBeaconScan.identifiers.add(jVar.mo61704q());
                }
            }
            if (T.get(2)) {
                MVDeviceLocation mVDeviceLocation = new MVDeviceLocation();
                mVBeaconScan.lastKnownLocation = mVDeviceLocation;
                mVDeviceLocation.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBeaconScan$d */
    public static class C8552d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8551c(0);
        }
    }

    static {
        new C17394d0("MVBeaconScan");
        HashMap hashMap = new HashMap();
        f25341e = hashMap;
        hashMap.put(C25239c.class, new C8550b());
        hashMap.put(C25240d.class, new C8552d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BEACON_TYPE, new FieldMetaData("beaconType", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IDENTIFIERS, new FieldMetaData("identifiers", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.LAST_KNOWN_LOCATION, new FieldMetaData("lastKnownLocation", (byte) 2, new StructMetaData(MVDeviceLocation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25342f = unmodifiableMap;
        FieldMetaData.m61947a(MVBeaconScan.class, unmodifiableMap);
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
        ((C25238b) f25341e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25341e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVBeaconScan mVBeaconScan = (MVBeaconScan) obj;
        if (!getClass().equals(mVBeaconScan.getClass())) {
            return getClass().getName().compareTo(mVBeaconScan.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26747f()).compareTo(Boolean.valueOf(mVBeaconScan.mo26747f()));
        if (compareTo2 != 0 || ((mo26747f() && (compareTo2 = C25082a.m62839c(this.beaconType, mVBeaconScan.beaconType)) != 0) || (compareTo2 = Boolean.valueOf(mo26748g()).compareTo(Boolean.valueOf(mVBeaconScan.mo26748g()))) != 0 || ((mo26748g() && (compareTo2 = C25082a.m62844h(this.identifiers, mVBeaconScan.identifiers)) != 0) || (compareTo2 = Boolean.valueOf(mo26749h()).compareTo(Boolean.valueOf(mVBeaconScan.mo26749h()))) != 0))) {
            return compareTo2;
        }
        if (!mo26749h() || (compareTo = this.lastKnownLocation.compareTo(mVBeaconScan.lastKnownLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVBeaconScan)) {
            return false;
        }
        MVBeaconScan mVBeaconScan = (MVBeaconScan) obj;
        if (this.beaconType != mVBeaconScan.beaconType) {
            return false;
        }
        boolean g = mo26748g();
        boolean g2 = mVBeaconScan.mo26748g();
        if ((g || g2) && (!g || !g2 || !this.identifiers.equals(mVBeaconScan.identifiers))) {
            return false;
        }
        boolean h = mo26749h();
        boolean h2 = mVBeaconScan.mo26749h();
        if ((h || h2) && (!h || !h2 || !this.lastKnownLocation.mo26798a(mVBeaconScan.lastKnownLocation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26747f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26748g() {
        return this.identifiers != null;
    }

    /* renamed from: h */
    public final boolean mo26749h() {
        return this.lastKnownLocation != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26751i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBeaconScan(", "beaconType:");
        C0016g.m42z(n, this.beaconType, ", ", "identifiers:");
        List<String> list = this.identifiers;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo26749h()) {
            n.append(", ");
            n.append("lastKnownLocation:");
            MVDeviceLocation mVDeviceLocation = this.lastKnownLocation;
            if (mVDeviceLocation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVDeviceLocation);
            }
        }
        n.append(")");
        return n.toString();
    }
}
