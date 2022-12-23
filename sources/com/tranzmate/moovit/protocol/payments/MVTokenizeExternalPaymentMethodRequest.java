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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVTokenizeExternalPaymentMethodRequest implements TBase<MVTokenizeExternalPaymentMethodRequest, _Fields>, Serializable, Cloneable, Comparable<MVTokenizeExternalPaymentMethodRequest> {

    /* renamed from: b */
    public static final C25113c f27750b = new C25113c("clearanceProvider", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27751c = new C25113c("returnUrls", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27752d = new C25113c("paymentMethodType", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27753e = new C25113c("paymentProperties", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f27754f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27755g;
    public MVClearanceProviderType clearanceProvider;
    private _Fields[] optionals = {_Fields.PAYMENT_PROPERTIES};
    public String paymentMethodType;
    public MVPaymentProperties paymentProperties;
    public MVTokenizeReturnUrls returnUrls;

    public enum _Fields implements C25085c {
        CLEARANCE_PROVIDER(1, "clearanceProvider"),
        RETURN_URLS(2, "returnUrls"),
        PAYMENT_METHOD_TYPE(3, "paymentMethodType"),
        PAYMENT_PROPERTIES(4, "paymentProperties");
        
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
                return CLEARANCE_PROVIDER;
            }
            if (i == 2) {
                return RETURN_URLS;
            }
            if (i == 3) {
                return PAYMENT_METHOD_TYPE;
            }
            if (i != 4) {
                return null;
            }
            return PAYMENT_PROPERTIES;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeExternalPaymentMethodRequest$a */
    public static class C10101a extends C25239c<MVTokenizeExternalPaymentMethodRequest> {
        public C10101a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeExternalPaymentMethodRequest mVTokenizeExternalPaymentMethodRequest = (MVTokenizeExternalPaymentMethodRequest) tBase;
            mVTokenizeExternalPaymentMethodRequest.getClass();
            C25113c cVar = MVTokenizeExternalPaymentMethodRequest.f27750b;
            gVar.mo61687K();
            if (mVTokenizeExternalPaymentMethodRequest.clearanceProvider != null) {
                gVar.mo61711x(MVTokenizeExternalPaymentMethodRequest.f27750b);
                gVar.mo61678B(mVTokenizeExternalPaymentMethodRequest.clearanceProvider.getValue());
                gVar.mo61712y();
            }
            if (mVTokenizeExternalPaymentMethodRequest.returnUrls != null) {
                gVar.mo61711x(MVTokenizeExternalPaymentMethodRequest.f27751c);
                mVTokenizeExternalPaymentMethodRequest.returnUrls.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTokenizeExternalPaymentMethodRequest.paymentMethodType != null) {
                gVar.mo61711x(MVTokenizeExternalPaymentMethodRequest.f27752d);
                gVar.mo61686J(mVTokenizeExternalPaymentMethodRequest.paymentMethodType);
                gVar.mo61712y();
            }
            if (mVTokenizeExternalPaymentMethodRequest.paymentProperties != null && mVTokenizeExternalPaymentMethodRequest.mo30681h()) {
                gVar.mo61711x(MVTokenizeExternalPaymentMethodRequest.f27753e);
                mVTokenizeExternalPaymentMethodRequest.paymentProperties.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeExternalPaymentMethodRequest mVTokenizeExternalPaymentMethodRequest = (MVTokenizeExternalPaymentMethodRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTokenizeExternalPaymentMethodRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVPaymentProperties mVPaymentProperties = new MVPaymentProperties();
                                mVTokenizeExternalPaymentMethodRequest.paymentProperties = mVPaymentProperties;
                                mVPaymentProperties.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVTokenizeExternalPaymentMethodRequest.paymentMethodType = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls();
                        mVTokenizeExternalPaymentMethodRequest.returnUrls = mVTokenizeReturnUrls;
                        mVTokenizeReturnUrls.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTokenizeExternalPaymentMethodRequest.clearanceProvider = MVClearanceProviderType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeExternalPaymentMethodRequest$b */
    public static class C10102b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10101a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeExternalPaymentMethodRequest$c */
    public static class C10103c extends C25240d<MVTokenizeExternalPaymentMethodRequest> {
        public C10103c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeExternalPaymentMethodRequest mVTokenizeExternalPaymentMethodRequest = (MVTokenizeExternalPaymentMethodRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTokenizeExternalPaymentMethodRequest.mo30679f()) {
                bitSet.set(0);
            }
            if (mVTokenizeExternalPaymentMethodRequest.mo30683i()) {
                bitSet.set(1);
            }
            if (mVTokenizeExternalPaymentMethodRequest.mo30680g()) {
                bitSet.set(2);
            }
            if (mVTokenizeExternalPaymentMethodRequest.mo30681h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTokenizeExternalPaymentMethodRequest.mo30679f()) {
                jVar.mo61678B(mVTokenizeExternalPaymentMethodRequest.clearanceProvider.getValue());
            }
            if (mVTokenizeExternalPaymentMethodRequest.mo30683i()) {
                mVTokenizeExternalPaymentMethodRequest.returnUrls.mo25202X0(jVar);
            }
            if (mVTokenizeExternalPaymentMethodRequest.mo30680g()) {
                jVar.mo61686J(mVTokenizeExternalPaymentMethodRequest.paymentMethodType);
            }
            if (mVTokenizeExternalPaymentMethodRequest.mo30681h()) {
                mVTokenizeExternalPaymentMethodRequest.paymentProperties.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeExternalPaymentMethodRequest mVTokenizeExternalPaymentMethodRequest = (MVTokenizeExternalPaymentMethodRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTokenizeExternalPaymentMethodRequest.clearanceProvider = MVClearanceProviderType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls();
                mVTokenizeExternalPaymentMethodRequest.returnUrls = mVTokenizeReturnUrls;
                mVTokenizeReturnUrls.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVTokenizeExternalPaymentMethodRequest.paymentMethodType = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVPaymentProperties mVPaymentProperties = new MVPaymentProperties();
                mVTokenizeExternalPaymentMethodRequest.paymentProperties = mVPaymentProperties;
                mVPaymentProperties.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeExternalPaymentMethodRequest$d */
    public static class C10104d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10103c(0);
        }
    }

    static {
        new C17394d0("MVTokenizeExternalPaymentMethodRequest");
        HashMap hashMap = new HashMap();
        f27754f = hashMap;
        hashMap.put(C25239c.class, new C10102b());
        hashMap.put(C25240d.class, new C10104d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CLEARANCE_PROVIDER, new FieldMetaData("clearanceProvider", (byte) 3, new EnumMetaData(MVClearanceProviderType.class)));
        enumMap.put(_Fields.RETURN_URLS, new FieldMetaData("returnUrls", (byte) 3, new StructMetaData(MVTokenizeReturnUrls.class)));
        enumMap.put(_Fields.PAYMENT_METHOD_TYPE, new FieldMetaData("paymentMethodType", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_PROPERTIES, new FieldMetaData("paymentProperties", (byte) 2, new StructMetaData(MVPaymentProperties.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27755g = unmodifiableMap;
        FieldMetaData.m61947a(MVTokenizeExternalPaymentMethodRequest.class, unmodifiableMap);
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
        ((C25238b) f27754f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27754f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTokenizeExternalPaymentMethodRequest mVTokenizeExternalPaymentMethodRequest = (MVTokenizeExternalPaymentMethodRequest) obj;
        if (!getClass().equals(mVTokenizeExternalPaymentMethodRequest.getClass())) {
            return getClass().getName().compareTo(mVTokenizeExternalPaymentMethodRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30679f()).compareTo(Boolean.valueOf(mVTokenizeExternalPaymentMethodRequest.mo30679f()));
        if (compareTo2 != 0 || ((mo30679f() && (compareTo2 = this.clearanceProvider.compareTo(mVTokenizeExternalPaymentMethodRequest.clearanceProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo30683i()).compareTo(Boolean.valueOf(mVTokenizeExternalPaymentMethodRequest.mo30683i()))) != 0 || ((mo30683i() && (compareTo2 = this.returnUrls.compareTo(mVTokenizeExternalPaymentMethodRequest.returnUrls)) != 0) || (compareTo2 = Boolean.valueOf(mo30680g()).compareTo(Boolean.valueOf(mVTokenizeExternalPaymentMethodRequest.mo30680g()))) != 0 || ((mo30680g() && (compareTo2 = this.paymentMethodType.compareTo(mVTokenizeExternalPaymentMethodRequest.paymentMethodType)) != 0) || (compareTo2 = Boolean.valueOf(mo30681h()).compareTo(Boolean.valueOf(mVTokenizeExternalPaymentMethodRequest.mo30681h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo30681h() || (compareTo = this.paymentProperties.compareTo(mVTokenizeExternalPaymentMethodRequest.paymentProperties)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTokenizeExternalPaymentMethodRequest)) {
            return false;
        }
        MVTokenizeExternalPaymentMethodRequest mVTokenizeExternalPaymentMethodRequest = (MVTokenizeExternalPaymentMethodRequest) obj;
        boolean f = mo30679f();
        boolean f2 = mVTokenizeExternalPaymentMethodRequest.mo30679f();
        if ((f || f2) && (!f || !f2 || !this.clearanceProvider.equals(mVTokenizeExternalPaymentMethodRequest.clearanceProvider))) {
            return false;
        }
        boolean i = mo30683i();
        boolean i2 = mVTokenizeExternalPaymentMethodRequest.mo30683i();
        if ((i || i2) && (!i || !i2 || !this.returnUrls.mo30695a(mVTokenizeExternalPaymentMethodRequest.returnUrls))) {
            return false;
        }
        boolean g = mo30680g();
        boolean g2 = mVTokenizeExternalPaymentMethodRequest.mo30680g();
        if ((g || g2) && (!g || !g2 || !this.paymentMethodType.equals(mVTokenizeExternalPaymentMethodRequest.paymentMethodType))) {
            return false;
        }
        boolean h = mo30681h();
        boolean h2 = mVTokenizeExternalPaymentMethodRequest.mo30681h();
        if ((h || h2) && (!h || !h2 || !this.paymentProperties.mo30284a(mVTokenizeExternalPaymentMethodRequest.paymentProperties))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30679f() {
        return this.clearanceProvider != null;
    }

    /* renamed from: g */
    public final boolean mo30680g() {
        return this.paymentMethodType != null;
    }

    /* renamed from: h */
    public final boolean mo30681h() {
        return this.paymentProperties != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30683i() {
        return this.returnUrls != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTokenizeExternalPaymentMethodRequest(", "clearanceProvider:");
        MVClearanceProviderType mVClearanceProviderType = this.clearanceProvider;
        if (mVClearanceProviderType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVClearanceProviderType);
        }
        n.append(", ");
        n.append("returnUrls:");
        MVTokenizeReturnUrls mVTokenizeReturnUrls = this.returnUrls;
        if (mVTokenizeReturnUrls == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTokenizeReturnUrls);
        }
        n.append(", ");
        n.append("paymentMethodType:");
        String str = this.paymentMethodType;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo30681h()) {
            n.append(", ");
            n.append("paymentProperties:");
            MVPaymentProperties mVPaymentProperties = this.paymentProperties;
            if (mVPaymentProperties == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentProperties);
            }
        }
        n.append(")");
        return n.toString();
    }
}
