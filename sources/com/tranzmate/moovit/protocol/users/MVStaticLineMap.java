package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVRouteType;
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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVStaticLineMap implements TBase<MVStaticLineMap, _Fields>, Serializable, Cloneable, Comparable<MVStaticLineMap> {

    /* renamed from: b */
    public static final C25113c f30549b = new C25113c("mapId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30550c = new C25113c("order", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30551d = new C25113c("url", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30552e = new C25113c("fileName", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f30553f = new C25113c("lastUpdated", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f30554g = new C25113c("caption", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f30555h = new C25113c("routeTypes", (byte) 15, 7);

    /* renamed from: i */
    public static final HashMap f30556i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f30557j;
    private byte __isset_bitfield = 0;
    public String caption;
    public String fileName;
    public long lastUpdated;
    public int mapId;
    public int order;
    public List<MVRouteType> routeTypes;
    public String url;

    public enum _Fields implements C25085c {
        MAP_ID(1, "mapId"),
        ORDER(2, "order"),
        URL(3, "url"),
        FILE_NAME(4, "fileName"),
        LAST_UPDATED(5, "lastUpdated"),
        CAPTION(6, "caption"),
        ROUTE_TYPES(7, "routeTypes");
        
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
                    return MAP_ID;
                case 2:
                    return ORDER;
                case 3:
                    return URL;
                case 4:
                    return FILE_NAME;
                case 5:
                    return LAST_UPDATED;
                case 6:
                    return CAPTION;
                case 7:
                    return ROUTE_TYPES;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVStaticLineMap$a */
    public static class C11905a extends C25239c<MVStaticLineMap> {
        public C11905a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStaticLineMap mVStaticLineMap = (MVStaticLineMap) tBase;
            mVStaticLineMap.getClass();
            C25113c cVar = MVStaticLineMap.f30549b;
            gVar.mo61687K();
            gVar.mo61711x(MVStaticLineMap.f30549b);
            gVar.mo61678B(mVStaticLineMap.mapId);
            gVar.mo61712y();
            gVar.mo61711x(MVStaticLineMap.f30550c);
            gVar.mo61678B(mVStaticLineMap.order);
            gVar.mo61712y();
            if (mVStaticLineMap.url != null) {
                gVar.mo61711x(MVStaticLineMap.f30551d);
                gVar.mo61686J(mVStaticLineMap.url);
                gVar.mo61712y();
            }
            if (mVStaticLineMap.fileName != null) {
                gVar.mo61711x(MVStaticLineMap.f30552e);
                gVar.mo61686J(mVStaticLineMap.fileName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVStaticLineMap.f30553f);
            gVar.mo61679C(mVStaticLineMap.lastUpdated);
            gVar.mo61712y();
            if (mVStaticLineMap.caption != null) {
                gVar.mo61711x(MVStaticLineMap.f30554g);
                gVar.mo61686J(mVStaticLineMap.caption);
                gVar.mo61712y();
            }
            if (mVStaticLineMap.routeTypes != null) {
                gVar.mo61711x(MVStaticLineMap.f30555h);
                gVar.mo61680D(new C25119e((byte) 8, mVStaticLineMap.routeTypes.size()));
                for (MVRouteType value : mVStaticLineMap.routeTypes) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStaticLineMap mVStaticLineMap = (MVStaticLineMap) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVStaticLineMap.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticLineMap.mapId = gVar.mo61696i();
                            mVStaticLineMap.mo35374o();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticLineMap.order = gVar.mo61696i();
                            mVStaticLineMap.mo35375p();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticLineMap.url = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticLineMap.fileName = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticLineMap.lastUpdated = gVar.mo61697j();
                            mVStaticLineMap.mo35373m();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStaticLineMap.caption = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVStaticLineMap.routeTypes = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVStaticLineMap.routeTypes.add(MVRouteType.findByValue(gVar.mo61696i()));
                            }
                            gVar.mo61699l();
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVStaticLineMap$b */
    public static class C11906b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11905a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVStaticLineMap$c */
    public static class C11907c extends C25240d<MVStaticLineMap> {
        public C11907c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStaticLineMap mVStaticLineMap = (MVStaticLineMap) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStaticLineMap.mo35369i()) {
                bitSet.set(0);
            }
            if (mVStaticLineMap.mo35370j()) {
                bitSet.set(1);
            }
            if (mVStaticLineMap.mo35372l()) {
                bitSet.set(2);
            }
            if (mVStaticLineMap.mo35366g()) {
                bitSet.set(3);
            }
            if (mVStaticLineMap.mo35367h()) {
                bitSet.set(4);
            }
            if (mVStaticLineMap.mo35365f()) {
                bitSet.set(5);
            }
            if (mVStaticLineMap.mo35371k()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVStaticLineMap.mo35369i()) {
                jVar.mo61678B(mVStaticLineMap.mapId);
            }
            if (mVStaticLineMap.mo35370j()) {
                jVar.mo61678B(mVStaticLineMap.order);
            }
            if (mVStaticLineMap.mo35372l()) {
                jVar.mo61686J(mVStaticLineMap.url);
            }
            if (mVStaticLineMap.mo35366g()) {
                jVar.mo61686J(mVStaticLineMap.fileName);
            }
            if (mVStaticLineMap.mo35367h()) {
                jVar.mo61679C(mVStaticLineMap.lastUpdated);
            }
            if (mVStaticLineMap.mo35365f()) {
                jVar.mo61686J(mVStaticLineMap.caption);
            }
            if (mVStaticLineMap.mo35371k()) {
                jVar.mo61678B(mVStaticLineMap.routeTypes.size());
                for (MVRouteType value : mVStaticLineMap.routeTypes) {
                    jVar.mo61678B(value.getValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStaticLineMap mVStaticLineMap = (MVStaticLineMap) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVStaticLineMap.mapId = jVar.mo61696i();
                mVStaticLineMap.mo35374o();
            }
            if (T.get(1)) {
                mVStaticLineMap.order = jVar.mo61696i();
                mVStaticLineMap.mo35375p();
            }
            if (T.get(2)) {
                mVStaticLineMap.url = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVStaticLineMap.fileName = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVStaticLineMap.lastUpdated = jVar.mo61697j();
                mVStaticLineMap.mo35373m();
            }
            if (T.get(5)) {
                mVStaticLineMap.caption = jVar.mo61704q();
            }
            if (T.get(6)) {
                int i = jVar.mo61696i();
                mVStaticLineMap.routeTypes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVStaticLineMap.routeTypes.add(MVRouteType.findByValue(jVar.mo61696i()));
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVStaticLineMap$d */
    public static class C11908d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11907c(0);
        }
    }

    static {
        new C17394d0("MVStaticLineMap");
        HashMap hashMap = new HashMap();
        f30556i = hashMap;
        hashMap.put(C25239c.class, new C11906b());
        hashMap.put(C25240d.class, new C11908d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MAP_ID, new FieldMetaData("mapId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ORDER, new FieldMetaData("order", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.URL, new FieldMetaData("url", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FILE_NAME, new FieldMetaData("fileName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LAST_UPDATED, new FieldMetaData("lastUpdated", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.CAPTION, new FieldMetaData("caption", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ROUTE_TYPES, new FieldMetaData("routeTypes", (byte) 3, new ListMetaData(new EnumMetaData(MVRouteType.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30557j = unmodifiableMap;
        FieldMetaData.m61947a(MVStaticLineMap.class, unmodifiableMap);
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
        ((C25238b) f30556i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30556i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVStaticLineMap mVStaticLineMap = (MVStaticLineMap) obj;
        if (!getClass().equals(mVStaticLineMap.getClass())) {
            return getClass().getName().compareTo(mVStaticLineMap.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35369i()).compareTo(Boolean.valueOf(mVStaticLineMap.mo35369i()));
        if (compareTo != 0 || ((mo35369i() && (compareTo = C25082a.m62839c(this.mapId, mVStaticLineMap.mapId)) != 0) || (compareTo = Boolean.valueOf(mo35370j()).compareTo(Boolean.valueOf(mVStaticLineMap.mo35370j()))) != 0 || ((mo35370j() && (compareTo = C25082a.m62839c(this.order, mVStaticLineMap.order)) != 0) || (compareTo = Boolean.valueOf(mo35372l()).compareTo(Boolean.valueOf(mVStaticLineMap.mo35372l()))) != 0 || ((mo35372l() && (compareTo = this.url.compareTo(mVStaticLineMap.url)) != 0) || (compareTo = Boolean.valueOf(mo35366g()).compareTo(Boolean.valueOf(mVStaticLineMap.mo35366g()))) != 0 || ((mo35366g() && (compareTo = this.fileName.compareTo(mVStaticLineMap.fileName)) != 0) || (compareTo = Boolean.valueOf(mo35367h()).compareTo(Boolean.valueOf(mVStaticLineMap.mo35367h()))) != 0 || ((mo35367h() && (compareTo = C25082a.m62840d(this.lastUpdated, mVStaticLineMap.lastUpdated)) != 0) || (compareTo = Boolean.valueOf(mo35365f()).compareTo(Boolean.valueOf(mVStaticLineMap.mo35365f()))) != 0 || ((mo35365f() && (compareTo = this.caption.compareTo(mVStaticLineMap.caption)) != 0) || (compareTo = Boolean.valueOf(mo35371k()).compareTo(Boolean.valueOf(mVStaticLineMap.mo35371k()))) != 0))))))) {
            return compareTo;
        }
        if (!mo35371k() || (h = C25082a.m62844h(this.routeTypes, mVStaticLineMap.routeTypes)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVStaticLineMap)) {
            return false;
        }
        MVStaticLineMap mVStaticLineMap = (MVStaticLineMap) obj;
        if (this.mapId != mVStaticLineMap.mapId || this.order != mVStaticLineMap.order) {
            return false;
        }
        boolean l = mo35372l();
        boolean l2 = mVStaticLineMap.mo35372l();
        if ((l || l2) && (!l || !l2 || !this.url.equals(mVStaticLineMap.url))) {
            return false;
        }
        boolean g = mo35366g();
        boolean g2 = mVStaticLineMap.mo35366g();
        if (((g || g2) && (!g || !g2 || !this.fileName.equals(mVStaticLineMap.fileName))) || this.lastUpdated != mVStaticLineMap.lastUpdated) {
            return false;
        }
        boolean f = mo35365f();
        boolean f2 = mVStaticLineMap.mo35365f();
        if ((f || f2) && (!f || !f2 || !this.caption.equals(mVStaticLineMap.caption))) {
            return false;
        }
        boolean k = mo35371k();
        boolean k2 = mVStaticLineMap.mo35371k();
        if ((k || k2) && (!k || !k2 || !this.routeTypes.equals(mVStaticLineMap.routeTypes))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35365f() {
        return this.caption != null;
    }

    /* renamed from: g */
    public final boolean mo35366g() {
        return this.fileName != null;
    }

    /* renamed from: h */
    public final boolean mo35367h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35369i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo35370j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final boolean mo35371k() {
        return this.routeTypes != null;
    }

    /* renamed from: l */
    public final boolean mo35372l() {
        return this.url != null;
    }

    /* renamed from: m */
    public final void mo35373m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo35374o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: p */
    public final void mo35375p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStaticLineMap(", "mapId:");
        C0016g.m42z(n, this.mapId, ", ", "order:");
        C0016g.m42z(n, this.order, ", ", "url:");
        String str = this.url;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("fileName:");
        String str2 = this.fileName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("lastUpdated:");
        C25541a.m63889t(n, this.lastUpdated, ", ", "caption:");
        String str3 = this.caption;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("routeTypes:");
        List<MVRouteType> list = this.routeTypes;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
