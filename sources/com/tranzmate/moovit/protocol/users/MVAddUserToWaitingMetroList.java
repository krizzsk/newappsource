package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVAddUserToWaitingMetroList implements TBase<MVAddUserToWaitingMetroList, _Fields>, Serializable, Cloneable, Comparable<MVAddUserToWaitingMetroList> {

    /* renamed from: b */
    public static final C25113c f30306b = new C25113c("phoneOsType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30307c = new C25113c("userLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f30308d = new C25113c("email", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30309e = new C25113c("locale", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f30310f = new C25113c("volunteer", (byte) 2, 5);

    /* renamed from: g */
    public static final HashMap f30311g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f30312h;
    private byte __isset_bitfield = 0;
    public String email;
    public MVLocale locale;
    public MVPhoneOsTypes phoneOsType;
    public MVLatLon userLocation;
    public boolean volunteer;

    public enum _Fields implements C25085c {
        PHONE_OS_TYPE(1, "phoneOsType"),
        USER_LOCATION(2, "userLocation"),
        EMAIL(3, "email"),
        LOCALE(4, "locale"),
        VOLUNTEER(5, "volunteer");
        
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
                return PHONE_OS_TYPE;
            }
            if (i == 2) {
                return USER_LOCATION;
            }
            if (i == 3) {
                return EMAIL;
            }
            if (i == 4) {
                return LOCALE;
            }
            if (i != 5) {
                return null;
            }
            return VOLUNTEER;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVAddUserToWaitingMetroList$a */
    public static class C11747a extends C25239c<MVAddUserToWaitingMetroList> {
        public C11747a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddUserToWaitingMetroList mVAddUserToWaitingMetroList = (MVAddUserToWaitingMetroList) tBase;
            MVLatLon mVLatLon = mVAddUserToWaitingMetroList.userLocation;
            C25113c cVar = MVAddUserToWaitingMetroList.f30306b;
            gVar.mo61687K();
            if (mVAddUserToWaitingMetroList.phoneOsType != null) {
                gVar.mo61711x(MVAddUserToWaitingMetroList.f30306b);
                gVar.mo61678B(mVAddUserToWaitingMetroList.phoneOsType.getValue());
                gVar.mo61712y();
            }
            if (mVAddUserToWaitingMetroList.userLocation != null) {
                gVar.mo61711x(MVAddUserToWaitingMetroList.f30307c);
                mVAddUserToWaitingMetroList.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAddUserToWaitingMetroList.email != null) {
                gVar.mo61711x(MVAddUserToWaitingMetroList.f30308d);
                gVar.mo61686J(mVAddUserToWaitingMetroList.email);
                gVar.mo61712y();
            }
            if (mVAddUserToWaitingMetroList.locale != null) {
                gVar.mo61711x(MVAddUserToWaitingMetroList.f30309e);
                mVAddUserToWaitingMetroList.locale.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVAddUserToWaitingMetroList.f30310f);
            C0017h.m62S(gVar, mVAddUserToWaitingMetroList.volunteer);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddUserToWaitingMetroList mVAddUserToWaitingMetroList = (MVAddUserToWaitingMetroList) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVAddUserToWaitingMetroList.userLocation;
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
                                    mVAddUserToWaitingMetroList.volunteer = gVar.mo61690c();
                                    mVAddUserToWaitingMetroList.mo34965k();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVLocale mVLocale = new MVLocale();
                                mVAddUserToWaitingMetroList.locale = mVLocale;
                                mVLocale.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVAddUserToWaitingMetroList.email = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVLatLon mVLatLon2 = new MVLatLon();
                        mVAddUserToWaitingMetroList.userLocation = mVLatLon2;
                        mVLatLon2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVAddUserToWaitingMetroList.phoneOsType = MVPhoneOsTypes.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVAddUserToWaitingMetroList$b */
    public static class C11748b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11747a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVAddUserToWaitingMetroList$c */
    public static class C11749c extends C25240d<MVAddUserToWaitingMetroList> {
        public C11749c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddUserToWaitingMetroList mVAddUserToWaitingMetroList = (MVAddUserToWaitingMetroList) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAddUserToWaitingMetroList.mo34961h()) {
                bitSet.set(0);
            }
            if (mVAddUserToWaitingMetroList.mo34963i()) {
                bitSet.set(1);
            }
            if (mVAddUserToWaitingMetroList.mo34959f()) {
                bitSet.set(2);
            }
            if (mVAddUserToWaitingMetroList.mo34960g()) {
                bitSet.set(3);
            }
            if (mVAddUserToWaitingMetroList.mo34964j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVAddUserToWaitingMetroList.mo34961h()) {
                jVar.mo61678B(mVAddUserToWaitingMetroList.phoneOsType.getValue());
            }
            if (mVAddUserToWaitingMetroList.mo34963i()) {
                mVAddUserToWaitingMetroList.userLocation.mo25202X0(jVar);
            }
            if (mVAddUserToWaitingMetroList.mo34959f()) {
                jVar.mo61686J(mVAddUserToWaitingMetroList.email);
            }
            if (mVAddUserToWaitingMetroList.mo34960g()) {
                mVAddUserToWaitingMetroList.locale.mo25202X0(jVar);
            }
            if (mVAddUserToWaitingMetroList.mo34964j()) {
                jVar.mo61708u(mVAddUserToWaitingMetroList.volunteer);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddUserToWaitingMetroList mVAddUserToWaitingMetroList = (MVAddUserToWaitingMetroList) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVAddUserToWaitingMetroList.phoneOsType = MVPhoneOsTypes.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVAddUserToWaitingMetroList.userLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVAddUserToWaitingMetroList.email = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVLocale mVLocale = new MVLocale();
                mVAddUserToWaitingMetroList.locale = mVLocale;
                mVLocale.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVAddUserToWaitingMetroList.volunteer = jVar.mo61690c();
                mVAddUserToWaitingMetroList.mo34965k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVAddUserToWaitingMetroList$d */
    public static class C11750d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11749c(0);
        }
    }

    static {
        new C17394d0("MVAddUserToWaitingMetroList");
        HashMap hashMap = new HashMap();
        f30311g = hashMap;
        hashMap.put(C25239c.class, new C11748b());
        hashMap.put(C25240d.class, new C11750d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PHONE_OS_TYPE, new FieldMetaData("phoneOsType", (byte) 3, new EnumMetaData(MVPhoneOsTypes.class)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.EMAIL, new FieldMetaData("email", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOCALE, new FieldMetaData("locale", (byte) 3, new StructMetaData(MVLocale.class)));
        enumMap.put(_Fields.VOLUNTEER, new FieldMetaData("volunteer", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30312h = unmodifiableMap;
        FieldMetaData.m61947a(MVAddUserToWaitingMetroList.class, unmodifiableMap);
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
        ((C25238b) f30311g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30311g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVAddUserToWaitingMetroList mVAddUserToWaitingMetroList = (MVAddUserToWaitingMetroList) obj;
        if (!getClass().equals(mVAddUserToWaitingMetroList.getClass())) {
            return getClass().getName().compareTo(mVAddUserToWaitingMetroList.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34961h()).compareTo(Boolean.valueOf(mVAddUserToWaitingMetroList.mo34961h()));
        if (compareTo != 0 || ((mo34961h() && (compareTo = this.phoneOsType.compareTo(mVAddUserToWaitingMetroList.phoneOsType)) != 0) || (compareTo = Boolean.valueOf(mo34963i()).compareTo(Boolean.valueOf(mVAddUserToWaitingMetroList.mo34963i()))) != 0 || ((mo34963i() && (compareTo = this.userLocation.compareTo(mVAddUserToWaitingMetroList.userLocation)) != 0) || (compareTo = Boolean.valueOf(mo34959f()).compareTo(Boolean.valueOf(mVAddUserToWaitingMetroList.mo34959f()))) != 0 || ((mo34959f() && (compareTo = this.email.compareTo(mVAddUserToWaitingMetroList.email)) != 0) || (compareTo = Boolean.valueOf(mo34960g()).compareTo(Boolean.valueOf(mVAddUserToWaitingMetroList.mo34960g()))) != 0 || ((mo34960g() && (compareTo = this.locale.compareTo(mVAddUserToWaitingMetroList.locale)) != 0) || (compareTo = Boolean.valueOf(mo34964j()).compareTo(Boolean.valueOf(mVAddUserToWaitingMetroList.mo34964j()))) != 0))))) {
            return compareTo;
        }
        if (!mo34964j() || (l = C25082a.m62848l(this.volunteer, mVAddUserToWaitingMetroList.volunteer)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAddUserToWaitingMetroList)) {
            return false;
        }
        MVAddUserToWaitingMetroList mVAddUserToWaitingMetroList = (MVAddUserToWaitingMetroList) obj;
        boolean h = mo34961h();
        boolean h2 = mVAddUserToWaitingMetroList.mo34961h();
        if ((h || h2) && (!h || !h2 || !this.phoneOsType.equals(mVAddUserToWaitingMetroList.phoneOsType))) {
            return false;
        }
        boolean i = mo34963i();
        boolean i2 = mVAddUserToWaitingMetroList.mo34963i();
        if ((i || i2) && (!i || !i2 || !this.userLocation.mo26290a(mVAddUserToWaitingMetroList.userLocation))) {
            return false;
        }
        boolean f = mo34959f();
        boolean f2 = mVAddUserToWaitingMetroList.mo34959f();
        if ((f || f2) && (!f || !f2 || !this.email.equals(mVAddUserToWaitingMetroList.email))) {
            return false;
        }
        boolean g = mo34960g();
        boolean g2 = mVAddUserToWaitingMetroList.mo34960g();
        if (((g || g2) && (!g || !g2 || !this.locale.mo35206a(mVAddUserToWaitingMetroList.locale))) || this.volunteer != mVAddUserToWaitingMetroList.volunteer) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34959f() {
        return this.email != null;
    }

    /* renamed from: g */
    public final boolean mo34960g() {
        return this.locale != null;
    }

    /* renamed from: h */
    public final boolean mo34961h() {
        return this.phoneOsType != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34963i() {
        return this.userLocation != null;
    }

    /* renamed from: j */
    public final boolean mo34964j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo34965k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAddUserToWaitingMetroList(", "phoneOsType:");
        MVPhoneOsTypes mVPhoneOsTypes = this.phoneOsType;
        if (mVPhoneOsTypes == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPhoneOsTypes);
        }
        n.append(", ");
        n.append("userLocation:");
        MVLatLon mVLatLon = this.userLocation;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("email:");
        String str = this.email;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("locale:");
        MVLocale mVLocale = this.locale;
        if (mVLocale == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocale);
        }
        n.append(", ");
        n.append("volunteer:");
        return C25541a.m63885p(n, this.volunteer, ")");
    }
}
