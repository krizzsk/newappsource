package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
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
import org.apache.thrift.meta_data.MapMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p389bl.C13637c;
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

public class MVPaymentProperties implements TBase<MVPaymentProperties, _Fields>, Serializable, Cloneable, Comparable<MVPaymentProperties> {

    /* renamed from: b */
    public static final C25113c f27515b = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27516c = new C25113c("paymentDescription", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27517d = new C25113c("saveForLater", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f27518e = new C25113c("paymentContext", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27519f = new C25113c("properties", (byte) 13, 5);

    /* renamed from: g */
    public static final HashMap f27520g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27521h;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.PROPERTIES};
    public String paymentContext;
    public String paymentDescription;
    public MVCurrencyAmount price;
    public Map<String, String> properties;
    public boolean saveForLater;

    public enum _Fields implements C25085c {
        PRICE(1, InAppPurchaseMetaData.KEY_PRICE),
        PAYMENT_DESCRIPTION(2, "paymentDescription"),
        SAVE_FOR_LATER(3, "saveForLater"),
        PAYMENT_CONTEXT(4, "paymentContext"),
        PROPERTIES(5, "properties");
        
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
                return PRICE;
            }
            if (i == 2) {
                return PAYMENT_DESCRIPTION;
            }
            if (i == 3) {
                return SAVE_FOR_LATER;
            }
            if (i == 4) {
                return PAYMENT_CONTEXT;
            }
            if (i != 5) {
                return null;
            }
            return PROPERTIES;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentProperties$a */
    public static class C9930a extends C25239c<MVPaymentProperties> {
        public C9930a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentProperties mVPaymentProperties = (MVPaymentProperties) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVPaymentProperties.price;
            C25113c cVar = MVPaymentProperties.f27515b;
            gVar.mo61687K();
            if (mVPaymentProperties.price != null) {
                gVar.mo61711x(MVPaymentProperties.f27515b);
                mVPaymentProperties.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentProperties.paymentDescription != null) {
                gVar.mo61711x(MVPaymentProperties.f27516c);
                gVar.mo61686J(mVPaymentProperties.paymentDescription);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPaymentProperties.f27517d);
            gVar.mo61708u(mVPaymentProperties.saveForLater);
            gVar.mo61712y();
            if (mVPaymentProperties.paymentContext != null) {
                gVar.mo61711x(MVPaymentProperties.f27518e);
                gVar.mo61686J(mVPaymentProperties.paymentContext);
                gVar.mo61712y();
            }
            if (mVPaymentProperties.properties != null && mVPaymentProperties.mo30291i()) {
                gVar.mo61711x(MVPaymentProperties.f27519f);
                gVar.mo61682F(new C25120f((byte) 11, (byte) 11, mVPaymentProperties.properties.size()));
                for (Map.Entry next : mVPaymentProperties.properties.entrySet()) {
                    gVar.mo61686J((String) next.getKey());
                    gVar.mo61686J((String) next.getValue());
                }
                gVar.mo61683G();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentProperties mVPaymentProperties = (MVPaymentProperties) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVPaymentProperties.price;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 13) {
                                    C25120f m = gVar.mo61700m();
                                    mVPaymentProperties.properties = new HashMap(m.f63398c * 2);
                                    for (int i = 0; i < m.f63398c; i++) {
                                        mVPaymentProperties.properties.put(gVar.mo61704q(), gVar.mo61704q());
                                    }
                                    gVar.mo61701n();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVPaymentProperties.paymentContext = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVPaymentProperties.saveForLater = gVar.mo61690c();
                            mVPaymentProperties.mo30293k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPaymentProperties.paymentDescription = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                    mVPaymentProperties.price = mVCurrencyAmount2;
                    mVCurrencyAmount2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentProperties$b */
    public static class C9931b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9930a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentProperties$c */
    public static class C9932c extends C25240d<MVPaymentProperties> {
        public C9932c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentProperties mVPaymentProperties = (MVPaymentProperties) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentProperties.mo30289h()) {
                bitSet.set(0);
            }
            if (mVPaymentProperties.mo30288g()) {
                bitSet.set(1);
            }
            if (mVPaymentProperties.mo30292j()) {
                bitSet.set(2);
            }
            if (mVPaymentProperties.mo30287f()) {
                bitSet.set(3);
            }
            if (mVPaymentProperties.mo30291i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPaymentProperties.mo30289h()) {
                mVPaymentProperties.price.mo25202X0(jVar);
            }
            if (mVPaymentProperties.mo30288g()) {
                jVar.mo61686J(mVPaymentProperties.paymentDescription);
            }
            if (mVPaymentProperties.mo30292j()) {
                jVar.mo61708u(mVPaymentProperties.saveForLater);
            }
            if (mVPaymentProperties.mo30287f()) {
                jVar.mo61686J(mVPaymentProperties.paymentContext);
            }
            if (mVPaymentProperties.mo30291i()) {
                jVar.mo61678B(mVPaymentProperties.properties.size());
                for (Map.Entry next : mVPaymentProperties.properties.entrySet()) {
                    jVar.mo61686J((String) next.getKey());
                    jVar.mo61686J((String) next.getValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentProperties mVPaymentProperties = (MVPaymentProperties) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPaymentProperties.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVPaymentProperties.paymentDescription = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPaymentProperties.saveForLater = jVar.mo61690c();
                mVPaymentProperties.mo30293k();
            }
            if (T.get(3)) {
                mVPaymentProperties.paymentContext = jVar.mo61704q();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVPaymentProperties.properties = new HashMap(i * 2);
                for (int i2 = 0; i2 < i; i2++) {
                    mVPaymentProperties.properties.put(jVar.mo61704q(), jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentProperties$d */
    public static class C9933d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9932c(0);
        }
    }

    static {
        new C17394d0("MVPaymentProperties");
        HashMap hashMap = new HashMap();
        f27520g = hashMap;
        hashMap.put(C25239c.class, new C9931b());
        hashMap.put(C25240d.class, new C9933d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.PAYMENT_DESCRIPTION, new FieldMetaData("paymentDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SAVE_FOR_LATER, new FieldMetaData("saveForLater", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROPERTIES, new FieldMetaData("properties", (byte) 2, new MapMetaData(new FieldValueMetaData((byte) 11, false), new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27521h = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentProperties.class, unmodifiableMap);
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
        ((C25238b) f27520g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27520g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30284a(MVPaymentProperties mVPaymentProperties) {
        if (mVPaymentProperties == null) {
            return false;
        }
        boolean h = mo30289h();
        boolean h2 = mVPaymentProperties.mo30289h();
        if ((h || h2) && (!h || !h2 || !this.price.mo26102a(mVPaymentProperties.price))) {
            return false;
        }
        boolean g = mo30288g();
        boolean g2 = mVPaymentProperties.mo30288g();
        if (((g || g2) && (!g || !g2 || !this.paymentDescription.equals(mVPaymentProperties.paymentDescription))) || this.saveForLater != mVPaymentProperties.saveForLater) {
            return false;
        }
        boolean f = mo30287f();
        boolean f2 = mVPaymentProperties.mo30287f();
        if ((f || f2) && (!f || !f2 || !this.paymentContext.equals(mVPaymentProperties.paymentContext))) {
            return false;
        }
        boolean i = mo30291i();
        boolean i2 = mVPaymentProperties.mo30291i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.properties.equals(mVPaymentProperties.properties)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int i;
        MVPaymentProperties mVPaymentProperties = (MVPaymentProperties) obj;
        if (!getClass().equals(mVPaymentProperties.getClass())) {
            return getClass().getName().compareTo(mVPaymentProperties.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30289h()).compareTo(Boolean.valueOf(mVPaymentProperties.mo30289h()));
        if (compareTo != 0 || ((mo30289h() && (compareTo = this.price.compareTo(mVPaymentProperties.price)) != 0) || (compareTo = Boolean.valueOf(mo30288g()).compareTo(Boolean.valueOf(mVPaymentProperties.mo30288g()))) != 0 || ((mo30288g() && (compareTo = this.paymentDescription.compareTo(mVPaymentProperties.paymentDescription)) != 0) || (compareTo = Boolean.valueOf(mo30292j()).compareTo(Boolean.valueOf(mVPaymentProperties.mo30292j()))) != 0 || ((mo30292j() && (compareTo = C25082a.m62848l(this.saveForLater, mVPaymentProperties.saveForLater)) != 0) || (compareTo = Boolean.valueOf(mo30287f()).compareTo(Boolean.valueOf(mVPaymentProperties.mo30287f()))) != 0 || ((mo30287f() && (compareTo = this.paymentContext.compareTo(mVPaymentProperties.paymentContext)) != 0) || (compareTo = Boolean.valueOf(mo30291i()).compareTo(Boolean.valueOf(mVPaymentProperties.mo30291i()))) != 0))))) {
            return compareTo;
        }
        if (!mo30291i() || (i = C25082a.m62845i(this.properties, mVPaymentProperties.properties)) == 0) {
            return 0;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentProperties)) {
            return mo30284a((MVPaymentProperties) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30287f() {
        return this.paymentContext != null;
    }

    /* renamed from: g */
    public final boolean mo30288g() {
        return this.paymentDescription != null;
    }

    /* renamed from: h */
    public final boolean mo30289h() {
        return this.price != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30291i() {
        return this.properties != null;
    }

    /* renamed from: j */
    public final boolean mo30292j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo30293k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentProperties(", "price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(", ");
        n.append("paymentDescription:");
        String str = this.paymentDescription;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("saveForLater:");
        C13555b.m33977q(n, this.saveForLater, ", ", "paymentContext:");
        String str2 = this.paymentContext;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo30291i()) {
            n.append(", ");
            n.append("properties:");
            Map<String, String> map = this.properties;
            if (map == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(map);
            }
        }
        n.append(")");
        return n.toString();
    }
}
