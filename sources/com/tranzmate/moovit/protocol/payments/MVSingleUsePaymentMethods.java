package com.tranzmate.moovit.protocol.payments;

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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVSingleUsePaymentMethods implements TBase<MVSingleUsePaymentMethods, _Fields>, Serializable, Cloneable, Comparable<MVSingleUsePaymentMethods> {

    /* renamed from: b */
    public static final C25113c f27691b = new C25113c("googlePayInstructions", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27692c = new C25113c("applePayInstructions", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27693d = new C25113c("clearanceProviderInstructions", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27694e = new C25113c("cashInstructions", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f27695f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27696g;
    public MVApplePayInstructions applePayInstructions;
    public MVCashInstructions cashInstructions;
    public MVClearanceProviderInstructions clearanceProviderInstructions;
    public MVGooglePayInstructions googlePayInstructions;
    private _Fields[] optionals = {_Fields.GOOGLE_PAY_INSTRUCTIONS, _Fields.APPLE_PAY_INSTRUCTIONS, _Fields.CLEARANCE_PROVIDER_INSTRUCTIONS, _Fields.CASH_INSTRUCTIONS};

    public enum _Fields implements C25085c {
        GOOGLE_PAY_INSTRUCTIONS(1, "googlePayInstructions"),
        APPLE_PAY_INSTRUCTIONS(2, "applePayInstructions"),
        CLEARANCE_PROVIDER_INSTRUCTIONS(3, "clearanceProviderInstructions"),
        CASH_INSTRUCTIONS(4, "cashInstructions");
        
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
                return GOOGLE_PAY_INSTRUCTIONS;
            }
            if (i == 2) {
                return APPLE_PAY_INSTRUCTIONS;
            }
            if (i == 3) {
                return CLEARANCE_PROVIDER_INSTRUCTIONS;
            }
            if (i != 4) {
                return null;
            }
            return CASH_INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVSingleUsePaymentMethods$a */
    public static class C10061a extends C25239c<MVSingleUsePaymentMethods> {
        public C10061a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSingleUsePaymentMethods mVSingleUsePaymentMethods = (MVSingleUsePaymentMethods) tBase;
            mVSingleUsePaymentMethods.mo30585j();
            C25113c cVar = MVSingleUsePaymentMethods.f27691b;
            gVar.mo61687K();
            if (mVSingleUsePaymentMethods.googlePayInstructions != null && mVSingleUsePaymentMethods.mo30584i()) {
                gVar.mo61711x(MVSingleUsePaymentMethods.f27691b);
                mVSingleUsePaymentMethods.googlePayInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSingleUsePaymentMethods.applePayInstructions != null && mVSingleUsePaymentMethods.mo30580f()) {
                gVar.mo61711x(MVSingleUsePaymentMethods.f27692c);
                mVSingleUsePaymentMethods.applePayInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSingleUsePaymentMethods.clearanceProviderInstructions != null && mVSingleUsePaymentMethods.mo30582h()) {
                gVar.mo61711x(MVSingleUsePaymentMethods.f27693d);
                mVSingleUsePaymentMethods.clearanceProviderInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSingleUsePaymentMethods.cashInstructions != null && mVSingleUsePaymentMethods.mo30581g()) {
                gVar.mo61711x(MVSingleUsePaymentMethods.f27694e);
                mVSingleUsePaymentMethods.cashInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSingleUsePaymentMethods mVSingleUsePaymentMethods = (MVSingleUsePaymentMethods) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSingleUsePaymentMethods.mo30585j();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVCashInstructions mVCashInstructions = new MVCashInstructions();
                                mVSingleUsePaymentMethods.cashInstructions = mVCashInstructions;
                                mVCashInstructions.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVClearanceProviderInstructions mVClearanceProviderInstructions = new MVClearanceProviderInstructions();
                            mVSingleUsePaymentMethods.clearanceProviderInstructions = mVClearanceProviderInstructions;
                            mVClearanceProviderInstructions.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVApplePayInstructions mVApplePayInstructions = new MVApplePayInstructions();
                        mVSingleUsePaymentMethods.applePayInstructions = mVApplePayInstructions;
                        mVApplePayInstructions.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVGooglePayInstructions mVGooglePayInstructions = new MVGooglePayInstructions();
                    mVSingleUsePaymentMethods.googlePayInstructions = mVGooglePayInstructions;
                    mVGooglePayInstructions.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVSingleUsePaymentMethods$b */
    public static class C10062b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10061a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVSingleUsePaymentMethods$c */
    public static class C10063c extends C25240d<MVSingleUsePaymentMethods> {
        public C10063c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSingleUsePaymentMethods mVSingleUsePaymentMethods = (MVSingleUsePaymentMethods) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSingleUsePaymentMethods.mo30584i()) {
                bitSet.set(0);
            }
            if (mVSingleUsePaymentMethods.mo30580f()) {
                bitSet.set(1);
            }
            if (mVSingleUsePaymentMethods.mo30582h()) {
                bitSet.set(2);
            }
            if (mVSingleUsePaymentMethods.mo30581g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVSingleUsePaymentMethods.mo30584i()) {
                mVSingleUsePaymentMethods.googlePayInstructions.mo25202X0(jVar);
            }
            if (mVSingleUsePaymentMethods.mo30580f()) {
                mVSingleUsePaymentMethods.applePayInstructions.mo25202X0(jVar);
            }
            if (mVSingleUsePaymentMethods.mo30582h()) {
                mVSingleUsePaymentMethods.clearanceProviderInstructions.mo25202X0(jVar);
            }
            if (mVSingleUsePaymentMethods.mo30581g()) {
                mVSingleUsePaymentMethods.cashInstructions.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSingleUsePaymentMethods mVSingleUsePaymentMethods = (MVSingleUsePaymentMethods) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVGooglePayInstructions mVGooglePayInstructions = new MVGooglePayInstructions();
                mVSingleUsePaymentMethods.googlePayInstructions = mVGooglePayInstructions;
                mVGooglePayInstructions.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVApplePayInstructions mVApplePayInstructions = new MVApplePayInstructions();
                mVSingleUsePaymentMethods.applePayInstructions = mVApplePayInstructions;
                mVApplePayInstructions.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVClearanceProviderInstructions mVClearanceProviderInstructions = new MVClearanceProviderInstructions();
                mVSingleUsePaymentMethods.clearanceProviderInstructions = mVClearanceProviderInstructions;
                mVClearanceProviderInstructions.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVCashInstructions mVCashInstructions = new MVCashInstructions();
                mVSingleUsePaymentMethods.cashInstructions = mVCashInstructions;
                mVCashInstructions.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVSingleUsePaymentMethods$d */
    public static class C10064d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10063c(0);
        }
    }

    static {
        new C17394d0("MVSingleUsePaymentMethods");
        HashMap hashMap = new HashMap();
        f27695f = hashMap;
        hashMap.put(C25239c.class, new C10062b());
        hashMap.put(C25240d.class, new C10064d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.GOOGLE_PAY_INSTRUCTIONS, new FieldMetaData("googlePayInstructions", (byte) 2, new StructMetaData(MVGooglePayInstructions.class)));
        enumMap.put(_Fields.APPLE_PAY_INSTRUCTIONS, new FieldMetaData("applePayInstructions", (byte) 2, new StructMetaData(MVApplePayInstructions.class)));
        enumMap.put(_Fields.CLEARANCE_PROVIDER_INSTRUCTIONS, new FieldMetaData("clearanceProviderInstructions", (byte) 2, new StructMetaData(MVClearanceProviderInstructions.class)));
        enumMap.put(_Fields.CASH_INSTRUCTIONS, new FieldMetaData("cashInstructions", (byte) 2, new StructMetaData(MVCashInstructions.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27696g = unmodifiableMap;
        FieldMetaData.m61947a(MVSingleUsePaymentMethods.class, unmodifiableMap);
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
        ((C25238b) f27695f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27695f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30577a(MVSingleUsePaymentMethods mVSingleUsePaymentMethods) {
        if (mVSingleUsePaymentMethods == null) {
            return false;
        }
        boolean i = mo30584i();
        boolean i2 = mVSingleUsePaymentMethods.mo30584i();
        if ((i || i2) && (!i || !i2 || !this.googlePayInstructions.mo29946a(mVSingleUsePaymentMethods.googlePayInstructions))) {
            return false;
        }
        boolean f = mo30580f();
        boolean f2 = mVSingleUsePaymentMethods.mo30580f();
        if ((f || f2) && (!f || !f2 || !this.applePayInstructions.mo29548a(mVSingleUsePaymentMethods.applePayInstructions))) {
            return false;
        }
        boolean h = mo30582h();
        boolean h2 = mVSingleUsePaymentMethods.mo30582h();
        if ((h || h2) && (!h || !h2 || !this.clearanceProviderInstructions.mo29704a(mVSingleUsePaymentMethods.clearanceProviderInstructions))) {
            return false;
        }
        boolean g = mo30581g();
        boolean g2 = mVSingleUsePaymentMethods.mo30581g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.cashInstructions.mo29656a(mVSingleUsePaymentMethods.cashInstructions)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSingleUsePaymentMethods mVSingleUsePaymentMethods = (MVSingleUsePaymentMethods) obj;
        if (!getClass().equals(mVSingleUsePaymentMethods.getClass())) {
            return getClass().getName().compareTo(mVSingleUsePaymentMethods.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30584i()).compareTo(Boolean.valueOf(mVSingleUsePaymentMethods.mo30584i()));
        if (compareTo2 != 0 || ((mo30584i() && (compareTo2 = this.googlePayInstructions.compareTo(mVSingleUsePaymentMethods.googlePayInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30580f()).compareTo(Boolean.valueOf(mVSingleUsePaymentMethods.mo30580f()))) != 0 || ((mo30580f() && (compareTo2 = this.applePayInstructions.compareTo(mVSingleUsePaymentMethods.applePayInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30582h()).compareTo(Boolean.valueOf(mVSingleUsePaymentMethods.mo30582h()))) != 0 || ((mo30582h() && (compareTo2 = this.clearanceProviderInstructions.compareTo(mVSingleUsePaymentMethods.clearanceProviderInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30581g()).compareTo(Boolean.valueOf(mVSingleUsePaymentMethods.mo30581g()))) != 0)))) {
            return compareTo2;
        }
        if (!mo30581g() || (compareTo = this.cashInstructions.compareTo(mVSingleUsePaymentMethods.cashInstructions)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVSingleUsePaymentMethods)) {
            return mo30577a((MVSingleUsePaymentMethods) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30580f() {
        return this.applePayInstructions != null;
    }

    /* renamed from: g */
    public final boolean mo30581g() {
        return this.cashInstructions != null;
    }

    /* renamed from: h */
    public final boolean mo30582h() {
        return this.clearanceProviderInstructions != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30584i() {
        return this.googlePayInstructions != null;
    }

    /* renamed from: j */
    public final void mo30585j() throws TException {
        MVCreditCardInstructions mVCreditCardInstructions;
        MVClearanceProviderInstructions mVClearanceProviderInstructions = this.clearanceProviderInstructions;
        if (mVClearanceProviderInstructions != null && (mVCreditCardInstructions = mVClearanceProviderInstructions.creditCardInstructions) != null) {
            mVCreditCardInstructions.mo29771h();
        }
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVSingleUsePaymentMethods(");
        boolean z2 = false;
        if (mo30584i()) {
            sb.append("googlePayInstructions:");
            MVGooglePayInstructions mVGooglePayInstructions = this.googlePayInstructions;
            if (mVGooglePayInstructions == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVGooglePayInstructions);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo30580f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("applePayInstructions:");
            MVApplePayInstructions mVApplePayInstructions = this.applePayInstructions;
            if (mVApplePayInstructions == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVApplePayInstructions);
            }
            z = false;
        }
        if (mo30582h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clearanceProviderInstructions:");
            MVClearanceProviderInstructions mVClearanceProviderInstructions = this.clearanceProviderInstructions;
            if (mVClearanceProviderInstructions == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVClearanceProviderInstructions);
            }
        } else {
            z2 = z;
        }
        if (mo30581g()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("cashInstructions:");
            MVCashInstructions mVCashInstructions = this.cashInstructions;
            if (mVCashInstructions == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVCashInstructions);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
