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

public class MVUserProfileData implements TBase<MVUserProfileData, _Fields>, Serializable, Cloneable, Comparable<MVUserProfileData> {

    /* renamed from: b */
    public static final C25113c f30627b = new C25113c("firstName", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30628c = new C25113c("lastName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30629d = new C25113c("email", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30630e = new C25113c("profilePhotoUrl", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f30631f = new C25113c("nickname", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f30632g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f30633h;
    public String email;
    public String firstName;
    public String lastName;
    public String nickname;
    private _Fields[] optionals = {_Fields.FIRST_NAME, _Fields.LAST_NAME, _Fields.EMAIL, _Fields.PROFILE_PHOTO_URL, _Fields.NICKNAME};
    public String profilePhotoUrl;

    public enum _Fields implements C25085c {
        FIRST_NAME(1, "firstName"),
        LAST_NAME(2, "lastName"),
        EMAIL(3, "email"),
        PROFILE_PHOTO_URL(4, "profilePhotoUrl"),
        NICKNAME(5, "nickname");
        
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
                return FIRST_NAME;
            }
            if (i == 2) {
                return LAST_NAME;
            }
            if (i == 3) {
                return EMAIL;
            }
            if (i == 4) {
                return PROFILE_PHOTO_URL;
            }
            if (i != 5) {
                return null;
            }
            return NICKNAME;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserProfileData$a */
    public static class C11981a extends C25239c<MVUserProfileData> {
        public C11981a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserProfileData mVUserProfileData = (MVUserProfileData) tBase;
            mVUserProfileData.getClass();
            C25113c cVar = MVUserProfileData.f30627b;
            gVar.mo61687K();
            if (mVUserProfileData.firstName != null && mVUserProfileData.mo35517g()) {
                gVar.mo61711x(MVUserProfileData.f30627b);
                gVar.mo61686J(mVUserProfileData.firstName);
                gVar.mo61712y();
            }
            if (mVUserProfileData.lastName != null && mVUserProfileData.mo35518h()) {
                gVar.mo61711x(MVUserProfileData.f30628c);
                gVar.mo61686J(mVUserProfileData.lastName);
                gVar.mo61712y();
            }
            if (mVUserProfileData.email != null && mVUserProfileData.mo35516f()) {
                gVar.mo61711x(MVUserProfileData.f30629d);
                gVar.mo61686J(mVUserProfileData.email);
                gVar.mo61712y();
            }
            if (mVUserProfileData.profilePhotoUrl != null && mVUserProfileData.mo35521j()) {
                gVar.mo61711x(MVUserProfileData.f30630e);
                gVar.mo61686J(mVUserProfileData.profilePhotoUrl);
                gVar.mo61712y();
            }
            if (mVUserProfileData.nickname != null && mVUserProfileData.mo35520i()) {
                gVar.mo61711x(MVUserProfileData.f30631f);
                gVar.mo61686J(mVUserProfileData.nickname);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserProfileData mVUserProfileData = (MVUserProfileData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUserProfileData.getClass();
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
                                    mVUserProfileData.nickname = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVUserProfileData.profilePhotoUrl = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVUserProfileData.email = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVUserProfileData.lastName = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVUserProfileData.firstName = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserProfileData$b */
    public static class C11982b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11981a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserProfileData$c */
    public static class C11983c extends C25240d<MVUserProfileData> {
        public C11983c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserProfileData mVUserProfileData = (MVUserProfileData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserProfileData.mo35517g()) {
                bitSet.set(0);
            }
            if (mVUserProfileData.mo35518h()) {
                bitSet.set(1);
            }
            if (mVUserProfileData.mo35516f()) {
                bitSet.set(2);
            }
            if (mVUserProfileData.mo35521j()) {
                bitSet.set(3);
            }
            if (mVUserProfileData.mo35520i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVUserProfileData.mo35517g()) {
                jVar.mo61686J(mVUserProfileData.firstName);
            }
            if (mVUserProfileData.mo35518h()) {
                jVar.mo61686J(mVUserProfileData.lastName);
            }
            if (mVUserProfileData.mo35516f()) {
                jVar.mo61686J(mVUserProfileData.email);
            }
            if (mVUserProfileData.mo35521j()) {
                jVar.mo61686J(mVUserProfileData.profilePhotoUrl);
            }
            if (mVUserProfileData.mo35520i()) {
                jVar.mo61686J(mVUserProfileData.nickname);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserProfileData mVUserProfileData = (MVUserProfileData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVUserProfileData.firstName = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVUserProfileData.lastName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVUserProfileData.email = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVUserProfileData.profilePhotoUrl = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVUserProfileData.nickname = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserProfileData$d */
    public static class C11984d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11983c(0);
        }
    }

    static {
        new C17394d0("MVUserProfileData");
        HashMap hashMap = new HashMap();
        f30632g = hashMap;
        hashMap.put(C25239c.class, new C11982b());
        hashMap.put(C25240d.class, new C11984d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FIRST_NAME, new FieldMetaData("firstName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LAST_NAME, new FieldMetaData("lastName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.EMAIL, new FieldMetaData("email", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROFILE_PHOTO_URL, new FieldMetaData("profilePhotoUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NICKNAME, new FieldMetaData("nickname", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30633h = unmodifiableMap;
        FieldMetaData.m61947a(MVUserProfileData.class, unmodifiableMap);
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
        ((C25238b) f30632g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30632g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35513a(MVUserProfileData mVUserProfileData) {
        if (mVUserProfileData == null) {
            return false;
        }
        boolean g = mo35517g();
        boolean g2 = mVUserProfileData.mo35517g();
        if ((g || g2) && (!g || !g2 || !this.firstName.equals(mVUserProfileData.firstName))) {
            return false;
        }
        boolean h = mo35518h();
        boolean h2 = mVUserProfileData.mo35518h();
        if ((h || h2) && (!h || !h2 || !this.lastName.equals(mVUserProfileData.lastName))) {
            return false;
        }
        boolean f = mo35516f();
        boolean f2 = mVUserProfileData.mo35516f();
        if ((f || f2) && (!f || !f2 || !this.email.equals(mVUserProfileData.email))) {
            return false;
        }
        boolean j = mo35521j();
        boolean j2 = mVUserProfileData.mo35521j();
        if ((j || j2) && (!j || !j2 || !this.profilePhotoUrl.equals(mVUserProfileData.profilePhotoUrl))) {
            return false;
        }
        boolean i = mo35520i();
        boolean i2 = mVUserProfileData.mo35520i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.nickname.equals(mVUserProfileData.nickname)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUserProfileData mVUserProfileData = (MVUserProfileData) obj;
        if (!getClass().equals(mVUserProfileData.getClass())) {
            return getClass().getName().compareTo(mVUserProfileData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35517g()).compareTo(Boolean.valueOf(mVUserProfileData.mo35517g()));
        if (compareTo2 != 0 || ((mo35517g() && (compareTo2 = this.firstName.compareTo(mVUserProfileData.firstName)) != 0) || (compareTo2 = Boolean.valueOf(mo35518h()).compareTo(Boolean.valueOf(mVUserProfileData.mo35518h()))) != 0 || ((mo35518h() && (compareTo2 = this.lastName.compareTo(mVUserProfileData.lastName)) != 0) || (compareTo2 = Boolean.valueOf(mo35516f()).compareTo(Boolean.valueOf(mVUserProfileData.mo35516f()))) != 0 || ((mo35516f() && (compareTo2 = this.email.compareTo(mVUserProfileData.email)) != 0) || (compareTo2 = Boolean.valueOf(mo35521j()).compareTo(Boolean.valueOf(mVUserProfileData.mo35521j()))) != 0 || ((mo35521j() && (compareTo2 = this.profilePhotoUrl.compareTo(mVUserProfileData.profilePhotoUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo35520i()).compareTo(Boolean.valueOf(mVUserProfileData.mo35520i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo35520i() || (compareTo = this.nickname.compareTo(mVUserProfileData.nickname)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVUserProfileData)) {
            return mo35513a((MVUserProfileData) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35516f() {
        return this.email != null;
    }

    /* renamed from: g */
    public final boolean mo35517g() {
        return this.firstName != null;
    }

    /* renamed from: h */
    public final boolean mo35518h() {
        return this.lastName != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35520i() {
        return this.nickname != null;
    }

    /* renamed from: j */
    public final boolean mo35521j() {
        return this.profilePhotoUrl != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVUserProfileData(");
        boolean z2 = false;
        if (mo35517g()) {
            sb.append("firstName:");
            String str = this.firstName;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo35518h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("lastName:");
            String str2 = this.lastName;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (mo35516f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("email:");
            String str3 = this.email;
            if (str3 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (mo35521j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("profilePhotoUrl:");
            String str4 = this.profilePhotoUrl;
            if (str4 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str4);
            }
        } else {
            z2 = z;
        }
        if (mo35520i()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("nickname:");
            String str5 = this.nickname;
            if (str5 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str5);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
