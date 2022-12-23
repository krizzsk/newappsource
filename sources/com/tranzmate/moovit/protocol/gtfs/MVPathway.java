package com.tranzmate.moovit.protocol.gtfs;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVPathway implements TBase<MVPathway, _Fields>, Serializable, Cloneable, Comparable<MVPathway> {

    /* renamed from: b */
    public static final C25113c f25776b = new C25113c("pathwayId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25777c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25778d = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f25779e = new C25113c("type", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f25780f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f25781g;
    private byte __isset_bitfield = 0;
    public MVLatLon location;
    public String name;
    private _Fields[] optionals = {_Fields.NAME};
    public int pathwayId;
    public MVPathwayType type;

    public enum _Fields implements C25085c {
        PATHWAY_ID(1, "pathwayId"),
        NAME(2, "name"),
        LOCATION(3, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        TYPE(4, "type");
        
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
                return PATHWAY_ID;
            }
            if (i == 2) {
                return NAME;
            }
            if (i == 3) {
                return LOCATION;
            }
            if (i != 4) {
                return null;
            }
            return TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVPathway$a */
    public static class C8815a extends C25239c<MVPathway> {
        public C8815a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPathway mVPathway = (MVPathway) tBase;
            MVLatLon mVLatLon = mVPathway.location;
            C25113c cVar = MVPathway.f25776b;
            gVar.mo61687K();
            gVar.mo61711x(MVPathway.f25776b);
            gVar.mo61678B(mVPathway.pathwayId);
            gVar.mo61712y();
            if (mVPathway.name != null && mVPathway.mo27472g()) {
                gVar.mo61711x(MVPathway.f25777c);
                gVar.mo61686J(mVPathway.name);
                gVar.mo61712y();
            }
            if (mVPathway.location != null) {
                gVar.mo61711x(MVPathway.f25778d);
                mVPathway.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPathway.type != null) {
                gVar.mo61711x(MVPathway.f25779e);
                gVar.mo61678B(mVPathway.type.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPathway mVPathway = (MVPathway) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVPathway.location;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVPathway.type = MVPathwayType.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVPathway.location = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPathway.name = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPathway.pathwayId = gVar.mo61696i();
                    mVPathway.mo27476j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVPathway$b */
    public static class C8816b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8815a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVPathway$c */
    public static class C8817c extends C25240d<MVPathway> {
        public C8817c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPathway mVPathway = (MVPathway) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPathway.mo27473h()) {
                bitSet.set(0);
            }
            if (mVPathway.mo27472g()) {
                bitSet.set(1);
            }
            if (mVPathway.mo27471f()) {
                bitSet.set(2);
            }
            if (mVPathway.mo27475i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVPathway.mo27473h()) {
                jVar.mo61678B(mVPathway.pathwayId);
            }
            if (mVPathway.mo27472g()) {
                jVar.mo61686J(mVPathway.name);
            }
            if (mVPathway.mo27471f()) {
                mVPathway.location.mo25202X0(jVar);
            }
            if (mVPathway.mo27475i()) {
                jVar.mo61678B(mVPathway.type.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPathway mVPathway = (MVPathway) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVPathway.pathwayId = jVar.mo61696i();
                mVPathway.mo27476j();
            }
            if (T.get(1)) {
                mVPathway.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVPathway.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVPathway.type = MVPathwayType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVPathway$d */
    public static class C8818d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8817c(0);
        }
    }

    static {
        new C17394d0("MVPathway");
        HashMap hashMap = new HashMap();
        f25780f = hashMap;
        hashMap.put(C25239c.class, new C8816b());
        hashMap.put(C25240d.class, new C8818d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PATHWAY_ID, new FieldMetaData("pathwayId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVPathwayType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25781g = unmodifiableMap;
        FieldMetaData.m61947a(MVPathway.class, unmodifiableMap);
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
        ((C25238b) f25780f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25780f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo27468a(MVPathway mVPathway) {
        if (mVPathway == null || this.pathwayId != mVPathway.pathwayId) {
            return false;
        }
        boolean g = mo27472g();
        boolean g2 = mVPathway.mo27472g();
        if ((g || g2) && (!g || !g2 || !this.name.equals(mVPathway.name))) {
            return false;
        }
        boolean f = mo27471f();
        boolean f2 = mVPathway.mo27471f();
        if ((f || f2) && (!f || !f2 || !this.location.mo26290a(mVPathway.location))) {
            return false;
        }
        boolean i = mo27475i();
        boolean i2 = mVPathway.mo27475i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.type.equals(mVPathway.type)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPathway mVPathway = (MVPathway) obj;
        if (!getClass().equals(mVPathway.getClass())) {
            return getClass().getName().compareTo(mVPathway.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27473h()).compareTo(Boolean.valueOf(mVPathway.mo27473h()));
        if (compareTo2 != 0 || ((mo27473h() && (compareTo2 = C25082a.m62839c(this.pathwayId, mVPathway.pathwayId)) != 0) || (compareTo2 = Boolean.valueOf(mo27472g()).compareTo(Boolean.valueOf(mVPathway.mo27472g()))) != 0 || ((mo27472g() && (compareTo2 = this.name.compareTo(mVPathway.name)) != 0) || (compareTo2 = Boolean.valueOf(mo27471f()).compareTo(Boolean.valueOf(mVPathway.mo27471f()))) != 0 || ((mo27471f() && (compareTo2 = this.location.compareTo(mVPathway.location)) != 0) || (compareTo2 = Boolean.valueOf(mo27475i()).compareTo(Boolean.valueOf(mVPathway.mo27475i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo27475i() || (compareTo = this.type.compareTo(mVPathway.type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPathway)) {
            return mo27468a((MVPathway) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27471f() {
        return this.location != null;
    }

    /* renamed from: g */
    public final boolean mo27472g() {
        return this.name != null;
    }

    /* renamed from: h */
    public final boolean mo27473h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27475i() {
        return this.type != null;
    }

    /* renamed from: j */
    public final void mo27476j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPathway(", "pathwayId:");
        n.append(this.pathwayId);
        if (mo27472g()) {
            n.append(", ");
            n.append("name:");
            String str = this.name;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("type:");
        MVPathwayType mVPathwayType = this.type;
        if (mVPathwayType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPathwayType);
        }
        n.append(")");
        return n.toString();
    }
}
