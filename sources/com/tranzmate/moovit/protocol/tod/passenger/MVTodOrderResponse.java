package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodOrderResponse implements TBase<MVTodOrderResponse, _Fields>, Serializable, Cloneable, Comparable<MVTodOrderResponse> {

    /* renamed from: b */
    public static final C25113c f29450b = new C25113c("orderId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29451c = new C25113c("expirationTime", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f29452d = new C25113c("assignments", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f29453e = new C25113c("paymentInfo", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f29454f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29455g;
    private byte __isset_bitfield = 0;
    public List<MVTodOrderAssignment> assignments;
    public long expirationTime;
    public int orderId;
    public MVTodPaymentInfo paymentInfo;

    public enum _Fields implements C25085c {
        ORDER_ID(1, "orderId"),
        EXPIRATION_TIME(2, "expirationTime"),
        ASSIGNMENTS(3, "assignments"),
        PAYMENT_INFO(4, "paymentInfo");
        
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
                return ORDER_ID;
            }
            if (i == 2) {
                return EXPIRATION_TIME;
            }
            if (i == 3) {
                return ASSIGNMENTS;
            }
            if (i != 4) {
                return null;
            }
            return PAYMENT_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderResponse$a */
    public static class C11249a extends C25239c<MVTodOrderResponse> {
        public C11249a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodOrderResponse mVTodOrderResponse = (MVTodOrderResponse) tBase;
            MVTodPaymentInfo mVTodPaymentInfo = mVTodOrderResponse.paymentInfo;
            C25113c cVar = MVTodOrderResponse.f29450b;
            gVar.mo61687K();
            gVar.mo61711x(MVTodOrderResponse.f29450b);
            gVar.mo61678B(mVTodOrderResponse.orderId);
            gVar.mo61712y();
            gVar.mo61711x(MVTodOrderResponse.f29451c);
            gVar.mo61679C(mVTodOrderResponse.expirationTime);
            gVar.mo61712y();
            if (mVTodOrderResponse.assignments != null) {
                gVar.mo61711x(MVTodOrderResponse.f29452d);
                gVar.mo61680D(new C25119e((byte) 12, mVTodOrderResponse.assignments.size()));
                for (MVTodOrderAssignment X0 : mVTodOrderResponse.assignments) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTodOrderResponse.paymentInfo != null) {
                gVar.mo61711x(MVTodOrderResponse.f29453e);
                mVTodOrderResponse.paymentInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodOrderResponse mVTodOrderResponse = (MVTodOrderResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTodPaymentInfo mVTodPaymentInfo = mVTodOrderResponse.paymentInfo;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVTodPaymentInfo mVTodPaymentInfo2 = new MVTodPaymentInfo();
                                mVTodOrderResponse.paymentInfo = mVTodPaymentInfo2;
                                mVTodPaymentInfo2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVTodOrderResponse.assignments = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVTodOrderAssignment mVTodOrderAssignment = new MVTodOrderAssignment();
                                mVTodOrderAssignment.mo25201C1(gVar);
                                mVTodOrderResponse.assignments.add(mVTodOrderAssignment);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVTodOrderResponse.expirationTime = gVar.mo61697j();
                        mVTodOrderResponse.mo33525j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTodOrderResponse.orderId = gVar.mo61696i();
                    mVTodOrderResponse.mo33526k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderResponse$b */
    public static class C11250b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11249a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderResponse$c */
    public static class C11251c extends C25240d<MVTodOrderResponse> {
        public C11251c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodOrderResponse mVTodOrderResponse = (MVTodOrderResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodOrderResponse.mo33522h()) {
                bitSet.set(0);
            }
            if (mVTodOrderResponse.mo33521g()) {
                bitSet.set(1);
            }
            if (mVTodOrderResponse.mo33520f()) {
                bitSet.set(2);
            }
            if (mVTodOrderResponse.mo33524i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTodOrderResponse.mo33522h()) {
                jVar.mo61678B(mVTodOrderResponse.orderId);
            }
            if (mVTodOrderResponse.mo33521g()) {
                jVar.mo61679C(mVTodOrderResponse.expirationTime);
            }
            if (mVTodOrderResponse.mo33520f()) {
                jVar.mo61678B(mVTodOrderResponse.assignments.size());
                for (MVTodOrderAssignment X0 : mVTodOrderResponse.assignments) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTodOrderResponse.mo33524i()) {
                mVTodOrderResponse.paymentInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodOrderResponse mVTodOrderResponse = (MVTodOrderResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTodOrderResponse.orderId = jVar.mo61696i();
                mVTodOrderResponse.mo33526k();
            }
            if (T.get(1)) {
                mVTodOrderResponse.expirationTime = jVar.mo61697j();
                mVTodOrderResponse.mo33525j();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVTodOrderResponse.assignments = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTodOrderAssignment mVTodOrderAssignment = new MVTodOrderAssignment();
                    mVTodOrderAssignment.mo25201C1(jVar);
                    mVTodOrderResponse.assignments.add(mVTodOrderAssignment);
                }
            }
            if (T.get(3)) {
                MVTodPaymentInfo mVTodPaymentInfo = new MVTodPaymentInfo();
                mVTodOrderResponse.paymentInfo = mVTodPaymentInfo;
                mVTodPaymentInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderResponse$d */
    public static class C11252d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11251c(0);
        }
    }

    static {
        new C17394d0("MVTodOrderResponse");
        HashMap hashMap = new HashMap();
        f29454f = hashMap;
        hashMap.put(C25239c.class, new C11250b());
        hashMap.put(C25240d.class, new C11252d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ORDER_ID, new FieldMetaData("orderId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.EXPIRATION_TIME, new FieldMetaData("expirationTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.ASSIGNMENTS, new FieldMetaData("assignments", (byte) 3, new ListMetaData(new StructMetaData(MVTodOrderAssignment.class))));
        enumMap.put(_Fields.PAYMENT_INFO, new FieldMetaData("paymentInfo", (byte) 3, new StructMetaData(MVTodPaymentInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29455g = unmodifiableMap;
        FieldMetaData.m61947a(MVTodOrderResponse.class, unmodifiableMap);
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
        ((C25238b) f29454f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29454f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodOrderResponse mVTodOrderResponse = (MVTodOrderResponse) obj;
        if (!getClass().equals(mVTodOrderResponse.getClass())) {
            return getClass().getName().compareTo(mVTodOrderResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33522h()).compareTo(Boolean.valueOf(mVTodOrderResponse.mo33522h()));
        if (compareTo2 != 0 || ((mo33522h() && (compareTo2 = C25082a.m62839c(this.orderId, mVTodOrderResponse.orderId)) != 0) || (compareTo2 = Boolean.valueOf(mo33521g()).compareTo(Boolean.valueOf(mVTodOrderResponse.mo33521g()))) != 0 || ((mo33521g() && (compareTo2 = C25082a.m62840d(this.expirationTime, mVTodOrderResponse.expirationTime)) != 0) || (compareTo2 = Boolean.valueOf(mo33520f()).compareTo(Boolean.valueOf(mVTodOrderResponse.mo33520f()))) != 0 || ((mo33520f() && (compareTo2 = C25082a.m62844h(this.assignments, mVTodOrderResponse.assignments)) != 0) || (compareTo2 = Boolean.valueOf(mo33524i()).compareTo(Boolean.valueOf(mVTodOrderResponse.mo33524i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo33524i() || (compareTo = this.paymentInfo.compareTo(mVTodOrderResponse.paymentInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodOrderResponse)) {
            return false;
        }
        MVTodOrderResponse mVTodOrderResponse = (MVTodOrderResponse) obj;
        if (this.orderId != mVTodOrderResponse.orderId || this.expirationTime != mVTodOrderResponse.expirationTime) {
            return false;
        }
        boolean f = mo33520f();
        boolean f2 = mVTodOrderResponse.mo33520f();
        if ((f || f2) && (!f || !f2 || !this.assignments.equals(mVTodOrderResponse.assignments))) {
            return false;
        }
        boolean i = mo33524i();
        boolean i2 = mVTodOrderResponse.mo33524i();
        if ((i || i2) && (!i || !i2 || !this.paymentInfo.mo33633a(mVTodOrderResponse.paymentInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33520f() {
        return this.assignments != null;
    }

    /* renamed from: g */
    public final boolean mo33521g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo33522h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33524i() {
        return this.paymentInfo != null;
    }

    /* renamed from: j */
    public final void mo33525j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo33526k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodOrderResponse(", "orderId:");
        C0016g.m42z(n, this.orderId, ", ", "expirationTime:");
        C25541a.m63889t(n, this.expirationTime, ", ", "assignments:");
        List<MVTodOrderAssignment> list = this.assignments;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("paymentInfo:");
        MVTodPaymentInfo mVTodPaymentInfo = this.paymentInfo;
        if (mVTodPaymentInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodPaymentInfo);
        }
        n.append(")");
        return n.toString();
    }
}
