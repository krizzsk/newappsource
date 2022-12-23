package com.tranzmate.moovit.protocol.search;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVRouteType;
import com.tranzmate.moovit.protocol.common.MVSearchLineGroupItem;
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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVSearchLineGroupSection implements TBase<MVSearchLineGroupSection, _Fields>, Serializable, Cloneable, Comparable<MVSearchLineGroupSection> {

    /* renamed from: b */
    public static final C25113c f28175b = new C25113c("routeTypeId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28176c = new C25113c("agencyId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28177d = new C25113c("items", (byte) 15, 3);

    /* renamed from: e */
    public static final HashMap f28178e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28179f;
    private byte __isset_bitfield = 0;
    public int agencyId;
    public List<MVSearchLineGroupItem> items;
    private _Fields[] optionals = {_Fields.AGENCY_ID};
    public MVRouteType routeTypeId;

    public enum _Fields implements C25085c {
        ROUTE_TYPE_ID(1, "routeTypeId"),
        AGENCY_ID(2, "agencyId"),
        ITEMS(3, "items");
        
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
                return ROUTE_TYPE_ID;
            }
            if (i == 2) {
                return AGENCY_ID;
            }
            if (i != 3) {
                return null;
            }
            return ITEMS;
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

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchLineGroupSection$a */
    public static class C10427a extends C25239c<MVSearchLineGroupSection> {
        public C10427a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchLineGroupSection mVSearchLineGroupSection = (MVSearchLineGroupSection) tBase;
            mVSearchLineGroupSection.getClass();
            C25113c cVar = MVSearchLineGroupSection.f28175b;
            gVar.mo61687K();
            if (mVSearchLineGroupSection.routeTypeId != null) {
                gVar.mo61711x(MVSearchLineGroupSection.f28175b);
                gVar.mo61678B(mVSearchLineGroupSection.routeTypeId.getValue());
                gVar.mo61712y();
            }
            if (mVSearchLineGroupSection.mo31469f()) {
                gVar.mo61711x(MVSearchLineGroupSection.f28176c);
                gVar.mo61678B(mVSearchLineGroupSection.agencyId);
                gVar.mo61712y();
            }
            if (mVSearchLineGroupSection.items != null) {
                gVar.mo61711x(MVSearchLineGroupSection.f28177d);
                gVar.mo61680D(new C25119e((byte) 12, mVSearchLineGroupSection.items.size()));
                for (MVSearchLineGroupItem X0 : mVSearchLineGroupSection.items) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSearchLineGroupSection mVSearchLineGroupSection = (MVSearchLineGroupSection) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSearchLineGroupSection.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVSearchLineGroupSection.items = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVSearchLineGroupItem mVSearchLineGroupItem = new MVSearchLineGroupItem();
                                mVSearchLineGroupItem.mo25201C1(gVar);
                                mVSearchLineGroupSection.items.add(mVSearchLineGroupItem);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVSearchLineGroupSection.agencyId = gVar.mo61696i();
                        mVSearchLineGroupSection.mo31473i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVSearchLineGroupSection.routeTypeId = MVRouteType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchLineGroupSection$b */
    public static class C10428b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10427a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchLineGroupSection$c */
    public static class C10429c extends C25240d<MVSearchLineGroupSection> {
        public C10429c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchLineGroupSection mVSearchLineGroupSection = (MVSearchLineGroupSection) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSearchLineGroupSection.mo31471h()) {
                bitSet.set(0);
            }
            if (mVSearchLineGroupSection.mo31469f()) {
                bitSet.set(1);
            }
            if (mVSearchLineGroupSection.mo31470g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVSearchLineGroupSection.mo31471h()) {
                jVar.mo61678B(mVSearchLineGroupSection.routeTypeId.getValue());
            }
            if (mVSearchLineGroupSection.mo31469f()) {
                jVar.mo61678B(mVSearchLineGroupSection.agencyId);
            }
            if (mVSearchLineGroupSection.mo31470g()) {
                jVar.mo61678B(mVSearchLineGroupSection.items.size());
                for (MVSearchLineGroupItem X0 : mVSearchLineGroupSection.items) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSearchLineGroupSection mVSearchLineGroupSection = (MVSearchLineGroupSection) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVSearchLineGroupSection.routeTypeId = MVRouteType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVSearchLineGroupSection.agencyId = jVar.mo61696i();
                mVSearchLineGroupSection.mo31473i();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVSearchLineGroupSection.items = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVSearchLineGroupItem mVSearchLineGroupItem = new MVSearchLineGroupItem();
                    mVSearchLineGroupItem.mo25201C1(jVar);
                    mVSearchLineGroupSection.items.add(mVSearchLineGroupItem);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchLineGroupSection$d */
    public static class C10430d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10429c(0);
        }
    }

    static {
        new C17394d0("MVSearchLineGroupSection");
        HashMap hashMap = new HashMap();
        f28178e = hashMap;
        hashMap.put(C25239c.class, new C10428b());
        hashMap.put(C25240d.class, new C10430d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ROUTE_TYPE_ID, new FieldMetaData("routeTypeId", (byte) 3, new EnumMetaData(MVRouteType.class)));
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ITEMS, new FieldMetaData("items", (byte) 3, new ListMetaData(new StructMetaData(MVSearchLineGroupItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28179f = unmodifiableMap;
        FieldMetaData.m61947a(MVSearchLineGroupSection.class, unmodifiableMap);
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
        ((C25238b) f28178e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28178e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVSearchLineGroupSection mVSearchLineGroupSection = (MVSearchLineGroupSection) obj;
        if (!getClass().equals(mVSearchLineGroupSection.getClass())) {
            return getClass().getName().compareTo(mVSearchLineGroupSection.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31471h()).compareTo(Boolean.valueOf(mVSearchLineGroupSection.mo31471h()));
        if (compareTo != 0 || ((mo31471h() && (compareTo = this.routeTypeId.compareTo(mVSearchLineGroupSection.routeTypeId)) != 0) || (compareTo = Boolean.valueOf(mo31469f()).compareTo(Boolean.valueOf(mVSearchLineGroupSection.mo31469f()))) != 0 || ((mo31469f() && (compareTo = C25082a.m62839c(this.agencyId, mVSearchLineGroupSection.agencyId)) != 0) || (compareTo = Boolean.valueOf(mo31470g()).compareTo(Boolean.valueOf(mVSearchLineGroupSection.mo31470g()))) != 0))) {
            return compareTo;
        }
        if (!mo31470g() || (h = C25082a.m62844h(this.items, mVSearchLineGroupSection.items)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSearchLineGroupSection)) {
            return false;
        }
        MVSearchLineGroupSection mVSearchLineGroupSection = (MVSearchLineGroupSection) obj;
        boolean h = mo31471h();
        boolean h2 = mVSearchLineGroupSection.mo31471h();
        if ((h || h2) && (!h || !h2 || !this.routeTypeId.equals(mVSearchLineGroupSection.routeTypeId))) {
            return false;
        }
        boolean f = mo31469f();
        boolean f2 = mVSearchLineGroupSection.mo31469f();
        if ((f || f2) && (!f || !f2 || this.agencyId != mVSearchLineGroupSection.agencyId)) {
            return false;
        }
        boolean g = mo31470g();
        boolean g2 = mVSearchLineGroupSection.mo31470g();
        if ((g || g2) && (!g || !g2 || !this.items.equals(mVSearchLineGroupSection.items))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31469f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31470g() {
        return this.items != null;
    }

    /* renamed from: h */
    public final boolean mo31471h() {
        return this.routeTypeId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31473i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSearchLineGroupSection(", "routeTypeId:");
        MVRouteType mVRouteType = this.routeTypeId;
        if (mVRouteType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRouteType);
        }
        if (mo31469f()) {
            n.append(", ");
            n.append("agencyId:");
            n.append(this.agencyId);
        }
        n.append(", ");
        n.append("items:");
        List<MVSearchLineGroupItem> list = this.items;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
