package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
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
import p389bl.C13637c;
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

public class MVPaymentSummary implements TBase<MVPaymentSummary, _Fields>, Serializable, Cloneable, Comparable<MVPaymentSummary> {

    /* renamed from: b */
    public static final C25113c f27606b = new C25113c("allowedPaymentMethods", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27607c = new C25113c("missingSteps", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27608d = new C25113c("paymentDiscounts", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27609e = new C25113c("fullPrice", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f27610f = new C25113c("finalPrice", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f27611g = new C25113c("isPaymentProviderRequired", (byte) 2, 6);

    /* renamed from: h */
    public static final C25113c f27612h = new C25113c("secondaryActions", (byte) 15, 7);

    /* renamed from: i */
    public static final C25113c f27613i = new C25113c("termsOfService", (byte) 12, 8);

    /* renamed from: j */
    public static final HashMap f27614j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f27615k;
    private byte __isset_bitfield = 0;
    public MVPaymentMethods allowedPaymentMethods;
    public MVCurrencyAmount finalPrice;
    public MVCurrencyAmount fullPrice;
    public boolean isPaymentProviderRequired;
    public MVMissingPaymentRegistrationSteps missingSteps;
    private _Fields[] optionals = {_Fields.MISSING_STEPS, _Fields.PAYMENT_DISCOUNTS, _Fields.FULL_PRICE, _Fields.FINAL_PRICE, _Fields.SECONDARY_ACTIONS, _Fields.TERMS_OF_SERVICE};
    public MVPaymentDiscounts paymentDiscounts;
    public List<MVPaymentSummarySecondaryAction> secondaryActions;
    public MVPaymentTermsOfService termsOfService;

    public enum _Fields implements C25085c {
        ALLOWED_PAYMENT_METHODS(1, "allowedPaymentMethods"),
        MISSING_STEPS(2, "missingSteps"),
        PAYMENT_DISCOUNTS(3, "paymentDiscounts"),
        FULL_PRICE(4, "fullPrice"),
        FINAL_PRICE(5, "finalPrice"),
        IS_PAYMENT_PROVIDER_REQUIRED(6, "isPaymentProviderRequired"),
        SECONDARY_ACTIONS(7, "secondaryActions"),
        TERMS_OF_SERVICE(8, "termsOfService");
        
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
                    return ALLOWED_PAYMENT_METHODS;
                case 2:
                    return MISSING_STEPS;
                case 3:
                    return PAYMENT_DISCOUNTS;
                case 4:
                    return FULL_PRICE;
                case 5:
                    return FINAL_PRICE;
                case 6:
                    return IS_PAYMENT_PROVIDER_REQUIRED;
                case 7:
                    return SECONDARY_ACTIONS;
                case 8:
                    return TERMS_OF_SERVICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentSummary$a */
    public static class C10003a extends C25239c<MVPaymentSummary> {
        public C10003a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentSummary mVPaymentSummary = (MVPaymentSummary) tBase;
            mVPaymentSummary.mo30444p();
            C25113c cVar = MVPaymentSummary.f27606b;
            gVar.mo61687K();
            if (mVPaymentSummary.allowedPaymentMethods != null) {
                gVar.mo61711x(MVPaymentSummary.f27606b);
                mVPaymentSummary.allowedPaymentMethods.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentSummary.missingSteps != null && mVPaymentSummary.mo30439j()) {
                gVar.mo61711x(MVPaymentSummary.f27607c);
                mVPaymentSummary.missingSteps.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentSummary.paymentDiscounts != null && mVPaymentSummary.mo30440k()) {
                gVar.mo61711x(MVPaymentSummary.f27608d);
                mVPaymentSummary.paymentDiscounts.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentSummary.fullPrice != null && mVPaymentSummary.mo30436h()) {
                gVar.mo61711x(MVPaymentSummary.f27609e);
                mVPaymentSummary.fullPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentSummary.finalPrice != null && mVPaymentSummary.mo30435g()) {
                gVar.mo61711x(MVPaymentSummary.f27610f);
                mVPaymentSummary.finalPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPaymentSummary.f27611g);
            gVar.mo61708u(mVPaymentSummary.isPaymentProviderRequired);
            gVar.mo61712y();
            if (mVPaymentSummary.secondaryActions != null && mVPaymentSummary.mo30441l()) {
                gVar.mo61711x(MVPaymentSummary.f27612h);
                gVar.mo61680D(new C25119e((byte) 8, mVPaymentSummary.secondaryActions.size()));
                for (MVPaymentSummarySecondaryAction value : mVPaymentSummary.secondaryActions) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPaymentSummary.termsOfService != null && mVPaymentSummary.mo30442m()) {
                gVar.mo61711x(MVPaymentSummary.f27613i);
                mVPaymentSummary.termsOfService.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentSummary mVPaymentSummary = (MVPaymentSummary) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentSummary.mo30444p();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPaymentMethods mVPaymentMethods = new MVPaymentMethods();
                            mVPaymentSummary.allowedPaymentMethods = mVPaymentMethods;
                            mVPaymentMethods.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = new MVMissingPaymentRegistrationSteps();
                            mVPaymentSummary.missingSteps = mVMissingPaymentRegistrationSteps;
                            mVMissingPaymentRegistrationSteps.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPaymentDiscounts mVPaymentDiscounts = new MVPaymentDiscounts();
                            mVPaymentSummary.paymentDiscounts = mVPaymentDiscounts;
                            mVPaymentDiscounts.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                            mVPaymentSummary.fullPrice = mVCurrencyAmount;
                            mVCurrencyAmount.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVPaymentSummary.finalPrice = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentSummary.isPaymentProviderRequired = gVar.mo61690c();
                            mVPaymentSummary.mo30443o();
                            break;
                        }
                    case 7:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVPaymentSummary.secondaryActions = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVPaymentSummary.secondaryActions.add(MVPaymentSummarySecondaryAction.findByValue(gVar.mo61696i()));
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPaymentTermsOfService mVPaymentTermsOfService = new MVPaymentTermsOfService();
                            mVPaymentSummary.termsOfService = mVPaymentTermsOfService;
                            mVPaymentTermsOfService.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentSummary$b */
    public static class C10004b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10003a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentSummary$c */
    public static class C10005c extends C25240d<MVPaymentSummary> {
        public C10005c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentSummary mVPaymentSummary = (MVPaymentSummary) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentSummary.mo30434f()) {
                bitSet.set(0);
            }
            if (mVPaymentSummary.mo30439j()) {
                bitSet.set(1);
            }
            if (mVPaymentSummary.mo30440k()) {
                bitSet.set(2);
            }
            if (mVPaymentSummary.mo30436h()) {
                bitSet.set(3);
            }
            if (mVPaymentSummary.mo30435g()) {
                bitSet.set(4);
            }
            if (mVPaymentSummary.mo30438i()) {
                bitSet.set(5);
            }
            if (mVPaymentSummary.mo30441l()) {
                bitSet.set(6);
            }
            if (mVPaymentSummary.mo30442m()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVPaymentSummary.mo30434f()) {
                mVPaymentSummary.allowedPaymentMethods.mo25202X0(jVar);
            }
            if (mVPaymentSummary.mo30439j()) {
                mVPaymentSummary.missingSteps.mo25202X0(jVar);
            }
            if (mVPaymentSummary.mo30440k()) {
                mVPaymentSummary.paymentDiscounts.mo25202X0(jVar);
            }
            if (mVPaymentSummary.mo30436h()) {
                mVPaymentSummary.fullPrice.mo25202X0(jVar);
            }
            if (mVPaymentSummary.mo30435g()) {
                mVPaymentSummary.finalPrice.mo25202X0(jVar);
            }
            if (mVPaymentSummary.mo30438i()) {
                jVar.mo61708u(mVPaymentSummary.isPaymentProviderRequired);
            }
            if (mVPaymentSummary.mo30441l()) {
                jVar.mo61678B(mVPaymentSummary.secondaryActions.size());
                for (MVPaymentSummarySecondaryAction value : mVPaymentSummary.secondaryActions) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVPaymentSummary.mo30442m()) {
                mVPaymentSummary.termsOfService.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentSummary mVPaymentSummary = (MVPaymentSummary) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                MVPaymentMethods mVPaymentMethods = new MVPaymentMethods();
                mVPaymentSummary.allowedPaymentMethods = mVPaymentMethods;
                mVPaymentMethods.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = new MVMissingPaymentRegistrationSteps();
                mVPaymentSummary.missingSteps = mVMissingPaymentRegistrationSteps;
                mVMissingPaymentRegistrationSteps.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVPaymentDiscounts mVPaymentDiscounts = new MVPaymentDiscounts();
                mVPaymentSummary.paymentDiscounts = mVPaymentDiscounts;
                mVPaymentDiscounts.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPaymentSummary.fullPrice = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVPaymentSummary.finalPrice = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVPaymentSummary.isPaymentProviderRequired = jVar.mo61690c();
                mVPaymentSummary.mo30443o();
            }
            if (T.get(6)) {
                int i = jVar.mo61696i();
                mVPaymentSummary.secondaryActions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVPaymentSummary.secondaryActions.add(MVPaymentSummarySecondaryAction.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(7)) {
                MVPaymentTermsOfService mVPaymentTermsOfService = new MVPaymentTermsOfService();
                mVPaymentSummary.termsOfService = mVPaymentTermsOfService;
                mVPaymentTermsOfService.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentSummary$d */
    public static class C10006d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10005c(0);
        }
    }

    static {
        new C17394d0("MVPaymentSummary");
        HashMap hashMap = new HashMap();
        f27614j = hashMap;
        hashMap.put(C25239c.class, new C10004b());
        hashMap.put(C25240d.class, new C10006d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ALLOWED_PAYMENT_METHODS, new FieldMetaData("allowedPaymentMethods", (byte) 3, new StructMetaData(MVPaymentMethods.class)));
        enumMap.put(_Fields.MISSING_STEPS, new FieldMetaData("missingSteps", (byte) 2, new StructMetaData(MVMissingPaymentRegistrationSteps.class)));
        enumMap.put(_Fields.PAYMENT_DISCOUNTS, new FieldMetaData("paymentDiscounts", (byte) 2, new StructMetaData(MVPaymentDiscounts.class)));
        enumMap.put(_Fields.FULL_PRICE, new FieldMetaData("fullPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.FINAL_PRICE, new FieldMetaData("finalPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.IS_PAYMENT_PROVIDER_REQUIRED, new FieldMetaData("isPaymentProviderRequired", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SECONDARY_ACTIONS, new FieldMetaData("secondaryActions", (byte) 2, new ListMetaData(new EnumMetaData(MVPaymentSummarySecondaryAction.class))));
        enumMap.put(_Fields.TERMS_OF_SERVICE, new FieldMetaData("termsOfService", (byte) 2, new StructMetaData(MVPaymentTermsOfService.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27615k = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentSummary.class, unmodifiableMap);
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
        ((C25238b) f27614j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27614j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30431a(MVPaymentSummary mVPaymentSummary) {
        if (mVPaymentSummary == null) {
            return false;
        }
        boolean f = mo30434f();
        boolean f2 = mVPaymentSummary.mo30434f();
        if ((f || f2) && (!f || !f2 || !this.allowedPaymentMethods.mo30268a(mVPaymentSummary.allowedPaymentMethods))) {
            return false;
        }
        boolean j = mo30439j();
        boolean j2 = mVPaymentSummary.mo30439j();
        if ((j || j2) && (!j || !j2 || !this.missingSteps.mo30029a(mVPaymentSummary.missingSteps))) {
            return false;
        }
        boolean k = mo30440k();
        boolean k2 = mVPaymentSummary.mo30440k();
        if ((k || k2) && (!k || !k2 || !this.paymentDiscounts.mo30222a(mVPaymentSummary.paymentDiscounts))) {
            return false;
        }
        boolean h = mo30436h();
        boolean h2 = mVPaymentSummary.mo30436h();
        if ((h || h2) && (!h || !h2 || !this.fullPrice.mo26102a(mVPaymentSummary.fullPrice))) {
            return false;
        }
        boolean g = mo30435g();
        boolean g2 = mVPaymentSummary.mo30435g();
        if (((g || g2) && (!g || !g2 || !this.finalPrice.mo26102a(mVPaymentSummary.finalPrice))) || this.isPaymentProviderRequired != mVPaymentSummary.isPaymentProviderRequired) {
            return false;
        }
        boolean l = mo30441l();
        boolean l2 = mVPaymentSummary.mo30441l();
        if ((l || l2) && (!l || !l2 || !this.secondaryActions.equals(mVPaymentSummary.secondaryActions))) {
            return false;
        }
        boolean m = mo30442m();
        boolean m2 = mVPaymentSummary.mo30442m();
        if (!m && !m2) {
            return true;
        }
        if (!m || !m2 || !this.termsOfService.mo30456a(mVPaymentSummary.termsOfService)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentSummary mVPaymentSummary = (MVPaymentSummary) obj;
        if (!getClass().equals(mVPaymentSummary.getClass())) {
            return getClass().getName().compareTo(mVPaymentSummary.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30434f()).compareTo(Boolean.valueOf(mVPaymentSummary.mo30434f()));
        if (compareTo2 != 0 || ((mo30434f() && (compareTo2 = this.allowedPaymentMethods.compareTo(mVPaymentSummary.allowedPaymentMethods)) != 0) || (compareTo2 = Boolean.valueOf(mo30439j()).compareTo(Boolean.valueOf(mVPaymentSummary.mo30439j()))) != 0 || ((mo30439j() && (compareTo2 = this.missingSteps.compareTo(mVPaymentSummary.missingSteps)) != 0) || (compareTo2 = Boolean.valueOf(mo30440k()).compareTo(Boolean.valueOf(mVPaymentSummary.mo30440k()))) != 0 || ((mo30440k() && (compareTo2 = this.paymentDiscounts.compareTo(mVPaymentSummary.paymentDiscounts)) != 0) || (compareTo2 = Boolean.valueOf(mo30436h()).compareTo(Boolean.valueOf(mVPaymentSummary.mo30436h()))) != 0 || ((mo30436h() && (compareTo2 = this.fullPrice.compareTo(mVPaymentSummary.fullPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo30435g()).compareTo(Boolean.valueOf(mVPaymentSummary.mo30435g()))) != 0 || ((mo30435g() && (compareTo2 = this.finalPrice.compareTo(mVPaymentSummary.finalPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo30438i()).compareTo(Boolean.valueOf(mVPaymentSummary.mo30438i()))) != 0 || ((mo30438i() && (compareTo2 = C25082a.m62848l(this.isPaymentProviderRequired, mVPaymentSummary.isPaymentProviderRequired)) != 0) || (compareTo2 = Boolean.valueOf(mo30441l()).compareTo(Boolean.valueOf(mVPaymentSummary.mo30441l()))) != 0 || ((mo30441l() && (compareTo2 = C25082a.m62844h(this.secondaryActions, mVPaymentSummary.secondaryActions)) != 0) || (compareTo2 = Boolean.valueOf(mo30442m()).compareTo(Boolean.valueOf(mVPaymentSummary.mo30442m()))) != 0)))))))) {
            return compareTo2;
        }
        if (!mo30442m() || (compareTo = this.termsOfService.compareTo(mVPaymentSummary.termsOfService)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentSummary)) {
            return mo30431a((MVPaymentSummary) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30434f() {
        return this.allowedPaymentMethods != null;
    }

    /* renamed from: g */
    public final boolean mo30435g() {
        return this.finalPrice != null;
    }

    /* renamed from: h */
    public final boolean mo30436h() {
        return this.fullPrice != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30438i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo30439j() {
        return this.missingSteps != null;
    }

    /* renamed from: k */
    public final boolean mo30440k() {
        return this.paymentDiscounts != null;
    }

    /* renamed from: l */
    public final boolean mo30441l() {
        return this.secondaryActions != null;
    }

    /* renamed from: m */
    public final boolean mo30442m() {
        return this.termsOfService != null;
    }

    /* renamed from: o */
    public final void mo30443o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: p */
    public final void mo30444p() throws TException {
        MVCreditCardInstructions mVCreditCardInstructions;
        MVPaymentMethods mVPaymentMethods = this.allowedPaymentMethods;
        if (mVPaymentMethods != null) {
            MVPurchasePaymentMethods mVPurchasePaymentMethods = mVPaymentMethods.storedPaymentMethods;
            if (!(mVPurchasePaymentMethods == null || (mVCreditCardInstructions = mVPurchasePaymentMethods.creditCardInstructions) == null)) {
                mVCreditCardInstructions.mo29771h();
            }
            MVSingleUsePaymentMethods mVSingleUsePaymentMethods = mVPaymentMethods.singleUsePaymentMethods;
            if (mVSingleUsePaymentMethods != null) {
                mVSingleUsePaymentMethods.mo30585j();
            }
        }
        MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = this.missingSteps;
        if (mVMissingPaymentRegistrationSteps != null) {
            mVMissingPaymentRegistrationSteps.mo30045s();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentSummary(", "allowedPaymentMethods:");
        MVPaymentMethods mVPaymentMethods = this.allowedPaymentMethods;
        if (mVPaymentMethods == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentMethods);
        }
        if (mo30439j()) {
            n.append(", ");
            n.append("missingSteps:");
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = this.missingSteps;
            if (mVMissingPaymentRegistrationSteps == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMissingPaymentRegistrationSteps);
            }
        }
        if (mo30440k()) {
            n.append(", ");
            n.append("paymentDiscounts:");
            MVPaymentDiscounts mVPaymentDiscounts = this.paymentDiscounts;
            if (mVPaymentDiscounts == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentDiscounts);
            }
        }
        if (mo30436h()) {
            n.append(", ");
            n.append("fullPrice:");
            MVCurrencyAmount mVCurrencyAmount = this.fullPrice;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        if (mo30435g()) {
            n.append(", ");
            n.append("finalPrice:");
            MVCurrencyAmount mVCurrencyAmount2 = this.finalPrice;
            if (mVCurrencyAmount2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount2);
            }
        }
        n.append(", ");
        n.append("isPaymentProviderRequired:");
        n.append(this.isPaymentProviderRequired);
        if (mo30441l()) {
            n.append(", ");
            n.append("secondaryActions:");
            List<MVPaymentSummarySecondaryAction> list = this.secondaryActions;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo30442m()) {
            n.append(", ");
            n.append("termsOfService:");
            MVPaymentTermsOfService mVPaymentTermsOfService = this.termsOfService;
            if (mVPaymentTermsOfService == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentTermsOfService);
            }
        }
        n.append(")");
        return n.toString();
    }
}
