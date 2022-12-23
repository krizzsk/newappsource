package com.tranzmate.moovit.protocol.kinesis;

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

public class MVDCConfigurationActivated implements TBase<MVDCConfigurationActivated, _Fields>, Serializable, Cloneable, Comparable<MVDCConfigurationActivated> {

    /* renamed from: b */
    public static final C25113c f25892b = new C25113c("configurationTimestamp", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f25893c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25894d = new C25113c("metroId", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f25895e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25896f;
    private byte __isset_bitfield = 0;
    public long configurationTimestamp;
    public int metroId;
    public long timestamp;

    public enum _Fields implements C25085c {
        CONFIGURATION_TIMESTAMP(1, "configurationTimestamp"),
        TIMESTAMP(2, "timestamp"),
        METRO_ID(3, "metroId");
        
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
                return CONFIGURATION_TIMESTAMP;
            }
            if (i == 2) {
                return TIMESTAMP;
            }
            if (i != 3) {
                return null;
            }
            return METRO_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDCConfigurationActivated$a */
    public static class C8891a extends C25239c<MVDCConfigurationActivated> {
        public C8891a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDCConfigurationActivated mVDCConfigurationActivated = (MVDCConfigurationActivated) tBase;
            mVDCConfigurationActivated.getClass();
            C25113c cVar = MVDCConfigurationActivated.f25892b;
            gVar.mo61687K();
            gVar.mo61711x(MVDCConfigurationActivated.f25892b);
            gVar.mo61679C(mVDCConfigurationActivated.configurationTimestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVDCConfigurationActivated.f25893c);
            gVar.mo61679C(mVDCConfigurationActivated.timestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVDCConfigurationActivated.f25894d);
            C16530d.m42020n(gVar, mVDCConfigurationActivated.metroId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDCConfigurationActivated mVDCConfigurationActivated = (MVDCConfigurationActivated) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDCConfigurationActivated.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVDCConfigurationActivated.metroId = gVar.mo61696i();
                            mVDCConfigurationActivated.mo27687j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVDCConfigurationActivated.timestamp = gVar.mo61697j();
                        mVDCConfigurationActivated.mo27688k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVDCConfigurationActivated.configurationTimestamp = gVar.mo61697j();
                    mVDCConfigurationActivated.mo27686i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDCConfigurationActivated$b */
    public static class C8892b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8891a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDCConfigurationActivated$c */
    public static class C8893c extends C25240d<MVDCConfigurationActivated> {
        public C8893c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDCConfigurationActivated mVDCConfigurationActivated = (MVDCConfigurationActivated) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDCConfigurationActivated.mo27682f()) {
                bitSet.set(0);
            }
            if (mVDCConfigurationActivated.mo27684h()) {
                bitSet.set(1);
            }
            if (mVDCConfigurationActivated.mo27683g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVDCConfigurationActivated.mo27682f()) {
                jVar.mo61679C(mVDCConfigurationActivated.configurationTimestamp);
            }
            if (mVDCConfigurationActivated.mo27684h()) {
                jVar.mo61679C(mVDCConfigurationActivated.timestamp);
            }
            if (mVDCConfigurationActivated.mo27683g()) {
                jVar.mo61678B(mVDCConfigurationActivated.metroId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDCConfigurationActivated mVDCConfigurationActivated = (MVDCConfigurationActivated) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVDCConfigurationActivated.configurationTimestamp = jVar.mo61697j();
                mVDCConfigurationActivated.mo27686i();
            }
            if (T.get(1)) {
                mVDCConfigurationActivated.timestamp = jVar.mo61697j();
                mVDCConfigurationActivated.mo27688k();
            }
            if (T.get(2)) {
                mVDCConfigurationActivated.metroId = jVar.mo61696i();
                mVDCConfigurationActivated.mo27687j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDCConfigurationActivated$d */
    public static class C8894d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8893c(0);
        }
    }

    static {
        new C17394d0("MVDCConfigurationActivated");
        HashMap hashMap = new HashMap();
        f25895e = hashMap;
        hashMap.put(C25239c.class, new C8892b());
        hashMap.put(C25240d.class, new C8894d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONFIGURATION_TIMESTAMP, new FieldMetaData("configurationTimestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25896f = unmodifiableMap;
        FieldMetaData.m61947a(MVDCConfigurationActivated.class, unmodifiableMap);
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
        ((C25238b) f25895e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25895e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVDCConfigurationActivated mVDCConfigurationActivated = (MVDCConfigurationActivated) obj;
        if (!getClass().equals(mVDCConfigurationActivated.getClass())) {
            return getClass().getName().compareTo(mVDCConfigurationActivated.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27682f()).compareTo(Boolean.valueOf(mVDCConfigurationActivated.mo27682f()));
        if (compareTo != 0 || ((mo27682f() && (compareTo = C25082a.m62840d(this.configurationTimestamp, mVDCConfigurationActivated.configurationTimestamp)) != 0) || (compareTo = Boolean.valueOf(mo27684h()).compareTo(Boolean.valueOf(mVDCConfigurationActivated.mo27684h()))) != 0 || ((mo27684h() && (compareTo = C25082a.m62840d(this.timestamp, mVDCConfigurationActivated.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo27683g()).compareTo(Boolean.valueOf(mVDCConfigurationActivated.mo27683g()))) != 0))) {
            return compareTo;
        }
        if (!mo27683g() || (c = C25082a.m62839c(this.metroId, mVDCConfigurationActivated.metroId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDCConfigurationActivated)) {
            return false;
        }
        MVDCConfigurationActivated mVDCConfigurationActivated = (MVDCConfigurationActivated) obj;
        if (this.configurationTimestamp == mVDCConfigurationActivated.configurationTimestamp && this.timestamp == mVDCConfigurationActivated.timestamp && this.metroId == mVDCConfigurationActivated.metroId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27682f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo27683g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo27684h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27686i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo27687j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo27688k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDCConfigurationActivated(", "configurationTimestamp:");
        C25541a.m63889t(n, this.configurationTimestamp, ", ", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "metroId:");
        return C13437d.m33707l(n, this.metroId, ")");
    }
}
