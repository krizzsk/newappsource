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

public class MVPassengerCancelFeeRequest implements TBase<MVPassengerCancelFeeRequest, _Fields>, Serializable, Cloneable, Comparable<MVPassengerCancelFeeRequest> {

    /* renamed from: b */
    public static final C25113c f28026b = new C25113c("eventId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28027c = new C25113c("rideEntityId", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f28028d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28029e;
    private byte __isset_bitfield = 0;
    public int eventId;
    public MVRideEntityId rideEntityId;

    public enum _Fields implements C25085c {
        EVENT_ID(1, "eventId"),
        RIDE_ENTITY_ID(2, "rideEntityId");
        
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
            if (i != 2) {
                return null;
            }
            return RIDE_ENTITY_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelFeeRequest$a */
    public static class C10322a extends C25239c<MVPassengerCancelFeeRequest> {
        public C10322a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCancelFeeRequest mVPassengerCancelFeeRequest = (MVPassengerCancelFeeRequest) tBase;
            mVPassengerCancelFeeRequest.getClass();
            C25113c cVar = MVPassengerCancelFeeRequest.f28026b;
            gVar.mo61687K();
            gVar.mo61711x(MVPassengerCancelFeeRequest.f28026b);
            gVar.mo61678B(mVPassengerCancelFeeRequest.eventId);
            gVar.mo61712y();
            if (mVPassengerCancelFeeRequest.rideEntityId != null) {
                gVar.mo61711x(MVPassengerCancelFeeRequest.f28027c);
                mVPassengerCancelFeeRequest.rideEntityId.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCancelFeeRequest mVPassengerCancelFeeRequest = (MVPassengerCancelFeeRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPassengerCancelFeeRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVRideEntityId mVRideEntityId = new MVRideEntityId();
                        mVPassengerCancelFeeRequest.rideEntityId = mVRideEntityId;
                        mVRideEntityId.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPassengerCancelFeeRequest.eventId = gVar.mo61696i();
                    mVPassengerCancelFeeRequest.mo31206h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelFeeRequest$b */
    public static class C10323b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10322a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelFeeRequest$c */
    public static class C10324c extends C25240d<MVPassengerCancelFeeRequest> {
        public C10324c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCancelFeeRequest mVPassengerCancelFeeRequest = (MVPassengerCancelFeeRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerCancelFeeRequest.mo31204f()) {
                bitSet.set(0);
            }
            if (mVPassengerCancelFeeRequest.mo31205g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPassengerCancelFeeRequest.mo31204f()) {
                jVar.mo61678B(mVPassengerCancelFeeRequest.eventId);
            }
            if (mVPassengerCancelFeeRequest.mo31205g()) {
                mVPassengerCancelFeeRequest.rideEntityId.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCancelFeeRequest mVPassengerCancelFeeRequest = (MVPassengerCancelFeeRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPassengerCancelFeeRequest.eventId = jVar.mo61696i();
                mVPassengerCancelFeeRequest.mo31206h();
            }
            if (T.get(1)) {
                MVRideEntityId mVRideEntityId = new MVRideEntityId();
                mVPassengerCancelFeeRequest.rideEntityId = mVRideEntityId;
                mVRideEntityId.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelFeeRequest$d */
    public static class C10325d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10324c(0);
        }
    }

    static {
        new C17394d0("MVPassengerCancelFeeRequest");
        HashMap hashMap = new HashMap();
        f28028d = hashMap;
        hashMap.put(C25239c.class, new C10323b());
        hashMap.put(C25240d.class, new C10325d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.EVENT_ID, new FieldMetaData("eventId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RIDE_ENTITY_ID, new FieldMetaData("rideEntityId", (byte) 3, new StructMetaData(MVRideEntityId.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28029e = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerCancelFeeRequest.class, unmodifiableMap);
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
        ((C25238b) f28028d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28028d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPassengerCancelFeeRequest mVPassengerCancelFeeRequest = (MVPassengerCancelFeeRequest) obj;
        if (!getClass().equals(mVPassengerCancelFeeRequest.getClass())) {
            return getClass().getName().compareTo(mVPassengerCancelFeeRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31204f()).compareTo(Boolean.valueOf(mVPassengerCancelFeeRequest.mo31204f()));
        if (compareTo2 != 0 || ((mo31204f() && (compareTo2 = C25082a.m62839c(this.eventId, mVPassengerCancelFeeRequest.eventId)) != 0) || (compareTo2 = Boolean.valueOf(mo31205g()).compareTo(Boolean.valueOf(mVPassengerCancelFeeRequest.mo31205g()))) != 0)) {
            return compareTo2;
        }
        if (!mo31205g() || (compareTo = this.rideEntityId.compareTo(mVPassengerCancelFeeRequest.rideEntityId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassengerCancelFeeRequest)) {
            return false;
        }
        MVPassengerCancelFeeRequest mVPassengerCancelFeeRequest = (MVPassengerCancelFeeRequest) obj;
        if (this.eventId != mVPassengerCancelFeeRequest.eventId) {
            return false;
        }
        boolean g = mo31205g();
        boolean g2 = mVPassengerCancelFeeRequest.mo31205g();
        if ((g || g2) && (!g || !g2 || !this.rideEntityId.mo31390k(mVPassengerCancelFeeRequest.rideEntityId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31204f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31205g() {
        return this.rideEntityId != null;
    }

    /* renamed from: h */
    public final void mo31206h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassengerCancelFeeRequest(", "eventId:");
        C0016g.m42z(n, this.eventId, ", ", "rideEntityId:");
        MVRideEntityId mVRideEntityId = this.rideEntityId;
        if (mVRideEntityId == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRideEntityId);
        }
        n.append(")");
        return n.toString();
    }
}
