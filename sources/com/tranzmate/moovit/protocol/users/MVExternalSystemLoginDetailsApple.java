package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
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
import p358af.C13437d;
import p531he.C17394d0;
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

public class MVExternalSystemLoginDetailsApple implements TBase<MVExternalSystemLoginDetailsApple, _Fields>, Serializable, Cloneable, Comparable<MVExternalSystemLoginDetailsApple> {

    /* renamed from: b */
    public static final C25113c f30408b = new C25113c(FirebaseMessagingService.EXTRA_TOKEN, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30409c = new C25113c("id", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30410d = new C25113c("authorizationCode", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30411e = new C25113c("givenName", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f30412f = new C25113c("familyName", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f30413g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f30414h;
    public String authorizationCode;
    public String familyName;
    public String givenName;

    /* renamed from: id */
    public String f30415id;
    private _Fields[] optionals = {_Fields.GIVEN_NAME, _Fields.FAMILY_NAME};
    public String token;

    public enum _Fields implements C25085c {
        TOKEN(1, FirebaseMessagingService.EXTRA_TOKEN),
        ID(2, "id"),
        AUTHORIZATION_CODE(3, "authorizationCode"),
        GIVEN_NAME(4, "givenName"),
        FAMILY_NAME(5, "familyName");
        
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
                return TOKEN;
            }
            if (i == 2) {
                return ID;
            }
            if (i == 3) {
                return AUTHORIZATION_CODE;
            }
            if (i == 4) {
                return GIVEN_NAME;
            }
            if (i != 5) {
                return null;
            }
            return FAMILY_NAME;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExternalSystemLoginDetailsApple$a */
    public static class C11808a extends C25239c<MVExternalSystemLoginDetailsApple> {
        public C11808a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalSystemLoginDetailsApple mVExternalSystemLoginDetailsApple = (MVExternalSystemLoginDetailsApple) tBase;
            mVExternalSystemLoginDetailsApple.getClass();
            C25113c cVar = MVExternalSystemLoginDetailsApple.f30408b;
            gVar.mo61687K();
            if (mVExternalSystemLoginDetailsApple.token != null) {
                gVar.mo61711x(MVExternalSystemLoginDetailsApple.f30408b);
                gVar.mo61686J(mVExternalSystemLoginDetailsApple.token);
                gVar.mo61712y();
            }
            if (mVExternalSystemLoginDetailsApple.f30415id != null) {
                gVar.mo61711x(MVExternalSystemLoginDetailsApple.f30409c);
                gVar.mo61686J(mVExternalSystemLoginDetailsApple.f30415id);
                gVar.mo61712y();
            }
            if (mVExternalSystemLoginDetailsApple.authorizationCode != null) {
                gVar.mo61711x(MVExternalSystemLoginDetailsApple.f30410d);
                gVar.mo61686J(mVExternalSystemLoginDetailsApple.authorizationCode);
                gVar.mo61712y();
            }
            if (mVExternalSystemLoginDetailsApple.givenName != null && mVExternalSystemLoginDetailsApple.mo35125h()) {
                gVar.mo61711x(MVExternalSystemLoginDetailsApple.f30411e);
                gVar.mo61686J(mVExternalSystemLoginDetailsApple.givenName);
                gVar.mo61712y();
            }
            if (mVExternalSystemLoginDetailsApple.familyName != null && mVExternalSystemLoginDetailsApple.mo35124g()) {
                gVar.mo61711x(MVExternalSystemLoginDetailsApple.f30412f);
                gVar.mo61686J(mVExternalSystemLoginDetailsApple.familyName);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalSystemLoginDetailsApple mVExternalSystemLoginDetailsApple = (MVExternalSystemLoginDetailsApple) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVExternalSystemLoginDetailsApple.getClass();
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
                                    mVExternalSystemLoginDetailsApple.familyName = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVExternalSystemLoginDetailsApple.givenName = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVExternalSystemLoginDetailsApple.authorizationCode = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVExternalSystemLoginDetailsApple.f30415id = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVExternalSystemLoginDetailsApple.token = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExternalSystemLoginDetailsApple$b */
    public static class C11809b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11808a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExternalSystemLoginDetailsApple$c */
    public static class C11810c extends C25240d<MVExternalSystemLoginDetailsApple> {
        public C11810c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalSystemLoginDetailsApple mVExternalSystemLoginDetailsApple = (MVExternalSystemLoginDetailsApple) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVExternalSystemLoginDetailsApple.mo35128j()) {
                bitSet.set(0);
            }
            if (mVExternalSystemLoginDetailsApple.mo35127i()) {
                bitSet.set(1);
            }
            if (mVExternalSystemLoginDetailsApple.mo35123f()) {
                bitSet.set(2);
            }
            if (mVExternalSystemLoginDetailsApple.mo35125h()) {
                bitSet.set(3);
            }
            if (mVExternalSystemLoginDetailsApple.mo35124g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVExternalSystemLoginDetailsApple.mo35128j()) {
                jVar.mo61686J(mVExternalSystemLoginDetailsApple.token);
            }
            if (mVExternalSystemLoginDetailsApple.mo35127i()) {
                jVar.mo61686J(mVExternalSystemLoginDetailsApple.f30415id);
            }
            if (mVExternalSystemLoginDetailsApple.mo35123f()) {
                jVar.mo61686J(mVExternalSystemLoginDetailsApple.authorizationCode);
            }
            if (mVExternalSystemLoginDetailsApple.mo35125h()) {
                jVar.mo61686J(mVExternalSystemLoginDetailsApple.givenName);
            }
            if (mVExternalSystemLoginDetailsApple.mo35124g()) {
                jVar.mo61686J(mVExternalSystemLoginDetailsApple.familyName);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalSystemLoginDetailsApple mVExternalSystemLoginDetailsApple = (MVExternalSystemLoginDetailsApple) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVExternalSystemLoginDetailsApple.token = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVExternalSystemLoginDetailsApple.f30415id = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVExternalSystemLoginDetailsApple.authorizationCode = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVExternalSystemLoginDetailsApple.givenName = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVExternalSystemLoginDetailsApple.familyName = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExternalSystemLoginDetailsApple$d */
    public static class C11811d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11810c(0);
        }
    }

    static {
        new C17394d0("MVExternalSystemLoginDetailsApple");
        HashMap hashMap = new HashMap();
        f30413g = hashMap;
        hashMap.put(C25239c.class, new C11809b());
        hashMap.put(C25240d.class, new C11811d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TOKEN, new FieldMetaData(FirebaseMessagingService.EXTRA_TOKEN, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AUTHORIZATION_CODE, new FieldMetaData("authorizationCode", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.GIVEN_NAME, new FieldMetaData("givenName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FAMILY_NAME, new FieldMetaData("familyName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30414h = unmodifiableMap;
        FieldMetaData.m61947a(MVExternalSystemLoginDetailsApple.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f30413g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30413g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVExternalSystemLoginDetailsApple mVExternalSystemLoginDetailsApple = (MVExternalSystemLoginDetailsApple) obj;
        if (!getClass().equals(mVExternalSystemLoginDetailsApple.getClass())) {
            return getClass().getName().compareTo(mVExternalSystemLoginDetailsApple.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35128j()).compareTo(Boolean.valueOf(mVExternalSystemLoginDetailsApple.mo35128j()));
        if (compareTo2 != 0 || ((mo35128j() && (compareTo2 = this.token.compareTo(mVExternalSystemLoginDetailsApple.token)) != 0) || (compareTo2 = Boolean.valueOf(mo35127i()).compareTo(Boolean.valueOf(mVExternalSystemLoginDetailsApple.mo35127i()))) != 0 || ((mo35127i() && (compareTo2 = this.f30415id.compareTo(mVExternalSystemLoginDetailsApple.f30415id)) != 0) || (compareTo2 = Boolean.valueOf(mo35123f()).compareTo(Boolean.valueOf(mVExternalSystemLoginDetailsApple.mo35123f()))) != 0 || ((mo35123f() && (compareTo2 = this.authorizationCode.compareTo(mVExternalSystemLoginDetailsApple.authorizationCode)) != 0) || (compareTo2 = Boolean.valueOf(mo35125h()).compareTo(Boolean.valueOf(mVExternalSystemLoginDetailsApple.mo35125h()))) != 0 || ((mo35125h() && (compareTo2 = this.givenName.compareTo(mVExternalSystemLoginDetailsApple.givenName)) != 0) || (compareTo2 = Boolean.valueOf(mo35124g()).compareTo(Boolean.valueOf(mVExternalSystemLoginDetailsApple.mo35124g()))) != 0))))) {
            return compareTo2;
        }
        if (!mo35124g() || (compareTo = this.familyName.compareTo(mVExternalSystemLoginDetailsApple.familyName)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVExternalSystemLoginDetailsApple)) {
            return false;
        }
        MVExternalSystemLoginDetailsApple mVExternalSystemLoginDetailsApple = (MVExternalSystemLoginDetailsApple) obj;
        boolean j = mo35128j();
        boolean j2 = mVExternalSystemLoginDetailsApple.mo35128j();
        if ((j || j2) && (!j || !j2 || !this.token.equals(mVExternalSystemLoginDetailsApple.token))) {
            return false;
        }
        boolean i = mo35127i();
        boolean i2 = mVExternalSystemLoginDetailsApple.mo35127i();
        if ((i || i2) && (!i || !i2 || !this.f30415id.equals(mVExternalSystemLoginDetailsApple.f30415id))) {
            return false;
        }
        boolean f = mo35123f();
        boolean f2 = mVExternalSystemLoginDetailsApple.mo35123f();
        if ((f || f2) && (!f || !f2 || !this.authorizationCode.equals(mVExternalSystemLoginDetailsApple.authorizationCode))) {
            return false;
        }
        boolean h = mo35125h();
        boolean h2 = mVExternalSystemLoginDetailsApple.mo35125h();
        if ((h || h2) && (!h || !h2 || !this.givenName.equals(mVExternalSystemLoginDetailsApple.givenName))) {
            return false;
        }
        boolean g = mo35124g();
        boolean g2 = mVExternalSystemLoginDetailsApple.mo35124g();
        if ((g || g2) && (!g || !g2 || !this.familyName.equals(mVExternalSystemLoginDetailsApple.familyName))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35123f() {
        return this.authorizationCode != null;
    }

    /* renamed from: g */
    public final boolean mo35124g() {
        return this.familyName != null;
    }

    /* renamed from: h */
    public final boolean mo35125h() {
        return this.givenName != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35127i() {
        return this.f30415id != null;
    }

    /* renamed from: j */
    public final boolean mo35128j() {
        return this.token != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVExternalSystemLoginDetailsApple(", "token:");
        String str = this.token;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("id:");
        String str2 = this.f30415id;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("authorizationCode:");
        String str3 = this.authorizationCode;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        if (mo35125h()) {
            n.append(", ");
            n.append("givenName:");
            String str4 = this.givenName;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        if (mo35124g()) {
            n.append(", ");
            n.append("familyName:");
            String str5 = this.familyName;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        n.append(")");
        return n.toString();
    }
}
