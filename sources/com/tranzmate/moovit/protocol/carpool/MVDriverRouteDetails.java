package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
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

public class MVDriverRouteDetails implements TBase<MVDriverRouteDetails, _Fields>, Serializable, Cloneable, Comparable<MVDriverRouteDetails> {

    /* renamed from: b */
    public static final C25113c f24708b = new C25113c("routeId", (byte) 6, 1);

    /* renamed from: c */
    public static final C25113c f24709c = new C25113c("shape", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f24710d = new C25113c("routeName", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f24711e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24712f;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.SHAPE, _Fields.ROUTE_NAME};
    public short routeId;
    public String routeName;
    public String shape;

    public enum _Fields implements C25085c {
        ROUTE_ID(1, "routeId"),
        SHAPE(2, "shape"),
        ROUTE_NAME(3, "routeName");
        
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
                return ROUTE_ID;
            }
            if (i == 2) {
                return SHAPE;
            }
            if (i != 3) {
                return null;
            }
            return ROUTE_NAME;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVDriverRouteDetails$a */
    public static class C8206a extends C25239c<MVDriverRouteDetails> {
        public C8206a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverRouteDetails mVDriverRouteDetails = (MVDriverRouteDetails) tBase;
            mVDriverRouteDetails.getClass();
            C25113c cVar = MVDriverRouteDetails.f24708b;
            gVar.mo61687K();
            gVar.mo61711x(MVDriverRouteDetails.f24708b);
            gVar.mo61677A(mVDriverRouteDetails.routeId);
            gVar.mo61712y();
            if (mVDriverRouteDetails.shape != null && mVDriverRouteDetails.mo25607h()) {
                gVar.mo61711x(MVDriverRouteDetails.f24709c);
                gVar.mo61686J(mVDriverRouteDetails.shape);
                gVar.mo61712y();
            }
            if (mVDriverRouteDetails.routeName != null && mVDriverRouteDetails.mo25606g()) {
                gVar.mo61711x(MVDriverRouteDetails.f24710d);
                gVar.mo61686J(mVDriverRouteDetails.routeName);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverRouteDetails mVDriverRouteDetails = (MVDriverRouteDetails) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDriverRouteDetails.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVDriverRouteDetails.routeName = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVDriverRouteDetails.shape = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 6) {
                    mVDriverRouteDetails.routeId = gVar.mo61695h();
                    mVDriverRouteDetails.mo25609i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVDriverRouteDetails$b */
    public static class C8207b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8206a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVDriverRouteDetails$c */
    public static class C8208c extends C25240d<MVDriverRouteDetails> {
        public C8208c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverRouteDetails mVDriverRouteDetails = (MVDriverRouteDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDriverRouteDetails.mo25605f()) {
                bitSet.set(0);
            }
            if (mVDriverRouteDetails.mo25607h()) {
                bitSet.set(1);
            }
            if (mVDriverRouteDetails.mo25606g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVDriverRouteDetails.mo25605f()) {
                jVar.mo61677A(mVDriverRouteDetails.routeId);
            }
            if (mVDriverRouteDetails.mo25607h()) {
                jVar.mo61686J(mVDriverRouteDetails.shape);
            }
            if (mVDriverRouteDetails.mo25606g()) {
                jVar.mo61686J(mVDriverRouteDetails.routeName);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverRouteDetails mVDriverRouteDetails = (MVDriverRouteDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVDriverRouteDetails.routeId = jVar.mo61695h();
                mVDriverRouteDetails.mo25609i();
            }
            if (T.get(1)) {
                mVDriverRouteDetails.shape = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVDriverRouteDetails.routeName = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVDriverRouteDetails$d */
    public static class C8209d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8208c(0);
        }
    }

    static {
        new C17394d0("MVDriverRouteDetails");
        HashMap hashMap = new HashMap();
        f24711e = hashMap;
        hashMap.put(C25239c.class, new C8207b());
        hashMap.put(C25240d.class, new C8209d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ROUTE_ID, new FieldMetaData("routeId", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.SHAPE, new FieldMetaData("shape", (byte) 2, new FieldValueMetaData((byte) 11, "GoogleEncodedPolygon")));
        enumMap.put(_Fields.ROUTE_NAME, new FieldMetaData("routeName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24712f = unmodifiableMap;
        FieldMetaData.m61947a(MVDriverRouteDetails.class, unmodifiableMap);
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
        ((C25238b) f24711e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24711e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDriverRouteDetails mVDriverRouteDetails = (MVDriverRouteDetails) obj;
        if (!getClass().equals(mVDriverRouteDetails.getClass())) {
            return getClass().getName().compareTo(mVDriverRouteDetails.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25605f()).compareTo(Boolean.valueOf(mVDriverRouteDetails.mo25605f()));
        if (compareTo2 != 0 || ((mo25605f() && (compareTo2 = C25082a.m62847k(this.routeId, mVDriverRouteDetails.routeId)) != 0) || (compareTo2 = Boolean.valueOf(mo25607h()).compareTo(Boolean.valueOf(mVDriverRouteDetails.mo25607h()))) != 0 || ((mo25607h() && (compareTo2 = this.shape.compareTo(mVDriverRouteDetails.shape)) != 0) || (compareTo2 = Boolean.valueOf(mo25606g()).compareTo(Boolean.valueOf(mVDriverRouteDetails.mo25606g()))) != 0))) {
            return compareTo2;
        }
        if (!mo25606g() || (compareTo = this.routeName.compareTo(mVDriverRouteDetails.routeName)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDriverRouteDetails)) {
            return false;
        }
        MVDriverRouteDetails mVDriverRouteDetails = (MVDriverRouteDetails) obj;
        if (this.routeId != mVDriverRouteDetails.routeId) {
            return false;
        }
        boolean h = mo25607h();
        boolean h2 = mVDriverRouteDetails.mo25607h();
        if ((h || h2) && (!h || !h2 || !this.shape.equals(mVDriverRouteDetails.shape))) {
            return false;
        }
        boolean g = mo25606g();
        boolean g2 = mVDriverRouteDetails.mo25606g();
        if ((g || g2) && (!g || !g2 || !this.routeName.equals(mVDriverRouteDetails.routeName))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25605f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo25606g() {
        return this.routeName != null;
    }

    /* renamed from: h */
    public final boolean mo25607h() {
        return this.shape != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo25609i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDriverRouteDetails(", "routeId:");
        n.append(this.routeId);
        if (mo25607h()) {
            n.append(", ");
            n.append("shape:");
            String str = this.shape;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo25606g()) {
            n.append(", ");
            n.append("routeName:");
            String str2 = this.routeName;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
