package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodSelectedProfile implements TBase<MVTodSelectedProfile, _Fields>, Serializable, Cloneable, Comparable<MVTodSelectedProfile> {

    /* renamed from: b */
    public static final C25113c f29614b = new C25113c("profileId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29615c = new C25113c("quantity", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f29616d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29617e;
    private byte __isset_bitfield = 0;
    public int profileId;
    public int quantity;

    public enum _Fields implements C25085c {
        PROFILE_ID(1, "profileId"),
        QUANTITY(2, "quantity");
        
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
                return PROFILE_ID;
            }
            if (i != 2) {
                return null;
            }
            return QUANTITY;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSelectedProfile$a */
    public static class C11340a extends C25239c<MVTodSelectedProfile> {
        public C11340a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodSelectedProfile mVTodSelectedProfile = (MVTodSelectedProfile) tBase;
            mVTodSelectedProfile.getClass();
            C25113c cVar = MVTodSelectedProfile.f29614b;
            gVar.mo61687K();
            gVar.mo61711x(MVTodSelectedProfile.f29614b);
            gVar.mo61678B(mVTodSelectedProfile.profileId);
            gVar.mo61712y();
            gVar.mo61711x(MVTodSelectedProfile.f29615c);
            C16530d.m42020n(gVar, mVTodSelectedProfile.quantity);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodSelectedProfile mVTodSelectedProfile = (MVTodSelectedProfile) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodSelectedProfile.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVTodSelectedProfile.quantity = gVar.mo61696i();
                        mVTodSelectedProfile.mo33795i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTodSelectedProfile.profileId = gVar.mo61696i();
                    mVTodSelectedProfile.mo33793h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSelectedProfile$b */
    public static class C11341b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11340a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSelectedProfile$c */
    public static class C11342c extends C25240d<MVTodSelectedProfile> {
        public C11342c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodSelectedProfile mVTodSelectedProfile = (MVTodSelectedProfile) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodSelectedProfile.mo33791f()) {
                bitSet.set(0);
            }
            if (mVTodSelectedProfile.mo33792g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodSelectedProfile.mo33791f()) {
                jVar.mo61678B(mVTodSelectedProfile.profileId);
            }
            if (mVTodSelectedProfile.mo33792g()) {
                jVar.mo61678B(mVTodSelectedProfile.quantity);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodSelectedProfile mVTodSelectedProfile = (MVTodSelectedProfile) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTodSelectedProfile.profileId = jVar.mo61696i();
                mVTodSelectedProfile.mo33793h();
            }
            if (T.get(1)) {
                mVTodSelectedProfile.quantity = jVar.mo61696i();
                mVTodSelectedProfile.mo33795i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSelectedProfile$d */
    public static class C11343d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11342c(0);
        }
    }

    static {
        new C17394d0("MVTodSelectedProfile");
        HashMap hashMap = new HashMap();
        f29616d = hashMap;
        hashMap.put(C25239c.class, new C11341b());
        hashMap.put(C25240d.class, new C11343d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROFILE_ID, new FieldMetaData("profileId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.QUANTITY, new FieldMetaData("quantity", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29617e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodSelectedProfile.class, unmodifiableMap);
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
        ((C25238b) f29616d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29616d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVTodSelectedProfile mVTodSelectedProfile = (MVTodSelectedProfile) obj;
        if (!getClass().equals(mVTodSelectedProfile.getClass())) {
            return getClass().getName().compareTo(mVTodSelectedProfile.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33791f()).compareTo(Boolean.valueOf(mVTodSelectedProfile.mo33791f()));
        if (compareTo != 0 || ((mo33791f() && (compareTo = C25082a.m62839c(this.profileId, mVTodSelectedProfile.profileId)) != 0) || (compareTo = Boolean.valueOf(mo33792g()).compareTo(Boolean.valueOf(mVTodSelectedProfile.mo33792g()))) != 0)) {
            return compareTo;
        }
        if (!mo33792g() || (c = C25082a.m62839c(this.quantity, mVTodSelectedProfile.quantity)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodSelectedProfile)) {
            return false;
        }
        MVTodSelectedProfile mVTodSelectedProfile = (MVTodSelectedProfile) obj;
        if (this.profileId == mVTodSelectedProfile.profileId && this.quantity == mVTodSelectedProfile.quantity) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33791f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo33792g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final void mo33793h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo33795i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodSelectedProfile(", "profileId:");
        C0016g.m42z(n, this.profileId, ", ", "quantity:");
        return C13437d.m33707l(n, this.quantity, ")");
    }
}
