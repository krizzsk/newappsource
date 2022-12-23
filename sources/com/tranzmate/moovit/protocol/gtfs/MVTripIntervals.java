package com.tranzmate.moovit.protocol.gtfs;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVTripIntervals implements TBase<MVTripIntervals, _Fields>, Serializable, Cloneable, Comparable<MVTripIntervals> {

    /* renamed from: b */
    public static final C25113c f25842b = new C25113c("tripIntervalsId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25843c = new C25113c("tripPatternId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25844d = new C25113c("intervals", (byte) 15, 3);

    /* renamed from: e */
    public static final HashMap f25845e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25846f;
    private byte __isset_bitfield = 0;
    public List<Integer> intervals;
    public int tripIntervalsId;
    public int tripPatternId;

    public enum _Fields implements C25085c {
        TRIP_INTERVALS_ID(1, "tripIntervalsId"),
        TRIP_PATTERN_ID(2, "tripPatternId"),
        INTERVALS(3, "intervals");
        
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
                return TRIP_INTERVALS_ID;
            }
            if (i == 2) {
                return TRIP_PATTERN_ID;
            }
            if (i != 3) {
                return null;
            }
            return INTERVALS;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripIntervals$a */
    public static class C8859a extends C25239c<MVTripIntervals> {
        public C8859a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripIntervals mVTripIntervals = (MVTripIntervals) tBase;
            mVTripIntervals.getClass();
            C25113c cVar = MVTripIntervals.f25842b;
            gVar.mo61687K();
            gVar.mo61711x(MVTripIntervals.f25842b);
            gVar.mo61678B(mVTripIntervals.tripIntervalsId);
            gVar.mo61712y();
            gVar.mo61711x(MVTripIntervals.f25843c);
            gVar.mo61678B(mVTripIntervals.tripPatternId);
            gVar.mo61712y();
            if (mVTripIntervals.intervals != null) {
                gVar.mo61711x(MVTripIntervals.f25844d);
                gVar.mo61680D(new C25119e((byte) 8, mVTripIntervals.intervals.size()));
                for (Integer intValue : mVTripIntervals.intervals) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripIntervals mVTripIntervals = (MVTripIntervals) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripIntervals.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVTripIntervals.intervals = new ArrayList(k.f63395b);
                            int i = 0;
                            while (i < k.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVTripIntervals.intervals, i, 1);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVTripIntervals.tripPatternId = gVar.mo61696i();
                        mVTripIntervals.mo27596j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTripIntervals.tripIntervalsId = gVar.mo61696i();
                    mVTripIntervals.mo27595i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripIntervals$b */
    public static class C8860b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8859a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripIntervals$c */
    public static class C8861c extends C25240d<MVTripIntervals> {
        public C8861c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripIntervals mVTripIntervals = (MVTripIntervals) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripIntervals.mo27592g()) {
                bitSet.set(0);
            }
            if (mVTripIntervals.mo27593h()) {
                bitSet.set(1);
            }
            if (mVTripIntervals.mo27591f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTripIntervals.mo27592g()) {
                jVar.mo61678B(mVTripIntervals.tripIntervalsId);
            }
            if (mVTripIntervals.mo27593h()) {
                jVar.mo61678B(mVTripIntervals.tripPatternId);
            }
            if (mVTripIntervals.mo27591f()) {
                jVar.mo61678B(mVTripIntervals.intervals.size());
                for (Integer intValue : mVTripIntervals.intervals) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripIntervals mVTripIntervals = (MVTripIntervals) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTripIntervals.tripIntervalsId = jVar.mo61696i();
                mVTripIntervals.mo27595i();
            }
            if (T.get(1)) {
                mVTripIntervals.tripPatternId = jVar.mo61696i();
                mVTripIntervals.mo27596j();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVTripIntervals.intervals = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVTripIntervals.intervals, i2, 1)) {
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripIntervals$d */
    public static class C8862d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8861c(0);
        }
    }

    static {
        new C17394d0("MVTripIntervals");
        HashMap hashMap = new HashMap();
        f25845e = hashMap;
        hashMap.put(C25239c.class, new C8860b());
        hashMap.put(C25240d.class, new C8862d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIP_INTERVALS_ID, new FieldMetaData("tripIntervalsId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TRIP_PATTERN_ID, new FieldMetaData("tripPatternId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.INTERVALS, new FieldMetaData("intervals", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25846f = unmodifiableMap;
        FieldMetaData.m61947a(MVTripIntervals.class, unmodifiableMap);
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
        ((C25238b) f25845e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25845e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVTripIntervals mVTripIntervals = (MVTripIntervals) obj;
        if (!getClass().equals(mVTripIntervals.getClass())) {
            return getClass().getName().compareTo(mVTripIntervals.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27592g()).compareTo(Boolean.valueOf(mVTripIntervals.mo27592g()));
        if (compareTo != 0 || ((mo27592g() && (compareTo = C25082a.m62839c(this.tripIntervalsId, mVTripIntervals.tripIntervalsId)) != 0) || (compareTo = Boolean.valueOf(mo27593h()).compareTo(Boolean.valueOf(mVTripIntervals.mo27593h()))) != 0 || ((mo27593h() && (compareTo = C25082a.m62839c(this.tripPatternId, mVTripIntervals.tripPatternId)) != 0) || (compareTo = Boolean.valueOf(mo27591f()).compareTo(Boolean.valueOf(mVTripIntervals.mo27591f()))) != 0))) {
            return compareTo;
        }
        if (!mo27591f() || (h = C25082a.m62844h(this.intervals, mVTripIntervals.intervals)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripIntervals)) {
            return false;
        }
        MVTripIntervals mVTripIntervals = (MVTripIntervals) obj;
        if (this.tripIntervalsId != mVTripIntervals.tripIntervalsId || this.tripPatternId != mVTripIntervals.tripPatternId) {
            return false;
        }
        boolean f = mo27591f();
        boolean f2 = mVTripIntervals.mo27591f();
        if ((f || f2) && (!f || !f2 || !this.intervals.equals(mVTripIntervals.intervals))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27591f() {
        return this.intervals != null;
    }

    /* renamed from: g */
    public final boolean mo27592g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo27593h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27595i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo27596j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripIntervals(", "tripIntervalsId:");
        C0016g.m42z(n, this.tripIntervalsId, ", ", "tripPatternId:");
        C0016g.m42z(n, this.tripPatternId, ", ", "intervals:");
        List<Integer> list = this.intervals;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
