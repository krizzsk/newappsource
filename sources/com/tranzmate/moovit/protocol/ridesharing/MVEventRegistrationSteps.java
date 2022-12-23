package com.tranzmate.moovit.protocol.ridesharing;

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

public class MVEventRegistrationSteps implements TBase<MVEventRegistrationSteps, _Fields>, Serializable, Cloneable, Comparable<MVEventRegistrationSteps> {

    /* renamed from: b */
    public static final C25113c f27995b = new C25113c("phoneVerification", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f27996c = new C25113c("creditCardInformation", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f27997d = new C25113c("personalInformation", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f27998e = new C25113c("personalEmail", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f27999f = new C25113c("personalName", (byte) 2, 5);

    /* renamed from: g */
    public static final HashMap f28000g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f28001h;
    private byte __isset_bitfield = 0;
    public boolean creditCardInformation;
    public boolean personalEmail;
    public boolean personalInformation;
    public boolean personalName;
    public boolean phoneVerification;

    public enum _Fields implements C25085c {
        PHONE_VERIFICATION(1, "phoneVerification"),
        CREDIT_CARD_INFORMATION(2, "creditCardInformation"),
        PERSONAL_INFORMATION(3, "personalInformation"),
        PERSONAL_EMAIL(4, "personalEmail"),
        PERSONAL_NAME(5, "personalName");
        
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
                return PHONE_VERIFICATION;
            }
            if (i == 2) {
                return CREDIT_CARD_INFORMATION;
            }
            if (i == 3) {
                return PERSONAL_INFORMATION;
            }
            if (i == 4) {
                return PERSONAL_EMAIL;
            }
            if (i != 5) {
                return null;
            }
            return PERSONAL_NAME;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEventRegistrationSteps$a */
    public static class C10294a extends C25239c<MVEventRegistrationSteps> {
        public C10294a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEventRegistrationSteps mVEventRegistrationSteps = (MVEventRegistrationSteps) tBase;
            mVEventRegistrationSteps.getClass();
            C25113c cVar = MVEventRegistrationSteps.f27995b;
            gVar.mo61687K();
            gVar.mo61711x(MVEventRegistrationSteps.f27995b);
            gVar.mo61708u(mVEventRegistrationSteps.phoneVerification);
            gVar.mo61712y();
            gVar.mo61711x(MVEventRegistrationSteps.f27996c);
            gVar.mo61708u(mVEventRegistrationSteps.creditCardInformation);
            gVar.mo61712y();
            gVar.mo61711x(MVEventRegistrationSteps.f27997d);
            gVar.mo61708u(mVEventRegistrationSteps.personalInformation);
            gVar.mo61712y();
            gVar.mo61711x(MVEventRegistrationSteps.f27998e);
            gVar.mo61708u(mVEventRegistrationSteps.personalEmail);
            gVar.mo61712y();
            gVar.mo61711x(MVEventRegistrationSteps.f27999f);
            C0017h.m62S(gVar, mVEventRegistrationSteps.personalName);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEventRegistrationSteps mVEventRegistrationSteps = (MVEventRegistrationSteps) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVEventRegistrationSteps.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 2) {
                                    mVEventRegistrationSteps.personalName = gVar.mo61690c();
                                    mVEventRegistrationSteps.mo31151o();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 2) {
                                mVEventRegistrationSteps.personalEmail = gVar.mo61690c();
                                mVEventRegistrationSteps.mo31149l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVEventRegistrationSteps.personalInformation = gVar.mo61690c();
                            mVEventRegistrationSteps.mo31150m();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVEventRegistrationSteps.creditCardInformation = gVar.mo61690c();
                        mVEventRegistrationSteps.mo31148k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVEventRegistrationSteps.phoneVerification = gVar.mo61690c();
                    mVEventRegistrationSteps.mo31152p();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEventRegistrationSteps$b */
    public static class C10295b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10294a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEventRegistrationSteps$c */
    public static class C10296c extends C25240d<MVEventRegistrationSteps> {
        public C10296c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEventRegistrationSteps mVEventRegistrationSteps = (MVEventRegistrationSteps) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVEventRegistrationSteps.mo31147j()) {
                bitSet.set(0);
            }
            if (mVEventRegistrationSteps.mo31142f()) {
                bitSet.set(1);
            }
            if (mVEventRegistrationSteps.mo31144h()) {
                bitSet.set(2);
            }
            if (mVEventRegistrationSteps.mo31143g()) {
                bitSet.set(3);
            }
            if (mVEventRegistrationSteps.mo31146i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVEventRegistrationSteps.mo31147j()) {
                jVar.mo61708u(mVEventRegistrationSteps.phoneVerification);
            }
            if (mVEventRegistrationSteps.mo31142f()) {
                jVar.mo61708u(mVEventRegistrationSteps.creditCardInformation);
            }
            if (mVEventRegistrationSteps.mo31144h()) {
                jVar.mo61708u(mVEventRegistrationSteps.personalInformation);
            }
            if (mVEventRegistrationSteps.mo31143g()) {
                jVar.mo61708u(mVEventRegistrationSteps.personalEmail);
            }
            if (mVEventRegistrationSteps.mo31146i()) {
                jVar.mo61708u(mVEventRegistrationSteps.personalName);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEventRegistrationSteps mVEventRegistrationSteps = (MVEventRegistrationSteps) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVEventRegistrationSteps.phoneVerification = jVar.mo61690c();
                mVEventRegistrationSteps.mo31152p();
            }
            if (T.get(1)) {
                mVEventRegistrationSteps.creditCardInformation = jVar.mo61690c();
                mVEventRegistrationSteps.mo31148k();
            }
            if (T.get(2)) {
                mVEventRegistrationSteps.personalInformation = jVar.mo61690c();
                mVEventRegistrationSteps.mo31150m();
            }
            if (T.get(3)) {
                mVEventRegistrationSteps.personalEmail = jVar.mo61690c();
                mVEventRegistrationSteps.mo31149l();
            }
            if (T.get(4)) {
                mVEventRegistrationSteps.personalName = jVar.mo61690c();
                mVEventRegistrationSteps.mo31151o();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEventRegistrationSteps$d */
    public static class C10297d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10296c(0);
        }
    }

    static {
        new C17394d0("MVEventRegistrationSteps");
        HashMap hashMap = new HashMap();
        f28000g = hashMap;
        hashMap.put(C25239c.class, new C10295b());
        hashMap.put(C25240d.class, new C10297d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PHONE_VERIFICATION, new FieldMetaData("phoneVerification", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.CREDIT_CARD_INFORMATION, new FieldMetaData("creditCardInformation", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PERSONAL_INFORMATION, new FieldMetaData("personalInformation", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PERSONAL_EMAIL, new FieldMetaData("personalEmail", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PERSONAL_NAME, new FieldMetaData("personalName", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28001h = unmodifiableMap;
        FieldMetaData.m61947a(MVEventRegistrationSteps.class, unmodifiableMap);
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
        ((C25238b) f28000g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28000g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31139a(MVEventRegistrationSteps mVEventRegistrationSteps) {
        if (mVEventRegistrationSteps != null && this.phoneVerification == mVEventRegistrationSteps.phoneVerification && this.creditCardInformation == mVEventRegistrationSteps.creditCardInformation && this.personalInformation == mVEventRegistrationSteps.personalInformation && this.personalEmail == mVEventRegistrationSteps.personalEmail && this.personalName == mVEventRegistrationSteps.personalName) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int l;
        MVEventRegistrationSteps mVEventRegistrationSteps = (MVEventRegistrationSteps) obj;
        if (!getClass().equals(mVEventRegistrationSteps.getClass())) {
            return getClass().getName().compareTo(mVEventRegistrationSteps.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31147j()).compareTo(Boolean.valueOf(mVEventRegistrationSteps.mo31147j()));
        if (compareTo != 0 || ((mo31147j() && (compareTo = C25082a.m62848l(this.phoneVerification, mVEventRegistrationSteps.phoneVerification)) != 0) || (compareTo = Boolean.valueOf(mo31142f()).compareTo(Boolean.valueOf(mVEventRegistrationSteps.mo31142f()))) != 0 || ((mo31142f() && (compareTo = C25082a.m62848l(this.creditCardInformation, mVEventRegistrationSteps.creditCardInformation)) != 0) || (compareTo = Boolean.valueOf(mo31144h()).compareTo(Boolean.valueOf(mVEventRegistrationSteps.mo31144h()))) != 0 || ((mo31144h() && (compareTo = C25082a.m62848l(this.personalInformation, mVEventRegistrationSteps.personalInformation)) != 0) || (compareTo = Boolean.valueOf(mo31143g()).compareTo(Boolean.valueOf(mVEventRegistrationSteps.mo31143g()))) != 0 || ((mo31143g() && (compareTo = C25082a.m62848l(this.personalEmail, mVEventRegistrationSteps.personalEmail)) != 0) || (compareTo = Boolean.valueOf(mo31146i()).compareTo(Boolean.valueOf(mVEventRegistrationSteps.mo31146i()))) != 0))))) {
            return compareTo;
        }
        if (!mo31146i() || (l = C25082a.m62848l(this.personalName, mVEventRegistrationSteps.personalName)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVEventRegistrationSteps)) {
            return mo31139a((MVEventRegistrationSteps) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31142f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo31143g() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: h */
    public final boolean mo31144h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31146i() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: j */
    public final boolean mo31147j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo31148k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo31149l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: m */
    public final void mo31150m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo31151o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: p */
    public final void mo31152p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVEventRegistrationSteps(", "phoneVerification:");
        C13555b.m33977q(n, this.phoneVerification, ", ", "creditCardInformation:");
        C13555b.m33977q(n, this.creditCardInformation, ", ", "personalInformation:");
        C13555b.m33977q(n, this.personalInformation, ", ", "personalEmail:");
        C13555b.m33977q(n, this.personalEmail, ", ", "personalName:");
        return C25541a.m63885p(n, this.personalName, ")");
    }
}
