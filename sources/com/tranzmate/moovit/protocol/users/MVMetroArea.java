package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVMetroArea implements TBase<MVMetroArea, _Fields>, Serializable, Cloneable, Comparable<MVMetroArea> {

    /* renamed from: b */
    public static final C25113c f30472b = new C25113c("id", (byte) 6, 1);

    /* renamed from: c */
    public static final C25113c f30473c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30474d = new C25113c("keywords", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f30475e = new C25113c("metroClass", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f30476f = new C25113c("isSingleMetroCountry", (byte) 2, 5);

    /* renamed from: g */
    public static final HashMap f30477g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f30478h;
    private byte __isset_bitfield = 0;

    /* renamed from: id */
    public short f30479id;
    public boolean isSingleMetroCountry;
    public List<String> keywords;
    public String metroClass;
    public String name;
    private _Fields[] optionals = {_Fields.KEYWORDS, _Fields.METRO_CLASS, _Fields.IS_SINGLE_METRO_COUNTRY};

    public enum _Fields implements C25085c {
        ID(1, "id"),
        NAME(2, "name"),
        KEYWORDS(3, "keywords"),
        METRO_CLASS(4, "metroClass"),
        IS_SINGLE_METRO_COUNTRY(5, "isSingleMetroCountry");
        
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
                return ID;
            }
            if (i == 2) {
                return NAME;
            }
            if (i == 3) {
                return KEYWORDS;
            }
            if (i == 4) {
                return METRO_CLASS;
            }
            if (i != 5) {
                return null;
            }
            return IS_SINGLE_METRO_COUNTRY;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVMetroArea$a */
    public static class C11857a extends C25239c<MVMetroArea> {
        public C11857a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroArea mVMetroArea = (MVMetroArea) tBase;
            mVMetroArea.getClass();
            C25113c cVar = MVMetroArea.f30472b;
            gVar.mo61687K();
            gVar.mo61711x(MVMetroArea.f30472b);
            gVar.mo61677A(mVMetroArea.f30479id);
            gVar.mo61712y();
            if (mVMetroArea.name != null) {
                gVar.mo61711x(MVMetroArea.f30473c);
                gVar.mo61686J(mVMetroArea.name);
                gVar.mo61712y();
            }
            if (mVMetroArea.keywords != null && mVMetroArea.mo35233h()) {
                gVar.mo61711x(MVMetroArea.f30474d);
                gVar.mo61680D(new C25119e((byte) 11, mVMetroArea.keywords.size()));
                for (String J : mVMetroArea.keywords) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMetroArea.metroClass != null && mVMetroArea.mo35235i()) {
                gVar.mo61711x(MVMetroArea.f30475e);
                gVar.mo61686J(mVMetroArea.metroClass);
                gVar.mo61712y();
            }
            if (mVMetroArea.mo35232g()) {
                gVar.mo61711x(MVMetroArea.f30476f);
                gVar.mo61708u(mVMetroArea.isSingleMetroCountry);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroArea mVMetroArea = (MVMetroArea) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMetroArea.getClass();
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
                                    mVMetroArea.isSingleMetroCountry = gVar.mo61690c();
                                    mVMetroArea.mo35238l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVMetroArea.metroClass = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVMetroArea.keywords = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVMetroArea.keywords.add(gVar.mo61704q());
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMetroArea.name = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 6) {
                    mVMetroArea.f30479id = gVar.mo61695h();
                    mVMetroArea.mo35237k(true);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVMetroArea$b */
    public static class C11858b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11857a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVMetroArea$c */
    public static class C11859c extends C25240d<MVMetroArea> {
        public C11859c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroArea mVMetroArea = (MVMetroArea) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMetroArea.mo35231f()) {
                bitSet.set(0);
            }
            if (mVMetroArea.mo35236j()) {
                bitSet.set(1);
            }
            if (mVMetroArea.mo35233h()) {
                bitSet.set(2);
            }
            if (mVMetroArea.mo35235i()) {
                bitSet.set(3);
            }
            if (mVMetroArea.mo35232g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVMetroArea.mo35231f()) {
                jVar.mo61677A(mVMetroArea.f30479id);
            }
            if (mVMetroArea.mo35236j()) {
                jVar.mo61686J(mVMetroArea.name);
            }
            if (mVMetroArea.mo35233h()) {
                jVar.mo61678B(mVMetroArea.keywords.size());
                for (String J : mVMetroArea.keywords) {
                    jVar.mo61686J(J);
                }
            }
            if (mVMetroArea.mo35235i()) {
                jVar.mo61686J(mVMetroArea.metroClass);
            }
            if (mVMetroArea.mo35232g()) {
                jVar.mo61708u(mVMetroArea.isSingleMetroCountry);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroArea mVMetroArea = (MVMetroArea) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVMetroArea.f30479id = jVar.mo61695h();
                mVMetroArea.mo35237k(true);
            }
            if (T.get(1)) {
                mVMetroArea.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVMetroArea.keywords = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVMetroArea.keywords.add(jVar.mo61704q());
                }
            }
            if (T.get(3)) {
                mVMetroArea.metroClass = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVMetroArea.isSingleMetroCountry = jVar.mo61690c();
                mVMetroArea.mo35238l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVMetroArea$d */
    public static class C11860d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11859c(0);
        }
    }

    static {
        new C17394d0("MVMetroArea");
        HashMap hashMap = new HashMap();
        f30477g = hashMap;
        hashMap.put(C25239c.class, new C11858b());
        hashMap.put(C25240d.class, new C11860d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.KEYWORDS, new FieldMetaData("keywords", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.METRO_CLASS, new FieldMetaData("metroClass", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_SINGLE_METRO_COUNTRY, new FieldMetaData("isSingleMetroCountry", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30478h = unmodifiableMap;
        FieldMetaData.m61947a(MVMetroArea.class, unmodifiableMap);
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
        ((C25238b) f30477g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30477g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVMetroArea mVMetroArea = (MVMetroArea) obj;
        if (!getClass().equals(mVMetroArea.getClass())) {
            return getClass().getName().compareTo(mVMetroArea.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35231f()).compareTo(Boolean.valueOf(mVMetroArea.mo35231f()));
        if (compareTo != 0 || ((mo35231f() && (compareTo = C25082a.m62847k(this.f30479id, mVMetroArea.f30479id)) != 0) || (compareTo = Boolean.valueOf(mo35236j()).compareTo(Boolean.valueOf(mVMetroArea.mo35236j()))) != 0 || ((mo35236j() && (compareTo = this.name.compareTo(mVMetroArea.name)) != 0) || (compareTo = Boolean.valueOf(mo35233h()).compareTo(Boolean.valueOf(mVMetroArea.mo35233h()))) != 0 || ((mo35233h() && (compareTo = C25082a.m62844h(this.keywords, mVMetroArea.keywords)) != 0) || (compareTo = Boolean.valueOf(mo35235i()).compareTo(Boolean.valueOf(mVMetroArea.mo35235i()))) != 0 || ((mo35235i() && (compareTo = this.metroClass.compareTo(mVMetroArea.metroClass)) != 0) || (compareTo = Boolean.valueOf(mo35232g()).compareTo(Boolean.valueOf(mVMetroArea.mo35232g()))) != 0))))) {
            return compareTo;
        }
        if (!mo35232g() || (l = C25082a.m62848l(this.isSingleMetroCountry, mVMetroArea.isSingleMetroCountry)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMetroArea)) {
            return false;
        }
        MVMetroArea mVMetroArea = (MVMetroArea) obj;
        if (this.f30479id != mVMetroArea.f30479id) {
            return false;
        }
        boolean j = mo35236j();
        boolean j2 = mVMetroArea.mo35236j();
        if ((j || j2) && (!j || !j2 || !this.name.equals(mVMetroArea.name))) {
            return false;
        }
        boolean h = mo35233h();
        boolean h2 = mVMetroArea.mo35233h();
        if ((h || h2) && (!h || !h2 || !this.keywords.equals(mVMetroArea.keywords))) {
            return false;
        }
        boolean i = mo35235i();
        boolean i2 = mVMetroArea.mo35235i();
        if ((i || i2) && (!i || !i2 || !this.metroClass.equals(mVMetroArea.metroClass))) {
            return false;
        }
        boolean g = mo35232g();
        boolean g2 = mVMetroArea.mo35232g();
        if ((g || g2) && (!g || !g2 || this.isSingleMetroCountry != mVMetroArea.isSingleMetroCountry)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35231f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo35232g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo35233h() {
        return this.keywords != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35235i() {
        return this.metroClass != null;
    }

    /* renamed from: j */
    public final boolean mo35236j() {
        return this.name != null;
    }

    /* renamed from: k */
    public final void mo35237k(boolean z) {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo35238l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMetroArea(", "id:");
        C0016g.m42z(n, this.f30479id, ", ", "name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo35233h()) {
            n.append(", ");
            n.append("keywords:");
            List<String> list = this.keywords;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo35235i()) {
            n.append(", ");
            n.append("metroClass:");
            String str2 = this.metroClass;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo35232g()) {
            n.append(", ");
            n.append("isSingleMetroCountry:");
            n.append(this.isSingleMetroCountry);
        }
        n.append(")");
        return n.toString();
    }
}
