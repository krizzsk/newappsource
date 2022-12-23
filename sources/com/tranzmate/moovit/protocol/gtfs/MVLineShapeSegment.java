package com.tranzmate.moovit.protocol.gtfs;

import com.appboy.support.StringUtils;
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

public class MVLineShapeSegment implements TBase<MVLineShapeSegment, _Fields>, Serializable, Cloneable, Comparable<MVLineShapeSegment> {

    /* renamed from: b */
    public static final C25113c f25713b = new C25113c("shapeSegmentId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25714c = new C25113c("fromStopId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25715d = new C25113c("toStopId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25716e = new C25113c("encodedShape", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f25717f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f25718g;
    private byte __isset_bitfield = 0;
    public String encodedShape;
    public int fromStopId;
    public int shapeSegmentId;
    public int toStopId;

    public enum _Fields implements C25085c {
        SHAPE_SEGMENT_ID(1, "shapeSegmentId"),
        FROM_STOP_ID(2, "fromStopId"),
        TO_STOP_ID(3, "toStopId"),
        ENCODED_SHAPE(4, "encodedShape");
        
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
                return SHAPE_SEGMENT_ID;
            }
            if (i == 2) {
                return FROM_STOP_ID;
            }
            if (i == 3) {
                return TO_STOP_ID;
            }
            if (i != 4) {
                return null;
            }
            return ENCODED_SHAPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineShapeSegment$a */
    public static class C8783a extends C25239c<MVLineShapeSegment> {
        public C8783a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineShapeSegment mVLineShapeSegment = (MVLineShapeSegment) tBase;
            mVLineShapeSegment.getClass();
            C25113c cVar = MVLineShapeSegment.f25713b;
            gVar.mo61687K();
            gVar.mo61711x(MVLineShapeSegment.f25713b);
            gVar.mo61678B(mVLineShapeSegment.shapeSegmentId);
            gVar.mo61712y();
            gVar.mo61711x(MVLineShapeSegment.f25714c);
            gVar.mo61678B(mVLineShapeSegment.fromStopId);
            gVar.mo61712y();
            gVar.mo61711x(MVLineShapeSegment.f25715d);
            gVar.mo61678B(mVLineShapeSegment.toStopId);
            gVar.mo61712y();
            if (mVLineShapeSegment.encodedShape != null) {
                gVar.mo61711x(MVLineShapeSegment.f25716e);
                gVar.mo61686J(mVLineShapeSegment.encodedShape);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineShapeSegment mVLineShapeSegment = (MVLineShapeSegment) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLineShapeSegment.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVLineShapeSegment.encodedShape = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVLineShapeSegment.toStopId = gVar.mo61696i();
                            mVLineShapeSegment.mo27375l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVLineShapeSegment.fromStopId = gVar.mo61696i();
                        mVLineShapeSegment.mo27373j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVLineShapeSegment.shapeSegmentId = gVar.mo61696i();
                    mVLineShapeSegment.mo27374k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineShapeSegment$b */
    public static class C8784b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8783a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineShapeSegment$c */
    public static class C8785c extends C25240d<MVLineShapeSegment> {
        public C8785c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineShapeSegment mVLineShapeSegment = (MVLineShapeSegment) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineShapeSegment.mo27370h()) {
                bitSet.set(0);
            }
            if (mVLineShapeSegment.mo27369g()) {
                bitSet.set(1);
            }
            if (mVLineShapeSegment.mo27372i()) {
                bitSet.set(2);
            }
            if (mVLineShapeSegment.mo27368f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVLineShapeSegment.mo27370h()) {
                jVar.mo61678B(mVLineShapeSegment.shapeSegmentId);
            }
            if (mVLineShapeSegment.mo27369g()) {
                jVar.mo61678B(mVLineShapeSegment.fromStopId);
            }
            if (mVLineShapeSegment.mo27372i()) {
                jVar.mo61678B(mVLineShapeSegment.toStopId);
            }
            if (mVLineShapeSegment.mo27368f()) {
                jVar.mo61686J(mVLineShapeSegment.encodedShape);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineShapeSegment mVLineShapeSegment = (MVLineShapeSegment) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVLineShapeSegment.shapeSegmentId = jVar.mo61696i();
                mVLineShapeSegment.mo27374k();
            }
            if (T.get(1)) {
                mVLineShapeSegment.fromStopId = jVar.mo61696i();
                mVLineShapeSegment.mo27373j();
            }
            if (T.get(2)) {
                mVLineShapeSegment.toStopId = jVar.mo61696i();
                mVLineShapeSegment.mo27375l();
            }
            if (T.get(3)) {
                mVLineShapeSegment.encodedShape = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineShapeSegment$d */
    public static class C8786d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8785c(0);
        }
    }

    static {
        new C17394d0("MVLineShapeSegment");
        HashMap hashMap = new HashMap();
        f25717f = hashMap;
        hashMap.put(C25239c.class, new C8784b());
        hashMap.put(C25240d.class, new C8786d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SHAPE_SEGMENT_ID, new FieldMetaData("shapeSegmentId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FROM_STOP_ID, new FieldMetaData("fromStopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TO_STOP_ID, new FieldMetaData("toStopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ENCODED_SHAPE, new FieldMetaData("encodedShape", (byte) 3, new FieldValueMetaData((byte) 11, "GoogleEncodedPolygon")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25718g = unmodifiableMap;
        FieldMetaData.m61947a(MVLineShapeSegment.class, unmodifiableMap);
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
        ((C25238b) f25717f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25717f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLineShapeSegment mVLineShapeSegment = (MVLineShapeSegment) obj;
        if (!getClass().equals(mVLineShapeSegment.getClass())) {
            return getClass().getName().compareTo(mVLineShapeSegment.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27370h()).compareTo(Boolean.valueOf(mVLineShapeSegment.mo27370h()));
        if (compareTo2 != 0 || ((mo27370h() && (compareTo2 = C25082a.m62839c(this.shapeSegmentId, mVLineShapeSegment.shapeSegmentId)) != 0) || (compareTo2 = Boolean.valueOf(mo27369g()).compareTo(Boolean.valueOf(mVLineShapeSegment.mo27369g()))) != 0 || ((mo27369g() && (compareTo2 = C25082a.m62839c(this.fromStopId, mVLineShapeSegment.fromStopId)) != 0) || (compareTo2 = Boolean.valueOf(mo27372i()).compareTo(Boolean.valueOf(mVLineShapeSegment.mo27372i()))) != 0 || ((mo27372i() && (compareTo2 = C25082a.m62839c(this.toStopId, mVLineShapeSegment.toStopId)) != 0) || (compareTo2 = Boolean.valueOf(mo27368f()).compareTo(Boolean.valueOf(mVLineShapeSegment.mo27368f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo27368f() || (compareTo = this.encodedShape.compareTo(mVLineShapeSegment.encodedShape)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLineShapeSegment)) {
            return false;
        }
        MVLineShapeSegment mVLineShapeSegment = (MVLineShapeSegment) obj;
        if (this.shapeSegmentId != mVLineShapeSegment.shapeSegmentId || this.fromStopId != mVLineShapeSegment.fromStopId || this.toStopId != mVLineShapeSegment.toStopId) {
            return false;
        }
        boolean f = mo27368f();
        boolean f2 = mVLineShapeSegment.mo27368f();
        if ((f || f2) && (!f || !f2 || !this.encodedShape.equals(mVLineShapeSegment.encodedShape))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27368f() {
        return this.encodedShape != null;
    }

    /* renamed from: g */
    public final boolean mo27369g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo27370h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27372i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final void mo27373j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo27374k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo27375l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineShapeSegment(", "shapeSegmentId:");
        C0016g.m42z(n, this.shapeSegmentId, ", ", "fromStopId:");
        C0016g.m42z(n, this.fromStopId, ", ", "toStopId:");
        C0016g.m42z(n, this.toStopId, ", ", "encodedShape:");
        String str = this.encodedShape;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
