package com.tranzmate.moovit.protocol.carpool;

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

public class MVCarpoolRegistrationSteps implements TBase<MVCarpoolRegistrationSteps, _Fields>, Serializable, Cloneable, Comparable<MVCarpoolRegistrationSteps> {

    /* renamed from: b */
    public static final C25113c f24683b = new C25113c("phoneVerification", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f24684c = new C25113c("facebookLogin", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f24685d = new C25113c("creditCardInformation", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f24686e = new C25113c("emailInformation", (byte) 2, 4);

    /* renamed from: f */
    public static final HashMap f24687f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f24688g;
    private byte __isset_bitfield = 0;
    public boolean creditCardInformation;
    public boolean emailInformation;
    public boolean facebookLogin;
    public boolean phoneVerification;

    public enum _Fields implements C25085c {
        PHONE_VERIFICATION(1, "phoneVerification"),
        FACEBOOK_LOGIN(2, "facebookLogin"),
        CREDIT_CARD_INFORMATION(3, "creditCardInformation"),
        EMAIL_INFORMATION(4, "emailInformation");
        
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
                return FACEBOOK_LOGIN;
            }
            if (i == 3) {
                return CREDIT_CARD_INFORMATION;
            }
            if (i != 4) {
                return null;
            }
            return EMAIL_INFORMATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarpoolRegistrationSteps$a */
    public static class C8190a extends C25239c<MVCarpoolRegistrationSteps> {
        public C8190a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolRegistrationSteps mVCarpoolRegistrationSteps = (MVCarpoolRegistrationSteps) tBase;
            mVCarpoolRegistrationSteps.getClass();
            C25113c cVar = MVCarpoolRegistrationSteps.f24683b;
            gVar.mo61687K();
            gVar.mo61711x(MVCarpoolRegistrationSteps.f24683b);
            gVar.mo61708u(mVCarpoolRegistrationSteps.phoneVerification);
            gVar.mo61712y();
            gVar.mo61711x(MVCarpoolRegistrationSteps.f24684c);
            gVar.mo61708u(mVCarpoolRegistrationSteps.facebookLogin);
            gVar.mo61712y();
            gVar.mo61711x(MVCarpoolRegistrationSteps.f24685d);
            gVar.mo61708u(mVCarpoolRegistrationSteps.creditCardInformation);
            gVar.mo61712y();
            gVar.mo61711x(MVCarpoolRegistrationSteps.f24686e);
            C0017h.m62S(gVar, mVCarpoolRegistrationSteps.emailInformation);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolRegistrationSteps mVCarpoolRegistrationSteps = (MVCarpoolRegistrationSteps) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCarpoolRegistrationSteps.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 2) {
                                mVCarpoolRegistrationSteps.emailInformation = gVar.mo61690c();
                                mVCarpoolRegistrationSteps.mo25556k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVCarpoolRegistrationSteps.creditCardInformation = gVar.mo61690c();
                            mVCarpoolRegistrationSteps.mo25555j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVCarpoolRegistrationSteps.facebookLogin = gVar.mo61690c();
                        mVCarpoolRegistrationSteps.mo25557l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVCarpoolRegistrationSteps.phoneVerification = gVar.mo61690c();
                    mVCarpoolRegistrationSteps.mo25558m();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarpoolRegistrationSteps$b */
    public static class C8191b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8190a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarpoolRegistrationSteps$c */
    public static class C8192c extends C25240d<MVCarpoolRegistrationSteps> {
        public C8192c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolRegistrationSteps mVCarpoolRegistrationSteps = (MVCarpoolRegistrationSteps) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarpoolRegistrationSteps.mo25554i()) {
                bitSet.set(0);
            }
            if (mVCarpoolRegistrationSteps.mo25552h()) {
                bitSet.set(1);
            }
            if (mVCarpoolRegistrationSteps.mo25550f()) {
                bitSet.set(2);
            }
            if (mVCarpoolRegistrationSteps.mo25551g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVCarpoolRegistrationSteps.mo25554i()) {
                jVar.mo61708u(mVCarpoolRegistrationSteps.phoneVerification);
            }
            if (mVCarpoolRegistrationSteps.mo25552h()) {
                jVar.mo61708u(mVCarpoolRegistrationSteps.facebookLogin);
            }
            if (mVCarpoolRegistrationSteps.mo25550f()) {
                jVar.mo61708u(mVCarpoolRegistrationSteps.creditCardInformation);
            }
            if (mVCarpoolRegistrationSteps.mo25551g()) {
                jVar.mo61708u(mVCarpoolRegistrationSteps.emailInformation);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolRegistrationSteps mVCarpoolRegistrationSteps = (MVCarpoolRegistrationSteps) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVCarpoolRegistrationSteps.phoneVerification = jVar.mo61690c();
                mVCarpoolRegistrationSteps.mo25558m();
            }
            if (T.get(1)) {
                mVCarpoolRegistrationSteps.facebookLogin = jVar.mo61690c();
                mVCarpoolRegistrationSteps.mo25557l();
            }
            if (T.get(2)) {
                mVCarpoolRegistrationSteps.creditCardInformation = jVar.mo61690c();
                mVCarpoolRegistrationSteps.mo25555j();
            }
            if (T.get(3)) {
                mVCarpoolRegistrationSteps.emailInformation = jVar.mo61690c();
                mVCarpoolRegistrationSteps.mo25556k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarpoolRegistrationSteps$d */
    public static class C8193d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8192c(0);
        }
    }

    static {
        new C17394d0("MVCarpoolRegistrationSteps");
        HashMap hashMap = new HashMap();
        f24687f = hashMap;
        hashMap.put(C25239c.class, new C8191b());
        hashMap.put(C25240d.class, new C8193d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PHONE_VERIFICATION, new FieldMetaData("phoneVerification", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.FACEBOOK_LOGIN, new FieldMetaData("facebookLogin", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.CREDIT_CARD_INFORMATION, new FieldMetaData("creditCardInformation", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.EMAIL_INFORMATION, new FieldMetaData("emailInformation", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24688g = unmodifiableMap;
        FieldMetaData.m61947a(MVCarpoolRegistrationSteps.class, unmodifiableMap);
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
        ((C25238b) f24687f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24687f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25547a(MVCarpoolRegistrationSteps mVCarpoolRegistrationSteps) {
        if (mVCarpoolRegistrationSteps != null && this.phoneVerification == mVCarpoolRegistrationSteps.phoneVerification && this.facebookLogin == mVCarpoolRegistrationSteps.facebookLogin && this.creditCardInformation == mVCarpoolRegistrationSteps.creditCardInformation && this.emailInformation == mVCarpoolRegistrationSteps.emailInformation) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int l;
        MVCarpoolRegistrationSteps mVCarpoolRegistrationSteps = (MVCarpoolRegistrationSteps) obj;
        if (!getClass().equals(mVCarpoolRegistrationSteps.getClass())) {
            return getClass().getName().compareTo(mVCarpoolRegistrationSteps.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25554i()).compareTo(Boolean.valueOf(mVCarpoolRegistrationSteps.mo25554i()));
        if (compareTo != 0 || ((mo25554i() && (compareTo = C25082a.m62848l(this.phoneVerification, mVCarpoolRegistrationSteps.phoneVerification)) != 0) || (compareTo = Boolean.valueOf(mo25552h()).compareTo(Boolean.valueOf(mVCarpoolRegistrationSteps.mo25552h()))) != 0 || ((mo25552h() && (compareTo = C25082a.m62848l(this.facebookLogin, mVCarpoolRegistrationSteps.facebookLogin)) != 0) || (compareTo = Boolean.valueOf(mo25550f()).compareTo(Boolean.valueOf(mVCarpoolRegistrationSteps.mo25550f()))) != 0 || ((mo25550f() && (compareTo = C25082a.m62848l(this.creditCardInformation, mVCarpoolRegistrationSteps.creditCardInformation)) != 0) || (compareTo = Boolean.valueOf(mo25551g()).compareTo(Boolean.valueOf(mVCarpoolRegistrationSteps.mo25551g()))) != 0)))) {
            return compareTo;
        }
        if (!mo25551g() || (l = C25082a.m62848l(this.emailInformation, mVCarpoolRegistrationSteps.emailInformation)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCarpoolRegistrationSteps)) {
            return mo25547a((MVCarpoolRegistrationSteps) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25550f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo25551g() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: h */
    public final boolean mo25552h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25554i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo25555j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo25556k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: l */
    public final void mo25557l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo25558m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarpoolRegistrationSteps(", "phoneVerification:");
        C13555b.m33977q(n, this.phoneVerification, ", ", "facebookLogin:");
        C13555b.m33977q(n, this.facebookLogin, ", ", "creditCardInformation:");
        C13555b.m33977q(n, this.creditCardInformation, ", ", "emailInformation:");
        return C25541a.m63885p(n, this.emailInformation, ")");
    }
}
