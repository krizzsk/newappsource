package com.tranzmate.moovit.protocol.crowd;

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

public class MVStepCounter implements TBase<MVStepCounter, _Fields>, Serializable, Cloneable, Comparable<MVStepCounter> {

    /* renamed from: b */
    public static final C25113c f25446b = new C25113c("timestamp", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f25447c = new C25113c("clientObservedTimestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25448d = new C25113c("numberOfSteps", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f25449e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25450f;
    private byte __isset_bitfield = 0;
    public long clientObservedTimestamp;
    public int numberOfSteps;
    public long timestamp;

    public enum _Fields implements C25085c {
        TIMESTAMP(1, "timestamp"),
        CLIENT_OBSERVED_TIMESTAMP(2, "clientObservedTimestamp"),
        NUMBER_OF_STEPS(3, "numberOfSteps");
        
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
            if (i == 2) {
                return CLIENT_OBSERVED_TIMESTAMP;
            }
            if (i != 3) {
                return null;
            }
            return NUMBER_OF_STEPS;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVStepCounter$a */
    public static class C8603a extends C25239c<MVStepCounter> {
        public C8603a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStepCounter mVStepCounter = (MVStepCounter) tBase;
            mVStepCounter.getClass();
            C25113c cVar = MVStepCounter.f25446b;
            gVar.mo61687K();
            gVar.mo61711x(MVStepCounter.f25446b);
            gVar.mo61679C(mVStepCounter.timestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVStepCounter.f25447c);
            gVar.mo61679C(mVStepCounter.clientObservedTimestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVStepCounter.f25448d);
            C16530d.m42020n(gVar, mVStepCounter.numberOfSteps);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStepCounter mVStepCounter = (MVStepCounter) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVStepCounter.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVStepCounter.numberOfSteps = gVar.mo61696i();
                            mVStepCounter.mo26906j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVStepCounter.clientObservedTimestamp = gVar.mo61697j();
                        mVStepCounter.mo26905i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVStepCounter.timestamp = gVar.mo61697j();
                    mVStepCounter.mo26907k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVStepCounter$b */
    public static class C8604b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8603a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVStepCounter$c */
    public static class C8605c extends C25240d<MVStepCounter> {
        public C8605c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStepCounter mVStepCounter = (MVStepCounter) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStepCounter.mo26903h()) {
                bitSet.set(0);
            }
            if (mVStepCounter.mo26901f()) {
                bitSet.set(1);
            }
            if (mVStepCounter.mo26902g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVStepCounter.mo26903h()) {
                jVar.mo61679C(mVStepCounter.timestamp);
            }
            if (mVStepCounter.mo26901f()) {
                jVar.mo61679C(mVStepCounter.clientObservedTimestamp);
            }
            if (mVStepCounter.mo26902g()) {
                jVar.mo61678B(mVStepCounter.numberOfSteps);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStepCounter mVStepCounter = (MVStepCounter) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVStepCounter.timestamp = jVar.mo61697j();
                mVStepCounter.mo26907k();
            }
            if (T.get(1)) {
                mVStepCounter.clientObservedTimestamp = jVar.mo61697j();
                mVStepCounter.mo26905i();
            }
            if (T.get(2)) {
                mVStepCounter.numberOfSteps = jVar.mo61696i();
                mVStepCounter.mo26906j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVStepCounter$d */
    public static class C8606d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8605c(0);
        }
    }

    static {
        new C17394d0("MVStepCounter");
        HashMap hashMap = new HashMap();
        f25449e = hashMap;
        hashMap.put(C25239c.class, new C8604b());
        hashMap.put(C25240d.class, new C8606d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.CLIENT_OBSERVED_TIMESTAMP, new FieldMetaData("clientObservedTimestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.NUMBER_OF_STEPS, new FieldMetaData("numberOfSteps", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25450f = unmodifiableMap;
        FieldMetaData.m61947a(MVStepCounter.class, unmodifiableMap);
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
        ((C25238b) f25449e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25449e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVStepCounter mVStepCounter = (MVStepCounter) obj;
        if (!getClass().equals(mVStepCounter.getClass())) {
            return getClass().getName().compareTo(mVStepCounter.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26903h()).compareTo(Boolean.valueOf(mVStepCounter.mo26903h()));
        if (compareTo != 0 || ((mo26903h() && (compareTo = C25082a.m62840d(this.timestamp, mVStepCounter.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo26901f()).compareTo(Boolean.valueOf(mVStepCounter.mo26901f()))) != 0 || ((mo26901f() && (compareTo = C25082a.m62840d(this.clientObservedTimestamp, mVStepCounter.clientObservedTimestamp)) != 0) || (compareTo = Boolean.valueOf(mo26902g()).compareTo(Boolean.valueOf(mVStepCounter.mo26902g()))) != 0))) {
            return compareTo;
        }
        if (!mo26902g() || (c = C25082a.m62839c(this.numberOfSteps, mVStepCounter.numberOfSteps)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVStepCounter)) {
            return false;
        }
        MVStepCounter mVStepCounter = (MVStepCounter) obj;
        if (this.timestamp == mVStepCounter.timestamp && this.clientObservedTimestamp == mVStepCounter.clientObservedTimestamp && this.numberOfSteps == mVStepCounter.numberOfSteps) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26901f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo26902g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo26903h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26905i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: j */
    public final void mo26906j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo26907k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStepCounter(", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "clientObservedTimestamp:");
        C25541a.m63889t(n, this.clientObservedTimestamp, ", ", "numberOfSteps:");
        return C13437d.m33707l(n, this.numberOfSteps, ")");
    }
}
