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

public class MVApplePayPaymentData implements TBase<MVApplePayPaymentData, _Fields>, Serializable, Cloneable, Comparable<MVApplePayPaymentData> {

    /* renamed from: b */
    public static final C25113c f27089b = new C25113c("paymentData", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27090c = new C25113c("billingContact", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27091d = new C25113c("paymentMethod", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27092e = new C25113c("transactionIdentifier", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f27093f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27094g;
    public MVApplePayContact billingContact;
    private _Fields[] optionals = {_Fields.BILLING_CONTACT, _Fields.PAYMENT_METHOD, _Fields.TRANSACTION_IDENTIFIER};
    public String paymentData;
    public MVApplePayPaymentMethod paymentMethod;
    public String transactionIdentifier;

    public enum _Fields implements C25085c {
        PAYMENT_DATA(1, "paymentData"),
        BILLING_CONTACT(2, "billingContact"),
        PAYMENT_METHOD(3, "paymentMethod"),
        TRANSACTION_IDENTIFIER(4, "transactionIdentifier");
        
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
                return PAYMENT_DATA;
            }
            if (i == 2) {
                return BILLING_CONTACT;
            }
            if (i == 3) {
                return PAYMENT_METHOD;
            }
            if (i != 4) {
                return null;
            }
            return TRANSACTION_IDENTIFIER;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentData$a */
    public static class C9596a extends C25239c<MVApplePayPaymentData> {
        public C9596a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentData mVApplePayPaymentData = (MVApplePayPaymentData) tBase;
            MVApplePayContact mVApplePayContact = mVApplePayPaymentData.billingContact;
            if (mVApplePayContact != null) {
                mVApplePayContact.mo29544k();
            }
            C25113c cVar = MVApplePayPaymentData.f27089b;
            gVar.mo61687K();
            if (mVApplePayPaymentData.paymentData != null) {
                gVar.mo61711x(MVApplePayPaymentData.f27089b);
                gVar.mo61686J(mVApplePayPaymentData.paymentData);
                gVar.mo61712y();
            }
            if (mVApplePayPaymentData.billingContact != null && mVApplePayPaymentData.mo29558f()) {
                gVar.mo61711x(MVApplePayPaymentData.f27090c);
                mVApplePayPaymentData.billingContact.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVApplePayPaymentData.paymentMethod != null && mVApplePayPaymentData.mo29560h()) {
                gVar.mo61711x(MVApplePayPaymentData.f27091d);
                mVApplePayPaymentData.paymentMethod.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVApplePayPaymentData.transactionIdentifier != null && mVApplePayPaymentData.mo29562i()) {
                gVar.mo61711x(MVApplePayPaymentData.f27092e);
                gVar.mo61686J(mVApplePayPaymentData.transactionIdentifier);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentData mVApplePayPaymentData = (MVApplePayPaymentData) tBase;
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
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVApplePayPaymentData.transactionIdentifier = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVApplePayPaymentMethod mVApplePayPaymentMethod = new MVApplePayPaymentMethod();
                            mVApplePayPaymentData.paymentMethod = mVApplePayPaymentMethod;
                            mVApplePayPaymentMethod.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVApplePayContact mVApplePayContact = new MVApplePayContact();
                        mVApplePayPaymentData.billingContact = mVApplePayContact;
                        mVApplePayContact.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVApplePayPaymentData.paymentData = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVApplePayContact mVApplePayContact2 = mVApplePayPaymentData.billingContact;
            if (mVApplePayContact2 != null) {
                mVApplePayContact2.mo29544k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentData$b */
    public static class C9597b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9596a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentData$c */
    public static class C9598c extends C25240d<MVApplePayPaymentData> {
        public C9598c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentData mVApplePayPaymentData = (MVApplePayPaymentData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVApplePayPaymentData.mo29559g()) {
                bitSet.set(0);
            }
            if (mVApplePayPaymentData.mo29558f()) {
                bitSet.set(1);
            }
            if (mVApplePayPaymentData.mo29560h()) {
                bitSet.set(2);
            }
            if (mVApplePayPaymentData.mo29562i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVApplePayPaymentData.mo29559g()) {
                jVar.mo61686J(mVApplePayPaymentData.paymentData);
            }
            if (mVApplePayPaymentData.mo29558f()) {
                mVApplePayPaymentData.billingContact.mo25202X0(jVar);
            }
            if (mVApplePayPaymentData.mo29560h()) {
                mVApplePayPaymentData.paymentMethod.mo25202X0(jVar);
            }
            if (mVApplePayPaymentData.mo29562i()) {
                jVar.mo61686J(mVApplePayPaymentData.transactionIdentifier);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentData mVApplePayPaymentData = (MVApplePayPaymentData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVApplePayPaymentData.paymentData = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVApplePayContact mVApplePayContact = new MVApplePayContact();
                mVApplePayPaymentData.billingContact = mVApplePayContact;
                mVApplePayContact.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVApplePayPaymentMethod mVApplePayPaymentMethod = new MVApplePayPaymentMethod();
                mVApplePayPaymentData.paymentMethod = mVApplePayPaymentMethod;
                mVApplePayPaymentMethod.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVApplePayPaymentData.transactionIdentifier = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentData$d */
    public static class C9599d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9598c(0);
        }
    }

    static {
        new C17394d0("MVApplePayPaymentData");
        HashMap hashMap = new HashMap();
        f27093f = hashMap;
        hashMap.put(C25239c.class, new C9597b());
        hashMap.put(C25240d.class, new C9599d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_DATA, new FieldMetaData("paymentData", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BILLING_CONTACT, new FieldMetaData("billingContact", (byte) 2, new StructMetaData(MVApplePayContact.class)));
        enumMap.put(_Fields.PAYMENT_METHOD, new FieldMetaData("paymentMethod", (byte) 2, new StructMetaData(MVApplePayPaymentMethod.class)));
        enumMap.put(_Fields.TRANSACTION_IDENTIFIER, new FieldMetaData("transactionIdentifier", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27094g = unmodifiableMap;
        FieldMetaData.m61947a(MVApplePayPaymentData.class, unmodifiableMap);
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
        ((C25238b) f27093f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27093f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVApplePayPaymentData mVApplePayPaymentData = (MVApplePayPaymentData) obj;
        if (!getClass().equals(mVApplePayPaymentData.getClass())) {
            return getClass().getName().compareTo(mVApplePayPaymentData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29559g()).compareTo(Boolean.valueOf(mVApplePayPaymentData.mo29559g()));
        if (compareTo2 != 0 || ((mo29559g() && (compareTo2 = this.paymentData.compareTo(mVApplePayPaymentData.paymentData)) != 0) || (compareTo2 = Boolean.valueOf(mo29558f()).compareTo(Boolean.valueOf(mVApplePayPaymentData.mo29558f()))) != 0 || ((mo29558f() && (compareTo2 = this.billingContact.compareTo(mVApplePayPaymentData.billingContact)) != 0) || (compareTo2 = Boolean.valueOf(mo29560h()).compareTo(Boolean.valueOf(mVApplePayPaymentData.mo29560h()))) != 0 || ((mo29560h() && (compareTo2 = this.paymentMethod.compareTo(mVApplePayPaymentData.paymentMethod)) != 0) || (compareTo2 = Boolean.valueOf(mo29562i()).compareTo(Boolean.valueOf(mVApplePayPaymentData.mo29562i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo29562i() || (compareTo = this.transactionIdentifier.compareTo(mVApplePayPaymentData.transactionIdentifier)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVApplePayPaymentData)) {
            return false;
        }
        MVApplePayPaymentData mVApplePayPaymentData = (MVApplePayPaymentData) obj;
        boolean g = mo29559g();
        boolean g2 = mVApplePayPaymentData.mo29559g();
        if ((g || g2) && (!g || !g2 || !this.paymentData.equals(mVApplePayPaymentData.paymentData))) {
            return false;
        }
        boolean f = mo29558f();
        boolean f2 = mVApplePayPaymentData.mo29558f();
        if ((f || f2) && (!f || !f2 || !this.billingContact.mo29535a(mVApplePayPaymentData.billingContact))) {
            return false;
        }
        boolean h = mo29560h();
        boolean h2 = mVApplePayPaymentData.mo29560h();
        if ((h || h2) && (!h || !h2 || !this.paymentMethod.mo29565a(mVApplePayPaymentData.paymentMethod))) {
            return false;
        }
        boolean i = mo29562i();
        boolean i2 = mVApplePayPaymentData.mo29562i();
        if ((i || i2) && (!i || !i2 || !this.transactionIdentifier.equals(mVApplePayPaymentData.transactionIdentifier))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29558f() {
        return this.billingContact != null;
    }

    /* renamed from: g */
    public final boolean mo29559g() {
        return this.paymentData != null;
    }

    /* renamed from: h */
    public final boolean mo29560h() {
        return this.paymentMethod != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29562i() {
        return this.transactionIdentifier != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVApplePayPaymentData(", "paymentData:");
        String str = this.paymentData;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo29558f()) {
            n.append(", ");
            n.append("billingContact:");
            MVApplePayContact mVApplePayContact = this.billingContact;
            if (mVApplePayContact == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVApplePayContact);
            }
        }
        if (mo29560h()) {
            n.append(", ");
            n.append("paymentMethod:");
            MVApplePayPaymentMethod mVApplePayPaymentMethod = this.paymentMethod;
            if (mVApplePayPaymentMethod == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVApplePayPaymentMethod);
            }
        }
        if (mo29562i()) {
            n.append(", ");
            n.append("transactionIdentifier:");
            String str2 = this.transactionIdentifier;
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
