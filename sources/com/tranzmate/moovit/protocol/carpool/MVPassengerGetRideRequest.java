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

public class MVPassengerGetRideRequest implements TBase<MVPassengerGetRideRequest, _Fields>, Serializable, Cloneable, Comparable<MVPassengerGetRideRequest> {

    /* renamed from: b */
    public static final C25113c f24776b = new C25113c("rideId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24777c = new C25113c("stops", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f24778d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24779e;
    private byte __isset_bitfield = 0;
    public int rideId;
    public MVPassengerStops stops;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        STOPS(2, "stops");
        
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
            if (i != 2) {
                return null;
            }
            return STOPS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideRequest$a */
    public static class C8254a extends C25239c<MVPassengerGetRideRequest> {
        public C8254a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerGetRideRequest mVPassengerGetRideRequest = (MVPassengerGetRideRequest) tBase;
            MVPassengerStops mVPassengerStops = mVPassengerGetRideRequest.stops;
            if (mVPassengerStops != null) {
                mVPassengerStops.mo25808j();
            }
            C25113c cVar = MVPassengerGetRideRequest.f24776b;
            gVar.mo61687K();
            gVar.mo61711x(MVPassengerGetRideRequest.f24776b);
            gVar.mo61678B(mVPassengerGetRideRequest.rideId);
            gVar.mo61712y();
            if (mVPassengerGetRideRequest.stops != null) {
                gVar.mo61711x(MVPassengerGetRideRequest.f24777c);
                mVPassengerGetRideRequest.stops.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerGetRideRequest mVPassengerGetRideRequest = (MVPassengerGetRideRequest) tBase;
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
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVPassengerStops mVPassengerStops = new MVPassengerStops();
                        mVPassengerGetRideRequest.stops = mVPassengerStops;
                        mVPassengerStops.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPassengerGetRideRequest.rideId = gVar.mo61696i();
                    mVPassengerGetRideRequest.mo25728h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVPassengerStops mVPassengerStops2 = mVPassengerGetRideRequest.stops;
            if (mVPassengerStops2 != null) {
                mVPassengerStops2.mo25808j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideRequest$b */
    public static class C8255b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8254a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideRequest$c */
    public static class C8256c extends C25240d<MVPassengerGetRideRequest> {
        public C8256c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerGetRideRequest mVPassengerGetRideRequest = (MVPassengerGetRideRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerGetRideRequest.mo25726f()) {
                bitSet.set(0);
            }
            if (mVPassengerGetRideRequest.mo25727g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPassengerGetRideRequest.mo25726f()) {
                jVar.mo61678B(mVPassengerGetRideRequest.rideId);
            }
            if (mVPassengerGetRideRequest.mo25727g()) {
                mVPassengerGetRideRequest.stops.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerGetRideRequest mVPassengerGetRideRequest = (MVPassengerGetRideRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPassengerGetRideRequest.rideId = jVar.mo61696i();
                mVPassengerGetRideRequest.mo25728h();
            }
            if (T.get(1)) {
                MVPassengerStops mVPassengerStops = new MVPassengerStops();
                mVPassengerGetRideRequest.stops = mVPassengerStops;
                mVPassengerStops.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideRequest$d */
    public static class C8257d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8256c(0);
        }
    }

    static {
        new C17394d0("MVPassengerGetRideRequest");
        HashMap hashMap = new HashMap();
        f24778d = hashMap;
        hashMap.put(C25239c.class, new C8255b());
        hashMap.put(C25240d.class, new C8257d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOPS, new FieldMetaData("stops", (byte) 3, new StructMetaData(MVPassengerStops.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24779e = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerGetRideRequest.class, unmodifiableMap);
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
        ((C25238b) f24778d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24778d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPassengerGetRideRequest mVPassengerGetRideRequest = (MVPassengerGetRideRequest) obj;
        if (!getClass().equals(mVPassengerGetRideRequest.getClass())) {
            return getClass().getName().compareTo(mVPassengerGetRideRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25726f()).compareTo(Boolean.valueOf(mVPassengerGetRideRequest.mo25726f()));
        if (compareTo2 != 0 || ((mo25726f() && (compareTo2 = C25082a.m62839c(this.rideId, mVPassengerGetRideRequest.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo25727g()).compareTo(Boolean.valueOf(mVPassengerGetRideRequest.mo25727g()))) != 0)) {
            return compareTo2;
        }
        if (!mo25727g() || (compareTo = this.stops.compareTo(mVPassengerGetRideRequest.stops)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassengerGetRideRequest)) {
            return false;
        }
        MVPassengerGetRideRequest mVPassengerGetRideRequest = (MVPassengerGetRideRequest) obj;
        if (this.rideId != mVPassengerGetRideRequest.rideId) {
            return false;
        }
        boolean g = mo25727g();
        boolean g2 = mVPassengerGetRideRequest.mo25727g();
        if ((g || g2) && (!g || !g2 || !this.stops.mo25800a(mVPassengerGetRideRequest.stops))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25726f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo25727g() {
        return this.stops != null;
    }

    /* renamed from: h */
    public final void mo25728h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassengerGetRideRequest(", "rideId:");
        C0016g.m42z(n, this.rideId, ", ", "stops:");
        MVPassengerStops mVPassengerStops = this.stops;
        if (mVPassengerStops == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPassengerStops);
        }
        n.append(")");
        return n.toString();
    }
}
