package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
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

public class MVAddPotentialPointsRequest implements TBase<MVAddPotentialPointsRequest, _Fields>, Serializable, Cloneable, Comparable<MVAddPotentialPointsRequest> {

    /* renamed from: b */
    public static final C25113c f24586b = new C25113c("metroAreaId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24587c = new C25113c("rideId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f24588d = new C25113c("routeId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f24589e = new C25113c("points", (byte) 15, 4);

    /* renamed from: f */
    public static final HashMap f24590f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f24591g;
    private byte __isset_bitfield = 0;
    public int metroAreaId;
    private _Fields[] optionals = {_Fields.RIDE_ID, _Fields.ROUTE_ID};
    public List<MVRidePoint> points;
    public int rideId;
    public int routeId;

    public enum _Fields implements C25085c {
        METRO_AREA_ID(1, "metroAreaId"),
        RIDE_ID(2, "rideId"),
        ROUTE_ID(3, "routeId"),
        POINTS(4, "points");
        
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
                return METRO_AREA_ID;
            }
            if (i == 2) {
                return RIDE_ID;
            }
            if (i == 3) {
                return ROUTE_ID;
            }
            if (i != 4) {
                return null;
            }
            return POINTS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVAddPotentialPointsRequest$a */
    public static class C8125a extends C25239c<MVAddPotentialPointsRequest> {
        public C8125a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddPotentialPointsRequest mVAddPotentialPointsRequest = (MVAddPotentialPointsRequest) tBase;
            mVAddPotentialPointsRequest.getClass();
            C25113c cVar = MVAddPotentialPointsRequest.f24586b;
            gVar.mo61687K();
            gVar.mo61711x(MVAddPotentialPointsRequest.f24586b);
            gVar.mo61678B(mVAddPotentialPointsRequest.metroAreaId);
            gVar.mo61712y();
            if (mVAddPotentialPointsRequest.mo25368h()) {
                gVar.mo61711x(MVAddPotentialPointsRequest.f24587c);
                gVar.mo61678B(mVAddPotentialPointsRequest.rideId);
                gVar.mo61712y();
            }
            if (mVAddPotentialPointsRequest.mo25370i()) {
                gVar.mo61711x(MVAddPotentialPointsRequest.f24588d);
                gVar.mo61678B(mVAddPotentialPointsRequest.routeId);
                gVar.mo61712y();
            }
            if (mVAddPotentialPointsRequest.points != null) {
                gVar.mo61711x(MVAddPotentialPointsRequest.f24589e);
                gVar.mo61680D(new C25119e((byte) 12, mVAddPotentialPointsRequest.points.size()));
                for (MVRidePoint X0 : mVAddPotentialPointsRequest.points) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddPotentialPointsRequest mVAddPotentialPointsRequest = (MVAddPotentialPointsRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAddPotentialPointsRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVAddPotentialPointsRequest.points = new ArrayList(k.f63395b);
                                for (int i = 0; i < k.f63395b; i++) {
                                    MVRidePoint mVRidePoint = new MVRidePoint();
                                    mVRidePoint.mo25201C1(gVar);
                                    mVAddPotentialPointsRequest.points.add(mVRidePoint);
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVAddPotentialPointsRequest.routeId = gVar.mo61696i();
                            mVAddPotentialPointsRequest.mo25373l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVAddPotentialPointsRequest.rideId = gVar.mo61696i();
                        mVAddPotentialPointsRequest.mo25372k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVAddPotentialPointsRequest.metroAreaId = gVar.mo61696i();
                    mVAddPotentialPointsRequest.mo25371j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVAddPotentialPointsRequest$b */
    public static class C8126b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8125a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVAddPotentialPointsRequest$c */
    public static class C8127c extends C25240d<MVAddPotentialPointsRequest> {
        public C8127c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddPotentialPointsRequest mVAddPotentialPointsRequest = (MVAddPotentialPointsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAddPotentialPointsRequest.mo25366f()) {
                bitSet.set(0);
            }
            if (mVAddPotentialPointsRequest.mo25368h()) {
                bitSet.set(1);
            }
            if (mVAddPotentialPointsRequest.mo25370i()) {
                bitSet.set(2);
            }
            if (mVAddPotentialPointsRequest.mo25367g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVAddPotentialPointsRequest.mo25366f()) {
                jVar.mo61678B(mVAddPotentialPointsRequest.metroAreaId);
            }
            if (mVAddPotentialPointsRequest.mo25368h()) {
                jVar.mo61678B(mVAddPotentialPointsRequest.rideId);
            }
            if (mVAddPotentialPointsRequest.mo25370i()) {
                jVar.mo61678B(mVAddPotentialPointsRequest.routeId);
            }
            if (mVAddPotentialPointsRequest.mo25367g()) {
                jVar.mo61678B(mVAddPotentialPointsRequest.points.size());
                for (MVRidePoint X0 : mVAddPotentialPointsRequest.points) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddPotentialPointsRequest mVAddPotentialPointsRequest = (MVAddPotentialPointsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVAddPotentialPointsRequest.metroAreaId = jVar.mo61696i();
                mVAddPotentialPointsRequest.mo25371j();
            }
            if (T.get(1)) {
                mVAddPotentialPointsRequest.rideId = jVar.mo61696i();
                mVAddPotentialPointsRequest.mo25372k();
            }
            if (T.get(2)) {
                mVAddPotentialPointsRequest.routeId = jVar.mo61696i();
                mVAddPotentialPointsRequest.mo25373l();
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVAddPotentialPointsRequest.points = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVRidePoint mVRidePoint = new MVRidePoint();
                    mVRidePoint.mo25201C1(jVar);
                    mVAddPotentialPointsRequest.points.add(mVRidePoint);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVAddPotentialPointsRequest$d */
    public static class C8128d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8127c(0);
        }
    }

    static {
        new C17394d0("MVAddPotentialPointsRequest");
        HashMap hashMap = new HashMap();
        f24590f = hashMap;
        hashMap.put(C25239c.class, new C8126b());
        hashMap.put(C25240d.class, new C8128d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.METRO_AREA_ID, new FieldMetaData("metroAreaId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ROUTE_ID, new FieldMetaData("routeId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.POINTS, new FieldMetaData("points", (byte) 3, new ListMetaData(new StructMetaData(MVRidePoint.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24591g = unmodifiableMap;
        FieldMetaData.m61947a(MVAddPotentialPointsRequest.class, unmodifiableMap);
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
        ((C25238b) f24590f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24590f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVAddPotentialPointsRequest mVAddPotentialPointsRequest = (MVAddPotentialPointsRequest) obj;
        if (!getClass().equals(mVAddPotentialPointsRequest.getClass())) {
            return getClass().getName().compareTo(mVAddPotentialPointsRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25366f()).compareTo(Boolean.valueOf(mVAddPotentialPointsRequest.mo25366f()));
        if (compareTo != 0 || ((mo25366f() && (compareTo = C25082a.m62839c(this.metroAreaId, mVAddPotentialPointsRequest.metroAreaId)) != 0) || (compareTo = Boolean.valueOf(mo25368h()).compareTo(Boolean.valueOf(mVAddPotentialPointsRequest.mo25368h()))) != 0 || ((mo25368h() && (compareTo = C25082a.m62839c(this.rideId, mVAddPotentialPointsRequest.rideId)) != 0) || (compareTo = Boolean.valueOf(mo25370i()).compareTo(Boolean.valueOf(mVAddPotentialPointsRequest.mo25370i()))) != 0 || ((mo25370i() && (compareTo = C25082a.m62839c(this.routeId, mVAddPotentialPointsRequest.routeId)) != 0) || (compareTo = Boolean.valueOf(mo25367g()).compareTo(Boolean.valueOf(mVAddPotentialPointsRequest.mo25367g()))) != 0)))) {
            return compareTo;
        }
        if (!mo25367g() || (h = C25082a.m62844h(this.points, mVAddPotentialPointsRequest.points)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAddPotentialPointsRequest)) {
            return false;
        }
        MVAddPotentialPointsRequest mVAddPotentialPointsRequest = (MVAddPotentialPointsRequest) obj;
        if (this.metroAreaId != mVAddPotentialPointsRequest.metroAreaId) {
            return false;
        }
        boolean h = mo25368h();
        boolean h2 = mVAddPotentialPointsRequest.mo25368h();
        if ((h || h2) && (!h || !h2 || this.rideId != mVAddPotentialPointsRequest.rideId)) {
            return false;
        }
        boolean i = mo25370i();
        boolean i2 = mVAddPotentialPointsRequest.mo25370i();
        if ((i || i2) && (!i || !i2 || this.routeId != mVAddPotentialPointsRequest.routeId)) {
            return false;
        }
        boolean g = mo25367g();
        boolean g2 = mVAddPotentialPointsRequest.mo25367g();
        if ((g || g2) && (!g || !g2 || !this.points.equals(mVAddPotentialPointsRequest.points))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25366f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo25367g() {
        return this.points != null;
    }

    /* renamed from: h */
    public final boolean mo25368h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25370i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final void mo25371j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo25372k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo25373l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAddPotentialPointsRequest(", "metroAreaId:");
        n.append(this.metroAreaId);
        if (mo25368h()) {
            n.append(", ");
            n.append("rideId:");
            n.append(this.rideId);
        }
        if (mo25370i()) {
            n.append(", ");
            n.append("routeId:");
            n.append(this.routeId);
        }
        n.append(", ");
        n.append("points:");
        List<MVRidePoint> list = this.points;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
