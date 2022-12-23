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

public class MVApplePayPersonName implements TBase<MVApplePayPersonName, _Fields>, Serializable, Cloneable, Comparable<MVApplePayPersonName> {

    /* renamed from: b */
    public static final C25113c f27113b = new C25113c("namePrefix", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27114c = new C25113c("givenName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27115d = new C25113c("middleName", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27116e = new C25113c("familyName", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27117f = new C25113c("nameSuffix", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f27118g = new C25113c("nickname", (byte) 11, 6);

    /* renamed from: h */
    public static final HashMap f27119h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f27120i;
    public String familyName;
    public String givenName;
    public String middleName;
    public String namePrefix;
    public String nameSuffix;
    public String nickname;
    private _Fields[] optionals = {_Fields.NAME_PREFIX, _Fields.GIVEN_NAME, _Fields.MIDDLE_NAME, _Fields.FAMILY_NAME, _Fields.NAME_SUFFIX, _Fields.NICKNAME};

    public enum _Fields implements C25085c {
        NAME_PREFIX(1, "namePrefix"),
        GIVEN_NAME(2, "givenName"),
        MIDDLE_NAME(3, "middleName"),
        FAMILY_NAME(4, "familyName"),
        NAME_SUFFIX(5, "nameSuffix"),
        NICKNAME(6, "nickname");
        
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
            switch (i) {
                case 1:
                    return NAME_PREFIX;
                case 2:
                    return GIVEN_NAME;
                case 3:
                    return MIDDLE_NAME;
                case 4:
                    return FAMILY_NAME;
                case 5:
                    return NAME_SUFFIX;
                case 6:
                    return NICKNAME;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPersonName$a */
    public static class C9612a extends C25239c<MVApplePayPersonName> {
        public C9612a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPersonName mVApplePayPersonName = (MVApplePayPersonName) tBase;
            mVApplePayPersonName.getClass();
            C25113c cVar = MVApplePayPersonName.f27113b;
            gVar.mo61687K();
            if (mVApplePayPersonName.namePrefix != null && mVApplePayPersonName.mo29604i()) {
                gVar.mo61711x(MVApplePayPersonName.f27113b);
                gVar.mo61686J(mVApplePayPersonName.namePrefix);
                gVar.mo61712y();
            }
            if (mVApplePayPersonName.givenName != null && mVApplePayPersonName.mo29601g()) {
                gVar.mo61711x(MVApplePayPersonName.f27114c);
                gVar.mo61686J(mVApplePayPersonName.givenName);
                gVar.mo61712y();
            }
            if (mVApplePayPersonName.middleName != null && mVApplePayPersonName.mo29602h()) {
                gVar.mo61711x(MVApplePayPersonName.f27115d);
                gVar.mo61686J(mVApplePayPersonName.middleName);
                gVar.mo61712y();
            }
            if (mVApplePayPersonName.familyName != null && mVApplePayPersonName.mo29600f()) {
                gVar.mo61711x(MVApplePayPersonName.f27116e);
                gVar.mo61686J(mVApplePayPersonName.familyName);
                gVar.mo61712y();
            }
            if (mVApplePayPersonName.nameSuffix != null && mVApplePayPersonName.mo29605j()) {
                gVar.mo61711x(MVApplePayPersonName.f27117f);
                gVar.mo61686J(mVApplePayPersonName.nameSuffix);
                gVar.mo61712y();
            }
            if (mVApplePayPersonName.nickname != null && mVApplePayPersonName.mo29606k()) {
                gVar.mo61711x(MVApplePayPersonName.f27118g);
                gVar.mo61686J(mVApplePayPersonName.nickname);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPersonName mVApplePayPersonName = (MVApplePayPersonName) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVApplePayPersonName.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPersonName.namePrefix = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPersonName.givenName = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPersonName.middleName = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPersonName.familyName = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPersonName.nameSuffix = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPersonName.nickname = gVar.mo61704q();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPersonName$b */
    public static class C9613b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9612a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPersonName$c */
    public static class C9614c extends C25240d<MVApplePayPersonName> {
        public C9614c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPersonName mVApplePayPersonName = (MVApplePayPersonName) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVApplePayPersonName.mo29604i()) {
                bitSet.set(0);
            }
            if (mVApplePayPersonName.mo29601g()) {
                bitSet.set(1);
            }
            if (mVApplePayPersonName.mo29602h()) {
                bitSet.set(2);
            }
            if (mVApplePayPersonName.mo29600f()) {
                bitSet.set(3);
            }
            if (mVApplePayPersonName.mo29605j()) {
                bitSet.set(4);
            }
            if (mVApplePayPersonName.mo29606k()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVApplePayPersonName.mo29604i()) {
                jVar.mo61686J(mVApplePayPersonName.namePrefix);
            }
            if (mVApplePayPersonName.mo29601g()) {
                jVar.mo61686J(mVApplePayPersonName.givenName);
            }
            if (mVApplePayPersonName.mo29602h()) {
                jVar.mo61686J(mVApplePayPersonName.middleName);
            }
            if (mVApplePayPersonName.mo29600f()) {
                jVar.mo61686J(mVApplePayPersonName.familyName);
            }
            if (mVApplePayPersonName.mo29605j()) {
                jVar.mo61686J(mVApplePayPersonName.nameSuffix);
            }
            if (mVApplePayPersonName.mo29606k()) {
                jVar.mo61686J(mVApplePayPersonName.nickname);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPersonName mVApplePayPersonName = (MVApplePayPersonName) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVApplePayPersonName.namePrefix = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVApplePayPersonName.givenName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVApplePayPersonName.middleName = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVApplePayPersonName.familyName = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVApplePayPersonName.nameSuffix = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVApplePayPersonName.nickname = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPersonName$d */
    public static class C9615d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9614c(0);
        }
    }

    static {
        new C17394d0("MVApplePayPersonName");
        HashMap hashMap = new HashMap();
        f27119h = hashMap;
        hashMap.put(C25239c.class, new C9613b());
        hashMap.put(C25240d.class, new C9615d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NAME_PREFIX, new FieldMetaData("namePrefix", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.GIVEN_NAME, new FieldMetaData("givenName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MIDDLE_NAME, new FieldMetaData("middleName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FAMILY_NAME, new FieldMetaData("familyName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NAME_SUFFIX, new FieldMetaData("nameSuffix", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NICKNAME, new FieldMetaData("nickname", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27120i = unmodifiableMap;
        FieldMetaData.m61947a(MVApplePayPersonName.class, unmodifiableMap);
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
        ((C25238b) f27119h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27119h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29597a(MVApplePayPersonName mVApplePayPersonName) {
        if (mVApplePayPersonName == null) {
            return false;
        }
        boolean i = mo29604i();
        boolean i2 = mVApplePayPersonName.mo29604i();
        if ((i || i2) && (!i || !i2 || !this.namePrefix.equals(mVApplePayPersonName.namePrefix))) {
            return false;
        }
        boolean g = mo29601g();
        boolean g2 = mVApplePayPersonName.mo29601g();
        if ((g || g2) && (!g || !g2 || !this.givenName.equals(mVApplePayPersonName.givenName))) {
            return false;
        }
        boolean h = mo29602h();
        boolean h2 = mVApplePayPersonName.mo29602h();
        if ((h || h2) && (!h || !h2 || !this.middleName.equals(mVApplePayPersonName.middleName))) {
            return false;
        }
        boolean f = mo29600f();
        boolean f2 = mVApplePayPersonName.mo29600f();
        if ((f || f2) && (!f || !f2 || !this.familyName.equals(mVApplePayPersonName.familyName))) {
            return false;
        }
        boolean j = mo29605j();
        boolean j2 = mVApplePayPersonName.mo29605j();
        if ((j || j2) && (!j || !j2 || !this.nameSuffix.equals(mVApplePayPersonName.nameSuffix))) {
            return false;
        }
        boolean k = mo29606k();
        boolean k2 = mVApplePayPersonName.mo29606k();
        if (!k && !k2) {
            return true;
        }
        if (!k || !k2 || !this.nickname.equals(mVApplePayPersonName.nickname)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVApplePayPersonName mVApplePayPersonName = (MVApplePayPersonName) obj;
        if (!getClass().equals(mVApplePayPersonName.getClass())) {
            return getClass().getName().compareTo(mVApplePayPersonName.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29604i()).compareTo(Boolean.valueOf(mVApplePayPersonName.mo29604i()));
        if (compareTo2 != 0 || ((mo29604i() && (compareTo2 = this.namePrefix.compareTo(mVApplePayPersonName.namePrefix)) != 0) || (compareTo2 = Boolean.valueOf(mo29601g()).compareTo(Boolean.valueOf(mVApplePayPersonName.mo29601g()))) != 0 || ((mo29601g() && (compareTo2 = this.givenName.compareTo(mVApplePayPersonName.givenName)) != 0) || (compareTo2 = Boolean.valueOf(mo29602h()).compareTo(Boolean.valueOf(mVApplePayPersonName.mo29602h()))) != 0 || ((mo29602h() && (compareTo2 = this.middleName.compareTo(mVApplePayPersonName.middleName)) != 0) || (compareTo2 = Boolean.valueOf(mo29600f()).compareTo(Boolean.valueOf(mVApplePayPersonName.mo29600f()))) != 0 || ((mo29600f() && (compareTo2 = this.familyName.compareTo(mVApplePayPersonName.familyName)) != 0) || (compareTo2 = Boolean.valueOf(mo29605j()).compareTo(Boolean.valueOf(mVApplePayPersonName.mo29605j()))) != 0 || ((mo29605j() && (compareTo2 = this.nameSuffix.compareTo(mVApplePayPersonName.nameSuffix)) != 0) || (compareTo2 = Boolean.valueOf(mo29606k()).compareTo(Boolean.valueOf(mVApplePayPersonName.mo29606k()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo29606k() || (compareTo = this.nickname.compareTo(mVApplePayPersonName.nickname)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVApplePayPersonName)) {
            return mo29597a((MVApplePayPersonName) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29600f() {
        return this.familyName != null;
    }

    /* renamed from: g */
    public final boolean mo29601g() {
        return this.givenName != null;
    }

    /* renamed from: h */
    public final boolean mo29602h() {
        return this.middleName != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29604i() {
        return this.namePrefix != null;
    }

    /* renamed from: j */
    public final boolean mo29605j() {
        return this.nameSuffix != null;
    }

    /* renamed from: k */
    public final boolean mo29606k() {
        return this.nickname != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVApplePayPersonName(");
        boolean z2 = false;
        if (mo29604i()) {
            sb.append("namePrefix:");
            String str = this.namePrefix;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29601g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("givenName:");
            String str2 = this.givenName;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (mo29602h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("middleName:");
            String str3 = this.middleName;
            if (str3 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (mo29600f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("familyName:");
            String str4 = this.familyName;
            if (str4 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str4);
            }
            z = false;
        }
        if (mo29605j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("nameSuffix:");
            String str5 = this.nameSuffix;
            if (str5 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str5);
            }
        } else {
            z2 = z;
        }
        if (mo29606k()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("nickname:");
            String str6 = this.nickname;
            if (str6 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str6);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
