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

public class MVSetFavoriteLineGroupsAndStops implements TBase<MVSetFavoriteLineGroupsAndStops, _Fields>, Serializable, Cloneable, Comparable<MVSetFavoriteLineGroupsAndStops> {

    /* renamed from: b */
    public static final C25113c f25658b = new C25113c("metroId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25659c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25660d = new C25113c("favoriteLineGroupIds", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f25661e = new C25113c("favoriteStopIds", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f25662f = new C25113c("favoriteLocations", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f25663g = new C25113c("userKey", (byte) 11, 6);

    /* renamed from: h */
    public static final HashMap f25664h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f25665i;
    private byte __isset_bitfield = 0;
    public List<Integer> favoriteLineGroupIds;
    public List<MVFavoriteLocation> favoriteLocations;
    public List<Integer> favoriteStopIds;
    public int metroId;
    private _Fields[] optionals = {_Fields.USER_KEY};
    public long timestamp;
    public String userKey;

    public enum _Fields implements C25085c {
        METRO_ID(1, "metroId"),
        TIMESTAMP(2, "timestamp"),
        FAVORITE_LINE_GROUP_IDS(3, "favoriteLineGroupIds"),
        FAVORITE_STOP_IDS(4, "favoriteStopIds"),
        FAVORITE_LOCATIONS(5, "favoriteLocations"),
        USER_KEY(6, "userKey");
        
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
                    return METRO_ID;
                case 2:
                    return TIMESTAMP;
                case 3:
                    return FAVORITE_LINE_GROUP_IDS;
                case 4:
                    return FAVORITE_STOP_IDS;
                case 5:
                    return FAVORITE_LOCATIONS;
                case 6:
                    return USER_KEY;
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

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVSetFavoriteLineGroupsAndStops$a */
    public static class C8755a extends C25239c<MVSetFavoriteLineGroupsAndStops> {
        public C8755a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetFavoriteLineGroupsAndStops mVSetFavoriteLineGroupsAndStops = (MVSetFavoriteLineGroupsAndStops) tBase;
            mVSetFavoriteLineGroupsAndStops.getClass();
            C25113c cVar = MVSetFavoriteLineGroupsAndStops.f25658b;
            gVar.mo61687K();
            gVar.mo61711x(MVSetFavoriteLineGroupsAndStops.f25658b);
            gVar.mo61678B(mVSetFavoriteLineGroupsAndStops.metroId);
            gVar.mo61712y();
            gVar.mo61711x(MVSetFavoriteLineGroupsAndStops.f25659c);
            gVar.mo61679C(mVSetFavoriteLineGroupsAndStops.timestamp);
            gVar.mo61712y();
            if (mVSetFavoriteLineGroupsAndStops.favoriteLineGroupIds != null) {
                gVar.mo61711x(MVSetFavoriteLineGroupsAndStops.f25660d);
                gVar.mo61680D(new C25119e((byte) 8, mVSetFavoriteLineGroupsAndStops.favoriteLineGroupIds.size()));
                for (Integer intValue : mVSetFavoriteLineGroupsAndStops.favoriteLineGroupIds) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSetFavoriteLineGroupsAndStops.favoriteStopIds != null) {
                gVar.mo61711x(MVSetFavoriteLineGroupsAndStops.f25661e);
                gVar.mo61680D(new C25119e((byte) 8, mVSetFavoriteLineGroupsAndStops.favoriteStopIds.size()));
                for (Integer intValue2 : mVSetFavoriteLineGroupsAndStops.favoriteStopIds) {
                    gVar.mo61678B(intValue2.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSetFavoriteLineGroupsAndStops.favoriteLocations != null) {
                gVar.mo61711x(MVSetFavoriteLineGroupsAndStops.f25662f);
                gVar.mo61680D(new C25119e((byte) 12, mVSetFavoriteLineGroupsAndStops.favoriteLocations.size()));
                for (MVFavoriteLocation X0 : mVSetFavoriteLineGroupsAndStops.favoriteLocations) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSetFavoriteLineGroupsAndStops.userKey != null && mVSetFavoriteLineGroupsAndStops.mo27281k()) {
                gVar.mo61711x(MVSetFavoriteLineGroupsAndStops.f25663g);
                gVar.mo61686J(mVSetFavoriteLineGroupsAndStops.userKey);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetFavoriteLineGroupsAndStops mVSetFavoriteLineGroupsAndStops = (MVSetFavoriteLineGroupsAndStops) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSetFavoriteLineGroupsAndStops.getClass();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSetFavoriteLineGroupsAndStops.metroId = gVar.mo61696i();
                            mVSetFavoriteLineGroupsAndStops.mo27282l();
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSetFavoriteLineGroupsAndStops.timestamp = gVar.mo61697j();
                            mVSetFavoriteLineGroupsAndStops.mo27283m();
                            break;
                        }
                    case 3:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVSetFavoriteLineGroupsAndStops.favoriteLineGroupIds = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVSetFavoriteLineGroupsAndStops.favoriteLineGroupIds, i, 1);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 4:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVSetFavoriteLineGroupsAndStops.favoriteStopIds = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVSetFavoriteLineGroupsAndStops.favoriteStopIds, i, 1);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k3 = gVar.mo61698k();
                            mVSetFavoriteLineGroupsAndStops.favoriteLocations = new ArrayList(k3.f63395b);
                            while (i < k3.f63395b) {
                                MVFavoriteLocation mVFavoriteLocation = new MVFavoriteLocation();
                                mVFavoriteLocation.mo25201C1(gVar);
                                mVSetFavoriteLineGroupsAndStops.favoriteLocations.add(mVFavoriteLocation);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSetFavoriteLineGroupsAndStops.userKey = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVSetFavoriteLineGroupsAndStops$b */
    public static class C8756b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8755a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVSetFavoriteLineGroupsAndStops$c */
    public static class C8757c extends C25240d<MVSetFavoriteLineGroupsAndStops> {
        public C8757c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetFavoriteLineGroupsAndStops mVSetFavoriteLineGroupsAndStops = (MVSetFavoriteLineGroupsAndStops) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSetFavoriteLineGroupsAndStops.mo27279i()) {
                bitSet.set(0);
            }
            if (mVSetFavoriteLineGroupsAndStops.mo27280j()) {
                bitSet.set(1);
            }
            if (mVSetFavoriteLineGroupsAndStops.mo27275f()) {
                bitSet.set(2);
            }
            if (mVSetFavoriteLineGroupsAndStops.mo27277h()) {
                bitSet.set(3);
            }
            if (mVSetFavoriteLineGroupsAndStops.mo27276g()) {
                bitSet.set(4);
            }
            if (mVSetFavoriteLineGroupsAndStops.mo27281k()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVSetFavoriteLineGroupsAndStops.mo27279i()) {
                jVar.mo61678B(mVSetFavoriteLineGroupsAndStops.metroId);
            }
            if (mVSetFavoriteLineGroupsAndStops.mo27280j()) {
                jVar.mo61679C(mVSetFavoriteLineGroupsAndStops.timestamp);
            }
            if (mVSetFavoriteLineGroupsAndStops.mo27275f()) {
                jVar.mo61678B(mVSetFavoriteLineGroupsAndStops.favoriteLineGroupIds.size());
                for (Integer intValue : mVSetFavoriteLineGroupsAndStops.favoriteLineGroupIds) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVSetFavoriteLineGroupsAndStops.mo27277h()) {
                jVar.mo61678B(mVSetFavoriteLineGroupsAndStops.favoriteStopIds.size());
                for (Integer intValue2 : mVSetFavoriteLineGroupsAndStops.favoriteStopIds) {
                    jVar.mo61678B(intValue2.intValue());
                }
            }
            if (mVSetFavoriteLineGroupsAndStops.mo27276g()) {
                jVar.mo61678B(mVSetFavoriteLineGroupsAndStops.favoriteLocations.size());
                for (MVFavoriteLocation X0 : mVSetFavoriteLineGroupsAndStops.favoriteLocations) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVSetFavoriteLineGroupsAndStops.mo27281k()) {
                jVar.mo61686J(mVSetFavoriteLineGroupsAndStops.userKey);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetFavoriteLineGroupsAndStops mVSetFavoriteLineGroupsAndStops = (MVSetFavoriteLineGroupsAndStops) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVSetFavoriteLineGroupsAndStops.metroId = jVar.mo61696i();
                mVSetFavoriteLineGroupsAndStops.mo27282l();
            }
            if (T.get(1)) {
                mVSetFavoriteLineGroupsAndStops.timestamp = jVar.mo61697j();
                mVSetFavoriteLineGroupsAndStops.mo27283m();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVSetFavoriteLineGroupsAndStops.favoriteLineGroupIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVSetFavoriteLineGroupsAndStops.favoriteLineGroupIds, i2, 1)) {
                }
            }
            if (T.get(3)) {
                int i3 = jVar.mo61696i();
                mVSetFavoriteLineGroupsAndStops.favoriteStopIds = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4 = C13437d.m33701f(jVar.mo61696i(), mVSetFavoriteLineGroupsAndStops.favoriteStopIds, i4, 1)) {
                }
            }
            if (T.get(4)) {
                int i5 = jVar.mo61696i();
                mVSetFavoriteLineGroupsAndStops.favoriteLocations = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    MVFavoriteLocation mVFavoriteLocation = new MVFavoriteLocation();
                    mVFavoriteLocation.mo25201C1(jVar);
                    mVSetFavoriteLineGroupsAndStops.favoriteLocations.add(mVFavoriteLocation);
                }
            }
            if (T.get(5)) {
                mVSetFavoriteLineGroupsAndStops.userKey = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVSetFavoriteLineGroupsAndStops$d */
    public static class C8758d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8757c(0);
        }
    }

    static {
        new C17394d0("MVSetFavoriteLineGroupsAndStops");
        HashMap hashMap = new HashMap();
        f25664h = hashMap;
        hashMap.put(C25239c.class, new C8756b());
        hashMap.put(C25240d.class, new C8758d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.FAVORITE_LINE_GROUP_IDS, new FieldMetaData("favoriteLineGroupIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.FAVORITE_STOP_IDS, new FieldMetaData("favoriteStopIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.FAVORITE_LOCATIONS, new FieldMetaData("favoriteLocations", (byte) 3, new ListMetaData(new StructMetaData(MVFavoriteLocation.class))));
        enumMap.put(_Fields.USER_KEY, new FieldMetaData("userKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25665i = unmodifiableMap;
        FieldMetaData.m61947a(MVSetFavoriteLineGroupsAndStops.class, unmodifiableMap);
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
        ((C25238b) f25664h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25664h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSetFavoriteLineGroupsAndStops mVSetFavoriteLineGroupsAndStops = (MVSetFavoriteLineGroupsAndStops) obj;
        if (!getClass().equals(mVSetFavoriteLineGroupsAndStops.getClass())) {
            return getClass().getName().compareTo(mVSetFavoriteLineGroupsAndStops.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27279i()).compareTo(Boolean.valueOf(mVSetFavoriteLineGroupsAndStops.mo27279i()));
        if (compareTo2 != 0 || ((mo27279i() && (compareTo2 = C25082a.m62839c(this.metroId, mVSetFavoriteLineGroupsAndStops.metroId)) != 0) || (compareTo2 = Boolean.valueOf(mo27280j()).compareTo(Boolean.valueOf(mVSetFavoriteLineGroupsAndStops.mo27280j()))) != 0 || ((mo27280j() && (compareTo2 = C25082a.m62840d(this.timestamp, mVSetFavoriteLineGroupsAndStops.timestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo27275f()).compareTo(Boolean.valueOf(mVSetFavoriteLineGroupsAndStops.mo27275f()))) != 0 || ((mo27275f() && (compareTo2 = C25082a.m62844h(this.favoriteLineGroupIds, mVSetFavoriteLineGroupsAndStops.favoriteLineGroupIds)) != 0) || (compareTo2 = Boolean.valueOf(mo27277h()).compareTo(Boolean.valueOf(mVSetFavoriteLineGroupsAndStops.mo27277h()))) != 0 || ((mo27277h() && (compareTo2 = C25082a.m62844h(this.favoriteStopIds, mVSetFavoriteLineGroupsAndStops.favoriteStopIds)) != 0) || (compareTo2 = Boolean.valueOf(mo27276g()).compareTo(Boolean.valueOf(mVSetFavoriteLineGroupsAndStops.mo27276g()))) != 0 || ((mo27276g() && (compareTo2 = C25082a.m62844h(this.favoriteLocations, mVSetFavoriteLineGroupsAndStops.favoriteLocations)) != 0) || (compareTo2 = Boolean.valueOf(mo27281k()).compareTo(Boolean.valueOf(mVSetFavoriteLineGroupsAndStops.mo27281k()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo27281k() || (compareTo = this.userKey.compareTo(mVSetFavoriteLineGroupsAndStops.userKey)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSetFavoriteLineGroupsAndStops)) {
            return false;
        }
        MVSetFavoriteLineGroupsAndStops mVSetFavoriteLineGroupsAndStops = (MVSetFavoriteLineGroupsAndStops) obj;
        if (this.metroId != mVSetFavoriteLineGroupsAndStops.metroId || this.timestamp != mVSetFavoriteLineGroupsAndStops.timestamp) {
            return false;
        }
        boolean f = mo27275f();
        boolean f2 = mVSetFavoriteLineGroupsAndStops.mo27275f();
        if ((f || f2) && (!f || !f2 || !this.favoriteLineGroupIds.equals(mVSetFavoriteLineGroupsAndStops.favoriteLineGroupIds))) {
            return false;
        }
        boolean h = mo27277h();
        boolean h2 = mVSetFavoriteLineGroupsAndStops.mo27277h();
        if ((h || h2) && (!h || !h2 || !this.favoriteStopIds.equals(mVSetFavoriteLineGroupsAndStops.favoriteStopIds))) {
            return false;
        }
        boolean g = mo27276g();
        boolean g2 = mVSetFavoriteLineGroupsAndStops.mo27276g();
        if ((g || g2) && (!g || !g2 || !this.favoriteLocations.equals(mVSetFavoriteLineGroupsAndStops.favoriteLocations))) {
            return false;
        }
        boolean k = mo27281k();
        boolean k2 = mVSetFavoriteLineGroupsAndStops.mo27281k();
        if ((k || k2) && (!k || !k2 || !this.userKey.equals(mVSetFavoriteLineGroupsAndStops.userKey))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27275f() {
        return this.favoriteLineGroupIds != null;
    }

    /* renamed from: g */
    public final boolean mo27276g() {
        return this.favoriteLocations != null;
    }

    /* renamed from: h */
    public final boolean mo27277h() {
        return this.favoriteStopIds != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27279i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo27280j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final boolean mo27281k() {
        return this.userKey != null;
    }

    /* renamed from: l */
    public final void mo27282l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: m */
    public final void mo27283m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSetFavoriteLineGroupsAndStops(", "metroId:");
        C0016g.m42z(n, this.metroId, ", ", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "favoriteLineGroupIds:");
        List<Integer> list = this.favoriteLineGroupIds;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("favoriteStopIds:");
        List<Integer> list2 = this.favoriteStopIds;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("favoriteLocations:");
        List<MVFavoriteLocation> list3 = this.favoriteLocations;
        if (list3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list3);
        }
        if (mo27281k()) {
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
