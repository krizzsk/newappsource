package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.appsflyer.AppsFlyerProperties;
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
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
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

public class MVApplePayPaymentRequestProperties implements TBase<MVApplePayPaymentRequestProperties, _Fields>, Serializable, Cloneable, Comparable<MVApplePayPaymentRequestProperties> {

    /* renamed from: b */
    public static final C25113c f27100b = new C25113c("merchantIdentifier", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27101c = new C25113c("merchantCountryCode", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27102d = new C25113c("supportedCountries", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f27103e = new C25113c(AppsFlyerProperties.CURRENCY_CODE, (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27104f = new C25113c("paymentSummaryItems", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f27105g = new C25113c("requiredBillingContactFields", (byte) 15, 6);

    /* renamed from: h */
    public static final HashMap f27106h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f27107i;
    public String currencyCode;
    public String merchantCountryCode;
    public String merchantIdentifier;
    private _Fields[] optionals = {_Fields.SUPPORTED_COUNTRIES, _Fields.REQUIRED_BILLING_CONTACT_FIELDS};
    public List<MVApplePayPaymentSummaryItem> paymentSummaryItems;
    public List<MVApplePayContactField> requiredBillingContactFields;
    public List<String> supportedCountries;

    public enum _Fields implements C25085c {
        MERCHANT_IDENTIFIER(1, "merchantIdentifier"),
        MERCHANT_COUNTRY_CODE(2, "merchantCountryCode"),
        SUPPORTED_COUNTRIES(3, "supportedCountries"),
        CURRENCY_CODE(4, AppsFlyerProperties.CURRENCY_CODE),
        PAYMENT_SUMMARY_ITEMS(5, "paymentSummaryItems"),
        REQUIRED_BILLING_CONTACT_FIELDS(6, "requiredBillingContactFields");
        
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
            switch (i) {
                case 1:
                    return MERCHANT_IDENTIFIER;
                case 2:
                    return MERCHANT_COUNTRY_CODE;
                case 3:
                    return SUPPORTED_COUNTRIES;
                case 4:
                    return CURRENCY_CODE;
                case 5:
                    return PAYMENT_SUMMARY_ITEMS;
                case 6:
                    return REQUIRED_BILLING_CONTACT_FIELDS;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentRequestProperties$a */
    public static class C9604a extends C25239c<MVApplePayPaymentRequestProperties> {
        public C9604a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentRequestProperties mVApplePayPaymentRequestProperties = (MVApplePayPaymentRequestProperties) tBase;
            mVApplePayPaymentRequestProperties.getClass();
            C25113c cVar = MVApplePayPaymentRequestProperties.f27100b;
            gVar.mo61687K();
            if (mVApplePayPaymentRequestProperties.merchantIdentifier != null) {
                gVar.mo61711x(MVApplePayPaymentRequestProperties.f27100b);
                gVar.mo61686J(mVApplePayPaymentRequestProperties.merchantIdentifier);
                gVar.mo61712y();
            }
            if (mVApplePayPaymentRequestProperties.merchantCountryCode != null) {
                gVar.mo61711x(MVApplePayPaymentRequestProperties.f27101c);
                gVar.mo61686J(mVApplePayPaymentRequestProperties.merchantCountryCode);
                gVar.mo61712y();
            }
            if (mVApplePayPaymentRequestProperties.supportedCountries != null && mVApplePayPaymentRequestProperties.mo29584k()) {
                gVar.mo61711x(MVApplePayPaymentRequestProperties.f27102d);
                gVar.mo61680D(new C25119e((byte) 11, mVApplePayPaymentRequestProperties.supportedCountries.size()));
                for (String J : mVApplePayPaymentRequestProperties.supportedCountries) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVApplePayPaymentRequestProperties.currencyCode != null) {
                gVar.mo61711x(MVApplePayPaymentRequestProperties.f27103e);
                gVar.mo61686J(mVApplePayPaymentRequestProperties.currencyCode);
                gVar.mo61712y();
            }
            if (mVApplePayPaymentRequestProperties.paymentSummaryItems != null) {
                gVar.mo61711x(MVApplePayPaymentRequestProperties.f27104f);
                gVar.mo61680D(new C25119e((byte) 12, mVApplePayPaymentRequestProperties.paymentSummaryItems.size()));
                for (MVApplePayPaymentSummaryItem X0 : mVApplePayPaymentRequestProperties.paymentSummaryItems) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVApplePayPaymentRequestProperties.requiredBillingContactFields != null && mVApplePayPaymentRequestProperties.mo29583j()) {
                gVar.mo61711x(MVApplePayPaymentRequestProperties.f27105g);
                gVar.mo61680D(new C25119e((byte) 8, mVApplePayPaymentRequestProperties.requiredBillingContactFields.size()));
                for (MVApplePayContactField value : mVApplePayPaymentRequestProperties.requiredBillingContactFields) {
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
            MVApplePayPaymentRequestProperties mVApplePayPaymentRequestProperties = (MVApplePayPaymentRequestProperties) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVApplePayPaymentRequestProperties.getClass();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPaymentRequestProperties.merchantIdentifier = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPaymentRequestProperties.merchantCountryCode = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVApplePayPaymentRequestProperties.supportedCountries = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                mVApplePayPaymentRequestProperties.supportedCountries.add(gVar.mo61704q());
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPaymentRequestProperties.currencyCode = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVApplePayPaymentRequestProperties.paymentSummaryItems = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVApplePayPaymentSummaryItem mVApplePayPaymentSummaryItem = new MVApplePayPaymentSummaryItem();
                                mVApplePayPaymentSummaryItem.mo25201C1(gVar);
                                mVApplePayPaymentRequestProperties.paymentSummaryItems.add(mVApplePayPaymentSummaryItem);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k3 = gVar.mo61698k();
                            mVApplePayPaymentRequestProperties.requiredBillingContactFields = new ArrayList(k3.f63395b);
                            while (i < k3.f63395b) {
                                mVApplePayPaymentRequestProperties.requiredBillingContactFields.add(MVApplePayContactField.findByValue(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentRequestProperties$b */
    public static class C9605b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9604a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentRequestProperties$c */
    public static class C9606c extends C25240d<MVApplePayPaymentRequestProperties> {
        public C9606c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentRequestProperties mVApplePayPaymentRequestProperties = (MVApplePayPaymentRequestProperties) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVApplePayPaymentRequestProperties.mo29580h()) {
                bitSet.set(0);
            }
            if (mVApplePayPaymentRequestProperties.mo29579g()) {
                bitSet.set(1);
            }
            if (mVApplePayPaymentRequestProperties.mo29584k()) {
                bitSet.set(2);
            }
            if (mVApplePayPaymentRequestProperties.mo29578f()) {
                bitSet.set(3);
            }
            if (mVApplePayPaymentRequestProperties.mo29582i()) {
                bitSet.set(4);
            }
            if (mVApplePayPaymentRequestProperties.mo29583j()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVApplePayPaymentRequestProperties.mo29580h()) {
                jVar.mo61686J(mVApplePayPaymentRequestProperties.merchantIdentifier);
            }
            if (mVApplePayPaymentRequestProperties.mo29579g()) {
                jVar.mo61686J(mVApplePayPaymentRequestProperties.merchantCountryCode);
            }
            if (mVApplePayPaymentRequestProperties.mo29584k()) {
                jVar.mo61678B(mVApplePayPaymentRequestProperties.supportedCountries.size());
                for (String J : mVApplePayPaymentRequestProperties.supportedCountries) {
                    jVar.mo61686J(J);
                }
            }
            if (mVApplePayPaymentRequestProperties.mo29578f()) {
                jVar.mo61686J(mVApplePayPaymentRequestProperties.currencyCode);
            }
            if (mVApplePayPaymentRequestProperties.mo29582i()) {
                jVar.mo61678B(mVApplePayPaymentRequestProperties.paymentSummaryItems.size());
                for (MVApplePayPaymentSummaryItem X0 : mVApplePayPaymentRequestProperties.paymentSummaryItems) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVApplePayPaymentRequestProperties.mo29583j()) {
                jVar.mo61678B(mVApplePayPaymentRequestProperties.requiredBillingContactFields.size());
                for (MVApplePayContactField value : mVApplePayPaymentRequestProperties.requiredBillingContactFields) {
                    jVar.mo61678B(value.getValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentRequestProperties mVApplePayPaymentRequestProperties = (MVApplePayPaymentRequestProperties) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVApplePayPaymentRequestProperties.merchantIdentifier = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVApplePayPaymentRequestProperties.merchantCountryCode = jVar.mo61704q();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVApplePayPaymentRequestProperties.supportedCountries = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVApplePayPaymentRequestProperties.supportedCountries.add(jVar.mo61704q());
                }
            }
            if (T.get(3)) {
                mVApplePayPaymentRequestProperties.currencyCode = jVar.mo61704q();
            }
            if (T.get(4)) {
                int i3 = jVar.mo61696i();
                mVApplePayPaymentRequestProperties.paymentSummaryItems = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVApplePayPaymentSummaryItem mVApplePayPaymentSummaryItem = new MVApplePayPaymentSummaryItem();
                    mVApplePayPaymentSummaryItem.mo25201C1(jVar);
                    mVApplePayPaymentRequestProperties.paymentSummaryItems.add(mVApplePayPaymentSummaryItem);
                }
            }
            if (T.get(5)) {
                int i5 = jVar.mo61696i();
                mVApplePayPaymentRequestProperties.requiredBillingContactFields = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    mVApplePayPaymentRequestProperties.requiredBillingContactFields.add(MVApplePayContactField.findByValue(jVar.mo61696i()));
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentRequestProperties$d */
    public static class C9607d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9606c(0);
        }
    }

    static {
        new C17394d0("MVApplePayPaymentRequestProperties");
        HashMap hashMap = new HashMap();
        f27106h = hashMap;
        hashMap.put(C25239c.class, new C9605b());
        hashMap.put(C25240d.class, new C9607d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MERCHANT_IDENTIFIER, new FieldMetaData("merchantIdentifier", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MERCHANT_COUNTRY_CODE, new FieldMetaData("merchantCountryCode", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUPPORTED_COUNTRIES, new FieldMetaData("supportedCountries", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.CURRENCY_CODE, new FieldMetaData(AppsFlyerProperties.CURRENCY_CODE, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_SUMMARY_ITEMS, new FieldMetaData("paymentSummaryItems", (byte) 3, new ListMetaData(new StructMetaData(MVApplePayPaymentSummaryItem.class))));
        enumMap.put(_Fields.REQUIRED_BILLING_CONTACT_FIELDS, new FieldMetaData("requiredBillingContactFields", (byte) 2, new ListMetaData(new EnumMetaData(MVApplePayContactField.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27107i = unmodifiableMap;
        FieldMetaData.m61947a(MVApplePayPaymentRequestProperties.class, unmodifiableMap);
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
        ((C25238b) f27106h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27106h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29575a(MVApplePayPaymentRequestProperties mVApplePayPaymentRequestProperties) {
        if (mVApplePayPaymentRequestProperties == null) {
            return false;
        }
        boolean h = mo29580h();
        boolean h2 = mVApplePayPaymentRequestProperties.mo29580h();
        if ((h || h2) && (!h || !h2 || !this.merchantIdentifier.equals(mVApplePayPaymentRequestProperties.merchantIdentifier))) {
            return false;
        }
        boolean g = mo29579g();
        boolean g2 = mVApplePayPaymentRequestProperties.mo29579g();
        if ((g || g2) && (!g || !g2 || !this.merchantCountryCode.equals(mVApplePayPaymentRequestProperties.merchantCountryCode))) {
            return false;
        }
        boolean k = mo29584k();
        boolean k2 = mVApplePayPaymentRequestProperties.mo29584k();
        if ((k || k2) && (!k || !k2 || !this.supportedCountries.equals(mVApplePayPaymentRequestProperties.supportedCountries))) {
            return false;
        }
        boolean f = mo29578f();
        boolean f2 = mVApplePayPaymentRequestProperties.mo29578f();
        if ((f || f2) && (!f || !f2 || !this.currencyCode.equals(mVApplePayPaymentRequestProperties.currencyCode))) {
            return false;
        }
        boolean i = mo29582i();
        boolean i2 = mVApplePayPaymentRequestProperties.mo29582i();
        if ((i || i2) && (!i || !i2 || !this.paymentSummaryItems.equals(mVApplePayPaymentRequestProperties.paymentSummaryItems))) {
            return false;
        }
        boolean j = mo29583j();
        boolean j2 = mVApplePayPaymentRequestProperties.mo29583j();
        if (!j && !j2) {
            return true;
        }
        if (!j || !j2 || !this.requiredBillingContactFields.equals(mVApplePayPaymentRequestProperties.requiredBillingContactFields)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVApplePayPaymentRequestProperties mVApplePayPaymentRequestProperties = (MVApplePayPaymentRequestProperties) obj;
        if (!getClass().equals(mVApplePayPaymentRequestProperties.getClass())) {
            return getClass().getName().compareTo(mVApplePayPaymentRequestProperties.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29580h()).compareTo(Boolean.valueOf(mVApplePayPaymentRequestProperties.mo29580h()));
        if (compareTo != 0 || ((mo29580h() && (compareTo = this.merchantIdentifier.compareTo(mVApplePayPaymentRequestProperties.merchantIdentifier)) != 0) || (compareTo = Boolean.valueOf(mo29579g()).compareTo(Boolean.valueOf(mVApplePayPaymentRequestProperties.mo29579g()))) != 0 || ((mo29579g() && (compareTo = this.merchantCountryCode.compareTo(mVApplePayPaymentRequestProperties.merchantCountryCode)) != 0) || (compareTo = Boolean.valueOf(mo29584k()).compareTo(Boolean.valueOf(mVApplePayPaymentRequestProperties.mo29584k()))) != 0 || ((mo29584k() && (compareTo = C25082a.m62844h(this.supportedCountries, mVApplePayPaymentRequestProperties.supportedCountries)) != 0) || (compareTo = Boolean.valueOf(mo29578f()).compareTo(Boolean.valueOf(mVApplePayPaymentRequestProperties.mo29578f()))) != 0 || ((mo29578f() && (compareTo = this.currencyCode.compareTo(mVApplePayPaymentRequestProperties.currencyCode)) != 0) || (compareTo = Boolean.valueOf(mo29582i()).compareTo(Boolean.valueOf(mVApplePayPaymentRequestProperties.mo29582i()))) != 0 || ((mo29582i() && (compareTo = C25082a.m62844h(this.paymentSummaryItems, mVApplePayPaymentRequestProperties.paymentSummaryItems)) != 0) || (compareTo = Boolean.valueOf(mo29583j()).compareTo(Boolean.valueOf(mVApplePayPaymentRequestProperties.mo29583j()))) != 0)))))) {
            return compareTo;
        }
        if (!mo29583j() || (h = C25082a.m62844h(this.requiredBillingContactFields, mVApplePayPaymentRequestProperties.requiredBillingContactFields)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVApplePayPaymentRequestProperties)) {
            return mo29575a((MVApplePayPaymentRequestProperties) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29578f() {
        return this.currencyCode != null;
    }

    /* renamed from: g */
    public final boolean mo29579g() {
        return this.merchantCountryCode != null;
    }

    /* renamed from: h */
    public final boolean mo29580h() {
        return this.merchantIdentifier != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29582i() {
        return this.paymentSummaryItems != null;
    }

    /* renamed from: j */
    public final boolean mo29583j() {
        return this.requiredBillingContactFields != null;
    }

    /* renamed from: k */
    public final boolean mo29584k() {
        return this.supportedCountries != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVApplePayPaymentRequestProperties(", "merchantIdentifier:");
        String str = this.merchantIdentifier;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("merchantCountryCode:");
        String str2 = this.merchantCountryCode;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo29584k()) {
            n.append(", ");
            n.append("supportedCountries:");
            List<String> list = this.supportedCountries;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        n.append(", ");
        n.append("currencyCode:");
        String str3 = this.currencyCode;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("paymentSummaryItems:");
        List<MVApplePayPaymentSummaryItem> list2 = this.paymentSummaryItems;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        if (mo29583j()) {
            n.append(", ");
            n.append("requiredBillingContactFields:");
            List<MVApplePayContactField> list3 = this.requiredBillingContactFields;
            if (list3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list3);
            }
        }
        n.append(")");
        return n.toString();
    }
}
