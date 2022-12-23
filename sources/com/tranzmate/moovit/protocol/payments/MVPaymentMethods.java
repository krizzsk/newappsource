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

public class MVPaymentMethods implements TBase<MVPaymentMethods, _Fields>, Serializable, Cloneable, Comparable<MVPaymentMethods> {

    /* renamed from: b */
    public static final C25113c f27508b = new C25113c("storedPaymentMethods", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27509c = new C25113c("singleUsePaymentMethods", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f27510d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27511e;
    public MVSingleUsePaymentMethods singleUsePaymentMethods;
    public MVPurchasePaymentMethods storedPaymentMethods;

    public enum _Fields implements C25085c {
        STORED_PAYMENT_METHODS(1, "storedPaymentMethods"),
        SINGLE_USE_PAYMENT_METHODS(2, "singleUsePaymentMethods");
        
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
                return STORED_PAYMENT_METHODS;
            }
            if (i != 2) {
                return null;
            }
            return SINGLE_USE_PAYMENT_METHODS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethods$a */
    public static class C9922a extends C25239c<MVPaymentMethods> {
        public C9922a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreditCardInstructions mVCreditCardInstructions;
            MVPaymentMethods mVPaymentMethods = (MVPaymentMethods) tBase;
            MVPurchasePaymentMethods mVPurchasePaymentMethods = mVPaymentMethods.storedPaymentMethods;
            if (!(mVPurchasePaymentMethods == null || (mVCreditCardInstructions = mVPurchasePaymentMethods.creditCardInstructions) == null)) {
                mVCreditCardInstructions.mo29771h();
            }
            MVSingleUsePaymentMethods mVSingleUsePaymentMethods = mVPaymentMethods.singleUsePaymentMethods;
            if (mVSingleUsePaymentMethods != null) {
                mVSingleUsePaymentMethods.mo30585j();
            }
            C25113c cVar = MVPaymentMethods.f27508b;
            gVar.mo61687K();
            if (mVPaymentMethods.storedPaymentMethods != null) {
                gVar.mo61711x(MVPaymentMethods.f27508b);
                mVPaymentMethods.storedPaymentMethods.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentMethods.singleUsePaymentMethods != null) {
                gVar.mo61711x(MVPaymentMethods.f27509c);
                mVPaymentMethods.singleUsePaymentMethods.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreditCardInstructions mVCreditCardInstructions;
            MVPaymentMethods mVPaymentMethods = (MVPaymentMethods) tBase;
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
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVSingleUsePaymentMethods mVSingleUsePaymentMethods = new MVSingleUsePaymentMethods();
                        mVPaymentMethods.singleUsePaymentMethods = mVSingleUsePaymentMethods;
                        mVSingleUsePaymentMethods.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVPurchasePaymentMethods mVPurchasePaymentMethods = new MVPurchasePaymentMethods();
                    mVPaymentMethods.storedPaymentMethods = mVPurchasePaymentMethods;
                    mVPurchasePaymentMethods.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVPurchasePaymentMethods mVPurchasePaymentMethods2 = mVPaymentMethods.storedPaymentMethods;
            if (!(mVPurchasePaymentMethods2 == null || (mVCreditCardInstructions = mVPurchasePaymentMethods2.creditCardInstructions) == null)) {
                mVCreditCardInstructions.mo29771h();
            }
            MVSingleUsePaymentMethods mVSingleUsePaymentMethods2 = mVPaymentMethods.singleUsePaymentMethods;
            if (mVSingleUsePaymentMethods2 != null) {
                mVSingleUsePaymentMethods2.mo30585j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethods$b */
    public static class C9923b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9922a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethods$c */
    public static class C9924c extends C25240d<MVPaymentMethods> {
        public C9924c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethods mVPaymentMethods = (MVPaymentMethods) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentMethods.mo30272g()) {
                bitSet.set(0);
            }
            if (mVPaymentMethods.mo30271f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPaymentMethods.mo30272g()) {
                mVPaymentMethods.storedPaymentMethods.mo25202X0(jVar);
            }
            if (mVPaymentMethods.mo30271f()) {
                mVPaymentMethods.singleUsePaymentMethods.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethods mVPaymentMethods = (MVPaymentMethods) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVPurchasePaymentMethods mVPurchasePaymentMethods = new MVPurchasePaymentMethods();
                mVPaymentMethods.storedPaymentMethods = mVPurchasePaymentMethods;
                mVPurchasePaymentMethods.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVSingleUsePaymentMethods mVSingleUsePaymentMethods = new MVSingleUsePaymentMethods();
                mVPaymentMethods.singleUsePaymentMethods = mVSingleUsePaymentMethods;
                mVSingleUsePaymentMethods.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethods$d */
    public static class C9925d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9924c(0);
        }
    }

    static {
        new C17394d0("MVPaymentMethods");
        HashMap hashMap = new HashMap();
        f27510d = hashMap;
        hashMap.put(C25239c.class, new C9923b());
        hashMap.put(C25240d.class, new C9925d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STORED_PAYMENT_METHODS, new FieldMetaData("storedPaymentMethods", (byte) 3, new StructMetaData(MVPurchasePaymentMethods.class)));
        enumMap.put(_Fields.SINGLE_USE_PAYMENT_METHODS, new FieldMetaData("singleUsePaymentMethods", (byte) 3, new StructMetaData(MVSingleUsePaymentMethods.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27511e = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentMethods.class, unmodifiableMap);
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
        ((C25238b) f27510d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27510d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30268a(MVPaymentMethods mVPaymentMethods) {
        if (mVPaymentMethods == null) {
            return false;
        }
        boolean g = mo30272g();
        boolean g2 = mVPaymentMethods.mo30272g();
        if ((g || g2) && (!g || !g2 || !this.storedPaymentMethods.mo30526a(mVPaymentMethods.storedPaymentMethods))) {
            return false;
        }
        boolean f = mo30271f();
        boolean f2 = mVPaymentMethods.mo30271f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.singleUsePaymentMethods.mo30577a(mVPaymentMethods.singleUsePaymentMethods)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentMethods mVPaymentMethods = (MVPaymentMethods) obj;
        if (!getClass().equals(mVPaymentMethods.getClass())) {
            return getClass().getName().compareTo(mVPaymentMethods.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30272g()).compareTo(Boolean.valueOf(mVPaymentMethods.mo30272g()));
        if (compareTo2 != 0 || ((mo30272g() && (compareTo2 = this.storedPaymentMethods.compareTo(mVPaymentMethods.storedPaymentMethods)) != 0) || (compareTo2 = Boolean.valueOf(mo30271f()).compareTo(Boolean.valueOf(mVPaymentMethods.mo30271f()))) != 0)) {
            return compareTo2;
        }
        if (!mo30271f() || (compareTo = this.singleUsePaymentMethods.compareTo(mVPaymentMethods.singleUsePaymentMethods)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentMethods)) {
            return mo30268a((MVPaymentMethods) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30271f() {
        return this.singleUsePaymentMethods != null;
    }

    /* renamed from: g */
    public final boolean mo30272g() {
        return this.storedPaymentMethods != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentMethods(", "storedPaymentMethods:");
        MVPurchasePaymentMethods mVPurchasePaymentMethods = this.storedPaymentMethods;
        if (mVPurchasePaymentMethods == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPurchasePaymentMethods);
        }
        n.append(", ");
        n.append("singleUsePaymentMethods:");
        MVSingleUsePaymentMethods mVSingleUsePaymentMethods = this.singleUsePaymentMethods;
        if (mVSingleUsePaymentMethods == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSingleUsePaymentMethods);
        }
        n.append(")");
        return n.toString();
    }
}
