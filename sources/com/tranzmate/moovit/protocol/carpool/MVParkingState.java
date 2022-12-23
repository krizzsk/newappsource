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

public class MVParkingState implements TBase<MVParkingState, _Fields>, Serializable, Cloneable, Comparable<MVParkingState> {

    /* renamed from: b */
    public static final C25113c f24746b = new C25113c("acquiredPlaces", (byte) 8, 1);

    /* renamed from: c */
    public static final HashMap f24747c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f24748d;
    private byte __isset_bitfield = 0;
    public int acquiredPlaces;

    public enum _Fields implements C25085c {
        ACQUIRED_PLACES(1, "acquiredPlaces");
        
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
            if (i != 1) {
                return null;
            }
            return ACQUIRED_PLACES;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVParkingState$a */
    public static class C8234a extends C25239c<MVParkingState> {
        public C8234a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVParkingState mVParkingState = (MVParkingState) tBase;
            mVParkingState.getClass();
            C25113c cVar = MVParkingState.f24746b;
            gVar.mo61687K();
            gVar.mo61711x(MVParkingState.f24746b);
            C16530d.m42020n(gVar, mVParkingState.acquiredPlaces);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVParkingState mVParkingState = (MVParkingState) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVParkingState.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 8) {
                    mVParkingState.acquiredPlaces = gVar.mo61696i();
                    mVParkingState.mo25673g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVParkingState$b */
    public static class C8235b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8234a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVParkingState$c */
    public static class C8236c extends C25240d<MVParkingState> {
        public C8236c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVParkingState mVParkingState = (MVParkingState) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVParkingState.mo25672f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVParkingState.mo25672f()) {
                jVar.mo61678B(mVParkingState.acquiredPlaces);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVParkingState mVParkingState = (MVParkingState) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVParkingState.acquiredPlaces = jVar.mo61696i();
                mVParkingState.mo25673g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVParkingState$d */
    public static class C8237d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8236c(0);
        }
    }

    static {
        new C17394d0("MVParkingState");
        HashMap hashMap = new HashMap();
        f24747c = hashMap;
        hashMap.put(C25239c.class, new C8235b());
        hashMap.put(C25240d.class, new C8237d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACQUIRED_PLACES, new FieldMetaData("acquiredPlaces", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24748d = unmodifiableMap;
        FieldMetaData.m61947a(MVParkingState.class, unmodifiableMap);
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
        ((C25238b) f24747c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24747c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVParkingState mVParkingState = (MVParkingState) obj;
        if (!getClass().equals(mVParkingState.getClass())) {
            return getClass().getName().compareTo(mVParkingState.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25672f()).compareTo(Boolean.valueOf(mVParkingState.mo25672f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo25672f() || (c = C25082a.m62839c(this.acquiredPlaces, mVParkingState.acquiredPlaces)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVParkingState) && this.acquiredPlaces == ((MVParkingState) obj).acquiredPlaces) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25672f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo25673g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C13437d.m33707l(C13437d.m33708n("MVParkingState(", "acquiredPlaces:"), this.acquiredPlaces, ")");
    }
}
