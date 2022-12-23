package com.tranzmate.moovit.protocol.kinesis;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
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

public class MVKinesisRecord implements TBase<MVKinesisRecord, _Fields>, Serializable, Cloneable, Comparable<MVKinesisRecord> {

    /* renamed from: b */
    public static final C25113c f25920b = new C25113c("protocolVersion", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25921c = new C25113c("isGzip", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f25922d = new C25113c("data", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f25923e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25924f;
    private byte __isset_bitfield = 0;
    public ByteBuffer data;
    public boolean isGzip;
    public String protocolVersion;

    public enum _Fields implements C25085c {
        PROTOCOL_VERSION(1, "protocolVersion"),
        IS_GZIP(2, "isGzip"),
        DATA(3, "data");
        
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
                return PROTOCOL_VERSION;
            }
            if (i == 2) {
                return IS_GZIP;
            }
            if (i != 3) {
                return null;
            }
            return DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVKinesisRecord$a */
    public static class C8907a extends C25239c<MVKinesisRecord> {
        public C8907a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVKinesisRecord mVKinesisRecord = (MVKinesisRecord) tBase;
            mVKinesisRecord.getClass();
            C25113c cVar = MVKinesisRecord.f25920b;
            gVar.mo61687K();
            if (mVKinesisRecord.protocolVersion != null) {
                gVar.mo61711x(MVKinesisRecord.f25920b);
                gVar.mo61686J(mVKinesisRecord.protocolVersion);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVKinesisRecord.f25921c);
            gVar.mo61708u(mVKinesisRecord.isGzip);
            gVar.mo61712y();
            if (mVKinesisRecord.data != null) {
                gVar.mo61711x(MVKinesisRecord.f25922d);
                gVar.mo61707t(mVKinesisRecord.data);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVKinesisRecord mVKinesisRecord = (MVKinesisRecord) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVKinesisRecord.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVKinesisRecord.data = gVar.mo61689b();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVKinesisRecord.isGzip = gVar.mo61690c();
                        mVKinesisRecord.mo27739i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVKinesisRecord.protocolVersion = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVKinesisRecord$b */
    public static class C8908b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8907a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVKinesisRecord$c */
    public static class C8909c extends C25240d<MVKinesisRecord> {
        public C8909c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVKinesisRecord mVKinesisRecord = (MVKinesisRecord) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVKinesisRecord.mo27737h()) {
                bitSet.set(0);
            }
            if (mVKinesisRecord.mo27736g()) {
                bitSet.set(1);
            }
            if (mVKinesisRecord.mo27735f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVKinesisRecord.mo27737h()) {
                jVar.mo61686J(mVKinesisRecord.protocolVersion);
            }
            if (mVKinesisRecord.mo27736g()) {
                jVar.mo61708u(mVKinesisRecord.isGzip);
            }
            if (mVKinesisRecord.mo27735f()) {
                jVar.mo61707t(mVKinesisRecord.data);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVKinesisRecord mVKinesisRecord = (MVKinesisRecord) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVKinesisRecord.protocolVersion = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVKinesisRecord.isGzip = jVar.mo61690c();
                mVKinesisRecord.mo27739i();
            }
            if (T.get(2)) {
                mVKinesisRecord.data = jVar.mo61689b();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVKinesisRecord$d */
    public static class C8910d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8909c(0);
        }
    }

    static {
        new C17394d0("MVKinesisRecord");
        HashMap hashMap = new HashMap();
        f25923e = hashMap;
        hashMap.put(C25239c.class, new C8908b());
        hashMap.put(C25240d.class, new C8910d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROTOCOL_VERSION, new FieldMetaData("protocolVersion", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_GZIP, new FieldMetaData("isGzip", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.DATA, new FieldMetaData("data", (byte) 3, new FieldValueMetaData((byte) 11, true)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25924f = unmodifiableMap;
        FieldMetaData.m61947a(MVKinesisRecord.class, unmodifiableMap);
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
        ((C25238b) f25923e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25923e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVKinesisRecord mVKinesisRecord = (MVKinesisRecord) obj;
        if (!getClass().equals(mVKinesisRecord.getClass())) {
            return getClass().getName().compareTo(mVKinesisRecord.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27737h()).compareTo(Boolean.valueOf(mVKinesisRecord.mo27737h()));
        if (compareTo2 != 0 || ((mo27737h() && (compareTo2 = this.protocolVersion.compareTo(mVKinesisRecord.protocolVersion)) != 0) || (compareTo2 = Boolean.valueOf(mo27736g()).compareTo(Boolean.valueOf(mVKinesisRecord.mo27736g()))) != 0 || ((mo27736g() && (compareTo2 = C25082a.m62848l(this.isGzip, mVKinesisRecord.isGzip)) != 0) || (compareTo2 = Boolean.valueOf(mo27735f()).compareTo(Boolean.valueOf(mVKinesisRecord.mo27735f()))) != 0))) {
            return compareTo2;
        }
        if (!mo27735f() || (compareTo = this.data.compareTo(mVKinesisRecord.data)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVKinesisRecord)) {
            return false;
        }
        MVKinesisRecord mVKinesisRecord = (MVKinesisRecord) obj;
        boolean h = mo27737h();
        boolean h2 = mVKinesisRecord.mo27737h();
        if (((h || h2) && (!h || !h2 || !this.protocolVersion.equals(mVKinesisRecord.protocolVersion))) || this.isGzip != mVKinesisRecord.isGzip) {
            return false;
        }
        boolean f = mo27735f();
        boolean f2 = mVKinesisRecord.mo27735f();
        if ((f || f2) && (!f || !f2 || !this.data.equals(mVKinesisRecord.data))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27735f() {
        return this.data != null;
    }

    /* renamed from: g */
    public final boolean mo27736g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo27737h() {
        return this.protocolVersion != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27739i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVKinesisRecord(", "protocolVersion:");
        String str = this.protocolVersion;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("isGzip:");
        C13555b.m33977q(n, this.isGzip, ", ", "data:");
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            C25082a.m62851o(byteBuffer, n);
        }
        n.append(")");
        return n.toString();
    }
}
