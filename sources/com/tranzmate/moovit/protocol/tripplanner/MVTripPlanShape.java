package com.tranzmate.moovit.protocol.tripplanner;

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

public class MVTripPlanShape implements TBase<MVTripPlanShape, _Fields>, Serializable, Cloneable, Comparable<MVTripPlanShape> {

    /* renamed from: b */
    public static final C25113c f30185b = new C25113c("distanceInMeters", (byte) 4, 1);

    /* renamed from: c */
    public static final C25113c f30186c = new C25113c("polyline", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f30187d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30188e;
    private byte __isset_bitfield = 0;
    public double distanceInMeters;
    public String polyline;

    public enum _Fields implements C25085c {
        DISTANCE_IN_METERS(1, "distanceInMeters"),
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
                return DISTANCE_IN_METERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape$a */
    public static class C11681a extends C25239c<MVTripPlanShape> {
        public C11681a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanShape mVTripPlanShape = (MVTripPlanShape) tBase;
            mVTripPlanShape.getClass();
            C25113c cVar = MVTripPlanShape.f30185b;
            gVar.mo61687K();
            gVar.mo61711x(MVTripPlanShape.f30185b);
            gVar.mo61710w(mVTripPlanShape.distanceInMeters);
            gVar.mo61712y();
            if (mVTripPlanShape.polyline != null) {
                gVar.mo61711x(MVTripPlanShape.f30186c);
                gVar.mo61686J(mVTripPlanShape.polyline);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanShape mVTripPlanShape = (MVTripPlanShape) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripPlanShape.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVTripPlanShape.polyline = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 4) {
                    mVTripPlanShape.distanceInMeters = gVar.mo61692e();
                    mVTripPlanShape.mo34753h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape$b */
    public static class C11682b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11681a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape$c */
    public static class C11683c extends C25240d<MVTripPlanShape> {
        public C11683c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanShape mVTripPlanShape = (MVTripPlanShape) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripPlanShape.mo34751f()) {
                bitSet.set(0);
            }
            if (mVTripPlanShape.mo34752g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTripPlanShape.mo34751f()) {
                jVar.mo61710w(mVTripPlanShape.distanceInMeters);
            }
            if (mVTripPlanShape.mo34752g()) {
                jVar.mo61686J(mVTripPlanShape.polyline);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanShape mVTripPlanShape = (MVTripPlanShape) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTripPlanShape.distanceInMeters = jVar.mo61692e();
                mVTripPlanShape.mo34753h();
            }
            if (T.get(1)) {
                mVTripPlanShape.polyline = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape$d */
    public static class C11684d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11683c(0);
        }
    }

    static {
        new C17394d0("MVTripPlanShape");
        HashMap hashMap = new HashMap();
        f30187d = hashMap;
        hashMap.put(C25239c.class, new C11682b());
        hashMap.put(C25240d.class, new C11684d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DISTANCE_IN_METERS, new FieldMetaData("distanceInMeters", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.POLYLINE, new FieldMetaData("polyline", (byte) 3, new FieldValueMetaData((byte) 11, "GoogleEncodedPolygon")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30188e = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanShape.class, unmodifiableMap);
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
        ((C25238b) f30187d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30187d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34748a(MVTripPlanShape mVTripPlanShape) {
        if (mVTripPlanShape == null || this.distanceInMeters != mVTripPlanShape.distanceInMeters) {
            return false;
        }
        boolean g = mo34752g();
        boolean g2 = mVTripPlanShape.mo34752g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.polyline.equals(mVTripPlanShape.polyline)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTripPlanShape mVTripPlanShape = (MVTripPlanShape) obj;
        if (!getClass().equals(mVTripPlanShape.getClass())) {
            return getClass().getName().compareTo(mVTripPlanShape.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34751f()).compareTo(Boolean.valueOf(mVTripPlanShape.mo34751f()));
        if (compareTo2 != 0 || ((mo34751f() && (compareTo2 = C25082a.m62838b(this.distanceInMeters, mVTripPlanShape.distanceInMeters)) != 0) || (compareTo2 = Boolean.valueOf(mo34752g()).compareTo(Boolean.valueOf(mVTripPlanShape.mo34752g()))) != 0)) {
            return compareTo2;
        }
        if (!mo34752g() || (compareTo = this.polyline.compareTo(mVTripPlanShape.polyline)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTripPlanShape)) {
            return mo34748a((MVTripPlanShape) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34751f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34752g() {
        return this.polyline != null;
    }

    /* renamed from: h */
    public final void mo34753h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripPlanShape(", "distanceInMeters:");
        C16759e.m42355k(n, this.distanceInMeters, ", ", "polyline:");
        String str = this.polyline;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
