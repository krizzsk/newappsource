package com.tranzmate.moovit.busdriver;

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

public class MVUpdateTripRequest implements TBase<MVUpdateTripRequest, _Fields>, Serializable, Cloneable, Comparable<MVUpdateTripRequest> {

    /* renamed from: b */
    public static final C25113c f24518b = new C25113c("tripId", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f24519c = new C25113c("tripDateLocal", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f24520d = new C25113c("numberOfActualPassengers", (byte) 6, 3);

    /* renamed from: e */
    public static final HashMap f24521e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24522f;
    private byte __isset_bitfield = 0;
    public short numberOfActualPassengers;
    private _Fields[] optionals = {_Fields.NUMBER_OF_ACTUAL_PASSENGERS};
    public long tripDateLocal;
    public long tripId;

    public enum _Fields implements C25085c {
        TRIP_ID(1, "tripId"),
        TRIP_DATE_LOCAL(2, "tripDateLocal"),
        NUMBER_OF_ACTUAL_PASSENGERS(3, "numberOfActualPassengers");
        
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
                return TRIP_ID;
            }
            if (i == 2) {
                return TRIP_DATE_LOCAL;
            }
            if (i != 3) {
                return null;
            }
            return NUMBER_OF_ACTUAL_PASSENGERS;
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

    /* renamed from: com.tranzmate.moovit.busdriver.MVUpdateTripRequest$a */
    public static class C8069a extends C25239c<MVUpdateTripRequest> {
        public C8069a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpdateTripRequest mVUpdateTripRequest = (MVUpdateTripRequest) tBase;
            mVUpdateTripRequest.getClass();
            C25113c cVar = MVUpdateTripRequest.f24518b;
            gVar.mo61687K();
            gVar.mo61711x(MVUpdateTripRequest.f24518b);
            gVar.mo61679C(mVUpdateTripRequest.tripId);
            gVar.mo61712y();
            gVar.mo61711x(MVUpdateTripRequest.f24519c);
            gVar.mo61679C(mVUpdateTripRequest.tripDateLocal);
            gVar.mo61712y();
            if (mVUpdateTripRequest.mo25239f()) {
                gVar.mo61711x(MVUpdateTripRequest.f24520d);
                gVar.mo61677A(mVUpdateTripRequest.numberOfActualPassengers);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpdateTripRequest mVUpdateTripRequest = (MVUpdateTripRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUpdateTripRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 6) {
                            mVUpdateTripRequest.numberOfActualPassengers = gVar.mo61695h();
                            mVUpdateTripRequest.mo25243i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVUpdateTripRequest.tripDateLocal = gVar.mo61697j();
                        mVUpdateTripRequest.mo25244j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVUpdateTripRequest.tripId = gVar.mo61697j();
                    mVUpdateTripRequest.mo25245k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.busdriver.MVUpdateTripRequest$b */
    public static class C8070b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8069a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.busdriver.MVUpdateTripRequest$c */
    public static class C8071c extends C25240d<MVUpdateTripRequest> {
        public C8071c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpdateTripRequest mVUpdateTripRequest = (MVUpdateTripRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUpdateTripRequest.mo25241h()) {
                bitSet.set(0);
            }
            if (mVUpdateTripRequest.mo25240g()) {
                bitSet.set(1);
            }
            if (mVUpdateTripRequest.mo25239f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVUpdateTripRequest.mo25241h()) {
                jVar.mo61679C(mVUpdateTripRequest.tripId);
            }
            if (mVUpdateTripRequest.mo25240g()) {
                jVar.mo61679C(mVUpdateTripRequest.tripDateLocal);
            }
            if (mVUpdateTripRequest.mo25239f()) {
                jVar.mo61677A(mVUpdateTripRequest.numberOfActualPassengers);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpdateTripRequest mVUpdateTripRequest = (MVUpdateTripRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVUpdateTripRequest.tripId = jVar.mo61697j();
                mVUpdateTripRequest.mo25245k();
            }
            if (T.get(1)) {
                mVUpdateTripRequest.tripDateLocal = jVar.mo61697j();
                mVUpdateTripRequest.mo25244j();
            }
            if (T.get(2)) {
                mVUpdateTripRequest.numberOfActualPassengers = jVar.mo61695h();
                mVUpdateTripRequest.mo25243i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.busdriver.MVUpdateTripRequest$d */
    public static class C8072d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8071c(0);
        }
    }

    static {
        new C17394d0("MVUpdateTripRequest");
        HashMap hashMap = new HashMap();
        f24521e = hashMap;
        hashMap.put(C25239c.class, new C8070b());
        hashMap.put(C25240d.class, new C8072d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIP_ID, new FieldMetaData("tripId", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.TRIP_DATE_LOCAL, new FieldMetaData("tripDateLocal", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.NUMBER_OF_ACTUAL_PASSENGERS, new FieldMetaData("numberOfActualPassengers", (byte) 2, new FieldValueMetaData((byte) 6, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24522f = unmodifiableMap;
        FieldMetaData.m61947a(MVUpdateTripRequest.class, unmodifiableMap);
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
        ((C25238b) f24521e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24521e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int k;
        MVUpdateTripRequest mVUpdateTripRequest = (MVUpdateTripRequest) obj;
        if (!getClass().equals(mVUpdateTripRequest.getClass())) {
            return getClass().getName().compareTo(mVUpdateTripRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25241h()).compareTo(Boolean.valueOf(mVUpdateTripRequest.mo25241h()));
        if (compareTo != 0 || ((mo25241h() && (compareTo = C25082a.m62840d(this.tripId, mVUpdateTripRequest.tripId)) != 0) || (compareTo = Boolean.valueOf(mo25240g()).compareTo(Boolean.valueOf(mVUpdateTripRequest.mo25240g()))) != 0 || ((mo25240g() && (compareTo = C25082a.m62840d(this.tripDateLocal, mVUpdateTripRequest.tripDateLocal)) != 0) || (compareTo = Boolean.valueOf(mo25239f()).compareTo(Boolean.valueOf(mVUpdateTripRequest.mo25239f()))) != 0))) {
            return compareTo;
        }
        if (!mo25239f() || (k = C25082a.m62847k(this.numberOfActualPassengers, mVUpdateTripRequest.numberOfActualPassengers)) == 0) {
            return 0;
        }
        return k;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUpdateTripRequest)) {
            return false;
        }
        MVUpdateTripRequest mVUpdateTripRequest = (MVUpdateTripRequest) obj;
        if (this.tripId != mVUpdateTripRequest.tripId || this.tripDateLocal != mVUpdateTripRequest.tripDateLocal) {
            return false;
        }
        boolean f = mo25239f();
        boolean f2 = mVUpdateTripRequest.mo25239f();
        if ((f || f2) && (!f || !f2 || this.numberOfActualPassengers != mVUpdateTripRequest.numberOfActualPassengers)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25239f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo25240g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo25241h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo25243i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: j */
    public final void mo25244j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo25245k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUpdateTripRequest(", "tripId:");
        C25541a.m63889t(n, this.tripId, ", ", "tripDateLocal:");
        n.append(this.tripDateLocal);
        if (mo25239f()) {
            n.append(", ");
            n.append("numberOfActualPassengers:");
            n.append(this.numberOfActualPassengers);
        }
        n.append(")");
        return n.toString();
    }
}
