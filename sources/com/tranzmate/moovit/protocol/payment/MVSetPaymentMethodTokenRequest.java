package com.tranzmate.moovit.protocol.payment;

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
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVSetPaymentMethodTokenRequest implements TBase<MVSetPaymentMethodTokenRequest, _Fields>, Serializable, Cloneable, Comparable<MVSetPaymentMethodTokenRequest> {

    /* renamed from: b */
    public static final C25113c f26883b = new C25113c("paymentMethodToken", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26884c = new C25113c("cardDetails", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26885d = new C25113c("customerId", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26886e = new C25113c("makeDefaultPaymentMethod", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f26887f = new C25113c("paymentContext", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f26888g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26889h;
    private byte __isset_bitfield = 0;
    public MVCardDetails cardDetails;
    public String customerId;
    public boolean makeDefaultPaymentMethod;
    private _Fields[] optionals = {_Fields.PAYMENT_CONTEXT};
    public String paymentContext;
    public String paymentMethodToken;

    public enum _Fields implements C25085c {
        PAYMENT_METHOD_TOKEN(1, "paymentMethodToken"),
        CARD_DETAILS(2, "cardDetails"),
        CUSTOMER_ID(3, "customerId"),
        MAKE_DEFAULT_PAYMENT_METHOD(4, "makeDefaultPaymentMethod"),
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
                return PAYMENT_METHOD_TOKEN;
            }
            if (i == 2) {
                return CARD_DETAILS;
            }
            if (i == 3) {
                return CUSTOMER_ID;
            }
            if (i == 4) {
                return MAKE_DEFAULT_PAYMENT_METHOD;
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

    /* renamed from: com.tranzmate.moovit.protocol.payment.MVSetPaymentMethodTokenRequest$a */
    public static class C9453a extends C25239c<MVSetPaymentMethodTokenRequest> {
        public C9453a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetPaymentMethodTokenRequest mVSetPaymentMethodTokenRequest = (MVSetPaymentMethodTokenRequest) tBase;
            MVCardDetails mVCardDetails = mVSetPaymentMethodTokenRequest.cardDetails;
            C25113c cVar = MVSetPaymentMethodTokenRequest.f26883b;
            gVar.mo61687K();
            if (mVSetPaymentMethodTokenRequest.paymentMethodToken != null) {
                gVar.mo61711x(MVSetPaymentMethodTokenRequest.f26883b);
                gVar.mo61686J(mVSetPaymentMethodTokenRequest.paymentMethodToken);
                gVar.mo61712y();
            }
            if (mVSetPaymentMethodTokenRequest.cardDetails != null) {
                gVar.mo61711x(MVSetPaymentMethodTokenRequest.f26884c);
                mVSetPaymentMethodTokenRequest.cardDetails.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSetPaymentMethodTokenRequest.customerId != null) {
                gVar.mo61711x(MVSetPaymentMethodTokenRequest.f26885d);
                gVar.mo61686J(mVSetPaymentMethodTokenRequest.customerId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSetPaymentMethodTokenRequest.f26886e);
            gVar.mo61708u(mVSetPaymentMethodTokenRequest.makeDefaultPaymentMethod);
            gVar.mo61712y();
            if (mVSetPaymentMethodTokenRequest.paymentContext != null && mVSetPaymentMethodTokenRequest.mo29251i()) {
                gVar.mo61711x(MVSetPaymentMethodTokenRequest.f26887f);
                gVar.mo61686J(mVSetPaymentMethodTokenRequest.paymentContext);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetPaymentMethodTokenRequest mVSetPaymentMethodTokenRequest = (MVSetPaymentMethodTokenRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCardDetails mVCardDetails = mVSetPaymentMethodTokenRequest.cardDetails;
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
                                    mVSetPaymentMethodTokenRequest.paymentContext = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 2) {
                                mVSetPaymentMethodTokenRequest.makeDefaultPaymentMethod = gVar.mo61690c();
                                mVSetPaymentMethodTokenRequest.mo29253k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVSetPaymentMethodTokenRequest.customerId = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCardDetails mVCardDetails2 = new MVCardDetails();
                        mVSetPaymentMethodTokenRequest.cardDetails = mVCardDetails2;
                        mVCardDetails2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVSetPaymentMethodTokenRequest.paymentMethodToken = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payment.MVSetPaymentMethodTokenRequest$b */
    public static class C9454b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9453a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payment.MVSetPaymentMethodTokenRequest$c */
    public static class C9455c extends C25240d<MVSetPaymentMethodTokenRequest> {
        public C9455c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetPaymentMethodTokenRequest mVSetPaymentMethodTokenRequest = (MVSetPaymentMethodTokenRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSetPaymentMethodTokenRequest.mo29252j()) {
                bitSet.set(0);
            }
            if (mVSetPaymentMethodTokenRequest.mo29247f()) {
                bitSet.set(1);
            }
            if (mVSetPaymentMethodTokenRequest.mo29248g()) {
                bitSet.set(2);
            }
            if (mVSetPaymentMethodTokenRequest.mo29249h()) {
                bitSet.set(3);
            }
            if (mVSetPaymentMethodTokenRequest.mo29251i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVSetPaymentMethodTokenRequest.mo29252j()) {
                jVar.mo61686J(mVSetPaymentMethodTokenRequest.paymentMethodToken);
            }
            if (mVSetPaymentMethodTokenRequest.mo29247f()) {
                mVSetPaymentMethodTokenRequest.cardDetails.mo25202X0(jVar);
            }
            if (mVSetPaymentMethodTokenRequest.mo29248g()) {
                jVar.mo61686J(mVSetPaymentMethodTokenRequest.customerId);
            }
            if (mVSetPaymentMethodTokenRequest.mo29249h()) {
                jVar.mo61708u(mVSetPaymentMethodTokenRequest.makeDefaultPaymentMethod);
            }
            if (mVSetPaymentMethodTokenRequest.mo29251i()) {
                jVar.mo61686J(mVSetPaymentMethodTokenRequest.paymentContext);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetPaymentMethodTokenRequest mVSetPaymentMethodTokenRequest = (MVSetPaymentMethodTokenRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVSetPaymentMethodTokenRequest.paymentMethodToken = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVCardDetails mVCardDetails = new MVCardDetails();
                mVSetPaymentMethodTokenRequest.cardDetails = mVCardDetails;
                mVCardDetails.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVSetPaymentMethodTokenRequest.customerId = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVSetPaymentMethodTokenRequest.makeDefaultPaymentMethod = jVar.mo61690c();
                mVSetPaymentMethodTokenRequest.mo29253k();
            }
            if (T.get(4)) {
                mVSetPaymentMethodTokenRequest.paymentContext = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payment.MVSetPaymentMethodTokenRequest$d */
    public static class C9456d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9455c(0);
        }
    }

    static {
        new C17394d0("MVSetPaymentMethodTokenRequest");
        HashMap hashMap = new HashMap();
        f26888g = hashMap;
        hashMap.put(C25239c.class, new C9454b());
        hashMap.put(C25240d.class, new C9456d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_METHOD_TOKEN, new FieldMetaData("paymentMethodToken", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CARD_DETAILS, new FieldMetaData("cardDetails", (byte) 3, new StructMetaData(MVCardDetails.class)));
        enumMap.put(_Fields.CUSTOMER_ID, new FieldMetaData("customerId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MAKE_DEFAULT_PAYMENT_METHOD, new FieldMetaData("makeDefaultPaymentMethod", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26889h = unmodifiableMap;
        FieldMetaData.m61947a(MVSetPaymentMethodTokenRequest.class, unmodifiableMap);
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
        ((C25238b) f26888g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26888g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSetPaymentMethodTokenRequest mVSetPaymentMethodTokenRequest = (MVSetPaymentMethodTokenRequest) obj;
        if (!getClass().equals(mVSetPaymentMethodTokenRequest.getClass())) {
            return getClass().getName().compareTo(mVSetPaymentMethodTokenRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29252j()).compareTo(Boolean.valueOf(mVSetPaymentMethodTokenRequest.mo29252j()));
        if (compareTo2 != 0 || ((mo29252j() && (compareTo2 = this.paymentMethodToken.compareTo(mVSetPaymentMethodTokenRequest.paymentMethodToken)) != 0) || (compareTo2 = Boolean.valueOf(mo29247f()).compareTo(Boolean.valueOf(mVSetPaymentMethodTokenRequest.mo29247f()))) != 0 || ((mo29247f() && (compareTo2 = this.cardDetails.compareTo(mVSetPaymentMethodTokenRequest.cardDetails)) != 0) || (compareTo2 = Boolean.valueOf(mo29248g()).compareTo(Boolean.valueOf(mVSetPaymentMethodTokenRequest.mo29248g()))) != 0 || ((mo29248g() && (compareTo2 = this.customerId.compareTo(mVSetPaymentMethodTokenRequest.customerId)) != 0) || (compareTo2 = Boolean.valueOf(mo29249h()).compareTo(Boolean.valueOf(mVSetPaymentMethodTokenRequest.mo29249h()))) != 0 || ((mo29249h() && (compareTo2 = C25082a.m62848l(this.makeDefaultPaymentMethod, mVSetPaymentMethodTokenRequest.makeDefaultPaymentMethod)) != 0) || (compareTo2 = Boolean.valueOf(mo29251i()).compareTo(Boolean.valueOf(mVSetPaymentMethodTokenRequest.mo29251i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo29251i() || (compareTo = this.paymentContext.compareTo(mVSetPaymentMethodTokenRequest.paymentContext)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSetPaymentMethodTokenRequest)) {
            return false;
        }
        MVSetPaymentMethodTokenRequest mVSetPaymentMethodTokenRequest = (MVSetPaymentMethodTokenRequest) obj;
        boolean j = mo29252j();
        boolean j2 = mVSetPaymentMethodTokenRequest.mo29252j();
        if ((j || j2) && (!j || !j2 || !this.paymentMethodToken.equals(mVSetPaymentMethodTokenRequest.paymentMethodToken))) {
            return false;
        }
        boolean f = mo29247f();
        boolean f2 = mVSetPaymentMethodTokenRequest.mo29247f();
        if ((f || f2) && (!f || !f2 || !this.cardDetails.mo29227a(mVSetPaymentMethodTokenRequest.cardDetails))) {
            return false;
        }
        boolean g = mo29248g();
        boolean g2 = mVSetPaymentMethodTokenRequest.mo29248g();
        if (((g || g2) && (!g || !g2 || !this.customerId.equals(mVSetPaymentMethodTokenRequest.customerId))) || this.makeDefaultPaymentMethod != mVSetPaymentMethodTokenRequest.makeDefaultPaymentMethod) {
            return false;
        }
        boolean i = mo29251i();
        boolean i2 = mVSetPaymentMethodTokenRequest.mo29251i();
        if ((i || i2) && (!i || !i2 || !this.paymentContext.equals(mVSetPaymentMethodTokenRequest.paymentContext))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29247f() {
        return this.cardDetails != null;
    }

    /* renamed from: g */
    public final boolean mo29248g() {
        return this.customerId != null;
    }

    /* renamed from: h */
    public final boolean mo29249h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29251i() {
        return this.paymentContext != null;
    }

    /* renamed from: j */
    public final boolean mo29252j() {
        return this.paymentMethodToken != null;
    }

    /* renamed from: k */
    public final void mo29253k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSetPaymentMethodTokenRequest(", "paymentMethodToken:");
        String str = this.paymentMethodToken;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("cardDetails:");
        MVCardDetails mVCardDetails = this.cardDetails;
        if (mVCardDetails == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCardDetails);
        }
        n.append(", ");
        n.append("customerId:");
        String str2 = this.customerId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("makeDefaultPaymentMethod:");
        n.append(this.makeDefaultPaymentMethod);
        if (mo29251i()) {
            n.append(", ");
            n.append("paymentContext:");
            String str3 = this.paymentContext;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }
}
