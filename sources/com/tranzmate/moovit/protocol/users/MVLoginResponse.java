package com.tranzmate.moovit.protocol.users;

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

public class MVLoginResponse implements TBase<MVLoginResponse, _Fields>, Serializable, Cloneable, Comparable<MVLoginResponse> {

    /* renamed from: b */
    public static final C25113c f30467b = new C25113c("accountId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30468c = new C25113c("isNewAccount", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f30469d = new C25113c("userProfile", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f30470e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30471f;
    private byte __isset_bitfield = 0;
    public int accountId;
    public boolean isNewAccount;
    public MVUserProfileResponse userProfile;

    public enum _Fields implements C25085c {
        ACCOUNT_ID(1, "accountId"),
        IS_NEW_ACCOUNT(2, "isNewAccount"),
        USER_PROFILE(3, "userProfile");
        
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
                return IS_NEW_ACCOUNT;
            }
            if (i != 3) {
                return null;
            }
            return USER_PROFILE;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVLoginResponse$a */
    public static class C11853a extends C25239c<MVLoginResponse> {
        public C11853a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLoginResponse mVLoginResponse = (MVLoginResponse) tBase;
            MVUserProfileResponse mVUserProfileResponse = mVLoginResponse.userProfile;
            if (mVUserProfileResponse != null) {
                mVUserProfileResponse.mo35538J();
            }
            C25113c cVar = MVLoginResponse.f30467b;
            gVar.mo61687K();
            gVar.mo61711x(MVLoginResponse.f30467b);
            gVar.mo61678B(mVLoginResponse.accountId);
            gVar.mo61712y();
            gVar.mo61711x(MVLoginResponse.f30468c);
            gVar.mo61708u(mVLoginResponse.isNewAccount);
            gVar.mo61712y();
            if (mVLoginResponse.userProfile != null) {
                gVar.mo61711x(MVLoginResponse.f30469d);
                mVLoginResponse.userProfile.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLoginResponse mVLoginResponse = (MVLoginResponse) tBase;
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
                            MVUserProfileResponse mVUserProfileResponse = new MVUserProfileResponse();
                            mVLoginResponse.userProfile = mVUserProfileResponse;
                            mVUserProfileResponse.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVLoginResponse.isNewAccount = gVar.mo61690c();
                        mVLoginResponse.mo35226j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVLoginResponse.accountId = gVar.mo61696i();
                    mVLoginResponse.mo35225i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVUserProfileResponse mVUserProfileResponse2 = mVLoginResponse.userProfile;
            if (mVUserProfileResponse2 != null) {
                mVUserProfileResponse2.mo35538J();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVLoginResponse$b */
    public static class C11854b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11853a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVLoginResponse$c */
    public static class C11855c extends C25240d<MVLoginResponse> {
        public C11855c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLoginResponse mVLoginResponse = (MVLoginResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLoginResponse.mo35221f()) {
                bitSet.set(0);
            }
            if (mVLoginResponse.mo35222g()) {
                bitSet.set(1);
            }
            if (mVLoginResponse.mo35223h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVLoginResponse.mo35221f()) {
                jVar.mo61678B(mVLoginResponse.accountId);
            }
            if (mVLoginResponse.mo35222g()) {
                jVar.mo61708u(mVLoginResponse.isNewAccount);
            }
            if (mVLoginResponse.mo35223h()) {
                mVLoginResponse.userProfile.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLoginResponse mVLoginResponse = (MVLoginResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVLoginResponse.accountId = jVar.mo61696i();
                mVLoginResponse.mo35225i();
            }
            if (T.get(1)) {
                mVLoginResponse.isNewAccount = jVar.mo61690c();
                mVLoginResponse.mo35226j();
            }
            if (T.get(2)) {
                MVUserProfileResponse mVUserProfileResponse = new MVUserProfileResponse();
                mVLoginResponse.userProfile = mVUserProfileResponse;
                mVUserProfileResponse.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVLoginResponse$d */
    public static class C11856d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11855c(0);
        }
    }

    static {
        new C17394d0("MVLoginResponse");
        HashMap hashMap = new HashMap();
        f30470e = hashMap;
        hashMap.put(C25239c.class, new C11854b());
        hashMap.put(C25240d.class, new C11856d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACCOUNT_ID, new FieldMetaData("accountId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IS_NEW_ACCOUNT, new FieldMetaData("isNewAccount", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.USER_PROFILE, new FieldMetaData("userProfile", (byte) 3, new StructMetaData(MVUserProfileResponse.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30471f = unmodifiableMap;
        FieldMetaData.m61947a(MVLoginResponse.class, unmodifiableMap);
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
        ((C25238b) f30470e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30470e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLoginResponse mVLoginResponse = (MVLoginResponse) obj;
        if (!getClass().equals(mVLoginResponse.getClass())) {
            return getClass().getName().compareTo(mVLoginResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35221f()).compareTo(Boolean.valueOf(mVLoginResponse.mo35221f()));
        if (compareTo2 != 0 || ((mo35221f() && (compareTo2 = C25082a.m62839c(this.accountId, mVLoginResponse.accountId)) != 0) || (compareTo2 = Boolean.valueOf(mo35222g()).compareTo(Boolean.valueOf(mVLoginResponse.mo35222g()))) != 0 || ((mo35222g() && (compareTo2 = C25082a.m62848l(this.isNewAccount, mVLoginResponse.isNewAccount)) != 0) || (compareTo2 = Boolean.valueOf(mo35223h()).compareTo(Boolean.valueOf(mVLoginResponse.mo35223h()))) != 0))) {
            return compareTo2;
        }
        if (!mo35223h() || (compareTo = this.userProfile.compareTo(mVLoginResponse.userProfile)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLoginResponse)) {
            return false;
        }
        MVLoginResponse mVLoginResponse = (MVLoginResponse) obj;
        if (this.accountId != mVLoginResponse.accountId || this.isNewAccount != mVLoginResponse.isNewAccount) {
            return false;
        }
        boolean h = mo35223h();
        boolean h2 = mVLoginResponse.mo35223h();
        if ((h || h2) && (!h || !h2 || !this.userProfile.mo35539a(mVLoginResponse.userProfile))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35221f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo35222g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo35223h() {
        return this.userProfile != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo35225i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo35226j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLoginResponse(", "accountId:");
        C0016g.m42z(n, this.accountId, ", ", "isNewAccount:");
        C13555b.m33977q(n, this.isNewAccount, ", ", "userProfile:");
        MVUserProfileResponse mVUserProfileResponse = this.userProfile;
        if (mVUserProfileResponse == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVUserProfileResponse);
        }
        n.append(")");
        return n.toString();
    }
}
