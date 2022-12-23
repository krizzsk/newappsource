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

public class MVTripShape implements TBase<MVTripShape, _Fields>, Serializable, Cloneable, Comparable<MVTripShape> {

    /* renamed from: b */
    public static final C25113c f25861b = new C25113c("shapeId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25862c = new C25113c("encodedShape", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f25863d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25864e;
    private byte __isset_bitfield = 0;
    public String encodedShape;
    public int shapeId;

    public enum _Fields implements C25085c {
        SHAPE_ID(1, "shapeId"),
        ENCODED_SHAPE(2, "encodedShape");
        
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
                return SHAPE_ID;
            }
            if (i != 2) {
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripShape$a */
    public static class C8871a extends C25239c<MVTripShape> {
        public C8871a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripShape mVTripShape = (MVTripShape) tBase;
            mVTripShape.getClass();
            C25113c cVar = MVTripShape.f25861b;
            gVar.mo61687K();
            gVar.mo61711x(MVTripShape.f25861b);
            gVar.mo61678B(mVTripShape.shapeId);
            gVar.mo61712y();
            if (mVTripShape.encodedShape != null) {
                gVar.mo61711x(MVTripShape.f25862c);
                gVar.mo61686J(mVTripShape.encodedShape);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripShape mVTripShape = (MVTripShape) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripShape.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVTripShape.encodedShape = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTripShape.shapeId = gVar.mo61696i();
                    mVTripShape.mo27629h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripShape$b */
    public static class C8872b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8871a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripShape$c */
    public static class C8873c extends C25240d<MVTripShape> {
        public C8873c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripShape mVTripShape = (MVTripShape) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripShape.mo27628g()) {
                bitSet.set(0);
            }
            if (mVTripShape.mo27627f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTripShape.mo27628g()) {
                jVar.mo61678B(mVTripShape.shapeId);
            }
            if (mVTripShape.mo27627f()) {
                jVar.mo61686J(mVTripShape.encodedShape);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripShape mVTripShape = (MVTripShape) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTripShape.shapeId = jVar.mo61696i();
                mVTripShape.mo27629h();
            }
            if (T.get(1)) {
                mVTripShape.encodedShape = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripShape$d */
    public static class C8874d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8873c(0);
        }
    }

    static {
        new C17394d0("MVTripShape");
        HashMap hashMap = new HashMap();
        f25863d = hashMap;
        hashMap.put(C25239c.class, new C8872b());
        hashMap.put(C25240d.class, new C8874d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SHAPE_ID, new FieldMetaData("shapeId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ENCODED_SHAPE, new FieldMetaData("encodedShape", (byte) 3, new FieldValueMetaData((byte) 11, "GoogleEncodedPolygon")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25864e = unmodifiableMap;
        FieldMetaData.m61947a(MVTripShape.class, unmodifiableMap);
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
        ((C25238b) f25863d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25863d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTripShape mVTripShape = (MVTripShape) obj;
        if (!getClass().equals(mVTripShape.getClass())) {
            return getClass().getName().compareTo(mVTripShape.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27628g()).compareTo(Boolean.valueOf(mVTripShape.mo27628g()));
        if (compareTo2 != 0 || ((mo27628g() && (compareTo2 = C25082a.m62839c(this.shapeId, mVTripShape.shapeId)) != 0) || (compareTo2 = Boolean.valueOf(mo27627f()).compareTo(Boolean.valueOf(mVTripShape.mo27627f()))) != 0)) {
            return compareTo2;
        }
        if (!mo27627f() || (compareTo = this.encodedShape.compareTo(mVTripShape.encodedShape)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripShape)) {
            return false;
        }
        MVTripShape mVTripShape = (MVTripShape) obj;
        if (this.shapeId != mVTripShape.shapeId) {
            return false;
        }
        boolean f = mo27627f();
        boolean f2 = mVTripShape.mo27627f();
        if ((f || f2) && (!f || !f2 || !this.encodedShape.equals(mVTripShape.encodedShape))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27627f() {
        return this.encodedShape != null;
    }

    /* renamed from: g */
    public final boolean mo27628g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo27629h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripShape(", "shapeId:");
        C0016g.m42z(n, this.shapeId, ", ", "encodedShape:");
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
