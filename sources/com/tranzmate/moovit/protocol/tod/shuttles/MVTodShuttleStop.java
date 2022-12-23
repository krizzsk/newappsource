package com.tranzmate.moovit.protocol.tod.shuttles;

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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
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

public class MVTodShuttleStop implements TBase<MVTodShuttleStop, _Fields>, Serializable, Cloneable, Comparable<MVTodShuttleStop> {

    /* renamed from: b */
    public static final C25113c f29746b = new C25113c("stopId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29747c = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29748d = new C25113c("name", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f29749e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29750f;
    private byte __isset_bitfield = 0;
    public MVLatLon location;
    public String name;
    public int stopId;

    public enum _Fields implements C25085c {
        STOP_ID(1, "stopId"),
        LOCATION(2, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
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
                return STOP_ID;
            }
            if (i == 2) {
                return LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttleStop$a */
    public static class C11439a extends C25239c<MVTodShuttleStop> {
        public C11439a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttleStop mVTodShuttleStop = (MVTodShuttleStop) tBase;
            MVLatLon mVLatLon = mVTodShuttleStop.location;
            C25113c cVar = MVTodShuttleStop.f29746b;
            gVar.mo61687K();
            gVar.mo61711x(MVTodShuttleStop.f29746b);
            gVar.mo61678B(mVTodShuttleStop.stopId);
            gVar.mo61712y();
            if (mVTodShuttleStop.location != null) {
                gVar.mo61711x(MVTodShuttleStop.f29747c);
                mVTodShuttleStop.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodShuttleStop.name != null) {
                gVar.mo61711x(MVTodShuttleStop.f29748d);
                gVar.mo61686J(mVTodShuttleStop.name);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttleStop mVTodShuttleStop = (MVTodShuttleStop) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVTodShuttleStop.location;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVTodShuttleStop.name = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVLatLon mVLatLon2 = new MVLatLon();
                        mVTodShuttleStop.location = mVLatLon2;
                        mVLatLon2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTodShuttleStop.stopId = gVar.mo61696i();
                    mVTodShuttleStop.mo34021i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttleStop$b */
    public static class C11440b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11439a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttleStop$c */
    public static class C11441c extends C25240d<MVTodShuttleStop> {
        public C11441c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttleStop mVTodShuttleStop = (MVTodShuttleStop) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodShuttleStop.mo34019h()) {
                bitSet.set(0);
            }
            if (mVTodShuttleStop.mo34017f()) {
                bitSet.set(1);
            }
            if (mVTodShuttleStop.mo34018g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTodShuttleStop.mo34019h()) {
                jVar.mo61678B(mVTodShuttleStop.stopId);
            }
            if (mVTodShuttleStop.mo34017f()) {
                mVTodShuttleStop.location.mo25202X0(jVar);
            }
            if (mVTodShuttleStop.mo34018g()) {
                jVar.mo61686J(mVTodShuttleStop.name);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttleStop mVTodShuttleStop = (MVTodShuttleStop) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTodShuttleStop.stopId = jVar.mo61696i();
                mVTodShuttleStop.mo34021i();
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVTodShuttleStop.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVTodShuttleStop.name = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttleStop$d */
    public static class C11442d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11441c(0);
        }
    }

    static {
        new C17394d0("MVTodShuttleStop");
        HashMap hashMap = new HashMap();
        f29749e = hashMap;
        hashMap.put(C25239c.class, new C11440b());
        hashMap.put(C25240d.class, new C11442d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29750f = unmodifiableMap;
        FieldMetaData.m61947a(MVTodShuttleStop.class, unmodifiableMap);
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
        ((C25238b) f29749e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29749e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodShuttleStop mVTodShuttleStop = (MVTodShuttleStop) obj;
        if (!getClass().equals(mVTodShuttleStop.getClass())) {
            return getClass().getName().compareTo(mVTodShuttleStop.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34019h()).compareTo(Boolean.valueOf(mVTodShuttleStop.mo34019h()));
        if (compareTo2 != 0 || ((mo34019h() && (compareTo2 = C25082a.m62839c(this.stopId, mVTodShuttleStop.stopId)) != 0) || (compareTo2 = Boolean.valueOf(mo34017f()).compareTo(Boolean.valueOf(mVTodShuttleStop.mo34017f()))) != 0 || ((mo34017f() && (compareTo2 = this.location.compareTo(mVTodShuttleStop.location)) != 0) || (compareTo2 = Boolean.valueOf(mo34018g()).compareTo(Boolean.valueOf(mVTodShuttleStop.mo34018g()))) != 0))) {
            return compareTo2;
        }
        if (!mo34018g() || (compareTo = this.name.compareTo(mVTodShuttleStop.name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodShuttleStop)) {
            return false;
        }
        MVTodShuttleStop mVTodShuttleStop = (MVTodShuttleStop) obj;
        if (this.stopId != mVTodShuttleStop.stopId) {
            return false;
        }
        boolean f = mo34017f();
        boolean f2 = mVTodShuttleStop.mo34017f();
        if ((f || f2) && (!f || !f2 || !this.location.mo26290a(mVTodShuttleStop.location))) {
            return false;
        }
        boolean g = mo34018g();
        boolean g2 = mVTodShuttleStop.mo34018g();
        if ((g || g2) && (!g || !g2 || !this.name.equals(mVTodShuttleStop.name))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34017f() {
        return this.location != null;
    }

    /* renamed from: g */
    public final boolean mo34018g() {
        return this.name != null;
    }

    /* renamed from: h */
    public final boolean mo34019h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo34021i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodShuttleStop(", "stopId:");
        C0016g.m42z(n, this.stopId, ", ", "location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
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
