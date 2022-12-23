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

public class MVVehicleProgress implements TBase<MVVehicleProgress, _Fields>, Serializable, Cloneable, Comparable<MVVehicleProgress> {

    /* renamed from: b */
    public static final C25113c f26191b = new C25113c("nextStopIndex", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26192c = new C25113c("progress", (byte) 3, 2);

    /* renamed from: d */
    public static final HashMap f26193d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26194e;
    private byte __isset_bitfield = 0;
    public int nextStopIndex;
    public byte progress;

    public enum _Fields implements C25085c {
        NEXT_STOP_INDEX(1, "nextStopIndex"),
        PROGRESS(2, "progress");
        
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
                return NEXT_STOP_INDEX;
            }
            if (i != 2) {
                return null;
            }
            return PROGRESS;
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

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVVehicleProgress$a */
    public static class C9020a extends C25239c<MVVehicleProgress> {
        public C9020a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVehicleProgress mVVehicleProgress = (MVVehicleProgress) tBase;
            mVVehicleProgress.getClass();
            C25113c cVar = MVVehicleProgress.f26191b;
            gVar.mo61687K();
            gVar.mo61711x(MVVehicleProgress.f26191b);
            gVar.mo61678B(mVVehicleProgress.nextStopIndex);
            gVar.mo61712y();
            gVar.mo61711x(MVVehicleProgress.f26192c);
            gVar.mo61709v(mVVehicleProgress.progress);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVehicleProgress mVVehicleProgress = (MVVehicleProgress) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVVehicleProgress.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 3) {
                        mVVehicleProgress.progress = gVar.mo61691d();
                        mVVehicleProgress.mo28133i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVVehicleProgress.nextStopIndex = gVar.mo61696i();
                    mVVehicleProgress.mo28131h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVVehicleProgress$b */
    public static class C9021b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9020a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVVehicleProgress$c */
    public static class C9022c extends C25240d<MVVehicleProgress> {
        public C9022c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVehicleProgress mVVehicleProgress = (MVVehicleProgress) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVVehicleProgress.mo28129f()) {
                bitSet.set(0);
            }
            if (mVVehicleProgress.mo28130g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVVehicleProgress.mo28129f()) {
                jVar.mo61678B(mVVehicleProgress.nextStopIndex);
            }
            if (mVVehicleProgress.mo28130g()) {
                jVar.mo61716P(mVVehicleProgress.progress);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVehicleProgress mVVehicleProgress = (MVVehicleProgress) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVVehicleProgress.nextStopIndex = jVar.mo61696i();
                mVVehicleProgress.mo28131h();
            }
            if (T.get(1)) {
                mVVehicleProgress.progress = jVar.mo61691d();
                mVVehicleProgress.mo28133i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVVehicleProgress$d */
    public static class C9023d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9022c(0);
        }
    }

    static {
        new C17394d0("MVVehicleProgress");
        HashMap hashMap = new HashMap();
        f26193d = hashMap;
        hashMap.put(C25239c.class, new C9021b());
        hashMap.put(C25240d.class, new C9023d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NEXT_STOP_INDEX, new FieldMetaData("nextStopIndex", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PROGRESS, new FieldMetaData("progress", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26194e = unmodifiableMap;
        FieldMetaData.m61947a(MVVehicleProgress.class, unmodifiableMap);
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
        ((C25238b) f26193d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26193d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int a;
        MVVehicleProgress mVVehicleProgress = (MVVehicleProgress) obj;
        if (!getClass().equals(mVVehicleProgress.getClass())) {
            return getClass().getName().compareTo(mVVehicleProgress.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28129f()).compareTo(Boolean.valueOf(mVVehicleProgress.mo28129f()));
        if (compareTo != 0 || ((mo28129f() && (compareTo = C25082a.m62839c(this.nextStopIndex, mVVehicleProgress.nextStopIndex)) != 0) || (compareTo = Boolean.valueOf(mo28130g()).compareTo(Boolean.valueOf(mVVehicleProgress.mo28130g()))) != 0)) {
            return compareTo;
        }
        if (!mo28130g() || (a = C25082a.m62837a(this.progress, mVVehicleProgress.progress)) == 0) {
            return 0;
        }
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVVehicleProgress)) {
            return false;
        }
        MVVehicleProgress mVVehicleProgress = (MVVehicleProgress) obj;
        if (this.nextStopIndex == mVVehicleProgress.nextStopIndex && this.progress == mVVehicleProgress.progress) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28129f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo28130g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final void mo28131h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo28133i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVVehicleProgress(", "nextStopIndex:");
        C0016g.m42z(n, this.nextStopIndex, ", ", "progress:");
        return C13437d.m33707l(n, this.progress, ")");
    }
}
