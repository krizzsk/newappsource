package com.tranzmate.moovit.protocol.crowd;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVVector;
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

public class MVDeviceVector implements TBase<MVDeviceVector, _Fields>, Serializable, Cloneable, Comparable<MVDeviceVector> {

    /* renamed from: b */
    public static final C25113c f25391b = new C25113c("timestamp", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f25392c = new C25113c("vector", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f25393d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25394e;
    private byte __isset_bitfield = 0;
    public long timestamp;
    public MVVector vector;

    public enum _Fields implements C25085c {
        TIMESTAMP(1, "timestamp"),
        VECTOR(2, "vector");
        
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
                return TIMESTAMP;
            }
            if (i != 2) {
                return null;
            }
            return VECTOR;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVDeviceVector$a */
    public static class C8578a extends C25239c<MVDeviceVector> {
        public C8578a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDeviceVector mVDeviceVector = (MVDeviceVector) tBase;
            MVVector mVVector = mVDeviceVector.vector;
            C25113c cVar = MVDeviceVector.f25391b;
            gVar.mo61687K();
            gVar.mo61711x(MVDeviceVector.f25391b);
            gVar.mo61679C(mVDeviceVector.timestamp);
            gVar.mo61712y();
            if (mVDeviceVector.vector != null) {
                gVar.mo61711x(MVDeviceVector.f25392c);
                mVDeviceVector.vector.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDeviceVector mVDeviceVector = (MVDeviceVector) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVVector mVVector = mVDeviceVector.vector;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVVector mVVector2 = new MVVector();
                        mVDeviceVector.vector = mVVector2;
                        mVVector2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVDeviceVector.timestamp = gVar.mo61697j();
                    mVDeviceVector.mo26838h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVDeviceVector$b */
    public static class C8579b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8578a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVDeviceVector$c */
    public static class C8580c extends C25240d<MVDeviceVector> {
        public C8580c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDeviceVector mVDeviceVector = (MVDeviceVector) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDeviceVector.mo26836f()) {
                bitSet.set(0);
            }
            if (mVDeviceVector.mo26837g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVDeviceVector.mo26836f()) {
                jVar.mo61679C(mVDeviceVector.timestamp);
            }
            if (mVDeviceVector.mo26837g()) {
                mVDeviceVector.vector.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDeviceVector mVDeviceVector = (MVDeviceVector) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVDeviceVector.timestamp = jVar.mo61697j();
                mVDeviceVector.mo26838h();
            }
            if (T.get(1)) {
                MVVector mVVector = new MVVector();
                mVDeviceVector.vector = mVVector;
                mVVector.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVDeviceVector$d */
    public static class C8581d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8580c(0);
        }
    }

    static {
        new C17394d0("MVDeviceVector");
        HashMap hashMap = new HashMap();
        f25393d = hashMap;
        hashMap.put(C25239c.class, new C8579b());
        hashMap.put(C25240d.class, new C8581d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.VECTOR, new FieldMetaData("vector", (byte) 3, new StructMetaData(MVVector.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25394e = unmodifiableMap;
        FieldMetaData.m61947a(MVDeviceVector.class, unmodifiableMap);
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
        ((C25238b) f25393d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25393d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDeviceVector mVDeviceVector = (MVDeviceVector) obj;
        if (!getClass().equals(mVDeviceVector.getClass())) {
            return getClass().getName().compareTo(mVDeviceVector.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26836f()).compareTo(Boolean.valueOf(mVDeviceVector.mo26836f()));
        if (compareTo2 != 0 || ((mo26836f() && (compareTo2 = C25082a.m62840d(this.timestamp, mVDeviceVector.timestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo26837g()).compareTo(Boolean.valueOf(mVDeviceVector.mo26837g()))) != 0)) {
            return compareTo2;
        }
        if (!mo26837g() || (compareTo = this.vector.compareTo(mVDeviceVector.vector)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDeviceVector)) {
            return false;
        }
        MVDeviceVector mVDeviceVector = (MVDeviceVector) obj;
        if (this.timestamp != mVDeviceVector.timestamp) {
            return false;
        }
        boolean g = mo26837g();
        boolean g2 = mVDeviceVector.mo26837g();
        if ((g || g2) && (!g || !g2 || !this.vector.mo26441a(mVDeviceVector.vector))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26836f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26837g() {
        return this.vector != null;
    }

    /* renamed from: h */
    public final void mo26838h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDeviceVector(", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "vector:");
        MVVector mVVector = this.vector;
        if (mVVector == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVVector);
        }
        n.append(")");
        return n.toString();
    }
}
