package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
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
import org.apache.thrift.meta_data.MapMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25120f;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVPaymentRequestProperties implements TBase<MVPaymentRequestProperties, _Fields>, Serializable, Cloneable, Comparable<MVPaymentRequestProperties> {

    /* renamed from: b */
    public static final C25113c f27599b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27600c = new C25113c("itemPrice", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27601d = new C25113c("properties", (byte) 13, 3);

    /* renamed from: e */
    public static final C25113c f27602e = new C25113c("discountContextId", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27603f = new C25113c("paymentOptions", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f27604g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27605h;
    public String discountContextId;
    public MVCurrencyAmount itemPrice;
    private _Fields[] optionals = {_Fields.ITEM_PRICE, _Fields.PROPERTIES, _Fields.DISCOUNT_CONTEXT_ID, _Fields.PAYMENT_OPTIONS};
    public String paymentContext;
    public MVPaymentOptions paymentOptions;
    public Map<String, String> properties;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        ITEM_PRICE(2, "itemPrice"),
        PROPERTIES(3, "properties"),
        DISCOUNT_CONTEXT_ID(4, "discountContextId"),
        PAYMENT_OPTIONS(5, "paymentOptions");
        
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
                return ITEM_PRICE;
            }
            if (i == 3) {
                return PROPERTIES;
            }
            if (i == 4) {
                return DISCOUNT_CONTEXT_ID;
            }
            if (i != 5) {
                return null;
            }
            return PAYMENT_OPTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRequestProperties$a */
    public static class C9999a extends C25239c<MVPaymentRequestProperties> {
        public C9999a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRequestProperties mVPaymentRequestProperties = (MVPaymentRequestProperties) tBase;
            mVPaymentRequestProperties.mo30428k();
            C25113c cVar = MVPaymentRequestProperties.f27599b;
            gVar.mo61687K();
            if (mVPaymentRequestProperties.paymentContext != null) {
                gVar.mo61711x(MVPaymentRequestProperties.f27599b);
                gVar.mo61686J(mVPaymentRequestProperties.paymentContext);
                gVar.mo61712y();
            }
            if (mVPaymentRequestProperties.itemPrice != null && mVPaymentRequestProperties.mo30423g()) {
                gVar.mo61711x(MVPaymentRequestProperties.f27600c);
                mVPaymentRequestProperties.itemPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentRequestProperties.properties != null && mVPaymentRequestProperties.mo30427j()) {
                gVar.mo61711x(MVPaymentRequestProperties.f27601d);
                gVar.mo61682F(new C25120f((byte) 11, (byte) 11, mVPaymentRequestProperties.properties.size()));
                for (Map.Entry next : mVPaymentRequestProperties.properties.entrySet()) {
                    gVar.mo61686J((String) next.getKey());
                    gVar.mo61686J((String) next.getValue());
                }
                gVar.mo61683G();
                gVar.mo61712y();
            }
            if (mVPaymentRequestProperties.discountContextId != null && mVPaymentRequestProperties.mo30422f()) {
                gVar.mo61711x(MVPaymentRequestProperties.f27602e);
                gVar.mo61686J(mVPaymentRequestProperties.discountContextId);
                gVar.mo61712y();
            }
            if (mVPaymentRequestProperties.paymentOptions != null && mVPaymentRequestProperties.mo30426i()) {
                gVar.mo61711x(MVPaymentRequestProperties.f27603f);
                mVPaymentRequestProperties.paymentOptions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRequestProperties mVPaymentRequestProperties = (MVPaymentRequestProperties) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentRequestProperties.mo30428k();
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
                                    MVPaymentOptions mVPaymentOptions = new MVPaymentOptions();
                                    mVPaymentRequestProperties.paymentOptions = mVPaymentOptions;
                                    mVPaymentOptions.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVPaymentRequestProperties.discountContextId = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 13) {
                            C25120f m = gVar.mo61700m();
                            mVPaymentRequestProperties.properties = new HashMap(m.f63398c * 2);
                            for (int i = 0; i < m.f63398c; i++) {
                                mVPaymentRequestProperties.properties.put(gVar.mo61704q(), gVar.mo61704q());
                            }
                            gVar.mo61701n();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                        mVPaymentRequestProperties.itemPrice = mVCurrencyAmount;
                        mVCurrencyAmount.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPaymentRequestProperties.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRequestProperties$b */
    public static class C10000b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9999a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRequestProperties$c */
    public static class C10001c extends C25240d<MVPaymentRequestProperties> {
        public C10001c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRequestProperties mVPaymentRequestProperties = (MVPaymentRequestProperties) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentRequestProperties.mo30424h()) {
                bitSet.set(0);
            }
            if (mVPaymentRequestProperties.mo30423g()) {
                bitSet.set(1);
            }
            if (mVPaymentRequestProperties.mo30427j()) {
                bitSet.set(2);
            }
            if (mVPaymentRequestProperties.mo30422f()) {
                bitSet.set(3);
            }
            if (mVPaymentRequestProperties.mo30426i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPaymentRequestProperties.mo30424h()) {
                jVar.mo61686J(mVPaymentRequestProperties.paymentContext);
            }
            if (mVPaymentRequestProperties.mo30423g()) {
                mVPaymentRequestProperties.itemPrice.mo25202X0(jVar);
            }
            if (mVPaymentRequestProperties.mo30427j()) {
                jVar.mo61678B(mVPaymentRequestProperties.properties.size());
                for (Map.Entry next : mVPaymentRequestProperties.properties.entrySet()) {
                    jVar.mo61686J((String) next.getKey());
                    jVar.mo61686J((String) next.getValue());
                }
            }
            if (mVPaymentRequestProperties.mo30422f()) {
                jVar.mo61686J(mVPaymentRequestProperties.discountContextId);
            }
            if (mVPaymentRequestProperties.mo30426i()) {
                mVPaymentRequestProperties.paymentOptions.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRequestProperties mVPaymentRequestProperties = (MVPaymentRequestProperties) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVPaymentRequestProperties.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPaymentRequestProperties.itemPrice = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVPaymentRequestProperties.properties = new HashMap(i * 2);
                for (int i2 = 0; i2 < i; i2++) {
                    mVPaymentRequestProperties.properties.put(jVar.mo61704q(), jVar.mo61704q());
                }
            }
            if (T.get(3)) {
                mVPaymentRequestProperties.discountContextId = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVPaymentOptions mVPaymentOptions = new MVPaymentOptions();
                mVPaymentRequestProperties.paymentOptions = mVPaymentOptions;
                mVPaymentOptions.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRequestProperties$d */
    public static class C10002d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10001c(0);
        }
    }

    static {
        new C17394d0("MVPaymentRequestProperties");
        HashMap hashMap = new HashMap();
        f27604g = hashMap;
        hashMap.put(C25239c.class, new C10000b());
        hashMap.put(C25240d.class, new C10002d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ITEM_PRICE, new FieldMetaData("itemPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.PROPERTIES, new FieldMetaData("properties", (byte) 2, new MapMetaData(new FieldValueMetaData((byte) 11, false), new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_OPTIONS, new FieldMetaData("paymentOptions", (byte) 2, new StructMetaData(MVPaymentOptions.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27605h = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentRequestProperties.class, unmodifiableMap);
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
        ((C25238b) f27604g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27604g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30419a(MVPaymentRequestProperties mVPaymentRequestProperties) {
        if (mVPaymentRequestProperties == null) {
            return false;
        }
        boolean h = mo30424h();
        boolean h2 = mVPaymentRequestProperties.mo30424h();
        if ((h || h2) && (!h || !h2 || !this.paymentContext.equals(mVPaymentRequestProperties.paymentContext))) {
            return false;
        }
        boolean g = mo30423g();
        boolean g2 = mVPaymentRequestProperties.mo30423g();
        if ((g || g2) && (!g || !g2 || !this.itemPrice.mo26102a(mVPaymentRequestProperties.itemPrice))) {
            return false;
        }
        boolean j = mo30427j();
        boolean j2 = mVPaymentRequestProperties.mo30427j();
        if ((j || j2) && (!j || !j2 || !this.properties.equals(mVPaymentRequestProperties.properties))) {
            return false;
        }
        boolean f = mo30422f();
        boolean f2 = mVPaymentRequestProperties.mo30422f();
        if ((f || f2) && (!f || !f2 || !this.discountContextId.equals(mVPaymentRequestProperties.discountContextId))) {
            return false;
        }
        boolean i = mo30426i();
        boolean i2 = mVPaymentRequestProperties.mo30426i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.paymentOptions.mo30276a(mVPaymentRequestProperties.paymentOptions)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentRequestProperties mVPaymentRequestProperties = (MVPaymentRequestProperties) obj;
        if (!getClass().equals(mVPaymentRequestProperties.getClass())) {
            return getClass().getName().compareTo(mVPaymentRequestProperties.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30424h()).compareTo(Boolean.valueOf(mVPaymentRequestProperties.mo30424h()));
        if (compareTo2 != 0 || ((mo30424h() && (compareTo2 = this.paymentContext.compareTo(mVPaymentRequestProperties.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo30423g()).compareTo(Boolean.valueOf(mVPaymentRequestProperties.mo30423g()))) != 0 || ((mo30423g() && (compareTo2 = this.itemPrice.compareTo(mVPaymentRequestProperties.itemPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo30427j()).compareTo(Boolean.valueOf(mVPaymentRequestProperties.mo30427j()))) != 0 || ((mo30427j() && (compareTo2 = C25082a.m62845i(this.properties, mVPaymentRequestProperties.properties)) != 0) || (compareTo2 = Boolean.valueOf(mo30422f()).compareTo(Boolean.valueOf(mVPaymentRequestProperties.mo30422f()))) != 0 || ((mo30422f() && (compareTo2 = this.discountContextId.compareTo(mVPaymentRequestProperties.discountContextId)) != 0) || (compareTo2 = Boolean.valueOf(mo30426i()).compareTo(Boolean.valueOf(mVPaymentRequestProperties.mo30426i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo30426i() || (compareTo = this.paymentOptions.compareTo(mVPaymentRequestProperties.paymentOptions)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentRequestProperties)) {
            return mo30419a((MVPaymentRequestProperties) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30422f() {
        return this.discountContextId != null;
    }

    /* renamed from: g */
    public final boolean mo30423g() {
        return this.itemPrice != null;
    }

    /* renamed from: h */
    public final boolean mo30424h() {
        return this.paymentContext != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30426i() {
        return this.paymentOptions != null;
    }

    /* renamed from: j */
    public final boolean mo30427j() {
        return this.properties != null;
    }

    /* renamed from: k */
    public final void mo30428k() throws TException {
        MVCurrencyAmount mVCurrencyAmount = this.itemPrice;
        if (mVCurrencyAmount != null) {
            mVCurrencyAmount.getClass();
        }
        MVPaymentOptions mVPaymentOptions = this.paymentOptions;
        if (mVPaymentOptions != null) {
            mVPaymentOptions.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentRequestProperties(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo30423g()) {
            n.append(", ");
            n.append("itemPrice:");
            MVCurrencyAmount mVCurrencyAmount = this.itemPrice;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        if (mo30427j()) {
            n.append(", ");
            n.append("properties:");
            Map<String, String> map = this.properties;
            if (map == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(map);
            }
        }
        if (mo30422f()) {
            n.append(", ");
            n.append("discountContextId:");
            String str2 = this.discountContextId;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo30426i()) {
            n.append(", ");
            n.append("paymentOptions:");
            MVPaymentOptions mVPaymentOptions = this.paymentOptions;
            if (mVPaymentOptions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentOptions);
            }
        }
        n.append(")");
        return n.toString();
    }
}
