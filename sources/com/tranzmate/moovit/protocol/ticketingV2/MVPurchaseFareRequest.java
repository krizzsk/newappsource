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

public class MVPurchaseFareRequest implements TBase<MVPurchaseFareRequest, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseFareRequest> {

    /* renamed from: b */
    public static final C25113c f28810b = new C25113c("contextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28811c = new C25113c("providerId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28812d = new C25113c("fareId", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28813e = new C25113c("quantity", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f28814f = new C25113c("totalPrice", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f28815g = new C25113c("verifacationInfo", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f28816h = new C25113c("paymentProvider", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f28817i = new C25113c("discountContextId", (byte) 11, 8);

    /* renamed from: j */
    public static final HashMap f28818j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f28819k;
    private byte __isset_bitfield = 0;
    public String contextId;
    public String discountContextId;
    public String fareId;
    private _Fields[] optionals = {_Fields.VERIFACATION_INFO, _Fields.PAYMENT_PROVIDER, _Fields.DISCOUNT_CONTEXT_ID};
    public MVPaymentProvider paymentProvider;
    public int providerId;
    public int quantity;
    public MVCurrencyAmount totalPrice;
    public MVPurchaseVerifacationInfo verifacationInfo;

    public enum _Fields implements C25085c {
        CONTEXT_ID(1, "contextId"),
        PROVIDER_ID(2, "providerId"),
        FARE_ID(3, "fareId"),
        QUANTITY(4, "quantity"),
        TOTAL_PRICE(5, "totalPrice"),
        VERIFACATION_INFO(6, "verifacationInfo"),
        PAYMENT_PROVIDER(7, "paymentProvider"),
        DISCOUNT_CONTEXT_ID(8, "discountContextId");
        
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
                    return CONTEXT_ID;
                case 2:
                    return PROVIDER_ID;
                case 3:
                    return FARE_ID;
                case 4:
                    return QUANTITY;
                case 5:
                    return TOTAL_PRICE;
                case 6:
                    return VERIFACATION_INFO;
                case 7:
                    return PAYMENT_PROVIDER;
                case 8:
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareRequest$a */
    public static class C10873a extends C25239c<MVPurchaseFareRequest> {
        public C10873a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFareRequest mVPurchaseFareRequest = (MVPurchaseFareRequest) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVPurchaseFareRequest.totalPrice;
            C25113c cVar = MVPurchaseFareRequest.f28810b;
            gVar.mo61687K();
            if (mVPurchaseFareRequest.contextId != null) {
                gVar.mo61711x(MVPurchaseFareRequest.f28810b);
                gVar.mo61686J(mVPurchaseFareRequest.contextId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPurchaseFareRequest.f28811c);
            gVar.mo61678B(mVPurchaseFareRequest.providerId);
            gVar.mo61712y();
            if (mVPurchaseFareRequest.fareId != null) {
                gVar.mo61711x(MVPurchaseFareRequest.f28812d);
                gVar.mo61686J(mVPurchaseFareRequest.fareId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPurchaseFareRequest.f28813e);
            gVar.mo61678B(mVPurchaseFareRequest.quantity);
            gVar.mo61712y();
            if (mVPurchaseFareRequest.totalPrice != null) {
                gVar.mo61711x(MVPurchaseFareRequest.f28814f);
                mVPurchaseFareRequest.totalPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseFareRequest.verifacationInfo != null && mVPurchaseFareRequest.mo32551m()) {
                gVar.mo61711x(MVPurchaseFareRequest.f28815g);
                mVPurchaseFareRequest.verifacationInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseFareRequest.paymentProvider != null && mVPurchaseFareRequest.mo32547i()) {
                gVar.mo61711x(MVPurchaseFareRequest.f28816h);
                mVPurchaseFareRequest.paymentProvider.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseFareRequest.discountContextId != null && mVPurchaseFareRequest.mo32544g()) {
                gVar.mo61711x(MVPurchaseFareRequest.f28817i);
                gVar.mo61686J(mVPurchaseFareRequest.discountContextId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFareRequest mVPurchaseFareRequest = (MVPurchaseFareRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVPurchaseFareRequest.totalPrice;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseFareRequest.contextId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseFareRequest.providerId = gVar.mo61696i();
                            mVPurchaseFareRequest.mo32552o();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseFareRequest.fareId = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseFareRequest.quantity = gVar.mo61696i();
                            mVPurchaseFareRequest.mo32553p();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVPurchaseFareRequest.totalPrice = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPurchaseVerifacationInfo mVPurchaseVerifacationInfo = new MVPurchaseVerifacationInfo();
                            mVPurchaseFareRequest.verifacationInfo = mVPurchaseVerifacationInfo;
                            mVPurchaseVerifacationInfo.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                            mVPurchaseFareRequest.paymentProvider = mVPaymentProvider;
                            mVPaymentProvider.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseFareRequest.discountContextId = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareRequest$b */
    public static class C10874b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10873a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareRequest$c */
    public static class C10875c extends C25240d<MVPurchaseFareRequest> {
        public C10875c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFareRequest mVPurchaseFareRequest = (MVPurchaseFareRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseFareRequest.mo32543f()) {
                bitSet.set(0);
            }
            if (mVPurchaseFareRequest.mo32548j()) {
                bitSet.set(1);
            }
            if (mVPurchaseFareRequest.mo32545h()) {
                bitSet.set(2);
            }
            if (mVPurchaseFareRequest.mo32549k()) {
                bitSet.set(3);
            }
            if (mVPurchaseFareRequest.mo32550l()) {
                bitSet.set(4);
            }
            if (mVPurchaseFareRequest.mo32551m()) {
                bitSet.set(5);
            }
            if (mVPurchaseFareRequest.mo32547i()) {
                bitSet.set(6);
            }
            if (mVPurchaseFareRequest.mo32544g()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVPurchaseFareRequest.mo32543f()) {
                jVar.mo61686J(mVPurchaseFareRequest.contextId);
            }
            if (mVPurchaseFareRequest.mo32548j()) {
                jVar.mo61678B(mVPurchaseFareRequest.providerId);
            }
            if (mVPurchaseFareRequest.mo32545h()) {
                jVar.mo61686J(mVPurchaseFareRequest.fareId);
            }
            if (mVPurchaseFareRequest.mo32549k()) {
                jVar.mo61678B(mVPurchaseFareRequest.quantity);
            }
            if (mVPurchaseFareRequest.mo32550l()) {
                mVPurchaseFareRequest.totalPrice.mo25202X0(jVar);
            }
            if (mVPurchaseFareRequest.mo32551m()) {
                mVPurchaseFareRequest.verifacationInfo.mo25202X0(jVar);
            }
            if (mVPurchaseFareRequest.mo32547i()) {
                mVPurchaseFareRequest.paymentProvider.mo25202X0(jVar);
            }
            if (mVPurchaseFareRequest.mo32544g()) {
                jVar.mo61686J(mVPurchaseFareRequest.discountContextId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFareRequest mVPurchaseFareRequest = (MVPurchaseFareRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVPurchaseFareRequest.contextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPurchaseFareRequest.providerId = jVar.mo61696i();
                mVPurchaseFareRequest.mo32552o();
            }
            if (T.get(2)) {
                mVPurchaseFareRequest.fareId = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVPurchaseFareRequest.quantity = jVar.mo61696i();
                mVPurchaseFareRequest.mo32553p();
            }
            if (T.get(4)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPurchaseFareRequest.totalPrice = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVPurchaseVerifacationInfo mVPurchaseVerifacationInfo = new MVPurchaseVerifacationInfo();
                mVPurchaseFareRequest.verifacationInfo = mVPurchaseVerifacationInfo;
                mVPurchaseVerifacationInfo.mo25201C1(jVar);
            }
            if (T.get(6)) {
                MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                mVPurchaseFareRequest.paymentProvider = mVPaymentProvider;
                mVPaymentProvider.mo25201C1(jVar);
            }
            if (T.get(7)) {
                mVPurchaseFareRequest.discountContextId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareRequest$d */
    public static class C10876d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10875c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseFareRequest");
        HashMap hashMap = new HashMap();
        f28818j = hashMap;
        hashMap.put(C25239c.class, new C10874b());
        hashMap.put(C25240d.class, new C10876d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT_ID, new FieldMetaData("contextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FARE_ID, new FieldMetaData("fareId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.QUANTITY, new FieldMetaData("quantity", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TOTAL_PRICE, new FieldMetaData("totalPrice", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.VERIFACATION_INFO, new FieldMetaData("verifacationInfo", (byte) 2, new StructMetaData(MVPurchaseVerifacationInfo.class)));
        enumMap.put(_Fields.PAYMENT_PROVIDER, new FieldMetaData("paymentProvider", (byte) 2, new StructMetaData(MVPaymentProvider.class)));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28819k = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseFareRequest.class, unmodifiableMap);
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
        ((C25238b) f28818j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28818j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseFareRequest mVPurchaseFareRequest = (MVPurchaseFareRequest) obj;
        if (!getClass().equals(mVPurchaseFareRequest.getClass())) {
            return getClass().getName().compareTo(mVPurchaseFareRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32543f()).compareTo(Boolean.valueOf(mVPurchaseFareRequest.mo32543f()));
        if (compareTo2 != 0 || ((mo32543f() && (compareTo2 = this.contextId.compareTo(mVPurchaseFareRequest.contextId)) != 0) || (compareTo2 = Boolean.valueOf(mo32548j()).compareTo(Boolean.valueOf(mVPurchaseFareRequest.mo32548j()))) != 0 || ((mo32548j() && (compareTo2 = C25082a.m62839c(this.providerId, mVPurchaseFareRequest.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo32545h()).compareTo(Boolean.valueOf(mVPurchaseFareRequest.mo32545h()))) != 0 || ((mo32545h() && (compareTo2 = this.fareId.compareTo(mVPurchaseFareRequest.fareId)) != 0) || (compareTo2 = Boolean.valueOf(mo32549k()).compareTo(Boolean.valueOf(mVPurchaseFareRequest.mo32549k()))) != 0 || ((mo32549k() && (compareTo2 = C25082a.m62839c(this.quantity, mVPurchaseFareRequest.quantity)) != 0) || (compareTo2 = Boolean.valueOf(mo32550l()).compareTo(Boolean.valueOf(mVPurchaseFareRequest.mo32550l()))) != 0 || ((mo32550l() && (compareTo2 = this.totalPrice.compareTo(mVPurchaseFareRequest.totalPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo32551m()).compareTo(Boolean.valueOf(mVPurchaseFareRequest.mo32551m()))) != 0 || ((mo32551m() && (compareTo2 = this.verifacationInfo.compareTo(mVPurchaseFareRequest.verifacationInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo32547i()).compareTo(Boolean.valueOf(mVPurchaseFareRequest.mo32547i()))) != 0 || ((mo32547i() && (compareTo2 = this.paymentProvider.compareTo(mVPurchaseFareRequest.paymentProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo32544g()).compareTo(Boolean.valueOf(mVPurchaseFareRequest.mo32544g()))) != 0)))))))) {
            return compareTo2;
        }
        if (!mo32544g() || (compareTo = this.discountContextId.compareTo(mVPurchaseFareRequest.discountContextId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseFareRequest)) {
            return false;
        }
        MVPurchaseFareRequest mVPurchaseFareRequest = (MVPurchaseFareRequest) obj;
        boolean f = mo32543f();
        boolean f2 = mVPurchaseFareRequest.mo32543f();
        if (((f || f2) && (!f || !f2 || !this.contextId.equals(mVPurchaseFareRequest.contextId))) || this.providerId != mVPurchaseFareRequest.providerId) {
            return false;
        }
        boolean h = mo32545h();
        boolean h2 = mVPurchaseFareRequest.mo32545h();
        if (((h || h2) && (!h || !h2 || !this.fareId.equals(mVPurchaseFareRequest.fareId))) || this.quantity != mVPurchaseFareRequest.quantity) {
            return false;
        }
        boolean l = mo32550l();
        boolean l2 = mVPurchaseFareRequest.mo32550l();
        if ((l || l2) && (!l || !l2 || !this.totalPrice.mo26102a(mVPurchaseFareRequest.totalPrice))) {
            return false;
        }
        boolean m = mo32551m();
        boolean m2 = mVPurchaseFareRequest.mo32551m();
        if ((m || m2) && (!m || !m2 || !this.verifacationInfo.mo32924l(mVPurchaseFareRequest.verifacationInfo))) {
            return false;
        }
        boolean i = mo32547i();
        boolean i2 = mVPurchaseFareRequest.mo32547i();
        if ((i || i2) && (!i || !i2 || !this.paymentProvider.mo30299m(mVPurchaseFareRequest.paymentProvider))) {
            return false;
        }
        boolean g = mo32544g();
        boolean g2 = mVPurchaseFareRequest.mo32544g();
        if ((g || g2) && (!g || !g2 || !this.discountContextId.equals(mVPurchaseFareRequest.discountContextId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32543f() {
        return this.contextId != null;
    }

    /* renamed from: g */
    public final boolean mo32544g() {
        return this.discountContextId != null;
    }

    /* renamed from: h */
    public final boolean mo32545h() {
        return this.fareId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32547i() {
        return this.paymentProvider != null;
    }

    /* renamed from: j */
    public final boolean mo32548j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo32549k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final boolean mo32550l() {
        return this.totalPrice != null;
    }

    /* renamed from: m */
    public final boolean mo32551m() {
        return this.verifacationInfo != null;
    }

    /* renamed from: o */
    public final void mo32552o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: p */
    public final void mo32553p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseFareRequest(", "contextId:");
        String str = this.contextId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("providerId:");
        C0016g.m42z(n, this.providerId, ", ", "fareId:");
        String str2 = this.fareId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("quantity:");
        C0016g.m42z(n, this.quantity, ", ", "totalPrice:");
        MVCurrencyAmount mVCurrencyAmount = this.totalPrice;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        if (mo32551m()) {
            n.append(", ");
            n.append("verifacationInfo:");
            MVPurchaseVerifacationInfo mVPurchaseVerifacationInfo = this.verifacationInfo;
            if (mVPurchaseVerifacationInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPurchaseVerifacationInfo);
            }
        }
        if (mo32547i()) {
            n.append(", ");
            n.append("paymentProvider:");
            MVPaymentProvider mVPaymentProvider = this.paymentProvider;
            if (mVPaymentProvider == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentProvider);
            }
        }
        if (mo32544g()) {
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
