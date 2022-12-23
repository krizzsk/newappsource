package com.tranzmate.moovit.protocol.linearrivals;

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

public class MVStopLineIds implements TBase<MVStopLineIds, _Fields>, Serializable, Cloneable, Comparable<MVStopLineIds> {

    /* renamed from: b */
    public static final C25113c f26174b = new C25113c("stopId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26175c = new C25113c("lineId", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f26176d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26177e;
    private byte __isset_bitfield = 0;
    public int lineId;
    public int stopId;

    public enum _Fields implements C25085c {
        STOP_ID(1, "stopId"),
        LINE_ID(2, "lineId");
        
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
                return STOP_ID;
            }
            if (i != 2) {
                return null;
            }
            return LINE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVStopLineIds$a */
    public static class C9004a extends C25239c<MVStopLineIds> {
        public C9004a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopLineIds mVStopLineIds = (MVStopLineIds) tBase;
            mVStopLineIds.getClass();
            C25113c cVar = MVStopLineIds.f26174b;
            gVar.mo61687K();
            gVar.mo61711x(MVStopLineIds.f26174b);
            gVar.mo61678B(mVStopLineIds.stopId);
            gVar.mo61712y();
            gVar.mo61711x(MVStopLineIds.f26175c);
            C16530d.m42020n(gVar, mVStopLineIds.lineId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopLineIds mVStopLineIds = (MVStopLineIds) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVStopLineIds.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVStopLineIds.lineId = gVar.mo61696i();
                        mVStopLineIds.mo28096h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVStopLineIds.stopId = gVar.mo61696i();
                    mVStopLineIds.mo28098i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVStopLineIds$b */
    public static class C9005b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9004a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVStopLineIds$c */
    public static class C9006c extends C25240d<MVStopLineIds> {
        public C9006c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopLineIds mVStopLineIds = (MVStopLineIds) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStopLineIds.mo28095g()) {
                bitSet.set(0);
            }
            if (mVStopLineIds.mo28094f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVStopLineIds.mo28095g()) {
                jVar.mo61678B(mVStopLineIds.stopId);
            }
            if (mVStopLineIds.mo28094f()) {
                jVar.mo61678B(mVStopLineIds.lineId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopLineIds mVStopLineIds = (MVStopLineIds) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVStopLineIds.stopId = jVar.mo61696i();
                mVStopLineIds.mo28098i();
            }
            if (T.get(1)) {
                mVStopLineIds.lineId = jVar.mo61696i();
                mVStopLineIds.mo28096h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVStopLineIds$d */
    public static class C9007d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9006c(0);
        }
    }

    static {
        new C17394d0("MVStopLineIds");
        HashMap hashMap = new HashMap();
        f26176d = hashMap;
        hashMap.put(C25239c.class, new C9005b());
        hashMap.put(C25240d.class, new C9007d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26177e = unmodifiableMap;
        FieldMetaData.m61947a(MVStopLineIds.class, unmodifiableMap);
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
        ((C25238b) f26176d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26176d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVStopLineIds mVStopLineIds = (MVStopLineIds) obj;
        if (!getClass().equals(mVStopLineIds.getClass())) {
            return getClass().getName().compareTo(mVStopLineIds.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28095g()).compareTo(Boolean.valueOf(mVStopLineIds.mo28095g()));
        if (compareTo != 0 || ((mo28095g() && (compareTo = C25082a.m62839c(this.stopId, mVStopLineIds.stopId)) != 0) || (compareTo = Boolean.valueOf(mo28094f()).compareTo(Boolean.valueOf(mVStopLineIds.mo28094f()))) != 0)) {
            return compareTo;
        }
        if (!mo28094f() || (c = C25082a.m62839c(this.lineId, mVStopLineIds.lineId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVStopLineIds)) {
            return false;
        }
        MVStopLineIds mVStopLineIds = (MVStopLineIds) obj;
        if (this.stopId == mVStopLineIds.stopId && this.lineId == mVStopLineIds.lineId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28094f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo28095g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo28096h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo28098i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStopLineIds(", "stopId:");
        C0016g.m42z(n, this.stopId, ", ", "lineId:");
        return C13437d.m33707l(n, this.lineId, ")");
    }
}
