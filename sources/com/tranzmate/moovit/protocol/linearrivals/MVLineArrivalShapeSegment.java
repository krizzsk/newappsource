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

public class MVLineArrivalShapeSegment implements TBase<MVLineArrivalShapeSegment, _Fields>, Serializable, Cloneable, Comparable<MVLineArrivalShapeSegment> {

    /* renamed from: b */
    public static final C25113c f26139b = new C25113c("tripShapeId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26140c = new C25113c("shapeSegmentIds", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f26141d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26142e;
    private byte __isset_bitfield = 0;
    public List<Integer> shapeSegmentIds;
    public int tripShapeId;

    public enum _Fields implements C25085c {
        TRIP_SHAPE_ID(1, "tripShapeId"),
        SHAPE_SEGMENT_IDS(2, "shapeSegmentIds");
        
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
                return TRIP_SHAPE_ID;
            }
            if (i != 2) {
                return null;
            }
            return SHAPE_SEGMENT_IDS;
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

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalShapeSegment$a */
    public static class C8976a extends C25239c<MVLineArrivalShapeSegment> {
        public C8976a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineArrivalShapeSegment mVLineArrivalShapeSegment = (MVLineArrivalShapeSegment) tBase;
            mVLineArrivalShapeSegment.getClass();
            C25113c cVar = MVLineArrivalShapeSegment.f26139b;
            gVar.mo61687K();
            gVar.mo61711x(MVLineArrivalShapeSegment.f26139b);
            gVar.mo61678B(mVLineArrivalShapeSegment.tripShapeId);
            gVar.mo61712y();
            if (mVLineArrivalShapeSegment.shapeSegmentIds != null) {
                gVar.mo61711x(MVLineArrivalShapeSegment.f26140c);
                gVar.mo61680D(new C25119e((byte) 8, mVLineArrivalShapeSegment.shapeSegmentIds.size()));
                for (Integer intValue : mVLineArrivalShapeSegment.shapeSegmentIds) {
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
            MVLineArrivalShapeSegment mVLineArrivalShapeSegment = (MVLineArrivalShapeSegment) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLineArrivalShapeSegment.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVLineArrivalShapeSegment.shapeSegmentIds = new ArrayList(k.f63395b);
                        int i = 0;
                        while (i < k.f63395b) {
                            i = C13437d.m33701f(gVar.mo61696i(), mVLineArrivalShapeSegment.shapeSegmentIds, i, 1);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVLineArrivalShapeSegment.tripShapeId = gVar.mo61696i();
                    mVLineArrivalShapeSegment.mo28032h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalShapeSegment$b */
    public static class C8977b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8976a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalShapeSegment$c */
    public static class C8978c extends C25240d<MVLineArrivalShapeSegment> {
        public C8978c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineArrivalShapeSegment mVLineArrivalShapeSegment = (MVLineArrivalShapeSegment) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineArrivalShapeSegment.mo28031g()) {
                bitSet.set(0);
            }
            if (mVLineArrivalShapeSegment.mo28030f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVLineArrivalShapeSegment.mo28031g()) {
                jVar.mo61678B(mVLineArrivalShapeSegment.tripShapeId);
            }
            if (mVLineArrivalShapeSegment.mo28030f()) {
                jVar.mo61678B(mVLineArrivalShapeSegment.shapeSegmentIds.size());
                for (Integer intValue : mVLineArrivalShapeSegment.shapeSegmentIds) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineArrivalShapeSegment mVLineArrivalShapeSegment = (MVLineArrivalShapeSegment) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVLineArrivalShapeSegment.tripShapeId = jVar.mo61696i();
                mVLineArrivalShapeSegment.mo28032h();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVLineArrivalShapeSegment.shapeSegmentIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVLineArrivalShapeSegment.shapeSegmentIds, i2, 1)) {
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalShapeSegment$d */
    public static class C8979d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8978c(0);
        }
    }

    static {
        new C17394d0("MVLineArrivalShapeSegment");
        HashMap hashMap = new HashMap();
        f26141d = hashMap;
        hashMap.put(C25239c.class, new C8977b());
        hashMap.put(C25240d.class, new C8979d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIP_SHAPE_ID, new FieldMetaData("tripShapeId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SHAPE_SEGMENT_IDS, new FieldMetaData("shapeSegmentIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26142e = unmodifiableMap;
        FieldMetaData.m61947a(MVLineArrivalShapeSegment.class, unmodifiableMap);
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
        ((C25238b) f26141d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26141d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVLineArrivalShapeSegment mVLineArrivalShapeSegment = (MVLineArrivalShapeSegment) obj;
        if (!getClass().equals(mVLineArrivalShapeSegment.getClass())) {
            return getClass().getName().compareTo(mVLineArrivalShapeSegment.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28031g()).compareTo(Boolean.valueOf(mVLineArrivalShapeSegment.mo28031g()));
        if (compareTo != 0 || ((mo28031g() && (compareTo = C25082a.m62839c(this.tripShapeId, mVLineArrivalShapeSegment.tripShapeId)) != 0) || (compareTo = Boolean.valueOf(mo28030f()).compareTo(Boolean.valueOf(mVLineArrivalShapeSegment.mo28030f()))) != 0)) {
            return compareTo;
        }
        if (!mo28030f() || (h = C25082a.m62844h(this.shapeSegmentIds, mVLineArrivalShapeSegment.shapeSegmentIds)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLineArrivalShapeSegment)) {
            return false;
        }
        MVLineArrivalShapeSegment mVLineArrivalShapeSegment = (MVLineArrivalShapeSegment) obj;
        if (this.tripShapeId != mVLineArrivalShapeSegment.tripShapeId) {
            return false;
        }
        boolean f = mo28030f();
        boolean f2 = mVLineArrivalShapeSegment.mo28030f();
        if ((f || f2) && (!f || !f2 || !this.shapeSegmentIds.equals(mVLineArrivalShapeSegment.shapeSegmentIds))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28030f() {
        return this.shapeSegmentIds != null;
    }

    /* renamed from: g */
    public final boolean mo28031g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo28032h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineArrivalShapeSegment(", "tripShapeId:");
        C0016g.m42z(n, this.tripShapeId, ", ", "shapeSegmentIds:");
        List<Integer> list = this.shapeSegmentIds;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
