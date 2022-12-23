package com.tranzmate.moovit.protocol.ridesharing;

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

public class MVPassengerCancelEventRequest implements TBase<MVPassengerCancelEventRequest, _Fields>, Serializable, Cloneable, Comparable<MVPassengerCancelEventRequest> {

    /* renamed from: b */
    public static final C25113c f28018b = new C25113c("eventId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28019c = new C25113c("rideEntityId", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28020d = new C25113c("fee", (byte) 10, 3);

    /* renamed from: e */
    public static final HashMap f28021e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28022f;
    private byte __isset_bitfield = 0;
    public int eventId;
    public long fee;
    private _Fields[] optionals = {_Fields.FEE};
    public MVRideEntityId rideEntityId;

    public enum _Fields implements C25085c {
        EVENT_ID(1, "eventId"),
        RIDE_ENTITY_ID(2, "rideEntityId"),
        FEE(3, "fee");
        
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
                return EVENT_ID;
            }
            if (i == 2) {
                return RIDE_ENTITY_ID;
            }
            if (i != 3) {
                return null;
            }
            return FEE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelEventRequest$a */
    public static class C10314a extends C25239c<MVPassengerCancelEventRequest> {
        public C10314a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCancelEventRequest mVPassengerCancelEventRequest = (MVPassengerCancelEventRequest) tBase;
            mVPassengerCancelEventRequest.getClass();
            C25113c cVar = MVPassengerCancelEventRequest.f28018b;
            gVar.mo61687K();
            gVar.mo61711x(MVPassengerCancelEventRequest.f28018b);
            gVar.mo61678B(mVPassengerCancelEventRequest.eventId);
            gVar.mo61712y();
            if (mVPassengerCancelEventRequest.rideEntityId != null) {
                gVar.mo61711x(MVPassengerCancelEventRequest.f28019c);
                mVPassengerCancelEventRequest.rideEntityId.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerCancelEventRequest.mo31189g()) {
                gVar.mo61711x(MVPassengerCancelEventRequest.f28020d);
                gVar.mo61679C(mVPassengerCancelEventRequest.fee);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCancelEventRequest mVPassengerCancelEventRequest = (MVPassengerCancelEventRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPassengerCancelEventRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 10) {
                            mVPassengerCancelEventRequest.fee = gVar.mo61697j();
                            mVPassengerCancelEventRequest.mo31193j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVRideEntityId mVRideEntityId = new MVRideEntityId();
                        mVPassengerCancelEventRequest.rideEntityId = mVRideEntityId;
                        mVRideEntityId.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPassengerCancelEventRequest.eventId = gVar.mo61696i();
                    mVPassengerCancelEventRequest.mo31192i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelEventRequest$b */
    public static class C10315b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10314a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelEventRequest$c */
    public static class C10316c extends C25240d<MVPassengerCancelEventRequest> {
        public C10316c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCancelEventRequest mVPassengerCancelEventRequest = (MVPassengerCancelEventRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerCancelEventRequest.mo31188f()) {
                bitSet.set(0);
            }
            if (mVPassengerCancelEventRequest.mo31190h()) {
                bitSet.set(1);
            }
            if (mVPassengerCancelEventRequest.mo31189g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPassengerCancelEventRequest.mo31188f()) {
                jVar.mo61678B(mVPassengerCancelEventRequest.eventId);
            }
            if (mVPassengerCancelEventRequest.mo31190h()) {
                mVPassengerCancelEventRequest.rideEntityId.mo25202X0(jVar);
            }
            if (mVPassengerCancelEventRequest.mo31189g()) {
                jVar.mo61679C(mVPassengerCancelEventRequest.fee);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCancelEventRequest mVPassengerCancelEventRequest = (MVPassengerCancelEventRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPassengerCancelEventRequest.eventId = jVar.mo61696i();
                mVPassengerCancelEventRequest.mo31192i();
            }
            if (T.get(1)) {
                MVRideEntityId mVRideEntityId = new MVRideEntityId();
                mVPassengerCancelEventRequest.rideEntityId = mVRideEntityId;
                mVRideEntityId.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPassengerCancelEventRequest.fee = jVar.mo61697j();
                mVPassengerCancelEventRequest.mo31193j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelEventRequest$d */
    public static class C10317d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10316c(0);
        }
    }

    static {
        new C17394d0("MVPassengerCancelEventRequest");
        HashMap hashMap = new HashMap();
        f28021e = hashMap;
        hashMap.put(C25239c.class, new C10315b());
        hashMap.put(C25240d.class, new C10317d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.EVENT_ID, new FieldMetaData("eventId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RIDE_ENTITY_ID, new FieldMetaData("rideEntityId", (byte) 3, new StructMetaData(MVRideEntityId.class)));
        enumMap.put(_Fields.FEE, new FieldMetaData("fee", (byte) 2, new FieldValueMetaData((byte) 10, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28022f = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerCancelEventRequest.class, unmodifiableMap);
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
        ((C25238b) f28021e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28021e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVPassengerCancelEventRequest mVPassengerCancelEventRequest = (MVPassengerCancelEventRequest) obj;
        if (!getClass().equals(mVPassengerCancelEventRequest.getClass())) {
            return getClass().getName().compareTo(mVPassengerCancelEventRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31188f()).compareTo(Boolean.valueOf(mVPassengerCancelEventRequest.mo31188f()));
        if (compareTo != 0 || ((mo31188f() && (compareTo = C25082a.m62839c(this.eventId, mVPassengerCancelEventRequest.eventId)) != 0) || (compareTo = Boolean.valueOf(mo31190h()).compareTo(Boolean.valueOf(mVPassengerCancelEventRequest.mo31190h()))) != 0 || ((mo31190h() && (compareTo = this.rideEntityId.compareTo(mVPassengerCancelEventRequest.rideEntityId)) != 0) || (compareTo = Boolean.valueOf(mo31189g()).compareTo(Boolean.valueOf(mVPassengerCancelEventRequest.mo31189g()))) != 0))) {
            return compareTo;
        }
        if (!mo31189g() || (d = C25082a.m62840d(this.fee, mVPassengerCancelEventRequest.fee)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassengerCancelEventRequest)) {
            return false;
        }
        MVPassengerCancelEventRequest mVPassengerCancelEventRequest = (MVPassengerCancelEventRequest) obj;
        if (this.eventId != mVPassengerCancelEventRequest.eventId) {
            return false;
        }
        boolean h = mo31190h();
        boolean h2 = mVPassengerCancelEventRequest.mo31190h();
        if ((h || h2) && (!h || !h2 || !this.rideEntityId.mo31390k(mVPassengerCancelEventRequest.rideEntityId))) {
            return false;
        }
        boolean g = mo31189g();
        boolean g2 = mVPassengerCancelEventRequest.mo31189g();
        if ((g || g2) && (!g || !g2 || this.fee != mVPassengerCancelEventRequest.fee)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31188f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31189g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo31190h() {
        return this.rideEntityId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31192i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo31193j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassengerCancelEventRequest(", "eventId:");
        C0016g.m42z(n, this.eventId, ", ", "rideEntityId:");
        MVRideEntityId mVRideEntityId = this.rideEntityId;
        if (mVRideEntityId == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRideEntityId);
        }
        if (mo31189g()) {
            n.append(", ");
            n.append("fee:");
            n.append(this.fee);
        }
        n.append(")");
        return n.toString();
    }
}
