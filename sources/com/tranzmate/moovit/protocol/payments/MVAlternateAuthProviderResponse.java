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

public class MVAlternateAuthProviderResponse implements TBase<MVAlternateAuthProviderResponse, _Fields>, Serializable, Cloneable, Comparable<MVAlternateAuthProviderResponse> {

    /* renamed from: b */
    public static final C25113c f27058b = new C25113c("accountId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27059c = new C25113c("isMigratedUser", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f27060d = new C25113c("missingSteps", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f27061e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27062f;
    private byte __isset_bitfield = 0;
    public String accountId;
    public boolean isMigratedUser;
    public MVMissingPaymentRegistrationSteps missingSteps;
    private _Fields[] optionals = {_Fields.MISSING_STEPS};

    public enum _Fields implements C25085c {
        ACCOUNT_ID(1, "accountId"),
        IS_MIGRATED_USER(2, "isMigratedUser"),
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
                return ACCOUNT_ID;
            }
            if (i == 2) {
                return IS_MIGRATED_USER;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAlternateAuthProviderResponse$a */
    public static class C9571a extends C25239c<MVAlternateAuthProviderResponse> {
        public C9571a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAlternateAuthProviderResponse mVAlternateAuthProviderResponse = (MVAlternateAuthProviderResponse) tBase;
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = mVAlternateAuthProviderResponse.missingSteps;
            if (mVMissingPaymentRegistrationSteps != null) {
                mVMissingPaymentRegistrationSteps.mo30045s();
            }
            C25113c cVar = MVAlternateAuthProviderResponse.f27058b;
            gVar.mo61687K();
            if (mVAlternateAuthProviderResponse.accountId != null) {
                gVar.mo61711x(MVAlternateAuthProviderResponse.f27058b);
                gVar.mo61686J(mVAlternateAuthProviderResponse.accountId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVAlternateAuthProviderResponse.f27059c);
            gVar.mo61708u(mVAlternateAuthProviderResponse.isMigratedUser);
            gVar.mo61712y();
            if (mVAlternateAuthProviderResponse.missingSteps != null && mVAlternateAuthProviderResponse.mo29505h()) {
                gVar.mo61711x(MVAlternateAuthProviderResponse.f27060d);
                mVAlternateAuthProviderResponse.missingSteps.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAlternateAuthProviderResponse mVAlternateAuthProviderResponse = (MVAlternateAuthProviderResponse) tBase;
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
                            mVAlternateAuthProviderResponse.missingSteps = mVMissingPaymentRegistrationSteps;
                            mVMissingPaymentRegistrationSteps.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVAlternateAuthProviderResponse.isMigratedUser = gVar.mo61690c();
                        mVAlternateAuthProviderResponse.mo29507i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAlternateAuthProviderResponse.accountId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps2 = mVAlternateAuthProviderResponse.missingSteps;
            if (mVMissingPaymentRegistrationSteps2 != null) {
                mVMissingPaymentRegistrationSteps2.mo30045s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAlternateAuthProviderResponse$b */
    public static class C9572b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9571a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAlternateAuthProviderResponse$c */
    public static class C9573c extends C25240d<MVAlternateAuthProviderResponse> {
        public C9573c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAlternateAuthProviderResponse mVAlternateAuthProviderResponse = (MVAlternateAuthProviderResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAlternateAuthProviderResponse.mo29503f()) {
                bitSet.set(0);
            }
            if (mVAlternateAuthProviderResponse.mo29504g()) {
                bitSet.set(1);
            }
            if (mVAlternateAuthProviderResponse.mo29505h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVAlternateAuthProviderResponse.mo29503f()) {
                jVar.mo61686J(mVAlternateAuthProviderResponse.accountId);
            }
            if (mVAlternateAuthProviderResponse.mo29504g()) {
                jVar.mo61708u(mVAlternateAuthProviderResponse.isMigratedUser);
            }
            if (mVAlternateAuthProviderResponse.mo29505h()) {
                mVAlternateAuthProviderResponse.missingSteps.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAlternateAuthProviderResponse mVAlternateAuthProviderResponse = (MVAlternateAuthProviderResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVAlternateAuthProviderResponse.accountId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVAlternateAuthProviderResponse.isMigratedUser = jVar.mo61690c();
                mVAlternateAuthProviderResponse.mo29507i();
            }
            if (T.get(2)) {
                MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = new MVMissingPaymentRegistrationSteps();
                mVAlternateAuthProviderResponse.missingSteps = mVMissingPaymentRegistrationSteps;
                mVMissingPaymentRegistrationSteps.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAlternateAuthProviderResponse$d */
    public static class C9574d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9573c(0);
        }
    }

    static {
        new C17394d0("MVAlternateAuthProviderResponse");
        HashMap hashMap = new HashMap();
        f27061e = hashMap;
        hashMap.put(C25239c.class, new C9572b());
        hashMap.put(C25240d.class, new C9574d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACCOUNT_ID, new FieldMetaData("accountId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_MIGRATED_USER, new FieldMetaData("isMigratedUser", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.MISSING_STEPS, new FieldMetaData("missingSteps", (byte) 2, new StructMetaData(MVMissingPaymentRegistrationSteps.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27062f = unmodifiableMap;
        FieldMetaData.m61947a(MVAlternateAuthProviderResponse.class, unmodifiableMap);
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
        ((C25238b) f27061e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27061e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAlternateAuthProviderResponse mVAlternateAuthProviderResponse = (MVAlternateAuthProviderResponse) obj;
        if (!getClass().equals(mVAlternateAuthProviderResponse.getClass())) {
            return getClass().getName().compareTo(mVAlternateAuthProviderResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29503f()).compareTo(Boolean.valueOf(mVAlternateAuthProviderResponse.mo29503f()));
        if (compareTo2 != 0 || ((mo29503f() && (compareTo2 = this.accountId.compareTo(mVAlternateAuthProviderResponse.accountId)) != 0) || (compareTo2 = Boolean.valueOf(mo29504g()).compareTo(Boolean.valueOf(mVAlternateAuthProviderResponse.mo29504g()))) != 0 || ((mo29504g() && (compareTo2 = C25082a.m62848l(this.isMigratedUser, mVAlternateAuthProviderResponse.isMigratedUser)) != 0) || (compareTo2 = Boolean.valueOf(mo29505h()).compareTo(Boolean.valueOf(mVAlternateAuthProviderResponse.mo29505h()))) != 0))) {
            return compareTo2;
        }
        if (!mo29505h() || (compareTo = this.missingSteps.compareTo(mVAlternateAuthProviderResponse.missingSteps)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAlternateAuthProviderResponse)) {
            return false;
        }
        MVAlternateAuthProviderResponse mVAlternateAuthProviderResponse = (MVAlternateAuthProviderResponse) obj;
        boolean f = mo29503f();
        boolean f2 = mVAlternateAuthProviderResponse.mo29503f();
        if (((f || f2) && (!f || !f2 || !this.accountId.equals(mVAlternateAuthProviderResponse.accountId))) || this.isMigratedUser != mVAlternateAuthProviderResponse.isMigratedUser) {
            return false;
        }
        boolean h = mo29505h();
        boolean h2 = mVAlternateAuthProviderResponse.mo29505h();
        if ((h || h2) && (!h || !h2 || !this.missingSteps.mo30029a(mVAlternateAuthProviderResponse.missingSteps))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29503f() {
        return this.accountId != null;
    }

    /* renamed from: g */
    public final boolean mo29504g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo29505h() {
        return this.missingSteps != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo29507i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAlternateAuthProviderResponse(", "accountId:");
        String str = this.accountId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("isMigratedUser:");
        n.append(this.isMigratedUser);
        if (mo29505h()) {
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
