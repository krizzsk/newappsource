package com.tranzmate.moovit.protocol.tod.shuttles;

import com.appboy.support.StringUtils;
import com.google.ads.mediation.unity.UnityMediationAdapter;
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

public class MVTodGetTripOrderRequest implements TBase<MVTodGetTripOrderRequest, _Fields>, Serializable, Cloneable, Comparable<MVTodGetTripOrderRequest> {

    /* renamed from: b */
    public static final C25113c f29716b = new C25113c(UnityMediationAdapter.KEY_PLACEMENT_ID, (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29717c = new C25113c("tripId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29718d = new C25113c("originStopIndex", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f29719e = new C25113c("destinationStopIndex", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f29720f = new C25113c("numPassengers", (byte) 8, 5);

    /* renamed from: g */
    public static final HashMap f29721g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f29722h;
    private byte __isset_bitfield = 0;
    public int destinationStopIndex;
    public int numPassengers;
    public int originStopIndex;
    public String tripId;
    public int zoneId;

    public enum _Fields implements C25085c {
        ZONE_ID(1, UnityMediationAdapter.KEY_PLACEMENT_ID),
        TRIP_ID(2, "tripId"),
        ORIGIN_STOP_INDEX(3, "originStopIndex"),
        DESTINATION_STOP_INDEX(4, "destinationStopIndex"),
        NUM_PASSENGERS(5, "numPassengers");
        
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
                return ZONE_ID;
            }
            if (i == 2) {
                return TRIP_ID;
            }
            if (i == 3) {
                return ORIGIN_STOP_INDEX;
            }
            if (i == 4) {
                return DESTINATION_STOP_INDEX;
            }
            if (i != 5) {
                return null;
            }
            return NUM_PASSENGERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodGetTripOrderRequest$a */
    public static class C11411a extends C25239c<MVTodGetTripOrderRequest> {
        public C11411a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetTripOrderRequest mVTodGetTripOrderRequest = (MVTodGetTripOrderRequest) tBase;
            mVTodGetTripOrderRequest.getClass();
            C25113c cVar = MVTodGetTripOrderRequest.f29716b;
            gVar.mo61687K();
            gVar.mo61711x(MVTodGetTripOrderRequest.f29716b);
            gVar.mo61678B(mVTodGetTripOrderRequest.zoneId);
            gVar.mo61712y();
            if (mVTodGetTripOrderRequest.tripId != null) {
                gVar.mo61711x(MVTodGetTripOrderRequest.f29717c);
                gVar.mo61686J(mVTodGetTripOrderRequest.tripId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodGetTripOrderRequest.f29718d);
            gVar.mo61678B(mVTodGetTripOrderRequest.originStopIndex);
            gVar.mo61712y();
            gVar.mo61711x(MVTodGetTripOrderRequest.f29719e);
            gVar.mo61678B(mVTodGetTripOrderRequest.destinationStopIndex);
            gVar.mo61712y();
            gVar.mo61711x(MVTodGetTripOrderRequest.f29720f);
            C16530d.m42020n(gVar, mVTodGetTripOrderRequest.numPassengers);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodGetTripOrderRequest mVTodGetTripOrderRequest = (MVTodGetTripOrderRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodGetTripOrderRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 8) {
                                    mVTodGetTripOrderRequest.numPassengers = gVar.mo61696i();
                                    mVTodGetTripOrderRequest.mo33966l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVTodGetTripOrderRequest.destinationStopIndex = gVar.mo61696i();
                                mVTodGetTripOrderRequest.mo33965k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVTodGetTripOrderRequest.originStopIndex = gVar.mo61696i();
                            mVTodGetTripOrderRequest.mo33967m();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTodGetTripOrderRequest.tripId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTodGetTripOrderRequest.zoneId = gVar.mo61696i();
                    mVTodGetTripOrderRequest.mo33968o();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodGetTripOrderRequest$b */
    public static class C11412b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11411a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodGetTripOrderRequest$c */
    public static class C11413c extends C25240d<MVTodGetTripOrderRequest> {
        public C11413c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetTripOrderRequest mVTodGetTripOrderRequest = (MVTodGetTripOrderRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodGetTripOrderRequest.mo33964j()) {
                bitSet.set(0);
            }
            if (mVTodGetTripOrderRequest.mo33963i()) {
                bitSet.set(1);
            }
            if (mVTodGetTripOrderRequest.mo33961h()) {
                bitSet.set(2);
            }
            if (mVTodGetTripOrderRequest.mo33959f()) {
                bitSet.set(3);
            }
            if (mVTodGetTripOrderRequest.mo33960g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVTodGetTripOrderRequest.mo33964j()) {
                jVar.mo61678B(mVTodGetTripOrderRequest.zoneId);
            }
            if (mVTodGetTripOrderRequest.mo33963i()) {
                jVar.mo61686J(mVTodGetTripOrderRequest.tripId);
            }
            if (mVTodGetTripOrderRequest.mo33961h()) {
                jVar.mo61678B(mVTodGetTripOrderRequest.originStopIndex);
            }
            if (mVTodGetTripOrderRequest.mo33959f()) {
                jVar.mo61678B(mVTodGetTripOrderRequest.destinationStopIndex);
            }
            if (mVTodGetTripOrderRequest.mo33960g()) {
                jVar.mo61678B(mVTodGetTripOrderRequest.numPassengers);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodGetTripOrderRequest mVTodGetTripOrderRequest = (MVTodGetTripOrderRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVTodGetTripOrderRequest.zoneId = jVar.mo61696i();
                mVTodGetTripOrderRequest.mo33968o();
            }
            if (T.get(1)) {
                mVTodGetTripOrderRequest.tripId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTodGetTripOrderRequest.originStopIndex = jVar.mo61696i();
                mVTodGetTripOrderRequest.mo33967m();
            }
            if (T.get(3)) {
                mVTodGetTripOrderRequest.destinationStopIndex = jVar.mo61696i();
                mVTodGetTripOrderRequest.mo33965k();
            }
            if (T.get(4)) {
                mVTodGetTripOrderRequest.numPassengers = jVar.mo61696i();
                mVTodGetTripOrderRequest.mo33966l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodGetTripOrderRequest$d */
    public static class C11414d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11413c(0);
        }
    }

    static {
        new C17394d0("MVTodGetTripOrderRequest");
        HashMap hashMap = new HashMap();
        f29721g = hashMap;
        hashMap.put(C25239c.class, new C11412b());
        hashMap.put(C25240d.class, new C11414d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ZONE_ID, new FieldMetaData(UnityMediationAdapter.KEY_PLACEMENT_ID, (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TRIP_ID, new FieldMetaData("tripId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ORIGIN_STOP_INDEX, new FieldMetaData("originStopIndex", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DESTINATION_STOP_INDEX, new FieldMetaData("destinationStopIndex", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NUM_PASSENGERS, new FieldMetaData("numPassengers", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29722h = unmodifiableMap;
        FieldMetaData.m61947a(MVTodGetTripOrderRequest.class, unmodifiableMap);
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
        ((C25238b) f29721g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29721g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVTodGetTripOrderRequest mVTodGetTripOrderRequest = (MVTodGetTripOrderRequest) obj;
        if (!getClass().equals(mVTodGetTripOrderRequest.getClass())) {
            return getClass().getName().compareTo(mVTodGetTripOrderRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33964j()).compareTo(Boolean.valueOf(mVTodGetTripOrderRequest.mo33964j()));
        if (compareTo != 0 || ((mo33964j() && (compareTo = C25082a.m62839c(this.zoneId, mVTodGetTripOrderRequest.zoneId)) != 0) || (compareTo = Boolean.valueOf(mo33963i()).compareTo(Boolean.valueOf(mVTodGetTripOrderRequest.mo33963i()))) != 0 || ((mo33963i() && (compareTo = this.tripId.compareTo(mVTodGetTripOrderRequest.tripId)) != 0) || (compareTo = Boolean.valueOf(mo33961h()).compareTo(Boolean.valueOf(mVTodGetTripOrderRequest.mo33961h()))) != 0 || ((mo33961h() && (compareTo = C25082a.m62839c(this.originStopIndex, mVTodGetTripOrderRequest.originStopIndex)) != 0) || (compareTo = Boolean.valueOf(mo33959f()).compareTo(Boolean.valueOf(mVTodGetTripOrderRequest.mo33959f()))) != 0 || ((mo33959f() && (compareTo = C25082a.m62839c(this.destinationStopIndex, mVTodGetTripOrderRequest.destinationStopIndex)) != 0) || (compareTo = Boolean.valueOf(mo33960g()).compareTo(Boolean.valueOf(mVTodGetTripOrderRequest.mo33960g()))) != 0))))) {
            return compareTo;
        }
        if (!mo33960g() || (c = C25082a.m62839c(this.numPassengers, mVTodGetTripOrderRequest.numPassengers)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodGetTripOrderRequest)) {
            return false;
        }
        MVTodGetTripOrderRequest mVTodGetTripOrderRequest = (MVTodGetTripOrderRequest) obj;
        if (this.zoneId != mVTodGetTripOrderRequest.zoneId) {
            return false;
        }
        boolean i = mo33963i();
        boolean i2 = mVTodGetTripOrderRequest.mo33963i();
        if (((!i && !i2) || (i && i2 && this.tripId.equals(mVTodGetTripOrderRequest.tripId))) && this.originStopIndex == mVTodGetTripOrderRequest.originStopIndex && this.destinationStopIndex == mVTodGetTripOrderRequest.destinationStopIndex && this.numPassengers == mVTodGetTripOrderRequest.numPassengers) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33959f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo33960g() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: h */
    public final boolean mo33961h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33963i() {
        return this.tripId != null;
    }

    /* renamed from: j */
    public final boolean mo33964j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo33965k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: l */
    public final void mo33966l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: m */
    public final void mo33967m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: o */
    public final void mo33968o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodGetTripOrderRequest(", "zoneId:");
        C0016g.m42z(n, this.zoneId, ", ", "tripId:");
        String str = this.tripId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("originStopIndex:");
        C0016g.m42z(n, this.originStopIndex, ", ", "destinationStopIndex:");
        C0016g.m42z(n, this.destinationStopIndex, ", ", "numPassengers:");
        return C13437d.m33707l(n, this.numPassengers, ")");
    }
}
