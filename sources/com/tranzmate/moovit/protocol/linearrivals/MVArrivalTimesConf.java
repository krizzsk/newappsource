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
import p001a0.C0017h;
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

public class MVArrivalTimesConf implements TBase<MVArrivalTimesConf, _Fields>, Serializable, Cloneable, Comparable<MVArrivalTimesConf> {

    /* renamed from: b */
    public static final C25113c f26131b = new C25113c("fromTime", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f26132c = new C25113c("intrestingInLastArrivals", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f26133d = new C25113c("includeOnlyLastArrivals", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f26134e = new C25113c("includeStaticSchedule", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f26135f = new C25113c("includeShapeSegments", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f26136g = new C25113c("forceAllArrivalsRetrieval", (byte) 2, 6);

    /* renamed from: h */
    public static final HashMap f26137h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f26138i;
    private byte __isset_bitfield = 0;
    public boolean forceAllArrivalsRetrieval;
    public long fromTime;
    public boolean includeOnlyLastArrivals;
    public boolean includeShapeSegments;
    public boolean includeStaticSchedule;
    public boolean intrestingInLastArrivals;
    private _Fields[] optionals = {_Fields.FROM_TIME};

    public enum _Fields implements C25085c {
        FROM_TIME(1, "fromTime"),
        INTRESTING_IN_LAST_ARRIVALS(2, "intrestingInLastArrivals"),
        INCLUDE_ONLY_LAST_ARRIVALS(3, "includeOnlyLastArrivals"),
        INCLUDE_STATIC_SCHEDULE(4, "includeStaticSchedule"),
        INCLUDE_SHAPE_SEGMENTS(5, "includeShapeSegments"),
        FORCE_ALL_ARRIVALS_RETRIEVAL(6, "forceAllArrivalsRetrieval");
        
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
            switch (i) {
                case 1:
                    return FROM_TIME;
                case 2:
                    return INTRESTING_IN_LAST_ARRIVALS;
                case 3:
                    return INCLUDE_ONLY_LAST_ARRIVALS;
                case 4:
                    return INCLUDE_STATIC_SCHEDULE;
                case 5:
                    return INCLUDE_SHAPE_SEGMENTS;
                case 6:
                    return FORCE_ALL_ARRIVALS_RETRIEVAL;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVArrivalTimesConf$a */
    public static class C8972a extends C25239c<MVArrivalTimesConf> {
        public C8972a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVArrivalTimesConf mVArrivalTimesConf = (MVArrivalTimesConf) tBase;
            mVArrivalTimesConf.getClass();
            C25113c cVar = MVArrivalTimesConf.f26131b;
            gVar.mo61687K();
            if (mVArrivalTimesConf.mo28012g()) {
                gVar.mo61711x(MVArrivalTimesConf.f26131b);
                gVar.mo61679C(mVArrivalTimesConf.fromTime);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVArrivalTimesConf.f26132c);
            gVar.mo61708u(mVArrivalTimesConf.intrestingInLastArrivals);
            gVar.mo61712y();
            gVar.mo61711x(MVArrivalTimesConf.f26133d);
            gVar.mo61708u(mVArrivalTimesConf.includeOnlyLastArrivals);
            gVar.mo61712y();
            gVar.mo61711x(MVArrivalTimesConf.f26134e);
            gVar.mo61708u(mVArrivalTimesConf.includeStaticSchedule);
            gVar.mo61712y();
            gVar.mo61711x(MVArrivalTimesConf.f26135f);
            gVar.mo61708u(mVArrivalTimesConf.includeShapeSegments);
            gVar.mo61712y();
            gVar.mo61711x(MVArrivalTimesConf.f26136g);
            C0017h.m62S(gVar, mVArrivalTimesConf.forceAllArrivalsRetrieval);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVArrivalTimesConf mVArrivalTimesConf = (MVArrivalTimesConf) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVArrivalTimesConf.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrivalTimesConf.fromTime = gVar.mo61697j();
                            mVArrivalTimesConf.mo28019m();
                            break;
                        }
                    case 2:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrivalTimesConf.intrestingInLastArrivals = gVar.mo61690c();
                            mVArrivalTimesConf.mo28023r();
                            break;
                        }
                    case 3:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrivalTimesConf.includeOnlyLastArrivals = gVar.mo61690c();
                            mVArrivalTimesConf.mo28020o();
                            break;
                        }
                    case 4:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrivalTimesConf.includeStaticSchedule = gVar.mo61690c();
                            mVArrivalTimesConf.mo28022q();
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrivalTimesConf.includeShapeSegments = gVar.mo61690c();
                            mVArrivalTimesConf.mo28021p();
                            break;
                        }
                    case 6:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrivalTimesConf.forceAllArrivalsRetrieval = gVar.mo61690c();
                            mVArrivalTimesConf.mo28018l();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVArrivalTimesConf$b */
    public static class C8973b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8972a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVArrivalTimesConf$c */
    public static class C8974c extends C25240d<MVArrivalTimesConf> {
        public C8974c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVArrivalTimesConf mVArrivalTimesConf = (MVArrivalTimesConf) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVArrivalTimesConf.mo28012g()) {
                bitSet.set(0);
            }
            if (mVArrivalTimesConf.mo28017k()) {
                bitSet.set(1);
            }
            if (mVArrivalTimesConf.mo28013h()) {
                bitSet.set(2);
            }
            if (mVArrivalTimesConf.mo28016j()) {
                bitSet.set(3);
            }
            if (mVArrivalTimesConf.mo28015i()) {
                bitSet.set(4);
            }
            if (mVArrivalTimesConf.mo28011f()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVArrivalTimesConf.mo28012g()) {
                jVar.mo61679C(mVArrivalTimesConf.fromTime);
            }
            if (mVArrivalTimesConf.mo28017k()) {
                jVar.mo61708u(mVArrivalTimesConf.intrestingInLastArrivals);
            }
            if (mVArrivalTimesConf.mo28013h()) {
                jVar.mo61708u(mVArrivalTimesConf.includeOnlyLastArrivals);
            }
            if (mVArrivalTimesConf.mo28016j()) {
                jVar.mo61708u(mVArrivalTimesConf.includeStaticSchedule);
            }
            if (mVArrivalTimesConf.mo28015i()) {
                jVar.mo61708u(mVArrivalTimesConf.includeShapeSegments);
            }
            if (mVArrivalTimesConf.mo28011f()) {
                jVar.mo61708u(mVArrivalTimesConf.forceAllArrivalsRetrieval);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVArrivalTimesConf mVArrivalTimesConf = (MVArrivalTimesConf) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVArrivalTimesConf.fromTime = jVar.mo61697j();
                mVArrivalTimesConf.mo28019m();
            }
            if (T.get(1)) {
                mVArrivalTimesConf.intrestingInLastArrivals = jVar.mo61690c();
                mVArrivalTimesConf.mo28023r();
            }
            if (T.get(2)) {
                mVArrivalTimesConf.includeOnlyLastArrivals = jVar.mo61690c();
                mVArrivalTimesConf.mo28020o();
            }
            if (T.get(3)) {
                mVArrivalTimesConf.includeStaticSchedule = jVar.mo61690c();
                mVArrivalTimesConf.mo28022q();
            }
            if (T.get(4)) {
                mVArrivalTimesConf.includeShapeSegments = jVar.mo61690c();
                mVArrivalTimesConf.mo28021p();
            }
            if (T.get(5)) {
                mVArrivalTimesConf.forceAllArrivalsRetrieval = jVar.mo61690c();
                mVArrivalTimesConf.mo28018l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVArrivalTimesConf$d */
    public static class C8975d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8974c(0);
        }
    }

    static {
        new C17394d0("MVArrivalTimesConf");
        HashMap hashMap = new HashMap();
        f26137h = hashMap;
        hashMap.put(C25239c.class, new C8973b());
        hashMap.put(C25240d.class, new C8975d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FROM_TIME, new FieldMetaData("fromTime", (byte) 2, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.INTRESTING_IN_LAST_ARRIVALS, new FieldMetaData("intrestingInLastArrivals", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.INCLUDE_ONLY_LAST_ARRIVALS, new FieldMetaData("includeOnlyLastArrivals", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.INCLUDE_STATIC_SCHEDULE, new FieldMetaData("includeStaticSchedule", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.INCLUDE_SHAPE_SEGMENTS, new FieldMetaData("includeShapeSegments", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.FORCE_ALL_ARRIVALS_RETRIEVAL, new FieldMetaData("forceAllArrivalsRetrieval", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26138i = unmodifiableMap;
        FieldMetaData.m61947a(MVArrivalTimesConf.class, unmodifiableMap);
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
        ((C25238b) f26137h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26137h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo28008a(MVArrivalTimesConf mVArrivalTimesConf) {
        if (mVArrivalTimesConf == null) {
            return false;
        }
        boolean g = mo28012g();
        boolean g2 = mVArrivalTimesConf.mo28012g();
        if (((!g && !g2) || (g && g2 && this.fromTime == mVArrivalTimesConf.fromTime)) && this.intrestingInLastArrivals == mVArrivalTimesConf.intrestingInLastArrivals && this.includeOnlyLastArrivals == mVArrivalTimesConf.includeOnlyLastArrivals && this.includeStaticSchedule == mVArrivalTimesConf.includeStaticSchedule && this.includeShapeSegments == mVArrivalTimesConf.includeShapeSegments && this.forceAllArrivalsRetrieval == mVArrivalTimesConf.forceAllArrivalsRetrieval) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int l;
        MVArrivalTimesConf mVArrivalTimesConf = (MVArrivalTimesConf) obj;
        if (!getClass().equals(mVArrivalTimesConf.getClass())) {
            return getClass().getName().compareTo(mVArrivalTimesConf.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28012g()).compareTo(Boolean.valueOf(mVArrivalTimesConf.mo28012g()));
        if (compareTo != 0 || ((mo28012g() && (compareTo = C25082a.m62840d(this.fromTime, mVArrivalTimesConf.fromTime)) != 0) || (compareTo = Boolean.valueOf(mo28017k()).compareTo(Boolean.valueOf(mVArrivalTimesConf.mo28017k()))) != 0 || ((mo28017k() && (compareTo = C25082a.m62848l(this.intrestingInLastArrivals, mVArrivalTimesConf.intrestingInLastArrivals)) != 0) || (compareTo = Boolean.valueOf(mo28013h()).compareTo(Boolean.valueOf(mVArrivalTimesConf.mo28013h()))) != 0 || ((mo28013h() && (compareTo = C25082a.m62848l(this.includeOnlyLastArrivals, mVArrivalTimesConf.includeOnlyLastArrivals)) != 0) || (compareTo = Boolean.valueOf(mo28016j()).compareTo(Boolean.valueOf(mVArrivalTimesConf.mo28016j()))) != 0 || ((mo28016j() && (compareTo = C25082a.m62848l(this.includeStaticSchedule, mVArrivalTimesConf.includeStaticSchedule)) != 0) || (compareTo = Boolean.valueOf(mo28015i()).compareTo(Boolean.valueOf(mVArrivalTimesConf.mo28015i()))) != 0 || ((mo28015i() && (compareTo = C25082a.m62848l(this.includeShapeSegments, mVArrivalTimesConf.includeShapeSegments)) != 0) || (compareTo = Boolean.valueOf(mo28011f()).compareTo(Boolean.valueOf(mVArrivalTimesConf.mo28011f()))) != 0)))))) {
            return compareTo;
        }
        if (!mo28011f() || (l = C25082a.m62848l(this.forceAllArrivalsRetrieval, mVArrivalTimesConf.forceAllArrivalsRetrieval)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVArrivalTimesConf)) {
            return mo28008a((MVArrivalTimesConf) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28011f() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: g */
    public final boolean mo28012g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo28013h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28015i() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: j */
    public final boolean mo28016j() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: k */
    public final boolean mo28017k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final void mo28018l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: m */
    public final void mo28019m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: o */
    public final void mo28020o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: p */
    public final void mo28021p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: q */
    public final void mo28022q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: r */
    public final void mo28023r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVArrivalTimesConf(");
        if (mo28012g()) {
            sb.append("fromTime:");
            sb.append(this.fromTime);
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("intrestingInLastArrivals:");
        C13555b.m33977q(sb, this.intrestingInLastArrivals, ", ", "includeOnlyLastArrivals:");
        C13555b.m33977q(sb, this.includeOnlyLastArrivals, ", ", "includeStaticSchedule:");
        C13555b.m33977q(sb, this.includeStaticSchedule, ", ", "includeShapeSegments:");
        C13555b.m33977q(sb, this.includeShapeSegments, ", ", "forceAllArrivalsRetrieval:");
        return C25541a.m63885p(sb, this.forceAllArrivalsRetrieval, ")");
    }
}
