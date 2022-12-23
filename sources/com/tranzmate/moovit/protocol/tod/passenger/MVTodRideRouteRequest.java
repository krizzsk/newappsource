package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0017h;
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

public class MVTodRideRouteRequest implements TBase<MVTodRideRouteRequest, _Fields>, Serializable, Cloneable, Comparable<MVTodRideRouteRequest> {

    /* renamed from: b */
    public static final C25113c f29584b = new C25113c("rideId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29585c = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29586d = new C25113c("futureWayPoints", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f29587e = new C25113c("isOutOfShape", (byte) 2, 4);

    /* renamed from: f */
    public static final HashMap f29588f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29589g;
    private byte __isset_bitfield = 0;
    public List<Integer> futureWayPoints;
    public boolean isOutOfShape;
    public MVGpsLocation location;
    public String rideId;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        LOCATION(2, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        FUTURE_WAY_POINTS(3, "futureWayPoints"),
        IS_OUT_OF_SHAPE(4, "isOutOfShape");
        
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
                return LOCATION;
            }
            if (i == 3) {
                return FUTURE_WAY_POINTS;
            }
            if (i != 4) {
                return null;
            }
            return IS_OUT_OF_SHAPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRouteRequest$a */
    public static class C11324a extends C25239c<MVTodRideRouteRequest> {
        public C11324a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRideRouteRequest mVTodRideRouteRequest = (MVTodRideRouteRequest) tBase;
            MVGpsLocation mVGpsLocation = mVTodRideRouteRequest.location;
            if (mVGpsLocation != null) {
                mVGpsLocation.mo26193r();
            }
            C25113c cVar = MVTodRideRouteRequest.f29584b;
            gVar.mo61687K();
            if (mVTodRideRouteRequest.rideId != null) {
                gVar.mo61711x(MVTodRideRouteRequest.f29584b);
                gVar.mo61686J(mVTodRideRouteRequest.rideId);
                gVar.mo61712y();
            }
            if (mVTodRideRouteRequest.location != null) {
                gVar.mo61711x(MVTodRideRouteRequest.f29585c);
                mVTodRideRouteRequest.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRideRouteRequest.futureWayPoints != null) {
                gVar.mo61711x(MVTodRideRouteRequest.f29586d);
                gVar.mo61680D(new C25119e((byte) 8, mVTodRideRouteRequest.futureWayPoints.size()));
                for (Integer intValue : mVTodRideRouteRequest.futureWayPoints) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodRideRouteRequest.f29587e);
            C0017h.m62S(gVar, mVTodRideRouteRequest.isOutOfShape);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRideRouteRequest mVTodRideRouteRequest = (MVTodRideRouteRequest) tBase;
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
                            } else if (b == 2) {
                                mVTodRideRouteRequest.isOutOfShape = gVar.mo61690c();
                                mVTodRideRouteRequest.mo33744j();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVTodRideRouteRequest.futureWayPoints = new ArrayList(k.f63395b);
                            int i = 0;
                            while (i < k.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVTodRideRouteRequest.futureWayPoints, i, 1);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVGpsLocation mVGpsLocation = new MVGpsLocation();
                        mVTodRideRouteRequest.location = mVGpsLocation;
                        mVGpsLocation.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodRideRouteRequest.rideId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVGpsLocation mVGpsLocation2 = mVTodRideRouteRequest.location;
            if (mVGpsLocation2 != null) {
                mVGpsLocation2.mo26193r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRouteRequest$b */
    public static class C11325b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11324a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRouteRequest$c */
    public static class C11326c extends C25240d<MVTodRideRouteRequest> {
        public C11326c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRideRouteRequest mVTodRideRouteRequest = (MVTodRideRouteRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodRideRouteRequest.mo33743i()) {
                bitSet.set(0);
            }
            if (mVTodRideRouteRequest.mo33741h()) {
                bitSet.set(1);
            }
            if (mVTodRideRouteRequest.mo33739f()) {
                bitSet.set(2);
            }
            if (mVTodRideRouteRequest.mo33740g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTodRideRouteRequest.mo33743i()) {
                jVar.mo61686J(mVTodRideRouteRequest.rideId);
            }
            if (mVTodRideRouteRequest.mo33741h()) {
                mVTodRideRouteRequest.location.mo25202X0(jVar);
            }
            if (mVTodRideRouteRequest.mo33739f()) {
                jVar.mo61678B(mVTodRideRouteRequest.futureWayPoints.size());
                for (Integer intValue : mVTodRideRouteRequest.futureWayPoints) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVTodRideRouteRequest.mo33740g()) {
                jVar.mo61708u(mVTodRideRouteRequest.isOutOfShape);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRideRouteRequest mVTodRideRouteRequest = (MVTodRideRouteRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTodRideRouteRequest.rideId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVTodRideRouteRequest.location = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVTodRideRouteRequest.futureWayPoints = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVTodRideRouteRequest.futureWayPoints, i2, 1)) {
                }
            }
            if (T.get(3)) {
                mVTodRideRouteRequest.isOutOfShape = jVar.mo61690c();
                mVTodRideRouteRequest.mo33744j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRouteRequest$d */
    public static class C11327d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11326c(0);
        }
    }

    static {
        new C17394d0("MVTodRideRouteRequest");
        HashMap hashMap = new HashMap();
        f29588f = hashMap;
        hashMap.put(C25239c.class, new C11325b());
        hashMap.put(C25240d.class, new C11327d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVGpsLocation.class)));
        enumMap.put(_Fields.FUTURE_WAY_POINTS, new FieldMetaData("futureWayPoints", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.IS_OUT_OF_SHAPE, new FieldMetaData("isOutOfShape", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29589g = unmodifiableMap;
        FieldMetaData.m61947a(MVTodRideRouteRequest.class, unmodifiableMap);
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
        ((C25238b) f29588f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29588f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVTodRideRouteRequest mVTodRideRouteRequest = (MVTodRideRouteRequest) obj;
        if (!getClass().equals(mVTodRideRouteRequest.getClass())) {
            return getClass().getName().compareTo(mVTodRideRouteRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33743i()).compareTo(Boolean.valueOf(mVTodRideRouteRequest.mo33743i()));
        if (compareTo != 0 || ((mo33743i() && (compareTo = this.rideId.compareTo(mVTodRideRouteRequest.rideId)) != 0) || (compareTo = Boolean.valueOf(mo33741h()).compareTo(Boolean.valueOf(mVTodRideRouteRequest.mo33741h()))) != 0 || ((mo33741h() && (compareTo = this.location.compareTo(mVTodRideRouteRequest.location)) != 0) || (compareTo = Boolean.valueOf(mo33739f()).compareTo(Boolean.valueOf(mVTodRideRouteRequest.mo33739f()))) != 0 || ((mo33739f() && (compareTo = C25082a.m62844h(this.futureWayPoints, mVTodRideRouteRequest.futureWayPoints)) != 0) || (compareTo = Boolean.valueOf(mo33740g()).compareTo(Boolean.valueOf(mVTodRideRouteRequest.mo33740g()))) != 0)))) {
            return compareTo;
        }
        if (!mo33740g() || (l = C25082a.m62848l(this.isOutOfShape, mVTodRideRouteRequest.isOutOfShape)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodRideRouteRequest)) {
            return false;
        }
        MVTodRideRouteRequest mVTodRideRouteRequest = (MVTodRideRouteRequest) obj;
        boolean i = mo33743i();
        boolean i2 = mVTodRideRouteRequest.mo33743i();
        if ((i || i2) && (!i || !i2 || !this.rideId.equals(mVTodRideRouteRequest.rideId))) {
            return false;
        }
        boolean h = mo33741h();
        boolean h2 = mVTodRideRouteRequest.mo33741h();
        if ((h || h2) && (!h || !h2 || !this.location.mo26178a(mVTodRideRouteRequest.location))) {
            return false;
        }
        boolean f = mo33739f();
        boolean f2 = mVTodRideRouteRequest.mo33739f();
        if (((f || f2) && (!f || !f2 || !this.futureWayPoints.equals(mVTodRideRouteRequest.futureWayPoints))) || this.isOutOfShape != mVTodRideRouteRequest.isOutOfShape) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33739f() {
        return this.futureWayPoints != null;
    }

    /* renamed from: g */
    public final boolean mo33740g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo33741h() {
        return this.location != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33743i() {
        return this.rideId != null;
    }

    /* renamed from: j */
    public final void mo33744j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodRideRouteRequest(", "rideId:");
        String str = this.rideId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("location:");
        MVGpsLocation mVGpsLocation = this.location;
        if (mVGpsLocation == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVGpsLocation);
        }
        n.append(", ");
        n.append("futureWayPoints:");
        List<Integer> list = this.futureWayPoints;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("isOutOfShape:");
        return C25541a.m63885p(n, this.isOutOfShape, ")");
    }
}
