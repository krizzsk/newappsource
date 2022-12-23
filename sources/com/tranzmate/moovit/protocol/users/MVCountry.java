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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVCountry implements TBase<MVCountry, _Fields>, Serializable, Cloneable, Comparable<MVCountry> {

    /* renamed from: b */
    public static final C25113c f30342b = new C25113c("id", (byte) 6, 1);

    /* renamed from: c */
    public static final C25113c f30343c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30344d = new C25113c("flag", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f30345e = new C25113c("metroAreas", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f30346f = new C25113c("keywords", (byte) 15, 5);

    /* renamed from: g */
    public static final HashMap f30347g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f30348h;
    private byte __isset_bitfield = 0;
    public int flag;

    /* renamed from: id */
    public short f30349id;
    public List<String> keywords;
    public List<MVMetroArea> metroAreas;
    public String name;
    private _Fields[] optionals = {_Fields.KEYWORDS};

    public enum _Fields implements C25085c {
        ID(1, "id"),
        NAME(2, "name"),
        FLAG(3, "flag"),
        METRO_AREAS(4, "metroAreas"),
        KEYWORDS(5, "keywords");
        
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
                return FLAG;
            }
            if (i == 4) {
                return METRO_AREAS;
            }
            if (i != 5) {
                return null;
            }
            return KEYWORDS;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCountry$a */
    public static class C11775a extends C25239c<MVCountry> {
        public C11775a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCountry mVCountry = (MVCountry) tBase;
            mVCountry.getClass();
            C25113c cVar = MVCountry.f30342b;
            gVar.mo61687K();
            gVar.mo61711x(MVCountry.f30342b);
            gVar.mo61677A(mVCountry.f30349id);
            gVar.mo61712y();
            if (mVCountry.name != null) {
                gVar.mo61711x(MVCountry.f30343c);
                gVar.mo61686J(mVCountry.name);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCountry.f30344d);
            gVar.mo61678B(mVCountry.flag);
            gVar.mo61712y();
            if (mVCountry.metroAreas != null) {
                gVar.mo61711x(MVCountry.f30345e);
                gVar.mo61680D(new C25119e((byte) 12, mVCountry.metroAreas.size()));
                for (MVMetroArea X0 : mVCountry.metroAreas) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVCountry.keywords != null && mVCountry.mo35030h()) {
                gVar.mo61711x(MVCountry.f30346f);
                gVar.mo61680D(new C25119e((byte) 11, mVCountry.keywords.size()));
                for (String J : mVCountry.keywords) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCountry mVCountry = (MVCountry) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCountry.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            int i = 0;
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 15) {
                                    C25119e k = gVar.mo61698k();
                                    mVCountry.keywords = new ArrayList(k.f63395b);
                                    while (i < k.f63395b) {
                                        mVCountry.keywords.add(gVar.mo61704q());
                                        i++;
                                    }
                                    gVar.mo61699l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 15) {
                                C25119e k2 = gVar.mo61698k();
                                mVCountry.metroAreas = new ArrayList(k2.f63395b);
                                while (i < k2.f63395b) {
                                    MVMetroArea mVMetroArea = new MVMetroArea();
                                    mVMetroArea.mo25201C1(gVar);
                                    mVCountry.metroAreas.add(mVMetroArea);
                                    i++;
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVCountry.flag = gVar.mo61696i();
                            mVCountry.mo35034k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVCountry.name = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 6) {
                    mVCountry.f30349id = gVar.mo61695h();
                    mVCountry.mo35035l(true);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCountry$b */
    public static class C11776b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11775a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCountry$c */
    public static class C11777c extends C25240d<MVCountry> {
        public C11777c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCountry mVCountry = (MVCountry) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCountry.mo35029g()) {
                bitSet.set(0);
            }
            if (mVCountry.mo35033j()) {
                bitSet.set(1);
            }
            if (mVCountry.mo35028f()) {
                bitSet.set(2);
            }
            if (mVCountry.mo35032i()) {
                bitSet.set(3);
            }
            if (mVCountry.mo35030h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVCountry.mo35029g()) {
                jVar.mo61677A(mVCountry.f30349id);
            }
            if (mVCountry.mo35033j()) {
                jVar.mo61686J(mVCountry.name);
            }
            if (mVCountry.mo35028f()) {
                jVar.mo61678B(mVCountry.flag);
            }
            if (mVCountry.mo35032i()) {
                jVar.mo61678B(mVCountry.metroAreas.size());
                for (MVMetroArea X0 : mVCountry.metroAreas) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVCountry.mo35030h()) {
                jVar.mo61678B(mVCountry.keywords.size());
                for (String J : mVCountry.keywords) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCountry mVCountry = (MVCountry) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVCountry.f30349id = jVar.mo61695h();
                mVCountry.mo35035l(true);
            }
            if (T.get(1)) {
                mVCountry.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVCountry.flag = jVar.mo61696i();
                mVCountry.mo35034k();
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVCountry.metroAreas = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVMetroArea mVMetroArea = new MVMetroArea();
                    mVMetroArea.mo25201C1(jVar);
                    mVCountry.metroAreas.add(mVMetroArea);
                }
            }
            if (T.get(4)) {
                int i3 = jVar.mo61696i();
                mVCountry.keywords = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    mVCountry.keywords.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCountry$d */
    public static class C11778d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11777c(0);
        }
    }

    static {
        new C17394d0("MVCountry");
        HashMap hashMap = new HashMap();
        f30347g = hashMap;
        hashMap.put(C25239c.class, new C11776b());
        hashMap.put(C25240d.class, new C11778d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FLAG, new FieldMetaData("flag", (byte) 3, new FieldValueMetaData((byte) 8, "MVImageReferenceWithoutParams")));
        enumMap.put(_Fields.METRO_AREAS, new FieldMetaData("metroAreas", (byte) 3, new ListMetaData(new StructMetaData(MVMetroArea.class))));
        enumMap.put(_Fields.KEYWORDS, new FieldMetaData("keywords", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30348h = unmodifiableMap;
        FieldMetaData.m61947a(MVCountry.class, unmodifiableMap);
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
        ((C25238b) f30347g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30347g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVCountry mVCountry = (MVCountry) obj;
        if (!getClass().equals(mVCountry.getClass())) {
            return getClass().getName().compareTo(mVCountry.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35029g()).compareTo(Boolean.valueOf(mVCountry.mo35029g()));
        if (compareTo != 0 || ((mo35029g() && (compareTo = C25082a.m62847k(this.f30349id, mVCountry.f30349id)) != 0) || (compareTo = Boolean.valueOf(mo35033j()).compareTo(Boolean.valueOf(mVCountry.mo35033j()))) != 0 || ((mo35033j() && (compareTo = this.name.compareTo(mVCountry.name)) != 0) || (compareTo = Boolean.valueOf(mo35028f()).compareTo(Boolean.valueOf(mVCountry.mo35028f()))) != 0 || ((mo35028f() && (compareTo = C25082a.m62839c(this.flag, mVCountry.flag)) != 0) || (compareTo = Boolean.valueOf(mo35032i()).compareTo(Boolean.valueOf(mVCountry.mo35032i()))) != 0 || ((mo35032i() && (compareTo = C25082a.m62844h(this.metroAreas, mVCountry.metroAreas)) != 0) || (compareTo = Boolean.valueOf(mo35030h()).compareTo(Boolean.valueOf(mVCountry.mo35030h()))) != 0))))) {
            return compareTo;
        }
        if (!mo35030h() || (h = C25082a.m62844h(this.keywords, mVCountry.keywords)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCountry)) {
            return false;
        }
        MVCountry mVCountry = (MVCountry) obj;
        if (this.f30349id != mVCountry.f30349id) {
            return false;
        }
        boolean j = mo35033j();
        boolean j2 = mVCountry.mo35033j();
        if (((j || j2) && (!j || !j2 || !this.name.equals(mVCountry.name))) || this.flag != mVCountry.flag) {
            return false;
        }
        boolean i = mo35032i();
        boolean i2 = mVCountry.mo35032i();
        if ((i || i2) && (!i || !i2 || !this.metroAreas.equals(mVCountry.metroAreas))) {
            return false;
        }
        boolean h = mo35030h();
        boolean h2 = mVCountry.mo35030h();
        if ((h || h2) && (!h || !h2 || !this.keywords.equals(mVCountry.keywords))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35028f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo35029g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo35030h() {
        return this.keywords != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35032i() {
        return this.metroAreas != null;
    }

    /* renamed from: j */
    public final boolean mo35033j() {
        return this.name != null;
    }

    /* renamed from: k */
    public final void mo35034k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo35035l(boolean z) {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCountry(", "id:");
        C0016g.m42z(n, this.f30349id, ", ", "name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("flag:");
        C0016g.m42z(n, this.flag, ", ", "metroAreas:");
        List<MVMetroArea> list = this.metroAreas;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo35030h()) {
            n.append(", ");
            n.append("keywords:");
            List<String> list2 = this.keywords;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
