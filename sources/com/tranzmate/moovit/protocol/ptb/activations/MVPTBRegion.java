package com.tranzmate.moovit.protocol.ptb.activations;

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

public class MVPTBRegion implements TBase<MVPTBRegion, _Fields>, Serializable, Cloneable, Comparable<MVPTBRegion> {

    /* renamed from: b */
    public static final C25113c f27939b = new C25113c("regionId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27940c = new C25113c("polygons", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f27941d = new C25113c("name", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f27942e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27943f;
    private byte __isset_bitfield = 0;
    public String name;
    public List<String> polygons;
    public int regionId;

    public enum _Fields implements C25085c {
        REGION_ID(1, "regionId"),
        POLYGONS(2, "polygons"),
        NAME(3, "name");
        
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
                return REGION_ID;
            }
            if (i == 2) {
                return POLYGONS;
            }
            if (i != 3) {
                return null;
            }
            return NAME;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegion$a */
    public static class C10242a extends C25239c<MVPTBRegion> {
        public C10242a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBRegion mVPTBRegion = (MVPTBRegion) tBase;
            mVPTBRegion.getClass();
            C25113c cVar = MVPTBRegion.f27939b;
            gVar.mo61687K();
            gVar.mo61711x(MVPTBRegion.f27939b);
            gVar.mo61678B(mVPTBRegion.regionId);
            gVar.mo61712y();
            if (mVPTBRegion.polygons != null) {
                gVar.mo61711x(MVPTBRegion.f27940c);
                gVar.mo61680D(new C25119e((byte) 11, mVPTBRegion.polygons.size()));
                for (String J : mVPTBRegion.polygons) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPTBRegion.name != null) {
                gVar.mo61711x(MVPTBRegion.f27941d);
                gVar.mo61686J(mVPTBRegion.name);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBRegion mVPTBRegion = (MVPTBRegion) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPTBRegion.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVPTBRegion.name = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVPTBRegion.polygons = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            mVPTBRegion.polygons.add(gVar.mo61704q());
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPTBRegion.regionId = gVar.mo61696i();
                    mVPTBRegion.mo31035i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegion$b */
    public static class C10243b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10242a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegion$c */
    public static class C10244c extends C25240d<MVPTBRegion> {
        public C10244c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBRegion mVPTBRegion = (MVPTBRegion) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBRegion.mo31033h()) {
                bitSet.set(0);
            }
            if (mVPTBRegion.mo31032g()) {
                bitSet.set(1);
            }
            if (mVPTBRegion.mo31031f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPTBRegion.mo31033h()) {
                jVar.mo61678B(mVPTBRegion.regionId);
            }
            if (mVPTBRegion.mo31032g()) {
                jVar.mo61678B(mVPTBRegion.polygons.size());
                for (String J : mVPTBRegion.polygons) {
                    jVar.mo61686J(J);
                }
            }
            if (mVPTBRegion.mo31031f()) {
                jVar.mo61686J(mVPTBRegion.name);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBRegion mVPTBRegion = (MVPTBRegion) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPTBRegion.regionId = jVar.mo61696i();
                mVPTBRegion.mo31035i();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVPTBRegion.polygons = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVPTBRegion.polygons.add(jVar.mo61704q());
                }
            }
            if (T.get(2)) {
                mVPTBRegion.name = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegion$d */
    public static class C10245d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10244c(0);
        }
    }

    static {
        new C17394d0("MVPTBRegion");
        HashMap hashMap = new HashMap();
        f27942e = hashMap;
        hashMap.put(C25239c.class, new C10243b());
        hashMap.put(C25240d.class, new C10245d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REGION_ID, new FieldMetaData("regionId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.POLYGONS, new FieldMetaData("polygons", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27943f = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBRegion.class, unmodifiableMap);
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
        ((C25238b) f27942e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27942e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBRegion mVPTBRegion = (MVPTBRegion) obj;
        if (!getClass().equals(mVPTBRegion.getClass())) {
            return getClass().getName().compareTo(mVPTBRegion.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31033h()).compareTo(Boolean.valueOf(mVPTBRegion.mo31033h()));
        if (compareTo2 != 0 || ((mo31033h() && (compareTo2 = C25082a.m62839c(this.regionId, mVPTBRegion.regionId)) != 0) || (compareTo2 = Boolean.valueOf(mo31032g()).compareTo(Boolean.valueOf(mVPTBRegion.mo31032g()))) != 0 || ((mo31032g() && (compareTo2 = C25082a.m62844h(this.polygons, mVPTBRegion.polygons)) != 0) || (compareTo2 = Boolean.valueOf(mo31031f()).compareTo(Boolean.valueOf(mVPTBRegion.mo31031f()))) != 0))) {
            return compareTo2;
        }
        if (!mo31031f() || (compareTo = this.name.compareTo(mVPTBRegion.name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBRegion)) {
            return false;
        }
        MVPTBRegion mVPTBRegion = (MVPTBRegion) obj;
        if (this.regionId != mVPTBRegion.regionId) {
            return false;
        }
        boolean g = mo31032g();
        boolean g2 = mVPTBRegion.mo31032g();
        if ((g || g2) && (!g || !g2 || !this.polygons.equals(mVPTBRegion.polygons))) {
            return false;
        }
        boolean f = mo31031f();
        boolean f2 = mVPTBRegion.mo31031f();
        if ((f || f2) && (!f || !f2 || !this.name.equals(mVPTBRegion.name))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31031f() {
        return this.name != null;
    }

    /* renamed from: g */
    public final boolean mo31032g() {
        return this.polygons != null;
    }

    /* renamed from: h */
    public final boolean mo31033h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31035i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBRegion(", "regionId:");
        C0016g.m42z(n, this.regionId, ", ", "polygons:");
        List<String> list = this.polygons;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
