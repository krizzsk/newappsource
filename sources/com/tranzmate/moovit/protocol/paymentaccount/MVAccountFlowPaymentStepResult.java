package com.tranzmate.moovit.protocol.paymentaccount;

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

public class MVAccountFlowPaymentStepResult implements TBase<MVAccountFlowPaymentStepResult, _Fields>, Serializable, Cloneable, Comparable<MVAccountFlowPaymentStepResult> {

    /* renamed from: b */
    public static final C25113c f26972b = new C25113c("identifier", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26973c = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26974d = new C25113c("paymentProvider", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f26975e = new C25113c("discountContextId", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f26976f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26977g;
    public String discountContextId;
    public String identifier;
    private _Fields[] optionals = {_Fields.PRICE, _Fields.PAYMENT_PROVIDER, _Fields.DISCOUNT_CONTEXT_ID};
    public MVPaymentProvider paymentProvider;
    public MVCurrencyAmount price;

    public enum _Fields implements C25085c {
        IDENTIFIER(1, "identifier"),
        PRICE(2, InAppPurchaseMetaData.KEY_PRICE),
        PAYMENT_PROVIDER(3, "paymentProvider"),
        DISCOUNT_CONTEXT_ID(4, "discountContextId");
        
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
                return IDENTIFIER;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowPaymentStepResult$a */
    public static class C9514a extends C25239c<MVAccountFlowPaymentStepResult> {
        public C9514a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowPaymentStepResult mVAccountFlowPaymentStepResult = (MVAccountFlowPaymentStepResult) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVAccountFlowPaymentStepResult.price;
            C25113c cVar = MVAccountFlowPaymentStepResult.f26972b;
            gVar.mo61687K();
            if (mVAccountFlowPaymentStepResult.identifier != null) {
                gVar.mo61711x(MVAccountFlowPaymentStepResult.f26972b);
                gVar.mo61686J(mVAccountFlowPaymentStepResult.identifier);
                gVar.mo61712y();
            }
            if (mVAccountFlowPaymentStepResult.price != null && mVAccountFlowPaymentStepResult.mo29389i()) {
                gVar.mo61711x(MVAccountFlowPaymentStepResult.f26973c);
                mVAccountFlowPaymentStepResult.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAccountFlowPaymentStepResult.paymentProvider != null && mVAccountFlowPaymentStepResult.mo29387h()) {
                gVar.mo61711x(MVAccountFlowPaymentStepResult.f26974d);
                mVAccountFlowPaymentStepResult.paymentProvider.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAccountFlowPaymentStepResult.discountContextId != null && mVAccountFlowPaymentStepResult.mo29385f()) {
                gVar.mo61711x(MVAccountFlowPaymentStepResult.f26975e);
                gVar.mo61686J(mVAccountFlowPaymentStepResult.discountContextId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowPaymentStepResult mVAccountFlowPaymentStepResult = (MVAccountFlowPaymentStepResult) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVAccountFlowPaymentStepResult.price;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVAccountFlowPaymentStepResult.discountContextId = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                            mVAccountFlowPaymentStepResult.paymentProvider = mVPaymentProvider;
                            mVPaymentProvider.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                        mVAccountFlowPaymentStepResult.price = mVCurrencyAmount2;
                        mVCurrencyAmount2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAccountFlowPaymentStepResult.identifier = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowPaymentStepResult$b */
    public static class C9515b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9514a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowPaymentStepResult$c */
    public static class C9516c extends C25240d<MVAccountFlowPaymentStepResult> {
        public C9516c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowPaymentStepResult mVAccountFlowPaymentStepResult = (MVAccountFlowPaymentStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccountFlowPaymentStepResult.mo29386g()) {
                bitSet.set(0);
            }
            if (mVAccountFlowPaymentStepResult.mo29389i()) {
                bitSet.set(1);
            }
            if (mVAccountFlowPaymentStepResult.mo29387h()) {
                bitSet.set(2);
            }
            if (mVAccountFlowPaymentStepResult.mo29385f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVAccountFlowPaymentStepResult.mo29386g()) {
                jVar.mo61686J(mVAccountFlowPaymentStepResult.identifier);
            }
            if (mVAccountFlowPaymentStepResult.mo29389i()) {
                mVAccountFlowPaymentStepResult.price.mo25202X0(jVar);
            }
            if (mVAccountFlowPaymentStepResult.mo29387h()) {
                mVAccountFlowPaymentStepResult.paymentProvider.mo25202X0(jVar);
            }
            if (mVAccountFlowPaymentStepResult.mo29385f()) {
                jVar.mo61686J(mVAccountFlowPaymentStepResult.discountContextId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowPaymentStepResult mVAccountFlowPaymentStepResult = (MVAccountFlowPaymentStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVAccountFlowPaymentStepResult.identifier = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVAccountFlowPaymentStepResult.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                mVAccountFlowPaymentStepResult.paymentProvider = mVPaymentProvider;
                mVPaymentProvider.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVAccountFlowPaymentStepResult.discountContextId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowPaymentStepResult$d */
    public static class C9517d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9516c(0);
        }
    }

    static {
        new C17394d0("MVAccountFlowPaymentStepResult");
        HashMap hashMap = new HashMap();
        f26976f = hashMap;
        hashMap.put(C25239c.class, new C9515b());
        hashMap.put(C25240d.class, new C9517d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IDENTIFIER, new FieldMetaData("identifier", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.PAYMENT_PROVIDER, new FieldMetaData("paymentProvider", (byte) 2, new StructMetaData(MVPaymentProvider.class)));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26977g = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowPaymentStepResult.class, unmodifiableMap);
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
        ((C25238b) f26976f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26976f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAccountFlowPaymentStepResult mVAccountFlowPaymentStepResult = (MVAccountFlowPaymentStepResult) obj;
        if (!getClass().equals(mVAccountFlowPaymentStepResult.getClass())) {
            return getClass().getName().compareTo(mVAccountFlowPaymentStepResult.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29386g()).compareTo(Boolean.valueOf(mVAccountFlowPaymentStepResult.mo29386g()));
        if (compareTo2 != 0 || ((mo29386g() && (compareTo2 = this.identifier.compareTo(mVAccountFlowPaymentStepResult.identifier)) != 0) || (compareTo2 = Boolean.valueOf(mo29389i()).compareTo(Boolean.valueOf(mVAccountFlowPaymentStepResult.mo29389i()))) != 0 || ((mo29389i() && (compareTo2 = this.price.compareTo(mVAccountFlowPaymentStepResult.price)) != 0) || (compareTo2 = Boolean.valueOf(mo29387h()).compareTo(Boolean.valueOf(mVAccountFlowPaymentStepResult.mo29387h()))) != 0 || ((mo29387h() && (compareTo2 = this.paymentProvider.compareTo(mVAccountFlowPaymentStepResult.paymentProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo29385f()).compareTo(Boolean.valueOf(mVAccountFlowPaymentStepResult.mo29385f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo29385f() || (compareTo = this.discountContextId.compareTo(mVAccountFlowPaymentStepResult.discountContextId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAccountFlowPaymentStepResult)) {
            return false;
        }
        MVAccountFlowPaymentStepResult mVAccountFlowPaymentStepResult = (MVAccountFlowPaymentStepResult) obj;
        boolean g = mo29386g();
        boolean g2 = mVAccountFlowPaymentStepResult.mo29386g();
        if ((g || g2) && (!g || !g2 || !this.identifier.equals(mVAccountFlowPaymentStepResult.identifier))) {
            return false;
        }
        boolean i = mo29389i();
        boolean i2 = mVAccountFlowPaymentStepResult.mo29389i();
        if ((i || i2) && (!i || !i2 || !this.price.mo26102a(mVAccountFlowPaymentStepResult.price))) {
            return false;
        }
        boolean h = mo29387h();
        boolean h2 = mVAccountFlowPaymentStepResult.mo29387h();
        if ((h || h2) && (!h || !h2 || !this.paymentProvider.mo30299m(mVAccountFlowPaymentStepResult.paymentProvider))) {
            return false;
        }
        boolean f = mo29385f();
        boolean f2 = mVAccountFlowPaymentStepResult.mo29385f();
        if ((f || f2) && (!f || !f2 || !this.discountContextId.equals(mVAccountFlowPaymentStepResult.discountContextId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29385f() {
        return this.discountContextId != null;
    }

    /* renamed from: g */
    public final boolean mo29386g() {
        return this.identifier != null;
    }

    /* renamed from: h */
    public final boolean mo29387h() {
        return this.paymentProvider != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29389i() {
        return this.price != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAccountFlowPaymentStepResult(", "identifier:");
        String str = this.identifier;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo29389i()) {
            n.append(", ");
            n.append("price:");
            MVCurrencyAmount mVCurrencyAmount = this.price;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        if (mo29387h()) {
            n.append(", ");
            n.append("paymentProvider:");
            MVPaymentProvider mVPaymentProvider = this.paymentProvider;
            if (mVPaymentProvider == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentProvider);
            }
        }
        if (mo29385f()) {
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
