package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
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

public class MVDepositInstructions implements TBase<MVDepositInstructions, _Fields>, Serializable, Cloneable, Comparable<MVDepositInstructions> {

    /* renamed from: b */
    public static final C25113c f27229b = new C25113c("depositAmount", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27230c = new C25113c("depositPaymentMethods", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f27231d = new C25113c("creditCardInstructions", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27232e = new C25113c("isCvvRequired", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f27233f = new C25113c("paymentContext", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f27234g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27235h;
    private byte __isset_bitfield = 0;
    public MVCreditCardInstructions creditCardInstructions;
    public MVCurrencyAmount depositAmount;
    public List<MVPaymentMethodId> depositPaymentMethods;
    public boolean isCvvRequired;
    public String paymentContext;

    public enum _Fields implements C25085c {
        DEPOSIT_AMOUNT(1, "depositAmount"),
        DEPOSIT_PAYMENT_METHODS(2, "depositPaymentMethods"),
        CREDIT_CARD_INSTRUCTIONS(3, "creditCardInstructions"),
        IS_CVV_REQUIRED(4, "isCvvRequired"),
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
                return DEPOSIT_AMOUNT;
            }
            if (i == 2) {
                return DEPOSIT_PAYMENT_METHODS;
            }
            if (i == 3) {
                return CREDIT_CARD_INSTRUCTIONS;
            }
            if (i == 4) {
                return IS_CVV_REQUIRED;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVDepositInstructions$a */
    public static class C9712a extends C25239c<MVDepositInstructions> {
        public C9712a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDepositInstructions mVDepositInstructions = (MVDepositInstructions) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVDepositInstructions.depositAmount;
            MVCreditCardInstructions mVCreditCardInstructions = mVDepositInstructions.creditCardInstructions;
            if (mVCreditCardInstructions != null) {
                mVCreditCardInstructions.mo29771h();
            }
            C25113c cVar = MVDepositInstructions.f27229b;
            gVar.mo61687K();
            if (mVDepositInstructions.depositAmount != null) {
                gVar.mo61711x(MVDepositInstructions.f27229b);
                mVDepositInstructions.depositAmount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDepositInstructions.depositPaymentMethods != null) {
                gVar.mo61711x(MVDepositInstructions.f27230c);
                gVar.mo61680D(new C25119e((byte) 12, mVDepositInstructions.depositPaymentMethods.size()));
                for (MVPaymentMethodId X0 : mVDepositInstructions.depositPaymentMethods) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVDepositInstructions.creditCardInstructions != null) {
                gVar.mo61711x(MVDepositInstructions.f27231d);
                mVDepositInstructions.creditCardInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDepositInstructions.f27232e);
            gVar.mo61708u(mVDepositInstructions.isCvvRequired);
            gVar.mo61712y();
            if (mVDepositInstructions.paymentContext != null) {
                gVar.mo61711x(MVDepositInstructions.f27233f);
                gVar.mo61686J(mVDepositInstructions.paymentContext);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDepositInstructions mVDepositInstructions = (MVDepositInstructions) tBase;
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
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVDepositInstructions.paymentContext = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 2) {
                                mVDepositInstructions.isCvvRequired = gVar.mo61690c();
                                mVDepositInstructions.mo29808k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVCreditCardInstructions mVCreditCardInstructions = new MVCreditCardInstructions();
                            mVDepositInstructions.creditCardInstructions = mVCreditCardInstructions;
                            mVCreditCardInstructions.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVDepositInstructions.depositPaymentMethods = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVPaymentMethodId mVPaymentMethodId = new MVPaymentMethodId();
                            mVPaymentMethodId.mo25201C1(gVar);
                            mVDepositInstructions.depositPaymentMethods.add(mVPaymentMethodId);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                    mVDepositInstructions.depositAmount = mVCurrencyAmount;
                    mVCurrencyAmount.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVCurrencyAmount mVCurrencyAmount2 = mVDepositInstructions.depositAmount;
            MVCreditCardInstructions mVCreditCardInstructions2 = mVDepositInstructions.creditCardInstructions;
            if (mVCreditCardInstructions2 != null) {
                mVCreditCardInstructions2.mo29771h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVDepositInstructions$b */
    public static class C9713b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9712a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVDepositInstructions$c */
    public static class C9714c extends C25240d<MVDepositInstructions> {
        public C9714c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDepositInstructions mVDepositInstructions = (MVDepositInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDepositInstructions.mo29803g()) {
                bitSet.set(0);
            }
            if (mVDepositInstructions.mo29804h()) {
                bitSet.set(1);
            }
            if (mVDepositInstructions.mo29802f()) {
                bitSet.set(2);
            }
            if (mVDepositInstructions.mo29806i()) {
                bitSet.set(3);
            }
            if (mVDepositInstructions.mo29807j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVDepositInstructions.mo29803g()) {
                mVDepositInstructions.depositAmount.mo25202X0(jVar);
            }
            if (mVDepositInstructions.mo29804h()) {
                jVar.mo61678B(mVDepositInstructions.depositPaymentMethods.size());
                for (MVPaymentMethodId X0 : mVDepositInstructions.depositPaymentMethods) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVDepositInstructions.mo29802f()) {
                mVDepositInstructions.creditCardInstructions.mo25202X0(jVar);
            }
            if (mVDepositInstructions.mo29806i()) {
                jVar.mo61708u(mVDepositInstructions.isCvvRequired);
            }
            if (mVDepositInstructions.mo29807j()) {
                jVar.mo61686J(mVDepositInstructions.paymentContext);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDepositInstructions mVDepositInstructions = (MVDepositInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVDepositInstructions.depositAmount = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVDepositInstructions.depositPaymentMethods = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPaymentMethodId mVPaymentMethodId = new MVPaymentMethodId();
                    mVPaymentMethodId.mo25201C1(jVar);
                    mVDepositInstructions.depositPaymentMethods.add(mVPaymentMethodId);
                }
            }
            if (T.get(2)) {
                MVCreditCardInstructions mVCreditCardInstructions = new MVCreditCardInstructions();
                mVDepositInstructions.creditCardInstructions = mVCreditCardInstructions;
                mVCreditCardInstructions.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVDepositInstructions.isCvvRequired = jVar.mo61690c();
                mVDepositInstructions.mo29808k();
            }
            if (T.get(4)) {
                mVDepositInstructions.paymentContext = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVDepositInstructions$d */
    public static class C9715d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9714c(0);
        }
    }

    static {
        new C17394d0("MVDepositInstructions");
        HashMap hashMap = new HashMap();
        f27234g = hashMap;
        hashMap.put(C25239c.class, new C9713b());
        hashMap.put(C25240d.class, new C9715d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DEPOSIT_AMOUNT, new FieldMetaData("depositAmount", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.DEPOSIT_PAYMENT_METHODS, new FieldMetaData("depositPaymentMethods", (byte) 3, new ListMetaData(new StructMetaData(MVPaymentMethodId.class))));
        enumMap.put(_Fields.CREDIT_CARD_INSTRUCTIONS, new FieldMetaData("creditCardInstructions", (byte) 3, new StructMetaData(MVCreditCardInstructions.class)));
        enumMap.put(_Fields.IS_CVV_REQUIRED, new FieldMetaData("isCvvRequired", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27235h = unmodifiableMap;
        FieldMetaData.m61947a(MVDepositInstructions.class, unmodifiableMap);
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
        ((C25238b) f27234g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27234g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29799a(MVDepositInstructions mVDepositInstructions) {
        if (mVDepositInstructions == null) {
            return false;
        }
        boolean g = mo29803g();
        boolean g2 = mVDepositInstructions.mo29803g();
        if ((g || g2) && (!g || !g2 || !this.depositAmount.mo26102a(mVDepositInstructions.depositAmount))) {
            return false;
        }
        boolean h = mo29804h();
        boolean h2 = mVDepositInstructions.mo29804h();
        if ((h || h2) && (!h || !h2 || !this.depositPaymentMethods.equals(mVDepositInstructions.depositPaymentMethods))) {
            return false;
        }
        boolean f = mo29802f();
        boolean f2 = mVDepositInstructions.mo29802f();
        if (((f || f2) && (!f || !f2 || !this.creditCardInstructions.mo29766a(mVDepositInstructions.creditCardInstructions))) || this.isCvvRequired != mVDepositInstructions.isCvvRequired) {
            return false;
        }
        boolean j = mo29807j();
        boolean j2 = mVDepositInstructions.mo29807j();
        if (!j && !j2) {
            return true;
        }
        if (!j || !j2 || !this.paymentContext.equals(mVDepositInstructions.paymentContext)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDepositInstructions mVDepositInstructions = (MVDepositInstructions) obj;
        if (!getClass().equals(mVDepositInstructions.getClass())) {
            return getClass().getName().compareTo(mVDepositInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29803g()).compareTo(Boolean.valueOf(mVDepositInstructions.mo29803g()));
        if (compareTo2 != 0 || ((mo29803g() && (compareTo2 = this.depositAmount.compareTo(mVDepositInstructions.depositAmount)) != 0) || (compareTo2 = Boolean.valueOf(mo29804h()).compareTo(Boolean.valueOf(mVDepositInstructions.mo29804h()))) != 0 || ((mo29804h() && (compareTo2 = C25082a.m62844h(this.depositPaymentMethods, mVDepositInstructions.depositPaymentMethods)) != 0) || (compareTo2 = Boolean.valueOf(mo29802f()).compareTo(Boolean.valueOf(mVDepositInstructions.mo29802f()))) != 0 || ((mo29802f() && (compareTo2 = this.creditCardInstructions.compareTo(mVDepositInstructions.creditCardInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo29806i()).compareTo(Boolean.valueOf(mVDepositInstructions.mo29806i()))) != 0 || ((mo29806i() && (compareTo2 = C25082a.m62848l(this.isCvvRequired, mVDepositInstructions.isCvvRequired)) != 0) || (compareTo2 = Boolean.valueOf(mo29807j()).compareTo(Boolean.valueOf(mVDepositInstructions.mo29807j()))) != 0))))) {
            return compareTo2;
        }
        if (!mo29807j() || (compareTo = this.paymentContext.compareTo(mVDepositInstructions.paymentContext)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVDepositInstructions)) {
            return mo29799a((MVDepositInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29802f() {
        return this.creditCardInstructions != null;
    }

    /* renamed from: g */
    public final boolean mo29803g() {
        return this.depositAmount != null;
    }

    /* renamed from: h */
    public final boolean mo29804h() {
        return this.depositPaymentMethods != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29806i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo29807j() {
        return this.paymentContext != null;
    }

    /* renamed from: k */
    public final void mo29808k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDepositInstructions(", "depositAmount:");
        MVCurrencyAmount mVCurrencyAmount = this.depositAmount;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(", ");
        n.append("depositPaymentMethods:");
        List<MVPaymentMethodId> list = this.depositPaymentMethods;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("creditCardInstructions:");
        MVCreditCardInstructions mVCreditCardInstructions = this.creditCardInstructions;
        if (mVCreditCardInstructions == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCreditCardInstructions);
        }
        n.append(", ");
        n.append("isCvvRequired:");
        C13555b.m33977q(n, this.isCvvRequired, ", ", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
