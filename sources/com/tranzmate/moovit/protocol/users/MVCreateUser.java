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

public class MVCreateUser implements TBase<MVCreateUser, _Fields>, Serializable, Cloneable, Comparable<MVCreateUser> {

    /* renamed from: b */
    public static final C25113c f30351b = new C25113c("userKey", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30352c = new C25113c("langId", (byte) 6, 2);

    /* renamed from: d */
    public static final C25113c f30353d = new C25113c("currentMetroAreaId", (byte) 6, 3);

    /* renamed from: e */
    public static final C25113c f30354e = new C25113c("isReinstall", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f30355f = new C25113c("percentage", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f30356g = new C25113c("firstUserKey", (byte) 11, 6);

    /* renamed from: h */
    public static final HashMap f30357h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f30358i;
    private byte __isset_bitfield = 0;
    public short currentMetroAreaId;
    public String firstUserKey;
    public boolean isReinstall;
    public short langId;
    private _Fields[] optionals = {_Fields.IS_REINSTALL, _Fields.FIRST_USER_KEY};
    public int percentage;
    public String userKey;

    public enum _Fields implements C25085c {
        USER_KEY(1, "userKey"),
        LANG_ID(2, "langId"),
        CURRENT_METRO_AREA_ID(3, "currentMetroAreaId"),
        IS_REINSTALL(4, "isReinstall"),
        PERCENTAGE(5, "percentage"),
        FIRST_USER_KEY(6, "firstUserKey");
        
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
                    return USER_KEY;
                case 2:
                    return LANG_ID;
                case 3:
                    return CURRENT_METRO_AREA_ID;
                case 4:
                    return IS_REINSTALL;
                case 5:
                    return PERCENTAGE;
                case 6:
                    return FIRST_USER_KEY;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCreateUser$a */
    public static class C11779a extends C25239c<MVCreateUser> {
        public C11779a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreateUser mVCreateUser = (MVCreateUser) tBase;
            mVCreateUser.getClass();
            C25113c cVar = MVCreateUser.f30351b;
            gVar.mo61687K();
            if (mVCreateUser.userKey != null) {
                gVar.mo61711x(MVCreateUser.f30351b);
                gVar.mo61686J(mVCreateUser.userKey);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCreateUser.f30352c);
            gVar.mo61677A(mVCreateUser.langId);
            gVar.mo61712y();
            gVar.mo61711x(MVCreateUser.f30353d);
            gVar.mo61677A(mVCreateUser.currentMetroAreaId);
            gVar.mo61712y();
            if (mVCreateUser.mo35042h()) {
                gVar.mo61711x(MVCreateUser.f30354e);
                gVar.mo61708u(mVCreateUser.isReinstall);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCreateUser.f30355f);
            gVar.mo61678B(mVCreateUser.percentage);
            gVar.mo61712y();
            if (mVCreateUser.firstUserKey != null && mVCreateUser.mo35041g()) {
                gVar.mo61711x(MVCreateUser.f30356g);
                gVar.mo61686J(mVCreateUser.firstUserKey);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreateUser mVCreateUser = (MVCreateUser) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCreateUser.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUser.userKey = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 6) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUser.langId = gVar.mo61695h();
                            mVCreateUser.mo35049o();
                            break;
                        }
                    case 3:
                        if (b != 6) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUser.currentMetroAreaId = gVar.mo61695h();
                            mVCreateUser.mo35047l();
                            break;
                        }
                    case 4:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUser.isReinstall = gVar.mo61690c();
                            mVCreateUser.mo35048m();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUser.percentage = gVar.mo61696i();
                            mVCreateUser.mo35050p();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCreateUser.firstUserKey = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCreateUser$b */
    public static class C11780b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11779a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCreateUser$c */
    public static class C11781c extends C25240d<MVCreateUser> {
        public C11781c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreateUser mVCreateUser = (MVCreateUser) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCreateUser.mo35046k()) {
                bitSet.set(0);
            }
            if (mVCreateUser.mo35044i()) {
                bitSet.set(1);
            }
            if (mVCreateUser.mo35040f()) {
                bitSet.set(2);
            }
            if (mVCreateUser.mo35042h()) {
                bitSet.set(3);
            }
            if (mVCreateUser.mo35045j()) {
                bitSet.set(4);
            }
            if (mVCreateUser.mo35041g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVCreateUser.mo35046k()) {
                jVar.mo61686J(mVCreateUser.userKey);
            }
            if (mVCreateUser.mo35044i()) {
                jVar.mo61677A(mVCreateUser.langId);
            }
            if (mVCreateUser.mo35040f()) {
                jVar.mo61677A(mVCreateUser.currentMetroAreaId);
            }
            if (mVCreateUser.mo35042h()) {
                jVar.mo61708u(mVCreateUser.isReinstall);
            }
            if (mVCreateUser.mo35045j()) {
                jVar.mo61678B(mVCreateUser.percentage);
            }
            if (mVCreateUser.mo35041g()) {
                jVar.mo61686J(mVCreateUser.firstUserKey);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreateUser mVCreateUser = (MVCreateUser) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVCreateUser.userKey = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCreateUser.langId = jVar.mo61695h();
                mVCreateUser.mo35049o();
            }
            if (T.get(2)) {
                mVCreateUser.currentMetroAreaId = jVar.mo61695h();
                mVCreateUser.mo35047l();
            }
            if (T.get(3)) {
                mVCreateUser.isReinstall = jVar.mo61690c();
                mVCreateUser.mo35048m();
            }
            if (T.get(4)) {
                mVCreateUser.percentage = jVar.mo61696i();
                mVCreateUser.mo35050p();
            }
            if (T.get(5)) {
                mVCreateUser.firstUserKey = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCreateUser$d */
    public static class C11782d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11781c(0);
        }
    }

    static {
        new C17394d0("MVCreateUser");
        HashMap hashMap = new HashMap();
        f30357h = hashMap;
        hashMap.put(C25239c.class, new C11780b());
        hashMap.put(C25240d.class, new C11782d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.USER_KEY, new FieldMetaData("userKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LANG_ID, new FieldMetaData("langId", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.CURRENT_METRO_AREA_ID, new FieldMetaData("currentMetroAreaId", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.IS_REINSTALL, new FieldMetaData("isReinstall", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PERCENTAGE, new FieldMetaData("percentage", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FIRST_USER_KEY, new FieldMetaData("firstUserKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30358i = unmodifiableMap;
        FieldMetaData.m61947a(MVCreateUser.class, unmodifiableMap);
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
        ((C25238b) f30357h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30357h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCreateUser mVCreateUser = (MVCreateUser) obj;
        if (!getClass().equals(mVCreateUser.getClass())) {
            return getClass().getName().compareTo(mVCreateUser.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35046k()).compareTo(Boolean.valueOf(mVCreateUser.mo35046k()));
        if (compareTo2 != 0 || ((mo35046k() && (compareTo2 = this.userKey.compareTo(mVCreateUser.userKey)) != 0) || (compareTo2 = Boolean.valueOf(mo35044i()).compareTo(Boolean.valueOf(mVCreateUser.mo35044i()))) != 0 || ((mo35044i() && (compareTo2 = C25082a.m62847k(this.langId, mVCreateUser.langId)) != 0) || (compareTo2 = Boolean.valueOf(mo35040f()).compareTo(Boolean.valueOf(mVCreateUser.mo35040f()))) != 0 || ((mo35040f() && (compareTo2 = C25082a.m62847k(this.currentMetroAreaId, mVCreateUser.currentMetroAreaId)) != 0) || (compareTo2 = Boolean.valueOf(mo35042h()).compareTo(Boolean.valueOf(mVCreateUser.mo35042h()))) != 0 || ((mo35042h() && (compareTo2 = C25082a.m62848l(this.isReinstall, mVCreateUser.isReinstall)) != 0) || (compareTo2 = Boolean.valueOf(mo35045j()).compareTo(Boolean.valueOf(mVCreateUser.mo35045j()))) != 0 || ((mo35045j() && (compareTo2 = C25082a.m62839c(this.percentage, mVCreateUser.percentage)) != 0) || (compareTo2 = Boolean.valueOf(mo35041g()).compareTo(Boolean.valueOf(mVCreateUser.mo35041g()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo35041g() || (compareTo = this.firstUserKey.compareTo(mVCreateUser.firstUserKey)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCreateUser)) {
            return false;
        }
        MVCreateUser mVCreateUser = (MVCreateUser) obj;
        boolean k = mo35046k();
        boolean k2 = mVCreateUser.mo35046k();
        if (((k || k2) && (!k || !k2 || !this.userKey.equals(mVCreateUser.userKey))) || this.langId != mVCreateUser.langId || this.currentMetroAreaId != mVCreateUser.currentMetroAreaId) {
            return false;
        }
        boolean h = mo35042h();
        boolean h2 = mVCreateUser.mo35042h();
        if (((h || h2) && (!h || !h2 || this.isReinstall != mVCreateUser.isReinstall)) || this.percentage != mVCreateUser.percentage) {
            return false;
        }
        boolean g = mo35041g();
        boolean g2 = mVCreateUser.mo35041g();
        if ((g || g2) && (!g || !g2 || !this.firstUserKey.equals(mVCreateUser.firstUserKey))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35040f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo35041g() {
        return this.firstUserKey != null;
    }

    /* renamed from: h */
    public final boolean mo35042h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35044i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo35045j() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: k */
    public final boolean mo35046k() {
        return this.userKey != null;
    }

    /* renamed from: l */
    public final void mo35047l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo35048m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo35049o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: p */
    public final void mo35050p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCreateUser(", "userKey:");
        String str = this.userKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("langId:");
        C0016g.m42z(n, this.langId, ", ", "currentMetroAreaId:");
        n.append(this.currentMetroAreaId);
        if (mo35042h()) {
            n.append(", ");
            n.append("isReinstall:");
            n.append(this.isReinstall);
        }
        n.append(", ");
        n.append("percentage:");
        n.append(this.percentage);
        if (mo35041g()) {
            n.append(", ");
            n.append("firstUserKey:");
            String str2 = this.firstUserKey;
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
