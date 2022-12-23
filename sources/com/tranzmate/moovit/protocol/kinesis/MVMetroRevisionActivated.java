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

public class MVMetroRevisionActivated implements TBase<MVMetroRevisionActivated, _Fields>, Serializable, Cloneable, Comparable<MVMetroRevisionActivated> {

    /* renamed from: b */
    public static final C25113c f25939b = new C25113c("revisionId", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f25940c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25941d = new C25113c("metroAreadId", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f25942e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25943f;
    private byte __isset_bitfield = 0;
    public int metroAreadId;
    public long revisionId;
    public long timestamp;

    public enum _Fields implements C25085c {
        REVISION_ID(1, "revisionId"),
        TIMESTAMP(2, "timestamp"),
        METRO_AREAD_ID(3, "metroAreadId");
        
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
                return REVISION_ID;
            }
            if (i == 2) {
                return TIMESTAMP;
            }
            if (i != 3) {
                return null;
            }
            return METRO_AREAD_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVMetroRevisionActivated$a */
    public static class C8919a extends C25239c<MVMetroRevisionActivated> {
        public C8919a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroRevisionActivated mVMetroRevisionActivated = (MVMetroRevisionActivated) tBase;
            mVMetroRevisionActivated.getClass();
            C25113c cVar = MVMetroRevisionActivated.f25939b;
            gVar.mo61687K();
            gVar.mo61711x(MVMetroRevisionActivated.f25939b);
            gVar.mo61679C(mVMetroRevisionActivated.revisionId);
            gVar.mo61712y();
            gVar.mo61711x(MVMetroRevisionActivated.f25940c);
            gVar.mo61679C(mVMetroRevisionActivated.timestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVMetroRevisionActivated.f25941d);
            C16530d.m42020n(gVar, mVMetroRevisionActivated.metroAreadId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroRevisionActivated mVMetroRevisionActivated = (MVMetroRevisionActivated) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMetroRevisionActivated.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVMetroRevisionActivated.metroAreadId = gVar.mo61696i();
                            mVMetroRevisionActivated.mo27777i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVMetroRevisionActivated.timestamp = gVar.mo61697j();
                        mVMetroRevisionActivated.mo27779k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVMetroRevisionActivated.revisionId = gVar.mo61697j();
                    mVMetroRevisionActivated.mo27778j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVMetroRevisionActivated$b */
    public static class C8920b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8919a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVMetroRevisionActivated$c */
    public static class C8921c extends C25240d<MVMetroRevisionActivated> {
        public C8921c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroRevisionActivated mVMetroRevisionActivated = (MVMetroRevisionActivated) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMetroRevisionActivated.mo27774g()) {
                bitSet.set(0);
            }
            if (mVMetroRevisionActivated.mo27775h()) {
                bitSet.set(1);
            }
            if (mVMetroRevisionActivated.mo27773f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVMetroRevisionActivated.mo27774g()) {
                jVar.mo61679C(mVMetroRevisionActivated.revisionId);
            }
            if (mVMetroRevisionActivated.mo27775h()) {
                jVar.mo61679C(mVMetroRevisionActivated.timestamp);
            }
            if (mVMetroRevisionActivated.mo27773f()) {
                jVar.mo61678B(mVMetroRevisionActivated.metroAreadId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroRevisionActivated mVMetroRevisionActivated = (MVMetroRevisionActivated) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVMetroRevisionActivated.revisionId = jVar.mo61697j();
                mVMetroRevisionActivated.mo27778j();
            }
            if (T.get(1)) {
                mVMetroRevisionActivated.timestamp = jVar.mo61697j();
                mVMetroRevisionActivated.mo27779k();
            }
            if (T.get(2)) {
                mVMetroRevisionActivated.metroAreadId = jVar.mo61696i();
                mVMetroRevisionActivated.mo27777i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVMetroRevisionActivated$d */
    public static class C8922d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8921c(0);
        }
    }

    static {
        new C17394d0("MVMetroRevisionActivated");
        HashMap hashMap = new HashMap();
        f25942e = hashMap;
        hashMap.put(C25239c.class, new C8920b());
        hashMap.put(C25240d.class, new C8922d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REVISION_ID, new FieldMetaData("revisionId", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.METRO_AREAD_ID, new FieldMetaData("metroAreadId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25943f = unmodifiableMap;
        FieldMetaData.m61947a(MVMetroRevisionActivated.class, unmodifiableMap);
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
        ((C25238b) f25942e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25942e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVMetroRevisionActivated mVMetroRevisionActivated = (MVMetroRevisionActivated) obj;
        if (!getClass().equals(mVMetroRevisionActivated.getClass())) {
            return getClass().getName().compareTo(mVMetroRevisionActivated.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27774g()).compareTo(Boolean.valueOf(mVMetroRevisionActivated.mo27774g()));
        if (compareTo != 0 || ((mo27774g() && (compareTo = C25082a.m62840d(this.revisionId, mVMetroRevisionActivated.revisionId)) != 0) || (compareTo = Boolean.valueOf(mo27775h()).compareTo(Boolean.valueOf(mVMetroRevisionActivated.mo27775h()))) != 0 || ((mo27775h() && (compareTo = C25082a.m62840d(this.timestamp, mVMetroRevisionActivated.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo27773f()).compareTo(Boolean.valueOf(mVMetroRevisionActivated.mo27773f()))) != 0))) {
            return compareTo;
        }
        if (!mo27773f() || (c = C25082a.m62839c(this.metroAreadId, mVMetroRevisionActivated.metroAreadId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMetroRevisionActivated)) {
            return false;
        }
        MVMetroRevisionActivated mVMetroRevisionActivated = (MVMetroRevisionActivated) obj;
        if (this.revisionId == mVMetroRevisionActivated.revisionId && this.timestamp == mVMetroRevisionActivated.timestamp && this.metroAreadId == mVMetroRevisionActivated.metroAreadId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27773f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo27774g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo27775h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27777i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: j */
    public final void mo27778j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo27779k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMetroRevisionActivated(", "revisionId:");
        C25541a.m63889t(n, this.revisionId, ", ", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "metroAreadId:");
        return C13437d.m33707l(n, this.metroAreadId, ")");
    }
}
