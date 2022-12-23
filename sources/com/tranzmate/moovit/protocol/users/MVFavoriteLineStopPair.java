package com.tranzmate.moovit.protocol.users;

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

public class MVFavoriteLineStopPair implements TBase<MVFavoriteLineStopPair, _Fields>, Serializable, Cloneable, Comparable<MVFavoriteLineStopPair> {

    /* renamed from: b */
    public static final C25113c f30430b = new C25113c("lineId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30431c = new C25113c("stopId", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f30432d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30433e;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVFavoriteLineStopPair$a */
    public static class C11820a extends C25239c<MVFavoriteLineStopPair> {
        public C11820a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLineStopPair mVFavoriteLineStopPair = (MVFavoriteLineStopPair) tBase;
            mVFavoriteLineStopPair.getClass();
            C25113c cVar = MVFavoriteLineStopPair.f30430b;
            gVar.mo61687K();
            gVar.mo61711x(MVFavoriteLineStopPair.f30430b);
            gVar.mo61678B(mVFavoriteLineStopPair.lineId);
            gVar.mo61712y();
            gVar.mo61711x(MVFavoriteLineStopPair.f30431c);
            C16530d.m42020n(gVar, mVFavoriteLineStopPair.stopId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLineStopPair mVFavoriteLineStopPair = (MVFavoriteLineStopPair) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVFavoriteLineStopPair.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVFavoriteLineStopPair.stopId = gVar.mo61696i();
                        mVFavoriteLineStopPair.mo35161i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVFavoriteLineStopPair.lineId = gVar.mo61696i();
                    mVFavoriteLineStopPair.mo35159h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVFavoriteLineStopPair$b */
    public static class C11821b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11820a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVFavoriteLineStopPair$c */
    public static class C11822c extends C25240d<MVFavoriteLineStopPair> {
        public C11822c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLineStopPair mVFavoriteLineStopPair = (MVFavoriteLineStopPair) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVFavoriteLineStopPair.mo35157f()) {
                bitSet.set(0);
            }
            if (mVFavoriteLineStopPair.mo35158g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVFavoriteLineStopPair.mo35157f()) {
                jVar.mo61678B(mVFavoriteLineStopPair.lineId);
            }
            if (mVFavoriteLineStopPair.mo35158g()) {
                jVar.mo61678B(mVFavoriteLineStopPair.stopId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLineStopPair mVFavoriteLineStopPair = (MVFavoriteLineStopPair) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVFavoriteLineStopPair.lineId = jVar.mo61696i();
                mVFavoriteLineStopPair.mo35159h();
            }
            if (T.get(1)) {
                mVFavoriteLineStopPair.stopId = jVar.mo61696i();
                mVFavoriteLineStopPair.mo35161i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVFavoriteLineStopPair$d */
    public static class C11823d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11822c(0);
        }
    }

    static {
        new C17394d0("MVFavoriteLineStopPair");
        HashMap hashMap = new HashMap();
        f30432d = hashMap;
        hashMap.put(C25239c.class, new C11821b());
        hashMap.put(C25240d.class, new C11823d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30433e = unmodifiableMap;
        FieldMetaData.m61947a(MVFavoriteLineStopPair.class, unmodifiableMap);
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
        ((C25238b) f30432d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30432d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVFavoriteLineStopPair mVFavoriteLineStopPair = (MVFavoriteLineStopPair) obj;
        if (!getClass().equals(mVFavoriteLineStopPair.getClass())) {
            return getClass().getName().compareTo(mVFavoriteLineStopPair.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35157f()).compareTo(Boolean.valueOf(mVFavoriteLineStopPair.mo35157f()));
        if (compareTo != 0 || ((mo35157f() && (compareTo = C25082a.m62839c(this.lineId, mVFavoriteLineStopPair.lineId)) != 0) || (compareTo = Boolean.valueOf(mo35158g()).compareTo(Boolean.valueOf(mVFavoriteLineStopPair.mo35158g()))) != 0)) {
            return compareTo;
        }
        if (!mo35158g() || (c = C25082a.m62839c(this.stopId, mVFavoriteLineStopPair.stopId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVFavoriteLineStopPair)) {
            return false;
        }
        MVFavoriteLineStopPair mVFavoriteLineStopPair = (MVFavoriteLineStopPair) obj;
        if (this.lineId == mVFavoriteLineStopPair.lineId && this.stopId == mVFavoriteLineStopPair.stopId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35157f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo35158g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final void mo35159h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo35161i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVFavoriteLineStopPair(", "lineId:");
        C0016g.m42z(n, this.lineId, ", ", "stopId:");
        return C13437d.m33707l(n, this.stopId, ")");
    }
}
