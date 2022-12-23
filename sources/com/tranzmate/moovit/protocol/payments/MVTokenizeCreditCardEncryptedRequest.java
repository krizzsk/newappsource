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

public class MVTokenizeCreditCardEncryptedRequest implements TBase<MVTokenizeCreditCardEncryptedRequest, _Fields>, Serializable, Cloneable, Comparable<MVTokenizeCreditCardEncryptedRequest> {

    /* renamed from: b */
    public static final C25113c f27737b = new C25113c("clearanceProvider", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27738c = new C25113c("returnUrls", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27739d = new C25113c("encryptedData", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27740e = new C25113c("cardType", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f27741f = new C25113c("paymentProperties", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f27742g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27743h;
    public MVCardType cardType;
    public MVClearanceProviderType clearanceProvider;
    public String encryptedData;
    private _Fields[] optionals = {_Fields.PAYMENT_PROPERTIES};
    public MVPaymentProperties paymentProperties;
    public MVTokenizeReturnUrls returnUrls;

    public enum _Fields implements C25085c {
        CLEARANCE_PROVIDER(1, "clearanceProvider"),
        RETURN_URLS(2, "returnUrls"),
        ENCRYPTED_DATA(3, "encryptedData"),
        CARD_TYPE(4, "cardType"),
        PAYMENT_PROPERTIES(5, "paymentProperties");
        
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
                return ENCRYPTED_DATA;
            }
            if (i == 4) {
                return CARD_TYPE;
            }
            if (i != 5) {
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeCreditCardEncryptedRequest$a */
    public static class C10093a extends C25239c<MVTokenizeCreditCardEncryptedRequest> {
        public C10093a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeCreditCardEncryptedRequest mVTokenizeCreditCardEncryptedRequest = (MVTokenizeCreditCardEncryptedRequest) tBase;
            mVTokenizeCreditCardEncryptedRequest.getClass();
            C25113c cVar = MVTokenizeCreditCardEncryptedRequest.f27737b;
            gVar.mo61687K();
            if (mVTokenizeCreditCardEncryptedRequest.clearanceProvider != null) {
                gVar.mo61711x(MVTokenizeCreditCardEncryptedRequest.f27737b);
                gVar.mo61678B(mVTokenizeCreditCardEncryptedRequest.clearanceProvider.getValue());
                gVar.mo61712y();
            }
            if (mVTokenizeCreditCardEncryptedRequest.returnUrls != null) {
                gVar.mo61711x(MVTokenizeCreditCardEncryptedRequest.f27738c);
                mVTokenizeCreditCardEncryptedRequest.returnUrls.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTokenizeCreditCardEncryptedRequest.encryptedData != null) {
                gVar.mo61711x(MVTokenizeCreditCardEncryptedRequest.f27739d);
                gVar.mo61686J(mVTokenizeCreditCardEncryptedRequest.encryptedData);
                gVar.mo61712y();
            }
            if (mVTokenizeCreditCardEncryptedRequest.cardType != null) {
                gVar.mo61711x(MVTokenizeCreditCardEncryptedRequest.f27740e);
                gVar.mo61678B(mVTokenizeCreditCardEncryptedRequest.cardType.getValue());
                gVar.mo61712y();
            }
            if (mVTokenizeCreditCardEncryptedRequest.paymentProperties != null && mVTokenizeCreditCardEncryptedRequest.mo30664i()) {
                gVar.mo61711x(MVTokenizeCreditCardEncryptedRequest.f27741f);
                mVTokenizeCreditCardEncryptedRequest.paymentProperties.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeCreditCardEncryptedRequest mVTokenizeCreditCardEncryptedRequest = (MVTokenizeCreditCardEncryptedRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTokenizeCreditCardEncryptedRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVPaymentProperties mVPaymentProperties = new MVPaymentProperties();
                                    mVTokenizeCreditCardEncryptedRequest.paymentProperties = mVPaymentProperties;
                                    mVPaymentProperties.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVTokenizeCreditCardEncryptedRequest.cardType = MVCardType.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVTokenizeCreditCardEncryptedRequest.encryptedData = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls();
                        mVTokenizeCreditCardEncryptedRequest.returnUrls = mVTokenizeReturnUrls;
                        mVTokenizeReturnUrls.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTokenizeCreditCardEncryptedRequest.clearanceProvider = MVClearanceProviderType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeCreditCardEncryptedRequest$b */
    public static class C10094b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10093a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeCreditCardEncryptedRequest$c */
    public static class C10095c extends C25240d<MVTokenizeCreditCardEncryptedRequest> {
        public C10095c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeCreditCardEncryptedRequest mVTokenizeCreditCardEncryptedRequest = (MVTokenizeCreditCardEncryptedRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTokenizeCreditCardEncryptedRequest.mo30661g()) {
                bitSet.set(0);
            }
            if (mVTokenizeCreditCardEncryptedRequest.mo30665j()) {
                bitSet.set(1);
            }
            if (mVTokenizeCreditCardEncryptedRequest.mo30662h()) {
                bitSet.set(2);
            }
            if (mVTokenizeCreditCardEncryptedRequest.mo30660f()) {
                bitSet.set(3);
            }
            if (mVTokenizeCreditCardEncryptedRequest.mo30664i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVTokenizeCreditCardEncryptedRequest.mo30661g()) {
                jVar.mo61678B(mVTokenizeCreditCardEncryptedRequest.clearanceProvider.getValue());
            }
            if (mVTokenizeCreditCardEncryptedRequest.mo30665j()) {
                mVTokenizeCreditCardEncryptedRequest.returnUrls.mo25202X0(jVar);
            }
            if (mVTokenizeCreditCardEncryptedRequest.mo30662h()) {
                jVar.mo61686J(mVTokenizeCreditCardEncryptedRequest.encryptedData);
            }
            if (mVTokenizeCreditCardEncryptedRequest.mo30660f()) {
                jVar.mo61678B(mVTokenizeCreditCardEncryptedRequest.cardType.getValue());
            }
            if (mVTokenizeCreditCardEncryptedRequest.mo30664i()) {
                mVTokenizeCreditCardEncryptedRequest.paymentProperties.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeCreditCardEncryptedRequest mVTokenizeCreditCardEncryptedRequest = (MVTokenizeCreditCardEncryptedRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVTokenizeCreditCardEncryptedRequest.clearanceProvider = MVClearanceProviderType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls();
                mVTokenizeCreditCardEncryptedRequest.returnUrls = mVTokenizeReturnUrls;
                mVTokenizeReturnUrls.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVTokenizeCreditCardEncryptedRequest.encryptedData = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVTokenizeCreditCardEncryptedRequest.cardType = MVCardType.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                MVPaymentProperties mVPaymentProperties = new MVPaymentProperties();
                mVTokenizeCreditCardEncryptedRequest.paymentProperties = mVPaymentProperties;
                mVPaymentProperties.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeCreditCardEncryptedRequest$d */
    public static class C10096d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10095c(0);
        }
    }

    static {
        new C17394d0("MVTokenizeCreditCardEncryptedRequest");
        HashMap hashMap = new HashMap();
        f27742g = hashMap;
        hashMap.put(C25239c.class, new C10094b());
        hashMap.put(C25240d.class, new C10096d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CLEARANCE_PROVIDER, new FieldMetaData("clearanceProvider", (byte) 3, new EnumMetaData(MVClearanceProviderType.class)));
        enumMap.put(_Fields.RETURN_URLS, new FieldMetaData("returnUrls", (byte) 3, new StructMetaData(MVTokenizeReturnUrls.class)));
        enumMap.put(_Fields.ENCRYPTED_DATA, new FieldMetaData("encryptedData", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CARD_TYPE, new FieldMetaData("cardType", (byte) 3, new EnumMetaData(MVCardType.class)));
        enumMap.put(_Fields.PAYMENT_PROPERTIES, new FieldMetaData("paymentProperties", (byte) 2, new StructMetaData(MVPaymentProperties.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27743h = unmodifiableMap;
        FieldMetaData.m61947a(MVTokenizeCreditCardEncryptedRequest.class, unmodifiableMap);
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
        ((C25238b) f27742g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27742g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTokenizeCreditCardEncryptedRequest mVTokenizeCreditCardEncryptedRequest = (MVTokenizeCreditCardEncryptedRequest) obj;
        if (!getClass().equals(mVTokenizeCreditCardEncryptedRequest.getClass())) {
            return getClass().getName().compareTo(mVTokenizeCreditCardEncryptedRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30661g()).compareTo(Boolean.valueOf(mVTokenizeCreditCardEncryptedRequest.mo30661g()));
        if (compareTo2 != 0 || ((mo30661g() && (compareTo2 = this.clearanceProvider.compareTo(mVTokenizeCreditCardEncryptedRequest.clearanceProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo30665j()).compareTo(Boolean.valueOf(mVTokenizeCreditCardEncryptedRequest.mo30665j()))) != 0 || ((mo30665j() && (compareTo2 = this.returnUrls.compareTo(mVTokenizeCreditCardEncryptedRequest.returnUrls)) != 0) || (compareTo2 = Boolean.valueOf(mo30662h()).compareTo(Boolean.valueOf(mVTokenizeCreditCardEncryptedRequest.mo30662h()))) != 0 || ((mo30662h() && (compareTo2 = this.encryptedData.compareTo(mVTokenizeCreditCardEncryptedRequest.encryptedData)) != 0) || (compareTo2 = Boolean.valueOf(mo30660f()).compareTo(Boolean.valueOf(mVTokenizeCreditCardEncryptedRequest.mo30660f()))) != 0 || ((mo30660f() && (compareTo2 = this.cardType.compareTo(mVTokenizeCreditCardEncryptedRequest.cardType)) != 0) || (compareTo2 = Boolean.valueOf(mo30664i()).compareTo(Boolean.valueOf(mVTokenizeCreditCardEncryptedRequest.mo30664i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo30664i() || (compareTo = this.paymentProperties.compareTo(mVTokenizeCreditCardEncryptedRequest.paymentProperties)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTokenizeCreditCardEncryptedRequest)) {
            return false;
        }
        MVTokenizeCreditCardEncryptedRequest mVTokenizeCreditCardEncryptedRequest = (MVTokenizeCreditCardEncryptedRequest) obj;
        boolean g = mo30661g();
        boolean g2 = mVTokenizeCreditCardEncryptedRequest.mo30661g();
        if ((g || g2) && (!g || !g2 || !this.clearanceProvider.equals(mVTokenizeCreditCardEncryptedRequest.clearanceProvider))) {
            return false;
        }
        boolean j = mo30665j();
        boolean j2 = mVTokenizeCreditCardEncryptedRequest.mo30665j();
        if ((j || j2) && (!j || !j2 || !this.returnUrls.mo30695a(mVTokenizeCreditCardEncryptedRequest.returnUrls))) {
            return false;
        }
        boolean h = mo30662h();
        boolean h2 = mVTokenizeCreditCardEncryptedRequest.mo30662h();
        if ((h || h2) && (!h || !h2 || !this.encryptedData.equals(mVTokenizeCreditCardEncryptedRequest.encryptedData))) {
            return false;
        }
        boolean f = mo30660f();
        boolean f2 = mVTokenizeCreditCardEncryptedRequest.mo30660f();
        if ((f || f2) && (!f || !f2 || !this.cardType.equals(mVTokenizeCreditCardEncryptedRequest.cardType))) {
            return false;
        }
        boolean i = mo30664i();
        boolean i2 = mVTokenizeCreditCardEncryptedRequest.mo30664i();
        if ((i || i2) && (!i || !i2 || !this.paymentProperties.mo30284a(mVTokenizeCreditCardEncryptedRequest.paymentProperties))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30660f() {
        return this.cardType != null;
    }

    /* renamed from: g */
    public final boolean mo30661g() {
        return this.clearanceProvider != null;
    }

    /* renamed from: h */
    public final boolean mo30662h() {
        return this.encryptedData != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30664i() {
        return this.paymentProperties != null;
    }

    /* renamed from: j */
    public final boolean mo30665j() {
        return this.returnUrls != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTokenizeCreditCardEncryptedRequest(", "clearanceProvider:");
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
        n.append("encryptedData:");
        String str = this.encryptedData;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("cardType:");
        MVCardType mVCardType = this.cardType;
        if (mVCardType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCardType);
        }
        if (mo30664i()) {
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
