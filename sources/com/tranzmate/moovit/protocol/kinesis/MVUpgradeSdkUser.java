package com.tranzmate.moovit.protocol.kinesis;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.users.MVLocale;
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

public class MVUpgradeSdkUser implements TBase<MVUpgradeSdkUser, _Fields>, Serializable, Cloneable, Comparable<MVUpgradeSdkUser> {

    /* renamed from: b */
    public static final C25113c f26096b = new C25113c("clientVersion", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26097c = new C25113c("sdkVersion", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26098d = new C25113c("locale", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f26099e = new C25113c("osVersion", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f26100f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26101g;
    public String clientVersion;
    public MVLocale locale;
    private _Fields[] optionals = {_Fields.CLIENT_VERSION, _Fields.SDK_VERSION, _Fields.LOCALE, _Fields.OS_VERSION};
    public String osVersion;
    public String sdkVersion;

    public enum _Fields implements C25085c {
        CLIENT_VERSION(1, "clientVersion"),
        SDK_VERSION(2, "sdkVersion"),
        LOCALE(3, "locale"),
        OS_VERSION(4, "osVersion");
        
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
                return CLIENT_VERSION;
            }
            if (i == 2) {
                return SDK_VERSION;
            }
            if (i == 3) {
                return LOCALE;
            }
            if (i != 4) {
                return null;
            }
            return OS_VERSION;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVUpgradeSdkUser$a */
    public static class C8956a extends C25239c<MVUpgradeSdkUser> {
        public C8956a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpgradeSdkUser mVUpgradeSdkUser = (MVUpgradeSdkUser) tBase;
            MVLocale mVLocale = mVUpgradeSdkUser.locale;
            C25113c cVar = MVUpgradeSdkUser.f26096b;
            gVar.mo61687K();
            if (mVUpgradeSdkUser.clientVersion != null && mVUpgradeSdkUser.mo27945f()) {
                gVar.mo61711x(MVUpgradeSdkUser.f26096b);
                gVar.mo61686J(mVUpgradeSdkUser.clientVersion);
                gVar.mo61712y();
            }
            if (mVUpgradeSdkUser.sdkVersion != null && mVUpgradeSdkUser.mo27949i()) {
                gVar.mo61711x(MVUpgradeSdkUser.f26097c);
                gVar.mo61686J(mVUpgradeSdkUser.sdkVersion);
                gVar.mo61712y();
            }
            if (mVUpgradeSdkUser.locale != null && mVUpgradeSdkUser.mo27946g()) {
                gVar.mo61711x(MVUpgradeSdkUser.f26098d);
                mVUpgradeSdkUser.locale.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVUpgradeSdkUser.osVersion != null && mVUpgradeSdkUser.mo27947h()) {
                gVar.mo61711x(MVUpgradeSdkUser.f26099e);
                gVar.mo61686J(mVUpgradeSdkUser.osVersion);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpgradeSdkUser mVUpgradeSdkUser = (MVUpgradeSdkUser) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLocale mVLocale = mVUpgradeSdkUser.locale;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVUpgradeSdkUser.osVersion = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVLocale mVLocale2 = new MVLocale();
                            mVUpgradeSdkUser.locale = mVLocale2;
                            mVLocale2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVUpgradeSdkUser.sdkVersion = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVUpgradeSdkUser.clientVersion = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVUpgradeSdkUser$b */
    public static class C8957b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8956a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVUpgradeSdkUser$c */
    public static class C8958c extends C25240d<MVUpgradeSdkUser> {
        public C8958c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpgradeSdkUser mVUpgradeSdkUser = (MVUpgradeSdkUser) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUpgradeSdkUser.mo27945f()) {
                bitSet.set(0);
            }
            if (mVUpgradeSdkUser.mo27949i()) {
                bitSet.set(1);
            }
            if (mVUpgradeSdkUser.mo27946g()) {
                bitSet.set(2);
            }
            if (mVUpgradeSdkUser.mo27947h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVUpgradeSdkUser.mo27945f()) {
                jVar.mo61686J(mVUpgradeSdkUser.clientVersion);
            }
            if (mVUpgradeSdkUser.mo27949i()) {
                jVar.mo61686J(mVUpgradeSdkUser.sdkVersion);
            }
            if (mVUpgradeSdkUser.mo27946g()) {
                mVUpgradeSdkUser.locale.mo25202X0(jVar);
            }
            if (mVUpgradeSdkUser.mo27947h()) {
                jVar.mo61686J(mVUpgradeSdkUser.osVersion);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpgradeSdkUser mVUpgradeSdkUser = (MVUpgradeSdkUser) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVUpgradeSdkUser.clientVersion = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVUpgradeSdkUser.sdkVersion = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVLocale mVLocale = new MVLocale();
                mVUpgradeSdkUser.locale = mVLocale;
                mVLocale.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVUpgradeSdkUser.osVersion = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVUpgradeSdkUser$d */
    public static class C8959d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8958c(0);
        }
    }

    static {
        new C17394d0("MVUpgradeSdkUser");
        HashMap hashMap = new HashMap();
        f26100f = hashMap;
        hashMap.put(C25239c.class, new C8957b());
        hashMap.put(C25240d.class, new C8959d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CLIENT_VERSION, new FieldMetaData("clientVersion", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SDK_VERSION, new FieldMetaData("sdkVersion", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOCALE, new FieldMetaData("locale", (byte) 2, new StructMetaData(MVLocale.class)));
        enumMap.put(_Fields.OS_VERSION, new FieldMetaData("osVersion", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26101g = unmodifiableMap;
        FieldMetaData.m61947a(MVUpgradeSdkUser.class, unmodifiableMap);
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
        ((C25238b) f26100f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26100f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUpgradeSdkUser mVUpgradeSdkUser = (MVUpgradeSdkUser) obj;
        if (!getClass().equals(mVUpgradeSdkUser.getClass())) {
            return getClass().getName().compareTo(mVUpgradeSdkUser.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27945f()).compareTo(Boolean.valueOf(mVUpgradeSdkUser.mo27945f()));
        if (compareTo2 != 0 || ((mo27945f() && (compareTo2 = this.clientVersion.compareTo(mVUpgradeSdkUser.clientVersion)) != 0) || (compareTo2 = Boolean.valueOf(mo27949i()).compareTo(Boolean.valueOf(mVUpgradeSdkUser.mo27949i()))) != 0 || ((mo27949i() && (compareTo2 = this.sdkVersion.compareTo(mVUpgradeSdkUser.sdkVersion)) != 0) || (compareTo2 = Boolean.valueOf(mo27946g()).compareTo(Boolean.valueOf(mVUpgradeSdkUser.mo27946g()))) != 0 || ((mo27946g() && (compareTo2 = this.locale.compareTo(mVUpgradeSdkUser.locale)) != 0) || (compareTo2 = Boolean.valueOf(mo27947h()).compareTo(Boolean.valueOf(mVUpgradeSdkUser.mo27947h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo27947h() || (compareTo = this.osVersion.compareTo(mVUpgradeSdkUser.osVersion)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUpgradeSdkUser)) {
            return false;
        }
        MVUpgradeSdkUser mVUpgradeSdkUser = (MVUpgradeSdkUser) obj;
        boolean f = mo27945f();
        boolean f2 = mVUpgradeSdkUser.mo27945f();
        if ((f || f2) && (!f || !f2 || !this.clientVersion.equals(mVUpgradeSdkUser.clientVersion))) {
            return false;
        }
        boolean i = mo27949i();
        boolean i2 = mVUpgradeSdkUser.mo27949i();
        if ((i || i2) && (!i || !i2 || !this.sdkVersion.equals(mVUpgradeSdkUser.sdkVersion))) {
            return false;
        }
        boolean g = mo27946g();
        boolean g2 = mVUpgradeSdkUser.mo27946g();
        if ((g || g2) && (!g || !g2 || !this.locale.mo35206a(mVUpgradeSdkUser.locale))) {
            return false;
        }
        boolean h = mo27947h();
        boolean h2 = mVUpgradeSdkUser.mo27947h();
        if ((h || h2) && (!h || !h2 || !this.osVersion.equals(mVUpgradeSdkUser.osVersion))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27945f() {
        return this.clientVersion != null;
    }

    /* renamed from: g */
    public final boolean mo27946g() {
        return this.locale != null;
    }

    /* renamed from: h */
    public final boolean mo27947h() {
        return this.osVersion != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27949i() {
        return this.sdkVersion != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVUpgradeSdkUser(");
        boolean z2 = false;
        if (mo27945f()) {
            sb.append("clientVersion:");
            String str = this.clientVersion;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo27949i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("sdkVersion:");
            String str2 = this.sdkVersion;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (mo27946g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("locale:");
            MVLocale mVLocale = this.locale;
            if (mVLocale == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVLocale);
            }
        } else {
            z2 = z;
        }
        if (mo27947h()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("osVersion:");
            String str3 = this.osVersion;
            if (str3 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str3);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
