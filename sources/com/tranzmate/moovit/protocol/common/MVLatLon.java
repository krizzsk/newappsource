package com.tranzmate.moovit.protocol.common;

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

public class MVLatLon implements TBase<MVLatLon, _Fields>, Serializable, Cloneable, Comparable<MVLatLon> {

    /* renamed from: b */
    public static final C25113c f25077b = new C25113c("latitude", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25078c = new C25113c("longitude", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f25079d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25080e;
    private byte __isset_bitfield;
    public int latitude;
    public int longitude;

    public enum _Fields implements C25085c {
        LATITUDE(1, "latitude"),
        LONGITUDE(2, "longitude");
        
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
                return LATITUDE;
            }
            if (i != 2) {
                return null;
            }
            return LONGITUDE;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLatLon$a */
    public static class C8456a extends C25239c<MVLatLon> {
        public C8456a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLatLon mVLatLon = (MVLatLon) tBase;
            mVLatLon.getClass();
            C25113c cVar = MVLatLon.f25077b;
            gVar.mo61687K();
            gVar.mo61711x(MVLatLon.f25077b);
            gVar.mo61678B(mVLatLon.latitude);
            gVar.mo61712y();
            gVar.mo61711x(MVLatLon.f25078c);
            C16530d.m42020n(gVar, mVLatLon.longitude);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLatLon mVLatLon = (MVLatLon) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLatLon.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVLatLon.longitude = gVar.mo61696i();
                        mVLatLon.mo26297i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVLatLon.latitude = gVar.mo61696i();
                    mVLatLon.mo26295h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLatLon$b */
    public static class C8457b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8456a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLatLon$c */
    public static class C8458c extends C25240d<MVLatLon> {
        public C8458c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLatLon mVLatLon = (MVLatLon) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLatLon.mo26293f()) {
                bitSet.set(0);
            }
            if (mVLatLon.mo26294g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVLatLon.mo26293f()) {
                jVar.mo61678B(mVLatLon.latitude);
            }
            if (mVLatLon.mo26294g()) {
                jVar.mo61678B(mVLatLon.longitude);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLatLon mVLatLon = (MVLatLon) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVLatLon.latitude = jVar.mo61696i();
                mVLatLon.mo26295h();
            }
            if (T.get(1)) {
                mVLatLon.longitude = jVar.mo61696i();
                mVLatLon.mo26297i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLatLon$d */
    public static class C8459d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8458c(0);
        }
    }

    static {
        new C17394d0("MVLatLon");
        HashMap hashMap = new HashMap();
        f25079d = hashMap;
        hashMap.put(C25239c.class, new C8457b());
        hashMap.put(C25240d.class, new C8459d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LATITUDE, new FieldMetaData("latitude", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LONGITUDE, new FieldMetaData("longitude", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25080e = unmodifiableMap;
        FieldMetaData.m61947a(MVLatLon.class, unmodifiableMap);
    }

    public MVLatLon() {
        this.__isset_bitfield = 0;
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
        ((C25238b) f25079d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25079d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26290a(MVLatLon mVLatLon) {
        if (mVLatLon != null && this.latitude == mVLatLon.latitude && this.longitude == mVLatLon.longitude) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int c;
        MVLatLon mVLatLon = (MVLatLon) obj;
        if (!getClass().equals(mVLatLon.getClass())) {
            return getClass().getName().compareTo(mVLatLon.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26293f()).compareTo(Boolean.valueOf(mVLatLon.mo26293f()));
        if (compareTo != 0 || ((mo26293f() && (compareTo = C25082a.m62839c(this.latitude, mVLatLon.latitude)) != 0) || (compareTo = Boolean.valueOf(mo26294g()).compareTo(Boolean.valueOf(mVLatLon.mo26294g()))) != 0)) {
            return compareTo;
        }
        if (!mo26294g() || (c = C25082a.m62839c(this.longitude, mVLatLon.longitude)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVLatLon)) {
            return mo26290a((MVLatLon) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26293f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26294g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final void mo26295h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26297i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLatLon(", "latitude:");
        C0016g.m42z(n, this.latitude, ", ", "longitude:");
        return C13437d.m33707l(n, this.longitude, ")");
    }

    public MVLatLon(int i, int i2) {
        this();
        this.latitude = i;
        mo26295h();
        this.longitude = i2;
        mo26297i();
    }
}
