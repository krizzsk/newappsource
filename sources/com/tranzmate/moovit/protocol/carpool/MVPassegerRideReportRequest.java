package com.tranzmate.moovit.protocol.carpool;

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

public class MVPassegerRideReportRequest implements TBase<MVPassegerRideReportRequest, _Fields>, Serializable, Cloneable, Comparable<MVPassegerRideReportRequest> {

    /* renamed from: b */
    public static final C25113c f24749b = new C25113c("rideId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24750c = new C25113c("wasPickedUp", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f24751d = new C25113c("driverRating", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f24752e = new C25113c("userLocation", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f24753f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f24754g;
    private byte __isset_bitfield = 0;
    public int driverRating;
    private _Fields[] optionals = {_Fields.WAS_PICKED_UP, _Fields.DRIVER_RATING, _Fields.USER_LOCATION};
    public int rideId;
    public MVGpsLocation userLocation;
    public boolean wasPickedUp;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        WAS_PICKED_UP(2, "wasPickedUp"),
        DRIVER_RATING(3, "driverRating"),
        USER_LOCATION(4, "userLocation");
        
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
                return WAS_PICKED_UP;
            }
            if (i == 3) {
                return DRIVER_RATING;
            }
            if (i != 4) {
                return null;
            }
            return USER_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassegerRideReportRequest$a */
    public static class C8238a extends C25239c<MVPassegerRideReportRequest> {
        public C8238a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassegerRideReportRequest mVPassegerRideReportRequest = (MVPassegerRideReportRequest) tBase;
            MVGpsLocation mVGpsLocation = mVPassegerRideReportRequest.userLocation;
            if (mVGpsLocation != null) {
                mVGpsLocation.mo26193r();
            }
            C25113c cVar = MVPassegerRideReportRequest.f24749b;
            gVar.mo61687K();
            gVar.mo61711x(MVPassegerRideReportRequest.f24749b);
            gVar.mo61678B(mVPassegerRideReportRequest.rideId);
            gVar.mo61712y();
            if (mVPassegerRideReportRequest.mo25684i()) {
                gVar.mo61711x(MVPassegerRideReportRequest.f24750c);
                gVar.mo61708u(mVPassegerRideReportRequest.wasPickedUp);
                gVar.mo61712y();
            }
            if (mVPassegerRideReportRequest.mo25680f()) {
                gVar.mo61711x(MVPassegerRideReportRequest.f24751d);
                gVar.mo61678B(mVPassegerRideReportRequest.driverRating);
                gVar.mo61712y();
            }
            if (mVPassegerRideReportRequest.userLocation != null && mVPassegerRideReportRequest.mo25682h()) {
                gVar.mo61711x(MVPassegerRideReportRequest.f24752e);
                mVPassegerRideReportRequest.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassegerRideReportRequest mVPassegerRideReportRequest = (MVPassegerRideReportRequest) tBase;
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
                            } else if (b == 12) {
                                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                                mVPassegerRideReportRequest.userLocation = mVGpsLocation;
                                mVGpsLocation.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVPassegerRideReportRequest.driverRating = gVar.mo61696i();
                            mVPassegerRideReportRequest.mo25685j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVPassegerRideReportRequest.wasPickedUp = gVar.mo61690c();
                        mVPassegerRideReportRequest.mo25687l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPassegerRideReportRequest.rideId = gVar.mo61696i();
                    mVPassegerRideReportRequest.mo25686k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVGpsLocation mVGpsLocation2 = mVPassegerRideReportRequest.userLocation;
            if (mVGpsLocation2 != null) {
                mVGpsLocation2.mo26193r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassegerRideReportRequest$b */
    public static class C8239b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8238a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassegerRideReportRequest$c */
    public static class C8240c extends C25240d<MVPassegerRideReportRequest> {
        public C8240c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassegerRideReportRequest mVPassegerRideReportRequest = (MVPassegerRideReportRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassegerRideReportRequest.mo25681g()) {
                bitSet.set(0);
            }
            if (mVPassegerRideReportRequest.mo25684i()) {
                bitSet.set(1);
            }
            if (mVPassegerRideReportRequest.mo25680f()) {
                bitSet.set(2);
            }
            if (mVPassegerRideReportRequest.mo25682h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVPassegerRideReportRequest.mo25681g()) {
                jVar.mo61678B(mVPassegerRideReportRequest.rideId);
            }
            if (mVPassegerRideReportRequest.mo25684i()) {
                jVar.mo61708u(mVPassegerRideReportRequest.wasPickedUp);
            }
            if (mVPassegerRideReportRequest.mo25680f()) {
                jVar.mo61678B(mVPassegerRideReportRequest.driverRating);
            }
            if (mVPassegerRideReportRequest.mo25682h()) {
                mVPassegerRideReportRequest.userLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassegerRideReportRequest mVPassegerRideReportRequest = (MVPassegerRideReportRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVPassegerRideReportRequest.rideId = jVar.mo61696i();
                mVPassegerRideReportRequest.mo25686k();
            }
            if (T.get(1)) {
                mVPassegerRideReportRequest.wasPickedUp = jVar.mo61690c();
                mVPassegerRideReportRequest.mo25687l();
            }
            if (T.get(2)) {
                mVPassegerRideReportRequest.driverRating = jVar.mo61696i();
                mVPassegerRideReportRequest.mo25685j();
            }
            if (T.get(3)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVPassegerRideReportRequest.userLocation = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassegerRideReportRequest$d */
    public static class C8241d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8240c(0);
        }
    }

    static {
        new C17394d0("MVPassegerRideReportRequest");
        HashMap hashMap = new HashMap();
        f24753f = hashMap;
        hashMap.put(C25239c.class, new C8239b());
        hashMap.put(C25240d.class, new C8241d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.WAS_PICKED_UP, new FieldMetaData("wasPickedUp", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.DRIVER_RATING, new FieldMetaData("driverRating", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 2, new StructMetaData(MVGpsLocation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24754g = unmodifiableMap;
        FieldMetaData.m61947a(MVPassegerRideReportRequest.class, unmodifiableMap);
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
        ((C25238b) f24753f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24753f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPassegerRideReportRequest mVPassegerRideReportRequest = (MVPassegerRideReportRequest) obj;
        if (!getClass().equals(mVPassegerRideReportRequest.getClass())) {
            return getClass().getName().compareTo(mVPassegerRideReportRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25681g()).compareTo(Boolean.valueOf(mVPassegerRideReportRequest.mo25681g()));
        if (compareTo2 != 0 || ((mo25681g() && (compareTo2 = C25082a.m62839c(this.rideId, mVPassegerRideReportRequest.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo25684i()).compareTo(Boolean.valueOf(mVPassegerRideReportRequest.mo25684i()))) != 0 || ((mo25684i() && (compareTo2 = C25082a.m62848l(this.wasPickedUp, mVPassegerRideReportRequest.wasPickedUp)) != 0) || (compareTo2 = Boolean.valueOf(mo25680f()).compareTo(Boolean.valueOf(mVPassegerRideReportRequest.mo25680f()))) != 0 || ((mo25680f() && (compareTo2 = C25082a.m62839c(this.driverRating, mVPassegerRideReportRequest.driverRating)) != 0) || (compareTo2 = Boolean.valueOf(mo25682h()).compareTo(Boolean.valueOf(mVPassegerRideReportRequest.mo25682h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo25682h() || (compareTo = this.userLocation.compareTo(mVPassegerRideReportRequest.userLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassegerRideReportRequest)) {
            return false;
        }
        MVPassegerRideReportRequest mVPassegerRideReportRequest = (MVPassegerRideReportRequest) obj;
        if (this.rideId != mVPassegerRideReportRequest.rideId) {
            return false;
        }
        boolean i = mo25684i();
        boolean i2 = mVPassegerRideReportRequest.mo25684i();
        if ((i || i2) && (!i || !i2 || this.wasPickedUp != mVPassegerRideReportRequest.wasPickedUp)) {
            return false;
        }
        boolean f = mo25680f();
        boolean f2 = mVPassegerRideReportRequest.mo25680f();
        if ((f || f2) && (!f || !f2 || this.driverRating != mVPassegerRideReportRequest.driverRating)) {
            return false;
        }
        boolean h = mo25682h();
        boolean h2 = mVPassegerRideReportRequest.mo25682h();
        if ((h || h2) && (!h || !h2 || !this.userLocation.mo26178a(mVPassegerRideReportRequest.userLocation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25680f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo25681g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo25682h() {
        return this.userLocation != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25684i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final void mo25685j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo25686k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo25687l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassegerRideReportRequest(", "rideId:");
        n.append(this.rideId);
        if (mo25684i()) {
            n.append(", ");
            n.append("wasPickedUp:");
            n.append(this.wasPickedUp);
        }
        if (mo25680f()) {
            n.append(", ");
            n.append("driverRating:");
            n.append(this.driverRating);
        }
        if (mo25682h()) {
            n.append(", ");
            n.append("userLocation:");
            MVGpsLocation mVGpsLocation = this.userLocation;
            if (mVGpsLocation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVGpsLocation);
            }
        }
        n.append(")");
        return n.toString();
    }
}
