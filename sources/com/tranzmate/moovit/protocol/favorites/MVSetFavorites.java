package com.tranzmate.moovit.protocol.favorites;

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

public class MVSetFavorites implements TBase<MVSetFavorites, _Fields>, Serializable, Cloneable, Comparable<MVSetFavorites> {

    /* renamed from: b */
    public static final C25113c f25666b = new C25113c("metroId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25667c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25668d = new C25113c("favoriteLines", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f25669e = new C25113c("favoriteLocations", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f25670f = new C25113c("userKey", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f25671g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25672h;
    private byte __isset_bitfield = 0;
    public List<MVFavoriteLine> favoriteLines;
    public List<MVFavoriteLocation> favoriteLocations;
    public int metroId;
    private _Fields[] optionals = {_Fields.USER_KEY};
    public long timestamp;
    public String userKey;

    public enum _Fields implements C25085c {
        METRO_ID(1, "metroId"),
        TIMESTAMP(2, "timestamp"),
        FAVORITE_LINES(3, "favoriteLines"),
        FAVORITE_LOCATIONS(4, "favoriteLocations"),
        USER_KEY(5, "userKey");
        
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
                return METRO_ID;
            }
            if (i == 2) {
                return TIMESTAMP;
            }
            if (i == 3) {
                return FAVORITE_LINES;
            }
            if (i == 4) {
                return FAVORITE_LOCATIONS;
            }
            if (i != 5) {
                return null;
            }
            return USER_KEY;
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

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVSetFavorites$a */
    public static class C8759a extends C25239c<MVSetFavorites> {
        public C8759a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetFavorites mVSetFavorites = (MVSetFavorites) tBase;
            mVSetFavorites.getClass();
            C25113c cVar = MVSetFavorites.f25666b;
            gVar.mo61687K();
            gVar.mo61711x(MVSetFavorites.f25666b);
            gVar.mo61678B(mVSetFavorites.metroId);
            gVar.mo61712y();
            gVar.mo61711x(MVSetFavorites.f25667c);
            gVar.mo61679C(mVSetFavorites.timestamp);
            gVar.mo61712y();
            if (mVSetFavorites.favoriteLines != null) {
                gVar.mo61711x(MVSetFavorites.f25668d);
                gVar.mo61680D(new C25119e((byte) 12, mVSetFavorites.favoriteLines.size()));
                for (MVFavoriteLine X0 : mVSetFavorites.favoriteLines) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSetFavorites.favoriteLocations != null) {
                gVar.mo61711x(MVSetFavorites.f25669e);
                gVar.mo61680D(new C25119e((byte) 12, mVSetFavorites.favoriteLocations.size()));
                for (MVFavoriteLocation X02 : mVSetFavorites.favoriteLocations) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSetFavorites.userKey != null && mVSetFavorites.mo27293j()) {
                gVar.mo61711x(MVSetFavorites.f25670f);
                gVar.mo61686J(mVSetFavorites.userKey);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetFavorites mVSetFavorites = (MVSetFavorites) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSetFavorites.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        int i = 0;
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVSetFavorites.userKey = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVSetFavorites.favoriteLocations = new ArrayList(k.f63395b);
                                while (i < k.f63395b) {
                                    MVFavoriteLocation mVFavoriteLocation = new MVFavoriteLocation();
                                    mVFavoriteLocation.mo25201C1(gVar);
                                    mVSetFavorites.favoriteLocations.add(mVFavoriteLocation);
                                    i++;
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k2 = gVar.mo61698k();
                            mVSetFavorites.favoriteLines = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVFavoriteLine mVFavoriteLine = new MVFavoriteLine();
                                mVFavoriteLine.mo25201C1(gVar);
                                mVSetFavorites.favoriteLines.add(mVFavoriteLine);
                                i++;
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVSetFavorites.timestamp = gVar.mo61697j();
                        mVSetFavorites.mo27295l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVSetFavorites.metroId = gVar.mo61696i();
                    mVSetFavorites.mo27294k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVSetFavorites$b */
    public static class C8760b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8759a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVSetFavorites$c */
    public static class C8761c extends C25240d<MVSetFavorites> {
        public C8761c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetFavorites mVSetFavorites = (MVSetFavorites) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSetFavorites.mo27290h()) {
                bitSet.set(0);
            }
            if (mVSetFavorites.mo27292i()) {
                bitSet.set(1);
            }
            if (mVSetFavorites.mo27288f()) {
                bitSet.set(2);
            }
            if (mVSetFavorites.mo27289g()) {
                bitSet.set(3);
            }
            if (mVSetFavorites.mo27293j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVSetFavorites.mo27290h()) {
                jVar.mo61678B(mVSetFavorites.metroId);
            }
            if (mVSetFavorites.mo27292i()) {
                jVar.mo61679C(mVSetFavorites.timestamp);
            }
            if (mVSetFavorites.mo27288f()) {
                jVar.mo61678B(mVSetFavorites.favoriteLines.size());
                for (MVFavoriteLine X0 : mVSetFavorites.favoriteLines) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVSetFavorites.mo27289g()) {
                jVar.mo61678B(mVSetFavorites.favoriteLocations.size());
                for (MVFavoriteLocation X02 : mVSetFavorites.favoriteLocations) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVSetFavorites.mo27293j()) {
                jVar.mo61686J(mVSetFavorites.userKey);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetFavorites mVSetFavorites = (MVSetFavorites) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVSetFavorites.metroId = jVar.mo61696i();
                mVSetFavorites.mo27294k();
            }
            if (T.get(1)) {
                mVSetFavorites.timestamp = jVar.mo61697j();
                mVSetFavorites.mo27295l();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVSetFavorites.favoriteLines = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVFavoriteLine mVFavoriteLine = new MVFavoriteLine();
                    mVFavoriteLine.mo25201C1(jVar);
                    mVSetFavorites.favoriteLines.add(mVFavoriteLine);
                }
            }
            if (T.get(3)) {
                int i3 = jVar.mo61696i();
                mVSetFavorites.favoriteLocations = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVFavoriteLocation mVFavoriteLocation = new MVFavoriteLocation();
                    mVFavoriteLocation.mo25201C1(jVar);
                    mVSetFavorites.favoriteLocations.add(mVFavoriteLocation);
                }
            }
            if (T.get(4)) {
                mVSetFavorites.userKey = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVSetFavorites$d */
    public static class C8762d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8761c(0);
        }
    }

    static {
        new C17394d0("MVSetFavorites");
        HashMap hashMap = new HashMap();
        f25671g = hashMap;
        hashMap.put(C25239c.class, new C8760b());
        hashMap.put(C25240d.class, new C8762d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.FAVORITE_LINES, new FieldMetaData("favoriteLines", (byte) 3, new ListMetaData(new StructMetaData(MVFavoriteLine.class))));
        enumMap.put(_Fields.FAVORITE_LOCATIONS, new FieldMetaData("favoriteLocations", (byte) 3, new ListMetaData(new StructMetaData(MVFavoriteLocation.class))));
        enumMap.put(_Fields.USER_KEY, new FieldMetaData("userKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25672h = unmodifiableMap;
        FieldMetaData.m61947a(MVSetFavorites.class, unmodifiableMap);
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
        ((C25238b) f25671g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25671g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSetFavorites mVSetFavorites = (MVSetFavorites) obj;
        if (!getClass().equals(mVSetFavorites.getClass())) {
            return getClass().getName().compareTo(mVSetFavorites.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27290h()).compareTo(Boolean.valueOf(mVSetFavorites.mo27290h()));
        if (compareTo2 != 0 || ((mo27290h() && (compareTo2 = C25082a.m62839c(this.metroId, mVSetFavorites.metroId)) != 0) || (compareTo2 = Boolean.valueOf(mo27292i()).compareTo(Boolean.valueOf(mVSetFavorites.mo27292i()))) != 0 || ((mo27292i() && (compareTo2 = C25082a.m62840d(this.timestamp, mVSetFavorites.timestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo27288f()).compareTo(Boolean.valueOf(mVSetFavorites.mo27288f()))) != 0 || ((mo27288f() && (compareTo2 = C25082a.m62844h(this.favoriteLines, mVSetFavorites.favoriteLines)) != 0) || (compareTo2 = Boolean.valueOf(mo27289g()).compareTo(Boolean.valueOf(mVSetFavorites.mo27289g()))) != 0 || ((mo27289g() && (compareTo2 = C25082a.m62844h(this.favoriteLocations, mVSetFavorites.favoriteLocations)) != 0) || (compareTo2 = Boolean.valueOf(mo27293j()).compareTo(Boolean.valueOf(mVSetFavorites.mo27293j()))) != 0))))) {
            return compareTo2;
        }
        if (!mo27293j() || (compareTo = this.userKey.compareTo(mVSetFavorites.userKey)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSetFavorites)) {
            return false;
        }
        MVSetFavorites mVSetFavorites = (MVSetFavorites) obj;
        if (this.metroId != mVSetFavorites.metroId || this.timestamp != mVSetFavorites.timestamp) {
            return false;
        }
        boolean f = mo27288f();
        boolean f2 = mVSetFavorites.mo27288f();
        if ((f || f2) && (!f || !f2 || !this.favoriteLines.equals(mVSetFavorites.favoriteLines))) {
            return false;
        }
        boolean g = mo27289g();
        boolean g2 = mVSetFavorites.mo27289g();
        if ((g || g2) && (!g || !g2 || !this.favoriteLocations.equals(mVSetFavorites.favoriteLocations))) {
            return false;
        }
        boolean j = mo27293j();
        boolean j2 = mVSetFavorites.mo27293j();
        if ((j || j2) && (!j || !j2 || !this.userKey.equals(mVSetFavorites.userKey))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27288f() {
        return this.favoriteLines != null;
    }

    /* renamed from: g */
    public final boolean mo27289g() {
        return this.favoriteLocations != null;
    }

    /* renamed from: h */
    public final boolean mo27290h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27292i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo27293j() {
        return this.userKey != null;
    }

    /* renamed from: k */
    public final void mo27294k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo27295l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSetFavorites(", "metroId:");
        C0016g.m42z(n, this.metroId, ", ", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "favoriteLines:");
        List<MVFavoriteLine> list = this.favoriteLines;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("favoriteLocations:");
        List<MVFavoriteLocation> list2 = this.favoriteLocations;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        if (mo27293j()) {
            n.append(", ");
            n.append("userKey:");
            String str = this.userKey;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(")");
        return n.toString();
    }
}
