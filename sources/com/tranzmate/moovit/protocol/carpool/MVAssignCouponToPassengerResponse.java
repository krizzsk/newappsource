package com.tranzmate.moovit.protocol.carpool;

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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVAssignCouponToPassengerResponse implements TBase<MVAssignCouponToPassengerResponse, _Fields>, Serializable, Cloneable, Comparable<MVAssignCouponToPassengerResponse> {

    /* renamed from: b */
    public static final C25113c f24595b = new C25113c("totalAmount", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24596c = new C25113c("rideLimit", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24597d = new C25113c("validUntil", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f24598e = new C25113c("couponType", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f24599f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f24600g;
    private byte __isset_bitfield = 0;
    public MVCouponType couponType;
    public MVCarPoolPrice rideLimit;
    public MVCarPoolPrice totalAmount;
    public long validUntil;

    public enum _Fields implements C25085c {
        TOTAL_AMOUNT(1, "totalAmount"),
        RIDE_LIMIT(2, "rideLimit"),
        VALID_UNTIL(3, "validUntil"),
        COUPON_TYPE(4, "couponType");
        
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
                return TOTAL_AMOUNT;
            }
            if (i == 2) {
                return RIDE_LIMIT;
            }
            if (i == 3) {
                return VALID_UNTIL;
            }
            if (i != 4) {
                return null;
            }
            return COUPON_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVAssignCouponToPassengerResponse$a */
    public static class C8133a extends C25239c<MVAssignCouponToPassengerResponse> {
        public C8133a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAssignCouponToPassengerResponse mVAssignCouponToPassengerResponse = (MVAssignCouponToPassengerResponse) tBase;
            MVCarPoolPrice mVCarPoolPrice = mVAssignCouponToPassengerResponse.totalAmount;
            C25113c cVar = MVAssignCouponToPassengerResponse.f24595b;
            gVar.mo61687K();
            if (mVAssignCouponToPassengerResponse.totalAmount != null) {
                gVar.mo61711x(MVAssignCouponToPassengerResponse.f24595b);
                mVAssignCouponToPassengerResponse.totalAmount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAssignCouponToPassengerResponse.rideLimit != null) {
                gVar.mo61711x(MVAssignCouponToPassengerResponse.f24596c);
                mVAssignCouponToPassengerResponse.rideLimit.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVAssignCouponToPassengerResponse.f24597d);
            gVar.mo61679C(mVAssignCouponToPassengerResponse.validUntil);
            gVar.mo61712y();
            if (mVAssignCouponToPassengerResponse.couponType != null) {
                gVar.mo61711x(MVAssignCouponToPassengerResponse.f24598e);
                gVar.mo61678B(mVAssignCouponToPassengerResponse.couponType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAssignCouponToPassengerResponse mVAssignCouponToPassengerResponse = (MVAssignCouponToPassengerResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCarPoolPrice mVCarPoolPrice = mVAssignCouponToPassengerResponse.totalAmount;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVAssignCouponToPassengerResponse.couponType = MVCouponType.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 10) {
                            mVAssignCouponToPassengerResponse.validUntil = gVar.mo61697j();
                            mVAssignCouponToPassengerResponse.mo25389j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCarPoolPrice mVCarPoolPrice2 = new MVCarPoolPrice();
                        mVAssignCouponToPassengerResponse.rideLimit = mVCarPoolPrice2;
                        mVCarPoolPrice2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCarPoolPrice mVCarPoolPrice3 = new MVCarPoolPrice();
                    mVAssignCouponToPassengerResponse.totalAmount = mVCarPoolPrice3;
                    mVCarPoolPrice3.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVAssignCouponToPassengerResponse$b */
    public static class C8134b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8133a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVAssignCouponToPassengerResponse$c */
    public static class C8135c extends C25240d<MVAssignCouponToPassengerResponse> {
        public C8135c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAssignCouponToPassengerResponse mVAssignCouponToPassengerResponse = (MVAssignCouponToPassengerResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAssignCouponToPassengerResponse.mo25386h()) {
                bitSet.set(0);
            }
            if (mVAssignCouponToPassengerResponse.mo25385g()) {
                bitSet.set(1);
            }
            if (mVAssignCouponToPassengerResponse.mo25388i()) {
                bitSet.set(2);
            }
            if (mVAssignCouponToPassengerResponse.mo25384f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVAssignCouponToPassengerResponse.mo25386h()) {
                mVAssignCouponToPassengerResponse.totalAmount.mo25202X0(jVar);
            }
            if (mVAssignCouponToPassengerResponse.mo25385g()) {
                mVAssignCouponToPassengerResponse.rideLimit.mo25202X0(jVar);
            }
            if (mVAssignCouponToPassengerResponse.mo25388i()) {
                jVar.mo61679C(mVAssignCouponToPassengerResponse.validUntil);
            }
            if (mVAssignCouponToPassengerResponse.mo25384f()) {
                jVar.mo61678B(mVAssignCouponToPassengerResponse.couponType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAssignCouponToPassengerResponse mVAssignCouponToPassengerResponse = (MVAssignCouponToPassengerResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVCarPoolPrice mVCarPoolPrice = new MVCarPoolPrice();
                mVAssignCouponToPassengerResponse.totalAmount = mVCarPoolPrice;
                mVCarPoolPrice.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVCarPoolPrice mVCarPoolPrice2 = new MVCarPoolPrice();
                mVAssignCouponToPassengerResponse.rideLimit = mVCarPoolPrice2;
                mVCarPoolPrice2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVAssignCouponToPassengerResponse.validUntil = jVar.mo61697j();
                mVAssignCouponToPassengerResponse.mo25389j();
            }
            if (T.get(3)) {
                mVAssignCouponToPassengerResponse.couponType = MVCouponType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVAssignCouponToPassengerResponse$d */
    public static class C8136d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8135c(0);
        }
    }

    static {
        new C17394d0("MVAssignCouponToPassengerResponse");
        HashMap hashMap = new HashMap();
        f24599f = hashMap;
        hashMap.put(C25239c.class, new C8134b());
        hashMap.put(C25240d.class, new C8136d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TOTAL_AMOUNT, new FieldMetaData("totalAmount", (byte) 3, new StructMetaData(MVCarPoolPrice.class)));
        enumMap.put(_Fields.RIDE_LIMIT, new FieldMetaData("rideLimit", (byte) 3, new StructMetaData(MVCarPoolPrice.class)));
        enumMap.put(_Fields.VALID_UNTIL, new FieldMetaData("validUntil", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.COUPON_TYPE, new FieldMetaData("couponType", (byte) 3, new EnumMetaData(MVCouponType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24600g = unmodifiableMap;
        FieldMetaData.m61947a(MVAssignCouponToPassengerResponse.class, unmodifiableMap);
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
        ((C25238b) f24599f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24599f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAssignCouponToPassengerResponse mVAssignCouponToPassengerResponse = (MVAssignCouponToPassengerResponse) obj;
        if (!getClass().equals(mVAssignCouponToPassengerResponse.getClass())) {
            return getClass().getName().compareTo(mVAssignCouponToPassengerResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25386h()).compareTo(Boolean.valueOf(mVAssignCouponToPassengerResponse.mo25386h()));
        if (compareTo2 != 0 || ((mo25386h() && (compareTo2 = this.totalAmount.compareTo(mVAssignCouponToPassengerResponse.totalAmount)) != 0) || (compareTo2 = Boolean.valueOf(mo25385g()).compareTo(Boolean.valueOf(mVAssignCouponToPassengerResponse.mo25385g()))) != 0 || ((mo25385g() && (compareTo2 = this.rideLimit.compareTo(mVAssignCouponToPassengerResponse.rideLimit)) != 0) || (compareTo2 = Boolean.valueOf(mo25388i()).compareTo(Boolean.valueOf(mVAssignCouponToPassengerResponse.mo25388i()))) != 0 || ((mo25388i() && (compareTo2 = C25082a.m62840d(this.validUntil, mVAssignCouponToPassengerResponse.validUntil)) != 0) || (compareTo2 = Boolean.valueOf(mo25384f()).compareTo(Boolean.valueOf(mVAssignCouponToPassengerResponse.mo25384f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo25384f() || (compareTo = this.couponType.compareTo(mVAssignCouponToPassengerResponse.couponType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAssignCouponToPassengerResponse)) {
            return false;
        }
        MVAssignCouponToPassengerResponse mVAssignCouponToPassengerResponse = (MVAssignCouponToPassengerResponse) obj;
        boolean h = mo25386h();
        boolean h2 = mVAssignCouponToPassengerResponse.mo25386h();
        if ((h || h2) && (!h || !h2 || !this.totalAmount.mo25461a(mVAssignCouponToPassengerResponse.totalAmount))) {
            return false;
        }
        boolean g = mo25385g();
        boolean g2 = mVAssignCouponToPassengerResponse.mo25385g();
        if (((g || g2) && (!g || !g2 || !this.rideLimit.mo25461a(mVAssignCouponToPassengerResponse.rideLimit))) || this.validUntil != mVAssignCouponToPassengerResponse.validUntil) {
            return false;
        }
        boolean f = mo25384f();
        boolean f2 = mVAssignCouponToPassengerResponse.mo25384f();
        if ((f || f2) && (!f || !f2 || !this.couponType.equals(mVAssignCouponToPassengerResponse.couponType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25384f() {
        return this.couponType != null;
    }

    /* renamed from: g */
    public final boolean mo25385g() {
        return this.rideLimit != null;
    }

    /* renamed from: h */
    public final boolean mo25386h() {
        return this.totalAmount != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25388i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo25389j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAssignCouponToPassengerResponse(", "totalAmount:");
        MVCarPoolPrice mVCarPoolPrice = this.totalAmount;
        if (mVCarPoolPrice == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolPrice);
        }
        n.append(", ");
        n.append("rideLimit:");
        MVCarPoolPrice mVCarPoolPrice2 = this.rideLimit;
        if (mVCarPoolPrice2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolPrice2);
        }
        n.append(", ");
        n.append("validUntil:");
        C25541a.m63889t(n, this.validUntil, ", ", "couponType:");
        MVCouponType mVCouponType = this.couponType;
        if (mVCouponType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCouponType);
        }
        n.append(")");
        return n.toString();
    }
}
