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

public class MVGetDepositInstructionsRequest implements TBase<MVGetDepositInstructionsRequest, _Fields>, Serializable, Cloneable, Comparable<MVGetDepositInstructionsRequest> {

    /* renamed from: b */
    public static final C25113c f27290b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27291c = new C25113c("depositAmount", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f27292d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27293e;
    public MVCurrencyAmount depositAmount;
    public String paymentContext;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        DEPOSIT_AMOUNT(2, "depositAmount");
        
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
            if (i != 2) {
                return null;
            }
            return DEPOSIT_AMOUNT;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetDepositInstructionsRequest$a */
    public static class C9765a extends C25239c<MVGetDepositInstructionsRequest> {
        public C9765a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetDepositInstructionsRequest mVGetDepositInstructionsRequest = (MVGetDepositInstructionsRequest) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVGetDepositInstructionsRequest.depositAmount;
            C25113c cVar = MVGetDepositInstructionsRequest.f27290b;
            gVar.mo61687K();
            if (mVGetDepositInstructionsRequest.paymentContext != null) {
                gVar.mo61711x(MVGetDepositInstructionsRequest.f27290b);
                gVar.mo61686J(mVGetDepositInstructionsRequest.paymentContext);
                gVar.mo61712y();
            }
            if (mVGetDepositInstructionsRequest.depositAmount != null) {
                gVar.mo61711x(MVGetDepositInstructionsRequest.f27291c);
                mVGetDepositInstructionsRequest.depositAmount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetDepositInstructionsRequest mVGetDepositInstructionsRequest = (MVGetDepositInstructionsRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVGetDepositInstructionsRequest.depositAmount;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                        mVGetDepositInstructionsRequest.depositAmount = mVCurrencyAmount2;
                        mVCurrencyAmount2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVGetDepositInstructionsRequest.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetDepositInstructionsRequest$b */
    public static class C9766b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9765a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetDepositInstructionsRequest$c */
    public static class C9767c extends C25240d<MVGetDepositInstructionsRequest> {
        public C9767c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetDepositInstructionsRequest mVGetDepositInstructionsRequest = (MVGetDepositInstructionsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetDepositInstructionsRequest.mo29910g()) {
                bitSet.set(0);
            }
            if (mVGetDepositInstructionsRequest.mo29909f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVGetDepositInstructionsRequest.mo29910g()) {
                jVar.mo61686J(mVGetDepositInstructionsRequest.paymentContext);
            }
            if (mVGetDepositInstructionsRequest.mo29909f()) {
                mVGetDepositInstructionsRequest.depositAmount.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetDepositInstructionsRequest mVGetDepositInstructionsRequest = (MVGetDepositInstructionsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVGetDepositInstructionsRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVGetDepositInstructionsRequest.depositAmount = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetDepositInstructionsRequest$d */
    public static class C9768d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9767c(0);
        }
    }

    static {
        new C17394d0("MVGetDepositInstructionsRequest");
        HashMap hashMap = new HashMap();
        f27292d = hashMap;
        hashMap.put(C25239c.class, new C9766b());
        hashMap.put(C25240d.class, new C9768d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DEPOSIT_AMOUNT, new FieldMetaData("depositAmount", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27293e = unmodifiableMap;
        FieldMetaData.m61947a(MVGetDepositInstructionsRequest.class, unmodifiableMap);
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
        ((C25238b) f27292d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27292d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetDepositInstructionsRequest mVGetDepositInstructionsRequest = (MVGetDepositInstructionsRequest) obj;
        if (!getClass().equals(mVGetDepositInstructionsRequest.getClass())) {
            return getClass().getName().compareTo(mVGetDepositInstructionsRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29910g()).compareTo(Boolean.valueOf(mVGetDepositInstructionsRequest.mo29910g()));
        if (compareTo2 != 0 || ((mo29910g() && (compareTo2 = this.paymentContext.compareTo(mVGetDepositInstructionsRequest.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo29909f()).compareTo(Boolean.valueOf(mVGetDepositInstructionsRequest.mo29909f()))) != 0)) {
            return compareTo2;
        }
        if (!mo29909f() || (compareTo = this.depositAmount.compareTo(mVGetDepositInstructionsRequest.depositAmount)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetDepositInstructionsRequest)) {
            return false;
        }
        MVGetDepositInstructionsRequest mVGetDepositInstructionsRequest = (MVGetDepositInstructionsRequest) obj;
        boolean g = mo29910g();
        boolean g2 = mVGetDepositInstructionsRequest.mo29910g();
        if ((g || g2) && (!g || !g2 || !this.paymentContext.equals(mVGetDepositInstructionsRequest.paymentContext))) {
            return false;
        }
        boolean f = mo29909f();
        boolean f2 = mVGetDepositInstructionsRequest.mo29909f();
        if ((f || f2) && (!f || !f2 || !this.depositAmount.mo26102a(mVGetDepositInstructionsRequest.depositAmount))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29909f() {
        return this.depositAmount != null;
    }

    /* renamed from: g */
    public final boolean mo29910g() {
        return this.paymentContext != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetDepositInstructionsRequest(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("depositAmount:");
        MVCurrencyAmount mVCurrencyAmount = this.depositAmount;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(")");
        return n.toString();
    }
}
