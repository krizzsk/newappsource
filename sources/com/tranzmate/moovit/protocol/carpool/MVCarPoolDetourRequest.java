package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
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

public class MVCarPoolDetourRequest implements TBase<MVCarPoolDetourRequest, _Fields>, Serializable, Cloneable, Comparable<MVCarPoolDetourRequest> {

    /* renamed from: b */
    public static final C25113c f24626b = new C25113c("rideId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24627c = new C25113c("stops", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24628d = new C25113c("pickupLocation", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f24629e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24630f;
    private byte __isset_bitfield = 0;
    public MVLocationDescriptor pickupLocation;
    public int rideId;
    public MVPassengerStops stops;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        STOPS(2, "stops"),
        PICKUP_LOCATION(3, "pickupLocation");
        
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
                return RIDE_ID;
            }
            if (i == 2) {
                return STOPS;
            }
            if (i != 3) {
                return null;
            }
            return PICKUP_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolDetourRequest$a */
    public static class C8157a extends C25239c<MVCarPoolDetourRequest> {
        public C8157a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolDetourRequest mVCarPoolDetourRequest = (MVCarPoolDetourRequest) tBase;
            MVPassengerStops mVPassengerStops = mVCarPoolDetourRequest.stops;
            if (mVPassengerStops != null) {
                mVPassengerStops.mo25808j();
            }
            MVLocationDescriptor mVLocationDescriptor = mVCarPoolDetourRequest.pickupLocation;
            if (mVLocationDescriptor != null) {
                mVLocationDescriptor.mo26333s();
            }
            C25113c cVar = MVCarPoolDetourRequest.f24626b;
            gVar.mo61687K();
            gVar.mo61711x(MVCarPoolDetourRequest.f24626b);
            gVar.mo61678B(mVCarPoolDetourRequest.rideId);
            gVar.mo61712y();
            if (mVCarPoolDetourRequest.stops != null) {
                gVar.mo61711x(MVCarPoolDetourRequest.f24627c);
                mVCarPoolDetourRequest.stops.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarPoolDetourRequest.pickupLocation != null) {
                gVar.mo61711x(MVCarPoolDetourRequest.f24628d);
                mVCarPoolDetourRequest.pickupLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolDetourRequest mVCarPoolDetourRequest = (MVCarPoolDetourRequest) tBase;
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
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                            mVCarPoolDetourRequest.pickupLocation = mVLocationDescriptor;
                            mVLocationDescriptor.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVPassengerStops mVPassengerStops = new MVPassengerStops();
                        mVCarPoolDetourRequest.stops = mVPassengerStops;
                        mVPassengerStops.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVCarPoolDetourRequest.rideId = gVar.mo61696i();
                    mVCarPoolDetourRequest.mo25444i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVPassengerStops mVPassengerStops2 = mVCarPoolDetourRequest.stops;
            if (mVPassengerStops2 != null) {
                mVPassengerStops2.mo25808j();
            }
            MVLocationDescriptor mVLocationDescriptor2 = mVCarPoolDetourRequest.pickupLocation;
            if (mVLocationDescriptor2 != null) {
                mVLocationDescriptor2.mo26333s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolDetourRequest$b */
    public static class C8158b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8157a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolDetourRequest$c */
    public static class C8159c extends C25240d<MVCarPoolDetourRequest> {
        public C8159c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolDetourRequest mVCarPoolDetourRequest = (MVCarPoolDetourRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarPoolDetourRequest.mo25441g()) {
                bitSet.set(0);
            }
            if (mVCarPoolDetourRequest.mo25442h()) {
                bitSet.set(1);
            }
            if (mVCarPoolDetourRequest.mo25440f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVCarPoolDetourRequest.mo25441g()) {
                jVar.mo61678B(mVCarPoolDetourRequest.rideId);
            }
            if (mVCarPoolDetourRequest.mo25442h()) {
                mVCarPoolDetourRequest.stops.mo25202X0(jVar);
            }
            if (mVCarPoolDetourRequest.mo25440f()) {
                mVCarPoolDetourRequest.pickupLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolDetourRequest mVCarPoolDetourRequest = (MVCarPoolDetourRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVCarPoolDetourRequest.rideId = jVar.mo61696i();
                mVCarPoolDetourRequest.mo25444i();
            }
            if (T.get(1)) {
                MVPassengerStops mVPassengerStops = new MVPassengerStops();
                mVCarPoolDetourRequest.stops = mVPassengerStops;
                mVPassengerStops.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVCarPoolDetourRequest.pickupLocation = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolDetourRequest$d */
    public static class C8160d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8159c(0);
        }
    }

    static {
        new C17394d0("MVCarPoolDetourRequest");
        HashMap hashMap = new HashMap();
        f24629e = hashMap;
        hashMap.put(C25239c.class, new C8158b());
        hashMap.put(C25240d.class, new C8160d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOPS, new FieldMetaData("stops", (byte) 3, new StructMetaData(MVPassengerStops.class)));
        enumMap.put(_Fields.PICKUP_LOCATION, new FieldMetaData("pickupLocation", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24630f = unmodifiableMap;
        FieldMetaData.m61947a(MVCarPoolDetourRequest.class, unmodifiableMap);
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
        ((C25238b) f24629e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24629e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCarPoolDetourRequest mVCarPoolDetourRequest = (MVCarPoolDetourRequest) obj;
        if (!getClass().equals(mVCarPoolDetourRequest.getClass())) {
            return getClass().getName().compareTo(mVCarPoolDetourRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25441g()).compareTo(Boolean.valueOf(mVCarPoolDetourRequest.mo25441g()));
        if (compareTo2 != 0 || ((mo25441g() && (compareTo2 = C25082a.m62839c(this.rideId, mVCarPoolDetourRequest.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo25442h()).compareTo(Boolean.valueOf(mVCarPoolDetourRequest.mo25442h()))) != 0 || ((mo25442h() && (compareTo2 = this.stops.compareTo(mVCarPoolDetourRequest.stops)) != 0) || (compareTo2 = Boolean.valueOf(mo25440f()).compareTo(Boolean.valueOf(mVCarPoolDetourRequest.mo25440f()))) != 0))) {
            return compareTo2;
        }
        if (!mo25440f() || (compareTo = this.pickupLocation.compareTo(mVCarPoolDetourRequest.pickupLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCarPoolDetourRequest)) {
            return false;
        }
        MVCarPoolDetourRequest mVCarPoolDetourRequest = (MVCarPoolDetourRequest) obj;
        if (this.rideId != mVCarPoolDetourRequest.rideId) {
            return false;
        }
        boolean h = mo25442h();
        boolean h2 = mVCarPoolDetourRequest.mo25442h();
        if ((h || h2) && (!h || !h2 || !this.stops.mo25800a(mVCarPoolDetourRequest.stops))) {
            return false;
        }
        boolean f = mo25440f();
        boolean f2 = mVCarPoolDetourRequest.mo25440f();
        if ((f || f2) && (!f || !f2 || !this.pickupLocation.mo26317a(mVCarPoolDetourRequest.pickupLocation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25440f() {
        return this.pickupLocation != null;
    }

    /* renamed from: g */
    public final boolean mo25441g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo25442h() {
        return this.stops != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo25444i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarPoolDetourRequest(", "rideId:");
        C0016g.m42z(n, this.rideId, ", ", "stops:");
        MVPassengerStops mVPassengerStops = this.stops;
        if (mVPassengerStops == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPassengerStops);
        }
        n.append(", ");
        n.append("pickupLocation:");
        MVLocationDescriptor mVLocationDescriptor = this.pickupLocation;
        if (mVLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor);
        }
        n.append(")");
        return n.toString();
    }
}
