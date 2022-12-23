package com.tranzmate.moovit.protocol.search;

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

public class MVSearchRequestRank implements TBase<MVSearchRequestRank, _Fields>, Serializable, Cloneable, Comparable<MVSearchRequestRank> {

    /* renamed from: b */
    public static final C25113c f28192b = new C25113c("score", (byte) 6, 1);

    /* renamed from: c */
    public static final C25113c f28193c = new C25113c("distance", (byte) 6, 2);

    /* renamed from: d */
    public static final C25113c f28194d = new C25113c("hits", (byte) 6, 3);

    /* renamed from: e */
    public static final C25113c f28195e = new C25113c("priority", (byte) 6, 4);

    /* renamed from: f */
    public static final HashMap f28196f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f28197g;
    private byte __isset_bitfield = 0;
    public short distance;
    public short hits;
    public short priority;
    public short score;

    public enum _Fields implements C25085c {
        SCORE(1, "score"),
        DISTANCE(2, "distance"),
        HITS(3, "hits"),
        PRIORITY(4, "priority");
        
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
                return SCORE;
            }
            if (i == 2) {
                return DISTANCE;
            }
            if (i == 3) {
                return HITS;
            }
            if (i != 4) {
                return null;
            }
            return PRIORITY;
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

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchRequestRank$a */
    public static class C10435a extends C25239c<MVSearchRequestRank> {
        public C10435a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchRequestRank mVSearchRequestRank = (MVSearchRequestRank) tBase;
            mVSearchRequestRank.getClass();
            C25113c cVar = MVSearchRequestRank.f28192b;
            gVar.mo61687K();
            gVar.mo61711x(MVSearchRequestRank.f28192b);
            gVar.mo61677A(mVSearchRequestRank.score);
            gVar.mo61712y();
            gVar.mo61711x(MVSearchRequestRank.f28193c);
            gVar.mo61677A(mVSearchRequestRank.distance);
            gVar.mo61712y();
            gVar.mo61711x(MVSearchRequestRank.f28194d);
            gVar.mo61677A(mVSearchRequestRank.hits);
            gVar.mo61712y();
            gVar.mo61711x(MVSearchRequestRank.f28195e);
            gVar.mo61677A(mVSearchRequestRank.priority);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSearchRequestRank mVSearchRequestRank = (MVSearchRequestRank) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSearchRequestRank.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 6) {
                                mVSearchRequestRank.priority = gVar.mo61695h();
                                mVSearchRequestRank.mo31506l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 6) {
                            mVSearchRequestRank.hits = gVar.mo61695h();
                            mVSearchRequestRank.mo31505k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 6) {
                        mVSearchRequestRank.distance = gVar.mo61695h();
                        mVSearchRequestRank.mo31504j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 6) {
                    mVSearchRequestRank.score = gVar.mo61695h();
                    mVSearchRequestRank.mo31507m();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchRequestRank$b */
    public static class C10436b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10435a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchRequestRank$c */
    public static class C10437c extends C25240d<MVSearchRequestRank> {
        public C10437c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchRequestRank mVSearchRequestRank = (MVSearchRequestRank) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSearchRequestRank.mo31503i()) {
                bitSet.set(0);
            }
            if (mVSearchRequestRank.mo31499f()) {
                bitSet.set(1);
            }
            if (mVSearchRequestRank.mo31500g()) {
                bitSet.set(2);
            }
            if (mVSearchRequestRank.mo31501h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVSearchRequestRank.mo31503i()) {
                jVar.mo61677A(mVSearchRequestRank.score);
            }
            if (mVSearchRequestRank.mo31499f()) {
                jVar.mo61677A(mVSearchRequestRank.distance);
            }
            if (mVSearchRequestRank.mo31500g()) {
                jVar.mo61677A(mVSearchRequestRank.hits);
            }
            if (mVSearchRequestRank.mo31501h()) {
                jVar.mo61677A(mVSearchRequestRank.priority);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSearchRequestRank mVSearchRequestRank = (MVSearchRequestRank) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVSearchRequestRank.score = jVar.mo61695h();
                mVSearchRequestRank.mo31507m();
            }
            if (T.get(1)) {
                mVSearchRequestRank.distance = jVar.mo61695h();
                mVSearchRequestRank.mo31504j();
            }
            if (T.get(2)) {
                mVSearchRequestRank.hits = jVar.mo61695h();
                mVSearchRequestRank.mo31505k();
            }
            if (T.get(3)) {
                mVSearchRequestRank.priority = jVar.mo61695h();
                mVSearchRequestRank.mo31506l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchRequestRank$d */
    public static class C10438d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10437c(0);
        }
    }

    static {
        new C17394d0("MVSearchRequestRank");
        HashMap hashMap = new HashMap();
        f28196f = hashMap;
        hashMap.put(C25239c.class, new C10436b());
        hashMap.put(C25240d.class, new C10438d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SCORE, new FieldMetaData("score", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.DISTANCE, new FieldMetaData("distance", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.HITS, new FieldMetaData("hits", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.PRIORITY, new FieldMetaData("priority", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28197g = unmodifiableMap;
        FieldMetaData.m61947a(MVSearchRequestRank.class, unmodifiableMap);
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
        ((C25238b) f28196f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28196f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31496a(MVSearchRequestRank mVSearchRequestRank) {
        if (mVSearchRequestRank != null && this.score == mVSearchRequestRank.score && this.distance == mVSearchRequestRank.distance && this.hits == mVSearchRequestRank.hits && this.priority == mVSearchRequestRank.priority) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int k;
        MVSearchRequestRank mVSearchRequestRank = (MVSearchRequestRank) obj;
        if (!getClass().equals(mVSearchRequestRank.getClass())) {
            return getClass().getName().compareTo(mVSearchRequestRank.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31503i()).compareTo(Boolean.valueOf(mVSearchRequestRank.mo31503i()));
        if (compareTo != 0 || ((mo31503i() && (compareTo = C25082a.m62847k(this.score, mVSearchRequestRank.score)) != 0) || (compareTo = Boolean.valueOf(mo31499f()).compareTo(Boolean.valueOf(mVSearchRequestRank.mo31499f()))) != 0 || ((mo31499f() && (compareTo = C25082a.m62847k(this.distance, mVSearchRequestRank.distance)) != 0) || (compareTo = Boolean.valueOf(mo31500g()).compareTo(Boolean.valueOf(mVSearchRequestRank.mo31500g()))) != 0 || ((mo31500g() && (compareTo = C25082a.m62847k(this.hits, mVSearchRequestRank.hits)) != 0) || (compareTo = Boolean.valueOf(mo31501h()).compareTo(Boolean.valueOf(mVSearchRequestRank.mo31501h()))) != 0)))) {
            return compareTo;
        }
        if (!mo31501h() || (k = C25082a.m62847k(this.priority, mVSearchRequestRank.priority)) == 0) {
            return 0;
        }
        return k;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVSearchRequestRank)) {
            return mo31496a((MVSearchRequestRank) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31499f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo31500g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo31501h() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31503i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo31504j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo31505k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: l */
    public final void mo31506l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: m */
    public final void mo31507m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSearchRequestRank(", "score:");
        C0016g.m42z(n, this.score, ", ", "distance:");
        C0016g.m42z(n, this.distance, ", ", "hits:");
        C0016g.m42z(n, this.hits, ", ", "priority:");
        return C13437d.m33707l(n, this.priority, ")");
    }
}
