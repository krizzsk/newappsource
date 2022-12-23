package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImage;
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
import org.apache.thrift.meta_data.MapMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25120f;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVCountriesResponse implements TBase<MVCountriesResponse, _Fields>, Serializable, Cloneable, Comparable<MVCountriesResponse> {

    /* renamed from: b */
    public static final C25113c f30337b = new C25113c("countries", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f30338c = new C25113c("flags", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f30339d = new C25113c("oldToNewMetrosIds", (byte) 13, 3);

    /* renamed from: e */
    public static final HashMap f30340e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30341f;
    public List<MVCountry> countries;
    public List<MVImage> flags;
    public Map<Integer, Integer> oldToNewMetrosIds;
    private _Fields[] optionals = {_Fields.FLAGS, _Fields.OLD_TO_NEW_METROS_IDS};

    public enum _Fields implements C25085c {
        COUNTRIES(1, "countries"),
        FLAGS(2, "flags"),
        OLD_TO_NEW_METROS_IDS(3, "oldToNewMetrosIds");
        
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
                return COUNTRIES;
            }
            if (i == 2) {
                return FLAGS;
            }
            if (i != 3) {
                return null;
            }
            return OLD_TO_NEW_METROS_IDS;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCountriesResponse$a */
    public static class C11771a extends C25239c<MVCountriesResponse> {
        public C11771a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCountriesResponse mVCountriesResponse = (MVCountriesResponse) tBase;
            mVCountriesResponse.getClass();
            C25113c cVar = MVCountriesResponse.f30337b;
            gVar.mo61687K();
            if (mVCountriesResponse.countries != null) {
                gVar.mo61711x(MVCountriesResponse.f30337b);
                gVar.mo61680D(new C25119e((byte) 12, mVCountriesResponse.countries.size()));
                for (MVCountry X0 : mVCountriesResponse.countries) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVCountriesResponse.flags != null && mVCountriesResponse.mo35021g()) {
                gVar.mo61711x(MVCountriesResponse.f30338c);
                gVar.mo61680D(new C25119e((byte) 12, mVCountriesResponse.flags.size()));
                for (MVImage X02 : mVCountriesResponse.flags) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVCountriesResponse.oldToNewMetrosIds != null && mVCountriesResponse.mo35022h()) {
                gVar.mo61711x(MVCountriesResponse.f30339d);
                gVar.mo61682F(new C25120f((byte) 8, (byte) 8, mVCountriesResponse.oldToNewMetrosIds.size()));
                for (Map.Entry next : mVCountriesResponse.oldToNewMetrosIds.entrySet()) {
                    gVar.mo61678B(((Integer) next.getKey()).intValue());
                    gVar.mo61678B(((Integer) next.getValue()).intValue());
                }
                gVar.mo61683G();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCountriesResponse mVCountriesResponse = (MVCountriesResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCountriesResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 13) {
                            C25120f m = gVar.mo61700m();
                            mVCountriesResponse.oldToNewMetrosIds = new HashMap(m.f63398c * 2);
                            while (i < m.f63398c) {
                                mVCountriesResponse.oldToNewMetrosIds.put(Integer.valueOf(gVar.mo61696i()), Integer.valueOf(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61701n();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVCountriesResponse.flags = new ArrayList(k.f63395b);
                        while (i < k.f63395b) {
                            MVImage mVImage = new MVImage();
                            mVImage.mo25201C1(gVar);
                            mVCountriesResponse.flags.add(mVImage);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVCountriesResponse.countries = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        MVCountry mVCountry = new MVCountry();
                        mVCountry.mo25201C1(gVar);
                        mVCountriesResponse.countries.add(mVCountry);
                        i++;
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCountriesResponse$b */
    public static class C11772b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11771a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCountriesResponse$c */
    public static class C11773c extends C25240d<MVCountriesResponse> {
        public C11773c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCountriesResponse mVCountriesResponse = (MVCountriesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCountriesResponse.mo35020f()) {
                bitSet.set(0);
            }
            if (mVCountriesResponse.mo35021g()) {
                bitSet.set(1);
            }
            if (mVCountriesResponse.mo35022h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVCountriesResponse.mo35020f()) {
                jVar.mo61678B(mVCountriesResponse.countries.size());
                for (MVCountry X0 : mVCountriesResponse.countries) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVCountriesResponse.mo35021g()) {
                jVar.mo61678B(mVCountriesResponse.flags.size());
                for (MVImage X02 : mVCountriesResponse.flags) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVCountriesResponse.mo35022h()) {
                jVar.mo61678B(mVCountriesResponse.oldToNewMetrosIds.size());
                for (Map.Entry next : mVCountriesResponse.oldToNewMetrosIds.entrySet()) {
                    jVar.mo61678B(((Integer) next.getKey()).intValue());
                    jVar.mo61678B(((Integer) next.getValue()).intValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCountriesResponse mVCountriesResponse = (MVCountriesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVCountriesResponse.countries = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVCountry mVCountry = new MVCountry();
                    mVCountry.mo25201C1(jVar);
                    mVCountriesResponse.countries.add(mVCountry);
                }
            }
            if (T.get(1)) {
                int i3 = jVar.mo61696i();
                mVCountriesResponse.flags = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVImage mVImage = new MVImage();
                    mVImage.mo25201C1(jVar);
                    mVCountriesResponse.flags.add(mVImage);
                }
            }
            if (T.get(2)) {
                int i5 = jVar.mo61696i();
                mVCountriesResponse.oldToNewMetrosIds = new HashMap(i5 * 2);
                for (int i6 = 0; i6 < i5; i6++) {
                    mVCountriesResponse.oldToNewMetrosIds.put(Integer.valueOf(jVar.mo61696i()), Integer.valueOf(jVar.mo61696i()));
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCountriesResponse$d */
    public static class C11774d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11773c(0);
        }
    }

    static {
        new C17394d0("MVCountriesResponse");
        HashMap hashMap = new HashMap();
        f30340e = hashMap;
        hashMap.put(C25239c.class, new C11772b());
        hashMap.put(C25240d.class, new C11774d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.COUNTRIES, new FieldMetaData("countries", (byte) 3, new ListMetaData(new StructMetaData(MVCountry.class))));
        enumMap.put(_Fields.FLAGS, new FieldMetaData("flags", (byte) 2, new ListMetaData(new StructMetaData(MVImage.class))));
        enumMap.put(_Fields.OLD_TO_NEW_METROS_IDS, new FieldMetaData("oldToNewMetrosIds", (byte) 2, new MapMetaData(new FieldValueMetaData((byte) 8, false), new FieldValueMetaData((byte) 8, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30341f = unmodifiableMap;
        FieldMetaData.m61947a(MVCountriesResponse.class, unmodifiableMap);
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
        ((C25238b) f30340e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30340e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int i;
        MVCountriesResponse mVCountriesResponse = (MVCountriesResponse) obj;
        if (!getClass().equals(mVCountriesResponse.getClass())) {
            return getClass().getName().compareTo(mVCountriesResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35020f()).compareTo(Boolean.valueOf(mVCountriesResponse.mo35020f()));
        if (compareTo != 0 || ((mo35020f() && (compareTo = C25082a.m62844h(this.countries, mVCountriesResponse.countries)) != 0) || (compareTo = Boolean.valueOf(mo35021g()).compareTo(Boolean.valueOf(mVCountriesResponse.mo35021g()))) != 0 || ((mo35021g() && (compareTo = C25082a.m62844h(this.flags, mVCountriesResponse.flags)) != 0) || (compareTo = Boolean.valueOf(mo35022h()).compareTo(Boolean.valueOf(mVCountriesResponse.mo35022h()))) != 0))) {
            return compareTo;
        }
        if (!mo35022h() || (i = C25082a.m62845i(this.oldToNewMetrosIds, mVCountriesResponse.oldToNewMetrosIds)) == 0) {
            return 0;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCountriesResponse)) {
            return false;
        }
        MVCountriesResponse mVCountriesResponse = (MVCountriesResponse) obj;
        boolean f = mo35020f();
        boolean f2 = mVCountriesResponse.mo35020f();
        if ((f || f2) && (!f || !f2 || !this.countries.equals(mVCountriesResponse.countries))) {
            return false;
        }
        boolean g = mo35021g();
        boolean g2 = mVCountriesResponse.mo35021g();
        if ((g || g2) && (!g || !g2 || !this.flags.equals(mVCountriesResponse.flags))) {
            return false;
        }
        boolean h = mo35022h();
        boolean h2 = mVCountriesResponse.mo35022h();
        if ((h || h2) && (!h || !h2 || !this.oldToNewMetrosIds.equals(mVCountriesResponse.oldToNewMetrosIds))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35020f() {
        return this.countries != null;
    }

    /* renamed from: g */
    public final boolean mo35021g() {
        return this.flags != null;
    }

    /* renamed from: h */
    public final boolean mo35022h() {
        return this.oldToNewMetrosIds != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCountriesResponse(", "countries:");
        List<MVCountry> list = this.countries;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo35021g()) {
            n.append(", ");
            n.append("flags:");
            List<MVImage> list2 = this.flags;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        if (mo35022h()) {
            n.append(", ");
            n.append("oldToNewMetrosIds:");
            Map<Integer, Integer> map = this.oldToNewMetrosIds;
            if (map == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(map);
            }
        }
        n.append(")");
        return n.toString();
    }
}
