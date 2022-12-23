package com.tranzmate.moovit.protocol.payments;

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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVPaymentRegistrationVerificationResponse implements TBase<MVPaymentRegistrationVerificationResponse, _Fields>, Serializable, Cloneable, Comparable<MVPaymentRegistrationVerificationResponse> {

    /* renamed from: b */
    public static final C25113c f27586b = new C25113c("isMigratedUser", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f27587c = new C25113c("missingSteps", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27588d = new C25113c("isAccountExist", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f27589e = new C25113c("accountId", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f27590f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27591g;
    private byte __isset_bitfield = 0;
    public String accountId;
    public boolean isAccountExist;
    public boolean isMigratedUser;
    public MVMissingPaymentRegistrationSteps missingSteps;
    private _Fields[] optionals = {_Fields.MISSING_STEPS};

    public enum _Fields implements C25085c {
        IS_MIGRATED_USER(1, "isMigratedUser"),
        MISSING_STEPS(2, "missingSteps"),
        IS_ACCOUNT_EXIST(3, "isAccountExist"),
        ACCOUNT_ID(4, "accountId");
        
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
                return IS_MIGRATED_USER;
            }
            if (i == 2) {
                return MISSING_STEPS;
            }
            if (i == 3) {
                return IS_ACCOUNT_EXIST;
            }
            if (i != 4) {
                return null;
            }
            return ACCOUNT_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationVerificationResponse$a */
    public static class C9987a extends C25239c<MVPaymentRegistrationVerificationResponse> {
        public C9987a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationVerificationResponse mVPaymentRegistrationVerificationResponse = (MVPaymentRegistrationVerificationResponse) tBase;
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = mVPaymentRegistrationVerificationResponse.missingSteps;
            if (mVMissingPaymentRegistrationSteps != null) {
                mVMissingPaymentRegistrationSteps.mo30045s();
            }
            C25113c cVar = MVPaymentRegistrationVerificationResponse.f27586b;
            gVar.mo61687K();
            gVar.mo61711x(MVPaymentRegistrationVerificationResponse.f27586b);
            gVar.mo61708u(mVPaymentRegistrationVerificationResponse.isMigratedUser);
            gVar.mo61712y();
            if (mVPaymentRegistrationVerificationResponse.missingSteps != null && mVPaymentRegistrationVerificationResponse.mo30401i()) {
                gVar.mo61711x(MVPaymentRegistrationVerificationResponse.f27587c);
                mVPaymentRegistrationVerificationResponse.missingSteps.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPaymentRegistrationVerificationResponse.f27588d);
            gVar.mo61708u(mVPaymentRegistrationVerificationResponse.isAccountExist);
            gVar.mo61712y();
            if (mVPaymentRegistrationVerificationResponse.accountId != null) {
                gVar.mo61711x(MVPaymentRegistrationVerificationResponse.f27589e);
                gVar.mo61686J(mVPaymentRegistrationVerificationResponse.accountId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationVerificationResponse mVPaymentRegistrationVerificationResponse = (MVPaymentRegistrationVerificationResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVPaymentRegistrationVerificationResponse.accountId = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVPaymentRegistrationVerificationResponse.isAccountExist = gVar.mo61690c();
                            mVPaymentRegistrationVerificationResponse.mo30402j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = new MVMissingPaymentRegistrationSteps();
                        mVPaymentRegistrationVerificationResponse.missingSteps = mVMissingPaymentRegistrationSteps;
                        mVMissingPaymentRegistrationSteps.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVPaymentRegistrationVerificationResponse.isMigratedUser = gVar.mo61690c();
                    mVPaymentRegistrationVerificationResponse.mo30403k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps2 = mVPaymentRegistrationVerificationResponse.missingSteps;
            if (mVMissingPaymentRegistrationSteps2 != null) {
                mVMissingPaymentRegistrationSteps2.mo30045s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationVerificationResponse$b */
    public static class C9988b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9987a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationVerificationResponse$c */
    public static class C9989c extends C25240d<MVPaymentRegistrationVerificationResponse> {
        public C9989c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationVerificationResponse mVPaymentRegistrationVerificationResponse = (MVPaymentRegistrationVerificationResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentRegistrationVerificationResponse.mo30399h()) {
                bitSet.set(0);
            }
            if (mVPaymentRegistrationVerificationResponse.mo30401i()) {
                bitSet.set(1);
            }
            if (mVPaymentRegistrationVerificationResponse.mo30398g()) {
                bitSet.set(2);
            }
            if (mVPaymentRegistrationVerificationResponse.mo30397f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVPaymentRegistrationVerificationResponse.mo30399h()) {
                jVar.mo61708u(mVPaymentRegistrationVerificationResponse.isMigratedUser);
            }
            if (mVPaymentRegistrationVerificationResponse.mo30401i()) {
                mVPaymentRegistrationVerificationResponse.missingSteps.mo25202X0(jVar);
            }
            if (mVPaymentRegistrationVerificationResponse.mo30398g()) {
                jVar.mo61708u(mVPaymentRegistrationVerificationResponse.isAccountExist);
            }
            if (mVPaymentRegistrationVerificationResponse.mo30397f()) {
                jVar.mo61686J(mVPaymentRegistrationVerificationResponse.accountId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationVerificationResponse mVPaymentRegistrationVerificationResponse = (MVPaymentRegistrationVerificationResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVPaymentRegistrationVerificationResponse.isMigratedUser = jVar.mo61690c();
                mVPaymentRegistrationVerificationResponse.mo30403k();
            }
            if (T.get(1)) {
                MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = new MVMissingPaymentRegistrationSteps();
                mVPaymentRegistrationVerificationResponse.missingSteps = mVMissingPaymentRegistrationSteps;
                mVMissingPaymentRegistrationSteps.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPaymentRegistrationVerificationResponse.isAccountExist = jVar.mo61690c();
                mVPaymentRegistrationVerificationResponse.mo30402j();
            }
            if (T.get(3)) {
                mVPaymentRegistrationVerificationResponse.accountId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationVerificationResponse$d */
    public static class C9990d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9989c(0);
        }
    }

    static {
        new C17394d0("MVPaymentRegistrationVerificationResponse");
        HashMap hashMap = new HashMap();
        f27590f = hashMap;
        hashMap.put(C25239c.class, new C9988b());
        hashMap.put(C25240d.class, new C9990d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IS_MIGRATED_USER, new FieldMetaData("isMigratedUser", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.MISSING_STEPS, new FieldMetaData("missingSteps", (byte) 2, new StructMetaData(MVMissingPaymentRegistrationSteps.class)));
        enumMap.put(_Fields.IS_ACCOUNT_EXIST, new FieldMetaData("isAccountExist", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ACCOUNT_ID, new FieldMetaData("accountId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27591g = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentRegistrationVerificationResponse.class, unmodifiableMap);
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
        ((C25238b) f27590f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27590f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentRegistrationVerificationResponse mVPaymentRegistrationVerificationResponse = (MVPaymentRegistrationVerificationResponse) obj;
        if (!getClass().equals(mVPaymentRegistrationVerificationResponse.getClass())) {
            return getClass().getName().compareTo(mVPaymentRegistrationVerificationResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30399h()).compareTo(Boolean.valueOf(mVPaymentRegistrationVerificationResponse.mo30399h()));
        if (compareTo2 != 0 || ((mo30399h() && (compareTo2 = C25082a.m62848l(this.isMigratedUser, mVPaymentRegistrationVerificationResponse.isMigratedUser)) != 0) || (compareTo2 = Boolean.valueOf(mo30401i()).compareTo(Boolean.valueOf(mVPaymentRegistrationVerificationResponse.mo30401i()))) != 0 || ((mo30401i() && (compareTo2 = this.missingSteps.compareTo(mVPaymentRegistrationVerificationResponse.missingSteps)) != 0) || (compareTo2 = Boolean.valueOf(mo30398g()).compareTo(Boolean.valueOf(mVPaymentRegistrationVerificationResponse.mo30398g()))) != 0 || ((mo30398g() && (compareTo2 = C25082a.m62848l(this.isAccountExist, mVPaymentRegistrationVerificationResponse.isAccountExist)) != 0) || (compareTo2 = Boolean.valueOf(mo30397f()).compareTo(Boolean.valueOf(mVPaymentRegistrationVerificationResponse.mo30397f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo30397f() || (compareTo = this.accountId.compareTo(mVPaymentRegistrationVerificationResponse.accountId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentRegistrationVerificationResponse)) {
            return false;
        }
        MVPaymentRegistrationVerificationResponse mVPaymentRegistrationVerificationResponse = (MVPaymentRegistrationVerificationResponse) obj;
        if (this.isMigratedUser != mVPaymentRegistrationVerificationResponse.isMigratedUser) {
            return false;
        }
        boolean i = mo30401i();
        boolean i2 = mVPaymentRegistrationVerificationResponse.mo30401i();
        if (((i || i2) && (!i || !i2 || !this.missingSteps.mo30029a(mVPaymentRegistrationVerificationResponse.missingSteps))) || this.isAccountExist != mVPaymentRegistrationVerificationResponse.isAccountExist) {
            return false;
        }
        boolean f = mo30397f();
        boolean f2 = mVPaymentRegistrationVerificationResponse.mo30397f();
        if ((f || f2) && (!f || !f2 || !this.accountId.equals(mVPaymentRegistrationVerificationResponse.accountId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30397f() {
        return this.accountId != null;
    }

    /* renamed from: g */
    public final boolean mo30398g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo30399h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30401i() {
        return this.missingSteps != null;
    }

    /* renamed from: j */
    public final void mo30402j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo30403k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentRegistrationVerificationResponse(", "isMigratedUser:");
        n.append(this.isMigratedUser);
        if (mo30401i()) {
            n.append(", ");
            n.append("missingSteps:");
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = this.missingSteps;
            if (mVMissingPaymentRegistrationSteps == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMissingPaymentRegistrationSteps);
            }
        }
        n.append(", ");
        n.append("isAccountExist:");
        C13555b.m33977q(n, this.isAccountExist, ", ", "accountId:");
        String str = this.accountId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
