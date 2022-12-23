package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
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

public class MVPurchaseCartRequest implements TBase<MVPurchaseCartRequest, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseCartRequest> {

    /* renamed from: b */
    public static final C25113c f28788b = new C25113c("contextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28789c = new C25113c("totalPrice", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28790d = new C25113c("verificationInfo", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f28791e = new C25113c("paymentProvider", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f28792f = new C25113c("discountContextId", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f28793g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f28794h;
    public String contextId;
    public String discountContextId;
    private _Fields[] optionals = {_Fields.VERIFICATION_INFO, _Fields.PAYMENT_PROVIDER, _Fields.DISCOUNT_CONTEXT_ID};
    public MVPaymentProvider paymentProvider;
    public MVCurrencyAmount totalPrice;
    public MVPurchaseVerifacationInfo verificationInfo;

    public enum _Fields implements C25085c {
        CONTEXT_ID(1, "contextId"),
        TOTAL_PRICE(2, "totalPrice"),
        VERIFICATION_INFO(3, "verificationInfo"),
        PAYMENT_PROVIDER(4, "paymentProvider"),
        DISCOUNT_CONTEXT_ID(5, "discountContextId");
        
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
                return CONTEXT_ID;
            }
            if (i == 2) {
                return TOTAL_PRICE;
            }
            if (i == 3) {
                return VERIFICATION_INFO;
            }
            if (i == 4) {
                return PAYMENT_PROVIDER;
            }
            if (i != 5) {
                return null;
            }
            return DISCOUNT_CONTEXT_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartRequest$a */
    public static class C10860a extends C25239c<MVPurchaseCartRequest> {
        public C10860a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartRequest mVPurchaseCartRequest = (MVPurchaseCartRequest) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVPurchaseCartRequest.totalPrice;
            C25113c cVar = MVPurchaseCartRequest.f28788b;
            gVar.mo61687K();
            if (mVPurchaseCartRequest.contextId != null) {
                gVar.mo61711x(MVPurchaseCartRequest.f28788b);
                gVar.mo61686J(mVPurchaseCartRequest.contextId);
                gVar.mo61712y();
            }
            if (mVPurchaseCartRequest.totalPrice != null) {
                gVar.mo61711x(MVPurchaseCartRequest.f28789c);
                mVPurchaseCartRequest.totalPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseCartRequest.verificationInfo != null && mVPurchaseCartRequest.mo32519j()) {
                gVar.mo61711x(MVPurchaseCartRequest.f28790d);
                mVPurchaseCartRequest.verificationInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseCartRequest.paymentProvider != null && mVPurchaseCartRequest.mo32516h()) {
                gVar.mo61711x(MVPurchaseCartRequest.f28791e);
                mVPurchaseCartRequest.paymentProvider.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseCartRequest.discountContextId != null && mVPurchaseCartRequest.mo32515g()) {
                gVar.mo61711x(MVPurchaseCartRequest.f28792f);
                gVar.mo61686J(mVPurchaseCartRequest.discountContextId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartRequest mVPurchaseCartRequest = (MVPurchaseCartRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVPurchaseCartRequest.totalPrice;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVPurchaseCartRequest.discountContextId = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                                mVPurchaseCartRequest.paymentProvider = mVPaymentProvider;
                                mVPaymentProvider.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVPurchaseVerifacationInfo mVPurchaseVerifacationInfo = new MVPurchaseVerifacationInfo();
                            mVPurchaseCartRequest.verificationInfo = mVPurchaseVerifacationInfo;
                            mVPurchaseVerifacationInfo.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                        mVPurchaseCartRequest.totalPrice = mVCurrencyAmount2;
                        mVCurrencyAmount2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPurchaseCartRequest.contextId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartRequest$b */
    public static class C10861b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10860a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartRequest$c */
    public static class C10862c extends C25240d<MVPurchaseCartRequest> {
        public C10862c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartRequest mVPurchaseCartRequest = (MVPurchaseCartRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseCartRequest.mo32514f()) {
                bitSet.set(0);
            }
            if (mVPurchaseCartRequest.mo32518i()) {
                bitSet.set(1);
            }
            if (mVPurchaseCartRequest.mo32519j()) {
                bitSet.set(2);
            }
            if (mVPurchaseCartRequest.mo32516h()) {
                bitSet.set(3);
            }
            if (mVPurchaseCartRequest.mo32515g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPurchaseCartRequest.mo32514f()) {
                jVar.mo61686J(mVPurchaseCartRequest.contextId);
            }
            if (mVPurchaseCartRequest.mo32518i()) {
                mVPurchaseCartRequest.totalPrice.mo25202X0(jVar);
            }
            if (mVPurchaseCartRequest.mo32519j()) {
                mVPurchaseCartRequest.verificationInfo.mo25202X0(jVar);
            }
            if (mVPurchaseCartRequest.mo32516h()) {
                mVPurchaseCartRequest.paymentProvider.mo25202X0(jVar);
            }
            if (mVPurchaseCartRequest.mo32515g()) {
                jVar.mo61686J(mVPurchaseCartRequest.discountContextId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartRequest mVPurchaseCartRequest = (MVPurchaseCartRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVPurchaseCartRequest.contextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPurchaseCartRequest.totalPrice = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVPurchaseVerifacationInfo mVPurchaseVerifacationInfo = new MVPurchaseVerifacationInfo();
                mVPurchaseCartRequest.verificationInfo = mVPurchaseVerifacationInfo;
                mVPurchaseVerifacationInfo.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                mVPurchaseCartRequest.paymentProvider = mVPaymentProvider;
                mVPaymentProvider.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVPurchaseCartRequest.discountContextId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartRequest$d */
    public static class C10863d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10862c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseCartRequest");
        HashMap hashMap = new HashMap();
        f28793g = hashMap;
        hashMap.put(C25239c.class, new C10861b());
        hashMap.put(C25240d.class, new C10863d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT_ID, new FieldMetaData("contextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TOTAL_PRICE, new FieldMetaData("totalPrice", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.VERIFICATION_INFO, new FieldMetaData("verificationInfo", (byte) 2, new StructMetaData(MVPurchaseVerifacationInfo.class)));
        enumMap.put(_Fields.PAYMENT_PROVIDER, new FieldMetaData("paymentProvider", (byte) 2, new StructMetaData(MVPaymentProvider.class)));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28794h = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseCartRequest.class, unmodifiableMap);
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
        ((C25238b) f28793g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28793g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseCartRequest mVPurchaseCartRequest = (MVPurchaseCartRequest) obj;
        if (!getClass().equals(mVPurchaseCartRequest.getClass())) {
            return getClass().getName().compareTo(mVPurchaseCartRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32514f()).compareTo(Boolean.valueOf(mVPurchaseCartRequest.mo32514f()));
        if (compareTo2 != 0 || ((mo32514f() && (compareTo2 = this.contextId.compareTo(mVPurchaseCartRequest.contextId)) != 0) || (compareTo2 = Boolean.valueOf(mo32518i()).compareTo(Boolean.valueOf(mVPurchaseCartRequest.mo32518i()))) != 0 || ((mo32518i() && (compareTo2 = this.totalPrice.compareTo(mVPurchaseCartRequest.totalPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo32519j()).compareTo(Boolean.valueOf(mVPurchaseCartRequest.mo32519j()))) != 0 || ((mo32519j() && (compareTo2 = this.verificationInfo.compareTo(mVPurchaseCartRequest.verificationInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo32516h()).compareTo(Boolean.valueOf(mVPurchaseCartRequest.mo32516h()))) != 0 || ((mo32516h() && (compareTo2 = this.paymentProvider.compareTo(mVPurchaseCartRequest.paymentProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo32515g()).compareTo(Boolean.valueOf(mVPurchaseCartRequest.mo32515g()))) != 0))))) {
            return compareTo2;
        }
        if (!mo32515g() || (compareTo = this.discountContextId.compareTo(mVPurchaseCartRequest.discountContextId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseCartRequest)) {
            return false;
        }
        MVPurchaseCartRequest mVPurchaseCartRequest = (MVPurchaseCartRequest) obj;
        boolean f = mo32514f();
        boolean f2 = mVPurchaseCartRequest.mo32514f();
        if ((f || f2) && (!f || !f2 || !this.contextId.equals(mVPurchaseCartRequest.contextId))) {
            return false;
        }
        boolean i = mo32518i();
        boolean i2 = mVPurchaseCartRequest.mo32518i();
        if ((i || i2) && (!i || !i2 || !this.totalPrice.mo26102a(mVPurchaseCartRequest.totalPrice))) {
            return false;
        }
        boolean j = mo32519j();
        boolean j2 = mVPurchaseCartRequest.mo32519j();
        if ((j || j2) && (!j || !j2 || !this.verificationInfo.mo32924l(mVPurchaseCartRequest.verificationInfo))) {
            return false;
        }
        boolean h = mo32516h();
        boolean h2 = mVPurchaseCartRequest.mo32516h();
        if ((h || h2) && (!h || !h2 || !this.paymentProvider.mo30299m(mVPurchaseCartRequest.paymentProvider))) {
            return false;
        }
        boolean g = mo32515g();
        boolean g2 = mVPurchaseCartRequest.mo32515g();
        if ((g || g2) && (!g || !g2 || !this.discountContextId.equals(mVPurchaseCartRequest.discountContextId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32514f() {
        return this.contextId != null;
    }

    /* renamed from: g */
    public final boolean mo32515g() {
        return this.discountContextId != null;
    }

    /* renamed from: h */
    public final boolean mo32516h() {
        return this.paymentProvider != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32518i() {
        return this.totalPrice != null;
    }

    /* renamed from: j */
    public final boolean mo32519j() {
        return this.verificationInfo != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseCartRequest(", "contextId:");
        String str = this.contextId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("totalPrice:");
        MVCurrencyAmount mVCurrencyAmount = this.totalPrice;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        if (mo32519j()) {
            n.append(", ");
            n.append("verificationInfo:");
            MVPurchaseVerifacationInfo mVPurchaseVerifacationInfo = this.verificationInfo;
            if (mVPurchaseVerifacationInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPurchaseVerifacationInfo);
            }
        }
        if (mo32516h()) {
            n.append(", ");
            n.append("paymentProvider:");
            MVPaymentProvider mVPaymentProvider = this.paymentProvider;
            if (mVPaymentProvider == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentProvider);
            }
        }
        if (mo32515g()) {
            n.append(", ");
            n.append("discountContextId:");
            String str2 = this.discountContextId;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
