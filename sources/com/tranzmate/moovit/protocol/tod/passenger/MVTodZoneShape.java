package com.tranzmate.moovit.protocol.tod.passenger;

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
import p358af.C13437d;
import p531he.C17394d0;
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

public class MVTodZoneShape implements TBase<MVTodZoneShape, _Fields>, Serializable, Cloneable, Comparable<MVTodZoneShape> {

    /* renamed from: b */
    public static final C25113c f29698b = new C25113c("shapeId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29699c = new C25113c("polyline", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f29700d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29701e;
    public String polyline;
    public String shapeId;

    public enum _Fields implements C25085c {
        SHAPE_ID(1, "shapeId"),
        POLYLINE(2, "polyline");
        
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
            return POLYLINE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodZoneShape$a */
    public static class C11398a extends C25239c<MVTodZoneShape> {
        public C11398a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodZoneShape mVTodZoneShape = (MVTodZoneShape) tBase;
            mVTodZoneShape.getClass();
            C25113c cVar = MVTodZoneShape.f29698b;
            gVar.mo61687K();
            if (mVTodZoneShape.shapeId != null) {
                gVar.mo61711x(MVTodZoneShape.f29698b);
                gVar.mo61686J(mVTodZoneShape.shapeId);
                gVar.mo61712y();
            }
            if (mVTodZoneShape.polyline != null) {
                gVar.mo61711x(MVTodZoneShape.f29699c);
                gVar.mo61686J(mVTodZoneShape.polyline);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodZoneShape mVTodZoneShape = (MVTodZoneShape) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodZoneShape.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVTodZoneShape.polyline = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodZoneShape.shapeId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodZoneShape$b */
    public static class C11399b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11398a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodZoneShape$c */
    public static class C11400c extends C25240d<MVTodZoneShape> {
        public C11400c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodZoneShape mVTodZoneShape = (MVTodZoneShape) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodZoneShape.mo33934g()) {
                bitSet.set(0);
            }
            if (mVTodZoneShape.mo33933f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodZoneShape.mo33934g()) {
                jVar.mo61686J(mVTodZoneShape.shapeId);
            }
            if (mVTodZoneShape.mo33933f()) {
                jVar.mo61686J(mVTodZoneShape.polyline);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodZoneShape mVTodZoneShape = (MVTodZoneShape) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTodZoneShape.shapeId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodZoneShape.polyline = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodZoneShape$d */
    public static class C11401d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11400c(0);
        }
    }

    static {
        new C17394d0("MVTodZoneShape");
        HashMap hashMap = new HashMap();
        f29700d = hashMap;
        hashMap.put(C25239c.class, new C11399b());
        hashMap.put(C25240d.class, new C11401d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SHAPE_ID, new FieldMetaData("shapeId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.POLYLINE, new FieldMetaData("polyline", (byte) 3, new FieldValueMetaData((byte) 11, "GoogleEncodedPolygon")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29701e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodZoneShape.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f29700d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29700d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodZoneShape mVTodZoneShape = (MVTodZoneShape) obj;
        if (!getClass().equals(mVTodZoneShape.getClass())) {
            return getClass().getName().compareTo(mVTodZoneShape.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33934g()).compareTo(Boolean.valueOf(mVTodZoneShape.mo33934g()));
        if (compareTo2 != 0 || ((mo33934g() && (compareTo2 = this.shapeId.compareTo(mVTodZoneShape.shapeId)) != 0) || (compareTo2 = Boolean.valueOf(mo33933f()).compareTo(Boolean.valueOf(mVTodZoneShape.mo33933f()))) != 0)) {
            return compareTo2;
        }
        if (!mo33933f() || (compareTo = this.polyline.compareTo(mVTodZoneShape.polyline)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodZoneShape)) {
            return false;
        }
        MVTodZoneShape mVTodZoneShape = (MVTodZoneShape) obj;
        boolean g = mo33934g();
        boolean g2 = mVTodZoneShape.mo33934g();
        if ((g || g2) && (!g || !g2 || !this.shapeId.equals(mVTodZoneShape.shapeId))) {
            return false;
        }
        boolean f = mo33933f();
        boolean f2 = mVTodZoneShape.mo33933f();
        if ((f || f2) && (!f || !f2 || !this.polyline.equals(mVTodZoneShape.polyline))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33933f() {
        return this.polyline != null;
    }

    /* renamed from: g */
    public final boolean mo33934g() {
        return this.shapeId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodZoneShape(", "shapeId:");
        String str = this.shapeId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("polyline:");
        String str2 = this.polyline;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
