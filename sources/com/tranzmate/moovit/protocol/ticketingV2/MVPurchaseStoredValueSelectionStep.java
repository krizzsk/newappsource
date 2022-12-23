package com.tranzmate.moovit.protocol.ticketingV2;

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
import p001a0.C0016g;
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

public class MVPurchaseStoredValueSelectionStep implements TBase<MVPurchaseStoredValueSelectionStep, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseStoredValueSelectionStep> {

    /* renamed from: b */
    public static final C25113c f28979b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28980c = new C25113c("agencyKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28981d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28982e = new C25113c("amounts", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f28983f = new C25113c("currentBalance", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f28984g = new C25113c("otherAmount", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f28985h = new C25113c("verifacationType", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f28986i = new C25113c("subtitle", (byte) 11, 8);

    /* renamed from: j */
    public static final HashMap f28987j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f28988k;
    private byte __isset_bitfield = 0;
    public String agencyKey;
    public List<MVStoredValueAmount> amounts;
    public MVCurrencyAmount currentBalance;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.CURRENT_BALANCE, _Fields.OTHER_AMOUNT, _Fields.SUBTITLE};
    public MVStoredValueOtherAmount otherAmount;
    public int providerId;
    public String subtitle;
    public String title;
    public MVPurchaseVerifacationType verifacationType;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        AGENCY_KEY(2, "agencyKey"),
        TITLE(3, "title"),
        AMOUNTS(4, "amounts"),
        CURRENT_BALANCE(5, "currentBalance"),
        OTHER_AMOUNT(6, "otherAmount"),
        VERIFACATION_TYPE(7, "verifacationType"),
        SUBTITLE(8, "subtitle");
        
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
                    return PROVIDER_ID;
                case 2:
                    return AGENCY_KEY;
                case 3:
                    return TITLE;
                case 4:
                    return AMOUNTS;
                case 5:
                    return CURRENT_BALANCE;
                case 6:
                    return OTHER_AMOUNT;
                case 7:
                    return VERIFACATION_TYPE;
                case 8:
                    return SUBTITLE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueSelectionStep$a */
    public static class C10967a extends C25239c<MVPurchaseStoredValueSelectionStep> {
        public C10967a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueSelectionStep mVPurchaseStoredValueSelectionStep = (MVPurchaseStoredValueSelectionStep) tBase;
            mVPurchaseStoredValueSelectionStep.getClass();
            C25113c cVar = MVPurchaseStoredValueSelectionStep.f28979b;
            gVar.mo61687K();
            gVar.mo61711x(MVPurchaseStoredValueSelectionStep.f28979b);
            gVar.mo61678B(mVPurchaseStoredValueSelectionStep.providerId);
            gVar.mo61712y();
            if (mVPurchaseStoredValueSelectionStep.agencyKey != null) {
                gVar.mo61711x(MVPurchaseStoredValueSelectionStep.f28980c);
                gVar.mo61686J(mVPurchaseStoredValueSelectionStep.agencyKey);
                gVar.mo61712y();
            }
            if (mVPurchaseStoredValueSelectionStep.title != null && mVPurchaseStoredValueSelectionStep.mo32791l()) {
                gVar.mo61711x(MVPurchaseStoredValueSelectionStep.f28981d);
                gVar.mo61686J(mVPurchaseStoredValueSelectionStep.title);
                gVar.mo61712y();
            }
            if (mVPurchaseStoredValueSelectionStep.amounts != null) {
                gVar.mo61711x(MVPurchaseStoredValueSelectionStep.f28982e);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchaseStoredValueSelectionStep.amounts.size()));
                for (MVStoredValueAmount X0 : mVPurchaseStoredValueSelectionStep.amounts) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseStoredValueSelectionStep.currentBalance != null && mVPurchaseStoredValueSelectionStep.mo32786h()) {
                gVar.mo61711x(MVPurchaseStoredValueSelectionStep.f28983f);
                mVPurchaseStoredValueSelectionStep.currentBalance.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseStoredValueSelectionStep.otherAmount != null && mVPurchaseStoredValueSelectionStep.mo32788i()) {
                gVar.mo61711x(MVPurchaseStoredValueSelectionStep.f28984g);
                mVPurchaseStoredValueSelectionStep.otherAmount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseStoredValueSelectionStep.verifacationType != null) {
                gVar.mo61711x(MVPurchaseStoredValueSelectionStep.f28985h);
                gVar.mo61678B(mVPurchaseStoredValueSelectionStep.verifacationType.getValue());
                gVar.mo61712y();
            }
            if (mVPurchaseStoredValueSelectionStep.subtitle != null && mVPurchaseStoredValueSelectionStep.mo32790k()) {
                gVar.mo61711x(MVPurchaseStoredValueSelectionStep.f28986i);
                gVar.mo61686J(mVPurchaseStoredValueSelectionStep.subtitle);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueSelectionStep mVPurchaseStoredValueSelectionStep = (MVPurchaseStoredValueSelectionStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseStoredValueSelectionStep.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseStoredValueSelectionStep.providerId = gVar.mo61696i();
                            mVPurchaseStoredValueSelectionStep.mo32793o();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseStoredValueSelectionStep.agencyKey = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseStoredValueSelectionStep.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVPurchaseStoredValueSelectionStep.amounts = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVStoredValueAmount mVStoredValueAmount = new MVStoredValueAmount();
                                mVStoredValueAmount.mo25201C1(gVar);
                                mVPurchaseStoredValueSelectionStep.amounts.add(mVStoredValueAmount);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                            mVPurchaseStoredValueSelectionStep.currentBalance = mVCurrencyAmount;
                            mVCurrencyAmount.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVStoredValueOtherAmount mVStoredValueOtherAmount = new MVStoredValueOtherAmount();
                            mVPurchaseStoredValueSelectionStep.otherAmount = mVStoredValueOtherAmount;
                            mVStoredValueOtherAmount.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseStoredValueSelectionStep.verifacationType = MVPurchaseVerifacationType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseStoredValueSelectionStep.subtitle = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueSelectionStep$b */
    public static class C10968b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10967a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueSelectionStep$c */
    public static class C10969c extends C25240d<MVPurchaseStoredValueSelectionStep> {
        public C10969c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueSelectionStep mVPurchaseStoredValueSelectionStep = (MVPurchaseStoredValueSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseStoredValueSelectionStep.mo32789j()) {
                bitSet.set(0);
            }
            if (mVPurchaseStoredValueSelectionStep.mo32784f()) {
                bitSet.set(1);
            }
            if (mVPurchaseStoredValueSelectionStep.mo32791l()) {
                bitSet.set(2);
            }
            if (mVPurchaseStoredValueSelectionStep.mo32785g()) {
                bitSet.set(3);
            }
            if (mVPurchaseStoredValueSelectionStep.mo32786h()) {
                bitSet.set(4);
            }
            if (mVPurchaseStoredValueSelectionStep.mo32788i()) {
                bitSet.set(5);
            }
            if (mVPurchaseStoredValueSelectionStep.mo32792m()) {
                bitSet.set(6);
            }
            if (mVPurchaseStoredValueSelectionStep.mo32790k()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVPurchaseStoredValueSelectionStep.mo32789j()) {
                jVar.mo61678B(mVPurchaseStoredValueSelectionStep.providerId);
            }
            if (mVPurchaseStoredValueSelectionStep.mo32784f()) {
                jVar.mo61686J(mVPurchaseStoredValueSelectionStep.agencyKey);
            }
            if (mVPurchaseStoredValueSelectionStep.mo32791l()) {
                jVar.mo61686J(mVPurchaseStoredValueSelectionStep.title);
            }
            if (mVPurchaseStoredValueSelectionStep.mo32785g()) {
                jVar.mo61678B(mVPurchaseStoredValueSelectionStep.amounts.size());
                for (MVStoredValueAmount X0 : mVPurchaseStoredValueSelectionStep.amounts) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPurchaseStoredValueSelectionStep.mo32786h()) {
                mVPurchaseStoredValueSelectionStep.currentBalance.mo25202X0(jVar);
            }
            if (mVPurchaseStoredValueSelectionStep.mo32788i()) {
                mVPurchaseStoredValueSelectionStep.otherAmount.mo25202X0(jVar);
            }
            if (mVPurchaseStoredValueSelectionStep.mo32792m()) {
                jVar.mo61678B(mVPurchaseStoredValueSelectionStep.verifacationType.getValue());
            }
            if (mVPurchaseStoredValueSelectionStep.mo32790k()) {
                jVar.mo61686J(mVPurchaseStoredValueSelectionStep.subtitle);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueSelectionStep mVPurchaseStoredValueSelectionStep = (MVPurchaseStoredValueSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVPurchaseStoredValueSelectionStep.providerId = jVar.mo61696i();
                mVPurchaseStoredValueSelectionStep.mo32793o();
            }
            if (T.get(1)) {
                mVPurchaseStoredValueSelectionStep.agencyKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPurchaseStoredValueSelectionStep.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVPurchaseStoredValueSelectionStep.amounts = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVStoredValueAmount mVStoredValueAmount = new MVStoredValueAmount();
                    mVStoredValueAmount.mo25201C1(jVar);
                    mVPurchaseStoredValueSelectionStep.amounts.add(mVStoredValueAmount);
                }
            }
            if (T.get(4)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPurchaseStoredValueSelectionStep.currentBalance = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVStoredValueOtherAmount mVStoredValueOtherAmount = new MVStoredValueOtherAmount();
                mVPurchaseStoredValueSelectionStep.otherAmount = mVStoredValueOtherAmount;
                mVStoredValueOtherAmount.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVPurchaseStoredValueSelectionStep.verifacationType = MVPurchaseVerifacationType.findByValue(jVar.mo61696i());
            }
            if (T.get(7)) {
                mVPurchaseStoredValueSelectionStep.subtitle = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueSelectionStep$d */
    public static class C10970d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10969c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseStoredValueSelectionStep");
        HashMap hashMap = new HashMap();
        f28987j = hashMap;
        hashMap.put(C25239c.class, new C10968b());
        hashMap.put(C25240d.class, new C10970d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AMOUNTS, new FieldMetaData("amounts", (byte) 3, new ListMetaData(new StructMetaData(MVStoredValueAmount.class))));
        enumMap.put(_Fields.CURRENT_BALANCE, new FieldMetaData("currentBalance", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.OTHER_AMOUNT, new FieldMetaData("otherAmount", (byte) 2, new StructMetaData(MVStoredValueOtherAmount.class)));
        enumMap.put(_Fields.VERIFACATION_TYPE, new FieldMetaData("verifacationType", (byte) 3, new EnumMetaData(MVPurchaseVerifacationType.class)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28988k = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseStoredValueSelectionStep.class, unmodifiableMap);
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
        ((C25238b) f28987j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28987j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseStoredValueSelectionStep mVPurchaseStoredValueSelectionStep = (MVPurchaseStoredValueSelectionStep) obj;
        if (!getClass().equals(mVPurchaseStoredValueSelectionStep.getClass())) {
            return getClass().getName().compareTo(mVPurchaseStoredValueSelectionStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32789j()).compareTo(Boolean.valueOf(mVPurchaseStoredValueSelectionStep.mo32789j()));
        if (compareTo2 != 0 || ((mo32789j() && (compareTo2 = C25082a.m62839c(this.providerId, mVPurchaseStoredValueSelectionStep.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo32784f()).compareTo(Boolean.valueOf(mVPurchaseStoredValueSelectionStep.mo32784f()))) != 0 || ((mo32784f() && (compareTo2 = this.agencyKey.compareTo(mVPurchaseStoredValueSelectionStep.agencyKey)) != 0) || (compareTo2 = Boolean.valueOf(mo32791l()).compareTo(Boolean.valueOf(mVPurchaseStoredValueSelectionStep.mo32791l()))) != 0 || ((mo32791l() && (compareTo2 = this.title.compareTo(mVPurchaseStoredValueSelectionStep.title)) != 0) || (compareTo2 = Boolean.valueOf(mo32785g()).compareTo(Boolean.valueOf(mVPurchaseStoredValueSelectionStep.mo32785g()))) != 0 || ((mo32785g() && (compareTo2 = C25082a.m62844h(this.amounts, mVPurchaseStoredValueSelectionStep.amounts)) != 0) || (compareTo2 = Boolean.valueOf(mo32786h()).compareTo(Boolean.valueOf(mVPurchaseStoredValueSelectionStep.mo32786h()))) != 0 || ((mo32786h() && (compareTo2 = this.currentBalance.compareTo(mVPurchaseStoredValueSelectionStep.currentBalance)) != 0) || (compareTo2 = Boolean.valueOf(mo32788i()).compareTo(Boolean.valueOf(mVPurchaseStoredValueSelectionStep.mo32788i()))) != 0 || ((mo32788i() && (compareTo2 = this.otherAmount.compareTo(mVPurchaseStoredValueSelectionStep.otherAmount)) != 0) || (compareTo2 = Boolean.valueOf(mo32792m()).compareTo(Boolean.valueOf(mVPurchaseStoredValueSelectionStep.mo32792m()))) != 0 || ((mo32792m() && (compareTo2 = this.verifacationType.compareTo(mVPurchaseStoredValueSelectionStep.verifacationType)) != 0) || (compareTo2 = Boolean.valueOf(mo32790k()).compareTo(Boolean.valueOf(mVPurchaseStoredValueSelectionStep.mo32790k()))) != 0)))))))) {
            return compareTo2;
        }
        if (!mo32790k() || (compareTo = this.subtitle.compareTo(mVPurchaseStoredValueSelectionStep.subtitle)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseStoredValueSelectionStep)) {
            return false;
        }
        MVPurchaseStoredValueSelectionStep mVPurchaseStoredValueSelectionStep = (MVPurchaseStoredValueSelectionStep) obj;
        if (this.providerId != mVPurchaseStoredValueSelectionStep.providerId) {
            return false;
        }
        boolean f = mo32784f();
        boolean f2 = mVPurchaseStoredValueSelectionStep.mo32784f();
        if ((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVPurchaseStoredValueSelectionStep.agencyKey))) {
            return false;
        }
        boolean l = mo32791l();
        boolean l2 = mVPurchaseStoredValueSelectionStep.mo32791l();
        if ((l || l2) && (!l || !l2 || !this.title.equals(mVPurchaseStoredValueSelectionStep.title))) {
            return false;
        }
        boolean g = mo32785g();
        boolean g2 = mVPurchaseStoredValueSelectionStep.mo32785g();
        if ((g || g2) && (!g || !g2 || !this.amounts.equals(mVPurchaseStoredValueSelectionStep.amounts))) {
            return false;
        }
        boolean h = mo32786h();
        boolean h2 = mVPurchaseStoredValueSelectionStep.mo32786h();
        if ((h || h2) && (!h || !h2 || !this.currentBalance.mo26102a(mVPurchaseStoredValueSelectionStep.currentBalance))) {
            return false;
        }
        boolean i = mo32788i();
        boolean i2 = mVPurchaseStoredValueSelectionStep.mo32788i();
        if ((i || i2) && (!i || !i2 || !this.otherAmount.mo32959a(mVPurchaseStoredValueSelectionStep.otherAmount))) {
            return false;
        }
        boolean m = mo32792m();
        boolean m2 = mVPurchaseStoredValueSelectionStep.mo32792m();
        if ((m || m2) && (!m || !m2 || !this.verifacationType.equals(mVPurchaseStoredValueSelectionStep.verifacationType))) {
            return false;
        }
        boolean k = mo32790k();
        boolean k2 = mVPurchaseStoredValueSelectionStep.mo32790k();
        if ((k || k2) && (!k || !k2 || !this.subtitle.equals(mVPurchaseStoredValueSelectionStep.subtitle))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32784f() {
        return this.agencyKey != null;
    }

    /* renamed from: g */
    public final boolean mo32785g() {
        return this.amounts != null;
    }

    /* renamed from: h */
    public final boolean mo32786h() {
        return this.currentBalance != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32788i() {
        return this.otherAmount != null;
    }

    /* renamed from: j */
    public final boolean mo32789j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo32790k() {
        return this.subtitle != null;
    }

    /* renamed from: l */
    public final boolean mo32791l() {
        return this.title != null;
    }

    /* renamed from: m */
    public final boolean mo32792m() {
        return this.verifacationType != null;
    }

    /* renamed from: o */
    public final void mo32793o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseStoredValueSelectionStep(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "agencyKey:");
        String str = this.agencyKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo32791l()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(", ");
        n.append("amounts:");
        List<MVStoredValueAmount> list = this.amounts;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo32786h()) {
            n.append(", ");
            n.append("currentBalance:");
            MVCurrencyAmount mVCurrencyAmount = this.currentBalance;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        if (mo32788i()) {
            n.append(", ");
            n.append("otherAmount:");
            MVStoredValueOtherAmount mVStoredValueOtherAmount = this.otherAmount;
            if (mVStoredValueOtherAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVStoredValueOtherAmount);
            }
        }
        n.append(", ");
        n.append("verifacationType:");
        MVPurchaseVerifacationType mVPurchaseVerifacationType = this.verifacationType;
        if (mVPurchaseVerifacationType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPurchaseVerifacationType);
        }
        if (mo32790k()) {
            n.append(", ");
            n.append("subtitle:");
            String str3 = this.subtitle;
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
