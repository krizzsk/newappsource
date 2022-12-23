package com.tranzmate.moovit.protocol.tod.shuttles;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
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

public class MVTodBookTripOrderRequest implements TBase<MVTodBookTripOrderRequest, _Fields>, Serializable, Cloneable, Comparable<MVTodBookTripOrderRequest> {

    /* renamed from: b */
    public static final C25113c f29702b = new C25113c("rideId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29703c = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29704d = new C25113c("paymentProvider", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29705e = new C25113c("subscriptionEnroll", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f29706f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29707g;
    private _Fields[] optionals = {_Fields.PRICE, _Fields.PAYMENT_PROVIDER, _Fields.SUBSCRIPTION_ENROLL};
    public MVPaymentProvider paymentProvider;
    public MVCurrencyAmount price;
    public String rideId;
    public MVTodSubscriptionEnroll subscriptionEnroll;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        PRICE(2, InAppPurchaseMetaData.KEY_PRICE),
        PAYMENT_PROVIDER(3, "paymentProvider"),
        SUBSCRIPTION_ENROLL(4, "subscriptionEnroll");
        
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
                return RIDE_ID;
            }
            if (i == 2) {
                return PRICE;
            }
            if (i == 3) {
                return PAYMENT_PROVIDER;
            }
            if (i != 4) {
                return null;
            }
            return SUBSCRIPTION_ENROLL;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodBookTripOrderRequest$a */
    public static class C11402a extends C25239c<MVTodBookTripOrderRequest> {
        public C11402a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodBookTripOrderRequest mVTodBookTripOrderRequest = (MVTodBookTripOrderRequest) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVTodBookTripOrderRequest.price;
            C25113c cVar = MVTodBookTripOrderRequest.f29702b;
            gVar.mo61687K();
            if (mVTodBookTripOrderRequest.rideId != null) {
                gVar.mo61711x(MVTodBookTripOrderRequest.f29702b);
                gVar.mo61686J(mVTodBookTripOrderRequest.rideId);
                gVar.mo61712y();
            }
            if (mVTodBookTripOrderRequest.price != null && mVTodBookTripOrderRequest.mo33941g()) {
                gVar.mo61711x(MVTodBookTripOrderRequest.f29703c);
                mVTodBookTripOrderRequest.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodBookTripOrderRequest.paymentProvider != null && mVTodBookTripOrderRequest.mo33940f()) {
                gVar.mo61711x(MVTodBookTripOrderRequest.f29704d);
                mVTodBookTripOrderRequest.paymentProvider.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodBookTripOrderRequest.subscriptionEnroll != null && mVTodBookTripOrderRequest.mo33944i()) {
                gVar.mo61711x(MVTodBookTripOrderRequest.f29705e);
                mVTodBookTripOrderRequest.subscriptionEnroll.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodBookTripOrderRequest mVTodBookTripOrderRequest = (MVTodBookTripOrderRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVTodBookTripOrderRequest.price;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVTodSubscriptionEnroll mVTodSubscriptionEnroll = new MVTodSubscriptionEnroll();
                                mVTodBookTripOrderRequest.subscriptionEnroll = mVTodSubscriptionEnroll;
                                mVTodSubscriptionEnroll.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                            mVTodBookTripOrderRequest.paymentProvider = mVPaymentProvider;
                            mVPaymentProvider.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                        mVTodBookTripOrderRequest.price = mVCurrencyAmount2;
                        mVCurrencyAmount2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodBookTripOrderRequest.rideId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodBookTripOrderRequest$b */
    public static class C11403b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11402a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodBookTripOrderRequest$c */
    public static class C11404c extends C25240d<MVTodBookTripOrderRequest> {
        public C11404c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodBookTripOrderRequest mVTodBookTripOrderRequest = (MVTodBookTripOrderRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodBookTripOrderRequest.mo33942h()) {
                bitSet.set(0);
            }
            if (mVTodBookTripOrderRequest.mo33941g()) {
                bitSet.set(1);
            }
            if (mVTodBookTripOrderRequest.mo33940f()) {
                bitSet.set(2);
            }
            if (mVTodBookTripOrderRequest.mo33944i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTodBookTripOrderRequest.mo33942h()) {
                jVar.mo61686J(mVTodBookTripOrderRequest.rideId);
            }
            if (mVTodBookTripOrderRequest.mo33941g()) {
                mVTodBookTripOrderRequest.price.mo25202X0(jVar);
            }
            if (mVTodBookTripOrderRequest.mo33940f()) {
                mVTodBookTripOrderRequest.paymentProvider.mo25202X0(jVar);
            }
            if (mVTodBookTripOrderRequest.mo33944i()) {
                mVTodBookTripOrderRequest.subscriptionEnroll.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodBookTripOrderRequest mVTodBookTripOrderRequest = (MVTodBookTripOrderRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTodBookTripOrderRequest.rideId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTodBookTripOrderRequest.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                mVTodBookTripOrderRequest.paymentProvider = mVPaymentProvider;
                mVPaymentProvider.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVTodSubscriptionEnroll mVTodSubscriptionEnroll = new MVTodSubscriptionEnroll();
                mVTodBookTripOrderRequest.subscriptionEnroll = mVTodSubscriptionEnroll;
                mVTodSubscriptionEnroll.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodBookTripOrderRequest$d */
    public static class C11405d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11404c(0);
        }
    }

    static {
        new C17394d0("MVTodBookTripOrderRequest");
        HashMap hashMap = new HashMap();
        f29706f = hashMap;
        hashMap.put(C25239c.class, new C11403b());
        hashMap.put(C25240d.class, new C11405d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.PAYMENT_PROVIDER, new FieldMetaData("paymentProvider", (byte) 2, new StructMetaData(MVPaymentProvider.class)));
        enumMap.put(_Fields.SUBSCRIPTION_ENROLL, new FieldMetaData("subscriptionEnroll", (byte) 2, new StructMetaData(MVTodSubscriptionEnroll.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29707g = unmodifiableMap;
        FieldMetaData.m61947a(MVTodBookTripOrderRequest.class, unmodifiableMap);
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
        ((C25238b) f29706f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29706f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodBookTripOrderRequest mVTodBookTripOrderRequest = (MVTodBookTripOrderRequest) obj;
        if (!getClass().equals(mVTodBookTripOrderRequest.getClass())) {
            return getClass().getName().compareTo(mVTodBookTripOrderRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33942h()).compareTo(Boolean.valueOf(mVTodBookTripOrderRequest.mo33942h()));
        if (compareTo2 != 0 || ((mo33942h() && (compareTo2 = this.rideId.compareTo(mVTodBookTripOrderRequest.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo33941g()).compareTo(Boolean.valueOf(mVTodBookTripOrderRequest.mo33941g()))) != 0 || ((mo33941g() && (compareTo2 = this.price.compareTo(mVTodBookTripOrderRequest.price)) != 0) || (compareTo2 = Boolean.valueOf(mo33940f()).compareTo(Boolean.valueOf(mVTodBookTripOrderRequest.mo33940f()))) != 0 || ((mo33940f() && (compareTo2 = this.paymentProvider.compareTo(mVTodBookTripOrderRequest.paymentProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo33944i()).compareTo(Boolean.valueOf(mVTodBookTripOrderRequest.mo33944i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo33944i() || (compareTo = this.subscriptionEnroll.compareTo(mVTodBookTripOrderRequest.subscriptionEnroll)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.tod.shuttles.MVTodBookTripOrderRequest
            r2 = 1
            if (r1 == 0) goto L_0x0092
            com.tranzmate.moovit.protocol.tod.shuttles.MVTodBookTripOrderRequest r6 = (com.tranzmate.moovit.protocol.tod.shuttles.MVTodBookTripOrderRequest) r6
            boolean r1 = r5.mo33942h()
            boolean r3 = r6.mo33942h()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0029
        L_0x0017:
            if (r1 == 0) goto L_0x0092
            if (r3 != 0) goto L_0x001d
            goto L_0x0092
        L_0x001d:
            java.lang.String r1 = r5.rideId
            java.lang.String r3 = r6.rideId
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0092
        L_0x0029:
            boolean r1 = r5.mo33941g()
            boolean r3 = r6.mo33941g()
            if (r1 != 0) goto L_0x0035
            if (r3 == 0) goto L_0x0045
        L_0x0035:
            if (r1 == 0) goto L_0x0092
            if (r3 != 0) goto L_0x003a
            goto L_0x0092
        L_0x003a:
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r1 = r5.price
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r3 = r6.price
            boolean r1 = r1.mo26102a(r3)
            if (r1 != 0) goto L_0x0045
            goto L_0x0092
        L_0x0045:
            boolean r1 = r5.mo33940f()
            boolean r3 = r6.mo33940f()
            if (r1 != 0) goto L_0x0051
            if (r3 == 0) goto L_0x0061
        L_0x0051:
            if (r1 == 0) goto L_0x0092
            if (r3 != 0) goto L_0x0056
            goto L_0x0092
        L_0x0056:
            com.tranzmate.moovit.protocol.payments.MVPaymentProvider r1 = r5.paymentProvider
            com.tranzmate.moovit.protocol.payments.MVPaymentProvider r3 = r6.paymentProvider
            boolean r1 = r1.mo30299m(r3)
            if (r1 != 0) goto L_0x0061
            goto L_0x0092
        L_0x0061:
            boolean r1 = r5.mo33944i()
            boolean r3 = r6.mo33944i()
            if (r1 != 0) goto L_0x006d
            if (r3 == 0) goto L_0x0091
        L_0x006d:
            if (r1 == 0) goto L_0x0092
            if (r3 != 0) goto L_0x0072
            goto L_0x0092
        L_0x0072:
            com.tranzmate.moovit.protocol.tod.shuttles.MVTodSubscriptionEnroll r1 = r5.subscriptionEnroll
            com.tranzmate.moovit.protocol.tod.shuttles.MVTodSubscriptionEnroll r6 = r6.subscriptionEnroll
            if (r6 == 0) goto L_0x008a
            F r3 = r1.setField_
            F r4 = r6.setField_
            if (r3 != r4) goto L_0x008d
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x008d
            r6 = 1
            goto L_0x008e
        L_0x008a:
            r1.getClass()
        L_0x008d:
            r6 = 0
        L_0x008e:
            if (r6 != 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r0 = 1
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tod.shuttles.MVTodBookTripOrderRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo33940f() {
        return this.paymentProvider != null;
    }

    /* renamed from: g */
    public final boolean mo33941g() {
        return this.price != null;
    }

    /* renamed from: h */
    public final boolean mo33942h() {
        return this.rideId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33944i() {
        return this.subscriptionEnroll != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodBookTripOrderRequest(", "rideId:");
        String str = this.rideId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo33941g()) {
            n.append(", ");
            n.append("price:");
            MVCurrencyAmount mVCurrencyAmount = this.price;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        if (mo33940f()) {
            n.append(", ");
            n.append("paymentProvider:");
            MVPaymentProvider mVPaymentProvider = this.paymentProvider;
            if (mVPaymentProvider == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentProvider);
            }
        }
        if (mo33944i()) {
            n.append(", ");
            n.append("subscriptionEnroll:");
            MVTodSubscriptionEnroll mVTodSubscriptionEnroll = this.subscriptionEnroll;
            if (mVTodSubscriptionEnroll == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodSubscriptionEnroll);
            }
        }
        n.append(")");
        return n.toString();
    }
}
