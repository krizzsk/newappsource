package com.tranzmate.moovit.protocol.carpool;

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

public class MVPassengerStop implements TBase<MVPassengerStop, _Fields>, Serializable, Cloneable, Comparable<MVPassengerStop> {

    /* renamed from: b */
    public static final C25113c f24818b = new C25113c("stopSeq", (byte) 6, 1);

    /* renamed from: c */
    public static final C25113c f24819c = new C25113c("routeId", (byte) 6, 2);

    /* renamed from: d */
    public static final HashMap f24820d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24821e;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.ROUTE_ID};
    public short routeId;
    public short stopSeq;

    public enum _Fields implements C25085c {
        STOP_SEQ(1, "stopSeq"),
        ROUTE_ID(2, "routeId");
        
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
                return STOP_SEQ;
            }
            if (i != 2) {
                return null;
            }
            return ROUTE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerStop$a */
    public static class C8275a extends C25239c<MVPassengerStop> {
        public C8275a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerStop mVPassengerStop = (MVPassengerStop) tBase;
            mVPassengerStop.getClass();
            C25113c cVar = MVPassengerStop.f24818b;
            gVar.mo61687K();
            gVar.mo61711x(MVPassengerStop.f24818b);
            gVar.mo61677A(mVPassengerStop.stopSeq);
            gVar.mo61712y();
            if (mVPassengerStop.mo25793f()) {
                gVar.mo61711x(MVPassengerStop.f24819c);
                gVar.mo61677A(mVPassengerStop.routeId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerStop mVPassengerStop = (MVPassengerStop) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPassengerStop.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 6) {
                        mVPassengerStop.routeId = gVar.mo61695h();
                        mVPassengerStop.mo25795h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 6) {
                    mVPassengerStop.stopSeq = gVar.mo61695h();
                    mVPassengerStop.mo25797i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerStop$b */
    public static class C8276b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8275a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerStop$c */
    public static class C8277c extends C25240d<MVPassengerStop> {
        public C8277c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerStop mVPassengerStop = (MVPassengerStop) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerStop.mo25794g()) {
                bitSet.set(0);
            }
            if (mVPassengerStop.mo25793f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPassengerStop.mo25794g()) {
                jVar.mo61677A(mVPassengerStop.stopSeq);
            }
            if (mVPassengerStop.mo25793f()) {
                jVar.mo61677A(mVPassengerStop.routeId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerStop mVPassengerStop = (MVPassengerStop) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPassengerStop.stopSeq = jVar.mo61695h();
                mVPassengerStop.mo25797i();
            }
            if (T.get(1)) {
                mVPassengerStop.routeId = jVar.mo61695h();
                mVPassengerStop.mo25795h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerStop$d */
    public static class C8278d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8277c(0);
        }
    }

    static {
        new C17394d0("MVPassengerStop");
        HashMap hashMap = new HashMap();
        f24820d = hashMap;
        hashMap.put(C25239c.class, new C8276b());
        hashMap.put(C25240d.class, new C8278d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_SEQ, new FieldMetaData("stopSeq", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.ROUTE_ID, new FieldMetaData("routeId", (byte) 2, new FieldValueMetaData((byte) 6, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24821e = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerStop.class, unmodifiableMap);
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
        ((C25238b) f24820d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24820d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25790a(MVPassengerStop mVPassengerStop) {
        if (mVPassengerStop == null || this.stopSeq != mVPassengerStop.stopSeq) {
            return false;
        }
        boolean f = mo25793f();
        boolean f2 = mVPassengerStop.mo25793f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || this.routeId != mVPassengerStop.routeId) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int k;
        MVPassengerStop mVPassengerStop = (MVPassengerStop) obj;
        if (!getClass().equals(mVPassengerStop.getClass())) {
            return getClass().getName().compareTo(mVPassengerStop.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25794g()).compareTo(Boolean.valueOf(mVPassengerStop.mo25794g()));
        if (compareTo != 0 || ((mo25794g() && (compareTo = C25082a.m62847k(this.stopSeq, mVPassengerStop.stopSeq)) != 0) || (compareTo = Boolean.valueOf(mo25793f()).compareTo(Boolean.valueOf(mVPassengerStop.mo25793f()))) != 0)) {
            return compareTo;
        }
        if (!mo25793f() || (k = C25082a.m62847k(this.routeId, mVPassengerStop.routeId)) == 0) {
            return 0;
        }
        return k;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPassengerStop)) {
            return mo25790a((MVPassengerStop) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25793f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo25794g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo25795h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo25797i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassengerStop(", "stopSeq:");
        n.append(this.stopSeq);
        if (mo25793f()) {
            n.append(", ");
            n.append("routeId:");
            n.append(this.routeId);
        }
        n.append(")");
        return n.toString();
    }
}
