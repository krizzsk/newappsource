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

public class MVApplePayInstructions implements TBase<MVApplePayInstructions, _Fields>, Serializable, Cloneable, Comparable<MVApplePayInstructions> {

    /* renamed from: b */
    public static final C25113c f27085b = new C25113c("canMakePaymentsProperties", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27086c = new C25113c("paymentRequestProperties", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f27087d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27088e;
    public MVApplePayCanMakePaymentsProperties canMakePaymentsProperties;
    public MVApplePayPaymentRequestProperties paymentRequestProperties;

    public enum _Fields implements C25085c {
        CAN_MAKE_PAYMENTS_PROPERTIES(1, "canMakePaymentsProperties"),
        PAYMENT_REQUEST_PROPERTIES(2, "paymentRequestProperties");
        
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
                return CAN_MAKE_PAYMENTS_PROPERTIES;
            }
            if (i != 2) {
                return null;
            }
            return PAYMENT_REQUEST_PROPERTIES;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayInstructions$a */
    public static class C9592a extends C25239c<MVApplePayInstructions> {
        public C9592a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayInstructions mVApplePayInstructions = (MVApplePayInstructions) tBase;
            mVApplePayInstructions.getClass();
            C25113c cVar = MVApplePayInstructions.f27085b;
            gVar.mo61687K();
            if (mVApplePayInstructions.canMakePaymentsProperties != null) {
                gVar.mo61711x(MVApplePayInstructions.f27085b);
                mVApplePayInstructions.canMakePaymentsProperties.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVApplePayInstructions.paymentRequestProperties != null) {
                gVar.mo61711x(MVApplePayInstructions.f27086c);
                mVApplePayInstructions.paymentRequestProperties.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayInstructions mVApplePayInstructions = (MVApplePayInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVApplePayInstructions.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVApplePayPaymentRequestProperties mVApplePayPaymentRequestProperties = new MVApplePayPaymentRequestProperties();
                        mVApplePayInstructions.paymentRequestProperties = mVApplePayPaymentRequestProperties;
                        mVApplePayPaymentRequestProperties.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVApplePayCanMakePaymentsProperties mVApplePayCanMakePaymentsProperties = new MVApplePayCanMakePaymentsProperties();
                    mVApplePayInstructions.canMakePaymentsProperties = mVApplePayCanMakePaymentsProperties;
                    mVApplePayCanMakePaymentsProperties.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayInstructions$b */
    public static class C9593b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9592a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayInstructions$c */
    public static class C9594c extends C25240d<MVApplePayInstructions> {
        public C9594c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayInstructions mVApplePayInstructions = (MVApplePayInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVApplePayInstructions.mo29551f()) {
                bitSet.set(0);
            }
            if (mVApplePayInstructions.mo29552g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVApplePayInstructions.mo29551f()) {
                mVApplePayInstructions.canMakePaymentsProperties.mo25202X0(jVar);
            }
            if (mVApplePayInstructions.mo29552g()) {
                mVApplePayInstructions.paymentRequestProperties.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayInstructions mVApplePayInstructions = (MVApplePayInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVApplePayCanMakePaymentsProperties mVApplePayCanMakePaymentsProperties = new MVApplePayCanMakePaymentsProperties();
                mVApplePayInstructions.canMakePaymentsProperties = mVApplePayCanMakePaymentsProperties;
                mVApplePayCanMakePaymentsProperties.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVApplePayPaymentRequestProperties mVApplePayPaymentRequestProperties = new MVApplePayPaymentRequestProperties();
                mVApplePayInstructions.paymentRequestProperties = mVApplePayPaymentRequestProperties;
                mVApplePayPaymentRequestProperties.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayInstructions$d */
    public static class C9595d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9594c(0);
        }
    }

    static {
        new C17394d0("MVApplePayInstructions");
        HashMap hashMap = new HashMap();
        f27087d = hashMap;
        hashMap.put(C25239c.class, new C9593b());
        hashMap.put(C25240d.class, new C9595d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CAN_MAKE_PAYMENTS_PROPERTIES, new FieldMetaData("canMakePaymentsProperties", (byte) 3, new StructMetaData(MVApplePayCanMakePaymentsProperties.class)));
        enumMap.put(_Fields.PAYMENT_REQUEST_PROPERTIES, new FieldMetaData("paymentRequestProperties", (byte) 3, new StructMetaData(MVApplePayPaymentRequestProperties.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27088e = unmodifiableMap;
        FieldMetaData.m61947a(MVApplePayInstructions.class, unmodifiableMap);
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
        ((C25238b) f27087d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27087d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29548a(MVApplePayInstructions mVApplePayInstructions) {
        if (mVApplePayInstructions == null) {
            return false;
        }
        boolean f = mo29551f();
        boolean f2 = mVApplePayInstructions.mo29551f();
        if ((f || f2) && (!f || !f2 || !this.canMakePaymentsProperties.mo29527a(mVApplePayInstructions.canMakePaymentsProperties))) {
            return false;
        }
        boolean g = mo29552g();
        boolean g2 = mVApplePayInstructions.mo29552g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.paymentRequestProperties.mo29575a(mVApplePayInstructions.paymentRequestProperties)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVApplePayInstructions mVApplePayInstructions = (MVApplePayInstructions) obj;
        if (!getClass().equals(mVApplePayInstructions.getClass())) {
            return getClass().getName().compareTo(mVApplePayInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29551f()).compareTo(Boolean.valueOf(mVApplePayInstructions.mo29551f()));
        if (compareTo2 != 0 || ((mo29551f() && (compareTo2 = this.canMakePaymentsProperties.compareTo(mVApplePayInstructions.canMakePaymentsProperties)) != 0) || (compareTo2 = Boolean.valueOf(mo29552g()).compareTo(Boolean.valueOf(mVApplePayInstructions.mo29552g()))) != 0)) {
            return compareTo2;
        }
        if (!mo29552g() || (compareTo = this.paymentRequestProperties.compareTo(mVApplePayInstructions.paymentRequestProperties)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVApplePayInstructions)) {
            return mo29548a((MVApplePayInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29551f() {
        return this.canMakePaymentsProperties != null;
    }

    /* renamed from: g */
    public final boolean mo29552g() {
        return this.paymentRequestProperties != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVApplePayInstructions(", "canMakePaymentsProperties:");
        MVApplePayCanMakePaymentsProperties mVApplePayCanMakePaymentsProperties = this.canMakePaymentsProperties;
        if (mVApplePayCanMakePaymentsProperties == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVApplePayCanMakePaymentsProperties);
        }
        n.append(", ");
        n.append("paymentRequestProperties:");
        MVApplePayPaymentRequestProperties mVApplePayPaymentRequestProperties = this.paymentRequestProperties;
        if (mVApplePayPaymentRequestProperties == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVApplePayPaymentRequestProperties);
        }
        n.append(")");
        return n.toString();
    }
}
