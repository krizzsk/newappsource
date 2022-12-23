package com.tranzmate.moovit.busdriver;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
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
import p001a0.C0017h;
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

public class MVDriverLocationUpdateRequest implements TBase<MVDriverLocationUpdateRequest, _Fields>, Serializable, Cloneable, Comparable<MVDriverLocationUpdateRequest> {

    /* renamed from: b */
    public static final C25113c f24503b = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24504c = new C25113c("sampleAge", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f24505d = new C25113c("agencyId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f24506e = new C25113c("vehicleId", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f24507f = new C25113c("isRT", (byte) 2, 5);

    /* renamed from: g */
    public static final HashMap f24508g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f24509h;
    private byte __isset_bitfield = 0;
    public int agencyId;
    public boolean isRT;
    public MVGpsLocation location;
    private _Fields[] optionals = {_Fields.AGENCY_ID, _Fields.VEHICLE_ID};
    public int sampleAge;
    public String vehicleId;

    public enum _Fields implements C25085c {
        LOCATION(1, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        SAMPLE_AGE(2, "sampleAge"),
        AGENCY_ID(3, "agencyId"),
        VEHICLE_ID(4, "vehicleId"),
        IS_RT(5, "isRT");
        
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
                return LOCATION;
            }
            if (i == 2) {
                return SAMPLE_AGE;
            }
            if (i == 3) {
                return AGENCY_ID;
            }
            if (i == 4) {
                return VEHICLE_ID;
            }
            if (i != 5) {
                return null;
            }
            return IS_RT;
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

    /* renamed from: com.tranzmate.moovit.busdriver.MVDriverLocationUpdateRequest$a */
    public static class C8057a extends C25239c<MVDriverLocationUpdateRequest> {
        public C8057a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverLocationUpdateRequest mVDriverLocationUpdateRequest = (MVDriverLocationUpdateRequest) tBase;
            MVGpsLocation mVGpsLocation = mVDriverLocationUpdateRequest.location;
            if (mVGpsLocation != null) {
                mVGpsLocation.mo26193r();
            }
            C25113c cVar = MVDriverLocationUpdateRequest.f24503b;
            gVar.mo61687K();
            if (mVDriverLocationUpdateRequest.location != null) {
                gVar.mo61711x(MVDriverLocationUpdateRequest.f24503b);
                mVDriverLocationUpdateRequest.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDriverLocationUpdateRequest.f24504c);
            gVar.mo61678B(mVDriverLocationUpdateRequest.sampleAge);
            gVar.mo61712y();
            if (mVDriverLocationUpdateRequest.mo25205f()) {
                gVar.mo61711x(MVDriverLocationUpdateRequest.f24505d);
                gVar.mo61678B(mVDriverLocationUpdateRequest.agencyId);
                gVar.mo61712y();
            }
            if (mVDriverLocationUpdateRequest.vehicleId != null && mVDriverLocationUpdateRequest.mo25210j()) {
                gVar.mo61711x(MVDriverLocationUpdateRequest.f24506e);
                gVar.mo61686J(mVDriverLocationUpdateRequest.vehicleId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDriverLocationUpdateRequest.f24507f);
            C0017h.m62S(gVar, mVDriverLocationUpdateRequest.isRT);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverLocationUpdateRequest mVDriverLocationUpdateRequest = (MVDriverLocationUpdateRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 2) {
                                    mVDriverLocationUpdateRequest.isRT = gVar.mo61690c();
                                    mVDriverLocationUpdateRequest.mo25212l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVDriverLocationUpdateRequest.vehicleId = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVDriverLocationUpdateRequest.agencyId = gVar.mo61696i();
                            mVDriverLocationUpdateRequest.mo25211k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVDriverLocationUpdateRequest.sampleAge = gVar.mo61696i();
                        mVDriverLocationUpdateRequest.mo25213m();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVGpsLocation mVGpsLocation = new MVGpsLocation();
                    mVDriverLocationUpdateRequest.location = mVGpsLocation;
                    mVGpsLocation.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVGpsLocation mVGpsLocation2 = mVDriverLocationUpdateRequest.location;
            if (mVGpsLocation2 != null) {
                mVGpsLocation2.mo26193r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.busdriver.MVDriverLocationUpdateRequest$b */
    public static class C8058b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8057a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.busdriver.MVDriverLocationUpdateRequest$c */
    public static class C8059c extends C25240d<MVDriverLocationUpdateRequest> {
        public C8059c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverLocationUpdateRequest mVDriverLocationUpdateRequest = (MVDriverLocationUpdateRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDriverLocationUpdateRequest.mo25207h()) {
                bitSet.set(0);
            }
            if (mVDriverLocationUpdateRequest.mo25209i()) {
                bitSet.set(1);
            }
            if (mVDriverLocationUpdateRequest.mo25205f()) {
                bitSet.set(2);
            }
            if (mVDriverLocationUpdateRequest.mo25210j()) {
                bitSet.set(3);
            }
            if (mVDriverLocationUpdateRequest.mo25206g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVDriverLocationUpdateRequest.mo25207h()) {
                mVDriverLocationUpdateRequest.location.mo25202X0(jVar);
            }
            if (mVDriverLocationUpdateRequest.mo25209i()) {
                jVar.mo61678B(mVDriverLocationUpdateRequest.sampleAge);
            }
            if (mVDriverLocationUpdateRequest.mo25205f()) {
                jVar.mo61678B(mVDriverLocationUpdateRequest.agencyId);
            }
            if (mVDriverLocationUpdateRequest.mo25210j()) {
                jVar.mo61686J(mVDriverLocationUpdateRequest.vehicleId);
            }
            if (mVDriverLocationUpdateRequest.mo25206g()) {
                jVar.mo61708u(mVDriverLocationUpdateRequest.isRT);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverLocationUpdateRequest mVDriverLocationUpdateRequest = (MVDriverLocationUpdateRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVDriverLocationUpdateRequest.location = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVDriverLocationUpdateRequest.sampleAge = jVar.mo61696i();
                mVDriverLocationUpdateRequest.mo25213m();
            }
            if (T.get(2)) {
                mVDriverLocationUpdateRequest.agencyId = jVar.mo61696i();
                mVDriverLocationUpdateRequest.mo25211k();
            }
            if (T.get(3)) {
                mVDriverLocationUpdateRequest.vehicleId = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVDriverLocationUpdateRequest.isRT = jVar.mo61690c();
                mVDriverLocationUpdateRequest.mo25212l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.busdriver.MVDriverLocationUpdateRequest$d */
    public static class C8060d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8059c(0);
        }
    }

    static {
        new C17394d0("MVDriverLocationUpdateRequest");
        HashMap hashMap = new HashMap();
        f24508g = hashMap;
        hashMap.put(C25239c.class, new C8058b());
        hashMap.put(C25240d.class, new C8060d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVGpsLocation.class)));
        enumMap.put(_Fields.SAMPLE_AGE, new FieldMetaData("sampleAge", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.VEHICLE_ID, new FieldMetaData("vehicleId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_RT, new FieldMetaData("isRT", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24509h = unmodifiableMap;
        FieldMetaData.m61947a(MVDriverLocationUpdateRequest.class, unmodifiableMap);
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
        ((C25238b) f24508g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24508g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVDriverLocationUpdateRequest mVDriverLocationUpdateRequest = (MVDriverLocationUpdateRequest) obj;
        if (!getClass().equals(mVDriverLocationUpdateRequest.getClass())) {
            return getClass().getName().compareTo(mVDriverLocationUpdateRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25207h()).compareTo(Boolean.valueOf(mVDriverLocationUpdateRequest.mo25207h()));
        if (compareTo != 0 || ((mo25207h() && (compareTo = this.location.compareTo(mVDriverLocationUpdateRequest.location)) != 0) || (compareTo = Boolean.valueOf(mo25209i()).compareTo(Boolean.valueOf(mVDriverLocationUpdateRequest.mo25209i()))) != 0 || ((mo25209i() && (compareTo = C25082a.m62839c(this.sampleAge, mVDriverLocationUpdateRequest.sampleAge)) != 0) || (compareTo = Boolean.valueOf(mo25205f()).compareTo(Boolean.valueOf(mVDriverLocationUpdateRequest.mo25205f()))) != 0 || ((mo25205f() && (compareTo = C25082a.m62839c(this.agencyId, mVDriverLocationUpdateRequest.agencyId)) != 0) || (compareTo = Boolean.valueOf(mo25210j()).compareTo(Boolean.valueOf(mVDriverLocationUpdateRequest.mo25210j()))) != 0 || ((mo25210j() && (compareTo = this.vehicleId.compareTo(mVDriverLocationUpdateRequest.vehicleId)) != 0) || (compareTo = Boolean.valueOf(mo25206g()).compareTo(Boolean.valueOf(mVDriverLocationUpdateRequest.mo25206g()))) != 0))))) {
            return compareTo;
        }
        if (!mo25206g() || (l = C25082a.m62848l(this.isRT, mVDriverLocationUpdateRequest.isRT)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDriverLocationUpdateRequest)) {
            return false;
        }
        MVDriverLocationUpdateRequest mVDriverLocationUpdateRequest = (MVDriverLocationUpdateRequest) obj;
        boolean h = mo25207h();
        boolean h2 = mVDriverLocationUpdateRequest.mo25207h();
        if (((h || h2) && (!h || !h2 || !this.location.mo26178a(mVDriverLocationUpdateRequest.location))) || this.sampleAge != mVDriverLocationUpdateRequest.sampleAge) {
            return false;
        }
        boolean f = mo25205f();
        boolean f2 = mVDriverLocationUpdateRequest.mo25205f();
        if ((f || f2) && (!f || !f2 || this.agencyId != mVDriverLocationUpdateRequest.agencyId)) {
            return false;
        }
        boolean j = mo25210j();
        boolean j2 = mVDriverLocationUpdateRequest.mo25210j();
        if (((j || j2) && (!j || !j2 || !this.vehicleId.equals(mVDriverLocationUpdateRequest.vehicleId))) || this.isRT != mVDriverLocationUpdateRequest.isRT) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25205f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo25206g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo25207h() {
        return this.location != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25209i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo25210j() {
        return this.vehicleId != null;
    }

    /* renamed from: k */
    public final void mo25211k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo25212l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: m */
    public final void mo25213m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDriverLocationUpdateRequest(", "location:");
        MVGpsLocation mVGpsLocation = this.location;
        if (mVGpsLocation == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVGpsLocation);
        }
        n.append(", ");
        n.append("sampleAge:");
        n.append(this.sampleAge);
        if (mo25205f()) {
            n.append(", ");
            n.append("agencyId:");
            n.append(this.agencyId);
        }
        if (mo25210j()) {
            n.append(", ");
            n.append("vehicleId:");
            String str = this.vehicleId;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("isRT:");
        return C25541a.m63885p(n, this.isRT, ")");
    }
}
