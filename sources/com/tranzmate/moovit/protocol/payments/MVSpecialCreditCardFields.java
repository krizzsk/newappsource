package com.tranzmate.moovit.protocol.payments;

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

public class MVSpecialCreditCardFields implements TBase<MVSpecialCreditCardFields, _Fields>, Serializable, Cloneable, Comparable<MVSpecialCreditCardFields> {

    /* renamed from: b */
    public static final C25113c f27697b = new C25113c("postalCode", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f27698c = new C25113c("countryCode", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f27699d = new C25113c("cardHolderId", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f27700e = new C25113c("billingAddress", (byte) 2, 4);

    /* renamed from: f */
    public static final HashMap f27701f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27702g;
    private byte __isset_bitfield = 0;
    public boolean billingAddress;
    public boolean cardHolderId;
    public boolean countryCode;
    public boolean postalCode;

    public enum _Fields implements C25085c {
        POSTAL_CODE(1, "postalCode"),
        COUNTRY_CODE(2, "countryCode"),
        CARD_HOLDER_ID(3, "cardHolderId"),
        BILLING_ADDRESS(4, "billingAddress");
        
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
                return POSTAL_CODE;
            }
            if (i == 2) {
                return COUNTRY_CODE;
            }
            if (i == 3) {
                return CARD_HOLDER_ID;
            }
            if (i != 4) {
                return null;
            }
            return BILLING_ADDRESS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVSpecialCreditCardFields$a */
    public static class C10065a extends C25239c<MVSpecialCreditCardFields> {
        public C10065a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSpecialCreditCardFields mVSpecialCreditCardFields = (MVSpecialCreditCardFields) tBase;
            mVSpecialCreditCardFields.getClass();
            C25113c cVar = MVSpecialCreditCardFields.f27697b;
            gVar.mo61687K();
            gVar.mo61711x(MVSpecialCreditCardFields.f27697b);
            gVar.mo61708u(mVSpecialCreditCardFields.postalCode);
            gVar.mo61712y();
            gVar.mo61711x(MVSpecialCreditCardFields.f27698c);
            gVar.mo61708u(mVSpecialCreditCardFields.countryCode);
            gVar.mo61712y();
            gVar.mo61711x(MVSpecialCreditCardFields.f27699d);
            gVar.mo61708u(mVSpecialCreditCardFields.cardHolderId);
            gVar.mo61712y();
            gVar.mo61711x(MVSpecialCreditCardFields.f27700e);
            C0017h.m62S(gVar, mVSpecialCreditCardFields.billingAddress);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSpecialCreditCardFields mVSpecialCreditCardFields = (MVSpecialCreditCardFields) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSpecialCreditCardFields.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 2) {
                                mVSpecialCreditCardFields.billingAddress = gVar.mo61690c();
                                mVSpecialCreditCardFields.mo30596j();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVSpecialCreditCardFields.cardHolderId = gVar.mo61690c();
                            mVSpecialCreditCardFields.mo30597k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVSpecialCreditCardFields.countryCode = gVar.mo61690c();
                        mVSpecialCreditCardFields.mo30598l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVSpecialCreditCardFields.postalCode = gVar.mo61690c();
                    mVSpecialCreditCardFields.mo30599m();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVSpecialCreditCardFields$b */
    public static class C10066b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10065a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVSpecialCreditCardFields$c */
    public static class C10067c extends C25240d<MVSpecialCreditCardFields> {
        public C10067c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSpecialCreditCardFields mVSpecialCreditCardFields = (MVSpecialCreditCardFields) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSpecialCreditCardFields.mo30595i()) {
                bitSet.set(0);
            }
            if (mVSpecialCreditCardFields.mo30593h()) {
                bitSet.set(1);
            }
            if (mVSpecialCreditCardFields.mo30592g()) {
                bitSet.set(2);
            }
            if (mVSpecialCreditCardFields.mo30591f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVSpecialCreditCardFields.mo30595i()) {
                jVar.mo61708u(mVSpecialCreditCardFields.postalCode);
            }
            if (mVSpecialCreditCardFields.mo30593h()) {
                jVar.mo61708u(mVSpecialCreditCardFields.countryCode);
            }
            if (mVSpecialCreditCardFields.mo30592g()) {
                jVar.mo61708u(mVSpecialCreditCardFields.cardHolderId);
            }
            if (mVSpecialCreditCardFields.mo30591f()) {
                jVar.mo61708u(mVSpecialCreditCardFields.billingAddress);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSpecialCreditCardFields mVSpecialCreditCardFields = (MVSpecialCreditCardFields) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVSpecialCreditCardFields.postalCode = jVar.mo61690c();
                mVSpecialCreditCardFields.mo30599m();
            }
            if (T.get(1)) {
                mVSpecialCreditCardFields.countryCode = jVar.mo61690c();
                mVSpecialCreditCardFields.mo30598l();
            }
            if (T.get(2)) {
                mVSpecialCreditCardFields.cardHolderId = jVar.mo61690c();
                mVSpecialCreditCardFields.mo30597k();
            }
            if (T.get(3)) {
                mVSpecialCreditCardFields.billingAddress = jVar.mo61690c();
                mVSpecialCreditCardFields.mo30596j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVSpecialCreditCardFields$d */
    public static class C10068d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10067c(0);
        }
    }

    static {
        new C17394d0("MVSpecialCreditCardFields");
        HashMap hashMap = new HashMap();
        f27701f = hashMap;
        hashMap.put(C25239c.class, new C10066b());
        hashMap.put(C25240d.class, new C10068d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.POSTAL_CODE, new FieldMetaData("postalCode", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.COUNTRY_CODE, new FieldMetaData("countryCode", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.CARD_HOLDER_ID, new FieldMetaData("cardHolderId", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.BILLING_ADDRESS, new FieldMetaData("billingAddress", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27702g = unmodifiableMap;
        FieldMetaData.m61947a(MVSpecialCreditCardFields.class, unmodifiableMap);
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
        ((C25238b) f27701f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27701f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30588a(MVSpecialCreditCardFields mVSpecialCreditCardFields) {
        if (mVSpecialCreditCardFields != null && this.postalCode == mVSpecialCreditCardFields.postalCode && this.countryCode == mVSpecialCreditCardFields.countryCode && this.cardHolderId == mVSpecialCreditCardFields.cardHolderId && this.billingAddress == mVSpecialCreditCardFields.billingAddress) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int l;
        MVSpecialCreditCardFields mVSpecialCreditCardFields = (MVSpecialCreditCardFields) obj;
        if (!getClass().equals(mVSpecialCreditCardFields.getClass())) {
            return getClass().getName().compareTo(mVSpecialCreditCardFields.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30595i()).compareTo(Boolean.valueOf(mVSpecialCreditCardFields.mo30595i()));
        if (compareTo != 0 || ((mo30595i() && (compareTo = C25082a.m62848l(this.postalCode, mVSpecialCreditCardFields.postalCode)) != 0) || (compareTo = Boolean.valueOf(mo30593h()).compareTo(Boolean.valueOf(mVSpecialCreditCardFields.mo30593h()))) != 0 || ((mo30593h() && (compareTo = C25082a.m62848l(this.countryCode, mVSpecialCreditCardFields.countryCode)) != 0) || (compareTo = Boolean.valueOf(mo30592g()).compareTo(Boolean.valueOf(mVSpecialCreditCardFields.mo30592g()))) != 0 || ((mo30592g() && (compareTo = C25082a.m62848l(this.cardHolderId, mVSpecialCreditCardFields.cardHolderId)) != 0) || (compareTo = Boolean.valueOf(mo30591f()).compareTo(Boolean.valueOf(mVSpecialCreditCardFields.mo30591f()))) != 0)))) {
            return compareTo;
        }
        if (!mo30591f() || (l = C25082a.m62848l(this.billingAddress, mVSpecialCreditCardFields.billingAddress)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVSpecialCreditCardFields)) {
            return mo30588a((MVSpecialCreditCardFields) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30591f() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: g */
    public final boolean mo30592g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo30593h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30595i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo30596j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: k */
    public final void mo30597k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: l */
    public final void mo30598l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo30599m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSpecialCreditCardFields(", "postalCode:");
        C13555b.m33977q(n, this.postalCode, ", ", "countryCode:");
        C13555b.m33977q(n, this.countryCode, ", ", "cardHolderId:");
        C13555b.m33977q(n, this.cardHolderId, ", ", "billingAddress:");
        return C25541a.m63885p(n, this.billingAddress, ")");
    }
}
