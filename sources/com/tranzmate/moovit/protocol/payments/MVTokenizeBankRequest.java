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
import p001a0.C0016g;
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

public class MVTokenizeBankRequest implements TBase<MVTokenizeBankRequest, _Fields>, Serializable, Cloneable, Comparable<MVTokenizeBankRequest> {

    /* renamed from: b */
    public static final C25113c f27724b = new C25113c("clearanceProvider", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27725c = new C25113c("returnUrls", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27726d = new C25113c("bankId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f27727e = new C25113c("clearanceBankType", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27728f = new C25113c("paymentProperties", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f27729g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27730h;
    private byte __isset_bitfield = 0;
    public int bankId;
    public String clearanceBankType;
    public MVClearanceProviderType clearanceProvider;
    private _Fields[] optionals = {_Fields.PAYMENT_PROPERTIES};
    public MVPaymentProperties paymentProperties;
    public MVTokenizeReturnUrls returnUrls;

    public enum _Fields implements C25085c {
        CLEARANCE_PROVIDER(1, "clearanceProvider"),
        RETURN_URLS(2, "returnUrls"),
        BANK_ID(3, "bankId"),
        CLEARANCE_BANK_TYPE(4, "clearanceBankType"),
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
                return BANK_ID;
            }
            if (i == 4) {
                return CLEARANCE_BANK_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeBankRequest$a */
    public static class C10085a extends C25239c<MVTokenizeBankRequest> {
        public C10085a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeBankRequest mVTokenizeBankRequest = (MVTokenizeBankRequest) tBase;
            mVTokenizeBankRequest.getClass();
            C25113c cVar = MVTokenizeBankRequest.f27724b;
            gVar.mo61687K();
            if (mVTokenizeBankRequest.clearanceProvider != null) {
                gVar.mo61711x(MVTokenizeBankRequest.f27724b);
                gVar.mo61678B(mVTokenizeBankRequest.clearanceProvider.getValue());
                gVar.mo61712y();
            }
            if (mVTokenizeBankRequest.returnUrls != null) {
                gVar.mo61711x(MVTokenizeBankRequest.f27725c);
                mVTokenizeBankRequest.returnUrls.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTokenizeBankRequest.f27726d);
            gVar.mo61678B(mVTokenizeBankRequest.bankId);
            gVar.mo61712y();
            if (mVTokenizeBankRequest.clearanceBankType != null) {
                gVar.mo61711x(MVTokenizeBankRequest.f27727e);
                gVar.mo61686J(mVTokenizeBankRequest.clearanceBankType);
                gVar.mo61712y();
            }
            if (mVTokenizeBankRequest.paymentProperties != null && mVTokenizeBankRequest.mo30644i()) {
                gVar.mo61711x(MVTokenizeBankRequest.f27728f);
                mVTokenizeBankRequest.paymentProperties.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeBankRequest mVTokenizeBankRequest = (MVTokenizeBankRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTokenizeBankRequest.getClass();
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
                                    mVTokenizeBankRequest.paymentProperties = mVPaymentProperties;
                                    mVPaymentProperties.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVTokenizeBankRequest.clearanceBankType = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVTokenizeBankRequest.bankId = gVar.mo61696i();
                            mVTokenizeBankRequest.mo30646k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls();
                        mVTokenizeBankRequest.returnUrls = mVTokenizeReturnUrls;
                        mVTokenizeReturnUrls.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTokenizeBankRequest.clearanceProvider = MVClearanceProviderType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeBankRequest$b */
    public static class C10086b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10085a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeBankRequest$c */
    public static class C10087c extends C25240d<MVTokenizeBankRequest> {
        public C10087c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeBankRequest mVTokenizeBankRequest = (MVTokenizeBankRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTokenizeBankRequest.mo30642h()) {
                bitSet.set(0);
            }
            if (mVTokenizeBankRequest.mo30645j()) {
                bitSet.set(1);
            }
            if (mVTokenizeBankRequest.mo30640f()) {
                bitSet.set(2);
            }
            if (mVTokenizeBankRequest.mo30641g()) {
                bitSet.set(3);
            }
            if (mVTokenizeBankRequest.mo30644i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVTokenizeBankRequest.mo30642h()) {
                jVar.mo61678B(mVTokenizeBankRequest.clearanceProvider.getValue());
            }
            if (mVTokenizeBankRequest.mo30645j()) {
                mVTokenizeBankRequest.returnUrls.mo25202X0(jVar);
            }
            if (mVTokenizeBankRequest.mo30640f()) {
                jVar.mo61678B(mVTokenizeBankRequest.bankId);
            }
            if (mVTokenizeBankRequest.mo30641g()) {
                jVar.mo61686J(mVTokenizeBankRequest.clearanceBankType);
            }
            if (mVTokenizeBankRequest.mo30644i()) {
                mVTokenizeBankRequest.paymentProperties.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeBankRequest mVTokenizeBankRequest = (MVTokenizeBankRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVTokenizeBankRequest.clearanceProvider = MVClearanceProviderType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls();
                mVTokenizeBankRequest.returnUrls = mVTokenizeReturnUrls;
                mVTokenizeReturnUrls.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVTokenizeBankRequest.bankId = jVar.mo61696i();
                mVTokenizeBankRequest.mo30646k();
            }
            if (T.get(3)) {
                mVTokenizeBankRequest.clearanceBankType = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVPaymentProperties mVPaymentProperties = new MVPaymentProperties();
                mVTokenizeBankRequest.paymentProperties = mVPaymentProperties;
                mVPaymentProperties.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeBankRequest$d */
    public static class C10088d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10087c(0);
        }
    }

    static {
        new C17394d0("MVTokenizeBankRequest");
        HashMap hashMap = new HashMap();
        f27729g = hashMap;
        hashMap.put(C25239c.class, new C10086b());
        hashMap.put(C25240d.class, new C10088d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CLEARANCE_PROVIDER, new FieldMetaData("clearanceProvider", (byte) 3, new EnumMetaData(MVClearanceProviderType.class)));
        enumMap.put(_Fields.RETURN_URLS, new FieldMetaData("returnUrls", (byte) 3, new StructMetaData(MVTokenizeReturnUrls.class)));
        enumMap.put(_Fields.BANK_ID, new FieldMetaData("bankId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CLEARANCE_BANK_TYPE, new FieldMetaData("clearanceBankType", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_PROPERTIES, new FieldMetaData("paymentProperties", (byte) 2, new StructMetaData(MVPaymentProperties.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27730h = unmodifiableMap;
        FieldMetaData.m61947a(MVTokenizeBankRequest.class, unmodifiableMap);
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
        ((C25238b) f27729g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27729g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTokenizeBankRequest mVTokenizeBankRequest = (MVTokenizeBankRequest) obj;
        if (!getClass().equals(mVTokenizeBankRequest.getClass())) {
            return getClass().getName().compareTo(mVTokenizeBankRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30642h()).compareTo(Boolean.valueOf(mVTokenizeBankRequest.mo30642h()));
        if (compareTo2 != 0 || ((mo30642h() && (compareTo2 = this.clearanceProvider.compareTo(mVTokenizeBankRequest.clearanceProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo30645j()).compareTo(Boolean.valueOf(mVTokenizeBankRequest.mo30645j()))) != 0 || ((mo30645j() && (compareTo2 = this.returnUrls.compareTo(mVTokenizeBankRequest.returnUrls)) != 0) || (compareTo2 = Boolean.valueOf(mo30640f()).compareTo(Boolean.valueOf(mVTokenizeBankRequest.mo30640f()))) != 0 || ((mo30640f() && (compareTo2 = C25082a.m62839c(this.bankId, mVTokenizeBankRequest.bankId)) != 0) || (compareTo2 = Boolean.valueOf(mo30641g()).compareTo(Boolean.valueOf(mVTokenizeBankRequest.mo30641g()))) != 0 || ((mo30641g() && (compareTo2 = this.clearanceBankType.compareTo(mVTokenizeBankRequest.clearanceBankType)) != 0) || (compareTo2 = Boolean.valueOf(mo30644i()).compareTo(Boolean.valueOf(mVTokenizeBankRequest.mo30644i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo30644i() || (compareTo = this.paymentProperties.compareTo(mVTokenizeBankRequest.paymentProperties)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTokenizeBankRequest)) {
            return false;
        }
        MVTokenizeBankRequest mVTokenizeBankRequest = (MVTokenizeBankRequest) obj;
        boolean h = mo30642h();
        boolean h2 = mVTokenizeBankRequest.mo30642h();
        if ((h || h2) && (!h || !h2 || !this.clearanceProvider.equals(mVTokenizeBankRequest.clearanceProvider))) {
            return false;
        }
        boolean j = mo30645j();
        boolean j2 = mVTokenizeBankRequest.mo30645j();
        if (((j || j2) && (!j || !j2 || !this.returnUrls.mo30695a(mVTokenizeBankRequest.returnUrls))) || this.bankId != mVTokenizeBankRequest.bankId) {
            return false;
        }
        boolean g = mo30641g();
        boolean g2 = mVTokenizeBankRequest.mo30641g();
        if ((g || g2) && (!g || !g2 || !this.clearanceBankType.equals(mVTokenizeBankRequest.clearanceBankType))) {
            return false;
        }
        boolean i = mo30644i();
        boolean i2 = mVTokenizeBankRequest.mo30644i();
        if ((i || i2) && (!i || !i2 || !this.paymentProperties.mo30284a(mVTokenizeBankRequest.paymentProperties))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30640f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo30641g() {
        return this.clearanceBankType != null;
    }

    /* renamed from: h */
    public final boolean mo30642h() {
        return this.clearanceProvider != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30644i() {
        return this.paymentProperties != null;
    }

    /* renamed from: j */
    public final boolean mo30645j() {
        return this.returnUrls != null;
    }

    /* renamed from: k */
    public final void mo30646k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTokenizeBankRequest(", "clearanceProvider:");
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
        n.append("bankId:");
        C0016g.m42z(n, this.bankId, ", ", "clearanceBankType:");
        String str = this.clearanceBankType;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo30644i()) {
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
