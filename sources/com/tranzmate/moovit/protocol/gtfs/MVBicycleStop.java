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

public class MVBicycleStop implements TBase<MVBicycleStop, _Fields>, Serializable, Cloneable, Comparable<MVBicycleStop> {

    /* renamed from: b */
    public static final C25113c f25688b = new C25113c("stopId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25689c = new C25113c("providerId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25690d = new C25113c("name", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f25691e = new C25113c("address", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f25692f = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f25693g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25694h;
    private byte __isset_bitfield = 0;
    public String address;
    public MVLatLon location;
    public String name;
    private _Fields[] optionals = {_Fields.ADDRESS};
    public int providerId;
    public int stopId;

    public enum _Fields implements C25085c {
        STOP_ID(1, "stopId"),
        PROVIDER_ID(2, "providerId"),
        NAME(3, "name"),
        ADDRESS(4, "address"),
        LOCATION(5, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        
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
                return PROVIDER_ID;
            }
            if (i == 3) {
                return NAME;
            }
            if (i == 4) {
                return ADDRESS;
            }
            if (i != 5) {
                return null;
            }
            return LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVBicycleStop$a */
    public static class C8771a extends C25239c<MVBicycleStop> {
        public C8771a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBicycleStop mVBicycleStop = (MVBicycleStop) tBase;
            MVLatLon mVLatLon = mVBicycleStop.location;
            C25113c cVar = MVBicycleStop.f25688b;
            gVar.mo61687K();
            gVar.mo61711x(MVBicycleStop.f25688b);
            gVar.mo61678B(mVBicycleStop.stopId);
            gVar.mo61712y();
            gVar.mo61711x(MVBicycleStop.f25689c);
            gVar.mo61678B(mVBicycleStop.providerId);
            gVar.mo61712y();
            if (mVBicycleStop.name != null) {
                gVar.mo61711x(MVBicycleStop.f25690d);
                gVar.mo61686J(mVBicycleStop.name);
                gVar.mo61712y();
            }
            if (mVBicycleStop.address != null && mVBicycleStop.mo27328f()) {
                gVar.mo61711x(MVBicycleStop.f25691e);
                gVar.mo61686J(mVBicycleStop.address);
                gVar.mo61712y();
            }
            if (mVBicycleStop.location != null) {
                gVar.mo61711x(MVBicycleStop.f25692f);
                mVBicycleStop.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBicycleStop mVBicycleStop = (MVBicycleStop) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVBicycleStop.location;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVLatLon mVLatLon2 = new MVLatLon();
                                    mVBicycleStop.location = mVLatLon2;
                                    mVLatLon2.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVBicycleStop.address = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVBicycleStop.name = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVBicycleStop.providerId = gVar.mo61696i();
                        mVBicycleStop.mo27334k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVBicycleStop.stopId = gVar.mo61696i();
                    mVBicycleStop.mo27335l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVBicycleStop$b */
    public static class C8772b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8771a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVBicycleStop$c */
    public static class C8773c extends C25240d<MVBicycleStop> {
        public C8773c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBicycleStop mVBicycleStop = (MVBicycleStop) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBicycleStop.mo27333j()) {
                bitSet.set(0);
            }
            if (mVBicycleStop.mo27332i()) {
                bitSet.set(1);
            }
            if (mVBicycleStop.mo27330h()) {
                bitSet.set(2);
            }
            if (mVBicycleStop.mo27328f()) {
                bitSet.set(3);
            }
            if (mVBicycleStop.mo27329g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVBicycleStop.mo27333j()) {
                jVar.mo61678B(mVBicycleStop.stopId);
            }
            if (mVBicycleStop.mo27332i()) {
                jVar.mo61678B(mVBicycleStop.providerId);
            }
            if (mVBicycleStop.mo27330h()) {
                jVar.mo61686J(mVBicycleStop.name);
            }
            if (mVBicycleStop.mo27328f()) {
                jVar.mo61686J(mVBicycleStop.address);
            }
            if (mVBicycleStop.mo27329g()) {
                mVBicycleStop.location.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBicycleStop mVBicycleStop = (MVBicycleStop) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVBicycleStop.stopId = jVar.mo61696i();
                mVBicycleStop.mo27335l();
            }
            if (T.get(1)) {
                mVBicycleStop.providerId = jVar.mo61696i();
                mVBicycleStop.mo27334k();
            }
            if (T.get(2)) {
                mVBicycleStop.name = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVBicycleStop.address = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVBicycleStop.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVBicycleStop$d */
    public static class C8774d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8773c(0);
        }
    }

    static {
        new C17394d0("MVBicycleStop");
        HashMap hashMap = new HashMap();
        f25693g = hashMap;
        hashMap.put(C25239c.class, new C8772b());
        hashMap.put(C25240d.class, new C8774d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ADDRESS, new FieldMetaData("address", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25694h = unmodifiableMap;
        FieldMetaData.m61947a(MVBicycleStop.class, unmodifiableMap);
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
        ((C25238b) f25693g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25693g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVBicycleStop mVBicycleStop = (MVBicycleStop) obj;
        if (!getClass().equals(mVBicycleStop.getClass())) {
            return getClass().getName().compareTo(mVBicycleStop.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27333j()).compareTo(Boolean.valueOf(mVBicycleStop.mo27333j()));
        if (compareTo2 != 0 || ((mo27333j() && (compareTo2 = C25082a.m62839c(this.stopId, mVBicycleStop.stopId)) != 0) || (compareTo2 = Boolean.valueOf(mo27332i()).compareTo(Boolean.valueOf(mVBicycleStop.mo27332i()))) != 0 || ((mo27332i() && (compareTo2 = C25082a.m62839c(this.providerId, mVBicycleStop.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo27330h()).compareTo(Boolean.valueOf(mVBicycleStop.mo27330h()))) != 0 || ((mo27330h() && (compareTo2 = this.name.compareTo(mVBicycleStop.name)) != 0) || (compareTo2 = Boolean.valueOf(mo27328f()).compareTo(Boolean.valueOf(mVBicycleStop.mo27328f()))) != 0 || ((mo27328f() && (compareTo2 = this.address.compareTo(mVBicycleStop.address)) != 0) || (compareTo2 = Boolean.valueOf(mo27329g()).compareTo(Boolean.valueOf(mVBicycleStop.mo27329g()))) != 0))))) {
            return compareTo2;
        }
        if (!mo27329g() || (compareTo = this.location.compareTo(mVBicycleStop.location)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVBicycleStop)) {
            return false;
        }
        MVBicycleStop mVBicycleStop = (MVBicycleStop) obj;
        if (this.stopId != mVBicycleStop.stopId || this.providerId != mVBicycleStop.providerId) {
            return false;
        }
        boolean h = mo27330h();
        boolean h2 = mVBicycleStop.mo27330h();
        if ((h || h2) && (!h || !h2 || !this.name.equals(mVBicycleStop.name))) {
            return false;
        }
        boolean f = mo27328f();
        boolean f2 = mVBicycleStop.mo27328f();
        if ((f || f2) && (!f || !f2 || !this.address.equals(mVBicycleStop.address))) {
            return false;
        }
        boolean g = mo27329g();
        boolean g2 = mVBicycleStop.mo27329g();
        if ((g || g2) && (!g || !g2 || !this.location.mo26290a(mVBicycleStop.location))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27328f() {
        return this.address != null;
    }

    /* renamed from: g */
    public final boolean mo27329g() {
        return this.location != null;
    }

    /* renamed from: h */
    public final boolean mo27330h() {
        return this.name != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27332i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo27333j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo27334k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo27335l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBicycleStop(", "stopId:");
        C0016g.m42z(n, this.stopId, ", ", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo27328f()) {
            n.append(", ");
            n.append("address:");
            String str2 = this.address;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
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
        n.append(")");
        return n.toString();
    }
}
