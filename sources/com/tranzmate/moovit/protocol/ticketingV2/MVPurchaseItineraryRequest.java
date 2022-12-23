package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
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

public class MVPurchaseItineraryRequest implements TBase<MVPurchaseItineraryRequest, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseItineraryRequest> {

    /* renamed from: b */
    public static final C25113c f28902b = new C25113c("contextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28903c = new C25113c("itineraryId", (byte) 11, 4);

    /* renamed from: d */
    public static final C25113c f28904d = new C25113c("totalPrice", (byte) 12, 5);

    /* renamed from: e */
    public static final C25113c f28905e = new C25113c("verifacationInfo", (byte) 12, 6);

    /* renamed from: f */
    public static final C25113c f28906f = new C25113c("paymentProvider", (byte) 12, 7);

    /* renamed from: g */
    public static final C25113c f28907g = new C25113c("properties", (byte) 13, 8);

    /* renamed from: h */
    public static final C25113c f28908h = new C25113c("discountContextId", (byte) 11, 9);

    /* renamed from: i */
    public static final HashMap f28909i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f28910j;
    public String contextId;
    public String discountContextId;
    public String itineraryId;
    private _Fields[] optionals = {_Fields.VERIFACATION_INFO, _Fields.PAYMENT_PROVIDER, _Fields.PROPERTIES, _Fields.DISCOUNT_CONTEXT_ID};
    public MVPaymentProvider paymentProvider;
    public Map<String, String> properties;
    public MVCurrencyAmount totalPrice;
    public MVPurchaseVerifacationInfo verifacationInfo;

    public enum _Fields implements C25085c {
        CONTEXT_ID(1, "contextId"),
        ITINERARY_ID(4, "itineraryId"),
        TOTAL_PRICE(5, "totalPrice"),
        VERIFACATION_INFO(6, "verifacationInfo"),
        PAYMENT_PROVIDER(7, "paymentProvider"),
        PROPERTIES(8, "properties"),
        DISCOUNT_CONTEXT_ID(9, "discountContextId");
        
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
                return CONTEXT_ID;
            }
            switch (i) {
                case 4:
                    return ITINERARY_ID;
                case 5:
                    return TOTAL_PRICE;
                case 6:
                    return VERIFACATION_INFO;
                case 7:
                    return PAYMENT_PROVIDER;
                case 8:
                    return PROPERTIES;
                case 9:
                    return DISCOUNT_CONTEXT_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryRequest$a */
    public static class C10924a extends C25239c<MVPurchaseItineraryRequest> {
        public C10924a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryRequest mVPurchaseItineraryRequest = (MVPurchaseItineraryRequest) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVPurchaseItineraryRequest.totalPrice;
            C25113c cVar = MVPurchaseItineraryRequest.f28902b;
            gVar.mo61687K();
            if (mVPurchaseItineraryRequest.contextId != null) {
                gVar.mo61711x(MVPurchaseItineraryRequest.f28902b);
                gVar.mo61686J(mVPurchaseItineraryRequest.contextId);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryRequest.itineraryId != null) {
                gVar.mo61711x(MVPurchaseItineraryRequest.f28903c);
                gVar.mo61686J(mVPurchaseItineraryRequest.itineraryId);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryRequest.totalPrice != null) {
                gVar.mo61711x(MVPurchaseItineraryRequest.f28904d);
                mVPurchaseItineraryRequest.totalPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryRequest.verifacationInfo != null && mVPurchaseItineraryRequest.mo32681l()) {
                gVar.mo61711x(MVPurchaseItineraryRequest.f28905e);
                mVPurchaseItineraryRequest.verifacationInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryRequest.paymentProvider != null && mVPurchaseItineraryRequest.mo32678i()) {
                gVar.mo61711x(MVPurchaseItineraryRequest.f28906f);
                mVPurchaseItineraryRequest.paymentProvider.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryRequest.properties != null && mVPurchaseItineraryRequest.mo32679j()) {
                gVar.mo61711x(MVPurchaseItineraryRequest.f28907g);
                gVar.mo61682F(new C25120f((byte) 11, (byte) 11, mVPurchaseItineraryRequest.properties.size()));
                for (Map.Entry next : mVPurchaseItineraryRequest.properties.entrySet()) {
                    gVar.mo61686J((String) next.getKey());
                    gVar.mo61686J((String) next.getValue());
                }
                gVar.mo61683G();
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryRequest.discountContextId != null && mVPurchaseItineraryRequest.mo32675g()) {
                gVar.mo61711x(MVPurchaseItineraryRequest.f28908h);
                gVar.mo61686J(mVPurchaseItineraryRequest.discountContextId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryRequest mVPurchaseItineraryRequest = (MVPurchaseItineraryRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVPurchaseItineraryRequest.totalPrice;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    switch (s) {
                        case 4:
                            if (b != 11) {
                                C25122h.m63098a(gVar, b);
                                break;
                            } else {
                                mVPurchaseItineraryRequest.itineraryId = gVar.mo61704q();
                                break;
                            }
                        case 5:
                            if (b != 12) {
                                C25122h.m63098a(gVar, b);
                                break;
                            } else {
                                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                                mVPurchaseItineraryRequest.totalPrice = mVCurrencyAmount2;
                                mVCurrencyAmount2.mo25201C1(gVar);
                                break;
                            }
                        case 6:
                            if (b != 12) {
                                C25122h.m63098a(gVar, b);
                                break;
                            } else {
                                MVPurchaseVerifacationInfo mVPurchaseVerifacationInfo = new MVPurchaseVerifacationInfo();
                                mVPurchaseItineraryRequest.verifacationInfo = mVPurchaseVerifacationInfo;
                                mVPurchaseVerifacationInfo.mo25201C1(gVar);
                                break;
                            }
                        case 7:
                            if (b != 12) {
                                C25122h.m63098a(gVar, b);
                                break;
                            } else {
                                MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                                mVPurchaseItineraryRequest.paymentProvider = mVPaymentProvider;
                                mVPaymentProvider.mo25201C1(gVar);
                                break;
                            }
                        case 8:
                            if (b != 13) {
                                C25122h.m63098a(gVar, b);
                                break;
                            } else {
                                C25120f m = gVar.mo61700m();
                                mVPurchaseItineraryRequest.properties = new HashMap(m.f63398c * 2);
                                for (int i = 0; i < m.f63398c; i++) {
                                    mVPurchaseItineraryRequest.properties.put(gVar.mo61704q(), gVar.mo61704q());
                                }
                                gVar.mo61701n();
                                break;
                            }
                        case 9:
                            if (b != 11) {
                                C25122h.m63098a(gVar, b);
                                break;
                            } else {
                                mVPurchaseItineraryRequest.discountContextId = gVar.mo61704q();
                                break;
                            }
                        default:
                            C25122h.m63098a(gVar, b);
                            break;
                    }
                } else if (b == 11) {
                    mVPurchaseItineraryRequest.contextId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryRequest$b */
    public static class C10925b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10924a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryRequest$c */
    public static class C10926c extends C25240d<MVPurchaseItineraryRequest> {
        public C10926c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryRequest mVPurchaseItineraryRequest = (MVPurchaseItineraryRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseItineraryRequest.mo32674f()) {
                bitSet.set(0);
            }
            if (mVPurchaseItineraryRequest.mo32676h()) {
                bitSet.set(1);
            }
            if (mVPurchaseItineraryRequest.mo32680k()) {
                bitSet.set(2);
            }
            if (mVPurchaseItineraryRequest.mo32681l()) {
                bitSet.set(3);
            }
            if (mVPurchaseItineraryRequest.mo32678i()) {
                bitSet.set(4);
            }
            if (mVPurchaseItineraryRequest.mo32679j()) {
                bitSet.set(5);
            }
            if (mVPurchaseItineraryRequest.mo32675g()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVPurchaseItineraryRequest.mo32674f()) {
                jVar.mo61686J(mVPurchaseItineraryRequest.contextId);
            }
            if (mVPurchaseItineraryRequest.mo32676h()) {
                jVar.mo61686J(mVPurchaseItineraryRequest.itineraryId);
            }
            if (mVPurchaseItineraryRequest.mo32680k()) {
                mVPurchaseItineraryRequest.totalPrice.mo25202X0(jVar);
            }
            if (mVPurchaseItineraryRequest.mo32681l()) {
                mVPurchaseItineraryRequest.verifacationInfo.mo25202X0(jVar);
            }
            if (mVPurchaseItineraryRequest.mo32678i()) {
                mVPurchaseItineraryRequest.paymentProvider.mo25202X0(jVar);
            }
            if (mVPurchaseItineraryRequest.mo32679j()) {
                jVar.mo61678B(mVPurchaseItineraryRequest.properties.size());
                for (Map.Entry next : mVPurchaseItineraryRequest.properties.entrySet()) {
                    jVar.mo61686J((String) next.getKey());
                    jVar.mo61686J((String) next.getValue());
                }
            }
            if (mVPurchaseItineraryRequest.mo32675g()) {
                jVar.mo61686J(mVPurchaseItineraryRequest.discountContextId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryRequest mVPurchaseItineraryRequest = (MVPurchaseItineraryRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVPurchaseItineraryRequest.contextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPurchaseItineraryRequest.itineraryId = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPurchaseItineraryRequest.totalPrice = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVPurchaseVerifacationInfo mVPurchaseVerifacationInfo = new MVPurchaseVerifacationInfo();
                mVPurchaseItineraryRequest.verifacationInfo = mVPurchaseVerifacationInfo;
                mVPurchaseVerifacationInfo.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                mVPurchaseItineraryRequest.paymentProvider = mVPaymentProvider;
                mVPaymentProvider.mo25201C1(jVar);
            }
            if (T.get(5)) {
                int i = jVar.mo61696i();
                mVPurchaseItineraryRequest.properties = new HashMap(i * 2);
                for (int i2 = 0; i2 < i; i2++) {
                    mVPurchaseItineraryRequest.properties.put(jVar.mo61704q(), jVar.mo61704q());
                }
            }
            if (T.get(6)) {
                mVPurchaseItineraryRequest.discountContextId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryRequest$d */
    public static class C10927d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10926c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseItineraryRequest");
        HashMap hashMap = new HashMap();
        f28909i = hashMap;
        hashMap.put(C25239c.class, new C10925b());
        hashMap.put(C25240d.class, new C10927d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT_ID, new FieldMetaData("contextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ITINERARY_ID, new FieldMetaData("itineraryId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TOTAL_PRICE, new FieldMetaData("totalPrice", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.VERIFACATION_INFO, new FieldMetaData("verifacationInfo", (byte) 2, new StructMetaData(MVPurchaseVerifacationInfo.class)));
        enumMap.put(_Fields.PAYMENT_PROVIDER, new FieldMetaData("paymentProvider", (byte) 2, new StructMetaData(MVPaymentProvider.class)));
        enumMap.put(_Fields.PROPERTIES, new FieldMetaData("properties", (byte) 2, new MapMetaData(new FieldValueMetaData((byte) 11, false), new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28910j = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseItineraryRequest.class, unmodifiableMap);
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
        ((C25238b) f28909i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28909i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseItineraryRequest mVPurchaseItineraryRequest = (MVPurchaseItineraryRequest) obj;
        if (!getClass().equals(mVPurchaseItineraryRequest.getClass())) {
            return getClass().getName().compareTo(mVPurchaseItineraryRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32674f()).compareTo(Boolean.valueOf(mVPurchaseItineraryRequest.mo32674f()));
        if (compareTo2 != 0 || ((mo32674f() && (compareTo2 = this.contextId.compareTo(mVPurchaseItineraryRequest.contextId)) != 0) || (compareTo2 = Boolean.valueOf(mo32676h()).compareTo(Boolean.valueOf(mVPurchaseItineraryRequest.mo32676h()))) != 0 || ((mo32676h() && (compareTo2 = this.itineraryId.compareTo(mVPurchaseItineraryRequest.itineraryId)) != 0) || (compareTo2 = Boolean.valueOf(mo32680k()).compareTo(Boolean.valueOf(mVPurchaseItineraryRequest.mo32680k()))) != 0 || ((mo32680k() && (compareTo2 = this.totalPrice.compareTo(mVPurchaseItineraryRequest.totalPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo32681l()).compareTo(Boolean.valueOf(mVPurchaseItineraryRequest.mo32681l()))) != 0 || ((mo32681l() && (compareTo2 = this.verifacationInfo.compareTo(mVPurchaseItineraryRequest.verifacationInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo32678i()).compareTo(Boolean.valueOf(mVPurchaseItineraryRequest.mo32678i()))) != 0 || ((mo32678i() && (compareTo2 = this.paymentProvider.compareTo(mVPurchaseItineraryRequest.paymentProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo32679j()).compareTo(Boolean.valueOf(mVPurchaseItineraryRequest.mo32679j()))) != 0 || ((mo32679j() && (compareTo2 = C25082a.m62845i(this.properties, mVPurchaseItineraryRequest.properties)) != 0) || (compareTo2 = Boolean.valueOf(mo32675g()).compareTo(Boolean.valueOf(mVPurchaseItineraryRequest.mo32675g()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo32675g() || (compareTo = this.discountContextId.compareTo(mVPurchaseItineraryRequest.discountContextId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseItineraryRequest)) {
            return false;
        }
        MVPurchaseItineraryRequest mVPurchaseItineraryRequest = (MVPurchaseItineraryRequest) obj;
        boolean f = mo32674f();
        boolean f2 = mVPurchaseItineraryRequest.mo32674f();
        if ((f || f2) && (!f || !f2 || !this.contextId.equals(mVPurchaseItineraryRequest.contextId))) {
            return false;
        }
        boolean h = mo32676h();
        boolean h2 = mVPurchaseItineraryRequest.mo32676h();
        if ((h || h2) && (!h || !h2 || !this.itineraryId.equals(mVPurchaseItineraryRequest.itineraryId))) {
            return false;
        }
        boolean k = mo32680k();
        boolean k2 = mVPurchaseItineraryRequest.mo32680k();
        if ((k || k2) && (!k || !k2 || !this.totalPrice.mo26102a(mVPurchaseItineraryRequest.totalPrice))) {
            return false;
        }
        boolean l = mo32681l();
        boolean l2 = mVPurchaseItineraryRequest.mo32681l();
        if ((l || l2) && (!l || !l2 || !this.verifacationInfo.mo32924l(mVPurchaseItineraryRequest.verifacationInfo))) {
            return false;
        }
        boolean i = mo32678i();
        boolean i2 = mVPurchaseItineraryRequest.mo32678i();
        if ((i || i2) && (!i || !i2 || !this.paymentProvider.mo30299m(mVPurchaseItineraryRequest.paymentProvider))) {
            return false;
        }
        boolean j = mo32679j();
        boolean j2 = mVPurchaseItineraryRequest.mo32679j();
        if ((j || j2) && (!j || !j2 || !this.properties.equals(mVPurchaseItineraryRequest.properties))) {
            return false;
        }
        boolean g = mo32675g();
        boolean g2 = mVPurchaseItineraryRequest.mo32675g();
        if ((g || g2) && (!g || !g2 || !this.discountContextId.equals(mVPurchaseItineraryRequest.discountContextId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32674f() {
        return this.contextId != null;
    }

    /* renamed from: g */
    public final boolean mo32675g() {
        return this.discountContextId != null;
    }

    /* renamed from: h */
    public final boolean mo32676h() {
        return this.itineraryId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32678i() {
        return this.paymentProvider != null;
    }

    /* renamed from: j */
    public final boolean mo32679j() {
        return this.properties != null;
    }

    /* renamed from: k */
    public final boolean mo32680k() {
        return this.totalPrice != null;
    }

    /* renamed from: l */
    public final boolean mo32681l() {
        return this.verifacationInfo != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseItineraryRequest(", "contextId:");
        String str = this.contextId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("itineraryId:");
        String str2 = this.itineraryId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("totalPrice:");
        MVCurrencyAmount mVCurrencyAmount = this.totalPrice;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        if (mo32681l()) {
            n.append(", ");
            n.append("verifacationInfo:");
            MVPurchaseVerifacationInfo mVPurchaseVerifacationInfo = this.verifacationInfo;
            if (mVPurchaseVerifacationInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPurchaseVerifacationInfo);
            }
        }
        if (mo32678i()) {
            n.append(", ");
            n.append("paymentProvider:");
            MVPaymentProvider mVPaymentProvider = this.paymentProvider;
            if (mVPaymentProvider == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentProvider);
            }
        }
        if (mo32679j()) {
            n.append(", ");
            n.append("properties:");
            Map<String, String> map = this.properties;
            if (map == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(map);
            }
        }
        if (mo32675g()) {
            n.append(", ");
            n.append("discountContextId:");
            String str3 = this.discountContextId;
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
