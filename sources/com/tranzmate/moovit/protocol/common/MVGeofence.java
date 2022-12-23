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

public class MVGeofence implements TBase<MVGeofence, _Fields>, Serializable, Cloneable, Comparable<MVGeofence> {

    /* renamed from: b */
    public static final C25113c f25020b = new C25113c("center", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f25021c = new C25113c("radiusMeters", (byte) 6, 2);

    /* renamed from: d */
    public static final HashMap f25022d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25023e;
    private byte __isset_bitfield = 0;
    public MVLatLon center;
    public short radiusMeters;

    public enum _Fields implements C25085c {
        CENTER(1, "center"),
        RADIUS_METERS(2, "radiusMeters");
        
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
                return CENTER;
            }
            if (i != 2) {
                return null;
            }
            return RADIUS_METERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVGeofence$a */
    public static class C8404a extends C25239c<MVGeofence> {
        public C8404a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGeofence mVGeofence = (MVGeofence) tBase;
            MVLatLon mVLatLon = mVGeofence.center;
            C25113c cVar = MVGeofence.f25020b;
            gVar.mo61687K();
            if (mVGeofence.center != null) {
                gVar.mo61711x(MVGeofence.f25020b);
                mVGeofence.center.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVGeofence.f25021c);
            gVar.mo61677A(mVGeofence.radiusMeters);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGeofence mVGeofence = (MVGeofence) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVGeofence.center;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 6) {
                        mVGeofence.radiusMeters = gVar.mo61695h();
                        mVGeofence.mo26174h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVLatLon mVLatLon2 = new MVLatLon();
                    mVGeofence.center = mVLatLon2;
                    mVLatLon2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVGeofence$b */
    public static class C8405b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8404a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVGeofence$c */
    public static class C8406c extends C25240d<MVGeofence> {
        public C8406c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGeofence mVGeofence = (MVGeofence) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGeofence.mo26172f()) {
                bitSet.set(0);
            }
            if (mVGeofence.mo26173g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVGeofence.mo26172f()) {
                mVGeofence.center.mo25202X0(jVar);
            }
            if (mVGeofence.mo26173g()) {
                jVar.mo61677A(mVGeofence.radiusMeters);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGeofence mVGeofence = (MVGeofence) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVGeofence.center = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVGeofence.radiusMeters = jVar.mo61695h();
                mVGeofence.mo26174h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVGeofence$d */
    public static class C8407d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8406c(0);
        }
    }

    static {
        new C17394d0("MVGeofence");
        HashMap hashMap = new HashMap();
        f25022d = hashMap;
        hashMap.put(C25239c.class, new C8405b());
        hashMap.put(C25240d.class, new C8407d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CENTER, new FieldMetaData("center", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.RADIUS_METERS, new FieldMetaData("radiusMeters", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25023e = unmodifiableMap;
        FieldMetaData.m61947a(MVGeofence.class, unmodifiableMap);
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
        ((C25238b) f25022d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25022d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26169a(MVGeofence mVGeofence) {
        if (mVGeofence == null) {
            return false;
        }
        boolean f = mo26172f();
        boolean f2 = mVGeofence.mo26172f();
        if (((f || f2) && (!f || !f2 || !this.center.mo26290a(mVGeofence.center))) || this.radiusMeters != mVGeofence.radiusMeters) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int k;
        MVGeofence mVGeofence = (MVGeofence) obj;
        if (!getClass().equals(mVGeofence.getClass())) {
            return getClass().getName().compareTo(mVGeofence.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26172f()).compareTo(Boolean.valueOf(mVGeofence.mo26172f()));
        if (compareTo != 0 || ((mo26172f() && (compareTo = this.center.compareTo(mVGeofence.center)) != 0) || (compareTo = Boolean.valueOf(mo26173g()).compareTo(Boolean.valueOf(mVGeofence.mo26173g()))) != 0)) {
            return compareTo;
        }
        if (!mo26173g() || (k = C25082a.m62847k(this.radiusMeters, mVGeofence.radiusMeters)) == 0) {
            return 0;
        }
        return k;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVGeofence)) {
            return mo26169a((MVGeofence) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26172f() {
        return this.center != null;
    }

    /* renamed from: g */
    public final boolean mo26173g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo26174h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGeofence(", "center:");
        MVLatLon mVLatLon = this.center;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("radiusMeters:");
        return C13437d.m33707l(n, this.radiusMeters, ")");
    }
}
