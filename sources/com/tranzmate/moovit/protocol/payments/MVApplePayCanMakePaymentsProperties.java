package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVApplePayCanMakePaymentsProperties implements TBase<MVApplePayCanMakePaymentsProperties, _Fields>, Serializable, Cloneable, Comparable<MVApplePayCanMakePaymentsProperties> {

    /* renamed from: b */
    public static final C25113c f27074b = new C25113c("merchantCapabilities", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27075c = new C25113c("supportedPaymentNetworks", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f27076d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27077e;
    public MVMerchantCapabilities merchantCapabilities;
    private _Fields[] optionals = {_Fields.MERCHANT_CAPABILITIES, _Fields.SUPPORTED_PAYMENT_NETWORKS};
    public List<MVCardType> supportedPaymentNetworks;

    public enum _Fields implements C25085c {
        MERCHANT_CAPABILITIES(1, "merchantCapabilities"),
        SUPPORTED_PAYMENT_NETWORKS(2, "supportedPaymentNetworks");
        
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
                return MERCHANT_CAPABILITIES;
            }
            if (i != 2) {
                return null;
            }
            return SUPPORTED_PAYMENT_NETWORKS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayCanMakePaymentsProperties$a */
    public static class C9584a extends C25239c<MVApplePayCanMakePaymentsProperties> {
        public C9584a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayCanMakePaymentsProperties mVApplePayCanMakePaymentsProperties = (MVApplePayCanMakePaymentsProperties) tBase;
            MVMerchantCapabilities mVMerchantCapabilities = mVApplePayCanMakePaymentsProperties.merchantCapabilities;
            C25113c cVar = MVApplePayCanMakePaymentsProperties.f27074b;
            gVar.mo61687K();
            if (mVApplePayCanMakePaymentsProperties.merchantCapabilities != null && mVApplePayCanMakePaymentsProperties.mo29530f()) {
                gVar.mo61711x(MVApplePayCanMakePaymentsProperties.f27074b);
                mVApplePayCanMakePaymentsProperties.merchantCapabilities.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVApplePayCanMakePaymentsProperties.supportedPaymentNetworks != null && mVApplePayCanMakePaymentsProperties.mo29531g()) {
                gVar.mo61711x(MVApplePayCanMakePaymentsProperties.f27075c);
                gVar.mo61680D(new C25119e((byte) 8, mVApplePayCanMakePaymentsProperties.supportedPaymentNetworks.size()));
                for (MVCardType value : mVApplePayCanMakePaymentsProperties.supportedPaymentNetworks) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayCanMakePaymentsProperties mVApplePayCanMakePaymentsProperties = (MVApplePayCanMakePaymentsProperties) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVMerchantCapabilities mVMerchantCapabilities = mVApplePayCanMakePaymentsProperties.merchantCapabilities;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVApplePayCanMakePaymentsProperties.supportedPaymentNetworks = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            mVApplePayCanMakePaymentsProperties.supportedPaymentNetworks.add(MVCardType.findByValue(gVar.mo61696i()));
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVMerchantCapabilities mVMerchantCapabilities2 = new MVMerchantCapabilities();
                    mVApplePayCanMakePaymentsProperties.merchantCapabilities = mVMerchantCapabilities2;
                    mVMerchantCapabilities2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayCanMakePaymentsProperties$b */
    public static class C9585b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9584a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayCanMakePaymentsProperties$c */
    public static class C9586c extends C25240d<MVApplePayCanMakePaymentsProperties> {
        public C9586c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayCanMakePaymentsProperties mVApplePayCanMakePaymentsProperties = (MVApplePayCanMakePaymentsProperties) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVApplePayCanMakePaymentsProperties.mo29530f()) {
                bitSet.set(0);
            }
            if (mVApplePayCanMakePaymentsProperties.mo29531g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVApplePayCanMakePaymentsProperties.mo29530f()) {
                mVApplePayCanMakePaymentsProperties.merchantCapabilities.mo25202X0(jVar);
            }
            if (mVApplePayCanMakePaymentsProperties.mo29531g()) {
                jVar.mo61678B(mVApplePayCanMakePaymentsProperties.supportedPaymentNetworks.size());
                for (MVCardType value : mVApplePayCanMakePaymentsProperties.supportedPaymentNetworks) {
                    jVar.mo61678B(value.getValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayCanMakePaymentsProperties mVApplePayCanMakePaymentsProperties = (MVApplePayCanMakePaymentsProperties) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVMerchantCapabilities mVMerchantCapabilities = new MVMerchantCapabilities();
                mVApplePayCanMakePaymentsProperties.merchantCapabilities = mVMerchantCapabilities;
                mVMerchantCapabilities.mo25201C1(jVar);
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVApplePayCanMakePaymentsProperties.supportedPaymentNetworks = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVApplePayCanMakePaymentsProperties.supportedPaymentNetworks.add(MVCardType.findByValue(jVar.mo61696i()));
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayCanMakePaymentsProperties$d */
    public static class C9587d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9586c(0);
        }
    }

    static {
        new C17394d0("MVApplePayCanMakePaymentsProperties");
        HashMap hashMap = new HashMap();
        f27076d = hashMap;
        hashMap.put(C25239c.class, new C9585b());
        hashMap.put(C25240d.class, new C9587d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MERCHANT_CAPABILITIES, new FieldMetaData("merchantCapabilities", (byte) 2, new StructMetaData(MVMerchantCapabilities.class)));
        enumMap.put(_Fields.SUPPORTED_PAYMENT_NETWORKS, new FieldMetaData("supportedPaymentNetworks", (byte) 2, new ListMetaData(new EnumMetaData(MVCardType.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27077e = unmodifiableMap;
        FieldMetaData.m61947a(MVApplePayCanMakePaymentsProperties.class, unmodifiableMap);
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
        ((C25238b) f27076d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27076d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29527a(MVApplePayCanMakePaymentsProperties mVApplePayCanMakePaymentsProperties) {
        if (mVApplePayCanMakePaymentsProperties == null) {
            return false;
        }
        boolean f = mo29530f();
        boolean f2 = mVApplePayCanMakePaymentsProperties.mo29530f();
        if ((f || f2) && (!f || !f2 || !this.merchantCapabilities.mo30015a(mVApplePayCanMakePaymentsProperties.merchantCapabilities))) {
            return false;
        }
        boolean g = mo29531g();
        boolean g2 = mVApplePayCanMakePaymentsProperties.mo29531g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.supportedPaymentNetworks.equals(mVApplePayCanMakePaymentsProperties.supportedPaymentNetworks)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVApplePayCanMakePaymentsProperties mVApplePayCanMakePaymentsProperties = (MVApplePayCanMakePaymentsProperties) obj;
        if (!getClass().equals(mVApplePayCanMakePaymentsProperties.getClass())) {
            return getClass().getName().compareTo(mVApplePayCanMakePaymentsProperties.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29530f()).compareTo(Boolean.valueOf(mVApplePayCanMakePaymentsProperties.mo29530f()));
        if (compareTo != 0 || ((mo29530f() && (compareTo = this.merchantCapabilities.compareTo(mVApplePayCanMakePaymentsProperties.merchantCapabilities)) != 0) || (compareTo = Boolean.valueOf(mo29531g()).compareTo(Boolean.valueOf(mVApplePayCanMakePaymentsProperties.mo29531g()))) != 0)) {
            return compareTo;
        }
        if (!mo29531g() || (h = C25082a.m62844h(this.supportedPaymentNetworks, mVApplePayCanMakePaymentsProperties.supportedPaymentNetworks)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVApplePayCanMakePaymentsProperties)) {
            return mo29527a((MVApplePayCanMakePaymentsProperties) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29530f() {
        return this.merchantCapabilities != null;
    }

    /* renamed from: g */
    public final boolean mo29531g() {
        return this.supportedPaymentNetworks != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVApplePayCanMakePaymentsProperties(");
        if (mo29530f()) {
            sb.append("merchantCapabilities:");
            MVMerchantCapabilities mVMerchantCapabilities = this.merchantCapabilities;
            if (mVMerchantCapabilities == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVMerchantCapabilities);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29531g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("supportedPaymentNetworks:");
            List<MVCardType> list = this.supportedPaymentNetworks;
            if (list == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
