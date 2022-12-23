package com.tranzmate.moovit.protocol.ticketingV2;

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

public class MVExternalPaymentV2Request implements TBase<MVExternalPaymentV2Request, _Fields>, Serializable, Cloneable, Comparable<MVExternalPaymentV2Request> {

    /* renamed from: b */
    public static final C25113c f28709b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28710c = new C25113c("params", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28711d = new C25113c("usedSecondaryPaymentMethod", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f28712e = new C25113c("paymentProvider", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f28713f = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f28714g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f28715h;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.PAYMENT_PROVIDER};
    public MVBuyParams params;
    public String paymentContext;
    public MVPaymentProvider paymentProvider;
    public MVCurrencyAmount price;
    public boolean usedSecondaryPaymentMethod;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        PARAMS(2, "params"),
        USED_SECONDARY_PAYMENT_METHOD(3, "usedSecondaryPaymentMethod"),
        PAYMENT_PROVIDER(4, "paymentProvider"),
        PRICE(5, InAppPurchaseMetaData.KEY_PRICE);
        
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
                return PAYMENT_CONTEXT;
            }
            if (i == 2) {
                return PARAMS;
            }
            if (i == 3) {
                return USED_SECONDARY_PAYMENT_METHOD;
            }
            if (i == 4) {
                return PAYMENT_PROVIDER;
            }
            if (i != 5) {
                return null;
            }
            return PRICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Request$a */
    public static class C10802a extends C25239c<MVExternalPaymentV2Request> {
        public C10802a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalPaymentV2Request mVExternalPaymentV2Request = (MVExternalPaymentV2Request) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVExternalPaymentV2Request.price;
            C25113c cVar = MVExternalPaymentV2Request.f28709b;
            gVar.mo61687K();
            if (mVExternalPaymentV2Request.paymentContext != null) {
                gVar.mo61711x(MVExternalPaymentV2Request.f28709b);
                gVar.mo61686J(mVExternalPaymentV2Request.paymentContext);
                gVar.mo61712y();
            }
            if (mVExternalPaymentV2Request.params != null) {
                gVar.mo61711x(MVExternalPaymentV2Request.f28710c);
                mVExternalPaymentV2Request.params.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVExternalPaymentV2Request.f28711d);
            gVar.mo61708u(mVExternalPaymentV2Request.usedSecondaryPaymentMethod);
            gVar.mo61712y();
            if (mVExternalPaymentV2Request.paymentProvider != null && mVExternalPaymentV2Request.mo32389h()) {
                gVar.mo61711x(MVExternalPaymentV2Request.f28712e);
                mVExternalPaymentV2Request.paymentProvider.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVExternalPaymentV2Request.price != null) {
                gVar.mo61711x(MVExternalPaymentV2Request.f28713f);
                mVExternalPaymentV2Request.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalPaymentV2Request mVExternalPaymentV2Request = (MVExternalPaymentV2Request) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVExternalPaymentV2Request.price;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                                    mVExternalPaymentV2Request.price = mVCurrencyAmount2;
                                    mVCurrencyAmount2.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                                mVExternalPaymentV2Request.paymentProvider = mVPaymentProvider;
                                mVPaymentProvider.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVExternalPaymentV2Request.usedSecondaryPaymentMethod = gVar.mo61690c();
                            mVExternalPaymentV2Request.mo32393k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVBuyParams mVBuyParams = new MVBuyParams();
                        mVExternalPaymentV2Request.params = mVBuyParams;
                        mVBuyParams.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVExternalPaymentV2Request.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Request$b */
    public static class C10803b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10802a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Request$c */
    public static class C10804c extends C25240d<MVExternalPaymentV2Request> {
        public C10804c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalPaymentV2Request mVExternalPaymentV2Request = (MVExternalPaymentV2Request) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVExternalPaymentV2Request.mo32388g()) {
                bitSet.set(0);
            }
            if (mVExternalPaymentV2Request.mo32387f()) {
                bitSet.set(1);
            }
            if (mVExternalPaymentV2Request.mo32392j()) {
                bitSet.set(2);
            }
            if (mVExternalPaymentV2Request.mo32389h()) {
                bitSet.set(3);
            }
            if (mVExternalPaymentV2Request.mo32391i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVExternalPaymentV2Request.mo32388g()) {
                jVar.mo61686J(mVExternalPaymentV2Request.paymentContext);
            }
            if (mVExternalPaymentV2Request.mo32387f()) {
                mVExternalPaymentV2Request.params.mo25202X0(jVar);
            }
            if (mVExternalPaymentV2Request.mo32392j()) {
                jVar.mo61708u(mVExternalPaymentV2Request.usedSecondaryPaymentMethod);
            }
            if (mVExternalPaymentV2Request.mo32389h()) {
                mVExternalPaymentV2Request.paymentProvider.mo25202X0(jVar);
            }
            if (mVExternalPaymentV2Request.mo32391i()) {
                mVExternalPaymentV2Request.price.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalPaymentV2Request mVExternalPaymentV2Request = (MVExternalPaymentV2Request) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVExternalPaymentV2Request.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVBuyParams mVBuyParams = new MVBuyParams();
                mVExternalPaymentV2Request.params = mVBuyParams;
                mVBuyParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVExternalPaymentV2Request.usedSecondaryPaymentMethod = jVar.mo61690c();
                mVExternalPaymentV2Request.mo32393k();
            }
            if (T.get(3)) {
                MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                mVExternalPaymentV2Request.paymentProvider = mVPaymentProvider;
                mVPaymentProvider.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVExternalPaymentV2Request.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Request$d */
    public static class C10805d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10804c(0);
        }
    }

    static {
        new C17394d0("MVExternalPaymentV2Request");
        HashMap hashMap = new HashMap();
        f28714g = hashMap;
        hashMap.put(C25239c.class, new C10803b());
        hashMap.put(C25240d.class, new C10805d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PARAMS, new FieldMetaData("params", (byte) 3, new StructMetaData(MVBuyParams.class)));
        enumMap.put(_Fields.USED_SECONDARY_PAYMENT_METHOD, new FieldMetaData("usedSecondaryPaymentMethod", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PAYMENT_PROVIDER, new FieldMetaData("paymentProvider", (byte) 2, new StructMetaData(MVPaymentProvider.class)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28715h = unmodifiableMap;
        FieldMetaData.m61947a(MVExternalPaymentV2Request.class, unmodifiableMap);
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
        ((C25238b) f28714g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28714g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVExternalPaymentV2Request mVExternalPaymentV2Request = (MVExternalPaymentV2Request) obj;
        if (!getClass().equals(mVExternalPaymentV2Request.getClass())) {
            return getClass().getName().compareTo(mVExternalPaymentV2Request.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32388g()).compareTo(Boolean.valueOf(mVExternalPaymentV2Request.mo32388g()));
        if (compareTo2 != 0 || ((mo32388g() && (compareTo2 = this.paymentContext.compareTo(mVExternalPaymentV2Request.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo32387f()).compareTo(Boolean.valueOf(mVExternalPaymentV2Request.mo32387f()))) != 0 || ((mo32387f() && (compareTo2 = this.params.compareTo(mVExternalPaymentV2Request.params)) != 0) || (compareTo2 = Boolean.valueOf(mo32392j()).compareTo(Boolean.valueOf(mVExternalPaymentV2Request.mo32392j()))) != 0 || ((mo32392j() && (compareTo2 = C25082a.m62848l(this.usedSecondaryPaymentMethod, mVExternalPaymentV2Request.usedSecondaryPaymentMethod)) != 0) || (compareTo2 = Boolean.valueOf(mo32389h()).compareTo(Boolean.valueOf(mVExternalPaymentV2Request.mo32389h()))) != 0 || ((mo32389h() && (compareTo2 = this.paymentProvider.compareTo(mVExternalPaymentV2Request.paymentProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo32391i()).compareTo(Boolean.valueOf(mVExternalPaymentV2Request.mo32391i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo32391i() || (compareTo = this.price.compareTo(mVExternalPaymentV2Request.price)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Request
            r2 = 1
            if (r1 == 0) goto L_0x0099
            com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Request r7 = (com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Request) r7
            boolean r1 = r6.mo32388g()
            boolean r3 = r7.mo32388g()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0029
        L_0x0017:
            if (r1 == 0) goto L_0x0099
            if (r3 != 0) goto L_0x001d
            goto L_0x0099
        L_0x001d:
            java.lang.String r1 = r6.paymentContext
            java.lang.String r3 = r7.paymentContext
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0099
        L_0x0029:
            boolean r1 = r6.mo32387f()
            boolean r3 = r7.mo32387f()
            if (r1 != 0) goto L_0x0035
            if (r3 == 0) goto L_0x0059
        L_0x0035:
            if (r1 == 0) goto L_0x0099
            if (r3 != 0) goto L_0x003a
            goto L_0x0099
        L_0x003a:
            com.tranzmate.moovit.protocol.ticketingV2.MVBuyParams r1 = r6.params
            com.tranzmate.moovit.protocol.ticketingV2.MVBuyParams r3 = r7.params
            if (r3 == 0) goto L_0x0052
            F r4 = r1.setField_
            F r5 = r3.setField_
            if (r4 != r5) goto L_0x0055
            java.lang.Object r1 = r1.value_
            java.lang.Object r3 = r3.value_
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0055
            r1 = 1
            goto L_0x0056
        L_0x0052:
            r1.getClass()
        L_0x0055:
            r1 = 0
        L_0x0056:
            if (r1 != 0) goto L_0x0059
            goto L_0x0099
        L_0x0059:
            boolean r1 = r6.usedSecondaryPaymentMethod
            boolean r3 = r7.usedSecondaryPaymentMethod
            if (r1 == r3) goto L_0x0060
            goto L_0x0099
        L_0x0060:
            boolean r1 = r6.mo32389h()
            boolean r3 = r7.mo32389h()
            if (r1 != 0) goto L_0x006c
            if (r3 == 0) goto L_0x007c
        L_0x006c:
            if (r1 == 0) goto L_0x0099
            if (r3 != 0) goto L_0x0071
            goto L_0x0099
        L_0x0071:
            com.tranzmate.moovit.protocol.payments.MVPaymentProvider r1 = r6.paymentProvider
            com.tranzmate.moovit.protocol.payments.MVPaymentProvider r3 = r7.paymentProvider
            boolean r1 = r1.mo30299m(r3)
            if (r1 != 0) goto L_0x007c
            goto L_0x0099
        L_0x007c:
            boolean r1 = r6.mo32391i()
            boolean r3 = r7.mo32391i()
            if (r1 != 0) goto L_0x0088
            if (r3 == 0) goto L_0x0098
        L_0x0088:
            if (r1 == 0) goto L_0x0099
            if (r3 != 0) goto L_0x008d
            goto L_0x0099
        L_0x008d:
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r1 = r6.price
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r7 = r7.price
            boolean r7 = r1.mo26102a(r7)
            if (r7 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r0 = 1
        L_0x0099:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Request.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo32387f() {
        return this.params != null;
    }

    /* renamed from: g */
    public final boolean mo32388g() {
        return this.paymentContext != null;
    }

    /* renamed from: h */
    public final boolean mo32389h() {
        return this.paymentProvider != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32391i() {
        return this.price != null;
    }

    /* renamed from: j */
    public final boolean mo32392j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo32393k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVExternalPaymentV2Request(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("params:");
        MVBuyParams mVBuyParams = this.params;
        if (mVBuyParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVBuyParams);
        }
        n.append(", ");
        n.append("usedSecondaryPaymentMethod:");
        n.append(this.usedSecondaryPaymentMethod);
        if (mo32389h()) {
            n.append(", ");
            n.append("paymentProvider:");
            MVPaymentProvider mVPaymentProvider = this.paymentProvider;
            if (mVPaymentProvider == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentProvider);
            }
        }
        n.append(", ");
        n.append("price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(")");
        return n.toString();
    }
}
