package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethodId;
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

public class MVAddExternalPaymentRequest implements TBase<MVAddExternalPaymentRequest, _Fields>, Serializable, Cloneable, Comparable<MVAddExternalPaymentRequest> {

    /* renamed from: b */
    public static final C25113c f28669b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28670c = new C25113c("paymentMethodId", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28671d = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f28672e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28673f;
    private _Fields[] optionals = {_Fields.PAYMENT_METHOD_ID};
    public String paymentContext;
    public MVPaymentMethodId paymentMethodId;
    public MVCurrencyAmount price;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        PAYMENT_METHOD_ID(2, "paymentMethodId"),
        PRICE(3, InAppPurchaseMetaData.KEY_PRICE);
        
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
            if (i == 2) {
                return PAYMENT_METHOD_ID;
            }
            if (i != 3) {
                return null;
            }
            return PRICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAddExternalPaymentRequest$a */
    public static class C10769a extends C25239c<MVAddExternalPaymentRequest> {
        public C10769a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddExternalPaymentRequest mVAddExternalPaymentRequest = (MVAddExternalPaymentRequest) tBase;
            MVPaymentMethodId mVPaymentMethodId = mVAddExternalPaymentRequest.paymentMethodId;
            C25113c cVar = MVAddExternalPaymentRequest.f28669b;
            gVar.mo61687K();
            if (mVAddExternalPaymentRequest.paymentContext != null) {
                gVar.mo61711x(MVAddExternalPaymentRequest.f28669b);
                gVar.mo61686J(mVAddExternalPaymentRequest.paymentContext);
                gVar.mo61712y();
            }
            if (mVAddExternalPaymentRequest.paymentMethodId != null && mVAddExternalPaymentRequest.mo32318g()) {
                gVar.mo61711x(MVAddExternalPaymentRequest.f28670c);
                mVAddExternalPaymentRequest.paymentMethodId.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAddExternalPaymentRequest.price != null) {
                gVar.mo61711x(MVAddExternalPaymentRequest.f28671d);
                mVAddExternalPaymentRequest.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddExternalPaymentRequest mVAddExternalPaymentRequest = (MVAddExternalPaymentRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPaymentMethodId mVPaymentMethodId = mVAddExternalPaymentRequest.paymentMethodId;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                            mVAddExternalPaymentRequest.price = mVCurrencyAmount;
                            mVCurrencyAmount.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVPaymentMethodId mVPaymentMethodId2 = new MVPaymentMethodId();
                        mVAddExternalPaymentRequest.paymentMethodId = mVPaymentMethodId2;
                        mVPaymentMethodId2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAddExternalPaymentRequest.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAddExternalPaymentRequest$b */
    public static class C10770b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10769a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAddExternalPaymentRequest$c */
    public static class C10771c extends C25240d<MVAddExternalPaymentRequest> {
        public C10771c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddExternalPaymentRequest mVAddExternalPaymentRequest = (MVAddExternalPaymentRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAddExternalPaymentRequest.mo32317f()) {
                bitSet.set(0);
            }
            if (mVAddExternalPaymentRequest.mo32318g()) {
                bitSet.set(1);
            }
            if (mVAddExternalPaymentRequest.mo32319h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVAddExternalPaymentRequest.mo32317f()) {
                jVar.mo61686J(mVAddExternalPaymentRequest.paymentContext);
            }
            if (mVAddExternalPaymentRequest.mo32318g()) {
                mVAddExternalPaymentRequest.paymentMethodId.mo25202X0(jVar);
            }
            if (mVAddExternalPaymentRequest.mo32319h()) {
                mVAddExternalPaymentRequest.price.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddExternalPaymentRequest mVAddExternalPaymentRequest = (MVAddExternalPaymentRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVAddExternalPaymentRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVPaymentMethodId mVPaymentMethodId = new MVPaymentMethodId();
                mVAddExternalPaymentRequest.paymentMethodId = mVPaymentMethodId;
                mVPaymentMethodId.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVAddExternalPaymentRequest.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAddExternalPaymentRequest$d */
    public static class C10772d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10771c(0);
        }
    }

    static {
        new C17394d0("MVAddExternalPaymentRequest");
        HashMap hashMap = new HashMap();
        f28672e = hashMap;
        hashMap.put(C25239c.class, new C10770b());
        hashMap.put(C25240d.class, new C10772d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_METHOD_ID, new FieldMetaData("paymentMethodId", (byte) 2, new StructMetaData(MVPaymentMethodId.class)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28673f = unmodifiableMap;
        FieldMetaData.m61947a(MVAddExternalPaymentRequest.class, unmodifiableMap);
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
        ((C25238b) f28672e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28672e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAddExternalPaymentRequest mVAddExternalPaymentRequest = (MVAddExternalPaymentRequest) obj;
        if (!getClass().equals(mVAddExternalPaymentRequest.getClass())) {
            return getClass().getName().compareTo(mVAddExternalPaymentRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32317f()).compareTo(Boolean.valueOf(mVAddExternalPaymentRequest.mo32317f()));
        if (compareTo2 != 0 || ((mo32317f() && (compareTo2 = this.paymentContext.compareTo(mVAddExternalPaymentRequest.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo32318g()).compareTo(Boolean.valueOf(mVAddExternalPaymentRequest.mo32318g()))) != 0 || ((mo32318g() && (compareTo2 = this.paymentMethodId.compareTo(mVAddExternalPaymentRequest.paymentMethodId)) != 0) || (compareTo2 = Boolean.valueOf(mo32319h()).compareTo(Boolean.valueOf(mVAddExternalPaymentRequest.mo32319h()))) != 0))) {
            return compareTo2;
        }
        if (!mo32319h() || (compareTo = this.price.compareTo(mVAddExternalPaymentRequest.price)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAddExternalPaymentRequest)) {
            return false;
        }
        MVAddExternalPaymentRequest mVAddExternalPaymentRequest = (MVAddExternalPaymentRequest) obj;
        boolean f = mo32317f();
        boolean f2 = mVAddExternalPaymentRequest.mo32317f();
        if ((f || f2) && (!f || !f2 || !this.paymentContext.equals(mVAddExternalPaymentRequest.paymentContext))) {
            return false;
        }
        boolean g = mo32318g();
        boolean g2 = mVAddExternalPaymentRequest.mo32318g();
        if ((g || g2) && (!g || !g2 || !this.paymentMethodId.mo30243a(mVAddExternalPaymentRequest.paymentMethodId))) {
            return false;
        }
        boolean h = mo32319h();
        boolean h2 = mVAddExternalPaymentRequest.mo32319h();
        if ((h || h2) && (!h || !h2 || !this.price.mo26102a(mVAddExternalPaymentRequest.price))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32317f() {
        return this.paymentContext != null;
    }

    /* renamed from: g */
    public final boolean mo32318g() {
        return this.paymentMethodId != null;
    }

    /* renamed from: h */
    public final boolean mo32319h() {
        return this.price != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAddExternalPaymentRequest(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo32318g()) {
            n.append(", ");
            n.append("paymentMethodId:");
            MVPaymentMethodId mVPaymentMethodId = this.paymentMethodId;
            if (mVPaymentMethodId == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentMethodId);
            }
        }
        n.append(", ");
        n.append("price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(")");
        return n.toString();
    }
}
