package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVLocale implements TBase<MVLocale, _Fields>, Serializable, Cloneable, Comparable<MVLocale> {

    /* renamed from: b */
    public static final C25113c f30455b = new C25113c("language", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30456c = new C25113c(ServerParameters.COUNTRY, (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30457d = new C25113c("variant", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f30458e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30459f;
    public String country;
    public String language;
    private _Fields[] optionals = {_Fields.COUNTRY, _Fields.VARIANT};
    public String variant;

    public enum _Fields implements C25085c {
        LANGUAGE(1, "language"),
        COUNTRY(2, ServerParameters.COUNTRY),
        VARIANT(3, "variant");
        
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
                return LANGUAGE;
            }
            if (i == 2) {
                return COUNTRY;
            }
            if (i != 3) {
                return null;
            }
            return VARIANT;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVLocale$a */
    public static class C11848a extends C25239c<MVLocale> {
        public C11848a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocale mVLocale = (MVLocale) tBase;
            mVLocale.getClass();
            C25113c cVar = MVLocale.f30455b;
            gVar.mo61687K();
            if (mVLocale.language != null) {
                gVar.mo61711x(MVLocale.f30455b);
                gVar.mo61686J(mVLocale.language);
                gVar.mo61712y();
            }
            if (mVLocale.country != null && mVLocale.mo35209f()) {
                gVar.mo61711x(MVLocale.f30456c);
                gVar.mo61686J(mVLocale.country);
                gVar.mo61712y();
            }
            if (mVLocale.variant != null && mVLocale.mo35211h()) {
                gVar.mo61711x(MVLocale.f30457d);
                gVar.mo61686J(mVLocale.variant);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocale mVLocale = (MVLocale) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLocale.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVLocale.variant = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVLocale.country = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVLocale.language = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVLocale$b */
    public static class C11849b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11848a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVLocale$c */
    public static class C11850c extends C25240d<MVLocale> {
        public C11850c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocale mVLocale = (MVLocale) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLocale.mo35210g()) {
                bitSet.set(0);
            }
            if (mVLocale.mo35209f()) {
                bitSet.set(1);
            }
            if (mVLocale.mo35211h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVLocale.mo35210g()) {
                jVar.mo61686J(mVLocale.language);
            }
            if (mVLocale.mo35209f()) {
                jVar.mo61686J(mVLocale.country);
            }
            if (mVLocale.mo35211h()) {
                jVar.mo61686J(mVLocale.variant);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocale mVLocale = (MVLocale) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVLocale.language = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVLocale.country = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVLocale.variant = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVLocale$d */
    public static class C11851d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11850c(0);
        }
    }

    static {
        new C17394d0("MVLocale");
        HashMap hashMap = new HashMap();
        f30458e = hashMap;
        hashMap.put(C25239c.class, new C11849b());
        hashMap.put(C25240d.class, new C11851d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LANGUAGE, new FieldMetaData("language", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.COUNTRY, new FieldMetaData(ServerParameters.COUNTRY, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VARIANT, new FieldMetaData("variant", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30459f = unmodifiableMap;
        FieldMetaData.m61947a(MVLocale.class, unmodifiableMap);
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
        ((C25238b) f30458e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30458e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35206a(MVLocale mVLocale) {
        if (mVLocale == null) {
            return false;
        }
        boolean g = mo35210g();
        boolean g2 = mVLocale.mo35210g();
        if ((g || g2) && (!g || !g2 || !this.language.equals(mVLocale.language))) {
            return false;
        }
        boolean f = mo35209f();
        boolean f2 = mVLocale.mo35209f();
        if ((f || f2) && (!f || !f2 || !this.country.equals(mVLocale.country))) {
            return false;
        }
        boolean h = mo35211h();
        boolean h2 = mVLocale.mo35211h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.variant.equals(mVLocale.variant)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLocale mVLocale = (MVLocale) obj;
        if (!getClass().equals(mVLocale.getClass())) {
            return getClass().getName().compareTo(mVLocale.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35210g()).compareTo(Boolean.valueOf(mVLocale.mo35210g()));
        if (compareTo2 != 0 || ((mo35210g() && (compareTo2 = this.language.compareTo(mVLocale.language)) != 0) || (compareTo2 = Boolean.valueOf(mo35209f()).compareTo(Boolean.valueOf(mVLocale.mo35209f()))) != 0 || ((mo35209f() && (compareTo2 = this.country.compareTo(mVLocale.country)) != 0) || (compareTo2 = Boolean.valueOf(mo35211h()).compareTo(Boolean.valueOf(mVLocale.mo35211h()))) != 0))) {
            return compareTo2;
        }
        if (!mo35211h() || (compareTo = this.variant.compareTo(mVLocale.variant)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVLocale)) {
            return mo35206a((MVLocale) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35209f() {
        return this.country != null;
    }

    /* renamed from: g */
    public final boolean mo35210g() {
        return this.language != null;
    }

    /* renamed from: h */
    public final boolean mo35211h() {
        return this.variant != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLocale(", "language:");
        String str = this.language;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo35209f()) {
            n.append(", ");
            n.append("country:");
            String str2 = this.country;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo35211h()) {
            n.append(", ");
            n.append("variant:");
            String str3 = this.variant;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }
}
