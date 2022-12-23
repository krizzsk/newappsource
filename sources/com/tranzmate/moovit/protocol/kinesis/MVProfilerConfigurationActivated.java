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

public class MVProfilerConfigurationActivated implements TBase<MVProfilerConfigurationActivated, _Fields>, Serializable, Cloneable, Comparable<MVProfilerConfigurationActivated> {

    /* renamed from: b */
    public static final C25113c f25979b = new C25113c("configurationTimestamp", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f25980c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25981d = new C25113c("metroId", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f25982e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25983f;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVProfilerConfigurationActivated$a */
    public static class C8927a extends C25239c<MVProfilerConfigurationActivated> {
        public C8927a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVProfilerConfigurationActivated mVProfilerConfigurationActivated = (MVProfilerConfigurationActivated) tBase;
            mVProfilerConfigurationActivated.getClass();
            C25113c cVar = MVProfilerConfigurationActivated.f25979b;
            gVar.mo61687K();
            gVar.mo61711x(MVProfilerConfigurationActivated.f25979b);
            gVar.mo61679C(mVProfilerConfigurationActivated.configurationTimestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVProfilerConfigurationActivated.f25980c);
            gVar.mo61679C(mVProfilerConfigurationActivated.timestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVProfilerConfigurationActivated.f25981d);
            C16530d.m42020n(gVar, mVProfilerConfigurationActivated.metroId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVProfilerConfigurationActivated mVProfilerConfigurationActivated = (MVProfilerConfigurationActivated) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVProfilerConfigurationActivated.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVProfilerConfigurationActivated.metroId = gVar.mo61696i();
                            mVProfilerConfigurationActivated.mo27855j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVProfilerConfigurationActivated.timestamp = gVar.mo61697j();
                        mVProfilerConfigurationActivated.mo27856k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVProfilerConfigurationActivated.configurationTimestamp = gVar.mo61697j();
                    mVProfilerConfigurationActivated.mo27854i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVProfilerConfigurationActivated$b */
    public static class C8928b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8927a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVProfilerConfigurationActivated$c */
    public static class C8929c extends C25240d<MVProfilerConfigurationActivated> {
        public C8929c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVProfilerConfigurationActivated mVProfilerConfigurationActivated = (MVProfilerConfigurationActivated) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVProfilerConfigurationActivated.mo27850f()) {
                bitSet.set(0);
            }
            if (mVProfilerConfigurationActivated.mo27852h()) {
                bitSet.set(1);
            }
            if (mVProfilerConfigurationActivated.mo27851g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVProfilerConfigurationActivated.mo27850f()) {
                jVar.mo61679C(mVProfilerConfigurationActivated.configurationTimestamp);
            }
            if (mVProfilerConfigurationActivated.mo27852h()) {
                jVar.mo61679C(mVProfilerConfigurationActivated.timestamp);
            }
            if (mVProfilerConfigurationActivated.mo27851g()) {
                jVar.mo61678B(mVProfilerConfigurationActivated.metroId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVProfilerConfigurationActivated mVProfilerConfigurationActivated = (MVProfilerConfigurationActivated) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVProfilerConfigurationActivated.configurationTimestamp = jVar.mo61697j();
                mVProfilerConfigurationActivated.mo27854i();
            }
            if (T.get(1)) {
                mVProfilerConfigurationActivated.timestamp = jVar.mo61697j();
                mVProfilerConfigurationActivated.mo27856k();
            }
            if (T.get(2)) {
                mVProfilerConfigurationActivated.metroId = jVar.mo61696i();
                mVProfilerConfigurationActivated.mo27855j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVProfilerConfigurationActivated$d */
    public static class C8930d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8929c(0);
        }
    }

    static {
        new C17394d0("MVProfilerConfigurationActivated");
        HashMap hashMap = new HashMap();
        f25982e = hashMap;
        hashMap.put(C25239c.class, new C8928b());
        hashMap.put(C25240d.class, new C8930d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONFIGURATION_TIMESTAMP, new FieldMetaData("configurationTimestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25983f = unmodifiableMap;
        FieldMetaData.m61947a(MVProfilerConfigurationActivated.class, unmodifiableMap);
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
        ((C25238b) f25982e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25982e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVProfilerConfigurationActivated mVProfilerConfigurationActivated = (MVProfilerConfigurationActivated) obj;
        if (!getClass().equals(mVProfilerConfigurationActivated.getClass())) {
            return getClass().getName().compareTo(mVProfilerConfigurationActivated.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27850f()).compareTo(Boolean.valueOf(mVProfilerConfigurationActivated.mo27850f()));
        if (compareTo != 0 || ((mo27850f() && (compareTo = C25082a.m62840d(this.configurationTimestamp, mVProfilerConfigurationActivated.configurationTimestamp)) != 0) || (compareTo = Boolean.valueOf(mo27852h()).compareTo(Boolean.valueOf(mVProfilerConfigurationActivated.mo27852h()))) != 0 || ((mo27852h() && (compareTo = C25082a.m62840d(this.timestamp, mVProfilerConfigurationActivated.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo27851g()).compareTo(Boolean.valueOf(mVProfilerConfigurationActivated.mo27851g()))) != 0))) {
            return compareTo;
        }
        if (!mo27851g() || (c = C25082a.m62839c(this.metroId, mVProfilerConfigurationActivated.metroId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVProfilerConfigurationActivated)) {
            return false;
        }
        MVProfilerConfigurationActivated mVProfilerConfigurationActivated = (MVProfilerConfigurationActivated) obj;
        if (this.configurationTimestamp == mVProfilerConfigurationActivated.configurationTimestamp && this.timestamp == mVProfilerConfigurationActivated.timestamp && this.metroId == mVProfilerConfigurationActivated.metroId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27850f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo27851g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo27852h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27854i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo27855j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo27856k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVProfilerConfigurationActivated(", "configurationTimestamp:");
        C25541a.m63889t(n, this.configurationTimestamp, ", ", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "metroId:");
        return C13437d.m33707l(n, this.metroId, ")");
    }
}
