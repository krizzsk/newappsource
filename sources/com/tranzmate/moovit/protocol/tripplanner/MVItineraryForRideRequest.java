package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.carpool.MVPassengerStops;
import com.tranzmate.moovit.protocol.common.MVRouteType;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVItineraryForRideRequest implements TBase<MVItineraryForRideRequest, _Fields>, Serializable, Cloneable, Comparable<MVItineraryForRideRequest> {

    /* renamed from: b */
    public static final C25113c f29942b = new C25113c("rideId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29943c = new C25113c("stops", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29944d = new C25113c("routeTypes", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f29945e = new C25113c("tripPlanPref", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f29946f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29947g;
    private byte __isset_bitfield = 0;
    public int rideId;
    public List<MVRouteType> routeTypes;
    public MVPassengerStops stops;
    public MVTripPlanPref tripPlanPref;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        STOPS(2, "stops"),
        ROUTE_TYPES(3, "routeTypes"),
        TRIP_PLAN_PREF(4, "tripPlanPref");
        
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
            if (i == 3) {
                return ROUTE_TYPES;
            }
            if (i != 4) {
                return null;
            }
            return TRIP_PLAN_PREF;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVItineraryForRideRequest$a */
    public static class C11554a extends C25239c<MVItineraryForRideRequest> {
        public C11554a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVItineraryForRideRequest mVItineraryForRideRequest = (MVItineraryForRideRequest) tBase;
            MVPassengerStops mVPassengerStops = mVItineraryForRideRequest.stops;
            if (mVPassengerStops != null) {
                mVPassengerStops.mo25808j();
            }
            C25113c cVar = MVItineraryForRideRequest.f29942b;
            gVar.mo61687K();
            gVar.mo61711x(MVItineraryForRideRequest.f29942b);
            gVar.mo61678B(mVItineraryForRideRequest.rideId);
            gVar.mo61712y();
            if (mVItineraryForRideRequest.stops != null) {
                gVar.mo61711x(MVItineraryForRideRequest.f29943c);
                mVItineraryForRideRequest.stops.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVItineraryForRideRequest.routeTypes != null) {
                gVar.mo61711x(MVItineraryForRideRequest.f29944d);
                gVar.mo61680D(new C25119e((byte) 8, mVItineraryForRideRequest.routeTypes.size()));
                for (MVRouteType value : mVItineraryForRideRequest.routeTypes) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVItineraryForRideRequest.tripPlanPref != null) {
                gVar.mo61711x(MVItineraryForRideRequest.f29945e);
                gVar.mo61678B(mVItineraryForRideRequest.tripPlanPref.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVItineraryForRideRequest mVItineraryForRideRequest = (MVItineraryForRideRequest) tBase;
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
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVItineraryForRideRequest.tripPlanPref = MVTripPlanPref.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVItineraryForRideRequest.routeTypes = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVItineraryForRideRequest.routeTypes.add(MVRouteType.findByValue(gVar.mo61696i()));
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVPassengerStops mVPassengerStops = new MVPassengerStops();
                        mVItineraryForRideRequest.stops = mVPassengerStops;
                        mVPassengerStops.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVItineraryForRideRequest.rideId = gVar.mo61696i();
                    mVItineraryForRideRequest.mo34344j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVPassengerStops mVPassengerStops2 = mVItineraryForRideRequest.stops;
            if (mVPassengerStops2 != null) {
                mVPassengerStops2.mo25808j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVItineraryForRideRequest$b */
    public static class C11555b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11554a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVItineraryForRideRequest$c */
    public static class C11556c extends C25240d<MVItineraryForRideRequest> {
        public C11556c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVItineraryForRideRequest mVItineraryForRideRequest = (MVItineraryForRideRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVItineraryForRideRequest.mo34339f()) {
                bitSet.set(0);
            }
            if (mVItineraryForRideRequest.mo34341h()) {
                bitSet.set(1);
            }
            if (mVItineraryForRideRequest.mo34340g()) {
                bitSet.set(2);
            }
            if (mVItineraryForRideRequest.mo34343i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVItineraryForRideRequest.mo34339f()) {
                jVar.mo61678B(mVItineraryForRideRequest.rideId);
            }
            if (mVItineraryForRideRequest.mo34341h()) {
                mVItineraryForRideRequest.stops.mo25202X0(jVar);
            }
            if (mVItineraryForRideRequest.mo34340g()) {
                jVar.mo61678B(mVItineraryForRideRequest.routeTypes.size());
                for (MVRouteType value : mVItineraryForRideRequest.routeTypes) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVItineraryForRideRequest.mo34343i()) {
                jVar.mo61678B(mVItineraryForRideRequest.tripPlanPref.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVItineraryForRideRequest mVItineraryForRideRequest = (MVItineraryForRideRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVItineraryForRideRequest.rideId = jVar.mo61696i();
                mVItineraryForRideRequest.mo34344j();
            }
            if (T.get(1)) {
                MVPassengerStops mVPassengerStops = new MVPassengerStops();
                mVItineraryForRideRequest.stops = mVPassengerStops;
                mVPassengerStops.mo25201C1(jVar);
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVItineraryForRideRequest.routeTypes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVItineraryForRideRequest.routeTypes.add(MVRouteType.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(3)) {
                mVItineraryForRideRequest.tripPlanPref = MVTripPlanPref.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVItineraryForRideRequest$d */
    public static class C11557d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11556c(0);
        }
    }

    static {
        new C17394d0("MVItineraryForRideRequest");
        HashMap hashMap = new HashMap();
        f29946f = hashMap;
        hashMap.put(C25239c.class, new C11555b());
        hashMap.put(C25240d.class, new C11557d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOPS, new FieldMetaData("stops", (byte) 3, new StructMetaData(MVPassengerStops.class)));
        enumMap.put(_Fields.ROUTE_TYPES, new FieldMetaData("routeTypes", (byte) 3, new ListMetaData(new EnumMetaData(MVRouteType.class))));
        enumMap.put(_Fields.TRIP_PLAN_PREF, new FieldMetaData("tripPlanPref", (byte) 3, new EnumMetaData(MVTripPlanPref.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29947g = unmodifiableMap;
        FieldMetaData.m61947a(MVItineraryForRideRequest.class, unmodifiableMap);
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
        ((C25238b) f29946f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29946f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVItineraryForRideRequest mVItineraryForRideRequest = (MVItineraryForRideRequest) obj;
        if (!getClass().equals(mVItineraryForRideRequest.getClass())) {
            return getClass().getName().compareTo(mVItineraryForRideRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34339f()).compareTo(Boolean.valueOf(mVItineraryForRideRequest.mo34339f()));
        if (compareTo2 != 0 || ((mo34339f() && (compareTo2 = C25082a.m62839c(this.rideId, mVItineraryForRideRequest.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo34341h()).compareTo(Boolean.valueOf(mVItineraryForRideRequest.mo34341h()))) != 0 || ((mo34341h() && (compareTo2 = this.stops.compareTo(mVItineraryForRideRequest.stops)) != 0) || (compareTo2 = Boolean.valueOf(mo34340g()).compareTo(Boolean.valueOf(mVItineraryForRideRequest.mo34340g()))) != 0 || ((mo34340g() && (compareTo2 = C25082a.m62844h(this.routeTypes, mVItineraryForRideRequest.routeTypes)) != 0) || (compareTo2 = Boolean.valueOf(mo34343i()).compareTo(Boolean.valueOf(mVItineraryForRideRequest.mo34343i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo34343i() || (compareTo = this.tripPlanPref.compareTo(mVItineraryForRideRequest.tripPlanPref)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVItineraryForRideRequest)) {
            return false;
        }
        MVItineraryForRideRequest mVItineraryForRideRequest = (MVItineraryForRideRequest) obj;
        if (this.rideId != mVItineraryForRideRequest.rideId) {
            return false;
        }
        boolean h = mo34341h();
        boolean h2 = mVItineraryForRideRequest.mo34341h();
        if ((h || h2) && (!h || !h2 || !this.stops.mo25800a(mVItineraryForRideRequest.stops))) {
            return false;
        }
        boolean g = mo34340g();
        boolean g2 = mVItineraryForRideRequest.mo34340g();
        if ((g || g2) && (!g || !g2 || !this.routeTypes.equals(mVItineraryForRideRequest.routeTypes))) {
            return false;
        }
        boolean i = mo34343i();
        boolean i2 = mVItineraryForRideRequest.mo34343i();
        if ((i || i2) && (!i || !i2 || !this.tripPlanPref.equals(mVItineraryForRideRequest.tripPlanPref))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34339f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34340g() {
        return this.routeTypes != null;
    }

    /* renamed from: h */
    public final boolean mo34341h() {
        return this.stops != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34343i() {
        return this.tripPlanPref != null;
    }

    /* renamed from: j */
    public final void mo34344j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVItineraryForRideRequest(", "rideId:");
        C0016g.m42z(n, this.rideId, ", ", "stops:");
        MVPassengerStops mVPassengerStops = this.stops;
        if (mVPassengerStops == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPassengerStops);
        }
        n.append(", ");
        n.append("routeTypes:");
        List<MVRouteType> list = this.routeTypes;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("tripPlanPref:");
        MVTripPlanPref mVTripPlanPref = this.tripPlanPref;
        if (mVTripPlanPref == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTripPlanPref);
        }
        n.append(")");
        return n.toString();
    }
}
