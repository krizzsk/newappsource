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

public class MVPointDouble implements TBase<MVPointDouble, _Fields>, Serializable, Cloneable, Comparable<MVPointDouble> {

    /* renamed from: b */
    public static final C25113c f25103b = new C25113c("x", (byte) 4, 1);

    /* renamed from: c */
    public static final C25113c f25104c = new C25113c("y", (byte) 4, 2);

    /* renamed from: d */
    public static final HashMap f25105d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25106e;
    private byte __isset_bitfield = 0;

    /* renamed from: x */
    public double f25107x;

    /* renamed from: y */
    public double f25108y;

    public enum _Fields implements C25085c {
        X(1, "x"),
        Y(2, "y");
        
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
            if (i != 2) {
                return null;
            }
            return Y;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPointDouble$a */
    public static class C8472a extends C25239c<MVPointDouble> {
        public C8472a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPointDouble mVPointDouble = (MVPointDouble) tBase;
            mVPointDouble.getClass();
            C25113c cVar = MVPointDouble.f25103b;
            gVar.mo61687K();
            gVar.mo61711x(MVPointDouble.f25103b);
            gVar.mo61710w(mVPointDouble.f25107x);
            gVar.mo61712y();
            gVar.mo61711x(MVPointDouble.f25104c);
            gVar.mo61710w(mVPointDouble.f25108y);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPointDouble mVPointDouble = (MVPointDouble) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPointDouble.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 4) {
                        mVPointDouble.f25108y = gVar.mo61692e();
                        mVPointDouble.mo26344i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 4) {
                    mVPointDouble.f25107x = gVar.mo61692e();
                    mVPointDouble.mo26342h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPointDouble$b */
    public static class C8473b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8472a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPointDouble$c */
    public static class C8474c extends C25240d<MVPointDouble> {
        public C8474c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPointDouble mVPointDouble = (MVPointDouble) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPointDouble.mo26340f()) {
                bitSet.set(0);
            }
            if (mVPointDouble.mo26341g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPointDouble.mo26340f()) {
                jVar.mo61710w(mVPointDouble.f25107x);
            }
            if (mVPointDouble.mo26341g()) {
                jVar.mo61710w(mVPointDouble.f25108y);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPointDouble mVPointDouble = (MVPointDouble) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPointDouble.f25107x = jVar.mo61692e();
                mVPointDouble.mo26342h();
            }
            if (T.get(1)) {
                mVPointDouble.f25108y = jVar.mo61692e();
                mVPointDouble.mo26344i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPointDouble$d */
    public static class C8475d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8474c(0);
        }
    }

    static {
        new C17394d0("MVPointDouble");
        HashMap hashMap = new HashMap();
        f25105d = hashMap;
        hashMap.put(C25239c.class, new C8473b());
        hashMap.put(C25240d.class, new C8475d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.X, new FieldMetaData("x", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.Y, new FieldMetaData("y", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25106e = unmodifiableMap;
        FieldMetaData.m61947a(MVPointDouble.class, unmodifiableMap);
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
        ((C25238b) f25105d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25105d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int b;
        MVPointDouble mVPointDouble = (MVPointDouble) obj;
        if (!getClass().equals(mVPointDouble.getClass())) {
            return getClass().getName().compareTo(mVPointDouble.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26340f()).compareTo(Boolean.valueOf(mVPointDouble.mo26340f()));
        if (compareTo != 0 || ((mo26340f() && (compareTo = C25082a.m62838b(this.f25107x, mVPointDouble.f25107x)) != 0) || (compareTo = Boolean.valueOf(mo26341g()).compareTo(Boolean.valueOf(mVPointDouble.mo26341g()))) != 0)) {
            return compareTo;
        }
        if (!mo26341g() || (b = C25082a.m62838b(this.f25108y, mVPointDouble.f25108y)) == 0) {
            return 0;
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPointDouble)) {
            return false;
        }
        MVPointDouble mVPointDouble = (MVPointDouble) obj;
        if (this.f25107x == mVPointDouble.f25107x && this.f25108y == mVPointDouble.f25108y) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26340f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26341g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final void mo26342h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26344i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPointDouble(", "x:");
        C16759e.m42355k(n, this.f25107x, ", ", "y:");
        n.append(this.f25108y);
        n.append(")");
        return n.toString();
    }
}
