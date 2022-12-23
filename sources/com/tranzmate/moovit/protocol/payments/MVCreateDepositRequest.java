package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
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

public class MVCreateDepositRequest implements TBase<MVCreateDepositRequest, _Fields>, Serializable, Cloneable, Comparable<MVCreateDepositRequest> {

    /* renamed from: b */
    public static final C25113c f27201b = new C25113c("paymentMethodId", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27202c = new C25113c("cvv", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27203d = new C25113c("returnUrls", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27204e = new C25113c("depositAmount", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f27205f = new C25113c("paymentContext", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f27206g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27207h;
    public String cvv;
    public MVCurrencyAmount depositAmount;
    private _Fields[] optionals = {_Fields.CVV};
    public String paymentContext;
    public MVPaymentMethodId paymentMethodId;
    public MVTokenizeReturnUrls returnUrls;

    public enum _Fields implements C25085c {
        PAYMENT_METHOD_ID(1, "paymentMethodId"),
        CVV(2, "cvv"),
        RETURN_URLS(3, "returnUrls"),
        DEPOSIT_AMOUNT(4, "depositAmount"),
        PAYMENT_CONTEXT(5, "paymentContext");
        
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
                return PAYMENT_METHOD_ID;
            }
            if (i == 2) {
                return CVV;
            }
            if (i == 3) {
                return RETURN_URLS;
            }
            if (i == 4) {
                return DEPOSIT_AMOUNT;
            }
            if (i != 5) {
                return null;
            }
            return PAYMENT_CONTEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCreateDepositRequest$a */
    public static class C9684a extends C25239c<MVCreateDepositRequest> {
        public C9684a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreateDepositRequest mVCreateDepositRequest = (MVCreateDepositRequest) tBase;
            MVPaymentMethodId mVPaymentMethodId = mVCreateDepositRequest.paymentMethodId;
            C25113c cVar = MVCreateDepositRequest.f27201b;
            gVar.mo61687K();
            if (mVCreateDepositRequest.paymentMethodId != null) {
                gVar.mo61711x(MVCreateDepositRequest.f27201b);
                mVCreateDepositRequest.paymentMethodId.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCreateDepositRequest.cvv != null && mVCreateDepositRequest.mo29750f()) {
                gVar.mo61711x(MVCreateDepositRequest.f27202c);
                gVar.mo61686J(mVCreateDepositRequest.cvv);
                gVar.mo61712y();
            }
            if (mVCreateDepositRequest.returnUrls != null) {
                gVar.mo61711x(MVCreateDepositRequest.f27203d);
                mVCreateDepositRequest.returnUrls.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCreateDepositRequest.depositAmount != null) {
                gVar.mo61711x(MVCreateDepositRequest.f27204e);
                mVCreateDepositRequest.depositAmount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCreateDepositRequest.paymentContext != null) {
                gVar.mo61711x(MVCreateDepositRequest.f27205f);
                gVar.mo61686J(mVCreateDepositRequest.paymentContext);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreateDepositRequest mVCreateDepositRequest = (MVCreateDepositRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPaymentMethodId mVPaymentMethodId = mVCreateDepositRequest.paymentMethodId;
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
                                    mVCreateDepositRequest.paymentContext = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                                mVCreateDepositRequest.depositAmount = mVCurrencyAmount;
                                mVCurrencyAmount.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls();
                            mVCreateDepositRequest.returnUrls = mVTokenizeReturnUrls;
                            mVTokenizeReturnUrls.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVCreateDepositRequest.cvv = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVPaymentMethodId mVPaymentMethodId2 = new MVPaymentMethodId();
                    mVCreateDepositRequest.paymentMethodId = mVPaymentMethodId2;
                    mVPaymentMethodId2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCreateDepositRequest$b */
    public static class C9685b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9684a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCreateDepositRequest$c */
    public static class C9686c extends C25240d<MVCreateDepositRequest> {
        public C9686c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreateDepositRequest mVCreateDepositRequest = (MVCreateDepositRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCreateDepositRequest.mo29754i()) {
                bitSet.set(0);
            }
            if (mVCreateDepositRequest.mo29750f()) {
                bitSet.set(1);
            }
            if (mVCreateDepositRequest.mo29755j()) {
                bitSet.set(2);
            }
            if (mVCreateDepositRequest.mo29751g()) {
                bitSet.set(3);
            }
            if (mVCreateDepositRequest.mo29752h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVCreateDepositRequest.mo29754i()) {
                mVCreateDepositRequest.paymentMethodId.mo25202X0(jVar);
            }
            if (mVCreateDepositRequest.mo29750f()) {
                jVar.mo61686J(mVCreateDepositRequest.cvv);
            }
            if (mVCreateDepositRequest.mo29755j()) {
                mVCreateDepositRequest.returnUrls.mo25202X0(jVar);
            }
            if (mVCreateDepositRequest.mo29751g()) {
                mVCreateDepositRequest.depositAmount.mo25202X0(jVar);
            }
            if (mVCreateDepositRequest.mo29752h()) {
                jVar.mo61686J(mVCreateDepositRequest.paymentContext);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreateDepositRequest mVCreateDepositRequest = (MVCreateDepositRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVPaymentMethodId mVPaymentMethodId = new MVPaymentMethodId();
                mVCreateDepositRequest.paymentMethodId = mVPaymentMethodId;
                mVPaymentMethodId.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVCreateDepositRequest.cvv = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls();
                mVCreateDepositRequest.returnUrls = mVTokenizeReturnUrls;
                mVTokenizeReturnUrls.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVCreateDepositRequest.depositAmount = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVCreateDepositRequest.paymentContext = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCreateDepositRequest$d */
    public static class C9687d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9686c(0);
        }
    }

    static {
        new C17394d0("MVCreateDepositRequest");
        HashMap hashMap = new HashMap();
        f27206g = hashMap;
        hashMap.put(C25239c.class, new C9685b());
        hashMap.put(C25240d.class, new C9687d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_METHOD_ID, new FieldMetaData("paymentMethodId", (byte) 3, new StructMetaData(MVPaymentMethodId.class)));
        enumMap.put(_Fields.CVV, new FieldMetaData("cvv", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RETURN_URLS, new FieldMetaData("returnUrls", (byte) 3, new StructMetaData(MVTokenizeReturnUrls.class)));
        enumMap.put(_Fields.DEPOSIT_AMOUNT, new FieldMetaData("depositAmount", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27207h = unmodifiableMap;
        FieldMetaData.m61947a(MVCreateDepositRequest.class, unmodifiableMap);
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
        ((C25238b) f27206g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27206g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCreateDepositRequest mVCreateDepositRequest = (MVCreateDepositRequest) obj;
        if (!getClass().equals(mVCreateDepositRequest.getClass())) {
            return getClass().getName().compareTo(mVCreateDepositRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29754i()).compareTo(Boolean.valueOf(mVCreateDepositRequest.mo29754i()));
        if (compareTo2 != 0 || ((mo29754i() && (compareTo2 = this.paymentMethodId.compareTo(mVCreateDepositRequest.paymentMethodId)) != 0) || (compareTo2 = Boolean.valueOf(mo29750f()).compareTo(Boolean.valueOf(mVCreateDepositRequest.mo29750f()))) != 0 || ((mo29750f() && (compareTo2 = this.cvv.compareTo(mVCreateDepositRequest.cvv)) != 0) || (compareTo2 = Boolean.valueOf(mo29755j()).compareTo(Boolean.valueOf(mVCreateDepositRequest.mo29755j()))) != 0 || ((mo29755j() && (compareTo2 = this.returnUrls.compareTo(mVCreateDepositRequest.returnUrls)) != 0) || (compareTo2 = Boolean.valueOf(mo29751g()).compareTo(Boolean.valueOf(mVCreateDepositRequest.mo29751g()))) != 0 || ((mo29751g() && (compareTo2 = this.depositAmount.compareTo(mVCreateDepositRequest.depositAmount)) != 0) || (compareTo2 = Boolean.valueOf(mo29752h()).compareTo(Boolean.valueOf(mVCreateDepositRequest.mo29752h()))) != 0))))) {
            return compareTo2;
        }
        if (!mo29752h() || (compareTo = this.paymentContext.compareTo(mVCreateDepositRequest.paymentContext)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCreateDepositRequest)) {
            return false;
        }
        MVCreateDepositRequest mVCreateDepositRequest = (MVCreateDepositRequest) obj;
        boolean i = mo29754i();
        boolean i2 = mVCreateDepositRequest.mo29754i();
        if ((i || i2) && (!i || !i2 || !this.paymentMethodId.mo30243a(mVCreateDepositRequest.paymentMethodId))) {
            return false;
        }
        boolean f = mo29750f();
        boolean f2 = mVCreateDepositRequest.mo29750f();
        if ((f || f2) && (!f || !f2 || !this.cvv.equals(mVCreateDepositRequest.cvv))) {
            return false;
        }
        boolean j = mo29755j();
        boolean j2 = mVCreateDepositRequest.mo29755j();
        if ((j || j2) && (!j || !j2 || !this.returnUrls.mo30695a(mVCreateDepositRequest.returnUrls))) {
            return false;
        }
        boolean g = mo29751g();
        boolean g2 = mVCreateDepositRequest.mo29751g();
        if ((g || g2) && (!g || !g2 || !this.depositAmount.mo26102a(mVCreateDepositRequest.depositAmount))) {
            return false;
        }
        boolean h = mo29752h();
        boolean h2 = mVCreateDepositRequest.mo29752h();
        if ((h || h2) && (!h || !h2 || !this.paymentContext.equals(mVCreateDepositRequest.paymentContext))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29750f() {
        return this.cvv != null;
    }

    /* renamed from: g */
    public final boolean mo29751g() {
        return this.depositAmount != null;
    }

    /* renamed from: h */
    public final boolean mo29752h() {
        return this.paymentContext != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29754i() {
        return this.paymentMethodId != null;
    }

    /* renamed from: j */
    public final boolean mo29755j() {
        return this.returnUrls != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCreateDepositRequest(", "paymentMethodId:");
        MVPaymentMethodId mVPaymentMethodId = this.paymentMethodId;
        if (mVPaymentMethodId == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentMethodId);
        }
        if (mo29750f()) {
            n.append(", ");
            n.append("cvv:");
            String str = this.cvv;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("returnUrls:");
        MVTokenizeReturnUrls mVTokenizeReturnUrls = this.returnUrls;
        if (mVTokenizeReturnUrls == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTokenizeReturnUrls);
        }
        n.append(", ");
        n.append("depositAmount:");
        MVCurrencyAmount mVCurrencyAmount = this.depositAmount;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(", ");
        n.append("paymentContext:");
        String str2 = this.paymentContext;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
