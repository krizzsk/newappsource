package com.tranzmate.moovit.protocol.ticketingV2;

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
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p001a0.C0017h;
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

public class MVPurchaseStoreValueResult implements TBase<MVPurchaseStoreValueResult, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseStoreValueResult> {

    /* renamed from: b */
    public static final C25113c f28966b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28967c = new C25113c("agencyKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28968d = new C25113c("amount", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f28969e = new C25113c("isStoredValueToppedUp", (byte) 2, 4);

    /* renamed from: f */
    public static final HashMap f28970f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f28971g;
    private byte __isset_bitfield = 0;
    public String agencyKey;
    public MVCurrencyAmount amount;
    public boolean isStoredValueToppedUp;
    public int providerId;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        AGENCY_KEY(2, "agencyKey"),
        AMOUNT(3, "amount"),
        IS_STORED_VALUE_TOPPED_UP(4, "isStoredValueToppedUp");
        
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
                return PROVIDER_ID;
            }
            if (i == 2) {
                return AGENCY_KEY;
            }
            if (i == 3) {
                return AMOUNT;
            }
            if (i != 4) {
                return null;
            }
            return IS_STORED_VALUE_TOPPED_UP;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoreValueResult$a */
    public static class C10955a extends C25239c<MVPurchaseStoreValueResult> {
        public C10955a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoreValueResult mVPurchaseStoreValueResult = (MVPurchaseStoreValueResult) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVPurchaseStoreValueResult.amount;
            C25113c cVar = MVPurchaseStoreValueResult.f28966b;
            gVar.mo61687K();
            gVar.mo61711x(MVPurchaseStoreValueResult.f28966b);
            gVar.mo61678B(mVPurchaseStoreValueResult.providerId);
            gVar.mo61712y();
            if (mVPurchaseStoreValueResult.agencyKey != null) {
                gVar.mo61711x(MVPurchaseStoreValueResult.f28967c);
                gVar.mo61686J(mVPurchaseStoreValueResult.agencyKey);
                gVar.mo61712y();
            }
            if (mVPurchaseStoreValueResult.amount != null) {
                gVar.mo61711x(MVPurchaseStoreValueResult.f28968d);
                mVPurchaseStoreValueResult.amount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPurchaseStoreValueResult.f28969e);
            C0017h.m62S(gVar, mVPurchaseStoreValueResult.isStoredValueToppedUp);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoreValueResult mVPurchaseStoreValueResult = (MVPurchaseStoreValueResult) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVPurchaseStoreValueResult.amount;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 2) {
                                mVPurchaseStoreValueResult.isStoredValueToppedUp = gVar.mo61690c();
                                mVPurchaseStoreValueResult.mo32764j();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVPurchaseStoreValueResult.amount = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPurchaseStoreValueResult.agencyKey = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPurchaseStoreValueResult.providerId = gVar.mo61696i();
                    mVPurchaseStoreValueResult.mo32765k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoreValueResult$b */
    public static class C10956b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10955a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoreValueResult$c */
    public static class C10957c extends C25240d<MVPurchaseStoreValueResult> {
        public C10957c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoreValueResult mVPurchaseStoreValueResult = (MVPurchaseStoreValueResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseStoreValueResult.mo32763i()) {
                bitSet.set(0);
            }
            if (mVPurchaseStoreValueResult.mo32759f()) {
                bitSet.set(1);
            }
            if (mVPurchaseStoreValueResult.mo32760g()) {
                bitSet.set(2);
            }
            if (mVPurchaseStoreValueResult.mo32761h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVPurchaseStoreValueResult.mo32763i()) {
                jVar.mo61678B(mVPurchaseStoreValueResult.providerId);
            }
            if (mVPurchaseStoreValueResult.mo32759f()) {
                jVar.mo61686J(mVPurchaseStoreValueResult.agencyKey);
            }
            if (mVPurchaseStoreValueResult.mo32760g()) {
                mVPurchaseStoreValueResult.amount.mo25202X0(jVar);
            }
            if (mVPurchaseStoreValueResult.mo32761h()) {
                jVar.mo61708u(mVPurchaseStoreValueResult.isStoredValueToppedUp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoreValueResult mVPurchaseStoreValueResult = (MVPurchaseStoreValueResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVPurchaseStoreValueResult.providerId = jVar.mo61696i();
                mVPurchaseStoreValueResult.mo32765k();
            }
            if (T.get(1)) {
                mVPurchaseStoreValueResult.agencyKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPurchaseStoreValueResult.amount = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVPurchaseStoreValueResult.isStoredValueToppedUp = jVar.mo61690c();
                mVPurchaseStoreValueResult.mo32764j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoreValueResult$d */
    public static class C10958d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10957c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseStoreValueResult");
        HashMap hashMap = new HashMap();
        f28970f = hashMap;
        hashMap.put(C25239c.class, new C10956b());
        hashMap.put(C25240d.class, new C10958d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AMOUNT, new FieldMetaData("amount", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.IS_STORED_VALUE_TOPPED_UP, new FieldMetaData("isStoredValueToppedUp", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28971g = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseStoreValueResult.class, unmodifiableMap);
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
        ((C25238b) f28970f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28970f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVPurchaseStoreValueResult mVPurchaseStoreValueResult = (MVPurchaseStoreValueResult) obj;
        if (!getClass().equals(mVPurchaseStoreValueResult.getClass())) {
            return getClass().getName().compareTo(mVPurchaseStoreValueResult.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32763i()).compareTo(Boolean.valueOf(mVPurchaseStoreValueResult.mo32763i()));
        if (compareTo != 0 || ((mo32763i() && (compareTo = C25082a.m62839c(this.providerId, mVPurchaseStoreValueResult.providerId)) != 0) || (compareTo = Boolean.valueOf(mo32759f()).compareTo(Boolean.valueOf(mVPurchaseStoreValueResult.mo32759f()))) != 0 || ((mo32759f() && (compareTo = this.agencyKey.compareTo(mVPurchaseStoreValueResult.agencyKey)) != 0) || (compareTo = Boolean.valueOf(mo32760g()).compareTo(Boolean.valueOf(mVPurchaseStoreValueResult.mo32760g()))) != 0 || ((mo32760g() && (compareTo = this.amount.compareTo(mVPurchaseStoreValueResult.amount)) != 0) || (compareTo = Boolean.valueOf(mo32761h()).compareTo(Boolean.valueOf(mVPurchaseStoreValueResult.mo32761h()))) != 0)))) {
            return compareTo;
        }
        if (!mo32761h() || (l = C25082a.m62848l(this.isStoredValueToppedUp, mVPurchaseStoreValueResult.isStoredValueToppedUp)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseStoreValueResult)) {
            return false;
        }
        MVPurchaseStoreValueResult mVPurchaseStoreValueResult = (MVPurchaseStoreValueResult) obj;
        if (this.providerId != mVPurchaseStoreValueResult.providerId) {
            return false;
        }
        boolean f = mo32759f();
        boolean f2 = mVPurchaseStoreValueResult.mo32759f();
        if ((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVPurchaseStoreValueResult.agencyKey))) {
            return false;
        }
        boolean g = mo32760g();
        boolean g2 = mVPurchaseStoreValueResult.mo32760g();
        if (((g || g2) && (!g || !g2 || !this.amount.mo26102a(mVPurchaseStoreValueResult.amount))) || this.isStoredValueToppedUp != mVPurchaseStoreValueResult.isStoredValueToppedUp) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32759f() {
        return this.agencyKey != null;
    }

    /* renamed from: g */
    public final boolean mo32760g() {
        return this.amount != null;
    }

    /* renamed from: h */
    public final boolean mo32761h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32763i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo32764j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo32765k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseStoreValueResult(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "agencyKey:");
        String str = this.agencyKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("amount:");
        MVCurrencyAmount mVCurrencyAmount = this.amount;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(", ");
        n.append("isStoredValueToppedUp:");
        return C25541a.m63885p(n, this.isStoredValueToppedUp, ")");
    }
}
