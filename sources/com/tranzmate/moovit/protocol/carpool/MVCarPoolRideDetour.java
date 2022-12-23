package com.tranzmate.moovit.protocol.carpool;

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
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
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

public class MVCarPoolRideDetour implements TBase<MVCarPoolRideDetour, _Fields>, Serializable, Cloneable, Comparable<MVCarPoolRideDetour> {

    /* renamed from: b */
    public static final C25113c f24642b = new C25113c("detourDetails", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24643c = new C25113c("points", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f24644d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24645e;
    public MVCarPoolRideDetourDetails detourDetails;
    public List<MVCarPoolRidePoint> points;

    public enum _Fields implements C25085c {
        DETOUR_DETAILS(1, "detourDetails"),
        POINTS(2, "points");
        
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
                return DETOUR_DETAILS;
            }
            if (i != 2) {
                return null;
            }
            return POINTS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetour$a */
    public static class C8173a extends C25239c<MVCarPoolRideDetour> {
        public C8173a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideDetour mVCarPoolRideDetour = (MVCarPoolRideDetour) tBase;
            MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = mVCarPoolRideDetour.detourDetails;
            if (mVCarPoolRideDetourDetails != null) {
                mVCarPoolRideDetourDetails.mo25488l();
            }
            C25113c cVar = MVCarPoolRideDetour.f24642b;
            gVar.mo61687K();
            if (mVCarPoolRideDetour.detourDetails != null) {
                gVar.mo61711x(MVCarPoolRideDetour.f24642b);
                mVCarPoolRideDetour.detourDetails.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarPoolRideDetour.points != null) {
                gVar.mo61711x(MVCarPoolRideDetour.f24643c);
                gVar.mo61680D(new C25119e((byte) 12, mVCarPoolRideDetour.points.size()));
                for (MVCarPoolRidePoint X0 : mVCarPoolRideDetour.points) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideDetour mVCarPoolRideDetour = (MVCarPoolRideDetour) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVCarPoolRideDetour.points = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVCarPoolRidePoint mVCarPoolRidePoint = new MVCarPoolRidePoint();
                            mVCarPoolRidePoint.mo25201C1(gVar);
                            mVCarPoolRideDetour.points.add(mVCarPoolRidePoint);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = new MVCarPoolRideDetourDetails();
                    mVCarPoolRideDetour.detourDetails = mVCarPoolRideDetourDetails;
                    mVCarPoolRideDetourDetails.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails2 = mVCarPoolRideDetour.detourDetails;
            if (mVCarPoolRideDetourDetails2 != null) {
                mVCarPoolRideDetourDetails2.mo25488l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetour$b */
    public static class C8174b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8173a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetour$c */
    public static class C8175c extends C25240d<MVCarPoolRideDetour> {
        public C8175c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideDetour mVCarPoolRideDetour = (MVCarPoolRideDetour) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarPoolRideDetour.mo25473f()) {
                bitSet.set(0);
            }
            if (mVCarPoolRideDetour.mo25474g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVCarPoolRideDetour.mo25473f()) {
                mVCarPoolRideDetour.detourDetails.mo25202X0(jVar);
            }
            if (mVCarPoolRideDetour.mo25474g()) {
                jVar.mo61678B(mVCarPoolRideDetour.points.size());
                for (MVCarPoolRidePoint X0 : mVCarPoolRideDetour.points) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideDetour mVCarPoolRideDetour = (MVCarPoolRideDetour) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = new MVCarPoolRideDetourDetails();
                mVCarPoolRideDetour.detourDetails = mVCarPoolRideDetourDetails;
                mVCarPoolRideDetourDetails.mo25201C1(jVar);
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVCarPoolRideDetour.points = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVCarPoolRidePoint mVCarPoolRidePoint = new MVCarPoolRidePoint();
                    mVCarPoolRidePoint.mo25201C1(jVar);
                    mVCarPoolRideDetour.points.add(mVCarPoolRidePoint);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetour$d */
    public static class C8176d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8175c(0);
        }
    }

    static {
        new C17394d0("MVCarPoolRideDetour");
        HashMap hashMap = new HashMap();
        f24644d = hashMap;
        hashMap.put(C25239c.class, new C8174b());
        hashMap.put(C25240d.class, new C8176d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DETOUR_DETAILS, new FieldMetaData("detourDetails", (byte) 3, new StructMetaData(MVCarPoolRideDetourDetails.class)));
        enumMap.put(_Fields.POINTS, new FieldMetaData("points", (byte) 3, new ListMetaData(new StructMetaData(MVCarPoolRidePoint.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24645e = unmodifiableMap;
        FieldMetaData.m61947a(MVCarPoolRideDetour.class, unmodifiableMap);
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
        ((C25238b) f24644d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24644d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25470a(MVCarPoolRideDetour mVCarPoolRideDetour) {
        if (mVCarPoolRideDetour == null) {
            return false;
        }
        boolean f = mo25473f();
        boolean f2 = mVCarPoolRideDetour.mo25473f();
        if ((f || f2) && (!f || !f2 || !this.detourDetails.mo25478a(mVCarPoolRideDetour.detourDetails))) {
            return false;
        }
        boolean g = mo25474g();
        boolean g2 = mVCarPoolRideDetour.mo25474g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.points.equals(mVCarPoolRideDetour.points)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVCarPoolRideDetour mVCarPoolRideDetour = (MVCarPoolRideDetour) obj;
        if (!getClass().equals(mVCarPoolRideDetour.getClass())) {
            return getClass().getName().compareTo(mVCarPoolRideDetour.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25473f()).compareTo(Boolean.valueOf(mVCarPoolRideDetour.mo25473f()));
        if (compareTo != 0 || ((mo25473f() && (compareTo = this.detourDetails.compareTo(mVCarPoolRideDetour.detourDetails)) != 0) || (compareTo = Boolean.valueOf(mo25474g()).compareTo(Boolean.valueOf(mVCarPoolRideDetour.mo25474g()))) != 0)) {
            return compareTo;
        }
        if (!mo25474g() || (h = C25082a.m62844h(this.points, mVCarPoolRideDetour.points)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCarPoolRideDetour)) {
            return mo25470a((MVCarPoolRideDetour) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25473f() {
        return this.detourDetails != null;
    }

    /* renamed from: g */
    public final boolean mo25474g() {
        return this.points != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarPoolRideDetour(", "detourDetails:");
        MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = this.detourDetails;
        if (mVCarPoolRideDetourDetails == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolRideDetourDetails);
        }
        n.append(", ");
        n.append("points:");
        List<MVCarPoolRidePoint> list = this.points;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
