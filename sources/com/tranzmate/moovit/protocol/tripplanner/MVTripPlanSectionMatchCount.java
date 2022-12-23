package com.tranzmate.moovit.protocol.tripplanner;

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

public class MVTripPlanSectionMatchCount implements TBase<MVTripPlanSectionMatchCount, _Fields>, Serializable, Cloneable, Comparable<MVTripPlanSectionMatchCount> {

    /* renamed from: b */
    public static final C25113c f30167b = new C25113c("sectionId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30168c = new C25113c("matchCount", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f30169d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30170e;
    private byte __isset_bitfield = 0;
    public int matchCount;
    public int sectionId;

    public enum _Fields implements C25085c {
        SECTION_ID(1, "sectionId"),
        MATCH_COUNT(2, "matchCount");
        
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
                return SECTION_ID;
            }
            if (i != 2) {
                return null;
            }
            return MATCH_COUNT;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionMatchCount$a */
    public static class C11672a extends C25239c<MVTripPlanSectionMatchCount> {
        public C11672a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSectionMatchCount mVTripPlanSectionMatchCount = (MVTripPlanSectionMatchCount) tBase;
            mVTripPlanSectionMatchCount.getClass();
            C25113c cVar = MVTripPlanSectionMatchCount.f30167b;
            gVar.mo61687K();
            gVar.mo61711x(MVTripPlanSectionMatchCount.f30167b);
            gVar.mo61678B(mVTripPlanSectionMatchCount.sectionId);
            gVar.mo61712y();
            gVar.mo61711x(MVTripPlanSectionMatchCount.f30168c);
            C16530d.m42020n(gVar, mVTripPlanSectionMatchCount.matchCount);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSectionMatchCount mVTripPlanSectionMatchCount = (MVTripPlanSectionMatchCount) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripPlanSectionMatchCount.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVTripPlanSectionMatchCount.matchCount = gVar.mo61696i();
                        mVTripPlanSectionMatchCount.mo34729h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTripPlanSectionMatchCount.sectionId = gVar.mo61696i();
                    mVTripPlanSectionMatchCount.mo34731i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionMatchCount$b */
    public static class C11673b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11672a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionMatchCount$c */
    public static class C11674c extends C25240d<MVTripPlanSectionMatchCount> {
        public C11674c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSectionMatchCount mVTripPlanSectionMatchCount = (MVTripPlanSectionMatchCount) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripPlanSectionMatchCount.mo34728g()) {
                bitSet.set(0);
            }
            if (mVTripPlanSectionMatchCount.mo34727f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTripPlanSectionMatchCount.mo34728g()) {
                jVar.mo61678B(mVTripPlanSectionMatchCount.sectionId);
            }
            if (mVTripPlanSectionMatchCount.mo34727f()) {
                jVar.mo61678B(mVTripPlanSectionMatchCount.matchCount);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSectionMatchCount mVTripPlanSectionMatchCount = (MVTripPlanSectionMatchCount) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTripPlanSectionMatchCount.sectionId = jVar.mo61696i();
                mVTripPlanSectionMatchCount.mo34731i();
            }
            if (T.get(1)) {
                mVTripPlanSectionMatchCount.matchCount = jVar.mo61696i();
                mVTripPlanSectionMatchCount.mo34729h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionMatchCount$d */
    public static class C11675d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11674c(0);
        }
    }

    static {
        new C17394d0("MVTripPlanSectionMatchCount");
        HashMap hashMap = new HashMap();
        f30169d = hashMap;
        hashMap.put(C25239c.class, new C11673b());
        hashMap.put(C25240d.class, new C11675d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SECTION_ID, new FieldMetaData("sectionId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MATCH_COUNT, new FieldMetaData("matchCount", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30170e = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanSectionMatchCount.class, unmodifiableMap);
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
        ((C25238b) f30169d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30169d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVTripPlanSectionMatchCount mVTripPlanSectionMatchCount = (MVTripPlanSectionMatchCount) obj;
        if (!getClass().equals(mVTripPlanSectionMatchCount.getClass())) {
            return getClass().getName().compareTo(mVTripPlanSectionMatchCount.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34728g()).compareTo(Boolean.valueOf(mVTripPlanSectionMatchCount.mo34728g()));
        if (compareTo != 0 || ((mo34728g() && (compareTo = C25082a.m62839c(this.sectionId, mVTripPlanSectionMatchCount.sectionId)) != 0) || (compareTo = Boolean.valueOf(mo34727f()).compareTo(Boolean.valueOf(mVTripPlanSectionMatchCount.mo34727f()))) != 0)) {
            return compareTo;
        }
        if (!mo34727f() || (c = C25082a.m62839c(this.matchCount, mVTripPlanSectionMatchCount.matchCount)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripPlanSectionMatchCount)) {
            return false;
        }
        MVTripPlanSectionMatchCount mVTripPlanSectionMatchCount = (MVTripPlanSectionMatchCount) obj;
        if (this.sectionId == mVTripPlanSectionMatchCount.sectionId && this.matchCount == mVTripPlanSectionMatchCount.matchCount) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34727f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo34728g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo34729h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo34731i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripPlanSectionMatchCount(", "sectionId:");
        C0016g.m42z(n, this.sectionId, ", ", "matchCount:");
        return C13437d.m33707l(n, this.matchCount, ")");
    }
}
