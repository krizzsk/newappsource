package com.tranzmate.moovit.protocol.common;

import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
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

public class MVVersion implements TBase<MVVersion, _Fields>, Serializable, Cloneable, Comparable<MVVersion> {

    /* renamed from: b */
    public static final C25113c f25179b = new C25113c("major", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25180c = new C25113c("minor", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25181d = new C25113c(BillingClientBuilderBridgeCommon.buildMethodName, (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25182e = new C25113c("revision", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f25183f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f25184g;
    private byte __isset_bitfield = 0;
    public int build;
    public int major;
    public int minor;
    public int revision;

    public enum _Fields implements C25085c {
        MAJOR(1, "major"),
        MINOR(2, "minor"),
        BUILD(3, BillingClientBuilderBridgeCommon.buildMethodName),
        REVISION(4, "revision");
        
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
                return MAJOR;
            }
            if (i == 2) {
                return MINOR;
            }
            if (i == 3) {
                return BUILD;
            }
            if (i != 4) {
                return null;
            }
            return REVISION;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVVersion$a */
    public static class C8513a extends C25239c<MVVersion> {
        public C8513a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVersion mVVersion = (MVVersion) tBase;
            mVVersion.getClass();
            C25113c cVar = MVVersion.f25179b;
            gVar.mo61687K();
            gVar.mo61711x(MVVersion.f25179b);
            gVar.mo61678B(mVVersion.major);
            gVar.mo61712y();
            gVar.mo61711x(MVVersion.f25180c);
            gVar.mo61678B(mVVersion.minor);
            gVar.mo61712y();
            gVar.mo61711x(MVVersion.f25181d);
            gVar.mo61678B(mVVersion.build);
            gVar.mo61712y();
            gVar.mo61711x(MVVersion.f25182e);
            C16530d.m42020n(gVar, mVVersion.revision);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVersion mVVersion = (MVVersion) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVVersion.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVVersion.revision = gVar.mo61696i();
                                mVVersion.mo26465m();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVVersion.build = gVar.mo61696i();
                            mVVersion.mo26462j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVVersion.minor = gVar.mo61696i();
                        mVVersion.mo26464l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVVersion.major = gVar.mo61696i();
                    mVVersion.mo26463k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVVersion$b */
    public static class C8514b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8513a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVVersion$c */
    public static class C8515c extends C25240d<MVVersion> {
        public C8515c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVersion mVVersion = (MVVersion) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVVersion.mo26458g()) {
                bitSet.set(0);
            }
            if (mVVersion.mo26459h()) {
                bitSet.set(1);
            }
            if (mVVersion.mo26457f()) {
                bitSet.set(2);
            }
            if (mVVersion.mo26461i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVVersion.mo26458g()) {
                jVar.mo61678B(mVVersion.major);
            }
            if (mVVersion.mo26459h()) {
                jVar.mo61678B(mVVersion.minor);
            }
            if (mVVersion.mo26457f()) {
                jVar.mo61678B(mVVersion.build);
            }
            if (mVVersion.mo26461i()) {
                jVar.mo61678B(mVVersion.revision);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVersion mVVersion = (MVVersion) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVVersion.major = jVar.mo61696i();
                mVVersion.mo26463k();
            }
            if (T.get(1)) {
                mVVersion.minor = jVar.mo61696i();
                mVVersion.mo26464l();
            }
            if (T.get(2)) {
                mVVersion.build = jVar.mo61696i();
                mVVersion.mo26462j();
            }
            if (T.get(3)) {
                mVVersion.revision = jVar.mo61696i();
                mVVersion.mo26465m();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVVersion$d */
    public static class C8516d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8515c(0);
        }
    }

    static {
        new C17394d0("MVVersion");
        HashMap hashMap = new HashMap();
        f25183f = hashMap;
        hashMap.put(C25239c.class, new C8514b());
        hashMap.put(C25240d.class, new C8516d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MAJOR, new FieldMetaData("major", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MINOR, new FieldMetaData("minor", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.BUILD, new FieldMetaData(BillingClientBuilderBridgeCommon.buildMethodName, (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.REVISION, new FieldMetaData("revision", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25184g = unmodifiableMap;
        FieldMetaData.m61947a(MVVersion.class, unmodifiableMap);
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
        ((C25238b) f25183f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25183f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26454a(MVVersion mVVersion) {
        if (mVVersion != null && this.major == mVVersion.major && this.minor == mVVersion.minor && this.build == mVVersion.build && this.revision == mVVersion.revision) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int c;
        MVVersion mVVersion = (MVVersion) obj;
        if (!getClass().equals(mVVersion.getClass())) {
            return getClass().getName().compareTo(mVVersion.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26458g()).compareTo(Boolean.valueOf(mVVersion.mo26458g()));
        if (compareTo != 0 || ((mo26458g() && (compareTo = C25082a.m62839c(this.major, mVVersion.major)) != 0) || (compareTo = Boolean.valueOf(mo26459h()).compareTo(Boolean.valueOf(mVVersion.mo26459h()))) != 0 || ((mo26459h() && (compareTo = C25082a.m62839c(this.minor, mVVersion.minor)) != 0) || (compareTo = Boolean.valueOf(mo26457f()).compareTo(Boolean.valueOf(mVVersion.mo26457f()))) != 0 || ((mo26457f() && (compareTo = C25082a.m62839c(this.build, mVVersion.build)) != 0) || (compareTo = Boolean.valueOf(mo26461i()).compareTo(Boolean.valueOf(mVVersion.mo26461i()))) != 0)))) {
            return compareTo;
        }
        if (!mo26461i() || (c = C25082a.m62839c(this.revision, mVVersion.revision)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVVersion)) {
            return mo26454a((MVVersion) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26457f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo26458g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo26459h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26461i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: j */
    public final void mo26462j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo26463k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo26464l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo26465m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVVersion(", "major:");
        C0016g.m42z(n, this.major, ", ", "minor:");
        C0016g.m42z(n, this.minor, ", ", "build:");
        C0016g.m42z(n, this.build, ", ", "revision:");
        return C13437d.m33707l(n, this.revision, ")");
    }
}
