package com.tranzmate.moovit.protocol.favorites;

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

public class MVFavoriteLine implements TBase<MVFavoriteLine, _Fields>, Serializable, Cloneable, Comparable<MVFavoriteLine> {

    /* renamed from: b */
    public static final C25113c f25649b = new C25113c("lineId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25650c = new C25113c("stopId", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f25651d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25652e;
    private byte __isset_bitfield = 0;
    public int lineId;
    public int stopId;

    public enum _Fields implements C25085c {
        LINE_ID(1, "lineId"),
        STOP_ID(2, "stopId");
        
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
                return LINE_ID;
            }
            if (i != 2) {
                return null;
            }
            return STOP_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVFavoriteLine$a */
    public static class C8747a extends C25239c<MVFavoriteLine> {
        public C8747a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLine mVFavoriteLine = (MVFavoriteLine) tBase;
            mVFavoriteLine.getClass();
            C25113c cVar = MVFavoriteLine.f25649b;
            gVar.mo61687K();
            gVar.mo61711x(MVFavoriteLine.f25649b);
            gVar.mo61678B(mVFavoriteLine.lineId);
            gVar.mo61712y();
            gVar.mo61711x(MVFavoriteLine.f25650c);
            C16530d.m42020n(gVar, mVFavoriteLine.stopId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLine mVFavoriteLine = (MVFavoriteLine) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVFavoriteLine.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVFavoriteLine.stopId = gVar.mo61696i();
                        mVFavoriteLine.mo27261i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVFavoriteLine.lineId = gVar.mo61696i();
                    mVFavoriteLine.mo27259h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVFavoriteLine$b */
    public static class C8748b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8747a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVFavoriteLine$c */
    public static class C8749c extends C25240d<MVFavoriteLine> {
        public C8749c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLine mVFavoriteLine = (MVFavoriteLine) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVFavoriteLine.mo27257f()) {
                bitSet.set(0);
            }
            if (mVFavoriteLine.mo27258g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVFavoriteLine.mo27257f()) {
                jVar.mo61678B(mVFavoriteLine.lineId);
            }
            if (mVFavoriteLine.mo27258g()) {
                jVar.mo61678B(mVFavoriteLine.stopId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLine mVFavoriteLine = (MVFavoriteLine) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVFavoriteLine.lineId = jVar.mo61696i();
                mVFavoriteLine.mo27259h();
            }
            if (T.get(1)) {
                mVFavoriteLine.stopId = jVar.mo61696i();
                mVFavoriteLine.mo27261i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVFavoriteLine$d */
    public static class C8750d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8749c(0);
        }
    }

    static {
        new C17394d0("MVFavoriteLine");
        HashMap hashMap = new HashMap();
        f25651d = hashMap;
        hashMap.put(C25239c.class, new C8748b());
        hashMap.put(C25240d.class, new C8750d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25652e = unmodifiableMap;
        FieldMetaData.m61947a(MVFavoriteLine.class, unmodifiableMap);
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
        ((C25238b) f25651d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25651d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVFavoriteLine mVFavoriteLine = (MVFavoriteLine) obj;
        if (!getClass().equals(mVFavoriteLine.getClass())) {
            return getClass().getName().compareTo(mVFavoriteLine.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27257f()).compareTo(Boolean.valueOf(mVFavoriteLine.mo27257f()));
        if (compareTo != 0 || ((mo27257f() && (compareTo = C25082a.m62839c(this.lineId, mVFavoriteLine.lineId)) != 0) || (compareTo = Boolean.valueOf(mo27258g()).compareTo(Boolean.valueOf(mVFavoriteLine.mo27258g()))) != 0)) {
            return compareTo;
        }
        if (!mo27258g() || (c = C25082a.m62839c(this.stopId, mVFavoriteLine.stopId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVFavoriteLine)) {
            return false;
        }
        MVFavoriteLine mVFavoriteLine = (MVFavoriteLine) obj;
        if (this.lineId == mVFavoriteLine.lineId && this.stopId == mVFavoriteLine.stopId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27257f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo27258g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final void mo27259h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27261i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVFavoriteLine(", "lineId:");
        C0016g.m42z(n, this.lineId, ", ", "stopId:");
        return C13437d.m33707l(n, this.stopId, ")");
    }
}
