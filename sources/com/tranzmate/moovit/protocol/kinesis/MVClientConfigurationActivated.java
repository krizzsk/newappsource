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

public class MVClientConfigurationActivated implements TBase<MVClientConfigurationActivated, _Fields>, Serializable, Cloneable, Comparable<MVClientConfigurationActivated> {

    /* renamed from: b */
    public static final C25113c f25887b = new C25113c("configurationTimestamp", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f25888c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25889d = new C25113c("metroId", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f25890e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25891f;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVClientConfigurationActivated$a */
    public static class C8887a extends C25239c<MVClientConfigurationActivated> {
        public C8887a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVClientConfigurationActivated mVClientConfigurationActivated = (MVClientConfigurationActivated) tBase;
            mVClientConfigurationActivated.getClass();
            C25113c cVar = MVClientConfigurationActivated.f25887b;
            gVar.mo61687K();
            gVar.mo61711x(MVClientConfigurationActivated.f25887b);
            gVar.mo61679C(mVClientConfigurationActivated.configurationTimestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVClientConfigurationActivated.f25888c);
            gVar.mo61679C(mVClientConfigurationActivated.timestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVClientConfigurationActivated.f25889d);
            C16530d.m42020n(gVar, mVClientConfigurationActivated.metroId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVClientConfigurationActivated mVClientConfigurationActivated = (MVClientConfigurationActivated) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVClientConfigurationActivated.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVClientConfigurationActivated.metroId = gVar.mo61696i();
                            mVClientConfigurationActivated.mo27675j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVClientConfigurationActivated.timestamp = gVar.mo61697j();
                        mVClientConfigurationActivated.mo27676k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVClientConfigurationActivated.configurationTimestamp = gVar.mo61697j();
                    mVClientConfigurationActivated.mo27674i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVClientConfigurationActivated$b */
    public static class C8888b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8887a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVClientConfigurationActivated$c */
    public static class C8889c extends C25240d<MVClientConfigurationActivated> {
        public C8889c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVClientConfigurationActivated mVClientConfigurationActivated = (MVClientConfigurationActivated) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVClientConfigurationActivated.mo27670f()) {
                bitSet.set(0);
            }
            if (mVClientConfigurationActivated.mo27672h()) {
                bitSet.set(1);
            }
            if (mVClientConfigurationActivated.mo27671g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVClientConfigurationActivated.mo27670f()) {
                jVar.mo61679C(mVClientConfigurationActivated.configurationTimestamp);
            }
            if (mVClientConfigurationActivated.mo27672h()) {
                jVar.mo61679C(mVClientConfigurationActivated.timestamp);
            }
            if (mVClientConfigurationActivated.mo27671g()) {
                jVar.mo61678B(mVClientConfigurationActivated.metroId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVClientConfigurationActivated mVClientConfigurationActivated = (MVClientConfigurationActivated) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVClientConfigurationActivated.configurationTimestamp = jVar.mo61697j();
                mVClientConfigurationActivated.mo27674i();
            }
            if (T.get(1)) {
                mVClientConfigurationActivated.timestamp = jVar.mo61697j();
                mVClientConfigurationActivated.mo27676k();
            }
            if (T.get(2)) {
                mVClientConfigurationActivated.metroId = jVar.mo61696i();
                mVClientConfigurationActivated.mo27675j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVClientConfigurationActivated$d */
    public static class C8890d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8889c(0);
        }
    }

    static {
        new C17394d0("MVClientConfigurationActivated");
        HashMap hashMap = new HashMap();
        f25890e = hashMap;
        hashMap.put(C25239c.class, new C8888b());
        hashMap.put(C25240d.class, new C8890d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONFIGURATION_TIMESTAMP, new FieldMetaData("configurationTimestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25891f = unmodifiableMap;
        FieldMetaData.m61947a(MVClientConfigurationActivated.class, unmodifiableMap);
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
        ((C25238b) f25890e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25890e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVClientConfigurationActivated mVClientConfigurationActivated = (MVClientConfigurationActivated) obj;
        if (!getClass().equals(mVClientConfigurationActivated.getClass())) {
            return getClass().getName().compareTo(mVClientConfigurationActivated.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27670f()).compareTo(Boolean.valueOf(mVClientConfigurationActivated.mo27670f()));
        if (compareTo != 0 || ((mo27670f() && (compareTo = C25082a.m62840d(this.configurationTimestamp, mVClientConfigurationActivated.configurationTimestamp)) != 0) || (compareTo = Boolean.valueOf(mo27672h()).compareTo(Boolean.valueOf(mVClientConfigurationActivated.mo27672h()))) != 0 || ((mo27672h() && (compareTo = C25082a.m62840d(this.timestamp, mVClientConfigurationActivated.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo27671g()).compareTo(Boolean.valueOf(mVClientConfigurationActivated.mo27671g()))) != 0))) {
            return compareTo;
        }
        if (!mo27671g() || (c = C25082a.m62839c(this.metroId, mVClientConfigurationActivated.metroId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVClientConfigurationActivated)) {
            return false;
        }
        MVClientConfigurationActivated mVClientConfigurationActivated = (MVClientConfigurationActivated) obj;
        if (this.configurationTimestamp == mVClientConfigurationActivated.configurationTimestamp && this.timestamp == mVClientConfigurationActivated.timestamp && this.metroId == mVClientConfigurationActivated.metroId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27670f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo27671g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo27672h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27674i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo27675j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo27676k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVClientConfigurationActivated(", "configurationTimestamp:");
        C25541a.m63889t(n, this.configurationTimestamp, ", ", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "metroId:");
        return C13437d.m33707l(n, this.metroId, ")");
    }
}
