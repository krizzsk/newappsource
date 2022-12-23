package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVPurchaseStoredValueStep implements TBase<MVPurchaseStoredValueStep, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseStoredValueStep> {

    /* renamed from: b */
    public static final C25113c f28992b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28993c = new C25113c("agencyKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28994d = new C25113c("amount", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f28995e = new C25113c("verificationType", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f28996f = new C25113c("discountContextId", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f28997g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f28998h;
    private byte __isset_bitfield = 0;
    public String agencyKey;
    public MVStoredValueAmount amount;
    public String discountContextId;
    private _Fields[] optionals = {_Fields.DISCOUNT_CONTEXT_ID};
    public int providerId;
    public MVPurchaseVerifacationType verificationType;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        AGENCY_KEY(2, "agencyKey"),
        AMOUNT(3, "amount"),
        VERIFICATION_TYPE(4, "verificationType"),
        DISCOUNT_CONTEXT_ID(5, "discountContextId");
        
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
            if (i == 4) {
                return VERIFICATION_TYPE;
            }
            if (i != 5) {
                return null;
            }
            return DISCOUNT_CONTEXT_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueStep$a */
    public static class C10975a extends C25239c<MVPurchaseStoredValueStep> {
        public C10975a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueStep mVPurchaseStoredValueStep = (MVPurchaseStoredValueStep) tBase;
            mVPurchaseStoredValueStep.getClass();
            C25113c cVar = MVPurchaseStoredValueStep.f28992b;
            gVar.mo61687K();
            gVar.mo61711x(MVPurchaseStoredValueStep.f28992b);
            gVar.mo61678B(mVPurchaseStoredValueStep.providerId);
            gVar.mo61712y();
            if (mVPurchaseStoredValueStep.agencyKey != null) {
                gVar.mo61711x(MVPurchaseStoredValueStep.f28993c);
                gVar.mo61686J(mVPurchaseStoredValueStep.agencyKey);
                gVar.mo61712y();
            }
            if (mVPurchaseStoredValueStep.amount != null) {
                gVar.mo61711x(MVPurchaseStoredValueStep.f28994d);
                mVPurchaseStoredValueStep.amount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseStoredValueStep.verificationType != null) {
                gVar.mo61711x(MVPurchaseStoredValueStep.f28995e);
                gVar.mo61678B(mVPurchaseStoredValueStep.verificationType.getValue());
                gVar.mo61712y();
            }
            if (mVPurchaseStoredValueStep.discountContextId != null && mVPurchaseStoredValueStep.mo32806h()) {
                gVar.mo61711x(MVPurchaseStoredValueStep.f28996f);
                gVar.mo61686J(mVPurchaseStoredValueStep.discountContextId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueStep mVPurchaseStoredValueStep = (MVPurchaseStoredValueStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseStoredValueStep.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVPurchaseStoredValueStep.discountContextId = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVPurchaseStoredValueStep.verificationType = MVPurchaseVerifacationType.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVStoredValueAmount mVStoredValueAmount = new MVStoredValueAmount();
                            mVPurchaseStoredValueStep.amount = mVStoredValueAmount;
                            mVStoredValueAmount.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPurchaseStoredValueStep.agencyKey = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPurchaseStoredValueStep.providerId = gVar.mo61696i();
                    mVPurchaseStoredValueStep.mo32810k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueStep$b */
    public static class C10976b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10975a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueStep$c */
    public static class C10977c extends C25240d<MVPurchaseStoredValueStep> {
        public C10977c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueStep mVPurchaseStoredValueStep = (MVPurchaseStoredValueStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseStoredValueStep.mo32808i()) {
                bitSet.set(0);
            }
            if (mVPurchaseStoredValueStep.mo32804f()) {
                bitSet.set(1);
            }
            if (mVPurchaseStoredValueStep.mo32805g()) {
                bitSet.set(2);
            }
            if (mVPurchaseStoredValueStep.mo32809j()) {
                bitSet.set(3);
            }
            if (mVPurchaseStoredValueStep.mo32806h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPurchaseStoredValueStep.mo32808i()) {
                jVar.mo61678B(mVPurchaseStoredValueStep.providerId);
            }
            if (mVPurchaseStoredValueStep.mo32804f()) {
                jVar.mo61686J(mVPurchaseStoredValueStep.agencyKey);
            }
            if (mVPurchaseStoredValueStep.mo32805g()) {
                mVPurchaseStoredValueStep.amount.mo25202X0(jVar);
            }
            if (mVPurchaseStoredValueStep.mo32809j()) {
                jVar.mo61678B(mVPurchaseStoredValueStep.verificationType.getValue());
            }
            if (mVPurchaseStoredValueStep.mo32806h()) {
                jVar.mo61686J(mVPurchaseStoredValueStep.discountContextId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueStep mVPurchaseStoredValueStep = (MVPurchaseStoredValueStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVPurchaseStoredValueStep.providerId = jVar.mo61696i();
                mVPurchaseStoredValueStep.mo32810k();
            }
            if (T.get(1)) {
                mVPurchaseStoredValueStep.agencyKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVStoredValueAmount mVStoredValueAmount = new MVStoredValueAmount();
                mVPurchaseStoredValueStep.amount = mVStoredValueAmount;
                mVStoredValueAmount.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVPurchaseStoredValueStep.verificationType = MVPurchaseVerifacationType.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVPurchaseStoredValueStep.discountContextId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueStep$d */
    public static class C10978d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10977c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseStoredValueStep");
        HashMap hashMap = new HashMap();
        f28997g = hashMap;
        hashMap.put(C25239c.class, new C10976b());
        hashMap.put(C25240d.class, new C10978d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AMOUNT, new FieldMetaData("amount", (byte) 3, new StructMetaData(MVStoredValueAmount.class)));
        enumMap.put(_Fields.VERIFICATION_TYPE, new FieldMetaData("verificationType", (byte) 3, new EnumMetaData(MVPurchaseVerifacationType.class)));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28998h = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseStoredValueStep.class, unmodifiableMap);
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
        ((C25238b) f28997g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28997g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseStoredValueStep mVPurchaseStoredValueStep = (MVPurchaseStoredValueStep) obj;
        if (!getClass().equals(mVPurchaseStoredValueStep.getClass())) {
            return getClass().getName().compareTo(mVPurchaseStoredValueStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32808i()).compareTo(Boolean.valueOf(mVPurchaseStoredValueStep.mo32808i()));
        if (compareTo2 != 0 || ((mo32808i() && (compareTo2 = C25082a.m62839c(this.providerId, mVPurchaseStoredValueStep.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo32804f()).compareTo(Boolean.valueOf(mVPurchaseStoredValueStep.mo32804f()))) != 0 || ((mo32804f() && (compareTo2 = this.agencyKey.compareTo(mVPurchaseStoredValueStep.agencyKey)) != 0) || (compareTo2 = Boolean.valueOf(mo32805g()).compareTo(Boolean.valueOf(mVPurchaseStoredValueStep.mo32805g()))) != 0 || ((mo32805g() && (compareTo2 = this.amount.compareTo(mVPurchaseStoredValueStep.amount)) != 0) || (compareTo2 = Boolean.valueOf(mo32809j()).compareTo(Boolean.valueOf(mVPurchaseStoredValueStep.mo32809j()))) != 0 || ((mo32809j() && (compareTo2 = this.verificationType.compareTo(mVPurchaseStoredValueStep.verificationType)) != 0) || (compareTo2 = Boolean.valueOf(mo32806h()).compareTo(Boolean.valueOf(mVPurchaseStoredValueStep.mo32806h()))) != 0))))) {
            return compareTo2;
        }
        if (!mo32806h() || (compareTo = this.discountContextId.compareTo(mVPurchaseStoredValueStep.discountContextId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseStoredValueStep)) {
            return false;
        }
        MVPurchaseStoredValueStep mVPurchaseStoredValueStep = (MVPurchaseStoredValueStep) obj;
        if (this.providerId != mVPurchaseStoredValueStep.providerId) {
            return false;
        }
        boolean f = mo32804f();
        boolean f2 = mVPurchaseStoredValueStep.mo32804f();
        if ((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVPurchaseStoredValueStep.agencyKey))) {
            return false;
        }
        boolean g = mo32805g();
        boolean g2 = mVPurchaseStoredValueStep.mo32805g();
        if ((g || g2) && (!g || !g2 || !this.amount.mo32940a(mVPurchaseStoredValueStep.amount))) {
            return false;
        }
        boolean j = mo32809j();
        boolean j2 = mVPurchaseStoredValueStep.mo32809j();
        if ((j || j2) && (!j || !j2 || !this.verificationType.equals(mVPurchaseStoredValueStep.verificationType))) {
            return false;
        }
        boolean h = mo32806h();
        boolean h2 = mVPurchaseStoredValueStep.mo32806h();
        if ((h || h2) && (!h || !h2 || !this.discountContextId.equals(mVPurchaseStoredValueStep.discountContextId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32804f() {
        return this.agencyKey != null;
    }

    /* renamed from: g */
    public final boolean mo32805g() {
        return this.amount != null;
    }

    /* renamed from: h */
    public final boolean mo32806h() {
        return this.discountContextId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32808i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo32809j() {
        return this.verificationType != null;
    }

    /* renamed from: k */
    public final void mo32810k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseStoredValueStep(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "agencyKey:");
        String str = this.agencyKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("amount:");
        MVStoredValueAmount mVStoredValueAmount = this.amount;
        if (mVStoredValueAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVStoredValueAmount);
        }
        n.append(", ");
        n.append("verificationType:");
        MVPurchaseVerifacationType mVPurchaseVerifacationType = this.verificationType;
        if (mVPurchaseVerifacationType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPurchaseVerifacationType);
        }
        if (mo32806h()) {
            n.append(", ");
            n.append("discountContextId:");
            String str2 = this.discountContextId;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
