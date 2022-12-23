package com.tranzmate.moovit.protocol.carpool;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVCarPoolRidePoint implements TBase<MVCarPoolRidePoint, _Fields>, Serializable, Cloneable, Comparable<MVCarPoolRidePoint> {

    /* renamed from: b */
    public static final C25113c f24652b = new C25113c("stopSeq", (byte) 6, 1);

    /* renamed from: c */
    public static final C25113c f24653c = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24654d = new C25113c("desc", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f24655e = new C25113c("minsFromStart", (byte) 4, 4);

    /* renamed from: f */
    public static final C25113c f24656f = new C25113c("metersFromStart", (byte) 4, 5);

    /* renamed from: g */
    public static final HashMap f24657g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f24658h;
    private byte __isset_bitfield = 0;
    public String desc;
    public MVLatLon location;
    public double metersFromStart;
    public double minsFromStart;
    public short stopSeq;

    public enum _Fields implements C25085c {
        STOP_SEQ(1, "stopSeq"),
        LOCATION(2, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        DESC(3, "desc"),
        MINS_FROM_START(4, "minsFromStart"),
        METERS_FROM_START(5, "metersFromStart");
        
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
                return STOP_SEQ;
            }
            if (i == 2) {
                return LOCATION;
            }
            if (i == 3) {
                return DESC;
            }
            if (i == 4) {
                return MINS_FROM_START;
            }
            if (i != 5) {
                return null;
            }
            return METERS_FROM_START;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolRidePoint$a */
    public static class C8181a extends C25239c<MVCarPoolRidePoint> {
        public C8181a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRidePoint mVCarPoolRidePoint = (MVCarPoolRidePoint) tBase;
            MVLatLon mVLatLon = mVCarPoolRidePoint.location;
            C25113c cVar = MVCarPoolRidePoint.f24652b;
            gVar.mo61687K();
            gVar.mo61711x(MVCarPoolRidePoint.f24652b);
            gVar.mo61677A(mVCarPoolRidePoint.stopSeq);
            gVar.mo61712y();
            if (mVCarPoolRidePoint.location != null) {
                gVar.mo61711x(MVCarPoolRidePoint.f24653c);
                mVCarPoolRidePoint.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarPoolRidePoint.desc != null) {
                gVar.mo61711x(MVCarPoolRidePoint.f24654d);
                gVar.mo61686J(mVCarPoolRidePoint.desc);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCarPoolRidePoint.f24655e);
            gVar.mo61710w(mVCarPoolRidePoint.minsFromStart);
            gVar.mo61712y();
            gVar.mo61711x(MVCarPoolRidePoint.f24656f);
            gVar.mo61710w(mVCarPoolRidePoint.metersFromStart);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRidePoint mVCarPoolRidePoint = (MVCarPoolRidePoint) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVCarPoolRidePoint.location;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 4) {
                                    mVCarPoolRidePoint.metersFromStart = gVar.mo61692e();
                                    mVCarPoolRidePoint.mo25499k();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 4) {
                                mVCarPoolRidePoint.minsFromStart = gVar.mo61692e();
                                mVCarPoolRidePoint.mo25500l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVCarPoolRidePoint.desc = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVLatLon mVLatLon2 = new MVLatLon();
                        mVCarPoolRidePoint.location = mVLatLon2;
                        mVLatLon2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 6) {
                    mVCarPoolRidePoint.stopSeq = gVar.mo61695h();
                    mVCarPoolRidePoint.mo25501m();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolRidePoint$b */
    public static class C8182b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8181a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolRidePoint$c */
    public static class C8183c extends C25240d<MVCarPoolRidePoint> {
        public C8183c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRidePoint mVCarPoolRidePoint = (MVCarPoolRidePoint) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarPoolRidePoint.mo25498j()) {
                bitSet.set(0);
            }
            if (mVCarPoolRidePoint.mo25494g()) {
                bitSet.set(1);
            }
            if (mVCarPoolRidePoint.mo25493f()) {
                bitSet.set(2);
            }
            if (mVCarPoolRidePoint.mo25497i()) {
                bitSet.set(3);
            }
            if (mVCarPoolRidePoint.mo25495h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVCarPoolRidePoint.mo25498j()) {
                jVar.mo61677A(mVCarPoolRidePoint.stopSeq);
            }
            if (mVCarPoolRidePoint.mo25494g()) {
                mVCarPoolRidePoint.location.mo25202X0(jVar);
            }
            if (mVCarPoolRidePoint.mo25493f()) {
                jVar.mo61686J(mVCarPoolRidePoint.desc);
            }
            if (mVCarPoolRidePoint.mo25497i()) {
                jVar.mo61710w(mVCarPoolRidePoint.minsFromStart);
            }
            if (mVCarPoolRidePoint.mo25495h()) {
                jVar.mo61710w(mVCarPoolRidePoint.metersFromStart);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRidePoint mVCarPoolRidePoint = (MVCarPoolRidePoint) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVCarPoolRidePoint.stopSeq = jVar.mo61695h();
                mVCarPoolRidePoint.mo25501m();
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVCarPoolRidePoint.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVCarPoolRidePoint.desc = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVCarPoolRidePoint.minsFromStart = jVar.mo61692e();
                mVCarPoolRidePoint.mo25500l();
            }
            if (T.get(4)) {
                mVCarPoolRidePoint.metersFromStart = jVar.mo61692e();
                mVCarPoolRidePoint.mo25499k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolRidePoint$d */
    public static class C8184d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8183c(0);
        }
    }

    static {
        new C17394d0("MVCarPoolRidePoint");
        HashMap hashMap = new HashMap();
        f24657g = hashMap;
        hashMap.put(C25239c.class, new C8182b());
        hashMap.put(C25240d.class, new C8184d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_SEQ, new FieldMetaData("stopSeq", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.DESC, new FieldMetaData("desc", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MINS_FROM_START, new FieldMetaData("minsFromStart", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.METERS_FROM_START, new FieldMetaData("metersFromStart", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24658h = unmodifiableMap;
        FieldMetaData.m61947a(MVCarPoolRidePoint.class, unmodifiableMap);
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
        ((C25238b) f24657g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24657g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int b;
        MVCarPoolRidePoint mVCarPoolRidePoint = (MVCarPoolRidePoint) obj;
        if (!getClass().equals(mVCarPoolRidePoint.getClass())) {
            return getClass().getName().compareTo(mVCarPoolRidePoint.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25498j()).compareTo(Boolean.valueOf(mVCarPoolRidePoint.mo25498j()));
        if (compareTo != 0 || ((mo25498j() && (compareTo = C25082a.m62847k(this.stopSeq, mVCarPoolRidePoint.stopSeq)) != 0) || (compareTo = Boolean.valueOf(mo25494g()).compareTo(Boolean.valueOf(mVCarPoolRidePoint.mo25494g()))) != 0 || ((mo25494g() && (compareTo = this.location.compareTo(mVCarPoolRidePoint.location)) != 0) || (compareTo = Boolean.valueOf(mo25493f()).compareTo(Boolean.valueOf(mVCarPoolRidePoint.mo25493f()))) != 0 || ((mo25493f() && (compareTo = this.desc.compareTo(mVCarPoolRidePoint.desc)) != 0) || (compareTo = Boolean.valueOf(mo25497i()).compareTo(Boolean.valueOf(mVCarPoolRidePoint.mo25497i()))) != 0 || ((mo25497i() && (compareTo = C25082a.m62838b(this.minsFromStart, mVCarPoolRidePoint.minsFromStart)) != 0) || (compareTo = Boolean.valueOf(mo25495h()).compareTo(Boolean.valueOf(mVCarPoolRidePoint.mo25495h()))) != 0))))) {
            return compareTo;
        }
        if (!mo25495h() || (b = C25082a.m62838b(this.metersFromStart, mVCarPoolRidePoint.metersFromStart)) == 0) {
            return 0;
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCarPoolRidePoint)) {
            return false;
        }
        MVCarPoolRidePoint mVCarPoolRidePoint = (MVCarPoolRidePoint) obj;
        if (this.stopSeq != mVCarPoolRidePoint.stopSeq) {
            return false;
        }
        boolean g = mo25494g();
        boolean g2 = mVCarPoolRidePoint.mo25494g();
        if ((g || g2) && (!g || !g2 || !this.location.mo26290a(mVCarPoolRidePoint.location))) {
            return false;
        }
        boolean f = mo25493f();
        boolean f2 = mVCarPoolRidePoint.mo25493f();
        if (((!f && !f2) || (f && f2 && this.desc.equals(mVCarPoolRidePoint.desc))) && this.minsFromStart == mVCarPoolRidePoint.minsFromStart && this.metersFromStart == mVCarPoolRidePoint.metersFromStart) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25493f() {
        return this.desc != null;
    }

    /* renamed from: g */
    public final boolean mo25494g() {
        return this.location != null;
    }

    /* renamed from: h */
    public final boolean mo25495h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25497i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo25498j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo25499k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: l */
    public final void mo25500l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo25501m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarPoolRidePoint(", "stopSeq:");
        C0016g.m42z(n, this.stopSeq, ", ", "location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("desc:");
        String str = this.desc;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("minsFromStart:");
        C16759e.m42355k(n, this.minsFromStart, ", ", "metersFromStart:");
        n.append(this.metersFromStart);
        n.append(")");
        return n.toString();
    }
}
