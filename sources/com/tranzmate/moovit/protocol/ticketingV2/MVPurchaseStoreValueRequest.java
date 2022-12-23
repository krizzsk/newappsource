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

public class MVPurchaseStoreValueRequest implements TBase<MVPurchaseStoreValueRequest, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseStoreValueRequest> {

    /* renamed from: b */
    public static final C25113c f28951b = new C25113c("contextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28952c = new C25113c("providerId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28953d = new C25113c("agencyKey", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28954e = new C25113c("amount", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f28955f = new C25113c("verifacationInfo", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f28956g = new C25113c("paymentProvider", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f28957h = new C25113c("discountContextId", (byte) 11, 7);

    /* renamed from: i */
    public static final HashMap f28958i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f28959j;
    private byte __isset_bitfield = 0;
    public String agencyKey;
    public MVCurrencyAmount amount;
    public String contextId;
    public String discountContextId;
    private _Fields[] optionals = {_Fields.VERIFACATION_INFO, _Fields.PAYMENT_PROVIDER, _Fields.DISCOUNT_CONTEXT_ID};
    public MVPaymentProvider paymentProvider;
    public int providerId;
    public MVPurchaseVerifacationInfo verifacationInfo;

    public enum _Fields implements C25085c {
        CONTEXT_ID(1, "contextId"),
        PROVIDER_ID(2, "providerId"),
        AGENCY_KEY(3, "agencyKey"),
        AMOUNT(4, "amount"),
        VERIFACATION_INFO(5, "verifacationInfo"),
        PAYMENT_PROVIDER(6, "paymentProvider"),
        DISCOUNT_CONTEXT_ID(7, "discountContextId");
        
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
                    return AGENCY_KEY;
                case 4:
                    return AMOUNT;
                case 5:
                    return VERIFACATION_INFO;
                case 6:
                    return PAYMENT_PROVIDER;
                case 7:
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoreValueRequest$a */
    public static class C10950a extends C25239c<MVPurchaseStoreValueRequest> {
        public C10950a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoreValueRequest mVPurchaseStoreValueRequest = (MVPurchaseStoreValueRequest) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVPurchaseStoreValueRequest.amount;
            C25113c cVar = MVPurchaseStoreValueRequest.f28951b;
            gVar.mo61687K();
            if (mVPurchaseStoreValueRequest.contextId != null) {
                gVar.mo61711x(MVPurchaseStoreValueRequest.f28951b);
                gVar.mo61686J(mVPurchaseStoreValueRequest.contextId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPurchaseStoreValueRequest.f28952c);
            gVar.mo61678B(mVPurchaseStoreValueRequest.providerId);
            gVar.mo61712y();
            if (mVPurchaseStoreValueRequest.agencyKey != null) {
                gVar.mo61711x(MVPurchaseStoreValueRequest.f28953d);
                gVar.mo61686J(mVPurchaseStoreValueRequest.agencyKey);
                gVar.mo61712y();
            }
            if (mVPurchaseStoreValueRequest.amount != null) {
                gVar.mo61711x(MVPurchaseStoreValueRequest.f28954e);
                mVPurchaseStoreValueRequest.amount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseStoreValueRequest.verifacationInfo != null && mVPurchaseStoreValueRequest.mo32749l()) {
                gVar.mo61711x(MVPurchaseStoreValueRequest.f28955f);
                mVPurchaseStoreValueRequest.verifacationInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseStoreValueRequest.paymentProvider != null && mVPurchaseStoreValueRequest.mo32747j()) {
                gVar.mo61711x(MVPurchaseStoreValueRequest.f28956g);
                mVPurchaseStoreValueRequest.paymentProvider.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseStoreValueRequest.discountContextId != null && mVPurchaseStoreValueRequest.mo32746i()) {
                gVar.mo61711x(MVPurchaseStoreValueRequest.f28957h);
                gVar.mo61686J(mVPurchaseStoreValueRequest.discountContextId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoreValueRequest mVPurchaseStoreValueRequest = (MVPurchaseStoreValueRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVPurchaseStoreValueRequest.amount;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseStoreValueRequest.contextId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseStoreValueRequest.providerId = gVar.mo61696i();
                            mVPurchaseStoreValueRequest.mo32750m();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseStoreValueRequest.agencyKey = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVPurchaseStoreValueRequest.amount = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPurchaseVerifacationInfo mVPurchaseVerifacationInfo = new MVPurchaseVerifacationInfo();
                            mVPurchaseStoreValueRequest.verifacationInfo = mVPurchaseVerifacationInfo;
                            mVPurchaseVerifacationInfo.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                            mVPurchaseStoreValueRequest.paymentProvider = mVPaymentProvider;
                            mVPaymentProvider.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseStoreValueRequest.discountContextId = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoreValueRequest$b */
    public static class C10951b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10950a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoreValueRequest$c */
    public static class C10952c extends C25240d<MVPurchaseStoreValueRequest> {
        public C10952c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoreValueRequest mVPurchaseStoreValueRequest = (MVPurchaseStoreValueRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseStoreValueRequest.mo32744h()) {
                bitSet.set(0);
            }
            if (mVPurchaseStoreValueRequest.mo32748k()) {
                bitSet.set(1);
            }
            if (mVPurchaseStoreValueRequest.mo32742f()) {
                bitSet.set(2);
            }
            if (mVPurchaseStoreValueRequest.mo32743g()) {
                bitSet.set(3);
            }
            if (mVPurchaseStoreValueRequest.mo32749l()) {
                bitSet.set(4);
            }
            if (mVPurchaseStoreValueRequest.mo32747j()) {
                bitSet.set(5);
            }
            if (mVPurchaseStoreValueRequest.mo32746i()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVPurchaseStoreValueRequest.mo32744h()) {
                jVar.mo61686J(mVPurchaseStoreValueRequest.contextId);
            }
            if (mVPurchaseStoreValueRequest.mo32748k()) {
                jVar.mo61678B(mVPurchaseStoreValueRequest.providerId);
            }
            if (mVPurchaseStoreValueRequest.mo32742f()) {
                jVar.mo61686J(mVPurchaseStoreValueRequest.agencyKey);
            }
            if (mVPurchaseStoreValueRequest.mo32743g()) {
                mVPurchaseStoreValueRequest.amount.mo25202X0(jVar);
            }
            if (mVPurchaseStoreValueRequest.mo32749l()) {
                mVPurchaseStoreValueRequest.verifacationInfo.mo25202X0(jVar);
            }
            if (mVPurchaseStoreValueRequest.mo32747j()) {
                mVPurchaseStoreValueRequest.paymentProvider.mo25202X0(jVar);
            }
            if (mVPurchaseStoreValueRequest.mo32746i()) {
                jVar.mo61686J(mVPurchaseStoreValueRequest.discountContextId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoreValueRequest mVPurchaseStoreValueRequest = (MVPurchaseStoreValueRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVPurchaseStoreValueRequest.contextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPurchaseStoreValueRequest.providerId = jVar.mo61696i();
                mVPurchaseStoreValueRequest.mo32750m();
            }
            if (T.get(2)) {
                mVPurchaseStoreValueRequest.agencyKey = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPurchaseStoreValueRequest.amount = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVPurchaseVerifacationInfo mVPurchaseVerifacationInfo = new MVPurchaseVerifacationInfo();
                mVPurchaseStoreValueRequest.verifacationInfo = mVPurchaseVerifacationInfo;
                mVPurchaseVerifacationInfo.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                mVPurchaseStoreValueRequest.paymentProvider = mVPaymentProvider;
                mVPaymentProvider.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVPurchaseStoreValueRequest.discountContextId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoreValueRequest$d */
    public static class C10953d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10952c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseStoreValueRequest");
        HashMap hashMap = new HashMap();
        f28958i = hashMap;
        hashMap.put(C25239c.class, new C10951b());
        hashMap.put(C25240d.class, new C10953d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT_ID, new FieldMetaData("contextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AMOUNT, new FieldMetaData("amount", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.VERIFACATION_INFO, new FieldMetaData("verifacationInfo", (byte) 2, new StructMetaData(MVPurchaseVerifacationInfo.class)));
        enumMap.put(_Fields.PAYMENT_PROVIDER, new FieldMetaData("paymentProvider", (byte) 2, new StructMetaData(MVPaymentProvider.class)));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28959j = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseStoreValueRequest.class, unmodifiableMap);
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
        ((C25238b) f28958i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28958i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseStoreValueRequest mVPurchaseStoreValueRequest = (MVPurchaseStoreValueRequest) obj;
        if (!getClass().equals(mVPurchaseStoreValueRequest.getClass())) {
            return getClass().getName().compareTo(mVPurchaseStoreValueRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32744h()).compareTo(Boolean.valueOf(mVPurchaseStoreValueRequest.mo32744h()));
        if (compareTo2 != 0 || ((mo32744h() && (compareTo2 = this.contextId.compareTo(mVPurchaseStoreValueRequest.contextId)) != 0) || (compareTo2 = Boolean.valueOf(mo32748k()).compareTo(Boolean.valueOf(mVPurchaseStoreValueRequest.mo32748k()))) != 0 || ((mo32748k() && (compareTo2 = C25082a.m62839c(this.providerId, mVPurchaseStoreValueRequest.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo32742f()).compareTo(Boolean.valueOf(mVPurchaseStoreValueRequest.mo32742f()))) != 0 || ((mo32742f() && (compareTo2 = this.agencyKey.compareTo(mVPurchaseStoreValueRequest.agencyKey)) != 0) || (compareTo2 = Boolean.valueOf(mo32743g()).compareTo(Boolean.valueOf(mVPurchaseStoreValueRequest.mo32743g()))) != 0 || ((mo32743g() && (compareTo2 = this.amount.compareTo(mVPurchaseStoreValueRequest.amount)) != 0) || (compareTo2 = Boolean.valueOf(mo32749l()).compareTo(Boolean.valueOf(mVPurchaseStoreValueRequest.mo32749l()))) != 0 || ((mo32749l() && (compareTo2 = this.verifacationInfo.compareTo(mVPurchaseStoreValueRequest.verifacationInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo32747j()).compareTo(Boolean.valueOf(mVPurchaseStoreValueRequest.mo32747j()))) != 0 || ((mo32747j() && (compareTo2 = this.paymentProvider.compareTo(mVPurchaseStoreValueRequest.paymentProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo32746i()).compareTo(Boolean.valueOf(mVPurchaseStoreValueRequest.mo32746i()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo32746i() || (compareTo = this.discountContextId.compareTo(mVPurchaseStoreValueRequest.discountContextId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseStoreValueRequest)) {
            return false;
        }
        MVPurchaseStoreValueRequest mVPurchaseStoreValueRequest = (MVPurchaseStoreValueRequest) obj;
        boolean h = mo32744h();
        boolean h2 = mVPurchaseStoreValueRequest.mo32744h();
        if (((h || h2) && (!h || !h2 || !this.contextId.equals(mVPurchaseStoreValueRequest.contextId))) || this.providerId != mVPurchaseStoreValueRequest.providerId) {
            return false;
        }
        boolean f = mo32742f();
        boolean f2 = mVPurchaseStoreValueRequest.mo32742f();
        if ((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVPurchaseStoreValueRequest.agencyKey))) {
            return false;
        }
        boolean g = mo32743g();
        boolean g2 = mVPurchaseStoreValueRequest.mo32743g();
        if ((g || g2) && (!g || !g2 || !this.amount.mo26102a(mVPurchaseStoreValueRequest.amount))) {
            return false;
        }
        boolean l = mo32749l();
        boolean l2 = mVPurchaseStoreValueRequest.mo32749l();
        if ((l || l2) && (!l || !l2 || !this.verifacationInfo.mo32924l(mVPurchaseStoreValueRequest.verifacationInfo))) {
            return false;
        }
        boolean j = mo32747j();
        boolean j2 = mVPurchaseStoreValueRequest.mo32747j();
        if ((j || j2) && (!j || !j2 || !this.paymentProvider.mo30299m(mVPurchaseStoreValueRequest.paymentProvider))) {
            return false;
        }
        boolean i = mo32746i();
        boolean i2 = mVPurchaseStoreValueRequest.mo32746i();
        if ((i || i2) && (!i || !i2 || !this.discountContextId.equals(mVPurchaseStoreValueRequest.discountContextId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32742f() {
        return this.agencyKey != null;
    }

    /* renamed from: g */
    public final boolean mo32743g() {
        return this.amount != null;
    }

    /* renamed from: h */
    public final boolean mo32744h() {
        return this.contextId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32746i() {
        return this.discountContextId != null;
    }

    /* renamed from: j */
    public final boolean mo32747j() {
        return this.paymentProvider != null;
    }

    /* renamed from: k */
    public final boolean mo32748k() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: l */
    public final boolean mo32749l() {
        return this.verifacationInfo != null;
    }

    /* renamed from: m */
    public final void mo32750m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseStoreValueRequest(", "contextId:");
        String str = this.contextId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("providerId:");
        C0016g.m42z(n, this.providerId, ", ", "agencyKey:");
        String str2 = this.agencyKey;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("amount:");
        MVCurrencyAmount mVCurrencyAmount = this.amount;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        if (mo32749l()) {
            n.append(", ");
            n.append("verifacationInfo:");
            MVPurchaseVerifacationInfo mVPurchaseVerifacationInfo = this.verifacationInfo;
            if (mVPurchaseVerifacationInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPurchaseVerifacationInfo);
            }
        }
        if (mo32747j()) {
            n.append(", ");
            n.append("paymentProvider:");
            MVPaymentProvider mVPaymentProvider = this.paymentProvider;
            if (mVPaymentProvider == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentProvider);
            }
        }
        if (mo32746i()) {
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
