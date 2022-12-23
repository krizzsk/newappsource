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

public class MVLoginAccountInfo implements TBase<MVLoginAccountInfo, _Fields>, Serializable, Cloneable, Comparable<MVLoginAccountInfo> {

    /* renamed from: b */
    public static final C25113c f27350b = new C25113c("isMigratedUser", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f27351c = new C25113c("accountId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27352d = new C25113c("missingSteps", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f27353e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27354f;
    private byte __isset_bitfield = 0;
    public String accountId;
    public boolean isMigratedUser;
    public MVMissingPaymentRegistrationSteps missingSteps;
    private _Fields[] optionals = {_Fields.MISSING_STEPS};

    public enum _Fields implements C25085c {
        IS_MIGRATED_USER(1, "isMigratedUser"),
        ACCOUNT_ID(2, "accountId"),
        MISSING_STEPS(3, "missingSteps");
        
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
                return ACCOUNT_ID;
            }
            if (i != 3) {
                return null;
            }
            return MISSING_STEPS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVLoginAccountInfo$a */
    public static class C9813a extends C25239c<MVLoginAccountInfo> {
        public C9813a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLoginAccountInfo mVLoginAccountInfo = (MVLoginAccountInfo) tBase;
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = mVLoginAccountInfo.missingSteps;
            if (mVMissingPaymentRegistrationSteps != null) {
                mVMissingPaymentRegistrationSteps.mo30045s();
            }
            C25113c cVar = MVLoginAccountInfo.f27350b;
            gVar.mo61687K();
            gVar.mo61711x(MVLoginAccountInfo.f27350b);
            gVar.mo61708u(mVLoginAccountInfo.isMigratedUser);
            gVar.mo61712y();
            if (mVLoginAccountInfo.accountId != null) {
                gVar.mo61711x(MVLoginAccountInfo.f27351c);
                gVar.mo61686J(mVLoginAccountInfo.accountId);
                gVar.mo61712y();
            }
            if (mVLoginAccountInfo.missingSteps != null && mVLoginAccountInfo.mo30010h()) {
                gVar.mo61711x(MVLoginAccountInfo.f27352d);
                mVLoginAccountInfo.missingSteps.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLoginAccountInfo mVLoginAccountInfo = (MVLoginAccountInfo) tBase;
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
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = new MVMissingPaymentRegistrationSteps();
                            mVLoginAccountInfo.missingSteps = mVMissingPaymentRegistrationSteps;
                            mVMissingPaymentRegistrationSteps.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVLoginAccountInfo.accountId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVLoginAccountInfo.isMigratedUser = gVar.mo61690c();
                    mVLoginAccountInfo.mo30012i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps2 = mVLoginAccountInfo.missingSteps;
            if (mVMissingPaymentRegistrationSteps2 != null) {
                mVMissingPaymentRegistrationSteps2.mo30045s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVLoginAccountInfo$b */
    public static class C9814b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9813a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVLoginAccountInfo$c */
    public static class C9815c extends C25240d<MVLoginAccountInfo> {
        public C9815c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLoginAccountInfo mVLoginAccountInfo = (MVLoginAccountInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLoginAccountInfo.mo30009g()) {
                bitSet.set(0);
            }
            if (mVLoginAccountInfo.mo30008f()) {
                bitSet.set(1);
            }
            if (mVLoginAccountInfo.mo30010h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVLoginAccountInfo.mo30009g()) {
                jVar.mo61708u(mVLoginAccountInfo.isMigratedUser);
            }
            if (mVLoginAccountInfo.mo30008f()) {
                jVar.mo61686J(mVLoginAccountInfo.accountId);
            }
            if (mVLoginAccountInfo.mo30010h()) {
                mVLoginAccountInfo.missingSteps.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLoginAccountInfo mVLoginAccountInfo = (MVLoginAccountInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVLoginAccountInfo.isMigratedUser = jVar.mo61690c();
                mVLoginAccountInfo.mo30012i();
            }
            if (T.get(1)) {
                mVLoginAccountInfo.accountId = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = new MVMissingPaymentRegistrationSteps();
                mVLoginAccountInfo.missingSteps = mVMissingPaymentRegistrationSteps;
                mVMissingPaymentRegistrationSteps.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVLoginAccountInfo$d */
    public static class C9816d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9815c(0);
        }
    }

    static {
        new C17394d0("MVLoginAccountInfo");
        HashMap hashMap = new HashMap();
        f27353e = hashMap;
        hashMap.put(C25239c.class, new C9814b());
        hashMap.put(C25240d.class, new C9816d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IS_MIGRATED_USER, new FieldMetaData("isMigratedUser", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ACCOUNT_ID, new FieldMetaData("accountId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MISSING_STEPS, new FieldMetaData("missingSteps", (byte) 2, new StructMetaData(MVMissingPaymentRegistrationSteps.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27354f = unmodifiableMap;
        FieldMetaData.m61947a(MVLoginAccountInfo.class, unmodifiableMap);
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
        ((C25238b) f27353e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27353e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30005a(MVLoginAccountInfo mVLoginAccountInfo) {
        if (mVLoginAccountInfo == null || this.isMigratedUser != mVLoginAccountInfo.isMigratedUser) {
            return false;
        }
        boolean f = mo30008f();
        boolean f2 = mVLoginAccountInfo.mo30008f();
        if ((f || f2) && (!f || !f2 || !this.accountId.equals(mVLoginAccountInfo.accountId))) {
            return false;
        }
        boolean h = mo30010h();
        boolean h2 = mVLoginAccountInfo.mo30010h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.missingSteps.mo30029a(mVLoginAccountInfo.missingSteps)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLoginAccountInfo mVLoginAccountInfo = (MVLoginAccountInfo) obj;
        if (!getClass().equals(mVLoginAccountInfo.getClass())) {
            return getClass().getName().compareTo(mVLoginAccountInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30009g()).compareTo(Boolean.valueOf(mVLoginAccountInfo.mo30009g()));
        if (compareTo2 != 0 || ((mo30009g() && (compareTo2 = C25082a.m62848l(this.isMigratedUser, mVLoginAccountInfo.isMigratedUser)) != 0) || (compareTo2 = Boolean.valueOf(mo30008f()).compareTo(Boolean.valueOf(mVLoginAccountInfo.mo30008f()))) != 0 || ((mo30008f() && (compareTo2 = this.accountId.compareTo(mVLoginAccountInfo.accountId)) != 0) || (compareTo2 = Boolean.valueOf(mo30010h()).compareTo(Boolean.valueOf(mVLoginAccountInfo.mo30010h()))) != 0))) {
            return compareTo2;
        }
        if (!mo30010h() || (compareTo = this.missingSteps.compareTo(mVLoginAccountInfo.missingSteps)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVLoginAccountInfo)) {
            return mo30005a((MVLoginAccountInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30008f() {
        return this.accountId != null;
    }

    /* renamed from: g */
    public final boolean mo30009g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo30010h() {
        return this.missingSteps != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo30012i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLoginAccountInfo(", "isMigratedUser:");
        C13555b.m33977q(n, this.isMigratedUser, ", ", "accountId:");
        String str = this.accountId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo30010h()) {
            n.append(", ");
            n.append("missingSteps:");
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = this.missingSteps;
            if (mVMissingPaymentRegistrationSteps == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMissingPaymentRegistrationSteps);
            }
        }
        n.append(")");
        return n.toString();
    }
}
