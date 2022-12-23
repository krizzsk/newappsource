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

public class MVVector implements TBase<MVVector, _Fields>, Serializable, Cloneable, Comparable<MVVector> {

    /* renamed from: b */
    public static final C25113c f25168b = new C25113c("x", (byte) 4, 1);

    /* renamed from: c */
    public static final C25113c f25169c = new C25113c("y", (byte) 4, 2);

    /* renamed from: d */
    public static final C25113c f25170d = new C25113c("z", (byte) 4, 3);

    /* renamed from: e */
    public static final HashMap f25171e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25172f;
    private byte __isset_bitfield = 0;

    /* renamed from: x */
    public double f25173x;

    /* renamed from: y */
    public double f25174y;

    /* renamed from: z */
    public double f25175z;

    public enum _Fields implements C25085c {
        X(1, "x"),
        Y(2, "y"),
        Z(3, "z");
        
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
                return X;
            }
            if (i == 2) {
                return Y;
            }
            if (i != 3) {
                return null;
            }
            return Z;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVVector$a */
    public static class C8509a extends C25239c<MVVector> {
        public C8509a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVector mVVector = (MVVector) tBase;
            mVVector.getClass();
            C25113c cVar = MVVector.f25168b;
            gVar.mo61687K();
            gVar.mo61711x(MVVector.f25168b);
            gVar.mo61710w(mVVector.f25173x);
            gVar.mo61712y();
            gVar.mo61711x(MVVector.f25169c);
            gVar.mo61710w(mVVector.f25174y);
            gVar.mo61712y();
            gVar.mo61711x(MVVector.f25170d);
            gVar.mo61710w(mVVector.f25175z);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVector mVVector = (MVVector) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVVector.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 4) {
                            mVVector.f25175z = gVar.mo61692e();
                            mVVector.mo26450k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 4) {
                        mVVector.f25174y = gVar.mo61692e();
                        mVVector.mo26449j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 4) {
                    mVVector.f25173x = gVar.mo61692e();
                    mVVector.mo26448i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVVector$b */
    public static class C8510b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8509a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVVector$c */
    public static class C8511c extends C25240d<MVVector> {
        public C8511c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVector mVVector = (MVVector) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVVector.mo26444f()) {
                bitSet.set(0);
            }
            if (mVVector.mo26445g()) {
                bitSet.set(1);
            }
            if (mVVector.mo26446h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVVector.mo26444f()) {
                jVar.mo61710w(mVVector.f25173x);
            }
            if (mVVector.mo26445g()) {
                jVar.mo61710w(mVVector.f25174y);
            }
            if (mVVector.mo26446h()) {
                jVar.mo61710w(mVVector.f25175z);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVector mVVector = (MVVector) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVVector.f25173x = jVar.mo61692e();
                mVVector.mo26448i();
            }
            if (T.get(1)) {
                mVVector.f25174y = jVar.mo61692e();
                mVVector.mo26449j();
            }
            if (T.get(2)) {
                mVVector.f25175z = jVar.mo61692e();
                mVVector.mo26450k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVVector$d */
    public static class C8512d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8511c(0);
        }
    }

    static {
        new C17394d0("MVVector");
        HashMap hashMap = new HashMap();
        f25171e = hashMap;
        hashMap.put(C25239c.class, new C8510b());
        hashMap.put(C25240d.class, new C8512d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.X, new FieldMetaData("x", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.Y, new FieldMetaData("y", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.Z, new FieldMetaData("z", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25172f = unmodifiableMap;
        FieldMetaData.m61947a(MVVector.class, unmodifiableMap);
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
        ((C25238b) f25171e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25171e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26441a(MVVector mVVector) {
        if (mVVector != null && this.f25173x == mVVector.f25173x && this.f25174y == mVVector.f25174y && this.f25175z == mVVector.f25175z) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int b;
        MVVector mVVector = (MVVector) obj;
        if (!getClass().equals(mVVector.getClass())) {
            return getClass().getName().compareTo(mVVector.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26444f()).compareTo(Boolean.valueOf(mVVector.mo26444f()));
        if (compareTo != 0 || ((mo26444f() && (compareTo = C25082a.m62838b(this.f25173x, mVVector.f25173x)) != 0) || (compareTo = Boolean.valueOf(mo26445g()).compareTo(Boolean.valueOf(mVVector.mo26445g()))) != 0 || ((mo26445g() && (compareTo = C25082a.m62838b(this.f25174y, mVVector.f25174y)) != 0) || (compareTo = Boolean.valueOf(mo26446h()).compareTo(Boolean.valueOf(mVVector.mo26446h()))) != 0))) {
            return compareTo;
        }
        if (!mo26446h() || (b = C25082a.m62838b(this.f25175z, mVVector.f25175z)) == 0) {
            return 0;
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVVector)) {
            return mo26441a((MVVector) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26444f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26445g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo26446h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26448i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo26449j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo26450k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVVector(", "x:");
        C16759e.m42355k(n, this.f25173x, ", ", "y:");
        C16759e.m42355k(n, this.f25174y, ", ", "z:");
        n.append(this.f25175z);
        n.append(")");
        return n.toString();
    }
}
