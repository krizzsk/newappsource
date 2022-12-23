package com.tranzmate.moovit.protocol.payments;

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

public class MVPurchasePaymentMethods implements TBase<MVPurchasePaymentMethods, _Fields>, Serializable, Cloneable, Comparable<MVPurchasePaymentMethods> {

    /* renamed from: b */
    public static final C25113c f27661b = new C25113c("paymentMethods", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f27662c = new C25113c("creditCardInstructions", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27663d = new C25113c("paymentContext", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f27664e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27665f;
    public MVCreditCardInstructions creditCardInstructions;
    private _Fields[] optionals = {_Fields.CREDIT_CARD_INSTRUCTIONS, _Fields.PAYMENT_CONTEXT};
    public String paymentContext;
    public List<MVPaymentMethodInfo> paymentMethods;

    public enum _Fields implements C25085c {
        PAYMENT_METHODS(1, "paymentMethods"),
        CREDIT_CARD_INSTRUCTIONS(2, "creditCardInstructions"),
        PAYMENT_CONTEXT(3, "paymentContext");
        
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
                return PAYMENT_METHODS;
            }
            if (i == 2) {
                return CREDIT_CARD_INSTRUCTIONS;
            }
            if (i != 3) {
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPurchasePaymentMethods$a */
    public static class C10037a extends C25239c<MVPurchasePaymentMethods> {
        public C10037a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchasePaymentMethods mVPurchasePaymentMethods = (MVPurchasePaymentMethods) tBase;
            MVCreditCardInstructions mVCreditCardInstructions = mVPurchasePaymentMethods.creditCardInstructions;
            if (mVCreditCardInstructions != null) {
                mVCreditCardInstructions.mo29771h();
            }
            C25113c cVar = MVPurchasePaymentMethods.f27661b;
            gVar.mo61687K();
            if (mVPurchasePaymentMethods.paymentMethods != null) {
                gVar.mo61711x(MVPurchasePaymentMethods.f27661b);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchasePaymentMethods.paymentMethods.size()));
                for (MVPaymentMethodInfo X0 : mVPurchasePaymentMethods.paymentMethods) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchasePaymentMethods.creditCardInstructions != null && mVPurchasePaymentMethods.mo30529f()) {
                gVar.mo61711x(MVPurchasePaymentMethods.f27662c);
                mVPurchasePaymentMethods.creditCardInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchasePaymentMethods.paymentContext != null && mVPurchasePaymentMethods.mo30530g()) {
                gVar.mo61711x(MVPurchasePaymentMethods.f27663d);
                gVar.mo61686J(mVPurchasePaymentMethods.paymentContext);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchasePaymentMethods mVPurchasePaymentMethods = (MVPurchasePaymentMethods) tBase;
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
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVPurchasePaymentMethods.paymentContext = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCreditCardInstructions mVCreditCardInstructions = new MVCreditCardInstructions();
                        mVPurchasePaymentMethods.creditCardInstructions = mVCreditCardInstructions;
                        mVCreditCardInstructions.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVPurchasePaymentMethods.paymentMethods = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVPaymentMethodInfo mVPaymentMethodInfo = new MVPaymentMethodInfo();
                        mVPaymentMethodInfo.mo25201C1(gVar);
                        mVPurchasePaymentMethods.paymentMethods.add(mVPaymentMethodInfo);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVCreditCardInstructions mVCreditCardInstructions2 = mVPurchasePaymentMethods.creditCardInstructions;
            if (mVCreditCardInstructions2 != null) {
                mVCreditCardInstructions2.mo29771h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPurchasePaymentMethods$b */
    public static class C10038b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10037a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPurchasePaymentMethods$c */
    public static class C10039c extends C25240d<MVPurchasePaymentMethods> {
        public C10039c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchasePaymentMethods mVPurchasePaymentMethods = (MVPurchasePaymentMethods) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchasePaymentMethods.mo30531h()) {
                bitSet.set(0);
            }
            if (mVPurchasePaymentMethods.mo30529f()) {
                bitSet.set(1);
            }
            if (mVPurchasePaymentMethods.mo30530g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPurchasePaymentMethods.mo30531h()) {
                jVar.mo61678B(mVPurchasePaymentMethods.paymentMethods.size());
                for (MVPaymentMethodInfo X0 : mVPurchasePaymentMethods.paymentMethods) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPurchasePaymentMethods.mo30529f()) {
                mVPurchasePaymentMethods.creditCardInstructions.mo25202X0(jVar);
            }
            if (mVPurchasePaymentMethods.mo30530g()) {
                jVar.mo61686J(mVPurchasePaymentMethods.paymentContext);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchasePaymentMethods mVPurchasePaymentMethods = (MVPurchasePaymentMethods) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVPurchasePaymentMethods.paymentMethods = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPaymentMethodInfo mVPaymentMethodInfo = new MVPaymentMethodInfo();
                    mVPaymentMethodInfo.mo25201C1(jVar);
                    mVPurchasePaymentMethods.paymentMethods.add(mVPaymentMethodInfo);
                }
            }
            if (T.get(1)) {
                MVCreditCardInstructions mVCreditCardInstructions = new MVCreditCardInstructions();
                mVPurchasePaymentMethods.creditCardInstructions = mVCreditCardInstructions;
                mVCreditCardInstructions.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPurchasePaymentMethods.paymentContext = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPurchasePaymentMethods$d */
    public static class C10040d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10039c(0);
        }
    }

    static {
        new C17394d0("MVPurchasePaymentMethods");
        HashMap hashMap = new HashMap();
        f27664e = hashMap;
        hashMap.put(C25239c.class, new C10038b());
        hashMap.put(C25240d.class, new C10040d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_METHODS, new FieldMetaData("paymentMethods", (byte) 3, new ListMetaData(new StructMetaData(MVPaymentMethodInfo.class))));
        enumMap.put(_Fields.CREDIT_CARD_INSTRUCTIONS, new FieldMetaData("creditCardInstructions", (byte) 2, new StructMetaData(MVCreditCardInstructions.class)));
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27665f = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchasePaymentMethods.class, unmodifiableMap);
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
        ((C25238b) f27664e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27664e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30526a(MVPurchasePaymentMethods mVPurchasePaymentMethods) {
        if (mVPurchasePaymentMethods == null) {
            return false;
        }
        boolean h = mo30531h();
        boolean h2 = mVPurchasePaymentMethods.mo30531h();
        if ((h || h2) && (!h || !h2 || !this.paymentMethods.equals(mVPurchasePaymentMethods.paymentMethods))) {
            return false;
        }
        boolean f = mo30529f();
        boolean f2 = mVPurchasePaymentMethods.mo30529f();
        if ((f || f2) && (!f || !f2 || !this.creditCardInstructions.mo29766a(mVPurchasePaymentMethods.creditCardInstructions))) {
            return false;
        }
        boolean g = mo30530g();
        boolean g2 = mVPurchasePaymentMethods.mo30530g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.paymentContext.equals(mVPurchasePaymentMethods.paymentContext)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchasePaymentMethods mVPurchasePaymentMethods = (MVPurchasePaymentMethods) obj;
        if (!getClass().equals(mVPurchasePaymentMethods.getClass())) {
            return getClass().getName().compareTo(mVPurchasePaymentMethods.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30531h()).compareTo(Boolean.valueOf(mVPurchasePaymentMethods.mo30531h()));
        if (compareTo2 != 0 || ((mo30531h() && (compareTo2 = C25082a.m62844h(this.paymentMethods, mVPurchasePaymentMethods.paymentMethods)) != 0) || (compareTo2 = Boolean.valueOf(mo30529f()).compareTo(Boolean.valueOf(mVPurchasePaymentMethods.mo30529f()))) != 0 || ((mo30529f() && (compareTo2 = this.creditCardInstructions.compareTo(mVPurchasePaymentMethods.creditCardInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30530g()).compareTo(Boolean.valueOf(mVPurchasePaymentMethods.mo30530g()))) != 0))) {
            return compareTo2;
        }
        if (!mo30530g() || (compareTo = this.paymentContext.compareTo(mVPurchasePaymentMethods.paymentContext)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPurchasePaymentMethods)) {
            return mo30526a((MVPurchasePaymentMethods) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30529f() {
        return this.creditCardInstructions != null;
    }

    /* renamed from: g */
    public final boolean mo30530g() {
        return this.paymentContext != null;
    }

    /* renamed from: h */
    public final boolean mo30531h() {
        return this.paymentMethods != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchasePaymentMethods(", "paymentMethods:");
        List<MVPaymentMethodInfo> list = this.paymentMethods;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo30529f()) {
            n.append(", ");
            n.append("creditCardInstructions:");
            MVCreditCardInstructions mVCreditCardInstructions = this.creditCardInstructions;
            if (mVCreditCardInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCreditCardInstructions);
            }
        }
        if (mo30530g()) {
            n.append(", ");
            n.append("paymentContext:");
            String str = this.paymentContext;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(")");
        return n.toString();
    }
}
