package com.tranzmate.moovit.protocol.linearrivals;

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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVLineArrivals implements TBase<MVLineArrivals, _Fields>, Serializable, Cloneable, Comparable<MVLineArrivals> {

    /* renamed from: b */
    public static final C25113c f26143b = new C25113c("lineId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26144c = new C25113c("arrivals", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f26145d = new C25113c("shapeSegments", (byte) 15, 3);

    /* renamed from: e */
    public static final HashMap f26146e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f26147f;
    private byte __isset_bitfield = 0;
    public List<MVArrival> arrivals;
    public int lineId;
    private _Fields[] optionals = {_Fields.SHAPE_SEGMENTS};
    public List<MVLineArrivalShapeSegment> shapeSegments;

    public enum _Fields implements C25085c {
        LINE_ID(1, "lineId"),
        ARRIVALS(2, "arrivals"),
        SHAPE_SEGMENTS(3, "shapeSegments");
        
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
            if (i == 2) {
                return ARRIVALS;
            }
            if (i != 3) {
                return null;
            }
            return SHAPE_SEGMENTS;
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

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVLineArrivals$a */
    public static class C8980a extends C25239c<MVLineArrivals> {
        public C8980a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineArrivals mVLineArrivals = (MVLineArrivals) tBase;
            mVLineArrivals.getClass();
            C25113c cVar = MVLineArrivals.f26143b;
            gVar.mo61687K();
            gVar.mo61711x(MVLineArrivals.f26143b);
            gVar.mo61678B(mVLineArrivals.lineId);
            gVar.mo61712y();
            if (mVLineArrivals.arrivals != null) {
                gVar.mo61711x(MVLineArrivals.f26144c);
                gVar.mo61680D(new C25119e((byte) 12, mVLineArrivals.arrivals.size()));
                for (MVArrival X0 : mVLineArrivals.arrivals) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVLineArrivals.shapeSegments != null && mVLineArrivals.mo28041h()) {
                gVar.mo61711x(MVLineArrivals.f26145d);
                gVar.mo61680D(new C25119e((byte) 12, mVLineArrivals.shapeSegments.size()));
                for (MVLineArrivalShapeSegment X02 : mVLineArrivals.shapeSegments) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineArrivals mVLineArrivals = (MVLineArrivals) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLineArrivals.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    int i = 0;
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVLineArrivals.shapeSegments = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVLineArrivalShapeSegment mVLineArrivalShapeSegment = new MVLineArrivalShapeSegment();
                                mVLineArrivalShapeSegment.mo25201C1(gVar);
                                mVLineArrivals.shapeSegments.add(mVLineArrivalShapeSegment);
                                i++;
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k2 = gVar.mo61698k();
                        mVLineArrivals.arrivals = new ArrayList(k2.f63395b);
                        while (i < k2.f63395b) {
                            MVArrival mVArrival = new MVArrival();
                            mVArrival.mo25201C1(gVar);
                            mVLineArrivals.arrivals.add(mVArrival);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVLineArrivals.lineId = gVar.mo61696i();
                    mVLineArrivals.mo28043i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVLineArrivals$b */
    public static class C8981b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8980a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVLineArrivals$c */
    public static class C8982c extends C25240d<MVLineArrivals> {
        public C8982c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineArrivals mVLineArrivals = (MVLineArrivals) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineArrivals.mo28040g()) {
                bitSet.set(0);
            }
            if (mVLineArrivals.mo28039f()) {
                bitSet.set(1);
            }
            if (mVLineArrivals.mo28041h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVLineArrivals.mo28040g()) {
                jVar.mo61678B(mVLineArrivals.lineId);
            }
            if (mVLineArrivals.mo28039f()) {
                jVar.mo61678B(mVLineArrivals.arrivals.size());
                for (MVArrival X0 : mVLineArrivals.arrivals) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVLineArrivals.mo28041h()) {
                jVar.mo61678B(mVLineArrivals.shapeSegments.size());
                for (MVLineArrivalShapeSegment X02 : mVLineArrivals.shapeSegments) {
                    X02.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineArrivals mVLineArrivals = (MVLineArrivals) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVLineArrivals.lineId = jVar.mo61696i();
                mVLineArrivals.mo28043i();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVLineArrivals.arrivals = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVArrival mVArrival = new MVArrival();
                    mVArrival.mo25201C1(jVar);
                    mVLineArrivals.arrivals.add(mVArrival);
                }
            }
            if (T.get(2)) {
                int i3 = jVar.mo61696i();
                mVLineArrivals.shapeSegments = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVLineArrivalShapeSegment mVLineArrivalShapeSegment = new MVLineArrivalShapeSegment();
                    mVLineArrivalShapeSegment.mo25201C1(jVar);
                    mVLineArrivals.shapeSegments.add(mVLineArrivalShapeSegment);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVLineArrivals$d */
    public static class C8983d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8982c(0);
        }
    }

    static {
        new C17394d0("MVLineArrivals");
        HashMap hashMap = new HashMap();
        f26146e = hashMap;
        hashMap.put(C25239c.class, new C8981b());
        hashMap.put(C25240d.class, new C8983d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ARRIVALS, new FieldMetaData("arrivals", (byte) 3, new ListMetaData(new StructMetaData(MVArrival.class))));
        enumMap.put(_Fields.SHAPE_SEGMENTS, new FieldMetaData("shapeSegments", (byte) 2, new ListMetaData(new StructMetaData(MVLineArrivalShapeSegment.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26147f = unmodifiableMap;
        FieldMetaData.m61947a(MVLineArrivals.class, unmodifiableMap);
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
        ((C25238b) f26146e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26146e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo28036a(MVLineArrivals mVLineArrivals) {
        if (mVLineArrivals == null || this.lineId != mVLineArrivals.lineId) {
            return false;
        }
        boolean f = mo28039f();
        boolean f2 = mVLineArrivals.mo28039f();
        if ((f || f2) && (!f || !f2 || !this.arrivals.equals(mVLineArrivals.arrivals))) {
            return false;
        }
        boolean h = mo28041h();
        boolean h2 = mVLineArrivals.mo28041h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.shapeSegments.equals(mVLineArrivals.shapeSegments)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVLineArrivals mVLineArrivals = (MVLineArrivals) obj;
        if (!getClass().equals(mVLineArrivals.getClass())) {
            return getClass().getName().compareTo(mVLineArrivals.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28040g()).compareTo(Boolean.valueOf(mVLineArrivals.mo28040g()));
        if (compareTo != 0 || ((mo28040g() && (compareTo = C25082a.m62839c(this.lineId, mVLineArrivals.lineId)) != 0) || (compareTo = Boolean.valueOf(mo28039f()).compareTo(Boolean.valueOf(mVLineArrivals.mo28039f()))) != 0 || ((mo28039f() && (compareTo = C25082a.m62844h(this.arrivals, mVLineArrivals.arrivals)) != 0) || (compareTo = Boolean.valueOf(mo28041h()).compareTo(Boolean.valueOf(mVLineArrivals.mo28041h()))) != 0))) {
            return compareTo;
        }
        if (!mo28041h() || (h = C25082a.m62844h(this.shapeSegments, mVLineArrivals.shapeSegments)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVLineArrivals)) {
            return mo28036a((MVLineArrivals) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28039f() {
        return this.arrivals != null;
    }

    /* renamed from: g */
    public final boolean mo28040g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo28041h() {
        return this.shapeSegments != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo28043i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineArrivals(", "lineId:");
        C0016g.m42z(n, this.lineId, ", ", "arrivals:");
        List<MVArrival> list = this.arrivals;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo28041h()) {
            n.append(", ");
            n.append("shapeSegments:");
            List<MVLineArrivalShapeSegment> list2 = this.shapeSegments;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
